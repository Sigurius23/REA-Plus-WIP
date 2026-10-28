package qa;

import mm.C25680d;
import p607x8.InterfaceC38049d;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;

/* JADX INFO: renamed from: qa.l */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC30107l {
    /* JADX INFO: renamed from: L */
    default InterfaceC30100e mo92227L(byte[] bArr, int i13, int i14) {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        mo91120k(bArr, 0, i14, C30106k.f122844c, new C25680d(c41014d0M133251l, 20));
        return new C30098c(c41014d0M133251l.m133239f());
    }

    /* JADX INFO: renamed from: c0 */
    int mo91110c0();

    /* JADX INFO: renamed from: k */
    void mo91120k(byte[] bArr, int i13, int i14, C30106k c30106k, InterfaceC38049d interfaceC38049d);

    default void reset() {
    }
}
