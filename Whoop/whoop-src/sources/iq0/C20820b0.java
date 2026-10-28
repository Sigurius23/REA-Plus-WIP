package iq0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bq0.C3548d;
import c93.InterfaceC4351m;
import com.whoop.data.remote.commons.Resource;
import com.whoop.profile.domain.ProfileApiKt;
import cq0.C11053a;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: iq0.b0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0011\u001a\u0004\b!\u0010\"\"\u0004\b\u001b\u0010#R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0017\u0010)R+\u00101\u001a\u00020&2\u0006\u0010+\u001a\u00020&8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u0013\u0010.\"\u0004\b/\u00100R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b\u0019\u0010)¨\u00066"}, m65681d2 = {"Liq0/b0;", "Lhj0/o;", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lcq0/a;", "chatRepository", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "<init>", "(Lio/getstream/chat/android/client/ChatClient;Lcq0/a;Ltr2/n;Lbc3/c0;)V", "Ll83/a0;", "D", "()V", "", "notificationType", "I", "(Ljava/lang/String;)V", "E", "Lio/getstream/chat/android/client/ChatClient;", "getChatClient", "()Lio/getstream/chat/android/client/ChatClient;", "F", "Lcq0/a;", "G", "Ltr2/n;", "H", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "", "C", "()I", "(I)V", ProfileApiKt.COMMUNITY_ID_PARAM, "Landroidx/lifecycle/p0;", "Liq0/c0;", "J", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "notificationSettingsViewStateLiveData", "<set-?>", "K", "Lf93/d;", "()Liq0/c0;", "setNotificationSettingsViewState", "(Liq0/c0;)V", "notificationSettingsViewState", "L", "notificationViewState", "M", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20820b0 extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final ChatClient chatClient;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C11053a chatRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private int communityId;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final AbstractC1615p0 notificationSettingsViewStateLiveData;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC14292d notificationSettingsViewState;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AbstractC1615p0 notificationViewState;

    /* JADX INFO: renamed from: N */
    static final /* synthetic */ InterfaceC21493z[] f78162N = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C20820b0.class, "notificationSettingsViewState", "getNotificationSettingsViewState()Lcom/whoop/community/presentation/chat/NotificationSettingsViewState;", 0))};

    /* JADX INFO: renamed from: O */
    public static final int f78163O = 8;

    /* JADX INFO: renamed from: iq0.b0$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.NotificationSettingsViewModel$getNotificationSettings$1", m100430f = "NotificationSettingsViewModel.kt", m100431l = {91}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78172w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20820b0.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String notificationSetting;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78172w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11053a c11053a = C20820b0.this.chatRepository;
                int communityId = C20820b0.this.getCommunityId();
                this.f78172w = 1;
                obj = c11053a.m29713g(communityId, this);
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
            if (resource.getSuccess()) {
                C3548d c3548d = (C3548d) resource.getData();
                if (c3548d != null && (notificationSetting = c3548d.getNotificationSetting()) != null) {
                    C20820b0 c20820b0 = C20820b0.this;
                    c20820b0.m49140v(c20820b0.getNotificationViewState(), notificationSetting);
                }
            } else {
                C20820b0.this.logger.mo85216g("Get notification settings failed", new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iq0.b0$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"iq0/b0$c", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C20822c0 value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C20820b0 f78175x;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, C20820b0 c20820b0) {
            this.f78175x = c20820b0;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C20822c0 getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C20822c0 value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C20820b0 c20820b0 = this.f78175x;
            c20820b0.m49138t(c20820b0.getNotificationSettingsViewStateLiveData(), this.f78175x.m57413E());
        }
    }

    /* JADX INFO: renamed from: iq0.b0$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.chat.NotificationSettingsViewModel$updateNotificationSettings$1", m100430f = "NotificationSettingsViewModel.kt", m100431l = {104}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78176w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f78178y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78178y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20820b0.this.new d(this.f78178y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78176w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11053a c11053a = C20820b0.this.chatRepository;
                int communityId = C20820b0.this.getCommunityId();
                String str = this.f78178y;
                this.f78176w = 1;
                obj = c11053a.m29717k(communityId, str, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                C20820b0.this.logger.mo85216g("Updating notifications settings failed", new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20820b0(ChatClient chatClient, C11053a chatRepository, InterfaceC34116n logger, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(chatRepository, "chatRepository");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.chatClient = chatClient;
        this.chatRepository = chatRepository;
        this.logger = logger;
        this.logTag = "NotificationSettingsViewModel";
        this.notificationSettingsViewStateLiveData = new C1630u0();
        this.notificationSettingsViewState = new c(new C20822c0(false, 1, null), this);
        this.notificationViewState = new C1630u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C20822c0 m57413E() {
        return (C20822c0) this.notificationSettingsViewState.getValue(this, f78162N[0]);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: D */
    public final void m57418D() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final AbstractC1615p0 getNotificationSettingsViewStateLiveData() {
        return this.notificationSettingsViewStateLiveData;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final AbstractC1615p0 getNotificationViewState() {
        return this.notificationViewState;
    }

    /* JADX INFO: renamed from: H */
    public final void m57421H(int i13) {
        this.communityId = i13;
    }

    /* JADX INFO: renamed from: I */
    public final void m57422I(String notificationType) {
        AbstractC22676k.m65750j(notificationType, "notificationType");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new d(notificationType, null), 3);
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C20820b0(ChatClient chatClient, C11053a c11053a, InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatClient, c11053a, interfaceC34116n, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
