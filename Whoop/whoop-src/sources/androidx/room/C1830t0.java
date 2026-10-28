package androidx.room;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import m83.AbstractC25247g0;
import mh.C25546n;
import p325mb.AbstractC25380b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1830t0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f7177a;

    public C1830t0(C25546n c25546n) {
        this.f7177a = AbstractC25247g0.m74003l0(c25546n.f100151w);
    }

    /* JADX INFO: renamed from: a */
    public void m5452a(AbstractC25380b migration) {
        AbstractC22676k.m65750j(migration, "migration");
        int i13 = migration.startVersion;
        int i14 = migration.endVersion;
        Integer numValueOf = Integer.valueOf(i13);
        LinkedHashMap linkedHashMap = this.f7177a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i14))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i14)) + " with " + migration);
        }
        treeMap2.put(Integer.valueOf(i14), migration);
    }

    public C1830t0() {
        this.f7177a = new LinkedHashMap();
    }
}
