print ("W jakim systemie liczbowym jest liczba?")
print ("1. Dziesiętnym")
print ("2. Dwójkowym")
print ("3. Osemkowym")
print ("4. Szesnastkowym")
print ("5. Wyjście")
a = int(input())
if a == 1:
    print("Podaj liczbę w systemie dziesiętnym: ")
    a = int(input())
    print("Na jaki system liczbowy chcesz zamienić liczbę?")
    print("1. Dwójkowy")
    print("2. Osemkowy")
    print("3. Szesnastkowy")
    print("4. Wyjscie")
    b = int(input())
    if b == 1:
        print("Liczba w systemie dwójkowym: ", bin(a))
    elif b == 2:
        print("Liczba w systemie osemkowym: ", oct(a))
    elif b == 3:
        print("Liczba w systemie szesnastkowym: ", hex(a))
    elif b == 4:
        pass
    else:
        print("Nie ma takiej opcji")
elif a == 2:
    print("Podaj liczbę w systemie dwójkowym: ")
    a = str(input())
    print("Na jaki system liczbowy chcesz zamienić liczbę?")
    print("1. Dziesiętny")
    print("2. Osemkowy")
    print("3. Szesnastkowy")
    print("4. Wyjscie")
    b = int(input())
    if b == 1:
        a = list(a)
        a.reverse()
        b = 0
        for i in range(len(a)):
            b += int(a[i]) * (2 ** i)
        print("Liczba w systemie dziesiętnym: ", b)
    elif b == 2:
        a = list(a)
        a.reverse()
        b = 0
        for i in range(len(a)):
            b += int(a[i]) * (2 ** i)
        print("Liczba w systemie osemkowym: ", oct(b))
    elif b == 3:
        a = list(a)
        a.reverse()
        b = 0
        for i in range(len(a)):
            b += int(a[i]) * (2 ** i)
        print("Liczba w systemie szesnastkowym: ", hex(b))
    elif b == 4:
        pass
    else:
        print("Nie ma takiej opcji")
elif a == 3:
    print("Podaj liczbę w systemie osemkowym: ")
    a = str(input())
    print("Na jaki system liczbowy chcesz zamienić liczbę?")
    print("1. Dziesiętny")
    print("2. Dwójkowy")
    print("3. Szesnastkowy")
    print("4. Wyjscie")
    b = int(input())
    if b == 1:
        a = list(a)
        a.reverse()
        b = 0
        for i in range(len(a)):
            b += int(a[i]) * (8 ** i)
        print("Liczba w systemie dziesiętnym: ", b)
    elif b == 2:
        a = list(a)
        a.reverse()
        b = 0
        for i in range(len(a)):
            b += int(a[i]) * (8 ** i)
        print("Liczba w systemie dwójkowym: ", bin(b))
    elif b == 3:
        a = list(a)
        a.reverse()
        b = 0
        for i in range(len(a)):
            b += int(a[i]) * (8 ** i)
        print("Liczba w systemie szesnastkowym: ", hex(b))
    elif b == 4:
        pass
    else:
        print("Nie ma takiej opcji")
elif a == 4:
    print("Podaj liczbę w systemie szesnastkowym: ")
    a = str(input())
    print("Na jaki system liczbowy chcesz zamienić liczbę?")
    print("1. Dziesiętny")
    print("2. Dwójkowy")
    print("3. Osemkowy")
    print("4. Wyjscie")
    b = int(input())
    if b == 1:
        a = a.upper()
        a = list(a)
        a.reverse()
        b = 0
        for i in range(len(a)):
            if a[i] == "A":
                b += 10 * (16 ** i)
            elif a[i] == "B":
                b += 11 * (16 ** i)
            elif a[i] == "C":
                b += 12 * (16 ** i)
            elif a[i] == "D":
                b += 13 * (16 ** i)
            elif a[i] == "E":
                b += 14 * (16 ** i)
            elif a[i] == "F":
                b += 15 * (16 ** i)
            else:
                b += int(a[i]) * (16 ** i)
        print("Liczba w systemie dziesiętnym: ", b)
    elif b == 2:
        a = a.upper()
        a = list(a)
        a.reverse()
        b = 0
        for i in range(len(a)):
            if a[i] == "A":
                b += 10 * (16 ** i)
            elif a[i] == "B":
                b += 11 * (16 ** i)
            elif a[i] == "C":
                b += 12 * (16 ** i)
            elif a[i] == "D":
                b += 13 * (16 ** i)
            elif a[i] == "E":
                b += 14 * (16 ** i)
            elif a[i] == "F":
                b += 15 * (16 ** i)
            else:
                b += int(a[i]) * (16 ** i)
            print("Liczba w systemie dwójkowym: ", bin(b))
    elif b == 3:
        a = a.upper()
        a = list(a)
        a.reverse()
        b = 0
        for i in range(len(a)):
            if a[i] == "A":
                b += 10 * (16 ** i)
            elif a[i] == "B":
                b += 11 * (16 ** i)
            elif a[i] == "C":
                b += 12 * (16 ** i)
            elif a[i] == "D":
                b += 13 * (16 ** i)
            elif a[i] == "E":
                b += 14 * (16 ** i)
            elif a[i] == "F":
                b += 15 * (16 ** i)
            else:
                b += int(a[i]) * (16 ** i)
            print("Liczba w systemie osemkowym: ", oct(b))
    elif b == 4:
        pass
    else:
        print("Nie ma takiej opcji")
elif a == 5:
    pass
else:
    print("Nie ma takiej opcji")

