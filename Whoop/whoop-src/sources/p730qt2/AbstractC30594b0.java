package p730qt2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16273b;
import j93.AbstractC21478l0;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17876d;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p513u4.AbstractC34523k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qt2.b0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a5\u0010\u000f\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0015\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aC\u0010\u001c\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a)\u0010\u001e\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, m65681d2 = {"Lqt2/y;", "itemState", "Ll83/a0;", "g", "(Lqt2/y;Landroidx/compose/runtime/Composer;I)V", "d", "Lk2/e;", "Lh2/b;", "topLeft", "", "text", "Landroid/graphics/Typeface;", "typeFace", "", "color", "l", "(Lk2/e;JLjava/lang/String;Landroid/graphics/Typeface;I)V", "Lh2/e;", "size", "Li2/x;", "stripeColor", "k", "(Lk2/e;JJJ)V", "topRight", "bottomRight", "bottomLeft", "gradientColorStart", "gradientColorEnd", "j", "(Lk2/e;JJJJJJ)V", "i", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30594b0 {
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
    /* JADX INFO: renamed from: d */
    public static final void m93849d(final C30619y itemState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(797468110);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            final long jMo134584toComposableColorWaAFU9c = itemState.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            final long white30 = c38072d.m121949b(c28655q, i15).getWhite30();
            final long white10 = c38072d.m121949b(c28655q, i15).getWhite10();
            final long white50 = c38072d.m121949b(c28655q, i15).getWhite50();
            final Typeface typefaceM109098b = AbstractC34523k.m109098b((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), AbstractC16273b.f62200a);
            int i16 = i14;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3411h(4 * 21, AbstractC1102d.m3409f(1.0f, C2314t.f9131w)), 5 * 8, 0.0f, 2);
            boolean zM87151f = c28655q.m87151f(white10) | c28655q.m87151f(white30) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && c28655q.m87157i(itemState))) | c28655q.m87157i(typefaceM109098b) | c28655q.m87151f(white50);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: qt2.z
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC30594b0.m93850e(white10, white30, jMo134584toComposableColorWaAFU9c, itemState, typefaceM109098b, white50, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3396r, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30592a0(itemState, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m93850e(long j7, long j13, long j14, C30619y c30619y, Typeface typeface, long j15, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float fMo743q0 = Canvas.mo743q0(14);
        float fMo743q1 = Canvas.mo743q0(20);
        float fMo743q2 = Canvas.mo743q0(48);
        float fMo743q3 = Canvas.mo743q0(64);
        m93856k(Canvas, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q3)) & 4294967295L), j7);
        m93856k(Canvas, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q3)) & 4294967295L), j7);
        float f13 = fMo743q0 - 10.0f;
        float f14 = fMo743q3 - fMo743q1;
        float f15 = fMo743q3 - fMo743q2;
        m93855j(Canvas, (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - fMo743q0) + 10.0f)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - fMo743q0) + 10.0f)) << 32) | (((long) Float.floatToRawIntBits(fMo743q3)) & 4294967295L), (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(fMo743q3)) & 4294967295L), j7, j13);
        m93854i(Canvas, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q1)) & 4294967295L), j14);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q2)) & 4294967295L);
        int i13 = C17919x.f69638o;
        long j16 = C17919x.f69629f;
        m93854i(Canvas, jFloatToRawIntBits, jFloatToRawIntBits2, j16);
        float f16 = 2;
        float f17 = fMo743q0 / f16;
        float f18 = fMo743q3 + 50.0f;
        m93857l(Canvas, (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L), c30619y.getCurrentBar(), typeface, AbstractC17918w0.m51506H(j14));
        m93857l(Canvas, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / f16) + 4)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L), c30619y.getWeeklyIncrease(), typeface, AbstractC17918w0.m51506H(j15));
        m93857l(Canvas, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - f17)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L), c30619y.getTargetBar(), typeface, AbstractC17918w0.m51506H(j16));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m93851f(C30619y c30619y, int i13, Composer composer, int i14) {
        m93849d(c30619y, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m93852g(C30619y itemState, Composer composer, int i13) {
        int i14;
        C30619y c30619y;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1791002061);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getArrowUp(), c28655q, 6);
            float f13 = 4;
            float f14 = f13 * f13;
            float f15 = 2;
            int i15 = i14;
            Modifier modifierM3416m = AbstractC1102d.m3416m(AbstractC1127a.m3488c(c2314t, 1.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524286), f14, f15 * f13);
            int i16 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3416m, c38072d.m121949b(c28655q, i16).getWhite5(), c28655q, 432, 0);
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f15, AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(3 * f13)), c38072d.m121949b(c28655q, i16).getWhite5(), AbstractC17918w0.f69621a));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
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
            TextResource title = itemState.getTitle();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(title, c28655q, i17);
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i16).getB1();
            long brandWhite = c38072d.m121949b(c28655q, i16).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i18, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getDescription(), c28655q, i17), null, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q, 0, i18, 196602);
            c28655q = c28655q;
            if (itemState.getIsOptimal()) {
                c30619y = itemState;
                c28655q.m87150e0(936015485);
                c28655q.m87173q(false);
            } else {
                AbstractC33745d.m106667z(c28655q, 935875179, c2314t, f14, c28655q);
                c30619y = itemState;
                m93849d(c30619y, c28655q, i17 | (i15 & 14));
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c30619y = itemState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30592a0(c30619y, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m93853h(C30619y c30619y, int i13, Composer composer, int i14) {
        m93852g(c30619y, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m93854i(InterfaceC22131e drawProgressBar, long j7, long j13, long j14) {
        AbstractC22676k.m65750j(drawProgressBar, "$this$drawProgressBar");
        float fMo743q0 = drawProgressBar.mo743q0(((float) 0.5d) * 4);
        InterfaceC22131e.m63374D(drawProgressBar, j14, j7, j13, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), null, 0.0f, 240);
    }

    /* JADX INFO: renamed from: j */
    private static final void m93855j(InterfaceC22131e interfaceC22131e, long j7, long j13, long j14, long j15, long j16, long j17) {
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        c17891jM51478a.m51462i(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
        c17891jM51478a.m51461h(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
        c17891jM51478a.m51461h(Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
        c17891jM51478a.m51461h(Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)));
        c17891jM51478a.m51459f();
        InterfaceC22131e.m63378L(interfaceC22131e, c17891jM51478a, C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j16), new C17919x(j17)), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)) / 3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f))), 8), 0.0f, null, 60);
    }

    /* JADX INFO: renamed from: k */
    private static final void m93856k(InterfaceC22131e interfaceC22131e, long j7, long j13, long j14) {
        float fMo743q0 = interfaceC22131e.mo743q0((float) 1.5d);
        float f13 = fMo743q0 + fMo743q0;
        float f14 = fMo743q0 / f13;
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k[] c23465kArr = {new C23465k(Float.valueOf(f14), new C17919x(C17919x.f69636m)), new C23465k(Float.valueOf(f14), new C17919x(j14))};
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f13);
        long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(-f13)) & 4294967295L;
        c17909s.getClass();
        C17894k0 c17894k0M51485c = C17909s.m51485c(c23465kArr, jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), 1);
        float fMo743q1 = interfaceC22131e.mo743q0(((float) 0.5d) * 4);
        InterfaceC22131e.m63376J0(interfaceC22131e, c17894k0M51485c, j7, j13, (((long) Float.floatToRawIntBits(fMo743q1)) << 32) | (((long) Float.floatToRawIntBits(fMo743q1)) & 4294967295L), 0.0f, null, 240);
    }

    /* JADX INFO: renamed from: l */
    private static final void m93857l(InterfaceC22131e interfaceC22131e, long j7, String str, Typeface typeface, int i13) {
        Canvas canvasM51433a = AbstractC17876d.m51433a(interfaceC22131e.mo744t0().m716w());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        Paint paint = new Paint();
        paint.setColor(i13);
        paint.setTextSize(28.0f);
        paint.setLetterSpacing(0.1f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(typeface);
        canvasM51433a.drawText(str, fIntBitsToFloat, fIntBitsToFloat2, paint);
    }
}
