package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p292l1.C23089e4;
import p292l1.C23107h4;
import p390p1.AbstractC28683x;
import p522uf.AbstractC34870c0;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.functions.Function1;
import p733ry2.AbstractC31916e;
import ty2.AbstractC34268a;

/* JADX INFO: renamed from: b30.m1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2572m1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10001E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f10002F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10003w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10004x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10005y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10006z;

    public /* synthetic */ C2572m1(Modifier modifier, C2556k1 c2556k1, boolean z4, Function1 function1, InterfaceC21083i interfaceC21083i, int i13) {
        this.f10005y = modifier;
        this.f10006z = c2556k1;
        this.f10004x = z4;
        this.f10001E = function1;
        this.f10002F = interfaceC21083i;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f10003w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f10002F;
        Object obj4 = this.f10006z;
        Object obj5 = this.f10001E;
        Object obj6 = this.f10005y;
        switch (i13) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC36259c.m115698l((Modifier) obj6, (C2556k1) obj4, this.f10004x, (Function1) obj5, (InterfaceC21083i) obj3, (Composer) obj, iM87244L);
                return c23454a0;
            case 1:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(3073);
                AbstractC34870c0.m110007m(this.f10004x, (String) obj4, (String) obj5, (Modifier) obj6, (InterfaceC4339a) obj3, (Composer) obj, iM87244L2);
                return c23454a0;
            case 2:
                C23107h4 c23107h4 = C23107h4.f91269a;
                C23107h4 c23107h5 = C23107h4.f91269a;
                ((Integer) obj2).getClass();
                int iM87244L3 = AbstractC28683x.m87244L(114822145);
                ((C23107h4) obj6).m67088a(this.f10004x, (InterfaceC21083i) obj3, (C23089e4) obj4, (InterfaceC17869a1) obj5, (Composer) obj, iM87244L3);
                return c23454a0;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC31916e.m99341y((AbstractC34268a) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, this.f10004x, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C2572m1(C23107h4 c23107h4, boolean z4, InterfaceC21083i interfaceC21083i, C23089e4 c23089e4, InterfaceC17869a1 interfaceC17869a1, int i13) {
        C23107h4 c23107h5 = C23107h4.f91269a;
        C23107h4 c23107h6 = C23107h4.f91269a;
        this.f10005y = c23107h4;
        this.f10004x = z4;
        this.f10002F = interfaceC21083i;
        this.f10006z = c23089e4;
        this.f10001E = interfaceC17869a1;
    }

    public /* synthetic */ C2572m1(AbstractC34268a abstractC34268a, Function1 function1, Function1 function2, Function1 function3, boolean z4) {
        this.f10005y = abstractC34268a;
        this.f10001E = function1;
        this.f10006z = function2;
        this.f10002F = function3;
        this.f10004x = z4;
    }

    public /* synthetic */ C2572m1(boolean z4, String str, String str2, Modifier modifier, InterfaceC4339a interfaceC4339a, int i13) {
        this.f10004x = z4;
        this.f10006z = str;
        this.f10001E = str2;
        this.f10005y = modifier;
        this.f10002F = interfaceC4339a;
    }
}
