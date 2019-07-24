# ------------------------MOSTRAR------------------------------
def obtenerId():
  import pymysql
  ############### m1 ###################
  db = pymysql.connect("remotemysql.com","xDP9w9MhUA","iSCRUyHYUb","xDP9w9MhUA")
  cursor = db.cursor()
  sql = "SELECT id FROM formulario \
  WHERE id > {0}".format(0)
  cursor.execute(sql)
  results = cursor.fetchall()
  ids = []
  for row in results:
    id = row[0]
    ids.append(id)
  db.close()
  return ids

def obtenerTime():
  import pymysql
  ############### m2 ###################
  db = pymysql.connect("remotemysql.com","xDP9w9MhUA","iSCRUyHYUb","xDP9w9MhUA")
  cursor = db.cursor()
  sql = "SELECT time FROM formulario  \
  WHERE id > {0}".format(0)
  cursor.execute(sql)
  results = cursor.fetchall()
  ids = []
  for row in results:
    id = row[0]
    ids.append(id)
  db.close()
  return ids

def obtenerTemp():
  import pymysql
  ############### m2 ###################
  db = pymysql.connect("remotemysql.com","xDP9w9MhUA","iSCRUyHYUb","xDP9w9MhUA")
  cursor = db.cursor()
  sql = "SELECT temperatura FROM formulario \
  WHERE id > {0}".format(0)
  cursor.execute(sql)
  results = cursor.fetchall()
  ids = []
  for row in results:
    id = row[0]
    ids.append(id)
  db.close()
  return ids

def obtenerHum():
  import pymysql
  ############### m2 ###################
  db = pymysql.connect("remotemysql.com","xDP9w9MhUA","iSCRUyHYUb","xDP9w9MhUA")
  cursor = db.cursor()
  sql = "SELECT humedad FROM formulario \
  WHERE id > {0}".format(0)
  cursor.execute(sql)
  results = cursor.fetchall()
  ids = []
  for row in results:
    id = row[0]
    ids.append(id)
  db.close()
  return ids
# -------------------Insertar--------------------------
# Prepare SQL query to INSERT a record into the database.
def ingresar(temperatura,humedad):
  import pymysql
  ############### CONFIGURAR ESTO ###################
  # Abre conexion con la base de datos
  db = pymysql.connect("remotemysql.com","xDP9w9MhUA","iSCRUyHYUb","xDP9w9MhUA")
  cursor = db.cursor()
  ##################################################
  s = "SELECT id FROM formulario \
  WHERE id > {0}".format(0)
  cursor.execute(s)
  results = cursor.fetchall()
  i=0
  for row in results:
    id = row[0]
    i=id
  i=i+1
  sql = "INSERT INTO formulario(id,time,temperatura,humedad) VALUES (%s, NOW(),%s,%s)"
  datos = (i,temperatura,humedad)
  try:
    # Execute the SQL command
    cursor.execute(sql,datos)
    # Commit your changes in the database
    db.commit()
  except:
    # Rollback in case there is any error
    db.rollback()
  db.close()