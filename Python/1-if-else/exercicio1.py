"""
Faça um programa que receba dois números e mostre qual deles é o maior.
"""

print('Digite o primeiro número: ')
numero_1 = input()

print('Digite o segundo número: ')
numero_2 = input()

if numero_1 > numero_2:
    print('Número 1 maior que número 2')
elif numero_1 == numero_2:
    print('Números iguais')
else:
    print('Número 2 maior que número 1')
