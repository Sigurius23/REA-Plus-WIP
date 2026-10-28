package c41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseLegendStyle;
import vo1.AbstractC36249x;

/* JADX INFO: renamed from: c41.l1 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4063l1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f16504E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16505w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f16506x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f16507y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f16508z;

    public /* synthetic */ C4063l1(int i13, int i14, int i15, long j7, Object obj) {
        this.f16505w = i15;
        this.f16504E = obj;
        this.f16506x = j7;
        this.f16507y = i13;
        this.f16508z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16505w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4070m1.m12476e((TextResource) this.f16504E, this.f16506x, this.f16507y, this.f16508z, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36249x.m115614L((PhaseLegendStyle) this.f16504E, this.f16506x, this.f16507y, this.f16508z, (Composer) obj, iIntValue2);
        }
    }
}
