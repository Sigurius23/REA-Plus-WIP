package is0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p21.AbstractC28752e;
import p21.C28754g;

/* JADX INFO: renamed from: is0.m */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20894m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78654w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f78655x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f78656y;

    public /* synthetic */ C20894m(float f13, Object obj, int i13) {
        this.f78654w = i13;
        this.f78655x = f13;
        this.f78656y = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f78654w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC20900p.m57862q(this.f78655x, (C20907s0) this.f78656y, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC28752e.m87504p(this.f78655x, (C28754g) this.f78656y, (Composer) obj, iIntValue2);
        }
    }
}
