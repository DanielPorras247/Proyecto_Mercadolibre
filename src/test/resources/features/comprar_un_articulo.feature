# language: es
# author: dporras

Característica: Añadir un articulo al carrito

  Escenario: Comprar un articulo en MercadoLibre
    Cuando busca el articulo y lo añade a la compra
    Entonces el debería ver en pantalla el mensaje con las Opciones de envio
