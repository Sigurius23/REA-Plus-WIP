package p716lb1;

import b91.EnumC2888c;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15693u;
import i91.AbstractC18249c;
import java.util.List;
import l83.C23465k;
import n21.C26191e;
import n21.EnumC26195i;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lb1.q2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "legendStyle", "legendText", "", "isCapitalized", "Ln21/e;", "d", "(Ljava/lang/String;Ljava/lang/String;Z)Ln21/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23697q2 {

    /* JADX INFO: renamed from: lb1.q2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93922a;

        static {
            int[] iArr = new int[LegendStyle.values().length];
            try {
                iArr[LegendStyle.ASLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegendStyle.AWAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegendStyle.HEALTHY_MIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LegendStyle.NEUTRAL_TREND_TARGET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LegendStyle.NEGATIVE_TREND_TARGET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LegendStyle.NO_TREND_TARGET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LegendStyle.POSITIVE_TREND_TARGET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LegendStyle.RECENT_STRAIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LegendStyle.RESTORATIVE_SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LegendStyle.SLEEP_CONSISTENCY_BEDTIME_WAKETIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LegendStyle.STRIPES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LegendStyle.EMPTY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f93922a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.q2$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f93923w = new b();

        /* JADX INFO: renamed from: a */
        public final long m69295a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69295a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.q2$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f93924w = new c();

        /* JADX INFO: renamed from: a */
        public final long m69296a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69296a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.q2$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f93925w = new d();

        /* JADX INFO: renamed from: a */
        public final long m69297a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepAwake();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69297a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.q2$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f93926w = new e();

        /* JADX INFO: renamed from: a */
        public final long m69298a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69298a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.q2$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f93927w = new f();

        /* JADX INFO: renamed from: a */
        public final long m69299a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69299a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.q2$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f93928w = new g();

        /* JADX INFO: renamed from: a */
        public final long m69300a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69300a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.q2$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f93929w = new h();

        /* JADX INFO: renamed from: a */
        public final long m69301a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69301a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.q2$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f93930w = new i();

        /* JADX INFO: renamed from: a */
        public final long m69302a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69302a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.q2$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f93931w = new j();

        /* JADX INFO: renamed from: a */
        public final long m69303a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69303a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C26191e m69290d(String legendStyle, String legendText, boolean z4) {
        LegendStyle legendStyle2;
        AbstractC22676k.m65750j(legendStyle, "legendStyle");
        AbstractC22676k.m65750j(legendText, "legendText");
        LegendStyle legendStyle3 = LegendStyle.STRIPES;
        LegendStyle[] legendStyleArrValues = LegendStyle.values();
        int length = legendStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                legendStyle2 = null;
                break;
            }
            legendStyle2 = legendStyleArrValues[i13];
            if (AbstractC22676k.m65745e(legendStyle2.name(), legendStyle)) {
                break;
            }
            i13++;
        }
        if (legendStyle2 != null) {
            legendStyle3 = legendStyle2;
        }
        switch (a.f93922a[legendStyle3.ordinal()]) {
            case 1:
                return new C26191e(null, AbstractC18249c.m52574l(c.f93924w), AbstractC8693b.m21278l(legendText), EnumC26195i.SQUARE, null, null, null, null, 241, null);
            case 2:
                return new C26191e(null, AbstractC18249c.m52574l(d.f93925w), AbstractC8693b.m21278l(legendText), EnumC26195i.SQUARE_WITH_CORNERS, null, EnumC39333f.BRAND_WHITE, null, z4 ? EnumC2888c.H5 : EnumC2888c.B2, 81, null);
            case 3:
                TextResource textResourceM21278l = AbstractC8693b.m21278l(legendText);
                return new C26191e(null, AbstractC18249c.m52574l(e.f93926w), textResourceM21278l, EnumC26195i.SQUARE_WITH_CORNERS, null, EnumC39333f.WHITE_70, null, z4 ? EnumC2888c.H5 : EnumC2888c.B2, 81, null);
            case 4:
                return new C26191e(null, AbstractC18249c.m52574l(f.f93927w), AbstractC8693b.m21278l(legendText), EnumC26195i.CAPSULE, null, null, null, EnumC2888c.B3, 113, null);
            case 5:
                return new C26191e(null, AbstractC18249c.m52574l(g.f93928w), AbstractC8693b.m21278l(legendText), EnumC26195i.CAPSULE, null, null, null, EnumC2888c.B3, 113, null);
            case 6:
                return new C26191e(null, AbstractC18249c.m52574l(h.f93929w), AbstractC8693b.m21278l(legendText), EnumC26195i.CAPSULE, null, null, null, EnumC2888c.B3, 113, null);
            case 7:
                return new C26191e(null, AbstractC18249c.m52574l(i.f93930w), AbstractC8693b.m21278l(legendText), EnumC26195i.CAPSULE, null, null, null, EnumC2888c.B3, 113, null);
            case 8:
                return new C26191e(null, AbstractC18249c.m52574l(j.f93931w), AbstractC8693b.m21278l(legendText), EnumC26195i.SQUARE_WITH_CORNERS, null, EnumC39333f.BRAND_WHITE, null, z4 ? EnumC2888c.H5 : EnumC2888c.B2, 81, null);
            case 9:
                return new C26191e(null, AbstractC18249c.m52572j(new C23670m(26)), AbstractC8693b.m21278l(legendText), EnumC26195i.SQUARE_WITH_CORNERS, null, EnumC39333f.BRAND_WHITE, null, null, 209, null);
            case 10:
                return new C26191e(null, AbstractC18249c.m52572j(new C23670m(27)), AbstractC8693b.m21278l(legendText), EnumC26195i.DASHED_LINE, null, EnumC39333f.WHITE_70, null, z4 ? EnumC2888c.H5 : EnumC2888c.B3, 81, null);
            case 11:
                return new C26191e(null, AbstractC18249c.m52572j(new C23670m(28)), AbstractC8693b.m21278l(legendText), EnumC26195i.SQUARE_WITH_CORNERS, null, EnumC39333f.BRAND_WHITE, null, z4 ? EnumC2888c.H5 : EnumC2888c.B2, 81, null);
            case 12:
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(legendText);
                return new C26191e(null, AbstractC18249c.m52574l(b.f93923w), textResourceM21278l2, EnumC26195i.SQUARE_WITH_CORNERS, null, EnumC39333f.WHITE_70, null, z4 ? EnumC2888c.H5 : EnumC2888c.B2, 81, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C26191e m69291e(String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        return m69290d(str, str2, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final AbstractC17911t m69292f(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k c23465k = new C23465k(Float.valueOf(0.0f), new C17919x(brushBackground.getSleepDeepSleep()));
        Float fValueOf = Float.valueOf(0.5f);
        return AbstractC15693u.m44157d(c17909s, new C23465k[]{c23465k, new C23465k(fValueOf, new C17919x(brushBackground.getSleepDeepSleep())), new C23465k(fValueOf, new C17919x(brushBackground.getSleepRemSleep())), new C23465k(Float.valueOf(1.0f), new C17919x(brushBackground.getSleepRemSleep()))}, 0, 315.0f, false, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final AbstractC17911t m69293g(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4290363305L))), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4291224543L))), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4292462262L))), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4289964224L)))), 0L, 0L, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final AbstractC17911t m69294h(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        List listM118959K = AbstractC37056f.m118959K(new C17919x(brushBackground.getWhite10()), new C17919x(brushBackground.getTransparent()));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(5.0f);
        long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(5.0f)) & 4294967295L;
        c17909s.getClass();
        return new C17894k0(listM118959K, null, jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), 1);
    }
}
