package vl2;

import c93.InterfaceC4352n;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.trends.data.model.CardioFitnessLevelModel;
import com.whoop.trends.data.model.IntegrationsUpsellDtoV3;
import com.whoop.trends.data.model.ManualMeasurementModelV2;
import com.whoop.trends.data.model.ManualMeasurementSheet;
import com.whoop.trends.data.model.Measurement;
import com.whoop.trends.data.model.MeasurementContent;
import com.whoop.trends.data.model.MeasurementRecord;
import com.whoop.trends.data.model.MeasurementSections;
import com.whoop.trends.data.model.MetricEducationV3;
import com.whoop.trends.data.model.NavigationSectionV3;
import com.whoop.trends.data.model.Record;
import com.whoop.trends.data.model.RecordedData;
import com.whoop.trends.data.model.SegmentControllerDtoV3;
import com.whoop.trends.data.model.TimeSegmentDtoV3;
import com.whoop.trends.data.model.TrendMenuItemModel;
import com.whoop.trends.data.model.TrendMenuSheet;
import com.whoop.trends.data.model.TrendsMenuItemDtoV3;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import or2.EnumC28166h0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: vl2.v */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d¢\u0006\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lvl2/v;", "", "<init>", "()V", "Lcom/whoop/trends/data/model/MeasurementRecord;", "Lvl2/n;", "menuState", "Lvl2/f;", "f", "(Lcom/whoop/trends/data/model/MeasurementRecord;Lvl2/n;)Lvl2/f;", "Lcom/whoop/trends/data/model/MeasurementSections;", "Lvl2/g;", "c", "(Lcom/whoop/trends/data/model/MeasurementSections;Lvl2/n;)Lvl2/g;", "Lcom/whoop/trends/data/model/MeasurementContent;", "Lvl2/c;", "e", "(Lcom/whoop/trends/data/model/MeasurementContent;Lvl2/n;)Lvl2/c;", "", "Lcom/whoop/trends/data/model/TrendMenuItemModel;", "Lvl2/m;", "g", "(Ljava/util/List;Lvl2/n;)Ljava/util/List;", "i", "(Lcom/whoop/trends/data/model/TrendMenuItemModel;Lvl2/n;)Lvl2/m;", "Lcom/whoop/trends/data/model/TrendMenuSheet;", "Lvl2/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/trends/data/model/TrendMenuSheet;Lvl2/n;)Lvl2/i;", "Lec3/l;", "Lvl2/t;", "apiResult", "Lvl2/y;", "stateResult", "menuSheetResult", "Lvl2/w;", "d", "(Lec3/l;Lec3/l;Lec3/l;)Lec3/l;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36129v {

    /* JADX INFO: renamed from: vl2.v$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f154568a;

        static {
            int[] iArr = new int[EnumC36108b.values().length];
            try {
                iArr[EnumC36108b.VO2_MAX_MEASUREMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f154568a = iArr;
        }
    }

    /* JADX INFO: renamed from: vl2.v$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendsDomainReducer$reduce$1", m100430f = "TrendsDomainReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lvl2/t;", "api", "Lvl2/y;", "state", "Lvl2/n;", "menuSheetState", "Lvl2/w;", "<anonymous>", "(Lvl2/t;Lvl2/y;Lvl2/n;)Lvl2/w;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        int f154570w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f154571x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154572y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f154573z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        @Override // c93.InterfaceC4352n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC36127t abstractC36127t, AbstractC36132y abstractC36132y, C36121n c36121n, InterfaceC30057d<? super AbstractC36130w> interfaceC30057d) {
            b bVar = C36129v.this.new b(interfaceC30057d);
            bVar.f154571x = abstractC36127t;
            bVar.f154572y = abstractC36132y;
            bVar.f154573z = c36121n;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC36127t abstractC36127t = (AbstractC36127t) this.f154571x;
            AbstractC36132y abstractC36132y = (AbstractC36132y) this.f154572y;
            C36121n c36121n = (C36121n) this.f154573z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f154570w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC22676k.m65748h(abstractC36132y, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsLocalStateResult.ResultV3");
            AbstractC36132y.a aVar = (AbstractC36132y.a) abstractC36132y;
            if (abstractC36127t instanceof AbstractC36127t.a) {
                return new AbstractC36130w.a(aVar.getGraphKey(), aVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), ((AbstractC36127t.a) abstractC36127t).getMessage(), aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
            }
            if (abstractC36127t instanceof AbstractC36127t.b) {
                return new AbstractC36130w.b(aVar.getGraphKey());
            }
            if (!(abstractC36127t instanceof AbstractC36127t.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC36127t.c cVar = (AbstractC36127t.c) abstractC36127t;
            String headerNameDisplay = cVar.getHeaderNameDisplay();
            SegmentControllerDtoV3 segmentController = cVar.getSegmentController();
            String noDataNameDisplay = cVar.getNoDataNameDisplay();
            String noDataSubtextNameDisplay = cVar.getNoDataSubtextNameDisplay();
            MetricEducationV3 metricEducation = cVar.getMetricEducation();
            TimeSegmentDtoV3 weekTimeSegment = cVar.getWeekTimeSegment();
            TimeSegmentDtoV3 monthTimeSegment = cVar.getMonthTimeSegment();
            TimeSegmentDtoV3 sixMonthTimeSegment = cVar.getSixMonthTimeSegment();
            TimeSegmentDtoV3 allTimeSegment = cVar.getAllTimeSegment();
            List<NavigationSectionV3> listM114853w = cVar.m114853w();
            EnumC28166h0 graphKey = cVar.getGraphKey();
            EnumC36106a enumC36106a = aVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String();
            String str = aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            ArticleTileCarouselModel educationCarouselModel = cVar.getEducationCarouselModel();
            String infoCallout = cVar.getInfoCallout();
            IntegrationsUpsellDtoV3 integrationsUpsell = cVar.getIntegrationsUpsell();
            List<C36133z> listM114955d = aVar.m114955d();
            TrendsMenuItemDtoV3 manualMeasurementItem = cVar.getManualMeasurementItem();
            TrendsMenuItemDtoV3 seeAllDataItem = cVar.getSeeAllDataItem();
            ManualMeasurementSheet manualMeasurementSheet = cVar.getManualMeasurementSheet();
            RecordedData recordedData = cVar.getRecordedData();
            boolean recordedDataError = cVar.getRecordedDataError();
            boolean successSavingManualMeasurement = cVar.getSuccessSavingManualMeasurement();
            TextWithIllustrationCardModel upsellCard = cVar.getUpsellCard();
            List<MenuItemModel> listM114829H = cVar.m114829H();
            CardioFitnessLevelModel cardioFitnessLevel = cVar.getCardioFitnessLevel();
            List<MetricEducationV3> listM114851u = cVar.m114851u();
            List<InfoCalloutTileModel> listM114841k = cVar.m114841k();
            String manualMeasurementTextDisplay = cVar.getManualMeasurementTextDisplay();
            List<TrendMenuItemModel> listM114828G = cVar.m114828G();
            List listM114900g = listM114828G != null ? C36129v.this.m114900g(listM114828G, c36121n) : null;
            AdditionalInfoTextModel additionalInfoText = cVar.getAdditionalInfoText();
            MeasurementRecord measurementRecord = cVar.getMeasurementRecord();
            return new AbstractC36130w.c(headerNameDisplay, segmentController, noDataNameDisplay, noDataSubtextNameDisplay, metricEducation, weekTimeSegment, monthTimeSegment, sixMonthTimeSegment, allTimeSegment, listM114853w, graphKey, enumC36106a, str, educationCarouselModel, infoCallout, integrationsUpsell, listM114955d, manualMeasurementItem, seeAllDataItem, manualMeasurementSheet, recordedData, recordedDataError, successSavingManualMeasurement, upsellCard, listM114829H, cardioFitnessLevel, listM114851u, listM114841k, manualMeasurementTextDisplay, listM114900g, additionalInfoText, measurementRecord != null ? C36129v.this.m114899f(measurementRecord, c36121n) : null, cVar.getRefreshAllMeasurementsScreen(), cVar.getMeasurementId(), cVar.m114836f(), cVar.getMetadata(), cVar.getMeasurementRecordDeleteState());
        }
    }

    /* JADX INFO: renamed from: c */
    private final C36114g m114897c(MeasurementSections measurementSections, C36121n c36121n) {
        String nextToken = measurementSections.getNextToken();
        List<Record> records = measurementSections.getRecords();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(records, 10));
        for (Record record : records) {
            String title = record.getTitle();
            List<Measurement> measurements = record.getMeasurements();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(measurements, 10));
            for (Measurement measurement : measurements) {
                arrayList2.add(new C36111d(measurement.getType(), m114898e(measurement.getContent(), c36121n)));
            }
            arrayList.add(new C36117j(title, arrayList2));
        }
        return new C36114g(nextToken, arrayList);
    }

    /* JADX INFO: renamed from: e */
    private final C36110c m114898e(MeasurementContent measurementContent, C36121n c36121n) {
        return new C36110c(measurementContent.getId(), measurementContent.getIcon(), measurementContent.getIconUrl(), (int) measurementContent.getMeasurementValue(), measurementContent.getUnit(), measurementContent.getSubtitle(), m114901h(measurementContent.getMenuSheet(), c36121n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C36113f m114899f(MeasurementRecord measurementRecord, C36121n c36121n) {
        return new C36113f(measurementRecord.getNavigationBarTitle(), measurementRecord.getTitle(), measurementRecord.getSubtitle(), m114902i(measurementRecord.getAddManualMeasurement(), c36121n), m114897c(measurementRecord.getSections(), c36121n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final List<C36120m> m114900g(List<TrendMenuItemModel> list, C36121n c36121n) {
        List<TrendMenuItemModel> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m114902i((TrendMenuItemModel) it.next(), c36121n));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC36116i m114901h(TrendMenuSheet trendMenuSheet, C36121n c36121n) {
        EnumC36108b enumC36108b;
        if (trendMenuSheet == null) {
            return null;
        }
        String type = trendMenuSheet.getType();
        EnumC36108b enumC36108b2 = EnumC36108b.VO2_MAX_MEASUREMENT;
        EnumC36108b[] enumC36108bArrValues = EnumC36108b.values();
        int length = enumC36108bArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC36108b = null;
                break;
            }
            enumC36108b = enumC36108bArrValues[i13];
            if (AbstractC22676k.m65745e(enumC36108b.name(), type)) {
                break;
            }
            i13++;
        }
        if (enumC36108b != null) {
            enumC36108b2 = enumC36108b;
        }
        if (a.f154568a[enumC36108b2.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        ManualMeasurementModelV2 content = trendMenuSheet.getContent();
        InterfaceC36115h menuSheetUserState = c36121n.getMenuSheetUserState();
        return new InterfaceC36116i.a(content, menuSheetUserState instanceof InterfaceC36115h.a ? (InterfaceC36115h.a) menuSheetUserState : null);
    }

    /* JADX INFO: renamed from: i */
    private final C36120m m114902i(TrendMenuItemModel trendMenuItemModel, C36121n c36121n) {
        return new C36120m(trendMenuItemModel.getTrendMenuItem(), trendMenuItemModel.getTrendMenuDetailText(), m114901h(trendMenuItemModel.getTrendMenuSheet(), c36121n));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m114903d(InterfaceC13058l apiResult, InterfaceC13058l stateResult, InterfaceC13058l menuSheetResult) {
        AbstractC22676k.m65750j(apiResult, "apiResult");
        AbstractC22676k.m65750j(stateResult, "stateResult");
        AbstractC22676k.m65750j(menuSheetResult, "menuSheetResult");
        return AbstractC13091v.m36606p(apiResult, stateResult, menuSheetResult, new b(null));
    }
}
