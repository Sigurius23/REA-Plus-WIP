package mp0;

import android.view.View;
import com.whoop.coaching.sleepcoach.wizard.C6245g;
import op0.EnumC28083a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mp0.g0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C25829g0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101668w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25831h0 f101669x;

    public /* synthetic */ C25829g0(C25831h0 c25831h0, int i13) {
        this.f101668w = i13;
        this.f101669x = c25831h0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101668w) {
            case 0:
                return C25831h0.m76212Z(this.f101669x, (C25835j0) obj);
            case 1:
                return C25831h0.m76213a0(this.f101669x, ((Boolean) obj).booleanValue());
            case 2:
                return C25831h0.m76214b0(this.f101669x, (EnumC28083a) obj);
            case 3:
                return C25831h0.m76215c0(this.f101669x, ((Boolean) obj).booleanValue());
            case 4:
                return C25831h0.m76219g0(this.f101669x, (C6245g) obj);
            case 5:
                return C25831h0.m76220h0(this.f101669x, (C6245g) obj);
            default:
                return C25831h0.m76221i0(this.f101669x, (View) obj);
        }
    }
}
