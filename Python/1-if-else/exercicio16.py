"""
16 - Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mês correspondente a este número.
Isto é, janeiro se 1, fevereiro se 2, e assim por diante.
"""

print('Digite um número: ')
numero = int(input())

if 1 <= numero <= 12:
    if numero == 1:
        print('Janeiro')
    if numero == 2:
        print('Fevereiro')
    if numero == 3:
        print('Março')
    if numero == 4:
        print('Abril')
    if numero == 5:
        print('Maio')
    if numero == 6:
        print('Junho')
    if numero == 7:
        print('Julho')
    if numero == 8:
        print('Agosto')
    if numero == 9:
        print('Setembro')
    if numero == 10:
        print('Outubro')
    if numero == 11:
        print('Novembro')
    if numero == 12:
        print('Dezembro')
else:
    print('Número inválido')
