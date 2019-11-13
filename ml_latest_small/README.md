# Prática 0 - TEA

## Descrição dos arquivos de dados:
- links.csv: Em cada linha, contém o id do filme, seu respectivo id no IMDB e no TMDB.
- movies.csv: Em cada linha, contém o id do filme, seu nome e seu gênero.
- ratings.csv: Em cada linha, contém o id do usuário, o id de um filme, a nota que aquele usuário deu para aquele filme, além da hora que a nota foi dada.
- tags.csv: Em cada linha, contém o id do usuário, o id de um filme, a tag que aquele usuário deu para aquele filme, além da hora que a tag foi dada.

## Pseudo-Código do MapReduce:
- Função Map: Usando o arquivo ratings.csv, criar um par chave-valor, em que a chave é o id do filme e o valor é 1.
- Só serão adicionados no contexto filmes avaliados pelo usuário com nota 4 ou 5
- Função Reduce: Somar a quantidade de chaves com mesmo movieId, retornará a quantidade de usuários que gostaram daquele filme.
