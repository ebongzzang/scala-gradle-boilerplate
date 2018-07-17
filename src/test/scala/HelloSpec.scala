import com.github.johnreedlol.Pos
import com.typesafe.scalalogging.slf4j.Logger
import org.scalamock.scalatest.MockFactory
import org.scalatest.{BeforeAndAfter, FeatureSpec, GivenWhenThen}
import org.slf4j.LoggerFactory

class HelloSpec extends FeatureSpec with GivenWhenThen with MockFactory with BeforeAndAfter {
    val log = Logger(LoggerFactory.getLogger("HelloSpec"))
    val speakerMock = mock[String]

    info("speaker suddenly shout hello world!")

    feature("listener should heard hello world") {
        scenario("listener wearing earphone") {
            Given("speaker take off ")
            val message = "hello world"
            log.debug(s"message: $message ${Pos()}")
            When("listener open ears")
            val recievedMessage = new String(message)

            Then("okay")
            assert(message === recievedMessage)
        }
        scenario("pardon?") {

        }
    }
}
