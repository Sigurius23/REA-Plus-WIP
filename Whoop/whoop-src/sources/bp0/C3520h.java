package bp0;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ht2.AbstractC17633e;
import ht2.C17629a;
import l80.C23436m;
import l83.C23454a0;
import p040c0.InterfaceC3747i0;
import p163g1.C14949a2;
import p291l0.InterfaceC23004v;
import p294l3.C23267m0;
import p356o3.C27502l;
import p390p1.InterfaceC28601c1;
import p392p3.AbstractC28771i;
import p392p3.C28765d0;
import p392p3.C28772j;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p392p3.InterfaceC28767e0;
import p490t0.C33252i;
import p493t3.C33491c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p741vn1.AbstractC36215s;
import q30.C29938w0;
import rz0.AbstractC31926e;
import rz0.EnumC31927f;
import un1.AbstractC35101g;

/* JADX INFO: renamed from: bp0.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3520h implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14011w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14012x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f14013y;

    public /* synthetic */ C3520h(int i13, Object obj, Object obj2) {
        this.f14011w = i13;
        this.f14012x = obj;
        this.f14013y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typefaceM91572v;
        switch (this.f14011w) {
            case 0:
                return AbstractC3531s.m10521u0((C3513a) this.f14012x, (InterfaceC28601c1) this.f14013y, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
            case 1:
                return AbstractC17633e.m50201I((C17629a) this.f14012x, (Function1) this.f14013y, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return AbstractC31926e.m99385t((EnumC31927f) this.f14012x, (C33252i) this.f14013y, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                Spannable spannable = (Spannable) this.f14012x;
                C23436m c23436m = (C23436m) this.f14013y;
                C23267m0 c23267m0 = (C23267m0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC28771i abstractC28771i = c23267m0.f92196f;
                C28780r c28780r = c23267m0.f92193c;
                if (c28780r == null) {
                    c28780r = C28780r.f116539F;
                }
                C28776n c28776n = c23267m0.f92194d;
                int i13 = c28776n != null ? c28776n.f116535a : 0;
                C28777o c28777o = c23267m0.f92195e;
                int i14 = c28777o != null ? c28777o.f116536a : 65535;
                C33491c c33491c = (C33491c) c23436m.f92857x;
                InterfaceC28767e0 interfaceC28767e0M87529b = ((C28772j) c33491c.f139823e).m87529b(abstractC28771i, c28780r, i13, i14);
                if (interfaceC28767e0M87529b instanceof C28765d0) {
                    Object obj4 = ((C28765d0) interfaceC28767e0M87529b).f116515w;
                    AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typefaceM91572v = (Typeface) obj4;
                } else {
                    C29938w0 c29938w0 = new C29938w0(interfaceC28767e0M87529b, c33491c.f139828j);
                    c33491c.f139828j = c29938w0;
                    typefaceM91572v = c29938w0.m91572v();
                }
                spannable.setSpan(new C27502l(typefaceM91572v), iIntValue, iIntValue2, 33);
                return C23454a0.f92919a;
            case 4:
                return AbstractC35101g.m111051x((Function1) this.f14012x, (InterfaceC28601c1) this.f14013y, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC36215s.m115277j((C14949a2) this.f14012x, (InterfaceC4351m) this.f14013y, (InterfaceC23004v) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
