package kotlin;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.f0 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2002f0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f7965E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7966w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC39758e.k f7967x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f7968y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f7969z;

    public /* synthetic */ C2002f0(AbstractC39758e.k kVar, Function1 function1, int i13, int i14, int i15) {
        this.f7966w = i15;
        this.f7967x = kVar;
        this.f7968y = function1;
        this.f7969z = i13;
        this.f7965E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7966w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2005g0.m6190t(this.f7967x, this.f7968y, this.f7969z, this.f7965E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC2005g0.m6193w(this.f7967x, this.f7968y, this.f7969z, this.f7965E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC2005g0.m6187q(this.f7967x, this.f7968y, this.f7969z, this.f7965E, (Composer) obj, iIntValue3);
        }
    }
}
