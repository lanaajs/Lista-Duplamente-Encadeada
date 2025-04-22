
# Lista Duplamente Encadeada

A **Lista Duplamente Encadeada** é uma estrutura de dados que consiste em uma sequência de elementos, onde cada elemento (ou nó) possui duas referências: uma para o nó anterior e outra para o nó seguinte. Isso permite uma navegação eficiente em ambas as direções (para frente e para trás), ao contrário das listas simplesmente encadeadas, que só possuem uma referência para o próximo nó.

## Estrutura

Cada nó da lista contém:
- **Valor**: O dado armazenado no nó.
- **Próximo**: Referência para o próximo nó.
- **Anterior**: Referência para o nó anterior.

A lista é composta por dois ponteiros:
- **Cabeça**: Aponta para o primeiro nó da lista.
- **Cauda**: Aponta para o último nó da lista.

## Funcionalidades

A Lista Duplamente Encadeada oferece uma série de operações que facilitam a manipulação de dados. Entre as operações mais comuns, estão:

- **Inserção**:
  - Inserir no início.
  - Inserir no final.
  - Inserir após um nó específico.

- **Remoção**:
  - Remover o primeiro nó.
  - Remover o último nó.
  - Remover um nó específico.

- **Busca**:
  - Buscar um valor na lista.
  
- **Exibição**:
  - Exibir a lista da cabeça até a cauda.
  - Exibir a lista da cauda até a cabeça.

## Benefícios

- Acesso eficiente tanto ao próximo quanto ao nó anterior.
- Inserção e remoção de elementos em qualquer posição da lista com complexidade O(1), se o nó desejado for conhecido.
- Navegação bidirecional (para frente e para trás).

## Como Usar

### Instalação

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/lista-duplamente-encadeada.git
```

### Exemplo de Uso

```python
from lista_duplamente_encadeada import ListaDuplamenteEncadeada

# Criar uma lista duplamente encadeada
lista = ListaDuplamenteEncadeada()

# Inserir elementos
lista.inserir_inicio(10)
lista.inserir_fim(20)
lista.inserir_fim(30)

# Exibir lista da cabeça para a cauda
lista.exibir()

# Remover o primeiro nó
lista.remover_inicio()

# Exibir lista da cauda para a cabeça
lista.exibir_reversa()
```

### Complexidade

- Inserção e remoção no início e no final: **O(1)**
- Busca: **O(n)**
- Exibição: **O(n)**

## Contribuição

1. Faça um fork deste repositório.
2. Crie uma branch para sua modificação (`git checkout -b minha-modificacao`).
3. Faça as alterações necessárias e adicione um teste, se possível.
4. Envie um pull request para o branch principal.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
