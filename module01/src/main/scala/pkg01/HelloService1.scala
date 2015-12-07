package pkg01

class HelloService1
{
  def hello =
  {
    "Hello from module " + module
  }

  def module: String = "1";

}

object HelloService1 extends HelloService1
