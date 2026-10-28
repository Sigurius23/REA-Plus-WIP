package p733ry2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import kz2.AbstractC22924a;
import l83.C23454a0;
import ny2.AbstractC27299a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qk2.C30453i;
import qn0.C30515j;
import rm2.C31604d;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: ry2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "cancelCta", "Lkotlin/Function1;", "Lny2/a;", "Ll83/a0;", "onViewEvent", "e", "(Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31914c {
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m99296e(TextResource textResource, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        Object[] objArr;
        Object objM87133R;
        TextResource c8688b;
        boolean z13;
        Object objM87133R2;
        Object objM87133R3;
        Object[] objArr2;
        Object[] objArr3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-314326025);
        int i17 = 2;
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C31604d(22);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * 4), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                int add = c38072d.m121951d().getAction().getAdd();
                objArr3 = 0;
                objArr2 = 0;
                TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC39833e.f171718c, null, i17, 0 == true ? 1 : 0);
                i16 = i15 & 112;
                if (i16 == 32) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                objM87133R = c28655q.m87133R();
                if (objArr == true || objM87133R == c28676v0) {
                    objM87133R = new C30515j(function4, 12);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC22924a.m66657c(add, c8688b2, (InterfaceC4339a) objM87133R, c28655q, TextResource.C8688b.f25889c << 3);
                int iM125595a = AbstractC39383f.m125595a(c38072d);
                if (textResource == null) {
                    c8688b = new TextResource.C8688b(AbstractC39833e.f171719d, objArr2 == true ? 1 : 0, i17, objArr3 == true ? 1 : 0);
                } else {
                    c8688b = textResource;
                }
                z13 = i16 == 32;
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C30515j(function4, 13);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC22924a.m66657c(iM125595a, c8688b, (InterfaceC4339a) objM87133R2, c28655q, TextResource.$stable << 3);
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(textResource, i13, function3, i14, 11);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C31604d(22);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * 4), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            int add2 = c38072d2.m121951d().getAction().getAdd();
            objArr3 = 0;
            objArr2 = 0;
            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC39833e.f171718c, null, i17, 0 == true ? 1 : 0);
            i16 = i15 & 112;
            if (i16 == 32) {
                objArr = true;
            } else {
                objArr = false;
            }
            objM87133R = c28655q.m87133R();
            if (objArr == true) {
                objM87133R = new C30515j(function4, 12);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C30515j(function4, 12);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22924a.m66657c(add2, c8688b3, (InterfaceC4339a) objM87133R, c28655q, TextResource.C8688b.f25889c << 3);
            int iM125595a2 = AbstractC39383f.m125595a(c38072d2);
            if (textResource == null) {
                c8688b = new TextResource.C8688b(AbstractC39833e.f171719d, objArr2 == true ? 1 : 0, i17, objArr3 == true ? 1 : 0);
            } else {
                c8688b = textResource;
            }
            if (i16 == 32) {
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C30515j(function4, 13);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C30515j(function4, 13);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22924a.m66657c(iM125595a2, c8688b, (InterfaceC4339a) objM87133R2, c28655q, TextResource.$stable << 3);
            c28655q.m87173q(true);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(textResource, i13, function3, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m99297f(AbstractC27299a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m99298g(Function1 function1) {
        function1.invoke(AbstractC27299a.a.f109316a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m99299h(Function1 function1) {
        function1.invoke(AbstractC27299a.e.f109323a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m99300i(TextResource textResource, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m99296e(textResource, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
