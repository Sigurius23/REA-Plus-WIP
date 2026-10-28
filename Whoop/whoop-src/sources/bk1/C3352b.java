package bk1;

import ak1.AbstractC0949b;
import ak1.C0948a;
import ak1.C0951d;
import b72.C2783a;
import c41.C4113s2;
import c41.C4141w2;
import c41.C4148x2;
import ck1.AbstractC4788k;
import ck1.C4791n;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.healthmonitor.domain.models.ComposableHealthMonitorResponse;
import com.whoop.healthmonitor.domain.models.MetaData;
import ep0.C13404j;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n83.C26460c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import p745y81.EnumC39333f;
import sl1.AbstractC32703b;
import sl1.C32704c;
import wb3.AbstractC37056f;
import xj1.AbstractC38403g;
import xj1.C38399c;
import xj1.EnumC38402f;
import y71.C39282o;
import yg2.AbstractC39529d;
import yg2.C39528c;

/* JADX INFO: renamed from: bk1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001+B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b%\u0010\fJ\u0017\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0017\u00102\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Lbk1/b;", "", "Lyg2/c;", "liveHrMonitorReducer", "Lsl1/c;", "connectivityTileViewStateReducer", "<init>", "(Lyg2/c;Lsl1/c;)V", "Lxj1/c;", "domainResult", "Lak1/d;", "i", "(Lxj1/c;)Lak1/d;", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "response", "Lak1/a;", "e", "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;)Lak1/a;", "Lxj1/f;", "modalType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lxj1/f;)Lak1/d;", "Lyg2/d;", "liveHrState", "Lsl1/b;", "connectivityTileType", "", "Lm91/u;", "b", "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lyg2/d;Lsl1/b;)Ljava/util/List;", "c", "(Ljava/util/List;)Ljava/util/List;", "Lc41/w2;", "tileState", "Lck1/n;", "g", "(Lc41/w2;)Lck1/n;", "d", "Lxj1/g;", "healthReportResult", "Lck1/k;", "f", "(Lxj1/g;)Lck1/k;", "a", "Lyg2/c;", "Lsl1/c;", "Ljb1/a;", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3352b {

    /* JADX INFO: renamed from: e */
    public static final int f13030e = (C21535a.f82608c | C32704c.f135890a) | C39528c.f169985b;

    /* JADX INFO: renamed from: f */
    private static final C0951d f13031f;

    /* JADX INFO: renamed from: g */
    private static final C0951d f13032g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39528c liveHrMonitorReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32704c connectivityTileViewStateReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: bk1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13036a;

        static {
            int[] iArr = new int[EnumC38402f.values().length];
            try {
                iArr[EnumC38402f.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38402f.NETWORK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13036a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C33205o0 c33205o0 = C33205o0.f138451a;
        f13031f = new C0951d(null, new C0951d.a(C33211q0.m105332d(c33205o0.m105288b(), null, null, null, null, null, false, false, null, true, false, 767, null), null, null, 6, null), 0 == true ? 1 : 0, 5, null);
        C0951d.b bVar = null;
        C0948a c0948a = null;
        f13032g = new C0951d(bVar, new C0951d.a(c33205o0.m105289c(), AbstractC0949b.f.f3457a, 0 == true ? 1 : 0, 4, null), c0948a, 5, null);
    }

    public C3352b(C39528c liveHrMonitorReducer, C32704c connectivityTileViewStateReducer) {
        AbstractC22676k.m65750j(liveHrMonitorReducer, "liveHrMonitorReducer");
        AbstractC22676k.m65750j(connectivityTileViewStateReducer, "connectivityTileViewStateReducer");
        this.liveHrMonitorReducer = liveHrMonitorReducer;
        this.connectivityTileViewStateReducer = connectivityTileViewStateReducer;
        this.reducer = AbstractC21537c.m60554d(new C2783a(18));
    }

    /* JADX INFO: renamed from: b */
    private final List<InterfaceC25312u> m9675b(ComposableHealthMonitorResponse response, AbstractC39529d liveHrState, AbstractC32703b connectivityTileType) {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        if (connectivityTileType instanceof AbstractC32703b.a) {
            c26460cM119000x.add(this.connectivityTileViewStateReducer.m102648a(connectivityTileType));
        }
        c26460cM119000x.add(this.liveHrMonitorReducer.m126256b(liveHrState));
        List<DesignSystemModel> items = response.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(this.reducer.m60541h((DesignSystemModel) it.next()));
        }
        c26460cM119000x.addAll(m9676c(arrayList));
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    /* JADX INFO: renamed from: c */
    private final List<InterfaceC25312u> m9676c(List<? extends InterfaceC25312u> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC25312u interfaceC25312u : list) {
            if (interfaceC25312u instanceof C4141w2) {
                C4141w2 c4141w2 = (C4141w2) interfaceC25312u;
                arrayList2.add(c4141w2.m12873a((16239 & 1) != 0 ? c4141w2.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (16239 & 2) != 0 ? c4141w2.id : null, (16239 & 4) != 0 ? c4141w2.type : null, (16239 & 8) != 0 ? c4141w2.icon : 0, (16239 & 16) != 0 ? c4141w2.iconColor : EnumC39333f.WHITE_50, (16239 & 32) != 0 ? c4141w2.trend : null, (16239 & 64) != 0 ? c4141w2.title : null, (16239 & 128) != 0 ? c4141w2.titleColor : EnumC39333f.WHITE_70, (16239 & 256) != 0 ? c4141w2.metric : null, (16239 & 512) != 0 ? c4141w2.backgroundColor : null, (16239 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c4141w2.trendBarViewState : null, (16239 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c4141w2.placeHolderMessage : null, (16239 & 4096) != 0 ? c4141w2.keyMetricTileDialogContent : null, (16239 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c4141w2.useSmallValueText : false));
            } else {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C3353c(AbstractC25265s.m74093D1(arrayList2)));
                    arrayList2.clear();
                }
                if (interfaceC25312u instanceof C39282o) {
                    C39282o c39282o = (C39282o) interfaceC25312u;
                    arrayList.add(c39282o.m125211a((32735 & 1) != 0 ? c39282o.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282o.title : null, (32735 & 4) != 0 ? c39282o.titleColor : null, (32735 & 8) != 0 ? c39282o.enabled : false, (32735 & 16) != 0 ? c39282o.selected : false, (32735 & 32) != 0 ? c39282o.alignment : null, (32735 & 64) != 0 ? c39282o.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282o.background : null, (32735 & 256) != 0 ? c39282o.border : null, (32735 & 512) != 0 ? c39282o.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282o.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282o.menuItemStyle : null, (32735 & 4096) != 0 ? c39282o.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282o.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282o.analyticEvent : null));
                } else {
                    arrayList.add(interfaceC25312u);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C3353c(AbstractC25265s.m74093D1(arrayList2)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    private final C0948a m9677e(ComposableHealthMonitorResponse response) {
        EnumC17727b2 enumC17727b2;
        EnumC17727b2 enumC17727b3;
        if (response == null) {
            return null;
        }
        String highestSeverityStatus = response.getAnalytics().getHighestSeverityStatus();
        EnumC17727b2 enumC17727b4 = EnumC17727b2.NONE;
        EnumC17727b2[] enumC17727b2ArrValues = EnumC17727b2.values();
        int length = enumC17727b2ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC17727b2 = null;
                break;
            }
            enumC17727b2 = enumC17727b2ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC17727b2.name(), highestSeverityStatus)) {
                break;
            }
            i13++;
        }
        if (enumC17727b2 != null) {
            enumC17727b4 = enumC17727b2;
        }
        int metricsWithValues = response.getAnalytics().getMetricsWithValues();
        int metricsInRange = response.getAnalytics().getMetricsInRange();
        Map<String, String> ranges = response.getAnalytics().getRanges();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(ranges.size()));
        Iterator<T> it = ranges.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            EnumC17727b2 enumC17727b5 = EnumC17727b2.NONE;
            EnumC17727b2[] enumC17727b2ArrValues2 = EnumC17727b2.values();
            int length2 = enumC17727b2ArrValues2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC17727b3 = null;
                    break;
                }
                enumC17727b3 = enumC17727b2ArrValues2[i14];
                if (AbstractC22676k.m65745e(enumC17727b3.name(), str)) {
                    break;
                }
                i14++;
            }
            if (enumC17727b3 != null) {
                enumC17727b5 = enumC17727b3;
            }
            linkedHashMap.put(key, enumC17727b5);
        }
        return new C0948a(enumC17727b4, metricsWithValues, metricsInRange, linkedHashMap);
    }

    /* JADX INFO: renamed from: g */
    private final C4791n m9678g(C4141w2 tileState) {
        String description;
        String disclaimer;
        TextResource textResourceM21278l;
        TextResource textResourceM21278l2;
        EnumC17727b2 trendType;
        String titleDisplay;
        C4113s2 keyMetricTileDialogContent = tileState.getKeyMetricTileDialogContent();
        if (keyMetricTileDialogContent == null || (description = keyMetricTileDialogContent.getDescription()) == null) {
            description = "";
        }
        C4113s2 keyMetricTileDialogContent2 = tileState.getKeyMetricTileDialogContent();
        if (keyMetricTileDialogContent2 == null || (disclaimer = keyMetricTileDialogContent2.getDisclaimer()) == null) {
            disclaimer = "";
        }
        int icon = tileState.getIcon();
        C4148x2 trend = tileState.getTrend();
        if (trend == null || (textResourceM21278l = trend.getTrendText()) == null) {
            textResourceM21278l = AbstractC8693b.m21278l("");
        }
        C4113s2 keyMetricTileDialogContent3 = tileState.getKeyMetricTileDialogContent();
        if (keyMetricTileDialogContent3 == null || (titleDisplay = keyMetricTileDialogContent3.getTitleDisplay()) == null || (textResourceM21278l2 = AbstractC8693b.m21278l(titleDisplay)) == null) {
            textResourceM21278l2 = AbstractC8693b.m21278l("");
        }
        C4148x2 trend2 = tileState.getTrend();
        if (trend2 == null || (trendType = trend2.getTrendType()) == null) {
            trendType = EnumC17727b2.NONE;
        }
        C4113s2 keyMetricTileDialogContent4 = tileState.getKeyMetricTileDialogContent();
        return new C4791n(description, disclaimer, icon, textResourceM21278l, textResourceM21278l2, trendType, keyMetricTileDialogContent4 != null ? keyMetricTileDialogContent4.getSecondaryButton() : null);
    }

    /* JADX INFO: renamed from: h */
    private final C0951d m9679h(EnumC38402f modalType) {
        int i13 = b.f13036a[modalType.ordinal()];
        if (i13 == 1) {
            return f13031f;
        }
        if (i13 == 2) {
            return f13032g;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    private final C0951d m9680i(C38399c domainResult) {
        C0951d.b bVar;
        AiContextMetadata aiContextMetadata;
        ComposableHealthMonitorResponse composableHealthMonitorResponseM122980g = domainResult.getResponse();
        C13404j c13404jM18523a = null;
        if (composableHealthMonitorResponseM122980g != null) {
            String title = composableHealthMonitorResponseM122980g.getTitle();
            List<InterfaceC25312u> listM9675b = m9675b(domainResult.getResponse(), domainResult.getLiveHrState().getLiveHrState(), domainResult.getConnectivityTile());
            String footer = composableHealthMonitorResponseM122980g.getFooter();
            C4141w2 c4141w2M122981h = domainResult.getTileDialog();
            C4791n c4791nM9678g = c4141w2M122981h != null ? m9678g(c4141w2M122981h) : null;
            MetaData metadata = composableHealthMonitorResponseM122980g.getMetadata();
            if (metadata != null && (aiContextMetadata = metadata.getAiContextMetadata()) != null) {
                c13404jM18523a = AbstractC6219a.m18523a(aiContextMetadata);
            }
            bVar = new C0951d.b(title, listM9675b, footer, c4791nM9678g, c13404jM18523a);
        } else {
            bVar = null;
        }
        return new C0951d(bVar, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m9681j(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final C0951d m9682d(C38399c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return C0951d.m2398c(domainResult.getModalType() != null ? m9679h(domainResult.getModalType()) : m9680i(domainResult), null, null, m9677e(domainResult.getResponse()), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC4788k m9683f(AbstractC38403g healthReportResult) {
        if (healthReportResult instanceof AbstractC38403g.b) {
            return AbstractC4788k.b.f19697b;
        }
        if (healthReportResult instanceof AbstractC38403g.c) {
            return new AbstractC4788k.c(((AbstractC38403g.c) healthReportResult).getFile());
        }
        if (healthReportResult instanceof AbstractC38403g.a) {
            return new AbstractC4788k.a(((AbstractC38403g.a) healthReportResult).getMessage());
        }
        if (healthReportResult == null) {
            return AbstractC4788k.b.f19697b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C3352b(C39528c c39528c, C32704c c32704c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C39528c() : c39528c, (i13 & 2) != 0 ? new C32704c() : c32704c);
    }
}
