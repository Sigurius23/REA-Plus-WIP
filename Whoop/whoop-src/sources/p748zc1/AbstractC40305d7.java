package p748zc1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import hc3.AbstractC17176i;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.d7 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "g", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40305d7 {
    /* JADX WARN: Code duplicated, block: B:61:0x0281  */
    /* JADX WARN: Code duplicated, block: B:62:0x0285  */
    /* JADX WARN: Code duplicated, block: B:69:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:74:0x02df  */
    /* JADX INFO: renamed from: g */
    public static final void m129581g(Composer composer, int i13) {
        C0209i c0209i;
        C28676v0 c28676v0;
        int iHashCode;
        final List listM118959K;
        boolean zM87157i;
        Object objM87133R;
        Object obj;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-206324128);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            final Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            String str = "one";
            int i14 = 2;
            String str2 = "two";
            String str3 = "three";
            final List listM118959K2 = AbstractC37056f.m118959K(new C33223u0(str, null, i14, false ? 1 : 0), new C33223u0(str2, false ? 1 : 0, i14, false ? 1 : 0), new C33223u0(str3, false ? 1 : 0, i14, false ? 1 : 0));
            final List listM118959K3 = AbstractC37056f.m118959K(new C33223u0(str, false ? 1 : 0, i14, false ? 1 : 0), new C33223u0(str2, false ? 1 : 0, i14, false ? 1 : 0));
            AbstractC22399k.m64475e("Segmented Control - 3", c28655q, 6);
            boolean zM87157i2 = c28655q.m87157i(context) | c28655q.m87157i(listM118959K2);
            Object objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            Object obj2 = objM87133R2;
            if (zM87157i2 || objM87133R2 == c28676v1) {
                final int i15 = 0;
                Function1 function1 = new Function1() { // from class: zc1.c7
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i16 = i15;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i16) {
                            case 0:
                                return AbstractC40305d7.m129582h(context, listM118959K2, iIntValue);
                            case 1:
                                return AbstractC40305d7.m129583i(context, listM118959K2, iIntValue);
                            case 2:
                                return AbstractC40305d7.m129584j(context, listM118959K2, iIntValue);
                            case 3:
                                return AbstractC40305d7.m129585k(context, listM118959K2, iIntValue);
                            default:
                                return AbstractC40305d7.m129586l(context, listM118959K2, iIntValue);
                        }
                    }
                };
                c28655q.m87172p0(function1);
                obj2 = function1;
            }
            int i16 = C33223u0.f138545c | 48;
            AbstractC33231x0.m105420e(listM118959K2, 0, null, null, (Function1) obj2, c28655q, i16, 12);
            float f13 = 4;
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64475e("Segmented Control - 2", c28655q, 6);
            boolean zM87157i3 = c28655q.m87157i(context) | c28655q.m87157i(listM118959K3);
            Object objM87133R3 = c28655q.m87133R();
            Object obj3 = objM87133R3;
            if (zM87157i3 || objM87133R3 == c28676v1) {
                final int i17 = 1;
                Function1 function2 = new Function1() { // from class: zc1.c7
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i18 = i17;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i18) {
                            case 0:
                                return AbstractC40305d7.m129582h(context, listM118959K3, iIntValue);
                            case 1:
                                return AbstractC40305d7.m129583i(context, listM118959K3, iIntValue);
                            case 2:
                                return AbstractC40305d7.m129584j(context, listM118959K3, iIntValue);
                            case 3:
                                return AbstractC40305d7.m129585k(context, listM118959K3, iIntValue);
                            default:
                                return AbstractC40305d7.m129586l(context, listM118959K3, iIntValue);
                        }
                    }
                };
                c28655q.m87172p0(function2);
                obj3 = function2;
            }
            AbstractC33231x0.m105420e(listM118959K3, 0, null, null, (Function1) obj3, c28655q, i16, 12);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64475e("Segmented Control - 3 - Padded", c28655q, 6);
            float f15 = 8 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15, c2314t);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            boolean zM87157i4 = c28655q.m87157i(context) | c28655q.m87157i(listM118959K2);
            Object objM87133R4 = c28655q.m87133R();
            Object obj4 = objM87133R4;
            if (zM87157i4 || objM87133R4 == c28676v1) {
                final int i18 = 2;
                Function1 function3 = new Function1() { // from class: zc1.c7
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i19 = i18;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i19) {
                            case 0:
                                return AbstractC40305d7.m129582h(context, listM118959K2, iIntValue);
                            case 1:
                                return AbstractC40305d7.m129583i(context, listM118959K2, iIntValue);
                            case 2:
                                return AbstractC40305d7.m129584j(context, listM118959K2, iIntValue);
                            case 3:
                                return AbstractC40305d7.m129585k(context, listM118959K2, iIntValue);
                            default:
                                return AbstractC40305d7.m129586l(context, listM118959K2, iIntValue);
                        }
                    }
                };
                c28655q.m87172p0(function3);
                obj4 = function3;
            }
            C0209i c0209i6 = c0209i;
            AbstractC33231x0.m105420e(listM118959K2, 0, null, null, (Function1) obj4, c28655q, i16, 12);
            AbstractC17176i.m48516r(c28655q, true, c2314t, f14, c28655q);
            AbstractC22399k.m64475e("Segmented Control - 2 - Padded", c28655q, 6);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f15, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            boolean zM87157i5 = c28655q.m87157i(context) | c28655q.m87157i(listM118959K3);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R5 == c28676v0) {
                }
                obj = objM87133R5;
                C28676v0 c28676v2 = c28676v0;
                AbstractC33231x0.m105420e(listM118959K3, 0, null, null, (Function1) obj, c28655q, i16, 12);
                AbstractC17176i.m48516r(c28655q, true, c2314t, f14, c28655q);
                AbstractC22399k.m64475e("Segmented Control - 3 - Long Text", c28655q, 6);
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f15, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                int i19 = 2;
                listM118959K = AbstractC37056f.m118959K(new C33223u0("The first text is a long text what will the UI be who knows", null, i19, false ? 1 : 0), new C33223u0(str2, false ? 1 : 0, i19, false ? 1 : 0), new C33223u0(str3, false ? 1 : 0, i19, false ? 1 : 0));
                zM87157i = c28655q.m87157i(context) | c28655q.m87157i(listM118959K);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v2) {
                    obj = objM87133R;
                    final int i24 = 4;
                    Function1 function4 = new Function1() { // from class: zc1.c7
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i110 = i24;
                            int iIntValue = ((Integer) obj5).intValue();
                            switch (i110) {
                                case 0:
                                    return AbstractC40305d7.m129582h(context, listM118959K, iIntValue);
                                case 1:
                                    return AbstractC40305d7.m129583i(context, listM118959K, iIntValue);
                                case 2:
                                    return AbstractC40305d7.m129584j(context, listM118959K, iIntValue);
                                case 3:
                                    return AbstractC40305d7.m129585k(context, listM118959K, iIntValue);
                                default:
                                    return AbstractC40305d7.m129586l(context, listM118959K, iIntValue);
                            }
                        }
                    };
                    c28655q.m87172p0(function4);
                    obj = function4;
                }
                obj = objM87133R;
                AbstractC33231x0.m105420e(listM118959K, 0, null, null, (Function1) obj, c28655q, i16, 12);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            }
            obj = objM87133R5;
            final int i25 = 3;
            Function1 function5 = new Function1() { // from class: zc1.c7
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    int i110 = i25;
                    int iIntValue = ((Integer) obj5).intValue();
                    switch (i110) {
                        case 0:
                            return AbstractC40305d7.m129582h(context, listM118959K3, iIntValue);
                        case 1:
                            return AbstractC40305d7.m129583i(context, listM118959K3, iIntValue);
                        case 2:
                            return AbstractC40305d7.m129584j(context, listM118959K3, iIntValue);
                        case 3:
                            return AbstractC40305d7.m129585k(context, listM118959K3, iIntValue);
                        default:
                            return AbstractC40305d7.m129586l(context, listM118959K3, iIntValue);
                    }
                }
            };
            c28655q.m87172p0(function5);
            Object obj5 = function5;
            obj5 = objM87133R5;
            C28676v0 c28676v3 = c28676v0;
            AbstractC33231x0.m105420e(listM118959K3, 0, null, null, (Function1) obj5, c28655q, i16, 12);
            AbstractC17176i.m48516r(c28655q, true, c2314t, f14, c28655q);
            AbstractC22399k.m64475e("Segmented Control - 3 - Long Text", c28655q, 6);
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f15, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            int i110 = 2;
            listM118959K = AbstractC37056f.m118959K(new C33223u0("The first text is a long text what will the UI be who knows", null, i110, false ? 1 : 0), new C33223u0(str2, false ? 1 : 0, i110, false ? 1 : 0), new C33223u0(str3, false ? 1 : 0, i110, false ? 1 : 0));
            zM87157i = c28655q.m87157i(context) | c28655q.m87157i(listM118959K);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                obj = objM87133R;
                final int i26 = 4;
                Function1 function6 = new Function1() { // from class: zc1.c7
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i111 = i26;
                        int iIntValue = ((Integer) obj6).intValue();
                        switch (i111) {
                            case 0:
                                return AbstractC40305d7.m129582h(context, listM118959K, iIntValue);
                            case 1:
                                return AbstractC40305d7.m129583i(context, listM118959K, iIntValue);
                            case 2:
                                return AbstractC40305d7.m129584j(context, listM118959K, iIntValue);
                            case 3:
                                return AbstractC40305d7.m129585k(context, listM118959K, iIntValue);
                            default:
                                return AbstractC40305d7.m129586l(context, listM118959K, iIntValue);
                        }
                    }
                };
                c28655q.m87172p0(function6);
                obj = function6;
            } else {
                obj = objM87133R;
                final int i27 = 4;
                Function1 function7 = new Function1() { // from class: zc1.c7
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i111 = i27;
                        int iIntValue = ((Integer) obj6).intValue();
                        switch (i111) {
                            case 0:
                                return AbstractC40305d7.m129582h(context, listM118959K, iIntValue);
                            case 1:
                                return AbstractC40305d7.m129583i(context, listM118959K, iIntValue);
                            case 2:
                                return AbstractC40305d7.m129584j(context, listM118959K, iIntValue);
                            case 3:
                                return AbstractC40305d7.m129585k(context, listM118959K, iIntValue);
                            default:
                                return AbstractC40305d7.m129586l(context, listM118959K, iIntValue);
                        }
                    }
                };
                c28655q.m87172p0(function7);
                obj = function7;
            }
            obj = objM87133R;
            AbstractC33231x0.m105420e(listM118959K, 0, null, null, (Function1) obj, c28655q, i16, 12);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m129582h(Context context, List list, int i13) {
        Toast.makeText(context, "Segmented Control 3: " + ((C33223u0) list.get(i13)).getText(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129583i(Context context, List list, int i13) {
        Toast.makeText(context, "Segmented Control 2: " + ((C33223u0) list.get(i13)).getText(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m129584j(Context context, List list, int i13) {
        Toast.makeText(context, "Segmented Control 3 - Padded : " + ((C33223u0) list.get(i13)).getText(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m129585k(Context context, List list, int i13) {
        Toast.makeText(context, "Segmented Control 2 - Padded: " + ((C33223u0) list.get(i13)).getText(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m129586l(Context context, List list, int i13) {
        Toast.makeText(context, "Segmented Control 3 - Long Text: " + ((C33223u0) list.get(i13)).getText(), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m129587m(int i13, Composer composer, int i14) {
        m129581g(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
