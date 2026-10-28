package bn;

import java.util.ArrayDeque;
import la.C23551e;
import p499t9.InterfaceC33646o;
import p588wm.InterfaceC37368j;

/* JADX INFO: renamed from: bn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3489b {

    /* JADX INFO: renamed from: a */
    public final byte[] f13728a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f13729b;

    /* JADX INFO: renamed from: c */
    public int f13730c;

    /* JADX INFO: renamed from: d */
    public int f13731d;

    /* JADX INFO: renamed from: e */
    public long f13732e;

    /* JADX INFO: renamed from: f */
    public final Object f13733f;

    /* JADX INFO: renamed from: g */
    public Object f13734g;

    public C3489b(int i13) {
        switch (i13) {
            case 1:
                this.f13728a = new byte[8];
                this.f13729b = new ArrayDeque();
                this.f13733f = new C23551e();
                break;
            default:
                this.f13728a = new byte[8];
                this.f13729b = new ArrayDeque();
                this.f13733f = new C3492e();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public long m10284a(InterfaceC33646o interfaceC33646o, int i13) {
        byte[] bArr = this.f13728a;
        interfaceC33646o.readFully(bArr, 0, i13);
        long j7 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            j7 = (j7 << 8) | ((long) (bArr[i14] & 255));
        }
        return j7;
    }

    /* JADX INFO: renamed from: b */
    public long m10285b(InterfaceC37368j interfaceC37368j, int i13) {
        byte[] bArr = this.f13728a;
        interfaceC37368j.readFully(bArr, 0, i13);
        long j7 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            j7 = (j7 << 8) | ((long) (bArr[i14] & 255));
        }
        return j7;
    }
}
