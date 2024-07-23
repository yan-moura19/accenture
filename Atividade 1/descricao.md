##### Correção do bug: 
   A variavel "i" na linha 18 não podia ser utilizada fora do escopo do "for", ainda na linha 18 "vetor[i]" tenta acessar o index do vetor com a variavel fora do escopo.

##### Refatoração:
   Na linha 18, não é necessário acessar o vetor novamente para mostrar o número, sendo necessário apenas utilizar o valor que foi lido pelo Scanner.

##### Melhoria: 
  Foi implementado um "else" para melhorar o feedback do usuário.
