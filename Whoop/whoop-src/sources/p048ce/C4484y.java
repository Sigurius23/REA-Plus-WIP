package p048ce;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C4484y implements InterfaceC4461b0 {

    /* JADX INFO: renamed from: a */
    public final String f18024a;

    /* JADX INFO: renamed from: b */
    public final String f18025b;

    public C4484y(String key, String value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.f18024a = key;
        this.f18025b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4484y)) {
            return false;
        }
        C4484y c4484y = (C4484y) obj;
        return AbstractC22676k.m65745e(this.f18024a, c4484y.f18024a) && AbstractC22676k.m65745e(this.f18025b, c4484y.f18025b);
    }

    public final int hashCode() {
        return this.f18025b.hashCode() + (this.f18024a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Property(key=");
        sb4.append(this.f18024a);
        sb4.append(", value=");
        return AbstractC25012a.m73377j(sb4, this.f18025b, ')');
    }
}
