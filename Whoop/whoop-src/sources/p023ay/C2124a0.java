package p023ay;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import cp0.AbstractC10986p;
import d30.EnumC11553o0;
import gz0.EnumC16313m0;
import java.util.List;
import k31.AbstractC22172b;
import l83.C23454a0;
import l83.InterfaceC23459e;
import n00.C26075c;
import ny0.AbstractC27248d1;
import ny0.EnumC27247d0;
import ny0.EnumC27250e0;
import p027b3.InterfaceC2464x2;
import p11.AbstractC28704e;
import p31.AbstractC28806q;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p477s2.AbstractC32073e;
import p507tx.AbstractC34235f;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import se.AbstractC32411b;
import u71.AbstractC34573g;
import u71.C34576j;
import w71.AbstractC36880e0;
import w71.AbstractC36895n;
import w71.C36876c0;

/* JADX INFO: renamed from: ay.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2124a0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f8498E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8499w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f8500x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f8501y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f8502z;

    public /* synthetic */ C2124a0(Modifier modifier, boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13) {
        this.f8499w = 3;
        this.f8502z = modifier;
        this.f8500x = z4;
        this.f8498E = str;
        this.f8501y = interfaceC4339a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8499w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(7);
                AbstractC34235f.m108219e((InterfaceC2135i) this.f8502z, this.f8500x, (InterfaceC4339a) this.f8501y, (Function1) this.f8498E, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC10986p.m29294B(this.f8500x, (InterfaceC4339a) this.f8501y, (InterfaceC4339a) this.f8502z, (InterfaceC4339a) this.f8498E, (Composer) obj, iIntValue);
            case 2:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(1);
                AbstractC32073e.m99743f(this.f8500x, (EnumC11553o0) this.f8502z, (InterfaceC4339a) this.f8501y, (InterfaceC4339a) this.f8498E, (Composer) obj, iM87244L2);
                return C23454a0.f92919a;
            case 3:
                ((Integer) obj2).getClass();
                int iM87244L3 = AbstractC28683x.m87244L(7);
                AbstractC36259c.m115709t((Modifier) this.f8502z, this.f8500x, (String) this.f8498E, (InterfaceC4339a) this.f8501y, (Composer) obj, iM87244L3);
                return C23454a0.f92919a;
            case 4:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22172b.m63465f(this.f8500x, (Function1) this.f8498E, (EnumC16313m0) this.f8502z, (TextResource) this.f8501y, (Composer) obj, iIntValue2);
            case 5:
                ((Integer) obj2).getClass();
                int iM87244L4 = AbstractC28683x.m87244L(1);
                AbstractC32411b.m101104p(this.f8500x, (C26075c) this.f8502z, (InterfaceC4339a) this.f8501y, (InterfaceC2464x2) this.f8498E, (Composer) obj, iM87244L4);
                return C23454a0.f92919a;
            case 6:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC27248d1.m82114f((TextResource) this.f8502z, (EnumC27250e0) this.f8501y, this.f8500x, (EnumC27247d0) this.f8498E, (Composer) obj, iIntValue3);
            case 7:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC28704e.m87317n(this.f8500x, (String) this.f8502z, (String) this.f8501y, (InterfaceC4351m) this.f8498E, (Composer) obj, iIntValue4);
            case 8:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC28806q.m87673d(this.f8500x, (InterfaceC4339a) this.f8501y, (Modifier) this.f8502z, (Function3) this.f8498E, (Composer) obj, iIntValue5);
            case 9:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC34573g.m109340w((C34576j) this.f8502z, (List) this.f8501y, this.f8500x, (InterfaceC28601c1) this.f8498E, (Composer) obj, iIntValue6);
            case 10:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC36895n.m118457e((Double) this.f8502z, (String) this.f8498E, this.f8500x, (InterfaceC4339a) this.f8501y, (Composer) obj, iIntValue7);
            default:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC36880e0.m118303h((C36876c0) this.f8502z, this.f8500x, (Function1) this.f8498E, (InterfaceC28601c1) this.f8501y, (Composer) obj, iIntValue8);
        }
    }

    public /* synthetic */ C2124a0(InterfaceC2135i interfaceC2135i, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13) {
        this.f8499w = 0;
        this.f8502z = interfaceC2135i;
        this.f8500x = z4;
        this.f8501y = interfaceC4339a;
        this.f8498E = function1;
    }

    public /* synthetic */ C2124a0(Double d3, String str, boolean z4, InterfaceC4339a interfaceC4339a) {
        this.f8499w = 10;
        this.f8502z = d3;
        this.f8498E = str;
        this.f8500x = z4;
        this.f8501y = interfaceC4339a;
    }

    public /* synthetic */ C2124a0(Object obj, Object obj2, boolean z4, Object obj3, int i13) {
        this.f8499w = i13;
        this.f8502z = obj;
        this.f8501y = obj2;
        this.f8500x = z4;
        this.f8498E = obj3;
    }

    public /* synthetic */ C2124a0(C36876c0 c36876c0, boolean z4, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f8499w = 11;
        this.f8502z = c36876c0;
        this.f8500x = z4;
        this.f8498E = function1;
        this.f8501y = interfaceC28601c1;
    }

    public /* synthetic */ C2124a0(boolean z4, InterfaceC4339a interfaceC4339a, Object obj, InterfaceC23459e interfaceC23459e, int i13) {
        this.f8499w = i13;
        this.f8500x = z4;
        this.f8501y = interfaceC4339a;
        this.f8502z = obj;
        this.f8498E = interfaceC23459e;
    }

    public /* synthetic */ C2124a0(boolean z4, Object obj, InterfaceC4339a interfaceC4339a, Object obj2, int i13, int i14) {
        this.f8499w = i14;
        this.f8500x = z4;
        this.f8502z = obj;
        this.f8501y = interfaceC4339a;
        this.f8498E = obj2;
    }

    public /* synthetic */ C2124a0(boolean z4, String str, String str2, InterfaceC4351m interfaceC4351m) {
        this.f8499w = 7;
        this.f8500x = z4;
        this.f8502z = str;
        this.f8501y = str2;
        this.f8498E = interfaceC4351m;
    }

    public /* synthetic */ C2124a0(boolean z4, Function1 function1, EnumC16313m0 enumC16313m0, TextResource textResource) {
        this.f8499w = 4;
        this.f8500x = z4;
        this.f8498E = function1;
        this.f8502z = enumC16313m0;
        this.f8501y = textResource;
    }
}
