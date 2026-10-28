package p048ce;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4459a0 implements InterfaceC4461b0 {

    /* JADX INFO: renamed from: a */
    public final String f17969a;

    /* JADX INFO: renamed from: b */
    public final String f17970b;

    public C4459a0(String key, String value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.f17969a = key;
        this.f17970b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4459a0)) {
            return false;
        }
        C4459a0 c4459a0 = (C4459a0) obj;
        return AbstractC22676k.m65745e(this.f17969a, c4459a0.f17969a) && AbstractC22676k.m65745e(this.f17970b, c4459a0.f17970b);
    }

    public final int hashCode() {
        return this.f17970b.hashCode() + (this.f17969a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SubProperty(key=");
        sb4.append(this.f17969a);
        sb4.append(", value=");
        return AbstractC25012a.m73377j(sb4, this.f17970b, ')');
    }
}
