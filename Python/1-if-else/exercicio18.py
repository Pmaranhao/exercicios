"""
18 - Faça um programa que mostre ao usuário um menu com 4 opções de operações matemáticas (as básicas, por exemplo). O
usuário escolhe uma das opções e o seu programa então pede dois valores numéricos e realiza a operação, mostrando
o resultado e saindo.
"""

print('Escoha uma opção abaixo:')
print('+')
print('-')
print('*')
print('/')
menu = input()

if menu == '+':
    print('Digite o primeiro número: ')
    numero_1 = float(input())
    print('Digite o segundo número: ')
    numero_2 = float(input())
    soma = numero_1 + numero_2
    print(soma)
elif menu == '-':
    print('Digite o primeiro número: ')
    numero_1 = float(input())
    print('Digite o segundo número: ')
    numero_2 = float(input())
    subtracao = numero_1 - numero_2
    print(subtracao)
elif menu == '*':
    print('Digite o primeiro número: ')
    numero_1 = float(input())
    print('Digite o segundo número: ')
    numero_2 = float(input())
    multiplicacao = numero_1 * numero_2
    print(multiplicacao)
elif menu == '/':
    print('Digite o primeiro número: ')
    numero_1 = float(input())
    print('Digite o segundo número: ')
    numero_2 = float(input())
    divisao = numero_1 / numero_2
    print(divisao)
else:
    print('Opção inválida!')
