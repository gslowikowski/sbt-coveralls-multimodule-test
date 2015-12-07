package pkg03

import org.specs2.mutable._

class HelloServiceSpec extends Specification
{
    "HelloService3" should
    {
        "return Hello from module 3" in
        {
            HelloService3.hello mustEqual "Hello from module 3"
        }
    }

}
