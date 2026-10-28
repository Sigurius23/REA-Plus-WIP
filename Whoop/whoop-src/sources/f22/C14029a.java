package f22;

import c93.InterfaceC4339a;
import g22.C15284d;

/* JADX INFO: renamed from: f22.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C14029a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50057w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15284d f50058x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f50059y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f50060z;

    public /* synthetic */ C14029a(C15284d c15284d, String str, String str2, int i13) {
        this.f50057w = i13;
        this.f50058x = c15284d;
        this.f50059y = str;
        this.f50060z = str2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f50057w) {
            case 0:
                return AbstractC14031c.m39949w(this.f50058x, this.f50059y, this.f50060z);
            default:
                return AbstractC14031c.m39925C(this.f50058x, this.f50059y, this.f50060z);
        }
    }
}
