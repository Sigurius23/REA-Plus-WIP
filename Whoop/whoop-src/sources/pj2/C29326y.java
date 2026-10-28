package pj2;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: pj2.y */
/* JADX INFO: loaded from: classes10.dex */
public class C29326y implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f118778a = new HashMap();

    private C29326y() {
    }

    public static C29326y fromBundle(Bundle bundle) {
        C29326y c29326y = new C29326y();
        if (!AbstractC17176i.m48518t(bundle, C29326y.class, "sessionType")) {
            throw new IllegalArgumentException("Required argument \"sessionType\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("sessionType");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"sessionType\" is marked as non-null but was passed a null value.");
        }
        c29326y.f118778a.put("sessionType", string);
        return c29326y;
    }

    /* JADX INFO: renamed from: a */
    public String m89244a() {
        return (String) this.f118778a.get("sessionType");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C29326y c29326y = (C29326y) obj;
        if (this.f118778a.containsKey("sessionType") != c29326y.f118778a.containsKey("sessionType")) {
            return false;
        }
        return m89244a() == null ? c29326y.m89244a() == null : m89244a().equals(c29326y.m89244a());
    }

    public int hashCode() {
        return 31 + (m89244a() != null ? m89244a().hashCode() : 0);
    }

    public String toString() {
        return "StressSessionFragmentArgs{sessionType=" + m89244a() + "}";
    }
}
