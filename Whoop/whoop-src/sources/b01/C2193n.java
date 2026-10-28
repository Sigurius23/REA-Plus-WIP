package b01;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ao2.C1877b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.form.HeightWeightGroupedFormFieldKt;
import cp0.AbstractC10959g;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m80.AbstractC25224f;
import p01.C28582b;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import tz1.C34280b;
import uz1.AbstractC35430h;
import w71.AbstractC36884g0;
import w71.AbstractC36895n;
import x21.AbstractC37861d;
import x21.C37858a;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: b01.n */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2193n implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f8703E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f8704F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f8705G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f8706H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f8707I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8708w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f8709x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f8710y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f8711z;

    public /* synthetic */ C2193n(Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, boolean z4, boolean z13, int i13, int i14) {
        this.f8708w = 2;
        this.f8709x = modifier;
        this.f8706H = modifier2;
        this.f8705G = modifier3;
        this.f8707I = modifier4;
        this.f8710y = z4;
        this.f8711z = z13;
        this.f8703E = i13;
        this.f8704F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8708w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2195p.m6940z((C2196q) this.f8705G, (Modifier) this.f8709x, (Modifier) this.f8706H, this.f8710y, this.f8711z, (Function1) this.f8707I, this.f8703E, this.f8704F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return HeightWeightGroupedFormFieldKt.ClickableFormFieldContent$lambda$1((Modifier) this.f8709x, (String) this.f8705G, (InterfaceC4339a) this.f8706H, (String) this.f8707I, this.f8710y, this.f8711z, this.f8703E, this.f8704F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC10959g.m29088o((Modifier) this.f8709x, (Modifier) this.f8706H, (Modifier) this.f8705G, (Modifier) this.f8707I, this.f8710y, this.f8711z, this.f8703E, this.f8704F, (Composer) obj, iIntValue3);
            case 3:
                ((Integer) obj2).getClass();
                AbstractC37926s0.m121463a((Modifier) this.f8709x, (String) this.f8705G, this.f8710y, (String) this.f8706H, this.f8711z, (Function1) this.f8707I, (Composer) obj, AbstractC28683x.m87244L(this.f8703E | 1), this.f8704F);
                return C23454a0.f92919a;
            case 4:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC25224f.m73931s((String) this.f8705G, this.f8710y, this.f8711z, (Function1) this.f8707I, (Function1) this.f8709x, (Function1) this.f8706H, this.f8703E, this.f8704F, (Composer) obj, iIntValue4);
            case 5:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC35430h.m112429B((C34280b) this.f8705G, (C1877b) this.f8706H, this.f8710y, this.f8711z, (Function1) this.f8707I, (Modifier) this.f8709x, this.f8703E, this.f8704F, (Composer) obj, iIntValue5);
            case 6:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC36895n.m118459g((TextResource) this.f8705G, (TextResource) this.f8709x, (Double) this.f8706H, this.f8710y, this.f8711z, (InterfaceC4339a) this.f8707I, this.f8703E, this.f8704F, (Composer) obj, iIntValue6);
            case 7:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC36884g0.m118351g((TextResource) this.f8705G, this.f8710y, (Integer) this.f8709x, this.f8711z, (C28582b) this.f8706H, (Function1) this.f8707I, this.f8703E, this.f8704F, (Composer) obj, iIntValue7);
            default:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC37861d.m121407t((C37858a) this.f8705G, (Function1) this.f8707I, (Function1) this.f8709x, this.f8710y, this.f8711z, (Function1) this.f8706H, this.f8703E, this.f8704F, (Composer) obj, iIntValue8);
        }
    }

    public /* synthetic */ C2193n(Modifier modifier, String str, InterfaceC4339a interfaceC4339a, String str2, boolean z4, boolean z13, int i13, int i14) {
        this.f8708w = 1;
        this.f8709x = modifier;
        this.f8705G = str;
        this.f8706H = interfaceC4339a;
        this.f8707I = str2;
        this.f8710y = z4;
        this.f8711z = z13;
        this.f8703E = i13;
        this.f8704F = i14;
    }

    public /* synthetic */ C2193n(Modifier modifier, String str, boolean z4, String str2, boolean z13, Function1 function1, int i13, int i14) {
        this.f8708w = 3;
        this.f8709x = modifier;
        this.f8705G = str;
        this.f8710y = z4;
        this.f8706H = str2;
        this.f8711z = z13;
        this.f8707I = function1;
        this.f8703E = i13;
        this.f8704F = i14;
    }

    public /* synthetic */ C2193n(TextResource textResource, boolean z4, Integer num, boolean z13, C28582b c28582b, Function1 function1, int i13, int i14) {
        this.f8708w = 7;
        this.f8705G = textResource;
        this.f8710y = z4;
        this.f8709x = num;
        this.f8711z = z13;
        this.f8706H = c28582b;
        this.f8707I = function1;
        this.f8703E = i13;
        this.f8704F = i14;
    }

    public /* synthetic */ C2193n(Object obj, Object obj2, Object obj3, boolean z4, boolean z13, InterfaceC23459e interfaceC23459e, int i13, int i14, int i15) {
        this.f8708w = i15;
        this.f8705G = obj;
        this.f8709x = obj2;
        this.f8706H = obj3;
        this.f8710y = z4;
        this.f8711z = z13;
        this.f8707I = interfaceC23459e;
        this.f8703E = i13;
        this.f8704F = i14;
    }

    public /* synthetic */ C2193n(String str, boolean z4, boolean z13, Function1 function1, Function1 function2, Function1 function3, int i13, int i14) {
        this.f8708w = 4;
        this.f8705G = str;
        this.f8710y = z4;
        this.f8711z = z13;
        this.f8707I = function1;
        this.f8709x = function2;
        this.f8706H = function3;
        this.f8703E = i13;
        this.f8704F = i14;
    }

    public /* synthetic */ C2193n(C34280b c34280b, C1877b c1877b, boolean z4, boolean z13, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f8708w = 5;
        this.f8705G = c34280b;
        this.f8706H = c1877b;
        this.f8710y = z4;
        this.f8711z = z13;
        this.f8707I = function1;
        this.f8709x = modifier;
        this.f8703E = i13;
        this.f8704F = i14;
    }

    public /* synthetic */ C2193n(C37858a c37858a, Function1 function1, Function1 function2, boolean z4, boolean z13, Function1 function3, int i13, int i14) {
        this.f8708w = 8;
        this.f8705G = c37858a;
        this.f8707I = function1;
        this.f8709x = function2;
        this.f8710y = z4;
        this.f8711z = z13;
        this.f8706H = function3;
        this.f8703E = i13;
        this.f8704F = i14;
    }
}
