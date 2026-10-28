package yb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.graph.plot.band.BandPlotStyle;
import i91.AbstractC18249c;
import k61.C22228a;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import wb3.AbstractC37056f;
import y41.C39211b;

/* JADX INFO: renamed from: yb1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;", "style", "Lk61/a;", "k", "(Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Lk61/a;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39390b {

    /* JADX INFO: renamed from: yb1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f169489a;

        static {
            int[] iArr = new int[BandPlotStyle.values().length];
            try {
                iArr[BandPlotStyle.ACCENT_NEGATIVE_10_FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BandPlotStyle.ACCENT_POSITIVE_10_FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BandPlotStyle.NEUTRAL_10_FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BandPlotStyle.ACCENT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BandPlotStyle.ACCENT_POSITIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BandPlotStyle.NEUTRAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BandPlotStyle.SUFFICIENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BandPlotStyle.SUFFICIENT_10_FADE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BandPlotStyle.SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BandPlotStyle.LIGHT_SLEEP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BandPlotStyle.REM_SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BandPlotStyle.MODERATE_HR_ZONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BandPlotStyle.WHITE_10.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BandPlotStyle.FIRST_TRIMESTER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BandPlotStyle.SECOND_TRIMESTER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BandPlotStyle.THIRD_TRIMESTER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BandPlotStyle.POST_PARTUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BandPlotStyle.SAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BandPlotStyle.SAGE_IMPACTS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BandPlotStyle.SAGE_IMPACTS_HIGHLIGHTED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BandPlotStyle.RECOVERY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BandPlotStyle.PREGNANCY.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BandPlotStyle.STRAIN.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BandPlotStyle.STRESS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BandPlotStyle.UNKNOWN.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            f169489a = iArr;
        }
    }

    /* JADX INFO: renamed from: yb1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f169490w = new b();

        /* JADX INFO: renamed from: a */
        public final long m125788a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125788a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f169491w = new c();

        /* JADX INFO: renamed from: a */
        public final long m125789a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125789a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f169492w = new d();

        /* JADX INFO: renamed from: a */
        public final long m125790a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125790a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f169493w = new e();

        /* JADX INFO: renamed from: a */
        public final long m125791a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSufficientTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125791a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f169494w = new f();

        /* JADX INFO: renamed from: a */
        public final long m125792a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSufficientTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125792a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f169495w = new g();

        /* JADX INFO: renamed from: a */
        public final long m125793a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.3f, colorBackground.getSleepLightSleep());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125793a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f169496w = new h();

        /* JADX INFO: renamed from: a */
        public final long m125794a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.3f, colorBackground.getSleepRemSleep());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125794a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f169497w = new i();

        /* JADX INFO: renamed from: a */
        public final long m125795a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.3f, colorBackground.getStrainZone3());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125795a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f169498w = new j();

        /* JADX INFO: renamed from: a */
        public final long m125796a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125796a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f169499w = new k();

        /* JADX INFO: renamed from: a */
        public final long m125797a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.2f, colorBackground.getSleepLightSleep());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125797a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f169500w = new l();

        /* JADX INFO: renamed from: a */
        public final long m125798a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.2f, colorBackground.getSleepRemSleep());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125798a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f169501w = new m();

        /* JADX INFO: renamed from: a */
        public final long m125799a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.2f, colorBackground.getStrainZone3());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125799a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f169502w = new n();

        /* JADX INFO: renamed from: a */
        public final long m125800a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.2f, colorBackground.getRecovery());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125800a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f169503w = new o();

        /* JADX INFO: renamed from: a */
        public final long m125801a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125801a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f169504w = new p();

        /* JADX INFO: renamed from: a */
        public final long m125802a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125802a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f169505w = new q();

        /* JADX INFO: renamed from: a */
        public final long m125803a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125803a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f169506w = new r();

        /* JADX INFO: renamed from: a */
        public final long m125804a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125804a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final s f169507w = new s();

        /* JADX INFO: renamed from: a */
        public final long m125805a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125805a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yb1.b$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final t f169508w = new t();

        /* JADX INFO: renamed from: a */
        public final long m125806a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m125806a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final C22228a m125777k(BandPlotStyle style) {
        AbstractC22676k.m65750j(style, "style");
        switch (a.f169489a[style.ordinal()]) {
            case 1:
                return new C22228a(AbstractC18249c.m52572j(new C39211b(25)), AbstractC18249c.m52572j(new C39211b(26)));
            case 2:
                return new C22228a(AbstractC18249c.m52572j(new C39211b(27)), AbstractC18249c.m52572j(new C39211b(28)));
            case 3:
                return new C22228a(AbstractC18249c.m52572j(new C39211b(29)), AbstractC18249c.m52572j(new C39389a(0)));
            case 4:
                return new C22228a(AbstractC18249c.m52574l(r.f169506w), AbstractC18249c.m52574l(s.f169507w));
            case 5:
                return new C22228a(AbstractC18249c.m52574l(t.f169508w), AbstractC18249c.m52574l(b.f169490w));
            case 6:
                return new C22228a(AbstractC18249c.m52574l(c.f169491w), AbstractC18249c.m52574l(d.f169492w));
            case 7:
                return new C22228a(AbstractC18249c.m52574l(e.f169493w), AbstractC18249c.m52574l(f.f169494w));
            case 8:
                return new C22228a(AbstractC18249c.m52572j(new C39389a(1)), AbstractC18249c.m52572j(new C39389a(2)));
            case 9:
                return new C22228a(AbstractC18249c.m52572j(new C39389a(3)), AbstractC18249c.m52572j(new C39389a(4)));
            case 10:
                return new C22228a(AbstractC18249c.m52574l(g.f169495w), null, 2, null);
            case 11:
                return new C22228a(AbstractC18249c.m52574l(h.f169496w), null, 2, null);
            case 12:
                return new C22228a(AbstractC18249c.m52574l(i.f169497w), null, 2, null);
            case 13:
                return new C22228a(AbstractC18249c.m52574l(j.f169498w), null, 2, null);
            case 14:
                return new C22228a(AbstractC18249c.m52574l(k.f169499w), null, 2, null);
            case 15:
                return new C22228a(AbstractC18249c.m52574l(l.f169500w), null, 2, null);
            case 16:
                return new C22228a(AbstractC18249c.m52574l(m.f169501w), null, 2, null);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C22228a(AbstractC18249c.m52574l(n.f169502w), null, 2, null);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C22228a(AbstractC18249c.m52574l(o.f169503w), null, 2, null);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C22228a(AbstractC18249c.m52574l(p.f169504w), null, 2, null);
            case 20:
                return new C22228a(AbstractC18249c.m52574l(q.f169505w), null, 2, null);
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final AbstractC17911t m125778l(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, brushBackground.getAccentNegativeTrend())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final AbstractC17911t m125779m(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, brushBackground.getAccentNegativeTrend())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final AbstractC17911t m125780n(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, brushBackground.getAccentPositiveTrend())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final AbstractC17911t m125781o(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, brushBackground.getAccentPositiveTrend())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final AbstractC17911t m125782p(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, brushBackground.getWhite50())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final AbstractC17911t m125783q(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, brushBackground.getWhite50())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final AbstractC17911t m125784r(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, brushBackground.getSufficientTrend())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final AbstractC17911t m125785s(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, brushBackground.getSufficientTrend())), new C17919x(brushBackground.getTransparent())), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final AbstractC17911t m125786t(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String())), new C17919x(C17919x.m51541c(0.2f, brushBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()))), 0L, 0L, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final AbstractC17911t m125787u(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.2f, brushBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String())), new C17919x(C17919x.m51541c(0.2f, brushBackground.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()))), 0L, 0L, 14);
    }
}
