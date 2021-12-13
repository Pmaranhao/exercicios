"""
9 - Leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a presteção for maior que
20% do salário imprima: Empréstimo não concedido, caso contrário imprima: Empréstimo concedido
"""

print('Digite seu salário: ')
salario = float(input())

print('Digite seu valor da pestação: ')
valor_da_prestacao = float(input())

emprestimo = salario * 0.2

if valor_da_prestacao > emprestimo:
    print('Emprétimo não concedido!')
else:
    print('Emprétimo  concedido!')
