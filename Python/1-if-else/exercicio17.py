"""
17 - Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:
A = (basemaior + basemenor) * altura / 2
Lembre-se a base maior e a base menor devem ser números maiores que zero.
"""

print('Digite a base: ')
base_1 = float(input())

print('Digite a segunda base: ')
base_2 = float(input())

print('Digite a altura: ')
altura = float(input())

if base_1 <= 0 or base_2 <= 0:
    print('Bases inválidas')
else:
    area = (base_1 + base_2) * altura / 2
    print(area)

