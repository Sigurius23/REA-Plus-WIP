package wr0;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: wr0.l */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37538l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160529w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f160530x;

    public /* synthetic */ C37538l(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f160529w = i13;
        this.f160530x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f160529w) {
            case 0:
                return AbstractC37540m.m120428t(this.f160530x);
            case 1:
                return AbstractC37540m.m120429u(this.f160530x);
            case 2:
                return AbstractC37540m.m120430v(this.f160530x);
            default:
                return AbstractC37540m.m120432x(this.f160530x);
        }
    }
}
