package v90;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;

/* JADX INFO: renamed from: v90.m */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C35821m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ TextResource f152411E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f152412F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ TextResource f152413G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ boolean f152414H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC4339a f152415I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f152416J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int f152417K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f152418w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f152419x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f152420y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ TextResource f152421z;

    public /* synthetic */ C35821m(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, TextResource textResource5, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f152418w = i15;
        this.f152419x = textResource;
        this.f152420y = textResource2;
        this.f152421z = textResource3;
        this.f152411E = textResource4;
        this.f152412F = str;
        this.f152413G = textResource5;
        this.f152414H = z4;
        this.f152415I = interfaceC4339a;
        this.f152416J = i13;
        this.f152417K = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f152418w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC35822n.m113625k(this.f152419x, this.f152420y, this.f152421z, this.f152411E, this.f152412F, this.f152413G, this.f152414H, this.f152415I, this.f152416J, this.f152417K, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35829u.m113711i(this.f152419x, this.f152420y, this.f152421z, this.f152411E, this.f152412F, this.f152413G, this.f152414H, this.f152415I, this.f152416J, this.f152417K, (Composer) obj, iIntValue2);
        }
    }
}
