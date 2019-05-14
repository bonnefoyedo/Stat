package supelec.bonnefoy.statistics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class monAdapter extends BaseAdapter {

    private Context myContext = null;

    public monAdapter(Context context) {
        myContext = context;
    }

    ArrayList<monTexte> myList = new ArrayList<monTexte>();

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public monTexte getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return myList.indexOf(getItem(position));
    }

    public void add(monTexte monImage) {
        myList.add(monImage);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        monTexte monImage = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(myContext)
                    .inflate(R.layout.activity_mon_texte2, parent, false);
        }

        //Lien avec les éléments du gabarit auxquels on donnera les valeurs à afficher
        TextView myTextView = convertView.findViewById(R.id.textView);
        TextView myTextView2 = convertView.findViewById(R.id.textView2);


        String titre = monImage.nom;
        int numero = monImage.nombre;

        //Affichage du titre de l'image sur la vue
        myTextView.setText(titre);
        myTextView2.setText(Integer.toString(numero));

        return convertView;
    }
}

