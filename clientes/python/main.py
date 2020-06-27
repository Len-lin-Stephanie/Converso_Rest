import requests

SERVICE_URL = "http://localhost:8080/prjConversorRest/conversor?"
result = requests.get(SERVICE_URL + "value=12&metrica=km")
print("12 KM para MILHAS = ")
print(result.text)
result = requests.get(SERVICE_URL + "value=12&metrica=ml")
print("12 MILHAS para KM = ")
print(result.text)