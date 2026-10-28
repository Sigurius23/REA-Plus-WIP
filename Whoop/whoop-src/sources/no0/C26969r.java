package no0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no0.r */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26969r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107590w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f107591x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f107592y;

    public /* synthetic */ C26969r(String str, Function1 function1) {
        this.f107590w = 2;
        this.f107592y = str;
        this.f107591x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f107590w) {
            case 0:
                return AbstractC26971s.m80796t(this.f107591x, this.f107592y);
            case 1:
                return AbstractC26979w.m80840H(this.f107591x, this.f107592y);
            default:
                return AbstractC26958l0.m80607N(this.f107592y, this.f107591x);
        }
    }

    public /* synthetic */ C26969r(Function1 function1, String str, int i13) {
        this.f107590w = i13;
        this.f107591x = function1;
        this.f107592y = str;
    }
}
