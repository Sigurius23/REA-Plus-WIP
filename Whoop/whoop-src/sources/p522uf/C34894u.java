package p522uf;

import d13.AbstractC11478a;
import p091dg.C12002a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uf.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C34894u {

    /* JADX INFO: renamed from: a */
    public final C12002a f146958a;

    /* JADX INFO: renamed from: b */
    public final Object f146959b;

    public C34894u(C12002a context, Object obj) {
        AbstractC22676k.m65750j(context, "context");
        this.f146958a = context;
        this.f146959b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C34894u m110032a(C34894u c34894u, Object obj) {
        C12002a context = c34894u.f146958a;
        c34894u.getClass();
        AbstractC22676k.m65750j(context, "context");
        return new C34894u(context, obj);
    }

    /* JADX INFO: renamed from: b */
    public final C12002a m110033b() {
        return this.f146958a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m110034c() {
        return this.f146959b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34894u)) {
            return false;
        }
        C34894u c34894u = (C34894u) obj;
        return AbstractC22676k.m65745e(this.f146958a, c34894u.f146958a) && AbstractC22676k.m65745e(this.f146959b, c34894u.f146959b);
    }

    public final int hashCode() {
        int iHashCode = this.f146958a.hashCode() * 31;
        Object obj = this.f146959b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("OperationRequest(context=");
        sb4.append(this.f146958a);
        sb4.append(", subject=");
        return AbstractC11478a.m30860l(sb4, this.f146959b, ')');
    }
}
