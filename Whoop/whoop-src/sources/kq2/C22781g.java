package kq2;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: kq2.g */
/* JADX INFO: loaded from: classes10.dex */
public class C22781g implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f89704a = new HashMap();

    private C22781g() {
    }

    public static C22781g fromBundle(Bundle bundle) {
        C22781g c22781g = new C22781g();
        if (!AbstractC17176i.m48518t(bundle, C22781g.class, "year")) {
            c22781g.f89704a.put("year", -1);
            return c22781g;
        }
        c22781g.f89704a.put("year", Integer.valueOf(bundle.getInt("year")));
        return c22781g;
    }

    /* JADX INFO: renamed from: a */
    public int m65992a() {
        return ((Integer) this.f89704a.get("year")).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C22781g c22781g = (C22781g) obj;
        return this.f89704a.containsKey("year") == c22781g.f89704a.containsKey("year") && m65992a() == c22781g.m65992a();
    }

    public int hashCode() {
        return m65992a() + 31;
    }

    public String toString() {
        return "UserJourneyFragmentArgs{year=" + m65992a() + "}";
    }
}
