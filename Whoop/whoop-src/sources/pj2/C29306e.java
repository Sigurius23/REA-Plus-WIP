package pj2;

import android.os.Bundle;
import com.mapbox.common.HttpHeaders;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: pj2.e */
/* JADX INFO: loaded from: classes10.dex */
public class C29306e implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f118653a;

    /* JADX INFO: renamed from: pj2.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final HashMap f118654a = new HashMap();

        /* JADX INFO: renamed from: a */
        public C29306e m88964a() {
            return new C29306e(this.f118654a, 0);
        }

        /* JADX INFO: renamed from: b */
        public a m88965b(String str) {
            this.f118654a.put("sourceId", str);
            return this;
        }
    }

    public /* synthetic */ C29306e(HashMap map, int i13) {
        this(map);
    }

    public static C29306e fromBundle(Bundle bundle) {
        C29306e c29306e = new C29306e();
        if (AbstractC17176i.m48518t(bundle, C29306e.class, "source")) {
            String string = bundle.getString("source");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
            }
            c29306e.f118653a.put("source", string);
        } else {
            c29306e.f118653a.put("source", "Unknown");
        }
        if (bundle.containsKey(HttpHeaders.DATE)) {
            c29306e.f118653a.put(HttpHeaders.DATE, bundle.getString(HttpHeaders.DATE));
        } else {
            c29306e.f118653a.put(HttpHeaders.DATE, null);
        }
        if (!bundle.containsKey("sourceId")) {
            c29306e.f118653a.put("sourceId", null);
            return c29306e;
        }
        c29306e.f118653a.put("sourceId", bundle.getString("sourceId"));
        return c29306e;
    }

    /* JADX INFO: renamed from: a */
    public String m88960a() {
        return (String) this.f118653a.get(HttpHeaders.DATE);
    }

    /* JADX INFO: renamed from: b */
    public String m88961b() {
        return (String) this.f118653a.get("source");
    }

    /* JADX INFO: renamed from: c */
    public String m88962c() {
        return (String) this.f118653a.get("sourceId");
    }

    /* JADX INFO: renamed from: d */
    public Bundle m88963d() {
        Bundle bundle = new Bundle();
        if (this.f118653a.containsKey("source")) {
            bundle.putString("source", (String) this.f118653a.get("source"));
        } else {
            bundle.putString("source", "Unknown");
        }
        if (this.f118653a.containsKey(HttpHeaders.DATE)) {
            bundle.putString(HttpHeaders.DATE, (String) this.f118653a.get(HttpHeaders.DATE));
        } else {
            bundle.putString(HttpHeaders.DATE, null);
        }
        if (this.f118653a.containsKey("sourceId")) {
            bundle.putString("sourceId", (String) this.f118653a.get("sourceId"));
            return bundle;
        }
        bundle.putString("sourceId", null);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C29306e c29306e = (C29306e) obj;
        if (this.f118653a.containsKey("source") != c29306e.f118653a.containsKey("source")) {
            return false;
        }
        if (m88961b() == null ? c29306e.m88961b() != null : !m88961b().equals(c29306e.m88961b())) {
            return false;
        }
        if (this.f118653a.containsKey(HttpHeaders.DATE) != c29306e.f118653a.containsKey(HttpHeaders.DATE)) {
            return false;
        }
        if (m88960a() == null ? c29306e.m88960a() != null : !m88960a().equals(c29306e.m88960a())) {
            return false;
        }
        if (this.f118653a.containsKey("sourceId") != c29306e.f118653a.containsKey("sourceId")) {
            return false;
        }
        return m88962c() == null ? c29306e.m88962c() == null : m88962c().equals(c29306e.m88962c());
    }

    public int hashCode() {
        return (((((m88961b() != null ? m88961b().hashCode() : 0) + 31) * 31) + (m88960a() != null ? m88960a().hashCode() : 0)) * 31) + (m88962c() != null ? m88962c().hashCode() : 0);
    }

    public String toString() {
        return "StressMonitorFragmentArgs{source=" + m88961b() + ", date=" + m88960a() + ", sourceId=" + m88962c() + "}";
    }

    private C29306e() {
        this.f118653a = new HashMap();
    }

    private C29306e(HashMap map) {
        HashMap map2 = new HashMap();
        this.f118653a = map2;
        map2.putAll(map);
    }
}
