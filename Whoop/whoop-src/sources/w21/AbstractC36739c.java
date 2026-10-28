package w21;

import ad3.AbstractC0770m;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qz0.AbstractC30795n;
import u31.AbstractC34504e;
import um0.C35076b;
import v31.C35608d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lw21/b;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lw21/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lw21/b$a;", "wheel", "f", "(Lw21/b$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "ITEM_HEIGHT", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36739c {

    /* JADX INFO: renamed from: a */
    private static final float f157254a = 10 * 4;

    /* JADX INFO: renamed from: d */
    public static final void m117861d(Modifier modifier, C36738b state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2057391126);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            modifier3 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 2;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3411h(f157254a, AbstractC1102d.m3409f(1.0f, c2314t)), f13, 4), C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC17918w0.f69621a), c28655q, 0);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f13 * 8, C2299e.f9111N), C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(-1031103032);
            List<C36738b.a> listM117848c = state.m117848c();
            ArrayList<C36738b.a> arrayList = new ArrayList();
            for (Object obj : listM117848c) {
                if (!((C36738b.a) obj).m117855g().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            for (C36738b.a aVar : arrayList) {
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m117863f(aVar, new LayoutWeightElement(1.0f, true), onViewEvent, c28655q, i17 & 896, 0);
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier3, state, onViewEvent, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m117862e(Modifier modifier, C36738b c36738b, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m117861d(modifier, c36738b, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e A[LOOP:0: B:56:0x0118->B:58:0x011e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x013c  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    private static final void m117863f(C36738b.a aVar, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        ArrayList arrayList;
        Iterator<T> it;
        boolean z13;
        boolean z14;
        Object objM87133R;
        String unitLabel;
        int i16;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1645948492);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(aVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                C2306l c2306l = C2299e.f9108K;
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * 8, C2299e.f9111N), c2306l, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                List<C36738b.b> listM117855g = aVar.m117855g();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM117855g, 10));
                it = listM117855g.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C36738b.b) it.next()).getDisplayValue());
                }
                int selectedIndex = aVar.getSelectedIndex();
                float f13 = f157254a;
                boolean zM87157i = c28655q2.m87157i(aVar);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i;
                objM87133R = c28655q2.m87133R();
                if (z14 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C35076b(19, aVar, function1);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC34504e.m109045j(C23016z.f90757a, arrayList, selectedIndex, null, f13, 0, true, null, false, false, (Function1) objM87133R, null, c28655q2, 102260742, 0, 1364);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                unitLabel = aVar.getUnitLabel();
                if (unitLabel == null) {
                    c28655q.m87150e0(-83406646);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-83406645);
                    C38072d c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(unitLabel, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(i13, i14, 22, modifier2, aVar, function1);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(function1)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            C2306l c2306l2 = C2299e.f9108K;
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * 8, C2299e.f9111N), c2306l2, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            List<C36738b.b> listM117855g2 = aVar.m117855g();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM117855g2, 10));
            it = listM117855g2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C36738b.b) it.next()).getDisplayValue());
            }
            int selectedIndex2 = aVar.getSelectedIndex();
            float f14 = f157254a;
            boolean zM87157i2 = c28655q2.m87157i(aVar);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zM87157i2;
            objM87133R = c28655q2.m87133R();
            if (z14) {
                objM87133R = new C35076b(19, aVar, function1);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C35076b(19, aVar, function1);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC34504e.m109045j(C23016z.f90757a, arrayList, selectedIndex2, null, f14, 0, true, null, false, false, (Function1) objM87133R, null, c28655q2, 102260742, 0, 1364);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            unitLabel = aVar.getUnitLabel();
            if (unitLabel == null) {
                c28655q.m87150e0(-83406646);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-83406645);
                C38072d c38072d2 = C38072d.f163053a;
                AbstractC30795n.m94707h(unitLabel, null, c38072d2.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(i13, i14, 22, modifier2, aVar, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m117864g(C36738b.a aVar, Function1 function1, int i13) {
        C36738b.b bVar = (C36738b.b) AbstractC25265s.m74102I0(i13, aVar.m117855g());
        DefaultConstructorMarker defaultConstructorMarker = null;
        String rawValue = bVar != null ? bVar.getRawValue() : null;
        String stateUpdateKey = aVar.getStateUpdateKey();
        if (rawValue != null && stateUpdateKey != null) {
            function1.invoke(new DesignItemInteraction(new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(stateUpdateKey, AbstractC0770m.m1841c(rawValue))), false, 2, defaultConstructorMarker), null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m117865h(C36738b.a aVar, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m117863f(aVar, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
