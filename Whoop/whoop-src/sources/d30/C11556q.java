package d30;

import h20.C16657g;
import h20.C16735t;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.q */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11556q implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37276w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16657g f37277x;

    public /* synthetic */ C11556q(C16657g c16657g, int i13) {
        this.f37276w = i13;
        this.f37277x = c16657g;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String code = (String) obj;
        switch (this.f37276w) {
            case 0:
                AbstractC22676k.m65750j(code, "code");
                return this.f37277x.m47228c(code);
            default:
                return Boolean.valueOf(!(code != null && this.f37277x.m47228c(code).equals(C16735t.f64290b)));
        }
    }
}
