package ex2;

import ci2.InterfaceC4733b;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.WhoopLabsScreenModel;
import com.whoop.whooplabs.data.domain.DwlCampaignSection;
import com.whoop.whooplabs.data.domain.DwlCampaignSectionEmptyState;
import com.whoop.whooplabs.data.domain.DwlImpactSection;
import com.whoop.whooplabs.data.domain.DwlLanding;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.network.WhoopLabsBffApi;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignSectionEmptyStateResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignSectionResponseV2;
import com.whoop.whooplabs.data.remote.domain.dto.bff.HomeImpactSectionResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.HomeScreenResponse;
import fx2.InterfaceC14849a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import nz2.AbstractC27312f;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: ex2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001c*\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\rH\u0080@¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\rH\u0080@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010+¨\u0006,"}, m65681d2 = {"Lex2/a;", "", "Lci2/b;", "whoopStrapProvider", "Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;", "bffApi", "Lfx2/a;", "labsDao", "Ltr2/n;", "logger", "<init>", "(Lci2/b;Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;Lfx2/a;Ltr2/n;)V", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;", "Lcom/whoop/whooplabs/data/domain/DwlLanding;", "g", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;)Lcom/whoop/whooplabs/data/domain/DwlLanding;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;", "Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;", "d", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;)Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;", "Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;", "e", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;)Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeImpactSectionResponse;", "Lcom/whoop/whooplabs/data/domain/DwlImpactSection;", "f", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeImpactSectionResponse;)Lcom/whoop/whooplabs/data/domain/DwlImpactSection;", "", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/whooplabs/data/domain/LabsCampaign;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;Ltr2/n;)Ljava/util/List;", "b", "(Lq83/d;)Ljava/lang/Object;", "landing", "Ll83/a0;", "c", "(Lcom/whoop/whooplabs/data/domain/DwlLanding;Lq83/d;)Ljava/lang/Object;", "a", "Lci2/b;", "Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;", "Lfx2/a;", "Ltr2/n;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13730a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WhoopLabsBffApi bffApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14849a labsDao;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ex2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.DwlLandingRepository", m100430f = "DwlLandingRepository.kt", m100431l = {33}, m100432m = "fetchLanding$whooplabs_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f48790w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f48791x;

        /* JADX INFO: renamed from: z */
        int f48793z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48791x = obj;
            this.f48793z |= Integer.MIN_VALUE;
            return C13730a.this.m38960b(this);
        }
    }

    /* JADX INFO: renamed from: ex2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.DwlLandingRepository$fetchLanding$result$1", m100430f = "DwlLandingRepository.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48794w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f48796y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WhoopStrapInfo whoopStrapInfo, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48796y = whoopStrapInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13730a.this.new b(this.f48796y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            InterfaceC27939b maximVersion;
            C27940c hardwareVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48794w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhoopLabsBffApi whoopLabsBffApi = C13730a.this.bffApi;
            WhoopStrapInfo whoopStrapInfo = this.f48796y;
            String strM84332d = (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
            WhoopStrapInfo whoopStrapInfo2 = this.f48796y;
            String strMo84319a = (whoopStrapInfo2 == null || (maximVersion = whoopStrapInfo2.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo3 = this.f48796y;
            String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo4 = this.f48796y;
            String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
            WhoopStrapInfo whoopStrapInfo5 = this.f48796y;
            String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
            this.f48794w = 1;
            Object objFetchHome = whoopLabsBffApi.fetchHome(strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, this);
            return objFetchHome == enumC31071a ? enumC31071a : objFetchHome;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<HomeScreenResponse>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.a$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.DwlLandingRepository", m100430f = "DwlLandingRepository.kt", m100431l = {57}, m100432m = "saveCampaigns$whooplabs_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f48797E;

        /* JADX INFO: renamed from: F */
        int f48798F;

        /* JADX INFO: renamed from: G */
        int f48799G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f48800H;

        /* JADX INFO: renamed from: J */
        int f48802J;

        /* JADX INFO: renamed from: w */
        Object f48803w;

        /* JADX INFO: renamed from: x */
        Object f48804x;

        /* JADX INFO: renamed from: y */
        Object f48805y;

        /* JADX INFO: renamed from: z */
        Object f48806z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48800H = obj;
            this.f48802J |= Integer.MIN_VALUE;
            return C13730a.this.m38961c(null, this);
        }
    }

    public C13730a(InterfaceC4733b whoopStrapProvider, WhoopLabsBffApi bffApi, InterfaceC14849a labsDao, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(bffApi, "bffApi");
        AbstractC22676k.m65750j(labsDao, "labsDao");
        AbstractC22676k.m65750j(logger, "logger");
        this.whoopStrapProvider = whoopStrapProvider;
        this.bffApi = bffApi;
        this.labsDao = labsDao;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    private final DwlCampaignSection m38955d(CampaignSectionResponseV2 campaignSectionResponseV2) {
        String title = campaignSectionResponseV2.getTitle();
        String subtitle = campaignSectionResponseV2.getSubtitle();
        List<DesignSystemModel> campaignResponse = campaignSectionResponseV2.getCampaignResponse();
        CampaignSectionEmptyStateResponse emptyState = campaignSectionResponseV2.getEmptyState();
        return new DwlCampaignSection(title, subtitle, campaignResponse, emptyState != null ? m38956e(emptyState) : null);
    }

    /* JADX INFO: renamed from: e */
    private final DwlCampaignSectionEmptyState m38956e(CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse) {
        return new DwlCampaignSectionEmptyState(campaignSectionEmptyStateResponse.getImageUrl(), campaignSectionEmptyStateResponse.getTitleDisplay(), campaignSectionEmptyStateResponse.getBodyDisplay());
    }

    /* JADX INFO: renamed from: f */
    private final DwlImpactSection m38957f(HomeImpactSectionResponse homeImpactSectionResponse) {
        return new DwlImpactSection(homeImpactSectionResponse.getTitleDisplay(), homeImpactSectionResponse.getItems());
    }

    /* JADX INFO: renamed from: g */
    private final DwlLanding m38958g(HomeScreenResponse homeScreenResponse) {
        String pageTitleDisplay = homeScreenResponse.getPageTitleDisplay();
        String pageHeaderTitle = homeScreenResponse.getPageHeaderTitle();
        String pageHeaderBody = homeScreenResponse.getPageHeaderBody();
        String pageBackgroundImageUrl = homeScreenResponse.getPageBackgroundImageUrl();
        List<CampaignSectionResponseV2> campaignSections = homeScreenResponse.getCampaignSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(campaignSections, 10));
        Iterator<T> it = campaignSections.iterator();
        while (it.hasNext()) {
            arrayList.add(m38955d((CampaignSectionResponseV2) it.next()));
        }
        HomeImpactSectionResponse impactSection = homeScreenResponse.getImpactSection();
        return new DwlLanding(pageTitleDisplay, pageHeaderTitle, pageHeaderBody, pageBackgroundImageUrl, arrayList, impactSection != null ? m38957f(impactSection) : null, homeScreenResponse.getFooterText(), homeScreenResponse.getFooter());
    }

    /* JADX INFO: renamed from: h */
    private final List<LabsCampaign> m38959h(List<? extends DesignSystemModel> list, InterfaceC34116n interfaceC34116n) {
        Integer campaignId;
        List<? extends DesignSystemModel> list2 = list == null ? C25271y.f99162w : list;
        ArrayList arrayList = new ArrayList();
        for (DesignSystemModel designSystemModel : list2) {
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap(designSystemModel);
            LabsCampaign labsCampaign = null;
            CtaTileModel ctaTileModel = designSystemModelUnwrap instanceof CtaTileModel ? (CtaTileModel) designSystemModelUnwrap : null;
            if (ctaTileModel == null) {
                interfaceC34116n.mo85222m("Couldn't map campaign to CtaTileModel: " + designSystemModel, new AbstractC30556a.a[0]);
            } else {
                C9598e destination = ctaTileModel.getDestination();
                NavigationScreenModel parameters = destination != null ? destination.getParameters() : null;
                WhoopLabsScreenModel whoopLabsScreenModel = parameters instanceof WhoopLabsScreenModel ? (WhoopLabsScreenModel) parameters : null;
                if (whoopLabsScreenModel == null || (campaignId = whoopLabsScreenModel.getCampaignId()) == null) {
                    interfaceC34116n.mo85222m("Missing campaignId for Cta: " + ctaTileModel, new AbstractC30556a.a[0]);
                } else {
                    int iIntValue = campaignId.intValue();
                    String subtitle = ctaTileModel.getSubtitle();
                    if (subtitle == null) {
                        subtitle = "";
                    }
                    labsCampaign = new LabsCampaign(iIntValue, subtitle, AbstractC27312f.m82462a(ctaTileModel.getTitle(), interfaceC34116n), null, null, null, null, null, null, null, 984, null);
                }
            }
            if (labsCampaign != null) {
                arrayList.add(labsCampaign);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m38960b(InterfaceC30057d<? super DwlLanding> interfaceC30057d) {
        a aVar;
        HomeScreenResponse homeScreenResponse;
        DwlLanding dwlLandingM38958g;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f48793z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f48793z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f48791x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f48793z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
            WhoopStrapInfo whoopStrapInfo = interfaceC21750d != null ? interfaceC21750d.get_strapInfo() : null;
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(whoopStrapInfo, null);
            aVar2.f48790w = null;
            aVar2.f48793z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85222m(AbstractC11266d.m30461o("Error getting Dwl landing response: ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
            return null;
        }
        C29218v0 c29218v0 = (C29218v0) AbstractC34386b.m108737b(interfaceC34385a);
        if (c29218v0 != null && (homeScreenResponse = (HomeScreenResponse) c29218v0.f118270b) != null && (dwlLandingM38958g = m38958g(homeScreenResponse)) != null) {
            return dwlLandingM38958g;
        }
        this.logger.mo85226q("Dwl landing response succeeded but body was null", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m38961c(DwlLanding dwlLanding, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        Iterator it;
        int i13;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i14 = cVar.f48802J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f48802J = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f48800H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = cVar.f48802J;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            List<DwlCampaignSection> campaignSections = dwlLanding.getCampaignSections();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = campaignSections.iterator();
            while (it3.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, m38959h(((DwlCampaignSection) it3.next()).getItems(), this.logger));
            }
            it = arrayList.iterator();
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = cVar.f48798F;
            it = (Iterator) cVar.f48805y;
            AbstractC34132o.m107864I(obj);
        }
        while (it.hasNext()) {
            LabsCampaign labsCampaign = (LabsCampaign) it.next();
            InterfaceC14849a interfaceC14849a = this.labsDao;
            cVar.f48803w = null;
            cVar.f48804x = null;
            cVar.f48805y = it;
            cVar.f48806z = null;
            cVar.f48797E = null;
            cVar.f48798F = i13;
            cVar.f48799G = 0;
            cVar.f48802J = 1;
            if (interfaceC14849a.mo42775g(labsCampaign, cVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }
}
