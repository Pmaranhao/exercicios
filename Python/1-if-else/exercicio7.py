"""
7- Faça um programa que receba dois números e mostre o maior. Se por acaso, os dois números
forem iguais, imrpima números iguais.
"""

print('Digite o primeiro número: ')
numero_1 = int(input())

print('Digite o primeiro número: ')
numero_2 = int(input())

if numero_1 == numero_2:
    print('Números são iguais!')
elif numero_1 > numero_2:
    print('Numero 1 é maior.')
else:
    print('Número 2 é maior')
