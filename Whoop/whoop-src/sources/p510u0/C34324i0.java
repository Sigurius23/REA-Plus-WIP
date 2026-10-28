package p510u0;

import b30.C2588o1;
import c93.InterfaceC4339a;
import m83.C25272z;
import p000.AbstractC11266d;
import p412q3.C29869e0;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39080c0;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u0.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34324i0 implements InterfaceC39080c0 {

    /* JADX INFO: renamed from: w */
    public final C34340n1 f144127w;

    /* JADX INFO: renamed from: x */
    public final int f144128x;

    /* JADX INFO: renamed from: y */
    public final C29869e0 f144129y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC4339a f144130z;

    public C34324i0(C34340n1 c34340n1, int i13, C29869e0 c29869e0, InterfaceC4339a interfaceC4339a) {
        this.f144127w = c34340n1;
        this.f144128x = i13;
        this.f144129y = c29869e0;
        this.f144130z = interfaceC4339a;
    }

    @Override // p635y2.InterfaceC39080c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo14262b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        long j13;
        if (interfaceC39124q0.mo447Q(C39169a.m124764h(j7)) < C39169a.m124765i(j7)) {
            j13 = j7;
        } else {
            j13 = j7;
            j7 = C39169a.m124758b(j13, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        int iMin = Math.min(abstractC39104j1Mo448T.f168211w, C39169a.m124765i(j13));
        return interfaceC39133t0.mo86822W(iMin, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C2588o1(this, interfaceC39133t0, abstractC39104j1Mo448T, iMin, 7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34324i0)) {
            return false;
        }
        C34324i0 c34324i0 = (C34324i0) obj;
        return AbstractC22676k.m65745e(this.f144127w, c34324i0.f144127w) && this.f144128x == c34324i0.f144128x && AbstractC22676k.m65745e(this.f144129y, c34324i0.f144129y) && AbstractC22676k.m65745e(this.f144130z, c34324i0.f144130z);
    }

    public final int hashCode() {
        return this.f144130z.hashCode() + ((this.f144129y.hashCode() + AbstractC11266d.m30448b(this.f144128x, this.f144127w.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f144127w + ", cursorOffset=" + this.f144128x + ", transformedText=" + this.f144129y + ", textLayoutResultProvider=" + this.f144130z + ')';
    }
}
