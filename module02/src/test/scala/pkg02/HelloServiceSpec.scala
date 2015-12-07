package pkg02

import org.specs2.mutable._

class HelloServiceSpec extends Specification
{
    "HelloService2" should
    {
        "return Hello from module 2" in
        {
            HelloService2.hello mustEqual "Hello from module 2"
        }
    }

}
