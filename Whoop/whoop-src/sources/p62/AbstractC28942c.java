package p62;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import hg3.AbstractC17269i;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j21.C21245d;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l62.AbstractC23380a;
import l83.C23454a0;
import m62.AbstractC25118i;
import m62.C25112c;
import m62.C25114e;
import m62.C25115f;
import m62.InterfaceC25116g;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27207n;
import ny0.AbstractC27292z;
import ny0.C27238a0;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15166v0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28325a;
import pf.AbstractC29125c;
import q62.AbstractC30001a;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: p62.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lm62/g$c;", "viewState", "Lkotlin/Function1;", "Lm62/j;", "Ll83/a0;", "onViewEvent", "Ll62/a;", "onNavigationEvent", "Lh62/a;", "onAnalyticsEvent", "f", "(Lm62/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "refer-a-friend_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28942c {
    /* JADX WARN: Code duplicated, block: B:109:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x0529  */
    /* JADX WARN: Code duplicated, block: B:114:0x052b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0539  */
    /* JADX WARN: Code duplicated, block: B:122:0x0561  */
    /* JADX WARN: Code duplicated, block: B:123:0x056b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v14, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v17, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v18, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r14v12, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r14v26, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.runtime.Composer, p1.q] */
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
    public static final void m87870f(InterfaceC25116g.c cVar, Function1 onViewEvent, Function1 onNavigationEvent, Function1 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        ?? r14;
        C2314t c2314t;
        int i15;
        ?? r15;
        ?? r10;
        int i16;
        C28676v0 c28676v0;
        Function1 function1;
        Object obj;
        int i17;
        ?? r16;
        Function1 function2;
        ?? r17;
        C25115f c25115fM73652i;
        boolean z4;
        boolean z13;
        Object obj2;
        ?? r18;
        AbstractC25118i abstractC25118iM73648e;
        InterfaceC25116g.c viewState = cVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-798069834);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImageSource(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC15673b0.m44028b0(AbstractC1102d.m3409f(1.0f, c2314t2)), null, C39102j.f168205g, 0.0f, null, c28655q, 24624, 104);
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66723l(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t2), AbstractC30060g.m92099U(0, c28655q, 1), 14)), 0.0f, 0.0f, 0.0f, 6 * f13, 7);
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 9 * f13, 7);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getHeader());
            ?? r19 = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, Integer.valueOf(AbstractC39383f.m125595a(r19)), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, AbstractC37817c.m121344e(31823680, c28655q, new C21245d(29, viewState, onNavigationEvent)), null, null, null, null, null, null, 65010, null);
            int i18 = i14 & 896;
            boolean z14 = i18 == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            Object obj3 = objM87133R;
            if (z14 || objM87133R == c28676v1) {
                C27207n c27207n = new C27207n(onNavigationEvent, 26);
                c28655q.m87172p0(c27207n);
                obj3 = c27207n;
            }
            int i19 = i14;
            AbstractC6719b.m20143d(modifierM3398t2, aVar, null, (InterfaceC4339a) obj3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3413j(new LayoutWeightElement(1.0f, true), f14, 0.0f, 2));
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t2), f14, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 7 * f13, 7);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(1, f13, C2299e.f9110M, c28655q, 54);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(cVar.getIcon().toWhoopIcon()), null, null, c28655q, AbstractC22403o.a.f87639c, 3), "", null, null, null, 0.0f, null, c28655q, 48, 124);
            String strM73654k = cVar.getTitle();
            int i24 = C38072d.f163054b;
            C2886a c2886aM8417O = r19.m121952e(c28655q, i24).getT2();
            long jM125430y = r19.m121949b(c28655q, i24).getBrandWhite();
            C36775k c36775k = new C36775k(5);
            int i25 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM73654k, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i25, 196090);
            AbstractC30795n.m94707h(cVar.getSubtitle(), null, r19.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, r19.m121952e(c28655q, i24).getB1(), null, c28655q, 0, i25, 196090);
            c28655q.m87173q(true);
            C25114e c25114eM73651h = cVar.getPromotion();
            if (c25114eM73651h == null) {
                c28655q.m87150e0(-117376983);
                c28655q.m87173q(false);
                c2314t = c2314t2;
                r10 = c28655q;
                i15 = 3;
                r15 = 0;
            } else {
                c28655q.m87150e0(-117376982);
                c2314t = c2314t2;
                i15 = 3;
                C28655q c28655q2 = c28655q;
                r15 = 0;
                AbstractC30001a.m91797c(c25114eM73651h, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 3 * f13, 7), onViewEvent, onAnalyticsEvent, c28655q2, ((i19 << 3) & 896) | 48 | (i19 & 7168), 0);
                c28655q2.m87173q(false);
                r10 = c28655q2;
            }
            C25112c c25112cM73645b = cVar.getHowItWorks();
            if (c25112cM73645b == null) {
                r10.m87150e0(-117165656);
                r10.m87173q(r15);
                i16 = 4;
            } else {
                r10.m87150e0(-117165655);
                i16 = 4;
                AbstractC28943d.m87877b(c25112cM73645b, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, i15 * f13, 7), r10, 48, r15);
                r10.m87173q(r15);
            }
            C27238a0 c27238a0 = new C27238a0(AbstractC8693b.m21278l(cVar.getPrimaryCtaTileState().getTitle()), null, null, AbstractC17269i.m48880a(((float) 0.5d) * i16, r4.m121949b(r10, r5).getWhite20()), 0.0f, null, null, null, false, false, MessageListItemViewType.FILE_ATTACHMENTS, null);
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f14, 7);
            viewState = cVar;
            int i26 = (r37 == 256 ? 1 : r15) | (r10.m87157i(viewState) ? 1 : 0);
            Object objM87133R2 = r10.m87133R();
            if (i26 == 0) {
                c28676v0 = c28676v1;
                if (objM87133R2 != c28676v0) {
                    function1 = onNavigationEvent;
                    obj = objM87133R2;
                }
                i17 = C27238a0.f109008k | 48;
                r16 = r15;
                ?? r110 = r10;
                function2 = function1;
                AbstractC27292z.m82341h(c27238a0, modifierM3398t4, null, (InterfaceC4339a) obj, r110, i17, 4);
                r17 = r110;
                c25115fM73652i = viewState.getSecondaryCtaTileState();
                if (c25115fM73652i == null) {
                    r17.m87150e0(-116389416);
                    r17.m87173q(r16);
                    r18 = r17;
                } else {
                    r17.m87150e0(-116389415);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c25115fM73652i.getTitle());
                    C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                    C27238a0 c27238a1 = new C27238a0(textResourceM21278l2, AbstractC15166v0.m43196a(C17919x.f69636m, r19.m121949b(r17, i24).getBrandWhite(), r19.m121949b(r17, i24).getWhite10(), r19.m121949b(r17, i24).getWhite20(), r17, 6, 0), null, null, 0.0f, null, null, null, false, false, 1020, null);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f14, 7);
                    if (i18 == 256) {
                        z4 = true;
                    } else {
                        z4 = r16 == true ? 1 : 0;
                    }
                    z13 = z4 | (r17.m87157i(c25115fM73652i) ? 1 : 0);
                    Object objM87133R3 = r17.m87133R();
                    obj2 = objM87133R3;
                    if (z13 == 0 || objM87133R3 == c28676v0) {
                        C28448b c28448b = new C28448b(12, function2, c25115fM73652i);
                        r17.m87172p0(c28448b);
                        obj2 = c28448b;
                    }
                    AbstractC27292z.m82341h(c27238a1, modifierM3398t5, null, (InterfaceC4339a) obj2, r17, i17, 4);
                    ?? r111 = r17;
                    r111.m87173q(r16);
                    r18 = r111;
                }
                r18.m87173q(true);
                r18.m87173q(true);
                abstractC25118iM73648e = viewState.getModal();
                if (abstractC25118iM73648e == null) {
                    r18.m87150e0(2053747720);
                    r18.m87173q(r16);
                } else {
                    r18.m87150e0(2053747721);
                    AbstractC28946g.m87892d(abstractC25118iM73648e, onViewEvent, onNavigationEvent, onAnalyticsEvent, r18, i19 & 8176);
                    r18.m87173q(r16);
                }
                r18.m87173q(true);
                r14 = r18;
            } else {
                c28676v0 = r38;
            }
            function1 = onNavigationEvent;
            C28448b c28448b2 = new C28448b(11, function1, viewState);
            r10.m87172p0(c28448b2);
            obj = c28448b2;
            i17 = C27238a0.f109008k | 48;
            r16 = r15;
            ?? r112 = r10;
            function2 = function1;
            AbstractC27292z.m82341h(c27238a0, modifierM3398t4, null, (InterfaceC4339a) obj, r112, i17, 4);
            r17 = r112;
            c25115fM73652i = viewState.getSecondaryCtaTileState();
            if (c25115fM73652i == null) {
                r17.m87150e0(-116389416);
                r17.m87173q(r16);
                r18 = r17;
            } else {
                r17.m87150e0(-116389415);
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c25115fM73652i.getTitle());
                C22976l1 c22976l2 = AbstractC15166v0.f56891a;
                C27238a0 c27238a2 = new C27238a0(textResourceM21278l3, AbstractC15166v0.m43196a(C17919x.f69636m, r19.m121949b(r17, i24).getBrandWhite(), r19.m121949b(r17, i24).getWhite10(), r19.m121949b(r17, i24).getWhite20(), r17, 6, 0), null, null, 0.0f, null, null, null, false, false, 1020, null);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f14, 7);
                if (i18 == 256) {
                    z4 = true;
                } else {
                    z4 = r16 == true ? 1 : 0;
                }
                z13 = z4 | (r17.m87157i(c25115fM73652i) ? 1 : 0);
                Object objM87133R4 = r17.m87133R();
                obj2 = objM87133R4;
                if (z13 == 0) {
                    C28448b c28448b3 = new C28448b(12, function2, c25115fM73652i);
                    r17.m87172p0(c28448b3);
                    obj2 = c28448b3;
                } else {
                    C28448b c28448b4 = new C28448b(12, function2, c25115fM73652i);
                    r17.m87172p0(c28448b4);
                    obj2 = c28448b4;
                }
                AbstractC27292z.m82341h(c27238a2, modifierM3398t6, null, (InterfaceC4339a) obj2, r17, i17, 4);
                ?? r113 = r17;
                r113.m87173q(r16);
                r18 = r113;
            }
            r18.m87173q(true);
            r18.m87173q(true);
            abstractC25118iM73648e = viewState.getModal();
            if (abstractC25118iM73648e == null) {
                r18.m87150e0(2053747720);
                r18.m87173q(r16);
            } else {
                r18.m87150e0(2053747721);
                AbstractC28946g.m87892d(abstractC25118iM73648e, onViewEvent, onNavigationEvent, onAnalyticsEvent, r18, i19 & 8176);
                r18.m87173q(r16);
            }
            r18.m87173q(true);
            r14 = r18;
        } else {
            c28655q.m87138X();
            r14 = c28655q;
        }
        C28677v1 c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28325a(viewState, onViewEvent, onNavigationEvent, onAnalyticsEvent, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m87871g(InterfaceC25116g.c cVar, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM73649f = cVar.getNavigationBarText();
            if (strM73649f == null) {
                c28655q.m87150e0(-1128463751);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1128463750);
                AbstractC28944e.m87881c(strM73649f, function1, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m87872h(Function1 function1) {
        function1.invoke(AbstractC23380a.a.f92669a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m87873i(Function1 function1, InterfaceC25116g.c cVar) {
        function1.invoke(new AbstractC23380a.b(cVar.getPrimaryCtaTileState().getDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m87874j(Function1 function1, C25115f c25115f) {
        function1.invoke(new AbstractC23380a.b(c25115f.getDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m87875k(InterfaceC25116g.c cVar, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m87870f(cVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
