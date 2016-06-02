print ("hello\n")


def fact(n:Int):Int={
  if(n<=1) 1
  else{
    n*fact(n-1)
  }
}


def factT(n:Int):Int={
  def go(acc:Int, n:Int):Int={
    if(n<=1) acc
    else
      go(n*acc,n-1)
  }
  go(1,n)
}

val factTa=factT(100)

def fibo(n:Int):Int={

   def go(acc0:Int,acc1:Int,n:Int):Int = {
    if (n == 1 || n==0) acc0
    else {
      go(acc1,acc0+acc1, n-1)
    }
  }
  go(0,1,n)
}

fibo(6)

