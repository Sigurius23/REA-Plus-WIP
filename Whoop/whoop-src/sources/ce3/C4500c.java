package ce3;

import ne3.C26622k;
import ne3.C26624l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C4500c {

    /* JADX INFO: renamed from: d */
    public static final C26624l f18125d;

    /* JADX INFO: renamed from: e */
    public static final C26624l f18126e;

    /* JADX INFO: renamed from: f */
    public static final C26624l f18127f;

    /* JADX INFO: renamed from: g */
    public static final C26624l f18128g;

    /* JADX INFO: renamed from: h */
    public static final C26624l f18129h;

    /* JADX INFO: renamed from: i */
    public static final C26624l f18130i;

    /* JADX INFO: renamed from: a */
    public final C26624l f18131a;

    /* JADX INFO: renamed from: b */
    public final C26624l f18132b;

    /* JADX INFO: renamed from: c */
    public final int f18133c;

    static {
        C26622k c26622k = C26624l.f105882z;
        f18125d = C26622k.m79241b(":");
        f18126e = C26622k.m79241b(":status");
        f18127f = C26622k.m79241b(":method");
        f18128g = C26622k.m79241b(":path");
        f18129h = C26622k.m79241b(":scheme");
        f18130i = C26622k.m79241b(":authority");
    }

    public C4500c(C26624l name, C26624l value) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        this.f18131a = name;
        this.f18132b = value;
        this.f18133c = value.mo79253d() + name.mo79253d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4500c)) {
            return false;
        }
        C4500c c4500c = (C4500c) obj;
        return AbstractC22676k.m65745e(this.f18131a, c4500c.f18131a) && AbstractC22676k.m65745e(this.f18132b, c4500c.f18132b);
    }

    public final int hashCode() {
        return this.f18132b.hashCode() + (this.f18131a.hashCode() * 31);
    }

    public final String toString() {
        return this.f18131a.m79265s() + ": " + this.f18132b.m79265s();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4500c(String str, String str2) {
        this(C26622k.m79241b(str), C26622k.m79241b(str2));
        C26622k c26622k = C26624l.f105882z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4500c(String value, C26624l name) {
        this(name, C26622k.m79241b(value));
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        C26622k c26622k = C26624l.f105882z;
    }
}
