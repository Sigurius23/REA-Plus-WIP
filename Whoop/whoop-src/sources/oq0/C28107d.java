package oq0;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: oq0.d */
/* JADX INFO: loaded from: classes7.dex */
public class C28107d implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f113667a = new HashMap();

    private C28107d() {
    }

    public static C28107d fromBundle(Bundle bundle) {
        C28107d c28107d = new C28107d();
        if (AbstractC17176i.m48518t(bundle, C28107d.class, "inviteCode")) {
            c28107d.f113667a.put("inviteCode", bundle.getString("inviteCode"));
        } else {
            c28107d.f113667a.put("inviteCode", "");
        }
        if (!bundle.containsKey("joinTeam")) {
            c28107d.f113667a.put("joinTeam", Boolean.TRUE);
            return c28107d;
        }
        c28107d.f113667a.put("joinTeam", Boolean.valueOf(bundle.getBoolean("joinTeam")));
        return c28107d;
    }

    /* JADX INFO: renamed from: a */
    public String m84939a() {
        return (String) this.f113667a.get("inviteCode");
    }

    /* JADX INFO: renamed from: b */
    public boolean m84940b() {
        return ((Boolean) this.f113667a.get("joinTeam")).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28107d c28107d = (C28107d) obj;
        if (this.f113667a.containsKey("inviteCode") != c28107d.f113667a.containsKey("inviteCode")) {
            return false;
        }
        if (m84939a() == null ? c28107d.m84939a() == null : m84939a().equals(c28107d.m84939a())) {
            return this.f113667a.containsKey("joinTeam") == c28107d.f113667a.containsKey("joinTeam") && m84940b() == c28107d.m84940b();
        }
        return false;
    }

    public int hashCode() {
        return (m84940b() ? 1 : 0) + (((m84939a() != null ? m84939a().hashCode() : 0) + 31) * 31);
    }

    public String toString() {
        return "InviteCodeActivityArgs{inviteCode=" + m84939a() + ", joinTeam=" + m84940b() + "}";
    }
}
