package w20;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: w20.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C36722l {

    /* JADX INFO: renamed from: a */
    public final String f157210a;

    /* JADX INFO: renamed from: b */
    public final EnumC38853i f157211b;

    public C36722l(String str, EnumC38853i brand) {
        AbstractC22676k.m65750j(brand, "brand");
        this.f157210a = str;
        this.f157211b = brand;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36722l)) {
            return false;
        }
        C36722l c36722l = (C36722l) obj;
        return AbstractC22676k.m65745e(this.f157210a, c36722l.f157210a) && this.f157211b == c36722l.f157211b;
    }

    public final int hashCode() {
        String str = this.f157210a;
        return this.f157211b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "CvcRecollectionData(lastFour=" + this.f157210a + ", brand=" + this.f157211b + ")";
    }
}
