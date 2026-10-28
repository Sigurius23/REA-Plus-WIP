package mp0;

import android.view.View;
import com.whoop.coaching.sleepcoach.wizard.C6241c;
import com.whoop.coaching.sleepcoach.wizard.C6245g;
import op0.AbstractC28090h;
import op0.EnumC28083a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mp0.x0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C25863x0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101948w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25867z0 f101949x;

    public /* synthetic */ C25863x0(C25867z0 c25867z0, int i13) {
        this.f101948w = i13;
        this.f101949x = c25867z0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101948w) {
            case 0:
                return C25867z0.m76440c0(this.f101949x, (C6245g) obj);
            case 1:
                return C25867z0.m76441d0(this.f101949x, (C6245g) obj);
            case 2:
                return C25867z0.m76442e0(this.f101949x, (C6241c) obj);
            case 3:
                return C25867z0.m76443f0(this.f101949x, (View) obj);
            case 4:
                return C25867z0.m76444g0(this.f101949x, (EnumC28083a) obj);
            case 5:
                return C25867z0.m76455r0(this.f101949x, (View) obj);
            default:
                return C25867z0.m76459v0(this.f101949x, (AbstractC28090h) obj);
        }
    }
}
