"""
11 - Escreva um programa que leia um número inteiro maior do que zero e devova, na tela, a soma de todos os seus
algarismos. Por exemplo, ao número 251 corresponderá o valor 8(2+5+1). Se o número lido não for maior do que zero,
o programa terminará com a mensagem "Número inválido".
"""

print('Digite um numero inteiro: ')
numero = input()
soma = 0

if int(numero) <= 0:
    print('Número inválido')
else:
    i = 0
    for numeros in numero:
        soma = int(soma + int(numero[i]))
        i = i + 1

print(soma)
