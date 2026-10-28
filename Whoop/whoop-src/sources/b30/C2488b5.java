package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b30.b5 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2488b5 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f9696E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Modifier f9697F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f9698G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9699w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f9700x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f9701y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f9702z;

    public /* synthetic */ C2488b5(float f13, boolean z4, boolean z13, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f9699w = i14;
        this.f9700x = f13;
        this.f9701y = z4;
        this.f9702z = z13;
        this.f9696E = function1;
        this.f9697F = modifier;
        this.f9698G = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9699w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2592o5.m7505c(this.f9700x, this.f9701y, this.f9702z, this.f9696E, this.f9697F, (Composer) obj, AbstractC28683x.m87244L(this.f9698G | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2592o5.m7506d(this.f9700x, this.f9701y, this.f9702z, this.f9696E, this.f9697F, (Composer) obj, AbstractC28683x.m87244L(this.f9698G | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
