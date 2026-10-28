package p642y9;

import p499t9.AbstractC33618a;
import p499t9.C33628f;
import p499t9.C33650s;
import p499t9.C33653v;
import p499t9.InterfaceC33630g;
import p499t9.InterfaceC33646o;
import p607x8.C38059n;

/* JADX INFO: renamed from: y9.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C39349a implements InterfaceC33630g {

    /* JADX INFO: renamed from: w */
    public final C33653v f169360w;

    /* JADX INFO: renamed from: x */
    public final int f169361x;

    /* JADX INFO: renamed from: y */
    public final C33650s f169362y = new C33650s();

    public C39349a(C33653v c33653v, int i13) {
        this.f169360w = c33653v;
        this.f169361x = i13;
    }

    /* JADX INFO: renamed from: a */
    public final long m125472a(InterfaceC33646o interfaceC33646o) {
        C33650s c33650s;
        C33653v c33653v;
        int iMo3099m;
        while (true) {
            long jMo3095g = interfaceC33646o.mo3095g();
            long length = interfaceC33646o.getLength() - 6;
            c33650s = this.f169362y;
            c33653v = this.f169360w;
            if (jMo3095g >= length) {
                break;
            }
            long jMo3095g2 = interfaceC33646o.mo3095g();
            byte[] bArr = new byte[2];
            int i13 = 0;
            boolean zM106210b = false;
            interfaceC33646o.mo3103p(bArr, 0, 2);
            int i14 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i15 = this.f169361x;
            if (i14 != i15) {
                interfaceC33646o.mo3093e();
                interfaceC33646o.mo3096i((int) (jMo3095g2 - interfaceC33646o.getPosition()));
            } else {
                C38059n c38059n = new C38059n(16);
                System.arraycopy(bArr, 0, c38059n.f163017a, 0, 2);
                byte[] bArr2 = c38059n.f163017a;
                while (i13 < 14 && (iMo3099m = interfaceC33646o.mo3099m(bArr2, 2 + i13, 14 - i13)) != -1) {
                    i13 += iMo3099m;
                }
                c38059n.m121845E(i13);
                interfaceC33646o.mo3093e();
                interfaceC33646o.mo3096i((int) (jMo3095g2 - interfaceC33646o.getPosition()));
                zM106210b = AbstractC33618a.m106210b(c38059n, c33653v, i15, c33650s);
            }
            if (zM106210b) {
                break;
            }
            interfaceC33646o.mo3096i(1);
        }
        if (interfaceC33646o.mo3095g() < interfaceC33646o.getLength() - 6) {
            return c33650s.f140436a;
        }
        interfaceC33646o.mo3096i((int) (interfaceC33646o.getLength() - interfaceC33646o.mo3095g()));
        return c33653v.f140453k;
    }

    @Override // p499t9.InterfaceC33630g
    /* JADX INFO: renamed from: j */
    public final C33628f mo1695j(InterfaceC33646o interfaceC33646o, long j7) {
        long position = interfaceC33646o.getPosition();
        long jM125472a = m125472a(interfaceC33646o);
        long jMo3095g = interfaceC33646o.mo3095g();
        interfaceC33646o.mo3096i(Math.max(6, this.f169360w.f140446d));
        long jM125472a2 = m125472a(interfaceC33646o);
        long jMo3095g2 = interfaceC33646o.mo3095g();
        if (jM125472a > j7 || jM125472a2 <= j7) {
            return jM125472a2 <= j7 ? new C33628f(-2, jM125472a2, jMo3095g2) : new C33628f(-1, jM125472a, position);
        }
        return new C33628f(0, -9223372036854775807L, jMo3095g);
    }
}
