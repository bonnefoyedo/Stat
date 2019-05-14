package supelec.bonnefoy.statistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> liste = new ArrayList<String>();

    int nomProduit = 0;
    int labelsHier = 0;
    int labels = 0;
    int images = 0;
    int codesOrigine = 0;
    int origines = 0;
    int huilePalme = 0;
    int marque = 0;
    int manufacturingPlaces = 0;
    int genericName = 0;
    int productName = 0;
    int productNamefr = 0;
    int imageFrontThumbUrl = 0;
    int imageSmallUrl = 0;
    int imageFrontSmallUrl = 0;
    int imageUrl = 0;
    int ingredientsThatMayBe = 0;
    int packagingTags = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        liste.add("3017620429484");
        liste.add("5449000000996");
        liste.add("3274080005003");
        liste.add("3017760826174");
        liste.add("3017624047813");
        liste.add("3017760314190");
        liste.add("7613034232465");
        liste.add("3268840001008");
        liste.add("5410041424805");
        liste.add("3033710065967");
        liste.add("8000500037560");
        liste.add("5449000050205");
        liste.add("3017760515290");
        liste.add("8002270014901");
        liste.add("3017620401473");
        liste.add("7622210449283");
        liste.add("3073780258098");
        liste.add("87157246");
        liste.add("3229820129488");
        liste.add("3057640229138");
        liste.add("3068320099651");
        liste.add("8712100325953");
        liste.add("3228886030011");
        liste.add("3045140105502");
        liste.add("3228850003607");
        liste.add("3175680011534");
        liste.add("59032823");
        liste.add("3017620402135");
        liste.add("7613034480996");
        liste.add("5410041040807");
        liste.add("7613032655495");
        liste.add("3228850004031");
        liste.add("3597620002066");
        liste.add("5410076602384");
        liste.add("3597620000017");
        liste.add("3175680011480");
        liste.add("8410000810004");
        liste.add("3048431004041");
        liste.add("3229820100234");
        liste.add("8001505005707");
        liste.add("8712100338694");
        liste.add("3103220009574");
        liste.add("3019080067015");
        liste.add("3428272950057");
        liste.add("3174780000431");
        liste.add("7613034688903");
        liste.add("7613034055958");
        liste.add("5010477301246");
        liste.add("3017760000109");
        liste.add("3033710065066");
        liste.add("3596710284542");
        liste.add("5410041005707");
        liste.add("3229820167398");
        liste.add("3392460480827");
        liste.add("3068320080000");
        liste.add("3017620421006");
        liste.add("3017760314091");
        liste.add("5000159461122");
        liste.add("7613034423054");
        liste.add("3017760010009");
        liste.add("5410041001204");
        liste.add("5449000137609");
        liste.add("8000500167113");
        liste.add("3266980033613");
        liste.add("3103220025208");
        liste.add("3228021920184");
        liste.add("7613032192570");
        liste.add("7300400117869");
        liste.add("8076808150072");
        liste.add("3252378001319");
        liste.add("5050083286131");
        liste.add("3041090063114");
        liste.add("5053827101493");
        liste.add("8715700407760");
        liste.add("3017620422003");
        liste.add("3124480208842");
        liste.add("3228850003584");
        liste.add("3033490595517");
        liste.add("3496080210137");
        liste.add("3229820147444");
        liste.add("3179732348913");
        liste.add("3033710073467");
        liste.add("80135463");
        liste.add("3270190200802");
        liste.add("3272770003148");
        liste.add("3387390124439");
        liste.add("3159470005071");
        liste.add("3038352875165");
        liste.add("3487400000392");
        liste.add("5449000131836");
        liste.add("3228850004024");
        liste.add("3229820160672");
        liste.add("5000112609653");
        liste.add("5000159452595");
        liste.add("3023470001015");
        liste.add("87157239");
        liste.add("3366321051624");
        liste.add("3387390320923");
        liste.add("3061990140654");
        liste.add("3250546100055");
        liste.add("8000070200289");
        liste.add("3242274000059");
        liste.add("3242272340850");
        liste.add("3242274002053");
        liste.add("3228022150023");
        liste.add("3228023150022");
        liste.add("3228022140086");
        liste.add("3119780259069");
        liste.add("3163937010003");
        liste.add("3119783007483");
        liste.add("3119780208920");
        liste.add("3107872000507");
        liste.add("7613035010550");
        liste.add("8714800029193");
        liste.add("3033490306014");
        liste.add("3033490853884");
        liste.add("3095752126013");
        liste.add("3302746151020");
        liste.add("3302740975103");
        liste.add("3038352880305");
        liste.add("3038350013002");
        liste.add("3038354220901");
        liste.add("3038350025005");
        liste.add("3083681003666");
        liste.add("3083680566094");
        liste.add("3083680025881");
        liste.add("3083680484466");
        liste.add("3240931538983");
        liste.add("3073190101250");
        liste.add("3240930213508");
        liste.add("3256540035447");
        liste.add("3256540035614");
        liste.add("3329770041592");
        liste.add("3023290630976");
        liste.add("8711200548002");
        liste.add("3045320001570");
        liste.add("3178530405781");
        liste.add("3178530402728");
        liste.add("3045320104127");
        liste.add("3045320104165");
        liste.add("3045320027280");
        liste.add("3045320517101");
        liste.add("3045320510164");
        liste.add("3011360012531");
        liste.add("3011360002280");
        liste.add("3011360034960");
        liste.add("3046920029759");
        liste.add("3046920028363");
        liste.add("3046920029674");
        liste.add("3046920012010");
        liste.add("3227061000023");
        liste.add("3181232220286");
        liste.add("3181232180559");

        TextView texti12 = findViewById(R.id.textView12);
        texti12.setText(Integer.toString(liste.size()));

        TextView texti1 = findViewById(R.id.textView);
        String a = Integer.toString(nomProduit);
        texti1.setText(a);

        TextView texti2 = findViewById(R.id.textView2);
        String b = Integer.toString(labelsHier);
        texti2.setText(b);

        TextView texti56 = findViewById(R.id.textViewLabel);
        String b = Integer.toString(labels);
        texti2.setText(b);

        TextView texti3 = findViewById(R.id.textView3);
        String c = Integer.toString(images);
        texti3.setText(c);

        TextView texti4 = findViewById(R.id.textView4);
        String d = Integer.toString(codesOrigine);
        texti4.setText(d);

        TextView texti5 = findViewById(R.id.textView5);
        String e = Integer.toString(origines);
        texti5.setText(e);

        TextView texti6 = findViewById(R.id.textView6);
        String f = Integer.toString(huilePalme);
        texti6.setText(f);

        TextView texti7 = findViewById(R.id.textView7);
        String g = Integer.toString(marque);
        texti7.setText(g);

        TextView texti8 = findViewById(R.id.textView8);
        String h = Integer.toString(manufacturingPlaces);
        texti8.setText(h);

        TextView texti21 = findViewById(R.id.textView21);
        String i = Integer.toString(genericName);
        texti21.setText(i);

        TextView texti23 = findViewById(R.id.textView23);
        String j = Integer.toString(productName);
        texti23.setText(j);

        TextView texti25 = findViewById(R.id.textView25);
        String k = Integer.toString(productNamefr);
        texti25.setText(k);

        TextView textviewImageFrontThumbUrl = findViewById(R.id.textViewImageFrontThumbUrl);
        String l = Integer.toString(imageFrontThumbUrl);
        textviewImageFrontThumbUrl.setText(l);

        TextView textviewImageSmallUrl = findViewById(R.id.textViewImageSmallUrl);
        String m = Integer.toString(imageSmallUrl);
        textviewImageSmallUrl.setText(m);

        TextView textviewImageFrontSmallUrl = findViewById(R.id.textViewImageFrontSmallUrl);
        String n = Integer.toString(imageFrontSmallUrl);
        textviewImageFrontSmallUrl.setText(n);

        TextView textviewImageUrl = findViewById(R.id.textViewImageUrl);
        String o = Integer.toString(imageUrl);
        textviewImageUrl.setText(o);

        TextView textviewIngredientsThatMayBe = findViewById(R.id.textViewIngredientsThatMayOil);
        String p = Integer.toString(ingredientsThatMayBe);
        textviewIngredientsThatMayBe.setText(p);

        TextView textviewPackagingTags = findViewById(R.id.textViewPackagingTags);
        String q = Integer.toString(packagingTags);
        textviewPackagingTags.setText(q);


        for (int indice = 0; indice < liste.size(); indice++) {
            String lien = "https://fr.openfoodfacts.org/api/v0/produit/" + liste.get(indice) + ".json";
            //Création et Appel de la tâche asynchrone faisant une requête URL
            AsyncRequete requete = new AsyncRequete(MainActivity.this, lien, texti1, texti2, texti3, texti4, texti5, texti6, texti7, texti8, texti21, texti23, texti25, textviewImageFrontThumbUrl, textviewImageSmallUrl, textviewImageFrontSmallUrl, textviewImageUrl, textviewIngredientsThatMayBe, textviewPackagingTags, texti56);
            requete.execute();

        }
    }
}
