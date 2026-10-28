package bb;

import ed3.C13117a;
import p309lo.AbstractC24543a;
import p499t9.InterfaceC33646o;
import p588wm.InterfaceC37368j;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: bb.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C2919f {

    /* JADX INFO: renamed from: a */
    public final int f11740a;

    /* JADX INFO: renamed from: b */
    public final long f11741b;

    public /* synthetic */ C2919f(int i13, long j7, byte b) {
        this.f11740a = i13;
        this.f11741b = j7;
    }

    /* JADX INFO: renamed from: a */
    public static C2919f m8506a(InterfaceC33646o interfaceC33646o, C38059n c38059n) {
        interfaceC33646o.mo3103p(c38059n.f163017a, 0, 8);
        c38059n.m121846F(0);
        return new C2919f(c38059n.m121854g(), c38059n.m121858k(), (byte) 0);
    }

    /* JADX INFO: renamed from: b */
    public static C2919f m8507b(InterfaceC37368j interfaceC37368j, C13117a c13117a) {
        interfaceC37368j.mo3103p(c13117a.f45381a, 0, 8);
        c13117a.m36689K(0);
        return new C2919f(c13117a.m36699i(), c13117a.m36703m(), (byte) 0);
    }

    public C2919f(int i13, long j7, int i14) {
        switch (i14) {
            case 4:
                AbstractC35849g.m113802d(j7 >= 0);
                this.f11740a = i13;
                this.f11741b = j7;
                break;
            default:
                AbstractC24543a.m71569e(j7 >= 0);
                this.f11740a = i13;
                this.f11741b = j7;
                break;
        }
    }
}
