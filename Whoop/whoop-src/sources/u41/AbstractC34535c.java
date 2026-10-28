package u41;

import android.graphics.CornerPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bb2.C2925a;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.C17893k;
import p208i2.InterfaceC17869a1;
import p270k2.C22134h;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import t80.C33592b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: u41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lu41/b;", "state", "Ll83/a0;", "g", "(Landroidx/compose/ui/Modifier;Lu41/b;Landroidx/compose/runtime/Composer;II)V", "", "Lu41/b$a;", "", "k", "(Ljava/util/List;)Ljava/util/List;", "fraction", "", "isLast", "j", "(FZ)F", "", "index", "zoneCount", "Li2/a1;", "i", "(II)Li2/a1;", "d", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34535c {
    /* JADX INFO: renamed from: d */
    private static final void m109127d(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(162100952);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C38072d c38072d = C38072d.f163053a;
            long brandBlack = c38072d.m121949b(c28655q, 6).getBrandBlack();
            long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
            float f13 = 4;
            Modifier modifierM3411h = AbstractC1102d.m3411h(((float) 2.5d) * f13, AbstractC1102d.m3424u(f13 * f13, modifier));
            boolean zM87151f = c28655q.m87151f(brandWhite) | c28655q.m87151f(brandBlack);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                C2925a c2925a = new C2925a(brandWhite, brandBlack, 6);
                c28655q.m87172p0(c2925a);
                objM87133R = c2925a;
            }
            AbstractC21478l0.m60421a(modifierM3411h, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 25, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m109128e(long j7, long j13, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo721B0 = Canvas.mo721B0();
        C0237p c0237pMo744t0 = Canvas.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(180.0f, jMo721B0);
            float f13 = 2;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / f13)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            C17891j c17891jM51478a = AbstractC17897m.m51478a();
            int i13 = (int) (jFloatToRawIntBits >> 32);
            int i14 = (int) (jFloatToRawIntBits & 4294967295L);
            c17891jM51478a.m51462i(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
            c17891jM51478a.m51461h(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
            c17891jM51478a.m51461h(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
            c17891jM51478a.m51461h(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
            c17891jM51478a.m51459f();
            InterfaceC22131e.m63386z(Canvas, c17891jM51478a, j7, 0.0f, C22134h.f85857a, 52);
            InterfaceC22131e.m63386z(Canvas, c17891jM51478a, j13, 0.0f, new C22135i(Canvas.mo743q0(f13), 0.0f, 1, 1, new C17893k(new CornerPathEffect(Canvas.mo743q0(f13))), 2), 52);
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m109129f(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m109127d(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v17, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r13v19, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r26v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r26v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r4v1, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r4v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r4v13, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r4v14, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r7v25, types: [y81.f] */
    /* JADX WARN: Type inference failed for: r7v34, types: [x81.d] */
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
    public static final void m109130g(Modifier modifier, C34534b state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        ?? r10;
        C0209i c0209i;
        C0209i c0209i2;
        ?? r14;
        C2314t c2314t;
        C0209i c0209i3;
        C0209i c0209i4;
        float f13;
        C0213j c0213j;
        ?? r15;
        C2305k c2305k;
        List<Float> list;
        double d3;
        ?? r16;
        ?? r17;
        C2305k c2305k2 = C2299e.f9110M;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(316677307);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t2 : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N);
            String title = state.getTitle();
            if (title == null) {
                c28655q.m87150e0(1608907371);
                c28655q.m87173q(false);
                r15 = c28655q;
                c0209i4 = c0209i8;
                f13 = 1.0f;
                c0209i2 = c0209i6;
                r14 = 0;
                c2314t = c2314t2;
                c0209i3 = c0209i7;
                c0213j = c0213j2;
                c0209i = c0209i5;
            } else {
                c28655q.m87150e0(1608907372);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 1 * 8, 7);
                C38072d c38072d = C38072d.f163053a;
                C2886a b6 = c38072d.m121952e(c28655q, 6).getB2();
                long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
                c0209i = c0209i5;
                c0209i2 = c0209i6;
                r14 = 0;
                c2314t = c2314t2;
                c0209i3 = c0209i7;
                c0209i4 = c0209i8;
                f13 = 1.0f;
                c0213j = c0213j2;
                AbstractC30795n.m94707h(title, modifierM3398t, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 48, 0, 196600);
                C28655q c28655q2 = c28655q;
                c28655q2.m87173q(false);
                r15 = c28655q2;
            }
            List<Float> listM109134k = m109134k(state.m109117f());
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, r14);
            int iHashCode2 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifierM3409f2);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m2);
            if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N2);
            Float indicatorPosition = state.getIndicatorPosition();
            float f14 = 0.0f;
            if (indicatorPosition == null) {
                r15.m87150e0(261243921);
                r15.m87173q(r14);
            } else {
                r15.m87150e0(261243922);
                m109127d(AbstractC2294a.m7154a(10.0f, AbstractC29011e.m88149j(c2314t, indicatorPosition.floatValue(), 0.0f, new C29007a(0.5f, 0.9f, false, false, 12, null))), r15, r14, r14);
                r15.m87173q(r14);
            }
            r15.m87150e0(839727075);
            ?? r18 = r14;
            ?? r19 = r15;
            for (Object obj : state.m109117f()) {
                int i17 = r18 + 1;
                if (r18 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C34534b.a aVar = (C34534b.a) obj;
                Iterator it = listM109134k.subList(r14, r18).iterator();
                float fFloatValue = f14;
                while (it.hasNext()) {
                    fFloatValue += ((Number) it.next()).floatValue();
                }
                float fFloatValue2 = listM109134k.get(r18).floatValue();
                float f15 = fFloatValue + fFloatValue2;
                C2305k c2305k3 = c2305k2;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, r19, r14);
                int iHashCode3 = Long.hashCode(r19.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r19.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r19, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j3 = C0217k.f724b;
                r19.m87158i0();
                if (r19.f115903S) {
                    r19.m87163l(c0213j3);
                } else {
                    r19.m87178s0();
                }
                AbstractC28683x.m87239G(r19, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(r19, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i9 = C0217k.f732j;
                if (r19.f115903S || !AbstractC22676k.m65745e(r19.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, r19, iHashCode3, c0209i9);
                }
                AbstractC28683x.m87239G(r19, C0217k.f726d, modifierM118962N3);
                float f16 = 4;
                float f17 = fFloatValue;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC29011e.m88145f(AbstractC1102d.m3411h(((float) 1.5d) * f16, c2314t), fFloatValue, 0.0f, m109133j(fFloatValue2, r18 == AbstractC37056f.m118951C(state.m109117f()) ? 1 : r14), 0.0f, null, 26, null), aVar.getColor().mo134584toComposableColorWaAFU9c(r19, r14), m109132i(r18, state.m109117f().size())), r19, r14);
                String title2 = aVar.getTitle();
                if (title2 == null) {
                    r19.m87150e0(-750140877);
                    r19.m87173q(r14);
                    list = listM109134k;
                    c2305k = c2305k3;
                    d3 = 0.5d;
                    r16 = r19;
                } else {
                    r19.m87150e0(-750140876);
                    ?? r26 = r19;
                    c2305k = c2305k3;
                    list = listM109134k;
                    d3 = 0.5d;
                    AbstractC30795n.m94707h(title2, AbstractC29011e.m88150k(AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13), (f17 + f15) / 2, 0.0f, C29007a.INSTANCE.m88137b(), 2, null), aVar.getColor().mo134584toComposableColorWaAFU9c(r19, r14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(r19, 6).getN9(), null, r26, 0, 0, 196600);
                    ?? r24 = r26;
                    r24.m87173q(r14);
                    r16 = r24;
                }
                String label = aVar.getLabel();
                if (label == null) {
                    r16.m87150e0(-749462504);
                    r16.m87173q(r14);
                    c2314t = c2314t;
                    r17 = r16;
                } else {
                    r16.m87150e0(-749462503);
                    C2314t c2314t3 = c2314t;
                    c2314t = c2314t3;
                    Modifier modifierM88150k = AbstractC29011e.m88150k(AbstractC1099a.m3398t(c2314t3, 0.0f, ((float) d3) * f16, 0.0f, 0.0f, 13), (f17 + f15) / 2, 0.0f, C29007a.INSTANCE.m88137b(), 2, null);
                    ?? r25 = C38072d.f163053a;
                    ?? r27 = r16;
                    AbstractC30795n.m94707h(label, modifierM88150k, r25.m121949b(r16, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r25.m121952e(r16, 6).getN9(), null, r27, 0, 0, 196600);
                    ?? r28 = r27;
                    r28.m87173q(r14);
                    r17 = r28;
                }
                r17.m87173q(true);
                r18 = i17;
                c2305k2 = c2305k;
                listM109134k = list;
                f14 = 0.0f;
                r19 = r17;
            }
            AbstractC25012a.m73392y(r19, r14, true, true);
            modifier3 = modifier4;
            r10 = r19;
        } else {
            C28655q c28655q3 = c28655q;
            c28655q3.m87138X();
            modifier3 = modifier2;
            r10 = c28655q3;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(modifier3, i13, state, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m109131h(Modifier modifier, C34534b c34534b, int i13, int i14, Composer composer, int i15) {
        m109130g(modifier, c34534b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final InterfaceC17869a1 m109132i(int i13, int i14) {
        if (i14 == 1) {
            return AbstractC33253j.m105489e(2 * 4);
        }
        if (i13 == 0) {
            float f13 = 2 * 4;
            return AbstractC33253j.m105491g(f13, 0.0f, 0.0f, f13, 6);
        }
        if (i13 != i14 - 1) {
            return AbstractC17918w0.f69621a;
        }
        float f14 = 2 * 4;
        return AbstractC33253j.m105491g(0.0f, f14, f14, 0.0f, 9);
    }

    /* JADX INFO: renamed from: j */
    private static final float m109133j(float f13, boolean z4) {
        if (z4) {
            return f13;
        }
        float f14 = f13 - 0.005f;
        float f15 = f13 / 2.0f;
        return f14 < f15 ? f15 : f14;
    }

    /* JADX INFO: renamed from: k */
    private static final List<Float> m109134k(List<C34534b.a> list) {
        List<C34534b.a> list2 = list;
        Float fValueOf = Float.valueOf(0.0f);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            fValueOf = Float.valueOf(((C34534b.a) it.next()).getWeight() + fValueOf.floatValue());
        }
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList.add(Float.valueOf(((C34534b.a) it3.next()).getWeight() / fFloatValue));
        }
        return arrayList;
    }
}
