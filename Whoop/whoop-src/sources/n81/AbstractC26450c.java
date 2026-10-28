package n81;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jp2.C21881l;
import l72.C23407n;
import l80.C23434k;
import l83.C23454a0;
import m81.AbstractC25230e;
import m81.C25231f;
import m81.C25232g;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mi2.C25592o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: n81.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017²\u0006\u000e\u0010\u0014\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, m65681d2 = {"", "tagId", "", "Ln81/a;", "tags", "", "m", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "childEvent", "n", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/Modifier;", "modifier", "Ln81/f;", "itemState", "Lkotlin/Function1;", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Ln81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "selectedTag", "Lm91/u;", "designItem", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26450c {
    /* JADX WARN: Code duplicated, block: B:52:0x00e9 A[EDGE_INSN: B:52:0x00e9->B:53:0x00ea BREAK  A[LOOP:0: B:47:0x00d2->B:115:?]] */
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
    /* JADX INFO: renamed from: e */
    public static final void m78323e(Modifier modifier, C26453f itemState, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1161552615);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87153g(modifier) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C26451d style = itemState.getStyle();
            boolean zM87153g = c28655q.m87153g(itemState.getSelectedTag());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(itemState.getSelectedTag());
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(itemState);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87264r(new C25592o(8, itemState, interfaceC28601c1));
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R2;
            boolean zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("tag-selector-allow-default-tag");
            String defaultTag = itemState.getDefaultTag();
            if (defaultTag == null || !zIsFeatureEnabled) {
                defaultTag = null;
                break;
            }
            List<C26448a> listM78345i = itemState.m78345i();
            if (!(listM78345i instanceof Collection) || !listM78345i.isEmpty()) {
                Iterator<T> it = listM78345i.iterator();
                do {
                    if (!it.hasNext()) {
                        defaultTag = null;
                        break;
                    }
                } while (!AbstractC22676k.m65745e(((C26448a) it.next()).getId(), defaultTag));
            } else {
                defaultTag = null;
                break;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Float horizontalPadding = itemState.getHorizontalPadding();
            float fFloatValue = horizontalPadding != null ? horizontalPadding.floatValue() * 8 : 2 * 8;
            List<C26448a> listM78345i2 = itemState.m78345i();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM78345i2, 10));
            for (C26448a c26448a : listM78345i2) {
                arrayList.add(new C25232g(c26448a.getId(), null, AbstractC8693b.m21278l(c26448a.getNameDisplay()), EnumC2888c.INSTANCE.m8402a(style.getTextStyle())));
            }
            Iterator<C26448a> it3 = itemState.m78345i().iterator();
            int i16 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i16 = -1;
                    break;
                } else if (AbstractC22676k.m65745e(it3.next().getId(), m78324f(interfaceC28601c1))) {
                    break;
                } else {
                    i16++;
                }
            }
            long jMo134584toComposableColorWaAFU9c = style.getSelected().getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            C39174f c39174f = new C39174f(fFloatValue);
            C25231f selected = style.getSelected();
            C25231f unselected = style.getUnselected();
            int i17 = i15 & 896;
            boolean zM87153g3 = c28655q.m87153g(defaultTag) | c28655q.m87153g(interfaceC28601c1) | (i17 == 256) | c28655q.m87157i(itemState);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v0) {
                String str = defaultTag;
                i14 = i17;
                C21881l c21881l = new C21881l((Object) str, (Object) onViewEvent, (Object) itemState, interfaceC28601c1, 11);
                onViewEvent = onViewEvent;
                c28655q.m87172p0(c21881l);
                objM87133R3 = c21881l;
            } else {
                i14 = i17;
            }
            int i18 = i14;
            AbstractC25230e.m73956l(arrayList, i16, jMo134584toComposableColorWaAFU9c, c39174f, selected, unselected, (Function1) objM87133R3, c28655q, 0, 0);
            C2314t c2314t = C2314t.f9131w;
            AbstractC11266d.m30469w(2, 8, c2314t, c28655q);
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, fFloatValue, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            C0209i c0209i2 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            InterfaceC25312u interfaceC25312uM78327i = m78327i(interfaceC28670t2);
            boolean z4 = i18 == 256;
            Object objM87133R4 = c28655q.m87133R();
            if (z4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C23434k(onViewEvent, 26);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC25303l.m74291r(interfaceC25312uM78327i, null, null, (Function1) objM87133R4, c28655q, 0, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(modifier, itemState, onViewEvent, i13, 18);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final String m78324f(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m78325g(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC25312u m78326h(C26453f c26453f, InterfaceC28601c1 interfaceC28601c1) {
        InterfaceC25312u interfaceC25312u = c26453f.m78344h().get(m78324f(interfaceC28601c1));
        if (interfaceC25312u == null) {
            interfaceC25312u = (InterfaceC25312u) ((Map.Entry) AbstractC25265s.m74094E0(c26453f.m78344h().entrySet())).getValue();
        }
        return interfaceC25312u;
    }

    /* JADX INFO: renamed from: i */
    private static final InterfaceC25312u m78327i(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC25312u) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m78328j(String str, Function1 function1, C26453f c26453f, InterfaceC28601c1 interfaceC28601c1, String tappedTag) {
        AbstractC22676k.m65750j(tappedTag, "tappedTag");
        if (str == null || !tappedTag.equals(m78324f(interfaceC28601c1))) {
            str = tappedTag;
        }
        if (!str.equals(m78324f(interfaceC28601c1))) {
            m78325g(interfaceC28601c1, str);
            function1.invoke(m78331m(str, c26453f.m78345i()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m78329k(Function1 function1, Object childEvent) {
        AbstractC22676k.m65750j(childEvent, "childEvent");
        function1.invoke(m78332n(childEvent));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m78330l(Modifier modifier, C26453f c26453f, Function1 function1, int i13, Composer composer, int i14) {
        m78323e(modifier, c26453f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final Object m78331m(String tagId, List<C26448a> tags) {
        Object next;
        AbstractC22676k.m65750j(tagId, "tagId");
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC26452e.b bVar = new AbstractC26452e.b(tagId);
        Iterator<T> it = tags.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C26448a) next).getId(), tagId));
        C26448a c26448a = (C26448a) next;
        AnalyticEventModel analyticEvent = c26448a != null ? c26448a.getAnalyticEvent() : null;
        return analyticEvent != null ? new DesignItemInteraction(bVar, analyticEvent) : bVar;
    }

    /* JADX INFO: renamed from: n */
    public static final Object m78332n(Object childEvent) {
        AbstractC22676k.m65750j(childEvent, "childEvent");
        return ((childEvent instanceof DesignItemInteraction) || (childEvent instanceof C9598e)) ? childEvent : new AbstractC26452e.a(childEvent);
    }
}
