import com.typesafe.scalalogging.Logger
import org.scalamock.scalatest.MockFactory
import org.scalatest.{BeforeAndAfter, FeatureSpec, GivenWhenThen}
import org.slf4j.LoggerFactory


class HelloSpec extends FeatureSpec with GivenWhenThen with MockFactory with BeforeAndAfter {

    val log = Logger(LoggerFactory.getLogger("HelloSpec"))
    val speakerMock = mock[String]

    info("")
    feature("") {
        scenario("") {
            Given("")

            And("")
            When("")
            Then("")
        }
    }
}
