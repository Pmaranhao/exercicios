"""
14 - A nota final de um estudante é calculada a partir de três notas atribuídas entre o intervalo de 0 até 10,
respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a exame final. A média das três notas
mencionadas anteriormente obedece aos pesos: Trabalho de Laboratório: 2; Avaliação Semestral: 3; Exame Final: 5.
De acordo com o resultado, mostre na tela se o aluno está reprovado (média entre 0 e 2,9), de recuperação
(entre 3 e 4,9) ou se foi aprovado. Faça todas as verificações necessárias.
"""

print('Digite a nota do trabalho: ')
nota_trabalho = float (input())

print('Digite a nota da avaliação semestral: ')
nota_avaliacao = float (input())

print('Digite a nota do exame final: ')
nota_final = float (input())

media = float(nota_trabalho * 2 + nota_avaliacao * 3 + nota_final * 5) / 10
print(media)

if 0.0 <= media <= 2.9:
    print('Reprovado!')
elif 3 <= media <= 4.9:
    print('Recuperação')
else:
    print('Aprovado!')
