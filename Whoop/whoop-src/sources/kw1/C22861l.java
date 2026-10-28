package kw1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kw1.l */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22861l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f90123E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90124w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ProgressContent f90125x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f90126y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f90127z;

    public /* synthetic */ C22861l(ProgressContent progressContent, Function1 function1, int i13, int i14, int i15) {
        this.f90124w = i15;
        this.f90125x = progressContent;
        this.f90126y = function1;
        this.f90127z = i13;
        this.f90123E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f90124w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC22862m.m66399i(this.f90125x, this.f90126y, this.f90127z, this.f90123E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22863n.m66408i(this.f90125x, this.f90126y, this.f90127z, this.f90123E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC22867r.m66418i(this.f90125x, this.f90126y, this.f90127z, this.f90123E, (Composer) obj, iIntValue3);
        }
    }
}
