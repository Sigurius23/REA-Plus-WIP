package yx2;

import ay2.C2156b;
import ay2.InterfaceC2155a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignListScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignSectionResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
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
import xx2.AbstractC38695b;
import yv0.C39805h;

/* JADX INFO: renamed from: yx2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lyx2/a;", "", "<init>", "()V", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;", "Lay2/a$b;", "e", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;)Lay2/a$b;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;", "Lay2/b;", "f", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;)Lay2/b;", "Lec3/l;", "Lxx2/b;", "domainStateFlow", "Lay2/a;", "c", "(Lec3/l;)Lec3/l;", "Ljb1/a;", "a", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39846a {

    /* JADX INFO: renamed from: b */
    public static final int f172082b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer = AbstractC21537c.m60554d(new C39805h(5));

    /* JADX INFO: renamed from: yx2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f172084w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39846a f172085x;

        /* JADX INFO: renamed from: yx2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42716a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f172086w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39846a f172087x;

            /* JADX INFO: renamed from: yx2.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignlist.reducer.CampaignListViewStateReducer$reduce$$inlined$map$1$2", m100430f = "CampaignListViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42717a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f172088E;

                /* JADX INFO: renamed from: F */
                Object f172089F;

                /* JADX INFO: renamed from: G */
                Object f172090G;

                /* JADX INFO: renamed from: H */
                int f172091H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f172092w;

                /* JADX INFO: renamed from: x */
                int f172093x;

                /* JADX INFO: renamed from: y */
                Object f172094y;

                public C42717a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f172092w = obj;
                    this.f172093x |= Integer.MIN_VALUE;
                    return C42716a.this.emit(null, this);
                }
            }

            public C42716a(InterfaceC13062m interfaceC13062m, C39846a c39846a) {
                this.f172086w = interfaceC13062m;
                this.f172087x = c39846a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42717a c42717a;
                Object objM127925e;
                if (interfaceC30057d instanceof C42717a) {
                    c42717a = (C42717a) interfaceC30057d;
                    int i13 = c42717a.f172093x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42717a.f172093x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42717a = new C42717a(interfaceC30057d);
                    }
                } else {
                    c42717a = new C42717a(interfaceC30057d);
                }
                Object obj2 = c42717a.f172092w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42717a.f172093x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f172086w;
                    AbstractC38695b abstractC38695b = (AbstractC38695b) obj;
                    if (AbstractC22676k.m65745e(abstractC38695b, AbstractC38695b.c.f166506a)) {
                        objM127925e = InterfaceC2155a.c.f8569a;
                    } else if (AbstractC22676k.m65745e(abstractC38695b, AbstractC38695b.b.f166505a)) {
                        objM127925e = InterfaceC2155a.a.f8561a;
                    } else {
                        if (!(abstractC38695b instanceof AbstractC38695b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM127925e = this.f172087x.m127925e(((AbstractC38695b.a) abstractC38695b).getCampaignListScreen());
                    }
                    c42717a.f172094y = null;
                    c42717a.f172088E = null;
                    c42717a.f172089F = null;
                    c42717a.f172090G = null;
                    c42717a.f172091H = 0;
                    c42717a.f172093x = 1;
                    if (interfaceC13062m.emit(objM127925e, c42717a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C39846a c39846a) {
            this.f172084w = interfaceC13058l;
            this.f172085x = c39846a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f172084w.collect(new C42716a(interfaceC13062m, this.f172085x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m127924d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX INFO: renamed from: e */
    public final InterfaceC2155a.b m127925e(CampaignListScreenResponse campaignListScreenResponse) {
        ?? arrayList;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(campaignListScreenResponse.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(campaignListScreenResponse.getDescription());
        List<CampaignSectionResponse> campaignSection = campaignListScreenResponse.getCampaignSection();
        if (campaignSection != null) {
            List<CampaignSectionResponse> list = campaignSection;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m127926f((CampaignSectionResponse) it.next()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        ?? r10 = arrayList;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(campaignListScreenResponse.getFooterText());
        DesignSystemModel footer = campaignListScreenResponse.getFooter();
        InterfaceC25312u interfaceC25312uM60541h = footer != null ? this.reducer.m60541h(footer) : null;
        String emptyStateText = campaignListScreenResponse.getEmptyStateText();
        if (emptyStateText == null) {
            emptyStateText = "";
        }
        return new InterfaceC2155a.b(textResourceM21278l, textResourceM21278l2, r10, textResourceM21278l3, interfaceC25312uM60541h, false, emptyStateText, 32, null);
    }

    /* JADX INFO: renamed from: f */
    private final C2156b m127926f(CampaignSectionResponse campaignSectionResponse) {
        List<InterfaceC25312u> listM60540g;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(campaignSectionResponse.getTitle());
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(campaignSectionResponse.getSubtitle());
        List<DesignSystemModel> campaignResponse = campaignSectionResponse.getCampaignResponse();
        if (campaignResponse == null || (listM60540g = this.reducer.m60540g(campaignResponse)) == null) {
            listM60540g = C25271y.f99162w;
        }
        return new C2156b(textResourceM21278l, c8691eM21279m, listM60540g);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m127927c(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new a(domainStateFlow, this);
    }
}
