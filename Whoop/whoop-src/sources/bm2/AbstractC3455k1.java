package bm2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17808z1;
import hy0.EnumC17727b2;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C21061j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import ul2.EnumC35069b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bm2.k1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001ac\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aS\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aK\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "metric", "unit", "Lbm2/u0;", "trendDirection", "trendDisplay", "Lul2/b;", "trendStyle", "Ly81/e;", "textColor", "phaseLabelDisplay", "phaseLabelColor", "Lbm2/v0;", "type", "Ll83/a0;", "u", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbm2/u0;Lcom/whoop/design/util/TextResource;Lul2/b;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lbm2/v0;Landroidx/compose/runtime/Composer;II)V", "l", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbm2/u0;Lcom/whoop/design/util/TextResource;Lul2/b;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Landroidx/compose/runtime/Composer;II)V", "i", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbm2/u0;Lcom/whoop/design/util/TextResource;Lul2/b;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Landroidx/compose/runtime/Composer;II)V", "footer", "r", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Landroidx/compose/runtime/Composer;II)V", "n", "(Lbm2/u0;Lul2/b;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "text", "p", "(Lcom/whoop/design/util/TextResource;Ly81/e;Landroidx/compose/runtime/Composer;I)V", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3455k1 {

    /* JADX INFO: renamed from: bm2.k1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f13549w = new a();

        /* JADX INFO: renamed from: a */
        public final long m10117a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10117a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.k1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f13550w = new b();

        /* JADX INFO: renamed from: a */
        public final long m10118a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10118a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.k1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f13551w = new c();

        /* JADX INFO: renamed from: a */
        public final long m10119a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10119a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.k1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f13552w = new d();

        /* JADX INFO: renamed from: a */
        public final long m10120a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10120a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.k1$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13553a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f13554b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f13555c;

        static {
            int[] iArr = new int[EnumC3479v0.values().length];
            try {
                iArr[EnumC3479v0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3479v0.FLAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3479v0.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13553a = iArr;
            int[] iArr2 = new int[EnumC3477u0.values().length];
            try {
                iArr2[EnumC3477u0.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC3477u0.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC3477u0.NO_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC3477u0.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f13554b = iArr2;
            int[] iArr3 = new int[EnumC35069b.values().length];
            try {
                iArr3[EnumC35069b.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EnumC35069b.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC35069b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f13555c = iArr3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX INFO: renamed from: i */
    private static final void m10103i(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC3477u0 enumC3477u0, TextResource textResource4, EnumC35069b enumC35069b, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC39332e interfaceC39332eM125323a;
        EnumC35069b enumC35069b2;
        C28655q c28655q;
        InterfaceC39332e interfaceC39332e3;
        int i16;
        int i17;
        TextResource textResourceM21267a = textResource5;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1727240382);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(textResource2) : c28655q2.m87157i(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q2.m87153g(textResource3) : c28655q2.m87157i(textResource3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87149e(enumC3477u0.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q2.m87153g(textResource4) : c28655q2.m87157i(textResource4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87149e(enumC35069b.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q2.m87157i(interfaceC39332e) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            if ((i14 & 128) != 0) {
                i17 = 4194304;
            } else {
                if ((16777216 & i13) == 0 ? c28655q2.m87153g(textResourceM21267a) : c28655q2.m87157i(textResourceM21267a)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
            }
            i15 |= i17;
        }
        if ((100663296 & i13) == 0) {
            if ((i14 & 256) == 0) {
                interfaceC39332eM125323a = interfaceC39332e2;
                if (c28655q2.m87157i(interfaceC39332eM125323a)) {
                    i16 = 67108864;
                }
                i15 |= i16;
            } else {
                interfaceC39332eM125323a = interfaceC39332e2;
            }
            i16 = AndroidSDKConstants.FLAG_MUTABLE;
            i15 |= i16;
        } else {
            interfaceC39332eM125323a = interfaceC39332e2;
        }
        if (c28655q2.m87135U(i15 & 1, (38347923 & i15) != 38347922)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                if ((i14 & 128) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -29360129;
                }
                if ((i14 & 256) != 0) {
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = a.f13549w;
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                    i15 &= -234881025;
                }
            } else {
                c28655q2.m87138X();
                if ((i14 & 128) != 0) {
                    i15 &= -29360129;
                }
                if ((i14 & 256) != 0) {
                    i15 &= -234881025;
                }
            }
            c28655q2.m87175r();
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            InterfaceC39332e interfaceC39332e4 = interfaceC39332eM125323a;
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            int i18 = i15;
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
            int i19 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, (i18 & 14) | i19);
            C38072d c38072d = C38072d.f163053a;
            int i24 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i24).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getH5(), null, c28655q2, 0, C2886a.f11498d << 18, 196090);
            c28655q = c28655q2;
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(1199667912, c28655q, new C3443g1(textResource2, interfaceC39332e, textResource3, 0)), c28655q, 56);
            enumC35069b2 = enumC35069b;
            m10108n(enumC3477u0, enumC35069b2, textResource4, c28655q, ((i18 >> 9) & 14) | ((i18 >> 12) & 112) | (i19 << 6) | ((i18 >> 6) & 896));
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * 4, c2314t));
            if (AbstractC8693b.m21270d(textResourceM21267a)) {
                c28655q.m87150e0(-1027989119);
                int i25 = i18 >> 21;
                interfaceC39332e3 = interfaceC39332e4;
                m10110p(textResourceM21267a, interfaceC39332e3, c28655q, (i25 & 112) | i19 | (i25 & 14));
                c28655q.m87173q(false);
            } else {
                interfaceC39332e3 = interfaceC39332e4;
                c28655q.m87150e0(-1027903590);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC39332eM125323a = interfaceC39332e3;
        } else {
            enumC35069b2 = enumC35069b;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        TextResource textResource6 = textResourceM21267a;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3446h1(textResource, textResource2, textResource3, (Enum) enumC3477u0, textResource4, (Enum) enumC35069b2, interfaceC39332e, textResource6, interfaceC39332eM125323a, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m10104j(TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, Composer composer, int i13) {
        C2886a c2886aM8420a;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 1 * 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i14);
            long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8444y = c38072d.m121952e(c28655q, i15).getN4();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8444y, null, c28655q, 0, i16, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q, i14);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            long jMo134584toComposableColorWaAFU9c2 = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, 0);
            if (AbstractC22676k.m65745e(textResource2, AbstractC8693b.m21278l("%"))) {
                c28655q.m87150e0(-636716682);
                c2886aM8420a = c38072d.m121952e(c28655q, i15).getN5();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-636639306);
                c2886aM8420a = c38072d.m121952e(c28655q, i15).getB1();
                c28655q.m87173q(false);
            }
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, jMo134584toComposableColorWaAFU9c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 48, i16, 196600);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m10105k(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC3477u0 enumC3477u0, TextResource textResource4, EnumC35069b enumC35069b, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, int i13, int i14, Composer composer, int i15) {
        m10103i(textResource, textResource2, textResource3, enumC3477u0, textResource4, enumC35069b, interfaceC39332e, textResource5, interfaceC39332e2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX INFO: renamed from: l */
    private static final void m10106l(TextResource textResource, TextResource textResource2, EnumC3477u0 enumC3477u0, TextResource textResource3, EnumC35069b enumC35069b, InterfaceC39332e interfaceC39332e, TextResource textResource4, InterfaceC39332e interfaceC39332e2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC39332e interfaceC39332eM125323a;
        C28655q c28655q;
        TextResource textResource5;
        InterfaceC39332e interfaceC39332e3;
        int i16;
        TextResource textResourceM21267a = textResource4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1892808059);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(textResource2) : c28655q2.m87157i(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87149e(enumC3477u0.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q2.m87153g(textResource3) : c28655q2.m87157i(textResource3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87149e(enumC35069b.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87157i(interfaceC39332e) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) != 0) {
                i16 = 524288;
            } else {
                if ((2097152 & i13) == 0 ? c28655q2.m87153g(textResourceM21267a) : c28655q2.m87157i(textResourceM21267a)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
            }
            i15 |= i16;
        }
        if ((12582912 & i13) == 0) {
            if ((i14 & 128) == 0) {
                interfaceC39332eM125323a = interfaceC39332e2;
                int i17 = c28655q2.m87157i(interfaceC39332eM125323a) ? 8388608 : 4194304;
                i15 |= i17;
            } else {
                interfaceC39332eM125323a = interfaceC39332e2;
            }
            i15 |= i17;
        } else {
            interfaceC39332eM125323a = interfaceC39332e2;
        }
        if (c28655q2.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                if ((i14 & 64) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -3670017;
                }
                if ((i14 & 128) != 0) {
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = b.f13550w;
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                    i15 &= -29360129;
                }
            } else {
                c28655q2.m87138X();
                if ((i14 & 64) != 0) {
                    i15 &= -3670017;
                }
                if ((i14 & 128) != 0) {
                    i15 &= -29360129;
                }
            }
            int i18 = i15;
            InterfaceC39332e interfaceC39332e4 = interfaceC39332eM125323a;
            c28655q2.m87175r();
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            TextResource textResource6 = textResourceM21267a;
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            int i19 = TextResource.$stable;
            int i24 = i18 >> 3;
            String strM21274h = AbstractC8693b.m21274h(textResource2, c28655q2, (i24 & 14) | i19);
            long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 15) & 14);
            C38072d c38072d = C38072d.f163053a;
            int i25 = C38072d.f163054b;
            C2886a c2886aM8403A = c38072d.m121952e(c28655q2, i25).getN5();
            int i26 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8403A, null, c28655q2, 0, i26, 196602);
            float f13 = 4;
            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q2);
            m10108n(enumC3477u0, enumC35069b, textResource3, c28655q2, (i24 & 896) | ((i18 >> 6) & 14) | ((i18 >> 9) & 112) | (i19 << 6));
            c28655q2.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, (i18 & 14) | i19), null, c38072d.m121949b(c28655q2, i25).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i25).getH5(), null, c28655q2, 0, i26, 196090);
            c28655q = c28655q2;
            if (AbstractC8693b.m21270d(textResource6)) {
                c28655q.m87150e0(-1496164978);
                AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
                int i27 = i18 >> 18;
                int i28 = i19 | (i27 & 14) | (i27 & 112);
                textResource5 = textResource6;
                m10110p(textResource5, interfaceC39332e4, c28655q, i28);
                c28655q.m87173q(false);
            } else {
                textResource5 = textResource6;
                c28655q.m87150e0(-1496037165);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC39332e3 = interfaceC39332e4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            textResource5 = textResourceM21267a;
            interfaceC39332e3 = interfaceC39332eM125323a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(textResource, textResource2, enumC3477u0, textResource3, enumC35069b, interfaceC39332e, textResource5, interfaceC39332e3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m10107m(TextResource textResource, TextResource textResource2, EnumC3477u0 enumC3477u0, TextResource textResource3, EnumC35069b enumC35069b, InterfaceC39332e interfaceC39332e, TextResource textResource4, InterfaceC39332e interfaceC39332e2, int i13, int i14, Composer composer, int i15) {
        m10106l(textResource, textResource2, enumC3477u0, textResource3, enumC35069b, interfaceC39332e, textResource4, interfaceC39332e2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m10108n(EnumC3477u0 enumC3477u0, EnumC35069b enumC35069b, TextResource textResource, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1436316890);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC3477u0.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC35069b.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i15 = e.f13555c[enumC35069b.ordinal()];
            if (i15 == 1) {
                int i16 = i14;
                boolean z13 = false;
                c28655q.m87150e0(1442893190);
                int i17 = e.f13554b[enumC3477u0.ordinal()];
                if (i17 == 1) {
                    c28655q.m87150e0(-1616021334);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.POSITIVE_GREEN, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, TextResource.$stable | 432 | ((i16 >> 6) & 14), 0, 32760);
                    z13 = false;
                    c28655q.m87173q(false);
                } else if (i17 != 2) {
                    c28655q.m87150e0(1443206042);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1616016854);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.NEGATIVE_GREEN, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, TextResource.$stable | 432 | ((i16 >> 6) & 14), 0, 32760);
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
            } else if (i15 == 2) {
                int i18 = i14;
                boolean z14 = false;
                c28655q.m87150e0(1443288068);
                int i19 = e.f13554b[enumC3477u0.ordinal()];
                if (i19 == 1) {
                    c28655q.m87150e0(-1616008597);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.POSITIVE_YELLOW, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, TextResource.$stable | 432 | ((i18 >> 6) & 14), 0, 32760);
                    z14 = false;
                    c28655q.m87173q(false);
                } else if (i19 != 2) {
                    c28655q.m87150e0(1443602842);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1616004085);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.NEGATIVE_YELLOW, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, TextResource.$stable | 432 | ((i18 >> 6) & 14), 0, 32760);
                    z14 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
            } else {
                if (i15 != 3) {
                    throw AbstractC11895b.m32003v(-1616024108, c28655q, false);
                }
                c28655q.m87150e0(1443685209);
                int i24 = e.f13554b[enumC3477u0.ordinal()];
                if (i24 == 1) {
                    c28655q.m87150e0(-1615995932);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.POSITIVE, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, TextResource.$stable | 432 | ((i14 >> 6) & 14), 0, 32760);
                    z4 = false;
                    c28655q.m87173q(false);
                } else if (i24 == 2) {
                    c28655q.m87150e0(-1615991644);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.NEGATIVE, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, TextResource.$stable | 432 | ((i14 >> 6) & 14), 0, 32760);
                    z4 = false;
                    c28655q.m87173q(false);
                } else if (i24 == 3) {
                    c28655q.m87150e0(-1615987197);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.NEUTRAL, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, TextResource.$stable | 432 | ((i14 >> 6) & 14), 0, 32760);
                    z4 = false;
                    c28655q.m87173q(false);
                } else {
                    if (i24 != 4) {
                        throw AbstractC11895b.m32003v(-1615997495, c28655q, false);
                    }
                    c28655q.m87150e0(1444133562);
                    c28655q.m87173q(false);
                    z4 = false;
                }
                c28655q.m87173q(z4);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(enumC3477u0, enumC35069b, textResource, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m10109o(EnumC3477u0 enumC3477u0, EnumC35069b enumC35069b, TextResource textResource, int i13, Composer composer, int i14) {
        m10108n(enumC3477u0, enumC35069b, textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m10110p(TextResource textResource, InterfaceC39332e interfaceC39332e, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1534778023);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC39332e) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = (i14 >> 3) & 14;
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC37056f.m118994r(C2314t.f9131w, AbstractC33253j.m105489e(1 * 4)), C17919x.m51541c(0.15f, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, i15)), AbstractC17918w0.f69621a), ((float) 0.75d) * f13, ((float) 0.25d) * f13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, (i14 & 14) | TextResource.$stable), null, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, i15), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH6(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3452j1(textResource, interfaceC39332e, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m10111q(TextResource textResource, InterfaceC39332e interfaceC39332e, int i13, Composer composer, int i14) {
        m10110p(textResource, interfaceC39332e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: r */
    private static final void m10112r(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC39332e interfaceC39332eM125323a;
        InterfaceC39332e interfaceC39332e3;
        C28655q c28655q;
        C28655q c28655q2;
        C2314t c2314t;
        ?? r10;
        boolean z4;
        int i16;
        TextResource textResourceM21267a = textResource5;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1309781272);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q3.m87153g(textResource) : c28655q3.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(textResource2) : c28655q3.m87157i(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q3.m87153g(textResource3) : c28655q3.m87157i(textResource3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q3.m87153g(textResource4) : c28655q3.m87157i(textResource4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q3.m87157i(interfaceC39332e) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            if ((i14 & 32) != 0) {
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                if ((262144 & i13) == 0 ? c28655q3.m87153g(textResourceM21267a) : c28655q3.m87157i(textResourceM21267a)) {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
            }
            i15 |= i16;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) == 0) {
                interfaceC39332eM125323a = interfaceC39332e2;
                int i17 = c28655q3.m87157i(interfaceC39332eM125323a) ? 1048576 : 524288;
                i15 |= i17;
            } else {
                interfaceC39332eM125323a = interfaceC39332e2;
            }
            i15 |= i17;
        } else {
            interfaceC39332eM125323a = interfaceC39332e2;
        }
        if (c28655q3.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            c28655q3.m87140Z();
            if ((i13 & 1) == 0 || c28655q3.m87118C()) {
                if ((i14 & 32) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    Object objM87133R = c28655q3.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = c.f13551w;
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                    i15 &= -3670017;
                }
            } else {
                c28655q3.m87138X();
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    i15 &= -3670017;
                }
            }
            int i18 = i15;
            interfaceC39332e3 = interfaceC39332eM125323a;
            c28655q3.m87175r();
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, c2314t2);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            if (AbstractC8693b.m21270d(textResource)) {
                c28655q3.m87150e0(1987448496);
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q3, TextResource.$stable | (i18 & 14));
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                r10 = 1;
                z4 = false;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q3, i19).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i19).getH5(), null, c28655q3, 0, C2886a.f11498d << 18, 196090);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            } else {
                c28655q2 = c28655q3;
                c2314t = c2314t2;
                r10 = 1;
                z4 = false;
                c28655q2.m87150e0(1987679136);
                c28655q2.m87173q(false);
            }
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(236069410, c28655q2, new C3443g1(textResource2, interfaceC39332e, textResource3, 1)), c28655q2, 56);
            int i24 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResource4, c28655q2, i24 | ((i18 >> 9) & 14));
            C38072d c38072d2 = C38072d.f163053a;
            int i25 = C38072d.f163054b;
            C28655q c28655q4 = c28655q2;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q2, i25).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(r10), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i25).getH5(), null, c28655q4, 0, C2886a.f11498d << 18, 196090);
            C28655q c28655q5 = c28655q4;
            AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3419p(((float) r10) * 4, c2314t));
            if (AbstractC8693b.m21270d(textResourceM21267a)) {
                c28655q5.m87150e0(1988916935);
                int i26 = i18 >> 15;
                m10110p(textResourceM21267a, interfaceC39332e3, c28655q5, (i26 & 112) | i24 | (i26 & 14));
                c28655q5.m87173q(z4);
            } else {
                c28655q5.m87150e0(1989002464);
                c28655q5.m87173q(z4);
            }
            c28655q5.m87173q(r10);
            c28655q = c28655q5;
        } else {
            C28655q c28655q6 = c28655q3;
            c28655q6.m87138X();
            interfaceC39332e3 = interfaceC39332eM125323a;
            c28655q = c28655q6;
        }
        TextResource textResource6 = textResourceM21267a;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3449i1(textResource, textResource2, textResource3, textResource4, interfaceC39332e, textResource6, interfaceC39332e3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m10113s(TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, Composer composer, int i13) {
        C2886a c2886aM8420a;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 1 * 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i14);
            long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8403A = c38072d.m121952e(c28655q, i15).getN5();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8403A, null, c28655q, 0, i16, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q, i14);
            long jMo134584toComposableColorWaAFU9c2 = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, 0);
            if (AbstractC22676k.m65745e(textResource2, AbstractC8693b.m21278l("%"))) {
                c28655q.m87150e0(1942426204);
                c2886aM8420a = c38072d.m121952e(c28655q, i15).getN5();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1942503580);
                c2886aM8420a = c38072d.m121952e(c28655q, i15).getB1();
                c28655q.m87173q(false);
            }
            AbstractC30795n.m94707h(strM21274h2, null, jMo134584toComposableColorWaAFU9c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i16, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m10114t(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, int i13, int i14, Composer composer, int i15) {
        m10112r(textResource, textResource2, textResource3, textResource4, interfaceC39332e, textResource5, interfaceC39332e2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:130:0x023c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    /* JADX INFO: renamed from: u */
    public static final void m10115u(TextResource title, TextResource metric, TextResource unit, EnumC3477u0 trendDirection, TextResource trendDisplay, EnumC35069b trendStyle, InterfaceC39332e textColor, TextResource textResource, InterfaceC39332e interfaceC39332e, EnumC3479v0 type, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC39332e interfaceC39332e2;
        int i16;
        InterfaceC39332e interfaceC39332e3;
        int i17;
        int i18;
        int i19;
        TextResource textResourceM21267a = textResource;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(trendDirection, "trendDirection");
        AbstractC22676k.m65750j(trendDisplay, "trendDisplay");
        AbstractC22676k.m65750j(trendStyle, "trendStyle");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1266048129);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(metric) : c28655q.m87157i(metric) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(unit) : c28655q.m87157i(unit) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87149e(trendDirection.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q.m87153g(trendDisplay) : c28655q.m87157i(trendDisplay) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87149e(trendStyle.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q.m87157i(textColor) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            if ((i14 & 128) != 0) {
                i19 = 4194304;
            } else {
                if ((16777216 & i13) == 0 ? c28655q.m87153g(textResourceM21267a) : c28655q.m87157i(textResourceM21267a)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
            }
            i15 |= i19;
        }
        if ((100663296 & i13) == 0) {
            if ((i14 & 256) == 0) {
                interfaceC39332e2 = interfaceC39332e;
                if (c28655q.m87157i(interfaceC39332e2)) {
                    i18 = 67108864;
                }
                i15 |= i18;
            } else {
                interfaceC39332e2 = interfaceC39332e;
            }
            i18 = AndroidSDKConstants.FLAG_MUTABLE;
            i15 |= i18;
        } else {
            interfaceC39332e2 = interfaceC39332e;
        }
        if ((805306368 & i13) == 0) {
            i15 |= c28655q.m87149e(type.ordinal()) ? 536870912 : 268435456;
        }
        if (c28655q.m87135U(i15 & 1, (306783379 & i15) != 306783378)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 128) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -29360129;
                }
                if ((i14 & 256) != 0) {
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = d.f13552w;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                    i16 = i15 & (-234881025);
                    interfaceC39332e3 = interfaceC39332eM125323a;
                }
                c28655q.m87175r();
                i17 = e.f13553a[type.ordinal()];
                if (i17 != 1) {
                    c28655q.m87150e0(-1196493136);
                    int i24 = TextResource.$stable;
                    int i25 = (i24 << 21) | (i16 & 14) | i24 | (i24 << 3) | (i16 & 112) | (i24 << 6) | (i16 & 896) | (i16 & 7168) | (i24 << 12) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (234881024 & i16);
                    InterfaceC39332e interfaceC39332e4 = interfaceC39332e3;
                    TextResource textResource2 = textResourceM21267a;
                    m10103i(title, metric, unit, trendDirection, trendDisplay, trendStyle, textColor, textResource2, interfaceC39332e4, c28655q, i25, 0);
                    textResourceM21267a = textResource2;
                    interfaceC39332e3 = interfaceC39332e4;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (i17 != 2) {
                    c28655q.m87150e0(-1196480204);
                    int i26 = TextResource.$stable;
                    int i27 = i16 >> 3;
                    InterfaceC39332e interfaceC39332e5 = interfaceC39332e3;
                    TextResource textResource3 = textResourceM21267a;
                    m10106l(title, metric, trendDirection, trendDisplay, trendStyle, textColor, textResource3, interfaceC39332e5, c28655q, (i26 << 18) | (i16 & 14) | i26 | (i26 << 3) | (i16 & 112) | (i27 & 896) | (i26 << 9) | (i27 & 7168) | (i27 & 57344) | (i27 & 458752) | (i27 & 3670016) | (i27 & 29360128), 0);
                    textResourceM21267a = textResource3;
                    interfaceC39332e3 = interfaceC39332e5;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (i17 == 3) {
                        throw AbstractC11895b.m32003v(-1196494049, c28655q, false);
                    }
                    c28655q.m87150e0(-1196468170);
                    int i28 = TextResource.$stable;
                    int i29 = (i16 & 14) | i28 | (i28 << 3) | (i16 & 112) | (i28 << 6) | (i16 & 896) | (i28 << 9) | ((i16 >> 3) & 7168);
                    int i34 = i16 >> 6;
                    m10112r(title, metric, unit, trendDisplay, textColor, textResourceM21267a, interfaceC39332e3, c28655q, (i34 & 3670016) | (i28 << 15) | i29 | (i34 & 57344) | (i34 & 458752), 0);
                    c28655q.m87173q(false);
                }
                interfaceC39332e2 = interfaceC39332e3;
            } else {
                c28655q.m87138X();
                if ((i14 & 128) != 0) {
                    i15 &= -29360129;
                }
                if ((i14 & 256) != 0) {
                    i15 &= -234881025;
                }
            }
            i16 = i15;
            interfaceC39332e3 = interfaceC39332e2;
            c28655q.m87175r();
            i17 = e.f13553a[type.ordinal()];
            if (i17 != 1) {
                c28655q.m87150e0(-1196493136);
                int i210 = TextResource.$stable;
                int i211 = (i210 << 21) | (i16 & 14) | i210 | (i210 << 3) | (i16 & 112) | (i210 << 6) | (i16 & 896) | (i16 & 7168) | (i210 << 12) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (234881024 & i16);
                InterfaceC39332e interfaceC39332e6 = interfaceC39332e3;
                TextResource textResource4 = textResourceM21267a;
                m10103i(title, metric, unit, trendDirection, trendDisplay, trendStyle, textColor, textResource4, interfaceC39332e6, c28655q, i211, 0);
                textResourceM21267a = textResource4;
                interfaceC39332e3 = interfaceC39332e6;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (i17 != 2) {
                c28655q.m87150e0(-1196480204);
                int i212 = TextResource.$stable;
                int i213 = i16 >> 3;
                InterfaceC39332e interfaceC39332e7 = interfaceC39332e3;
                TextResource textResource5 = textResourceM21267a;
                m10106l(title, metric, trendDirection, trendDisplay, trendStyle, textColor, textResource5, interfaceC39332e7, c28655q, (i212 << 18) | (i16 & 14) | i212 | (i212 << 3) | (i16 & 112) | (i213 & 896) | (i212 << 9) | (i213 & 7168) | (i213 & 57344) | (i213 & 458752) | (i213 & 3670016) | (i213 & 29360128), 0);
                textResourceM21267a = textResource5;
                interfaceC39332e3 = interfaceC39332e7;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                if (i17 == 3) {
                    throw AbstractC11895b.m32003v(-1196494049, c28655q, false);
                }
                c28655q.m87150e0(-1196468170);
                int i214 = TextResource.$stable;
                int i215 = (i16 & 14) | i214 | (i214 << 3) | (i16 & 112) | (i214 << 6) | (i16 & 896) | (i214 << 9) | ((i16 >> 3) & 7168);
                int i35 = i16 >> 6;
                m10112r(title, metric, unit, trendDisplay, textColor, textResourceM21267a, interfaceC39332e3, c28655q, (i35 & 3670016) | (i214 << 15) | i215 | (i35 & 57344) | (i35 & 458752), 0);
                c28655q.m87173q(false);
            }
            interfaceC39332e2 = interfaceC39332e3;
        } else {
            c28655q.m87138X();
        }
        TextResource textResource6 = textResourceM21267a;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3440f1(title, metric, unit, (Enum) trendDirection, trendDisplay, (Enum) trendStyle, textColor, textResource6, interfaceC39332e2, (Enum) type, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m10116v(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC3477u0 enumC3477u0, TextResource textResource4, EnumC35069b enumC35069b, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, EnumC3479v0 enumC3479v0, int i13, int i14, Composer composer, int i15) {
        m10115u(textResource, textResource2, textResource3, enumC3477u0, textResource4, enumC35069b, interfaceC39332e, textResource5, interfaceC39332e2, enumC3479v0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
