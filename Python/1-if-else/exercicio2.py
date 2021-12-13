"""
Leia um número fornecido pelo usuário. Se esse número for positivo, calcule a raiz quadrada do número.
Se o número for negativo, mostre uma mensagem dizendo que o número é inválido.
"""
import math

print('Digite o número: ')
numero = int(input())

if numero % 2 == 0:
    print(math.sqrt(numero))
else:
    print('Número é inválido')
