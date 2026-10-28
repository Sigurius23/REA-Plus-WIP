package ec3;

import d30.C11552o;
import fc3.C14394y;
import p007a6.C0456u;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ec3.b2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13021b2 implements InterfaceC13017a2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45019a;

    @Override // ec3.InterfaceC13017a2
    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l mo36557a(C14394y c14394y) {
        switch (this.f45019a) {
            case 0:
                return new C0456u(EnumC13102y1.f45274w, 1);
            default:
                return new C13084s1(new C11552o(c14394y, (InterfaceC30057d) null, 8));
        }
    }

    public final String toString() {
        switch (this.f45019a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
