package er2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2476a1;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dr2.C12296b;
import gb1.AbstractC15673b0;
import hb3.AbstractC17104a0;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import o01.AbstractC27348d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15011f9;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: er2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\n\u001a%\u0010\u0011\u001a\u00020\r*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ler2/b;", "viewState", "", "isCurrentStep", "Ll83/a0;", "f", "(Ler2/b;ZLandroidx/compose/runtime/Composer;I)V", "Ler2/a;", "chatBoxState", "k", "(Ler2/a;Landroidx/compose/runtime/Composer;I)V", "userChatBox", "i", "Landroidx/compose/ui/Modifier;", "Ler2/g;", "chatType", "isQuiz", "m", "(Landroidx/compose/ui/Modifier;Ler2/g;Z)Landroidx/compose/ui/Modifier;", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13583e {
    /* JADX INFO: renamed from: f */
    public static final void m38336f(C13580b viewState, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(339297863);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(1225402065, c28655q, new C2476a1(viewState, 14)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12296b(viewState, z4, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m38337g(C13580b c13580b, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        float f13 = 8;
        float f14 = ((float) 2.5d) * f13;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3398t(c2314t, f14, 5 * f13, f14, 0.0f, 8));
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3407d);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        AbstractC22953f.m66715b(composer, new LayoutWeightElement(1.0f, true));
        m38341k(c13580b.getWhoopChatBox(), composer, 0);
        m38339i(c13580b.getUserChatBox(), composer, 0);
        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 5.5d) * f13, 0.0f, ((float) 1.5d) * f13, 5);
        TextResource textResourceM38328f = c13580b.getFooterText();
        int i14 = TextResource.$stable;
        String strM21274h = AbstractC8693b.m21274h(textResourceM38328f, composer, i14);
        C38072d c38072d = C38072d.f163053a;
        int i15 = C38072d.f163054b;
        C2886a c2886aM8416N = c38072d.m121952e(composer, i15).getT1();
        long jM125430y = c38072d.m121949b(composer, i15).getBrandWhite();
        int i16 = C2886a.f11498d << 18;
        AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, composer, 0, i16, 196600);
        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c13580b.getFooterSubText(), composer, i14), null, c38072d.m121949b(composer, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i15).getB1(), null, composer, 0, i16, 196602);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m38338h(C13580b c13580b, boolean z4, int i13, Composer composer, int i14) {
        m38336f(c13580b, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m38339i(C13579a userChatBox, Composer composer, int i13) {
        int i14;
        Modifier verticalAlignElement;
        long jM125426w;
        C2314t c2314t;
        C2306l c2306l = C2299e.f9108K;
        AbstractC22676k.m65750j(userChatBox, "userChatBox");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-234231533);
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(userChatBox) ? 4 : 2) : i13;
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), ((float) 6.5d) * f13, 0.0f, 0.0f, 0.0f, 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            float f14 = 1 * f13;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f14, 7);
            String strM21274h = AbstractC8693b.m21274h(userChatBox.getDescriptionText(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            int i17 = 2;
            float f15 = f14;
            C2314t c2314t3 = c2314t2;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t2, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87150e0(1231537648);
            int i18 = 0;
            for (Object obj : userChatBox.m38324b()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                TextResource textResource = (TextResource) obj;
                boolean z4 = AbstractC37056f.m118951C(userChatBox.m38324b()) == i18 && userChatBox.getAvatarUrl() != null;
                float f16 = i17 * f13;
                Modifier modifierM3397s = AbstractC1099a.m3397s(m38344n(c2314t3, userChatBox.getChatType(), false, i17, null), f16, z4 ? f15 : ((float) 1.25d) * f13, z4 ? f15 : f16, z4 ? f15 : ((float) 1.25d) * f13);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (z4) {
                    i14 = 4;
                    verticalAlignElement = AbstractC1102d.m3425v(c2314t3, 0.0f, ((float) 58.5d) * 4, 1).mo3471e(new VerticalAlignElement(c2306l));
                } else {
                    i14 = 4;
                    verticalAlignElement = new VerticalAlignElement(c2306l);
                }
                String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable);
                C38072d c38072d2 = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                C2886a c2886aM8420a = c38072d2.m121952e(c28655q, i24).getB1();
                if (userChatBox.getChatType() == EnumC13585g.STRAIN) {
                    jM125426w = AbstractC25012a.m73366B(c28655q, -1327641677, c38072d2, c28655q, i24);
                } else {
                    c28655q.m87150e0(-1327640589);
                    jM125426w = c38072d2.m121949b(c28655q, i24).getBrandBlack();
                }
                c28655q.m87173q(false);
                int i25 = i14;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h2, verticalAlignElement, jM125426w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                if (!z4 || userChatBox.getAvatarUrl() == null) {
                    c2314t = c2314t3;
                    c28655q.m87150e0(1793308409);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1792944593);
                    C2314t c2314t4 = c2314t3;
                    c2314t = c2314t4;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(userChatBox.getAvatarUrl(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * i25, AbstractC1099a.m3398t(c2314t4, ((float) 1.5d) * f13, 0.0f, 0.0f, 0.0f, 14)).mo3471e(new VerticalAlignElement(C2299e.f9109L)), null, null, 0.0f, null, c28655q, 48, 120);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                float f17 = f15;
                AbstractC18489d0.m53356B(c28655q, true, c2314t, f17, c28655q);
                f15 = f17;
                c2314t3 = c2314t;
                i18 = i19;
                i17 = 2;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13581c(userChatBox, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m38340j(C13579a c13579a, int i13, Composer composer, int i14) {
        m38339i(c13579a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
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
    /* JADX INFO: renamed from: k */
    public static final void m38341k(C13579a chatBoxState, Composer composer, int i13) {
        C28655q c28655q;
        boolean z4;
        AbstractC22676k.m65750j(chatBoxState, "chatBoxState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1461132453);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(chatBoxState) ? 4 : 2) | i13 : i13;
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7);
            C2314t c2314t2 = c2314t;
            String strM21274h = AbstractC8693b.m21274h(chatBoxState.getDescriptionText(), c28655q2, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8421b = c38072d.m121952e(c28655q2, i15).getB2();
            boolean z13 = 0;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q2, 48, C2886a.f11498d << 18, 196600);
            C28655q c28655q3 = c28655q2;
            c28655q3.m87150e0(-1501597448);
            int i16 = 0;
            C28655q c28655q4 = c28655q3;
            for (Object obj : chatBoxState.m38324b()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                TextResource textResource = (TextResource) obj;
                c2314t2 = c2314t2;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, ((float) 5.5d) * f13, ((float) 2.5d) * f13, 3);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q4, z13);
                int iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m2);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N2);
                if (AbstractC37056f.m118951C(chatBoxState.m38324b()) == i16) {
                    c28655q4.m87150e0(-1961793730);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, ((float) 1.5d) * f13, 0.0f, 11);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z13);
                    int iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3398t3);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N3);
                    z4 = true;
                    AbstractC27348d.m82519c(null, c28655q4, z13, 1);
                    c28655q4.m87173q(true);
                    c28655q4.m87173q(z13);
                } else {
                    z4 = true;
                    c28655q4.m87150e0(-1961640931);
                    c28655q4.m87173q(z13);
                }
                C28655q c28655q5 = c28655q4;
                AbstractC15011f9.m43114b(AbstractC8693b.m21274h(textResource, c28655q4, TextResource.$stable), null, C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC13586h.m38349a(), c28655q5, 0, 1572864, 65530);
                C28655q c28655q6 = c28655q5;
                c28655q6.m87173q(z4);
                i16 = i17;
                z13 = 0;
                c28655q4 = c28655q6;
            }
            c28655q4.m87173q(z13);
            c28655q4.m87173q(true);
            c28655q = c28655q4;
        } else {
            C28655q c28655q7 = c28655q2;
            c28655q7.m87138X();
            c28655q = c28655q7;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13581c(chatBoxState, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m38342l(C13579a c13579a, int i13, Composer composer, int i14) {
        m38341k(c13579a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final Modifier m38343m(Modifier modifier, EnumC13585g chatType, boolean z4) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(chatType, "chatType");
        return AbstractC37056f.m118997u(modifier, new C13582d(chatType, z4, 0));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Modifier m38344n(Modifier modifier, EnumC13585g enumC13585g, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return m38343m(modifier, enumC13585g, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
    /* JADX INFO: renamed from: o */
    public static final Modifier m38345o(EnumC13585g enumC13585g, boolean z4, Modifier composed, Composer composer, int i13) {
        Modifier modifierMo3471e;
        long jM125399i0;
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(703189071);
        String strName = enumC13585g.name();
        C2314t c2314t = C2314t.f9131w;
        switch (strName) {
            case "STRAIN":
                c28655q.m87150e0(-2144423368);
                Modifier modifierMo3471e2 = composed.mo3471e(AbstractC11895b.m31987f(3, 4, c2314t, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getStrain()));
                c28655q.m87173q(false);
                modifierMo3471e = modifierMo3471e2;
                break;
            case "RECOVERY":
                c28655q.m87150e0(-2144265578);
                Modifier modifierMo3471e3 = composed.mo3471e(AbstractC11895b.m31987f(3, 4, c2314t, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery()));
                c28655q.m87173q(false);
                modifierMo3471e = modifierMo3471e3;
                break;
            case "INTRO":
                c28655q.m87150e0(-2144792113);
                c28655q.m87173q(false);
                modifierMo3471e = composed.mo3471e(AbstractC1092a.m3357b(c2314t, AbstractC15673b0.m44000O(), AbstractC33253j.m105489e(3 * 4), 0.0f, 4));
                break;
            case "SLEEP":
                c28655q.m87150e0(-2144627162);
                if (z4) {
                    c28655q.m87150e0(1454841428);
                    jM125399i0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
                } else {
                    c28655q.m87150e0(1454842366);
                    jM125399i0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep();
                }
                c28655q.m87173q(false);
                Modifier modifierMo3471e4 = composed.mo3471e(AbstractC11895b.m31987f(3, 4, c2314t, jM125399i0));
                c28655q.m87173q(false);
                modifierMo3471e = modifierMo3471e4;
                break;
            default:
                c28655q.m87150e0(1454855255);
                c28655q.m87173q(false);
                modifierMo3471e = c2314t;
                break;
        }
        c28655q.m87173q(false);
        return modifierMo3471e;
    }
}
