package z40;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C40054a extends AbstractC40058e {

    /* JADX INFO: renamed from: a */
    public final String f172862a;

    public C40054a(String str) {
        this.f172862a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40054a) && AbstractC22676k.m65745e(this.f172862a, ((C40054a) obj).f172862a);
    }

    public final int hashCode() {
        return this.f172862a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("BluetoothHeadset(name=", this.f172862a, ")");
    }
}
