package c41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import nq2.AbstractC27062e;
import zi1.AbstractC40690t;

/* JADX INFO: renamed from: c41.p5 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4095p5 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16628E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16629w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f16630x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f16631y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f16632z;

    public /* synthetic */ C4095p5(Modifier modifier, TextResource textResource, int i13, int i14, int i15) {
        this.f16629w = i15;
        this.f16630x = modifier;
        this.f16631y = textResource;
        this.f16632z = i13;
        this.f16628E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16629w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4102q5.m12621c(this.f16630x, this.f16631y, this.f16632z, this.f16628E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC27062e.m81310H(this.f16630x, this.f16631y, this.f16632z, this.f16628E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC40690t.m132130e(this.f16630x, this.f16631y, this.f16632z, this.f16628E, (Composer) obj, iIntValue3);
        }
    }
}
