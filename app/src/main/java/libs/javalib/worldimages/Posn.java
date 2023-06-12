package libs.javalib.worldimages;

public class Posn {
   public int x;
   public int y;

   public Posn(int x, int y) {
      this.x = x;
      this.y = y;
   }

   @Override
   public boolean equals(Object other) {
      if (!(other instanceof Posn)) {
         return false;
      } else {
         Posn that = (Posn)other;
         return this.x == that.x && this.y == that.y;
      }
   }

   @Override
   public int hashCode() {
      return 10000 * this.x + this.y;
   }

   @Override
   public String toString() {
      return String.format("new Posn(x = %d, y = %d)", this.x, this.y);
   }

   String coords() {
      return String.format("(%d, %d)", this.x, this.y);
   }
}
