package p163g1;

import androidx.compose.material.AbstractC1118c;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import qj2.AbstractC30437b;

/* JADX INFO: renamed from: g1.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15116q0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56631w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC39171c f56632x;

    public /* synthetic */ C15116q0(int i13, InterfaceC39171c interfaceC39171c) {
        this.f56631w = i13;
        this.f56632x = interfaceC39171c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f56631w) {
            case 0:
                ((Float) obj).floatValue();
                return Float.valueOf(this.f56632x.mo743q0(AbstractC15108p2.f56602a));
            case 1:
                ((Float) obj).floatValue();
                return Float.valueOf(this.f56632x.mo743q0(AbstractC1118c.f4722a));
            default:
                return Integer.valueOf(AbstractC30437b.m93104i(this.f56632x, ((Integer) obj).intValue()));
        }
    }
}
