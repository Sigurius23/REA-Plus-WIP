package bb;

import android.util.Pair;
import androidx.media3.common.ParserException;
import o73.C27648a;
import p499t9.C33650s;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: bb.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C2917d implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public InterfaceC33648q f11728a;

    /* JADX INFO: renamed from: b */
    public InterfaceC33639k0 f11729b;

    /* JADX INFO: renamed from: e */
    public InterfaceC2915b f11732e;

    /* JADX INFO: renamed from: c */
    public int f11730c = 0;

    /* JADX INFO: renamed from: d */
    public long f11731d = -1;

    /* JADX INFO: renamed from: f */
    public int f11733f = -1;

    /* JADX INFO: renamed from: g */
    public long f11734g = -1;

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        this.f11730c = j7 == 0 ? 0 : 4;
        InterfaceC2915b interfaceC2915b = this.f11732e;
        if (interfaceC2915b != null) {
            interfaceC2915b.mo8502b(j13);
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f11728a = interfaceC33648q;
        this.f11729b = interfaceC33648q.mo3101o(0, 1);
        interfaceC33648q.mo3098l();
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        return C27648a.m83594q(interfaceC33646o);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0188  */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        byte[] bArr;
        int i13;
        AbstractC35849g.m113808j(this.f11729b);
        int i14 = AbstractC38065t.f163031a;
        int i15 = this.f11730c;
        int iM121930w = 4;
        if (i15 == 0) {
            AbstractC35849g.m113807i(interfaceC33646o.getPosition() == 0);
            int i16 = this.f11733f;
            if (i16 != -1) {
                interfaceC33646o.mo3100n(i16);
                this.f11730c = 4;
                return 0;
            }
            if (!C27648a.m83594q(interfaceC33646o)) {
                throw ParserException.m5049a(null, "Unsupported or unrecognized wav file type.");
            }
            interfaceC33646o.mo3100n((int) (interfaceC33646o.mo3095g() - interfaceC33646o.getPosition()));
            this.f11730c = 1;
            return 0;
        }
        long jM121857j = -1;
        if (i15 == 1) {
            C38059n c38059n = new C38059n(8);
            C2919f c2919fM8506a = C2919f.m8506a(interfaceC33646o, c38059n);
            if (c2919fM8506a.f11740a != 1685272116) {
                interfaceC33646o.mo3093e();
            } else {
                interfaceC33646o.mo3096i(8);
                c38059n.m121846F(0);
                interfaceC33646o.mo3103p(c38059n.f163017a, 0, 8);
                jM121857j = c38059n.m121857j();
                interfaceC33646o.mo3100n(((int) c2919fM8506a.f11741b) + 8);
            }
            this.f11731d = jM121857j;
            this.f11730c = 2;
            return 0;
        }
        if (i15 != 2) {
            if (i15 != 3) {
                if (i15 != 4) {
                    throw new IllegalStateException();
                }
                AbstractC35849g.m113807i(this.f11734g != -1);
                long position = this.f11734g - interfaceC33646o.getPosition();
                InterfaceC2915b interfaceC2915b = this.f11732e;
                interfaceC2915b.getClass();
                return interfaceC2915b.mo8504d(interfaceC33646o, position) ? -1 : 0;
            }
            interfaceC33646o.mo3093e();
            C2919f c2919fM83575Z = C27648a.m83575Z(1684108385, interfaceC33646o, new C38059n(8));
            interfaceC33646o.mo3100n(8);
            Pair pairCreate = Pair.create(Long.valueOf(interfaceC33646o.getPosition()), Long.valueOf(c2919fM83575Z.f11741b));
            this.f11733f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j7 = this.f11731d;
            if (j7 != -1 && jLongValue == 4294967295L) {
                jLongValue = j7;
            }
            this.f11734g = ((long) this.f11733f) + jLongValue;
            long length = interfaceC33646o.getLength();
            if (length != -1 && this.f11734g > length) {
                AbstractC38046a.m121826u("WavExtractor", "Data exceeds input length: " + this.f11734g + ", " + length);
                this.f11734g = length;
            }
            InterfaceC2915b interfaceC2915b2 = this.f11732e;
            interfaceC2915b2.getClass();
            interfaceC2915b2.mo8501a(this.f11733f, this.f11734g);
            this.f11730c = 4;
            return 0;
        }
        C38059n c38059n2 = new C38059n(16);
        long j13 = C27648a.m83575Z(1718449184, interfaceC33646o, c38059n2).f11741b;
        AbstractC35849g.m113807i(j13 >= 16);
        interfaceC33646o.mo3103p(c38059n2.f163017a, 0, 16);
        c38059n2.m121846F(0);
        int iM121860m = c38059n2.m121860m();
        int iM121860m2 = c38059n2.m121860m();
        int iM121859l = c38059n2.m121859l();
        c38059n2.m121859l();
        int iM121860m3 = c38059n2.m121860m();
        int iM121860m4 = c38059n2.m121860m();
        int i17 = ((int) j13) - 16;
        if (i17 > 0) {
            bArr = new byte[i17];
            interfaceC33646o.mo3103p(bArr, 0, i17);
        } else {
            bArr = AbstractC38065t.f163033c;
        }
        byte[] bArr2 = bArr;
        interfaceC33646o.mo3100n((int) (interfaceC33646o.mo3095g() - interfaceC33646o.getPosition()));
        C2918e c2918e = new C2918e(iM121860m, iM121860m2, iM121859l, iM121860m3, iM121860m4, bArr2);
        if (iM121860m == 17) {
            this.f11732e = new C2914a(this.f11728a, this.f11729b, c2918e);
        } else if (iM121860m == 6) {
            this.f11732e = new C2916c(this.f11728a, this.f11729b, c2918e, "audio/g711-alaw", -1);
        } else if (iM121860m == 7) {
            this.f11732e = new C2916c(this.f11728a, this.f11729b, c2918e, "audio/g711-mlaw", -1);
        } else {
            if (iM121860m == 1) {
                iM121930w = AbstractC38065t.m121930w(iM121860m4);
                i13 = iM121930w;
            } else {
                if (iM121860m != 3) {
                    if (iM121860m == 65534) {
                        iM121930w = AbstractC38065t.m121930w(iM121860m4);
                        i13 = iM121930w;
                    }
                } else if (iM121860m4 == 32) {
                    i13 = iM121930w;
                }
                i13 = 0;
            }
            if (i13 == 0) {
                throw ParserException.m5051c("Unsupported WAV format type: " + iM121860m);
            }
            this.f11732e = new C2916c(this.f11728a, this.f11729b, c2918e, "audio/raw", i13);
        }
        this.f11730c = 3;
        return 0;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
