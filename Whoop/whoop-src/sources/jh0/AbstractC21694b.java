package jh0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import java.io.IOException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.C15079m3;
import p208i2.C17903p;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p251jg.C21650c;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: jh0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "", "startIcon", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "e", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lt0/i;", "a", "Lt0/i;", "tileShape", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21694b {

    /* JADX INFO: renamed from: a */
    private static final C33252i f83291a = AbstractC33253j.m105489e(2 * 4);

    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x01af  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x0232  */
    /* JADX WARN: Code duplicated, block: B:78:0x0247  */
    /* JADX WARN: Code duplicated, block: B:80:0x0267  */
    /* JADX WARN: Code duplicated, block: B:83:0x0273  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m61094e(Modifier modifier, TextResource title, Integer num, InterfaceC4339a onClick, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Integer num2;
        int i16;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        Integer num3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        Integer num4;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2;
        float f14;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        int i17;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1508542049);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(title) : c28655q3.m87157i(title) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                num2 = num;
                i15 |= c28655q3.m87153g(num2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q3.m87157i(onClick)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                f13 = 8;
                float f15 = 2 * f13;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3362g(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3), f83291a), AbstractC15673b0.m43978D(), null, 0.0f, 6), false, null, null, onClick, 15), f15, f15);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q3, 54);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                if (num4 != null) {
                    c28655q3.m87150e0(1552572797);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(num4.intValue(), c28655q3, ((i16 >> 3) & 112) | 6);
                    C17903p c17903p = new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getBrandWhite(), 5);
                    c28655q2 = c28655q3;
                    f14 = f13;
                    AbstractC29125c.m88524d(c27430eM107874S, null, AbstractC1102d.m3419p(6 * 4, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * f13, 0.0f, 11)), c17903p, c28655q2, 432, 56);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2 = c28655q3;
                    f14 = f13;
                    c28655q2.m87150e0(1552899847);
                    c28655q2.m87173q(false);
                }
                String strM21274h = AbstractC8693b.m21274h(title, c28655q2, TextResource.$stable | ((i16 >> 3) & 14));
                C38072d c38072d = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                C2886a b6 = c38072d.m121952e(c28655q2, i24).getB1();
                long brandWhite = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                if (!(((double) 1.0f) > 0.0d)) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                C28655q c28655q4 = c28655q2;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q4, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q4;
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q, 6);
                float f16 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f16 * f16, AbstractC1099a.m3398t(c2314t, 1 * f14, 0.0f, 0.0f, 0.0f, 14));
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C21650c(5);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3419p, (Function1) objM87133R);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21650c(6);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC29125c.m88524d(c27430eM107874S2, null, AbstractC1125a.m3479b(modifierM3486a, (Function1) objM87133R2), null, c28655q, 48, 120);
                c28655q.m87173q(true);
                num3 = num4;
                modifier3 = modifier5;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                modifier3 = modifier2;
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(modifier3, title, num3, onClick, i13, i14, 20);
            }
        }
        i15 |= 384;
        num2 = num;
        if ((i13 & 3072) == 0) {
            if (c28655q3.m87157i(onClick)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i19 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            f13 = 8;
            float f17 = 2 * f13;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3), f83291a), AbstractC15673b0.m43978D(), null, 0.0f, 6), false, null, null, onClick, 15), f17, f17);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q3, 54);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
            if (num4 != null) {
                c28655q3.m87150e0(1552572797);
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(num4.intValue(), c28655q3, ((i16 >> 3) & 112) | 6);
                C17903p c17903p2 = new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getBrandWhite(), 5);
                c28655q2 = c28655q3;
                f14 = f13;
                AbstractC29125c.m88524d(c27430eM107874S3, null, AbstractC1102d.m3419p(6 * 4, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * f13, 0.0f, 11)), c17903p2, c28655q2, 432, 56);
                c28655q2.m87173q(false);
            } else {
                c28655q2 = c28655q3;
                f14 = f13;
                c28655q2.m87150e0(1552899847);
                c28655q2.m87173q(false);
            }
            String strM21274h2 = AbstractC8693b.m21274h(title, c28655q2, TextResource.$stable | ((i16 >> 3) & 14));
            C38072d c38072d2 = C38072d.f163053a;
            int i25 = C38072d.f163054b;
            C2886a b8 = c38072d2.m121952e(c28655q2, i25).getB1();
            long brandWhite2 = c38072d2.m121949b(c28655q2, i25).getBrandWhite();
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            C28655q c28655q5 = c28655q2;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94707h(strM21274h2, new LayoutWeightElement(1.0f, true), brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q5, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q5;
            C27430e c27430eM107874S4 = AbstractC34132o.m107874S(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q, 6);
            float f18 = 4;
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f18 * f18, AbstractC1099a.m3398t(c2314t, 1 * f14, 0.0f, 0.0f, 0.0f, 14));
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C21650c(5);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM3419p2, (Function1) objM87133R);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C21650c(6);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC29125c.m88524d(c27430eM107874S4, null, AbstractC1125a.m3479b(modifierM3486a2, (Function1) objM87133R2), null, c28655q, 48, 120);
            c28655q.m87173q(true);
            num3 = num4;
            modifier3 = modifier6;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            modifier3 = modifier2;
            num3 = num2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(modifier3, title, num3, onClick, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m61095f(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(0.99f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C14018g m61096g(C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C21650c(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m61097h(InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, AbstractC15673b0.m43972A(), 0L, 0L, 0.0f, null, 9, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m61098i(Modifier modifier, TextResource textResource, Integer num, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m61094e(modifier, textResource, num, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
