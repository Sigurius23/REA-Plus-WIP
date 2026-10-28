package c41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import k71.AbstractC22242b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c41.a1 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3986a1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16221E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16222w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f16223x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f16224y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f16225z;

    public /* synthetic */ C3986a1(Modifier modifier, List list, Function1 function1, int i13, int i14) {
        this.f16222w = i14;
        this.f16223x = modifier;
        this.f16224y = list;
        this.f16225z = function1;
        this.f16221E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16222w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3993b1.m12101y(this.f16223x, this.f16224y, this.f16225z, this.f16221E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22242b.m63767h(this.f16223x, this.f16224y, this.f16225z, this.f16221E, (Composer) obj, iIntValue2);
        }
    }
}
