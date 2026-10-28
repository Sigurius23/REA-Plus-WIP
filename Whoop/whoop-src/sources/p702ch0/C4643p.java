package p702ch0;

import c93.InterfaceC4339a;
import p132f0.C13821r1;

/* JADX INFO: renamed from: ch0.p */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4643p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18876w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13821r1 f18877x;

    public /* synthetic */ C4643p(C13821r1 c13821r1, int i13) {
        this.f18876w = i13;
        this.f18877x = c13821r1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iM14529h;
        switch (this.f18876w) {
            case 0:
                iM14529h = AbstractC4639n.k.m14529h(this.f18877x);
                break;
            default:
                iM14529h = AbstractC4639n.m14476O(this.f18877x);
                break;
        }
        return Integer.valueOf(iM14529h);
    }
}
