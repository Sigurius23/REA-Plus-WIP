package m81;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import np1.C27027e;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p530up.AbstractC35148d;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import pp1.AbstractC29436i;

/* JADX INFO: renamed from: m81.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C25228c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f99076E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f99077F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f99078G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f99079H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f99080I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f99081J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99082w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f99083x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f99084y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f99085z;

    public /* synthetic */ C25228c(String str, Modifier modifier, Map map, long j7, C23285v0 c23285v0, C23267m0 c23267m0, int i13, Function1 function1, int i14) {
        this.f99083x = str;
        this.f99078G = modifier;
        this.f99079H = map;
        this.f99084y = j7;
        this.f99080I = c23285v0;
        this.f99081J = c23267m0;
        this.f99085z = i13;
        this.f99076E = function1;
        this.f99077F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f99082w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC25230e.m73959o((List) this.f99078G, this.f99083x, this.f99084y, (C39174f) this.f99079H, (C25231f) this.f99080I, (C25231f) this.f99081J, this.f99076E, this.f99085z, this.f99077F, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                AbstractC35148d.m111174e(this.f99083x, (Modifier) this.f99078G, (Map) this.f99079H, this.f99084y, (C23285v0) this.f99080I, (C23267m0) this.f99081J, this.f99085z, this.f99076E, (Composer) obj, AbstractC28683x.m87244L(this.f99077F | 1));
                return C23454a0.f92919a;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC29436i.m89768f0((C27027e) this.f99078G, this.f99083x, (String) this.f99079H, this.f99084y, this.f99076E, (InterfaceC4339a) this.f99080I, (Function1) this.f99081J, this.f99085z, this.f99077F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C25228c(List list, String str, long j7, C39174f c39174f, C25231f c25231f, C25231f c25231f2, Function1 function1, int i13, int i14) {
        this.f99078G = list;
        this.f99083x = str;
        this.f99084y = j7;
        this.f99079H = c39174f;
        this.f99080I = c25231f;
        this.f99081J = c25231f2;
        this.f99076E = function1;
        this.f99085z = i13;
        this.f99077F = i14;
    }

    public /* synthetic */ C25228c(C27027e c27027e, String str, String str2, long j7, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13, int i14) {
        this.f99078G = c27027e;
        this.f99083x = str;
        this.f99079H = str2;
        this.f99084y = j7;
        this.f99076E = function1;
        this.f99080I = interfaceC4339a;
        this.f99081J = function2;
        this.f99085z = i13;
        this.f99077F = i14;
    }
}
