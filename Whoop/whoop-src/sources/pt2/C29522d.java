package pt2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pt2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29522d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120159w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f120160x;

    public /* synthetic */ C29522d(Function1 function1, int i13) {
        this.f120159w = i13;
        this.f120160x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f120159w) {
            case 0:
                return AbstractC29527i.m90243O(this.f120160x);
            case 1:
                return AbstractC29540v.m90392Q(this.f120160x);
            default:
                return AbstractC29519b0.m90225j(this.f120160x);
        }
    }
}
