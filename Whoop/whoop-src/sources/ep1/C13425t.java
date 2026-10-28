package ep1;

import c93.InterfaceC4339a;
import cp1.C11019f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ep1.t */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13425t implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f47020w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f47021x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11019f f47022y;

    public /* synthetic */ C13425t(C11019f c11019f, Function1 function1) {
        this.f47022y = c11019f;
        this.f47021x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f47020w) {
            case 0:
                return AbstractC13426u.m38082p(this.f47022y, this.f47021x);
            default:
                return AbstractC13426u.m38083q(this.f47021x, this.f47022y);
        }
    }

    public /* synthetic */ C13425t(Function1 function1, C11019f c11019f) {
        this.f47021x = function1;
        this.f47022y = c11019f;
    }
}
