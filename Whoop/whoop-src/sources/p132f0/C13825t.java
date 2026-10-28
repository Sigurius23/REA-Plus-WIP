package p132f0;

import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p636y3.C39174f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C13825t {

    /* JADX INFO: renamed from: a */
    public final float f49345a;

    /* JADX INFO: renamed from: b */
    public final AbstractC17911t f49346b;

    public C13825t(float f13, AbstractC17911t abstractC17911t) {
        this.f49345a = f13;
        this.f49346b = abstractC17911t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13825t)) {
            return false;
        }
        C13825t c13825t = (C13825t) obj;
        return C39174f.m124782b(this.f49345a, c13825t.f49345a) && AbstractC22676k.m65745e(this.f49346b, c13825t.f49346b);
    }

    public final int hashCode() {
        return this.f49346b.hashCode() + (Float.hashCode(this.f49345a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BorderStroke(width=");
        AbstractC13673n.m38572s(this.f49345a, ", brush=", sb4);
        sb4.append(this.f49346b);
        sb4.append(')');
        return sb4.toString();
    }
}
