package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import i93.InterfaceC18280f;
import java.util.List;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import wr0.AbstractC37557u0;

/* JADX INFO: renamed from: g1.o5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15101o5 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f56564E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Modifier f56565F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f56566G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f56567H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f56568I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f56569J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f56570K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56571w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f56572x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f56573y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f56574z;

    public /* synthetic */ C15101o5(float f13, Function1 function1, Modifier modifier, boolean z4, InterfaceC18280f interfaceC18280f, int i13, InterfaceC4339a interfaceC4339a, C15177w1 c15177w1, int i14, int i15) {
        this.f56564E = f13;
        this.f56573y = function1;
        this.f56565F = modifier;
        this.f56574z = z4;
        this.f56568I = interfaceC18280f;
        this.f56572x = i13;
        this.f56569J = interfaceC4339a;
        this.f56570K = c15177w1;
        this.f56566G = i14;
        this.f56567H = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56571w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC15019g6.m43120b(this.f56564E, this.f56573y, this.f56565F, this.f56574z, (InterfaceC18280f) this.f56568I, this.f56572x, (InterfaceC4339a) this.f56569J, (C15177w1) this.f56570K, (Composer) obj, AbstractC28683x.m87244L(this.f56566G | 1), this.f56567H);
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC37557u0.m120495Q((List) this.f56568I, this.f56572x, this.f56573y, (String) this.f56569J, this.f56574z, this.f56564E, this.f56565F, (InterfaceC4352n) this.f56570K, this.f56566G, this.f56567H, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C15101o5(List list, int i13, Function1 function1, String str, boolean z4, float f13, Modifier modifier, InterfaceC4352n interfaceC4352n, int i14, int i15) {
        this.f56568I = list;
        this.f56572x = i13;
        this.f56573y = function1;
        this.f56569J = str;
        this.f56574z = z4;
        this.f56564E = f13;
        this.f56565F = modifier;
        this.f56570K = interfaceC4352n;
        this.f56566G = i14;
        this.f56567H = i15;
    }
}
