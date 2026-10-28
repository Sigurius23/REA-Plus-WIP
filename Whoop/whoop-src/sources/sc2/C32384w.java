package sc2;

import android.view.View;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sc2.w */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32384w implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134101w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32386y f134102x;

    public /* synthetic */ C32384w(C32386y c32386y, int i13) {
        this.f134101w = i13;
        this.f134102x = c32386y;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134101w) {
            case 0:
                return C32386y.m100950a0(this.f134102x, (C32383v) obj);
            case 1:
                return C32386y.m100951b0(this.f134102x, (MembershipStatus) obj);
            case 2:
                return C32386y.m100952c0(this.f134102x, (C32367f) obj);
            default:
                return C32386y.m100943T(this.f134102x, (View) obj);
        }
    }
}
