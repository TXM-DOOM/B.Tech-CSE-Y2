def implication(p, q):
    result = []

    for i in p:
        appendResult = not(p[i]) or q[i]
        result.append(appendResult)

    return result

# P = [True, True, False, False]
# Q = [True, False, True, False]

P = [1, 1, 0, 0]
Q = [1, 0, 1, 0]

print(implication(P, Q))