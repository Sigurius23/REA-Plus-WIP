package xp0;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: xp0.o */
/* JADX INFO: loaded from: classes7.dex */
public class C38518o implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f165775a = new HashMap();

    private C38518o() {
    }

    public static C38518o fromBundle(Bundle bundle) {
        C38518o c38518o = new C38518o();
        if (!AbstractC17176i.m48518t(bundle, C38518o.class, "teamid")) {
            throw new IllegalArgumentException("Required argument \"teamid\" is missing and does not have an android:defaultValue");
        }
        c38518o.f165775a.put("teamid", Integer.valueOf(bundle.getInt("teamid")));
        return c38518o;
    }

    /* JADX INFO: renamed from: a */
    public int m123415a() {
        return ((Integer) this.f165775a.get("teamid")).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C38518o c38518o = (C38518o) obj;
        return this.f165775a.containsKey("teamid") == c38518o.f165775a.containsKey("teamid") && m123415a() == c38518o.m123415a();
    }

    public int hashCode() {
        return m123415a() + 31;
    }

    public String toString() {
        return "CommunityManageTeamFragmentArgs{teamid=" + m123415a() + "}";
    }
}
