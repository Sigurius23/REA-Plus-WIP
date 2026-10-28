package nv1;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: nv1.f */
/* JADX INFO: loaded from: classes9.dex */
public class C27172f implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f108730a = new HashMap();

    private C27172f() {
    }

    public static C27172f fromBundle(Bundle bundle) {
        C27172f c27172f = new C27172f();
        if (!AbstractC17176i.m48518t(bundle, C27172f.class, NotificationCompat.CATEGORY_EMAIL)) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(NotificationCompat.CATEGORY_EMAIL);
        if (string == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        c27172f.f108730a.put(NotificationCompat.CATEGORY_EMAIL, string);
        if (!bundle.containsKey("submissionLoadingDisplay")) {
            throw new IllegalArgumentException("Required argument \"submissionLoadingDisplay\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("submissionLoadingDisplay");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"submissionLoadingDisplay\" is marked as non-null but was passed a null value.");
        }
        c27172f.f108730a.put("submissionLoadingDisplay", string2);
        if (!bundle.containsKey("submissionSuccessDisplay")) {
            throw new IllegalArgumentException("Required argument \"submissionSuccessDisplay\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("submissionSuccessDisplay");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"submissionSuccessDisplay\" is marked as non-null but was passed a null value.");
        }
        c27172f.f108730a.put("submissionSuccessDisplay", string3);
        return c27172f;
    }

    /* JADX INFO: renamed from: a */
    public String m81721a() {
        return (String) this.f108730a.get(NotificationCompat.CATEGORY_EMAIL);
    }

    /* JADX INFO: renamed from: b */
    public String m81722b() {
        return (String) this.f108730a.get("submissionLoadingDisplay");
    }

    /* JADX INFO: renamed from: c */
    public String m81723c() {
        return (String) this.f108730a.get("submissionSuccessDisplay");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C27172f c27172f = (C27172f) obj;
        if (this.f108730a.containsKey(NotificationCompat.CATEGORY_EMAIL) != c27172f.f108730a.containsKey(NotificationCompat.CATEGORY_EMAIL)) {
            return false;
        }
        if (m81721a() == null ? c27172f.m81721a() != null : !m81721a().equals(c27172f.m81721a())) {
            return false;
        }
        if (this.f108730a.containsKey("submissionLoadingDisplay") != c27172f.f108730a.containsKey("submissionLoadingDisplay")) {
            return false;
        }
        if (m81722b() == null ? c27172f.m81722b() != null : !m81722b().equals(c27172f.m81722b())) {
            return false;
        }
        if (this.f108730a.containsKey("submissionSuccessDisplay") != c27172f.f108730a.containsKey("submissionSuccessDisplay")) {
            return false;
        }
        return m81723c() == null ? c27172f.m81723c() == null : m81723c().equals(c27172f.m81723c());
    }

    public int hashCode() {
        return (((((m81721a() != null ? m81721a().hashCode() : 0) + 31) * 31) + (m81722b() != null ? m81722b().hashCode() : 0)) * 31) + (m81723c() != null ? m81723c().hashCode() : 0);
    }

    public String toString() {
        return "SubmitMemberDataExportFragmentArgs{email=" + m81721a() + ", submissionLoadingDisplay=" + m81722b() + ", submissionSuccessDisplay=" + m81723c() + "}";
    }
}
