package mq0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bq0.C3546b;
import c93.InterfaceC4351m;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.repositories.StringsRepository;
import com.whoop.domain.model.AuthToken;
import com.whoop.domain.model.Session;
import cq0.C11053a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hj0.AbstractC17356o;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import od1.C27858u;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: mq0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001-B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001b\u0010'R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010*¨\u0006."}, m65681d2 = {"Lmq0/i;", "Lhj0/o;", "Li92/e;", "networkMonitor", "Lcq0/a;", "chatRepository", "Lod1/u;", "userContext", "Lcom/whoop/data/repositories/StringsRepository;", "stringsRepository", "Lbc3/c0;", "coroutineScope", "<init>", "(Li92/e;Lcq0/a;Lod1/u;Lcom/whoop/data/repositories/StringsRepository;Lbc3/c0;)V", "Ll83/a0;", "H", "()V", "", "Lbq0/b;", "dataWidgets", "Lmq0/c;", "F", "(Ljava/util/List;)Lmq0/c;", "I", "E", "Li92/e;", "Lcq0/a;", "G", "Lod1/u;", "Lcom/whoop/data/repositories/StringsRepository;", "", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "Lmq0/j;", "J", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "dataWidgetViewStateLiveData", "Ll83/k;", "()Ll83/k;", "authHeader", "K", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25884i extends AbstractC17356o {

    /* JADX INFO: renamed from: L */
    public static final int f102106L = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C11053a chatRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final StringsRepository stringsRepository;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final AbstractC1615p0 dataWidgetViewStateLiveData;

    /* JADX INFO: renamed from: mq0.i$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.datawidget.DataWidgetViewModel$getDataWidgets$1", m100430f = "DataWidgetViewModel.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102113w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25884i.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102113w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11053a c11053a = C25884i.this.chatRepository;
                this.f102113w = 1;
                obj = c11053a.m29712f(0, 25, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Resource resource = (Resource) obj;
            List list = (List) resource.getData();
            C25884i c25884i = C25884i.this;
            c25884i.m49140v(c25884i.getDataWidgetViewStateLiveData(), (!resource.getSuccess() || list == null) ? new C25885j(C25884i.this.networkMonitor.isConnected(), null, null, C25884i.this.m76521F(null), 6, null) : new C25885j(C25884i.this.networkMonitor.isConnected(), list, C25884i.this.m76520E(), C25884i.this.m76521F((List) resource.getData())));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mq0.i$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.datawidget.DataWidgetViewModel$observeConnectivity$1", m100430f = "DataWidgetViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102115w;

        /* JADX INFO: renamed from: mq0.i$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C25884i f102117w;

            public a(C25884i c25884i) {
                this.f102117w = c25884i;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC18263h abstractC18263h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (abstractC18263h.m52614a()) {
                    this.f102117w.m76522H();
                } else {
                    C25878c c25878c = new C25878c(this.f102117w.stringsRepository.getString(AbstractC38505d0.f165614R), this.f102117w.stringsRepository.getString(AbstractC38505d0.f165719u), false, 4, null);
                    C25884i c25884i = this.f102117w;
                    c25884i.m49140v(c25884i.getDataWidgetViewStateLiveData(), new C25885j(abstractC18263h.m52614a(), null, null, c25878c, 6, null));
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25884i.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102115w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lMo52604a = C25884i.this.networkMonitor.mo52604a();
                a aVar = new a(C25884i.this);
                this.f102115w = 1;
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
    public C25884i(InterfaceC18260e networkMonitor, C11053a chatRepository, C27858u userContext, StringsRepository stringsRepository, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(chatRepository, "chatRepository");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(stringsRepository, "stringsRepository");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.networkMonitor = networkMonitor;
        this.chatRepository = chatRepository;
        this.userContext = userContext;
        this.stringsRepository = stringsRepository;
        this.logTag = "DataWidgetViewModel";
        this.dataWidgetViewStateLiveData = new C1630u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C23465k m76520E() {
        AuthToken authToken;
        String accessToken;
        Session sessionM84057h = this.userContext.m84057h();
        if (sessionM84057h == null || (authToken = sessionM84057h.getAuthToken()) == null || (accessToken = authToken.getAccessToken()) == null) {
            return null;
        }
        return new C23465k(TokenAuthInterceptor.AUTH_HEADER, "Bearer ".concat(accessToken));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final C25878c m76521F(List<C3546b> dataWidgets) {
        if (dataWidgets == null) {
            return new C25878c(this.stringsRepository.getString(AbstractC38505d0.f165714s0), this.stringsRepository.getString(AbstractC38505d0.f165575E), true);
        }
        if (dataWidgets.isEmpty()) {
            return new C25878c(this.stringsRepository.getString(AbstractC38505d0.f165620T), this.stringsRepository.getString(AbstractC38505d0.f165623U), false);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final void m76522H() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final AbstractC1615p0 getDataWidgetViewStateLiveData() {
        return this.dataWidgetViewStateLiveData;
    }

    /* JADX INFO: renamed from: I */
    public final void m76527I() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(null), 3);
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C25884i(InterfaceC18260e interfaceC18260e, C11053a c11053a, C27858u c27858u, StringsRepository stringsRepository, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC18260e, c11053a, c27858u, stringsRepository, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
