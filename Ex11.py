def get_permutacoes(lista):
    if len(lista) == 1:
        return [lista]
    
    permutacoes = []

    for i in range(len(lista)):
        char = lista[i]
        rest = lista[:i] + lista[i+1:]
        for perm in get_permutacoes(rest):
            permutacoes.append(char + perm) 

    return permutacoes

input_str = "ABC"
permutacoes = get_permutacoes(input_str)

print("Permutações de '{}' são:".format(input_str))
print(permutacoes)
