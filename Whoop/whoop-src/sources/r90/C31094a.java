package r90;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: r90.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C31094a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128247w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f128248x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C31103j f128249y;

    public /* synthetic */ C31094a(Function1 function1, C31103j c31103j, int i13) {
        this.f128247w = i13;
        this.f128248x = function1;
        this.f128249y = c31103j;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f128247w) {
            case 0:
                return AbstractC31096c.m95761j(this.f128248x, this.f128249y);
            case 1:
                return AbstractC31096c.m95765n(this.f128248x, this.f128249y);
            default:
                return AbstractC31101h.m95835p(this.f128248x, this.f128249y);
        }
    }
}
