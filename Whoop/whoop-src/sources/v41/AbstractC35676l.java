package v41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import b91.C2886a;
import bm2.C3440f1;
import bm2.C3446h1;
import bm2.C3449i1;
import bm2.C3452j1;
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
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import s01.C32049e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: v41.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001ac\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aS\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aK\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "metric", "unit", "Lv41/j0;", "trendDirection", "trendDisplay", "Lv41/l0;", "trendStyle", "Ly81/e;", "textColor", "phaseLabelDisplay", "phaseLabelColor", "Lv41/k0;", "type", "Ll83/a0;", "m", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lv41/j0;Lcom/whoop/design/util/TextResource;Lv41/l0;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lv41/k0;Landroidx/compose/runtime/Composer;II)V", "i", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lv41/j0;Lcom/whoop/design/util/TextResource;Lv41/l0;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Landroidx/compose/runtime/Composer;II)V", "g", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lv41/j0;Lcom/whoop/design/util/TextResource;Lv41/l0;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Landroidx/compose/runtime/Composer;II)V", "footer", "q", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Landroidx/compose/runtime/Composer;II)V", "k", "(Lv41/j0;Lv41/l0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "text", "o", "(Lcom/whoop/design/util/TextResource;Ly81/e;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35676l {

    /* JADX INFO: renamed from: v41.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f151623w = new a();

        /* JADX INFO: renamed from: a */
        public final long m113019a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m113019a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: v41.l$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f151624w = new b();

        /* JADX INFO: renamed from: a */
        public final long m113020a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m113020a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: v41.l$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f151625w = new c();

        /* JADX INFO: renamed from: a */
        public final long m113021a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m113021a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: v41.l$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f151626w = new d();

        /* JADX INFO: renamed from: a */
        public final long m113022a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m113022a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: v41.l$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f151627a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f151628b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f151629c;

        static {
            int[] iArr = new int[EnumC35675k0.values().length];
            try {
                iArr[EnumC35675k0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35675k0.FLAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC35675k0.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f151627a = iArr;
            int[] iArr2 = new int[EnumC35673j0.values().length];
            try {
                iArr2[EnumC35673j0.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC35673j0.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC35673j0.NO_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC35673j0.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f151628b = iArr2;
            int[] iArr3 = new int[EnumC35677l0.values().length];
            try {
                iArr3[EnumC35677l0.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EnumC35677l0.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC35677l0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f151629c = iArr3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX INFO: renamed from: g */
    private static final void m113007g(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC35673j0 enumC35673j0, TextResource textResource4, EnumC35677l0 enumC35677l0, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, Composer composer, int i13, int i14) {
        int i15;
        TextResource textResourceM21267a;
        EnumC35673j0 enumC35673j1;
        EnumC35677l0 enumC35677l1;
        C28655q c28655q;
        InterfaceC39332e interfaceC39332e3;
        C2886a c2886aM8420a;
        int i16;
        InterfaceC39332e interfaceC39332eM125323a = interfaceC39332e2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2119521315);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(textResource3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87149e(enumC35673j0.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(textResource4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87149e(enumC35677l0.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= (2097152 & i13) == 0 ? c28655q2.m87153g(interfaceC39332e) : c28655q2.m87157i(interfaceC39332e) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            if ((i14 & 128) == 0) {
                textResourceM21267a = textResource5;
                int i17 = c28655q2.m87153g(textResourceM21267a) ? 8388608 : 4194304;
                i15 |= i17;
            } else {
                textResourceM21267a = textResource5;
            }
            i15 |= i17;
        } else {
            textResourceM21267a = textResource5;
        }
        if ((100663296 & i13) == 0) {
            if ((i14 & 256) != 0) {
                i16 = AndroidSDKConstants.FLAG_MUTABLE;
            } else {
                if ((134217728 & i13) == 0 ? c28655q2.m87153g(interfaceC39332eM125323a) : c28655q2.m87157i(interfaceC39332eM125323a)) {
                    i16 = 67108864;
                } else {
                    i16 = AndroidSDKConstants.FLAG_MUTABLE;
                }
            }
            i15 |= i16;
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
                        objM87133R = a.f151623w;
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
            TextResource textResource6 = textResourceM21267a;
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
            int i18 = i15;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i18 & 14);
            C38072d c38072d = C38072d.f163053a;
            InterfaceC39332e interfaceC39332e4 = interfaceC39332eM125323a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH5(), null, c28655q2, 0, 0, 196090);
            float f13 = 1 * 4;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
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
            int i19 = (i18 >> 18) & 14;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q2, (i18 >> 3) & 14), null, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, i19), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN4(), null, c28655q2, 0, 0, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
            int i24 = i18 >> 6;
            String strM21274h2 = AbstractC8693b.m21274h(textResource3, c28655q2, i24 & 14);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, i19);
            if (AbstractC22676k.m65745e(textResource3, AbstractC8693b.m21278l("%"))) {
                c28655q2.m87150e0(1965851083);
                c2886aM8420a = c38072d.m121952e(c28655q2, 6).getN5();
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1965920523);
                c2886aM8420a = c38072d.m121952e(c28655q2, 6).getB1();
                c28655q2.m87173q(false);
            }
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 48, 0, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            enumC35673j1 = enumC35673j0;
            enumC35677l1 = enumC35677l0;
            m113011k(enumC35673j1, enumC35677l1, textResource4, c28655q, (i24 & 896) | ((i18 >> 9) & 14) | ((i18 >> 12) & 112));
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            if (AbstractC8693b.m21270d(textResource6)) {
                c28655q.m87150e0(-1432103306);
                textResourceM21267a = textResource6;
                interfaceC39332e3 = interfaceC39332e4;
                m113015o(textResourceM21267a, interfaceC39332e3, c28655q, (i18 >> 21) & 126);
                c28655q.m87173q(false);
            } else {
                textResourceM21267a = textResource6;
                interfaceC39332e3 = interfaceC39332e4;
                c28655q.m87150e0(-1432017777);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            enumC35673j1 = enumC35673j0;
            enumC35677l1 = enumC35677l0;
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC39332e3 = interfaceC39332eM125323a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3446h1(textResource, textResource2, textResource3, (Enum) enumC35673j1, textResource4, (Enum) enumC35677l1, interfaceC39332e, textResourceM21267a, interfaceC39332e3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m113008h(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC35673j0 enumC35673j0, TextResource textResource4, EnumC35677l0 enumC35677l0, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, int i13, int i14, Composer composer, int i15) {
        m113007g(textResource, textResource2, textResource3, enumC35673j0, textResource4, enumC35677l0, interfaceC39332e, textResource5, interfaceC39332e2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX INFO: renamed from: i */
    private static final void m113009i(TextResource textResource, TextResource textResource2, EnumC35673j0 enumC35673j0, TextResource textResource3, EnumC35677l0 enumC35677l0, InterfaceC39332e interfaceC39332e, TextResource textResource4, InterfaceC39332e interfaceC39332e2, Composer composer, int i13, int i14) {
        int i15;
        TextResource textResourceM21267a;
        InterfaceC39332e interfaceC39332e3;
        int i16;
        InterfaceC39332e interfaceC39332eM125323a = interfaceC39332e2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1870399050);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC35673j0.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(textResource3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87149e(enumC35677l0.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= (262144 & i13) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) == 0) {
                textResourceM21267a = textResource4;
                int i17 = c28655q.m87153g(textResourceM21267a) ? 1048576 : 524288;
                i15 |= i17;
            } else {
                textResourceM21267a = textResource4;
            }
            i15 |= i17;
        } else {
            textResourceM21267a = textResource4;
        }
        if ((12582912 & i13) == 0) {
            if ((i14 & 128) != 0) {
                i16 = 4194304;
            } else {
                if ((16777216 & i13) == 0 ? c28655q.m87153g(interfaceC39332eM125323a) : c28655q.m87157i(interfaceC39332eM125323a)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
            }
            i15 |= i16;
        }
        if (c28655q.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 64) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -3670017;
                }
                if ((i14 & 128) != 0) {
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = b.f151624w;
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                    i15 &= -29360129;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 64) != 0) {
                    i15 &= -3670017;
                }
                if ((i14 & 128) != 0) {
                    i15 &= -29360129;
                }
            }
            int i18 = i15;
            InterfaceC39332e interfaceC39332e4 = interfaceC39332eM125323a;
            TextResource textResource5 = textResourceM21267a;
            c28655q.m87175r();
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            int i19 = i18 >> 3;
            String strM21274h = AbstractC8693b.m21274h(textResource2, c28655q, i19 & 14);
            long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, (i18 >> 15) & 14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN5(), null, c28655q, 0, 0, 196602);
            float f13 = 4;
            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
            m113011k(enumC35673j0, enumC35677l0, textResource3, c28655q, (i19 & 896) | ((i18 >> 6) & 14) | ((i18 >> 9) & 112));
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i18 & 14), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196090);
            if (AbstractC8693b.m21270d(textResource5)) {
                c28655q.m87150e0(-2140739311);
                AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
                textResourceM21267a = textResource5;
                m113015o(textResourceM21267a, interfaceC39332e4, c28655q, (i18 >> 18) & 126);
                c28655q.m87173q(false);
            } else {
                textResourceM21267a = textResource5;
                c28655q.m87150e0(-2140611498);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC39332e3 = interfaceC39332e4;
        } else {
            c28655q.m87138X();
            interfaceC39332e3 = interfaceC39332eM125323a;
        }
        TextResource textResource6 = textResourceM21267a;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(textResource, textResource2, enumC35673j0, textResource3, enumC35677l0, interfaceC39332e, textResource6, interfaceC39332e3, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m113010j(TextResource textResource, TextResource textResource2, EnumC35673j0 enumC35673j0, TextResource textResource3, EnumC35677l0 enumC35677l0, InterfaceC39332e interfaceC39332e, TextResource textResource4, InterfaceC39332e interfaceC39332e2, int i13, int i14, Composer composer, int i15) {
        m113009i(textResource, textResource2, enumC35673j0, textResource3, enumC35677l0, interfaceC39332e, textResource4, interfaceC39332e2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m113011k(EnumC35673j0 enumC35673j0, EnumC35677l0 enumC35677l0, TextResource textResource, Composer composer, int i13) {
        int i14;
        TextResource textResource2;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-497624971);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC35673j0.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC35677l0.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            textResource2 = textResource;
            i14 |= c28655q.m87153g(textResource2) ? 256 : 128;
        } else {
            textResource2 = textResource;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i15 = e.f151629c[enumC35677l0.ordinal()];
            if (i15 == 1) {
                c28655q.m87150e0(1481787863);
                int i16 = e.f151628b[enumC35673j0.ordinal()];
                if (i16 == 1) {
                    c28655q.m87150e0(-1476219335);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.POSITIVE_GREEN, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, ((i14 >> 6) & 14) | 432, 0, 32760);
                    c28655q.m87173q(false);
                } else if (i16 != 2) {
                    c28655q.m87150e0(1482100715);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1476214855);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.NEGATIVE_GREEN, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, ((i14 >> 6) & 14) | 432, 0, 32760);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else if (i15 == 2) {
                c28655q.m87150e0(1482182741);
                int i17 = e.f151628b[enumC35673j0.ordinal()];
                if (i17 == 1) {
                    c28655q.m87150e0(-1476206598);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.POSITIVE_YELLOW, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, ((i14 >> 6) & 14) | 432, 0, 32760);
                    c28655q.m87173q(false);
                } else if (i17 != 2) {
                    c28655q.m87150e0(1482497515);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1476202086);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.NEGATIVE_YELLOW, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, ((i14 >> 6) & 14) | 432, 0, 32760);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                if (i15 != 3) {
                    throw AbstractC11895b.m32003v(-1476222109, c28655q, false);
                }
                c28655q.m87150e0(1482579882);
                int i18 = e.f151628b[enumC35673j0.ordinal()];
                if (i18 == 1) {
                    z4 = false;
                    c28655q.m87150e0(-1476193933);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.POSITIVE, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, ((i14 >> 6) & 14) | 432, 0, 32760);
                    c28655q.m87173q(false);
                } else if (i18 == 2) {
                    z4 = false;
                    c28655q.m87150e0(-1476189645);
                    AbstractC17808z1.m51177e(textResource, true, EnumC17727b2.NEGATIVE, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, ((i14 >> 6) & 14) | 432, 0, 32760);
                    c28655q.m87173q(false);
                } else if (i18 == 3) {
                    c28655q.m87150e0(-1476185198);
                    z4 = false;
                    AbstractC17808z1.m51177e(textResource2, true, EnumC17727b2.NEUTRAL, false, null, 0.0f, null, false, 0.0f, null, false, 0, 0, null, null, c28655q, ((i14 >> 6) & 14) | 432, 0, 32760);
                    c28655q.m87173q(false);
                } else {
                    if (i18 != 4) {
                        throw AbstractC11895b.m32003v(-1476195496, c28655q, false);
                    }
                    c28655q.m87150e0(1483028235);
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
            c28677v1M87180u.f115982d = new C32049e(enumC35673j0, enumC35677l0, textResource, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m113012l(EnumC35673j0 enumC35673j0, EnumC35677l0 enumC35677l0, TextResource textResource, int i13, Composer composer, int i14) {
        m113011k(enumC35673j0, enumC35677l0, textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0104  */
    /* JADX INFO: renamed from: m */
    public static final void m113013m(TextResource title, TextResource metric, TextResource unit, EnumC35673j0 trendDirection, TextResource trendDisplay, EnumC35677l0 trendStyle, InterfaceC39332e textColor, TextResource textResource, InterfaceC39332e interfaceC39332e, EnumC35675k0 type, Composer composer, int i13, int i14) {
        int i15;
        TextResource textResource2;
        TextResource textResource3;
        InterfaceC39332e interfaceC39332e2;
        TextResource textResourceM21267a;
        InterfaceC39332e interfaceC39332e3;
        TextResource textResource4;
        int i16;
        int i17;
        InterfaceC39332e interfaceC39332eM125323a = interfaceC39332e;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(trendDirection, "trendDirection");
        AbstractC22676k.m65750j(trendDisplay, "trendDisplay");
        AbstractC22676k.m65750j(trendStyle, "trendStyle");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(271278034);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(title) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(metric) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(unit) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87149e(trendDirection.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87153g(trendDisplay) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87149e(trendStyle.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= (2097152 & i13) == 0 ? c28655q.m87153g(textColor) : c28655q.m87157i(textColor) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            if ((i14 & 128) == 0) {
                textResource2 = textResource;
                int i18 = c28655q.m87153g(textResource2) ? 8388608 : 4194304;
                i15 |= i18;
            } else {
                textResource2 = textResource;
            }
            i15 |= i18;
        } else {
            textResource2 = textResource;
        }
        if ((100663296 & i13) == 0) {
            if ((i14 & 256) != 0) {
                i17 = AndroidSDKConstants.FLAG_MUTABLE;
            } else {
                if ((134217728 & i13) == 0 ? c28655q.m87153g(interfaceC39332eM125323a) : c28655q.m87157i(interfaceC39332eM125323a)) {
                    i17 = 67108864;
                } else {
                    i17 = AndroidSDKConstants.FLAG_MUTABLE;
                }
            }
            i15 |= i17;
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
                } else {
                    textResourceM21267a = textResource2;
                }
                if ((i14 & 256) != 0) {
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = c.f151625w;
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                    i15 &= -234881025;
                }
                int i19 = i15;
                interfaceC39332e3 = interfaceC39332eM125323a;
                textResource4 = textResourceM21267a;
                i16 = i19;
            } else {
                c28655q.m87138X();
                if ((i14 & 128) != 0) {
                    i15 &= -29360129;
                }
                if ((i14 & 256) != 0) {
                    i15 &= -234881025;
                }
                i16 = i15;
                interfaceC39332e3 = interfaceC39332eM125323a;
                textResource4 = textResource2;
            }
            c28655q.m87175r();
            int i24 = e.f151627a[type.ordinal()];
            if (i24 == 1) {
                c28655q.m87150e0(-1294800509);
                int i25 = i16 & 268435454;
                InterfaceC39332e interfaceC39332e4 = interfaceC39332e3;
                TextResource textResource5 = textResource4;
                m113007g(title, metric, unit, trendDirection, trendDisplay, trendStyle, textColor, textResource5, interfaceC39332e4, c28655q, i25, 0);
                textResource4 = textResource5;
                interfaceC39332e3 = interfaceC39332e4;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (i24 == 2) {
                c28655q.m87150e0(-1294787577);
                int i26 = i16 >> 3;
                InterfaceC39332e interfaceC39332e5 = interfaceC39332e3;
                TextResource textResource6 = textResource4;
                m113009i(title, metric, trendDirection, trendDisplay, trendStyle, textColor, textResource6, interfaceC39332e5, c28655q, (i16 & 126) | (i26 & 896) | (i26 & 7168) | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128), 0);
                textResource4 = textResource6;
                interfaceC39332e3 = interfaceC39332e5;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                if (i24 != 3) {
                    throw AbstractC11895b.m32003v(-1294801422, c28655q, false);
                }
                c28655q.m87150e0(-1294775543);
                int i27 = (i16 & 1022) | ((i16 >> 3) & 7168);
                int i28 = i16 >> 6;
                m113017q(title, metric, unit, trendDisplay, textColor, textResource4, interfaceC39332e3, c28655q, (i28 & 3670016) | i27 | (i28 & 57344) | (i28 & 458752), 0);
                c28655q.m87173q(false);
            }
            textResource3 = textResource4;
            interfaceC39332e2 = interfaceC39332e3;
        } else {
            c28655q.m87138X();
            textResource3 = textResource2;
            interfaceC39332e2 = interfaceC39332eM125323a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3440f1(title, metric, unit, (Enum) trendDirection, trendDisplay, (Enum) trendStyle, textColor, textResource3, interfaceC39332e2, (Enum) type, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m113014n(TextResource textResource, TextResource textResource2, TextResource textResource3, EnumC35673j0 enumC35673j0, TextResource textResource4, EnumC35677l0 enumC35677l0, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, EnumC35675k0 enumC35675k0, int i13, int i14, Composer composer, int i15) {
        m113013m(textResource, textResource2, textResource3, enumC35673j0, textResource4, enumC35677l0, interfaceC39332e, textResource5, interfaceC39332e2, enumC35675k0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m113015o(TextResource textResource, InterfaceC39332e interfaceC39332e, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1433692770);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? 32 : 16;
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
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i14 & 14), null, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, i15), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH6(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3452j1(textResource, interfaceC39332e, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m113016p(TextResource textResource, InterfaceC39332e interfaceC39332e, int i13, Composer composer, int i14) {
        m113015o(textResource, interfaceC39332e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x016c  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:108:0x0243  */
    /* JADX WARN: Code duplicated, block: B:109:0x0247  */
    /* JADX WARN: Code duplicated, block: B:114:0x0262  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:122:0x0366  */
    /* JADX WARN: Code duplicated, block: B:123:0x037b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
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
    /* JADX INFO: renamed from: q */
    private static final void m113017q(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, Composer composer, int i13, int i14) {
        int i15;
        TextResource textResourceM21267a;
        InterfaceC39332e interfaceC39332e3;
        C28655q c28655q;
        C0209i c0209i;
        TextResource textResource6;
        C28655q c28655q2;
        C0209i c0209i2;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i3;
        C2314t c2314t;
        ?? r10;
        boolean z4;
        int iHashCode;
        C38072d c38072d;
        C28655q c28655q3;
        C2886a c2886aM8420a;
        C28655q c28655q4;
        InterfaceC39332e interfaceC39332e4;
        int i16;
        int i17;
        InterfaceC39332e interfaceC39332eM125323a = interfaceC39332e2;
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(353617731);
        if ((i13 & 6) == 0) {
            i15 = (c28655q5.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q5.m87153g(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q5.m87153g(textResource3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q5.m87153g(textResource4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q5.m87153g(interfaceC39332e) : c28655q5.m87157i(interfaceC39332e) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            if ((i14 & 32) == 0) {
                textResourceM21267a = textResource5;
                if (c28655q5.m87153g(textResourceM21267a)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i15 |= i17;
            } else {
                textResourceM21267a = textResource5;
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i15 |= i17;
        } else {
            textResourceM21267a = textResource5;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) != 0) {
                i16 = 524288;
            } else {
                if ((2097152 & i13) == 0 ? c28655q5.m87153g(interfaceC39332eM125323a) : c28655q5.m87157i(interfaceC39332eM125323a)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
            }
            i15 |= i16;
        }
        if (c28655q5.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            c28655q5.m87140Z();
            if ((i13 & 1) == 0 || c28655q5.m87118C()) {
                if ((i14 & 32) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    Object objM87133R = c28655q5.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = d.f151626w;
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                    i15 &= -3670017;
                }
            } else {
                c28655q5.m87138X();
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    i15 &= -3670017;
                }
            }
            int i18 = i15;
            InterfaceC39332e interfaceC39332e5 = interfaceC39332eM125323a;
            TextResource textResource7 = textResourceM21267a;
            c28655q5.m87175r();
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q5, 0);
            int iHashCode2 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, c2314t2);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a2);
            } else {
                c28655q5.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q5.f115903S) {
                c0209i = c0209i5;
            } else {
                c0209i = c0209i5;
                if (!AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i7, modifierM118962N);
                if (AbstractC8693b.m21270d(textResource)) {
                    c28655q5.m87150e0(1422965497);
                    String strM21274h = AbstractC8693b.m21274h(textResource, c28655q5, i18 & 14);
                    C38072d c38072d2 = C38072d.f163053a;
                    long white70 = c38072d2.m121949b(c28655q5, 6).getWhite70();
                    C36775k c36775k = new C36775k(1);
                    C2886a c2886aM8438s = c38072d2.m121952e(c28655q5, 6).getH5();
                    textResource6 = textResource7;
                    r10 = 1;
                    z4 = false;
                    c0209i3 = c0209i4;
                    c2314t = c2314t2;
                    interfaceC4339a = interfaceC4339a2;
                    c0209i2 = c0209i6;
                    AbstractC30795n.m94707h(strM21274h, null, white70, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q5, 0, 0, 196090);
                    c28655q2 = c28655q5;
                    c28655q2.m87173q(false);
                } else {
                    textResource6 = textResource7;
                    c28655q2 = c28655q5;
                    c0209i2 = c0209i6;
                    interfaceC4339a = interfaceC4339a2;
                    c0209i3 = c0209i4;
                    c2314t = c2314t2;
                    r10 = 1;
                    z4 = false;
                    c28655q2.m87150e0(1423196137);
                    c28655q2.m87173q(false);
                }
                float f13 = ((float) r10) * 4;
                C2314t c2314t3 = c2314t;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, 0.0f, f13, 7);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N2);
                String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q2, (i18 >> 3) & 14);
                int i19 = (i18 >> 12) & 14;
                long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, i19);
                c38072d = C38072d.f163053a;
                c28655q3 = c28655q2;
                AbstractC30795n.m94707h(strM21274h2, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN5(), null, c28655q3, 0, 0, 196602);
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f13, c2314t3));
                String strM21274h3 = AbstractC8693b.m21274h(textResource3, c28655q3, (i18 >> 6) & 14);
                long jMo134584toComposableColorWaAFU9c2 = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q3, i19);
                if (AbstractC22676k.m65745e(textResource3, AbstractC8693b.m21278l("%"))) {
                    c28655q3.m87150e0(22536613);
                    c2886aM8420a = c38072d.m121952e(c28655q3, 6).getN5();
                    c28655q3.m87173q(z4);
                } else {
                    c28655q3.m87150e0(22606053);
                    c2886aM8420a = c38072d.m121952e(c28655q3, 6).getB1();
                    c28655q3.m87173q(z4);
                }
                AbstractC30795n.m94707h(strM21274h3, null, jMo134584toComposableColorWaAFU9c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q3, 0, 0, 196602);
                c28655q3.m87173q(r10);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource4, c28655q3, (i18 >> 9) & 14), null, c38072d.m121949b(c28655q3, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(r10), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getH5(), null, c28655q3, 0, 0, 196090);
                c28655q4 = c28655q3;
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(f13, c2314t3));
                if (AbstractC8693b.m21270d(textResource6)) {
                    c28655q4.m87150e0(1424182960);
                    textResourceM21267a = textResource6;
                    interfaceC39332e4 = interfaceC39332e5;
                    m113015o(textResourceM21267a, interfaceC39332e4, c28655q4, (i18 >> 15) & 126);
                    c28655q4.m87173q(z4);
                } else {
                    textResourceM21267a = textResource6;
                    interfaceC39332e4 = interfaceC39332e5;
                    c28655q4.m87150e0(1424268489);
                    c28655q4.m87173q(z4);
                }
                c28655q4.m87173q(r10);
                interfaceC39332e3 = interfaceC39332e4;
                c28655q = c28655q4;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i6);
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i8, modifierM118962N);
            if (AbstractC8693b.m21270d(textResource)) {
                c28655q5.m87150e0(1422965497);
                String strM21274h4 = AbstractC8693b.m21274h(textResource, c28655q5, i18 & 14);
                C38072d c38072d3 = C38072d.f163053a;
                long white71 = c38072d3.m121949b(c28655q5, 6).getWhite70();
                C36775k c36775k2 = new C36775k(1);
                C2886a c2886aM8438s2 = c38072d3.m121952e(c28655q5, 6).getH5();
                textResource6 = textResource7;
                r10 = 1;
                z4 = false;
                c0209i3 = c0209i4;
                c2314t = c2314t2;
                interfaceC4339a = interfaceC4339a2;
                c0209i2 = c0209i6;
                AbstractC30795n.m94707h(strM21274h4, null, white71, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8438s2, null, c28655q5, 0, 0, 196090);
                c28655q2 = c28655q5;
                c28655q2.m87173q(false);
            } else {
                textResource6 = textResource7;
                c28655q2 = c28655q5;
                c0209i2 = c0209i6;
                interfaceC4339a = interfaceC4339a2;
                c0209i3 = c0209i4;
                c2314t = c2314t2;
                r10 = 1;
                z4 = false;
                c28655q2.m87150e0(1423196137);
                c28655q2.m87173q(false);
            }
            float f14 = ((float) r10) * 4;
            C2314t c2314t4 = c2314t;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, f14, 7);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i3, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N3);
            String strM21274h5 = AbstractC8693b.m21274h(textResource2, c28655q2, (i18 >> 3) & 14);
            int i110 = (i18 >> 12) & 14;
            long jMo134584toComposableColorWaAFU9c3 = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, i110);
            c38072d = C38072d.f163053a;
            c28655q3 = c28655q2;
            AbstractC30795n.m94707h(strM21274h5, null, jMo134584toComposableColorWaAFU9c3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN5(), null, c28655q3, 0, 0, 196602);
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(f14, c2314t4));
            String strM21274h6 = AbstractC8693b.m21274h(textResource3, c28655q3, (i18 >> 6) & 14);
            long jMo134584toComposableColorWaAFU9c4 = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q3, i110);
            if (AbstractC22676k.m65745e(textResource3, AbstractC8693b.m21278l("%"))) {
                c28655q3.m87150e0(22536613);
                c2886aM8420a = c38072d.m121952e(c28655q3, 6).getN5();
                c28655q3.m87173q(z4);
            } else {
                c28655q3.m87150e0(22606053);
                c2886aM8420a = c38072d.m121952e(c28655q3, 6).getB1();
                c28655q3.m87173q(z4);
            }
            AbstractC30795n.m94707h(strM21274h6, null, jMo134584toComposableColorWaAFU9c4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q3, 0, 0, 196602);
            c28655q3.m87173q(r10);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource4, c28655q3, (i18 >> 9) & 14), null, c38072d.m121949b(c28655q3, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(r10), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getH5(), null, c28655q3, 0, 0, 196090);
            c28655q4 = c28655q3;
            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(f14, c2314t4));
            if (AbstractC8693b.m21270d(textResource6)) {
                c28655q4.m87150e0(1424182960);
                textResourceM21267a = textResource6;
                interfaceC39332e4 = interfaceC39332e5;
                m113015o(textResourceM21267a, interfaceC39332e4, c28655q4, (i18 >> 15) & 126);
                c28655q4.m87173q(z4);
            } else {
                textResourceM21267a = textResource6;
                interfaceC39332e4 = interfaceC39332e5;
                c28655q4.m87150e0(1424268489);
                c28655q4.m87173q(z4);
            }
            c28655q4.m87173q(r10);
            interfaceC39332e3 = interfaceC39332e4;
            c28655q = c28655q4;
        } else {
            C28655q c28655q6 = c28655q5;
            c28655q6.m87138X();
            interfaceC39332e3 = interfaceC39332eM125323a;
            c28655q = c28655q6;
        }
        TextResource textResource8 = textResourceM21267a;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3449i1(textResource, textResource2, textResource3, textResource4, interfaceC39332e, textResource8, interfaceC39332e3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m113018r(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e, TextResource textResource5, InterfaceC39332e interfaceC39332e2, int i13, int i14, Composer composer, int i15) {
        m113017q(textResource, textResource2, textResource3, textResource4, interfaceC39332e, textResource5, interfaceC39332e2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
