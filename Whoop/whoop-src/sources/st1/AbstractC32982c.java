package st1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import gy0.AbstractC16272a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17916v0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import rt1.C31807e;
import rt1.InterfaceC31810h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: st1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lrt1/h$b;", "viewState", "Ll83/a0;", "e", "(Lrt1/h$b;Landroidx/compose/runtime/Composer;I)V", "", NotificationCompat.CATEGORY_PROGRESS, "Ly3/f;", "height", "c", "(FFLandroidx/compose/runtime/Composer;II)V", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32982c {
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    private static final void m104125c(final float f13, float f14, Composer composer, final int i13, final int i14) {
        int i15;
        float f15;
        boolean z4;
        final float f16;
        C28677v1 c28677v1M87180u;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1232159123);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                f15 = f14;
                i15 |= c28655q.m87147d(f15) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    f16 = 3 * 4;
                } else {
                    f16 = f15;
                }
                float f17 = 1;
                float f18 = 4 * f17;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(f18);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3411h = AbstractC1102d.m3411h(f16, AbstractC1102d.m3409f(1.0f, AbstractC37056f.m118994r(c2314t, c33252iM105489e)));
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                Modifier modifierM44456i = AbstractC15751g.m44456i(f17, modifierM3411h, new C17875c1(c38072d.m121949b(c28655q, i17).getBlack50()), AbstractC33253j.m105489e(f18));
                long black20 = c38072d.m121949b(c28655q, i17).getBlack20();
                C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM44456i, black20, c17916v0);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(f13, AbstractC1099a.m3396r(AbstractC1102d.m3411h(f16 - f18, c2314t), f17, 0.0f, 2)), AbstractC33253j.m105489e(f18)), c38072d.m121949b(c28655q, i17).getSleepRemSleep(), c17916v0), c28655q, 0);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                f16 = f15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC32982c.m104126d(f13, f16, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 48;
        f15 = f14;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                f16 = 3 * 4;
            } else {
                f16 = f15;
            }
            float f19 = 1;
            float f110 = 4 * f19;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f110);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(f16, AbstractC1102d.m3409f(1.0f, AbstractC37056f.m118994r(c2314t2, c33252iM105489e2)));
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            Modifier modifierM44456i2 = AbstractC15751g.m44456i(f19, modifierM3411h2, new C17875c1(c38072d2.m121949b(c28655q, i18).getBlack50()), AbstractC33253j.m105489e(f110));
            long black21 = c38072d2.m121949b(c28655q, i18).getBlack20();
            C17916v0 c17916v1 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM44456i2, black21, c17916v1);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3409f(f13, AbstractC1099a.m3396r(AbstractC1102d.m3411h(f16 - f110, c2314t2), f19, 0.0f, 2)), AbstractC33253j.m105489e(f110)), c38072d2.m121949b(c28655q, i18).getSleepRemSleep(), c17916v1), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            f16 = f15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: st1.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC32982c.m104126d(f13, f16, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m104126d(float f13, float f14, int i13, int i14, Composer composer, int i15) {
        m104125c(f13, f14, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v14 */
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
    public static final void m104127e(InterfaceC31810h.b viewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        float f13;
        C0209i c0209i;
        C0209i c0209i2;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i3;
        C2314t c2314t;
        boolean z4;
        ?? r14;
        C28655q c28655q2;
        C2306l c2306l = C2299e.f9108K;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-978038367);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q3.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f14 = 8;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3392n(c2314t2, 0.0f, (-3) * f14, 1)), 2 * f14, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a2);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N);
            C31807e labradorReadingProgress = viewState.getLabradorReadingProgress();
            if (labradorReadingProgress == null) {
                c28655q3.m87150e0(-1583422641);
                c28655q3.m87173q(false);
                c0209i3 = c0209i4;
                interfaceC4339a = interfaceC4339a2;
                f13 = f14;
                r14 = 0;
                c0209i = c0209i7;
                c2314t = c2314t2;
                c0209i2 = c0209i6;
                z4 = true;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(-1583422640);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * f14), C2299e.f9109L, c28655q3, 54);
                int iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N2);
                String remainingTime = labradorReadingProgress.getRemainingTime();
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                long brandWhite = c38072d.m121949b(c28655q3, i15).getBrandWhite();
                C2886a n13 = c38072d.m121952e(c28655q3, i15).getN2();
                int i16 = C2886a.f11498d << 18;
                f13 = f14;
                c0209i = c0209i7;
                c0209i2 = c0209i6;
                interfaceC4339a = interfaceC4339a2;
                c0209i3 = c0209i4;
                AbstractC30795n.m94707h(remainingTime, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n13, null, c28655q3, 0, i16, 196602);
                c2314t = c2314t2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getCountDownTimeUnit(), c28655q3, TextResource.$stable), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, ((float) 2.5d) * 4, 7), c38072d.m121949b(c28655q3, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i15).getH1(), null, c28655q3, 48, i16, 196600);
                C28655q c28655q4 = c28655q3;
                z4 = true;
                c28655q4.m87173q(true);
                r14 = 0;
                m104125c(labradorReadingProgress.getRemainingPercentage(), 0.0f, c28655q4, 0, 2);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            if (viewState.getReadingUnsuccessful()) {
                c28655q2.m87150e0(-1582506404);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 54);
                int iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, modifierM118962N3);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f62158t, c28655q2, r14), null, AbstractC1102d.m3419p(5 * f13, c2314t), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentNegativeTrend(), c28655q2, 432, 0);
                c28655q2.m87173q(z4);
                c28655q2.m87173q(r14);
            } else {
                C0209i c0209i8 = c0209i3;
                InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
                C0209i c0209i9 = c0209i2;
                C0209i c0209i10 = c0209i;
                if (viewState.getIsCheckmarkVisible()) {
                    c28655q2.m87150e0(-1581943940);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 54);
                    int iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a3);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i9);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N4);
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC16272a.f61965N, c28655q2, r14), null, AbstractC1102d.m3419p(5 * f13, c2314t), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentPositiveTrend(), c28655q2, 432, 0);
                    c28655q2.m87173q(z4);
                    c28655q2.m87173q(r14);
                } else {
                    c28655q2.m87150e0(-1581437493);
                    c28655q2.m87173q(r14);
                }
            }
            c28655q2.m87173q(z4);
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32980a(viewState, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m104128f(InterfaceC31810h.b bVar, int i13, Composer composer, int i14) {
        m104127e(bVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
