"""
13 - Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A primeira e a segunda prova têm
peso 1 e a terceira tem peso 2. Ao final, mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado.
A nota para aprovação deve ser igual ou superior a 60 pontos.
"""

nota_1 = float(input('Nota 1: '))
nota_2 = float(input('Nota 2: '))
nota_3 = float(input('Nota 3: '))

media = (nota_1 * 1 + nota_2 * 1 + nota_3 * 2) / 4
print(media)

if media >= 6.0:
    print('Aprovado')
else:
    print('Reprovado!')

