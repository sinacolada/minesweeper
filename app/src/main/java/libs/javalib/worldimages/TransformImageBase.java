package libs.javalib.worldimages;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Stack;

public abstract class TransformImageBase extends WorldImage {
   public WorldImage img;
   public AffineTransform tx;

   TransformImageBase(WorldImage img, AffineTransform tx) {
      super(1 + img.depth);
      this.img = img;
      this.tx = tx;
      Point2D p = WorldImage.transformPosn(tx, img.pinhole);
      this.pinhole = new DPosn(p.getX(), p.getY()).asPosn();
   }

   @Override
   int numKids() {
      return 1;
   }

   @Override
   WorldImage getKid(int i) {
      if (i == 0) {
         return this.img;
      } else {
         throw new IllegalArgumentException("No such kid " + i);
      }
   }

   @Override
   AffineTransform getTransform(int i) {
      if (i == 0) {
         return this.tx;
      } else {
         throw new IllegalArgumentException("No such kid " + i);
      }
   }

   @Override
   protected BoundingBox getBBHelp(AffineTransform t) {
      AffineTransform temp = new AffineTransform(t);
      temp.concatenate(this.tx);
      return this.img.getBB(temp);
   }

   @Override
   protected void drawStackUnsafe(Graphics2D g) {
      AffineTransform old = g.getTransform();
      g.transform(this.tx);
      this.img.drawStackUnsafe(g);
      g.setTransform(old);
   }

   @Override
   protected void drawStacksafe(Graphics2D g, Stack<WorldImage> images, Stack<AffineTransform> txs) {
      if (!(this.getWidth() <= 0.0)) {
         if (!(this.getHeight() <= 0.0)) {
            images.push(this.img);
            AffineTransform temp = g.getTransform();
            temp.concatenate(this.tx);
            txs.push(temp);
         }
      }
   }

   @Override
   protected boolean equalsStacksafe(WorldImage other, Stack<WorldImage> worklistThis, Stack<WorldImage> worklistThat) {
      if (this.getClass().equals(other.getClass())) {
         TransformImageBase that = (TransformImageBase)other;
         if (this.tx.equals(that.tx) && this.pinhole.equals(that.pinhole)) {
            worklistThis.push(this.img);
            worklistThat.push(that.img);
            return true;
         }
      }

      return false;
   }

   @Override
   public double getWidth() {
      return this.getBB().getWidth();
   }

   @Override
   public double getHeight() {
      return this.getBB().getHeight();
   }
}
