package re;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31266e0 extends AbstractC31272g0 {

    /* JADX INFO: renamed from: b */
    public final String f128779b;

    public C31266e0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f128779b = value;
    }

    @Override // re.AbstractC31272g0
    /* JADX INFO: renamed from: a */
    public final String mo96287a() {
        return this.f128779b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31266e0) && AbstractC22676k.m65745e(this.f128779b, ((C31266e0) obj).f128779b);
    }

    public final int hashCode() {
        return this.f128779b.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("SdkUnknown("), this.f128779b, ')');
    }
}
