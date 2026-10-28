package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bf0.C3189a;
import c31.C3929m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.u3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001ae\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "label", "", "primaryIcon", "trendIcon", "Li2/x;", "trendColor", "title", "titleColor", "subtitle", "subtitleColor", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "n", "(Lcom/whoop/design/util/TextResource;IIJLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j", "(ILcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "l", "(IJLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4128u3 {
    /* JADX INFO: renamed from: h */
    private static final void m12743h(TextResource textResource, long j7, TextResource textResource2, long j13, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1561931403);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(textResource2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87151f(j13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            EnumC22935a1 enumC22935a1 = EnumC22935a1.f90538x;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3399u = AbstractC1099a.m3399u(c2314t, enumC22935a1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3399u);
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
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i14 & 14);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierM3409f, j7, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, ((i14 << 3) & 896) | 48, 0, 196088);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q2, (i14 >> 6) & 14), AbstractC1102d.m3409f(1.0f, c2314t), j13, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH6(), null, c28655q2, ((i14 >> 3) & 896) | 48, 0, 196088);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4121t3(textResource, j7, textResource2, j13, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12744i(TextResource textResource, long j7, TextResource textResource2, long j13, int i13, Composer composer, int i14) {
        m12743h(textResource, j7, textResource2, j13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m12745j(int i13, TextResource textResource, Composer composer, int i14) throws XmlPullParserException, IOException {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1802292026);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        int i16 = i15;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            float f13 = 4;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, c2314t);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(i13, c28655q, ((i16 << 3) & 112) | 6);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, (i16 >> 3) & 14), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4107r3(i13, textResource, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m12746k(int i13, TextResource textResource, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m12745j(i13, textResource, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m12747l(final int i13, final long j7, final TextResource textResource, final long j13, final TextResource textResource2, final long j14, Composer composer, final int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(558993089);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(textResource) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87151f(j13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87153g(textResource2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q.m87151f(j14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f13 * f13, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            int i16 = i15;
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
            Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1102d.m3419p(6 * f13, c2314t), (float) 0.5d, f13, C17919x.m51541c(0.15f, j7));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM95629e);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i16 << 3) & 112) | 6), null, AbstractC1102d.m3419p(((float) 2.5d) * f13, c2314t), j7, c28655q, ((i16 << 6) & 7168) | 432, 0);
            c28655q.m87173q(true);
            m12743h(textResource, j13, textResource2, j14, c28655q, (i16 >> 6) & 8190);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.s3
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4128u3.m12748m(i13, j7, textResource, j13, textResource2, j14, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12748m(int i13, long j7, TextResource textResource, long j13, TextResource textResource2, long j14, int i14, Composer composer, int i15) {
        m12747l(i13, j7, textResource, j13, textResource2, j14, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m12749n(final TextResource label, final int i13, final int i14, final long j7, final TextResource title, final long j13, final TextResource subtitle, final long j14, Function1 function1, Composer composer, final int i15, final int i16) {
        int i17;
        final int i18;
        int i19;
        long j15;
        long j16;
        long j17;
        int i24;
        C28655q c28655q;
        final Function1 function2;
        final Function1 function3;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(167294050);
        if ((i15 & 6) == 0) {
            i17 = (c28655q2.m87153g(label) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 = i13;
            i17 |= c28655q2.m87149e(i18) ? 32 : 16;
        } else {
            i18 = i13;
        }
        if ((i15 & 384) == 0) {
            i19 = i14;
            i17 |= c28655q2.m87149e(i19) ? 256 : 128;
        } else {
            i19 = i14;
        }
        if ((i15 & 3072) == 0) {
            j15 = j7;
            i17 |= c28655q2.m87151f(j15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            j15 = j7;
        }
        if ((i15 & 24576) == 0) {
            i17 |= c28655q2.m87153g(title) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            j16 = j13;
            i17 |= c28655q2.m87151f(j16) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            j16 = j13;
        }
        if ((1572864 & i15) == 0) {
            i17 |= c28655q2.m87153g(subtitle) ? 1048576 : 524288;
        }
        if ((12582912 & i15) == 0) {
            j17 = j14;
            i17 |= c28655q2.m87151f(j17) ? 8388608 : 4194304;
        } else {
            j17 = j14;
        }
        int i25 = i16 & 256;
        if (i25 != 0) {
            i24 = i17 | 100663296;
        } else {
            int i26 = i17;
            if ((i15 & 100663296) == 0) {
                i24 = i26 | (c28655q2.m87157i(function1) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE);
            } else {
                i24 = i26;
            }
        }
        if (c28655q2.m87135U(i24 & 1, (i24 & 38347923) != 38347922)) {
            if (i25 != 0) {
                Object objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C3929m(18);
                    c28655q2.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            final long j18 = j17;
            final long j19 = j16;
            final long j24 = j15;
            final int i27 = i19;
            c28655q = c28655q2;
            AbstractC31926e.m99375j(null, null, EnumC39333f.WHITE_10.mo134584toComposableColorWaAFU9c(c28655q2, 6), null, null, null, 0.0f, AbstractC37817c.m121344e(-1861627918, c28655q2, new InterfaceC4351m() { // from class: c41.p3
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC4128u3.m12751p(function3, i18, label, i27, j24, title, j19, subtitle, j18, (Composer) obj, ((Integer) obj2).intValue());
                }
            }), c28655q, 12582912, 123);
            function2 = function3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.q3
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4128u3.m12753r(label, i13, i14, j7, title, j13, subtitle, j14, function2, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12750o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m12751p(Function1 function1, int i13, TextResource textResource, int i14, long j7, TextResource textResource2, long j13, TextResource textResource3, long j14, Composer composer, int i15) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1099a.m3394p(3 * 4, C2314t.f9131w), EnumC22935a1.f90538x);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C3189a(function1, 12);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3388j, true, null, null, (InterfaceC4339a) objM87133R, 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90656g, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
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
            m12745j(i13, textResource, c28655q, 0);
            m12747l(i14, j7, textResource2, j13, textResource3, j14, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m12752q(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m12753r(TextResource textResource, int i13, int i14, long j7, TextResource textResource2, long j13, TextResource textResource3, long j14, Function1 function1, int i15, int i16, Composer composer, int i17) {
        m12749n(textResource, i13, i14, j7, textResource2, j13, textResource3, j14, function1, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}
