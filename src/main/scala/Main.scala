object SetToCollection {
  def main(args: Array[String]): Unit = {
    val originalSet = Set(1, 2, 3, 4, 5)

    // Transform the set into a list
    val listFromSet = originalSet.toList

    // Transform the set into an array
    val arrayFromSet = originalSet.toArray

    println(s"Original Set: $originalSet")
    println(s"List from Set: $listFromSet")
    println(s"Array from Set: ${arrayFromSet.mkString("[", ", ", "]")}")
  }
}
