package p158fw;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fw.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C14831k {

    /* JADX INFO: renamed from: a */
    public final String f55097a;

    /* JADX INFO: renamed from: b */
    public final String f55098b;

    public C14831k(String name, String value) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        this.f55097a = name;
        this.f55098b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14831k)) {
            return false;
        }
        C14831k c14831k = (C14831k) obj;
        return AbstractC22676k.m65745e(this.f55097a, c14831k.f55097a) && AbstractC22676k.m65745e(this.f55098b, c14831k.f55098b);
    }

    public final int hashCode() {
        return this.f55098b.hashCode() + (this.f55097a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Header(name=");
        sb4.append(this.f55097a);
        sb4.append(", value=");
        return AbstractC25012a.m73377j(sb4, this.f55098b, ')');
    }
}
