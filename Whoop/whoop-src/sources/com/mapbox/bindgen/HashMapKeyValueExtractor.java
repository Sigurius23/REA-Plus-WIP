package com.mapbox.bindgen;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class HashMapKeyValueExtractor {
    private final Object[] keys;
    private final Object[] values;

    public HashMapKeyValueExtractor(HashMap<Object, Object> map) {
        Set<Object> setKeySet = map.keySet();
        int size = setKeySet.size();
        this.keys = new Object[size];
        this.values = new Object[size];
        int i13 = 0;
        for (Object obj : setKeySet) {
            this.keys[i13] = obj;
            this.values[i13] = map.get(obj);
            i13++;
        }
    }

    public Object[] getKeys() {
        return this.keys;
    }

    public Object[] getValues() {
        return this.values;
    }
}
