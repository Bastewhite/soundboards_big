package com.baste;

import com.baste.R;
import com.baste.Sonido;
import com.baste.enums.Personaje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
            sonidos.add(new Sonido("Alto, guardia civil",
                    R.raw.altoguardiacivil, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("A que te pego un tiro",
                    R.raw.aquetepegountiro, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ay mi Berta",
                    R.raw.ay_mi_berta_que_se_la_ha_follado_un_tonto,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Centollazo", R.raw.centollazo,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Cinturones con pene",
                    R.raw.cinturonesconpene, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("A mi mama no", R.raw.amimamano, Personaje.AMADOR));
            sonidos.add(new Sonido("Ascensor", R.raw.ascensor,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Chofer", R.raw.chofer, Personaje.MAXI));
            sonidos.add(new Sonido("Aspirador", R.raw.aspirador, Personaje.LEO));
            sonidos.add(new Sonido("Buzón de voz Maite", R.raw.buzondevozmaite,
                    Personaje.MAITE));
            sonidos.add(new Sonido("Contestador Coque", R.raw.contestador,
                    Personaje.COQUE));
            sonidos.add(new Sonido("Antonio que haces", R.raw.antonioquehaces,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido("Concejal hijo puta!", R.raw.concejal,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido("Guardia Civil", R.raw.guardiacivil,
                    Personaje.BERTA));
            sonidos.add(new Sonido("Donde estabas?", R.raw.dondeestabas,
                    Personaje.JUSTI));
            sonidos.add(new Sonido("Ay Gregoria", R.raw.aygregoria, Personaje.VICENTE));
            sonidos.add(new Sonido("Mascarilla", R.raw.mascarilla, Personaje.CARLOTA));
            sonidos.add(new Sonido("Cómemelo tú", R.raw.comemelotu,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Como tiene el chocho 1",
                    R.raw.comotieneelchocho, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Como tiene el chocho 2",
                    R.raw.comotieneelchocho2, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Como tiene el chocho 3",
                    R.raw.comotieneelchocho3, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Como tiene el chocho 4",
                    R.raw.comotieneelchocho4, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Cuando yo era presidente",
                    R.raw.cuandoyoera, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Pues te confisco el felpudo",
                    R.raw.felpudos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Filete de un inmigrante",
                    R.raw.fileteinmigrante, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que fresquita va", R.raw.fresquita,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Guarrilla", R.raw.guarrilla,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("La G no se pronuncia", R.raw.lag,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Manco cerebral", R.raw.mancocerebral,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Manolita dime tú", R.raw.manolitadimetu,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Mayorista", R.raw.mayorista,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Mayorista no limpio pescado",
                    R.raw.mayoristanolimpio, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Me minas la moral",
                    R.raw.me_minas_la_moral, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Morirá entre terribles sufrimientos",
                    R.raw.morira, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Os ha dado un calentón",
                    R.raw.oshadadouncalenton, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ostia monumental", R.raw.ostiamonumental,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ostia terrible", R.raw.ostiaterrible,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que pechotes!", R.raw.que_pechotes,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Pelochochos", R.raw.pelochochos,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que caliente esta la perra", R.raw.perra,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que poco vas a durar en el cargo",
                    R.raw.pocodurarcargo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Putillas", R.raw.putillas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que le toque el que",
                    R.raw.queletoqueelque, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Tras tras por detrás", R.raw.trastras,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Vecina molesta", R.raw.vecinamolesta,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Se ha hecho bollera",
                    R.raw.sehahechobollera, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Soy mayorista, me gustan los retos",
                    R.raw.soy_mayorista_me_gustan_los_retos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Esto con Antonio Recio no pasaba",
                    R.raw.estoconantoniorecio, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Canción Mariscos Recio",
                    R.raw.cancioncartel, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("No es un terrorista", R.raw.terrorista,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Te confisco el libro", R.raw.confiscolibro,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Español puro", R.raw.espanolpuro,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Recio hablando en inglés", R.raw.ingles,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Los maricones", R.raw.losmaricones,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Antonio, ¿tú eres racista?", R.raw.racista,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Aquí mando yo", R.raw.soyelpresidente,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Taladrando a las 12 de la noche",
                    R.raw.taladrandoalas12, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Tengo huevos", R.raw.tengohuevos,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ay mai", R.raw.aymai, Personaje.AMADOR));
            sonidos.add(new Sonido("Ay mi cuki", R.raw.aymicuki, Personaje.AMADOR));
            sonidos.add(new Sonido("Voy a ser boy", R.raw.boy, Personaje.AMADOR));
            sonidos.add(new Sonido("Brrum", R.raw.brrum, Personaje.AMADOR));
            sonidos.add(new Sonido("Buzón de voz Amador", R.raw.buzondevoz,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Cállate", R.raw.callate, Personaje.AMADOR));
            sonidos.add(new Sonido("Caña aquí", R.raw.canaaqui2, Personaje.AMADOR));
            sonidos.add(new Sonido("Canción Amador", R.raw.cancion, Personaje.AMADOR));
            sonidos.add(new Sonido("Como un salami", R.raw.comounsalami,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Ehh chochetes", R.raw.ehhchochetes,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Espartaco", R.raw.espartaco, Personaje.AMADOR));
            sonidos.add(new Sonido("Esto es una burra", R.raw.estoesunaburra,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Follamos", R.raw.follamos, Personaje.AMADOR));
            sonidos.add(new Sonido("Ma tocao la lotería contigo",
                    R.raw.laloteria, Personaje.AMADOR));
            sonidos.add(new Sonido("Mal padre", R.raw.malpadre, Personaje.AMADOR));
            sonidos.add(new Sonido("Manopuntura", R.raw.manopuntura, Personaje.AMADOR));
            sonidos.add(new Sonido("Merengue merengue 1", R.raw.merengue1,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Merengue merengue 2", R.raw.merengue2,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Merengue merengue 3", R.raw.merengue3,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Yo quiero moto", R.raw.moto, Personaje.AMADOR));
            sonidos.add(new Sonido("Pero no toques, ¿Porque tocas?",
                    R.raw.pero_no_toques_porque_tocas, Personaje.AMADOR));
            sonidos.add(new Sonido("Olé", R.raw.ole, Personaje.AMADOR));
            sonidos.add(new Sonido("Te estás pinchando a mi mujer?",
                    R.raw.te_estas_pinchando_a_mi_mujer, Personaje.AMADOR));
            sonidos.add(new Sonido("Que me quiten lo pinchao",
                    R.raw.quemequiten, Personaje.AMADOR));
            sonidos.add(new Sonido("Quien te llena de salami?",
                    R.raw.quientellena, Personaje.AMADOR));
            sonidos.add(new Sonido("Salami King", R.raw.salamiking, Personaje.AMADOR));
            sonidos.add(new Sonido("Tómalo, dáselo", R.raw.tomalo, Personaje.AMADOR));
            sonidos.add(new Sonido("Está Urge?", R.raw.urge, Personaje.AMADOR));
            sonidos.add(new Sonido("Me prestas dinero?", R.raw.vaya, Personaje.AMADOR));
            sonidos.add(new Sonido("Vendedor de embutido",
                    R.raw.vendedorembutido, Personaje.AMADOR));
            sonidos.add(new Sonido("Venga", R.raw.venga, Personaje.AMADOR));
            sonidos.add(new Sonido("Villancico salami", R.raw.villancico,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Vividor follador", R.raw.vividorfollador,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Ay mai pinchito", R.raw.aymaipinchito,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("A cazar chochetes", R.raw.cazarchochetes,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("El maromo", R.raw.elmaromo, Personaje.AMADOR));
            sonidos.add(new Sonido("Espartaco 2", R.raw.espartaco2, Personaje.AMADOR));
            sonidos.add(new Sonido("Fina filipina", R.raw.finafilipina,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Rufino", R.raw.rufino, Personaje.AMADOR));
            sonidos.add(new Sonido("Shua", R.raw.shua, Personaje.AMADOR));
            sonidos.add(new Sonido("Que te se la van a pinchar",
                    R.raw.teselapinchan, Personaje.AMADOR));
            sonidos.add(new Sonido("Un poco de salami", R.raw.unpocodesalami,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Café, ¿por la noche?", R.raw.cafenoche,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Yo ya no puedo con mas disgustos",
                    R.raw.disgustos, Personaje.ESTELA));
            sonidos.add(new Sonido("Excursión de retrasados",
                    R.raw.excursionretrasados, Personaje.ESTELA));
            sonidos.add(new Sonido("Que ataque mas gratuito", R.raw.gratuito,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Hola, tiarrón", R.raw.holatiarron,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Como me ponen los hombres poderosos",
                    R.raw.hombrespoderosos, Personaje.ESTELA));
            sonidos.add(new Sonido("Está jugando conmigo", R.raw.jugando,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Malfollada", R.raw.malfollada,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Tú eres la mano negra!", R.raw.manonegra,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Este niño no me acepta", R.raw.ninoacepta,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Prefiero orinar", R.raw.orinar,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Se ve me un pezón", R.raw.pezon,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Puta escalera 2", R.raw.putaescalera,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Que crees?", R.raw.quecrees,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Estoy sola", R.raw.sola, Personaje.ESTELA));
            sonidos.add(new Sonido("Que sola estoy", R.raw.solaestoy,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("A mi Fernando Esteso me chupo un pezón!",
                    R.raw.esteso, Personaje.ESTELA));
            sonidos.add(new Sonido("Café, ¿por la mañana?",
                    R.raw.cafeporlamanana, Personaje.ESTELA));
            sonidos.add(new Sonido("Has abierto el cajón de mierda",
                    R.raw.cajondemierda, Personaje.ESTELA));
            sonidos.add(new Sonido("Que ataque mas gratuito 2",
                    R.raw.queataquemasgratuito, Personaje.ESTELA));
            sonidos.add(new Sonido("Albóndigas", R.raw.albondigas,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Buenos días", R.raw.buenosdias,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("La imagen de se falo", R.raw.esefalo,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Yo me entrego al milagro de la vida",
                    R.raw.milagrodelavida, Personaje.ESTELA));
            sonidos.add(new Sonido("Yo no tengo porque aguantar",
                    R.raw.notengoqueaguantar, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Se me han puesto los pezones como el timbre de un castillo",
                    R.raw.se_me_han_puesto_los_pezones_como_el_timbre_de_un_castillo,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Pitonisa Reynolds", R.raw.pitonisareynolds,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Hembras en celo", R.raw.hembrasencelo,
                    Personaje.MAXI));
            sonidos.add(new Sonido("Un león", R.raw.leon, Personaje.MAXI));
            sonidos.add(new Sonido("Leoooooones", R.raw.leones, Personaje.MAXI));
            sonidos.add(new Sonido("Mente fría", R.raw.mentefria, Personaje.MAXI));
            sonidos.add(new Sonido("Sentido del humor", R.raw.sentidohumor,
                    Personaje.MAXI));
            sonidos.add(new Sonido("Vamos león!", R.raw.vamosleon, Personaje.MAXI));
            sonidos.add(new Sonido("Leones o huevones?", R.raw.leonesohuevones,
                    Personaje.MAXI));
            sonidos.add(new Sonido("Leones o huevones? 2",
                    R.raw.leonesohuevones2, Personaje.MAXI));
            sonidos.add(new Sonido("Degenerado", R.raw.degenerado, Personaje.MAXI));
            sonidos.add(new Sonido("Huevón huevón", R.raw.huevonhuevon, Personaje.MAXI));
            sonidos.add(new Sonido("Como se dice barrendero en japonés?",
                    R.raw.barrenderoenjapones, Personaje.LEO));
            sonidos.add(new Sonido("Delantero pichichi",
                    R.raw.delanteropichichi, Personaje.LEO));
            sonidos.add(new Sonido("Follo más que tú", R.raw.follomasquetu,
                    Personaje.LEO));
            sonidos.add(new Sonido("Leo Leo, ¿Qué lees?", R.raw.quelees, Personaje.LEO));
            sonidos.add(new Sonido("Superlicencia", R.raw.superlicencia, Personaje.LEO));
            sonidos.add(new Sonido("Vaya un vividor follador",
                    R.raw.vayaunvividor, Personaje.LEO));
            sonidos.add(new Sonido("Amador aterriza", R.raw.amadoraterriza,
                    Personaje.LEO));
            sonidos.add(new Sonido("Caña aquí (Maite)", R.raw.canaaqui,
                    Personaje.MAITE));
            sonidos.add(new Sonido("Hola hola", R.raw.holahola, Personaje.MAITE));
            sonidos.add(new Sonido("Chiiiicas", R.raw.chicas, Personaje.MAITE));
            sonidos.add(new Sonido("Fresquibiris", R.raw.marfresquibiris,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Los tangas lavando",
                    R.raw.lostangaslavando, Personaje.MAITE));
            sonidos.add(new Sonido("Con la fregona", R.raw.fregona, Personaje.COQUE));
            sonidos.add(new Sonido("Como se friega de mentira?", R.raw.friega,
                    Personaje.COQUE));
            sonidos.add(new Sonido("No huele un poco raro aquí?",
                    R.raw.nohuele, Personaje.COQUE));
            sonidos.add(new Sonido("Aquí hay tema", R.raw.aquihaytema,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido("Este mes no cobras", R.raw.cobras,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Discreción", R.raw.discrecion, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Encantado", R.raw.encantado, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Esto no me está pasando",
                    R.raw.estonomeestapasando, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Mucha suerte", R.raw.muchasuerte,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido("Eso del punto G es un mito", R.raw.puntog,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido("Qué gestión!", R.raw.quegestion, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Enrique Pastor, concejal de juventud y tiempo libre",
                    R.raw.enriquepastor, Personaje.ENRIQUE));
            sonidos.add(new Sonido("500 euros", R.raw.quinientoseuros, Personaje.LEO));
            sonidos.add(new Sonido(
                    "Con todos ustedes el presidente de la comunidad",
                    R.raw.anunciandoarecio, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Coño la Barbie", R.raw.conolabarbie,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido("Pescadero cabron", R.raw.pescadero,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido("Vete a cagar", R.raw.veteacagar, Personaje.IZASKUN));
            sonidos.add(new Sonido("Movida, movida", R.raw.movidamovida,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido("Contestador de Berta",
                    R.raw.contestadorberta, Personaje.BERTA));
            sonidos.add(new Sonido("Virgen", R.raw.virgen, Personaje.BERTA));
            sonidos.add(new Sonido("Obra ilegal", R.raw.obrailegal, Personaje.BERTA));
            sonidos.add(new Sonido("Mira tu hermano Pruden", R.raw.mirapruden,
                    Personaje.JUSTI));
            sonidos.add(new Sonido("A mi no me eches la culpa",
                    R.raw.nomeeches, Personaje.JUSTI));
            sonidos.add(new Sonido("Maitechu", R.raw.maitechu, Personaje.JUSTI));
            sonidos.add(new Sonido("Dos velas", R.raw.dosvelas, Personaje.VICENTE));
            sonidos.add(new Sonido("Las muertas nunca dicen que no",
                    R.raw.lasmuertas, Personaje.VICENTE));
            sonidos.add(new Sonido("Amador paga a tu mujer",
                    R.raw.pagaatumujer, Personaje.VICENTE));
            sonidos.add(new Sonido("Pensar en sexo", R.raw.pensarsexo,
                    Personaje.VICENTE));
            sonidos.add(new Sonido("Que gañan eres papá", R.raw.queganan,
                    Personaje.CARLOTA));
            sonidos.add(new Sonido("Haciendo sepsu", R.raw.sepsu, Personaje.CARLOTA));
            sonidos.add(new Sonido("Alá, que pintas de putón",
                    R.raw.pintasputon, Personaje.CARLOTA));
            sonidos.add(new Sonido("Ay mai (Justi)", R.raw.justiaymai, Personaje.JUSTI));
            sonidos.add(new Sonido("Has flipao con mi mente privilegiada",
                    R.raw.hasflipao, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Pos te reviento", R.raw.postereviento,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Soy libre", R.raw.soylibre, Personaje.AMADOR));
            sonidos.add(new Sonido("Eeeeee", R.raw.eeee, Personaje.AMADOR));
            sonidos.add(new Sonido("Novio pinchito", R.raw.noviopinchito,
                    Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "A Antonio Recio no se le esposa impunemente",
                    R.raw.a_antonio_recio_no_se_le_exposa_impunemente,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "A ti te quedaría muy bien el traje de Heidi",
                    R.raw.a_ti_te_quedaria_bien_el_traje_de_heidi,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("A tomar por culo", R.raw.a_tomar_por_culo,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Aayyy que guarrillas",
                    R.raw.aayyy_que_guarrillas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Ahora mismo están acojonados todos, de Zapatero para abajo",
                    R.raw.acojonados_de_zapatero, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Ahora mismo debe estar gozando como una perra con un pene de verdad",
                    R.raw.ahora_mismo_debe_estar_gozando_como_una_perra_con_un_pene_de_verdad,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ahora soy un fracasado como tú",
                    R.raw.ahora_soy_un_fracasado_como_tu, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ala, otro mes que no cobras",
                    R.raw.ala_otro_mes_que_no_cobras, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Alguna vez has conocido varón?",
                    R.raw.alguna_vez_has_conocido_varon, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Antonio Recio no le teme a nada",
                    R.raw.antonio_recio_no_le_teme_a_nada, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Apadrina un mayorista",
                    R.raw.apadrina_un_mayorista, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Arrodillaos ante vuestro líder",
                    R.raw.arrodillaos_ante_vuestro_lider, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Atrás panchito suelta a mi mujer",
                    R.raw.atras_panchito_suelta_a_mi_mujer, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ay Parrales que poco te queda",
                    R.raw.ay_parrales_que_poco_te_queda, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ayyy me le dejaron tonto",
                    R.raw.ayyy_me_le_dejaron_tonto, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Berta esto no es ehh",
                    R.raw.berta_como_metes_un_inmigrante_en_casa,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Berta te necesito",
                    R.raw.berta_te_necesito, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Berta tengo mucha plancha",
                    R.raw.berta_tengo_mucha_plancha, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Bicho tú eres una dominatrix, ¿no?",
                    R.raw.bicho_tu_eres_una_dominatrix_no, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Bienvenido a España",
                    R.raw.bienvenido_a_espania_salam_malicum, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Como son las bolleras, no respetan nada",
                    R.raw.bolleras_no_respetan_nada, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Berta, yo no estoy cómodo",
                    R.raw.bolsa_escrotal, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Caníbal y maricón",
                    R.raw.canibal_y_maricon, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Si quiere una cena elegante llévese un bogavante, si quiere una cena de gala llévese una cigala, si quiere una cena muy fina llévese una lubina",
                    R.raw.cena_elegante, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Cola cao en la leche",
                    R.raw.colacao_en_la_leche, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Como te gusta el poder",
                    R.raw.como_te_gusta_el_poder, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Como vamos a salir de la crisis si exprimen a los empresarios",
                    R.raw.como_vamos_a_salir_de_la_crisis_si_exprimen_a_los_empresarios,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Control de aduanas",
                    R.raw.control_de_aduanas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Control de alcoholemia, sople aquí",
                    R.raw.control_de_alcoholemia_sople_aqui, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("¡Corrupto! ¡Ladrón!",
                    R.raw.corrupto_ladron, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Cuanto rencor tiene este hombre",
                    R.raw.cuanto_rencor_tiene_este_hombre, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Dándole bien!", R.raw.dandole_bien,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Daño colateral", R.raw.danio_colateral,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Darwin era un comunista resentido",
                    R.raw.darwin_comunista_resentido, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Dejad de copular, infieles!",
                    R.raw.dejad_de_copular_infieles, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Donde estabas? atracando ancianas con tus amigos latín kings?",
                    R.raw.donde_estabas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Dos lesbianas no se pueden casar! los jujus con los penes tienen que estar!",
                    R.raw.dos_lesbianas_no_se_pueden_casar_los_jujus_con_los_penes_tienen_que_estar,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Esto es el colmo!", R.raw.el_colmo,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Me interesa mucho el tema del harén",
                    R.raw.el_haren, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("El muerto esta moroso y el vivo muerto",
                    R.raw.el_muerto_esta_moroso_y_el_vivo_muerto,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("El poder de cristo te obliga",
                    R.raw.el_poder_de_cristo_te_obliga, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Emiliano Parrales, mayorista de café, no recojo grano",
                    R.raw.emiliano_parrales, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("En Afganistán", R.raw.en_afganistan,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Se van ha enjabonar los pechotes!",
                    R.raw.enjabonan_los_pechotes, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Enrique amigo!", R.raw.enrique_amigo2,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Enrique amigo! mira, te he traído unas gambitas en señal de amistad sincera",
                    R.raw.enrique_amigo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Señora! el 'Equipo A' llama a su puerta",
                    R.raw.equipo_a, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Eres mi delfín hasta el fin",
                    R.raw.eres_mi_delfin_hasta_el_fin, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Es cómodo el colchón",
                    R.raw.es_comodo_el_colchon, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Esta cachonda pérdida",
                    R.raw.esta_cachonda_perdida, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Esta vez no me pillas, barbacoa traicionera",
                    R.raw.esta_vez_no_me_pillas_barbacoa_traicionera,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Esto con Antonio Recio no pasaba 2",
                    R.raw.esto_con_antonio_recio_no_pasaba, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Esto es la decadencia de occidente",
                    R.raw.esto_es_la_decadencia_de_occidente, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Estos socialistas me han hundido la vida",
                    R.raw.estos_socialistas_me_han_hundido_la_vida,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Feo al presidente, pues te subo las cuotas",
                    R.raw.feo_al_presidente_pues_te_subo_las_coutas,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Fermín... hijo puta",
                    R.raw.fermin_hijo_puta, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Fuera todos de la estancia, déjennos con nuestro dolor",
                    R.raw.fuera_todos_de_la_estancia_dejennos_con_nuestro_dolor,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Goza como una perra", R.raw.gozao,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Guarrilla pelirroja",
                    R.raw.guarrilla_pelirroja, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Ha subido el I.P.C. el índice de precios que me sale a mi de los cojones",
                    R.raw.ha_subido_el_ipc, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Hace cuanto que no mojas?",
                    R.raw.hace_cuanto_que_no_mojas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Hacemos el guardia civil, la niña del exorcista, Heidi y el abuelito...",
                    R.raw.hacemos_el_guardia_civil_la_ninia_del_exorcista_heidi_y_el_abuelito,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Hijo puta vas a morir",
                    R.raw.hijo_de_puta_vas_a_morir, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Hijos de puta", R.raw.hijos_de_puta,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "La hospitalidad de Antonio Recio es legendaria",
                    R.raw.hospitalidad_legendaria, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "España se ha ido a la mierda con la igualdad de los cojones",
                    R.raw.igualdad_de_los_cojones, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Inmigrante tenías que ser",
                    R.raw.inmigrante_tenias_que_ser, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Unos inmigrantes humillando a un mayorista, esta es la España que nos deja Zapatero",
                    R.raw.inmigrantes_humillando_a_un_mayorista,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Sí sí, somos unos técnicos instaladores con mucha experiencia en instalación de instalaciones internáuticas del ciberespacio eclesiástico",
                    R.raw.instaladores_de_instalacion, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Invertidas!", R.raw.invertidas,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Que guarrilla la rubia, como le gusta ir provocando",
                    R.raw.ir_provocando, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Junta a traición!", R.raw.junta_a_traicion,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("La cambiaba yo de acera rápido",
                    R.raw.la_cambiaba_yo_de_acera_rapido, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("La madre que te pario!",
                    R.raw.la_madre_que_te_pario, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Lávate esa cara que tienes un legañon que parece un tortellini",
                    R.raw.lavate_la_cara, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Les sacamos de la selva",
                    R.raw.les_sacamos_de_la_selva, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("La que nos has liado melón!",
                    R.raw.liado_melon, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Malditos cristianos, me están ofendiendo con sus celebraciones paganas",
                    R.raw.malditos_cristianos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Manolitaaaa... ¡Og! Manolita...",
                    R.raw.manolita_og_manolita, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Mariscos Recio.. el mar al mejor precio...",
                    R.raw.mariscos_recio_el_mar_al_mejor_precio,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("El Maroto la hizo gozar como una perra",
                    R.raw.maroto_gozar, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Mayorista no limpio pescado 2",
                    R.raw.mayorista_no_limpio_pescado, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Me escuece el culo",
                    R.raw.me_escuece_el_culo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Hola? llamo para dar de baja una tarjeta",
                    R.raw.me_han_robado_la_tarjeta, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Voy a poner en el rellano minas antipersonas",
                    R.raw.minas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Me va a salir más cara esta que una putilla normal",
                    R.raw.me_va_a_salir_mas_cara_esta_que_una_putilla_normal,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "300 euros, en negro, que solo vais a trabajar media jornada, doce horas",
                    R.raw.media_jornada_300_euros, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Mi imperio se desmorona",
                    R.raw.mi_imperio_se_desmorona, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Los cojones! Estos son mis dominios y los voy a recuperar",
                    R.raw.mis_dominios, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "No puedo seguir mandando a mis muchachos a una muerte segura",
                    R.raw.mis_muchachos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Nada mas llegar ya te has llamado una putilla",
                    R.raw.nada_mas_llegar_llamas_una_putilla, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "No es que me guste pero soy un patriota, si me la tengo que tirar por España me la tiro",
                    R.raw.no_es_que_me_guste_pero_soy_un_patriota,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ven como estaba vivo",
                    R.raw.no_estaba_muerto_mientras_detienen_al_tumtum,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "No puedo irme, tengo un imperio que dirigir",
                    R.raw.no_puedo_irme, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("No sabes seducir a una mujer",
                    R.raw.no_sabes_seducir, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("No se soba a las propietarias",
                    R.raw.no_se_soba_a_las_propietarias, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("No te hagas pajillas",
                    R.raw.no_te_hagas_pajillas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("No te han desflorado",
                    R.raw.no_te_han_desflorado, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("No tenéis cultura",
                    R.raw.no_teneis_cultura, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("No tengo yo cuerpo ahora de putillas",
                    R.raw.no_tengo_yo_cuerpo_de_putillas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("In nomine pater et fili bla bla, amén",
                    R.raw.nomini_pater_fili_blabla, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Montamos una junta para darle un disgusto a los vecinos, nos inventamos una derrama, ya verás que risa",
                    R.raw.nos_inventamos_una_derrama, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Nos vamos de putillas",
                    R.raw.nos_vamos_de_putillas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Nosotros disfrutando y el inmigrante trabajando",
                    R.raw.nosotros_disfrutando_y_el_inmigrante_trabajando,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Quédate a vivir el sueño español, si ahora hay muchas oportunidades de trabajo para los panchi... ehh inmigrantes como tú",
                    R.raw.oportunidades_para_los_panchitos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Otro panchito", R.raw.otro_panchito,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Paco? Que te mando el pedido con un inmigrante, no te asustes",
                    R.raw.paco_te_mando_el_pedido_con_un_inmigrante,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Pagad las cuotas ¡hijos de puta!",
                    R.raw.pagad_las_cuotas_hijos_de_puta, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Palabra de mayorista",
                    R.raw.palabra_de_mayorista, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Parados sin futuro estáis de suerte",
                    R.raw.parados_sin_futuro, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Parrales es un mojón",
                    R.raw.parrales_es_un_mojon, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Parrales ponte el traje de luces, hoy es tu tarde de gloria, te vas a enfrentar a la vaquilla asesina!",
                    R.raw.parrales_hoy_es_tu_tarde_de_gloria, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Con tu micro pene no llegas, pero el mio tiene una curvatura perfecta",
                    R.raw.pene_ancestral, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Perdone, ¿es usted tonto?",
                    R.raw.perdone_es_usted_tonto, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Pero bueno!!", R.raw.pero_bueno,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Pero lo bueno es que solo trabajas media jornada, doce horas al día",
                    R.raw.pero_lo_bueno_es_que_trabajas_media_jornada,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Pero yo me he mantenido frio como mis gambas!",
                    R.raw.pero_yo_me_he_mantenido_frio_como_mis_gamgas,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Podéis ir en paz!", R.raw.podeis_ir_en_paz,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Primer mandamiento: protegerás el marisco sobre todas las cosas",
                    R.raw.primer_mandamiento, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Pues a pedir dinero, a que va a venir un negro?",
                    R.raw.pues_a_pedir_dinero_a_que_va_a_venir_un_negro,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Pues te voy a subir las cuotas",
                    R.raw.pues_te_voy_a_subir_las_cuotas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("¿¡Que!?", R.raw.que, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que bueno soy y que culito tengo",
                    R.raw.que_bueno_soy_y_que_culito_tengo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que camisetita tan veraniega",
                    R.raw.que_camisetita_veraniega, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que desprotegidos estamos los empresarios",
                    R.raw.que_desprotegidos_estamos_los_empresarios,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que guarrilla la Shakira",
                    R.raw.que_guarrilla_la_shakira, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que horteras sois los de provincia",
                    R.raw.que_horteras_soys_los_de_provincia, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Uy que morboso eres, ¿quieres mirar?",
                    R.raw.que_morboso_quieres_mirar, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Que panda de vagos y caraduras son los paraos",
                    R.raw.que_panda_de_vagos_son_los_parados, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que revolcón me ha dado la hija de puta",
                    R.raw.que_revolcon_me_ha_dado_la_hija_de_puta,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Que rico el niño eh, que patada en la boca tiene...",
                    R.raw.que_rico_el_ninio_que_patada_en_la_boca_tiene,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que se joda!", R.raw.que_se_joda,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que se ponga un español!",
                    R.raw.que_se_ponga_un_espanol, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Que va! si es un sin papeles, no se entera de nada",
                    R.raw.que_va_si_es_un_sin_papeles, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que vida mas triste tiene el pobre",
                    R.raw.que_vida_mas_triste_tiene_el_pobre, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Que yo desciendo de un moro? y tu de un tonto!",
                    R.raw.que_yo_desciendo_de_un_moro, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que yo quiero ser presidente! punto",
                    R.raw.que_yo_quiero_ser_presidente_punto, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Como la vas a sacar de su hábitat natural!",
                    R.raw.sacar_de_su_habitat, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Sal de este cuerpo engendro del mal",
                    R.raw.sal_de_este_cuerpo_engendro_del_mall,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Como aguantaran los curas con tanta feligresa salidilla",
                    R.raw.salidillas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Se acabó la buena fe",
                    R.raw.se_acabo_la_buena_fe, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Sembraremos el terror entre los infieles",
                    R.raw.sembraremos_el_terror_entre_los_infieles,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "En casa de Antonio Recio siempre hay sitio para una inmigrante desamparada",
                    R.raw.sitio_para_una_inmigrante, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Soy Hernán Cortés",
                    R.raw.soy_hernan_cortes, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Soy mayorista, tengo mis derechos",
                    R.raw.soy_mayorista_tengo_mis_derechos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Copla de un moroso", R.raw.soy_un_moroso,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Te apuesto lo que quieras a que le profano el juju",
                    R.raw.te_apuesto_lo_que_quieras_a_que_le_profano_el_juju,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Te ha profanado el juju",
                    R.raw.te_ha_profanado_el_juju, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Espera, que te pongo intereconomía",
                    R.raw.te_pongo_intereconomia, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Te voy a subir las cuotas",
                    R.raw.te_voy_a_subir_las_cuotas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Tengo una misión para ti",
                    R.raw.tengo_una_mision_para_ti, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Tiene que morir entre terribles sufrimientos",
                    R.raw.tiene_que_morir_entre_terribles_sufrimientos,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Todas las que pasan por tus manos se vuelven bolleras",
                    R.raw.todas_bolleras, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Los tontos no levantan imperios",
                    R.raw.tontos_no_levantan_imperios, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Tu has visto alguna vez un chino de vacaciones?",
                    R.raw.tu_has_visto_alguna_vez_un_chino_de_vacaciones,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Tu madre morirá entre terribles sufrimientos",
                    R.raw.tu_madre_morira_entre_terribles_sufrimientos,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Tu presidente te necesita",
                    R.raw.tu_presidente_te_necesita, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ufff... las guarrillas!",
                    R.raw.uff_las_guarrillas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Un antro de putillas",
                    R.raw.un_antro_de_putillas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Un inmigrante presidente",
                    R.raw.un_inmigrante_presidente, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Ustedes nos invadieron, se llevaron nuestro oro y fornicaron con nuestras chamaconas",
                    R.raw.ustedes_nos_invadieron_se_llevaron_nuestro_oro_y_fornicaron_con_nuestras_chamaconas,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Uy que falsa...", R.raw.uy_que_falsa,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Uy que mentiroso...",
                    R.raw.uy_que_mentiroso, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Uy que tirante estas...",
                    R.raw.uy_que_tirante_estas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Uy.. ¿te revelas? ¡desviada!",
                    R.raw.uy_te_revelas_desviada, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Vagos hijos de puta!",
                    R.raw.vagos_hijos_de_puta, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Vamos a mi casa a disfrazarnos",
                    R.raw.vamos_a_mi_casa_a_disfrazarnos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Van a rajar a tu madre como un cerdo",
                    R.raw.van_a_rajar_a_tu_madre_como_un_cerdo,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Venga! a hacer croquetas",
                    R.raw.venga_a_hacer_croquetas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Venimos a follar", R.raw.venimos_a_follar,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Viva el rey y viva España",
                    R.raw.viva_el_rey, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Vuelve a tu país!", R.raw.vuelve_a_tu_pais,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Ya estás emporrao otra vez? este mes no cobras!",
                    R.raw.ya_estas_emporrao_otra_vez, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que ya no tiene sentido viajar",
                    R.raw.ya_no_tiene_sentido_viajar, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Yo te nombro presidente de la comunidad",
                    R.raw.yo_te_nombre_presidente, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "La generosidad de Antonio Recio es legendaria",
                    R.raw.generosidad_legendaria, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("A mi no me han atracado en la vida",
                    R.raw.llevobolso, Personaje.JUSTI));
            sonidos.add(new Sonido("Que no coño!", R.raw.que_no_conio,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("A la kuki que le den",
                    R.raw.a_la_kuki_que_le_den, Personaje.AMADOR));
            sonidos.add(new Sonido("A la puta calle", R.raw.a_la_puta_calle,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("A que te reviento!",
                    R.raw.a_que_te_reviento, Personaje.AMADOR));
            sonidos.add(new Sonido("Ah! cojonudo!", R.raw.ah_cojonudo,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Ahí ahí, mente fría mente fría",
                    R.raw.ahi_ahi_mente_fria_mente_fria, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Ahora si que voy a ser un vividor follador",
                    R.raw.ahora_si_que_voy_a_ser_un_vividor_follador, Personaje.AMADOR));
            sonidos.add(new Sonido("Ay la virgen", R.raw.ay_la_virgen,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Ay mai 2", R.raw.ay_mai, Personaje.AMADOR));
            sonidos.add(new Sonido("Bueno no me toques más los huevos",
                    R.raw.bueno_no_me_toques_mas_nos_huevos, Personaje.AMADOR));
            sonidos.add(new Sonido("Bueno, vale ya ¿no?",
                    R.raw.bueno_vale_ya_no, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Bueno y ahora que hago yo, que me quedo sin pinchito",
                    R.raw.bueno_y_ahora_que_hago_yo_que_me_quedo_sin_pinchito,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Caña aquí 2", R.raw.cania_aqui, Personaje.AMADOR));
            sonidos.add(new Sonido("Caña aquí 3", R.raw.cania_aqui2, Personaje.AMADOR));
            sonidos.add(new Sonido("Con esta burra se liga mazo ¿no?",
                    R.raw.con_esta_burra_se_liga_mazo_no, Personaje.AMADOR));
            sonidos.add(new Sonido("Con la tenia señoria",
                    R.raw.con_la_tenia_senoria, Personaje.AMADOR));
            sonidos.add(new Sonido("Tú eres una bendición de cielo...",
                    R.raw.eres_una_bendicion, Personaje.AMADOR));
            sonidos.add(new Sonido("Es que eres gilipollas!",
                    R.raw.es_que_eres_gilipollas, Personaje.AMADOR));
            sonidos.add(new Sonido("Esto es la polla!", R.raw.esto_es_la_polla,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Eureka, ¿Quién es esa?",
                    R.raw.eureka_quien_es_esa, Personaje.AMADOR));
            sonidos.add(new Sonido("Hoy pincho", R.raw.hoy_pincho, Personaje.AMADOR));
            sonidos.add(new Sonido("Leones! leones!", R.raw.leones_leones,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Llámame ¿eh?", R.raw.llamame_eh, Personaje.AMADOR));
            sonidos.add(new Sonido("Mama que tengo el trabajo",
                    R.raw.mama_que_tengo_trabajo, Personaje.AMADOR));
            sonidos.add(new Sonido("Marchuqui marchuqui",
                    R.raw.marchuqui_marchuqui, Personaje.AMADOR));
            sonidos.add(new Sonido("Me estoy poniendo morao",
                    R.raw.me_estoy_poniendo_morao, Personaje.AMADOR));
            sonidos.add(new Sonido("Me gusta tu plan mente fría",
                    R.raw.me_gusta_tu_plan_mente_fria, Personaje.AMADOR));
            sonidos.add(new Sonido("Me he levantao to pinocho",
                    R.raw.me_he_levantado_to_pinocho, Personaje.AMADOR));
            sonidos.add(new Sonido("Me voy a comprar la moto!",
                    R.raw.me_voy_a_comprar_la_moto, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Mentes frías no, que cada vez que pensáis me como un marrón",
                    R.raw.mentes_frias_no_que_cada_vez_que_pensais_me_como_un_marron,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Mentes frías, que estoy castigao",
                    R.raw.mentes_frias_que_estoy_castigao, Personaje.AMADOR));
            sonidos.add(new Sonido("Mentes frías que me han encerrao!",
                    R.raw.mentes_frias_que_me_han_encerrado, Personaje.AMADOR));
            sonidos.add(new Sonido("Mi jefa quiere salami, le doy salami",
                    R.raw.mi_jefa_quiere_salami_le_doy_salami, Personaje.AMADOR));
            sonidos.add(new Sonido("Mira como le dan salami!",
                    R.raw.mira_como_le_da_salami, Personaje.AMADOR));
            sonidos.add(new Sonido("Necesito trabajo ipsofactus",
                    R.raw.necesito_trabajo, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "No sé que pasa últimamente que es que no pincho na",
                    R.raw.no_se_que_pasa_ultimamente_que_es_que_no_pincho_na,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Pa que?", R.raw.pa_que, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Papá tiene unos huevos como el caballo de Espartaco?",
                    R.raw.papa_tiene_unos_guevos_como_el_caballo_de_espartaco,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Patidifuntos", R.raw.patidifuntos,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Pero cuando te he mentido yo a ti?",
                    R.raw.pero_cuando_te_he_mentido_yo_a_ti, Personaje.AMADOR));
            sonidos.add(new Sonido("Pero que le pasa a este?",
                    R.raw.pero_que_le_pasa_a_este, Personaje.AMADOR));
            sonidos.add(new Sonido("Pero que pena das",
                    R.raw.pero_que_pena_das, Personaje.AMADOR));
            sonidos.add(new Sonido("Pos me apreto a la colombiana",
                    R.raw.pos_me_apreto_a_la_colombiana, Personaje.AMADOR));
            sonidos.add(new Sonido("Pos que te quiten lo pinchao",
                    R.raw.pos_que_te_quiten_lo_pinchao, Personaje.AMADOR));
            sonidos.add(new Sonido("Pos yo que se!", R.raw.pos_yo_que_se,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Putón!", R.raw.puton, Personaje.AMADOR));
            sonidos.add(new Sonido("Que como se va haber follao a un vecino",
                    R.raw.que_como_se_va_haber_follao_a_un_vecino, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Que ganas tengo de que me des mandanga de la buena",
                    R.raw.que_ganas_tengo_de_que_me_des_mandanga_de_la_buena,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Que hay que ser serio hombre",
                    R.raw.que_hay_que_ser_serio, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Que ni futbol ni hostia, merengue merengue",
                    R.raw.que_ni_futbol_ni_hostias_merengue_merengue, Personaje.AMADOR));
            sonidos.add(new Sonido("Que no me toques más los huevos!",
                    R.raw.que_no_me_toques_mas_los_huevos, Personaje.AMADOR));
            sonidos.add(new Sonido("Que somos leones o huevones?",
                    R.raw.que_somos_leones_o_guebones, Personaje.AMADOR));
            sonidos.add(new Sonido("Que te has pinchao a la rancia?",
                    R.raw.que_te_has_pinchao_a_la_rancia, Personaje.AMADOR));
            sonidos.add(new Sonido("Quies un pinchito?",
                    R.raw.quies_un_pinchito, Personaje.AMADOR));
            sonidos.add(new Sonido("Quieta fiera quieta",
                    R.raw.quita_fiera_quieta, Personaje.AMADOR));
            sonidos.add(new Sonido("Soy Espartaco, ¿que desea?",
                    R.raw.soy_espartaco, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Soy un vendedor buenísimo, yo le vendo un horno a un esquimal",
                    R.raw.soy_un_vendedor_buenisimo, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Tu disfruta, pero si te los van a poner igual",
                    R.raw.tu_disfruta_pero_si_te_los_van_a_poner_igual,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Tu que miras gilipollas?",
                    R.raw.tu_que_miras_gilipollas, Personaje.AMADOR));
            sonidos.add(new Sonido("Tu si que eres un perdedor",
                    R.raw.tu_si_que_eres_un_perdedor, Personaje.AMADOR));
            sonidos.add(new Sonido("Vamos a ver si alguna quiere salami",
                    R.raw.vamos_a_ver_si_alguna_quiere_salami, Personaje.AMADOR));
            sonidos.add(new Sonido("Vamos que ahí le da salami to el mundo",
                    R.raw.vamos_que_ahi_le_da_salami_todo_el_mundo, Personaje.AMADOR));
            sonidos.add(new Sonido("Y yo voy y el hago un regalo",
                    R.raw.y_yo_voy_y_le_hago_un_regalo, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Ya me habéis liao otra vez, me voy a comer un marrón de los buenos",
                    R.raw.ya_me_habeis_liado_otra_vez, Personaje.AMADOR));
            sonidos.add(new Sonido("Yeeee", R.raw.yeeei, Personaje.AMADOR));
            sonidos.add(new Sonido("Yo quiero un descapotable!",
                    R.raw.yo_quiero_un_descapotable, Personaje.AMADOR));
            sonidos.add(new Sonido("Ay Jacobo, te lo como todo",
                    R.raw.ay_jacobo_te_lo_como_todo, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Bienvenido al selecto club de amantes de Estela Reynolds",
                    R.raw.bienvenido_al_selecto_club_de_amantes,
                    Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Eso, ciérrame la boca para que sufra hacia dentro y me salga un tumor en algún sitio",
                    R.raw.cierrame_la_boca_para_que_me_salga_algun_tumor,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Como! no me deseas?",
                    R.raw.como_no_me_deseas, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Tú sabes como se consiguen los papeles en este negocio?",
                    R.raw.como_se_consiguen_los_papeles, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Estáis de acuerdo, soy un emplasto, un apósito, un mojón",
                    R.raw.estais_de_acuerdo_soy_un_emplasto_un_aposito_un_mojon,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Fernando Esteso me chupo un pezón",
                    R.raw.fernando_esteso_me_chupo_un_pezon, Personaje.ESTELA));
            sonidos.add(new Sonido("Foca arcaica de metabolismo lento!",
                    R.raw.foca_arcaica_de_metabolismo_lento, Personaje.ESTELA));
            sonidos.add(new Sonido("Garrulo!", R.raw.garrulo,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Hombre por favor...",
                    R.raw.hombre_por_favor, Personaje.ESTELA));
            sonidos.add(new Sonido("Inseminación artificial...",
                    R.raw.inseminacion_artificial, Personaje.ESTELA));
            sonidos.add(new Sonido("La mar está fresquiviris (1:15)",
                    R.raw.la_mar_esta_fresquiviris_1_15, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Pues claro coño, una se va a lavar los dientes y de repente se encuentra con ese panorama, pues ya te quedas a mirar un rato",
                    R.raw.lavar_los_dientes, Personaje.ESTELA));
            sonidos.add(new Sonido("Madre mía que mazacote!",
                    R.raw.madre_mia_que_mazacote, Personaje.ESTELA));
            sonidos.add(new Sonido("Me estás llamando vieja reseca?",
                    R.raw.me_estas_llamando_vieja_reseca, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Tú marido me ha atacado con su tosca ironía, pero yo le respondo con mi fina indiferencia",
                    R.raw.mi_fina_indiferencia, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Mira, ahí tienes a tus amigas comentando lo maja y lo puta que eres",
                    R.raw.mira_ahi_tienes_a_tus_amigas_comentando_lo_puta_que_eres,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Oh si cariño, te lo como todo",
                    R.raw.oh_si_carino_te_lo_como_todo, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Oh! si, gracias por clavarme un puñal en el corazón",
                    R.raw.oh_si_gracias, Personaje.ESTELA));
            sonidos.add(new Sonido("Paleto!", R.raw.paleto, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Pareces un elefante intentando cascar una nuez con el culo",
                    R.raw.pareces_un_elefante_intentando_cascar_una_nuez_con_el_culo,
                    Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Pues antes de navidades estás en 150 kilos",
                    R.raw.pues_antes_de_navidades_estas_en_150_kilos,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Puta escalera", R.raw.puta_escalera,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Que campo de nabos!",
                    R.raw.que_campo_de_nabos, Personaje.ESTELA));
            sonidos.add(new Sonido("Que mentira!", R.raw.que_mentira,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("No maquilles tus palabras",
                    R.raw.que_no_maquilles_tus_palabras, Personaje.ESTELA));
            sonidos.add(new Sonido("Reniego oficialmente de los hombres",
                    R.raw.reniego_oficialmente_de_los_hombres,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Se pone cachondo tu marido",
                    R.raw.se_pone_cachondo_su_marido, Personaje.ESTELA));
            sonidos.add(new Sonido("Solo necesito un semental",
                    R.raw.solo_necesito_un_semental, Personaje.ESTELA));
            sonidos.add(new Sonido("Te falto oxigeno al nacer",
                    R.raw.te_falto_oxigeno_al_nacer, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Tú cállate y habla de lo que sabes, si es que sabes de algo...",
                    R.raw.tu_callate, Personaje.ESTELA));
            sonidos.add(new Sonido("Tullida vendiendo pañuelos",
                    R.raw.tullida_vendiendo_panuelos, Personaje.ESTELA));
            sonidos.add(new Sonido("Uy! se me ve un pezón... que despiste...",
                    R.raw.uy_se_me_ve_un_pezon_que_despiste, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Virtudes como mi profesora de lengua, valiente zorra...",
                    R.raw.virtudes_valiente_zorra, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Yo no he pronunciado vocablo tan soez en mi vida",
                    R.raw.yo_no_he_pronunciado_vocablo_tan_soez_en_mi_vida,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Yo no tengo porque aguantar esto",
                    R.raw.yo_no_tengo_porque_aguantar_esto, Personaje.ESTELA));
            sonidos.add(new Sonido("Zampabollos!", R.raw.zampabollos,
                    Personaje.ESTELA));
            sonidos.add(new Sonido("Yo por mi hija mato, me entiendes, ma-to",
                    R.raw.yo_por_mi_hija_mato_mato, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Como me dejan los vecinos el portal, estoy harto de tanto frotar",
                    R.raw.hartodetantofrotar, Personaje.COQUE));
            sonidos.add(new Sonido("Claro, estaba coqueteando",
                    R.raw.coqueteando, Personaje.COQUE));
            sonidos.add(new Sonido("Coque imitando a Antonio",
                    R.raw.coque_imitando_antonio, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Muchas gracias Don Pastor es usted un amigo",
                    R.raw.graciasdonpastor, Personaje.COQUE));
            sonidos.add(new Sonido("Señor delfín", R.raw.senordelfin, Personaje.COQUE));
            sonidos.add(new Sonido("Antonio imitando a Coque",
                    R.raw.antonioimitacoque, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Quiero sentirme sucia", R.raw.sucia,
                    Personaje.BERTA));
            sonidos.add(new Sonido("Bueno señora no me coma el coco tampoco",
                    R.raw.buenosenora, Personaje.COQUE));
            sonidos.add(new Sonido("Hay que ser muy listo para parecer tonto",
                    R.raw.hayquesermuylistotonto, Personaje.ENRIQUE));
            // 1.01
            sonidos.add(new Sonido("Intro", R.raw.intro, Personaje.OTROS));
            sonidos.add(new Sonido(
                    "Estela Reynolds va a sacar esta familia adelante",
                    R.raw.estelafamiliaadelante, Personaje.ESTELA));
            sonidos.add(new Sonido("Quien te has creido que eres, Lady Gaga?",
                    R.raw.ladygaga, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Me avalancé sobre él con el paraguas en las manos",
                    R.raw.paraguasarmamortifera, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Las rubias siempre sois las malas",
                    R.raw.rubias, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Que haces tocando la pandereta a las 12 de la noche?",
                    R.raw.tocandolapapeletaalas12delanoche, Personaje.ESTELA));
            // 1.02
            sonidos.add(new Sonido("Amo el merengue, amo el amor",
                    R.raw.amoelmerengue, Personaje.AMADOR));
            sonidos.add(new Sonido("Aparcao!", R.raw.aparcao, Personaje.AMADOR));
            sonidos.add(new Sonido("Señora a Benedicto ni me lo toque ehh",
                    R.raw.benedicto, Personaje.BERTA));
            sonidos.add(new Sonido("Que cachondo te pone el poder",
                    R.raw.cachondopoder, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Kuki tu para mi eres de primera división",
                    R.raw.championsleague, Personaje.AMADOR));
            sonidos.add(new Sonido("Descapotao!", R.raw.descapotao, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Me has lavao mis calzoncillos de Dolce & Gabbana?",
                    R.raw.dolcegabanna, Personaje.MAXI));
            sonidos.add(new Sonido("Que coño arrepentido", R.raw.gibraltar,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ya habría vuelto la peseta",
                    R.raw.lapeseta, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Coque leyendo", R.raw.leyendo, Personaje.COQUE));
            sonidos.add(new Sonido("No puedo hacer marmitako", R.raw.marmitako,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido("Quien era ese maromo en boxers?",
                    R.raw.maromoboxers, Personaje.MAITE));
            sonidos.add(new Sonido("Un momento que me estoy mareando",
                    R.raw.mestoymareando, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "En un pajar con mal olor, te di mandanga bajo el sol",
                    R.raw.pajarmulticolor, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Es triste, pero papá es lo máximo a lo que puedes aspirar",
                    R.raw.primeradivision, Personaje.CARLOTA));
            sonidos.add(new Sonido("Vaya noche, que despiporre!",
                    R.raw.quedespiporre, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Soy bien, soy mal", R.raw.soybiensoymal,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Yo quiero echarte un pinchito",
                    R.raw.yoquieroecharteunpinchito, Personaje.AMADOR));

            sonidos.add(new Sonido("Van a ir todos a cagar a mi casa?",
                    R.raw.amicasa, Personaje.COQUE));
            sonidos.add(new Sonido("Recio capullo, limpia tú...",
                    R.raw.ascensor_, Personaje.COQUE));
            sonidos.add(new Sonido("Me puedo hacer astronauta?",
                    R.raw.astronauta, Personaje.COQUE));
            sonidos.add(new Sonido("Ayúdeme a salir", R.raw.ayudeme, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Operación brisa marina completada con éxito", R.raw.brisa,
                    Personaje.COQUE));
            sonidos.add(new Sonido("Muy chungo", R.raw.chungo, Personaje.COQUE));
            sonidos.add(new Sonido("Tu quedate aqui dandole al coco",
                    R.raw.chustilla, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Llevamos 4h y en la caja pone de 3 a 6 años...",
                    R.raw.cielo, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "La cabra que se quiere comer el césped, y el señor del acordeón que nos quiere dar un concierto",
                    R.raw.concierto, Personaje.COQUE));
            sonidos.add(new Sonido("Yo soy conserje, limpio rellanos",
                    R.raw.conserje, Personaje.COQUE));
            sonidos.add(new Sonido("Coque leyendo su contrato", R.raw.contrato,
                    Personaje.COQUE));
            sonidos.add(new Sonido("Una cosilla que se ve viene a la mente",
                    R.raw.cosilla, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Si a mi me regalan un piso de alto standing no me echa ni el demonio",
                    R.raw.demonio, Personaje.COQUE));
            sonidos.add(new Sonido("Y ya sin más dilatación", R.raw.dilatacion,
                    Personaje.COQUE));
            sonidos.add(new Sonido("No se disuelve", R.raw.disuelve, Personaje.COQUE));
            sonidos.add(new Sonido("Alaaa 10 euros, que tengo que hacer?",
                    R.raw.euros, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Yo tengo que descansar, que si no duermo mis 13 horitas luego estoy como lento",
                    R.raw.horitas, Personaje.COQUE));
            sonidos.add(new Sonido("No hablo inglés", R.raw.ingles_, Personaje.COQUE));
            sonidos.add(new Sonido("Ostia! Que hay junta!", R.raw.junta,
                    Personaje.COQUE));
            sonidos.add(new Sonido("La noche ya no es para mí", R.raw.lanoche,
                    Personaje.COQUE));
            sonidos.add(new Sonido("Las bombas hacen BUUM", R.raw.lasbombas,
                    Personaje.COQUE));
            sonidos.add(new Sonido("Sabe a limón", R.raw.limon, Personaje.COQUE));
            sonidos.add(new Sonido("Pero como se va a hacer monja?",
                    R.raw.monja, Personaje.COQUE));
            sonidos.add(new Sonido("No entiendo nada", R.raw.noesta, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Tenía los ojos rojos y escupía fuego por la boca",
                    R.raw.ojos_rojos, Personaje.COQUE));
            sonidos.add(new Sonido("Pegatinas", R.raw.pegatinas, Personaje.COQUE));
            sonidos.add(new Sonido("Las vidas de todos están en peligro",
                    R.raw.peligro, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Que quiere usted, que me esta haciendo perder dinero",
                    R.raw.perder_dinero, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Pues vaya plan más tonto que se le ha ocurrido",
                    R.raw.plan, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Con lo agustito que estaba yo de jardinero con mis plantitas",
                    R.raw.plantitas, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Estamos solo a unos metros y nos oímos a través de un satélite espacial a millones de kilómetros",
                    R.raw.satelite, Personaje.COQUE));
            sonidos.add(new Sonido("Ostia terribleeeee", R.raw.terrible,
                    Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Estoy muy nervioso, a ver si voy a ser tonto de verdad",
                    R.raw.tonto, Personaje.COQUE));
            sonidos.add(new Sonido("Recio villano, friega tu el rellano",
                    R.raw.villano, Personaje.COQUE));
            sonidos.add(new Sonido("Le han violado doña Berta", R.raw.violado,
                    Personaje.COQUE));
            sonidos.add(new Sonido("La virgen", R.raw.virgen_, Personaje.COQUE));
            sonidos.add(new Sonido("Se me ha irritao toda la zona sexual",
                    R.raw.zona_sexual, Personaje.COQUE));

            sonidos.add(new Sonido("Alehop!", R.raw.alehop, Personaje.ENRIQUE));
            sonidos.add(new Sonido("A los quince años ingrese en el seminario",
                    R.raw.alosquince, Personaje.MAXI));
            sonidos.add(new Sonido("Antonio!", R.raw.antonio, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Yo era ascensorista en el World Trade Center",
                    R.raw.ascensorista, Personaje.MAXI));
            sonidos.add(new Sonido("Que no me chupes la boquilla!",
                    R.raw.boquilla, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Por supuesto estas castigadísimo",
                    R.raw.castigadisimo, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Que no me entres en el bar con esta cara, que me espantas a la clientela",
                    R.raw.clientela, Personaje.MAXI));
            sonidos.add(new Sonido("Cual es tu maravillo plan, cocodrilo Maxi",
                    R.raw.cocodrilo, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Enrique Pastor, concejal de juventud y tiempo libre 2",
                    R.raw.concejal_, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Ahora ya puedes cubrir a otra hembra receptiva de la manada",
                    R.raw.cubrir, Personaje.MAXI));
            sonidos.add(new Sonido("Cuchufleta", R.raw.cuchufleta, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Perdona, yo corrí el Paris Dakar en el 83",
                    R.raw.dakar, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Nos están desplazando de nuestra posición dominante",
                    R.raw.desplazando, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Eres un león o te desterramos de la manada",
                    R.raw.desterrar, Personaje.MAXI));
            sonidos.add(new Sonido("La deseas, la deseas", R.raw.embestidas,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido("Excusatio", R.raw.excusation, Personaje.MAXI));
            sonidos.add(new Sonido("Las mujeres no nos entienden",
                    R.raw.fecundar, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Perdona, yo fui el doble de Félix Rodríguez de la Fuente",
                    R.raw.felix, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Ya ves, ha caído rendida ante mi fina labia y mi atractivo varonil",
                    R.raw.finalabia, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Estás enfermo, ves fornicaciones por todas partes",
                    R.raw.fornicaciones, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Fracaso es mi apellido", R.raw.fracaso,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Un león que no copula es un león incompleto",
                    R.raw.incompleto, Personaje.MAXI));
            sonidos.add(new Sonido("Pobre infeliz", R.raw.infeliz, Personaje.MAXI));
            sonidos.add(new Sonido("Hasta el infinito y más allá!",
                    R.raw.infinito, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Me he hecho motero, tengo mi jaka ahí fuera", R.raw.jaka,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "La castigare con el látigo de la indiferencia",
                    R.raw.latigo, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Eres un león o un huevón?",
                    R.raw.leonhuevon, Personaje.MAXI));
            sonidos.add(new Sonido("Es la magia del cine", R.raw.magia, Personaje.MAXI));
            sonidos.add(new Sonido("Pero que mariconadas son estas!",
                    R.raw.mariconadas, Personaje.MAXI));
            sonidos.add(new Sonido("Esto es entre Marilyn y yo", R.raw.marilin,
                    Personaje.MAXI));
            sonidos.add(new Sonido("Me minas la moral (Enrique)",
                    R.raw.meminaslamoral, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Voy a ponerle un mensaje a Ana Rosa",
                    R.raw.mensajeanarosa, Personaje.MAXI));
            sonidos.add(new Sonido("Mente fría 2", R.raw.mentefria_, Personaje.MAXI));
            sonidos.add(new Sonido("Esto ha sido un secuestro claramente",
                    R.raw.mercadonegro, Personaje.MAXI));
            sonidos.add(new Sonido("Peligro es mi apellido", R.raw.peligro_,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido("Alaaa, otra pérgola", R.raw.pergola,
                    Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Tengo que recuperar la potencia muscular que perdí durante mis meses de cautiverio",
                    R.raw.potenciamuscular, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Vamos que la rubia te tiene loco el prepucio",
                    R.raw.prepucio, Personaje.MAXI));
            sonidos.add(new Sonido("Leones o huevones? 3", R.raw.quesomos,
                    Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Si quieres un quinteto me haces un llama cuelga",
                    R.raw.quinteto, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Enrique Pastor, concejal de residuos y tercera edad",
                    R.raw.residuos, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Tendrías que aprender más de Amador",
                    R.raw.salami, Personaje.MAXI));
            sonidos.add(new Sonido("En este bar sólo servimos cañas a leones",
                    R.raw.servimos, Personaje.MAXI));
            sonidos.add(new Sonido("El sexo está en la mente",
                    R.raw.sintocarme, Personaje.MAXI));
            sonidos.add(new Sonido("Has tenido suerte", R.raw.socorrista,
                    Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Vamos a dejar que cuatro camioneras nos expulsen de nuestro templo?",
                    R.raw.templo, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Si quieres hacer un trio me haces un llama cuelga",
                    R.raw.trio, Personaje.MAXI));
            sonidos.add(new Sonido("Me cago en tu puta madre",
                    R.raw.tuputamadre, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "La homosexualidad era un mecanismo evolutivo de defensa",
                    R.raw.ventisca, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "El león viejo y estéril es expulsado de la manada",
                    R.raw.viejo, Personaje.MAXI));
            // 1.03
            sonidos.add(new Sonido("Ahí va, que mojón", R.raw.ahivaquemojon,
                    Personaje.COQUE));
            sonidos.add(new Sonido("Soy Antonio Recio caudillo de Montepinar",
                    R.raw.antoniocaudillo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Caña Aquí (Vicente)", R.raw.canaqui,
                    Personaje.VICENTE));
            sonidos.add(new Sonido("Oye y que no le den el carnet de tonto",
                    R.raw.carnetdetonto, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Casame Enrique", R.raw.casamenrique,
                    Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Comunista! Fracasado! Jodete, que en la plaza roja hay un McDonald's",
                    R.raw.comunistafracasado, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Encima funcionarios!",
                    R.raw.encimafuncionarios, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Usa a los tíos como los tampas",
                    R.raw.estaenunplan, Personaje.NINES));
            sonidos.add(new Sonido("Gañan, imbécil, gilipollas!",
                    R.raw.gananimbecil, Personaje.MAITE));
            sonidos.add(new Sonido("La bollera siempre llama dos veces",
                    R.raw.labollerasiemprellama, Personaje.IZASKUN));
            sonidos.add(new Sonido("Madre mía como viene...",
                    R.raw.madremiacomoviene, Personaje.AMADOR));
            sonidos.add(new Sonido("Me cago es tos tus muertos",
                    R.raw.mecagoentos, Personaje.AMADOR));
            sonidos.add(new Sonido("Niña dame fuego", R.raw.ninadamefuego,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido("Ohh Lola Lolita Lola", R.raw.ohlola,
                    Personaje.JAVIER));
            sonidos.add(new Sonido("Para que me comprado un Cabrio?",
                    R.raw.paraqmecomprado, Personaje.MAITE));
            sonidos.add(new Sonido(
                    "Perdona pero yo a mi mujer le doy mandanga de la buena",
                    R.raw.perdonamandanga, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Pero no me hagáis correr coño!",
                    R.raw.peronomehagaiscorrer, Personaje.VICENTE));
            sonidos.add(new Sonido("Polvo pa arriba, polvo pa abajo",
                    R.raw.polvoparriba, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Te quieres callar, que era una pregunta pretorica",
                    R.raw.preguntaretorica, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Que pesados con la democracia, que no funciona!",
                    R.raw.quepesadosconlademocracia, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Señor delfiiiiiin", R.raw.senordelfiiiin,
                    Personaje.COQUE));
            sonidos.add(new Sonido("Se nota se siente Antonio presidente",
                    R.raw.senotasesiente, Personaje.COQUE));
            sonidos.add(new Sonido("Se nota se siente Enrique presidente",
                    R.raw.senotasesientenrique, Personaje.COQUE));
            sonidos.add(new Sonido("Su hija es muy... además es... tiene...",
                    R.raw.suhijaesmuy, Personaje.AMADOR));
            sonidos.add(new Sonido("Te ha visto alguien?",
                    R.raw.tehavistoalguien, Personaje.COQUE).addPersonaje(Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Por qué aprietan tanto los tornillos?",
                    R.raw.tornillos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Una tortilla de 4000€",
                    R.raw.tortilla4000e, Personaje.LEO));
            sonidos.add(new Sonido("Tu puta madre!", R.raw.tuputamadre_,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido(
                    "Mmmm unas duritas y otras blanditas, como juegas con las texturas",
                    R.raw.unasduritasyotras, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Virgin Mary", R.raw.virginmary, Personaje.BERTA));
            // 1.04
            sonidos.add(new Sonido("Ay mi Kuki que la tienen presa!",
                    R.raw.aymikukipresa, Personaje.AMADOR));
            sonidos.add(new Sonido("Esa zorra va a por Papuchi a saco Paco",
                    R.raw.asacopaco, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Que si, que también hace camisetas del Barça y opera pechos, los chinos son muy polifacéticos",
                    R.raw.camisetasbarca, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Con lo que cuesta que te den el carnet de tonto y el de bombero lo regalan",
                    R.raw.carnetdetontobombero, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Chaqueteros! bolcheviques! viva el propano!",
                    R.raw.chaqueteros, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Esto con Judith Becker no pasaba!",
                    R.raw.conjuditnopasaba, Personaje.JUDITH));
            sonidos.add(new Sonido("Ay mai, un Corvette!", R.raw.corvette,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("El Corvette también pa mi!",
                    R.raw.corvettepami, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Date la vuelta, que ataco por la retaguardia",
                    R.raw.datelavuelta, Personaje.MAXI));
            sonidos.add(new Sonido("Que desastre de gestión!",
                    R.raw.desastregestion, Personaje.JUDITH));
            sonidos.add(new Sonido("Yo soy la diosa pelirroja",
                    R.raw.diosapeliroja, Personaje.JUDITH));
            sonidos.add(new Sonido("El todoterreno pa mi!",
                    R.raw.eltodoterrenopami, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "El nano se tira unos eructos que flipas, lo voy a llevar al tu si que vales",
                    R.raw.eruptosnano, Personaje.AMADOR));
            sonidos.add(new Sonido("Joder, es el escaparate del precio justo",
                    R.raw.escaparate, Personaje.VICENTE));
            sonidos.add(new Sonido("Un momento... que estoy flipando",
                    R.raw.flipando, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Es que... han ido a... y al abrir el... san encontrao con... y han dicho, pues hay que picar",
                    R.raw.hanidoa, Personaje.COQUE));
            sonidos.add(new Sonido("Antonio milagro! he visto una luz",
                    R.raw.hevistounaluz, Personaje.BERTA));
            sonidos.add(new Sonido(
                    "Kuki que me estás acojonando, que ya venia cagao pero...",
                    R.raw.kukiacojonando, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Oye que tal la Kuki en la cárcel? -Pues mal, que gilipollez de pregunta es esa?",
                    R.raw.kukicarcel, Personaje.AMADOR).addPersonaje(Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Me las ligo en el Corvette y me las pincho en el todoterreno!",
                    R.raw.ligocorvettepinchotodoterreno, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Niños, donde queréis que os lleve la yaya?",
                    R.raw.llevelayaya, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Mírame a mi, yo me levanto cada día y lucho por mis sueños",
                    R.raw.luchoxmisuenos, Personaje.VICENTE));
            sonidos.add(new Sonido("Mente fría, bragueta caliente",
                    R.raw.mentefriabragueta, Personaje.VICENTE));
            sonidos.add(new Sonido("Ole el mente fría, el Rambo español!",
                    R.raw.olementefria, Personaje.AMADOR));
            sonidos.add(new Sonido("Ostias! pelocho!", R.raw.ostiaspelocho,
                    Personaje.NINES));
            sonidos.add(new Sonido("Ostia terrible 2", R.raw.ostiaterrible2,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Kuki que iban vestidos de paisano, sin sirena ni na",
                    R.raw.paisano, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Pa que te bajas al pilón, si ya estás casada?",
                    R.raw.pilon, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Presidenta de paja llamando a presidente en la sombra",
                    R.raw.presidentepaja, Personaje.ARACELI));
            sonidos.add(new Sonido(
                    "Te imaginas a los Reyes Magos viniendo de oriente en un Ferrari? a los niños se les cae el mito",
                    R.raw.reyesmagosenferrari, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("A la rubia le di mandanga de la buena!",
                    R.raw.rubiamandanga, Personaje.JAVIER));
            sonidos.add(new Sonido(
                    "Nos suicidamos juntos? a tu madre le damos una alegría, nos habrá hecho croquetas en el más allá",
                    R.raw.suicidamosjuntos, Personaje.VICENTE));
            sonidos.add(new Sonido("Que te reviento! (Javi)",
                    R.raw.terevientojavi, Personaje.JAVIER));
            sonidos.add(new Sonido("Vete a cagar pescadero!",
                    R.raw.veteacagarpescadero, Personaje.IZASKUN));
            sonidos.add(new Sonido("Yaya que has ligado!", R.raw.yayaligado,
                    Personaje.CARLOTA));
            sonidos.add(new Sonido("Yo ya no tengo sueños papá",
                    R.raw.yoyanotengosuenos, Personaje.JAVIER));
            // 1.05
            sonidos.add(new Sonido("Antonio te quieres callar ya",
                    R.raw.antoniotequierescallarya, Personaje.JAVIER));
            sonidos.add(new Sonido("Aquí hay tema pero vamos (Coque)",
                    R.raw.aquihaytemacoque, Personaje.COQUE));
            sonidos.add(new Sonido("Berta cantando", R.raw.bertacantando,
                    Personaje.BERTA));
            sonidos.add(new Sonido("Bichoooo", R.raw.bichooo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Cada vez te pareces más a Amador, que mal te sale todo",
                    R.raw.cadavezteparecesmasamador, Personaje.LEO));
            sonidos.add(new Sonido("Capitán salami ataca de nuevo",
                    R.raw.capitansalamidenuevo, Personaje.AMADOR));
            sonidos.add(new Sonido("Cierra coño que un catarro me mata",
                    R.raw.cierracono, Personaje.IZASKUN));
            sonidos.add(new Sonido(
                    "Ui, eso es que te la han copiado en algún sitio",
                    R.raw.copiarlelatarjeta, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Tu gestión a sumido a esta comunidad en la Edad Media",
                    R.raw.edadmedia, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Eeeeeh", R.raw.ehhconcoque, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "El tofu es, una vaca... africana... que pasta en la pampa africana...",
                    R.raw.eltofues, Personaje.AMADOR));
            sonidos.add(new Sonido("Ahí, ahí, ese es mi mente fría",
                    R.raw.esesmimentefria, Personaje.AMADOR));
            sonidos.add(new Sonido("Eso no se pregunta cojones!",
                    R.raw.esonosepregunta, Personaje.MAXI));
            sonidos.add(new Sonido("Este mes no cooobras",
                    R.raw.estemesnocobras, Personaje.ARACELI));
            sonidos.add(new Sonido("Chicos, habemus bisnes",
                    R.raw.habemusbisnes, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Tienes que ser huevon por fuera y león por dentro",
                    R.raw.huevonxfuera, Personaje.MAXI));
            sonidos.add(new Sonido("I'm flipping", R.raw.imfliping, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Javier engullimos de un trago la mentira que nos adula y bebemos gota a gota la verdad que nos amarga",
                    R.raw.javieruntrago, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Y vamos a ver el atardecer al parking del centro comercial, según va cayendo el sol se iluminan las letras del Carrefour, es un momento mágico",
                    R.raw.letrascarrefour, Personaje.COQUE));
            sonidos.add(new Sonido("Maroto, eres un filón", R.raw.marotofilon,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido("Maroto huevon!", R.raw.marotohuevon,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido("Maxi que no es de la manada",
                    R.raw.maxiqnoesdelamanada, Personaje.JAVIER));
            sonidos.add(new Sonido("Mírale los ojos, esta drogado",
                    R.raw.miralelosojos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Moción de censura ya",
                    R.raw.mociondecensuraya, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Oh Lola Lola, no te encierres en el baño sola...",
                    R.raw.ohlola2, Personaje.JAVIER));
            sonidos.add(new Sonido("Ostia puta", R.raw.ostiaputa, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Es la palabra de una lesbiana contra la un mayorista, estas perdida",
                    R.raw.palabralesbinavsmayorista, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Pescadero cabrón! Casi me matas!",
                    R.raw.percaderocabroncasimematas, Personaje.IZASKUN));
            sonidos.add(new Sonido(
                    "Pero no digas Antonio, para que llevo pasamontañas?",
                    R.raw.peronodigasantonio, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Politono Enrique", R.raw.politono,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Se me esta poniendo la presidencia más a huevo que a Rajoy",
                    R.raw.presidenciaahuevo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que corten el agua", R.raw.qcortenelagua,
                    Personaje.ARACELI));
            sonidos.add(new Sonido("Que llamen al seguro",
                    R.raw.qllamenalseguro, Personaje.ARACELI));
            sonidos.add(new Sonido(
                    "A ver, si yo fuera lesbiana donde escondería una barba postiza y unas bragas cristianas",
                    R.raw.siyofueselesbiana, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Un león es un depredador un león actúa un león copula, si la quieres besar la besas!",
                    R.raw.unleonesundepredador, Personaje.MAXI));
            sonidos.add(new Sonido("Venga kuki un pinchito",
                    R.raw.vengakukiunpinchito, Personaje.AMADOR));
            // 1.06
            sonidos.add(new Sonido(
                    "Aquí se viene a participar, esto no es el congreso",
                    R.raw.aquisevieneaparticipar, Personaje.MAXI));
            sonidos.add(new Sonido("Yo quiero el cromo de Iniesta!",
                    R.raw.cromoiniesta, Personaje.AMADOR));
            sonidos.add(new Sonido("Eres un muermo miarma", R.raw.eresunmuermo,
                    Personaje.NINES));
            sonidos.add(new Sonido("Hijos de puta, explotadores!",
                    R.raw.hijosdeputaexplotadores, Personaje.IZASKUN));
            sonidos.add(new Sonido("Ikechukwu Uche", R.raw.ikechukwuuche,
                    Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Le dio un jamacuco al ver al marido en tanga",
                    R.raw.lediounjamacuco, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Está harta de pasar su aspirador una y otra vez?",
                    R.raw.leovendiendoaspirador, Personaje.LEO));
            sonidos.add(new Sonido(
                    "Los payasos justicieros no pararan hasta acabar con los males que corrompen España",
                    R.raw.lospayasosnopararan, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Me la imagino ahí: señorito, le plancho los pantalones señorito?",
                    R.raw.melaimagino, Personaje.AMADOR));
            sonidos.add(new Sonido("Mis gambas huelen a mar",
                    R.raw.misgambashuelenamar, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Nole, Iniesta de mi vida",
                    R.raw.noleiniestademivida, Personaje.AMADOR));
            sonidos.add(new Sonido("No me encuentro, estoy que no estoy",
                    R.raw.nomeencuentro, Personaje.JAVIER));
            sonidos.add(new Sonido(
                    "Normal, el matrimonio es esa clase de cosas que a uno se le olvida comentar a la familia",
                    R.raw.olvidacomentarfamilia, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Oscar Alfredo Ustari",
                    R.raw.oscaralfredoustari, Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Políticos cabrones, no hacen nada y encima se lleva la gloria",
                    R.raw.politicoscabrones, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Presidenta dimisión!",
                    R.raw.presidentadimision, Personaje.BERTA));
            sonidos.add(new Sonido(
                    "Primera carta del apóstol San Pablo a los corintios",
                    R.raw.primeracartasanpablo, Personaje.JUDITH));
            sonidos.add(new Sonido(
                    "Puedes ser linier, con ese pelo no te van a doler los botellazos",
                    R.raw.puedesserlinier, Personaje.VICENTE));
            sonidos.add(new Sonido("Que ataque más gratuito (Lola)",
                    R.raw.queataquemasgratuitolola, Personaje.OTROS));
            sonidos.add(new Sonido(
                    "Si señor alcalde, por supuesto señor alcalde, muchas gracias señor alcalde",
                    R.raw.sisenoralcalde, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Somos los payasos justicieros",
                    R.raw.somoslospayasosjusticieros, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Perdona tengo miles de fans soy un héroe del pueblo, le pegue un centollazo a Zapatero",
                    R.raw.tengomilesdefans, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Vecinos podéis descansar tranquilos",
                    R.raw.vecinospodeisdescansartranquilos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Voy a ser como Batman, mayorista de día y justiciero de noche",
                    R.raw.voyasercomobatman, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Ya me vendría a llorar cuando el tifus y el dengue se extiendan por el edificio",
                    R.raw.yamevendreisallorar, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Zumo aquí!", R.raw.zumoaqui, Personaje.LEO));
            sonidos.add(new Sonido("Moroso cabrón!", R.raw.morosocabron,
                    Personaje.ANTONIO_RECIO));
            // 1.07
            sonidos.add(new Sonido(
                    "Ahora si, ahora si que voy a ser un vividor follador",
                    R.raw.ahorasiquevoyaserunvividorfollador, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "A partir de ahora será Antonio Recio II príncipe de las gambas",
                    R.raw.antoniorecioii, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Bueno toma, pero me debes...",
                    R.raw.buenotomaperomedebes, Personaje.LEO));
            sonidos.add(new Sonido(
                    "Ves lo que pasa cuando le haces contrato a un inmigrante",
                    R.raw.contratoinmigrante, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Durmiendo en horas de trabajo, despedida!",
                    R.raw.durmiendoenhorasdetrabajo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Enrique quiere un hijo!",
                    R.raw.enriquequiereunhijo, Personaje.JUDITH));
            sonidos.add(new Sonido(
                    "Lo que viene siendo una familia española al uso",
                    R.raw.familiaespanola, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Me cago en el cuadrado el triangulo y la madre que le pario al mando este",
                    R.raw.goooooool, Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Que tal señor delfín?... No si un que tal de hola mas que un que tal de que se pare y me cuente",
                    R.raw.holaquetaldelfin, Personaje.COQUE));
            sonidos.add(new Sonido("Iniesta pa mi!", R.raw.iniesta, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Olé las deportistas, que maratón de mandanga os daba",
                    R.raw.lasdeportistas, Personaje.AMADOR));
            sonidos.add(new Sonido("Mama milagro!", R.raw.mamamilagro,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Me prestas 3000 euros?",
                    R.raw.meprestas3000euros, Personaje.AMADOR).addPersonaje(Personaje.LEO));
            sonidos.add(new Sonido("Olé, olé", R.raw.oleole, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Ehhh Picassito, te has traído los pinceles?",
                    R.raw.picassito, Personaje.AMADOR));
            sonidos.add(new Sonido("Pues te exploto el celebro!",
                    R.raw.puesteexplotoelcelebro, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Que pasa Picassito? que se te ha secao la brocha",
                    R.raw.quepasapicassito, Personaje.AMADOR));
            sonidos.add(new Sonido("Quieres salami?", R.raw.quieresalami,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Revisión de pechotes",
                    R.raw.revesiondepechotes, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Señoraaaaa", R.raw.senora, Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Silencio silencio, que mente fría tiene una arducia",
                    R.raw.silenciosilencio, Personaje.AMADOR));
            sonidos.add(new Sonido("Teoría de la evolución",
                    R.raw.teoriadelaevolucion, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Te quieres callar!", R.raw.tequierescallar,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Vamos campeón levanta!",
                    R.raw.vamoscampeonlevanta, Personaje.CARLOTA));
            sonidos.add(new Sonido("Van a echar un pinchito",
                    R.raw.vanaecharunpinchito, Personaje.CARLOTA));
            sonidos.add(new Sonido("Ay un vinito, que planazo",
                    R.raw.vinitoplanazo, Personaje.JUDITH));
            sonidos.add(new Sonido("Yo te nombro pescadera suplente",
                    R.raw.yotenombropescaderasuplente, Personaje.ANTONIO_RECIO));
            // 1.08
            sonidos.add(new Sonido("Abridme! hijos de puta! que tengo frio...",
                    R.raw.abridmehijosdeputa, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Aaaaah! Ostias! Que me achicharras el salami",
                    R.raw.achicharraselsalami, Personaje.AMADOR));
            sonidos.add(new Sonido("Agente, están borrachos!",
                    R.raw.agenteestanborrachos, Personaje.JUDITH));
            sonidos.add(new Sonido("Aparcao! 2", R.raw.aparcao2, Personaje.AMADOR));
            sonidos.add(new Sonido("Ay mi kuki (Leo)", R.raw.aymikukileo,
                    Personaje.LEO));
            sonidos.add(new Sonido("Bollera dimisión!", R.raw.bolleradimision,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido(
                    "Si tienes una cena elegante llévate un bogavante, si tienes una cena de gala "
                            + "llévate una cigala, si quiere una cena romántica llévate... para eso no tengo nada",
                    R.raw.cenaromantica, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Concejal hijo puta! (Amador)",
                    R.raw.concejalhijoputamador, Personaje.AMADOR));
            sonidos.add(new Sonido("Dejadle, os lo manda la presidenta",
                    R.raw.dejadleoslomandalapresidenta, Personaje.ARACELI));
            sonidos.add(new Sonido("Elecciones anticipadas ya",
                    R.raw.eleccionesanticipadasya, Personaje.NINES));
            sonidos.add(new Sonido("Estás entre Pinto y Baldomero",
                    R.raw.estasentrepintoybaldomero, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Estoy hasta los huevos de vuestros consejos de mierda, mente fría mente vacía",
                    R.raw.hastaloshuevosconsejosdemierda, Personaje.JAVIER));
            sonidos.add(new Sonido(
                    "Vecinos, me llena de orgullo y satisfacción",
                    R.raw.mellenadeorgulloysatisfacion, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Me encanta que mi divorcio provoque esta explosión de felicidad en todas vosotras, os quiero mucho... hijas de puta",
                    R.raw.mencantaqmidivorcio, Personaje.JAVIER));
            sonidos.add(new Sonido("Mi casa es tu casa, bueno y del banco",
                    R.raw.micasaestucasa, Personaje.AMADOR));
            sonidos.add(new Sonido("No, no estamos juntos",
                    R.raw.noestamosjuntos, Personaje.MAITE));
            sonidos.add(new Sonido("Putos vecinos", R.raw.putosvecinos,
                    Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Que vergüenza, 20 años de cliente del banco y me han denegado el crédito, a mi, a un mayorista",
                    R.raw.queverguenza, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que vienen! Que vienen!", R.raw.qvienen,
                    Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Que haces? Que yo mañana madrugo, quien me hace el Colacao?",
                    R.raw.qyomnnmadrugo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Estupendo, cuando le vendamos el piso a la chica le decimos: \"toma tu escritura y dos radiografías, la del portal y la de la casa\"",
                    R.raw.radiografias, Personaje.JUDITH));
            sonidos.add(new Sonido(
                    "Podemos sanear las cuentas y sentar las bases para un futuro prospero y dichoso pero tenemos que estar unidos...",
                    R.raw.sanearlascuentas, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Un tuerto maricón, tu en el cuarto oscuro no los ves venir",
                    R.raw.untuertomaricon, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Whisky aquí!", R.raw.whiskyaqui, Personaje.JAVIER));
            sonidos.add(new Sonido("Porque España gano el mundial?",
                    R.raw.xqespanaganoelmundial, Personaje.ENRIQUE));
            sonidos.add(new Sonido("Ahh ya he electrocutao a una gorda",
                    R.raw.electrocutaogorda, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Ala! Otra vez el cornudo de España, yo me quiero morir, yo me quiero morir, ai mai, ai mai, ai mai",
                    R.raw.otravezelcornudodeespana, Personaje.AMADOR));
            sonidos.add(new Sonido("Pringaos!", R.raw.pringaos, Personaje.AMADOR));
            // 1.09
            sonidos.add(new Sonido(
                    "Y ahora viene la parte en la que la caga, luego vuelve jodido y empieza otra vez todo el proceso",
                    R.raw.ahoravienelaparte, Personaje.VICENTE));
            sonidos.add(new Sonido("Aggg que papá!", R.raw.ahqpapa, Personaje.JUDITH));
            sonidos.add(new Sonido("Ai mi hijo, puto Huntington-Stenaguer",
                    R.raw.aimihijo, Personaje.VICENTE));
            sonidos.add(new Sonido("Aaaaaal despacho!", R.raw.aldespacho,
                    Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Por qué cuando alguien se muere de repente es la ostia?",
                    R.raw.alguiensemuereostia, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Volvemos a ser amo y delfín, como en los viejos tiempos",
                    R.raw.amoydelfin, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ave María Purísima!",
                    R.raw.avemariapurisima, Personaje.IZASKUN));
            sonidos.add(new Sonido(
                    "Pobrecillo, ciego e inmigrante, el señor se ha cebao contigo",
                    R.raw.ciegoeinmigrante, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Venga pasa, que pa ti va a ser domingo to los días ya",
                    R.raw.domingotolosdias, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Donde estabas? Se te ha enfriado el Colacao",
                    R.raw.enfriadocolacao, Personaje.BERTA));
            sonidos.add(new Sonido(
                    "Enrique estás muy negativo, me minas la moral",
                    R.raw.enriquenegativo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Enrique, qué haces?", R.raw.enriqueqhaces,
                    Personaje.JUDITH));
            sonidos.add(new Sonido("Son las gambas del apocalipsis!",
                    R.raw.gambasapocalipsis, Personaje.IZASKUN));
            sonidos.add(new Sonido("Hoy duermes en el sofá!",
                    R.raw.hoyduermesenelsofa, Personaje.JUDITH));
            sonidos.add(new Sonido("I'm flipping totally",
                    R.raw.imflipingtotally, Personaje.NINES));
            sonidos.add(new Sonido("Javi que te vas a meter en otro jardín...",
                    R.raw.javiotrojardin, Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Si Jesucristo hubiera tenido que hacer tanto papeleo para certificar sus milagros se habría quedao cortando tablones con su padre",
                    R.raw.jesucristopapeleo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Los Maroto nos rendimos enseguida",
                    R.raw.losmarotonosrendimosenseguida, Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Yo por 2000 pavos despido hasta a mi madre",
                    R.raw.mamadespedia, Personaje.AMADOR));
            sonidos.add(new Sonido("Aaaah, me cago en la ostia puta!",
                    R.raw.mecagostiaputa, Personaje.NINES));
            sonidos.add(new Sonido("Milagro! Milagro!", R.raw.miragro,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido(
                    "Como va a ser presidente este mindundi si no manda ni en su casa",
                    R.raw.nomandaniensucasa, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Pobre pelocho no cumplió los treinta y ocho",
                    R.raw.pobrepelocho, Personaje.NINES));
            sonidos.add(new Sonido("Prima, el moribundo!",
                    R.raw.primaelmoribundo, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Y el primer afortuna de hoy es... tú ven pa'cá que te voy a contar una cosita",
                    R.raw.primerafortunadodehoy, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Las rubias son como los chinos, todas iguales",
                    R.raw.rubiascomochinos, Personaje.NINES));
            sonidos.add(new Sonido("Bienvenidos al santuario de Montepinar",
                    R.raw.santuariomontopinar, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Si estás en la silla del presidente, eres el presidente",
                    R.raw.sillapresidente, Personaje.VICENTE));
            sonidos.add(new Sonido("Tres juntas de suspensión!",
                    R.raw.tresjuntasuspension, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Ui la Wikipedia, si eso lo escriben tres frikis...",
                    R.raw.wikipedia, Personaje.JAVIER));
            // 1.10
            sonidos.add(new Sonido(
                    "Vale me callo, pero vas a acabar absorbido por Percebesa",
                    R.raw.absorvidopercebesa, Personaje.BERTA));
            sonidos.add(new Sonido("Te ha cagado la paloma!",
                    R.raw.cagadapaloma, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "No puede invadir China, tiene una muralla mu grande",
                    R.raw.chinamurallagrande, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Tengo la columna como el rabo de un cochinillo",
                    R.raw.columnarabo, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Los Conguitos aceptaban su destino de morir masticados entre terribles sufrimientos",
                    R.raw.conguitos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Detective león!", R.raw.detectiveleon,
                    Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Y tu cuando vas a empezar a traer dinero a casa?",
                    R.raw.dineroacasa, Personaje.CARLOTA));
            sonidos.add(new Sonido(
                    "Me puedes pagar en efectivo o en cash, como mejor te venga",
                    R.raw.efectivocash, Personaje.AMADOR));
            sonidos.add(new Sonido("Ehh zorra!! Tienes que pagar",
                    R.raw.ehhzorra, Personaje.VIOLETA));
            sonidos.add(new Sonido("El genio de las gambas",
                    R.raw.elgeniodelasgambas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Eso en negro, si quieres factura tu casco el IVA",
                    R.raw.esoennegro, Personaje.AMADOR));
            sonidos.add(new Sonido("Sergio Arias te has follado a mi hermana",
                    R.raw.folladoamihermana, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Adelante gadgetosalami",
                    R.raw.gadgetosalami, Personaje.AMADOR));
            sonidos.add(new Sonido("Gañan", R.raw.ganan, Personaje.MAITE));
            sonidos.add(new Sonido("Gañan, putón, gorrón",
                    R.raw.gananputongorron, Personaje.CARLOTA));
            sonidos.add(new Sonido("He ganao la porra!", R.raw.ganaolaporra,
                    Personaje.COQUE));
            sonidos.add(new Sonido("Antonio me está hablando el plátano",
                    R.raw.hablandoplatano, Personaje.BERTA));
            sonidos.add(new Sonido(
                    "Antonio Recio jamás se humillará ante un chino",
                    R.raw.humillaranteunchino, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("La está poniendo fina filipina",
                    R.raw.laestaponiendofinafilipina, Personaje.AMADOR));
            sonidos.add(new Sonido("Esto es más largo que un día sin fútbol",
                    R.raw.maslargoundiasin, Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Un mayorista suplicándole a un chino, este país se va a la mierda",
                    R.raw.mayoristasuplicando, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Me caigo muerta", R.raw.mecaigomuerta,
                    Personaje.MAITE));
            sonidos.add(new Sonido("Mamá das mucha pena", R.raw.muchapena,
                    Personaje.CARLOTA));
            sonidos.add(new Sonido("Yo te nombro musa de Mariscos Recio",
                    R.raw.musamariscosrecio, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "No hay que hacer negocios con inmigrantes, hay que invadirlos y someterlos",
                    R.raw.negociosinmigrantes, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Judith no es un putón como la Kuki",
                    R.raw.nocomolakuki, Personaje.LEO));
            sonidos.add(new Sonido("No no, yo no contrato más inmigrantes",
                    R.raw.nocontratomasinmigrantes, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Mariscos Recio patrocina estos cuernos",
                    R.raw.patrocinacuernos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Pescadero cabrón! (Lola)", R.raw.pescadero_cabron,
                    Personaje.OTROS));
            sonidos.add(new Sonido("Está como una puta cabra", R.raw.putacabra,
                    Personaje.NINES));
            sonidos.add(new Sonido(
                    "Qué está pasando aquí? ¿Qué está pasando allí? Nada se me escapa, de to me entero",
                    R.raw.qestapasando, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Qué está pasando ahí? ¿Qué está pasando ahí? Amador Rivas detective león!",
                    R.raw.qestapasandoahi, Personaje.AMADOR));
            sonidos.add(new Sonido("Que gorrón!", R.raw.qgorron,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Qué haces esta noche? -Nada, quieres follar?",
                    R.raw.quieresfollar, Personaje.VIOLETA));
            sonidos.add(new Sonido("Que vienen! Que vienen! 2", R.raw.qvienen2,
                    Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Perdona pero esto está más rosa que el descapotable de la Barbie",
                    R.raw.rosaprenada, Personaje.NINES));
            sonidos.add(new Sonido("Sálvameeee ven volando a miiii",
                    R.raw.salvame, Personaje.NINES));
            sonidos.add(new Sonido(
                    "En el sótano de tu fracaso hay otra planta más",
                    R.raw.sotanofracaso, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Tu puta madre", R.raw.tuputamadrenines,
                    Personaje.NINES));
            sonidos.add(new Sonido(
                    "Mira una vampira embarazada, como en crepúsculo",
                    R.raw.vampiraembarazada, Personaje.JUDITH));
            sonidos.add(new Sonido("Ya soy normal!", R.raw.yasoynormal,
                    Personaje.VIOLETA));
            sonidos.add(new Sonido("Yo me quiero morir", R.raw.yomequieromorir,
                    Personaje.ENRIQUE));
            sonidos.add(new Sonido("Ay Gregoria que voy pa ya",
                    R.raw.ay_gregoria, Personaje.VICENTE));
            sonidos.add(new Sonido("Ay mai kuki", R.raw.aymaicuki, Personaje.AMADOR));
            sonidos.add(new Sonido("Pescadero cabrón! 2", R.raw.cabron,
                    Personaje.IZASKUN));
            sonidos.add(new Sonido("Me he traido condones", R.raw.condones,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("Como goza la perra", R.raw.goza_perra,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Huevón, huevón, huevón", R.raw.huevon,
                    Personaje.JAVIER));
            sonidos.add(new Sonido("Si yo me pongo palote enseguida",
                    R.raw.palote, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Polanski llamo a mi puerta cuando tenía 13 años, pero no estaba en casa",
                    R.raw.pol_anski, Personaje.ESTELA));
            sonidos.add(new Sonido(
                    "Esta noche nos vamos de putillas, invito yo",
                    R.raw.nosvamosdeputillas, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Cómeme el rabo (Fran)", R.raw.rabo, Personaje.OTROS));
            // 1.11
            sonidos.add(new Sonido("Amador-Elvis", R.raw.amadorelvis, Personaje.AMADOR));
            sonidos.add(new Sonido("A Amador que le den", R.raw.amadorqleden,
                    Personaje.MAITE));
            sonidos.add(new Sonido(
                    "Ton ti ton ti ton, amor y respecto toda la vida",
                    R.raw.amoryrespetotodalavida, Personaje.AMADOR));
            sonidos.add(new Sonido("Anciano molesto expulsado de la junta",
                    R.raw.ancianomolesto, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Antonio!!", R.raw.antonioberta, Personaje.BERTA));
            sonidos.add(new Sonido(
                    "Como ve vuelvas a hablar del chino te pido el divorcio",
                    R.raw.chinodivorcio, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Cojonudo! Al vicio, al vicio",
                    R.raw.cojonudoalvicio, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "La quisieron captar para el convento, pero como es rubia no se fiaron",
                    R.raw.convento, Personaje.NINES));
            sonidos.add(new Sonido("Yo soy el Elvis español",
                    R.raw.elvisespanol, Personaje.AMADOR));
            sonidos.add(new Sonido("Gamba mala, yo denuncio a ti ehh",
                    R.raw.gambamala, Personaje.OTROS));
            sonidos.add(new Sonido("Ostias! Kung Fu Panda 2, pa los críos",
                    R.raw.kunfupanda2, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "La Violeta al abuelo le está dan pal pelo ohhh yeah",
                    R.raw.lestadandopalpelo, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Por el poder que me otorga el rock and roll, el king os declara man and woman",
                    R.raw.manwoman, Personaje.AMADOR));
            sonidos.add(new Sonido("Tranquilidad, mente fría",
                    R.raw.mentrefriajavi, Personaje.JAVIER));
            sonidos.add(new Sonido("Muertos de hambre!", R.raw.muertosdehambre,
                    Personaje.BERTA));
            sonidos.add(new Sonido(
                    "Ohhh yeah ohhh yeah ohhh yeah mueve las caderas al ritmo de esta song mira mi salami se me marca el pantalón",
                    R.raw.muevelascaderas, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Lo que ocurre en el gran casino se queda en el gran casino",
                    R.raw.ocurregrancasino, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ohhh yeah ohhh yeah", R.raw.ohhyeah,
                    Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Os caso? Os caso? Os casa el Elvis Presley? Os casa el pelvis?",
                    R.raw.oscaso, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "La ostia que te voy a dar si que va a ser matematica",
                    R.raw.ostiamatematica, Personaje.AMADOR));
            sonidos.add(new Sonido("Paga cabrón!", R.raw.pagacabron, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Planta aquí el chochete que estás de rechupete y yo vengo de Albacete",
                    R.raw.plantaquielchochete, Personaje.AMADOR));
            sonidos.add(new Sonido("Puta! Puta! Puta!", R.raw.putaputaputa,
                    Personaje.MAITE));
            sonidos.add(new Sonido("Que calzonazos, como te domina",
                    R.raw.qclazonazos, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Que horror que antro", R.raw.qhorrorqantro,
                    Personaje.BERTA));
            sonidos.add(new Sonido("Taka! Taka! Taka!", R.raw.taka, Personaje.VIOLETA));
            sonidos.add(new Sonido(
                    "Toma mi salami toma mi salami que mola mogollón ohhh yeah",
                    R.raw.tomamisalami, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Bueno yo me voy a tumbar que si no duermo mis trece horitas no soy persona",
                    R.raw.trecehoritas, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "De que se ríe el hombre cojín? -Que tu palmas el doble",
                    R.raw.tupalmaseldoble, Personaje.VICENTE).addPersonaje(Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Estoy sorprendida prima, has demostrado una velocidad mental impropia de una rubia",
                    R.raw.velocidadmental, Personaje.NINES));
            sonidos.add(new Sonido(
                    "Yo no tengo na, mi mujer se lo ha gastao to",
                    R.raw.yonotengona, Personaje.AMADOR));
            // 1.12
            sonidos.add(new Sonido("Aaah la bollera en camisón",
                    R.raw.bolleraencamison, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ese es mi borderline!", R.raw.borderline,
                    Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Clarooo, como viene de la catatonía pues habla catalán",
                    R.raw.catatonia, Personaje.COQUE));
            sonidos.add(new Sonido("Que tu chico me quiere quitar a mi chica",
                    R.raw.chicochica, Personaje.JAVIER).addPersonaje(Personaje.MAITE));
            sonidos.add(new Sonido("Demanda judicial", R.raw.demandajudicial,
                    Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Po yo quiero un filete!", R.raw.filete,
                    Personaje.AMADOR));
            sonidos.add(new Sonido("El gran casino de Montepinar",
                    R.raw.grancasino, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Ay Gregoria, era la reina de la bechamel",
                    R.raw.gregoriareina, Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Gripe? Eso es un virus tropical que se ha traído de su país, le habrá mordido algún mono, así empezó el sida",
                    R.raw.gripe, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Hacienda es como un león dormido, si pasas junto a él sin despertarle te librarás de su apetito voraz",
                    R.raw.hacienda, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Estoy hasta los huevos de que uséis mi coche para chorradas, mañana lo rifo",
                    R.raw.hastaloshuevoscoche, Personaje.VICENTE));
            sonidos.add(new Sonido(
                    "Que hija puta Manolita, pero que pechotes tenía!",
                    R.raw.hijaputamanolita, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Tu hijo me ha humillado públicamente, casi muero desnucado contra una barbacoa barata",
                    R.raw.humilladopublicamente, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Oooh la que se avecina, vecina, oooh la que se avecina",
                    R.raw.laqseavecina, Personaje.NINES).addPersonaje(Personaje.JUDITH));
            sonidos.add(new Sonido(
                    "Larga y prospera vida compañero, larga y prospera vidaaa",
                    R.raw.largayprosperavida, Personaje.VIOLETA));
            sonidos.add(new Sonido(
                    "Policía? Antonio Recio, mayorista no limpio pescado. Quiero denunciar a unos inmigrantes ilegales, viva el Rey y viva España!",
                    R.raw.llamadapolicia, Personaje.ENRIQUE));
            sonidos.add(new Sonido(
                    "Uuuu que suerte ma tocao una casa, nunca me había tocao na",
                    R.raw.matocaounacasa, Personaje.AMADOR));
            sonidos.add(new Sonido("Pinchando voy, pinchando vengo",
                    R.raw.pinchandovoy, Personaje.AMADOR));
            sonidos.add(new Sonido("Soy Violeta, putilla y pescadera",
                    R.raw.putillaypescadera, Personaje.VIOLETA));
            sonidos.add(new Sonido("Putos bancos", R.raw.putosbancos, Personaje.LEO));
            sonidos.add(new Sonido("Puto sistema", R.raw.putosistema,
                    Personaje.VICENTE));
            sonidos.add(new Sonido("Putos políticos", R.raw.putospoliticos,
                    Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Que no pago coño! Que ya está bien de sangrarme, me cago en el déficit y en su puta madre. Me voy a ir a vivir a Andorra",
                    R.raw.qnopagocono, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Que todas las rubias con mala gente, estoy harta de decirlo",
                    R.raw.rubiasmalagente, Personaje.NINES));
            sonidos.add(new Sonido("Mira las sandalia que me trae...",
                    R.raw.sandalias, Personaje.OTROS));
            sonidos.add(new Sonido(
                    "Mira quien fue a hablar, el sargento mindundi",
                    R.raw.sgtmindundi, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Le habéis dado una sobredosis de phoskitos!",
                    R.raw.sobredosis, Personaje.ANTONIO_RECIO));
            // 1.13
            sonidos.add(new Sonido("Esto del alto standing es la ostia ehhh",
                    R.raw.altoestandin, Personaje.FERMIN));
            sonidos.add(new Sonido("Buen trabajo bicho, sigue así",
                    R.raw.buentrabajo, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Enrique Pastor se pasa el día sacándole brillo a su casco alemán",
                    R.raw.cascoaleman, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido(
                    "Llévate las cenizas de tu madre, que siempre se quejaba de que no la llevaba a ningún lado",
                    R.raw.cenizastumadre, Personaje.VICENTE));
            sonidos.add(new Sonido("Buenas tardes, venimos a comprar un bebé",
                    R.raw.comprarbebe, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Tartar! Tartar! Tartar!",
                    R.raw.cortartartar, Personaje.VIOLETA));
            sonidos.add(new Sonido(
                    "Fresquísimos... Pero si eso no lo han pescao, eso estaba ya flotando en el agua",
                    R.raw.estabaflotando, Personaje.FERMIN));
            sonidos.add(new Sonido(
                    "Por favor señor juez, no nos desaloje, estamos enfermitos",
                    R.raw.estamosenfermitos, Personaje.CARLOTA));
            sonidos.add(new Sonido("Los filetes pa mí!", R.raw.filetespami,
                    Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Que homófobo eres, mi hijo está enfermo, cogio frio al nacer",
                    R.raw.frioalnacer, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Sería como buscar una gamba en un pajar",
                    R.raw.gambapajar, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Gañan! Putón! Gañan! Putón!",
                    R.raw.gananputon, Personaje.AMADOR).addPersonaje(Personaje.MAITE));
            sonidos.add(new Sonido(
                    "Pero dame de estas, que me querías hacer el lio. Y a mi el lio no ehhh",
                    R.raw.hacerellio, Personaje.FERMIN));
            sonidos.add(new Sonido("Mente fría se te ha ido la pinza",
                    R.raw.idadepinza, Personaje.VICENTE));
            sonidos.add(new Sonido("Kuki, me has puesto palote",
                    R.raw.kukipalote, Personaje.AMADOR));
            sonidos.add(new Sonido("Los leones detectives pa la playa!",
                    R.raw.leonesdectectivespalaplaya, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Un llavero de Mariscos Recio, para las llaves del Citroën",
                    R.raw.llavescitroen, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Los cojones!", R.raw.loscojones, Personaje.AMADOR));
            sonidos.add(new Sonido("Pero por qué me suena aquí todo el mundo?",
                    R.raw.mesuenatodoelmundo, Personaje.FERMIN));
            sonidos.add(new Sonido(
                    "Porque las cosas no explotan por si solas. Bueno un vecino que un día le exploto la bombona del camping gas...",
                    R.raw.noexplotansolas, Personaje.FERMIN));
            sonidos.add(new Sonido(
                    "Un día me toque así en la ducha y dije coño tengo un bulto aquí detrás, me fui acojonao al médico, y resulto que era el otro huevo",
                    R.raw.otrohuevo, Personaje.COQUE));
            sonidos.add(new Sonido(
                    "Pues... a ver... es una cosa degenerativa de todos los sistemas electro-musculares y se degenera to, los brazos, los dedos",
                    R.raw.puesesunacosa, Personaje.AMADOR));
            sonidos.add(new Sonido(
                    "Estás llamando puta a mi madre? Seguro que ella no se iba follando tontos",
                    R.raw.putaamimadre, Personaje.ANTONIO_RECIO));
            sonidos.add(new Sonido("Puta! Puta! Puta! 2", R.raw.putaputaputa2,
                    Personaje.MAITE));
            sonidos.add(new Sonido(
                    "Unos regalitos para Lola, mira: un cuaderno para colorear, un puzle de los pitufos y un piano digital...",
                    R.raw.regalitoslola, Personaje.FERMIN));
            sonidos.add(new Sonido("Silencio!", R.raw.silencio, Personaje.MAXI));
            sonidos.add(new Sonido(
                    "Ahí Gregoria, que sólo me ha dejado el niño",
                    R.raw.solonino, Personaje.VICENTE));
            sonidos.add(new Sonido("Te estabas tocando",
                    R.raw.teestabastocando, Personaje.JUDITH));
            sonidos.add(new Sonido(
                    "Yo no soy de llorar, si yo en Titanic quería que se ahogasen todos",
                    R.raw.titanic, Personaje.FERMIN));
            sonidos.add(new Sonido("Aquí venden mas niños que yo bogavantes",
                    R.raw.vendenmasninos, Personaje.ANTONIO_RECIO));
            // 1.14
            sonidos.add(new Sonido(
                    "Era puta, la saque de la calle y mira como se ha puesto. Que se va a salir de España y luego no tiene papeles para volver a entrar",
                    R.raw.eraputa, Personaje.FERMIN).setNuevo(true));
            sonidos.add(new Sonido(
                    "Que hija de puta la Paca",
                    R.raw.hijaputapaca, Personaje.FERMIN).setNuevo(true));
            sonidos.add(new Sonido(
                    "Aquí huele a vieja, yo me quiero ir",
                    R.raw.hueleavieja, Personaje.VIOLETA).setNuevo(true));
            sonidos.add(new Sonido(
                    "La monja de la muerte",
                    R.raw.monjadelamuerte, Personaje.VIOLETA).setNuevo(true));
            sonidos.add(new Sonido(
                    "Eres la monja roba niños?",
                    R.raw.monjarobaninos, Personaje.VIOLETA).setNuevo(true));

            Collections.sort(sonidos, new Comparator<Sonido>() {
                public int compare(Sonido s1, Sonido s2) {
                    return s1.getNombre().compareTo(s2.getNombre());
                }
            });
        }
    }

}
