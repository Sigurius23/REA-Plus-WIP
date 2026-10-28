package rb0;

import ab0.C0707b;
import ad0.C0748b;
import ae0.C0790c;
import af0.C0805a;
import androidx.health.platform.client.proto.C1533u;
import bb0.C2923c;
import bc0.C2979b;
import bd0.C3082a;
import c93.InterfaceC4351m;
import cb0.C4386a;
import cc0.C4410a;
import ce0.C4488c;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.AdvancedLabsCsvApi;
import com.whoop.advancedlabs.domain.GrowthContentApi;
import com.whoop.advancedlabs.domain.models.AdvancedLabsAllRecordingBottomSheet;
import com.whoop.advancedlabs.domain.models.AdvancedLabsRecordData;
import com.whoop.advancedlabs.domain.models.AdvancedLabsRecordingSection;
import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.AppointmentInfoCardModel;
import com.whoop.advancedlabs.domain.models.AppointmentSummaryChecklistItemModel;
import com.whoop.advancedlabs.domain.models.AppointmentSummaryModel;
import com.whoop.advancedlabs.domain.models.BiomarkerTrendSegmentModel;
import com.whoop.advancedlabs.domain.models.CategoricalBiomarkerDetailsModel;
import com.whoop.advancedlabs.domain.models.ChecklistCardModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCardHeaderModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCardModel;
import com.whoop.advancedlabs.domain.models.ClinicalReportCtaTileModel;
import com.whoop.advancedlabs.domain.models.CollectionMethodTileModel;
import com.whoop.advancedlabs.domain.models.HealthspanImpactCardModel;
import com.whoop.advancedlabs.domain.models.ImageSplitContainerModel;
import com.whoop.advancedlabs.domain.models.InsightsSectionHeaderModel;
import com.whoop.advancedlabs.domain.models.LabsTestItemModel;
import com.whoop.advancedlabs.domain.models.LabsTestListCalloutModel;
import com.whoop.advancedlabs.domain.models.LabsTestSelectionModel;
import com.whoop.advancedlabs.domain.models.PanelUpsellDrawerModel;
import com.whoop.advancedlabs.domain.models.PromotionalBiomarkerPieChartModel;
import com.whoop.advancedlabs.domain.models.RemainingTestsCalloutModel;
import com.whoop.advancedlabs.domain.models.SchedulingDatePickerModel;
import com.whoop.advancedlabs.domain.models.SchedulingTileModel;
import com.whoop.advancedlabs.domain.models.SearchableBiomarkersListModel;
import com.whoop.advancedlabs.domain.models.SpecializedPanelUpsellTileModel;
import com.whoop.advancedlabs.domain.models.TestTileModel;
import com.whoop.advancedlabs.domain.models.TitleSectionModel;
import com.whoop.advancedlabs.domain.models.WhatsIncludedCardModel;
import com.whoop.advancedlabs.feature.galleri.models.HorizontalImagePagerModel;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadInfoTileModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.labfileupload.domain.LabFileUploadApi;
import com.whoop.privacyconsent.api.PrivacyConsentApi;
import com.whoop.sanguine.domain.SanguineApi;
import dd0.C11946c;
import df0.C11999c;
import dp0.InterfaceC12251g;
import eb0.C13004c;
import ee0.C13136a;
import ef0.C13143b;
import ef0.C13144c;
import fb0.C14336b;
import fd0.C14398b;
import ff0.C14425b;
import fi0.InterfaceC14515a;
import gb0.C15667b;
import gc0.C15707d;
import gd0.C15712b;
import ge3.AbstractC15751g;
import gf0.C15781a;
import hb0.C17077a;
import hd0.C17196a;
import he0.C17211c;
import ic0.C18393a;
import ic0.C18394b;
import ie0.C18442b;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jb0.C21534c;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import jc0.C21602b;
import jd0.C21608a;
import jd0.C21610c;
import je0.C21619b;
import jf0.C21640c;
import js0.AbstractC21909c;
import kc0.C22349a;
import kd0.C22382b;
import ke0.C22417a;
import l83.C23454a0;
import l83.C23465k;
import lb0.C23585b;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import mb0.C25381a;
import mc0.C25415c;
import md0.C25449d;
import me0.C25471c;
import ms1.C25929a;
import na0.C26505a;
import na0.C26508d;
import nc0.C26566d;
import nd0.C26574a;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import od0.C27835b;
import oe0.C27869d;
import on2.C28049b;
import on2.C28050c;
import org.koin.core.error.DefinitionParameterException;
import p031b9.AbstractC2875y;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25310s;
import pc0.C29064a;
import pc0.C29066c;
import pd0.C29103c;
import pe0.C29114a;
import pg3.AbstractC29199m;
import pg3.C29218v0;
import pg3.C29222x0;
import ps1.C29503a;
import q83.InterfaceC30057d;
import qa0.C30110b;
import qc0.C30215b;
import qf3.C30330b;
import qw2.C30695c;
import r22.C30889a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import ra0.C31178a;
import rc0.C31232a;
import rd0.C31240b;
import re0.C31313c;
import rf3.C31362a;
import rf3.C31365d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sb0.C32343d;
import sb0.C32345f;
import sr2.AbstractC32943y;
import ta0.C33672c;
import tc0.C33697c;
import td0.C33702a;
import te0.C33748g;
import tf3.C33768a;
import u02.C34387c;
import u82.AbstractC34645f;
import u82.C34648i;
import u82.InterfaceC34640a;
import ua0.C34719b;
import ub0.C34740e;
import ud3.AbstractC34799a1;
import ud3.C34824k0;
import ud3.C34826l0;
import ue0.C34857a;
import uf3.C34911a;
import v82.C35799a;
import va0.C35840b;
import va3.AbstractC35846d;
import vc0.C35875b;
import vd0.C35906c;
import vf3.AbstractC35952b;
import vf3.C35953c;
import wa0.C36980a;
import wb0.C37037h;
import wb3.AbstractC37056f;
import wc0.C37132a;
import we0.C37216f;
import xb0.C38161a;
import xd0.C38200d;
import xf3.C38266c;
import ya0.C39355a;
import yc0.C39430c;
import yd0.C39456a;
import za0.C40224d;
import zb0.C40256c;
import ze0.C40583b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: rb0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lrb0/g;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31190g implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f128508c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a(), new C25929a());

    /* JADX INFO: renamed from: rb0.g$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.di.AdvancedLabsModule$define$1$21$1", m100430f = "AdvancedLabsModule.kt", m100431l = {328}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lud3/a1;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f128510w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AdvancedLabsCsvApi f128511x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AdvancedLabsCsvApi advancedLabsCsvApi, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f128511x = advancedLabsCsvApi;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f128511x, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f128510w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsCsvApi advancedLabsCsvApi = this.f128511x;
            this.f128510w = 1;
            Object objExportBiomarkersCsv = advancedLabsCsvApi.exportBiomarkersCsv(this);
            return objExportBiomarkersCsv == enumC31071a ? enumC31071a : objExportBiomarkersCsv;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<AbstractC34799a1>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final C14425b m95917A1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14425b((C11999c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11999c.class), null), (C15781a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C15781a.class), null), (C13143b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13143b.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A2 */
    public static final C0790c m95918A2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("ExtendedTimeout-AdvancedLabsApi");
        return new C0790c((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), c35953c), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B1 */
    public static final C40224d m95921B1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40224d((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B2 */
    public static final C13136a m95922B2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13136a(null, (C26574a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26574a.class), null), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final C31184a m95925C1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31184a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final C4488c m95926C2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4488c((C0790c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C0790c.class), null), (C13136a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13136a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D1 */
    public static final C4386a m95929D1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4386a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D2 */
    public static final C39430c m95930D2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("ExtendedTimeout-AdvancedLabsApi");
        return new C39430c((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), c35953c), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final C0707b m95933E1(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C0707b((InterfaceC21159o0) factory.m122602a(new C28050c(params, 8), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (AbstractC12939a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class), null), (InterfaceC12251g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12251g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final C3082a m95934E2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C3082a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final C34911a m95937F1(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final C0748b m95938F2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C0748b((C39430c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39430c.class), null), (C3082a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C3082a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final C2923c m95941G1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C2923c((C40224d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40224d.class), null), (C4386a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C4386a.class), null), (C30695c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G2 */
    public static final C11946c m95942G2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C11946c((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final C33672c m95945H1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C28049b c28049b = new C28049b(factory, 10);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33672c((InterfaceC26834e) factory.m122602a(c28049b, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (AdvancedLabsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AdvancedLabsApi.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final C17196a m95946H2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17196a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final C34911a m95949I1(C38266c c38266c) {
        C35953c c35953c = new C35953c("AdvancedLabs-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Object.class), c35953c), c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("AdvancedLabs-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final C14398b m95950I2(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14398b((AbstractC12939a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class), null), (InterfaceC21159o0) factory.m122602a(new C28050c(params, 10), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final C36980a m95953J1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36980a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final C34911a m95954J2(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final C34719b m95957K1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34719b((AbstractC12939a0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC12939a0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final C15712b m95958K2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15712b((C11946c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11946c.class), null), (C17196a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17196a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final C35840b m95961L1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35840b((C33672c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33672c.class), null), (C36980a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36980a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final GrowthContentApi m95962L2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        AbstractC29199m abstractC29199mM109482a = AbstractC34645f.m109482a(AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null));
        C29222x0 c29222x0 = new C29222x0();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0.m88729c(((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(abstractC29199mM109482a);
        return (GrowthContentApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), GrowthContentApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final C40256c m95965M1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C28049b c28049b = new C28049b(factory, 8);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40256c((InterfaceC26834e) factory.m122602a(c28049b, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (AdvancedLabsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AdvancedLabsApi.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final C15707d m95966M2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C28049b c28049b = new C28049b(factory, 11);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15707d((InterfaceC26834e) factory.m122602a(c28049b, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (AdvancedLabsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AdvancedLabsApi.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final C34911a m95969N1(C38266c c38266c) {
        C35953c c35953c = new C35953c("AdvancedLabs-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Object.class), c35953c), c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("AdvancedLabs-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public static final C34911a m95970N2(C38266c c38266c) {
        C35953c c35953c = new C35953c("AdvancedLabs-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Object.class), c35953c), c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("AdvancedLabs-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final C4410a m95973O1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4410a((InterfaceC41070a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public static final C22349a m95974O2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22349a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final C2979b m95977P1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C2979b((C40256c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40256c.class), null), (C4410a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C4410a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final C18394b m95978P2(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C28050c c28050c = new C28050c(params, 5);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c28050c, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b != null) {
            return new C18394b(interfaceC21159o0, (AbstractC12939a0) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public static final InterfaceC34640a m95981Q1(C38266c c38266c, C34911a c34911a) {
        return new C34648i(AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "AdvancedLabs-mapping")), null, null, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final C34911a m95982Q2(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R1 */
    public static final C34740e m95985R1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34740e((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final C18393a m95986R2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C18393a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final C38161a m95989S1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38161a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public static final C21602b m95990S2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21602b((C15707d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C15707d.class), null), (C22349a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22349a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public static final C37037h m95993T1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37037h((C34740e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34740e.class), null), (C38161a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38161a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public static final C32345f m95994T2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32345f((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U1 */
    public static final C21534c m95997U1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21534c((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final C25415c m95998U2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25415c((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final C25381a m96001V1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25381a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public static final C26566d m96002V2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C28049b c28049b = new C28049b(factory, 13);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26566d((InterfaceC26834e) factory.m122602a(c28049b, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C30695c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (PrivacyConsentApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PrivacyConsentApi.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final C23585b m96005W1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C23585b((C21534c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21534c.class), null), (C25381a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25381a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public static final C34911a m96006W2(C38266c c38266c) {
        C35953c c35953c = new C35953c("AdvancedLabs-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Object.class), c35953c), c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("AdvancedLabs-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final C33697c m96009X1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C28049b c28049b = new C28049b(factory, 12);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33697c((InterfaceC26834e) factory.m122602a(c28049b, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (AdvancedLabsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AdvancedLabsApi.class), null), (C30695c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public static final C31232a m96010X2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31232a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final C34911a m96013Y1(C38266c c38266c) {
        C35953c c35953c = new C35953c("AdvancedLabs-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Object.class), c35953c), c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("AdvancedLabs-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public static final C29066c m96014Y2(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C28050c c28050c = new C28050c(params, 9);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c28050c, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b != null) {
            return new C29066c(interfaceC21159o0, (AbstractC12939a0) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final C37132a m96017Z1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37132a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public static final C34911a m96018Z2(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final C35875b m96022a2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35875b((C33697c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33697c.class), null), (C37132a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37132a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public static final C29103c m96023a3(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29103c((GrowthContentApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(GrowthContentApi.class), null), (SanguineApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(SanguineApi.class), null), null, 4, null);
    }

    /* JADX INFO: renamed from: b1 */
    private static final C23454a0 m96026b1(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C35953c c35953cM114198f = AbstractC35952b.m114198f("AdvancedLabs-mapping");
        final int i13 = 6;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g = AbstractC35846d.m113782g();
        C30330b c30330b = new C30330b(c35953cM113782g, AbstractC22671h0.m65688a(Map.class), c35953cM114198f, interfaceC4351m, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b.m92688a(), c35953cM114198f, c35953cM113782g), new C31362a(c30330b), false);
        C30330b c30330b2 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C31186c.class), null, new C30889a(19), 1);
        C31365d c31365dM8311x = AbstractC2875y.m8311x(c30330b2, module, AbstractC21598x.m60669Y(c30330b2.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz = AbstractC22671h0.m65688a(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b3 = c31365dM8311x.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b3.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b3.f124472c, c30330b3.f124470a), c31365dM8311x, true);
        final int i14 = 0;
        C30330b c30330b4 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C31185b.class), null, new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x2 = AbstractC2875y.m8311x(c30330b4, module, AbstractC21598x.m60669Y(c30330b4.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz2 = AbstractC22671h0.m65688a(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b5 = c31365dM8311x2.f129023a;
        c30330b5.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b5.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b5.f124472c, c30330b5.f124470a), c31365dM8311x2, true);
        final int i15 = 12;
        C30330b c30330b6 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C31184a.class), null, new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x3 = AbstractC2875y.m8311x(c30330b6, module, AbstractC21598x.m60669Y(c30330b6.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz3 = AbstractC22671h0.m65688a(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b7 = c31365dM8311x3.f129023a;
        c30330b7.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b7.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b7.f124472c, c30330b7.f124470a), c31365dM8311x3, true);
        C35953c c35953cM114198f2 = AbstractC35952b.m114198f("AdvancedLabs-cache-deserializer");
        final int i16 = 24;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g2 = AbstractC35846d.m113782g();
        C30330b c30330b8 = new C30330b(c35953cM113782g2, AbstractC22671h0.m65688a(InterfaceC34640a.class), c35953cM114198f2, interfaceC4351m2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b8.m92688a(), c35953cM114198f2, c35953cM113782g2), new C31362a(c30330b8), false);
        final int i17 = 6;
        C30330b c30330b9 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(AdvancedLabsApi.class), null, new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x = AbstractC31061c.m95648x(c30330b9, module, AbstractC21598x.m60669Y(c30330b9.m92688a(), null, AbstractC35846d.m113782g()), "ExtendedTimeout-AdvancedLabsApi");
        final int i18 = 18;
        C30330b c30330b10 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(AdvancedLabsApi.class), c35953cM95648x, new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b10.m92688a(), c35953cM95648x, AbstractC35846d.m113782g()), new C31365d(c30330b10), false);
        C31189f c31189f = new C31189f(0);
        C35953c c35953cM113782g3 = AbstractC35846d.m113782g();
        C30330b c30330b11 = new C30330b(c35953cM113782g3, AbstractC22671h0.m65688a(AdvancedLabsCsvApi.class), null, c31189f, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b11.m92688a(), null, c35953cM113782g3), new C31362a(c30330b11), false);
        C31189f c31189f2 = new C31189f(13);
        C35953c c35953cM113782g4 = AbstractC35846d.m113782g();
        C30330b c30330b12 = new C30330b(c35953cM113782g4, AbstractC22671h0.m65688a(GrowthContentApi.class), null, c31189f2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b12.m92688a(), null, c35953cM113782g4), new C31362a(c30330b12), false);
        C31189f c31189f3 = new C31189f(16);
        C35953c c35953cM113782g5 = AbstractC35846d.m113782g();
        C30330b c30330b13 = new C30330b(c35953cM113782g5, AbstractC22671h0.m65688a(C29103c.class), null, c31189f3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b13.m92688a(), null, c35953cM113782g5), new C31362a(c30330b13), false);
        final int i19 = 17;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g6 = AbstractC35846d.m113782g();
        C30330b c30330b14 = new C30330b(c35953cM113782g6, AbstractC22671h0.m65688a(C33702a.class), null, interfaceC4351m3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b14.m92688a(), null, c35953cM113782g6), new C31362a(c30330b14), false);
        final int i24 = 28;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g7 = AbstractC35846d.m113782g();
        C30330b c30330b15 = new C30330b(c35953cM113782g7, AbstractC22671h0.m65688a(C27835b.class), null, interfaceC4351m4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b15.m92688a(), null, c35953cM113782g7), new C31362a(c30330b15), false);
        final int i25 = 9;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g8 = AbstractC35846d.m113782g();
        C30330b c30330b16 = new C30330b(c35953cM113782g8, AbstractC22671h0.m65688a(C31240b.class), null, interfaceC4351m5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b16.m92688a(), null, c35953cM113782g8), new C31362a(c30330b16), false);
        final int i26 = 20;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g9 = AbstractC35846d.m113782g();
        C30330b c30330b17 = new C30330b(c35953cM113782g9, AbstractC22671h0.m65688a(C32343d.class), null, interfaceC4351m6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b17.m92688a(), null, c35953cM113782g9), new C31362a(c30330b17), false);
        C31189f c31189f4 = new C31189f(1);
        C35953c c35953cM113782g10 = AbstractC35846d.m113782g();
        C30330b c30330b18 = new C30330b(c35953cM113782g10, AbstractC22671h0.m65688a(C25449d.class), null, c31189f4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b18.m92688a(), null, c35953cM113782g10), new C31362a(c30330b18), false);
        C31189f c31189f5 = new C31189f(12);
        C35953c c35953cM113782g11 = AbstractC35846d.m113782g();
        C30330b c30330b19 = new C30330b(c35953cM113782g11, AbstractC22671h0.m65688a(C21610c.class), null, c31189f5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b19.m92688a(), null, c35953cM113782g11), new C31362a(c30330b19), false);
        C31189f c31189f6 = new C31189f(17);
        C35953c c35953cM113782g12 = AbstractC35846d.m113782g();
        C30330b c30330b20 = new C30330b(c35953cM113782g12, AbstractC22671h0.m65688a(C39355a.class), null, c31189f6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b20.m92688a(), null, c35953cM113782g12), new C31362a(c30330b20), false);
        C30889a c30889a = new C30889a(16);
        C35953c c35953cM113782g13 = AbstractC35846d.m113782g();
        C30330b c30330b21 = new C30330b(c35953cM113782g13, AbstractC22671h0.m65688a(C21608a.class), null, c30889a, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b21.m92688a(), null, c35953cM113782g13), new C31362a(c30330b21), false);
        C30889a c30889a2 = new C30889a(17);
        C35953c c35953cM113782g14 = AbstractC35846d.m113782g();
        C30330b c30330b22 = new C30330b(c35953cM113782g14, AbstractC22671h0.m65688a(C22382b.class), null, c30889a2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b22.m92688a(), null, c35953cM113782g14), new C31362a(c30330b22), false);
        C30889a c30889a3 = new C30889a(18);
        C35953c c35953cM113782g15 = AbstractC35846d.m113782g();
        C30330b c30330b23 = new C30330b(c35953cM113782g15, AbstractC22671h0.m65688a(C13004c.class), null, c30889a3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b23.m92688a(), null, c35953cM113782g15), new C31362a(c30330b23), false);
        C30889a c30889a4 = new C30889a(20);
        C35953c c35953cM113782g16 = AbstractC35846d.m113782g();
        C30330b c30330b24 = new C30330b(c35953cM113782g16, AbstractC22671h0.m65688a(C21640c.class), null, c30889a4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b24.m92688a(), null, c35953cM113782g16), new C31362a(c30330b24), false);
        C30889a c30889a5 = new C30889a(21);
        C35953c c35953cM113782g17 = AbstractC35846d.m113782g();
        C30330b c30330b25 = new C30330b(c35953cM113782g17, AbstractC22671h0.m65688a(C17077a.class), null, c30889a5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b25.m92688a(), null, c35953cM113782g17), new C31362a(c30330b25), false);
        C30889a c30889a6 = new C30889a(22);
        C35953c c35953cM113782g18 = AbstractC35846d.m113782g();
        C30330b c30330b26 = new C30330b(c35953cM113782g18, AbstractC22671h0.m65688a(C14336b.class), null, c30889a6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b26.m92688a(), null, c35953cM113782g18), new C31362a(c30330b26), false);
        C30889a c30889a7 = new C30889a(23);
        C35953c c35953cM113782g19 = AbstractC35846d.m113782g();
        C30330b c30330b27 = new C30330b(c35953cM113782g19, AbstractC22671h0.m65688a(C15667b.class), null, c30889a7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b27.m92688a(), null, c35953cM113782g19), new C31362a(c30330b27), false);
        C30889a c30889a8 = new C30889a(24);
        C35953c c35953cM113782g20 = AbstractC35846d.m113782g();
        C30330b c30330b28 = new C30330b(c35953cM113782g20, AbstractC22671h0.m65688a(C11999c.class), null, c30889a8, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b28.m92688a(), null, c35953cM113782g20), new C31362a(c30330b28), false);
        C30889a c30889a9 = new C30889a(25);
        C35953c c35953cM113782g21 = AbstractC35846d.m113782g();
        C30330b c30330b29 = new C30330b(c35953cM113782g21, AbstractC22671h0.m65688a(C15781a.class), null, c30889a9, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b29.m92688a(), null, c35953cM113782g21), new C31362a(c30330b29), false);
        C30889a c30889a10 = new C30889a(26);
        C35953c c35953cM113782g22 = AbstractC35846d.m113782g();
        C30330b c30330b30 = new C30330b(c35953cM113782g22, AbstractC22671h0.m65688a(C13143b.class), null, c30889a10, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b30.m92688a(), null, c35953cM113782g22), new C31362a(c30330b30), false);
        C30889a c30889a11 = new C30889a(27);
        C35953c c35953cM113782g23 = AbstractC35846d.m113782g();
        C30330b c30330b31 = new C30330b(c35953cM113782g23, AbstractC22671h0.m65688a(C13144c.class), null, c30889a11, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b31.m92688a(), null, c35953cM113782g23), new C31362a(c30330b31), false);
        C30889a c30889a12 = new C30889a(28);
        C35953c c35953cM113782g24 = AbstractC35846d.m113782g();
        C30330b c30330b32 = new C30330b(c35953cM113782g24, AbstractC22671h0.m65688a(C14425b.class), null, c30889a12, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b32.m92688a(), null, c35953cM113782g24), new C31362a(c30330b32), false);
        C30889a c30889a13 = new C30889a(29);
        C35953c c35953cM113782g25 = AbstractC35846d.m113782g();
        C30330b c30330b33 = new C30330b(c35953cM113782g25, AbstractC22671h0.m65688a(C40224d.class), null, c30889a13, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b33.m92688a(), null, c35953cM113782g25), new C31362a(c30330b33), false);
        final int i27 = 1;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g26 = AbstractC35846d.m113782g();
        C30330b c30330b34 = new C30330b(c35953cM113782g26, AbstractC22671h0.m65688a(C4386a.class), null, interfaceC4351m7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b34.m92688a(), null, c35953cM113782g26), new C31362a(c30330b34), false);
        final int i28 = 2;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g27 = AbstractC35846d.m113782g();
        C30330b c30330b35 = new C30330b(c35953cM113782g27, AbstractC22671h0.m65688a(C0707b.class), null, interfaceC4351m8, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b35.m92688a(), null, c35953cM113782g27), new C31362a(c30330b35), false);
        final int i29 = 3;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g28 = AbstractC35846d.m113782g();
        C30330b c30330b36 = new C30330b(c35953cM113782g28, AbstractC22671h0.m65688a(C2923c.class), null, interfaceC4351m9, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b36.m92688a(), null, c35953cM113782g28), new C31362a(c30330b36), false);
        final int i34 = 4;
        InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g29 = AbstractC35846d.m113782g();
        C30330b c30330b37 = new C30330b(c35953cM113782g29, AbstractC22671h0.m65688a(C33672c.class), null, interfaceC4351m10, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b37.m92688a(), null, c35953cM113782g29), new C31362a(c30330b37), false);
        final int i35 = 5;
        InterfaceC4351m interfaceC4351m11 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g30 = AbstractC35846d.m113782g();
        C30330b c30330b38 = new C30330b(c35953cM113782g30, AbstractC22671h0.m65688a(C36980a.class), null, interfaceC4351m11, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b38.m92688a(), null, c35953cM113782g30), new C31362a(c30330b38), false);
        final int i36 = 7;
        InterfaceC4351m interfaceC4351m12 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g31 = AbstractC35846d.m113782g();
        C30330b c30330b39 = new C30330b(c35953cM113782g31, AbstractC22671h0.m65688a(C34719b.class), null, interfaceC4351m12, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b39.m92688a(), null, c35953cM113782g31), new C31362a(c30330b39), false);
        final int i37 = 8;
        InterfaceC4351m interfaceC4351m13 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g32 = AbstractC35846d.m113782g();
        C30330b c30330b40 = new C30330b(c35953cM113782g32, AbstractC22671h0.m65688a(C35840b.class), null, interfaceC4351m13, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b40.m92688a(), null, c35953cM113782g32), new C31362a(c30330b40), false);
        final int i38 = 9;
        InterfaceC4351m interfaceC4351m14 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g33 = AbstractC35846d.m113782g();
        C30330b c30330b41 = new C30330b(c35953cM113782g33, AbstractC22671h0.m65688a(C40256c.class), null, interfaceC4351m14, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b41.m92688a(), null, c35953cM113782g33), new C31362a(c30330b41), false);
        final int i39 = 10;
        InterfaceC4351m interfaceC4351m15 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g34 = AbstractC35846d.m113782g();
        C30330b c30330b42 = new C30330b(c35953cM113782g34, AbstractC22671h0.m65688a(C4410a.class), null, interfaceC4351m15, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b42.m92688a(), null, c35953cM113782g34), new C31362a(c30330b42), false);
        final int i44 = 11;
        InterfaceC4351m interfaceC4351m16 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g35 = AbstractC35846d.m113782g();
        C30330b c30330b43 = new C30330b(c35953cM113782g35, AbstractC22671h0.m65688a(C2979b.class), null, interfaceC4351m16, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b43.m92688a(), null, c35953cM113782g35), new C31362a(c30330b43), false);
        final int i45 = 13;
        InterfaceC4351m interfaceC4351m17 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g36 = AbstractC35846d.m113782g();
        C30330b c30330b44 = new C30330b(c35953cM113782g36, AbstractC22671h0.m65688a(C34740e.class), null, interfaceC4351m17, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b44.m92688a(), null, c35953cM113782g36), new C31362a(c30330b44), false);
        final int i46 = 14;
        InterfaceC4351m interfaceC4351m18 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g37 = AbstractC35846d.m113782g();
        C30330b c30330b45 = new C30330b(c35953cM113782g37, AbstractC22671h0.m65688a(C38161a.class), null, interfaceC4351m18, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b45.m92688a(), null, c35953cM113782g37), new C31362a(c30330b45), false);
        final int i47 = 15;
        InterfaceC4351m interfaceC4351m19 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g38 = AbstractC35846d.m113782g();
        C30330b c30330b46 = new C30330b(c35953cM113782g38, AbstractC22671h0.m65688a(C37037h.class), null, interfaceC4351m19, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b46.m92688a(), null, c35953cM113782g38), new C31362a(c30330b46), false);
        final int i48 = 16;
        InterfaceC4351m interfaceC4351m20 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g39 = AbstractC35846d.m113782g();
        C30330b c30330b47 = new C30330b(c35953cM113782g39, AbstractC22671h0.m65688a(C21534c.class), null, interfaceC4351m20, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b47.m92688a(), null, c35953cM113782g39), new C31362a(c30330b47), false);
        final int i49 = 18;
        InterfaceC4351m interfaceC4351m21 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g40 = AbstractC35846d.m113782g();
        C30330b c30330b48 = new C30330b(c35953cM113782g40, AbstractC22671h0.m65688a(C25381a.class), null, interfaceC4351m21, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b48.m92688a(), null, c35953cM113782g40), new C31362a(c30330b48), false);
        final int i54 = 19;
        InterfaceC4351m interfaceC4351m22 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g41 = AbstractC35846d.m113782g();
        C30330b c30330b49 = new C30330b(c35953cM113782g41, AbstractC22671h0.m65688a(C23585b.class), null, interfaceC4351m22, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b49.m92688a(), null, c35953cM113782g41), new C31362a(c30330b49), false);
        final int i55 = 20;
        InterfaceC4351m interfaceC4351m23 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g42 = AbstractC35846d.m113782g();
        C30330b c30330b50 = new C30330b(c35953cM113782g42, AbstractC22671h0.m65688a(C33697c.class), null, interfaceC4351m23, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b50.m92688a(), null, c35953cM113782g42), new C31362a(c30330b50), false);
        final int i56 = 21;
        InterfaceC4351m interfaceC4351m24 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g43 = AbstractC35846d.m113782g();
        C30330b c30330b51 = new C30330b(c35953cM113782g43, AbstractC22671h0.m65688a(C37132a.class), null, interfaceC4351m24, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b51.m92688a(), null, c35953cM113782g43), new C31362a(c30330b51), false);
        final int i57 = 22;
        InterfaceC4351m interfaceC4351m25 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g44 = AbstractC35846d.m113782g();
        C30330b c30330b52 = new C30330b(c35953cM113782g44, AbstractC22671h0.m65688a(C35875b.class), null, interfaceC4351m25, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b52.m92688a(), null, c35953cM113782g44), new C31362a(c30330b52), false);
        final int i58 = 23;
        InterfaceC4351m interfaceC4351m26 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g45 = AbstractC35846d.m113782g();
        C30330b c30330b53 = new C30330b(c35953cM113782g45, AbstractC22671h0.m65688a(C31313c.class), null, interfaceC4351m26, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b53.m92688a(), null, c35953cM113782g45), new C31362a(c30330b53), false);
        final int i59 = 25;
        InterfaceC4351m interfaceC4351m27 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i59) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g46 = AbstractC35846d.m113782g();
        C30330b c30330b54 = new C30330b(c35953cM113782g46, AbstractC22671h0.m65688a(C34857a.class), null, interfaceC4351m27, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b54.m92688a(), null, c35953cM113782g46), new C31362a(c30330b54), false);
        final int i64 = 26;
        InterfaceC4351m interfaceC4351m28 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i64) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g47 = AbstractC35846d.m113782g();
        C30330b c30330b55 = new C30330b(c35953cM113782g47, AbstractC22671h0.m65688a(C33748g.class), null, interfaceC4351m28, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b55.m92688a(), null, c35953cM113782g47), new C31362a(c30330b55), false);
        final int i65 = 27;
        InterfaceC4351m interfaceC4351m29 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i65) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g48 = AbstractC35846d.m113782g();
        C30330b c30330b56 = new C30330b(c35953cM113782g48, AbstractC22671h0.m65688a(C25471c.class), null, interfaceC4351m29, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b56.m92688a(), null, c35953cM113782g48), new C31362a(c30330b56), false);
        final int i66 = 29;
        InterfaceC4351m interfaceC4351m30 = new InterfaceC4351m() { // from class: rb0.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i66) {
                    case 0:
                        return C31190g.m96088q1(c38266c, c34911a);
                    case 1:
                        return C31190g.m95929D1(c38266c, c34911a);
                    case 2:
                        return C31190g.m95933E1(c38266c, c34911a);
                    case 3:
                        return C31190g.m95941G1(c38266c, c34911a);
                    case 4:
                        return C31190g.m95945H1(c38266c, c34911a);
                    case 5:
                        return C31190g.m95953J1(c38266c, c34911a);
                    case 6:
                        return C31190g.m96031c1(c38266c, c34911a);
                    case 7:
                        return C31190g.m95957K1(c38266c, c34911a);
                    case 8:
                        return C31190g.m95961L1(c38266c, c34911a);
                    case 9:
                        return C31190g.m95965M1(c38266c, c34911a);
                    case 10:
                        return C31190g.m95973O1(c38266c, c34911a);
                    case 11:
                        return C31190g.m95977P1(c38266c, c34911a);
                    case 12:
                        return C31190g.m95925C1(c38266c, c34911a);
                    case 13:
                        return C31190g.m95985R1(c38266c, c34911a);
                    case 14:
                        return C31190g.m95989S1(c38266c, c34911a);
                    case 15:
                        return C31190g.m95993T1(c38266c, c34911a);
                    case 16:
                        return C31190g.m95997U1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96040e1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96001V1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m96005W1(c38266c, c34911a);
                    case 20:
                        return C31190g.m96009X1(c38266c, c34911a);
                    case 21:
                        return C31190g.m96017Z1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m96022a2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m96027b2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95981Q1(c38266c, c34911a);
                    case 25:
                        return C31190g.m96037d2(c38266c, c34911a);
                    case 26:
                        return C31190g.m96041e2(c38266c, c34911a);
                    case 27:
                        return C31190g.m96045f2(c38266c, c34911a);
                    case 28:
                        return C31190g.m96044f1(c38266c, c34911a);
                    default:
                        return C31190g.m96049g2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g49 = AbstractC35846d.m113782g();
        C30330b c30330b57 = new C30330b(c35953cM113782g49, AbstractC22671h0.m65688a(C29114a.class), null, interfaceC4351m30, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b57.m92688a(), null, c35953cM113782g49), new C31362a(c30330b57), false);
        final int i67 = 0;
        InterfaceC4351m interfaceC4351m31 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i67) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g50 = AbstractC35846d.m113782g();
        C30330b c30330b58 = new C30330b(c35953cM113782g50, AbstractC22671h0.m65688a(C27869d.class), null, interfaceC4351m31, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b58.m92688a(), null, c35953cM113782g50), new C31362a(c30330b58), false);
        final int i68 = 1;
        InterfaceC4351m interfaceC4351m32 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i68) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g51 = AbstractC35846d.m113782g();
        C30330b c30330b59 = new C30330b(c35953cM113782g51, AbstractC22671h0.m65688a(C35906c.class), null, interfaceC4351m32, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b59.m92688a(), null, c35953cM113782g51), new C31362a(c30330b59), false);
        final int i69 = 2;
        InterfaceC4351m interfaceC4351m33 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i69) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g52 = AbstractC35846d.m113782g();
        C30330b c30330b60 = new C30330b(c35953cM113782g52, AbstractC22671h0.m65688a(C39456a.class), null, interfaceC4351m33, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b60.m92688a(), null, c35953cM113782g52), new C31362a(c30330b60), false);
        final int i74 = 3;
        InterfaceC4351m interfaceC4351m34 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i74) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g53 = AbstractC35846d.m113782g();
        C30330b c30330b61 = new C30330b(c35953cM113782g53, AbstractC22671h0.m65688a(C38200d.class), null, interfaceC4351m34, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b61.m92688a(), null, c35953cM113782g53), new C31362a(c30330b61), false);
        final int i75 = 4;
        InterfaceC4351m interfaceC4351m35 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i75) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g54 = AbstractC35846d.m113782g();
        C30330b c30330b62 = new C30330b(c35953cM113782g54, AbstractC22671h0.m65688a(C26508d.class), null, interfaceC4351m35, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b62.m92688a(), null, c35953cM113782g54), new C31362a(c30330b62), false);
        final int i76 = 5;
        InterfaceC4351m interfaceC4351m36 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i76) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g55 = AbstractC35846d.m113782g();
        C30330b c30330b63 = new C30330b(c35953cM113782g55, AbstractC22671h0.m65688a(C26505a.class), null, interfaceC4351m36, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b63.m92688a(), null, c35953cM113782g55), new C31362a(c30330b63), false);
        final int i77 = 7;
        InterfaceC4351m interfaceC4351m37 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i77) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g56 = AbstractC35846d.m113782g();
        C30330b c30330b64 = new C30330b(c35953cM113782g56, AbstractC22671h0.m65688a(C31178a.class), null, interfaceC4351m37, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b64.m92688a(), null, c35953cM113782g56), new C31362a(c30330b64), false);
        final int i78 = 8;
        InterfaceC4351m interfaceC4351m38 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i78) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g57 = AbstractC35846d.m113782g();
        C30330b c30330b65 = new C30330b(c35953cM113782g57, AbstractC22671h0.m65688a(C30110b.class), null, interfaceC4351m38, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b65.m92688a(), null, c35953cM113782g57), new C31362a(c30330b65), false);
        final int i79 = 10;
        InterfaceC4351m interfaceC4351m39 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i79) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g58 = AbstractC35846d.m113782g();
        C30330b c30330b66 = new C30330b(c35953cM113782g58, AbstractC22671h0.m65688a(C37216f.class), null, interfaceC4351m39, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b66.m92688a(), null, c35953cM113782g58), new C31362a(c30330b66), false);
        final int i83 = 11;
        InterfaceC4351m interfaceC4351m40 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i83) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g59 = AbstractC35846d.m113782g();
        C30330b c30330b67 = new C30330b(c35953cM113782g59, AbstractC22671h0.m65688a(C0805a.class), null, interfaceC4351m40, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b67.m92688a(), null, c35953cM113782g59), new C31362a(c30330b67), false);
        final int i84 = 12;
        InterfaceC4351m interfaceC4351m41 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i84) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g60 = AbstractC35846d.m113782g();
        C30330b c30330b68 = new C30330b(c35953cM113782g60, AbstractC22671h0.m65688a(C40583b.class), null, interfaceC4351m41, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b68.m92688a(), null, c35953cM113782g60), new C31362a(c30330b68), false);
        final int i85 = 13;
        InterfaceC4351m interfaceC4351m42 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i85) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g61 = AbstractC35846d.m113782g();
        C30330b c30330b69 = new C30330b(c35953cM113782g61, AbstractC22671h0.m65688a(C17211c.class), null, interfaceC4351m42, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b69.m92688a(), null, c35953cM113782g61), new C31362a(c30330b69), false);
        final int i86 = 14;
        InterfaceC4351m interfaceC4351m43 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i86) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g62 = AbstractC35846d.m113782g();
        C30330b c30330b70 = new C30330b(c35953cM113782g62, AbstractC22671h0.m65688a(C26574a.class), null, interfaceC4351m43, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b70.m92688a(), null, c35953cM113782g62), new C31362a(c30330b70), false);
        final int i87 = 15;
        InterfaceC4351m interfaceC4351m44 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i87) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g63 = AbstractC35846d.m113782g();
        C30330b c30330b71 = new C30330b(c35953cM113782g63, AbstractC22671h0.m65688a(C22417a.class), null, interfaceC4351m44, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b71.m92688a(), null, c35953cM113782g63), new C31362a(c30330b71), false);
        final int i88 = 16;
        InterfaceC4351m interfaceC4351m45 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i88) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g64 = AbstractC35846d.m113782g();
        C30330b c30330b72 = new C30330b(c35953cM113782g64, AbstractC22671h0.m65688a(C18442b.class), null, interfaceC4351m45, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b72.m92688a(), null, c35953cM113782g64), new C31362a(c30330b72), false);
        final int i89 = 17;
        InterfaceC4351m interfaceC4351m46 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i89) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g65 = AbstractC35846d.m113782g();
        C30330b c30330b73 = new C30330b(c35953cM113782g65, AbstractC22671h0.m65688a(C21619b.class), null, interfaceC4351m46, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b73.m92688a(), null, c35953cM113782g65), new C31362a(c30330b73), false);
        final int i94 = 19;
        InterfaceC4351m interfaceC4351m47 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i94) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g66 = AbstractC35846d.m113782g();
        C30330b c30330b74 = new C30330b(c35953cM113782g66, AbstractC22671h0.m65688a(C0790c.class), null, interfaceC4351m47, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b74.m92688a(), null, c35953cM113782g66), new C31362a(c30330b74), false);
        final int i95 = 21;
        InterfaceC4351m interfaceC4351m48 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i95) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g67 = AbstractC35846d.m113782g();
        C30330b c30330b75 = new C30330b(c35953cM113782g67, AbstractC22671h0.m65688a(C13136a.class), null, interfaceC4351m48, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b75.m92688a(), null, c35953cM113782g67), new C31362a(c30330b75), false);
        final int i96 = 22;
        InterfaceC4351m interfaceC4351m49 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i96) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g68 = AbstractC35846d.m113782g();
        C30330b c30330b76 = new C30330b(c35953cM113782g68, AbstractC22671h0.m65688a(C4488c.class), null, interfaceC4351m49, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b76.m92688a(), null, c35953cM113782g68), new C31362a(c30330b76), false);
        final int i97 = 23;
        InterfaceC4351m interfaceC4351m50 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i97) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g69 = AbstractC35846d.m113782g();
        C30330b c30330b77 = new C30330b(c35953cM113782g69, AbstractC22671h0.m65688a(C39430c.class), null, interfaceC4351m50, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b77.m92688a(), null, c35953cM113782g69), new C31362a(c30330b77), false);
        final int i98 = 24;
        InterfaceC4351m interfaceC4351m51 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i98) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g70 = AbstractC35846d.m113782g();
        C30330b c30330b78 = new C30330b(c35953cM113782g70, AbstractC22671h0.m65688a(C3082a.class), null, interfaceC4351m51, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b78.m92688a(), null, c35953cM113782g70), new C31362a(c30330b78), false);
        final int i99 = 25;
        InterfaceC4351m interfaceC4351m52 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i99) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g71 = AbstractC35846d.m113782g();
        C30330b c30330b79 = new C30330b(c35953cM113782g71, AbstractC22671h0.m65688a(C0748b.class), null, interfaceC4351m52, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b79.m92688a(), null, c35953cM113782g71), new C31362a(c30330b79), false);
        final int i100 = 26;
        InterfaceC4351m interfaceC4351m53 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i100) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g72 = AbstractC35846d.m113782g();
        C30330b c30330b80 = new C30330b(c35953cM113782g72, AbstractC22671h0.m65688a(C11946c.class), null, interfaceC4351m53, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b80.m92688a(), null, c35953cM113782g72), new C31362a(c30330b80), false);
        final int i101 = 27;
        InterfaceC4351m interfaceC4351m54 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i101) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g73 = AbstractC35846d.m113782g();
        C30330b c30330b81 = new C30330b(c35953cM113782g73, AbstractC22671h0.m65688a(C17196a.class), null, interfaceC4351m54, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b81.m92688a(), null, c35953cM113782g73), new C31362a(c30330b81), false);
        final int i102 = 28;
        InterfaceC4351m interfaceC4351m55 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i102) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g74 = AbstractC35846d.m113782g();
        C30330b c30330b82 = new C30330b(c35953cM113782g74, AbstractC22671h0.m65688a(C14398b.class), null, interfaceC4351m55, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b82.m92688a(), null, c35953cM113782g74), new C31362a(c30330b82), false);
        final int i103 = 29;
        InterfaceC4351m interfaceC4351m56 = new InterfaceC4351m() { // from class: rb0.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i103) {
                    case 0:
                        return C31190g.m96053h2(c38266c, c34911a);
                    case 1:
                        return C31190g.m96057i2(c38266c, c34911a);
                    case 2:
                        return C31190g.m96061j2(c38266c, c34911a);
                    case 3:
                        return C31190g.m96065k2(c38266c, c34911a);
                    case 4:
                        return C31190g.m96069l2(c38266c, c34911a);
                    case 5:
                        return C31190g.m96077n2(c38266c, c34911a);
                    case 6:
                        return C31190g.m96032c2(c38266c, c34911a);
                    case 7:
                        return C31190g.m96085p2(c38266c, c34911a);
                    case 8:
                        return C31190g.m96089q2(c38266c, c34911a);
                    case 9:
                        return C31190g.m96048g1(c38266c, c34911a);
                    case 10:
                        return C31190g.m96093r2(c38266c, c34911a);
                    case 11:
                        return C31190g.m96097s2(c38266c, c34911a);
                    case 12:
                        return C31190g.m96101t2(c38266c, c34911a);
                    case 13:
                        return C31190g.m96105u2(c38266c, c34911a);
                    case 14:
                        return C31190g.m96109v2(c38266c, c34911a);
                    case 15:
                        return C31190g.m96113w2(c38266c, c34911a);
                    case 16:
                        return C31190g.m96117x2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C31190g.m96121y2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C31190g.m96081o2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C31190g.m95918A2(c38266c, c34911a);
                    case 20:
                        return C31190g.m96052h1(c38266c, c34911a);
                    case 21:
                        return C31190g.m95922B2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C31190g.m95926C2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C31190g.m95930D2(c38266c, c34911a);
                    case 24:
                        return C31190g.m95934E2(c38266c, c34911a);
                    case 25:
                        return C31190g.m95938F2(c38266c, c34911a);
                    case 26:
                        return C31190g.m95942G2(c38266c, c34911a);
                    case 27:
                        return C31190g.m95946H2(c38266c, c34911a);
                    case 28:
                        return C31190g.m95950I2(c38266c, c34911a);
                    default:
                        return C31190g.m95958K2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g75 = AbstractC35846d.m113782g();
        C30330b c30330b83 = new C30330b(c35953cM113782g75, AbstractC22671h0.m65688a(C15712b.class), null, interfaceC4351m56, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b83.m92688a(), null, c35953cM113782g75), new C31362a(c30330b83), false);
        C31189f c31189f7 = new C31189f(2);
        C35953c c35953cM113782g76 = AbstractC35846d.m113782g();
        C30330b c30330b84 = new C30330b(c35953cM113782g76, AbstractC22671h0.m65688a(C15707d.class), null, c31189f7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b84.m92688a(), null, c35953cM113782g76), new C31362a(c30330b84), false);
        C31189f c31189f8 = new C31189f(3);
        C35953c c35953cM113782g77 = AbstractC35846d.m113782g();
        C30330b c30330b85 = new C30330b(c35953cM113782g77, AbstractC22671h0.m65688a(C22349a.class), null, c31189f8, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b85.m92688a(), null, c35953cM113782g77), new C31362a(c30330b85), false);
        C31189f c31189f9 = new C31189f(4);
        C35953c c35953cM113782g78 = AbstractC35846d.m113782g();
        C30330b c30330b86 = new C30330b(c35953cM113782g78, AbstractC22671h0.m65688a(C18394b.class), null, c31189f9, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b86.m92688a(), null, c35953cM113782g78), new C31362a(c30330b86), false);
        C31189f c31189f10 = new C31189f(5);
        C35953c c35953cM113782g79 = AbstractC35846d.m113782g();
        C30330b c30330b87 = new C30330b(c35953cM113782g79, AbstractC22671h0.m65688a(C18393a.class), null, c31189f10, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b87.m92688a(), null, c35953cM113782g79), new C31362a(c30330b87), false);
        C31189f c31189f11 = new C31189f(6);
        C35953c c35953cM113782g80 = AbstractC35846d.m113782g();
        C30330b c30330b88 = new C30330b(c35953cM113782g80, AbstractC22671h0.m65688a(C21602b.class), null, c31189f11, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b88.m92688a(), null, c35953cM113782g80), new C31362a(c30330b88), false);
        C31189f c31189f12 = new C31189f(7);
        C35953c c35953cM113782g81 = AbstractC35846d.m113782g();
        C30330b c30330b89 = new C30330b(c35953cM113782g81, AbstractC22671h0.m65688a(C32345f.class), null, c31189f12, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b89.m92688a(), null, c35953cM113782g81), new C31362a(c30330b89), false);
        C31189f c31189f13 = new C31189f(8);
        C35953c c35953cM113782g82 = AbstractC35846d.m113782g();
        C30330b c30330b90 = new C30330b(c35953cM113782g82, AbstractC22671h0.m65688a(C25415c.class), null, c31189f13, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b90.m92688a(), null, c35953cM113782g82), new C31362a(c30330b90), false);
        C31189f c31189f14 = new C31189f(9);
        C35953c c35953cM113782g83 = AbstractC35846d.m113782g();
        C30330b c30330b91 = new C30330b(c35953cM113782g83, AbstractC22671h0.m65688a(C26566d.class), null, c31189f14, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b91.m92688a(), null, c35953cM113782g83), new C31362a(c30330b91), false);
        C31189f c31189f15 = new C31189f(10);
        C35953c c35953cM113782g84 = AbstractC35846d.m113782g();
        C30330b c30330b92 = new C30330b(c35953cM113782g84, AbstractC22671h0.m65688a(C31232a.class), null, c31189f15, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b92.m92688a(), null, c35953cM113782g84), new C31362a(c30330b92), false);
        C31189f c31189f16 = new C31189f(11);
        C35953c c35953cM113782g85 = AbstractC35846d.m113782g();
        C30330b c30330b93 = new C30330b(c35953cM113782g85, AbstractC22671h0.m65688a(C29066c.class), null, c31189f16, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b93.m92688a(), null, c35953cM113782g85), new C31362a(c30330b93), false);
        C31189f c31189f17 = new C31189f(14);
        C35953c c35953cM113782g86 = AbstractC35846d.m113782g();
        C30330b c30330b94 = new C30330b(c35953cM113782g86, AbstractC22671h0.m65688a(C29064a.class), null, c31189f17, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b94.m92688a(), null, c35953cM113782g86), new C31362a(c30330b94), false);
        C31189f c31189f18 = new C31189f(15);
        C35953c c35953cM113782g87 = AbstractC35846d.m113782g();
        C30330b c30330b95 = new C30330b(c35953cM113782g87, AbstractC22671h0.m65688a(C30215b.class), null, c31189f18, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b95.m92688a(), null, c35953cM113782g87), new C31362a(c30330b95), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public static final C31313c m96027b2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31313c((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public static final C29064a m96028b3(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29064a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Map m96031c1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("ADVANCED_LABS_ALL_RECORDING_BOTTOM_SHEET", c22673i0.getOrCreateKotlinClass(AdvancedLabsAllRecordingBottomSheet.class)), new C23465k("ADVANCED_LABS_RECORDING_SECTION", c22673i0.getOrCreateKotlinClass(AdvancedLabsRecordingSection.class)), new C23465k("ADVANCED_LABS_SECTION", c22673i0.getOrCreateKotlinClass(AdvancedLabsSectionModel.class)), new C23465k("APPOINTMENT_INFO_CARD", c22673i0.getOrCreateKotlinClass(AppointmentInfoCardModel.class)), new C23465k("APPOINTMENT_SUMMARY", c22673i0.getOrCreateKotlinClass(AppointmentSummaryModel.class)), new C23465k("APPOINTMENT_SUMMARY_CHECKLIST_ITEM", c22673i0.getOrCreateKotlinClass(AppointmentSummaryChecklistItemModel.class)), new C23465k("BIOMARKER_TREND_SEGMENT", c22673i0.getOrCreateKotlinClass(BiomarkerTrendSegmentModel.class)), new C23465k("CATEGORICAL_BIOMARKER_DETAILS", c22673i0.getOrCreateKotlinClass(CategoricalBiomarkerDetailsModel.class)), new C23465k("CHECKLIST_CARD", c22673i0.getOrCreateKotlinClass(ChecklistCardModel.class)), new C23465k("COLLECTION_METHOD_TILE", c22673i0.getOrCreateKotlinClass(CollectionMethodTileModel.class)), new C23465k("CLINICAL_REPORT_CARD_HEADER", c22673i0.getOrCreateKotlinClass(ClinicalReportCardHeaderModel.class)), new C23465k("CLINICAL_REPORT_CTA_TILE", c22673i0.getOrCreateKotlinClass(ClinicalReportCtaTileModel.class)), new C23465k("CLINICAL_REPORT_ENTRY_CARD", c22673i0.getOrCreateKotlinClass(ClinicalReportCardModel.class)), new C23465k("HEALTHSPAN_IMPACT_CARD", c22673i0.getOrCreateKotlinClass(HealthspanImpactCardModel.class)), new C23465k("HORIZONTAL_IMAGE_PAGER", c22673i0.getOrCreateKotlinClass(HorizontalImagePagerModel.class)), new C23465k("IMAGE_SPLIT_CONTAINER", c22673i0.getOrCreateKotlinClass(ImageSplitContainerModel.class)), new C23465k("INSIGHTS_SECTION_HEADER", c22673i0.getOrCreateKotlinClass(InsightsSectionHeaderModel.class)), new C23465k("LABS_TEST_ITEM", c22673i0.getOrCreateKotlinClass(LabsTestItemModel.class)), new C23465k("LABS_TEST_LIST_CALLOUT", c22673i0.getOrCreateKotlinClass(LabsTestListCalloutModel.class)), new C23465k("LABS_TEST_SELECTION", c22673i0.getOrCreateKotlinClass(LabsTestSelectionModel.class)), new C23465k("PANEL_UPSELL_DRAWER", c22673i0.getOrCreateKotlinClass(PanelUpsellDrawerModel.class)), new C23465k("PROMOTIONAL_BIOMARKER_PIE_CHART", c22673i0.getOrCreateKotlinClass(PromotionalBiomarkerPieChartModel.class)), new C23465k("RECORD_DATA", c22673i0.getOrCreateKotlinClass(AdvancedLabsRecordData.class)), new C23465k("REMAINING_TESTS_CALLOUT", c22673i0.getOrCreateKotlinClass(RemainingTestsCalloutModel.class)), new C23465k("SCHEDULING_DATE_PICKER", c22673i0.getOrCreateKotlinClass(SchedulingDatePickerModel.class)), new C23465k("SCHEDULING_TILE", c22673i0.getOrCreateKotlinClass(SchedulingTileModel.class)), new C23465k("SEARCHABLE_BIOMARKERS_LIST", c22673i0.getOrCreateKotlinClass(SearchableBiomarkersListModel.class)), new C23465k("SPECIALIZED_PANEL_UPSELL_TILE", c22673i0.getOrCreateKotlinClass(SpecializedPanelUpsellTileModel.class)), new C23465k("TEST_TILE", c22673i0.getOrCreateKotlinClass(TestTileModel.class)), new C23465k("TEST_UPLOAD_INFO_TILE", c22673i0.getOrCreateKotlinClass(TestUploadInfoTileModel.class)), new C23465k("TITLE_SECTION", c22673i0.getOrCreateKotlinClass(TitleSectionModel.class)), new C23465k("WHATS_INCLUDED_CARD", c22673i0.getOrCreateKotlinClass(WhatsIncludedCardModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final AdvancedLabsApi m96032c2(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "AdvancedLabs-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC29199m abstractC29199mM109482a = AbstractC34645f.m109482a(AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), null, null, null, null, 30, null));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(abstractC29199mM109482a);
        return (AdvancedLabsApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), AdvancedLabsApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public static final C30215b m96033c3(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30215b((C26566d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C26566d.class), null), (C31232a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31232a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C31186c m96036d1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31186c((Map) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("AdvancedLabs-mapping")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public static final C34857a m96037d2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34857a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public static final C33702a m96040e1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33702a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final C33748g m96041e2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33748g((C31313c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31313c.class), null), (C34857a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34857a.class), null), (C30695c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C27835b m96044f1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27835b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f2 */
    public static final C25471c m96045f2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25471c((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C31240b m96048g1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31240b((C29103c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29103c.class), null), (C33702a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33702a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g2 */
    public static final C29114a m96049g2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29114a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C32343d m96052h1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C28049b c28049b = new C28049b(factory, 7);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32343d((InterfaceC26834e) factory.m122602a(c28049b, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), null, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final C27869d m96053h2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27869d((C25471c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25471c.class), null), (C29114a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29114a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C34911a m96056i1(C38266c c38266c) {
        C35953c c35953c = new C35953c("AdvancedLabs-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Object.class), c35953c), c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("AdvancedLabs-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i2 */
    public static final C35906c m96057i2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35906c((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j1 */
    public static final C25449d m96060j1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25449d(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j2 */
    public static final C39456a m96061j2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39456a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C21610c m96064k1(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C28050c c28050c = new C28050c(params, 6);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21610c((InterfaceC21159o0) factory.m122602a(c28050c, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (AbstractC12939a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class), null), null, null, (C39355a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39355a.class), null), 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final C38200d m96065k2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38200d((C35906c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35906c.class), null), (C39456a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39456a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C34911a m96068l1(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final C26508d m96069l2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26508d((AdvancedLabsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AdvancedLabsApi.class), null), (InterfaceC26834e) factory.m122602a(new C28049b(factory, 9), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C39355a m96072m1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39355a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final C34911a m96073m2(C38266c c38266c) {
        C35953c c35953c = new C35953c("AdvancedLabs-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Object.class), c35953c), c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("AdvancedLabs-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C21608a m96076n1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21608a((C39355a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final C26505a m96077n2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26505a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C22382b m96080o1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22382b((C32343d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C32343d.class), null), (C25449d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25449d.class), null), null, (C30695c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final AdvancedLabsApi m96081o2(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "AdvancedLabs-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC29199m abstractC29199mM109482a = AbstractC34645f.m109482a(AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), null, null, null, null, 30, null));
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient"))).m109897a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c34824k0M109897a.m109895e(30L, timeUnit);
        c34824k0M109897a.m109892b(30L, timeUnit);
        c34824k0M109897a.m109896f(30L, timeUnit);
        C34826l0 c34826l0 = new C34826l0(c34824k0M109897a);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(abstractC29199mM109482a);
        c29222x0.f118281a = c34826l0;
        Object objM88733b = c29222x0.m88730d().m88733b(AdvancedLabsApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (AdvancedLabsApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C13004c m96084p1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13004c((AdvancedLabsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AdvancedLabsApi.class), null), (C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final C31178a m96085p2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31178a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C31185b m96088q1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31185b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final C30110b m96089q2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30110b((C26508d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C26508d.class), null), (C31178a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31178a.class), null), (C30695c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (C26505a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C26505a.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r1 */
    public static final C21640c m96092r1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21640c(new b((AdvancedLabsCsvApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsCsvApi.class), null), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final C37216f m96093r2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37216f((AdvancedLabsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AdvancedLabsApi.class), null), (LabFileUploadApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(LabFileUploadApi.class), null), (C29503a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29503a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s1 */
    public static final C17077a m96096s1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17077a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final C0805a m96097s2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0805a((InterfaceC41070a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C14336b m96100t1(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14336b((AbstractC12939a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class), null), (InterfaceC21159o0) factory.m122602a(new C28050c(params, 7), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (InterfaceC12251g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12251g.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final C40583b m96101t2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40583b((C37216f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37216f.class), null), (C0805a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C0805a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final C34911a m96104u1(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u2 */
    public static final C17211c m96105u2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17211c((AdvancedLabsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final C15667b m96108v1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15667b((C13004c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13004c.class), null), (C17077a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17077a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final C26574a m96109v2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26574a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final C11999c m96112w1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11999c((AdvancedLabsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AdvancedLabsApi.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w2 */
    public static final C22417a m96113w2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22417a(null, (C26574a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26574a.class), null), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final C15781a m96116x1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15781a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final C18442b m96117x2(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, InterfaceC21159o0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C18442b(abstractC12939a0, (InterfaceC21159o0) objM110111b2, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final C13143b m96120y1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13143b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final C21619b m96121y2(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21619b((C17211c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17211c.class), null), (C22417a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22417a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C13144c m96124z1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13144c((AbstractC12939a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class), null), (InterfaceC21159o0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final AdvancedLabsCsvApi m96125z2(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return (AdvancedLabsCsvApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "defaultOkHttpClient")), AdvancedLabsCsvApi.class, "create(...)");
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m96026b1(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
