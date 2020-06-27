const SERVICE_URL = "http://localhost:8080/prjConversorRest/conversor?"
var Client = require("node-rest-client").Client

const client = new Client()
client.get(SERVICE_URL + "value=12&metrica=km", (data, response) => {
    // Os dados vem como um buffer. Precisamos convertê-los para uma string unicode
    console.log("12 KM para MILHAS = ", data.toString())

})

client.get(SERVICE_URL + "value=12&metrica=ml", (data, response) => {
    console.log("12 MILHAS para KM = ", data.toString())

})