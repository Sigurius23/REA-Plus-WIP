package e61;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import e81.AbstractC12842p;
import i93.InterfaceC18280f;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40304d6;

/* JADX INFO: renamed from: e61.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12760c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f43642E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f43643F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f43644G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f43645H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43646w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f43647x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f43648y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f43649z;

    public /* synthetic */ C12760c(int i13, float f13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Modifier modifier, int i14, int i15) {
        this.f43647x = i13;
        this.f43648y = f13;
        this.f43644G = interfaceC4339a;
        this.f43645H = interfaceC4339a2;
        this.f43649z = modifier;
        this.f43642E = i14;
        this.f43643F = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43646w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12761d.m35711c((Modifier) this.f43649z, this.f43648y, this.f43647x, (TextResource) this.f43644G, (TextResource) this.f43645H, this.f43642E, this.f43643F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC12842p.m36044e(this.f43647x, this.f43648y, (InterfaceC4339a) this.f43644G, (InterfaceC4339a) this.f43645H, (Modifier) this.f43649z, this.f43642E, this.f43643F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC40304d6.m129536T((String) this.f43649z, this.f43648y, (InterfaceC18280f) this.f43644G, this.f43647x, (Function1) this.f43645H, this.f43642E, this.f43643F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C12760c(Modifier modifier, float f13, int i13, TextResource textResource, TextResource textResource2, int i14, int i15) {
        this.f43649z = modifier;
        this.f43648y = f13;
        this.f43647x = i13;
        this.f43644G = textResource;
        this.f43645H = textResource2;
        this.f43642E = i14;
        this.f43643F = i15;
    }

    public /* synthetic */ C12760c(String str, float f13, InterfaceC18280f interfaceC18280f, int i13, Function1 function1, int i14, int i15) {
        this.f43649z = str;
        this.f43648y = f13;
        this.f43644G = interfaceC18280f;
        this.f43647x = i13;
        this.f43645H = function1;
        this.f43642E = i14;
        this.f43643F = i15;
    }
}
