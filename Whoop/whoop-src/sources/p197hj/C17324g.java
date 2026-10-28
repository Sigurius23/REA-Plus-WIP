package p197hj;

import android.os.Handler;
import android.os.Looper;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.C4861a;
import l83.C23454a0;
import p328mj.C25600g;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17324g extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67108w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4861a f67109x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17324g(C4861a c4861a, int i13) {
        super(0);
        this.f67108w = i13;
        this.f67109x = c4861a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f67108w) {
            case 0:
                return "AmplitudeEngagement initialized with API key: " + this.f67109x.f20260a;
            case 1:
                return new C25600g(this.f67109x);
            default:
                new Handler(Looper.getMainLooper()).post(new RunnableC17335r(this.f67109x, 1));
                return C23454a0.f92919a;
        }
    }
}
