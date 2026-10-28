package bb;

import com.google.android.exoplayer2.ParserException;
import gn.C16003d;
import gn.InterfaceC16001b;
import java.math.RoundingMode;
import p309lo.AbstractC24567y;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: bb.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C2916c implements InterfaceC2915b, InterfaceC16001b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11719a = 2;

    /* JADX INFO: renamed from: b */
    public int f11720b;

    /* JADX INFO: renamed from: c */
    public long f11721c;

    /* JADX INFO: renamed from: d */
    public int f11722d;

    /* JADX INFO: renamed from: e */
    public long f11723e;

    /* JADX INFO: renamed from: f */
    public Object f11724f;

    /* JADX INFO: renamed from: g */
    public Object f11725g;

    /* JADX INFO: renamed from: h */
    public Object f11726h;

    /* JADX INFO: renamed from: i */
    public Object f11727i;

    public /* synthetic */ C2916c() {
    }

    @Override // bb.InterfaceC2915b
    /* JADX INFO: renamed from: a */
    public void mo8501a(int i13, long j7) {
        switch (this.f11719a) {
            case 0:
                ((InterfaceC33648q) this.f11724f).mo3109v(new C2920g((C2918e) this.f11726h, 1, i13, j7));
                InterfaceC33639k0 interfaceC33639k0 = (InterfaceC33639k0) this.f11725g;
                interfaceC33639k0.mo36173a((C34610p) this.f11727i);
                interfaceC33639k0.getClass();
                break;
            default:
                ((InterfaceC37369k) this.f11724f).mo3111x(new C16003d((C2918e) this.f11726h, 1, i13, j7));
                ((InterfaceC37377s) this.f11725g).mo102730a((C31521c0) this.f11727i);
                break;
        }
    }

    @Override // bb.InterfaceC2915b
    /* JADX INFO: renamed from: b */
    public void mo8502b(long j7) {
        switch (this.f11719a) {
            case 0:
                this.f11721c = j7;
                this.f11722d = 0;
                this.f11723e = 0L;
                break;
            default:
                this.f11721c = j7;
                this.f11722d = 0;
                this.f11723e = 0L;
                break;
        }
    }

    @Override // gn.InterfaceC16001b
    /* JADX INFO: renamed from: c */
    public boolean mo8505c(InterfaceC37368j interfaceC37368j, long j7) {
        int i13;
        int i14;
        long j13 = j7;
        while (j13 > 0 && (i13 = this.f11722d) < (i14 = this.f11720b)) {
            int iMo102731b = ((InterfaceC37377s) this.f11725g).mo102731b(interfaceC37368j, (int) Math.min(i14 - i13, j13), true);
            if (iMo102731b == -1) {
                j13 = 0;
            } else {
                this.f11722d += iMo102731b;
                j13 -= (long) iMo102731b;
            }
        }
        C2918e c2918e = (C2918e) this.f11726h;
        int i15 = c2918e.f11737c;
        int i16 = this.f11722d / i15;
        if (i16 > 0) {
            long jM71666D = this.f11721c + AbstractC24567y.m71666D(this.f11723e, 1000000L, c2918e.f11736b);
            int i17 = i16 * i15;
            int i18 = this.f11722d - i17;
            ((InterfaceC37377s) this.f11725g).mo102733d(jM71666D, 1, i17, i18, null);
            this.f11723e += (long) i16;
            this.f11722d = i18;
        }
        return j13 <= 0;
    }

    @Override // bb.InterfaceC2915b
    /* JADX INFO: renamed from: d */
    public boolean mo8504d(InterfaceC33646o interfaceC33646o, long j7) {
        int i13;
        int i14;
        long j13 = j7;
        while (j13 > 0 && (i13 = this.f11722d) < (i14 = this.f11720b)) {
            int iMo36175c = ((InterfaceC33639k0) this.f11725g).mo36175c(interfaceC33646o, (int) Math.min(i14 - i13, j13), true);
            if (iMo36175c == -1) {
                j13 = 0;
            } else {
                this.f11722d += iMo36175c;
                j13 -= (long) iMo36175c;
            }
        }
        C2918e c2918e = (C2918e) this.f11726h;
        int i15 = c2918e.f11737c;
        int i16 = this.f11722d / i15;
        if (i16 > 0) {
            long j14 = this.f11721c;
            long j15 = this.f11723e;
            long j16 = c2918e.f11736b;
            int i17 = AbstractC38065t.f163031a;
            long jM121903Q = j14 + AbstractC38065t.m121903Q(j15, 1000000L, j16, RoundingMode.DOWN);
            int i18 = i16 * i15;
            int i19 = this.f11722d - i18;
            ((InterfaceC33639k0) this.f11725g).mo36174b(jM121903Q, 1, i18, i19, null);
            this.f11723e += (long) i16;
            this.f11722d = i19;
        }
        return j13 <= 0;
    }

    public C2916c(InterfaceC37369k interfaceC37369k, InterfaceC37377s interfaceC37377s, C2918e c2918e, String str, int i13) throws ParserException {
        this.f11724f = interfaceC37369k;
        this.f11725g = interfaceC37377s;
        this.f11726h = c2918e;
        int i14 = c2918e.f11735a;
        int i15 = c2918e.f11736b;
        int i16 = (c2918e.f11738d * i14) / 8;
        int i17 = c2918e.f11737c;
        if (i17 != i16) {
            StringBuilder sb4 = new StringBuilder(50);
            sb4.append("Expected block size: ");
            sb4.append(i16);
            sb4.append("; got: ");
            sb4.append(i17);
            throw ParserException.m15562a(null, sb4.toString());
        }
        int i18 = i15 * i16;
        int i19 = i18 * 8;
        int iMax = Math.max(i16, i18 / 10);
        this.f11720b = iMax;
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130047k = str;
        c31518b0.f130042f = i19;
        c31518b0.f130043g = i19;
        c31518b0.f130048l = iMax;
        c31518b0.f130060x = i14;
        c31518b0.f130061y = i15;
        c31518b0.f130062z = i13;
        this.f11727i = new C31521c0(c31518b0);
    }

    public C2916c(InterfaceC33648q interfaceC33648q, InterfaceC33639k0 interfaceC33639k0, C2918e c2918e, String str, int i13) throws androidx.media3.common.ParserException {
        this.f11724f = interfaceC33648q;
        this.f11725g = interfaceC33639k0;
        this.f11726h = c2918e;
        int i14 = c2918e.f11735a;
        int i15 = c2918e.f11736b;
        int i16 = (c2918e.f11738d * i14) / 8;
        int i17 = c2918e.f11737c;
        if (i17 == i16) {
            int i18 = i15 * i16;
            int i19 = i18 * 8;
            int iMax = Math.max(i16, i18 / 10);
            this.f11720b = iMax;
            C34608o c34608o = new C34608o();
            c34608o.f145740l = AbstractC34587d0.m109382o("audio/wav");
            c34608o.f145741m = AbstractC34587d0.m109382o(str);
            c34608o.f145736h = i19;
            c34608o.f145737i = i19;
            c34608o.f145742n = iMax;
            c34608o.f145719C = i14;
            c34608o.f145720D = i15;
            c34608o.f145721E = i13;
            this.f11727i = new C34610p(c34608o);
            return;
        }
        throw androidx.media3.common.ParserException.m5049a(null, "Expected block size: " + i16 + "; got: " + i17);
    }
}
