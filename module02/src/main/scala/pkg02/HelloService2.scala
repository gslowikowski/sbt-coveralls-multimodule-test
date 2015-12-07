package pkg02

class HelloService2 extends pkg01.HelloService1
{
  override def module: String = "2";

}

object HelloService2 extends HelloService2
