package yy2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignSectionEmptyStateResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignSectionResponseV2;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CompletedCampaignsScreenResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import xy2.AbstractC38708b;
import yv0.C39805h;
import zy2.C41228a;
import zy2.C41232e;
import zy2.InterfaceC41233f;

/* JADX INFO: renamed from: yy2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lyy2/a;", "", "<init>", "()V", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;", "Lzy2/f$b;", "g", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;)Lzy2/f$b;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;", "Lzy2/e;", "f", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;)Lzy2/e;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;", "Lzy2/a;", "e", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;)Lzy2/a;", "Lec3/l;", "Lxy2/b;", "domainStateFlow", "Lzy2/f;", "c", "(Lec3/l;)Lec3/l;", "Ljb1/a;", "a", "Ljb1/a;", "reducer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39897a {

    /* JADX INFO: renamed from: b */
    public static final int f172256b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer = AbstractC21537c.m60554d(new C39805h(13));

    /* JADX INFO: renamed from: yy2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f172258w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39897a f172259x;

        /* JADX INFO: renamed from: yy2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42718a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f172260w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39897a f172261x;

            /* JADX INFO: renamed from: yy2.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.completedcampaigns.reducer.CompletedCampaignsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "CompletedCampaignsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42719a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f172262E;

                /* JADX INFO: renamed from: F */
                Object f172263F;

                /* JADX INFO: renamed from: G */
                Object f172264G;

                /* JADX INFO: renamed from: H */
                int f172265H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f172266w;

                /* JADX INFO: renamed from: x */
                int f172267x;

                /* JADX INFO: renamed from: y */
                Object f172268y;

                public C42719a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f172266w = obj;
                    this.f172267x |= Integer.MIN_VALUE;
                    return C42718a.this.emit(null, this);
                }
            }

            public C42718a(InterfaceC13062m interfaceC13062m, C39897a c39897a) {
                this.f172260w = interfaceC13062m;
                this.f172261x = c39897a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42719a c42719a;
                Object objM128001g;
                if (interfaceC30057d instanceof C42719a) {
                    c42719a = (C42719a) interfaceC30057d;
                    int i13 = c42719a.f172267x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42719a.f172267x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42719a = new C42719a(interfaceC30057d);
                    }
                } else {
                    c42719a = new C42719a(interfaceC30057d);
                }
                Object obj2 = c42719a.f172266w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42719a.f172267x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f172260w;
                    AbstractC38708b abstractC38708b = (AbstractC38708b) obj;
                    if (AbstractC22676k.m65745e(abstractC38708b, AbstractC38708b.c.f166593a)) {
                        objM128001g = InterfaceC41233f.c.f177930a;
                    } else if (abstractC38708b instanceof AbstractC38708b.b) {
                        objM128001g = new InterfaceC41233f.a(((AbstractC38708b.b) abstractC38708b).getCampaignFilter());
                    } else {
                        if (!(abstractC38708b instanceof AbstractC38708b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM128001g = this.f172261x.m128001g(((AbstractC38708b.a) abstractC38708b).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
                    }
                    c42719a.f172268y = null;
                    c42719a.f172262E = null;
                    c42719a.f172263F = null;
                    c42719a.f172264G = null;
                    c42719a.f172265H = 0;
                    c42719a.f172267x = 1;
                    if (interfaceC13062m.emit(objM128001g, c42719a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C39897a c39897a) {
            this.f172258w = interfaceC13058l;
            this.f172259x = c39897a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f172258w.collect(new C42718a(interfaceC13062m, this.f172259x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m127998d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private final C41228a m127999e(CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse) {
        return new C41228a(new AbstractC22403o.c(campaignSectionEmptyStateResponse.getImageUrl(), 0, 0, 0, 14, null), AbstractC8693b.m21278l(campaignSectionEmptyStateResponse.getTitleDisplay()), AbstractC8693b.m21278l(campaignSectionEmptyStateResponse.getBodyDisplay()));
    }

    /* JADX INFO: renamed from: f */
    private final C41232e m128000f(CampaignSectionResponseV2 campaignSectionResponseV2) {
        List<InterfaceC25312u> listM60540g;
        String title = campaignSectionResponseV2.getTitle();
        TextResource textResourceM21278l = title != null ? AbstractC8693b.m21278l(title) : null;
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(campaignSectionResponseV2.getSubtitle());
        List<DesignSystemModel> campaignResponse = campaignSectionResponseV2.getCampaignResponse();
        if (campaignResponse == null || (listM60540g = this.reducer.m60540g(campaignResponse)) == null) {
            listM60540g = C25271y.f99162w;
        }
        CampaignSectionEmptyStateResponse emptyState = campaignSectionResponseV2.getEmptyState();
        return new C41232e(textResourceM21278l, c8691eM21279m, listM60540g, emptyState != null ? m127999e(emptyState) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    public final InterfaceC41233f.b m128001g(CompletedCampaignsScreenResponse completedCampaignsScreenResponse) {
        ?? arrayList;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(completedCampaignsScreenResponse.getPageTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(completedCampaignsScreenResponse.getPageHeaderTitle());
        String pageHeaderBody = completedCampaignsScreenResponse.getPageHeaderBody();
        List<CampaignSectionResponseV2> campaignSections = completedCampaignsScreenResponse.getCampaignSections();
        if (campaignSections != null) {
            List<CampaignSectionResponseV2> list = campaignSections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m128000f((CampaignSectionResponseV2) it.next()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return new InterfaceC41233f.b(textResourceM21278l, textResourceM21278l2, pageHeaderBody, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m128002c(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new a(domainStateFlow, this);
    }
}
