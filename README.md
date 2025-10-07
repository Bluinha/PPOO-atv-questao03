# Prompts Utilizados para a Atividade

---

## Prompt 1

> Tenho uma bakery em java, todo bolo tem uma descrição e um preço, num momento minha bakery faz dois tipos de bolo: vanilla e chocolate. Mas agora eu quero mais tipos de bolos utilizando o padrão decorator para auxiliar nessas criações, eu quero um bolo de múltiplas camadas, que vai custar 5 reais a mais, um bolo granulado que vai custar 2 reais a mais, e um bolo com dizeres personalizado, que não custa nada a mais. Me mostre como você faria isso.

A IA sugeriu que ao invés de ter uma classe cake, esta virasse uma interface que cada Tipo de bolo iria implementar.
Em seguida iriamos criar uma classe abstrata chamada CakeDecorator que também implementa bolo e cada.

nenhum prompt adicional foi necessário, apenas realizei ajustes específicos, como mudança de nomes de variáveis, e ajustes do pedido para que ficassem como pedidos no enunciado.
