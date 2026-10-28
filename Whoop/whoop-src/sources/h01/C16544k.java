package h01;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import fm1.C14597a;
import fm1.C14600d;
import fm1.C14605i;
import gz0.EnumC16313m0;
import hs1.AbstractC17606c;
import ik2.C18614b;
import java.util.List;
import jk2.AbstractC21760a;
import jk2.AbstractC21768i;
import js1.AbstractC21921l;
import k71.AbstractC22253j;
import k71.C22256m;
import l83.InterfaceC23459e;
import p710im1.AbstractC18677j0;
import p710im1.C18665d0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h01.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16544k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f63653E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f63654F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f63655G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f63656H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63657w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f63658x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC23459e f63659y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f63660z;

    public /* synthetic */ C16544k(C14605i c14605i, Function1 function1, Function1 function2, Modifier modifier, boolean z4, int i13, int i14) {
        this.f63657w = 3;
        this.f63654F = c14605i;
        this.f63659y = function1;
        this.f63655G = function2;
        this.f63656H = modifier;
        this.f63658x = z4;
        this.f63660z = i13;
        this.f63653E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63657w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC16549p.m46789w((TextResource) this.f63654F, (EnumC16313m0) this.f63655G, (List) this.f63656H, this.f63658x, (Function1) this.f63659y, this.f63660z, this.f63653E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18677j0.m54228o((C14597a) this.f63654F, (C18665d0) this.f63655G, (C14600d) this.f63656H, this.f63658x, (Function1) this.f63659y, this.f63660z, this.f63653E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC21760a.m61451c((C18614b) this.f63654F, (InterfaceC4339a) this.f63655G, (InterfaceC4339a) this.f63656H, (InterfaceC4339a) this.f63659y, this.f63658x, this.f63660z, this.f63653E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC21768i.m61507J((C14605i) this.f63654F, (Function1) this.f63659y, (Function1) this.f63655G, (Modifier) this.f63656H, this.f63658x, this.f63660z, this.f63653E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC21921l.m62372B((Modifier) this.f63654F, (AbstractC17606c) this.f63655G, (String) this.f63656H, this.f63658x, (Function1) this.f63659y, this.f63660z, this.f63653E, (Composer) obj, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC22253j.m63825K((C22256m) this.f63654F, this.f63658x, (Function1) this.f63659y, (String) this.f63655G, (String) this.f63656H, this.f63660z, this.f63653E, (Composer) obj, iIntValue6);
        }
    }

    public /* synthetic */ C16544k(C18614b c18614b, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, boolean z4, int i13, int i14) {
        this.f63657w = 2;
        this.f63654F = c18614b;
        this.f63655G = interfaceC4339a;
        this.f63656H = interfaceC4339a2;
        this.f63659y = interfaceC4339a3;
        this.f63658x = z4;
        this.f63660z = i13;
        this.f63653E = i14;
    }

    public /* synthetic */ C16544k(Object obj, Object obj2, Object obj3, Function1 function1, boolean z4, int i13, int i14, int i15) {
        this.f63657w = i15;
        this.f63654F = obj;
        this.f63655G = obj2;
        this.f63656H = obj3;
        this.f63658x = z4;
        this.f63659y = function1;
        this.f63660z = i13;
        this.f63653E = i14;
    }

    public /* synthetic */ C16544k(C22256m c22256m, boolean z4, Function1 function1, String str, String str2, int i13, int i14) {
        this.f63657w = 5;
        this.f63654F = c22256m;
        this.f63658x = z4;
        this.f63659y = function1;
        this.f63655G = str;
        this.f63656H = str2;
        this.f63660z = i13;
        this.f63653E = i14;
    }
}
