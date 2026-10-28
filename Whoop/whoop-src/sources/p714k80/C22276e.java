package p714k80;

import com.whoop.activation.view.ActivationFragment;
import io.sentry.InterfaceC20259b1;
import l80.AbstractC23438o;
import p715kotlin.jvm.functions.Function1;
import rr2.C31778o;

/* JADX INFO: renamed from: k80.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22276e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f86941w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f86942x;

    public /* synthetic */ C22276e(Object obj, int i13) {
        this.f86941w = i13;
        this.f86942x = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f86941w) {
            case 0:
                return ActivationFragment.m17204b0(this.f86942x, (AbstractC23438o) obj);
            default:
                return C31778o.m98669B(this.f86942x, "v2", (InterfaceC20259b1) obj);
        }
    }
}
