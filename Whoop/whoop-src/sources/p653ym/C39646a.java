package p653ym;

import ed3.C13117a;
import p479s4.AbstractC32128i;
import p499t9.C33650s;
import p499t9.C33653v;
import p588wm.C37361c;
import p588wm.InterfaceC37362d;
import p588wm.InterfaceC37368j;

/* JADX INFO: renamed from: ym.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39646a implements InterfaceC37362d {

    /* JADX INFO: renamed from: w */
    public final C33653v f170570w;

    /* JADX INFO: renamed from: x */
    public final int f170571x;

    /* JADX INFO: renamed from: y */
    public final C33650s f170572y = new C33650s();

    public C39646a(C33653v c33653v, int i13) {
        this.f170570w = c33653v;
        this.f170571x = i13;
    }

    /* JADX INFO: renamed from: a */
    public final long m126761a(InterfaceC37368j interfaceC37368j) {
        C33650s c33650s;
        C33653v c33653v;
        int iMo3099m;
        while (true) {
            long jMo3095g = interfaceC37368j.mo3095g();
            long length = interfaceC37368j.getLength() - 6;
            c33650s = this.f170572y;
            c33653v = this.f170570w;
            if (jMo3095g >= length) {
                break;
            }
            long jMo3095g2 = interfaceC37368j.mo3095g();
            byte[] bArr = new byte[2];
            int i13 = 0;
            boolean zM100052f = false;
            interfaceC37368j.mo3103p(bArr, 0, 2);
            int i14 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i15 = this.f170571x;
            if (i14 != i15) {
                interfaceC37368j.mo3093e();
                interfaceC37368j.mo3096i((int) (jMo3095g2 - interfaceC37368j.getPosition()));
            } else {
                C13117a c13117a = new C13117a(16);
                System.arraycopy(bArr, 0, c13117a.f45381a, 0, 2);
                byte[] bArr2 = c13117a.f45381a;
                while (i13 < 14 && (iMo3099m = interfaceC37368j.mo3099m(bArr2, 2 + i13, 14 - i13)) != -1) {
                    i13 += iMo3099m;
                }
                c13117a.m36688J(i13);
                interfaceC37368j.mo3093e();
                interfaceC37368j.mo3096i((int) (jMo3095g2 - interfaceC37368j.getPosition()));
                zM100052f = AbstractC32128i.m100052f(c13117a, c33653v, i15, c33650s);
            }
            if (zM100052f) {
                break;
            }
            interfaceC37368j.mo3096i(1);
        }
        if (interfaceC37368j.mo3095g() < interfaceC37368j.getLength() - 6) {
            return c33650s.f140436a;
        }
        interfaceC37368j.mo3096i((int) (interfaceC37368j.getLength() - interfaceC37368j.mo3095g()));
        return c33653v.f140453k;
    }

    @Override // p588wm.InterfaceC37362d
    /* JADX INFO: renamed from: h */
    public final C37361c mo30743h(InterfaceC37368j interfaceC37368j, long j7) {
        long position = interfaceC37368j.getPosition();
        long jM126761a = m126761a(interfaceC37368j);
        long jMo3095g = interfaceC37368j.mo3095g();
        interfaceC37368j.mo3096i(Math.max(6, this.f170570w.f140446d));
        long jM126761a2 = m126761a(interfaceC37368j);
        long jMo3095g2 = interfaceC37368j.mo3095g();
        if (jM126761a > j7 || jM126761a2 <= j7) {
            return jM126761a2 <= j7 ? new C37361c(-2, jM126761a2, jMo3095g2) : new C37361c(-1, jM126761a, position);
        }
        return new C37361c(0, -9223372036854775807L, jMo3095g);
    }
}
