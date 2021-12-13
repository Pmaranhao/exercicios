"""
Leia um número real. Se o número for positivo imprima a raiz quadrada.
do contrário, imprima o número ao quadrado.
"""

import math

print('Digite o número: ')
numero = float(input())

if numero % 2 == 0:
    print(math.sqrt(numero))
else:
    print(numero ** 2)
