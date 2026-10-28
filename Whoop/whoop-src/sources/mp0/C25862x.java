package mp0;

import android.view.View;
import com.whoop.coaching.sleepcoach.wizard.C6239a;
import com.whoop.coaching.sleepcoach.wizard.ConductorViewState;
import op0.AbstractC28090h;
import op0.EnumC28083a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mp0.x */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C25862x implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101946w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25818b0 f101947x;

    public /* synthetic */ C25862x(C25818b0 c25818b0, int i13) {
        this.f101946w = i13;
        this.f101947x = c25818b0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101946w) {
            case 0:
                return C25818b0.m76113q0(this.f101947x, (C6239a) obj);
            case 1:
                return C25818b0.m76119w0(this.f101947x, ((Boolean) obj).booleanValue());
            case 2:
                return C25818b0.m76117u0(this.f101947x, ((Boolean) obj).booleanValue());
            case 3:
                return C25818b0.m76111o0(this.f101947x, (View) obj);
            case 4:
                return C25818b0.m76112p0(this.f101947x, (View) obj);
            case 5:
                return C25818b0.m76114r0(this.f101947x, (ConductorViewState) obj);
            case 6:
                return C25818b0.m76115s0(this.f101947x, (C25820c) obj);
            case 7:
                return C25818b0.m76118v0(this.f101947x, (View) obj);
            case 8:
                return C25818b0.m76120x0(this.f101947x, (EnumC28083a) obj);
            default:
                return C25818b0.m76121y0(this.f101947x, (AbstractC28090h) obj);
        }
    }
}
