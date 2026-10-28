package no0;

import a81.InterfaceC0569t;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no0.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26947g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107473w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f107474x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f107475y;

    public /* synthetic */ C26947g(Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f107473w = i13;
        this.f107474x = function1;
        this.f107475y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107473w) {
            case 0:
                return AbstractC26951i.m80534o(this.f107474x, this.f107475y, (InterfaceC0569t) obj);
            default:
                return AbstractC26958l0.m80619T(this.f107474x, this.f107475y, (String) obj);
        }
    }
}
