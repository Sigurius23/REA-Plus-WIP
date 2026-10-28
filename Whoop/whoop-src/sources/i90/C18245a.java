package i90;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4356r;
import g80.C15565f;
import j90.AbstractC21428a;
import p715kotlin.jvm.functions.Function1;
import p80.AbstractC28968a;

/* JADX INFO: renamed from: i90.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C18245a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f71031E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f71032F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC4356r f71033G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f71034H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71035w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15565f f71036x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f71037y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f71038z;

    public /* synthetic */ C18245a(C15565f c15565f, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4356r interfaceC4356r, int i13, int i14) {
        this.f71035w = i14;
        this.f71036x = c15565f;
        this.f71037y = function1;
        this.f71038z = function2;
        this.f71031E = function3;
        this.f71032F = function4;
        this.f71033G = interfaceC4356r;
        this.f71034H = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f71035w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18246b.m52562g(this.f71036x, this.f71037y, this.f71038z, this.f71031E, this.f71032F, this.f71033G, this.f71034H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21428a.m60315g(this.f71036x, this.f71037y, this.f71038z, this.f71031E, this.f71032F, this.f71033G, this.f71034H, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC28968a.m87974g(this.f71036x, this.f71037y, this.f71038z, this.f71031E, this.f71032F, this.f71033G, this.f71034H, (Composer) obj, iIntValue3);
        }
    }
}
