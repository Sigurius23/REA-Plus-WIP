package bm0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import kd1.AbstractC22403o;
import lm1.AbstractC24513c;
import yw1.AbstractC39828o;

/* JADX INFO: renamed from: bm0.p */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3413p implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13302w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC22403o f13303x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f13304y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f13305z;

    public /* synthetic */ C3413p(String str, AbstractC22403o abstractC22403o, int i13) {
        this.f13302w = 2;
        this.f13304y = str;
        this.f13303x = abstractC22403o;
        this.f13305z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f13302w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3415r.m9845p(this.f13303x, this.f13304y, this.f13305z, composer, iIntValue);
            case 1:
                return AbstractC24513c.m71387j(this.f13303x, this.f13304y, this.f13305z, composer, iIntValue);
            default:
                return AbstractC39828o.m127763h(this.f13304y, this.f13303x, this.f13305z, composer, iIntValue);
        }
    }

    public /* synthetic */ C3413p(AbstractC22403o abstractC22403o, String str, int i13, int i14) {
        this.f13302w = i14;
        this.f13303x = abstractC22403o;
        this.f13304y = str;
        this.f13305z = i13;
    }
}
