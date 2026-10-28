package p545v6;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import g31.AbstractC15299c;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p335n6.InterfaceC26398o;
import p390p1.AbstractC28683x;
import p470rv.AbstractC31834n;
import p477s2.AbstractC32069a;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: v6.e */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C35716e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC23459e f151952E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f151953F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f151954G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151955w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f151956x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f151957y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f151958z;

    public /* synthetic */ C35716e(Object obj, int i13, int i14, InterfaceC23459e interfaceC23459e, int i15, int i16, int i17) {
        this.f151955w = i17;
        this.f151956x = obj;
        this.f151957y = i13;
        this.f151958z = i14;
        this.f151952E = interfaceC23459e;
        this.f151953F = i15;
        this.f151954G = i16;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f151955w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC31834n.m98892a((InterfaceC26398o) this.f151956x, this.f151957y, this.f151958z, (C37816b) this.f151952E, (Composer) obj, AbstractC28683x.m87244L(this.f151953F | 1), this.f151954G);
                return C23454a0.f92919a;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC32069a.m99667e((InterfaceC26398o) this.f151956x, this.f151957y, this.f151958z, (C37816b) this.f151952E, (Composer) obj, AbstractC28683x.m87244L(this.f151953F | 1), this.f151954G);
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC15299c.m43425i((Modifier) this.f151956x, this.f151957y, this.f151958z, (Function1) this.f151952E, this.f151953F, this.f151954G, (Composer) obj, iIntValue);
        }
    }
}
