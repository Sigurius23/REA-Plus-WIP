package nm2;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: nm2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C26845a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107124w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26847c f107125x;

    public /* synthetic */ C26845a(C26847c c26847c, int i13) {
        this.f107124w = i13;
        this.f107125x = c26847c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107124w) {
            case 0:
                return C26847c.m80129I(this.f107125x, (C26848d) obj);
            default:
                return C26847c.m80125B(this.f107125x, (C26848d) obj);
        }
    }
}
