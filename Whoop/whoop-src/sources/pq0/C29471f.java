package pq0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.commons.Resource;
import com.whoop.domain.model.AuthToken;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.teams.Widget;
import com.whoop.domain.model.teams.WidgetCollectionResponse;
import cq0.C11060h;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hj0.AbstractC17356o;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import l83.C23454a0;
import l83.C23465k;
import od1.C27858u;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: pq0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u00011B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u001a\u0010 \u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%R$\u0010,\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b\u0017\u0010*\"\u0004\b\u001c\u0010+R\u001f\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010.¨\u00062"}, m65681d2 = {"Lpq0/f;", "Lhj0/o;", "Lcq0/h;", "widgetRepository", "Lod1/u;", "userContext", "Ltr2/n;", "logger", "Li92/e;", "networkMonitor", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcq0/h;Lod1/u;Ltr2/n;Li92/e;Lbc3/c0;)V", "", "selectedDate", "selectedPillar", "Ll83/a0;", "D", "(Ljava/lang/String;Ljava/lang/String;)V", "H", "E", "Lcq0/h;", "F", "Lod1/u;", "G", "Ltr2/n;", "Li92/e;", "I", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "Lpq0/i;", "J", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "shareWidgetDialogViewStateLiveData", "Lcom/whoop/domain/model/teams/Widget;", "K", "Lcom/whoop/domain/model/teams/Widget;", "()Lcom/whoop/domain/model/teams/Widget;", "(Lcom/whoop/domain/model/teams/Widget;)V", "selectedWidget", "Ll83/k;", "()Ll83/k;", "authHeader", "L", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29471f extends AbstractC17356o {

    /* JADX INFO: renamed from: M */
    public static final int f119688M = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C11060h widgetRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final AbstractC1615p0 shareWidgetDialogViewStateLiveData;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private Widget selectedWidget;

    /* JADX INFO: renamed from: pq0.f$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.share.GlobalShareDialogViewModel$fetchWidgets$1", m100430f = "GlobalShareDialogViewModel.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119696w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f119698y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f119699z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119698y = str;
            this.f119699z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29471f.this.new b(this.f119698y, this.f119699z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM29836f;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119696w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11060h c11060h = C29471f.this.widgetRepository;
                String str = this.f119698y;
                String str2 = this.f119699z;
                this.f119696w = 1;
                objM29836f = c11060h.m29836f(str, str2, 0, 25, this);
                if (objM29836f == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM29836f = obj;
            }
            Resource resource = (Resource) objM29836f;
            if (resource.getSuccess()) {
                WidgetCollectionResponse widgetCollectionResponse = (WidgetCollectionResponse) resource.getData();
                if (widgetCollectionResponse != null) {
                    C29471f c29471f = C29471f.this;
                    C29472g c29472gM90002a = (widgetCollectionResponse.getRecords().isEmpty() || !widgetCollectionResponse.getHasData()) ? C29472g.INSTANCE.m90002a() : null;
                    c29471f.m49138t(c29471f.getShareWidgetDialogViewStateLiveData(), new C29474i(widgetCollectionResponse.getRecords(), c29471f.m89987E(), widgetCollectionResponse.getRecords().size() > 1 && c29472gM90002a == null, c29471f.networkMonitor.isConnected(), c29472gM90002a));
                }
            } else {
                C29471f.this.logger.mo85216g("fetch widgets api call failed", new AbstractC30556a.a[0]);
                C29471f c29471f2 = C29471f.this;
                c29471f2.m49140v(c29471f2.getShareWidgetDialogViewStateLiveData(), new C29474i(null, null, false, C29471f.this.networkMonitor.isConnected(), C29472g.INSTANCE.m90004c(), 7, null));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pq0.f$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.share.GlobalShareDialogViewModel$observeConnectivity$1", m100430f = "GlobalShareDialogViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119700w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f119702y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f119703z;

        /* JADX INFO: renamed from: pq0.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C29471f f119704w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f119705x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f119706y;

            public a(C29471f c29471f, String str, String str2) {
                this.f119704w = c29471f;
                this.f119705x = str;
                this.f119706y = str2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC18263h abstractC18263h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (abstractC18263h.m52614a()) {
                    this.f119704w.m89983D(this.f119705x, this.f119706y);
                } else {
                    C29471f c29471f = this.f119704w;
                    c29471f.m49140v(c29471f.getShareWidgetDialogViewStateLiveData(), new C29474i(null, null, false, abstractC18263h.m52614a(), C29472g.INSTANCE.m90003b(), 7, null));
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119702y = str;
            this.f119703z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29471f.this.new c(this.f119702y, this.f119703z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119700w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lMo52604a = C29471f.this.networkMonitor.mo52604a();
                a aVar = new a(C29471f.this, this.f119702y, this.f119703z);
                this.f119700w = 1;
                if (interfaceC13058lMo52604a.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29471f(C11060h widgetRepository, C27858u userContext, InterfaceC34116n logger, InterfaceC18260e networkMonitor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(widgetRepository, "widgetRepository");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.widgetRepository = widgetRepository;
        this.userContext = userContext;
        this.logger = logger;
        this.networkMonitor = networkMonitor;
        this.logTag = "GlobalShareDialogViewModel";
        this.shareWidgetDialogViewStateLiveData = new C1630u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final void m89983D(String selectedDate, String selectedPillar) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(selectedPillar, selectedDate, null), 3);
    }

    /* JADX INFO: renamed from: E */
    public final C23465k m89987E() {
        AuthToken authToken;
        String accessToken;
        Session sessionM84057h = this.userContext.m84057h();
        if (sessionM84057h == null || (authToken = sessionM84057h.getAuthToken()) == null || (accessToken = authToken.getAccessToken()) == null) {
            return null;
        }
        return new C23465k(TokenAuthInterceptor.AUTH_HEADER, "Bearer ".concat(accessToken));
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Widget getSelectedWidget() {
        return this.selectedWidget;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final AbstractC1615p0 getShareWidgetDialogViewStateLiveData() {
        return this.shareWidgetDialogViewStateLiveData;
    }

    /* JADX INFO: renamed from: H */
    public final void m89990H(String selectedDate, String selectedPillar) {
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(selectedPillar, "selectedPillar");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(selectedDate, selectedPillar, null), 3);
    }

    /* JADX INFO: renamed from: I */
    public final void m89991I(Widget widget) {
        this.selectedWidget = widget;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C29471f(C11060h c11060h, C27858u c27858u, InterfaceC34116n interfaceC34116n, InterfaceC18260e interfaceC18260e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11060h, c27858u, interfaceC34116n, interfaceC18260e, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
