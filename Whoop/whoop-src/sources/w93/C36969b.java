package w93;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import pa3.C29039b;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: w93.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C36969b {

    /* JADX INFO: renamed from: a */
    public final Class f158227a;

    /* JADX INFO: renamed from: b */
    public final C29039b f158228b;

    public C36969b(Class cls, C29039b c29039b) {
        this.f158227a = cls;
        this.f158228b = c29039b;
    }

    /* JADX INFO: renamed from: a */
    public final String m118691a() {
        return AbstractC39421y.m125927L(this.f158227a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36969b) {
            return AbstractC22676k.m65745e(this.f158227a, ((C36969b) obj).f158227a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f158227a.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        AbstractC11266d.m30443A(C36969b.class, sb4, ": ");
        sb4.append(this.f158227a);
        return sb4.toString();
    }
}
