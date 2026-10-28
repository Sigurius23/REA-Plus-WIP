package p123en;

import androidx.media3.common.ParserException;
import ed3.C13117a;
import java.io.EOFException;
import p309lo.AbstractC24543a;
import p499t9.InterfaceC33646o;
import p588wm.InterfaceC37368j;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: en.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C13358e {

    /* JADX INFO: renamed from: a */
    public int f46687a;

    /* JADX INFO: renamed from: b */
    public long f46688b;

    /* JADX INFO: renamed from: c */
    public int f46689c;

    /* JADX INFO: renamed from: d */
    public int f46690d;

    /* JADX INFO: renamed from: e */
    public int f46691e;

    /* JADX INFO: renamed from: f */
    public final int[] f46692f;

    /* JADX INFO: renamed from: g */
    public final Object f46693g;

    public C13358e(int i13) {
        switch (i13) {
            case 1:
                this.f46692f = new int[255];
                this.f46693g = new C38059n(255);
                break;
            default:
                this.f46692f = new int[255];
                this.f46693g = new C13117a(255);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m37617a(InterfaceC33646o interfaceC33646o, boolean z4) throws ParserException, EOFException {
        boolean zMo3092c;
        boolean zMo3092c2;
        this.f46687a = 0;
        this.f46688b = 0L;
        this.f46689c = 0;
        this.f46690d = 0;
        this.f46691e = 0;
        C38059n c38059n = (C38059n) this.f46693g;
        c38059n.m121843C(27);
        try {
            zMo3092c = interfaceC33646o.mo3092c(c38059n.f163017a, 0, 27, z4);
        } catch (EOFException e5) {
            if (!z4) {
                throw e5;
            }
            zMo3092c = false;
        }
        if (zMo3092c && c38059n.m121869v() == 1332176723) {
            if (c38059n.m121867t() == 0) {
                this.f46687a = c38059n.m121867t();
                this.f46688b = c38059n.m121857j();
                c38059n.m121858k();
                c38059n.m121858k();
                c38059n.m121858k();
                int iM121867t = c38059n.m121867t();
                this.f46689c = iM121867t;
                this.f46690d = iM121867t + 27;
                c38059n.m121843C(iM121867t);
                try {
                    zMo3092c2 = interfaceC33646o.mo3092c(c38059n.f163017a, 0, this.f46689c, z4);
                } catch (EOFException e13) {
                    if (!z4) {
                        throw e13;
                    }
                    zMo3092c2 = false;
                }
                if (zMo3092c2) {
                    for (int i13 = 0; i13 < this.f46689c; i13++) {
                        int iM121867t2 = c38059n.m121867t();
                        this.f46692f[i13] = iM121867t2;
                        this.f46691e += iM121867t2;
                    }
                    return true;
                }
            } else if (!z4) {
                throw ParserException.m5051c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m37618b(InterfaceC37368j interfaceC37368j, boolean z4) throws com.google.android.exoplayer2.ParserException, EOFException {
        boolean zMo3092c;
        boolean zMo3092c2;
        this.f46687a = 0;
        this.f46688b = 0L;
        this.f46689c = 0;
        this.f46690d = 0;
        this.f46691e = 0;
        C13117a c13117a = (C13117a) this.f46693g;
        c13117a.m36686H(27);
        try {
            zMo3092c = interfaceC37368j.mo3092c(c13117a.f45381a, 0, 27, z4);
        } catch (EOFException e5) {
            if (!z4) {
                throw e5;
            }
            zMo3092c = false;
        }
        if (zMo3092c && c13117a.m36716z() == 1332176723) {
            if (c13117a.m36715y() == 0) {
                this.f46687a = c13117a.m36715y();
                this.f46688b = c13117a.m36702l();
                c13117a.m36703m();
                c13117a.m36703m();
                c13117a.m36703m();
                int iM36715y = c13117a.m36715y();
                this.f46689c = iM36715y;
                this.f46690d = iM36715y + 27;
                c13117a.m36686H(iM36715y);
                try {
                    zMo3092c2 = interfaceC37368j.mo3092c(c13117a.f45381a, 0, this.f46689c, z4);
                } catch (EOFException e13) {
                    if (!z4) {
                        throw e13;
                    }
                    zMo3092c2 = false;
                }
                if (zMo3092c2) {
                    for (int i13 = 0; i13 < this.f46689c; i13++) {
                        int iM36715y2 = c13117a.m36715y();
                        this.f46692f[i13] = iM36715y2;
                        this.f46691e += iM36715y2;
                    }
                    return true;
                }
            } else if (!z4) {
                throw com.google.android.exoplayer2.ParserException.m15564c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m37619c(InterfaceC33646o interfaceC33646o, long j7) {
        boolean zMo3092c;
        C38059n c38059n = (C38059n) this.f46693g;
        AbstractC35849g.m113802d(interfaceC33646o.getPosition() == interfaceC33646o.mo3095g());
        c38059n.m121843C(4);
        while (true) {
            if (j7 != -1 && interfaceC33646o.getPosition() + 4 >= j7) {
                break;
            }
            try {
                zMo3092c = interfaceC33646o.mo3092c(c38059n.f163017a, 0, 4, true);
            } catch (EOFException unused) {
                zMo3092c = false;
            }
            if (!zMo3092c) {
                break;
            }
            c38059n.m121846F(0);
            if (c38059n.m121869v() == 1332176723) {
                interfaceC33646o.mo3093e();
                return true;
            }
            interfaceC33646o.mo3100n(1);
        }
        do {
            if (j7 != -1 && interfaceC33646o.getPosition() >= j7) {
                break;
            }
        } while (interfaceC33646o.mo3097k(1) != -1);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m37620d(InterfaceC37368j interfaceC37368j, long j7) {
        boolean zMo3092c;
        C13117a c13117a = (C13117a) this.f46693g;
        AbstractC24543a.m71569e(interfaceC37368j.getPosition() == interfaceC37368j.mo3095g());
        c13117a.m36686H(4);
        while (true) {
            if (j7 != -1 && interfaceC37368j.getPosition() + 4 >= j7) {
                break;
            }
            try {
                zMo3092c = interfaceC37368j.mo3092c(c13117a.f45381a, 0, 4, true);
            } catch (EOFException unused) {
                zMo3092c = false;
            }
            if (!zMo3092c) {
                break;
            }
            c13117a.m36689K(0);
            if (c13117a.m36716z() == 1332176723) {
                interfaceC37368j.mo3093e();
                return true;
            }
            interfaceC37368j.mo3100n(1);
        }
        do {
            if (j7 != -1 && interfaceC37368j.getPosition() >= j7) {
                break;
            }
        } while (interfaceC37368j.mo3097k(1) != -1);
        return false;
    }
}
