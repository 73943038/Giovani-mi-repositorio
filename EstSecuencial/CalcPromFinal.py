print("******Calculat Promedio final******")
#datos de entrada
nota1=float(input("ingrese nota 1 :"))
nota2=float(input("ingrese nota 2 :"))
nota3=float(input("ingrese nota 3 :"))

#proceso
promedioFin=(nota1*0.25)+(nota2*0.25)+(nota3*0.50)
#datos de salida
print(f"Su promedio final es: {round(promedioFin,2)}")