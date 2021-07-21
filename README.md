# Padrões de Projeto
## Visitor

Utilizando o mesmo exemplo ilustrativo de figuras geométricas, desta vez é preciso realizar operações com essas figuras (por exemplo, calcular área, perímetro, etc), resultando em diversas operações semelhantes. Ao aplicar o padrão de projeto Visitor, adiciona-se uma lógica de príncipio aberto/fechado, é possível inserir um novo comportamento (aka uma nova operação para cada figura geométrica) sem mudar suas classes. Para isso, são utilizados as interfaces que a) define um elemento concreto e b) define os métodos de visita que serão implementados que agora podem ser implementados pelas classes com maior facilidade e coesão.
