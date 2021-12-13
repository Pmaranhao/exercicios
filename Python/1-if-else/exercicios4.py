"""
4 - Faça um programa que leia um mnúmero e, caso ele seja positivo, calcule e mostre:
- o numero digitado ao quadrado
- a raiz do número ao quadrado
"""
import math

print('Digite um número: ')
numero = int(input())

if numero > 0:
    print(math.sqrt(numero))
    print(numero ** 2)
