package md0;

import a01.C0088h;
import a01.EnumC0093m;
import c41.C4092p2;
import cf0.C4538a;
import cf0.C4540c;
import com.whoop.advancedlabs.domain.models.AdvancedLabsRecordData;
import com.whoop.advancedlabs.domain.models.AdvancedLabsRecordingSection;
import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.AppointmentInfoCardModel;
import com.whoop.advancedlabs.domain.models.AppointmentSummaryAddToCalendarDataModel;
import com.whoop.advancedlabs.domain.models.AppointmentSummaryChecklistItemModel;
import com.whoop.advancedlabs.domain.models.AppointmentSummaryModel;
import com.whoop.advancedlabs.domain.models.BiomarkerStatusModel;
import com.whoop.advancedlabs.domain.models.BiomarkerTrendSegmentModel;
import com.whoop.advancedlabs.domain.models.BiomarkersListBottomSheet;
import com.whoop.advancedlabs.domain.models.BiomarkersListFilterData;
import com.whoop.advancedlabs.domain.models.BiomarkersListFilterOption;
import com.whoop.advancedlabs.domain.models.BiomarkersListSortData;
import com.whoop.advancedlabs.domain.models.BiomarkersListSortOption;
import com.whoop.advancedlabs.domain.models.CancelRescheduleDialogModel;
import com.whoop.advancedlabs.domain.models.CategoricalBiomarkerDetailsModel;
import com.whoop.advancedlabs.domain.models.ChecklistCardModel;
import com.whoop.advancedlabs.domain.models.ChecklistStepModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCardHeaderModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCardItemModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCardModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCtaTileModel;
import com.whoop.advancedlabs.domain.models.CollectionMethodTileModel;
import com.whoop.advancedlabs.domain.models.HealthspanImpactCardModel;
import com.whoop.advancedlabs.domain.models.ImageSplitContainerModel;
import com.whoop.advancedlabs.domain.models.ImageSplitItemModel;
import com.whoop.advancedlabs.domain.models.InsightsSectionHeaderModel;
import com.whoop.advancedlabs.domain.models.LabsTestItemModel;
import com.whoop.advancedlabs.domain.models.LabsTestListCalloutModel;
import com.whoop.advancedlabs.domain.models.LabsTestSelectionItemModel;
import com.whoop.advancedlabs.domain.models.LabsTestSelectionModel;
import com.whoop.advancedlabs.domain.models.PanelUpsellDrawerModel;
import com.whoop.advancedlabs.domain.models.PromotionalBiomarkerPieChartModel;
import com.whoop.advancedlabs.domain.models.ReferenceIdStyle;
import com.whoop.advancedlabs.domain.models.RemainingTestsCalloutModel;
import com.whoop.advancedlabs.domain.models.SchedulePillModel;
import com.whoop.advancedlabs.domain.models.SchedulingDatePickerModel;
import com.whoop.advancedlabs.domain.models.SchedulingTileModel;
import com.whoop.advancedlabs.domain.models.SearchableBiomarkersListModel;
import com.whoop.advancedlabs.domain.models.SpecializedPanelUpsellTileModel;
import com.whoop.advancedlabs.domain.models.TestHeaderModel;
import com.whoop.advancedlabs.domain.models.TestTileModel;
import com.whoop.advancedlabs.domain.models.TitleSectionModel;
import com.whoop.advancedlabs.domain.models.WhatsIncludedCardModel;
import com.whoop.advancedlabs.domain.models.WhatsIncludedItemModel;
import com.whoop.advancedlabs.feature.galleri.models.HorizontalImagePagerItem;
import com.whoop.advancedlabs.feature.galleri.models.HorizontalImagePagerModel;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadInfoTileItemModel;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadInfoTileModel;
import com.whoop.design.models.AppointmentButtonModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.items.BiomarkerCardModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.UnknownDesignModel;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e81.C12827f0;
import fc0.C14357a;
import fc0.C14358b;
import fc0.C14364h;
import gb1.AbstractC15673b0;
import ge0.C15726a;
import ge0.C15729d;
import ge0.C15731f;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import h11.C16606a;
import h11.C16613h;
import h11.EnumC16612g;
import h51.C16934f;
import hy0.C17731c2;
import hy0.C17736e;
import hy0.C17750h1;
import i11.C17863f;
import j21.C21242a;
import j21.C21250i;
import j71.C21395c;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import jf0.C21638a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kf0.C22434i;
import kf0.C22436k;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ld0.C23842a;
import ld0.C23843b;
import ld0.C23844c;
import ld0.C23845d;
import ld0.C23846e;
import ld0.C23847f;
import ld0.C23848g;
import ld0.C23850i;
import ld0.C23851j;
import ld0.C23852k;
import ld0.C23853l;
import ld0.C23854m;
import ld0.C23856o;
import ld0.C23857p;
import ld0.C23858q;
import ld0.C23859r;
import ld0.C23860s;
import ld0.C23861t;
import ld0.EnumC23849h;
import lf0.C23894a;
import lf0.C23896a1;
import lf0.C23897a2;
import lf0.C23900b1;
import lf0.C23902c;
import lf0.C23903c0;
import lf0.C23907d0;
import lf0.C23908d1;
import lf0.C23910e;
import lf0.C23913e2;
import lf0.C23914f;
import lf0.C23915f0;
import lf0.C23916f1;
import lf0.C23919g0;
import lf0.C23921g2;
import lf0.C23922h;
import lf0.C23923h0;
import lf0.C23928i1;
import lf0.C23930j;
import lf0.C23931j0;
import lf0.C23932j1;
import lf0.C23933j2;
import lf0.C23935k0;
import lf0.C23936k1;
import lf0.C23941l2;
import lf0.C23942m;
import lf0.C23943m0;
import lf0.C23944m1;
import lf0.C23945m2;
import lf0.C23946n;
import lf0.C23947n0;
import lf0.C23948n1;
import lf0.C23953o2;
import lf0.C23955p0;
import lf0.C23957p2;
import lf0.C23958q;
import lf0.C23960q1;
import lf0.C23963r0;
import lf0.C23965r2;
import lf0.C23966s;
import lf0.C23969s2;
import lf0.C23972t1;
import lf0.C23973u;
import lf0.C23974u0;
import lf0.C23975u1;
import lf0.C23976v;
import lf0.C23979w;
import lf0.C23980w0;
import lf0.C23981w1;
import lf0.C23983x0;
import lf0.C23985y;
import lf0.C23986y0;
import lf0.C23987y1;
import lf0.C23988z;
import lf0.EnumC23912e1;
import m83.AbstractC25267u;
import m83.C25271y;
import ma0.AbstractC25367a;
import ma1.C25371a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import ny0.C27273p0;
import p291l0.AbstractC22977m;
import p291l0.C22949e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23613d4;
import p716lb1.AbstractC23624f1;
import p716lb1.AbstractC23632g2;
import p716lb1.AbstractC23698q3;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import vb1.AbstractC35869b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: md0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\"\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u001a\u0010*\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&\"\u001a\u0010-\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&\"\u001b\u00103\u001a\u00020.8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u001a\u00109\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, m65681d2 = {"Llb1/z0;", "Ll83/a0;", "M", "(Llb1/z0;)V", "Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;", "Lld0/t;", "F0", "(Lcom/whoop/advancedlabs/domain/models/TestHeaderModel;)Lld0/t;", "Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;", "Lld0/d;", "D0", "(Lcom/whoop/advancedlabs/domain/models/AppointmentSummaryModel;)Lld0/d;", "Lcom/whoop/advancedlabs/domain/models/ImageSplitItemModel;", "Llf0/x0;", "E0", "(Lcom/whoop/advancedlabs/domain/models/ImageSplitItemModel;)Llf0/x0;", "Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;", "", "index", "Lge0/a;", "G0", "(Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;I)Lge0/a;", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;", "Lld0/g;", "H0", "(Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;)Lld0/g;", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListSortData;", "Lld0/j;", "I0", "(Lcom/whoop/advancedlabs/domain/models/BiomarkersListSortData;)Lld0/j;", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListFilterData;", "Lld0/l;", "J0", "(Lcom/whoop/advancedlabs/domain/models/BiomarkersListFilterData;)Lld0/l;", "Ljb1/a;", "a", "Ljb1/a;", "C0", "()Ljb1/a;", "baseDesignItemReducer", "b", "z0", "advancedLabsDesignItemReducer", "c", "getAdvancedLabsSectionDependentReducer", "advancedLabsSectionDependentReducer", "Llb1/y0;", "d", "Ll83/h;", "A0", "()Llb1/y0;", "advancedLabsDesignModelMapper", "Lm91/p;", "e", "Lm91/p;", "B0", "()Lm91/p;", "advancedLabsItemViewFactory", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25448c {

    /* JADX INFO: renamed from: a */
    private static final C21535a f99646a = AbstractC21537c.m60554d(new C25446a(0));

    /* JADX INFO: renamed from: b */
    private static final C21535a f99647b = AbstractC21537c.m60554d(new C25446a(11));

    /* JADX INFO: renamed from: c */
    private static final C21535a f99648c = AbstractC21537c.m60554d(new C25446a(22));

    /* JADX INFO: renamed from: d */
    private static final InterfaceC23462h f99649d;

    /* JADX INFO: renamed from: e */
    private static final C25307p f99650e;

    /* JADX INFO: renamed from: md0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99651w;

        public a(Function1 function1) {
            this.f99651w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99651w.invoke((CollectionMethodTileModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$a0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99652w;

        public a0(Function1 function1) {
            this.f99652w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99652w.invoke((TitleSectionModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99653w;

        public b(Function1 function1) {
            this.f99653w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99653w.invoke((ClinicalReportCardHeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$b0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99654w;

        public b0(Function1 function1) {
            this.f99654w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99654w.invoke((TestTileModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99655w;

        public c(Function1 function1) {
            this.f99655w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99655w.invoke((ClinicalReportCtaTileModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$c0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c0 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99656a;

        static {
            int[] iArr = new int[ReferenceIdStyle.values().length];
            try {
                iArr[ReferenceIdStyle.GENERATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f99656a = iArr;
        }
    }

    /* JADX INFO: renamed from: md0.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99657w;

        public d(Function1 function1) {
            this.f99657w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99657w.invoke((ClinicalReportCardModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$d0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99658w;

        public d0(Function1 function1) {
            this.f99658w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99658w.invoke((AdvancedLabsSectionModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99659w;

        public e(Function1 function1) {
            this.f99659w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99659w.invoke((LabsTestItemModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$e0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99660w;

        public e0(Function1 function1) {
            this.f99660w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99660w.invoke((AdvancedLabsRecordingSection) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99661w;

        public f(Function1 function1) {
            this.f99661w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99661w.invoke((LabsTestListCalloutModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$f0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99662w;

        public f0(Function1 function1) {
            this.f99662w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99662w.invoke((HorizontalImagePagerModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99663w;

        public g(Function1 function1) {
            this.f99663w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99663w.invoke((LabsTestSelectionModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$g0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C16934f.m47677b((C16934f) it, null, null, null, null, null, null, false, false, null, null, null, null, false, 3967, null);
        }
    }

    /* JADX INFO: renamed from: md0.c$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99664w;

        public h(Function1 function1) {
            this.f99664w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99664w.invoke((CategoricalBiomarkerDetailsModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$h0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0 implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C27273p0 c27273p0 = (C27273p0) it;
            return c27273p0.m82257a((15359 & 1) != 0 ? c27273p0.text : null, (15359 & 2) != 0 ? c27273p0.navigationAction : null, (15359 & 4) != 0 ? c27273p0.leftIcon : null, (15359 & 8) != 0 ? c27273p0.rightIcon : null, (15359 & 16) != 0 ? c27273p0.tint : null, (15359 & 32) != 0 ? c27273p0.tintGradient : p712j91.Function1.m60318a(AbstractC15673b0.m43972A()), (15359 & 64) != 0 ? c27273p0.useTextPadding : false, (15359 & 128) != 0 ? c27273p0.actionArgument : null, (15359 & 256) != 0 ? c27273p0.analyticEvent : null, (15359 & 512) != 0 ? c27273p0.dismissEvent : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c27273p0.alignment : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c27273p0.trimStartGutter : false, (15359 & 4096) != 0 ? c27273p0.style : null, (15359 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c27273p0.enabled : false);
        }
    }

    /* JADX INFO: renamed from: md0.c$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99665w;

        public i(Function1 function1) {
            this.f99665w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99665w.invoke((BiomarkerTrendSegmentModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$i0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C27256h.m82144b((C27256h) it, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
        }
    }

    /* JADX INFO: renamed from: md0.c$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99666w;

        public j(Function1 function1) {
            this.f99666w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99666w.invoke((SearchableBiomarkersListModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99667w;

        public k(Function1 function1) {
            this.f99667w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99667w.invoke((AppointmentSummaryModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99668w;

        public l(Function1 function1) {
            this.f99668w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99668w.invoke((AdvancedLabsRecordData) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99669w;

        public m(Function1 function1) {
            this.f99669w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99669w.invoke((ChecklistCardModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99670w;

        public n(Function1 function1) {
            this.f99670w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99670w.invoke((ImageSplitContainerModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99671w;

        public o(Function1 function1) {
            this.f99671w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99671w.invoke((WhatsIncludedCardModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99672w;

        public p(Function1 function1) {
            this.f99672w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99672w.invoke((TestUploadInfoTileModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99673w;

        public q(Function1 function1) {
            this.f99673w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99673w.invoke((SchedulingTileModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99674w;

        public r(Function1 function1) {
            this.f99674w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99674w.invoke((PromotionalBiomarkerPieChartModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99675w;

        public s(Function1 function1) {
            this.f99675w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99675w.invoke((SpecializedPanelUpsellTileModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$t */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99676w;

        public t(Function1 function1) {
            this.f99676w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99676w.invoke((PanelUpsellDrawerModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99677w;

        public u(Function1 function1) {
            this.f99677w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99677w.invoke((AppointmentInfoCardModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99678w;

        public v(Function1 function1) {
            this.f99678w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99678w.invoke((AppointmentSummaryChecklistItemModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99679w;

        public w(Function1 function1) {
            this.f99679w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99679w.invoke((RemainingTestsCalloutModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99680w;

        public x(Function1 function1) {
            this.f99680w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99680w.invoke((HealthspanImpactCardModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99681w;

        public y(Function1 function1) {
            this.f99681w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99681w.invoke((SchedulingDatePickerModel) it);
        }
    }

    /* JADX INFO: renamed from: md0.c$z */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f99682w;

        public z(Function1 function1) {
            this.f99682w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99682w.invoke((InsightsSectionHeaderModel) it);
        }
    }

    static {
        int i13 = 1;
        f99649d = AbstractC30060g.m92088H(new C25371a(i13));
        f99650e = p720m91.Function1.m74306g(new C25447b(i13));
    }

    /* JADX INFO: renamed from: A0 */
    public static final C23743y0 m74676A0() {
        return (C23743y0) f99649d.getValue();
    }

    /* JADX INFO: renamed from: B0 */
    public static final C25307p m74678B0() {
        return f99650e;
    }

    /* JADX INFO: renamed from: C0 */
    public static final C21535a m74680C0() {
        return f99646a;
    }

    /* JADX INFO: renamed from: D0 */
    private static final C23845d m74682D0(AppointmentSummaryModel appointmentSummaryModel) {
        TestHeaderModel header = appointmentSummaryModel.getHeader();
        return new C23845d(header != null ? m74686F0(header) : null, appointmentSummaryModel.getDateLabel(), appointmentSummaryModel.getDateValue(), appointmentSummaryModel.getTimeLabel(), appointmentSummaryModel.getTimeValue(), appointmentSummaryModel.getLocationLabel(), appointmentSummaryModel.getLocationValue(), appointmentSummaryModel.getConfirmationLabel(), appointmentSummaryModel.getConfirmationValue(), appointmentSummaryModel.getReferenceIdLabel(), appointmentSummaryModel.getReferenceIdValue(), appointmentSummaryModel.getConfirmationNumberBottomSheet(), appointmentSummaryModel.getReferenceNumberBottomSheet(), appointmentSummaryModel.getConfirmationNumberBottomSheet() != null ? EnumC16313m0.TINY_INFORMATION : null, appointmentSummaryModel.getReferenceNumberBottomSheet() != null ? EnumC16313m0.TINY_INFORMATION : null, c0.f99656a[appointmentSummaryModel.getReferenceIdStyle().ordinal()] == 1 ? EnumC39333f.RECOVERY : EnumC39333f.BRAND_WHITE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX INFO: renamed from: E0 */
    private static final C23983x0 m74684E0(ImageSplitItemModel imageSplitItemModel) {
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        String title = imageSplitItemModel.getTitle();
        String titleColor = imageSplitItemModel.getTitleColor();
        if (titleColor != null) {
            enumC39333f = EnumC39333f.BRAND_WHITE;
            EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
            int length = enumC39333fArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC39333f2 = null;
                    break;
                }
                enumC39333f2 = enumC39333fArrValues[i13];
                if (AbstractC22676k.m65745e(enumC39333f2.name(), titleColor)) {
                    break;
                }
                i13++;
            }
            if (enumC39333f2 != null) {
                enumC39333f = enumC39333f2;
            }
            if (enumC39333f == null) {
                enumC39333f = EnumC39333f.BRAND_WHITE;
            }
        } else {
            enumC39333f = EnumC39333f.BRAND_WHITE;
        }
        return new C23983x0(title, enumC39333f, imageSplitItemModel.getSubtitle(), new AbstractC22403o.c(imageSplitItemModel.getImageUrl(), 0, 0, 0, 14, null));
    }

    /* JADX INFO: renamed from: F0 */
    private static final C23861t m74686F0(TestHeaderModel testHeaderModel) {
        return new C23861t(new AbstractC22403o.c(testHeaderModel.getImageUrl(), 0, 0, 0, 14, null), testHeaderModel.getTitle());
    }

    /* JADX INFO: renamed from: G0 */
    private static final C15726a m74688G0(SchedulePillModel schedulePillModel, int i13) {
        EnumC16612g enumC16612g;
        String selectionDisplay = schedulePillModel.getSelectionDisplay();
        List<SchedulingTileModel> scheduleTiles = schedulePillModel.getScheduleTiles();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(scheduleTiles, 10));
        Iterator<T> it = scheduleTiles.iterator();
        while (it.hasNext()) {
            arrayList.add(f99648c.m60541h((SchedulingTileModel) it.next()));
        }
        C16606a c16606a = new C16606a(schedulePillModel.getDateDisplay().getDay(), String.valueOf(schedulePillModel.getDateDisplay().getDate()));
        String style = schedulePillModel.getStyle();
        EnumC16612g enumC16612g2 = EnumC16612g.NO_APPOINTMENTS;
        EnumC16612g[] enumC16612gArrValues = EnumC16612g.values();
        int length = enumC16612gArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC16612g = null;
                break;
            }
            enumC16612g = enumC16612gArrValues[i14];
            if (AbstractC22676k.m65745e(enumC16612g.name(), style)) {
                break;
            }
            i14++;
        }
        if (enumC16612g == null) {
            enumC16612g = enumC16612g2;
        }
        C16613h c16613h = new C16613h(c16606a, null, false, enumC16612g, "", Long.valueOf(i13), null, true, false, null, null, null, false, null, 16194, null);
        InfoCalloutTileModel infoCallout = schedulePillModel.getInfoCallout();
        return new C15726a(selectionDisplay, arrayList, c16613h, infoCallout != null ? f99648c.m60541h(infoCallout) : null);
    }

    /* JADX INFO: renamed from: H0 */
    private static final C23848g m74690H0(BiomarkersListBottomSheet biomarkersListBottomSheet) {
        C23847f c23847f = new C23847f(biomarkersListBottomSheet.getEntryPoint().getTitle(), AbstractC16315n0.m46377b(biomarkersListBottomSheet.getEntryPoint().getRightIcon()));
        String title = biomarkersListBottomSheet.getTitle();
        BiomarkersListSortData sortData = biomarkersListBottomSheet.getSortData();
        C23851j c23851jM74692I0 = sortData != null ? m74692I0(sortData) : null;
        BiomarkersListFilterData statusFilters = biomarkersListBottomSheet.getStatusFilters();
        return new C23848g(c23847f, title, c23851jM74692I0, statusFilters != null ? m74694J0(statusFilters) : null);
    }

    /* JADX INFO: renamed from: I0 */
    private static final C23851j m74692I0(BiomarkersListSortData biomarkersListSortData) {
        EnumC23849h enumC23849h;
        String title = biomarkersListSortData.getTitle();
        List<BiomarkersListSortOption> options = biomarkersListSortData.getOptions();
        ArrayList arrayList = new ArrayList();
        for (BiomarkersListSortOption biomarkersListSortOption : options) {
            String id4 = biomarkersListSortOption.getId();
            EnumC23849h[] enumC23849hArrValues = EnumC23849h.values();
            int length = enumC23849hArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC23849h = null;
                    break;
                }
                enumC23849h = enumC23849hArrValues[i13];
                if (AbstractC22676k.m65745e(enumC23849h.name(), id4)) {
                    break;
                }
                i13++;
            }
            C23850i c23850i = enumC23849h != null ? new C23850i(enumC23849h, biomarkersListSortOption.getTitle()) : null;
            if (c23850i != null) {
                arrayList.add(c23850i);
            }
        }
        return new C23851j(title, arrayList);
    }

    /* JADX INFO: renamed from: J0 */
    private static final C23853l m74694J0(BiomarkersListFilterData biomarkersListFilterData) {
        EnumC0093m enumC0093m;
        String title = biomarkersListFilterData.getTitle();
        List<BiomarkersListFilterOption> options = biomarkersListFilterData.getOptions();
        ArrayList arrayList = new ArrayList();
        for (BiomarkersListFilterOption biomarkersListFilterOption : options) {
            String id4 = biomarkersListFilterOption.getId();
            EnumC0093m[] enumC0093mArrValues = EnumC0093m.values();
            int length = enumC0093mArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC0093m = null;
                    break;
                }
                enumC0093m = enumC0093mArrValues[i13];
                if (AbstractC22676k.m65745e(enumC0093m.name(), id4)) {
                    break;
                }
                i13++;
            }
            C23852k c23852k = enumC0093m != null ? new C23852k(enumC0093m, biomarkersListFilterOption.getTitle()) : null;
            if (c23852k != null) {
                arrayList.add(c23852k);
            }
        }
        return new C23853l(title, arrayList);
    }

    /* JADX INFO: renamed from: M */
    private static final void m74697M(C23749z0 c23749z0) {
        C25447b c25447b = new C25447b(4);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(AppointmentSummaryModel.class), new k(c25447b));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(AppointmentInfoCardModel.class), new u(new C25446a(9)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(AppointmentSummaryChecklistItemModel.class), new v(new C25446a(19)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(RemainingTestsCalloutModel.class), new w(new C25446a(20)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(HealthspanImpactCardModel.class), new x(new C25446a(21)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(SchedulingDatePickerModel.class), new y(new C25446a(23)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(InsightsSectionHeaderModel.class), new z(new C25446a(24)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(TitleSectionModel.class), new a0(new C25446a(25)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(TestTileModel.class), new b0(new C25446a(26)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(CollectionMethodTileModel.class), new a(new C25446a(27)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ClinicalReportCardHeaderModel.class), new b(new C25447b(5)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ClinicalReportCtaTileModel.class), new c(new C25447b(6)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ClinicalReportCardModel.class), new d(new C25446a(1)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(LabsTestItemModel.class), new e(new C25446a(2)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(LabsTestListCalloutModel.class), new f(new C25446a(3)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(LabsTestSelectionModel.class), new g(new C25446a(4)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(CategoricalBiomarkerDetailsModel.class), new h(new C25446a(5)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(BiomarkerTrendSegmentModel.class), new i(new C25446a(6)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(SearchableBiomarkersListModel.class), new j(new C25446a(7)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(AdvancedLabsRecordData.class), new l(new C25446a(8)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ChecklistCardModel.class), new m(new C25446a(10)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(ImageSplitContainerModel.class), new n(new C25446a(12)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(WhatsIncludedCardModel.class), new o(new C25446a(13)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(TestUploadInfoTileModel.class), new p(new C25446a(14)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(SchedulingTileModel.class), new q(new C25446a(15)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(PromotionalBiomarkerPieChartModel.class), new r(new C25446a(16)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(SpecializedPanelUpsellTileModel.class), new s(new C25446a(17)));
        c23749z0.m69765a(c22673i0.getOrCreateKotlinClass(PanelUpsellDrawerModel.class), new t(new C25446a(18)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23845d m74698N(AppointmentSummaryModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m74682D0(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23922h m74699O(AppointmentInfoCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        AppointmentSummaryModel appointmentSummary = model.getAppointmentSummary();
        TestHeaderModel header = model.getAppointmentSummary().getHeader();
        if (header == null) {
            header = model.getHeader();
        }
        return new C23922h(m74682D0(appointmentSummary.copy((16382 & 1) != 0 ? appointmentSummary.header : header, (16382 & 2) != 0 ? appointmentSummary.dateLabel : null, (16382 & 4) != 0 ? appointmentSummary.dateValue : null, (16382 & 8) != 0 ? appointmentSummary.timeLabel : null, (16382 & 16) != 0 ? appointmentSummary.timeValue : null, (16382 & 32) != 0 ? appointmentSummary.locationLabel : null, (16382 & 64) != 0 ? appointmentSummary.locationValue : null, (16382 & 128) != 0 ? appointmentSummary.confirmationLabel : null, (16382 & 256) != 0 ? appointmentSummary.confirmationValue : null, (16382 & 512) != 0 ? appointmentSummary.referenceIdLabel : null, (16382 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? appointmentSummary.referenceIdValue : null, (16382 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? appointmentSummary.referenceNumberBottomSheet : null, (16382 & 4096) != 0 ? appointmentSummary.confirmationNumberBottomSheet : null, (16382 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? appointmentSummary.referenceIdStyle : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23915f0 m74700P(ClinicalReportCardHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        String supertitle = model.getSupertitle();
        String profileImageUrl = model.getProfileImageUrl();
        int i13 = AbstractC25367a.f99427a;
        AbstractC22403o.c cVar = new AbstractC22403o.c(profileImageUrl, i13, 0, i13, 4, null);
        String badgeIcon = model.getBadgeIcon();
        EnumC16313m0 enumC16313m0M46377b = badgeIcon != null ? AbstractC16315n0.m46377b(badgeIcon) : null;
        String signatureImageUrl = model.getSignatureImageUrl();
        return new C23915f0(title, supertitle, cVar, enumC16313m0M46377b, signatureImageUrl != null ? AbstractC22404p.m64503l(signatureImageUrl) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23943m0 m74701Q(ClinicalReportCtaTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C23943m0(model.getId(), AbstractC22404p.m64503l(model.getImageUrl()), model.getTitle(), model.getDescription(), AbstractC23613d4.m68666p(model.getCta()), model.getReportUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23931j0 m74702R(ClinicalReportCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        String title2 = model.getHeader().getTitle();
        String supertitle = model.getHeader().getSupertitle();
        String profileImageUrl = model.getHeader().getProfileImageUrl();
        int i13 = AbstractC25367a.f99427a;
        AbstractC22403o.c cVar = new AbstractC22403o.c(profileImageUrl, i13, 0, i13, 4, null);
        String badgeIcon = model.getHeader().getBadgeIcon();
        C27256h c27256h = null;
        EnumC16313m0 enumC16313m0M46377b = badgeIcon != null ? AbstractC16315n0.m46377b(badgeIcon) : null;
        String signatureImageUrl = model.getHeader().getSignatureImageUrl();
        C23915f0 c23915f0 = new C23915f0(title2, supertitle, cVar, enumC16313m0M46377b, signatureImageUrl != null ? AbstractC22404p.m64503l(signatureImageUrl) : null);
        List<ClinicalReportCardItemModel> items = model.getBody().getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (ClinicalReportCardItemModel clinicalReportCardItemModel : items) {
            String id5 = clinicalReportCardItemModel.getId();
            String title3 = clinicalReportCardItemModel.getTitle();
            InterfaceC25312u interfaceC25312uM60541h = f99646a.m60541h(clinicalReportCardItemModel.getTrend());
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TrendViewState");
            C17731c2 c17731c2 = (C17731c2) interfaceC25312uM60541h;
            String icon = clinicalReportCardItemModel.getIcon();
            arrayList.add(new C23923h0(id5, title3, c17731c2, icon != null ? AbstractC16315n0.m46377b(icon) : null, clinicalReportCardItemModel.getDestination()));
        }
        CardButtonModel button = model.getBody().getButton();
        if (button != null) {
            InterfaceC25312u interfaceC25312uM60541h2 = f99646a.m60541h(button);
            AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
            c27256h = (C27256h) interfaceC25312uM60541h2;
        }
        return new C23931j0(id4, title, c23915f0, new C23903c0(arrayList, c27256h), false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23908d1 m74703S(LabsTestItemModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        EnumC23912e1 enumC23912e1;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        String subtitle = model.getSubtitle();
        String leftIcon = model.getLeftIcon();
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC16313m0 = null;
                break;
            }
            EnumC16313m0 enumC16313m2 = enumC16313m0ArrValues[i14];
            if (AbstractC22676k.m65745e(enumC16313m2.name(), leftIcon)) {
                enumC16313m0 = enumC16313m2;
                break;
            }
            i14++;
        }
        String rightIcon = model.getRightIcon();
        if (rightIcon == null) {
            enumC16313m1 = null;
            break;
        }
        EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
        int length2 = enumC16313m0ArrValues2.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length2) {
                enumC16313m1 = null;
                break;
            }
            enumC16313m1 = enumC16313m0ArrValues2[i15];
            if (AbstractC22676k.m65745e(enumC16313m1.name(), rightIcon)) {
                break;
            }
            i15++;
        }
        String style = model.getStyle();
        EnumC23912e1 enumC23912e2 = EnumC23912e1.DEFAULT;
        EnumC23912e1[] enumC23912e1ArrValues = EnumC23912e1.values();
        int length3 = enumC23912e1ArrValues.length;
        while (true) {
            if (i13 >= length3) {
                enumC23912e1 = null;
                break;
            }
            enumC23912e1 = enumC23912e1ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC23912e1.name(), style)) {
                break;
            }
            i13++;
        }
        EnumC23912e1 enumC23912e3 = enumC23912e1 == null ? enumC23912e2 : enumC23912e1;
        String warning = model.getWarning();
        C9598e destination = model.getDestination();
        String imageUrl = model.getImageUrl();
        return new C23908d1(id4, title, subtitle, enumC16313m0, enumC16313m1, enumC23912e3, warning, destination, imageUrl != null ? AbstractC22404p.m64503l(imageUrl) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23928i1 m74704T(LabsTestListCalloutModel model) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        InterfaceC25312u interfaceC25312uM60541h = f99646a.m60541h(model.getSecondaryButton());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.SecondaryButtonViewState");
        C27273p0 c27273p0 = (C27273p0) interfaceC25312uM60541h;
        List<LabsTestItemModel> testItems = model.getTestItems();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(testItems, 10));
        Iterator<T> it = testItems.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h2 = f99648c.m60541h((LabsTestItemModel) it.next());
            AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.advancedlabs.view.components.LabsTestItemState");
            arrayList2.add((C23908d1) interfaceC25312uM60541h2);
        }
        String expandText = model.getExpandText();
        String secondaryTitle = model.getSecondaryTitle();
        List<LabsTestItemModel> secondaryTestItems = model.getSecondaryTestItems();
        if (secondaryTestItems != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = secondaryTestItems.iterator();
            while (it3.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h3 = f99648c.m60541h((LabsTestItemModel) it3.next());
                C23908d1 c23908d1 = interfaceC25312uM60541h3 instanceof C23908d1 ? (C23908d1) interfaceC25312uM60541h3 : null;
                if (c23908d1 != null) {
                    arrayList3.add(c23908d1);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        return new C23928i1(id4, title, c27273p0, arrayList2, expandText, secondaryTitle, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23944m1 m74705U(LabsTestSelectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        InterfaceC25312u interfaceC25312uM60541h = f99648c.m60541h(model.getCurrentTest());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.advancedlabs.view.components.LabsTestItemState");
        C23908d1 c23908d1 = (C23908d1) interfaceC25312uM60541h;
        List<LabsTestSelectionItemModel> tests = model.getTests();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tests, 10));
        for (LabsTestSelectionItemModel labsTestSelectionItemModel : tests) {
            String id4 = labsTestSelectionItemModel.getId();
            DividerModel header = labsTestSelectionItemModel.getHeader();
            InterfaceC25312u interfaceC25312uM60541h2 = header != null ? f99648c.m60541h(header) : null;
            C17736e c17736e = interfaceC25312uM60541h2 instanceof C17736e ? (C17736e) interfaceC25312uM60541h2 : null;
            List<LabsTestItemModel> tests2 = labsTestSelectionItemModel.getTests();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(tests2, 10));
            Iterator<T> it = tests2.iterator();
            while (it.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h3 = f99648c.m60541h((LabsTestItemModel) it.next());
                AbstractC22676k.m65748h(interfaceC25312uM60541h3, "null cannot be cast to non-null type com.whoop.advancedlabs.view.components.LabsTestItemState");
                arrayList2.add((C23908d1) interfaceC25312uM60541h3);
            }
            arrayList.add(new C23936k1(id4, c17736e, arrayList2));
        }
        return new C23944m1(c23908d1, arrayList, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23985y m74706V(CategoricalBiomarkerDetailsModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C23985y(model.getSubtitle(), AbstractC23632g2.m68791d(model.getStatus()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23973u m74707W(BiomarkerTrendSegmentModel model) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(model, "model");
        String supertitle = model.getMetrics().getSupertitle();
        C23985y c23985y = null;
        C23958q c23958q = new C23958q(supertitle != null ? AbstractC8693b.m21278l(supertitle) : null, AbstractC8693b.m21278l(model.getMetrics().getMetricValue()), AbstractC8693b.m21278l(model.getMetrics().getMetricUnits()));
        DateSelectorModel datePicker = model.getDatePicker();
        InterfaceC25312u interfaceC25312uM60544l = datePicker != null ? f99646a.m60544l(datePicker) : null;
        C17863f c17863f = interfaceC25312uM60544l instanceof C17863f ? (C17863f) interfaceC25312uM60544l : null;
        GraphModel graph = model.getGraph();
        InterfaceC25312u interfaceC25312uM60544l2 = graph != null ? f99646a.m60544l(graph) : null;
        C21395c c21395c = interfaceC25312uM60544l2 instanceof C21395c ? (C21395c) interfaceC25312uM60544l2 : null;
        List<GraphLegendModel> graphLegends = model.getGraphLegends();
        if (graphLegends != null) {
            List<GraphLegendModel> list = graphLegends;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC35869b.m113880z((GraphLegendModel) it.next(), EnumC39333f.WHITE_70));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        TagModel basePhaseTag = model.getBasePhaseTag();
        InterfaceC25312u interfaceC25312uM60544l3 = basePhaseTag != null ? f99646a.m60544l(basePhaseTag) : null;
        C17750h1 c17750h1 = interfaceC25312uM60544l3 instanceof C17750h1 ? (C17750h1) interfaceC25312uM60544l3 : null;
        InfoCalloutTileModel baseInfoCallout = model.getBaseInfoCallout();
        InterfaceC25312u interfaceC25312uM60544l4 = baseInfoCallout != null ? f99646a.m60544l(baseInfoCallout) : null;
        C4092p2 c4092p2 = interfaceC25312uM60544l4 instanceof C4092p2 ? (C4092p2) interfaceC25312uM60544l4 : null;
        CategoricalBiomarkerDetailsModel categoricalBiomarkerDetails = model.getCategoricalBiomarkerDetails();
        if (categoricalBiomarkerDetails != null) {
            InterfaceC25312u interfaceC25312uM60544l5 = f99648c.m60544l(categoricalBiomarkerDetails);
            if (interfaceC25312uM60544l5 instanceof C23985y) {
                c23985y = (C23985y) interfaceC25312uM60544l5;
            }
        }
        return new C23973u(c23958q, c17863f, false, c21395c, arrayList, c17750h1, c4092p2, c23985y, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public static final C23859r m74708X(SearchableBiomarkersListModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<BiomarkerCardModel> biomarkers = model.getBiomarkers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(biomarkers, 10));
        Iterator<T> it = biomarkers.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h = f99646a.m60541h((BiomarkerCardModel) it.next());
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.biomarkercard.BiomarkerCardViewState");
            arrayList.add((C0088h) interfaceC25312uM60541h);
        }
        List<BiomarkerStatusModel> statuses = model.getStatuses();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(statuses, 10));
        Iterator<T> it3 = statuses.iterator();
        while (true) {
            Object obj = null;
            if (!it3.hasNext()) {
                break;
            }
            BiomarkerStatusModel biomarkerStatusModel = (BiomarkerStatusModel) it3.next();
            String type = biomarkerStatusModel.getType();
            EnumC0093m enumC0093m = EnumC0093m.UNAVAILABLE;
            for (EnumC0093m enumC0093m2 : EnumC0093m.values()) {
                if (AbstractC22676k.m65745e(enumC0093m2.name(), type)) {
                    obj = enumC0093m2;
                    break;
                }
            }
            if (obj != null) {
                enumC0093m = obj;
            }
            arrayList2.add(new C23846e(enumC0093m, biomarkerStatusModel.getText()));
        }
        String searchPlaceholder = model.getSearchPlaceholder();
        BiomarkersListBottomSheet bottomSheet = model.getBottomSheet();
        return new C23859r(arrayList, arrayList2, searchPlaceholder, null, bottomSheet != null ? m74690H0(bottomSheet) : null, model.getAllBiomarkersTitle(), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23842a m74709Y(AdvancedLabsRecordData model) {
        EnumC16313m0 enumC16313m0;
        C17750h1 c17750h1;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_W_CIRCLE;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        EnumC16313m0 enumC16313m2 = enumC16313m0 == null ? enumC16313m1 : enumC16313m0;
        String value = model.getValue();
        String units = model.getUnits();
        String strM60889a = C21638a.f83080a.m60889a(model.getDateTime());
        TagModel tag = model.getTag();
        if (tag != null) {
            InterfaceC25312u interfaceC25312uM60544l = f99646a.m60544l(tag);
            c17750h1 = interfaceC25312uM60544l instanceof C17750h1 ? (C17750h1) interfaceC25312uM60544l : null;
        } else {
            c17750h1 = null;
        }
        String imageUrl = model.getImageUrl();
        return new C23842a(id4, enumC16313m2, value, units, strM60889a, c17750h1, imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23942m m74710Z(AppointmentSummaryChecklistItemModel model) {
        C27256h c27256h;
        C27256h c27256h2;
        C27256h c27256h3;
        AbstractC22676k.m65750j(model, "model");
        InterfaceC25312u interfaceC25312uM60541h = f99648c.m60541h(model.getAppointmentSummary());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.advancedlabs.presentation.models.AppointmentSummaryViewState");
        C23845d c23845d = (C23845d) interfaceC25312uM60541h;
        CardButtonModel addToCalendarButton = model.getAddToCalendarButton();
        C23976v c23976v = null;
        if (addToCalendarButton != null) {
            InterfaceC25312u interfaceC25312uM60541h2 = f99646a.m60541h(addToCalendarButton);
            AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
            c27256h = (C27256h) interfaceC25312uM60541h2;
        } else {
            c27256h = null;
        }
        AppointmentSummaryAddToCalendarDataModel addToCalendarData = model.getAddToCalendarData();
        C23844c c23844c = addToCalendarData != null ? new C23844c(addToCalendarData.getDateTimeStart(), addToCalendarData.getDateTimeEnd()) : null;
        CardButtonModel cancelRescheduleButton = model.getCancelRescheduleButton();
        if (cancelRescheduleButton != null) {
            InterfaceC25312u interfaceC25312uM60541h3 = f99646a.m60541h(cancelRescheduleButton);
            AbstractC22676k.m65748h(interfaceC25312uM60541h3, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
            c27256h2 = (C27256h) interfaceC25312uM60541h3;
        } else {
            c27256h2 = null;
        }
        CardButtonModel downloadLabOrderButton = model.getDownloadLabOrderButton();
        if (downloadLabOrderButton != null) {
            InterfaceC25312u interfaceC25312uM60541h4 = f99646a.m60541h(downloadLabOrderButton);
            AbstractC22676k.m65748h(interfaceC25312uM60541h4, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
            c27256h3 = (C27256h) interfaceC25312uM60541h4;
        } else {
            c27256h3 = null;
        }
        CancelRescheduleDialogModel cancelRescheduleDialog = model.getCancelRescheduleDialog();
        if (cancelRescheduleDialog != null) {
            String title = cancelRescheduleDialog.getTitle();
            String description = cancelRescheduleDialog.getDescription();
            C21535a c21535a = f99646a;
            InterfaceC25312u interfaceC25312uM60541h5 = c21535a.m60541h(cancelRescheduleDialog.getPrimaryButton());
            AbstractC22676k.m65748h(interfaceC25312uM60541h5, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
            InterfaceC25312u interfaceC25312uM60541h6 = c21535a.m60541h(cancelRescheduleDialog.getSecondaryButton());
            AbstractC22676k.m65748h(interfaceC25312uM60541h6, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
            c23976v = new C23976v(title, description, (C27256h) interfaceC25312uM60541h5, (C27256h) interfaceC25312uM60541h6);
        }
        return new C23942m(c23845d, c27256h, c23844c, c27256h2, c27256h3, c23976v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23854m m74712a0(ChecklistCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        TestHeaderModel header = model.getHeader();
        C23861t c23861tM74686F0 = header != null ? m74686F0(header) : null;
        List<ChecklistStepModel> steps = model.getSteps();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(steps, 10));
        for (ChecklistStepModel checklistStepModel : steps) {
            arrayList.add(new C23856o(checklistStepModel.getTitle(), checklistStepModel.getSubtitle(), checklistStepModel.getStatus(), f99648c.m60540g(checklistStepModel.getItems()), checklistStepModel.isExpanded()));
        }
        return new C23854m(c23861tM74686F0, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23980w0 m74714b0(ImageSplitContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C23980w0(m74684E0(model.getStartItem()), m74684E0(model.getEndItem()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23965r2 m74716c0(WhatsIncludedCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        List<WhatsIncludedItemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (WhatsIncludedItemModel whatsIncludedItemModel : items) {
            String id4 = whatsIncludedItemModel.getId();
            InterfaceC25312u interfaceC25312uM60541h = f99646a.m60541h(whatsIncludedItemModel.getTrend());
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TrendViewState");
            arrayList.add(new C23969s2(id4, (C17731c2) interfaceC25312uM60541h, whatsIncludedItemModel.getText()));
        }
        InterfaceC25312u interfaceC25312uM60541h2 = f99646a.m60541h(model.getSecondaryButton());
        AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.SecondaryButtonViewState");
        return new C23965r2(title, arrayList, (C27273p0) interfaceC25312uM60541h2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C4540c m74718d0(TestUploadInfoTileModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        List<TestUploadInfoTileItemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (TestUploadInfoTileItemModel testUploadInfoTileItemModel : items) {
            String icon = testUploadInfoTileItemModel.getIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_INFORMATION;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            arrayList.add(new C4540c.a(enumC16313m1, testUploadInfoTileItemModel.getText()));
        }
        return new C4540c(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23897a2 m74720e0(SchedulingTileModel model) {
        C4092p2 c4092p2;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        String siteCode = model.getSiteCode();
        String titleDisplay = model.getTitleDisplay();
        String subtitleDisplay = model.getSubtitleDisplay();
        String distanceDisplay = model.getDistanceDisplay();
        String distanceIcon = model.getDistanceIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.LOCATION;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            c4092p2 = null;
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), distanceIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        List<AppointmentButtonModel> appointmentButtons = model.getAppointmentButtons();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(appointmentButtons, 10));
        for (AppointmentButtonModel appointmentButtonModel : appointmentButtons) {
            arrayList.add(new C23910e(appointmentButtonModel.getTextDisplay(), appointmentButtonModel.getDate()));
        }
        String collapsedTextDisplay = model.getCollapsedTextDisplay();
        String expandedTextDisplay = model.getExpandedTextDisplay();
        InfoCalloutTileModel infoCallout = model.getInfoCallout();
        if (infoCallout != null) {
            InterfaceC25312u interfaceC25312uM60541h = f99646a.m60541h(infoCallout);
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.InfoCalloutState");
            c4092p2 = (C4092p2) interfaceC25312uM60541h;
        }
        return new C23897a2(siteCode, titleDisplay, subtitleDisplay, distanceDisplay, enumC16313m1, arrayList, collapsedTextDisplay, expandedTextDisplay, c4092p2, false, 0, null, 3584, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23972t1 m74722f0(PromotionalBiomarkerPieChartModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        C12827f0 c12827f0M69309f = AbstractC23698q3.m69309f(model.getPieChart());
        TextResource title = model.getTitle();
        TextResource subtitle = model.getSubtitle();
        EnumC16313m0 enumC16313m0 = null;
        if (model.getSubtitleIcon() != null) {
            String subtitleIcon = model.getSubtitleIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), subtitleIcon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 == null) {
                enumC16313m0 = enumC16313m1;
            }
        }
        return new C23972t1(id4, c12827f0M69309f, title, subtitle, enumC16313m0, model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23860s m74724g0(SpecializedPanelUpsellTileModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImage(), 0, 0, 0, 14, null);
        List<InterfaceC25312u> listM60540g = f99646a.m60540g(model.getItems());
        String rightIcon = model.getRightIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), rightIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new C23860s(cVar, listM60540g, enumC16313m1, model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23858q m74726h0(PanelUpsellDrawerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C23858q(f99648c.m60540g(model.getItems()), AbstractC8693b.m21278l(model.getCollapseButtonTitle()), AbstractC8693b.m21278l(model.getExpandButtonTitle()), model.getItemsShownCollapsed(), false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23981w1 m74728i0(RemainingTestsCalloutModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C23981w1(model.getCallout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23857p m74730j0(HealthspanImpactCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        String description = model.getDescription();
        C17736e c17736eM68742e = AbstractC23624f1.m68742e(model.getDivider());
        List<String> pills = model.getPills();
        SecondaryButtonModel button = model.getButton();
        return new C23857p(title, description, c17736eM68742e, pills, button != null ? AbstractC23613d4.m68666p(button) : null, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C15731f m74732k0(SchedulingDatePickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        List<SchedulePillModel> schedulingDatePickerItems = model.getSchedulingDatePickerItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(schedulingDatePickerItems, 10));
        boolean z4 = false;
        int i13 = 0;
        for (Object obj : schedulingDatePickerItems) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(m74688G0((SchedulePillModel) obj, i13));
            i13 = i14;
        }
        C22949e c22949e = AbstractC22977m.f90651b;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getDateDisplay());
        String prevDateTime = model.getPrevDateTime();
        boolean z13 = prevDateTime != null && prevDateTime.length() > 0;
        String nextDateTime = model.getNextDateTime();
        if (nextDateTime != null && nextDateTime.length() > 0) {
            z4 = true;
        }
        boolean z14 = z4;
        String prevDateTime2 = model.getPrevDateTime();
        String str = prevDateTime2 == null ? "" : prevDateTime2;
        String nextDateTime2 = model.getNextDateTime();
        return new C15731f(id4, arrayList, new C17863f(c22949e, textResourceM21278l, z13, str, z14, nextDateTime2 == null ? "" : nextDateTime2, null, null, null, null, 960, null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23896a1 m74734l0(InsightsSectionHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C23896a1(model.getId(), model.getTitle(), model.getRightAlignedDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23953o2 m74736m0(TitleSectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C23953o2(model.getTitle(), model.getSubtitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23941l2 m74738n0(TestTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C23941l2(new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null), model.getLabel(), model.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23955p0 m74740o0(CollectionMethodTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String subtitle = model.getSubtitle();
        TextResource textResourceM21278l2 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        EnumC39333f subtitleTextColor = model.getSubtitleTextColor();
        String priceLabel = model.getPriceLabel();
        TextResource textResourceM21278l3 = priceLabel != null ? AbstractC8693b.m21278l(priceLabel) : null;
        boolean enabled = model.getEnabled();
        C21535a c21535a = f99648c;
        List<DesignSystemModel> additionalItems = model.getAdditionalItems();
        if (additionalItems == null) {
            additionalItems = C25271y.f99162w;
        }
        return new C23955p0(textResourceM21278l, textResourceM21278l2, subtitleTextColor, textResourceM21278l3, enabled, false, c21535a.m60540g(additionalItems), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m74742p0(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C25447b(3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m74744q0(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        m74697M(addModelMapper);
        C25446a c25446a = new C25446a(28);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AdvancedLabsSectionModel.class), new d0(c25446a));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AdvancedLabsRecordingSection.class), new e0(new C25446a(29)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(HorizontalImagePagerModel.class), new f0(new C25447b(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C22436k m74746r0(AdvancedLabsSectionModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        String subtitle = model.getSubtitle();
        List<DesignSystemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (!(((DesignSystemModel) obj) instanceof UnknownDesignModel)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(f99648c.m60541h((DesignSystemModel) it.next()));
        }
        return new C22436k(id4, title, subtitle, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23843b m74748s0(AdvancedLabsRecordingSection model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        C17736e c17736eM68742e = AbstractC23624f1.m68742e(model.getSectionHeader());
        List<DesignSystemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (!(((DesignSystemModel) obj) instanceof UnknownDesignModel)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(f99648c.m60541h((DesignSystemModel) it.next()));
        }
        return new C23843b(id4, c17736eM68742e, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C14364h m74750t0(HorizontalImagePagerModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        List<HorizontalImagePagerItem> items = model.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (HorizontalImagePagerItem horizontalImagePagerItem : items) {
            arrayList.add(new C14358b(new AbstractC22403o.c(horizontalImagePagerItem.getImageUrl(), 0, 0, 0, 14, null), horizontalImagePagerItem.getTitle(), horizontalImagePagerItem.getSubtitle()));
        }
        return new C14364h(title, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23743y0 m74752u0() {
        return f99647b.getModelMapper().m69692c(f99648c.getModelMapper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m74754v0(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C22436k.class), new C22434i());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23843b.class), new C23902c());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23842a.class), new C23894a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23922h.class), new C23914f());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23942m.class), new C23930j());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23845d.class), new C23946n());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23973u.class), new C23966s());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23985y.class), new C23979w());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23854m.class), new C23988z());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23955p0.class), new C23947n0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23915f0.class), new C23907d0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23931j0.class), new C23919g0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23943m0.class), new C23935k0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23857p.class), new C23963r0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C14364h.class), new C14357a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23980w0.class), new C23974u0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C21250i.class), new C21242a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23896a1.class), new C23986y0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23908d1.class), new C23900b1());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23928i1.class), new C23916f1());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23944m1.class), new C23932j1());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23858q.class), new C23948n1());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23972t1.class), new C23960q1());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23981w1.class), new C23975u1());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23897a2.class), new C23987y1());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C15731f.class), new C15729d());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23859r.class), new C23913e2());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23860s.class), new C23921g2());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C4540c.class), new C4538a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23941l2.class), new C23933j2());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23953o2.class), new C23945m2());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C23965r2.class), new C23957p2());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m74756w0(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C16934f.class), new g0());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C27273p0.class), new h0());
        designItemReducer.m60547b(new C25447b(2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m74758x0(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        m74697M(addModelMapper);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m74760y0(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27256h.class), new i0());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z0 */
    public static final C21535a m74762z0() {
        return f99647b;
    }
}
