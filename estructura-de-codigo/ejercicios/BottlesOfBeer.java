/**
 * Construir la canción "99 Bottles of Beer" usando bucles y condicionales
 * Letra de la canción: https://www.songfacts.com/lyrics/traditional/99-bottles-of-beer
 */
class BottlesOfBeer {
	/**
	 * INICIO
	 * 99 bottles of beer on the wall, 99 bottles of beer
   * Take one down and pass it around, 98 bottles of beer on the wall
   *
   * FINAL
   * 1 bottle of beer on the wall, 1 bottle of beer
   * Take one down and pass it around, no more bottles of beer on the wall
   */
	public static void main(String[] args) {
		int bottles = 99;

		while(bottles > 0) {
			if (bottles == 1) {
				System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottles of beer");	
			} else {
				System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");
			}

			bottles--;

			if (bottles == 1) {
				System.out.println("Take one down and pass it around, " + bottles + " bottle of beer on the wall\n");	
			} else if (bottles == 0) {
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall\n");	
			} else {
				System.out.println("Take one down and pass it around, " + bottles + " bottles of beer on the wall\n");
			}
		}
	}
}