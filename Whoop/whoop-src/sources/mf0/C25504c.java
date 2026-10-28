package mf0;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import vo1.AbstractC36232g;
import vp1.AbstractC36272h;

/* JADX INFO: renamed from: mf0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C25504c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99867w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f99868x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f99869y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f99870z;

    public /* synthetic */ C25504c(int i13, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f99867w = i13;
        this.f99868x = interfaceC28601c1;
        this.f99869y = function1;
        this.f99870z = interfaceC28601c2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f99867w) {
            case 0:
                return AbstractC25506e.m74939b0(this.f99868x, this.f99869y, this.f99870z);
            case 1:
                return AbstractC36232g.m115444R(this.f99868x, this.f99869y, this.f99870z);
            case 2:
                return AbstractC36272h.m115824d1(this.f99868x, this.f99870z, this.f99869y);
            case 3:
                return AbstractC36272h.m115889w1(this.f99869y, this.f99868x, this.f99870z);
            default:
                return AbstractC36272h.m115883u1(this.f99868x, this.f99869y, this.f99870z);
        }
    }

    public /* synthetic */ C25504c(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f99867w = 3;
        this.f99869y = function1;
        this.f99868x = interfaceC28601c1;
        this.f99870z = interfaceC28601c2;
    }

    public /* synthetic */ C25504c(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1) {
        this.f99867w = 2;
        this.f99868x = interfaceC28601c1;
        this.f99870z = interfaceC28601c2;
        this.f99869y = function1;
    }
}
