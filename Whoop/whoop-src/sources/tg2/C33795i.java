package tg2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.elements.IdentifierSpec;
import i93.C18282h;
import i93.C18284j;
import java.util.List;
import java.util.Set;
import km0.C22582f;
import l83.C23454a0;
import lr2.C24701b;
import n82.C26457c;
import p390p1.AbstractC28683x;
import p479s4.AbstractC32131l;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25307p;
import uw0.AbstractC35296f;
import w72.C36913f;
import wb0.AbstractC37038i;
import wq2.AbstractC37513b;
import wt2.C37633n;
import yb0.AbstractC39388k;
import yo0.AbstractC39683e;
import yo0.C39684f;
import z21.AbstractC40020b;
import z72.AbstractC40161g;
import zt2.AbstractC41141j;

/* JADX INFO: renamed from: tg2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33795i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f141503E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f141504F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f141505G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f141506H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f141507w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f141508x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f141509y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f141510z;

    public /* synthetic */ C33795i(Modifier modifier, C24701b c24701b, boolean z4, C25307p c25307p, Function1 function1, int i13, int i14) {
        this.f141507w = 3;
        this.f141509y = modifier;
        this.f141504F = c24701b;
        this.f141508x = z4;
        this.f141506H = c25307p;
        this.f141505G = function1;
        this.f141510z = i13;
        this.f141503E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f141507w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33796j.m106935q((C26457c) this.f141504F, (Function1) this.f141505G, (Function1) this.f141506H, (Modifier) this.f141509y, this.f141508x, this.f141510z, this.f141503E, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                AbstractC32131l.m100070b((Set) this.f141504F, this.f141508x, (List) this.f141505G, (IdentifierSpec) this.f141506H, (Modifier) this.f141509y, (Composer) obj, AbstractC28683x.m87244L(this.f141510z | 1), this.f141503E);
                return C23454a0.f92919a;
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35296f.m112001x((C22582f) this.f141504F, (List) this.f141505G, this.f141508x, (InterfaceC4339a) this.f141506H, (InterfaceC4339a) this.f141509y, this.f141510z, this.f141503E, (Composer) obj, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC37513b.m120284k((Modifier) this.f141509y, (C24701b) this.f141504F, this.f141508x, (C25307p) this.f141506H, (Function1) this.f141505G, this.f141510z, this.f141503E, (Composer) obj, iIntValue3);
            case 4:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC39388k.m125726k1((AbstractC37038i) this.f141504F, this.f141508x, (Function1) this.f141505G, (Function1) this.f141506H, (Function1) this.f141509y, this.f141510z, this.f141503E, (Composer) obj, iIntValue4);
            case 5:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC39683e.m126921I((C39684f) this.f141504F, (Modifier) this.f141509y, (String) this.f141505G, this.f141508x, (InterfaceC4339a) this.f141506H, this.f141510z, this.f141503E, (Composer) obj, iIntValue5);
            case 6:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC40020b.m128263p((C18284j) this.f141504F, (Integer) this.f141506H, this.f141508x, (InterfaceC4339a) this.f141509y, (Function1) this.f141505G, this.f141510z, this.f141503E, (Composer) obj, iIntValue6);
            case 7:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC40020b.m128262o((C18282h) this.f141504F, (Integer) this.f141506H, this.f141508x, (InterfaceC4339a) this.f141509y, (Function1) this.f141505G, this.f141510z, this.f141503E, (Composer) obj, iIntValue7);
            case 8:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC40161g.m128854u0((C36913f) this.f141504F, (String) this.f141509y, this.f141508x, (Function1) this.f141505G, (Function1) this.f141506H, this.f141510z, this.f141503E, (Composer) obj, iIntValue8);
            default:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC41141j.m133618o((C37633n) this.f141504F, this.f141508x, (InterfaceC4339a) this.f141509y, (Function1) this.f141505G, (Function1) this.f141506H, this.f141510z, this.f141503E, (Composer) obj, iIntValue9);
        }
    }

    public /* synthetic */ C33795i(C18282h c18282h, Integer num, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, int i15) {
        this.f141507w = i15;
        this.f141504F = c18282h;
        this.f141506H = num;
        this.f141508x = z4;
        this.f141509y = interfaceC4339a;
        this.f141505G = function1;
        this.f141510z = i13;
        this.f141503E = i14;
    }

    public /* synthetic */ C33795i(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i13, int i14, int i15) {
        this.f141507w = i15;
        this.f141504F = obj;
        this.f141508x = z4;
        this.f141505G = obj2;
        this.f141506H = obj3;
        this.f141509y = obj4;
        this.f141510z = i13;
        this.f141503E = i14;
    }

    public /* synthetic */ C33795i(C22582f c22582f, List list, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f141507w = 2;
        this.f141504F = c22582f;
        this.f141505G = list;
        this.f141508x = z4;
        this.f141506H = interfaceC4339a;
        this.f141509y = interfaceC4339a2;
        this.f141510z = i13;
        this.f141503E = i14;
    }

    public /* synthetic */ C33795i(C26457c c26457c, Function1 function1, Function1 function2, Modifier modifier, boolean z4, int i13, int i14) {
        this.f141507w = 0;
        this.f141504F = c26457c;
        this.f141505G = function1;
        this.f141506H = function2;
        this.f141509y = modifier;
        this.f141508x = z4;
        this.f141510z = i13;
        this.f141503E = i14;
    }

    public /* synthetic */ C33795i(C36913f c36913f, String str, boolean z4, Function1 function1, Function1 function2, int i13, int i14) {
        this.f141507w = 8;
        this.f141504F = c36913f;
        this.f141509y = str;
        this.f141508x = z4;
        this.f141505G = function1;
        this.f141506H = function2;
        this.f141510z = i13;
        this.f141503E = i14;
    }

    public /* synthetic */ C33795i(C37633n c37633n, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, int i13, int i14) {
        this.f141507w = 9;
        this.f141504F = c37633n;
        this.f141508x = z4;
        this.f141509y = interfaceC4339a;
        this.f141505G = function1;
        this.f141506H = function2;
        this.f141510z = i13;
        this.f141503E = i14;
    }

    public /* synthetic */ C33795i(C39684f c39684f, Modifier modifier, String str, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f141507w = 5;
        this.f141504F = c39684f;
        this.f141509y = modifier;
        this.f141505G = str;
        this.f141508x = z4;
        this.f141506H = interfaceC4339a;
        this.f141510z = i13;
        this.f141503E = i14;
    }
}
