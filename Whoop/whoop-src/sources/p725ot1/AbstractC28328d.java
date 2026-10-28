package p725ot1;

import android.content.Context;
import android.widget.NumberPicker;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bs1.C3590i;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16278g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import nt1.C27130i;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import oe2.C27878c;
import of2.C27900d;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p408q.C29660d;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p709he2.C17215a;
import p709he2.C17216b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ot1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lnt1/i;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onSavedClicked", "f", "(Lnt1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "selectedRegion", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28328d {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public static final void m85845f(C27130i viewState, Function1 onSavedClicked, Composer composer, int i13) {
        int i14;
        Function1 function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onSavedClicked, "onSavedClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(927342808);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onSavedClicked) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            String[] strArr = {"---"};
            c28655q.m87150e0(2118214441);
            List<TextResource> listM81556e = viewState.m81556e();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM81556e, 10));
            Iterator<T> it = listM81556e.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8693b.m21274h((TextResource) it.next(), c28655q, TextResource.$stable));
            }
            c28655q.m87173q(false);
            String[] strArr2 = (String[]) AbstractC25260n.m74032H0(strArr, arrayList.toArray(new String[0]));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(strArr2[1]);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            float f14 = 4;
            C23010x c23010xM73381n = AbstractC25012a.m73381n(f14, f14, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            int i15 = i14;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3411h = AbstractC1102d.m3411h(35 * f14, c2314t);
            boolean zM87157i = c28655q.m87157i(strArr2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C17215a(strArr2, interfaceC28601c1, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC1137a.m3601a((Function1) objM87133R2, modifierM3411h, null, c28655q, 48, 4);
            c28655q.m87173q(true);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC31926e.m99375j(modifierM3409f, null, c38072d.m121949b(c28655q, i16).getRecovery10(), AbstractC33253j.m105489e(3 * f14), null, null, 0.0f, AbstractC37817c.m121344e(922227816, c28655q, new C27878c(viewState, 8)), c28655q, 12582918, 114);
            AbstractC11266d.m30469w(f14, f13, c2314t, c28655q);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h = AbstractC8693b.m21274h(viewState.getButtonLabel(), c28655q, TextResource.$stable);
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                function1 = onSavedClicked;
                objM87133R3 = new C3590i(function1, interfaceC28601c1, 27);
                c28655q.m87172p0(objM87133R3);
            } else {
                function1 = onSavedClicked;
            }
            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v, strM21274h, false, jM125430y, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
        } else {
            function1 = onSavedClicked;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(viewState, function1, i13, 5);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final String m85846g(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final void m85847h(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final NumberPicker m85848i(String[] strArr, InterfaceC28601c1 interfaceC28601c1, Context it) {
        AbstractC22676k.m65750j(it, "it");
        NumberPicker numberPicker = new NumberPicker(new C29660d(it, AbstractC16278g.f62408c));
        numberPicker.setOnValueChangedListener(new C17216b(strArr, interfaceC28601c1, 1));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(strArr.length - 1);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setValue(AbstractC25260n.m74085z0(strArr, m85846g(interfaceC28601c1)));
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setDescendantFocusability(393216);
        return numberPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m85849j(String[] strArr, InterfaceC28601c1 interfaceC28601c1, NumberPicker numberPicker, int i13, int i14) {
        m85847h(interfaceC28601c1, strArr[i14]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m85850k(C27130i c27130i, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = ((float) 1.5d) * 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f13, f13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c27130i.getAvailabilityIcon(), c28655q, 6);
            Modifier modifierM3411h = AbstractC1102d.m3411h(6 * 4, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3411h, c38072d.m121949b(c28655q, i14).getRecovery(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c27130i.getAvailabilityAlert(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i14).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m85851l(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(m85846g(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m85852m(C27130i c27130i, Function1 function1, int i13, Composer composer, int i14) {
        m85845f(c27130i, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
