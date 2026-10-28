package com.whoop.profile.view.edit;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import ek2.AbstractC13305b;
import eu.C13612g;
import ev2.AbstractC13712u;
import j11.AbstractC21206i;
import j11.EnumC21212o;
import j11.EnumC21213p;
import java.util.Map;
import kz2.AbstractC22926c;
import p164g2.C15247s;
import p238j0.InterfaceC21083i;
import p329n0.C26068u;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import vy0.AbstractC36588p;
import w41.AbstractC36826z;
import w41.C36806f;
import wt2.AbstractC37636q;
import x41.AbstractC37959g;
import yt2.AbstractC39782m;
import zv2.AbstractC41172h;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9785i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f28506E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f28507F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f28508G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f28509H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f28510I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f28511J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f28512K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28513w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f28514x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f28515y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f28516z;

    public /* synthetic */ C9785i(Modifier modifier, String str, String str2, String str3, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f28513w = 9;
        this.f28516z = modifier;
        this.f28509H = str;
        this.f28510I = str2;
        this.f28512K = str3;
        this.f28514x = z4;
        this.f28515y = z13;
        this.f28506E = interfaceC4339a;
        this.f28511J = interfaceC4339a2;
        this.f28507F = i13;
        this.f28508G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28513w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return EditProfileBottomSheetKt.BottomSheetFrame$lambda$1((TextResource) this.f28516z, (TextResource) this.f28509H, (InterfaceC4339a) this.f28506E, (InterfaceC4339a) this.f28511J, this.f28514x, this.f28515y, (TextResource) this.f28510I, (InterfaceC4351m) this.f28512K, this.f28507F, this.f28508G, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13305b.m37392m(this.f28514x, (String) this.f28509H, this.f28515y, (String) this.f28510I, (TextResource) this.f28516z, (Function1) this.f28511J, (InterfaceC4339a) this.f28506E, (Function1) this.f28512K, this.f28507F, this.f28508G, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC13712u.m38775b0((InterfaceC25312u) this.f28516z, (InterfaceC21083i) this.f28509H, (Map) this.f28510I, (C26068u) this.f28506E, (Function1) this.f28511J, (Modifier) this.f28512K, this.f28514x, this.f28515y, this.f28507F, this.f28508G, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC21206i.m59468i((TextResource) this.f28516z, this.f28514x, (InterfaceC4339a) this.f28506E, (EnumC21212o) this.f28509H, this.f28515y, (Integer) this.f28510I, (EnumC21213p) this.f28511J, (InterfaceC4351m) this.f28512K, this.f28507F, this.f28508G, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC22926c.m66674m((TextResource) this.f28516z, (TextResource) this.f28509H, (TextResource) this.f28510I, (InterfaceC4339a) this.f28506E, (TextResource) this.f28512K, (InterfaceC4339a) this.f28511J, this.f28514x, this.f28515y, this.f28507F, this.f28508G, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC36588p.m117445f0((C29891y) this.f28516z, (Function1) this.f28509H, (String) this.f28510I, (InterfaceC4339a) this.f28506E, (C15247s) this.f28511J, this.f28514x, this.f28515y, (Modifier) this.f28512K, this.f28507F, this.f28508G, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC37959g.m121567h((C36806f) this.f28516z, (AbstractC36826z.a) this.f28509H, this.f28514x, this.f28515y, (C13612g) this.f28510I, this.f28507F, (Function1) this.f28506E, (Function1) this.f28511J, (Function1) this.f28512K, this.f28508G, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC39782m.m127447W((AbstractC37636q.c) this.f28516z, (String) this.f28509H, this.f28514x, (Function1) this.f28510I, (Function1) this.f28506E, (Function1) this.f28511J, this.f28515y, (Function1) this.f28512K, this.f28507F, this.f28508G, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC39782m.m127432H((AbstractC37636q) this.f28516z, (String) this.f28509H, this.f28514x, (Function1) this.f28510I, (Function1) this.f28506E, (Function1) this.f28511J, this.f28515y, (Function1) this.f28512K, this.f28507F, this.f28508G, (Composer) obj, iIntValue9);
            default:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC41172h.m133788I((Modifier) this.f28516z, (String) this.f28509H, (String) this.f28510I, (String) this.f28512K, this.f28514x, this.f28515y, (InterfaceC4339a) this.f28506E, (InterfaceC4339a) this.f28511J, this.f28507F, this.f28508G, (Composer) obj, iIntValue10);
        }
    }

    public /* synthetic */ C9785i(TextResource textResource, TextResource textResource2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z4, boolean z13, TextResource textResource3, InterfaceC4351m interfaceC4351m, int i13, int i14) {
        this.f28513w = 0;
        this.f28516z = textResource;
        this.f28509H = textResource2;
        this.f28506E = interfaceC4339a;
        this.f28511J = interfaceC4339a2;
        this.f28514x = z4;
        this.f28515y = z13;
        this.f28510I = textResource3;
        this.f28512K = interfaceC4351m;
        this.f28507F = i13;
        this.f28508G = i14;
    }

    public /* synthetic */ C9785i(TextResource textResource, TextResource textResource2, TextResource textResource3, InterfaceC4339a interfaceC4339a, TextResource textResource4, InterfaceC4339a interfaceC4339a2, boolean z4, boolean z13, int i13, int i14) {
        this.f28513w = 4;
        this.f28516z = textResource;
        this.f28509H = textResource2;
        this.f28510I = textResource3;
        this.f28506E = interfaceC4339a;
        this.f28512K = textResource4;
        this.f28511J = interfaceC4339a2;
        this.f28514x = z4;
        this.f28515y = z13;
        this.f28507F = i13;
        this.f28508G = i14;
    }

    public /* synthetic */ C9785i(TextResource textResource, boolean z4, InterfaceC4339a interfaceC4339a, EnumC21212o enumC21212o, boolean z13, Integer num, EnumC21213p enumC21213p, InterfaceC4351m interfaceC4351m, int i13, int i14) {
        this.f28513w = 3;
        this.f28516z = textResource;
        this.f28514x = z4;
        this.f28506E = interfaceC4339a;
        this.f28509H = enumC21212o;
        this.f28515y = z13;
        this.f28510I = num;
        this.f28511J = enumC21213p;
        this.f28512K = interfaceC4351m;
        this.f28507F = i13;
        this.f28508G = i14;
    }

    public /* synthetic */ C9785i(InterfaceC25312u interfaceC25312u, InterfaceC21083i interfaceC21083i, Map map, C26068u c26068u, Function1 function1, Modifier modifier, boolean z4, boolean z13, int i13, int i14) {
        this.f28513w = 2;
        this.f28516z = interfaceC25312u;
        this.f28509H = interfaceC21083i;
        this.f28510I = map;
        this.f28506E = c26068u;
        this.f28511J = function1;
        this.f28512K = modifier;
        this.f28514x = z4;
        this.f28515y = z13;
        this.f28507F = i13;
        this.f28508G = i14;
    }

    public /* synthetic */ C9785i(C29891y c29891y, Function1 function1, String str, InterfaceC4339a interfaceC4339a, C15247s c15247s, boolean z4, boolean z13, Modifier modifier, int i13, int i14) {
        this.f28513w = 5;
        this.f28516z = c29891y;
        this.f28509H = function1;
        this.f28510I = str;
        this.f28506E = interfaceC4339a;
        this.f28511J = c15247s;
        this.f28514x = z4;
        this.f28515y = z13;
        this.f28512K = modifier;
        this.f28507F = i13;
        this.f28508G = i14;
    }

    public /* synthetic */ C9785i(C36806f c36806f, AbstractC36826z.a aVar, boolean z4, boolean z13, C13612g c13612g, int i13, Function1 function1, Function1 function2, Function1 function3, int i14) {
        this.f28513w = 6;
        this.f28516z = c36806f;
        this.f28509H = aVar;
        this.f28514x = z4;
        this.f28515y = z13;
        this.f28510I = c13612g;
        this.f28507F = i13;
        this.f28506E = function1;
        this.f28511J = function2;
        this.f28512K = function3;
        this.f28508G = i14;
    }

    public /* synthetic */ C9785i(AbstractC37636q abstractC37636q, String str, boolean z4, Function1 function1, Function1 function2, Function1 function3, boolean z13, Function1 function4, int i13, int i14, int i15) {
        this.f28513w = i15;
        this.f28516z = abstractC37636q;
        this.f28509H = str;
        this.f28514x = z4;
        this.f28510I = function1;
        this.f28506E = function2;
        this.f28511J = function3;
        this.f28515y = z13;
        this.f28512K = function4;
        this.f28507F = i13;
        this.f28508G = i14;
    }

    public /* synthetic */ C9785i(boolean z4, String str, boolean z13, String str2, TextResource textResource, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13, int i14) {
        this.f28513w = 1;
        this.f28514x = z4;
        this.f28509H = str;
        this.f28515y = z13;
        this.f28510I = str2;
        this.f28516z = textResource;
        this.f28511J = function1;
        this.f28506E = interfaceC4339a;
        this.f28512K = function2;
        this.f28507F = i13;
        this.f28508G = i14;
    }
}
