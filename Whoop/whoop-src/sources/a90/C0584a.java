package a90;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4356r;
import g80.C15565f;
import p715kotlin.jvm.functions.Function1;
import y80.AbstractC39325b;

/* JADX INFO: renamed from: a90.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0584a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f2074E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4356r f2075F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f2076G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f2077H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2078w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15565f f2079x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f2080y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f2081z;

    public /* synthetic */ C0584a(C15565f c15565f, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, int i13, int i14, int i15) {
        this.f2078w = i15;
        this.f2079x = c15565f;
        this.f2080y = function1;
        this.f2081z = function2;
        this.f2074E = function3;
        this.f2075F = interfaceC4356r;
        this.f2076G = i13;
        this.f2077H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2078w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC0585b.m1520i(this.f2079x, this.f2080y, this.f2081z, this.f2074E, this.f2075F, this.f2076G, this.f2077H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39325b.m125299i(this.f2079x, this.f2080y, this.f2081z, this.f2074E, this.f2075F, this.f2076G, this.f2077H, (Composer) obj, iIntValue2);
        }
    }
}
