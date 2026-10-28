package vy0;

import a11.C0131i;
import android.content.res.Configuration;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b23.C2342h;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import e61.C12762e;
import eo2.C13392l;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.C11365j0;
import p077d0.C11373l0;
import p077d0.C11381n0;
import p077d0.C11385o0;
import p077d0.C11407v;
import p077d0.EnumC11408v0;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22949e;
import p291l0.C22994r1;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p459rf.C31345p;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import v63.AbstractC35745c;
import vb1.C35868a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: vy0.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u0017\u001a\u000f\u0010\u001c\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u0017\u001a\u000f\u0010\u001d\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u0017\u001a\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0011H\u0003¢\u0006\u0004\b#\u0010$\"\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'¨\u00060²\u0006\u000e\u0010+\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010,\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010-\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010/\u001a\u00020\t8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "A", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lvy0/j0;", "state", "", "alpha", "", "previewMaxLines", "Lkotlin/Function0;", "onClick", "G", "(Landroidx/compose/ui/Modifier;Lvy0/j0;FLjava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "hasText", "glowIntensity", "u", "(ZFLandroidx/compose/runtime/Composer;I)V", "q", "(Landroidx/compose/runtime/Composer;I)V", "intensity", "s", "(FLandroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "y", "o", "isGlowing", "R", "(ZLandroidx/compose/runtime/Composer;I)F", "isAnimating", "Lvy0/a;", "M", "(ZLandroidx/compose/runtime/Composer;I)Lvy0/a;", "Li2/x;", "a", "J", "aiPurpleColor", "b", "aiTealColor", "textWidth", "shimmerPosition", "currentWidth", "animatedRotation", "animatedIntensity", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36578h0 {

    /* JADX INFO: renamed from: a */
    private static final long f156670a = AbstractC17918w0.m51517e(4287324927L);

    /* JADX INFO: renamed from: b */
    private static final long f156671b = AbstractC17918w0.m51517e(4283487743L);

    /* JADX INFO: renamed from: vy0.h0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f156672a;

        static {
            int[] iArr = new int[EnumC36580i0.values().length];
            try {
                iArr[EnumC36580i0.ICON_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36580i0.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36580i0.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f156672a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:40:0x0149  */
    /* JADX WARN: Code duplicated, block: B:42:0x018d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0197  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: A */
    private static final void m117323A(String str, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28690z0 interfaceC28690z0;
        C11365j0 c11365j0M30559g;
        float fM117326D;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-215714925);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(str) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                C11373l0 c11373l0M30571s = AbstractC11348f.m30571s("ShimmerText", c28655q, 0);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, m117324B(interfaceC28690z0), AbstractC11348f.m30569q(new C11347e2(1000, 200, AbstractC11333b0.f36312c), EnumC11408v0.f36577w, 4), "ShimmerPosition", c28655q, 28728, 0);
                float fMo743q0 = interfaceC39171c.mo743q0(8 * 2.0f);
                C38072d c38072d = C38072d.f163053a;
                C23285v0 c23285v0M53377r = AbstractC18489d0.m53377r(c38072d, c28655q, 6);
                long jM113246h = AbstractC35745c.m113246h(15);
                C17909s c17909s = AbstractC17911t.f69612b;
                List listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, 6).getWhite50()), new C17919x(c38072d.m121949b(c28655q, 6).getBrandWhite()), new C17919x(c38072d.m121949b(c28655q, 6).getWhite50()));
                fM117326D = fMo743q0;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(m117326D(c11365j0M30559g) - fMo743q0)) << 32);
                if (m117326D(c11365j0M30559g) != 0.0f) {
                    fM117326D = m117326D(c11365j0M30559g) + fM117326D;
                }
                C2886a c2886a = new C2886a(C23285v0.m67363a(c23285v0M53377r, C17909s.m51486d(c17909s, listM118959K, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM117326D)) << 32), 8), jM113246h, null, null, 0L, 33554426), c38072d.m121952e(c28655q, 6).getB2().getType());
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36585m(interfaceC28690z0, 2);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC30795n.m94707h(str, AbstractC1131a.m3500d(modifier4, (Function1) objM87133R2), 0L, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 1, 0, null, c2886a, null, c28655q, i16 & 14, 3120, 185852);
                c28655q = c28655q;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13392l(str, modifier3, i13, i14, 8);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i15;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            C11373l0 c11373l0M30571s2 = AbstractC11348f.m30571s("ShimmerText", c28655q, 0);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s2, 0.0f, m117324B(interfaceC28690z0), AbstractC11348f.m30569q(new C11347e2(1000, 200, AbstractC11333b0.f36312c), EnumC11408v0.f36577w, 4), "ShimmerPosition", c28655q, 28728, 0);
            float fMo743q1 = interfaceC39171c2.mo743q0(8 * 2.0f);
            C38072d c38072d2 = C38072d.f163053a;
            C23285v0 c23285v0M53377r2 = AbstractC18489d0.m53377r(c38072d2, c28655q, 6);
            long jM113246h2 = AbstractC35745c.m113246h(15);
            C17909s c17909s2 = AbstractC17911t.f69612b;
            List listM118959K2 = AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, 6).getWhite50()), new C17919x(c38072d2.m121949b(c28655q, 6).getBrandWhite()), new C17919x(c38072d2.m121949b(c28655q, 6).getWhite50()));
            fM117326D = fMo743q1;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(m117326D(c11365j0M30559g) - fMo743q1)) << 32);
            if (m117326D(c11365j0M30559g) != 0.0f) {
                fM117326D = m117326D(c11365j0M30559g) + fM117326D;
            }
            C2886a c2886a2 = new C2886a(C23285v0.m67363a(c23285v0M53377r2, C17909s.m51486d(c17909s2, listM118959K2, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM117326D)) << 32), 8), jM113246h2, null, null, 0L, 33554426), c38072d2.m121952e(c28655q, 6).getB2().getType());
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C36585m(interfaceC28690z0, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC30795n.m94707h(str, AbstractC1131a.m3500d(modifier4, (Function1) objM87133R2), 0L, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 1, 0, null, c2886a2, null, c28655q, i16 & 14, 3120, 185852);
            c28655q = c28655q;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13392l(str, modifier3, i13, i14, 8);
        }
    }

    /* JADX INFO: renamed from: B */
    private static final float m117324B(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: C */
    private static final void m117325C(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: renamed from: D */
    private static final float m117326D(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m117327E(InterfaceC28690z0 interfaceC28690z0, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        m117325C(interfaceC28690z0, (int) (coordinates.mo3541n() >> 32));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m117328F(String str, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m117323A(str, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015b  */
    /* JADX WARN: Code duplicated, block: B:102:0x015f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0165  */
    /* JADX WARN: Code duplicated, block: B:105:0x0170  */
    /* JADX WARN: Code duplicated, block: B:108:0x0196  */
    /* JADX WARN: Code duplicated, block: B:109:0x019a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0271  */
    /* JADX WARN: Code duplicated, block: B:113:0x0273  */
    /* JADX WARN: Code duplicated, block: B:116:0x027a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0280  */
    /* JADX WARN: Code duplicated, block: B:122:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:133:0x033e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0342  */
    /* JADX WARN: Code duplicated, block: B:137:0x034f  */
    /* JADX WARN: Code duplicated, block: B:139:0x035d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0380  */
    /* JADX WARN: Code duplicated, block: B:146:0x038c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0391  */
    /* JADX WARN: Code duplicated, block: B:151:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:157:0x03db  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:165:0x0426  */
    /* JADX WARN: Code duplicated, block: B:166:0x042a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0437  */
    /* JADX WARN: Code duplicated, block: B:171:0x0445  */
    /* JADX WARN: Code duplicated, block: B:173:0x0479  */
    /* JADX WARN: Code duplicated, block: B:175:0x0486  */
    /* JADX WARN: Code duplicated, block: B:177:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:178:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:181:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:183:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:186:0x051b  */
    /* JADX WARN: Code duplicated, block: B:187:0x051f  */
    /* JADX WARN: Code duplicated, block: B:190:0x052c  */
    /* JADX WARN: Code duplicated, block: B:192:0x053a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0597  */
    /* JADX WARN: Code duplicated, block: B:199:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:202:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:204:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:205:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:207:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:208:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:210:0x0637  */
    /* JADX WARN: Code duplicated, block: B:212:0x0646  */
    /* JADX WARN: Code duplicated, block: B:215:0x065c  */
    /* JADX WARN: Code duplicated, block: B:218:0x0669  */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2 A[PHI: r0 r4 r19 r22
      0x00c2: PHI (r0v70 vy0.j0) = (r0v5 vy0.j0), (r0v72 vy0.j0) binds: [B:78:0x00f4, B:67:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r4v53 int) = (r4v14 int), (r4v54 int) binds: [B:78:0x00f4, B:67:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r19v8 androidx.compose.ui.Modifier) = (r19v0 androidx.compose.ui.Modifier), (r19v9 androidx.compose.ui.Modifier) binds: [B:78:0x00f4, B:67:0x00bd] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r22v12 float) = (r22v0 float), (r22v13 float) binds: [B:78:0x00f4, B:67:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    /* JADX WARN: Code duplicated, block: B:83:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x0124  */
    /* JADX WARN: Code duplicated, block: B:87:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x012d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0137  */
    /* JADX WARN: Code duplicated, block: B:96:0x0155  */
    /* JADX WARN: Code duplicated, block: B:98:0x0158  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
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
    /* JADX INFO: renamed from: G */
    public static final void m117329G(Modifier modifier, C36582j0 c36582j0, float f13, Integer num, final InterfaceC4339a onClick, Composer composer, final int i13, final int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        C36582j0 c36582j1;
        float f14;
        int i16;
        int i17;
        boolean z4;
        final Modifier modifier3;
        final C36582j0 c36582j2;
        final float f15;
        C28655q c28655q;
        final Integer num2;
        C28677v1 c28677v1M87180u;
        int i18;
        C2314t c2314t;
        C36582j0 c36582j3;
        Modifier modifier4;
        float f16;
        C36582j0 c36582j4;
        boolean zM21270d;
        boolean zM21270d2;
        EnumC36580i0 enumC36580i0;
        boolean z13;
        Object objM87133R;
        Object obj;
        InterfaceC28690z0 interfaceC28690z0;
        float f17;
        int i19;
        C36582j0 c36582j5;
        float fM117330H;
        Modifier modifierM3425v;
        C38072d c38072d;
        float f18;
        float f19;
        boolean z14;
        C11407v c11407v;
        boolean z15;
        Object objM87133R2;
        C2307m c2307m;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z16;
        C28655q c28655q2;
        float f24;
        float f25;
        C2306l c2306l;
        C22949e c22949e;
        int iHashCode2;
        float f26;
        float f27;
        C2307m c2307m2;
        int iHashCode3;
        C1100b c1100b;
        int i24;
        ?? r14;
        boolean z17;
        C28655q c28655q3;
        boolean z18;
        int iHashCode4;
        int iHashCode5;
        int iIntValue;
        Integer num3;
        Object objM87133R3;
        int iHashCode6;
        int i25;
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(423707032);
        int i26 = i14 & 1;
        if (i26 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c36582j1 = c36582j0;
                int i27 = c28655q4.m87153g(c36582j1) ? 32 : 16;
                i15 |= i27;
            } else {
                c36582j1 = c36582j0;
            }
            i15 |= i27;
        } else {
            c36582j1 = c36582j0;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                f14 = f13;
                i15 |= c28655q4.m87147d(f14) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q4.m87153g(num)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q4.m87157i(onClick)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z4)) {
                    c28655q4.m87140Z();
                    i18 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i18 != 0 || c28655q4.m87118C()) {
                        if (i26 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 2) != 0) {
                            c36582j3 = new C36582j0(false, false, null, null, null, 0.0f, 0.0f, false, 255, null);
                            i15 &= -113;
                        } else {
                            c36582j3 = c36582j1;
                        }
                        if (i28 != 0) {
                            f14 = 1.0f;
                        }
                        modifier4 = modifier2;
                        f16 = f14;
                        c36582j4 = c36582j3;
                        if (i16 != 0) {
                            num = null;
                        }
                        c28655q4.m87175r();
                        C36563a c36563aM117335M = m117335M(c36582j4.getIsBorderAnimationEnabled(), c28655q4, 0);
                        float fM117340R = m117340R(c36582j4.getIsGlowingAnimationEnabled(), c28655q4, 0);
                        zM21270d = AbstractC8693b.m21270d(c36582j4.getLoadingDisplayText());
                        zM21270d2 = AbstractC8693b.m21270d(c36582j4.getPreviewDisplayText());
                        if (zM21270d2) {
                            enumC36580i0 = EnumC36580i0.PREVIEW;
                        } else if (zM21270d) {
                            enumC36580i0 = EnumC36580i0.LOADING;
                        } else {
                            enumC36580i0 = EnumC36580i0.ICON_ONLY;
                        }
                        if (!zM21270d || zM21270d2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q4.m87133R();
                        obj = C28635l.f115821a;
                        if (objM87133R == obj) {
                            objM87133R = AbstractC11266d.m30468v(0.0f, c28655q4);
                        }
                        interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                        f17 = ((Configuration) c28655q4.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                        i19 = a.f156672a[enumC36580i0.ordinal()];
                        c36582j5 = c36582j4;
                        if (i19 == 1) {
                            fM117330H = 4 * 0;
                        } else if (i19 == 2) {
                            fM117330H = 4 * m117330H(interfaceC28690z0);
                        } else {
                            if (i19 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fM117330H = f17;
                        }
                        Modifier modifierM3488c = AbstractC1127a.m3488c(modifier4, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                        Modifier modifier5 = modifier4;
                        float f28 = f16;
                        if (z13) {
                            modifierM3425v = AbstractC1102d.m3425v(AbstractC1102d.m3429z(AbstractC1102d.m3411h(4 * 8, c2314t), null, 3), 0.0f, f17, 1);
                        } else {
                            modifierM3425v = c2314t;
                        }
                        Modifier modifierMo3471e = modifierM3488c.mo3471e(modifierM3425v);
                        c38072d = C38072d.f163053a;
                        f18 = 4;
                        float f29 = 6 * f18;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierMo3471e, C17919x.m51541c(0.85f, c38072d.m121949b(c28655q4, 6).getBackgroundDarkAlt()), AbstractC33253j.m105489e(f29));
                        C17909s c17909s = AbstractC17911t.f69612b;
                        long j7 = f156671b;
                        C17919x c17919x = new C17919x(C17919x.m51541c(c36563aM117335M.getIntensity() * 0.5f, j7));
                        long j13 = f156670a;
                        f19 = fM117330H;
                        z14 = z13;
                        Modifier modifierM44456i = AbstractC15751g.m44456i(1, modifierM3358c, C17909s.m51486d(c17909s, AbstractC37056f.m118959K(c17919x, new C17919x(C17919x.m51541c(c36563aM117335M.getIntensity() * 0.4f, j13)), new C17919x(C17919x.m51541c(c36563aM117335M.getIntensity() * 0.2f, j13)), new C17919x(C17919x.m51541c(c36563aM117335M.getIntensity() * 0.05f, j7))), c36563aM117335M.getStartOffset(), c36563aM117335M.getEndOffset(), 8), AbstractC33253j.m105489e(f29));
                        c11407v = AbstractC11333b0.f36310a;
                        Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1091c.m3355a(modifierM44456i, AbstractC11348f.m30574v(200, 0, c11407v, 2), 2), AbstractC33253j.m105489e(f29));
                        if ((i15 & 57344) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R2 = c28655q4.m87133R();
                        if (z15 || objM87133R2 == obj) {
                            objM87133R2 = new C12762e(onClick, 13);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1772c1.m5391i(modifierM118994r, false, null, (InterfaceC4339a) objM87133R2, 3), "FloatingCoachButton");
                        c2307m = C2299e.f9117z;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM44101d);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a = C0217k.f724b;
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N);
                        m117363u(z14, fM117340R, c28655q4, 0);
                        if (z14) {
                            c28655q4.m87150e0(-1865155190);
                            float f34 = 8;
                            f24 = ((float) 1.5d) * f34;
                            f25 = 0 * f34;
                            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3406c(1.0f, c2314t), f25, 0.0f, f24, 0.0f, 10);
                            c2306l = C2299e.f9108K;
                            c22949e = AbstractC22977m.f90650a;
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                            iHashCode2 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
                            AbstractC22989q.m66760a(AbstractC1099a.m3384f(AbstractC1102d.m3406c(1.0f, c2314t), false, 1.0f), c28655q4, 6);
                            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f27 = Float.MAX_VALUE;
                                f26 = Float.MAX_VALUE;
                            } else {
                                f26 = Float.MAX_VALUE;
                                f27 = 1.0f;
                            }
                            Modifier modifierMo3471e2 = modifierM3406c.mo3471e(new LayoutWeightElement(f27, false));
                            c2307m2 = C2299e.f9114w;
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                            iHashCode3 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e2);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m3);
                            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N3);
                            c1100b = C1100b.f4583a;
                            if (zM21270d) {
                                c28655q4.m87150e0(-1224438448);
                                Modifier modifierMo3400a = c1100b.mo3400a(AbstractC1102d.m3429z(c2314t, null, 3), c2307m);
                                objM87133R3 = c28655q4.m87133R();
                                if (objM87133R3 == obj) {
                                    objM87133R3 = new C31345p(interfaceC28690z0, 6);
                                    c28655q4.m87172p0(objM87133R3);
                                }
                                Modifier modifierM3500d = AbstractC1131a.m3500d(modifierMo3400a, (Function1) objM87133R3);
                                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                                iHashCode6 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3500d);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d3);
                                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m4);
                                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode6))) {
                                    AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N4);
                                r14 = 0;
                                String strM21274h = AbstractC8693b.m21274h(c36582j5.getLoadingDisplayText(), c28655q4, 0);
                                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC34132o.m107879c(c36582j5.getLoadingTextAlpha(), c2314t), f25, 0.0f, 0.0f, 0.0f, 14);
                                f25 = f25;
                                m117323A(strM21274h, modifierM3398t2, c28655q4, 0, 0);
                                i24 = 1;
                                c28655q4.m87173q(true);
                                c28655q4.m87173q(false);
                            } else {
                                i24 = 1;
                                r14 = 0;
                                c28655q4.m87150e0(-1223677336);
                                c28655q4.m87173q(false);
                            }
                            if (zM21270d2) {
                                c28655q4.m87150e0(-1223556157);
                                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1091c.m3355a(c1100b.mo3400a(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3425v(c2314t, 0.0f, f19, i24)), c2307m), AbstractC11348f.m30574v(300, r14, c11407v, 2), 2), f25, 0.0f, 0.0f, 0.0f, 14);
                                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, r14);
                                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM3398t3);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d4);
                                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m5);
                                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N5);
                                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                                iHashCode5 = Long.hashCode(c28655q4.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM3407d);
                                c28655q4.m87158i0();
                                if (c28655q4.f115903S) {
                                    c28655q4.m87163l(interfaceC4339a);
                                } else {
                                    c28655q4.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a2);
                                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m6);
                                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N6);
                                String strM21274h2 = AbstractC8693b.m21274h(c36582j5.getPreviewDisplayText(), c28655q4, 0);
                                C2886a c2886a = new C2886a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q4, 6), 0L, AbstractC35745c.m113246h(15), null, null, 0L, 0, 0L, null, null, 16777213), c38072d.m121952e(c28655q4, 6).getB2().getType());
                                long jM125430y = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                                Modifier modifierM107879c = AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                Modifier modifierM44101d2 = AbstractC15676d.m44101d(modifierM107879c.mo3471e(new LayoutWeightElement(1.0f > f26 ? f26 : 1.0f, true)), "CoachFab_PreviewText");
                                if (num == 0) {
                                    iIntValue = 2;
                                } else {
                                    if (num.intValue() > 0) {
                                        num3 = num;
                                    } else {
                                        num3 = null;
                                    }
                                    if (num3 != null) {
                                        iIntValue = num3.intValue();
                                    } else {
                                        iIntValue = 2;
                                    }
                                }
                                z17 = 1;
                                z18 = false;
                                AbstractC30795n.m94707h(strM21274h2, modifierM44101d2, jM125430y, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, iIntValue, 0, null, c2886a, null, c28655q4, 0, 48, 185848);
                                C28655q c28655q5 = c28655q4;
                                AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3424u(f24, c2314t));
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretUp(), c28655q5, 6), "", AbstractC1102d.m3419p(f18 * f18, AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t)), c38072d.m121949b(c28655q5, 6).getBrandWhite(), c28655q5, 48, 0);
                                AbstractC25012a.m73392y(c28655q5, true, true, false);
                                c28655q3 = c28655q5;
                            } else {
                                z17 = i24;
                                boolean z19 = r14;
                                c28655q4.m87150e0(-1221091192);
                                c28655q4.m87173q(z19);
                                z18 = z19;
                                c28655q3 = c28655q4;
                            }
                            AbstractC25012a.m73392y(c28655q3, z17, z17, z18);
                            z16 = z17;
                            c28655q2 = c28655q3;
                        } else {
                            z16 = true;
                            c28655q4.m87150e0(-1861255452);
                            c28655q4.m87173q(false);
                            c28655q2 = c28655q4;
                        }
                        c28655q2.m87173q(z16);
                        c36582j2 = c36582j5;
                        modifier3 = modifier5;
                        f15 = f28;
                        c28655q = c28655q2;
                    } else {
                        c28655q4.m87138X();
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                        }
                        modifier4 = modifier2;
                        c36582j4 = c36582j1;
                        f16 = f14;
                    }
                    num = num;
                    c28655q4.m87175r();
                    C36563a c36563aM117335M2 = m117335M(c36582j4.getIsBorderAnimationEnabled(), c28655q4, 0);
                    float fM117340R2 = m117340R(c36582j4.getIsGlowingAnimationEnabled(), c28655q4, 0);
                    zM21270d = AbstractC8693b.m21270d(c36582j4.getLoadingDisplayText());
                    zM21270d2 = AbstractC8693b.m21270d(c36582j4.getPreviewDisplayText());
                    if (zM21270d2) {
                        enumC36580i0 = EnumC36580i0.PREVIEW;
                    } else if (zM21270d) {
                        enumC36580i0 = EnumC36580i0.LOADING;
                    } else {
                        enumC36580i0 = EnumC36580i0.ICON_ONLY;
                    }
                    if (zM21270d) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    objM87133R = c28655q4.m87133R();
                    obj = C28635l.f115821a;
                    if (objM87133R == obj) {
                        objM87133R = AbstractC11266d.m30468v(0.0f, c28655q4);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                    f17 = ((Configuration) c28655q4.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                    i19 = a.f156672a[enumC36580i0.ordinal()];
                    c36582j5 = c36582j4;
                    if (i19 == 1) {
                        fM117330H = 4 * 0;
                    } else if (i19 == 2) {
                        fM117330H = 4 * m117330H(interfaceC28690z0);
                    } else {
                        if (i19 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fM117330H = f17;
                    }
                    Modifier modifierM3488c2 = AbstractC1127a.m3488c(modifier4, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                    Modifier modifier6 = modifier4;
                    float f210 = f16;
                    if (z13) {
                        modifierM3425v = c2314t;
                    } else {
                        modifierM3425v = AbstractC1102d.m3425v(AbstractC1102d.m3429z(AbstractC1102d.m3411h(4 * 8, c2314t), null, 3), 0.0f, f17, 1);
                    }
                    Modifier modifierMo3471e3 = modifierM3488c2.mo3471e(modifierM3425v);
                    c38072d = C38072d.f163053a;
                    f18 = 4;
                    float f211 = 6 * f18;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierMo3471e3, C17919x.m51541c(0.85f, c38072d.m121949b(c28655q4, 6).getBackgroundDarkAlt()), AbstractC33253j.m105489e(f211));
                    C17909s c17909s2 = AbstractC17911t.f69612b;
                    long j14 = f156671b;
                    C17919x c17919x2 = new C17919x(C17919x.m51541c(c36563aM117335M2.getIntensity() * 0.5f, j14));
                    long j15 = f156670a;
                    f19 = fM117330H;
                    z14 = z13;
                    Modifier modifierM44456i2 = AbstractC15751g.m44456i(1, modifierM3358c2, C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(c17919x2, new C17919x(C17919x.m51541c(c36563aM117335M2.getIntensity() * 0.4f, j15)), new C17919x(C17919x.m51541c(c36563aM117335M2.getIntensity() * 0.2f, j15)), new C17919x(C17919x.m51541c(c36563aM117335M2.getIntensity() * 0.05f, j14))), c36563aM117335M2.getStartOffset(), c36563aM117335M2.getEndOffset(), 8), AbstractC33253j.m105489e(f211));
                    c11407v = AbstractC11333b0.f36310a;
                    Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1091c.m3355a(modifierM44456i2, AbstractC11348f.m30574v(200, 0, c11407v, 2), 2), AbstractC33253j.m105489e(f211));
                    if ((i15 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R2 = c28655q4.m87133R();
                    if (z15) {
                        objM87133R2 = new C12762e(onClick, 13);
                        c28655q4.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12762e(onClick, 13);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1772c1.m5391i(modifierM118994r2, false, null, (InterfaceC4339a) objM87133R2, 3), "FloatingCoachButton");
                    c2307m = C2299e.f9117z;
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM44101d3);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d5);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m7);
                    c0209i3 = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N7);
                    m117363u(z14, fM117340R2, c28655q4, 0);
                    if (z14) {
                        c28655q4.m87150e0(-1865155190);
                        float f35 = 8;
                        f24 = ((float) 1.5d) * f35;
                        f25 = 0 * f35;
                        Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3406c(1.0f, c2314t), f25, 0.0f, f24, 0.0f, 10);
                        c2306l = C2299e.f9108K;
                        c22949e = AbstractC22977m.f90650a;
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                        iHashCode2 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM3398t4);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m8);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N8);
                        AbstractC22989q.m66760a(AbstractC1099a.m3384f(AbstractC1102d.m3406c(1.0f, c2314t), false, 1.0f), c28655q4, 6);
                        Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, c2314t);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f27 = Float.MAX_VALUE;
                            f26 = Float.MAX_VALUE;
                        } else {
                            f26 = Float.MAX_VALUE;
                            f27 = 1.0f;
                        }
                        Modifier modifierMo3471e4 = modifierM3406c2.mo3471e(new LayoutWeightElement(f27, false));
                        c2307m2 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode3 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e4);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m9);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N9);
                        c1100b = C1100b.f4583a;
                        if (zM21270d) {
                            c28655q4.m87150e0(-1224438448);
                            Modifier modifierMo3400a2 = c1100b.mo3400a(AbstractC1102d.m3429z(c2314t, null, 3), c2307m);
                            objM87133R3 = c28655q4.m87133R();
                            if (objM87133R3 == obj) {
                                objM87133R3 = new C31345p(interfaceC28690z0, 6);
                                c28655q4.m87172p0(objM87133R3);
                            }
                            Modifier modifierM3500d2 = AbstractC1131a.m3500d(modifierMo3400a2, (Function1) objM87133R3);
                            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m2, false);
                            iHashCode6 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM3500d2);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d7);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m10);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N10);
                            r14 = 0;
                            String strM21274h3 = AbstractC8693b.m21274h(c36582j5.getLoadingDisplayText(), c28655q4, 0);
                            Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC34132o.m107879c(c36582j5.getLoadingTextAlpha(), c2314t), f25, 0.0f, 0.0f, 0.0f, 14);
                            f25 = f25;
                            m117323A(strM21274h3, modifierM3398t5, c28655q4, 0, 0);
                            i24 = 1;
                            c28655q4.m87173q(true);
                            c28655q4.m87173q(false);
                        } else {
                            i24 = 1;
                            r14 = 0;
                            c28655q4.m87150e0(-1223677336);
                            c28655q4.m87173q(false);
                        }
                        if (zM21270d2) {
                            c28655q4.m87150e0(-1223556157);
                            Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1091c.m3355a(c1100b.mo3400a(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3425v(c2314t, 0.0f, f19, i24)), c2307m), AbstractC11348f.m30574v(300, r14, c11407v, 2), 2), f25, 0.0f, 0.0f, 0.0f, 14);
                            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m2, r14);
                            iHashCode4 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, modifierM3398t6);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d8);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m11);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N11);
                            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                            iHashCode5 = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierM3407d2);
                            c28655q4.m87158i0();
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(interfaceC4339a);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a4);
                            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m12);
                            if (c28655q4.f115903S) {
                                AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N12);
                            String strM21274h4 = AbstractC8693b.m21274h(c36582j5.getPreviewDisplayText(), c28655q4, 0);
                            C2886a c2886a2 = new C2886a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q4, 6), 0L, AbstractC35745c.m113246h(15), null, null, 0L, 0, 0L, null, null, 16777213), c38072d.m121952e(c28655q4, 6).getB2().getType());
                            long jM125430y2 = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                            Modifier modifierM107879c2 = AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM44101d4 = AbstractC15676d.m44101d(modifierM107879c2.mo3471e(new LayoutWeightElement(1.0f > f26 ? f26 : 1.0f, true)), "CoachFab_PreviewText");
                            if (num == 0) {
                                iIntValue = 2;
                            } else {
                                if (num.intValue() > 0) {
                                    num3 = num;
                                } else {
                                    num3 = null;
                                }
                                if (num3 != null) {
                                    iIntValue = num3.intValue();
                                } else {
                                    iIntValue = 2;
                                }
                            }
                            z17 = 1;
                            z18 = false;
                            AbstractC30795n.m94707h(strM21274h4, modifierM44101d4, jM125430y2, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, iIntValue, 0, null, c2886a2, null, c28655q4, 0, 48, 185848);
                            C28655q c28655q6 = c28655q4;
                            AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3424u(f24, c2314t));
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretUp(), c28655q6, 6), "", AbstractC1102d.m3419p(f18 * f18, AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t)), c38072d.m121949b(c28655q6, 6).getBrandWhite(), c28655q6, 48, 0);
                            AbstractC25012a.m73392y(c28655q6, true, true, false);
                            c28655q3 = c28655q6;
                        } else {
                            z17 = i24;
                            boolean z110 = r14;
                            c28655q4.m87150e0(-1221091192);
                            c28655q4.m87173q(z110);
                            z18 = z110;
                            c28655q3 = c28655q4;
                        }
                        AbstractC25012a.m73392y(c28655q3, z17, z17, z18);
                        z16 = z17;
                        c28655q2 = c28655q3;
                    } else {
                        z16 = true;
                        c28655q4.m87150e0(-1861255452);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    }
                    c28655q2.m87173q(z16);
                    c36582j2 = c36582j5;
                    modifier3 = modifier6;
                    f15 = f210;
                    c28655q = c28655q2;
                } else {
                    c28655q4.m87138X();
                    modifier3 = modifier2;
                    c36582j2 = c36582j1;
                    f15 = f14;
                    c28655q = c28655q4;
                }
                num2 = num;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.f0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue2 = ((Integer) obj3).intValue();
                            return AbstractC36578h0.m117334L(modifier3, c36582j2, f15, num2, onClick, i13, i14, (Composer) obj2, iIntValue2);
                        }
                    };
                }
            }
            i15 |= 3072;
            if ((i13 & 24576) == 0) {
                if (c28655q4.m87157i(onClick)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c28655q4.m87140Z();
                i18 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    if (i26 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        c36582j3 = new C36582j0(false, false, null, null, null, 0.0f, 0.0f, false, 255, null);
                        i15 &= -113;
                    } else {
                        c36582j3 = c36582j1;
                    }
                    if (i28 != 0) {
                        f14 = 1.0f;
                    }
                    modifier4 = modifier2;
                    f16 = f14;
                    c36582j4 = c36582j3;
                    if (i16 != 0) {
                        num = null;
                    } else {
                        num = num;
                    }
                } else {
                    if (i26 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        c36582j3 = new C36582j0(false, false, null, null, null, 0.0f, 0.0f, false, 255, null);
                        i15 &= -113;
                    } else {
                        c36582j3 = c36582j1;
                    }
                    if (i28 != 0) {
                        f14 = 1.0f;
                    }
                    modifier4 = modifier2;
                    f16 = f14;
                    c36582j4 = c36582j3;
                    if (i16 != 0) {
                        num = null;
                    } else {
                        num = num;
                    }
                }
                c28655q4.m87175r();
                C36563a c36563aM117335M3 = m117335M(c36582j4.getIsBorderAnimationEnabled(), c28655q4, 0);
                float fM117340R3 = m117340R(c36582j4.getIsGlowingAnimationEnabled(), c28655q4, 0);
                zM21270d = AbstractC8693b.m21270d(c36582j4.getLoadingDisplayText());
                zM21270d2 = AbstractC8693b.m21270d(c36582j4.getPreviewDisplayText());
                if (zM21270d2) {
                    enumC36580i0 = EnumC36580i0.PREVIEW;
                } else if (zM21270d) {
                    enumC36580i0 = EnumC36580i0.LOADING;
                } else {
                    enumC36580i0 = EnumC36580i0.ICON_ONLY;
                }
                if (zM21270d) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                objM87133R = c28655q4.m87133R();
                obj = C28635l.f115821a;
                if (objM87133R == obj) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q4);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                f17 = ((Configuration) c28655q4.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                i19 = a.f156672a[enumC36580i0.ordinal()];
                c36582j5 = c36582j4;
                if (i19 == 1) {
                    fM117330H = 4 * 0;
                } else if (i19 == 2) {
                    fM117330H = 4 * m117330H(interfaceC28690z0);
                } else {
                    if (i19 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fM117330H = f17;
                }
                Modifier modifierM3488c3 = AbstractC1127a.m3488c(modifier4, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                Modifier modifier7 = modifier4;
                float f212 = f16;
                if (z13) {
                    modifierM3425v = c2314t;
                } else {
                    modifierM3425v = AbstractC1102d.m3425v(AbstractC1102d.m3429z(AbstractC1102d.m3411h(4 * 8, c2314t), null, 3), 0.0f, f17, 1);
                }
                Modifier modifierMo3471e5 = modifierM3488c3.mo3471e(modifierM3425v);
                c38072d = C38072d.f163053a;
                f18 = 4;
                float f213 = 6 * f18;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierMo3471e5, C17919x.m51541c(0.85f, c38072d.m121949b(c28655q4, 6).getBackgroundDarkAlt()), AbstractC33253j.m105489e(f213));
                C17909s c17909s3 = AbstractC17911t.f69612b;
                long j16 = f156671b;
                C17919x c17919x3 = new C17919x(C17919x.m51541c(c36563aM117335M3.getIntensity() * 0.5f, j16));
                long j17 = f156670a;
                f19 = fM117330H;
                z14 = z13;
                Modifier modifierM44456i3 = AbstractC15751g.m44456i(1, modifierM3358c3, C17909s.m51486d(c17909s3, AbstractC37056f.m118959K(c17919x3, new C17919x(C17919x.m51541c(c36563aM117335M3.getIntensity() * 0.4f, j17)), new C17919x(C17919x.m51541c(c36563aM117335M3.getIntensity() * 0.2f, j17)), new C17919x(C17919x.m51541c(c36563aM117335M3.getIntensity() * 0.05f, j16))), c36563aM117335M3.getStartOffset(), c36563aM117335M3.getEndOffset(), 8), AbstractC33253j.m105489e(f213));
                c11407v = AbstractC11333b0.f36310a;
                Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1091c.m3355a(modifierM44456i3, AbstractC11348f.m30574v(200, 0, c11407v, 2), 2), AbstractC33253j.m105489e(f213));
                if ((i15 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R2 = c28655q4.m87133R();
                if (z15) {
                    objM87133R2 = new C12762e(onClick, 13);
                    c28655q4.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12762e(onClick, 13);
                    c28655q4.m87172p0(objM87133R2);
                }
                Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1772c1.m5391i(modifierM118994r3, false, null, (InterfaceC4339a) objM87133R2, 3), "FloatingCoachButton");
                c2307m = C2299e.f9117z;
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q4, modifierM44101d5);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d9);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m13);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N13);
                m117363u(z14, fM117340R3, c28655q4, 0);
                if (z14) {
                    c28655q4.m87150e0(-1865155190);
                    float f36 = 8;
                    f24 = ((float) 1.5d) * f36;
                    f25 = 0 * f36;
                    Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3406c(1.0f, c2314t), f25, 0.0f, f24, 0.0f, 10);
                    c2306l = C2299e.f9108K;
                    c22949e = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierM3398t7);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m14);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N14);
                    AbstractC22989q.m66760a(AbstractC1099a.m3384f(AbstractC1102d.m3406c(1.0f, c2314t), false, 1.0f), c28655q4, 6);
                    Modifier modifierM3406c3 = AbstractC1102d.m3406c(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f27 = Float.MAX_VALUE;
                        f26 = Float.MAX_VALUE;
                    } else {
                        f26 = Float.MAX_VALUE;
                        f27 = 1.0f;
                    }
                    Modifier modifierMo3471e6 = modifierM3406c3.mo3471e(new LayoutWeightElement(f27, false));
                    c2307m2 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e6);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m15);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N15);
                    c1100b = C1100b.f4583a;
                    if (zM21270d) {
                        c28655q4.m87150e0(-1224438448);
                        Modifier modifierMo3400a3 = c1100b.mo3400a(AbstractC1102d.m3429z(c2314t, null, 3), c2307m);
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == obj) {
                            objM87133R3 = new C31345p(interfaceC28690z0, 6);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3500d3 = AbstractC1131a.m3500d(modifierMo3400a3, (Function1) objM87133R3);
                        InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode6 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierM3500d3);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d11);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m16);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N16);
                        r14 = 0;
                        String strM21274h5 = AbstractC8693b.m21274h(c36582j5.getLoadingDisplayText(), c28655q4, 0);
                        Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC34132o.m107879c(c36582j5.getLoadingTextAlpha(), c2314t), f25, 0.0f, 0.0f, 0.0f, 14);
                        f25 = f25;
                        m117323A(strM21274h5, modifierM3398t8, c28655q4, 0, 0);
                        i24 = 1;
                        c28655q4.m87173q(true);
                        c28655q4.m87173q(false);
                    } else {
                        i24 = 1;
                        r14 = 0;
                        c28655q4.m87150e0(-1223677336);
                        c28655q4.m87173q(false);
                    }
                    if (zM21270d2) {
                        c28655q4.m87150e0(-1223556157);
                        Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1091c.m3355a(c1100b.mo3400a(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3425v(c2314t, 0.0f, f19, i24)), c2307m), AbstractC11348f.m30574v(300, r14, c11407v, 2), 2), f25, 0.0f, 0.0f, 0.0f, 14);
                        InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m2, r14);
                        iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q4.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q4, modifierM3398t9);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d12);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m17);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N17);
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                        iHashCode5 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q4.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q4, modifierM3407d3);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m18);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N18);
                        String strM21274h6 = AbstractC8693b.m21274h(c36582j5.getPreviewDisplayText(), c28655q4, 0);
                        C2886a c2886a3 = new C2886a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q4, 6), 0L, AbstractC35745c.m113246h(15), null, null, 0L, 0, 0L, null, null, 16777213), c38072d.m121952e(c28655q4, 6).getB2().getType());
                        long jM125430y3 = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                        Modifier modifierM107879c3 = AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM44101d6 = AbstractC15676d.m44101d(modifierM107879c3.mo3471e(new LayoutWeightElement(1.0f > f26 ? f26 : 1.0f, true)), "CoachFab_PreviewText");
                        if (num == 0) {
                            iIntValue = 2;
                        } else {
                            if (num.intValue() > 0) {
                                num3 = num;
                            } else {
                                num3 = null;
                            }
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 2;
                            }
                        }
                        z17 = 1;
                        z18 = false;
                        AbstractC30795n.m94707h(strM21274h6, modifierM44101d6, jM125430y3, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, iIntValue, 0, null, c2886a3, null, c28655q4, 0, 48, 185848);
                        C28655q c28655q7 = c28655q4;
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3424u(f24, c2314t));
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretUp(), c28655q7, 6), "", AbstractC1102d.m3419p(f18 * f18, AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t)), c38072d.m121949b(c28655q7, 6).getBrandWhite(), c28655q7, 48, 0);
                        AbstractC25012a.m73392y(c28655q7, true, true, false);
                        c28655q3 = c28655q7;
                    } else {
                        z17 = i24;
                        boolean z111 = r14;
                        c28655q4.m87150e0(-1221091192);
                        c28655q4.m87173q(z111);
                        z18 = z111;
                        c28655q3 = c28655q4;
                    }
                    AbstractC25012a.m73392y(c28655q3, z17, z17, z18);
                    z16 = z17;
                    c28655q2 = c28655q3;
                } else {
                    z16 = true;
                    c28655q4.m87150e0(-1861255452);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                }
                c28655q2.m87173q(z16);
                c36582j2 = c36582j5;
                modifier3 = modifier7;
                f15 = f212;
                c28655q = c28655q2;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                c36582j2 = c36582j1;
                f15 = f14;
                c28655q = c28655q4;
            }
            num2 = num;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.f0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC36578h0.m117334L(modifier3, c36582j2, f15, num2, onClick, i13, i14, (Composer) obj2, iIntValue2);
                    }
                };
            }
        }
        i15 |= 384;
        f14 = f13;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q4.m87153g(num)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q4.m87157i(onClick)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c28655q4.m87140Z();
                i18 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    if (i26 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        c36582j3 = new C36582j0(false, false, null, null, null, 0.0f, 0.0f, false, 255, null);
                        i15 &= -113;
                    } else {
                        c36582j3 = c36582j1;
                    }
                    if (i28 != 0) {
                        f14 = 1.0f;
                    }
                    modifier4 = modifier2;
                    f16 = f14;
                    c36582j4 = c36582j3;
                    if (i16 != 0) {
                        num = null;
                    } else {
                        num = num;
                    }
                } else {
                    if (i26 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        c36582j3 = new C36582j0(false, false, null, null, null, 0.0f, 0.0f, false, 255, null);
                        i15 &= -113;
                    } else {
                        c36582j3 = c36582j1;
                    }
                    if (i28 != 0) {
                        f14 = 1.0f;
                    }
                    modifier4 = modifier2;
                    f16 = f14;
                    c36582j4 = c36582j3;
                    if (i16 != 0) {
                        num = null;
                    } else {
                        num = num;
                    }
                }
                c28655q4.m87175r();
                C36563a c36563aM117335M4 = m117335M(c36582j4.getIsBorderAnimationEnabled(), c28655q4, 0);
                float fM117340R4 = m117340R(c36582j4.getIsGlowingAnimationEnabled(), c28655q4, 0);
                zM21270d = AbstractC8693b.m21270d(c36582j4.getLoadingDisplayText());
                zM21270d2 = AbstractC8693b.m21270d(c36582j4.getPreviewDisplayText());
                if (zM21270d2) {
                    enumC36580i0 = EnumC36580i0.PREVIEW;
                } else if (zM21270d) {
                    enumC36580i0 = EnumC36580i0.LOADING;
                } else {
                    enumC36580i0 = EnumC36580i0.ICON_ONLY;
                }
                if (zM21270d) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                objM87133R = c28655q4.m87133R();
                obj = C28635l.f115821a;
                if (objM87133R == obj) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q4);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                f17 = ((Configuration) c28655q4.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                i19 = a.f156672a[enumC36580i0.ordinal()];
                c36582j5 = c36582j4;
                if (i19 == 1) {
                    fM117330H = 4 * 0;
                } else if (i19 == 2) {
                    fM117330H = 4 * m117330H(interfaceC28690z0);
                } else {
                    if (i19 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fM117330H = f17;
                }
                Modifier modifierM3488c4 = AbstractC1127a.m3488c(modifier4, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                Modifier modifier8 = modifier4;
                float f214 = f16;
                if (z13) {
                    modifierM3425v = c2314t;
                } else {
                    modifierM3425v = AbstractC1102d.m3425v(AbstractC1102d.m3429z(AbstractC1102d.m3411h(4 * 8, c2314t), null, 3), 0.0f, f17, 1);
                }
                Modifier modifierMo3471e7 = modifierM3488c4.mo3471e(modifierM3425v);
                c38072d = C38072d.f163053a;
                f18 = 4;
                float f215 = 6 * f18;
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierMo3471e7, C17919x.m51541c(0.85f, c38072d.m121949b(c28655q4, 6).getBackgroundDarkAlt()), AbstractC33253j.m105489e(f215));
                C17909s c17909s4 = AbstractC17911t.f69612b;
                long j18 = f156671b;
                C17919x c17919x4 = new C17919x(C17919x.m51541c(c36563aM117335M4.getIntensity() * 0.5f, j18));
                long j19 = f156670a;
                f19 = fM117330H;
                z14 = z13;
                Modifier modifierM44456i4 = AbstractC15751g.m44456i(1, modifierM3358c4, C17909s.m51486d(c17909s4, AbstractC37056f.m118959K(c17919x4, new C17919x(C17919x.m51541c(c36563aM117335M4.getIntensity() * 0.4f, j19)), new C17919x(C17919x.m51541c(c36563aM117335M4.getIntensity() * 0.2f, j19)), new C17919x(C17919x.m51541c(c36563aM117335M4.getIntensity() * 0.05f, j18))), c36563aM117335M4.getStartOffset(), c36563aM117335M4.getEndOffset(), 8), AbstractC33253j.m105489e(f215));
                c11407v = AbstractC11333b0.f36310a;
                Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1091c.m3355a(modifierM44456i4, AbstractC11348f.m30574v(200, 0, c11407v, 2), 2), AbstractC33253j.m105489e(f215));
                if ((i15 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R2 = c28655q4.m87133R();
                if (z15) {
                    objM87133R2 = new C12762e(onClick, 13);
                    c28655q4.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12762e(onClick, 13);
                    c28655q4.m87172p0(objM87133R2);
                }
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1772c1.m5391i(modifierM118994r4, false, null, (InterfaceC4339a) objM87133R2, 3), "FloatingCoachButton");
                c2307m = C2299e.f9117z;
                InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q4.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q4, modifierM44101d7);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d13);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m19);
                c0209i3 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N19);
                m117363u(z14, fM117340R4, c28655q4, 0);
                if (z14) {
                    c28655q4.m87150e0(-1865155190);
                    float f37 = 8;
                    f24 = ((float) 1.5d) * f37;
                    f25 = 0 * f37;
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC1102d.m3406c(1.0f, c2314t), f25, 0.0f, f24, 0.0f, 10);
                    c2306l = C2299e.f9108K;
                    c22949e = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q4.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q4, modifierM3398t10);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m110);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N110);
                    AbstractC22989q.m66760a(AbstractC1099a.m3384f(AbstractC1102d.m3406c(1.0f, c2314t), false, 1.0f), c28655q4, 6);
                    Modifier modifierM3406c4 = AbstractC1102d.m3406c(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f27 = Float.MAX_VALUE;
                        f26 = Float.MAX_VALUE;
                    } else {
                        f26 = Float.MAX_VALUE;
                        f27 = 1.0f;
                    }
                    Modifier modifierMo3471e8 = modifierM3406c4.mo3471e(new LayoutWeightElement(f27, false));
                    c2307m2 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode3 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q4.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e8);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d14);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m111);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N111);
                    c1100b = C1100b.f4583a;
                    if (zM21270d) {
                        c28655q4.m87150e0(-1224438448);
                        Modifier modifierMo3400a4 = c1100b.mo3400a(AbstractC1102d.m3429z(c2314t, null, 3), c2307m);
                        objM87133R3 = c28655q4.m87133R();
                        if (objM87133R3 == obj) {
                            objM87133R3 = new C31345p(interfaceC28690z0, 6);
                            c28655q4.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3500d4 = AbstractC1131a.m3500d(modifierMo3400a4, (Function1) objM87133R3);
                        InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode6 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q4.m87165m();
                        Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q4, modifierM3500d4);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d15);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m112);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N112);
                        r14 = 0;
                        String strM21274h7 = AbstractC8693b.m21274h(c36582j5.getLoadingDisplayText(), c28655q4, 0);
                        Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC34132o.m107879c(c36582j5.getLoadingTextAlpha(), c2314t), f25, 0.0f, 0.0f, 0.0f, 14);
                        f25 = f25;
                        m117323A(strM21274h7, modifierM3398t11, c28655q4, 0, 0);
                        i24 = 1;
                        c28655q4.m87173q(true);
                        c28655q4.m87173q(false);
                    } else {
                        i24 = 1;
                        r14 = 0;
                        c28655q4.m87150e0(-1223677336);
                        c28655q4.m87173q(false);
                    }
                    if (zM21270d2) {
                        c28655q4.m87150e0(-1223556157);
                        Modifier modifierM3398t12 = AbstractC1099a.m3398t(AbstractC1091c.m3355a(c1100b.mo3400a(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3425v(c2314t, 0.0f, f19, i24)), c2307m), AbstractC11348f.m30574v(300, r14, c11407v, 2), 2), f25, 0.0f, 0.0f, 0.0f, 14);
                        InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m2, r14);
                        iHashCode4 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q4.m87165m();
                        Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q4, modifierM3398t12);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d16);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m113);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N113);
                        Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                        iHashCode5 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q4.m87165m();
                        Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q4, modifierM3407d4);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(interfaceC4339a);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a8);
                        AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m114);
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N114);
                        String strM21274h8 = AbstractC8693b.m21274h(c36582j5.getPreviewDisplayText(), c28655q4, 0);
                        C2886a c2886a4 = new C2886a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q4, 6), 0L, AbstractC35745c.m113246h(15), null, null, 0L, 0, 0L, null, null, 16777213), c38072d.m121952e(c28655q4, 6).getB2().getType());
                        long jM125430y4 = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                        Modifier modifierM107879c4 = AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM44101d8 = AbstractC15676d.m44101d(modifierM107879c4.mo3471e(new LayoutWeightElement(1.0f > f26 ? f26 : 1.0f, true)), "CoachFab_PreviewText");
                        if (num == 0) {
                            iIntValue = 2;
                        } else {
                            if (num.intValue() > 0) {
                                num3 = num;
                            } else {
                                num3 = null;
                            }
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 2;
                            }
                        }
                        z17 = 1;
                        z18 = false;
                        AbstractC30795n.m94707h(strM21274h8, modifierM44101d8, jM125430y4, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, iIntValue, 0, null, c2886a4, null, c28655q4, 0, 48, 185848);
                        C28655q c28655q8 = c28655q4;
                        AbstractC22953f.m66715b(c28655q8, AbstractC1102d.m3424u(f24, c2314t));
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretUp(), c28655q8, 6), "", AbstractC1102d.m3419p(f18 * f18, AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t)), c38072d.m121949b(c28655q8, 6).getBrandWhite(), c28655q8, 48, 0);
                        AbstractC25012a.m73392y(c28655q8, true, true, false);
                        c28655q3 = c28655q8;
                    } else {
                        z17 = i24;
                        boolean z112 = r14;
                        c28655q4.m87150e0(-1221091192);
                        c28655q4.m87173q(z112);
                        z18 = z112;
                        c28655q3 = c28655q4;
                    }
                    AbstractC25012a.m73392y(c28655q3, z17, z17, z18);
                    z16 = z17;
                    c28655q2 = c28655q3;
                } else {
                    z16 = true;
                    c28655q4.m87150e0(-1861255452);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                }
                c28655q2.m87173q(z16);
                c36582j2 = c36582j5;
                modifier3 = modifier8;
                f15 = f214;
                c28655q = c28655q2;
            } else {
                c28655q4.m87138X();
                modifier3 = modifier2;
                c36582j2 = c36582j1;
                f15 = f14;
                c28655q = c28655q4;
            }
            num2 = num;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.f0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC36578h0.m117334L(modifier3, c36582j2, f15, num2, onClick, i13, i14, (Composer) obj2, iIntValue2);
                    }
                };
            }
        }
        i15 |= 3072;
        if ((i13 & 24576) == 0) {
            if (c28655q4.m87157i(onClick)) {
                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i25;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            c28655q4.m87140Z();
            i18 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                if (i26 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    c36582j3 = new C36582j0(false, false, null, null, null, 0.0f, 0.0f, false, 255, null);
                    i15 &= -113;
                } else {
                    c36582j3 = c36582j1;
                }
                if (i28 != 0) {
                    f14 = 1.0f;
                }
                modifier4 = modifier2;
                f16 = f14;
                c36582j4 = c36582j3;
                if (i16 != 0) {
                    num = null;
                } else {
                    num = num;
                }
            } else {
                if (i26 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    c36582j3 = new C36582j0(false, false, null, null, null, 0.0f, 0.0f, false, 255, null);
                    i15 &= -113;
                } else {
                    c36582j3 = c36582j1;
                }
                if (i28 != 0) {
                    f14 = 1.0f;
                }
                modifier4 = modifier2;
                f16 = f14;
                c36582j4 = c36582j3;
                if (i16 != 0) {
                    num = null;
                } else {
                    num = num;
                }
            }
            c28655q4.m87175r();
            C36563a c36563aM117335M5 = m117335M(c36582j4.getIsBorderAnimationEnabled(), c28655q4, 0);
            float fM117340R5 = m117340R(c36582j4.getIsGlowingAnimationEnabled(), c28655q4, 0);
            zM21270d = AbstractC8693b.m21270d(c36582j4.getLoadingDisplayText());
            zM21270d2 = AbstractC8693b.m21270d(c36582j4.getPreviewDisplayText());
            if (zM21270d2) {
                enumC36580i0 = EnumC36580i0.PREVIEW;
            } else if (zM21270d) {
                enumC36580i0 = EnumC36580i0.LOADING;
            } else {
                enumC36580i0 = EnumC36580i0.ICON_ONLY;
            }
            if (zM21270d) {
                z13 = true;
            } else {
                z13 = true;
            }
            objM87133R = c28655q4.m87133R();
            obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q4);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            f17 = ((Configuration) c28655q4.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
            i19 = a.f156672a[enumC36580i0.ordinal()];
            c36582j5 = c36582j4;
            if (i19 == 1) {
                fM117330H = 4 * 0;
            } else if (i19 == 2) {
                fM117330H = 4 * m117330H(interfaceC28690z0);
            } else {
                if (i19 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fM117330H = f17;
            }
            Modifier modifierM3488c5 = AbstractC1127a.m3488c(modifier4, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
            Modifier modifier9 = modifier4;
            float f216 = f16;
            if (z13) {
                modifierM3425v = c2314t;
            } else {
                modifierM3425v = AbstractC1102d.m3425v(AbstractC1102d.m3429z(AbstractC1102d.m3411h(4 * 8, c2314t), null, 3), 0.0f, f17, 1);
            }
            Modifier modifierMo3471e9 = modifierM3488c5.mo3471e(modifierM3425v);
            c38072d = C38072d.f163053a;
            f18 = 4;
            float f217 = 6 * f18;
            Modifier modifierM3358c5 = AbstractC1092a.m3358c(modifierMo3471e9, C17919x.m51541c(0.85f, c38072d.m121949b(c28655q4, 6).getBackgroundDarkAlt()), AbstractC33253j.m105489e(f217));
            C17909s c17909s5 = AbstractC17911t.f69612b;
            long j110 = f156671b;
            C17919x c17919x5 = new C17919x(C17919x.m51541c(c36563aM117335M5.getIntensity() * 0.5f, j110));
            long j111 = f156670a;
            f19 = fM117330H;
            z14 = z13;
            Modifier modifierM44456i5 = AbstractC15751g.m44456i(1, modifierM3358c5, C17909s.m51486d(c17909s5, AbstractC37056f.m118959K(c17919x5, new C17919x(C17919x.m51541c(c36563aM117335M5.getIntensity() * 0.4f, j111)), new C17919x(C17919x.m51541c(c36563aM117335M5.getIntensity() * 0.2f, j111)), new C17919x(C17919x.m51541c(c36563aM117335M5.getIntensity() * 0.05f, j110))), c36563aM117335M5.getStartOffset(), c36563aM117335M5.getEndOffset(), 8), AbstractC33253j.m105489e(f217));
            c11407v = AbstractC11333b0.f36310a;
            Modifier modifierM118994r5 = AbstractC37056f.m118994r(AbstractC1091c.m3355a(modifierM44456i5, AbstractC11348f.m30574v(200, 0, c11407v, 2), 2), AbstractC33253j.m105489e(f217));
            if ((i15 & 57344) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R2 = c28655q4.m87133R();
            if (z15) {
                objM87133R2 = new C12762e(onClick, 13);
                c28655q4.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C12762e(onClick, 13);
                c28655q4.m87172p0(objM87133R2);
            }
            Modifier modifierM44101d9 = AbstractC15676d.m44101d(AbstractC1772c1.m5391i(modifierM118994r5, false, null, (InterfaceC4339a) objM87133R2, 3), "FloatingCoachButton");
            c2307m = C2299e.f9117z;
            InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q4.m87165m();
            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q4, modifierM44101d9);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d17);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m115);
            c0209i3 = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N115);
            m117363u(z14, fM117340R5, c28655q4, 0);
            if (z14) {
                c28655q4.m87150e0(-1865155190);
                float f38 = 8;
                f24 = ((float) 1.5d) * f38;
                f25 = 0 * f38;
                Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC1102d.m3406c(1.0f, c2314t), f25, 0.0f, f24, 0.0f, 10);
                c2306l = C2299e.f9108K;
                c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q4.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q4, modifierM3398t13);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a9);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m116);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N116);
                AbstractC22989q.m66760a(AbstractC1099a.m3384f(AbstractC1102d.m3406c(1.0f, c2314t), false, 1.0f), c28655q4, 6);
                Modifier modifierM3406c5 = AbstractC1102d.m3406c(1.0f, c2314t);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f27 = Float.MAX_VALUE;
                    f26 = Float.MAX_VALUE;
                } else {
                    f26 = Float.MAX_VALUE;
                    f27 = 1.0f;
                }
                Modifier modifierMo3471e10 = modifierM3406c5.mo3471e(new LayoutWeightElement(f27, false));
                c2307m2 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q4.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e10);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d18);
                AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m117);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N117);
                c1100b = C1100b.f4583a;
                if (zM21270d) {
                    c28655q4.m87150e0(-1224438448);
                    Modifier modifierMo3400a5 = c1100b.mo3400a(AbstractC1102d.m3429z(c2314t, null, 3), c2307m);
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = new C31345p(interfaceC28690z0, 6);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3500d5 = AbstractC1131a.m3500d(modifierMo3400a5, (Function1) objM87133R3);
                    InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode6 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q4.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q4, modifierM3500d5);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d19);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m118);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N118);
                    r14 = 0;
                    String strM21274h9 = AbstractC8693b.m21274h(c36582j5.getLoadingDisplayText(), c28655q4, 0);
                    Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC34132o.m107879c(c36582j5.getLoadingTextAlpha(), c2314t), f25, 0.0f, 0.0f, 0.0f, 14);
                    f25 = f25;
                    m117323A(strM21274h9, modifierM3398t14, c28655q4, 0, 0);
                    i24 = 1;
                    c28655q4.m87173q(true);
                    c28655q4.m87173q(false);
                } else {
                    i24 = 1;
                    r14 = 0;
                    c28655q4.m87150e0(-1223677336);
                    c28655q4.m87173q(false);
                }
                if (zM21270d2) {
                    c28655q4.m87150e0(-1223556157);
                    Modifier modifierM3398t15 = AbstractC1099a.m3398t(AbstractC1091c.m3355a(c1100b.mo3400a(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3425v(c2314t, 0.0f, f19, i24)), c2307m), AbstractC11348f.m30574v(300, r14, c11407v, 2), 2), f25, 0.0f, 0.0f, 0.0f, 14);
                    InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m2, r14);
                    iHashCode4 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q4.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q4, modifierM3398t15);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC39127r0M66763d110);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m119);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N119);
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q4, 48);
                    iHashCode5 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q4.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q4, modifierM3407d5);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a10);
                    AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m1110);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N1110);
                    String strM21274h10 = AbstractC8693b.m21274h(c36582j5.getPreviewDisplayText(), c28655q4, 0);
                    C2886a c2886a5 = new C2886a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q4, 6), 0L, AbstractC35745c.m113246h(15), null, null, 0L, 0, 0L, null, null, 16777213), c38072d.m121952e(c28655q4, 6).getB2().getType());
                    long jM125430y5 = c38072d.m121949b(c28655q4, 6).getBrandWhite();
                    Modifier modifierM107879c5 = AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM44101d10 = AbstractC15676d.m44101d(modifierM107879c5.mo3471e(new LayoutWeightElement(1.0f > f26 ? f26 : 1.0f, true)), "CoachFab_PreviewText");
                    if (num == 0) {
                        iIntValue = 2;
                    } else {
                        if (num.intValue() > 0) {
                            num3 = num;
                        } else {
                            num3 = null;
                        }
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 2;
                        }
                    }
                    z17 = 1;
                    z18 = false;
                    AbstractC30795n.m94707h(strM21274h10, modifierM44101d10, jM125430y5, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, iIntValue, 0, null, c2886a5, null, c28655q4, 0, 48, 185848);
                    C28655q c28655q9 = c28655q4;
                    AbstractC22953f.m66715b(c28655q9, AbstractC1102d.m3424u(f24, c2314t));
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretUp(), c28655q9, 6), "", AbstractC1102d.m3419p(f18 * f18, AbstractC34132o.m107879c(c36582j5.getPreviewTextAlpha(), c2314t)), c38072d.m121949b(c28655q9, 6).getBrandWhite(), c28655q9, 48, 0);
                    AbstractC25012a.m73392y(c28655q9, true, true, false);
                    c28655q3 = c28655q9;
                } else {
                    z17 = i24;
                    boolean z113 = r14;
                    c28655q4.m87150e0(-1221091192);
                    c28655q4.m87173q(z113);
                    z18 = z113;
                    c28655q3 = c28655q4;
                }
                AbstractC25012a.m73392y(c28655q3, z17, z17, z18);
                z16 = z17;
                c28655q2 = c28655q3;
            } else {
                z16 = true;
                c28655q4.m87150e0(-1861255452);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            c28655q2.m87173q(z16);
            c36582j2 = c36582j5;
            modifier3 = modifier9;
            f15 = f216;
            c28655q = c28655q2;
        } else {
            c28655q4.m87138X();
            modifier3 = modifier2;
            c36582j2 = c36582j1;
            f15 = f14;
            c28655q = c28655q4;
        }
        num2 = num;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.f0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue2 = ((Integer) obj3).intValue();
                    return AbstractC36578h0.m117334L(modifier3, c36582j2, f15, num2, onClick, i13, i14, (Composer) obj2, iIntValue2);
                }
            };
        }
    }

    /* JADX INFO: renamed from: H */
    private static final float m117330H(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: I */
    private static final void m117331I(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m117332J(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m117333K(InterfaceC28690z0 interfaceC28690z0, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        m117331I(interfaceC28690z0, (int) (coordinates.mo3541n() >> 32));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m117334L(Modifier modifier, C36582j0 c36582j0, float f13, Integer num, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m117329G(modifier, c36582j0, f13, num, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final C36563a m117335M(boolean z4, Composer composer, int i13) {
        float fM117337O;
        float fM117339Q;
        C11373l0 c11373l0M30571s = AbstractC11348f.m30571s("CoachFABRotation", composer, 0);
        C28676v0 c28676v0 = C28635l.f115821a;
        if (z4) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1310588013);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C35868a(9);
                c28655q.m87172p0(objM87133R);
            }
            fM117337O = m117337O(AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R), EnumC11408v0.f36577w, 4), "BorderRotation", c28655q, 29112, 0));
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1309961658);
            c28655q2.m87173q(false);
            fM117337O = 0.0f;
        }
        float f13 = fM117337O;
        if (z4) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(-1309868906);
            Object objM87133R2 = c28655q3.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C35868a(10);
                c28655q3.m87172p0(objM87133R2);
            }
            fM117339Q = m117339Q(AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 1.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R2), EnumC11408v0.f36577w, 4), "GradientIntensity", c28655q3, 29112, 0));
            c28655q3.m87173q(false);
        } else {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(-1308968015);
            c28655q4.m87173q(false);
            fM117339Q = 1.0f;
        }
        float f14 = fM117339Q;
        double radians = Math.toRadians(f13) + Math.atan2(80.0d, 100.0d);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f15 = 2;
        float f16 = (fCos * 128.0f) / f15;
        float f17 = (fSin * 128.0f) / f15;
        return new C36563a((Float.floatToRawIntBits(50.0f - f16) << 32) | (((long) Float.floatToRawIntBits(40.0f - f17)) & 4294967295L), (((long) Float.floatToRawIntBits(f16 + 50.0f)) << 32) | (((long) Float.floatToRawIntBits(f17 + 40.0f)) & 4294967295L), f14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m117336N(C11385o0 keyframes) {
        AbstractC22676k.m65750j(keyframes, "$this$keyframes");
        keyframes.f36506a = 2750;
        C11381n0 c11381n0M30615a = keyframes.m30615a(0, Float.valueOf(0.0f));
        C2342h c2342h = AbstractC11333b0.f36312c;
        c11381n0M30615a.f36485b = c2342h;
        Float fValueOf = Float.valueOf(360.0f);
        keyframes.m30615a(ErrorCodes.InitAPIErrors.cServerErrors, fValueOf).f36485b = c2342h;
        keyframes.m30615a(2750, fValueOf);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final float m117337O(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m117338P(C11385o0 keyframes) {
        AbstractC22676k.m65750j(keyframes, "$this$keyframes");
        keyframes.f36506a = 2750;
        Float fValueOf = Float.valueOf(0.1f);
        C11381n0 c11381n0M30615a = keyframes.m30615a(0, fValueOf);
        C11407v c11407v = AbstractC11333b0.f36310a;
        c11381n0M30615a.f36485b = c11407v;
        Float fValueOf2 = Float.valueOf(1.0f);
        C11381n0 c11381n0M30615a2 = keyframes.m30615a(400, fValueOf2);
        C2342h c2342h = AbstractC11333b0.f36312c;
        c11381n0M30615a2.f36485b = c2342h;
        keyframes.m30615a(1600, fValueOf2).f36485b = c2342h;
        keyframes.m30615a(ErrorCodes.InitAPIErrors.cServerErrors, fValueOf).f36485b = c11407v;
        keyframes.m30615a(2750, Float.valueOf(0.0f));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final float m117339Q(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: R */
    private static final float m117340R(boolean z4, Composer composer, int i13) {
        C11373l0 c11373l0M30571s = AbstractC11348f.m30571s("CoachFABGlow", composer, 0);
        if (!z4) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1625438328);
            c28655q.m87173q(false);
            return 0.0f;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1626235276);
        Object objM87133R = c28655q2.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C35868a(8);
            c28655q2.m87172p0(objM87133R);
        }
        float fM117342T = m117342T(AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 0.9f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R), EnumC11408v0.f36577w, 4), "GlowIntensity", c28655q2, 29112, 0));
        c28655q2.m87173q(false);
        return fM117342T;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m117341S(C11385o0 keyframes) {
        AbstractC22676k.m65750j(keyframes, "$this$keyframes");
        keyframes.f36506a = 3800;
        Float fValueOf = Float.valueOf(0.0f);
        C11381n0 c11381n0M30615a = keyframes.m30615a(0, fValueOf);
        C11407v c11407v = AbstractC11333b0.f36310a;
        c11381n0M30615a.f36485b = c11407v;
        keyframes.m30615a(1400, Float.valueOf(0.9f)).f36485b = c11407v;
        keyframes.m30615a(2800, fValueOf).f36485b = AbstractC11333b0.f36312c;
        keyframes.m30615a(3800, fValueOf);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final float m117342T(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: o */
    private static final void m117357o(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1660801438);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 25 * 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, C2314t.f9131w);
            C17909s c17909s = AbstractC17911t.f69612b;
            long j7 = f156670a;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM3419p, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, j7)), new C17919x(C17919x.m51541c(0.18f, j7)), new C17919x(C17919x.m51541c(0.09f, j7)), new C17919x(C17919x.m51541c(0.030000001f, j7)), new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getTransparent())), 0L, f13 * 0.8f, 10), AbstractC33253j.f138651a, 0.0f, 4), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0131i(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m117358p(int i13, Composer composer, int i14) {
        m117357o(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m117359q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(770642000);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 4;
            float f14 = 8 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f14, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f14, c2314t);
            AbstractC17911t abstractC17911tM43972A = AbstractC15673b0.m43972A();
            C33252i c33252i = AbstractC33253j.f138651a;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM3419p2, abstractC17911tM43972A, c33252i, 0.0f, 4), c28655q, 0);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(((float) 7.5d) * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkAlt(), c33252i), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0131i(i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m117360r(int i13, Composer composer, int i14) {
        m117359q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m117361s(final float f13, Composer composer, final int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1195699089);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87138X();
        } else if (f13 > 0.0f) {
            c28655q.m87150e0(-1387100770);
            float f14 = 20 * 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f14, C2314t.f9131w);
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM3419p, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.9f * f13, c38072d.m121949b(c28655q, 6).getBrandWhite())), new C17919x(C17919x.m51541c(f13 * 0.6f, c38072d.m121949b(c28655q, 6).getBrandWhite())), new C17919x(C17919x.m51541c(f13 * 0.3f, c38072d.m121949b(c28655q, 6).getBrandWhite())), new C17919x(c38072d.m121949b(c28655q, 6).getTransparent())), 0L, f14 * 0.6f, 10), AbstractC33253j.f138651a, 0.0f, 4), c28655q, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1386405967);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.e0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC36578h0.m117362t(f13, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m117362t(float f13, int i13, Composer composer, int i14) {
        m117361s(f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m117363u(final boolean z4, final float f13, Composer composer, final int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1362832848);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2307m c2307m = C2299e.f9102E;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3384f = z4 ? AbstractC1099a.m3384f(AbstractC1102d.m3406c(1.0f, c2314t), false, 1.0f) : AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3384f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m117357o(c28655q, 0);
            m117359q(c28655q, 0);
            m117361s(f13, c28655q, (i14 >> 3) & 14);
            m117365w(c28655q, 0);
            m117367y(c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getLogo().getWhoop(), c28655q, 6);
            long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
            float f14 = 4;
            AbstractC15005f3.m43108b(c27430eM107874S, "", AbstractC1136a.m3599a(AbstractC1102d.m3419p(f14 * f14, c2314t), "CoachButtonIcon"), jM125430y, c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vy0.g0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC36578h0.m117364v(z4, f13, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m117364v(boolean z4, float f13, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m117363u(z4, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m117365w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-469474817);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = ((float) 7.5d) * 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, C2314t.f9131w);
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            C17919x c17919x = new C17919x(c38072d.m121949b(c28655q, 6).getTransparent());
            C17919x c17919x2 = new C17919x(c38072d.m121949b(c28655q, 6).getTransparent());
            C17919x c17919x3 = new C17919x(c38072d.m121949b(c28655q, 6).getTransparent());
            long j7 = f156670a;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM3419p, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(c17919x, c17919x2, c17919x3, new C17919x(C17919x.m51541c(0.2f, j7)), new C17919x(C17919x.m51541c(0.3f, j7))), (((long) Float.floatToRawIntBits(1.67f * f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(1.77f * f13)) << 32), 2.23f * f13, 8), AbstractC33253j.f138651a, 0.0f, 4), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0131i(i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m117366x(int i13, Composer composer, int i14) {
        m117365w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m117367y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(137265696);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = ((float) 7.5d) * 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, C2314t.f9131w);
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            C17919x c17919x = new C17919x(c38072d.m121949b(c28655q, 6).getTransparent());
            C17919x c17919x2 = new C17919x(c38072d.m121949b(c28655q, 6).getTransparent());
            C17919x c17919x3 = new C17919x(c38072d.m121949b(c28655q, 6).getTransparent());
            long j7 = f156671b;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierM3419p, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(c17919x, c17919x2, c17919x3, new C17919x(C17919x.m51541c(0.2f, j7)), new C17919x(C17919x.m51541c(0.3f, j7))), (((long) Float.floatToRawIntBits(1.57f * f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(1.17f * f13)) << 32), 2.23f * f13, 8), AbstractC33253j.f138651a, 0.0f, 4), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0131i(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m117368z(int i13, Composer composer, int i14) {
        m117367y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
