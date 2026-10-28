package gn;

import android.util.Log;
import android.util.Pair;
import bb.C2916c;
import bb.C2918e;
import bb.C2919f;
import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import p097ds.AbstractC12314q;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;

/* JADX INFO: renamed from: gn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C16002c implements InterfaceC37367i {

    /* JADX INFO: renamed from: a */
    public InterfaceC37369k f60569a;

    /* JADX INFO: renamed from: b */
    public InterfaceC37377s f60570b;

    /* JADX INFO: renamed from: c */
    public int f60571c;

    /* JADX INFO: renamed from: d */
    public long f60572d;

    /* JADX INFO: renamed from: e */
    public InterfaceC16001b f60573e;

    /* JADX INFO: renamed from: f */
    public int f60574f;

    /* JADX INFO: renamed from: g */
    public long f60575g;

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        this.f60571c = j7 == 0 ? 0 : 4;
        InterfaceC16001b interfaceC16001b = this.f60573e;
        if (interfaceC16001b != null) {
            interfaceC16001b.mo45298b(j13);
        }
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) {
        return AbstractC12314q.m34335o(interfaceC37368j);
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f60569a = interfaceC37369k;
        this.f60570b = interfaceC37369k.mo3102o(0, 1);
        interfaceC37369k.mo3098l();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        byte[] bArr;
        int i13;
        AbstractC24543a.m71574j(this.f60570b);
        int i14 = AbstractC24567y.f95875a;
        int i15 = this.f60571c;
        int iM71686q = 4;
        if (i15 == 0) {
            AbstractC24543a.m71573i(((C37364f) interfaceC37368j).f159852z == 0);
            int i16 = this.f60574f;
            if (i16 != -1) {
                ((C37364f) interfaceC37368j).mo3100n(i16);
                this.f60571c = 4;
                return 0;
            }
            if (!AbstractC12314q.m34335o(interfaceC37368j)) {
                throw ParserException.m15562a(null, "Unsupported or unrecognized wav file type.");
            }
            C37364f c37364f = (C37364f) interfaceC37368j;
            c37364f.mo3100n((int) (c37364f.mo3095g() - c37364f.f159852z));
            this.f60571c = 1;
            return 0;
        }
        long jM36702l = -1;
        if (i15 == 1) {
            C13117a c13117a = new C13117a(8);
            C2919f c2919fM8507b = C2919f.m8507b(interfaceC37368j, c13117a);
            if (c2919fM8507b.f11740a != 1685272116) {
                ((C37364f) interfaceC37368j).f159847F = 0;
            } else {
                C37364f c37364f2 = (C37364f) interfaceC37368j;
                c37364f2.m119648a(8, false);
                c13117a.m36689K(0);
                c37364f2.mo3092c(c13117a.f45381a, 0, 8, false);
                jM36702l = c13117a.m36702l();
                c37364f2.mo3100n(((int) c2919fM8507b.f11741b) + 8);
            }
            this.f60572d = jM36702l;
            this.f60571c = 2;
            return 0;
        }
        if (i15 != 2) {
            if (i15 != 3) {
                if (i15 != 4) {
                    throw new IllegalStateException();
                }
                AbstractC24543a.m71573i(this.f60575g != -1);
                long j7 = this.f60575g - ((C37364f) interfaceC37368j).f159852z;
                InterfaceC16001b interfaceC16001b = this.f60573e;
                interfaceC16001b.getClass();
                return interfaceC16001b.mo8505c(interfaceC37368j, j7) ? -1 : 0;
            }
            ((C37364f) interfaceC37368j).f159847F = 0;
            C2919f c2919fM34315G = AbstractC12314q.m34315G(1684108385, interfaceC37368j, new C13117a(8));
            C37364f c37364f3 = (C37364f) interfaceC37368j;
            c37364f3.mo3100n(8);
            Pair pairCreate = Pair.create(Long.valueOf(c37364f3.f159852z), Long.valueOf(c2919fM34315G.f11741b));
            this.f60574f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j13 = this.f60572d;
            if (j13 != -1 && jLongValue == 4294967295L) {
                jLongValue = j13;
            }
            long j14 = ((long) this.f60574f) + jLongValue;
            this.f60575g = j14;
            long j15 = c37364f3.f159851y;
            if (j15 != -1 && j14 > j15) {
                StringBuilder sb4 = new StringBuilder(69);
                sb4.append("Data exceeds input length: ");
                sb4.append(j14);
                sb4.append(", ");
                sb4.append(j15);
                Log.w("WavExtractor", sb4.toString());
                this.f60575g = j15;
            }
            InterfaceC16001b interfaceC16001b2 = this.f60573e;
            interfaceC16001b2.getClass();
            interfaceC16001b2.mo45297a(this.f60574f, this.f60575g);
            this.f60571c = 4;
            return 0;
        }
        C13117a c13117a2 = new C13117a(16);
        long j16 = AbstractC12314q.m34315G(1718449184, interfaceC37368j, c13117a2).f11741b;
        AbstractC24543a.m71573i(j16 >= 16);
        C37364f c37364f4 = (C37364f) interfaceC37368j;
        c37364f4.mo3092c(c13117a2.f45381a, 0, 16, false);
        c13117a2.m36689K(0);
        int iM36705o = c13117a2.m36705o();
        int iM36705o2 = c13117a2.m36705o();
        int iM36704n = c13117a2.m36704n();
        c13117a2.m36704n();
        int iM36705o3 = c13117a2.m36705o();
        int iM36705o4 = c13117a2.m36705o();
        int i17 = ((int) j16) - 16;
        if (i17 > 0) {
            bArr = new byte[i17];
            c37364f4.mo3092c(bArr, 0, i17, false);
        } else {
            bArr = AbstractC24567y.f95880f;
        }
        byte[] bArr2 = bArr;
        c37364f4.mo3100n((int) (c37364f4.mo3095g() - c37364f4.f159852z));
        C2918e c2918e = new C2918e(iM36705o, iM36705o2, iM36704n, iM36705o3, iM36705o4, bArr2);
        if (iM36705o == 17) {
            this.f60573e = new C16000a(this.f60569a, this.f60570b, c2918e);
        } else if (iM36705o == 6) {
            this.f60573e = new C2916c(this.f60569a, this.f60570b, c2918e, "audio/g711-alaw", -1);
        } else if (iM36705o == 7) {
            this.f60573e = new C2916c(this.f60569a, this.f60570b, c2918e, "audio/g711-mlaw", -1);
        } else {
            if (iM36705o == 1) {
                iM71686q = AbstractC24567y.m71686q(iM36705o4);
                i13 = iM71686q;
            } else {
                if (iM36705o != 3) {
                    if (iM36705o == 65534) {
                        iM71686q = AbstractC24567y.m71686q(iM36705o4);
                        i13 = iM71686q;
                    }
                } else if (iM36705o4 == 32) {
                    i13 = iM71686q;
                }
                i13 = 0;
            }
            if (i13 == 0) {
                StringBuilder sb5 = new StringBuilder(40);
                sb5.append("Unsupported WAV format type: ");
                sb5.append(iM36705o);
                throw ParserException.m15564c(sb5.toString());
            }
            this.f60573e = new C2916c(this.f60569a, this.f60570b, c2918e, "audio/raw", i13);
        }
        this.f60571c = 3;
        return 0;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
