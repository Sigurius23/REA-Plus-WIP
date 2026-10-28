package p365od;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: od.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C27823b extends AbstractC27824c {

    /* JADX INFO: renamed from: b */
    public final String f112080b;

    public C27823b(String str) {
        this.f112080b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27823b) && AbstractC22676k.m65745e(this.f112080b, ((C27823b) obj).f112080b);
    }

    public final int hashCode() {
        return this.f112080b.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("SdkUnknown("), this.f112080b, ')');
    }
}
