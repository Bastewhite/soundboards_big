package com.baste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.baste.enums.Personaje;

/**
 * Created by Fran on 21/07/2014.
 */
public class UtilesSonidos {
    private static List<Sonido> sonidos = new ArrayList<Sonido>();

    public static List<Sonido> getListaTodos() {
        return sonidos;
    }

    public static void sonidos() {
        if (sonidos.isEmpty()) {
            sonidos.add(new Sonido("A Volar Jóvenes!", R.raw.volar_jovenes, Personaje.LIONEL_HUTZ, Personaje.BART));
            sonidos.add(new Sonido("A la grande le puse cuca", R.raw.cuca, Personaje.MARGE));
            sonidos.add(new Sonido("A menos que...", R.raw.amenosque, Personaje.HOMERO));
            sonidos.add(new Sonido("Ah! Si Esto No Es El Albergue", R.raw.no_es_el_albergue, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Amputar nalgas", R.raw.amputar_nalgas, Personaje.BART, Personaje.MILHOUSE).setVideoUrl("http://www.youtube.com/watch?v=Ccpmu9jWHoQ"));
            sonidos.add(new Sonido("Anoche Vi Matlock", R.raw.anoche_vi_matlock, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Auxilio", R.raw.auxilio, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Banda de Luxo", R.raw.banda_luxo, Personaje.CANCIONES));
            sonidos.add(new Sonido("Bart canta cuando tiene 2 años", R.raw.rock, Personaje.BART));
            sonidos.add(new Sonido("Bart, ¿podemos?", R.raw.bart_podemos, Personaje.BART));
            sonidos.add(new Sonido("Batman es un científico", R.raw.batman, Personaje.HOMERO, Personaje.MARGE));
            sonidos.add(new Sonido("Bonjour, pedazo de zoquetes!", R.raw.bonjour, Personaje.BART));
            sonidos.add(new Sonido("Bort, ¿quién va a llamarse Bort?", R.raw.bort, Personaje.BART));
            sonidos.add(new Sonido("Bueno cerebro...", R.raw.bueno_celebro, Personaje.HOMERO));
            sonidos.add(new Sonido("Bueno, me voy a trabajar...", R.raw.me_voy_a_trabajar, Personaje.HOMERO));
            sonidos.add(new Sonido("Café, Cerveza", R.raw.cafe_cerveza, Personaje.MARGE));
            sonidos.add(new Sonido("Caramelo acido", R.raw.carameloacido, Personaje.OTROS));
            sonidos.add(new Sonido("Cervezas!! Deme 10!", R.raw.perolabolaenlaingle, Personaje.HOMERO).setVideoUrl("http://www.youtube.com/watch?v=7bK8KkwoF7c"));
            sonidos.add(new Sonido("Chocaron el auto?", R.raw.chocaronelauto, Personaje.HOMERO));
            sonidos.add(new Sonido("Como seria mi vida si asaltará el mini súper", R.raw.asaltare, Personaje.APU));
            sonidos.add(new Sonido("Confidencialidad Basurera", R.raw.confidencialidad_basurera, Personaje.LIONEL_HUTZ, Personaje.MARGE));
            sonidos.add(new Sonido("Consejo en tu primer día de escuela", R.raw.consejodemipadre, Personaje.HOMERO));
            sonidos.add(new Sonido("Cortinas purpura", R.raw.cortinas, Personaje.FLANDERS));
            sonidos.add(new Sonido("Creo Que Voy A Gritar", R.raw.creo_que_voy_gritar, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Creo que odio a Homero Simpson", R.raw.creoqodio, Personaje.HOMERO, Personaje.FLANDERS));
            sonidos.add(new Sonido("Culpable Se Escribe Con B Grande", R.raw.con_b_grande, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Códigos De La Policía Civil", R.raw.zorro, Personaje.HOMERO));
            sonidos.add(new Sonido("D'oh", R.raw.doh, Personaje.HOMERO).setVideoUrl("null"));
            sonidos.add(new Sonido("D'oh (x20)", R.raw.dohx20, Personaje.HOMERO));
            sonidos.add(new Sonido("Dame las drogas Lisa", R.raw.drogas_lisa, Personaje.HOMERO, Personaje.MARGE, Personaje.LISA));
            sonidos.add(new Sonido("Demanda De Un Km.", R.raw.demanda_km, Personaje.LIONEL_HUTZ, Personaje.BURNS));
            sonidos.add(new Sonido("Despidiendo de Lisa", R.raw.despidiendodelisa, Personaje.HOMERO));
            sonidos.add(new Sonido("Detector de Mentiras", R.raw.detector_mentiras, Personaje.HOMERO));
            sonidos.add(new Sonido("Detector de Mentiras y Moe", R.raw.detector_mentiras_moe, Personaje.MOE));
            sonidos.add(new Sonido("Dinosaurio", R.raw.dinosaurio, Personaje.HOMERO).setVideoUrl("http://www.youtube.com/watch?v=2FV7sGSUONs"));
            sonidos.add(new Sonido("ESC? CTRL? no tiene letra cualquiera", R.raw.no_tiene_letra_cualquiera, Personaje.HOMERO));
            sonidos.add(new Sonido("El Caso De Publicidad Fraudulenta Más Inaudito Desde La Película Historia Sin Fin", R.raw.publicidad_fraudulenta, Personaje.LIONEL_HUTZ, Personaje.HOMERO));
            sonidos.add(new Sonido("El Rap De Don Barredora", R.raw.rapbarredora, Personaje.HOMERO, Personaje.CANCIONES));
            sonidos.add(new Sonido("El call center de Bart", R.raw.call_center, Personaje.BARNEY));
            sonidos.add(new Sonido("El coco", R.raw.el_coco, Personaje.HOMERO, Personaje.LISA));
            sonidos.add(new Sonido("El más afeminado", R.raw.afeminado, Personaje.OTROS));
            sonidos.add(new Sonido("Elmo sabe donde vives", R.raw.elmo, Personaje.OTROS));
            sonidos.add(new Sonido("Energía nuclear", R.raw.energia_nuclear, Personaje.HOMERO, Personaje.BURNS, Personaje.LENNY));
            sonidos.add(new Sonido("Escuela de Payasos", R.raw.escuelapayasos, Personaje.HOMERO));
            sonidos.add(new Sonido("Ese muñeco es algo malo", R.raw.muneco_malo, Personaje.ABUELO));
            sonidos.add(new Sonido("Eso es aburrido, estas aburriendo a todos", R.raw.aburrido, Personaje.HOMERO).setVideoUrl("http://www.youtube.com/watch?v=d3r96KstZLU"));
            sonidos.add(new Sonido("Eso es el equilátero, idiota", R.raw.laraizcuadrada, Personaje.HOMERO).setVideoUrl("http://www.youtube.com/watch?v=Q9uKkmyJp78"));
            sonidos.add(new Sonido("Eso lo invente", R.raw.esoloinvente, Personaje.HOMERO));
            sonidos.add(new Sonido("Esta Grasa No se Quita", R.raw.grasanosequita, Personaje.HOMERO));
            sonidos.add(new Sonido("Estaban haciendo bebés", R.raw.haciendo_bebes, Personaje.RAFA));
            sonidos.add(new Sonido("Estamos Perdirijillos", R.raw.perdidos, Personaje.FLANDERS));
            sonidos.add(new Sonido("Estamos hablando de comida verdad?", R.raw.decomida, Personaje.HOMERO));
            sonidos.add(new Sonido("Este es un loquito", R.raw.este_es_un_loquito, Personaje.HOMERO));
            sonidos.add(new Sonido("Estos Libro No Solo Sirven Para Adornar La Oficina", R.raw.adornar_oficina, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Estúpido y sensual Flanders", R.raw.nadadenada, Personaje.HOMERO, Personaje.FLANDERS));
            sonidos.add(new Sonido("Feliz cumpleaños Smithers", R.raw.cumple, Personaje.BURNS, Personaje.SMITHER));
            sonidos.add(new Sonido("Fuego? Terremoto? Hippies?", R.raw.qpasaamigo, Personaje.HOMERO));
            sonidos.add(new Sonido("Fuera luces", R.raw.fuera_luces, Personaje.OTROS));
            sonidos.add(new Sonido("Gane gane gane", R.raw.gane, Personaje.RAFA));
            sonidos.add(new Sonido("Golpe a Lenny en la nuca", R.raw.nuca, Personaje.HOMERO));
            sonidos.add(new Sonido("Gran Estrategia", R.raw.gran_estrategia, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Hable más fuerte que tengo una toalla", R.raw.tengo_toalla, Personaje.HOMERO));
            sonidos.add(new Sonido("Hay tabla", R.raw.hay_tabla, Personaje.OTROS));
            sonidos.add(new Sonido("Hola Miguel", R.raw.hola_miguel, Personaje.BART));
            sonidos.add(new Sonido("Hola soy el señor Burns", R.raw.soy_el_senor_burns, Personaje.HOMERO).setVideoUrl("https://www.youtube.com/watch?v=3hd_B_C4ymU"));
            sonidos.add(new Sonido("Homero Picapiedra", R.raw.homero_picapiedra, Personaje.HOMERO, Personaje.CANCIONES));
            sonidos.add(new Sonido("Homero Piensa como Flanders", R.raw.homero_piensa_flanders, Personaje.HOMERO));
            sonidos.add(new Sonido("Homero Teletubbie", R.raw.teletubbie, Personaje.HOMERO));
            sonidos.add(new Sonido("Homero Thompson", R.raw.homero_hompson, Personaje.HOMERO));
            sonidos.add(new Sonido("Homero asusta a Bart", R.raw.homero_bart, Personaje.HOMERO, Personaje.BART));
            sonidos.add(new Sonido("Homero ignora a Lisa", R.raw.homero_ignora, Personaje.HOMERO, Personaje.BART, Personaje.MARGE, Personaje.LISA));
            sonidos.add(new Sonido("Homero jugando al billar", R.raw.billar, Personaje.HOMERO, Personaje.FLANDERS));
            sonidos.add(new Sonido("Homero lento", R.raw.homero_lento, Personaje.HOMERO, Personaje.LENNY, Personaje.MOE));
            sonidos.add(new Sonido("Homero no es comunista", R.raw.homero_comunista, Personaje.ABUELO));
            sonidos.add(new Sonido("Homero y sus gustos homosexuales", R.raw.homosexuales, Personaje.HOMERO).setVideoUrl("http://www.youtube.com/watch?v=PVY7LBrk4uE"));
            sonidos.add(new Sonido("Jamás beberé otra cerveza", R.raw.jamas_cerveza, Personaje.HOMERO));
            sonidos.add(new Sonido("Jumanji!", R.raw.jumangi, Personaje.HOMERO));
            sonidos.add(new Sonido("La Leyenda de la Mujer Cara de Perro", R.raw.leyenda_mujer_cara_perro, Personaje.HOMERO));
            sonidos.add(new Sonido("La caja", R.raw.lacaja, Personaje.BURNS));
            sonidos.add(new Sonido("La furia de Flanders", R.raw.furia, Personaje.FLANDERS));
            sonidos.add(new Sonido("La mujer es parecida a un refrigerador", R.raw.mujerrefrigerador, Personaje.HOMERO));
            sonidos.add(new Sonido("La niña Bart", R.raw.nina_bart, Personaje.HOMERO));
            sonidos.add(new Sonido("La policía sabia que asuntos internos les tendía una trampa?", R.raw.asuntos_internos_trampa, Personaje.HOMERO));
            sonidos.add(new Sonido("La televisión me respeta", R.raw.latelevisionmerespeta, Personaje.HOMERO));
            sonidos.add(new Sonido("La vista es preciosa", R.raw.vistapreciosa, Personaje.HOMERO));
            sonidos.add(new Sonido("Libera todo mi potencial", R.raw.potencial, Personaje.HOMERO, Personaje.LISA).setVideoUrl("http://www.youtube.com/watch?v=yL_x-LO_FnA"));
            sonidos.add(new Sonido("Mamá ya se las llevo", R.raw.mama_ya_se_las_llevo, Personaje.HOMERO, Personaje.CANCIONES));
            sonidos.add(new Sonido("Marge no siento las piernas!", R.raw.nosiento, Personaje.HOMERO).setVideoUrl("http://www.youtube.com/watch?v=K5XujLBMmvk"));
            sonidos.add(new Sonido("Marge, va a denunciar lo de las drogas!", R.raw.vaadenunciar, Personaje.HOMERO));
            sonidos.add(new Sonido("Mataste al zombie de Flanders", R.raw.zombiedeflanders, Personaje.HOMERO));
            sonidos.add(new Sonido("Mateo 21:17", R.raw.mateo_21_17, Personaje.HOMERO));
            sonidos.add(new Sonido("Me Acompañan Con Un Trago?", R.raw.me_acompanan_trago, Personaje.LIONEL_HUTZ, Personaje.MARGE));
            sonidos.add(new Sonido("Me llaman del bar de Moe", R.raw.sonosono, Personaje.HOMERO));
            sonidos.add(new Sonido("Mi bebé ¿Donde esta mi bebé?", R.raw.mibebe, Personaje.RAFA).setVideoUrl("http://www.youtube.com/watch?v=8E1Q8_2-gDI"));
            sonidos.add(new Sonido("Mi gran enemigo", R.raw.enemigo, Personaje.HOMERO));
            sonidos.add(new Sonido("Mi nombre es Cosme Fulanito", R.raw.cosmefulanito, Personaje.OTROS));
            sonidos.add(new Sonido("Mi vieja mula ya no es lo que era", R.raw.vieja_mula, Personaje.CANCIONES, Personaje.OTROS));
            sonidos.add(new Sonido("Modesto Rosado", R.raw.modesto_rosado, Personaje.BART, Personaje.MOE));
            sonidos.add(new Sonido("Moe Sabemos que Eres Tu", R.raw.moe_sabemos_que_eres_tu, Personaje.BART, Personaje.LISA, Personaje.MOE));
            sonidos.add(new Sonido("Nadie quiere a Milhouse", R.raw.milhouse, Personaje.MILHOUSE));
            sonidos.add(new Sonido("Neeeeeeerd", R.raw.nerd, Personaje.HOMERO));
            sonidos.add(new Sonido("Ninguna señal del gato?", R.raw.algunasenialdelgato, Personaje.HOMERO));
            sonidos.add(new Sonido("No puedo matar, estoy comiendo", R.raw.estoy_comiendo, Personaje.HOMERO));
            sonidos.add(new Sonido("No tiene tecla cualquiera", R.raw.cualquiera, Personaje.HOMERO));
            sonidos.add(new Sonido("No vives de ensalada", R.raw.no_vives_de_ensalada, Personaje.CANCIONES));
            sonidos.add(new Sonido("Papa Natas", R.raw.papanatas, Personaje.BART, Personaje.MOE));
            sonidos.add(new Sonido("Parapatin Tin Tirin Tin", R.raw.parapatin, Personaje.HOMERO));
            sonidos.add(new Sonido("Pato pato", R.raw.pato, Personaje.RAFA));
            sonidos.add(new Sonido("Película de Barney Gómez", R.raw.peli_barney, Personaje.BARNEY));
            sonidos.add(new Sonido("Perfecto, No Había Pizza", R.raw.no_habia_pizza, Personaje.LIONEL_HUTZ, Personaje.MARGE));
            sonidos.add(new Sonido("Plan dental... Lisa necesita frenos...", R.raw.plandental, Personaje.HOMERO));
            sonidos.add(new Sonido("Podéis hacerme tres preguntas", R.raw.trespreguntas, Personaje.HOMERO, Personaje.APU));
            sonidos.add(new Sonido("Porque Ahora Soy Miguel Sánchez", R.raw.no_es_el_albergue, Personaje.LIONEL_HUTZ, Personaje.LISA));
            sonidos.add(new Sonido("Probando", R.raw.probando, Personaje.BART));
            sonidos.add(new Sonido("Que ironía", R.raw.queironia, Personaje.HOMERO));
            sonidos.add(new Sonido("Que siga el...", R.raw.q_siga, Personaje.CANCIONES));
            sonidos.add(new Sonido("Robar es Malo", R.raw.robar_malo, Personaje.HOMERO, Personaje.LISA));
            sonidos.add(new Sonido("Robar, ¿como pudiste?", R.raw.robar_como_pudiste, Personaje.HOMERO));
            sonidos.add(new Sonido("Rolando Mota", R.raw.rolando_mota, Personaje.BART, Personaje.MOE));
            sonidos.add(new Sonido("Se Dice Atómico", R.raw.atomico, Personaje.HOMERO));
            sonidos.add(new Sonido("Se ríe conmigo no de mi", R.raw.se_rie_conmigo, Personaje.HOMERO));
            sonidos.add(new Sonido("Señor Hutz Sabia Que No Trae Pantalones", R.raw.no_trae_pantalones, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Shakespeare zombie", R.raw.sheakspearezombie, Personaje.HOMERO));
            sonidos.add(new Sonido("Si Tan Solo Tuviera a Donde Ir", R.raw.si_tan_solo, Personaje.LENNY));
            sonidos.add(new Sonido("Si te como va a ser tu culpa", R.raw.sitecomo, Personaje.HOMERO));
            sonidos.add(new Sonido("Si tuviera mi pistola lo mataría", R.raw.situvieramipistola, Personaje.HOMERO));
            sonidos.add(new Sonido("Simio Fumador", R.raw.simio_fumador, Personaje.LIONEL_HUTZ, Personaje.MARGE));
            sonidos.add(new Sonido("Somos adultos responsables", R.raw.somosresponsables, Personaje.HOMERO));
            sonidos.add(new Sonido("Soy especial", R.raw.especial, Personaje.RAFA).setVideoUrl("http://www.youtube.com/watch?v=1fR5Y_OV0XQ"));
            sonidos.add(new Sonido("Soy homero el malo", R.raw.soy_homero_el_malo, Personaje.HOMERO));
            sonidos.add(new Sonido("Soy la reina de los lagartos", R.raw.reina_lagartos, Personaje.LISA));
            sonidos.add(new Sonido("Sr. Burns - La Miel", R.raw.la_miel, Personaje.BURNS));
            sonidos.add(new Sonido("Susto al abuelo", R.raw.susto, Personaje.HOMERO, Personaje.ABUELO));
            sonidos.add(new Sonido("Sálvame Superman", R.raw.salvame_superman, Personaje.HOMERO));
            sonidos.add(new Sonido("Síntomas de Muerte", R.raw.sintomas_muerte, Personaje.OTROS, Personaje.HOMERO));
            sonidos.add(new Sonido("Te acuerdas de Alf? Volvió!.. en forma de fichas", R.raw.fichasalf, Personaje.MILHOUSE));
            sonidos.add(new Sonido("Tengo tu nariz", R.raw.tengotunariz, Personaje.HOMERO, Personaje.BART));
            sonidos.add(new Sonido("Tipos de Aspersores", R.raw.aspersores, Personaje.MILHOUSE));
            sonidos.add(new Sonido("Todo es bazofia", R.raw.basofias, Personaje.HOMERO));
            sonidos.add(new Sonido("Todo para ti es cruel", R.raw.cruel, Personaje.HOMERO, Personaje.LISA));
            sonidos.add(new Sonido("Todo para ti es cruel", R.raw.porsertancruel, Personaje.HOMERO));
            sonidos.add(new Sonido("Trabajo Decente", R.raw.trabajo_decente, Personaje.APU).setVideoUrl("http://www.youtube.com/watch?v=46EEQyy1CZQ"));
            sonidos.add(new Sonido("Trabajo muy duro", R.raw.trabajo_muy_duro, Personaje.HOMERO, Personaje.BURNS).setVideoUrl("http://www.youtube.com/watch?v=PUBV9LnJFUc"));
            sonidos.add(new Sonido("Traje Drogas", R.raw.traje_drogas, Personaje.OTROS));
            sonidos.add(new Sonido("Un concierto de Beethoven!", R.raw.bethoven, Personaje.HOMERO, Personaje.BART));
            sonidos.add(new Sonido("Una mujer es como una cerveza", R.raw.mujercerveza, Personaje.HOMERO));
            sonidos.add(new Sonido("Uraguey", R.raw.uraguey, Personaje.HOMERO));
            sonidos.add(new Sonido("Vamos Smithers", R.raw.vamos_smithers, Personaje.BURNS, Personaje.SMITHER));
            sonidos.add(new Sonido("Vas a morir Moe", R.raw.vasamorirmoe, Personaje.HOMERO));
            sonidos.add(new Sonido("Vengan Muchachos Vamos A Nadar", R.raw.vengan_muchachos_vamos_nadar, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Y También Hago A Mitch", R.raw.tambien_hago_mitch, Personaje.LIONEL_HUTZ));
            sonidos.add(new Sonido("Yo no fui", R.raw.no_fui, Personaje.BART, Personaje.CANCIONES).setVideoUrl("http://www.youtube.com/watch?v=EzQYK9z_cmU"));
            sonidos.add(new Sonido("Yo soy como ese tipo, ese español...", R.raw.comoese, Personaje.HOMERO, Personaje.MARGE));
            sonidos.add(new Sonido("Yo soy como ese tipo, ese español... ya sabes, el de los molinos", R.raw.donquijote, Personaje.HOMERO, Personaje.MARGE));
            sonidos.add(new Sonido("Yo sé que oyes mis pensamientos muchacho", R.raw.mispensamientos, Personaje.HOMERO));
            sonidos.add(new Sonido("¡Monorriel!", R.raw.monoriel, Personaje.CANCIONES));
            sonidos.add(new Sonido("¡Tengo que decir una mentira ya!", R.raw.mentira, Personaje.HOMERO));
            sonidos.add(new Sonido("¿Chupelupe o billete de lotería?", R.raw.chupelupe_billete, Personaje.HOMERO));
            sonidos.add(new Sonido("¿La cuchara?", R.raw.cuchara, Personaje.HOMERO));
            sonidos.add(new Sonido("¿Qué hago en caso de incendio?", R.raw.incendio, Personaje.HOMERO, Personaje.SMITHER));
            sonidos.add(new Sonido("Ñáñaras en el occipucio", R.raw.senti, Personaje.HOMERO).setVideoUrl("http://www.youtube.com/watch?v=MrIyZGSsuNA"));

            Collections.sort(sonidos, new Comparator<Sonido>() {
                public int compare(Sonido s1, Sonido s2) {
                    return s1.getNombre().compareTo(s2.getNombre());
                }
            });
        }
    }


}
