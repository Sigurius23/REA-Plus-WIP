package mw0;

import c41.AbstractC4155y2;
import c41.C4141w2;
import c41.C4148x2;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.core.details.network.model.sleep.SleepMetricBreakdownModel;
import com.whoop.core.details.network.model.sleep.SleepMetricBreakdownModelKt;
import com.whoop.core.details.network.model.sleep.SleepMetricTrendType;
import com.whoop.core.details.network.model.sleep.SleepMetricTypeModel;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hw0.C17701f;
import hw0.EnumC17696a;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.ArrayList;
import java.util.List;
import jb1.C21535a;
import jw0.AbstractC21988f;
import jw0.AbstractC21991i;
import jw0.C21984b;
import k71.C22257n;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mc1.AbstractC25421f;
import mc1.EnumC25417b;
import nw0.AbstractC27201h;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33182g1;
import p736sz0.C33210q;
import s01.C32048d;
import vv0.AbstractC36529b;
import vz0.C36613b;
import x81.C38072d;

/* JADX INFO: renamed from: mw0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0#*\n\u0012\u0006\u0012\u0004\u0018\u00010$0#¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Ljw0/f$a;", "Lmw0/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljw0/f$a;)Lmw0/i;", "Ljw0/f$b;", "Lhw0/f;", "horizontalHeartZoneBarGraphReducer", "i", "(Ljw0/f$b;Lhw0/f;)Lmw0/i;", "Ljw0/f$d;", "Ljb1/a;", "reducer", "Lmw0/i$a;", "j", "(Ljw0/f$d;Lhw0/f;Ljb1/a;)Lmw0/i$a;", "Ljw0/i;", "sleepStageType", "domainState", "Lmw0/l;", "d", "(Ljw0/i;Ljw0/f$d;Ljb1/a;)Lmw0/l;", "Lmw0/f;", "Lsz0/q;", "f", "(Lmw0/f;)Lsz0/q;", "Lcom/whoop/design/util/TextResource;", "e", "(Ljw0/i;Ljw0/f$d;)Lcom/whoop/design/util/TextResource;", "Lmc1/b;", "heartRateZoneType", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "barGraphContainerModel", "Lk71/n;", "c", "(Lmc1/b;Lcom/whoop/design/models/items/BarGraphContainerModel;Lhw0/f;)Lk71/n;", "", "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;", "Lc41/w2;", "b", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "", "g", "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;)I", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25983k {

    /* JADX INFO: renamed from: mw0.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102681a;

        static {
            int[] iArr = new int[SleepMetricTypeModel.values().length];
            try {
                iArr[SleepMetricTypeModel.WAKE_EVENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepMetricTypeModel.EFFICIENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SleepMetricTypeModel.RESPIRATORY_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SleepMetricTypeModel.LATENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f102681a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final List<C4141w2> m77074b(List<SleepMetricBreakdownModel> list) {
        AbstractC4155y2 abstractC4155y2;
        AbstractC4155y2 cVar;
        String sleepMetricComparisonDisplay;
        C4148x2 c4148x2;
        String sleepMetricValueDisplay;
        SleepMetricTrendType sleepMetricTrendType;
        EnumC17727b2 trendTypeState;
        AbstractC22676k.m65750j(list, "<this>");
        ArrayList<SleepMetricBreakdownModel> arrayListM74092D0 = AbstractC25265s.m74092D0(list);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM74092D0, 10));
        for (SleepMetricBreakdownModel sleepMetricBreakdownModel : arrayListM74092D0) {
            if (sleepMetricBreakdownModel.isEmpty()) {
                abstractC4155y2 = AbstractC4155y2.a.f16920a;
            } else {
                String metricUnitDisplay = sleepMetricBreakdownModel.getMetricUnitDisplay();
                if (metricUnitDisplay != null) {
                    cVar = new AbstractC4155y2.c(AbstractC8693b.m21278l(metricUnitDisplay));
                } else {
                    abstractC4155y2 = AbstractC4155y2.b.f16921a;
                }
                int iM77079g = m77079g(sleepMetricBreakdownModel.getSleepMetricType());
                sleepMetricComparisonDisplay = sleepMetricBreakdownModel.getSleepMetricComparisonDisplay();
                if (sleepMetricComparisonDisplay != null) {
                    sleepMetricTrendType = sleepMetricBreakdownModel.getSleepMetricTrendType();
                    if (sleepMetricTrendType != null || (trendTypeState = SleepMetricBreakdownModelKt.toTrendTypeState(sleepMetricTrendType)) == null) {
                        trendTypeState = EnumC17727b2.NEUTRAL;
                    }
                    c4148x2 = new C4148x2(trendTypeState, AbstractC8693b.m21278l(sleepMetricComparisonDisplay));
                } else {
                    c4148x2 = null;
                }
                C4148x2 c4148x3 = c4148x2;
                TextResource textResourceM21278l = AbstractC8693b.m21278l(sleepMetricBreakdownModel.getSleepMetricTitleDisplay());
                sleepMetricValueDisplay = sleepMetricBreakdownModel.getSleepMetricValueDisplay();
                if (sleepMetricValueDisplay == null) {
                    sleepMetricValueDisplay = "---";
                }
                arrayList.add(new C4141w2(new AbstractC25979g.f(sleepMetricBreakdownModel.getSleepMetricTitleDisplay(), sleepMetricBreakdownModel.getSleepMetricType().toSleepDetailsKeyMetricTileType()), null, cVar, iM77079g, null, c4148x3, textResourceM21278l, null, AbstractC8693b.m21278l(sleepMetricValueDisplay), null, null, null, null, false, 16018, null));
            }
            cVar = abstractC4155y2;
            int iM77079g2 = m77079g(sleepMetricBreakdownModel.getSleepMetricType());
            sleepMetricComparisonDisplay = sleepMetricBreakdownModel.getSleepMetricComparisonDisplay();
            if (sleepMetricComparisonDisplay != null) {
                sleepMetricTrendType = sleepMetricBreakdownModel.getSleepMetricTrendType();
                if (sleepMetricTrendType != null) {
                    trendTypeState = EnumC17727b2.NEUTRAL;
                } else {
                    trendTypeState = EnumC17727b2.NEUTRAL;
                }
                c4148x2 = new C4148x2(trendTypeState, AbstractC8693b.m21278l(sleepMetricComparisonDisplay));
            } else {
                c4148x2 = null;
            }
            C4148x2 c4148x4 = c4148x2;
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(sleepMetricBreakdownModel.getSleepMetricTitleDisplay());
            sleepMetricValueDisplay = sleepMetricBreakdownModel.getSleepMetricValueDisplay();
            if (sleepMetricValueDisplay == null) {
                sleepMetricValueDisplay = "---";
            }
            arrayList.add(new C4141w2(new AbstractC25979g.f(sleepMetricBreakdownModel.getSleepMetricTitleDisplay(), sleepMetricBreakdownModel.getSleepMetricType().toSleepDetailsKeyMetricTileType()), null, cVar, iM77079g2, null, c4148x4, textResourceM21278l2, null, AbstractC8693b.m21278l(sleepMetricValueDisplay), null, null, null, null, false, 16018, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final C22257n m77075c(EnumC25417b heartRateZoneType, BarGraphContainerModel barGraphContainerModel, C17701f horizontalHeartZoneBarGraphReducer) {
        AbstractC22676k.m65750j(heartRateZoneType, "heartRateZoneType");
        AbstractC22676k.m65750j(horizontalHeartZoneBarGraphReducer, "horizontalHeartZoneBarGraphReducer");
        C22257n c22257nM50661c = barGraphContainerModel != null ? horizontalHeartZoneBarGraphReducer.m50661c(barGraphContainerModel) : null;
        if (heartRateZoneType == EnumC25417b.NONE) {
            return c22257nM50661c;
        }
        if (c22257nM50661c != null) {
            return C22257n.m63917b(c22257nM50661c, null, horizontalHeartZoneBarGraphReducer.m50662d(c22257nM50661c.m63919c(), heartRateZoneType, heartRateZoneType, barGraphContainerModel.getHeartRateZones()), 1, null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: d */
    private static final C25984l m77076d(AbstractC21991i abstractC21991i, AbstractC21988f.d dVar, C21535a c21535a) {
        C32048d c32048d;
        C33210q c33210qM105317b;
        C33210q c33210qM77078f;
        C33210q c33210qM77078f2;
        TextResource textResourceM77077e = m77077e(abstractC21991i, dVar);
        WhoopCoachVowModel whoopCoachVowModel = dVar.getWhoopCoachVowModel();
        if (whoopCoachVowModel != null) {
            InterfaceC25312u interfaceC25312uM60541h = c21535a.m60541h(whoopCoachVowModel);
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.coach.WhoopCoachVowViewState");
            c32048d = C32048d.m99589b((C32048d) interfaceC25312uM60541h, textResourceM77077e, null, null, null, null, null, null, 126, null);
            if (c32048d == null) {
                c32048d = new C32048d(textResourceM77077e, null, null, null, null, null, null, 126, null);
            }
        } else {
            c32048d = new C32048d(textResourceM77077e, null, null, null, null, null, null, 126, null);
        }
        C32048d c32048d2 = c32048d;
        C33210q c33210qM105317b2 = null;
        if (dVar.getScrubbingHorizontalStatState() != null) {
            C21984b scrubbingHorizontalStatState = dVar.getScrubbingHorizontalStatState();
            return new C25984l(new C33210q(null, scrubbingHorizontalStatState.getValueDisplay(), null, scrubbingHorizontalStatState.getUnitDisplay(), null, null, scrubbingHorizontalStatState.getTimeDisplay(), false, EnumC25417b.toWhoopColorKey$default(dVar.getCurrentHeartZoneType(), null, 1, null), null, null, false, 3765, null), null, c32048d2, 2, null);
        }
        C25978f mainStat = abstractC21991i.getMainStat();
        if (mainStat == null || (c33210qM77078f2 = m77078f(mainStat)) == null) {
            c33210qM105317b = null;
        } else {
            C25978f mainStat2 = abstractC21991i.getMainStat();
            c33210qM105317b = C33210q.m105317b(c33210qM77078f2, null, null, null, null, null, null, null, mainStat2 != null ? mainStat2.m77016c(dVar.getSelectedTooltip()) : false, null, null, null, false, 3967, null);
        }
        C25978f centerStat = abstractC21991i.getCenterStat();
        if (centerStat != null && (c33210qM77078f = m77078f(centerStat)) != null) {
            C25978f centerStat2 = abstractC21991i.getCenterStat();
            c33210qM105317b2 = C33210q.m105317b(c33210qM77078f, null, null, null, null, null, null, null, centerStat2 != null ? centerStat2.m77016c(dVar.getSelectedTooltip()) : false, null, null, null, false, 3967, null);
        }
        return new C25984l(c33210qM105317b, c33210qM105317b2, c32048d2);
    }

    /* JADX INFO: renamed from: e */
    private static final TextResource m77077e(AbstractC21991i abstractC21991i, AbstractC21988f.d dVar) {
        return dVar.getSelectedTooltip() == null ? AbstractC8693b.m21278l(abstractC21991i.getVow()) : abstractC21991i.m62842d(dVar.getSelectedTooltip());
    }

    /* JADX INFO: renamed from: f */
    private static final C33210q m77078f(C25978f c25978f) {
        TextResource statValue = c25978f.getStatValue();
        if (statValue == null) {
            statValue = AbstractC8693b.m21267a();
        }
        TextResource textResource = statValue;
        TextResource statTitle = c25978f.getStatTitle();
        TextResource trendText = c25978f.getTrendText();
        if (trendText == null) {
            trendText = AbstractC8693b.m21267a();
        }
        EnumC17727b2 trendType = c25978f.getTrendType();
        if (trendType == null) {
            trendType = EnumC17727b2.NEUTRAL;
        }
        return new C33210q(c25978f.getMetricTypeModel(), textResource, null, null, null, new C33182g1(trendText, trendType), statTitle, c25978f.getPressed(), c25978f.getStatValueColor(), null, null, false, 3612, null);
    }

    /* JADX INFO: renamed from: g */
    private static final int m77079g(SleepMetricTypeModel sleepMetricTypeModel) {
        int i13 = a.f102681a[sleepMetricTypeModel.ordinal()];
        if (i13 == 1) {
            return C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getDisturbances();
        }
        if (i13 == 2) {
            return C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getEfficiency();
        }
        if (i13 == 3) {
            return C38072d.f163053a.m121951d().getRecovery().getRespiratoryRate();
        }
        if (i13 == 4) {
            return C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getLatency();
        }
        throw new IllegalStateException(AbstractC11895b.m31996o("Attempting to map a sleep metric type (", sleepMetricTypeModel.name(), ") to an icon that is not supported in the key metric carousel"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final AbstractC25981i m77080h(AbstractC21988f.a aVar) {
        return new AbstractC25981i.b(new TextResource.C8688b(AbstractC36529b.f156323D, null, 2, null), new TextResource.C8688b(AbstractC36529b.f156322C, null, 2, null), aVar.getSleepIdV2());
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC25981i m77081i(AbstractC21988f.b bVar, C17701f horizontalHeartZoneBarGraphReducer) {
        AbstractC22676k.m65750j(bVar, "<this>");
        AbstractC22676k.m65750j(horizontalHeartZoneBarGraphReducer, "horizontalHeartZoneBarGraphReducer");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bVar.getScreenTitle());
        C25984l c25984l = new C25984l(null, null, null, 7, null);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(bVar.getKeyMetrics().getTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(bVar.getKeyMetrics().getSubtitle());
        List<C4141w2> listM77074b = m77074b(bVar.getKeyMetrics().m62765b());
        AbstractC27201h dialog = bVar.getDialog();
        BarGraphContainerModel heartRateZoneContainer = bVar.getHeartRateZoneContainer();
        return new AbstractC25981i.c(c25984l, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, listM77074b, dialog, heartRateZoneContainer != null ? horizontalHeartZoneBarGraphReducer.m50661c(heartRateZoneContainer) : null, null, bVar.getIsNap(), bVar.getIsNapToSleepAvailable(), AbstractC25421f.m74622b(bVar.getGraphModel(), AbstractC25421f.m74624d(EnumC25417b.NONE, EnumC17696a.INSTANCE.m50567c(EnumC17696a.SLEEP), null, 4, null)), bVar.getEditBounds(), 128, null);
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC25981i.a m77082j(AbstractC21988f.d dVar, C17701f horizontalHeartZoneBarGraphReducer, C21535a reducer) {
        AbstractC22676k.m65750j(dVar, "<this>");
        AbstractC22676k.m65750j(horizontalHeartZoneBarGraphReducer, "horizontalHeartZoneBarGraphReducer");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC21991i selectedSleepMetricType = dVar.getSelectedSleepMetricType();
        if (selectedSleepMetricType == null) {
            AbstractC21991i abstractC21991i = dVar.m62818q().get(EnumC25417b.NONE);
            if (abstractC21991i == null) {
                throw new IllegalStateException("Domain state does not contain dynamic information for viewstate conversion");
            }
            selectedSleepMetricType = abstractC21991i;
        }
        int nap = dVar.getIsNap() ? C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getNap() : AbstractC25012a.m73369b(C38072d.f163053a);
        C25984l c25984lM77076d = m77076d(selectedSleepMetricType, dVar, reducer);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dVar.getScreenTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(dVar.getScreenSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(dVar.getKeyMetrics().getTitle());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(dVar.getKeyMetrics().getSubtitle());
        List<C4141w2> listM77074b = m77074b(dVar.getKeyMetrics().m62765b());
        AbstractC27201h dialog = dVar.getDialog();
        boolean isNap = dVar.getIsNap();
        C22257n c22257nM77075c = m77075c(dVar.getCurrentHeartZoneType(), dVar.getHeartRateZoneContainer(), horizontalHeartZoneBarGraphReducer);
        C25973a missingHrData = dVar.getMissingHrData();
        boolean isNapToSleepAvailable = dVar.getIsNapToSleepAvailable();
        C21395c c21395cM74622b = AbstractC25421f.m74622b(dVar.getGraphModel(), AbstractC25421f.m74624d(dVar.getCurrentHeartZoneType(), EnumC17696a.INSTANCE.m50567c(EnumC17696a.SLEEP), null, 4, null));
        C23465k editBounds = dVar.getEditBounds();
        AdditionalInfoTextModel additionalInfoText = dVar.getAdditionalInfoText();
        C36613b c36613b = additionalInfoText != null ? new C36613b(AbstractC8693b.m21278l(additionalInfoText.getText()), additionalInfoText.getNavigation(), null, 4, null) : null;
        AiContextMetadata aiContextMetadata = dVar.getAiContextMetadata();
        return new AbstractC25981i.a(nap, c25984lM77076d, textResourceM21278l2, textResourceM21278l, listM77074b, textResourceM21278l3, textResourceM21278l4, dialog, c22257nM77075c, missingHrData, isNap, isNapToSleepAvailable, c21395cM74622b, editBounds, c36613b, aiContextMetadata != null ? AbstractC6219a.m18523a(aiContextMetadata) : null);
    }
}
