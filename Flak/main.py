#-----------Formulario en Flask-------------------------------
# importar modulo para Flask, render_template, request
from flask import Flask, render_template, request
# importar modulo de funcione
from funciones import obtenerId
from funciones import obtenerTime
from funciones import obtenerTemp
from funciones import obtenerHum
from funciones import ingresar
# crear un objeto
# __name__ = nombre del modulo
app = Flask(__name__)
# @ = decorador. Agregar funcionalidad extra a una funcion
# este metedo se ejecuta al inicio del site
@app.route('/')
def formulario() -> 'html':
  return render_template('ingreso.html',titulo='')

# este metodo se ejecuta al digitar la URL cambiar

@app.route('/cambiar', methods=['GET'])
def cambiar() -> 'html':
  temperatura = request.args['txtem']
  humedad = request.args['txthum']
  l = ingresar(temperatura,humedad)
  ids = obtenerId()
  time = obtenerTime()
  temp = obtenerTemp()
  hum = obtenerHum()
  return render_template('resultado.html',titulo="",dat=ids,dat1=time, dat2=temp, dat3=hum, lim=l)


# ejecucion d ela app
app.run()