package b21;

import a01.C0091k;
import al.AbstractC0954a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
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
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11351f2;
import p077d0.C11362i1;
import p077d0.C11421z1;
import p077d0.InterfaceC11337c0;
import p077d0.InterfaceC11403t1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;
import zy0.AbstractC41214b;
import zy0.AbstractC41215c;
import zy0.AbstractC41218f;
import zy0.EnumC41216d;
import zy0.EnumC41217e;

/* JADX INFO: renamed from: b21.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!²\u0006\f\u0010 \u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Ld0/z1;", "", "widthRatioTransition", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lb21/e;", "ratios", "Li2/x;", "fillColor", "showAverage", "Ll83/k;", "", "averageRange", "Ll83/a0;", "j", "(Ld0/z1;Landroidx/compose/ui/Modifier;Ljava/util/List;JZLl83/k;Landroidx/compose/runtime/Composer;II)V", "averageStart", "averageEnd", "Ly3/f;", "parentWidth", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(FFFLandroidx/compose/runtime/Composer;I)V", "spacerRatio", "e", "(Ld0/z1;FFLandroidx/compose/runtime/Composer;I)V", "", "index", "size", "Lzy0/d;", "m", "(II)Lzy0/d;", "widthRatio", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2331d {

    /* JADX INFO: renamed from: b21.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function3 {

        /* JADX INFO: renamed from: w */
        public static final a f9252w = new a();

        /* JADX INFO: renamed from: a */
        public final C11362i1 m7189a(InterfaceC11403t1 interfaceC11403t1, Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-985243360);
            C11362i1 c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 0.0f, 7, null);
            c28655q.m87173q(false);
            return c11362i1M30573u;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m7189a((InterfaceC11403t1) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: b21.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11421z1 f9253w;

        public b(C11421z1 c11421z1) {
            this.f9253w = c11421z1;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final Boolean invoke() {
            return this.f9253w.f36633d.getValue();
        }
    }

    /* JADX INFO: renamed from: b21.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C11421z1 f9254w;

        public c(C11421z1 c11421z1) {
            this.f9254w = c11421z1;
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC11403t1 invoke() {
            return this.f9254w.m30664f();
        }
    }

    /* JADX INFO: renamed from: e */
    private static final void m7180e(C11421z1 c11421z1, float f13, float f14, Composer composer, int i13) {
        int i14;
        Object objMo2428y0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1916703917);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c11421z1) ? 4 : 2) | i13;
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
            a aVar = a.f9252w;
            C11351f2 c11351f2 = AbstractC11348f.f36367i;
            int i15 = (((i14 & 14) | 384) & 14) | 3072;
            boolean zM30665g = c11421z1.m30665g();
            AbstractC0954a abstractC0954a = c11421z1.f36630a;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM30665g) {
                c28655q.m87150e0(1666853325);
                c28655q.m87173q(false);
                objMo2428y0 = abstractC0954a.mo2428y0();
            } else {
                c28655q.m87150e0(1666599280);
                boolean z4 = (((i15 & 14) ^ 6) > 4 && c28655q.m87153g(c11421z1)) || (i15 & 6) == 4;
                objMo2428y0 = c28655q.m87133R();
                if (z4 || objMo2428y0 == c28676v0) {
                    AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
                    Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
                    AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
                    try {
                        Object objMo2428y1 = abstractC0954a.mo2428y0();
                        C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                        c28655q.m87172p0(objMo2428y1);
                        objMo2428y0 = objMo2428y1;
                    } catch (Throwable th3) {
                        C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                        throw th3;
                    }
                }
                c28655q.m87173q(false);
            }
            boolean zBooleanValue = ((Boolean) objMo2428y0).booleanValue();
            c28655q.m87150e0(1730349580);
            float f15 = zBooleanValue ? f13 : 0.0f;
            c28655q.m87173q(false);
            Float fValueOf = Float.valueOf(f15);
            int i16 = i15 & 14;
            int i17 = i16 ^ 6;
            boolean z13 = (i17 > 4 && c28655q.m87153g(c11421z1)) || (i15 & 6) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new b(c11421z1));
                c28655q.m87172p0(objM87133R);
            }
            boolean zBooleanValue2 = ((Boolean) ((InterfaceC28670t2) objM87133R).getValue()).booleanValue();
            c28655q.m87150e0(1730349580);
            float f16 = zBooleanValue2 ? f13 : 0.0f;
            c28655q.m87173q(false);
            Float fValueOf2 = Float.valueOf(f16);
            boolean z14 = (i17 > 4 && c28655q.m87153g(c11421z1)) || (i15 & 6) == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87264r(new c(c11421z1));
                c28655q.m87172p0(objM87133R2);
            }
            float f17 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17 * f17, AbstractC1102d.m3424u(m7181f(AbstractC11343d2.m30542d(c11421z1, fValueOf, fValueOf2, (InterfaceC11337c0) aVar.invoke(((InterfaceC28670t2) objM87133R2).getValue(), c28655q, 0), c11351f2, c28655q, i16 | ProfileVerifier.CompilationStatus.f6515xf2722a21)) * f14, C2314t.f9131w)));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0091k(c11421z1, f13, f14, i13, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final float m7181f(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m7182g(C11421z1 c11421z1, float f13, float f14, int i13, Composer composer, int i14) {
        m7180e(c11421z1, f13, f14, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m7183h(float f13, float f14, float f15, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2073931870);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f15) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f16 = 100;
            float f17 = (f13 / f16) * f15;
            float f18 = ((f14 - f13) / f16) * f15;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3411h = AbstractC1102d.m3411h(6 * 4, AbstractC1102d.m3424u(f15, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f17, c2314t));
            Modifier modifierM3424u = AbstractC1102d.m3424u(f18, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
            AbstractC41214b.m133892c(EnumC41217e.RANGE, c28655q, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2330c(f13, f14, f15, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m7184i(float f13, float f14, float f15, int i13, Composer composer, int i14) {
        m7183h(f13, f14, f15, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3 A[PHI: r5 r9 r11
      0x00d3: PHI (r5v7 androidx.compose.ui.Modifier) = (r5v3 androidx.compose.ui.Modifier), (r5v2 androidx.compose.ui.Modifier) binds: [B:81:0x00ef, B:71:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r9v7 long) = (r9v3 long), (r9v1 long) binds: [B:81:0x00ef, B:71:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r11v7 boolean) = (r11v3 boolean), (r11v2 boolean) binds: [B:81:0x00ef, B:71:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x0142  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static final void m7185j(final C11421z1 widthRatioTransition, Modifier modifier, final List<C2332e> ratios, long j7, boolean z4, C23465k c23465k, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        long jM125430y;
        int i16;
        boolean z13;
        int i17;
        int i18;
        C23465k c23465k2;
        int i19;
        boolean z14;
        C28655q c28655q;
        Modifier modifier3;
        long j13;
        boolean z15;
        C23465k c23465k3;
        C28677v1 c28677v1M87180u;
        int i24;
        C2314t c2314t;
        Modifier modifier4;
        long j14;
        final boolean z16;
        float f13;
        int i25;
        int i26;
        AbstractC22676k.m65750j(widthRatioTransition, "widthRatioTransition");
        AbstractC22676k.m65750j(ratios, "ratios");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-44632297);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(widthRatioTransition) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(ratios)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i15 |= i26;
            }
            if ((i13 & 3072) == 0) {
                jM125430y = j7;
                if ((i14 & 8) == 0 || !c28655q2.m87151f(jM125430y)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i25;
            } else {
                jM125430y = j7;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        c23465k2 = c23465k;
                        if (c28655q2.m87153g(c23465k2)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    if ((74899 & i15) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        c28655q2.m87140Z();
                        i24 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i24 != 0 || c28655q2.m87118C()) {
                            if (i27 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i14 & 8) != 0) {
                                jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                            }
                            if (i16 != 0) {
                                z13 = false;
                            }
                            if (i18 != 0) {
                                long j15 = jM125430y;
                                modifier4 = modifier2;
                                j14 = j15;
                                c23465k2 = null;
                            }
                            z16 = z13;
                            c28655q2.m87175r();
                            if (z16) {
                                f13 = 6 * 4;
                            } else {
                                float f14 = 4;
                                f13 = f14 * f14;
                            }
                            final long j16 = j14;
                            final C23465k c23465k4 = c23465k2;
                            AbstractC22953f.m66714a(AbstractC1102d.m3411h(f13, c2314t).mo3471e(modifier4), C2299e.f9117z, false, AbstractC37817c.m121344e(819884929, c28655q2, new Function3() { // from class: b21.a
                                @Override // p715kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return AbstractC2331d.m7186k(z16, widthRatioTransition, c23465k4, ratios, j16, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                                }
                            }), c28655q2, 3120, 4);
                            c28655q = c28655q2;
                            z15 = z16;
                            modifier3 = modifier4;
                            j13 = j16;
                        } else {
                            c28655q2.m87138X();
                        }
                        long j17 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j17;
                        z16 = z13;
                        c28655q2.m87175r();
                        if (z16) {
                            f13 = 6 * 4;
                        } else {
                            float f15 = 4;
                            f13 = f15 * f15;
                        }
                        final long j18 = j14;
                        final C23465k c23465k5 = c23465k2;
                        AbstractC22953f.m66714a(AbstractC1102d.m3411h(f13, c2314t).mo3471e(modifier4), C2299e.f9117z, false, AbstractC37817c.m121344e(819884929, c28655q2, new Function3() { // from class: b21.a
                            @Override // p715kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC2331d.m7186k(z16, widthRatioTransition, c23465k5, ratios, j18, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                            }
                        }), c28655q2, 3120, 4);
                        c28655q = c28655q2;
                        z15 = z16;
                        modifier3 = modifier4;
                        j13 = j18;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        j13 = jM125430y;
                        z15 = z13;
                    }
                    c23465k3 = c23465k2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2329b(widthRatioTransition, modifier3, ratios, j13, z15, c23465k3, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                c23465k2 = c23465k;
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        if (i27 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        if (i18 != 0) {
                            long j19 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j19;
                            c23465k2 = null;
                        } else {
                            long j110 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j110;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        if (i18 != 0) {
                            long j111 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j111;
                            c23465k2 = null;
                        } else {
                            long j112 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j112;
                        }
                    }
                    z16 = z13;
                    c28655q2.m87175r();
                    if (z16) {
                        f13 = 6 * 4;
                    } else {
                        float f16 = 4;
                        f13 = f16 * f16;
                    }
                    final long j113 = j14;
                    final C23465k c23465k6 = c23465k2;
                    AbstractC22953f.m66714a(AbstractC1102d.m3411h(f13, c2314t).mo3471e(modifier4), C2299e.f9117z, false, AbstractC37817c.m121344e(819884929, c28655q2, new Function3() { // from class: b21.a
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC2331d.m7186k(z16, widthRatioTransition, c23465k6, ratios, j113, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3120, 4);
                    c28655q = c28655q2;
                    z15 = z16;
                    modifier3 = modifier4;
                    j13 = j113;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    j13 = jM125430y;
                    z15 = z13;
                }
                c23465k3 = c23465k2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2329b(widthRatioTransition, modifier3, ratios, j13, z15, c23465k3, i13, i14);
                }
            }
            i15 |= 24576;
            z13 = z4;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    c23465k2 = c23465k;
                    if (c28655q2.m87153g(c23465k2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        if (i27 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        if (i18 != 0) {
                            long j114 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j114;
                            c23465k2 = null;
                        } else {
                            long j115 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j115;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        if (i18 != 0) {
                            long j116 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j116;
                            c23465k2 = null;
                        } else {
                            long j117 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j117;
                        }
                    }
                    z16 = z13;
                    c28655q2.m87175r();
                    if (z16) {
                        f13 = 6 * 4;
                    } else {
                        float f17 = 4;
                        f13 = f17 * f17;
                    }
                    final long j118 = j14;
                    final C23465k c23465k7 = c23465k2;
                    AbstractC22953f.m66714a(AbstractC1102d.m3411h(f13, c2314t).mo3471e(modifier4), C2299e.f9117z, false, AbstractC37817c.m121344e(819884929, c28655q2, new Function3() { // from class: b21.a
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC2331d.m7186k(z16, widthRatioTransition, c23465k7, ratios, j118, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3120, 4);
                    c28655q = c28655q2;
                    z15 = z16;
                    modifier3 = modifier4;
                    j13 = j118;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    j13 = jM125430y;
                    z15 = z13;
                }
                c23465k3 = c23465k2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2329b(widthRatioTransition, modifier3, ratios, j13, z15, c23465k3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c23465k2 = c23465k;
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    if (i18 != 0) {
                        long j119 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j119;
                        c23465k2 = null;
                    } else {
                        long j1110 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j1110;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    if (i18 != 0) {
                        long j1111 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j1111;
                        c23465k2 = null;
                    } else {
                        long j1112 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j1112;
                    }
                }
                z16 = z13;
                c28655q2.m87175r();
                if (z16) {
                    f13 = 6 * 4;
                } else {
                    float f18 = 4;
                    f13 = f18 * f18;
                }
                final long j1113 = j14;
                final C23465k c23465k8 = c23465k2;
                AbstractC22953f.m66714a(AbstractC1102d.m3411h(f13, c2314t).mo3471e(modifier4), C2299e.f9117z, false, AbstractC37817c.m121344e(819884929, c28655q2, new Function3() { // from class: b21.a
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC2331d.m7186k(z16, widthRatioTransition, c23465k8, ratios, j1113, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3120, 4);
                c28655q = c28655q2;
                z15 = z16;
                modifier3 = modifier4;
                j13 = j1113;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                j13 = jM125430y;
                z15 = z13;
            }
            c23465k3 = c23465k2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2329b(widthRatioTransition, modifier3, ratios, j13, z15, c23465k3, i13, i14);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(ratios)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i15 |= i26;
        }
        if ((i13 & 3072) == 0) {
            jM125430y = j7;
            if ((i14 & 8) == 0) {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i25;
        } else {
            jM125430y = j7;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    c23465k2 = c23465k;
                    if (c28655q2.m87153g(c23465k2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    i24 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        if (i27 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        if (i18 != 0) {
                            long j1114 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j1114;
                            c23465k2 = null;
                        } else {
                            long j1115 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j1115;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i14 & 8) != 0) {
                            jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                        }
                        if (i16 != 0) {
                            z13 = false;
                        }
                        if (i18 != 0) {
                            long j1116 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j1116;
                            c23465k2 = null;
                        } else {
                            long j1117 = jM125430y;
                            modifier4 = modifier2;
                            j14 = j1117;
                        }
                    }
                    z16 = z13;
                    c28655q2.m87175r();
                    if (z16) {
                        f13 = 6 * 4;
                    } else {
                        float f19 = 4;
                        f13 = f19 * f19;
                    }
                    final long j1118 = j14;
                    final C23465k c23465k9 = c23465k2;
                    AbstractC22953f.m66714a(AbstractC1102d.m3411h(f13, c2314t).mo3471e(modifier4), C2299e.f9117z, false, AbstractC37817c.m121344e(819884929, c28655q2, new Function3() { // from class: b21.a
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC2331d.m7186k(z16, widthRatioTransition, c23465k9, ratios, j1118, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3120, 4);
                    c28655q = c28655q2;
                    z15 = z16;
                    modifier3 = modifier4;
                    j13 = j1118;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    j13 = jM125430y;
                    z15 = z13;
                }
                c23465k3 = c23465k2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2329b(widthRatioTransition, modifier3, ratios, j13, z15, c23465k3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c23465k2 = c23465k;
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    if (i18 != 0) {
                        long j1119 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j1119;
                        c23465k2 = null;
                    } else {
                        long j11110 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j11110;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    if (i18 != 0) {
                        long j11111 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j11111;
                        c23465k2 = null;
                    } else {
                        long j11112 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j11112;
                    }
                }
                z16 = z13;
                c28655q2.m87175r();
                if (z16) {
                    f13 = 6 * 4;
                } else {
                    float f110 = 4;
                    f13 = f110 * f110;
                }
                final long j11113 = j14;
                final C23465k c23465k10 = c23465k2;
                AbstractC22953f.m66714a(AbstractC1102d.m3411h(f13, c2314t).mo3471e(modifier4), C2299e.f9117z, false, AbstractC37817c.m121344e(819884929, c28655q2, new Function3() { // from class: b21.a
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC2331d.m7186k(z16, widthRatioTransition, c23465k10, ratios, j11113, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3120, 4);
                c28655q = c28655q2;
                z15 = z16;
                modifier3 = modifier4;
                j13 = j11113;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                j13 = jM125430y;
                z15 = z13;
            }
            c23465k3 = c23465k2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2329b(widthRatioTransition, modifier3, ratios, j13, z15, c23465k3, i13, i14);
            }
        }
        i15 |= 24576;
        z13 = z4;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                c23465k2 = c23465k;
                if (c28655q2.m87153g(c23465k2)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                i24 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    if (i18 != 0) {
                        long j11114 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j11114;
                        c23465k2 = null;
                    } else {
                        long j11115 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j11115;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 8) != 0) {
                        jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                    }
                    if (i16 != 0) {
                        z13 = false;
                    }
                    if (i18 != 0) {
                        long j11116 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j11116;
                        c23465k2 = null;
                    } else {
                        long j11117 = jM125430y;
                        modifier4 = modifier2;
                        j14 = j11117;
                    }
                }
                z16 = z13;
                c28655q2.m87175r();
                if (z16) {
                    f13 = 6 * 4;
                } else {
                    float f111 = 4;
                    f13 = f111 * f111;
                }
                final long j11118 = j14;
                final C23465k c23465k11 = c23465k2;
                AbstractC22953f.m66714a(AbstractC1102d.m3411h(f13, c2314t).mo3471e(modifier4), C2299e.f9117z, false, AbstractC37817c.m121344e(819884929, c28655q2, new Function3() { // from class: b21.a
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC2331d.m7186k(z16, widthRatioTransition, c23465k11, ratios, j11118, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3120, 4);
                c28655q = c28655q2;
                z15 = z16;
                modifier3 = modifier4;
                j13 = j11118;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                j13 = jM125430y;
                z15 = z13;
            }
            c23465k3 = c23465k2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2329b(widthRatioTransition, modifier3, ratios, j13, z15, c23465k3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        c23465k2 = c23465k;
        if ((74899 & i15) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            c28655q2.m87140Z();
            i24 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 8) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                }
                if (i16 != 0) {
                    z13 = false;
                }
                if (i18 != 0) {
                    long j11119 = jM125430y;
                    modifier4 = modifier2;
                    j14 = j11119;
                    c23465k2 = null;
                } else {
                    long j111110 = jM125430y;
                    modifier4 = modifier2;
                    j14 = j111110;
                }
            } else {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 8) != 0) {
                    jM125430y = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                }
                if (i16 != 0) {
                    z13 = false;
                }
                if (i18 != 0) {
                    long j111111 = jM125430y;
                    modifier4 = modifier2;
                    j14 = j111111;
                    c23465k2 = null;
                } else {
                    long j111112 = jM125430y;
                    modifier4 = modifier2;
                    j14 = j111112;
                }
            }
            z16 = z13;
            c28655q2.m87175r();
            if (z16) {
                f13 = 6 * 4;
            } else {
                float f112 = 4;
                f13 = f112 * f112;
            }
            final long j111113 = j14;
            final C23465k c23465k12 = c23465k2;
            AbstractC22953f.m66714a(AbstractC1102d.m3411h(f13, c2314t).mo3471e(modifier4), C2299e.f9117z, false, AbstractC37817c.m121344e(819884929, c28655q2, new Function3() { // from class: b21.a
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC2331d.m7186k(z16, widthRatioTransition, c23465k12, ratios, j111113, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q2, 3120, 4);
            c28655q = c28655q2;
            z15 = z16;
            modifier3 = modifier4;
            j13 = j111113;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            j13 = jM125430y;
            z15 = z13;
        }
        c23465k3 = c23465k2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2329b(widthRatioTransition, modifier3, ratios, j13, z15, c23465k3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m7186k(boolean z4, C11421z1 c11421z1, C23465k c23465k, List list, long j7, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        int i14 = (i13 & 6) == 0 ? i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2) : i13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float fM3403d = ((C1101c) BoxWithConstraints).m3403d();
            float f13 = 4;
            float f14 = 1 * f13;
            AbstractC41218f.m133900c(null, AbstractC33253j.m105489e(f14), c28655q, 0, 1);
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
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
            c28655q.m87150e0(396997820);
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C2332e c2332e = (C2332e) obj;
                float fM7191a = c2332e.getSpacerRatio();
                float fM7192b = c2332e.getSegmentRatio();
                m7180e(c11421z1, fM7191a, fM3403d, c28655q, 0);
                AbstractC41215c.m133896b(AbstractC1102d.m3411h(f13 * f13, AbstractC1102d.m3424u(fM7192b * fM3403d, c2314t)), m7188m(i15, list.size()), j7, c28655q, 0, 0);
                i15 = i16;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            if (!z4 || ((Boolean) c11421z1.f36630a.mo2428y0()).booleanValue()) {
                c28655q.m87150e0(-286228479);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1930425681);
                if (c23465k == null) {
                    c28655q.m87150e0(-286346032);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-286346031);
                    m7183h(((Number) c23465k.f92937w).floatValue(), ((Number) c23465k.f92938x).floatValue(), fM3403d, c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m7187l(C11421z1 c11421z1, Modifier modifier, List list, long j7, boolean z4, C23465k c23465k, int i13, int i14, Composer composer, int i15) {
        m7185j(c11421z1, modifier, list, j7, z4, c23465k, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final EnumC41216d m7188m(int i13, int i14) {
        if (i13 == 0) {
            return EnumC41216d.LEFT;
        }
        return i13 == i14 + (-1) ? EnumC41216d.RIGHT : EnumC41216d.CENTER;
    }
}
