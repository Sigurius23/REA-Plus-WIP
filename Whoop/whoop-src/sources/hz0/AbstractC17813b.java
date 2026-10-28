package hz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dp0.C12253i;
import fc0.C14361e;
import fy1.C14873i;
import hy0.C17737e0;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import l83.C23454a0;
import m83.C25235a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.EnumC39333f;
import p91.AbstractC29011e;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: hz0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lhz0/c;", "state", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V", "", "g", "(Lhz0/c;)Z", "e", "(Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17813b {

    /* JADX INFO: renamed from: hz0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m51228a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(504456150);
            float f13 = 16;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(C2314t.f9131w, EnumC39333f.BACKGROUND_DARK_STD.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC17918w0.f69621a));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            AbstractC17813b.m51223c(null, new C17814c("Left Label", "Left Sublabel", "Right Label", "Right Sublabel", 0.75f, EnumC39333f.ACCENT_POSITIVE_TREND), c28655q, 0, 1);
            String str = null;
            String str2 = null;
            AbstractC17813b.m51223c(null, new C17814c("Only Labels", str, "No Sublabels", str2, 0.5f, null, 42, null), c28655q, 0, 1);
            AbstractC17813b.m51223c(null, new C17814c(str, "Only Sublabels", str2, "No Labels", 0.5f, null, 37, null), c28655q, 0, 1);
            AbstractC17813b.m51223c(null, new C17814c("Left label", str2, null, "Right Sublabel", 0.25f, null, 38, null), c28655q, 0, 1);
            String str3 = null;
            AbstractC17813b.m51223c(null, new C17814c("Left label", "Left sublabel", str3, null, 0.25f, null, 44, null), c28655q, 0, 1);
            AbstractC17813b.m51223c(null, new C17814c(null, str3, "Right label", "Right sublabel", 0.25f, null, 35, null), c28655q, 0, 1);
            AbstractC17813b.m51223c(null, new C17814c(str3, null, null, null, 0.1f, null, 47, null), c28655q, 0, 1);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m51228a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v12 */
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
    /* JADX INFO: renamed from: c */
    public static final void m51223c(Modifier modifier, C17814c state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q;
        boolean z4;
        C28655q c28655q2;
        InterfaceC4339a interfaceC4339a;
        C22957g c22957g;
        C0209i c0209i;
        C0209i c0209i2;
        ?? r10;
        C0209i c0209i3;
        C28655q c28655q3;
        C28655q c28655q4;
        C28655q c28655q5;
        C28655q c28655q6;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(-57013932);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q7.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q7.m87153g(state) ? 32 : 16;
        }
        if (c28655q7.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            long jMo134584toComposableColorWaAFU9c = state.getStyle().mo134584toComposableColorWaAFU9c(c28655q7, 0);
            long jM51541c = C17919x.m51541c(0.15f, jMo134584toComposableColorWaAFU9c);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q7, 0);
            int iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifier4);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a2);
            } else {
                c28655q7.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q7, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            Modifier modifier5 = modifier4;
            if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N);
            float f13 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3411h(12, AbstractC1102d.m3409f(1.0f, c2314t)), 3, f13);
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, jM51541c, c17916v0);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q7.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, modifierM3358c);
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a2);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, c0209i4, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N2);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC29011e.m88145f(AbstractC18489d0.m53364e(AbstractC1099a.m3394p(1, c2314t), 2, f13), 0.0f, 0.0f, state.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0.0f, null, 27, null), jMo134584toComposableColorWaAFU9c, c17916v0), c28655q7, 0);
            c28655q7.m87173q(true);
            if (m51227g(state)) {
                c28655q7.m87150e0(-66084509);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 8, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q7, 54);
                int iHashCode3 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q7.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q7, modifierM3398t);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a2);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m3);
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q7, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N3);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q7, 0);
                int iHashCode4 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q7.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q7, c2314t);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a2);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m4);
                if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q7, iHashCode4, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N4);
                if (state.getLeftLabel() == null) {
                    c28655q7.m87150e0(-925771786);
                    c28655q7.m87173q(false);
                    interfaceC4339a = interfaceC4339a2;
                    c0209i = c0209i4;
                    c22957g = c22957g2;
                    c0209i2 = c0209i6;
                    r10 = 0;
                    c0209i3 = c0209i5;
                    c28655q3 = c28655q7;
                    z4 = true;
                } else {
                    c28655q7.m87150e0(-925771785);
                    String strM51229a = state.getLeftLabel();
                    C38072d c38072d = C38072d.f163053a;
                    C2886a c2886aM8414L = c38072d.m121952e(c28655q7, 6).getSh4();
                    long jM125430y = c38072d.m121949b(c28655q7, 6).getBrandWhite();
                    interfaceC4339a = interfaceC4339a2;
                    c22957g = c22957g2;
                    z4 = true;
                    c0209i = c0209i4;
                    c0209i2 = c0209i6;
                    r10 = 0;
                    c0209i3 = c0209i5;
                    AbstractC30795n.m94707h(strM51229a, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q7, 0, 0, 196602);
                    C28655q c28655q8 = c28655q7;
                    c28655q8.m87173q(false);
                    c28655q3 = c28655q8;
                }
                if (state.getLeftSublabel() == null) {
                    c28655q3.m87150e0(-925464297);
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                } else {
                    c28655q3.m87150e0(-925464296);
                    String strM51230b = state.getLeftSublabel();
                    C38072d c38072d2 = C38072d.f163053a;
                    C28655q c28655q9 = c28655q3;
                    AbstractC30795n.m94707h(strM51230b, null, c38072d2.m121949b(c28655q3, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, 6).getB3(), null, c28655q9, 0, 0, 196602);
                    C28655q c28655q10 = c28655q9;
                    c28655q10.m87173q(r10);
                    c28655q4 = c28655q10;
                }
                c28655q4.m87173q(z4);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, r10);
                int iHashCode5 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N5);
                if (state.getRightLabel() == null) {
                    c28655q4.m87150e0(1994834846);
                    c28655q4.m87173q(r10);
                    c28655q5 = c28655q4;
                } else {
                    c28655q4.m87150e0(1994834847);
                    String strM51232e = state.getRightLabel();
                    C38072d c38072d3 = C38072d.f163053a;
                    C28655q c28655q11 = c28655q4;
                    AbstractC30795n.m94707h(strM51232e, null, c38072d3.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q4, 6).getSh4(), null, c28655q11, 0, 0, 196602);
                    C28655q c28655q12 = c28655q11;
                    c28655q12.m87173q(r10);
                    c28655q5 = c28655q12;
                }
                if (state.getRightSublabel() == null) {
                    c28655q5.m87150e0(1995144319);
                    c28655q5.m87173q(r10);
                    c28655q6 = c28655q5;
                } else {
                    c28655q5.m87150e0(1995144320);
                    String strM51233f = state.getRightSublabel();
                    C38072d c38072d4 = C38072d.f163053a;
                    C28655q c28655q13 = c28655q5;
                    AbstractC30795n.m94707h(strM51233f, null, c38072d4.m121949b(c28655q5, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q5, 6).getB3(), null, c28655q13, 0, 0, 196602);
                    C28655q c28655q14 = c28655q13;
                    c28655q14.m87173q(r10);
                    c28655q6 = c28655q14;
                }
                AbstractC25012a.m73392y(c28655q6, z4, z4, r10);
                c28655q2 = c28655q6;
            } else {
                C28655q c28655q15 = c28655q7;
                z4 = true;
                c28655q15.m87150e0(-64526728);
                c28655q15.m87173q(false);
                c28655q2 = c28655q15;
            }
            c28655q2.m87173q(z4);
            modifier3 = modifier5;
            c28655q = c28655q2;
        } else {
            C28655q c28655q16 = c28655q7;
            c28655q16.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q16;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(modifier3, state, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m51224d(Modifier modifier, C17814c c17814c, int i13, int i14, Composer composer, int i15) {
        m51223c(modifier, c17814c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m51225e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-157800161);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m51226f(int i13, Composer composer, int i14) {
        m51225e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m51227g(C17814c state) {
        AbstractC22676k.m65750j(state, "state");
        return (state.getLeftLabel() == null && state.getLeftSublabel() == null && state.getRightLabel() == null && state.getRightSublabel() == null) ? false : true;
    }
}
