public class Reto_Teclado {
    public static void main(String[] args){
        /* El Teclado es de un portalil */
        String [][]Teclas={{"Esc",  "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Imp pnt", "Supr"},
                           { "|",    "1",  "2",  "3",  "4",  "5",  "6",  "7",  "8",  "9",  "0",   "?",   "¿",   "Delete", "Inicio"}, 
                           {"TAB",   "Q",  "W",  "E",  "R",  "T",  "Y",  "U",  "I",  "O",  "P",   "´´",  "+",    "ENTER",  "Fin"},
                           {"MAYUS", "A",  "S",  "D",  "F",  "G",  "H",  "J",  "K",  "L",  "Ñ",   "{",   "}",    "ENTER",  "RePag"},
                           {"Shift", "<",  "Z",  "X",  "C",  "V",  "B",  "N",  "M",  ",",  ".",   "-", "Shift",    "^",    "AvPag"},
                           {"Ctrl",  "Fn", "WD", "Alt","---------ESPACIO---------","AltGr","WD", "CTRL",  "<",     "v",      ">"}};

                        for(int Fila=0;Fila<6;Fila++){
                            for(int Columna=0;Columna<15;Columna++){
                                System.out.print(Teclas[Fila][Columna]+"\t");
                            }
                            System.out.println("");
                           }
                    }
                }