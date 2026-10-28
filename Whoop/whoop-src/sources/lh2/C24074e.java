package lh2;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: lh2.e */
/* JADX INFO: loaded from: classes10.dex */
public class C24074e implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f95117a = new HashMap();

    private C24074e() {
    }

    public static C24074e fromBundle(Bundle bundle) {
        C24074e c24074e = new C24074e();
        if (!AbstractC17176i.m48518t(bundle, C24074e.class, "onboardingStoryType")) {
            throw new IllegalArgumentException("Required argument \"onboardingStoryType\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("onboardingStoryType");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"onboardingStoryType\" is marked as non-null but was passed a null value.");
        }
        c24074e.f95117a.put("onboardingStoryType", string);
        if (bundle.containsKey("entryPoint")) {
            String string2 = bundle.getString("entryPoint");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
            }
            c24074e.f95117a.put("entryPoint", string2);
        } else {
            c24074e.f95117a.put("entryPoint", "");
        }
        if (!bundle.containsKey("cycleId")) {
            c24074e.f95117a.put("cycleId", 0L);
            return c24074e;
        }
        c24074e.f95117a.put("cycleId", Long.valueOf(bundle.getLong("cycleId")));
        return c24074e;
    }

    /* JADX INFO: renamed from: a */
    public long m70993a() {
        return ((Long) this.f95117a.get("cycleId")).longValue();
    }

    /* JADX INFO: renamed from: b */
    public String m70994b() {
        return (String) this.f95117a.get("entryPoint");
    }

    /* JADX INFO: renamed from: c */
    public String m70995c() {
        return (String) this.f95117a.get("onboardingStoryType");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C24074e c24074e = (C24074e) obj;
        if (this.f95117a.containsKey("onboardingStoryType") != c24074e.f95117a.containsKey("onboardingStoryType")) {
            return false;
        }
        if (m70995c() == null ? c24074e.m70995c() != null : !m70995c().equals(c24074e.m70995c())) {
            return false;
        }
        if (this.f95117a.containsKey("entryPoint") != c24074e.f95117a.containsKey("entryPoint")) {
            return false;
        }
        if (m70994b() == null ? c24074e.m70994b() == null : m70994b().equals(c24074e.m70994b())) {
            return this.f95117a.containsKey("cycleId") == c24074e.f95117a.containsKey("cycleId") && m70993a() == c24074e.m70993a();
        }
        return false;
    }

    public int hashCode() {
        return (((((m70995c() != null ? m70995c().hashCode() : 0) + 31) * 31) + (m70994b() != null ? m70994b().hashCode() : 0)) * 31) + ((int) (m70993a() ^ (m70993a() >>> 32)));
    }

    public String toString() {
        return "OnboardingStoryFragmentArgs{onboardingStoryType=" + m70995c() + ", entryPoint=" + m70994b() + ", cycleId=" + m70993a() + "}";
    }
}
