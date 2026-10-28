package am2;

import bm2.C3438f;
import bm2.C3458l1;
import bm2.C3470r;
import bm2.C3471r0;
import c01.C3808h;
import c13.AbstractC3855a;
import c41.C4092p2;
import cm2.AbstractC4825m;
import cm2.AbstractC4830r;
import cm2.C4819g;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.TextResource;
import ep0.C13404j;
import h01.C16550q;
import h51.C16934f;
import i11.C17863f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.List;
import jh3.AbstractC21702c;
import k21.C22160d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r21.C30885c;
import r80.AbstractC31061c;
import s01.C32048d;
import vz0.C36613b;
import y71.C39282o;

/* JADX INFO: renamed from: am2.p0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b^\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\u0006\u00102\u001a\u00020.\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u0004\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\u0004\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\u0006\u0010@\u001a\u00020.\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A\u0012\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0004¢\u0006\u0004\bE\u0010FJ\u0010\u0010H\u001a\u00020GHÖ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010K\u001a\u00020JHÖ\u0001¢\u0006\u0004\bK\u0010LJ\u001a\u0010N\u001a\u00020.2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b\\\u0010bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bT\u0010iR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bj\u0010lR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bg\u0010sR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bt\u0010Y\u001a\u0004\bu\u0010[R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\be\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bV\u0010y\u001a\u0004\bz\u0010{R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b|\u0010Y\u001a\u0004\bm\u0010[R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b}\u0010U\u001a\u0004\b}\u0010WR\u001a\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\r\n\u0004\b~\u0010\u007f\u001a\u0005\bc\u0010\u0080\u0001R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\bt\u0010\u0083\u0001R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b~\u0010\u0086\u0001R\u001d\u0010%\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0085\u0001\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R\u001b\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\bz\u0010\u0089\u0001\u001a\u0005\b|\u0010\u008a\u0001R\u001d\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u0087\u0001\u0010\u008d\u0001R\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\u000f\n\u0005\bo\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001d\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0091\u0001\u0010\u0093\u0001R\u001b\u0010/\u001a\u00020.8\u0006¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001d\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u00102\u001a\u00020.8\u0006¢\u0006\u000e\n\u0005\b^\u0010\u0095\u0001\u001a\u0005\b2\u0010\u0097\u0001R\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020#0\u00048\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010U\u001a\u0005\b\u009b\u0001\u0010WR\u001c\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0005\bX\u0010\u009e\u0001R!\u00106\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010U\u001a\u0005\b\u008b\u0001\u0010WR\u001f\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bR\u0010U\u001a\u0004\bq\u0010WR\u001b\u00109\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010Y\u001a\u0005\b\u0084\u0001\u0010[R!\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010U\u001a\u0005\b\u009f\u0001\u0010WR\u001c\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010 \u0001\u001a\u0005\bP\u0010¡\u0001R\u001c\u0010?\u001a\u0004\u0018\u00010>8\u0006¢\u0006\u000f\n\u0005\bu\u0010¢\u0001\u001a\u0006\b\u0081\u0001\u0010£\u0001R\u001a\u0010@\u001a\u00020.8\u0006¢\u0006\u000f\n\u0005\bw\u0010\u0095\u0001\u001a\u0006\b\u009c\u0001\u0010\u0097\u0001R\u001d\u0010B\u001a\u0004\u0018\u00010A8\u0006¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b\u0094\u0001\u0010¦\u0001R\u001e\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00048\u0006¢\u0006\r\n\u0005\b§\u0001\u0010U\u001a\u0004\b`\u0010W¨\u0006¨\u0001"}, m65681d2 = {"Lam2/p0;", "", "Lcom/whoop/design/atomic/organism/toolbar/d;", "toolbarState", "", "Lbm2/l1;", "keyMetricTileState", "Lcom/whoop/design/util/TextResource;", "restorativeSleepLabelField", "Lam2/x;", "segmentControlState", "Li11/f;", "dateSelectorState", "Lbm2/r;", "interTrendNavigationState", "Lc01/h;", "breakdownBarState", "Lj71/c;", "graphState", "Lr21/c;", "metricEducationState", "Lam2/n;", "emptyState", "vow", "Ls01/d;", "whoopCoachVow", "Lam2/d0;", "metaData", "infoCalloutDisplay", "Lam2/p;", "legend", "Lh51/f;", "educationCarouselModel", "Lk21/d;", "integrationsUpsellState", "Ly71/o;", "manualMeasurementItem", "seeAllDataItem", "Lam2/o;", "lastUpdatedViewState", "Lcm2/g;", "manualMeasurementViewState", "Lbm2/r0;", "segmentalAnalysisViewState", "Lcm2/m;", "recordedData", "", "successSavingManualMeasurement", "Lh01/q;", "upsellCard", "isHidden", "trendMenuList", "Lbm2/f;", "cardioFitnessLevel", "metricEducationList", "Lc41/p2;", "infoCalloutList", "manualMeasurementTextDisplay", "Lam2/y;", "trendMenus", "Lvz0/b;", "additionalInfoText", "Lcm2/r;", "manualMeasurementRecords", "successDeleteMeasurement", "Lep0/j;", "screenContextMetadata", "Lm91/u;", "designItems", "<init>", "(Lcom/whoop/design/atomic/organism/toolbar/d;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lam2/x;Li11/f;Lbm2/r;Lc01/h;Lj71/c;Lr21/c;Lam2/n;Lcom/whoop/design/util/TextResource;Ls01/d;Lam2/d0;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lh51/f;Lk21/d;Ly71/o;Ly71/o;Lam2/o;Lcm2/g;Lbm2/r0;Lcm2/m;ZLh01/q;ZLjava/util/List;Lbm2/f;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lvz0/b;Lcm2/r;ZLep0/j;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/atomic/organism/toolbar/d;", "D", "()Lcom/whoop/design/atomic/organism/toolbar/d;", "b", "Ljava/util/List;", "m", "()Ljava/util/List;", "c", "Lcom/whoop/design/util/TextResource;", "getRestorativeSleepLabelField", "()Lcom/whoop/design/util/TextResource;", "d", "Lam2/x;", "z", "()Lam2/x;", "e", "Li11/f;", "()Li11/f;", "f", "Lbm2/r;", "l", "()Lbm2/r;", "g", "Lc01/h;", "()Lc01/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lj71/c;", "()Lj71/c;", "i", "Lr21/c;", "v", "()Lr21/c;", "j", "Lam2/n;", "()Lam2/n;", "k", "H", "Ls01/d;", "I", "()Ls01/d;", "Lam2/d0;", "t", "()Lam2/d0;", "n", "o", "p", "Lh51/f;", "()Lh51/f;", "q", "Lk21/d;", "()Lk21/d;", "r", "Ly71/o;", "()Ly71/o;", "s", "y", "Lam2/o;", "()Lam2/o;", "u", "Lcm2/g;", "()Lcm2/g;", "Lbm2/r0;", "A", "()Lbm2/r0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcm2/m;", "()Lcm2/m;", "x", "Z", "C", "()Z", "Lh01/q;", "G", "()Lh01/q;", "E", "B", "Lbm2/f;", "()Lbm2/f;", "F", "Lvz0/b;", "()Lvz0/b;", "Lcm2/r;", "()Lcm2/r;", "J", "Lep0/j;", "()Lep0/j;", "K", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1037p0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final List<C39282o> trendMenuList;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final C3438f cardioFitnessLevel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final List<C30885c> metricEducationList;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final List<C4092p2> infoCalloutList;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final TextResource manualMeasurementTextDisplay;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final List<C1048y> trendMenus;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C36613b additionalInfoText;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final AbstractC4830r manualMeasurementRecords;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final boolean successDeleteMeasurement;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C13404j screenContextMetadata;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final List<InterfaceC25312u> designItems;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC6721d toolbarState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C3458l1> keyMetricTileState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource restorativeSleepLabelField;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C1047x segmentControlState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17863f dateSelectorState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C3470r interTrendNavigationState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C3808h breakdownBarState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C21395c graphState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C30885c metricEducationState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C1032n emptyState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource vow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C32048d whoopCoachVow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C1013d0 metaData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final TextResource infoCalloutDisplay;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final List<C1036p> legend;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C16934f educationCarouselModel;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C22160d integrationsUpsellState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C39282o manualMeasurementItem;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C39282o seeAllDataItem;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C1034o lastUpdatedViewState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C4819g manualMeasurementViewState;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final C3471r0 segmentalAnalysisViewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC4825m recordedData;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean successSavingManualMeasurement;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C16550q upsellCard;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final boolean isHidden;

    /* JADX WARN: Multi-variable type inference failed */
    public C1037p0(AbstractC6721d toolbarState, List<C3458l1> keyMetricTileState, TextResource restorativeSleepLabelField, C1047x segmentControlState, C17863f dateSelectorState, C3470r interTrendNavigationState, C3808h c3808h, C21395c c21395c, C30885c c30885c, C1032n emptyState, TextResource textResource, C32048d c32048d, C1013d0 metaData, TextResource textResource2, List<C1036p> list, C16934f c16934f, C22160d c22160d, C39282o c39282o, C39282o c39282o2, C1034o c1034o, C4819g c4819g, C3471r0 c3471r0, AbstractC4825m abstractC4825m, boolean z4, C16550q c16550q, boolean z13, List<C39282o> trendMenuList, C3438f c3438f, List<C30885c> list2, List<C4092p2> list3, TextResource textResource3, List<C1048y> list4, C36613b c36613b, AbstractC4830r abstractC4830r, boolean z14, C13404j c13404j, List<? extends InterfaceC25312u> designItems) {
        AbstractC22676k.m65750j(toolbarState, "toolbarState");
        AbstractC22676k.m65750j(keyMetricTileState, "keyMetricTileState");
        AbstractC22676k.m65750j(restorativeSleepLabelField, "restorativeSleepLabelField");
        AbstractC22676k.m65750j(segmentControlState, "segmentControlState");
        AbstractC22676k.m65750j(dateSelectorState, "dateSelectorState");
        AbstractC22676k.m65750j(interTrendNavigationState, "interTrendNavigationState");
        AbstractC22676k.m65750j(emptyState, "emptyState");
        AbstractC22676k.m65750j(metaData, "metaData");
        AbstractC22676k.m65750j(trendMenuList, "trendMenuList");
        AbstractC22676k.m65750j(designItems, "designItems");
        this.toolbarState = toolbarState;
        this.keyMetricTileState = keyMetricTileState;
        this.restorativeSleepLabelField = restorativeSleepLabelField;
        this.segmentControlState = segmentControlState;
        this.dateSelectorState = dateSelectorState;
        this.interTrendNavigationState = interTrendNavigationState;
        this.breakdownBarState = c3808h;
        this.graphState = c21395c;
        this.metricEducationState = c30885c;
        this.emptyState = emptyState;
        this.vow = textResource;
        this.whoopCoachVow = c32048d;
        this.metaData = metaData;
        this.infoCalloutDisplay = textResource2;
        this.legend = list;
        this.educationCarouselModel = c16934f;
        this.integrationsUpsellState = c22160d;
        this.manualMeasurementItem = c39282o;
        this.seeAllDataItem = c39282o2;
        this.lastUpdatedViewState = c1034o;
        this.manualMeasurementViewState = c4819g;
        this.segmentalAnalysisViewState = c3471r0;
        this.recordedData = abstractC4825m;
        this.successSavingManualMeasurement = z4;
        this.upsellCard = c16550q;
        this.isHidden = z13;
        this.trendMenuList = trendMenuList;
        this.cardioFitnessLevel = c3438f;
        this.metricEducationList = list2;
        this.infoCalloutList = list3;
        this.manualMeasurementTextDisplay = textResource3;
        this.trendMenus = list4;
        this.additionalInfoText = c36613b;
        this.manualMeasurementRecords = abstractC4830r;
        this.successDeleteMeasurement = z14;
        this.screenContextMetadata = c13404j;
        this.designItems = designItems;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final C3471r0 getSegmentalAnalysisViewState() {
        return this.segmentalAnalysisViewState;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final boolean getSuccessDeleteMeasurement() {
        return this.successDeleteMeasurement;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getSuccessSavingManualMeasurement() {
        return this.successSavingManualMeasurement;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final AbstractC6721d getToolbarState() {
        return this.toolbarState;
    }

    /* JADX INFO: renamed from: E */
    public final List<C39282o> m2940E() {
        return this.trendMenuList;
    }

    /* JADX INFO: renamed from: F */
    public final List<C1048y> m2941F() {
        return this.trendMenus;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final C16550q getUpsellCard() {
        return this.upsellCard;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final TextResource getVow() {
        return this.vow;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final C32048d getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C36613b getAdditionalInfoText() {
        return this.additionalInfoText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C3808h getBreakdownBarState() {
        return this.breakdownBarState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C3438f getCardioFitnessLevel() {
        return this.cardioFitnessLevel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C17863f getDateSelectorState() {
        return this.dateSelectorState;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC25312u> m2949e() {
        return this.designItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1037p0)) {
            return false;
        }
        C1037p0 c1037p0 = (C1037p0) other;
        return AbstractC22676k.m65745e(this.toolbarState, c1037p0.toolbarState) && AbstractC22676k.m65745e(this.keyMetricTileState, c1037p0.keyMetricTileState) && AbstractC22676k.m65745e(this.restorativeSleepLabelField, c1037p0.restorativeSleepLabelField) && AbstractC22676k.m65745e(this.segmentControlState, c1037p0.segmentControlState) && AbstractC22676k.m65745e(this.dateSelectorState, c1037p0.dateSelectorState) && AbstractC22676k.m65745e(this.interTrendNavigationState, c1037p0.interTrendNavigationState) && AbstractC22676k.m65745e(this.breakdownBarState, c1037p0.breakdownBarState) && AbstractC22676k.m65745e(this.graphState, c1037p0.graphState) && AbstractC22676k.m65745e(this.metricEducationState, c1037p0.metricEducationState) && AbstractC22676k.m65745e(this.emptyState, c1037p0.emptyState) && AbstractC22676k.m65745e(this.vow, c1037p0.vow) && AbstractC22676k.m65745e(this.whoopCoachVow, c1037p0.whoopCoachVow) && AbstractC22676k.m65745e(this.metaData, c1037p0.metaData) && AbstractC22676k.m65745e(this.infoCalloutDisplay, c1037p0.infoCalloutDisplay) && AbstractC22676k.m65745e(this.legend, c1037p0.legend) && AbstractC22676k.m65745e(this.educationCarouselModel, c1037p0.educationCarouselModel) && AbstractC22676k.m65745e(this.integrationsUpsellState, c1037p0.integrationsUpsellState) && AbstractC22676k.m65745e(this.manualMeasurementItem, c1037p0.manualMeasurementItem) && AbstractC22676k.m65745e(this.seeAllDataItem, c1037p0.seeAllDataItem) && AbstractC22676k.m65745e(this.lastUpdatedViewState, c1037p0.lastUpdatedViewState) && AbstractC22676k.m65745e(this.manualMeasurementViewState, c1037p0.manualMeasurementViewState) && AbstractC22676k.m65745e(this.segmentalAnalysisViewState, c1037p0.segmentalAnalysisViewState) && AbstractC22676k.m65745e(this.recordedData, c1037p0.recordedData) && this.successSavingManualMeasurement == c1037p0.successSavingManualMeasurement && AbstractC22676k.m65745e(this.upsellCard, c1037p0.upsellCard) && this.isHidden == c1037p0.isHidden && AbstractC22676k.m65745e(this.trendMenuList, c1037p0.trendMenuList) && AbstractC22676k.m65745e(this.cardioFitnessLevel, c1037p0.cardioFitnessLevel) && AbstractC22676k.m65745e(this.metricEducationList, c1037p0.metricEducationList) && AbstractC22676k.m65745e(this.infoCalloutList, c1037p0.infoCalloutList) && AbstractC22676k.m65745e(this.manualMeasurementTextDisplay, c1037p0.manualMeasurementTextDisplay) && AbstractC22676k.m65745e(this.trendMenus, c1037p0.trendMenus) && AbstractC22676k.m65745e(this.additionalInfoText, c1037p0.additionalInfoText) && AbstractC22676k.m65745e(this.manualMeasurementRecords, c1037p0.manualMeasurementRecords) && this.successDeleteMeasurement == c1037p0.successDeleteMeasurement && AbstractC22676k.m65745e(this.screenContextMetadata, c1037p0.screenContextMetadata) && AbstractC22676k.m65745e(this.designItems, c1037p0.designItems);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C16934f getEducationCarouselModel() {
        return this.educationCarouselModel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C1032n getEmptyState() {
        return this.emptyState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C21395c getGraphState() {
        return this.graphState;
    }

    public int hashCode() {
        int iHashCode = (this.interTrendNavigationState.hashCode() + ((this.dateSelectorState.hashCode() + ((this.segmentControlState.hashCode() + AbstractC31061c.m95625a(AbstractC11895b.m31983b(this.toolbarState.hashCode() * 31, 31, this.keyMetricTileState), this.restorativeSleepLabelField, 31)) * 31)) * 31)) * 31;
        C3808h c3808h = this.breakdownBarState;
        int iHashCode2 = (iHashCode + (c3808h == null ? 0 : c3808h.hashCode())) * 31;
        C21395c c21395c = this.graphState;
        int iHashCode3 = (iHashCode2 + (c21395c == null ? 0 : c21395c.hashCode())) * 31;
        C30885c c30885c = this.metricEducationState;
        int iHashCode4 = (this.emptyState.hashCode() + ((iHashCode3 + (c30885c == null ? 0 : c30885c.hashCode())) * 31)) * 31;
        TextResource textResource = this.vow;
        int iHashCode5 = (iHashCode4 + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C32048d c32048d = this.whoopCoachVow;
        int iHashCode6 = (this.metaData.hashCode() + ((iHashCode5 + (c32048d == null ? 0 : c32048d.hashCode())) * 31)) * 31;
        TextResource textResource2 = this.infoCalloutDisplay;
        int iHashCode7 = (iHashCode6 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        List<C1036p> list = this.legend;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        C16934f c16934f = this.educationCarouselModel;
        int iHashCode9 = (iHashCode8 + (c16934f == null ? 0 : c16934f.hashCode())) * 31;
        C22160d c22160d = this.integrationsUpsellState;
        int iHashCode10 = (iHashCode9 + (c22160d == null ? 0 : c22160d.hashCode())) * 31;
        C39282o c39282o = this.manualMeasurementItem;
        int iHashCode11 = (iHashCode10 + (c39282o == null ? 0 : c39282o.hashCode())) * 31;
        C39282o c39282o2 = this.seeAllDataItem;
        int iHashCode12 = (iHashCode11 + (c39282o2 == null ? 0 : c39282o2.hashCode())) * 31;
        C1034o c1034o = this.lastUpdatedViewState;
        int iHashCode13 = (iHashCode12 + (c1034o == null ? 0 : c1034o.hashCode())) * 31;
        C4819g c4819g = this.manualMeasurementViewState;
        int iHashCode14 = (iHashCode13 + (c4819g == null ? 0 : c4819g.hashCode())) * 31;
        C3471r0 c3471r0 = this.segmentalAnalysisViewState;
        int iHashCode15 = (iHashCode14 + (c3471r0 == null ? 0 : c3471r0.hashCode())) * 31;
        AbstractC4825m abstractC4825m = this.recordedData;
        int iM8289b = AbstractC2875y.m8289b((iHashCode15 + (abstractC4825m == null ? 0 : abstractC4825m.hashCode())) * 31, 31, this.successSavingManualMeasurement);
        C16550q c16550q = this.upsellCard;
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b((iM8289b + (c16550q == null ? 0 : c16550q.hashCode())) * 31, 31, this.isHidden), 31, this.trendMenuList);
        C3438f c3438f = this.cardioFitnessLevel;
        int iHashCode16 = (iM31983b + (c3438f == null ? 0 : c3438f.hashCode())) * 31;
        List<C30885c> list2 = this.metricEducationList;
        int iHashCode17 = (iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<C4092p2> list3 = this.infoCalloutList;
        int iHashCode18 = (iHashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        TextResource textResource3 = this.manualMeasurementTextDisplay;
        int iHashCode19 = (iHashCode18 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        List<C1048y> list4 = this.trendMenus;
        int iHashCode20 = (iHashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        C36613b c36613b = this.additionalInfoText;
        int iHashCode21 = (iHashCode20 + (c36613b == null ? 0 : c36613b.hashCode())) * 31;
        AbstractC4830r abstractC4830r = this.manualMeasurementRecords;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode21 + (abstractC4830r == null ? 0 : abstractC4830r.hashCode())) * 31, 31, this.successDeleteMeasurement);
        C13404j c13404j = this.screenContextMetadata;
        return this.designItems.hashCode() + ((iM8289b2 + (c13404j != null ? c13404j.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getInfoCalloutDisplay() {
        return this.infoCalloutDisplay;
    }

    /* JADX INFO: renamed from: j */
    public final List<C4092p2> m2954j() {
        return this.infoCalloutList;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C22160d getIntegrationsUpsellState() {
        return this.integrationsUpsellState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C3470r getInterTrendNavigationState() {
        return this.interTrendNavigationState;
    }

    /* JADX INFO: renamed from: m */
    public final List<C3458l1> m2957m() {
        return this.keyMetricTileState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C1034o getLastUpdatedViewState() {
        return this.lastUpdatedViewState;
    }

    /* JADX INFO: renamed from: o */
    public final List<C1036p> m2959o() {
        return this.legend;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C39282o getManualMeasurementItem() {
        return this.manualMeasurementItem;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final AbstractC4830r getManualMeasurementRecords() {
        return this.manualMeasurementRecords;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final TextResource getManualMeasurementTextDisplay() {
        return this.manualMeasurementTextDisplay;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final C4819g getManualMeasurementViewState() {
        return this.manualMeasurementViewState;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final C1013d0 getMetaData() {
        return this.metaData;
    }

    public String toString() {
        AbstractC6721d abstractC6721d = this.toolbarState;
        List<C3458l1> list = this.keyMetricTileState;
        TextResource textResource = this.restorativeSleepLabelField;
        C1047x c1047x = this.segmentControlState;
        C17863f c17863f = this.dateSelectorState;
        C3470r c3470r = this.interTrendNavigationState;
        C3808h c3808h = this.breakdownBarState;
        C21395c c21395c = this.graphState;
        C30885c c30885c = this.metricEducationState;
        C1032n c1032n = this.emptyState;
        TextResource textResource2 = this.vow;
        C32048d c32048d = this.whoopCoachVow;
        C1013d0 c1013d0 = this.metaData;
        TextResource textResource3 = this.infoCalloutDisplay;
        List<C1036p> list2 = this.legend;
        C16934f c16934f = this.educationCarouselModel;
        C22160d c22160d = this.integrationsUpsellState;
        C39282o c39282o = this.manualMeasurementItem;
        C39282o c39282o2 = this.seeAllDataItem;
        C1034o c1034o = this.lastUpdatedViewState;
        C4819g c4819g = this.manualMeasurementViewState;
        C3471r0 c3471r0 = this.segmentalAnalysisViewState;
        AbstractC4825m abstractC4825m = this.recordedData;
        boolean z4 = this.successSavingManualMeasurement;
        C16550q c16550q = this.upsellCard;
        boolean z13 = this.isHidden;
        List<C39282o> list3 = this.trendMenuList;
        C3438f c3438f = this.cardioFitnessLevel;
        List<C30885c> list4 = this.metricEducationList;
        List<C4092p2> list5 = this.infoCalloutList;
        TextResource textResource4 = this.manualMeasurementTextDisplay;
        List<C1048y> list6 = this.trendMenus;
        C36613b c36613b = this.additionalInfoText;
        AbstractC4830r abstractC4830r = this.manualMeasurementRecords;
        boolean z14 = this.successDeleteMeasurement;
        C13404j c13404j = this.screenContextMetadata;
        List<InterfaceC25312u> list7 = this.designItems;
        StringBuilder sb4 = new StringBuilder("TrendsScreenStateV3(toolbarState=");
        sb4.append(abstractC6721d);
        sb4.append(", keyMetricTileState=");
        sb4.append(list);
        sb4.append(", restorativeSleepLabelField=");
        sb4.append(textResource);
        sb4.append(", segmentControlState=");
        sb4.append(c1047x);
        sb4.append(", dateSelectorState=");
        sb4.append(c17863f);
        sb4.append(", interTrendNavigationState=");
        sb4.append(c3470r);
        sb4.append(", breakdownBarState=");
        sb4.append(c3808h);
        sb4.append(", graphState=");
        sb4.append(c21395c);
        sb4.append(", metricEducationState=");
        sb4.append(c30885c);
        sb4.append(", emptyState=");
        sb4.append(c1032n);
        sb4.append(", vow=");
        sb4.append(textResource2);
        sb4.append(", whoopCoachVow=");
        sb4.append(c32048d);
        sb4.append(", metaData=");
        sb4.append(c1013d0);
        sb4.append(", infoCalloutDisplay=");
        sb4.append(textResource3);
        sb4.append(", legend=");
        sb4.append(list2);
        sb4.append(", educationCarouselModel=");
        sb4.append(c16934f);
        sb4.append(", integrationsUpsellState=");
        sb4.append(c22160d);
        sb4.append(", manualMeasurementItem=");
        sb4.append(c39282o);
        sb4.append(", seeAllDataItem=");
        sb4.append(c39282o2);
        sb4.append(", lastUpdatedViewState=");
        sb4.append(c1034o);
        sb4.append(", manualMeasurementViewState=");
        sb4.append(c4819g);
        sb4.append(", segmentalAnalysisViewState=");
        sb4.append(c3471r0);
        sb4.append(", recordedData=");
        sb4.append(abstractC4825m);
        sb4.append(", successSavingManualMeasurement=");
        sb4.append(z4);
        sb4.append(", upsellCard=");
        sb4.append(c16550q);
        sb4.append(", isHidden=");
        sb4.append(z13);
        sb4.append(", trendMenuList=");
        sb4.append(list3);
        sb4.append(", cardioFitnessLevel=");
        sb4.append(c3438f);
        sb4.append(", metricEducationList=");
        AbstractC21702c.m61148s(sb4, list4, ", infoCalloutList=", list5, ", manualMeasurementTextDisplay=");
        AbstractC21702c.m61143n(textResource4, ", trendMenus=", ", additionalInfoText=", sb4, list6);
        sb4.append(c36613b);
        sb4.append(", manualMeasurementRecords=");
        sb4.append(abstractC4830r);
        sb4.append(", successDeleteMeasurement=");
        sb4.append(z14);
        sb4.append(", screenContextMetadata=");
        sb4.append(c13404j);
        sb4.append(", designItems=");
        return AbstractC3855a.m11829m(sb4, list7, ")");
    }

    /* JADX INFO: renamed from: u */
    public final List<C30885c> m2965u() {
        return this.metricEducationList;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final C30885c getMetricEducationState() {
        return this.metricEducationState;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final AbstractC4825m getRecordedData() {
        return this.recordedData;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final C13404j getScreenContextMetadata() {
        return this.screenContextMetadata;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final C39282o getSeeAllDataItem() {
        return this.seeAllDataItem;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final C1047x getSegmentControlState() {
        return this.segmentControlState;
    }
}
