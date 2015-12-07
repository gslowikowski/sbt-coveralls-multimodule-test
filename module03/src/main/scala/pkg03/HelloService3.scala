package pkg03

class HelloService3 extends pkg02.HelloService2
{
  override def module: String = "3";

}

object HelloService3 extends HelloService3
