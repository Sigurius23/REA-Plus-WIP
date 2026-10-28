package ty1;

import c31.EnumC3919c;
import p510u0.InterfaceC34345p0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ty1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34261f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143699w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f143700x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C34266k f143701y;

    public /* synthetic */ C34261f(Function1 function1, C34266k c34266k, int i13) {
        this.f143699w = i13;
        this.f143700x = function1;
        this.f143701y = c34266k;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f143699w) {
            case 0:
                return AbstractC34264i.m108326C(this.f143700x, this.f143701y, (InterfaceC34345p0) obj);
            default:
                return AbstractC34264i.m108341R(this.f143700x, this.f143701y, (EnumC3919c) obj);
        }
    }
}
