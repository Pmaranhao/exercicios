"""
8 - Faça um programa que lei 2 notas de um aluno, verifique se as notas são válidas e exiba
na tela a média destas nostas. Uma nota válida deve ser, obrigatóriamente, um valor entre 0.0 e 10.0,
onde caso a nota não possua um valor válido, este fato deve ser informado ao usuário e o programa termina.

"""

print('Nota 1:')
nota_1 = float(input())
if 0 > nota_1 <= 10.0:
    print('Nota inválida')
else:
    print('Nota 2:')
    nota_2 = float(input())







