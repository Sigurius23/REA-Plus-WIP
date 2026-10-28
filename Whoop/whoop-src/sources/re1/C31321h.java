package re1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.model.FeatureEducationParagraph;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: re1.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C31321h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f128899E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f128900F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128901w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FeatureEducationParagraph f128902x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f128903y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f128904z;

    public /* synthetic */ C31321h(FeatureEducationParagraph featureEducationParagraph, Function1 function1, boolean z4, int i13, int i14, int i15) {
        this.f128901w = i15;
        this.f128902x = featureEducationParagraph;
        this.f128903y = function1;
        this.f128904z = z4;
        this.f128899E = i13;
        this.f128900F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f128901w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC31323j.m96354a0(this.f128902x, this.f128903y, this.f128904z, this.f128899E, this.f128900F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC31323j.m96378m0(this.f128902x, this.f128903y, this.f128904z, this.f128899E, this.f128900F, (Composer) obj, iIntValue2);
        }
    }
}
