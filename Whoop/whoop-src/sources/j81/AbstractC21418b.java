package j81;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import az0.C2158a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import e93.AbstractC12889b;
import i91.AbstractC18254h;
import i91.AbstractC18255i;
import i91.C18251e;
import i91.C18253g;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p181h2.C16617b;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.C17891j;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: j81.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u0010\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aO\u0010\u0016\u001a\u00020\u0005*\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aG\u0010\u001a\u001a\u00020\u0005*\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aC\u0010 \u001a\u00020\u0005*\u00020\t2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!\u001aI\u0010'\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj81/c;", "state", "Lkotlin/Function0;", "Ll83/a0;", "content", "c", "(Landroidx/compose/ui/Modifier;Lj81/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Lk2/e;", "Li2/x;", "color", "", "size", MapboxMap.QFE_OFFSET, "strokeWidthPx", "j", "(Lk2/e;JFFF)V", "lowerOptimalFill", "higherOptimalFill", "", "shouldHideOptimalRange", "k", "(Lk2/e;Ljava/lang/Float;Ljava/lang/Float;JFFFZ)V", "scoreTarget", "targetSweepAngle", "m", "(Lk2/e;Ljava/lang/Float;FFFFZ)V", "fillPercent", "Li91/h;", "background", "capCornerRadiusFraction", "l", "(Lk2/e;FLi91/h;FFFF)V", "startAngle", "Lh2/b;", "center", "radius", "strokeWidth", "f", "(Lk2/e;Li91/h;FFJFFF)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21418b {
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m60229c(Modifier modifier, final C21419c state, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4351m interfaceC4351m2;
        int i16;
        boolean z4;
        InterfaceC4351m interfaceC4351m3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        InterfaceC4351m interfaceC4351mM60256b;
        final float fMo743q0;
        final long jMo134584toComposableColorWaAFU9c;
        final long jMo134584toComposableColorWaAFU9c2;
        final float f13;
        final float f14;
        final AbstractC18254h abstractC18254hM52584a;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        boolean zM87151f;
        Object objM87133R;
        float f15;
        int iHashCode2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1510614245);
        int i18 = i14 & 1;
        if (i18 != 0) {
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
            i15 |= c28655q.m87153g(state) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i15 |= c28655q.m87157i(interfaceC4351m2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    interfaceC4351mM60256b = C21420d.f82195a.m60256b();
                } else {
                    interfaceC4351mM60256b = interfaceC4351m2;
                }
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                fMo743q0 = interfaceC39171c.mo743q0(state.getStrokeWidth());
                float fMo743q1 = interfaceC39171c.mo743q0(state.getDiameter());
                jMo134584toComposableColorWaAFU9c = state.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                jMo134584toComposableColorWaAFU9c2 = state.getOptimalRangeColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                f13 = fMo743q1 - fMo743q0;
                f14 = fMo743q0 / 2.0f;
                abstractC18254hM52584a = AbstractC18255i.m52584a(state.getBackground(), c28655q, 0);
                Modifier modifier4 = modifier3;
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(state.getDiameter(), modifier3), AbstractC33253j.f138651a);
                InterfaceC4351m interfaceC4351m4 = interfaceC4351mM60256b;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i17 = i16;
                } else {
                    i17 = i16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c) | c28655q.m87147d(f13) | c28655q.m87147d(f14) | c28655q.m87147d(fMo743q0) | c28655q.m87153g(state) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c2) | c28655q.m87153g(abstractC18254hM52584a);
                    objM87133R = c28655q.m87133R();
                    if (!zM87151f || objM87133R == C28635l.f115821a) {
                        f15 = 1.0f;
                        objM87133R = new Function1() { // from class: j81.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC21418b.m60230d(jMo134584toComposableColorWaAFU9c, f13, f14, fMo743q0, state, jMo134584toComposableColorWaAFU9c2, abstractC18254hM52584a, (InterfaceC22131e) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        f15 = 1.0f;
                    }
                    AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 6);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(f15, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    AbstractC11895b.m31978A((i17 >> 6) & 14, interfaceC4351m4, c28655q, true, true);
                    interfaceC4351m3 = interfaceC4351m4;
                    modifier2 = modifier4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c) | c28655q.m87147d(f13) | c28655q.m87147d(f14) | c28655q.m87147d(fMo743q0) | c28655q.m87153g(state) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c2) | c28655q.m87153g(abstractC18254hM52584a);
                objM87133R = c28655q.m87133R();
                if (zM87151f) {
                    f15 = 1.0f;
                    objM87133R = new Function1() { // from class: j81.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC21418b.m60230d(jMo134584toComposableColorWaAFU9c, f13, f14, fMo743q0, state, jMo134584toComposableColorWaAFU9c2, abstractC18254hM52584a, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    f15 = 1.0f;
                    objM87133R = new Function1() { // from class: j81.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC21418b.m60230d(jMo134584toComposableColorWaAFU9c, f13, f14, fMo743q0, state, jMo134584toComposableColorWaAFU9c2, abstractC18254hM52584a, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3407d3, (Function1) objM87133R, c28655q, 6);
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(f15, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                AbstractC11895b.m31978A((i17 >> 6) & 14, interfaceC4351m4, c28655q, true, true);
                interfaceC4351m3 = interfaceC4351m4;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2158a(modifier2, state, interfaceC4351m3, i13, i14, 5);
            }
        }
        i15 |= 384;
        interfaceC4351m2 = interfaceC4351m;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            if (i19 != 0) {
                interfaceC4351mM60256b = C21420d.f82195a.m60256b();
            } else {
                interfaceC4351mM60256b = interfaceC4351m2;
            }
            InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            fMo743q0 = interfaceC39171c2.mo743q0(state.getStrokeWidth());
            float fMo743q2 = interfaceC39171c2.mo743q0(state.getDiameter());
            jMo134584toComposableColorWaAFU9c = state.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            jMo134584toComposableColorWaAFU9c2 = state.getOptimalRangeColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            f13 = fMo743q2 - fMo743q0;
            f14 = fMo743q0 / 2.0f;
            abstractC18254hM52584a = AbstractC18255i.m52584a(state.getBackground(), c28655q, 0);
            Modifier modifier5 = modifier3;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(state.getDiameter(), modifier3), AbstractC33253j.f138651a);
            InterfaceC4351m interfaceC4351m5 = interfaceC4351mM60256b;
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM118994r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i17 = i16;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c) | c28655q.m87147d(f13) | c28655q.m87147d(f14) | c28655q.m87147d(fMo743q0) | c28655q.m87153g(state) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c2) | c28655q.m87153g(abstractC18254hM52584a);
                objM87133R = c28655q.m87133R();
                if (zM87151f) {
                    f15 = 1.0f;
                    objM87133R = new Function1() { // from class: j81.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC21418b.m60230d(jMo134584toComposableColorWaAFU9c, f13, f14, fMo743q0, state, jMo134584toComposableColorWaAFU9c2, abstractC18254hM52584a, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    f15 = 1.0f;
                    objM87133R = new Function1() { // from class: j81.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC21418b.m60230d(jMo134584toComposableColorWaAFU9c, f13, f14, fMo743q0, state, jMo134584toComposableColorWaAFU9c2, abstractC18254hM52584a, (InterfaceC22131e) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3407d5, (Function1) objM87133R, c28655q, 6);
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(f15, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                AbstractC11895b.m31978A((i17 >> 6) & 14, interfaceC4351m5, c28655q, true, true);
                interfaceC4351m3 = interfaceC4351m5;
                modifier2 = modifier5;
            } else {
                i17 = i16;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, c2314t);
            zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c) | c28655q.m87147d(f13) | c28655q.m87147d(f14) | c28655q.m87147d(fMo743q0) | c28655q.m87153g(state) | c28655q.m87151f(jMo134584toComposableColorWaAFU9c2) | c28655q.m87153g(abstractC18254hM52584a);
            objM87133R = c28655q.m87133R();
            if (zM87151f) {
                f15 = 1.0f;
                objM87133R = new Function1() { // from class: j81.a
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC21418b.m60230d(jMo134584toComposableColorWaAFU9c, f13, f14, fMo743q0, state, jMo134584toComposableColorWaAFU9c2, abstractC18254hM52584a, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                f15 = 1.0f;
                objM87133R = new Function1() { // from class: j81.a
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC21418b.m60230d(jMo134584toComposableColorWaAFU9c, f13, f14, fMo743q0, state, jMo134584toComposableColorWaAFU9c2, abstractC18254hM52584a, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3407d7, (Function1) objM87133R, c28655q, 6);
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(f15, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d6);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            AbstractC11895b.m31978A((i17 >> 6) & 14, interfaceC4351m5, c28655q, true, true);
            interfaceC4351m3 = interfaceC4351m5;
            modifier2 = modifier5;
        } else {
            c28655q.m87138X();
            interfaceC4351m3 = interfaceC4351m2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(modifier2, state, interfaceC4351m3, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m60230d(long j7, float f13, float f14, float f15, C21419c c21419c, long j13, AbstractC18254h abstractC18254h, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo721B0 = Canvas.mo721B0();
        C0237p c0237pMo744t0 = Canvas.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(-90.0f, jMo721B0);
            m60236j(Canvas, j7, f13, f14, f15);
            m60237k(Canvas, c21419c.getLowerOptimalPercentage(), c21419c.getHigherOptimalPercentage(), j13, f13, f14, f15, c21419c.getShouldHideOptimalRange());
            m60238l(Canvas, c21419c.getFillPercentage(), abstractC18254h, f13, f14, f15, c21419c.getCapCornerRadiusFraction());
            m60240n(Canvas, c21419c.getScoreTarget(), f13, f14, f15, 0.0f, c21419c.getShouldHideOptimalRange(), 16, null);
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m60231e(Modifier modifier, C21419c c21419c, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m60229c(modifier, c21419c, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m60232f(InterfaceC22131e drawArcWithCustomCaps, AbstractC18254h background, float f13, float f14, long j7, float f15, float f16, float f17) {
        AbstractC22676k.m65750j(drawArcWithCustomCaps, "$this$drawArcWithCustomCaps");
        AbstractC22676k.m65750j(background, "background");
        if (f14 <= 0.0f) {
            return;
        }
        float f18 = (float) (((double) f15) * 6.283185307179586d);
        float fM36283m = f14 >= 1.0f ? 359.99f : AbstractC12889b.m36283m(f14 - (f16 / f18), 0.0f, 1.0f) * 360.0f;
        float f19 = (f16 / 2.0f) * f17;
        float f24 = ((f19 / f18) * 360.0f) + f13;
        if (f14 < 0.02f) {
            long jM60235i = m60235i(j7, f15, f24);
            float f25 = 4;
            float f26 = f16 / 2;
            m60233g(drawArcWithCustomCaps, j7, f15, background, f16, f19, f24, new C16617b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM60235i & 4294967295L)) - f26)) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (jM60235i >> 32)) + f25) - (f16 / f25))) << 32)), new C16620e((((long) Float.floatToRawIntBits(f26)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L)), -3.0f);
            return;
        }
        int i13 = (int) (j7 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i13) - f15;
        int i14 = (int) (j7 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i14) - f15;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i13) + f15;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i14) + f15;
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF);
        rectF.set(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
        Path path = c17891jM51478a.f69587a;
        RectF rectF2 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF2);
        path.arcTo(rectF2, f24, fM36283m, false);
        if (background instanceof C18251e) {
            InterfaceC22131e.m63378L(drawArcWithCustomCaps, c17891jM51478a, ((C18251e) background).getBrush(), 0.0f, new C22135i(f16, 0.0f, 0, 0, null, 26), 52);
        } else {
            if (!(background instanceof C18253g)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC22131e.m63386z(drawArcWithCustomCaps, c17891jM51478a, ((C18253g) background).getColor(), 0.0f, new C22135i(f16, 0.0f, 0, 0, null, 26), 52);
        }
        m60234h(drawArcWithCustomCaps, j7, f15, background, f16, f19, f24, null, null, 0.0f, 448, null);
        m60234h(drawArcWithCustomCaps, j7, f15, background, f16, f19, f24 + fM36283m, null, null, 0.0f, 448, null);
    }

    /* JADX INFO: renamed from: g */
    private static final void m60233g(InterfaceC22131e interfaceC22131e, long j7, float f13, AbstractC18254h abstractC18254h, float f14, float f15, float f16, C16617b c16617b, C16620e c16620e, float f17) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long jFloatToRawIntBits3;
        long jFloatToRawIntBits4;
        long jM60235i = m60235i(j7, f13, f16);
        float f18 = (f16 - 90.0f) + f17;
        C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(f18, jM60235i);
            if (abstractC18254h instanceof C18251e) {
                AbstractC17911t brush = ((C18251e) abstractC18254h).getBrush();
                if (c16617b != null) {
                    jFloatToRawIntBits3 = c16617b.f63937a;
                } else {
                    float f19 = f14 / 2;
                    jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM60235i >> 32)) - f19)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM60235i & 4294967295L)) - f19)) & 4294967295L);
                }
                long j13 = jFloatToRawIntBits3;
                if (c16620e != null) {
                    jFloatToRawIntBits4 = c16620e.f63951a;
                } else {
                    jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
                }
                InterfaceC22131e.m63376J0(interfaceC22131e, brush, j13, jFloatToRawIntBits4, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), 0.0f, null, 240);
            } else {
                if (!(abstractC18254h instanceof C18253g)) {
                    throw new NoWhenBranchMatchedException();
                }
                long color = ((C18253g) abstractC18254h).getColor();
                if (c16617b != null) {
                    jFloatToRawIntBits = c16617b.f63937a;
                } else {
                    float f24 = f14 / 2;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM60235i >> 32)) - f24;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM60235i & 4294967295L)) - f24)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }
                if (c16620e != null) {
                    jFloatToRawIntBits2 = c16620e.f63951a;
                } else {
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
                }
                InterfaceC22131e.m63374D(interfaceC22131e, color, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), null, 0.0f, 240);
            }
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        } catch (Throwable th3) {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m60234h(InterfaceC22131e interfaceC22131e, long j7, float f13, AbstractC18254h abstractC18254h, float f14, float f15, float f16, C16617b c16617b, C16620e c16620e, float f17, int i13, Object obj) {
        if ((i13 & 64) != 0) {
            c16617b = null;
        }
        if ((i13 & 128) != 0) {
            c16620e = null;
        }
        if ((i13 & 256) != 0) {
            f17 = 0.0f;
        }
        m60233g(interfaceC22131e, j7, f13, abstractC18254h, f14, f15, f16, c16617b, c16620e, f17);
    }

    /* JADX INFO: renamed from: i */
    private static final long m60235i(long j7, float f13, float f14) {
        double radians = Math.toRadians(f14);
        return (((long) Float.floatToRawIntBits((((float) Math.cos(radians)) * f13) + Float.intBitsToFloat((int) (j7 >> 32)))) << 32) | (((long) Float.floatToRawIntBits((f13 * ((float) Math.sin(radians))) + Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: j */
    private static final void m60236j(InterfaceC22131e interfaceC22131e, long j7, float f13, float f14, float f15) {
        C22135i c22135i = new C22135i(f15, 0.0f, 0, 0, null, 26);
        InterfaceC22131e.m63380P(interfaceC22131e, j7, 0.0f, 360.0f, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), 0.0f, c22135i, 832);
    }

    /* JADX INFO: renamed from: k */
    private static final void m60237k(InterfaceC22131e interfaceC22131e, Float f13, Float f14, long j7, float f15, float f16, float f17, boolean z4) {
        if (f13 == null || f14 == null || z4) {
            return;
        }
        float fFloatValue = f13.floatValue() * 360.0f;
        float fFloatValue2 = (f14.floatValue() - f13.floatValue()) * 360.0f;
        C22135i c22135i = new C22135i(f17, 0.0f, 0, 0, null, 26);
        InterfaceC22131e.m63380P(interfaceC22131e, j7, fFloatValue, fFloatValue2, (((long) Float.floatToRawIntBits(f16)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f16))), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), 0.0f, c22135i, 832);
    }

    /* JADX INFO: renamed from: l */
    private static final void m60238l(InterfaceC22131e interfaceC22131e, float f13, AbstractC18254h abstractC18254h, float f14, float f15, float f16, float f17) {
        if (f13 <= 0.0f) {
            return;
        }
        float f18 = f14 / 2;
        float f19 = f15 + f18;
        m60232f(interfaceC22131e, abstractC18254h, 0.0f, f13, (((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L), f18, f16, f17);
    }

    /* JADX INFO: renamed from: m */
    private static final void m60239m(InterfaceC22131e interfaceC22131e, Float f13, float f14, float f15, float f16, float f17, boolean z4) {
        if (f13 == null || z4) {
            return;
        }
        float fFloatValue = f13.floatValue() * 360.0f;
        InterfaceC22131e.m63380P(interfaceC22131e, C17919x.f69629f, fFloatValue - (f17 / 2), f17, (((long) Float.floatToRawIntBits(f15)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f15))), (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32), 0.0f, new C22135i(f16, 0.0f, 0, 0, null, 26), 832);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m60240n(InterfaceC22131e interfaceC22131e, Float f13, float f14, float f15, float f16, float f17, boolean z4, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            f17 = 2.0f;
        }
        m60239m(interfaceC22131e, f13, f14, f15, f16, f17, z4);
    }
}
