package re;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C31295s extends AbstractC31309z {

    /* JADX INFO: renamed from: b */
    public final String f128837b;

    public C31295s(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f128837b = value;
    }

    @Override // re.AbstractC31309z
    /* JADX INFO: renamed from: a */
    public final String mo96296a() {
        return this.f128837b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31295s) && AbstractC22676k.m65745e(this.f128837b, ((C31295s) obj).f128837b);
    }

    public final int hashCode() {
        return this.f128837b.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("SdkUnknown("), this.f128837b, ')');
    }
}
