package wr0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.communitymoments.domain.models.MomentCardFillMode;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import cw2.C11161b;
import hy0.AbstractC17746g1;
import hy0.EnumC17775o1;
import ih0.AbstractC18489d0;
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
import p163g1.AbstractC15210z4;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p208i2.C17909s;
import p208i2.C17919x;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
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
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32627j2;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wo1.C37445e0;
import x81.C38072d;

/* JADX INFO: renamed from: wr0.z */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c¨\u0006\""}, m65681d2 = {"Lwr0/b0;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Lwr0/b0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lwr0/v;", "dateBadge", "i", "(Lwr0/v;Landroidx/compose/runtime/Composer;I)V", "Lwr0/a0;", "profile", "s", "(Lwr0/a0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lwr0/u;", "badge", "q", "(Lwr0/u;Landroidx/compose/runtime/Composer;I)V", "Lwr0/w;", "footer", "k", "(Lwr0/w;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "a", "F", "MomentCardFitContentWidth", "b", "AvatarSize", "c", "FooterIconSize", "community-moments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37566z {

    /* JADX INFO: renamed from: a */
    private static final float f160641a = 175;

    /* JADX INFO: renamed from: b */
    private static final float f160642b;

    /* JADX INFO: renamed from: c */
    private static final float f160643c;

    /* JADX INFO: renamed from: wr0.z$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f160644a;

        static {
            int[] iArr = new int[MomentCardFillMode.values().length];
            try {
                iArr[MomentCardFillMode.FIT_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentCardFillMode.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f160644a = iArr;
        }
    }

    static {
        float f13 = 4;
        f160642b = 10 * f13;
        f160643c = 7 * f13;
    }

    /* JADX INFO: renamed from: i */
    private static final void m120578i(C37558v c37558v, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1532058143);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c37558v) : c28655q.m87157i(c37558v) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM118994r = AbstractC37056f.m118994r(C2314t.f9131w, AbstractC33253j.m105489e(3 * 4));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q, i15).getBlack30(), AbstractC17918w0.f69621a), ((float) 1.5d) * f13, 1 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            TextResource textResourceM120554a = c37558v.getDay();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM120554a, c28655q, i16);
            C2886a c2886aM8419Q = c38072d.m121952e(c28655q, i15).getT4();
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            int i17 = (C2886a.f11498d << 18) | 3072;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c2886aM8419Q, null, c28655q, 0, i17, 188410);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c37558v.getMonth(), c28655q, i16), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 0, i17, 188410);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37564y(c37558v, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m120579j(C37558v c37558v, int i13, Composer composer, int i14) {
        m120578i(c37558v, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m120580k(C37560w c37560w, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1539729019);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c37560w) : c28655q.m87157i(c37560w) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            AbstractC22403o abstractC22403oM120556a = c37560w.getIcon();
            if (abstractC22403oM120556a == null) {
                c28655q.m87150e0(-1582013826);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1582013825);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM120556a, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(f160643c, c2314t), null, C39102j.f168200b, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 5), c28655q, 25008, 40);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            TextResource textResourceM120559d = c37560w.getTitle();
            if (textResourceM120559d == null) {
                c28655q.m87150e0(-1581666595);
                c28655q.m87173q(false);
                z4 = false;
            } else {
                c28655q.m87150e0(-1581666594);
                String strM21274h = AbstractC8693b.m21274h(textResourceM120559d, c28655q, TextResource.$stable);
                C2886a c2886aM120560e = c37560w.getTitleStyle();
                if (c2886aM120560e == null) {
                    c28655q.m87150e0(-1625863776);
                    c2886aM120560e = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT4();
                } else {
                    c28655q.m87150e0(-1625865109);
                }
                c28655q.m87173q(false);
                C28655q c28655q2 = c28655q;
                z4 = false;
                AbstractC30795n.m94707h(strM21274h, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM120560e, null, c28655q2, 0, (C2886a.f11498d << 18) | 3120, 186362);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            TextResource textResourceM120557b = c37560w.getSubtitle();
            if (textResourceM120557b == null) {
                c28655q.m87150e0(-1581346179);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(-1581346178);
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM120557b, c28655q, TextResource.$stable);
                C2886a c2886aM120558c = c37560w.getSubtitleStyle();
                if (c2886aM120558c == null) {
                    c28655q.m87150e0(734897217);
                    c2886aM120558c = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB2();
                } else {
                    c28655q.m87150e0(734895791);
                }
                c28655q.m87173q(z4);
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h(strM21274h2, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM120558c, null, c28655q3, 0, (C2886a.f11498d << 18) | 3120, 186362);
                c28655q = c28655q3;
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c37560w, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m120581l(C37560w c37560w, int i13, Composer composer, int i14) {
        m120580k(c37560w, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029f  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02be  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:120:0x031b  */
    /* JADX WARN: Code duplicated, block: B:123:0x032b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0336  */
    /* JADX WARN: Code duplicated, block: B:128:0x034a  */
    /* JADX WARN: Code duplicated, block: B:129:0x034c  */
    /* JADX WARN: Code duplicated, block: B:131:0x034f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0360  */
    /* JADX WARN: Code duplicated, block: B:136:0x036b  */
    /* JADX WARN: Code duplicated, block: B:138:0x038a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0395  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x010e  */
    /* JADX WARN: Code duplicated, block: B:73:0x012b  */
    /* JADX WARN: Code duplicated, block: B:76:0x015d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0161  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174  */
    /* JADX WARN: Code duplicated, block: B:82:0x0182  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0251  */
    /* JADX WARN: Code duplicated, block: B:91:0x0255  */
    /* JADX WARN: Code duplicated, block: B:94:0x0262  */
    /* JADX WARN: Code duplicated, block: B:96:0x0270  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r10v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v14, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    /* JADX INFO: renamed from: m */
    public static final void m120582m(C37519b0 viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        ?? r10;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        int i18;
        Modifier modifierM3384f;
        GenericInteraction interaction;
        Modifier modifier5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Function1 function5;
        AbstractC22403o image;
        C0209i c0209i4;
        C0209i c0209i5;
        C0213j c0213j2;
        C0209i c0209i6;
        ?? r14;
        ?? r15;
        int iHashCode2;
        C0209i c0209i7;
        int iHashCode3;
        ?? r16;
        C37556u badge;
        ?? r17;
        C37560w footer;
        Object objM87133R;
        boolean z13;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1376246604);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                Modifier modifier6 = modifier;
                i15 |= c28655q.m87153g(modifier6) ? 32 : 16;
                modifier2 = modifier6;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier4 = modifier2;
                        modifier4 = c2314t;
                    }
                    modifier4 = modifier2;
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C37445e0(15);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    i18 = a.f160644a[viewState.getFillMode().ordinal()];
                    if (i18 != 1) {
                        modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3424u(f160641a, c2314t), false, 0.75f);
                    } else {
                        if (i18 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 0.75f);
                    }
                    interaction = viewState.getInteraction();
                    Modifier modifierM53364e = AbstractC18489d0.m53364e(modifier4.mo3471e(modifierM3384f), 3, 4);
                    if (interaction != null) {
                        c28655q.m87150e0(-4030874);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                        C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                        C18027i c18027i = new C18027i(0);
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q.m87157i(interaction);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            objM87133R2 = new C11161b(function4, interaction, 7);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i, c1119dM43228a, false, c18027i, (InterfaceC4339a) objM87133R2, 12);
                        c28655q.m87173q(false);
                        modifier5 = modifierM3360e;
                    } else {
                        c28655q.m87150e0(-3782626);
                        c28655q.m87173q(false);
                        modifier5 = c2314t;
                    }
                    Modifier modifierMo3471e = modifierM53364e.mo3471e(modifier5);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                    C0209i c0209i8 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    }
                    c0209i3 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N);
                    function5 = function4;
                    image = viewState.getImage();
                    if (image == null) {
                        c28655q.m87150e0(241562279);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i2;
                        c0209i4 = c0209i;
                        c0209i6 = c0209i3;
                        r14 = 0;
                        c0213j2 = c0213j;
                        r15 = c28655q;
                    } else {
                        c28655q.m87150e0(241562280);
                        c0209i4 = c0209i;
                        c0209i5 = c0209i2;
                        c0213j2 = c0213j;
                        c0209i6 = c0209i3;
                        r14 = 0;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                        C28655q c28655q2 = c28655q;
                        c28655q2.m87173q(false);
                        r15 = c28655q2;
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(r15, C38072d.f163054b).getBrandBlack())), 0.0f, 0.0f, 14), null, 0.0f, 6), r15, r14);
                    Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3407d(1.0f, c2314t));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r14);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifierM3394p);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j2);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, c23010xM66775a);
                    AbstractC28683x.m87239G(r15, c0209i8, interfaceC28653p1M87165m2);
                    if (r15.f115903S && AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i7 = c0209i5;
                    } else {
                        c0209i7 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
                    }
                    AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N2);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, r15, 54);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, modifierM3409f);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j2);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, c22994r1M66759a);
                    AbstractC28683x.m87239G(r15, c0209i8, interfaceC28653p1M87165m3);
                    if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i7);
                    }
                    AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N3);
                    if (viewState.getDateBadge() != null) {
                        r15.m87150e0(-2096119630);
                        m120578i(viewState.getDateBadge(), r15, TextResource.$stable);
                        r15.m87173q(r14);
                    } else if (viewState.getProfile() != null) {
                        r15.m87150e0(-2096116891);
                        C37517a0 profile = viewState.getProfile();
                        if (1.0f > 0.0d) {
                            r16 = 1;
                        } else {
                            r16 = r14;
                        }
                        if (r16 == 0) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        m120588s(profile, function5, new LayoutWeightElement(1.0f, r14), r15, TextResource.$stable | AbstractC22403o.f87638a | GenericInteraction.$stable | ((i15 >> 3) & 112), 0);
                        r15.m87173q(r14);
                    } else {
                        r15.m87150e0(-2096109446);
                        AbstractC25012a.m73389v(c2314t, (float) r14, r15, r14);
                    }
                    badge = viewState.getBadge();
                    if (badge == null) {
                        r15.m87150e0(-554794663);
                    } else {
                        r15.m87150e0(-554794662);
                        m120586q(badge, r15, TextResource.$stable);
                    }
                    r15.m87173q(r14);
                    r15.m87173q(true);
                    if (1.0f > 0.0d) {
                        r17 = 1;
                    } else {
                        r17 = r14;
                    }
                    if (r17 == 0) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(r15, new LayoutWeightElement(1.0f, true));
                    footer = viewState.getFooter();
                    if (footer == null) {
                        r15.m87150e0(1187394847);
                    } else {
                        r15.m87150e0(1187394848);
                        int i24 = AbstractC22403o.f87638a;
                        int i25 = TextResource.$stable;
                        int i26 = i24 | i25 | i25;
                        int i27 = C2886a.f11498d;
                        m120580k(footer, r15, i26 | i27 | i27);
                    }
                    r15.m87173q(r14);
                    r15.m87173q(true);
                    r15.m87173q(true);
                    modifier3 = modifier4;
                    function3 = function5;
                    r10 = r15;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                    r10 = c28655q;
                }
                c28677v1M87180u = r10.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C37526f(i13, i14, 3, modifier3, function3, viewState);
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
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = modifier2;
                    modifier4 = c2314t;
                }
                modifier4 = modifier2;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37445e0(15);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                i18 = a.f160644a[viewState.getFillMode().ordinal()];
                if (i18 != 1) {
                    modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3424u(f160641a, c2314t), false, 0.75f);
                } else {
                    if (i18 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 0.75f);
                }
                interaction = viewState.getInteraction();
                Modifier modifierM53364e2 = AbstractC18489d0.m53364e(modifier4.mo3471e(modifierM3384f), 3, 4);
                if (interaction != null) {
                    c28655q.m87150e0(-4030874);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                    C1119d c1119dM43228a2 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                    C18027i c18027i2 = new C18027i(0);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q.m87157i(interaction);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C11161b(function4, interaction, 7);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C11161b(function4, interaction, 7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e2 = AbstractC1092a.m3360e(c2314t, interfaceC21083i2, c1119dM43228a2, false, c18027i2, (InterfaceC4339a) objM87133R2, 12);
                    c28655q.m87173q(false);
                    modifier5 = modifierM3360e2;
                } else {
                    c28655q.m87150e0(-3782626);
                    c28655q.m87173q(false);
                    modifier5 = c2314t;
                }
                Modifier modifierMo3471e2 = modifierM53364e2.mo3471e(modifier5);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m4);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N4);
                function5 = function4;
                image = viewState.getImage();
                if (image == null) {
                    c28655q.m87150e0(241562279);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i2;
                    c0209i4 = c0209i;
                    c0209i6 = c0209i3;
                    r14 = 0;
                    c0213j2 = c0213j;
                    r15 = c28655q;
                } else {
                    c28655q.m87150e0(241562280);
                    c0209i4 = c0209i;
                    c0209i5 = c0209i2;
                    c0213j2 = c0213j;
                    c0209i6 = c0209i3;
                    r14 = 0;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                    C28655q c28655q3 = c28655q;
                    c28655q3.m87173q(false);
                    r15 = c28655q3;
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(r15, C38072d.f163054b).getBrandBlack())), 0.0f, 0.0f, 14), null, 0.0f, 6), r15, r14);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3407d(1.0f, c2314t));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r14);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, modifierM3394p2);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j2);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i4, c23010xM66775a2);
                AbstractC28683x.m87239G(r15, c0209i9, interfaceC28653p1M87165m5);
                if (r15.f115903S) {
                    c0209i7 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
                } else {
                    c0209i7 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
                }
                AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N5);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, r15, 54);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = r15.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(r15, modifierM3409f2);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j2);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i4, c22994r1M66759a2);
                AbstractC28683x.m87239G(r15, c0209i9, interfaceC28653p1M87165m6);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i7);
                }
                AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N6);
                if (viewState.getDateBadge() != null) {
                    r15.m87150e0(-2096119630);
                    m120578i(viewState.getDateBadge(), r15, TextResource.$stable);
                    r15.m87173q(r14);
                } else if (viewState.getProfile() != null) {
                    r15.m87150e0(-2096116891);
                    C37517a0 profile2 = viewState.getProfile();
                    if (1.0f > 0.0d) {
                        r16 = 1;
                    } else {
                        r16 = r14;
                    }
                    if (r16 == 0) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    m120588s(profile2, function5, new LayoutWeightElement(1.0f, r14), r15, TextResource.$stable | AbstractC22403o.f87638a | GenericInteraction.$stable | ((i15 >> 3) & 112), 0);
                    r15.m87173q(r14);
                } else {
                    r15.m87150e0(-2096109446);
                    AbstractC25012a.m73389v(c2314t, (float) r14, r15, r14);
                }
                badge = viewState.getBadge();
                if (badge == null) {
                    r15.m87150e0(-554794663);
                } else {
                    r15.m87150e0(-554794662);
                    m120586q(badge, r15, TextResource.$stable);
                }
                r15.m87173q(r14);
                r15.m87173q(true);
                if (1.0f > 0.0d) {
                    r17 = 1;
                } else {
                    r17 = r14;
                }
                if (r17 == 0) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(r15, new LayoutWeightElement(1.0f, true));
                footer = viewState.getFooter();
                if (footer == null) {
                    r15.m87150e0(1187394847);
                } else {
                    r15.m87150e0(1187394848);
                    int i28 = AbstractC22403o.f87638a;
                    int i29 = TextResource.$stable;
                    int i210 = i28 | i29 | i29;
                    int i211 = C2886a.f11498d;
                    m120580k(footer, r15, i210 | i211 | i211);
                }
                r15.m87173q(r14);
                r15.m87173q(true);
                r15.m87173q(true);
                modifier3 = modifier4;
                function3 = function5;
                r10 = r15;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                r10 = c28655q;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(i13, i14, 3, modifier3, function3, viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = modifier2;
                    modifier4 = c2314t;
                }
                modifier4 = modifier2;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37445e0(15);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                i18 = a.f160644a[viewState.getFillMode().ordinal()];
                if (i18 != 1) {
                    modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3424u(f160641a, c2314t), false, 0.75f);
                } else {
                    if (i18 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 0.75f);
                }
                interaction = viewState.getInteraction();
                Modifier modifierM53364e3 = AbstractC18489d0.m53364e(modifier4.mo3471e(modifierM3384f), 3, 4);
                if (interaction != null) {
                    c28655q.m87150e0(-4030874);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                    C1119d c1119dM43228a3 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                    C18027i c18027i3 = new C18027i(0);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q.m87157i(interaction);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C11161b(function4, interaction, 7);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C11161b(function4, interaction, 7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e3 = AbstractC1092a.m3360e(c2314t, interfaceC21083i3, c1119dM43228a3, false, c18027i3, (InterfaceC4339a) objM87133R2, 12);
                    c28655q.m87173q(false);
                    modifier5 = modifierM3360e3;
                } else {
                    c28655q.m87150e0(-3782626);
                    c28655q.m87173q(false);
                    modifier5 = c2314t;
                }
                Modifier modifierMo3471e3 = modifierM53364e3.mo3471e(modifier5);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                C0209i c0209i10 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m7);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N7);
                function5 = function4;
                image = viewState.getImage();
                if (image == null) {
                    c28655q.m87150e0(241562279);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i2;
                    c0209i4 = c0209i;
                    c0209i6 = c0209i3;
                    r14 = 0;
                    c0213j2 = c0213j;
                    r15 = c28655q;
                } else {
                    c28655q.m87150e0(241562280);
                    c0209i4 = c0209i;
                    c0209i5 = c0209i2;
                    c0213j2 = c0213j;
                    c0209i6 = c0209i3;
                    r14 = 0;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                    C28655q c28655q4 = c28655q;
                    c28655q4.m87173q(false);
                    r15 = c28655q4;
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(r15, C38072d.f163054b).getBrandBlack())), 0.0f, 0.0f, 14), null, 0.0f, 6), r15, r14);
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3407d(1.0f, c2314t));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r14);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = r15.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(r15, modifierM3394p3);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j2);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i4, c23010xM66775a3);
                AbstractC28683x.m87239G(r15, c0209i10, interfaceC28653p1M87165m8);
                if (r15.f115903S) {
                    c0209i7 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
                } else {
                    c0209i7 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
                }
                AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N8);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, r15, 54);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = r15.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(r15, modifierM3409f3);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j2);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i4, c22994r1M66759a3);
                AbstractC28683x.m87239G(r15, c0209i10, interfaceC28653p1M87165m9);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i7);
                }
                AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N9);
                if (viewState.getDateBadge() != null) {
                    r15.m87150e0(-2096119630);
                    m120578i(viewState.getDateBadge(), r15, TextResource.$stable);
                    r15.m87173q(r14);
                } else if (viewState.getProfile() != null) {
                    r15.m87150e0(-2096116891);
                    C37517a0 profile3 = viewState.getProfile();
                    if (1.0f > 0.0d) {
                        r16 = 1;
                    } else {
                        r16 = r14;
                    }
                    if (r16 == 0) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    m120588s(profile3, function5, new LayoutWeightElement(1.0f, r14), r15, TextResource.$stable | AbstractC22403o.f87638a | GenericInteraction.$stable | ((i15 >> 3) & 112), 0);
                    r15.m87173q(r14);
                } else {
                    r15.m87150e0(-2096109446);
                    AbstractC25012a.m73389v(c2314t, (float) r14, r15, r14);
                }
                badge = viewState.getBadge();
                if (badge == null) {
                    r15.m87150e0(-554794663);
                } else {
                    r15.m87150e0(-554794662);
                    m120586q(badge, r15, TextResource.$stable);
                }
                r15.m87173q(r14);
                r15.m87173q(true);
                if (1.0f > 0.0d) {
                    r17 = 1;
                } else {
                    r17 = r14;
                }
                if (r17 == 0) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(r15, new LayoutWeightElement(1.0f, true));
                footer = viewState.getFooter();
                if (footer == null) {
                    r15.m87150e0(1187394847);
                } else {
                    r15.m87150e0(1187394848);
                    int i212 = AbstractC22403o.f87638a;
                    int i213 = TextResource.$stable;
                    int i214 = i212 | i213 | i213;
                    int i215 = C2886a.f11498d;
                    m120580k(footer, r15, i214 | i215 | i215);
                }
                r15.m87173q(r14);
                r15.m87173q(true);
                r15.m87173q(true);
                modifier3 = modifier4;
                function3 = function5;
                r10 = r15;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                r10 = c28655q;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(i13, i14, 3, modifier3, function3, viewState);
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
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = modifier2;
                modifier4 = c2314t;
            }
            modifier4 = modifier2;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C37445e0(15);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            i18 = a.f160644a[viewState.getFillMode().ordinal()];
            if (i18 != 1) {
                modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3424u(f160641a, c2314t), false, 0.75f);
            } else {
                if (i18 == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 0.75f);
            }
            interaction = viewState.getInteraction();
            Modifier modifierM53364e4 = AbstractC18489d0.m53364e(modifier4.mo3471e(modifierM3384f), 3, 4);
            if (interaction != null) {
                c28655q.m87150e0(-4030874);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                C1119d c1119dM43228a4 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                C18027i c18027i4 = new C18027i(0);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q.m87157i(interaction);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C11161b(function4, interaction, 7);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11161b(function4, interaction, 7);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e4 = AbstractC1092a.m3360e(c2314t, interfaceC21083i4, c1119dM43228a4, false, c18027i4, (InterfaceC4339a) objM87133R2, 12);
                c28655q.m87173q(false);
                modifier5 = modifierM3360e4;
            } else {
                c28655q.m87150e0(-3782626);
                c28655q.m87173q(false);
                modifier5 = c2314t;
            }
            Modifier modifierMo3471e4 = modifierM53364e4.mo3471e(modifier5);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
            C0209i c0209i11 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m10);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            }
            c0209i3 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N10);
            function5 = function4;
            image = viewState.getImage();
            if (image == null) {
                c28655q.m87150e0(241562279);
                c28655q.m87173q(false);
                c0209i5 = c0209i2;
                c0209i4 = c0209i;
                c0209i6 = c0209i3;
                r14 = 0;
                c0213j2 = c0213j;
                r15 = c28655q;
            } else {
                c28655q.m87150e0(241562280);
                c0209i4 = c0209i;
                c0209i5 = c0209i2;
                c0213j2 = c0213j;
                c0209i6 = c0209i3;
                r14 = 0;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                C28655q c28655q5 = c28655q;
                c28655q5.m87173q(false);
                r15 = c28655q5;
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(r15, C38072d.f163054b).getBrandBlack())), 0.0f, 0.0f, 14), null, 0.0f, 6), r15, r14);
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, r14);
            iHashCode2 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = r15.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(r15, modifierM3394p4);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j2);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i4, c23010xM66775a4);
            AbstractC28683x.m87239G(r15, c0209i11, interfaceC28653p1M87165m11);
            if (r15.f115903S) {
                c0209i7 = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
            } else {
                c0209i7 = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i7);
            }
            AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N11);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, r15, 54);
            iHashCode3 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = r15.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(r15, modifierM3409f4);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j2);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i4, c22994r1M66759a4);
            AbstractC28683x.m87239G(r15, c0209i11, interfaceC28653p1M87165m12);
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i7);
            } else {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i7);
            }
            AbstractC28683x.m87239G(r15, c0209i6, modifierM118962N12);
            if (viewState.getDateBadge() != null) {
                r15.m87150e0(-2096119630);
                m120578i(viewState.getDateBadge(), r15, TextResource.$stable);
                r15.m87173q(r14);
            } else if (viewState.getProfile() != null) {
                r15.m87150e0(-2096116891);
                C37517a0 profile4 = viewState.getProfile();
                if (1.0f > 0.0d) {
                    r16 = 1;
                } else {
                    r16 = r14;
                }
                if (r16 == 0) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m120588s(profile4, function5, new LayoutWeightElement(1.0f, r14), r15, TextResource.$stable | AbstractC22403o.f87638a | GenericInteraction.$stable | ((i15 >> 3) & 112), 0);
                r15.m87173q(r14);
            } else {
                r15.m87150e0(-2096109446);
                AbstractC25012a.m73389v(c2314t, (float) r14, r15, r14);
            }
            badge = viewState.getBadge();
            if (badge == null) {
                r15.m87150e0(-554794663);
            } else {
                r15.m87150e0(-554794662);
                m120586q(badge, r15, TextResource.$stable);
            }
            r15.m87173q(r14);
            r15.m87173q(true);
            if (1.0f > 0.0d) {
                r17 = 1;
            } else {
                r17 = r14;
            }
            if (r17 == 0) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(r15, new LayoutWeightElement(1.0f, true));
            footer = viewState.getFooter();
            if (footer == null) {
                r15.m87150e0(1187394847);
            } else {
                r15.m87150e0(1187394848);
                int i216 = AbstractC22403o.f87638a;
                int i217 = TextResource.$stable;
                int i218 = i216 | i217 | i217;
                int i219 = C2886a.f11498d;
                m120580k(footer, r15, i218 | i219 | i219);
            }
            r15.m87173q(r14);
            r15.m87173q(true);
            r15.m87173q(true);
            modifier3 = modifier4;
            function3 = function5;
            r10 = r15;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            r10 = c28655q;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 3, modifier3, function3, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m120583n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m120584o(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m120585p(C37519b0 c37519b0, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m120582m(c37519b0, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m120586q(C37556u c37556u, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1896010345);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(c37556u) : c28655q2.m87157i(c37556u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            TextResource textResourceM120478a = c37556u.getText();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC17746g1.m50874j(textResourceM120478a, c38072d.m121949b(c28655q2, i15).getWhite70(), null, c38072d.m121949b(c28655q2, i15).getBrandBlack(), null, false, null, null, 0.0f, EnumC17775o1.BADGE_SMALL_SECONDARY_NEUTRAL, AbstractC33253j.m105489e(2 * 4), 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q, TextResource.$stable | 805306368, 0, 0, 8387060);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c37556u, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m120587r(C37556u c37556u, int i13, Composer composer, int i14) {
        m120586q(c37556u, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x024c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0257  */
    /* JADX WARN: Code duplicated, block: B:90:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    private static final void m120588s(C37517a0 c37517a0, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        GenericInteraction genericInteractionM120297a;
        C2314t c2314t2;
        Modifier modifierM3360e;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        AbstractC22403o abstractC22403oM120298b;
        C0209i c0209i4;
        float f14;
        C0209i c0209i5;
        C0209i c0209i6;
        boolean z13;
        boolean z14;
        int iHashCode2;
        int i16;
        C38072d c38072d;
        int i17;
        int i18;
        TextResource textResourceM120300d;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean z15;
        boolean zM87157i;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-725406543);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c37517a0) : c28655q.m87157i(c37517a0) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                genericInteractionM120297a = c37517a0.getAction();
                if (genericInteractionM120297a != null) {
                    c28655q.m87150e0(1689376538);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                    C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                    C18027i c18027i = new C18027i(0);
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i = z15 | c28655q.m87157i(genericInteractionM120297a);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C11161b(function1, genericInteractionM120297a, 8);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i, c1119dM43228a, false, c18027i, (InterfaceC4339a) objM87133R2, 12);
                    c2314t2 = c2314t;
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c28655q.m87150e0(1689604233);
                    c28655q.m87173q(false);
                    modifierM3360e = c2314t2;
                }
                Modifier modifierMo3471e = modifier4.mo3471e(modifierM3360e);
                f13 = 8;
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, f13, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                abstractC22403oM120298b = c37517a0.getAvatar();
                if (abstractC22403oM120298b == null) {
                    c28655q.m87150e0(-2144254797);
                    c28655q.m87173q(false);
                    c0209i4 = c0209i3;
                    c0209i6 = c0209i;
                    z13 = false;
                    f14 = f13;
                    c0209i5 = c0209i2;
                } else {
                    c28655q.m87150e0(-2144254796);
                    c0209i4 = c0209i3;
                    f14 = f13;
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i;
                    z13 = false;
                    c28655q = c28655q;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM120298b, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(f160642b, c2314t2), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                    c28655q.m87173q(false);
                }
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z13);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.25d) * f14), C2299e.f9110M, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
                TextResource textResourceM120299c = c37517a0.getName();
                i16 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM120299c, c28655q, i16);
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i17).getB1();
                long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
                i18 = (C2886a.f11498d << 18) | 3120;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM8420a, null, c28655q2, 0, i18, 186362);
                c28655q = c28655q2;
                textResourceM120300d = c37517a0.getSubtitle();
                if (textResourceM120300d == null) {
                    c28655q.m87150e0(-870932071);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-870932070);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM120300d, c28655q, i16), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 186362);
                    c28655q = c28655q;
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(c37517a0, function1, modifier3, i13, i14, 4);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            genericInteractionM120297a = c37517a0.getAction();
            if (genericInteractionM120297a != null) {
                c28655q.m87150e0(1689376538);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                C1119d c1119dM43228a2 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                C18027i c18027i2 = new C18027i(0);
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = z15 | c28655q.m87157i(genericInteractionM120297a);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C11161b(function1, genericInteractionM120297a, 8);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11161b(function1, genericInteractionM120297a, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i2, c1119dM43228a2, false, c18027i2, (InterfaceC4339a) objM87133R2, 12);
                c2314t2 = c2314t;
                c28655q.m87173q(false);
            } else {
                c2314t2 = c2314t;
                c28655q.m87150e0(1689604233);
                c28655q.m87173q(false);
                modifierM3360e = c2314t2;
            }
            Modifier modifierMo3471e2 = modifier4.mo3471e(modifierM3360e);
            f13 = 8;
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(1, f13, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N3);
            abstractC22403oM120298b = c37517a0.getAvatar();
            if (abstractC22403oM120298b == null) {
                c28655q.m87150e0(-2144254797);
                c28655q.m87173q(false);
                c0209i4 = c0209i3;
                c0209i6 = c0209i;
                z13 = false;
                f14 = f13;
                c0209i5 = c0209i2;
            } else {
                c28655q.m87150e0(-2144254796);
                c0209i4 = c0209i3;
                f14 = f13;
                c0209i5 = c0209i2;
                c0209i6 = c0209i;
                z13 = false;
                c28655q = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM120298b, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(f160642b, c2314t2), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                c28655q.m87173q(false);
            }
            if (1.0f > 0.0d) {
                z14 = true;
            } else {
                z14 = z13;
            }
            if (!z14) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, z13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.25d) * f14), C2299e.f9110M, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
            TextResource textResourceM120299c2 = c37517a0.getName();
            i16 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM120299c2, c28655q, i16);
            c38072d = C38072d.f163053a;
            i17 = C38072d.f163054b;
            C2886a c2886aM8420a2 = c38072d.m121952e(c28655q, i17).getB1();
            long brandWhite2 = c38072d.m121949b(c28655q, i17).getBrandWhite();
            i18 = (C2886a.f11498d << 18) | 3120;
            C28655q c28655q3 = c28655q;
            AbstractC30795n.m94707h(strM21274h2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM8420a2, null, c28655q3, 0, i18, 186362);
            c28655q = c28655q3;
            textResourceM120300d = c37517a0.getSubtitle();
            if (textResourceM120300d == null) {
                c28655q.m87150e0(-870932071);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-870932070);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM120300d, c28655q, i16), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 186362);
                c28655q = c28655q;
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(c37517a0, function1, modifier3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m120589t(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m120590u(C37517a0 c37517a0, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m120588s(c37517a0, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
