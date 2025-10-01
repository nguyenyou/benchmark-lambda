package www

import com.raquo.laminar.api.L.*

case class App() {
  def apply(): HtmlElement = {
    div(
      "Hello, World!"
    )
  }
}
