package dn0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bn0.C3497e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p043c4.C3948a0;
import p208i2.InterfaceC17869a1;
import p292l1.AbstractC23079d0;
import p292l1.C23204y;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: dn0.o */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12215o implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f40854E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f40855F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f40856G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC23459e f40857H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f40858I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f40859J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f40860K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC23459e f40861L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40862w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f40863x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f40864y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f40865z;

    public /* synthetic */ C12215o(Modifier modifier, C3497e c3497e, float f13, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f40864y = modifier;
        this.f40856G = c3497e;
        this.f40865z = f13;
        this.f40857H = function1;
        this.f40858I = function2;
        this.f40859J = function3;
        this.f40860K = function4;
        this.f40861L = function5;
        this.f40863x = interfaceC4339a;
        this.f40854E = i13;
        this.f40855F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40862w) {
            case 0:
                return AbstractC12216p.m33895V(this.f40864y, (C3497e) this.f40856G, this.f40865z, (Function1) this.f40857H, (Function1) this.f40858I, (Function1) this.f40859J, (Function1) this.f40860K, (Function1) this.f40861L, this.f40863x, this.f40854E, this.f40855F, (Composer) obj, ((Integer) obj2).intValue());
            default:
                ((Integer) obj2).getClass();
                AbstractC23079d0.m67054a(this.f40863x, (C37816b) this.f40856G, this.f40864y, (InterfaceC4351m) this.f40857H, (InterfaceC17869a1) this.f40858I, this.f40865z, (C23204y) this.f40859J, (C3948a0) this.f40860K, (C37816b) this.f40861L, (Composer) obj, AbstractC28683x.m87244L(this.f40854E | 1), this.f40855F);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C12215o(InterfaceC4339a interfaceC4339a, C37816b c37816b, Modifier modifier, InterfaceC4351m interfaceC4351m, InterfaceC17869a1 interfaceC17869a1, float f13, C23204y c23204y, C3948a0 c3948a0, C37816b c37816b2, int i13, int i14) {
        this.f40863x = interfaceC4339a;
        this.f40856G = c37816b;
        this.f40864y = modifier;
        this.f40857H = interfaceC4351m;
        this.f40858I = interfaceC17869a1;
        this.f40865z = f13;
        this.f40859J = c23204y;
        this.f40860K = c3948a0;
        this.f40861L = c37816b2;
        this.f40854E = i13;
        this.f40855F = i14;
    }
}
