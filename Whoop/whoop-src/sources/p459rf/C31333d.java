package p459rf;

import c93.InterfaceC4339a;
import ud3.C34835q;
import ud3.InterfaceC34833p;

/* JADX INFO: renamed from: rf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C31333d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128930w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f128931x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC34833p f128932y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C31335f f128933z;

    public /* synthetic */ C31333d(int i13, InterfaceC34833p interfaceC34833p, C31335f c31335f, int i14) {
        this.f128930w = i14;
        this.f128931x = i13;
        this.f128932y = interfaceC34833p;
        this.f128933z = c31335f;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f128930w) {
            case 0:
                StringBuilder sb4 = new StringBuilder("connection acquired: conn(id=");
                sb4.append(this.f128931x);
                sb4.append(")=");
                sb4.append(this.f128932y);
                sb4.append("; connPool: total=");
                C34835q c34835q = this.f128933z.f128936a;
                sb4.append(c34835q.f146720a.f174745d.size());
                sb4.append(", idle=");
                sb4.append(c34835q.m109910b());
                return sb4.toString();
            default:
                StringBuilder sb5 = new StringBuilder("connection released: conn(id=");
                sb5.append(this.f128931x);
                sb5.append(")=");
                sb5.append(this.f128932y);
                sb5.append("; connPool: total=");
                C34835q c34835q2 = this.f128933z.f128936a;
                sb5.append(c34835q2.f146720a.f174745d.size());
                sb5.append(", idle=");
                sb5.append(c34835q2.m109910b());
                return sb5.toString();
        }
    }
}
