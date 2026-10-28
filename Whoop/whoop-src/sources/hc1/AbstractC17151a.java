package hc1;

import com.whoop.design.models.items.graph.plot.trend.TrendPlotStyle;
import com.whoop.design.models.items.graph.plot.trend.TrendSegmentStyle;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: hc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;", "segmentStyle", "Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;", "plotStyle", "", "isTopLabel", "isBottomLabel", "Ly81/e;", "a", "(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;ZZ)Ly81/e;", "c", "(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Z)Ly81/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17151a {

    /* JADX INFO: renamed from: hc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65836a;

        static {
            int[] iArr = new int[TrendSegmentStyle.values().length];
            try {
                iArr[TrendSegmentStyle.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrendSegmentStyle.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrendSegmentStyle.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrendSegmentStyle.LOW_STRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TrendSegmentStyle.MEDIUM_STRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TrendSegmentStyle.HIGH_STRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TrendSegmentStyle.BODY_COMPOSITION_FAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TrendSegmentStyle.BODY_COMPOSITION_LEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f65836a = iArr;
        }
    }

    /* JADX INFO: renamed from: hc1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f65837w = new b();

        /* JADX INFO: renamed from: a */
        public final long m48389a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48389a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f65838w = new c();

        /* JADX INFO: renamed from: a */
        public final long m48390a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48390a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f65839w = new d();

        /* JADX INFO: renamed from: a */
        public final long m48391a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48391a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f65840w = new e();

        /* JADX INFO: renamed from: a */
        public final long m48392a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48392a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f65841w = new f();

        /* JADX INFO: renamed from: a */
        public final long m48393a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48393a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f65842w = new g();

        /* JADX INFO: renamed from: a */
        public final long m48394a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48394a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f65843w = new h();

        /* JADX INFO: renamed from: a */
        public final long m48395a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48395a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f65844w = new i();

        /* JADX INFO: renamed from: a */
        public final long m48396a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleepLightSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48396a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f65845w = new j();

        /* JADX INFO: renamed from: a */
        public final long m48397a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48397a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f65846w = new k();

        /* JADX INFO: renamed from: a */
        public final long m48398a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48398a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f65847w = new l();

        /* JADX INFO: renamed from: a */
        public final long m48399a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48399a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f65848w = new m();

        /* JADX INFO: renamed from: a */
        public final long m48400a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48400a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f65849w = new n();

        /* JADX INFO: renamed from: a */
        public final long m48401a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48401a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f65850w = new o();

        /* JADX INFO: renamed from: a */
        public final long m48402a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48402a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f65851w = new p();

        /* JADX INFO: renamed from: a */
        public final long m48403a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48403a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hc1.a$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f65852w = new q();

        /* JADX INFO: renamed from: a */
        public final long m48404a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m48404a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39332e m48386a(TrendSegmentStyle segmentStyle, TrendPlotStyle plotStyle, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(segmentStyle, "segmentStyle");
        AbstractC22676k.m65750j(plotStyle, "plotStyle");
        if (plotStyle == TrendPlotStyle.SLEEP) {
            return p745y81.Function1.m125323a(b.f65837w);
        }
        if (plotStyle == TrendPlotStyle.SLEEP_NEED) {
            return p745y81.Function1.m125323a(c.f65838w);
        }
        if (segmentStyle == TrendSegmentStyle.SLEEP_HOURS) {
            return p745y81.Function1.m125323a(d.f65839w);
        }
        if (segmentStyle == TrendSegmentStyle.SLEEP_NEED) {
            return p745y81.Function1.m125323a(e.f65840w);
        }
        return z4 ? p745y81.Function1.m125323a(f.f65841w) : m48388c(segmentStyle, z13);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC39332e m48387b(TrendSegmentStyle trendSegmentStyle, TrendPlotStyle trendPlotStyle, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        return m48386a(trendSegmentStyle, trendPlotStyle, z4, z13);
    }

    /* JADX INFO: renamed from: c */
    private static final InterfaceC39332e m48388c(TrendSegmentStyle trendSegmentStyle, boolean z4) {
        if (trendSegmentStyle == TrendSegmentStyle.SLEEP_HOURS || trendSegmentStyle == TrendSegmentStyle.SLEEP_NEED) {
            throw new IllegalArgumentException("SLEEP_HOURS/SLEEP_NEED handled in getTrendPlotColor");
        }
        switch (a.f65836a[trendSegmentStyle.ordinal()]) {
            case 1:
                return p745y81.Function1.m125323a(j.f65845w);
            case 2:
                return p745y81.Function1.m125323a(k.f65846w);
            case 3:
                return p745y81.Function1.m125323a(l.f65847w);
            case 4:
                return z4 ? p745y81.Function1.m125323a(m.f65848w) : p745y81.Function1.m125323a(n.f65849w);
            case 5:
                return z4 ? p745y81.Function1.m125323a(o.f65850w) : p745y81.Function1.m125323a(p.f65851w);
            case 6:
                return z4 ? p745y81.Function1.m125323a(q.f65852w) : p745y81.Function1.m125323a(g.f65842w);
            case 7:
                return p745y81.Function1.m125323a(h.f65843w);
            case 8:
                return p745y81.Function1.m125323a(i.f65844w);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
