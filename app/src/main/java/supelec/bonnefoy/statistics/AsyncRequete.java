package supelec.bonnefoy.statistics;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class AsyncRequete extends AsyncTask<String, Integer, JSONObject> {

    private AppCompatActivity myActivity;
    String monLien = null;
    TextView myTextView = null;
    TextView myTextView2 = null;
    TextView myTextView3 = null;
    TextView myTextView4 = null;
    TextView myTextView5 = null;
    TextView myTextView6 = null;
    TextView myTextView7 = null;
    TextView myTextView8 = null;
    TextView myTextView21 = null;
    TextView myTextView23 = null;
    TextView myTextView25 = null;
    TextView myTextViewImageFrontThumbUrl = null;
    TextView myTextViewImageSmallUrl = null;
    TextView myTextViewImageFrontSmallUrl = null;
    TextView myTextViewImageUrl = null;
    TextView myTextViewIngredientsThatMayBe = null;
    TextView myTextViewPackagingTags = null;
    TextView myTextViewLabels = null;

    public AsyncRequete(AppCompatActivity mainActivity, String lien, TextView texti1, TextView texti2, TextView texti3, TextView texti4, TextView texti5, TextView texti6, TextView texti7, TextView texti8, TextView texti21, TextView texti23, TextView texti25, TextView imageFrontThumbUrl, TextView imageSmallUrl, TextView imageFrontSmallUrl, TextView imageUrl, TextView ingredientsThatMayBe, TextView packagingTags, TextView label) {
        myActivity = mainActivity;
        monLien = lien;
        myTextView = texti1;
        myTextView2 = texti2;
        myTextView3 = texti3;
        myTextView4 = texti4;
        myTextView5 = texti5;
        myTextView6 = texti6;
        myTextView7 = texti7;
        myTextView8 = texti8;
        myTextView21 = texti21;
        myTextView23 = texti23;
        myTextView25 = texti25;
        myTextViewImageFrontThumbUrl = imageFrontThumbUrl;
        myTextViewImageSmallUrl = imageSmallUrl;
        myTextViewImageFrontSmallUrl = imageFrontSmallUrl;
        myTextViewImageUrl = imageUrl;
        myTextViewIngredientsThatMayBe = ingredientsThatMayBe;
        myTextViewPackagingTags = packagingTags;
        myTextViewLabels = label;
    }

    //Méthode pour la lecture du fichier reçu et le traduire en une chaîne de caractère qui sera manipulable
    private String readStream(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader r = new BufferedReader(new InputStreamReader(is),1000);
        for (String line = r.readLine(); line != null; line =r.readLine()){
            sb.append(line);
        }
        is.close();
        return sb.toString();
    }

    protected void onPreExecute() {
    }

    //Récupération du fichier JSON auprès de l'URL en tâche de fond
    protected JSONObject doInBackground(String... params){

        String fichier = null;
        URL url = null;
        HttpURLConnection urlConnection = null;
        try{
            //Création du lien URL
            url =  new URL(monLien);
            //Ouverture de la connection
            urlConnection = (HttpURLConnection) url.openConnection();
            //Récupération du fichier
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            //Lecture du fichier sous forme d'une chaîne de caractère lisible
            fichier = readStream(in);
            //fermeture du flux
            in.close();
        }catch (MalformedURLException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        finally {
            if (urlConnection != null)
                urlConnection.disconnect();
        }

        JSONObject json = null;
        try {
            //Transformation du fichier String en fichier JSON
            json = new JSONObject(fichier);
        } catch (JSONException e) { e.printStackTrace(); }
        return json;
    }

    protected void onPostExecute(JSONObject s) {
        try {

            JSONObject dico1 = s.getJSONObject("product");

            String title = dico1.getString("generic_name");
            String genericNamefr = dico1.getString("generic_name_fr");
            String productName = dico1.getString("product_name");
            String productNamefr = dico1.getString("product_name_fr");

            String marque = dico1.getString("brands");

            JSONArray labelsHier = dico1.getJSONArray("labels_hierarchy");
            String labels = dico1.getString("labels");

            String imageThumbUrl = dico1.getString("image_thumb_url");
            String imageFrontThumbUrl = dico1.getString("image_front_thumb_url");
            String imageSmallUrl = dico1.getString("image_small_url");
            String imageFrontSmallUrl = dico1.getString("image_front_small_url");
            String imageUrl = dico1.getString("image_url");

            String codesOrigines = dico1.getString("emb_codes_orig");

            String origins = dico1.getString("origins");

            String oilPalm = dico1.getString("ingredients_from_palm_oil_n");
            String ingredientsThatMayBe = dico1.getString("ingredients_that_may_be_from_palm_oil_n");

            String manufacturingPlaces = dico1.getString("manufacturing_places");

            String packagingTags = dico1.getString("packaging_tags");


            if (title.length() > 2){
                int a = Integer.parseInt(myTextView.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView.setText(b); }
            if (genericNamefr.length() > 2){
                int a = Integer.parseInt(myTextView21.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView21.setText(b); }
            if (productName.length() > 1){
                int a = Integer.parseInt(myTextView23.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView23.setText(b); }
            if (productNamefr.length() > 2){
                int a = Integer.parseInt(myTextView25.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView25.setText(b); }




            if (marque.length() > 2){
                int a = Integer.parseInt(myTextView7.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView7.setText(b); }



            if (labelsHier.length() > 2){
                int a = Integer.parseInt(myTextView2.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView2.setText(b); }

            if (labels.length() > 2){
                int a = Integer.parseInt(myTextViewLabels.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView2.setText(b); }




            if (imageThumbUrl.length() > 2){
                int a = Integer.parseInt(myTextView3.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView3.setText(b); }
            if (imageFrontThumbUrl.length() > 2){
                int a = Integer.parseInt(myTextViewImageFrontThumbUrl.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextViewImageFrontThumbUrl.setText(b); }
            if (imageSmallUrl.length() > 2){
                int a = Integer.parseInt(myTextViewImageSmallUrl.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextViewImageSmallUrl.setText(b); }
            if (imageFrontSmallUrl.length() > 2){
                int a = Integer.parseInt(myTextViewImageFrontSmallUrl.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextViewImageFrontSmallUrl.setText(b); }
            if (imageUrl.length() > 2){
                int a = Integer.parseInt(myTextViewImageUrl.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextViewImageUrl.setText(b); }






            if (codesOrigines.length() > 2){
                int a = Integer.parseInt(myTextView4.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView4.setText(b);
            }
            if (origins.length() > 2){
                int a = Integer.parseInt(myTextView5.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView5.setText(b);
            }

            if (oilPalm != "0"){
                int a = Integer.parseInt(myTextView6.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView6.setText(b); }
            if (ingredientsThatMayBe != "0"){
                int a = Integer.parseInt(myTextViewIngredientsThatMayBe.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextViewIngredientsThatMayBe.setText(b); }



            if (manufacturingPlaces.length() > 1){
                int a = Integer.parseInt(myTextView8.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextView8.setText(b); }



            if (packagingTags.length() > 1){
                Log.i("tag", "intent22 : " + packagingTags);
                int a = Integer.parseInt(myTextViewPackagingTags.getText().toString());
                a += 1;
                String b = Integer.toString(a);
                myTextViewPackagingTags.setText(b); }



        }catch (JSONException e){ }
    }
}

