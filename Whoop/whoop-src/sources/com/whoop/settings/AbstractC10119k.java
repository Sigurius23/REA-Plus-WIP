package com.whoop.settings;

import android.os.Bundle;
import hi0.AbstractC17307e;
import java.util.HashMap;
import p114eb.C12938a;
import p114eb.InterfaceC12981p0;

/* JADX INFO: renamed from: com.whoop.settings.k */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC10119k {

    /* JADX INFO: renamed from: com.whoop.settings.k$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f30471a;

        public /* synthetic */ a(String str, int i13) {
            this(str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66607L;
        }

        /* JADX INFO: renamed from: b */
        public boolean m25506b() {
            return ((Boolean) this.f30471a.get("openFamilyPlan")).booleanValue();
        }

        /* JADX INFO: renamed from: c */
        public String m25507c() {
            return (String) this.f30471a.get("source");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f30471a.containsKey("openFamilyPlan") != aVar.f30471a.containsKey("openFamilyPlan") || m25506b() != aVar.m25506b() || this.f30471a.containsKey("source") != aVar.f30471a.containsKey("source")) {
                return false;
            }
            if (m25507c() == null ? aVar.m25507c() == null : m25507c().equals(aVar.m25507c())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f30471a.containsKey("openFamilyPlan")) {
                bundle.putBoolean("openFamilyPlan", ((Boolean) this.f30471a.get("openFamilyPlan")).booleanValue());
            } else {
                bundle.putBoolean("openFamilyPlan", false);
            }
            if (this.f30471a.containsKey("source")) {
                bundle.putString("source", (String) this.f30471a.get("source"));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((m25506b() ? 1 : 0) + 31) * 31) + (m25507c() != null ? m25507c().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionSettingsLandingFragmentToMyAccountFragment(actionId=" + mo19186a() + "){openFamilyPlan=" + m25506b() + ", source=" + m25507c() + "}";
        }

        private a(String str) {
            HashMap map = new HashMap();
            this.f30471a = map;
            map.put("source", str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC12981p0 m25496a() {
        return new C12938a(AbstractC17307e.f66589I);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC12981p0 m25497b() {
        return new C12938a(AbstractC17307e.f66595J);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC12981p0 m25498c() {
        return new C12938a(AbstractC17307e.f66601K);
    }

    /* JADX INFO: renamed from: d */
    public static a m25499d(String str) {
        return new a(str, 0);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC12981p0 m25500e() {
        return new C12938a(AbstractC17307e.f66613M);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC12981p0 m25501f() {
        return new C12938a(AbstractC17307e.f66619N);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC12981p0 m25502g() {
        return new C12938a(AbstractC17307e.f66625O);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC12981p0 m25503h() {
        return new C12938a(AbstractC17307e.f66637Q);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC12981p0 m25504i() {
        return new C12938a(AbstractC17307e.f66649S);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC12981p0 m25505j() {
        return new C12938a(AbstractC17307e.f66655T);
    }
}
