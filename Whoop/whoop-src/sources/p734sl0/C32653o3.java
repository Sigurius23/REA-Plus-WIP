package p734sl0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import ql0.InterfaceC30468c;

/* JADX INFO: renamed from: sl0.o3 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32653o3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f135399E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f135400F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC30468c f135401G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f135402H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ boolean f135403I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ boolean f135404J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int f135405K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f135406L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f135407M;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135408w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29891y f135409x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f135410y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f135411z;

    public /* synthetic */ C32653o3(int i13, Function1 function1, C29891y c29891y, InterfaceC4339a interfaceC4339a, boolean z4, boolean z13, InterfaceC30468c interfaceC30468c, boolean z14, boolean z15, EnumC32692x1 enumC32692x1, int i14, int i15) {
        this.f135402H = i13;
        this.f135410y = function1;
        this.f135409x = c29891y;
        this.f135411z = interfaceC4339a;
        this.f135399E = z4;
        this.f135400F = z13;
        this.f135401G = interfaceC30468c;
        this.f135403I = z14;
        this.f135404J = z15;
        this.f135407M = enumC32692x1;
        this.f135405K = i14;
        this.f135406L = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135408w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC32658p3.m102182G(this.f135402H, this.f135410y, this.f135409x, this.f135411z, this.f135399E, this.f135400F, this.f135401G, this.f135403I, this.f135404J, (EnumC32692x1) this.f135407M, this.f135405K, this.f135406L, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32658p3.m102219s(this.f135409x, this.f135410y, this.f135411z, this.f135399E, this.f135400F, this.f135401G, this.f135402H, (InterfaceC4339a) this.f135407M, this.f135403I, this.f135404J, this.f135405K, this.f135406L, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C32653o3(C29891y c29891y, Function1 function1, InterfaceC4339a interfaceC4339a, boolean z4, boolean z13, InterfaceC30468c interfaceC30468c, int i13, InterfaceC4339a interfaceC4339a2, boolean z14, boolean z15, int i14, int i15) {
        this.f135409x = c29891y;
        this.f135410y = function1;
        this.f135411z = interfaceC4339a;
        this.f135399E = z4;
        this.f135400F = z13;
        this.f135401G = interfaceC30468c;
        this.f135402H = i13;
        this.f135407M = interfaceC4339a2;
        this.f135403I = z14;
        this.f135404J = z15;
        this.f135405K = i14;
        this.f135406L = i15;
    }
}
