package id0;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: id0.a */
/* JADX INFO: loaded from: classes7.dex */
public class C18407a implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f71596a = new HashMap();

    private C18407a() {
    }

    public static C18407a fromBundle(Bundle bundle) {
        C18407a c18407a = new C18407a();
        if (!AbstractC17176i.m48518t(bundle, C18407a.class, "consentAction")) {
            throw new IllegalArgumentException("Required argument \"consentAction\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("consentAction");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"consentAction\" is marked as non-null but was passed a null value.");
        }
        c18407a.f71596a.put("consentAction", string);
        if (!bundle.containsKey("testType")) {
            c18407a.f71596a.put("testType", null);
            return c18407a;
        }
        c18407a.f71596a.put("testType", bundle.getString("testType"));
        return c18407a;
    }

    /* JADX INFO: renamed from: a */
    public String m52951a() {
        return (String) this.f71596a.get("consentAction");
    }

    /* JADX INFO: renamed from: b */
    public String m52952b() {
        return (String) this.f71596a.get("testType");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18407a c18407a = (C18407a) obj;
        if (this.f71596a.containsKey("consentAction") != c18407a.f71596a.containsKey("consentAction")) {
            return false;
        }
        if (m52951a() == null ? c18407a.m52951a() != null : !m52951a().equals(c18407a.m52951a())) {
            return false;
        }
        if (this.f71596a.containsKey("testType") != c18407a.f71596a.containsKey("testType")) {
            return false;
        }
        return m52952b() == null ? c18407a.m52952b() == null : m52952b().equals(c18407a.m52952b());
    }

    public int hashCode() {
        return (((m52951a() != null ? m52951a().hashCode() : 0) + 31) * 31) + (m52952b() != null ? m52952b().hashCode() : 0);
    }

    public String toString() {
        return "MultiConsentFragmentArgs{consentAction=" + m52951a() + ", testType=" + m52952b() + "}";
    }
}
