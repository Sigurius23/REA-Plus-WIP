package sm2;

import android.os.Bundle;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: sm2.d */
/* JADX INFO: loaded from: classes10.dex */
public class C32719d implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f136020a = new HashMap();

    private C32719d() {
    }

    public static C32719d fromBundle(Bundle bundle) {
        C32719d c32719d = new C32719d();
        if (AbstractC17176i.m48518t(bundle, C32719d.class, "pathUrl")) {
            c32719d.f136020a.put("pathUrl", bundle.getString("pathUrl"));
        } else {
            c32719d.f136020a.put("pathUrl", null);
        }
        if (bundle.containsKey(QueryParams.URL)) {
            c32719d.f136020a.put(QueryParams.URL, bundle.getString(QueryParams.URL));
        } else {
            c32719d.f136020a.put(QueryParams.URL, null);
        }
        if (bundle.containsKey("dismissContentTitle")) {
            c32719d.f136020a.put("dismissContentTitle", bundle.getString("dismissContentTitle"));
        } else {
            c32719d.f136020a.put("dismissContentTitle", null);
        }
        if (bundle.containsKey("dismissContentMessage")) {
            c32719d.f136020a.put("dismissContentMessage", bundle.getString("dismissContentMessage"));
        } else {
            c32719d.f136020a.put("dismissContentMessage", null);
        }
        if (bundle.containsKey("dismissContentCancelTitle")) {
            c32719d.f136020a.put("dismissContentCancelTitle", bundle.getString("dismissContentCancelTitle"));
        } else {
            c32719d.f136020a.put("dismissContentCancelTitle", null);
        }
        if (bundle.containsKey("dismissContentConfirmTitle")) {
            c32719d.f136020a.put("dismissContentConfirmTitle", bundle.getString("dismissContentConfirmTitle"));
        } else {
            c32719d.f136020a.put("dismissContentConfirmTitle", null);
        }
        if (!bundle.containsKey("dismissDestination")) {
            c32719d.f136020a.put("dismissDestination", null);
            return c32719d;
        }
        c32719d.f136020a.put("dismissDestination", bundle.getString("dismissDestination"));
        return c32719d;
    }

    /* JADX INFO: renamed from: a */
    public String m102676a() {
        return (String) this.f136020a.get("dismissContentCancelTitle");
    }

    /* JADX INFO: renamed from: b */
    public String m102677b() {
        return (String) this.f136020a.get("dismissContentConfirmTitle");
    }

    /* JADX INFO: renamed from: c */
    public String m102678c() {
        return (String) this.f136020a.get("dismissContentMessage");
    }

    /* JADX INFO: renamed from: d */
    public String m102679d() {
        return (String) this.f136020a.get("dismissContentTitle");
    }

    /* JADX INFO: renamed from: e */
    public String m102680e() {
        return (String) this.f136020a.get("dismissDestination");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C32719d c32719d = (C32719d) obj;
        if (this.f136020a.containsKey("pathUrl") != c32719d.f136020a.containsKey("pathUrl")) {
            return false;
        }
        if (m102681f() == null ? c32719d.m102681f() != null : !m102681f().equals(c32719d.m102681f())) {
            return false;
        }
        if (this.f136020a.containsKey(QueryParams.URL) != c32719d.f136020a.containsKey(QueryParams.URL)) {
            return false;
        }
        if (m102682g() == null ? c32719d.m102682g() != null : !m102682g().equals(c32719d.m102682g())) {
            return false;
        }
        if (this.f136020a.containsKey("dismissContentTitle") != c32719d.f136020a.containsKey("dismissContentTitle")) {
            return false;
        }
        if (m102679d() == null ? c32719d.m102679d() != null : !m102679d().equals(c32719d.m102679d())) {
            return false;
        }
        if (this.f136020a.containsKey("dismissContentMessage") != c32719d.f136020a.containsKey("dismissContentMessage")) {
            return false;
        }
        if (m102678c() == null ? c32719d.m102678c() != null : !m102678c().equals(c32719d.m102678c())) {
            return false;
        }
        if (this.f136020a.containsKey("dismissContentCancelTitle") != c32719d.f136020a.containsKey("dismissContentCancelTitle")) {
            return false;
        }
        if (m102676a() == null ? c32719d.m102676a() != null : !m102676a().equals(c32719d.m102676a())) {
            return false;
        }
        if (this.f136020a.containsKey("dismissContentConfirmTitle") != c32719d.f136020a.containsKey("dismissContentConfirmTitle")) {
            return false;
        }
        if (m102677b() == null ? c32719d.m102677b() != null : !m102677b().equals(c32719d.m102677b())) {
            return false;
        }
        if (this.f136020a.containsKey("dismissDestination") != c32719d.f136020a.containsKey("dismissDestination")) {
            return false;
        }
        return m102680e() == null ? c32719d.m102680e() == null : m102680e().equals(c32719d.m102680e());
    }

    /* JADX INFO: renamed from: f */
    public String m102681f() {
        return (String) this.f136020a.get("pathUrl");
    }

    /* JADX INFO: renamed from: g */
    public String m102682g() {
        return (String) this.f136020a.get(QueryParams.URL);
    }

    public int hashCode() {
        return (((((((((((((m102681f() != null ? m102681f().hashCode() : 0) + 31) * 31) + (m102682g() != null ? m102682g().hashCode() : 0)) * 31) + (m102679d() != null ? m102679d().hashCode() : 0)) * 31) + (m102678c() != null ? m102678c().hashCode() : 0)) * 31) + (m102676a() != null ? m102676a().hashCode() : 0)) * 31) + (m102677b() != null ? m102677b().hashCode() : 0)) * 31) + (m102680e() != null ? m102680e().hashCode() : 0);
    }

    public String toString() {
        return "HomeAuthWebViewFragmentArgs{pathUrl=" + m102681f() + ", url=" + m102682g() + ", dismissContentTitle=" + m102679d() + ", dismissContentMessage=" + m102678c() + ", dismissContentCancelTitle=" + m102676a() + ", dismissContentConfirmTitle=" + m102677b() + ", dismissDestination=" + m102680e() + "}";
    }
}
