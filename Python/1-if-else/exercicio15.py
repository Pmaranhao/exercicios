"""
15 - Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da semana correspondente a este
número. Isto é, domingo se 1, segunda-feira se 2, e assim por adiante.
"""

print('Digite um número: ')
numero = int(input())

if 1 <= numero <= 7:
    if numero == 1:
        print('Domingo')
    if numero == 2:
        print('Segunda')
    if numero == 3:
        print('Terça')
    if numero == 4:
        print('Quarta')
    if numero == 5:
        print('Quinta')
    if numero == 6:
        print('Sexta')
    if numero == 7:
        print('Sábado')
else:
    print('Número inválido')
