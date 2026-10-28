package aa3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0602a0 extends AbstractC0638m0 {

    /* JADX INFO: renamed from: a */
    public final String f2146a;

    /* JADX INFO: renamed from: b */
    public final String f2147b;

    public C0602a0(String enumClassName, String enumEntryName) {
        AbstractC22676k.m65750j(enumClassName, "enumClassName");
        AbstractC22676k.m65750j(enumEntryName, "enumEntryName");
        this.f2146a = enumClassName;
        this.f2147b = enumEntryName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0602a0)) {
            return false;
        }
        C0602a0 c0602a0 = (C0602a0) obj;
        return AbstractC22676k.m65745e(this.f2146a, c0602a0.f2146a) && AbstractC22676k.m65745e(this.f2147b, c0602a0.f2147b);
    }

    public final int hashCode() {
        return this.f2147b.hashCode() + (this.f2146a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("EnumValue(");
        sb4.append(this.f2146a);
        sb4.append('.');
        return AbstractC25012a.m73377j(sb4, this.f2147b, ')');
    }
}
