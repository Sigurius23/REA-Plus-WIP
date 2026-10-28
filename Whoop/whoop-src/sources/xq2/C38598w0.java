package xq2;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import mq2.C25889b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xq2.w0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C38598w0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f166064E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f166065F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C38562f0 f166066G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC2994c0 f166067H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f166068I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f166069J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f166070w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f166071x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f166072y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f166073z;

    public /* synthetic */ C38598w0(Object obj, int i13, int i14, int i15, int i16, Function1 function1, C38562f0 c38562f0, InterfaceC2994c0 interfaceC2994c0, int i17, int i18) {
        this.f166070w = i18;
        this.f166069J = obj;
        this.f166071x = i13;
        this.f166072y = i14;
        this.f166073z = i15;
        this.f166064E = i16;
        this.f166065F = function1;
        this.f166066G = c38562f0;
        this.f166067H = interfaceC2994c0;
        this.f166068I = i17;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f166070w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC38554c1.m123567U((Integer) this.f166069J, this.f166071x, this.f166072y, this.f166073z, this.f166064E, this.f166065F, this.f166066G, this.f166067H, this.f166068I, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC38554c1.m123565S((C25889b) this.f166069J, this.f166071x, this.f166072y, this.f166073z, this.f166064E, this.f166065F, this.f166066G, this.f166067H, this.f166068I, (Composer) obj, iIntValue2);
        }
    }
}
