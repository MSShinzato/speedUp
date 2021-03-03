import time

def ehPrimo(n):
    if (n == 2):
        return True
    elif (n % 2 == 0):
        return False
    else:
        i = 3
        while (i <= (n / i)):
            if ((n % i) == 0):
                return False
            i += 2
        return True

    return False

i=0
v = [7,27,8431,13033,524287,664283,2147483647]
tempoM = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
media = 0

for i in range (0,7):
  for j in range (0,30):
    ini = time.time()
    r = ehPrimo(v[i])
    fim = time.time()
    tempo = (fim-ini)*1000 
    tempoM[j] = tempo
    media = media+tempoM[j]
  if(r == 0):
    print(v[i], " nao e primo tempo de execução: ", media/30)
  else:
    print(v[i], " e primo tempo de execução: ", media/30)
