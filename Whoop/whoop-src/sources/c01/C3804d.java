package c01;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.AbstractC4013e0;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import gz2.AbstractC16338e;
import qs1.AbstractC30574a;

/* JADX INFO: renamed from: c01.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3804d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f15561E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f15562F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15563w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f15564x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f15565y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f15566z;

    public /* synthetic */ C3804d(int i13, int i14, int i15, Modifier modifier, TextResource textResource, TextResource textResource2) {
        this.f15563w = i15;
        this.f15564x = textResource;
        this.f15565y = textResource2;
        this.f15566z = modifier;
        this.f15561E = i13;
        this.f15562F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15563w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3805e.m11631w(this.f15566z, this.f15564x, this.f15565y, this.f15561E, this.f15562F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f15566z;
                return AbstractC4013e0.m12190n(this.f15564x, this.f15565y, modifier, this.f15561E, this.f15562F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f15566z;
                return AbstractC16338e.m46544c(this.f15564x, this.f15565y, modifier2, this.f15561E, this.f15562F, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                Modifier modifier3 = this.f15566z;
                return AbstractC30574a.m93771u(this.f15564x, this.f15565y, modifier3, this.f15561E, this.f15562F, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ C3804d(Modifier modifier, TextResource textResource, TextResource textResource2, int i13, int i14) {
        this.f15563w = 0;
        this.f15566z = modifier;
        this.f15564x = textResource;
        this.f15565y = textResource2;
        this.f15561E = i13;
        this.f15562F = i14;
    }
}
