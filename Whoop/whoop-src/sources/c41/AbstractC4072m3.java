package c41;

import a11.C0129g;
import a11.C0134l;
import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import az0.C2158a;
import b91.C2886a;
import bp0.C3527o;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.m3 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/i3;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Lc41/i3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "endIcon", "n", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V", "g", "(Lc41/i3;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4072m3 {
    /* JADX WARN: Code duplicated, block: B:32:0x0103  */
    /* JADX WARN: Code duplicated, block: B:33:0x0107  */
    /* JADX WARN: Code duplicated, block: B:38:0x0122  */
    /* JADX WARN: Code duplicated, block: B:41:0x012e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0165  */
    /* JADX WARN: Code duplicated, block: B:45:0x017b  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x021b  */
    /* JADX WARN: Code duplicated, block: B:51:0x021d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0223  */
    /* JADX WARN: Code duplicated, block: B:56:0x0246  */
    /* JADX WARN: Code duplicated, block: B:58:0x024e  */
    /* JADX WARN: Code duplicated, block: B:63:0x026c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0296  */
    /* JADX WARN: Code duplicated, block: B:70:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x030b  */
    /* JADX WARN: Code duplicated, block: B:75:0x035b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0363  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r24v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r6v2, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r6v3, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r6v6, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r7v4, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r7v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r7v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r7v8, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    private static final void m12487g(C4044i3 c4044i3, Composer composer, int i13) {
        int i14;
        ?? r10;
        double d3;
        C0209i c0209i;
        ?? r14;
        float f13;
        int iHashCode;
        C0209i c0209i2;
        int i15;
        int i16;
        ?? r39;
        C0213j c0213j;
        C0209i c0209i3;
        C0209i c0209i4;
        C2314t c2314t;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        int iHashCode2;
        ?? r19;
        long jM12916e;
        ?? r24;
        TextResource textResourceM12340i;
        ?? r25 = (C28655q) composer;
        r25.m87154g0(-528088725);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? r25.m87153g(c4044i3) : r25.m87157i(c4044i3) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (r25.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f14 = 4;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 2.5d) * f14), C2299e.f9108K, r25, 54);
            int iHashCode3 = Long.hashCode(r25.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = r25.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(r25, c2314t2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            r25.m87158i0();
            if (r25.f115903S) {
                r25.m87163l(c0213j2);
            } else {
                r25.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(r25, c0209i5, c22994r1M66759a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(r25, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (r25.f115903S) {
                d3 = 2.5d;
            } else {
                d3 = 2.5d;
                if (!AbstractC22676k.m65745e(r25.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(r25, c0209i, modifierM118962N);
                float f15 = ((Configuration) r25.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
                r14 = C38072d.f163053a;
                float f16 = 13;
                float fM124805c = (((((C39183o.m124805c(r14.m121952e(r25, 6).getN8().getStyle().f92255a.f92192b) * f15) - f16) / f16) * f14) + 6) * f14;
                float f17 = 1;
                f13 = ((float) ((((double) (f15 - f17)) * 3.5d) + d3)) * f14;
                Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1102d.m3419p(fM124805c, c2314t2), f17, f14, AbstractC4149x3.m12914c(c4044i3.getMetricStatus(), r25, 0));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(r25.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r25.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r25, modifierM95629e);
                r25.m87158i0();
                if (r25.f115903S) {
                    r25.m87163l(c0213j2);
                } else {
                    r25.m87178s0();
                }
                AbstractC28683x.m87239G(r25, c0209i5, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(r25, c0209i6, interfaceC28653p1M87165m2);
                if (r25.f115903S || !AbstractC22676k.m65745e(r25.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r25, iHashCode, c0209i7);
                }
                AbstractC28683x.m87239G(r25, c0209i, modifierM118962N2);
                if (c4044i3.getMetricIcon() != null) {
                    r25.m87150e0(206825645);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f13, c2314t2);
                    i15 = 0;
                    i16 = 6;
                    c0209i2 = c0209i;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c4044i3.getMetricIcon().toWhoopIcon(), r25, 6), null, modifierM3419p, AbstractC4149x3.m12916e(c4044i3.getMetricStatus(), r25, 0), r25, 48, 0);
                    r25.m87173q(false);
                } else {
                    c0209i2 = c0209i;
                    i15 = 0;
                    i16 = 6;
                    r25.m87150e0(207116301);
                    r25.m87173q(false);
                }
                if (c4044i3.getMetricMagnitude() != null) {
                    r25.m87150e0(207190918);
                    c0209i3 = c0209i5;
                    r39 = r14;
                    ?? r26 = i15;
                    c0213j = c0213j2;
                    c0209i4 = c0209i6;
                    c2314t = c2314t2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4044i3.getMetricMagnitude(), r25, i15), null, AbstractC4149x3.m12915d(c4044i3.getMetricStatus(), r25, i15), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, r14.m121952e(r25, i16).getN8(), null, r25, 0, 0, 196090);
                    ?? r27 = r25;
                    r27.m87173q(r26);
                    r16 = r26;
                    r15 = r27;
                } else {
                    r39 = r14;
                    ?? r28 = i15;
                    c0213j = c0213j2;
                    c0209i3 = c0209i5;
                    c0209i4 = c0209i6;
                    c2314t = r10;
                    r25.m87150e0(207457549);
                    r25.m87173q(r28);
                    r16 = r28;
                    r15 = r25;
                }
                r15.m87173q(true);
                if (c4044i3.getMetricSubTitle() != null) {
                    r17 = 1;
                } else {
                    r17 = r16;
                }
                if (r17 != 0) {
                    r15.m87150e0(1555923310);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r16);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, c2314t);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i3, c23010xM66775a);
                    AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m3);
                    if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
                    }
                    AbstractC28683x.m87239G(r15, c0209i2, modifierM118962N3);
                    String strM21274h = AbstractC8693b.m21274h(c4044i3.getMetricTitle(), r15, r16);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    r19 = r39;
                    C2886a h7 = r19.m121952e(r15, 6).getH5();
                    if (c4044i3.getMetricMagnitude() != null) {
                        r15.m87150e0(-1072466886);
                        jM12916e = AbstractC4149x3.m12915d(c4044i3.getMetricStatus(), r15, r16);
                    } else {
                        r15.m87150e0(-1072465259);
                        jM12916e = AbstractC4149x3.m12916e(c4044i3.getMetricStatus(), r15, r16);
                    }
                    r15.m87173q(r16);
                    r24 = r15;
                    AbstractC30795n.m94707h(strM21274h, modifierM3409f, jM12916e, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, h7, null, r24, 48, 3120, 185848);
                    textResourceM12340i = c4044i3.getMetricSubTitle();
                    if (textResourceM12340i != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM12340i, r24, r16), AbstractC1102d.m3409f(1.0f, c2314t), r19.m121949b(r24, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, r19.m121952e(r24, 6).getB3(), null, r24, 48, 3120, 185848);
                    ?? r29 = r24;
                    r29.m87173q(true);
                    r29.m87173q(r16);
                    r18 = r29;
                } else {
                    ?? r33 = r39;
                    r15.m87150e0(1556881365);
                    ?? r210 = r15;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4044i3.getMetricTitle(), r15, r16), AbstractC1102d.m3409f(1.0f, c2314t), r33.m121949b(r15, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, r33.m121952e(r15, 6).getB3(), null, r210, 48, 3120, 185848);
                    ?? r34 = r210;
                    r34.m87173q(r16);
                    r18 = r34;
                }
                r18.m87173q(true);
                r10 = r18;
            }
            AbstractC11266d.m30471y(iHashCode3, r25, iHashCode3, c0209i7);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(r25, c0209i, modifierM118962N);
            float f18 = ((Configuration) r25.m87161k(AndroidCompositionLocals_androidKt.f4975a)).fontScale;
            r14 = C38072d.f163053a;
            float f19 = 13;
            float fM124805c2 = (((((C39183o.m124805c(r14.m121952e(r25, 6).getN8().getStyle().f92255a.f92192b) * f18) - f19) / f19) * f14) + 6) * f14;
            float f110 = 1;
            f13 = ((float) ((((double) (f18 - f110)) * 3.5d) + d3)) * f14;
            Modifier modifierM95629e2 = AbstractC31061c.m95629e(AbstractC1102d.m3419p(fM124805c2, c2314t2), f110, f14, AbstractC4149x3.m12914c(c4044i3.getMetricStatus(), r25, 0));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(r25.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = r25.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(r25, modifierM95629e2);
            r25.m87158i0();
            if (r25.f115903S) {
                r25.m87163l(c0213j2);
            } else {
                r25.m87178s0();
            }
            AbstractC28683x.m87239G(r25, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(r25, c0209i6, interfaceC28653p1M87165m4);
            if (r25.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r25, iHashCode, c0209i7);
            } else {
                AbstractC11266d.m30471y(iHashCode, r25, iHashCode, c0209i7);
            }
            AbstractC28683x.m87239G(r25, c0209i, modifierM118962N4);
            if (c4044i3.getMetricIcon() != null) {
                r25.m87150e0(206825645);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f13, c2314t2);
                i15 = 0;
                i16 = 6;
                c0209i2 = c0209i;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c4044i3.getMetricIcon().toWhoopIcon(), r25, 6), null, modifierM3419p2, AbstractC4149x3.m12916e(c4044i3.getMetricStatus(), r25, 0), r25, 48, 0);
                r25.m87173q(false);
            } else {
                c0209i2 = c0209i;
                i15 = 0;
                i16 = 6;
                r25.m87150e0(207116301);
                r25.m87173q(false);
            }
            if (c4044i3.getMetricMagnitude() != null) {
                r25.m87150e0(207190918);
                c0209i3 = c0209i5;
                r39 = r14;
                ?? r211 = i15;
                c0213j = c0213j2;
                c0209i4 = c0209i6;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4044i3.getMetricMagnitude(), r25, i15), null, AbstractC4149x3.m12915d(c4044i3.getMetricStatus(), r25, i15), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, r14.m121952e(r25, i16).getN8(), null, r25, 0, 0, 196090);
                ?? r212 = r25;
                r212.m87173q(r211);
                r16 = r211;
                r15 = r212;
            } else {
                r39 = r14;
                ?? r213 = i15;
                c0213j = c0213j2;
                c0209i3 = c0209i5;
                c0209i4 = c0209i6;
                c2314t = r10;
                r25.m87150e0(207457549);
                r25.m87173q(r213);
                r16 = r213;
                r15 = r25;
            }
            r15.m87173q(true);
            if (c4044i3.getMetricSubTitle() != null) {
                r17 = 1;
            } else {
                r17 = r16;
            }
            if (r17 != 0) {
                r15.m87150e0(1555923310);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r16);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, c2314t);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i3, c23010xM66775a2);
                AbstractC28683x.m87239G(r15, c0209i4, interfaceC28653p1M87165m5);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
                }
                AbstractC28683x.m87239G(r15, c0209i2, modifierM118962N5);
                String strM21274h2 = AbstractC8693b.m21274h(c4044i3.getMetricTitle(), r15, r16);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                r19 = r39;
                C2886a h13 = r19.m121952e(r15, 6).getH5();
                if (c4044i3.getMetricMagnitude() != null) {
                    r15.m87150e0(-1072466886);
                    jM12916e = AbstractC4149x3.m12915d(c4044i3.getMetricStatus(), r15, r16);
                } else {
                    r15.m87150e0(-1072465259);
                    jM12916e = AbstractC4149x3.m12916e(c4044i3.getMetricStatus(), r15, r16);
                }
                r15.m87173q(r16);
                r24 = r15;
                AbstractC30795n.m94707h(strM21274h2, modifierM3409f2, jM12916e, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, h13, null, r24, 48, 3120, 185848);
                textResourceM12340i = c4044i3.getMetricSubTitle();
                if (textResourceM12340i != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM12340i, r24, r16), AbstractC1102d.m3409f(1.0f, c2314t), r19.m121949b(r24, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, r19.m121952e(r24, 6).getB3(), null, r24, 48, 3120, 185848);
                ?? r214 = r24;
                r214.m87173q(true);
                r214.m87173q(r16);
                r18 = r214;
            } else {
                ?? r35 = r39;
                r15.m87150e0(1556881365);
                ?? r215 = r15;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4044i3.getMetricTitle(), r15, r16), AbstractC1102d.m3409f(1.0f, c2314t), r35.m121949b(r15, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, r35.m121952e(r15, 6).getB3(), null, r215, 48, 3120, 185848);
                ?? r36 = r215;
                r36.m87173q(r16);
                r18 = r36;
            }
            r18.m87173q(true);
            r10 = r18;
        } else {
            r25.m87138X();
            r10 = r25;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(c4044i3, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m12488h(C4044i3 c4044i3, int i13, Composer composer, int i14) {
        m12487g(c4044i3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m12489i(Modifier modifier, C4044i3 state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1237358513);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C0129g(18);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(state))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0134l(state, function4, 9);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC31926e.m99375j(AbstractC1092a.m3360e(modifier3, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28), null, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(1228807713, c28655q, new C4065l3(state, 0)), c28655q, 12582912, 126);
                function3 = function4;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2158a(modifier2, state, function3, i13, i14, 1);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C0129g(18);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
            if ((i15 & 112) != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = z13 | ((i15 & 896) == 256);
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new C0134l(state, function4, 9);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C0134l(state, function4, 9);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC31926e.m99375j(AbstractC1092a.m3360e(modifier3, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R2, 28), null, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(1228807713, c28655q, new C4065l3(state, 0)), c28655q, 12582912, 126);
            function3 = function4;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(modifier2, state, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12490j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m12491k(C4044i3 c4044i3, Function1 function1) {
        if (c4044i3.getDestination() != null) {
            function1.invoke(c4044i3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m12492l(C4044i3 c4044i3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
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
            m12494n(null, c4044i3.getTitle(), c4044i3.getEndIcon(), c28655q, 0, 1);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            m12487g(c4044i3, c28655q, C9598e.f28134d);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12493m(Modifier modifier, C4044i3 c4044i3, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12489i(modifier, c4044i3, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m12494n(Modifier modifier, TextResource textResource, EnumC16313m0 enumC16313m0, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        EnumC16313m0 enumC16313m1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1022021372);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            EnumC16313m0 enumC16313m2 = i17 != 0 ? null : enumC16313m0;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
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
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 0.5d) * 8, 0.0f, 11);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3398t, true, 1.0f);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i15 >> 3) & 14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierM31988g, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 2, 0, null, c38072d.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 3120, 185848);
            c28655q = c28655q;
            if (enumC16313m2 == null) {
                c28655q.m87150e0(1190693302);
                c28655q.m87173q(false);
            } else {
                float f13 = 4;
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, 1190693303, enumC16313m2, c28655q, 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier2;
            enumC16313m1 = enumC16313m2;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            enumC16313m1 = enumC16313m0;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(modifier3, textResource, enumC16313m1, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12495o(Modifier modifier, TextResource textResource, EnumC16313m0 enumC16313m0, int i13, int i14, Composer composer, int i15) {
        m12494n(modifier, textResource, enumC16313m0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
