"""
6 - Escreva um programa que, dados dois números inteiros. Mostre na tela o maior deles,
assim como a diferença existente entre ambos
"""

print('Digite o 1⁰ número inteiro: ')
numero_1 = int(input())

print('Digite o 2⁰ número inteiro: ')
numero_2 = int(input())

if numero_1 > numero_2:
    print('1⁰ número é maior.')
    print(f'A diferença entre os números: {numero_1 - numero_2}')
else:
    print('2⁰ número é maior')
    print(f'A diferença entre os números: {numero_2 - numero_1}')
