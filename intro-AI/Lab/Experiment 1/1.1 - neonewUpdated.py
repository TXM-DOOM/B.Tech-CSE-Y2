def newneo_game(lower, upper):
    for i in range(lower, upper):
        addstring = ''
        if i % 3 == 0:
            addstring = "Neo"
            if i % 5 == 0:
                addstring += "New"

        elif i % 5 == 0:
            addstring == "Neo"

        print(i, addstring)


Lower = int(input('enter starting range'))
Upper = int(input('enter upper range'))
newneo_game(Lower, Upper)