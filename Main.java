impresora tiquete=new impresora();

tiquete.escribir(“    Esto es una linea    “);
tiquete.escribir(“Esto es otra linea”);
tiquete.escribir(“Otra linea mas”);
//Esto es para escribir una linea divisoria
tiquete.dividir();

//esto cambia el formato de acuerdo a las especificaciones de epson

tiquete.setFormato(1);
tiquete.escribir(“    Mas texto con letra mas grande      “);
tiquete.setFormato(1);

tiquete.escribir(“texto con letra normal”);
tiquete.dividir();

tiquete.setRojo();
tiquete.escribir(“Texto en rojo”)));
tiquete.setNegro();

tiquete.escribir(“Texto en negro”)));

tiquete.correr(10);//Esto baja 10 lineas en blanco
tiquete.cortar();//Esto corta el papel de la impresora
tiquete.cerrarDispositivo();//Cierra el dispositivo y aplica el texto