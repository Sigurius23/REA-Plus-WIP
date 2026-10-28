package mf2;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: mf2.h */
/* JADX INFO: loaded from: classes10.dex */
public class C25517h implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f99922a = new HashMap();

    private C25517h() {
    }

    public static C25517h fromBundle(Bundle bundle) {
        C25517h c25517h = new C25517h();
        if (!AbstractC17176i.m48518t(bundle, C25517h.class, "fromOnboarding")) {
            c25517h.f99922a.put("fromOnboarding", Boolean.FALSE);
            return c25517h;
        }
        c25517h.f99922a.put("fromOnboarding", Boolean.valueOf(bundle.getBoolean("fromOnboarding")));
        return c25517h;
    }

    /* JADX INFO: renamed from: a */
    public boolean m75074a() {
        return ((Boolean) this.f99922a.get("fromOnboarding")).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C25517h c25517h = (C25517h) obj;
        return this.f99922a.containsKey("fromOnboarding") == c25517h.f99922a.containsKey("fromOnboarding") && m75074a() == c25517h.m75074a();
    }

    public int hashCode() {
        return (m75074a() ? 1 : 0) + 31;
    }

    public String toString() {
        return "SleepWakeTimeScheduleListFragmentArgs{fromOnboarding=" + m75074a() + "}";
    }
}
