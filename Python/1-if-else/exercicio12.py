"""
12 - Ler um número inteiro. Se o número lido for negativo, escreva a mensagem "número inválido". Se o número
for positivo, calcular o logaritmo deste número.
"""

import math

numero = int(input('Digite um número inteiro: '))

if numero <= 0:
    print('Número inválido!')
else:
    print(math.log(numero, 10))

