package io2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import l83.C23454a0;
import p077d0.C11344e;
import p292l1.AbstractC23124k3;
import p292l1.C23067b0;
import p292l1.C23085e0;
import p292l1.C23147o2;
import p294l3.C23254g;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io2.q */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C20780q implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f78033E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f78034F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f78035G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78036w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f78037x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f78038y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f78039z;

    public /* synthetic */ C20780q(InterfaceC4339a interfaceC4339a, long j7, C23147o2 c23147o2, C11344e c11344e, C37816b c37816b, int i13) {
        this.f78036w = 3;
        this.f78035G = interfaceC4339a;
        this.f78033E = j7;
        this.f78037x = c23147o2;
        this.f78038y = c11344e;
        this.f78039z = c37816b;
        this.f78034F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f78036w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC20782s.m57287w((C23254g) this.f78035G, (C9598e) this.f78037x, (Function1) this.f78038y, (C23285v0) this.f78039z, this.f78033E, this.f78034F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC20782s.m57264I((String) this.f78035G, (C9598e) this.f78037x, (Function1) this.f78038y, (C23285v0) this.f78039z, this.f78033E, this.f78034F, (Composer) obj, iIntValue2);
            case 2:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(199681);
                ((C23067b0) this.f78035G).m67043a((Long) this.f78037x, this.f78034F, (C23085e0) this.f78038y, (Modifier) this.f78039z, this.f78033E, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            default:
                ((Integer) obj2).getClass();
                AbstractC23124k3.m67104h((InterfaceC4339a) this.f78035G, this.f78033E, (C23147o2) this.f78037x, (C11344e) this.f78038y, (C37816b) this.f78039z, (Composer) obj, AbstractC28683x.m87244L(this.f78034F | 1));
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C20780q(CharSequence charSequence, C9598e c9598e, Function1 function1, C23285v0 c23285v0, long j7, int i13, int i14) {
        this.f78036w = i14;
        this.f78035G = charSequence;
        this.f78037x = c9598e;
        this.f78038y = function1;
        this.f78039z = c23285v0;
        this.f78033E = j7;
        this.f78034F = i13;
    }

    public /* synthetic */ C20780q(C23067b0 c23067b0, Long l7, int i13, C23085e0 c23085e0, Modifier modifier, long j7, int i14) {
        this.f78036w = 2;
        this.f78035G = c23067b0;
        this.f78037x = l7;
        this.f78034F = i13;
        this.f78038y = c23085e0;
        this.f78039z = modifier;
        this.f78033E = j7;
    }
}
