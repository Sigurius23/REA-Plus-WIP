package com.whoop.settings;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.design.showcase.navigation.DesignShowcaseMenuType;
import hi0.AbstractC17307e;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.C12938a;
import p114eb.InterfaceC12981p0;

/* JADX INFO: renamed from: com.whoop.settings.c */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC10094c {

    /* JADX INFO: renamed from: com.whoop.settings.c$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f30353a;

        public /* synthetic */ a(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66753i;
        }

        /* JADX INFO: renamed from: b */
        public DesignShowcaseMenuType m25356b() {
            return (DesignShowcaseMenuType) this.f30353a.get("menuType");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f30353a.containsKey("menuType") != aVar.f30353a.containsKey("menuType")) {
                return false;
            }
            if (m25356b() == null ? aVar.m25356b() == null : m25356b().equals(aVar.m25356b())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (!this.f30353a.containsKey("menuType")) {
                bundle.putSerializable("menuType", DesignShowcaseMenuType.ROOT);
                return bundle;
            }
            DesignShowcaseMenuType designShowcaseMenuType = (DesignShowcaseMenuType) this.f30353a.get("menuType");
            if (Parcelable.class.isAssignableFrom(DesignShowcaseMenuType.class) || designShowcaseMenuType == null) {
                bundle.putParcelable("menuType", (Parcelable) Parcelable.class.cast(designShowcaseMenuType));
                return bundle;
            }
            if (!Serializable.class.isAssignableFrom(DesignShowcaseMenuType.class)) {
                throw new UnsupportedOperationException(DesignShowcaseMenuType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("menuType", (Serializable) Serializable.class.cast(designShowcaseMenuType));
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m25356b() != null ? m25356b().hashCode() : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionDebugToDesignShowcase(actionId=" + mo19186a() + "){menuType=" + m25356b() + "}";
        }

        private a() {
            this.f30353a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC12981p0 m25342a() {
        return new C12938a(AbstractC17307e.f66725e);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC12981p0 m25343b() {
        return new C12938a(AbstractC17307e.f66732f);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC12981p0 m25344c() {
        return new C12938a(AbstractC17307e.f66739g);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC12981p0 m25345d() {
        return new C12938a(AbstractC17307e.f66746h);
    }

    /* JADX INFO: renamed from: e */
    public static a m25346e() {
        return new a(0);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC12981p0 m25347f() {
        return new C12938a(AbstractC17307e.f66767k);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC12981p0 m25348g() {
        return new C12938a(AbstractC17307e.f66760j);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC12981p0 m25349h() {
        return new C12938a(AbstractC17307e.f66774l);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC12981p0 m25350i() {
        return new C12938a(AbstractC17307e.f66781m);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC12981p0 m25351j() {
        return new C12938a(AbstractC17307e.f66788n);
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC12981p0 m25352k() {
        return new C12938a(AbstractC17307e.f66795o);
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC12981p0 m25353l() {
        return new C12938a(AbstractC17307e.f66802p);
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC12981p0 m25354m() {
        return new C12938a(AbstractC17307e.f66809q);
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC12981p0 m25355n() {
        return new C12938a(AbstractC17307e.f66816r);
    }
}
