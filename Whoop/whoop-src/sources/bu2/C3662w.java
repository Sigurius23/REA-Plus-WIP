package bu2;

import p181h2.C16617b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bu2.w */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C3662w implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14904w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f14905x;

    public /* synthetic */ C3662w(Function1 function1, int i13) {
        this.f14904w = i13;
        this.f14905x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14904w) {
            case 0:
                return AbstractC3663x.a.m11324b(this.f14905x, (C16617b) obj);
            case 1:
                return AbstractC3646g.m11246j(this.f14905x, obj);
            default:
                return AbstractC3663x.m11320x(this.f14905x, ((Float) obj).floatValue());
        }
    }
}
