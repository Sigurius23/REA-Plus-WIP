package nv1;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: nv1.d */
/* JADX INFO: loaded from: classes9.dex */
public class C27170d implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f108729a = new HashMap();

    private C27170d() {
    }

    public static C27170d fromBundle(Bundle bundle) {
        C27170d c27170d = new C27170d();
        if (!AbstractC17176i.m48518t(bundle, C27170d.class, "title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        c27170d.f108729a.put("title", string);
        if (!bundle.containsKey("headline")) {
            throw new IllegalArgumentException("Required argument \"headline\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("headline");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"headline\" is marked as non-null but was passed a null value.");
        }
        c27170d.f108729a.put("headline", string2);
        if (!bundle.containsKey("body")) {
            throw new IllegalArgumentException("Required argument \"body\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("body");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"body\" is marked as non-null but was passed a null value.");
        }
        c27170d.f108729a.put("body", string3);
        if (!bundle.containsKey("helpText")) {
            throw new IllegalArgumentException("Required argument \"helpText\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("helpText");
        if (string4 == null) {
            throw new IllegalArgumentException("Argument \"helpText\" is marked as non-null but was passed a null value.");
        }
        c27170d.f108729a.put("helpText", string4);
        if (!bundle.containsKey("helpLink")) {
            throw new IllegalArgumentException("Required argument \"helpLink\" is missing and does not have an android:defaultValue");
        }
        String string5 = bundle.getString("helpLink");
        if (string5 == null) {
            throw new IllegalArgumentException("Argument \"helpLink\" is marked as non-null but was passed a null value.");
        }
        c27170d.f108729a.put("helpLink", string5);
        return c27170d;
    }

    /* JADX INFO: renamed from: a */
    public String m81713a() {
        return (String) this.f108729a.get("body");
    }

    /* JADX INFO: renamed from: b */
    public String m81714b() {
        return (String) this.f108729a.get("headline");
    }

    /* JADX INFO: renamed from: c */
    public String m81715c() {
        return (String) this.f108729a.get("helpLink");
    }

    /* JADX INFO: renamed from: d */
    public String m81716d() {
        return (String) this.f108729a.get("helpText");
    }

    /* JADX INFO: renamed from: e */
    public String m81717e() {
        return (String) this.f108729a.get("title");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C27170d c27170d = (C27170d) obj;
        if (this.f108729a.containsKey("title") != c27170d.f108729a.containsKey("title")) {
            return false;
        }
        if (m81717e() == null ? c27170d.m81717e() != null : !m81717e().equals(c27170d.m81717e())) {
            return false;
        }
        if (this.f108729a.containsKey("headline") != c27170d.f108729a.containsKey("headline")) {
            return false;
        }
        if (m81714b() == null ? c27170d.m81714b() != null : !m81714b().equals(c27170d.m81714b())) {
            return false;
        }
        if (this.f108729a.containsKey("body") != c27170d.f108729a.containsKey("body")) {
            return false;
        }
        if (m81713a() == null ? c27170d.m81713a() != null : !m81713a().equals(c27170d.m81713a())) {
            return false;
        }
        if (this.f108729a.containsKey("helpText") != c27170d.f108729a.containsKey("helpText")) {
            return false;
        }
        if (m81716d() == null ? c27170d.m81716d() != null : !m81716d().equals(c27170d.m81716d())) {
            return false;
        }
        if (this.f108729a.containsKey("helpLink") != c27170d.f108729a.containsKey("helpLink")) {
            return false;
        }
        return m81715c() == null ? c27170d.m81715c() == null : m81715c().equals(c27170d.m81715c());
    }

    public int hashCode() {
        return (((((((((m81717e() != null ? m81717e().hashCode() : 0) + 31) * 31) + (m81714b() != null ? m81714b().hashCode() : 0)) * 31) + (m81713a() != null ? m81713a().hashCode() : 0)) * 31) + (m81716d() != null ? m81716d().hashCode() : 0)) * 31) + (m81715c() != null ? m81715c().hashCode() : 0);
    }

    public String toString() {
        return "SubmissionCompleteFragmentArgs{title=" + m81717e() + ", headline=" + m81714b() + ", body=" + m81713a() + ", helpText=" + m81716d() + ", helpLink=" + m81715c() + "}";
    }
}
