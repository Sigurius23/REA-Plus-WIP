package hj0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.NotificationRepository;
import h02.C16587n0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import mh3.C25566c;
import n73.C26442a;
import nf3.C26669a;
import of3.InterfaceC27903a;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: hj0.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u0007\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R<\u00102\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010.\u001a\u0004\u0018\u00018\u00008D@DX\u0084\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u000f¨\u00063"}, m65681d2 = {"Lhj0/o;", "Landroidx/lifecycle/w1;", "Lof3/a;", "Lbc3/c0;", "viewModelScope", "<init>", "(Lbc3/c0;)V", "Ll83/a0;", "onCleared", "()V", "", "T", "Landroidx/lifecycle/p0;", "newValue", "t", "(Landroidx/lifecycle/p0;Ljava/lang/Object;)V", "", "sourceId", "u", "(Ljava/lang/String;)V", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "n", "()Ltr2/n;", "log", "Lmh3/c;", "x", "Lmh3/c;", "q", "()Lmh3/c;", "subscriptions", "Ln73/a;", "y", "Ln73/a;", "l", "()Ln73/a;", "disposables", "Lcom/whoop/data/repositories/NotificationRepository;", "z", "p", "()Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "o", "()Ljava/lang/String;", "logTag", "value", "getLatestValue", "(Landroidx/lifecycle/p0;)Ljava/lang/Object;", "v", "latestValue", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public abstract class AbstractC17356o extends AbstractC1637w1 implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h log;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25566c subscriptions;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C26442a disposables;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h notificationRepository;

    /* JADX INFO: renamed from: hj0.o$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.base.BaseViewModel$sendNotificationMetric$1", m100430f = "BaseViewModel.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f67269w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f67271y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f67271y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AbstractC17356o.this.new a(this.f67271y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67269w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                NotificationRepository notificationRepositoryM49133p = AbstractC17356o.this.m49133p();
                PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.Opened;
                String str = this.f67271y;
                this.f67269w = 1;
                if (notificationRepositoryM49133p.sendPushNotificationMetric(pushNotificationMetricType, str, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: hj0.o$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f67272w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f67273x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f67274y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f67272w = interfaceC27903a;
            this.f67273x = interfaceC35951a;
            this.f67274y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.NotificationRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final NotificationRepository invoke() {
            InterfaceC27903a interfaceC27903a = this.f67272w;
            InterfaceC35951a interfaceC35951a = this.f67273x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f67274y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(NotificationRepository.class), interfaceC35951a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC17356o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final NotificationRepository m49133p() {
        return (NotificationRepository) this.notificationRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC34116n m49134r(AbstractC17356o abstractC17356o) {
        return InterfaceC34116n.INSTANCE.m107848a(abstractC17356o.getLogTag());
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C26442a getDisposables() {
        return this.disposables;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC34116n m49136n() {
        return (InterfaceC34116n) this.log.getValue();
    }

    /* JADX INFO: renamed from: o */
    public abstract String getLogTag();

    @Override // androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        m49136n().mo85228t("onCleared", new AbstractC30556a.a[0]);
        this.subscriptions.m75180d();
        this.disposables.m78296d();
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final C25566c getSubscriptions() {
        return this.subscriptions;
    }

    /* JADX INFO: renamed from: t */
    public final <T> void m49138t(AbstractC1615p0 abstractC1615p0, T newValue) {
        AbstractC22676k.m65750j(abstractC1615p0, "<this>");
        AbstractC22676k.m65750j(newValue, "newValue");
        ((C1630u0) abstractC1615p0).postValue(newValue);
    }

    /* JADX INFO: renamed from: u */
    public final void m49139u(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(sourceId, null), 3);
    }

    /* JADX INFO: renamed from: v */
    public final <T> void m49140v(AbstractC1615p0 abstractC1615p0, T t14) {
        AbstractC22676k.m65750j(abstractC1615p0, "<this>");
        ((C1630u0) abstractC1615p0).setValue(t14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC17356o(InterfaceC2994c0 viewModelScope) {
        super(viewModelScope);
        AbstractC22676k.m65750j(viewModelScope, "viewModelScope");
        this.log = AbstractC30060g.m92088H(new C16587n0(this, 9));
        this.subscriptions = new C25566c();
        this.disposables = new C26442a();
        this.notificationRepository = AbstractC30060g.m92087G(EnumC23463i.f92933w, new b(this, null, null));
    }

    public /* synthetic */ AbstractC17356o(InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
