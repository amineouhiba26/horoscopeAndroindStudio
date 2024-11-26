package com.example.horoscoppe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HoroscopeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_horoscoppe);

        TextView title = findViewById(R.id.textHoroscopeTitle);
        TextView content = findViewById(R.id.textHoroscopeContent);
        Button backButton = findViewById(R.id.buttonBack);

        Intent intent = getIntent();
        String birthdate = intent.getStringExtra("birthdate");


        assert birthdate != null;
        String horoscopeMessage = getHoroscope(birthdate);
            title.setText("Votre Horoscope");
            content.setText(horoscopeMessage);


        backButton.setOnClickListener(v -> finish());
    }

    private String getHoroscope(String birthdate) {
        int month = Integer.parseInt(birthdate.split("-")[1]);
        switch (month) {
            case 1: return "Capricorne : Nouveaux départs vous attendent.";
            case 2: return "Verseau : Faites confiance à votre créativité.";
            case 3: return "Poissons : Prenez soin de vous.";
            case 4: return "Bélier : Le succès est proche.";
            case 5: return "Taureau : Récompenses pour vos efforts.";
            case 6: return "Gémeaux : Le cœur est au centre de tout.";
            case 7: return "Cancer : Prenez des risques et partez à l'aventure.";
            case 8: return "Lion : Vous êtes charismatique.";
            case 9: return "Vierge : Réflexion et introspection.";
            case 10: return "Balance : Trouvez l'équilibre.";
            case 11: return "Scorpion : Soyez ouvert aux connexions profondes.";
            case 12: return "Sagittaire : Terminez l'année en beauté.";
            default: return "Les étoiles vous sourient.";
        }
    }
}
