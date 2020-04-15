package component

import kotlinx.html.InputType
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.RBuilder
import react.RProps
import react.child
import react.dom.h2
import react.dom.input
import react.functionalComponent

interface addLessonProps : RProps {
    var click: (Event)->Unit
}

val faddLesson =
    functionalComponent<addLessonProps>{
        h2{+ "Add Lesson" }
        input(InputType.text) {}
        input(InputType.button) {
            attrs.value = "Добавить"
            attrs.onClickFunction = it.click
        }
    }

fun RBuilder.addLesson(
    click:(Event)->Unit
) = child(faddLesson){
    attrs.click = click
}
