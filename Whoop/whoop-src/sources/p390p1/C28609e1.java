package p390p1;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28609e1 {

    /* JADX INFO: renamed from: a */
    public final String f115737a;

    public C28609e1(String str) {
        this.f115737a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28609e1) && AbstractC22676k.m65745e(this.f115737a, ((C28609e1) obj).f115737a);
    }

    public final int hashCode() {
        return this.f115737a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("OpaqueKey(key="), this.f115737a, ')');
    }
}
