object accounts {
  def consolidated(accts: List[BankAccount]): Signal[Int] ={
    Signal(accts.map(_.balance()).sum)
  }

  val a = new BankAccount()
  val b = new BankAccount()
  val c = consolidated(List(a, b))

  a.deposit(10)
  c.value()
  b.deposit(30)
  c.value()

}