package q11;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: q11.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C29796f implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f121823E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121824w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f121825x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f121826y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C29799i f121827z;

    public /* synthetic */ C29796f(Function1 function1, int i13, C29799i c29799i, InterfaceC28601c1 interfaceC28601c1, int i14) {
        this.f121824w = i14;
        this.f121825x = function1;
        this.f121826y = i13;
        this.f121827z = c29799i;
        this.f121823E = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f121824w) {
            case 0:
                return AbstractC29798h.m91280o(this.f121825x, this.f121826y, this.f121827z, this.f121823E);
            default:
                return AbstractC29798h.m91282q(this.f121825x, this.f121826y, this.f121827z, this.f121823E);
        }
    }
}
