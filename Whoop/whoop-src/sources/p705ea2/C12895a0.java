package p705ea2;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: ea2.a0 */
/* JADX INFO: loaded from: classes10.dex */
public class C12895a0 implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f44392a = new HashMap();

    private C12895a0() {
    }

    public static C12895a0 fromBundle(Bundle bundle) {
        C12895a0 c12895a0 = new C12895a0();
        if (!AbstractC17176i.m48518t(bundle, C12895a0.class, "shouldShowReferIntent")) {
            c12895a0.f44392a.put("shouldShowReferIntent", Boolean.FALSE);
            return c12895a0;
        }
        c12895a0.f44392a.put("shouldShowReferIntent", Boolean.valueOf(bundle.getBoolean("shouldShowReferIntent")));
        return c12895a0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m36300a() {
        return ((Boolean) this.f44392a.get("shouldShowReferIntent")).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12895a0 c12895a0 = (C12895a0) obj;
        return this.f44392a.containsKey("shouldShowReferIntent") == c12895a0.f44392a.containsKey("shouldShowReferIntent") && m36300a() == c12895a0.m36300a();
    }

    public int hashCode() {
        return (m36300a() ? 1 : 0) + 31;
    }

    public String toString() {
        return "SettingsLandingFragmentArgs{shouldShowReferIntent=" + m36300a() + "}";
    }
}
