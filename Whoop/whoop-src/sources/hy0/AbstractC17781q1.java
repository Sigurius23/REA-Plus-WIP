package hy0;

import a01.C0091k;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c13.AbstractC3855a;
import c41.C4006d0;
import c51.C4233j;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import j93.AbstractC21478l0;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.C17893k;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hy0.q1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "label", "Lhy0/r1;", "timeMarkerType", "Ly3/f;", "screenWidth", "Ll83/a0;", "m", "(Lcom/whoop/design/util/TextResource;Lhy0/r1;FLandroidx/compose/runtime/Composer;II)V", "scrimWidth", "", "textWidth", "g", "(Lhy0/r1;FFLandroidx/compose/runtime/Composer;I)V", "markerType", "Lkotlin/Function1;", "onPositioned", "j", "(Lhy0/r1;FLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17781q1 {

    /* JADX INFO: renamed from: hy0.q1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69152a;

        static {
            int[] iArr = new int[EnumC17784r1.values().length];
            try {
                iArr[EnumC17784r1.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17784r1.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f69152a = iArr;
        }
    }

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
    /* JADX INFO: renamed from: g */
    private static final void m51079g(EnumC17784r1 enumC17784r1, final float f13, float f14, Composer composer, int i13) {
        int i14;
        C23465k c23465k;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(817606596);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC17784r1.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f14) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            long j7 = C17919x.f69636m;
            C17919x c17919x = new C17919x(j7);
            C38072d c38072d = C38072d.f163053a;
            final List listM118959K = AbstractC37056f.m118959K(c17919x, new C17919x(c38072d.m121949b(c28655q, 6).getBlack70()));
            final List listM118959K2 = AbstractC37056f.m118959K(new C17919x(j7), new C17919x(c38072d.m121949b(c28655q, 6).getBrandWhite()));
            final long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            int i15 = a.f69152a[enumC17784r1.ordinal()];
            if (i15 == 1) {
                c23465k = new C23465k(Float.valueOf(0.0f), Float.valueOf(interfaceC39171c.mo743q0(f13)));
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c23465k = new C23465k(Float.valueOf(f14), Float.valueOf(f14));
            }
            final float fFloatValue = ((Number) c23465k.f92937w).floatValue();
            final float fFloatValue2 = ((Number) c23465k.f92938x).floatValue();
            final float fMo743q0 = interfaceC39171c.mo743q0(3);
            float f15 = 2;
            final float fMo743q1 = interfaceC39171c.mo743q0(f15);
            final float fMo743q2 = interfaceC39171c.mo743q0(f15);
            Modifier modifierM3424u = AbstractC1102d.m3424u(f13, AbstractC1102d.m3406c(0.9f, C2314t.f9131w));
            boolean zM87153g = c28655q.m87153g(listM118959K) | c28655q.m87147d(fFloatValue) | ((i14 & 112) == 32) | c28655q.m87153g(listM118959K2) | c28655q.m87147d(fFloatValue2) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87151f(jM125430y) | c28655q.m87147d(fMo743q2);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: hy0.p1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC17781q1.m51080h(listM118959K, fFloatValue, f13, listM118959K2, fFloatValue2, fMo743q0, fMo743q1, jM125430y, fMo743q2, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3424u, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0091k(enumC17784r1, f13, f14, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m51080h(List list, float f13, float f14, List list2, float f15, float f16, float f17, long j7, float f18, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        C17909s c17909s = AbstractC17911t.f69612b;
        C17894k0 c17894k0M51493k = C17909s.m51493k(c17909s, list, 0.0f, Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)), 8);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        float fMo743q0 = Canvas.mo743q0(f14);
        InterfaceC22131e.m63385u(Canvas, c17894k0M51493k, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo743q0)) << 32), 0.0f, null, 0, 120);
        Canvas.mo727R(C17909s.m51493k(c17909s, list2, 0.0f, Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)), 8), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L), 3.0f, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f16, f17}, 0.0f)), (496 & 64) != 0 ? 1.0f : 0.0f);
        InterfaceC22131e.m63379M(Canvas, j7, f18, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L), 0.0f, null, 120);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m51081i(EnumC17784r1 enumC17784r1, float f13, float f14, int i13, Composer composer, int i14) {
        m51079g(enumC17784r1, f13, f14, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m51082j(EnumC17784r1 enumC17784r1, float f13, TextResource textResource, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1888077055);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87149e(enumC17784r1.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(textResource) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (enumC17784r1 == EnumC17784r1.START) {
                AbstractC31061c.m95623C(c28655q2, 1304944827, c2314t, f13, c28655q2);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1305010175);
                c28655q2.m87173q(false);
            }
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, (i14 >> 6) & 14);
            C38072d c38072d = C38072d.f163053a;
            C2886a c2886aM8408F = c38072d.m121952e(c28655q2, 6).getN9();
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13);
            boolean z4 = (i14 & 7168) == 2048;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C17789t0(function1, 1);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC30795n.m94707h(strM21274h, AbstractC1131a.m3500d(modifierM3398t, (Function1) objM87133R), c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8408F, null, c28655q2, 0, 0, 196600);
            c28655q = c28655q2;
            if (enumC17784r1 == EnumC17784r1.END) {
                AbstractC31061c.m95623C(c28655q, 1305391227, c2314t, f13, c28655q);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1305456575);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4233j(enumC17784r1, f13, textResource, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m51083k(Function1 function1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(Float.valueOf((int) (it.mo3541n() >> 32)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m51084l(EnumC17784r1 enumC17784r1, float f13, TextResource textResource, Function1 function1, int i13, Composer composer, int i14) {
        m51082j(enumC17784r1, f13, textResource, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m51085m(TextResource label, EnumC17784r1 timeMarkerType, float f13, Composer composer, int i13, int i14) {
        int i15;
        float f14;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(timeMarkerType, "timeMarkerType");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1596400018);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(label) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(timeMarkerType.ordinal()) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            float f15 = i16 != 0 ? 28 : f13;
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(((float) 5.0d) * 8);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC3855a.m11831o(fMo743q0, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            int i17 = i15 >> 3;
            int i18 = i17 & 14;
            int i19 = i17 & 112;
            m51079g(timeMarkerType, f15, m51086n(interfaceC28601c1), c28655q, i17 & 126);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C17767m(1, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            float f16 = f15;
            m51082j(timeMarkerType, f16, label, (Function1) objM87133R2, c28655q, i18 | 3072 | i19 | ((i15 << 6) & 896));
            c28655q.m87173q(true);
            f14 = f16;
        } else {
            c28655q.m87138X();
            f14 = f13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4006d0(label, timeMarkerType, f14, i13, i14);
        }
    }

    /* JADX INFO: renamed from: n */
    private static final float m51086n(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: o */
    private static final void m51087o(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m51088p(InterfaceC28601c1 interfaceC28601c1, float f13) {
        m51087o(interfaceC28601c1, f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m51089q(TextResource textResource, EnumC17784r1 enumC17784r1, float f13, int i13, int i14, Composer composer, int i15) {
        m51085m(textResource, enumC17784r1, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
