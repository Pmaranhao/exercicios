"""
19 - Faça um programa para verificar se um determinado número inteiro e divisível por 3 ou 5, mas não simultaneamente
pelos dois.
"""

print('Digite um número inteiro: ')
numero = int(input())

if int == type(numero) and numero % 3 == 0 and numero % 5 != 0:
    print('Divisível por 3 ou 5')
elif int == type(numero) and numero % 5 == 0 and numero % 3 != 0:
    print('Divisível por 3 ou 5')
else:
    print('Número não é inteiro ou é divisível por 3 e 5 ao mesmo tempo.')
