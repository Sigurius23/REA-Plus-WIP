package p179h;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C16346d extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f62859w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f62860x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f62861y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f62862z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16346d(boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        super(2);
        this.f62859w = z4;
        this.f62860x = interfaceC4339a;
        this.f62861y = i13;
        this.f62862z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM87244L = AbstractC28683x.m87244L(this.f62861y | 1);
        int i13 = this.f62862z;
        AbstractC20301a.m56332c(this.f62860x, this.f62859w, (Composer) obj, iM87244L, i13);
        return C23454a0.f92919a;
    }
}
