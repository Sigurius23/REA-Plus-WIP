package ot2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.atomic.atom.TrendTypeEnum;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricDetail;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricTrendStyle;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21536b;
import jp2.C21881l;
import jt2.AbstractC21951m;
import jt2.C21942d;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mt2.AbstractC25946g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p730qt2.C30602h;
import p730qt2.C30607m;
import p730qt2.C30612r;
import p730qt2.C30616v;
import p736sz0.C33210q;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ot2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lot2/h;", "", "Lot2/s;", "sliderStatReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lot2/s;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Ljt2/m$i;", "domainState", "Ljt2/d;", "accumulator", "", "Lm91/u;", "e", "(Ljt2/m$i;Ljt2/d;)Ljava/util/List;", "d", "Lot2/r;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljt2/m$i;Ljt2/d;)Lot2/r;", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;", "Ly81/f;", "i", "(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;)Ly81/f;", "a", "Lot2/s;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28339h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28350s sliderStatReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: ot2.h$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f114295a;

        static {
            int[] iArr = new int[MetricTrendStyle.values().length];
            try {
                iArr[MetricTrendStyle.NEGATIVE_TREND_TARGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetricTrendStyle.POSITIVE_TREND_TARGET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MetricTrendStyle.NEUTRAL_TREND_TARGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MetricTrendStyle.NO_TREND_TARGET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f114295a = iArr;
        }
    }

    /* JADX INFO: renamed from: ot2.h$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ HorizontalStatModel f114296w;

        public b(HorizontalStatModel horizontalStatModel) {
            this.f114296w = horizontalStatModel;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            EnumC39333f enumC39333fM86027a;
            EnumC39333f enumC39333fM86027a2;
            AbstractC22676k.m65750j(it, "it");
            C33210q c33210q = (C33210q) it;
            TrendTypeEnum statTrendType = this.f114296w.getStatTrendType();
            if (statTrendType == null || (enumC39333fM86027a = AbstractC28354w.m86027a(statTrendType)) == null) {
                enumC39333fM86027a = EnumC39333f.BRAND_WHITE;
            }
            EnumC39333f enumC39333f = enumC39333fM86027a;
            TrendTypeEnum statTrendType2 = this.f114296w.getStatTrendType();
            if (statTrendType2 == null || (enumC39333fM86027a2 = AbstractC28354w.m86027a(statTrendType2)) == null) {
                enumC39333fM86027a2 = EnumC39333f.BRAND_WHITE;
            }
            return C33210q.m105317b(c33210q, null, null, null, null, null, null, null, false, enumC39333f, enumC39333fM86027a2, null, false, 3327, null);
        }
    }

    /* JADX INFO: renamed from: ot2.h$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21942d f114298x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC21951m.i f114299y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ MetricDetail f114300z;

        public c(C21942d c21942d, AbstractC21951m.i iVar, MetricDetail metricDetail) {
            this.f114298x = c21942d;
            this.f114299y = iVar;
            this.f114300z = metricDetail;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C33210q c33210q = (C33210q) it;
            TextResource textResourceM86018a = C28339h.this.sliderStatReducer.m86018a(this.f114298x, this.f114299y, this.f114300z);
            if (textResourceM86018a == null) {
                textResourceM86018a = c33210q.getStat();
            }
            return C33210q.m105317b(c33210q, new AbstractC25946g.g(this.f114300z.getGoalType()), textResourceM86018a, null, null, null, null, null, false, null, EnumC39333f.BRAND_WHITE, null, false, 3580, null);
        }
    }

    public C28339h(C28350s sliderStatReducer, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(sliderStatReducer, "sliderStatReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.sliderStatReducer = sliderStatReducer;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: d */
    private final List<InterfaceC25312u> m85915d(AbstractC21951m.i domainState, C21942d accumulator) {
        ArrayList arrayList;
        EnumC16313m0 enumC16313m0;
        List<MetricDetail> metricDetails = domainState.getResult().getMetricDetails();
        if (!(metricDetails instanceof Collection) || !metricDetails.isEmpty()) {
            Iterator<T> it = metricDetails.iterator();
            while (it.hasNext()) {
                if (!accumulator.m62553t().contains(Integer.valueOf(((MetricDetail) it.next()).getGoalTypeId()))) {
                    List<MetricDetail> metricDetails2 = domainState.getResult().getMetricDetails();
                    ArrayList<MetricDetail> arrayList2 = new ArrayList();
                    for (Object obj : metricDetails2) {
                        if (!accumulator.m62553t().contains(Integer.valueOf(((MetricDetail) obj).getGoalTypeId()))) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                    for (MetricDetail metricDetail : arrayList2) {
                        Integer numValueOf = Integer.valueOf(metricDetail.getGoalTypeId());
                        String leftIcon = metricDetail.getMetricCard().getLeftIcon();
                        EnumC16313m0 enumC16313m1 = EnumC16313m0.ACTIVITY;
                        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                        int length = enumC16313m0ArrValues.length;
                        int i13 = 0;
                        while (true) {
                            arrayList = null;
                            if (i13 >= length) {
                                enumC16313m0 = null;
                                break;
                            }
                            enumC16313m0 = enumC16313m0ArrValues[i13];
                            if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                                break;
                            }
                            i13++;
                        }
                        EnumC16313m0 enumC16313m2 = enumC16313m0 == null ? enumC16313m1 : enumC16313m0;
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(metricDetail.getMetricPlanTile().getTitle());
                        TextResource textResourceM21267a = AbstractC8693b.m21267a();
                        List<MetricTrendStyle> barStyles = metricDetail.getMetricCard().getBarStyles();
                        if (barStyles != null) {
                            List<MetricTrendStyle> list = barStyles;
                            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                            Iterator<T> it3 = list.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(m85920i((MetricTrendStyle) it3.next()));
                            }
                        }
                        arrayList3.add(new C30616v(numValueOf, enumC16313m2, textResourceM21278l, textResourceM21267a, null, arrayList, AbstractC8693b.m21278l(metricDetail.getMetricPlanTile().getMetricValue().getMetricValue()), m85920i(metricDetail.getMetricPlanTile().getMetricValue().getMetricValueStyle()), EnumC16313m0.ADD, null, 512, null));
                    }
                    return arrayList3;
                }
            }
        }
        return AbstractC37056f.m118958J(new C30602h(AbstractC8693b.m21278l(domainState.getResult().getMetricScreen().getUnselectedEmptyState())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6, types: [gz0.m0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [gz0.m0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: e */
    private final List<InterfaceC25312u> m85916e(AbstractC21951m.i domainState, C21942d accumulator) {
        List listM118958J;
        Object c30612r;
        Object next;
        ?? arrayList;
        EnumC16313m0 enumC16313m0;
        EnumC39333f enumC39333f;
        C30607m c30607m = new C30607m(AbstractC8693b.m21278l(domainState.getResult().getMetricScreen().getSelectedHeader()), AbstractC8693b.m21278l("(" + accumulator.m62553t().size() + ")"), null, null, null);
        if (accumulator.m62553t().isEmpty()) {
            listM118958J = AbstractC37056f.m118958J(new C30602h(AbstractC8693b.m21278l(domainState.getResult().getMetricScreen().getSelectedEmptyState())));
        } else {
            List<Integer> listM62553t = accumulator.m62553t();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM62553t, 10));
            Iterator it = listM62553t.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Iterator it3 = domainState.getResult().getMetricDetails().iterator();
                do {
                    c30612r = null;
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((MetricDetail) next).getGoalTypeId() != iIntValue);
                MetricDetail metricDetail = (MetricDetail) next;
                if (metricDetail != null) {
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(metricDetail.getMetricCard().getTitle());
                    int goalTypeId = metricDetail.getGoalTypeId();
                    HorizontalStatModel horizontalStatAvg = metricDetail.getMetricCard().getHorizontalStatAvg();
                    InterfaceC25312u interfaceC25312uM60541h = AbstractC21537c.m60554d(new C28337f(horizontalStatAvg, 1)).m60541h(horizontalStatAvg);
                    AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.HorizontalStatState");
                    C33210q c33210q = (C33210q) interfaceC25312uM60541h;
                    InterfaceC25312u interfaceC25312uM60541h2 = AbstractC21537c.m60554d(new C21881l(this, accumulator, domainState, metricDetail, 19)).m60541h(metricDetail.getMetricCard().getHorizontalStatGoal());
                    AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.HorizontalStatState");
                    C33210q c33210q2 = (C33210q) interfaceC25312uM60541h2;
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(metricDetail.getMetricCard().getRecommendationText());
                    List<MetricTrendStyle> barStyles = metricDetail.getMetricCard().getBarStyles();
                    if (barStyles != null) {
                        List<MetricTrendStyle> list = barStyles;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            int i13 = a.f114295a[((MetricTrendStyle) it4.next()).ordinal()];
                            if (i13 == 1) {
                                enumC39333f = EnumC39333f.ACCENT_NEGATIVE_TREND;
                            } else if (i13 == 2) {
                                enumC39333f = EnumC39333f.ACCENT_ACTION;
                            } else if (i13 == 3) {
                                enumC39333f = EnumC39333f.WHITE_50;
                            } else {
                                if (i13 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                enumC39333f = EnumC39333f.WHITE_10;
                            }
                            arrayList.add(enumC39333f);
                        }
                    } else {
                        arrayList = C25271y.f99162w;
                    }
                    ?? r17 = arrayList;
                    String leftIcon = metricDetail.getMetricCard().getLeftIcon();
                    EnumC16313m0 enumC16313m1 = EnumC16313m0.ACTIVITY;
                    EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                    int length = enumC16313m0ArrValues.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            enumC16313m0 = null;
                            break;
                        }
                        enumC16313m0 = enumC16313m0ArrValues[i14];
                        if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                            break;
                        }
                        i14++;
                    }
                    if (enumC16313m0 != null) {
                        enumC16313m1 = enumC16313m0;
                    }
                    int whoopIcon = enumC16313m1.toWhoopIcon();
                    String rightIcon = metricDetail.getMetricCard().getRightIcon();
                    if (rightIcon != null) {
                        ?? r10 = EnumC16313m0.ACTIVITY;
                        for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                            if (AbstractC22676k.m65745e(enumC16313m2.name(), rightIcon)) {
                                c30612r = enumC16313m2;
                                break;
                            }
                        }
                        if (c30612r != null) {
                            r10 = c30612r;
                        }
                        c30612r = Integer.valueOf(r10.toWhoopIcon());
                    }
                    c30612r = new C30612r(textResourceM21278l, Integer.valueOf(whoopIcon), c30612r, r17, goalTypeId, c33210q, c33210q2, textResourceM21278l2);
                }
                arrayList2.add(c30612r);
            }
            listM118958J = arrayList2;
        }
        return AbstractC25265s.m74129g1(AbstractC37056f.m118958J(c30607m), AbstractC25265s.m74092D0(listM118958J));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m85917f(HorizontalStatModel horizontalStatModel, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33210q.class), new b(horizontalStatModel));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m85918g(C28339h c28339h, C21942d c21942d, AbstractC21951m.i iVar, MetricDetail metricDetail, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33210q.class), c28339h.new c(c21942d, iVar, metricDetail));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public final C28349r m85919h(AbstractC21951m.i domainState, C21942d accumulator) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(accumulator, "accumulator");
        HubAndSpokeResponse hubAndSpokeResponseM62640b = domainState.getResult();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(hubAndSpokeResponseM62640b.getMetricScreen().getNavigationTitleDisplay());
        String headerDisplay = hubAndSpokeResponseM62640b.getMetricScreen().getHeaderDisplay();
        TextResource textResourceM21278l2 = headerDisplay != null ? AbstractC8693b.m21278l(headerDisplay) : null;
        String subtitle = hubAndSpokeResponseM62640b.getMetricScreen().getSubtitle();
        TextResource textResourceM21278l3 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        List<InterfaceC25312u> listM85916e = m85916e(domainState, accumulator);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(hubAndSpokeResponseM62640b.getMetricScreen().getUnselectedHeader());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(hubAndSpokeResponseM62640b.getMetricScreen().getTimeRange());
        List<String> legend = hubAndSpokeResponseM62640b.getMetricScreen().getLegend();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(legend, 10));
        int i13 = 0;
        for (Object obj : legend) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new C28348q(AbstractC8693b.m21278l((String) obj), i13 != 0 ? i13 != 1 ? EnumC39333f.ACCENT_POSITIVE_TREND : EnumC39333f.WHITE_50 : EnumC39333f.ACCENT_NEGATIVE_TREND));
            i13 = i14;
        }
        return new C28349r(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, listM85916e, textResourceM21278l4, textResourceM21278l5, arrayList, m85915d(domainState, accumulator), AbstractC8693b.m21278l(hubAndSpokeResponseM62640b.getMetricScreen().getButtonText()), (AbstractC22676k.m65745e(accumulator.m62553t(), accumulator.m62538e()) && AbstractC22676k.m65745e(accumulator.m62545l(), accumulator.m62551r())) ? false : true);
    }

    /* JADX INFO: renamed from: i */
    public final EnumC39333f m85920i(MetricTrendStyle metricTrendStyle) {
        AbstractC22676k.m65750j(metricTrendStyle, "<this>");
        int i13 = a.f114295a[metricTrendStyle.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.ACCENT_NEGATIVE_TREND;
        }
        if (i13 == 2) {
            return EnumC39333f.ACCENT_ACTION;
        }
        if (i13 == 3) {
            return EnumC39333f.WHITE_50;
        }
        if (i13 == 4) {
            return EnumC39333f.WHITE_10;
        }
        throw new NoWhenBranchMatchedException();
    }
}
