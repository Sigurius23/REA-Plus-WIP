package p510u0;

import c93.InterfaceC4339a;
import com.whoop.data.local.room.dao.wipeable.C6517d;
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

/* JADX INFO: renamed from: u0.v1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34364v1 implements InterfaceC39080c0 {

    /* JADX INFO: renamed from: w */
    public final C34340n1 f144375w;

    /* JADX INFO: renamed from: x */
    public final int f144376x;

    /* JADX INFO: renamed from: y */
    public final C29869e0 f144377y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC4339a f144378z;

    public C34364v1(C34340n1 c34340n1, int i13, C29869e0 c29869e0, InterfaceC4339a interfaceC4339a) {
        this.f144375w = c34340n1;
        this.f144376x = i13;
        this.f144377y = c29869e0;
        this.f144378z = interfaceC4339a;
    }

    @Override // p635y2.InterfaceC39080c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo14262b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(C39169a.m124758b(j7, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(abstractC39104j1Mo448T.f168212x, C39169a.m124764h(j7));
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, iMin, C25272z.f99163w, new C6517d(this, abstractC39104j1Mo448T, iMin, 17));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34364v1)) {
            return false;
        }
        C34364v1 c34364v1 = (C34364v1) obj;
        return AbstractC22676k.m65745e(this.f144375w, c34364v1.f144375w) && this.f144376x == c34364v1.f144376x && AbstractC22676k.m65745e(this.f144377y, c34364v1.f144377y) && AbstractC22676k.m65745e(this.f144378z, c34364v1.f144378z);
    }

    public final int hashCode() {
        return this.f144378z.hashCode() + ((this.f144377y.hashCode() + AbstractC11266d.m30448b(this.f144376x, this.f144375w.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f144375w + ", cursorOffset=" + this.f144376x + ", transformedText=" + this.f144377y + ", textLayoutResultProvider=" + this.f144378z + ')';
    }
}
