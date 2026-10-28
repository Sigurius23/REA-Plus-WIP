package c51;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p208i2.AbstractC17911t;

/* JADX INFO: renamed from: c51.i */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4232i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17152w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4242s f17153x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC17911t f17154y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f17155z;

    public /* synthetic */ C4232i(C4242s c4242s, AbstractC17911t abstractC17911t, int i13, int i14) {
        this.f17152w = i14;
        this.f17153x = c4242s;
        this.f17154y = abstractC17911t;
        this.f17155z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f17152w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC4234k.m13148U(this.f17153x, this.f17154y, this.f17155z, composer, iIntValue);
            default:
                return AbstractC4234k.m13151X(this.f17153x, this.f17154y, this.f17155z, composer, iIntValue);
        }
    }
}
