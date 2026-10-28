package e61;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bp0.C3527o;
import com.whoop.design.util.AbstractC8693b;
import cz0.C11252m;
import ez0.AbstractC13758b;
import hy0.AbstractC17746g1;
import j61.C21369c;
import j61.EnumC21367a;
import j61.EnumC21368b;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.C17893k;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e61.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m65681d2 = {"Lj61/c;", "selectionState", "Ll83/a0;", "i", "(Lj61/c;Landroidx/compose/runtime/Composer;I)V", "state", "k", "f", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12770m {

    /* JADX INFO: renamed from: e61.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43699a;

        static {
            int[] iArr = new int[EnumC21367a.values().length];
            try {
                iArr[EnumC21367a.Y_AXIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21367a.X_AXIS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21367a.X_AND_Y_AXES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43699a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [x81.d] */
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
    public static final void m35793f(C21369c c21369c, Composer composer, int i13) {
        int i14;
        ?? r10;
        C2306l c2306l;
        float f13;
        ?? r14;
        int i15;
        long j7;
        float f14;
        float f15;
        ?? r15;
        ?? r16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2015384463);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c21369c) : c28655q.m87157i(c21369c) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f16 = 2;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC29011e.m88149j(C2314t.f9131w, c21369c.getXPercent(), c21369c.getYPercent(), C29007a.INSTANCE.m88138c()), 8 * f16, 0.0f, 2);
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            long jMo134584toComposableColorWaAFU9c = c21369c.getBackground().mo134584toComposableColorWaAFU9c(c28655q, 0);
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(3);
            float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f16);
            if (AbstractC8693b.m21270d(c21369c.getLabel())) {
                c28655q.m87150e0(1345851260);
                j7 = jMo134584toComposableColorWaAFU9c;
                f13 = f16;
                i15 = 6;
                c2306l = c2306l2;
                f14 = fMo743q0;
                f15 = fMo743q1;
                r14 = 0;
                AbstractC17746g1.m50874j(c21369c.getLabel(), j7, null, C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, 0, 0, 0, 8388596);
                C28655q c28655q2 = c28655q;
                c28655q2.m87173q(false);
                r15 = c28655q2;
            } else {
                c2306l = c2306l2;
                f13 = f16;
                r14 = 0;
                i15 = 6;
                j7 = jMo134584toComposableColorWaAFU9c;
                f14 = fMo743q0;
                f15 = fMo743q1;
                c28655q.m87150e0(1346021357);
                c28655q.m87173q(false);
                r15 = c28655q;
            }
            if ((((double) 1.0f) > 0.0d ? 1 : r14) == 0) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13, new LayoutWeightElement(1.0f, true).mo3471e(new VerticalAlignElement(c2306l)));
            float f17 = f14;
            float f18 = f15;
            boolean zM87151f = r15.m87151f(j7) | r15.m87147d(f17) | r15.m87147d(f18);
            Object objM87133R = r15.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                C12769l c12769l = new C12769l(j7, f17, f18, 0);
                r15.m87172p0(c12769l);
                objM87133R = c12769l;
            }
            AbstractC21478l0.m60421a(modifierM3411h, (Function1) objM87133R, r15, r14);
            if (AbstractC8693b.m21270d(c21369c.getSecondLabel())) {
                r15.m87150e0(1346504182);
                ?? r27 = r15;
                AbstractC17746g1.m50874j(c21369c.getSecondLabel(), j7, null, C38072d.f163053a.m121949b(r15, i15).getBrandBlack(), null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, r27, 0, 0, 0, 8388596);
                ?? r17 = r27;
                r17.m87173q(r14);
                r16 = r17;
            } else {
                r15.m87150e0(1346680045);
                r15.m87173q(r14);
                r16 = r15;
            }
            r16.m87173q(true);
            r10 = r16;
        } else {
            c28655q.m87138X();
            r10 = c28655q;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12768k(c21369c, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m35794g(long j7, float f13, float f14, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)))) << 32), (496 & 8) != 0 ? 0.0f : 0.0f, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f13, f14}, 0.0f)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m35795h(C21369c c21369c, int i13, Composer composer, int i14) {
        m35793f(c21369c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m35796i(C21369c c21369c, Composer composer, int i13) {
        int i14;
        C29007a c29007a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1155663398);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c21369c) : c28655q.m87157i(c21369c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float fM59972n = c21369c.getXPercent();
            float fM59973o = c21369c.getYPercent();
            float fM59971m = c21369c.getWidthPercent();
            float fM59965g = c21369c.getHeightPercent();
            int i15 = a.f43699a[c21369c.getDimension().ordinal()];
            if (i15 == 1) {
                c29007a = new C29007a(0.0f, 0.5f, false, false, 12, null);
            } else if (i15 == 2) {
                c29007a = new C29007a(0.5f, 0.0f, false, false, 12, null);
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c29007a = new C29007a(0.5f, 0.5f, false, false, 12, null);
            }
            AbstractC13758b.m39108d(AbstractC29011e.m88144e(C2314t.f9131w, fM59972n, fM59973o, fM59971m, fM59965g, c29007a), null, null, c21369c.getFadeTop(), c21369c.getExtraBottom(), c28655q, 0, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(c21369c, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m35797j(C21369c c21369c, int i13, Composer composer, int i14) {
        m35796i(c21369c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0245  */
    /* JADX WARN: Code duplicated, block: B:64:0x0293  */
    /* JADX WARN: Code duplicated, block: B:67:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x0356  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [int] */
    /* JADX WARN: Type inference failed for: r9v16 */
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
    public static final void m35798k(C21369c c21369c, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long j7;
        int iHashCode;
        long j13;
        C2314t c2314t;
        boolean z4;
        boolean z13;
        long j14;
        ?? r10;
        Object objM87133R;
        ?? r14;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1409117926);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(c21369c) : c28655q2.m87157i(c21369c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            long jMo134584toComposableColorWaAFU9c = c21369c.getBackground().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            float fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(c28674u2)).mo743q0(3);
            float f13 = 2;
            float fMo743q1 = ((InterfaceC39171c) c28655q2.m87161k(c28674u2)).mo743q0(f13);
            EnumC21368b enumC21368bM59967i = c21369c.getLabelStyle();
            EnumC21368b enumC21368b = EnumC21368b.NUMERIC;
            float f14 = (enumC21368bM59967i == enumC21368b || c21369c.getLabelStyle() == null) ? -0.09f : -0.05f;
            float fM59972n = c21369c.getXPercent();
            C29007a.Companion companion = C29007a.INSTANCE;
            C29007a c29007aM88136a = companion.m88136a();
            float f15 = fMo743q0;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM88149j = AbstractC29011e.m88149j(c2314t2, fM59972n, f14, c29007aM88136a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM88149j);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            int i15 = i14;
            if (c28655q2.f115903S) {
                j7 = jMo134584toComposableColorWaAFU9c;
            } else {
                j7 = jMo134584toComposableColorWaAFU9c;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4), C2299e.f9109L, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                if (c21369c.getLabelStyle() != enumC21368b || c21369c.getLabelStyle() == null) {
                    f15 = f15;
                    c28655q = c28655q2;
                    j13 = j7;
                    c2314t = c2314t2;
                    z4 = false;
                    c28655q.m87150e0(101550576);
                    if (AbstractC22676k.m65745e(c21369c.getLabel(), AbstractC8693b.m21267a())) {
                        c28655q.m87150e0(101835590);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(101596301);
                        String strM21274h = AbstractC8693b.m21274h(c21369c.getLabel(), c28655q, 0);
                        C38072d c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN5(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    if (AbstractC22676k.m65745e(c21369c.getSubLabel(), AbstractC8693b.m21267a())) {
                        c28655q.m87150e0(102142118);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(101902829);
                        String strM21274h2 = AbstractC8693b.m21274h(c21369c.getSubLabel(), c28655q, 0);
                        C38072d c38072d2 = C38072d.f163053a;
                        C28655q c28655q3 = c28655q;
                        AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB2(), null, c28655q3, 0, 0, 196602);
                        c28655q = c28655q3;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q2.m87150e0(102181488);
                    if (AbstractC22676k.m65745e(c21369c.getLabel(), AbstractC8693b.m21267a())) {
                        c28655q = c28655q2;
                        j13 = j7;
                        c2314t = c2314t2;
                        z4 = false;
                        c28655q.m87150e0(102466502);
                        c28655q.m87173q(false);
                    } else {
                        c28655q2.m87150e0(102227213);
                        String strM21274h3 = AbstractC8693b.m21274h(c21369c.getLabel(), c28655q2, 0);
                        C38072d c38072d3 = C38072d.f163053a;
                        long brandWhite = c38072d3.m121949b(c28655q2, 6).getBrandWhite();
                        C2886a b6 = c38072d3.m121952e(c28655q2, 6).getB4();
                        j13 = j7;
                        c2314t = c2314t2;
                        z4 = false;
                        AbstractC30795n.m94707h(strM21274h3, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q2, 0, 0, 196602);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    if (AbstractC22676k.m65745e(c21369c.getSubLabel(), AbstractC8693b.m21267a())) {
                        c28655q.m87150e0(102773030);
                        c28655q.m87173q(z4);
                    } else {
                        c28655q.m87150e0(102533741);
                        String strM21274h4 = AbstractC8693b.m21274h(c21369c.getSubLabel(), c28655q, z4 ? 1 : 0);
                        C38072d c38072d4 = C38072d.f163053a;
                        C28655q c28655q4 = c28655q;
                        AbstractC30795n.m94707h(strM21274h4, null, c38072d4.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getB4(), null, c28655q4, 0, 0, 196602);
                        c28655q = c28655q4;
                        c28655q.m87173q(z4);
                    }
                    c28655q.m87173q(z4);
                }
                z13 = true;
                z13 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                Modifier modifierM3424u = AbstractC1102d.m3424u(f13, AbstractC1102d.m3406c(1.0f, AbstractC29011e.m88150k(c2314t, c21369c.getXPercent(), 0.0f, companion.m88137b(), 2, null)));
                j14 = j13;
                boolean zM87151f = c28655q.m87151f(j14);
                if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q.m87157i(c21369c))) {
                    z13 = z4;
                }
                r10 = ((((zM87151f ? 1 : 0) | z13 ? 1 : 0) | (c28655q.m87147d(f15) ? 1 : 0)) == true ? 1 : 0) | (c28655q.m87147d(fMo743q1) ? 1 : 0);
                objM87133R = c28655q.m87133R();
                if (r10 == 0 || objM87133R == C28635l.f115821a) {
                    r14 = z4 ? 1 : 0;
                    C11252m c11252m = new C11252m(j14, c21369c, f15, fMo743q1);
                    c28655q.m87172p0(c11252m);
                    objM87133R = c11252m;
                } else {
                    r14 = z4;
                }
                AbstractC21478l0.m60421a(modifierM3424u, (Function1) objM87133R, c28655q, r14);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(4), C2299e.f9109L, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
            if (c21369c.getLabelStyle() != enumC21368b) {
                f15 = f15;
                c28655q = c28655q2;
                j13 = j7;
                c2314t = c2314t2;
                z4 = false;
                c28655q.m87150e0(101550576);
                if (AbstractC22676k.m65745e(c21369c.getLabel(), AbstractC8693b.m21267a())) {
                    c28655q.m87150e0(101596301);
                    String strM21274h5 = AbstractC8693b.m21274h(c21369c.getLabel(), c28655q, 0);
                    C38072d c38072d5 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h5, null, c38072d5.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, 6).getN5(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(101835590);
                    c28655q.m87173q(false);
                }
                if (AbstractC22676k.m65745e(c21369c.getSubLabel(), AbstractC8693b.m21267a())) {
                    c28655q.m87150e0(101902829);
                    String strM21274h6 = AbstractC8693b.m21274h(c21369c.getSubLabel(), c28655q, 0);
                    C38072d c38072d6 = C38072d.f163053a;
                    C28655q c28655q5 = c28655q;
                    AbstractC30795n.m94707h(strM21274h6, null, c38072d6.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, 6).getB2(), null, c28655q5, 0, 0, 196602);
                    c28655q = c28655q5;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(102142118);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                f15 = f15;
                c28655q = c28655q2;
                j13 = j7;
                c2314t = c2314t2;
                z4 = false;
                c28655q.m87150e0(101550576);
                if (AbstractC22676k.m65745e(c21369c.getLabel(), AbstractC8693b.m21267a())) {
                    c28655q.m87150e0(101596301);
                    String strM21274h7 = AbstractC8693b.m21274h(c21369c.getLabel(), c28655q, 0);
                    C38072d c38072d7 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h7, null, c38072d7.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, 6).getN5(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(101835590);
                    c28655q.m87173q(false);
                }
                if (AbstractC22676k.m65745e(c21369c.getSubLabel(), AbstractC8693b.m21267a())) {
                    c28655q.m87150e0(101902829);
                    String strM21274h8 = AbstractC8693b.m21274h(c21369c.getSubLabel(), c28655q, 0);
                    C38072d c38072d8 = C38072d.f163053a;
                    C28655q c28655q6 = c28655q;
                    AbstractC30795n.m94707h(strM21274h8, null, c38072d8.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, 6).getB2(), null, c28655q6, 0, 0, 196602);
                    c28655q = c28655q6;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(102142118);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            z13 = true;
            z13 = true;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            Modifier modifierM3424u2 = AbstractC1102d.m3424u(f13, AbstractC1102d.m3406c(1.0f, AbstractC29011e.m88150k(c2314t, c21369c.getXPercent(), 0.0f, companion.m88137b(), 2, null)));
            j14 = j13;
            boolean zM87151f2 = c28655q.m87151f(j14);
            if ((i15 & 14) != 4) {
                z13 = z4;
            }
            r10 = ((((zM87151f2 ? 1 : 0) | z13 ? 1 : 0) | (c28655q.m87147d(f15) ? 1 : 0)) == true ? 1 : 0) | (c28655q.m87147d(fMo743q1) ? 1 : 0);
            objM87133R = c28655q.m87133R();
            if (r10 == 0) {
                r14 = z4 ? 1 : 0;
                C11252m c11252m2 = new C11252m(j14, c21369c, f15, fMo743q1);
                c28655q.m87172p0(c11252m2);
                objM87133R = c11252m2;
            } else {
                r14 = z4 ? 1 : 0;
                C11252m c11252m3 = new C11252m(j14, c21369c, f15, fMo743q1);
                c28655q.m87172p0(c11252m3);
                objM87133R = c11252m3;
            }
            AbstractC21478l0.m60421a(modifierM3424u2, (Function1) objM87133R, c28655q, r14);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12768k(c21369c, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m35799l(long j7, C21369c c21369c, float f13, float f14, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(c21369c.getHeightPercent() * Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L))))), (496 & 8) != 0 ? 0.0f : Canvas.mo743q0(1), (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f13, f14}, 0.0f)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m35800m(C21369c c21369c, int i13, Composer composer, int i14) {
        m35798k(c21369c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
