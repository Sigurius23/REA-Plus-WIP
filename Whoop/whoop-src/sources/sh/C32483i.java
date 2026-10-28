package sh;

import p031b9.AbstractC2875y;
import p461rh.InterfaceC31421j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sh.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C32483i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31421j f134511a;

    /* JADX INFO: renamed from: b */
    public final boolean f134512b;

    public C32483i(InterfaceC31421j interfaceC31421j, boolean z4) {
        this.f134511a = interfaceC31421j;
        this.f134512b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32483i)) {
            return false;
        }
        C32483i c32483i = (C32483i) obj;
        return AbstractC22676k.m65745e(this.f134511a, c32483i.f134511a) && this.f134512b == c32483i.f134512b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f134512b) + (this.f134511a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DecodeResult(image=");
        sb4.append(this.f134511a);
        sb4.append(", isSampled=");
        return AbstractC2875y.m8305r(sb4, this.f134512b, ')');
    }
}
