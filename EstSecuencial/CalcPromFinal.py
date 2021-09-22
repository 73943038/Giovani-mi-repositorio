print("******Calculat Promedio final******")
#datos de entrada
nota1=float(input("ingrese nota 1 :"))
nota2=float(input("ingrese nota 2 :"))
nota3=float(input("ingrese nota 3 :"))
nota4=float(input("ingrese nota 4 :"))
nota5=float(input("ingrese nota 5 :"))
nota6=float(input("ingrese nota 6 :"))
nota7=float(input("ingrese nota 7 :"))
#proceso
promedioFin=(nota1*0.15)+(nota2*0.15)+(nota3*0.10)+(nota4*0.15)+(nota5*0.05)+(nota6*0.10)+(nota7*0.30)
#datos de salida
print(f"Su promedio final es: {round(promedioFin,2)}")