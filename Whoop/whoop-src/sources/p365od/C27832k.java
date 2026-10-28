package p365od;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: od.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C27832k extends AbstractC27833l {

    /* JADX INFO: renamed from: b */
    public final String f112097b;

    public C27832k(String str) {
        this.f112097b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27832k) && AbstractC22676k.m65745e(this.f112097b, ((C27832k) obj).f112097b);
    }

    public final int hashCode() {
        return this.f112097b.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("SdkUnknown("), this.f112097b, ')');
    }
}
