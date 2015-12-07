package pkg01

import org.specs2.mutable._

class HelloServiceSpec extends Specification
{
    "HelloService1" should
    {
        "return Hello from module 1" in
        {
            HelloService1.hello mustEqual "Hello from module 1"
        }
    }

}
