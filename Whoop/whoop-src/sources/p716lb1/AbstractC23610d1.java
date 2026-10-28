package p716lb1;

import b91.AbstractC2890e;
import com.whoop.design.models.BarsModel;
import com.whoop.design.models.ComparisonBarsGraphModel;
import com.whoop.design.models.ComparisonBarsGraphType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.LegendEntryModel;
import com.whoop.design.models.SegmentModel;
import com.whoop.design.models.TrendStateEnum;
import com.whoop.design.models.items.ArrowStatModel;
import com.whoop.design.models.items.DetailsMetricTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import ly0.C24802f;
import m83.AbstractC25267u;
import m83.C25271y;
import n21.C26191e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import ty0.C34255c;
import y11.C39051d;
import y11.C39053f;
import y11.C39066s;

/* JADX INFO: renamed from: lb1.d1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "k", "()Llb1/y0;", "detailsGraphMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23610d1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93712a = Function1.m68251a(new C23644i0(25));

    /* JADX INFO: renamed from: lb1.d1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93713w;

        public a(Function1 function1) {
            this.f93713w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93713w.invoke((ArrowStatModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.d1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93714w;

        public b(Function1 function1) {
            this.f93714w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93714w.invoke((ComparisonBarsGraphModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.d1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93715w;

        public c(Function1 function1) {
            this.f93715w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93715w.invoke((DetailsMetricTileModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.d1$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C24802f.m72702b((C24802f) it, null, null, null, AbstractC2890e.m8450e().getN6(), false, 23, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m68632f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23644i0 c23644i0 = new C23644i0(26);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArrowStatModel.class), new a(c23644i0));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ComparisonBarsGraphModel.class), new b(new C23644i0(27)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(DetailsMetricTileModel.class), new c(new C23644i0(28)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C24802f m68633g(ArrowStatModel model) {
        TrendStateEnum trendStateEnum;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getCurrentStatText());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getHistoricStatText());
        String trendState = model.getTrendState();
        TrendStateEnum trendStateEnum2 = TrendStateEnum.UNKNOWN;
        TrendStateEnum[] trendStateEnumArrValues = TrendStateEnum.values();
        int length = trendStateEnumArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                trendStateEnum = null;
                break;
            }
            trendStateEnum = trendStateEnumArrValues[i13];
            if (AbstractC22676k.m65745e(trendStateEnum.name(), trendState)) {
                break;
            }
            i13++;
        }
        if (trendStateEnum != null) {
            trendStateEnum2 = trendStateEnum;
        }
        return new C24802f(textResourceM21278l, textResourceM21278l2, AbstractC23682o.m69171a(trendStateEnum2), null, !AbstractC22676k.m65745e(model.getHistoricStatAlignment(), "LEFT"), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: h */
    public static final C39051d m68634h(ComparisonBarsGraphModel model) {
        ComparisonBarsGraphType comparisonBarsGraphType;
        ?? arrayList;
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(model, "model");
        String graphType = model.getGraphType();
        ComparisonBarsGraphType comparisonBarsGraphType2 = ComparisonBarsGraphType.OPPOSITE;
        ComparisonBarsGraphType[] comparisonBarsGraphTypeArrValues = ComparisonBarsGraphType.values();
        int length = comparisonBarsGraphTypeArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                comparisonBarsGraphType = null;
                break;
            }
            comparisonBarsGraphType = comparisonBarsGraphTypeArrValues[i13];
            if (AbstractC22676k.m65745e(comparisonBarsGraphType.name(), graphType)) {
                break;
            }
            i13++;
        }
        if (comparisonBarsGraphType != null) {
            comparisonBarsGraphType2 = comparisonBarsGraphType;
        }
        boolean z4 = comparisonBarsGraphType2 == ComparisonBarsGraphType.GRADIENT;
        List<BarsModel> bars = model.getBars();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(bars, 10));
        for (BarsModel barsModel : bars) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(barsModel.getTitleDisplay());
            boolean zIsTitleOnTop = barsModel.isTitleOnTop();
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(barsModel.getValueDisplay());
            List<SegmentModel> segments = barsModel.getSegments();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(segments, 10));
            Iterator it = segments.iterator();
            while (it.hasNext()) {
                arrayList3.add(AbstractC23683o0.m69173a((SegmentModel) it.next()));
            }
            arrayList2.add(new C39053f(textResourceM21278l, zIsTitleOnTop, textResourceM21278l2, arrayList3));
        }
        List<LegendEntryModel> legendEntries = model.getLegendEntries();
        if (legendEntries != null) {
            List<LegendEntryModel> list = legendEntries;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (LegendEntryModel legendEntryModel : list) {
                C26191e c26191eM69290d = AbstractC23697q2.m69290d(legendEntryModel.getStyle(), legendEntryModel.getLegendDisplay(), false);
                String statDisplay = legendEntryModel.getStatDisplay();
                if (statDisplay == null || (textResourceM21267a = AbstractC8693b.m21278l(statDisplay)) == null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                arrayList.add(new C39066s(c26191eM69290d, textResourceM21267a));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return new C39051d(z4, arrayList2, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C34255c m68635i(DetailsMetricTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23670m(13));
        C26191e c26191eM69291e = AbstractC23697q2.m69291e(model.getStyle(), model.getTitle(), false, 4, null);
        List<ArrowStatModel> arrowStat = model.getArrowStat();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrowStat, 10));
        Iterator<T> it = arrowStat.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h = c21535aM60554d.m60541h((ArrowStatModel) it.next());
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.arrowStat.ArrowStatState");
            arrayList.add((C24802f) interfaceC25312uM60541h);
        }
        return new C34255c(c26191eM69291e, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m68636j(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24802f.class), new d());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final C23743y0 m68637k() {
        return f93712a;
    }
}
