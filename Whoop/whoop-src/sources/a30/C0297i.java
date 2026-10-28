package a30;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38912o1;
import y00.C38921p1;

/* JADX INFO: renamed from: a30.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C0297i implements InterfaceC0303k {

    /* JADX INFO: renamed from: a */
    public final C38921p1 f1033a;

    /* JADX INFO: renamed from: b */
    public final String f1034b;

    /* JADX INFO: renamed from: c */
    public final String f1035c;

    /* JADX INFO: renamed from: d */
    public final String f1036d;

    public C0297i(C38921p1 elementsSessionCustomer, String customerSessionClientSecret) {
        AbstractC22676k.m65750j(elementsSessionCustomer, "elementsSessionCustomer");
        AbstractC22676k.m65750j(customerSessionClientSecret, "customerSessionClientSecret");
        this.f1033a = elementsSessionCustomer;
        this.f1034b = customerSessionClientSecret;
        C38912o1 c38912o1 = elementsSessionCustomer.f167545y;
        this.f1035c = c38912o1.f167498E;
        this.f1036d = c38912o1.f167502y;
    }

    @Override // a30.InterfaceC0303k
    /* JADX INFO: renamed from: a */
    public final String mo825a() {
        return this.f1036d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0297i)) {
            return false;
        }
        C0297i c0297i = (C0297i) obj;
        return AbstractC22676k.m65745e(this.f1033a, c0297i.f1033a) && AbstractC22676k.m65745e(this.f1034b, c0297i.f1034b);
    }

    @Override // a30.InterfaceC0303k
    public final String getId() {
        return this.f1035c;
    }

    public final int hashCode() {
        return this.f1034b.hashCode() + (this.f1033a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomerSession(elementsSessionCustomer=" + this.f1033a + ", customerSessionClientSecret=" + this.f1034b + ")";
    }
}
