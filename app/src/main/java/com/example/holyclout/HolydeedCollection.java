package com.example.holyclout;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class HolydeedCollection {

    private static HolydeedCollection deedCollection;

    private Map<UUID, Holydeed> holyDeeds;

    private HolydeedCollection(Context context) {
        holyDeeds = new HashMap<UUID, Holydeed>();
        autofillCollection();
    }

    private void autofillCollection() {
        for(int i = 1; i<100; i++) {
            Holydeed deed = new Holydeed();
            deed.setTitle("HolyDeed #" + i);
            deed.setBlessed(i%2 == 0);
            holyDeeds.put(deed.getId(), deed);
        }
    }

    public static HolydeedCollection get(Context context) {
        if (deedCollection == null) {
            deedCollection = new HolydeedCollection(context);
        }
        return deedCollection;
    }

    public Map<UUID, Holydeed> getHolyDeeds() {
        return holyDeeds;
    }

    public Holydeed getHolyDeed(UUID id) {
        return holyDeeds.get(id);
    }

}
