package www

import com.raquo.laminar.api.L.*

case class Button(variant: Button.VariantSelector = _.Primary) {
  def apply(label: String): HtmlElement = {
    button(
      cls(s"btn btn-${variant(Button.Variant).toString.toLowerCase}"),
      label
    )
  }
}

object Button {
  enum Variant {
    case Primary, Secondary
  }
  type VariantSelector = Variant.type => Variant
}
