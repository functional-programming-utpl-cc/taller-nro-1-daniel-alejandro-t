class Taller1App {
  def main(args: Array[String]): Unit = {
    val countries = List("Ecuador", "Venezuela", "Colombia", "Perú", "Chile", "Argentina", "Uruguay", "Paraguay", "Brasil")

    val condicionEmpiezaC = (x: String) => x.charAt(0) == "C"
    val containsE = (x: String) => x.contains("E")
    val condicionEmpiezaEoI = (x: String) => x.charAt(0) == "E" || x.charAt(0) == "I"
    val condicionMayor5 = (x: String) => x.length > 5

    val numbers = List(10, 11, 12, 18, 20, 50, 60, 80, 81, 96)

    //  D (12) = { 1; 2; 3; 4; 6; 12} somando, 1 + 2 + 3 + 4 + 6 = 16 > 12

    val divisores = (x: Int) => (1 until x).filter(x % _ == 0)

     numbers.filter(x => (1 to x).filter(x % _ == 0).sum < x )
  }

}
