package h02;

import android.graphics.Typeface;
import android.text.Html;
import android.text.Layout;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fc0.C14361e;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17918w0;
import p208i2.C17924z0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.AbstractC23276r;
import p294l3.AbstractC23278s;
import p294l3.C23245b0;
import p294l3.C23246c;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23260j;
import p294l3.C23264l;
import p294l3.C23266m;
import p294l3.C23267m0;
import p294l3.C23271o0;
import p294l3.C23282u;
import p294l3.C23283u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p392p3.C28783u;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p571w3.C36781q;
import p636y3.C39183o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q30.C29934u0;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: h02.w */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh02/x;", "state", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lh02/x;Landroidx/compose/runtime/Composer;II)V", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16599w {
    /* JADX WARN: Code duplicated, block: B:152:0x05cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r25v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r25v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v14, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r4v27, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r6v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r6v6, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r6v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
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
    /* JADX INFO: renamed from: b */
    public static final void m47108b(Modifier modifier, C16600x state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        ?? r10;
        C2314t c2314t;
        ?? r14;
        float f13;
        float f14;
        int i16;
        float f15;
        C28655q c28655q;
        ?? r15;
        String url;
        AbstractC28771i c28783u;
        C23267m0 c23267m0;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1114758398);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t2 : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            float f16 = 2;
            float f17 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16 * f17), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
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
            if (AbstractC39414r.m125890i0(state.getHeader())) {
                c2314t = c2314t2;
                r14 = 0;
                f13 = f16;
                f14 = f17;
                i16 = 6;
                f15 = 1.0f;
                c28655q2.m87150e0(-1288424690);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-1288622005);
                String strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getHeader()), c28655q2, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                f13 = f16;
                f14 = f17;
                i16 = 6;
                c2314t = c2314t2;
                r14 = 0;
                f15 = 1.0f;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i18).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getT3(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                C28655q c28655q3 = c28655q2;
                c28655q3.m87173q(false);
                c28655q = c28655q3;
            }
            c28655q.m87150e0(-1288486533);
            ?? r16 = c28655q;
            for (C16597u c16597u : state.m47110a()) {
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(f15, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * f14), C2299e.f9108K, r16, 54);
                int iHashCode2 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j2);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N2);
                ?? r25 = r16;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c16597u.getIcon(), null, null, r16, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(f13 * 4, c2314t), null, null, 0.0f, null, r25, 432, 120);
                String strM21274h2 = AbstractC8693b.m21274h(AbstractC8693b.m21278l(c16597u.getText()), r25, TextResource.$stable);
                ?? r17 = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h2, null, r17.m121949b(r25, i19).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r17.m121952e(r25, i19).getB2(), null, r25, 0, C2886a.f11498d << 18, 196602);
                ?? r18 = r25;
                r18.m87173q(true);
                f15 = 1.0f;
                r16 = r18;
            }
            r16.m87173q(r14);
            if (AbstractC39414r.m125890i0(state.getDescription())) {
                r16.m87150e0(-1287218418);
                r16.m87173q(r14);
                r15 = r16;
            } else {
                r16.m87150e0(-1287635492);
                boolean zM87153g = r16.m87153g(state.getDescription());
                Object objM87133R = r16.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    int i24 = C23254g.f92133E;
                    C36781q c36781q = null;
                    ?? FromHtml = Html.fromHtml(AbstractC11266d.m30461o("<ContentHandlerReplacementTag />", state.getDescription()), 63, null, AbstractC23278s.f92233a);
                    C23248d c23248d = new C23248d(FromHtml.length());
                    boolean z4 = FromHtml instanceof C23254g;
                    ?? r19 = c23248d.f92119w;
                    if (z4) {
                        c23248d.m67301c((C23254g) FromHtml);
                    } else {
                        r19.append(FromHtml);
                    }
                    Object[] spans = FromHtml.getSpans(r14, r19.length(), Object.class);
                    int length = spans.length;
                    for (?? r24 = r14; r24 < length; r24++) {
                        Object obj = spans[r24];
                        long jM60431f = AbstractC21478l0.m60431f(FromHtml.getSpanStart(obj), FromHtml.getSpanEnd(obj));
                        int i25 = C23283u0.f92252c;
                        int i26 = (int) (jM60431f >> 32);
                        int i27 = (int) (jM60431f & 4294967295L);
                        if (!(obj instanceof AbsoluteSizeSpan)) {
                            boolean z13 = obj instanceof AlignmentSpan;
                            ArrayList arrayList = c23248d.f92121y;
                            int i28 = 3;
                            if (z13) {
                                Layout.Alignment alignment = ((AlignmentSpan) obj).getAlignment();
                                int i29 = alignment == null ? -1 : AbstractC23276r.f92226a[alignment.ordinal()];
                                if (i29 == 1) {
                                    i28 = 5;
                                } else if (i29 != 2) {
                                    i28 = i29 != 3 ? Integer.MIN_VALUE : i16;
                                }
                                arrayList.add(new C23246c(null, i26, i27, 8, new C23245b0(i28, c36781q, 510)));
                            } else {
                                if (obj instanceof C23260j) {
                                    C23260j c23260j = (C23260j) obj;
                                    arrayList.add(new C23246c(i26, i27, new C23271o0(c23260j.f92148b), c23260j.f92147a));
                                } else if (obj instanceof BackgroundColorSpan) {
                                    c23248d.m67299a(new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, AbstractC17918w0.m51515c(((BackgroundColorSpan) obj).getBackgroundColor()), (C36776l) null, (C17924z0) null, 63487), i26, i27);
                                } else {
                                    if (obj instanceof C23266m) {
                                        long j7 = C23264l.f92160d;
                                        C23266m c23266m = (C23266m) obj;
                                        int i34 = c23266m.f92189b;
                                        AbstractC35745c.m113242a(j7);
                                        long jM113248j = AbstractC35745c.m113248j(C39183o.m124805c(j7) * i34, j7 & 1095216660480L);
                                        C23264l c23264l = c23266m.f92188a;
                                        arrayList.add(new C23246c(null, i26, i27, 8, new C23245b0(r14, new C36781q(jM113248j, jM113248j), 503)));
                                        arrayList.add(new C23246c(null, i26, i27, 8, c23264l));
                                    } else if (obj instanceof ForegroundColorSpan) {
                                        c23248d.m67299a(new C23267m0(AbstractC17918w0.m51515c(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534), i26, i27);
                                    } else if (obj instanceof RelativeSizeSpan) {
                                        c23248d.m67299a(new C23267m0(0L, AbstractC35745c.m113248j(((RelativeSizeSpan) obj).getSizeChange(), 8589934592L), (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65533), i26, i27);
                                    } else if (obj instanceof StrikethroughSpan) {
                                        c23248d.m67299a(new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157353d, (C17924z0) null, 61439), i26, i27);
                                    } else if (obj instanceof StyleSpan) {
                                        int style = ((StyleSpan) obj).getStyle();
                                        if (style == 1) {
                                            c23267m0 = new C23267m0(0L, 0L, C28780r.f116542I, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65531);
                                        } else if (style != 2) {
                                            c23267m0 = style != 3 ? null : new C23267m0(0L, 0L, C28780r.f116542I, new C28776n(1), (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65523);
                                        } else {
                                            c23267m0 = new C23267m0(0L, 0L, (C28780r) null, new C28776n(1), (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65527);
                                        }
                                        if (c23267m0 != null) {
                                            c23248d.m67299a(c23267m0, i26, i27);
                                        }
                                    } else if (obj instanceof SubscriptSpan) {
                                        c23248d.m67299a(new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, new C36765a(-0.5f), (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65279), i26, i27);
                                    } else if (obj instanceof SuperscriptSpan) {
                                        c23248d.m67299a(new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, new C36765a(0.5f), (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65279), i26, i27);
                                    } else if (obj instanceof TypefaceSpan) {
                                        TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                                        String family = typefaceSpan.getFamily();
                                        if (AbstractC22676k.m65745e(family, "cursive")) {
                                            c28783u = AbstractC28771i.f116518E;
                                        } else if (AbstractC22676k.m65745e(family, "monospace")) {
                                            c28783u = AbstractC28771i.f116522z;
                                        } else if (AbstractC22676k.m65745e(family, "sans-serif")) {
                                            c28783u = AbstractC28771i.f116520x;
                                        } else if (AbstractC22676k.m65745e(family, "serif")) {
                                            c28783u = AbstractC28771i.f116521y;
                                        } else {
                                            String family2 = typefaceSpan.getFamily();
                                            if (family2 == null || family2.length() == 0) {
                                                c28783u = null;
                                            } else {
                                                Typeface typefaceCreate = Typeface.create(family2, (int) r14);
                                                Typeface typeface = Typeface.DEFAULT;
                                                if (AbstractC22676k.m65745e(typefaceCreate, typeface) || AbstractC22676k.m65745e(typefaceCreate, Typeface.create(typeface, (int) r14))) {
                                                    typefaceCreate = null;
                                                }
                                                if (typefaceCreate != null) {
                                                    c28783u = new C28783u(new C29934u0(typefaceCreate, 20));
                                                } else {
                                                    c28783u = null;
                                                }
                                            }
                                        }
                                        c23248d.m67299a(new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, c28783u, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65503), i26, i27);
                                    } else if (obj instanceof UnderlineSpan) {
                                        c23248d.m67299a(new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439), i26, i27);
                                    } else if ((obj instanceof URLSpan) && (url = ((URLSpan) obj).getURL()) != null) {
                                        C23282u c23282u = new C23282u(url, null, null);
                                        c36781q = null;
                                        arrayList.add(new C23246c(null, i26, i27, 8, c23282u));
                                    }
                                    c36781q = null;
                                }
                                c36781q = null;
                            }
                        }
                    }
                    objM87133R = c23248d.m67309k();
                    r16.m87172p0(objM87133R);
                }
                ?? r26 = C38072d.f163053a;
                int i35 = C38072d.f163054b;
                ?? r27 = r16;
                AbstractC15011f9.m43115c((C23254g) objM87133R, null, r26.m121949b(r16, i35).getBrandBlack(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, AbstractC33745d.m106661t(r26, r16, i35), r27, 0, 0, 131066);
                ?? r28 = r27;
                r28.m87173q(r14);
                r15 = r28;
            }
            r15.m87173q(true);
            modifier3 = modifier4;
            r10 = r15;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            r10 = c28655q2;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(modifier3, state, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m47109c(Modifier modifier, C16600x c16600x, int i13, int i14, Composer composer, int i15) {
        m47108b(modifier, c16600x, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
