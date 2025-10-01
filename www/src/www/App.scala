package www

import com.raquo.laminar.api.L.*

case class App() {
  def apply(): HtmlElement = {
    div(
      cls("grid grid-cols-[repeat(auto-fill,minmax(120px,1fr))] gap-2 p-2"),
      (1 to 50000).map(i => Button(variant = _.Primary)(s"Button $i"))
    )
  }
}
