import dispatch.{ url, Http }

object Main {
  def main(args: Array[String]) {
    val headers = Map("Content-Type" -> "application/json")
    val req = url("http://google.com").POST << "some content" <:< headers
    println(req.toRequest.toString)
  }
}
