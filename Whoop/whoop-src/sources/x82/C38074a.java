package x82;

import c93.InterfaceC4339a;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.data.repositories.UserRepository;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: x82.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lx82/a;", "Lof3/a;", "<init>", "()V", "", "using24HourTime", "Ll83/a0;", "c", "(Z)V", "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "a", "()Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;", "smartAlarmTriggerRepository", "Lcom/whoop/data/repositories/UserRepository;", "x", "b", "()Lcom/whoop/data/repositories/UserRepository;", "userRepository", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38074a implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h smartAlarmTriggerRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h userRepository;

    /* JADX INFO: renamed from: x82.a$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f163068w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f163069x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f163070y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f163068w = interfaceC27903a;
            this.f163069x = interfaceC35951a;
            this.f163070y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.SmartAlarmTriggerRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final SmartAlarmTriggerRepository invoke() {
            InterfaceC27903a interfaceC27903a = this.f163068w;
            InterfaceC35951a interfaceC35951a = this.f163069x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f163070y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(SmartAlarmTriggerRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: x82.a$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f163071w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f163072x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f163073y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f163071w = interfaceC27903a;
            this.f163072x = interfaceC35951a;
            this.f163073y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.UserRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final UserRepository invoke() {
            InterfaceC27903a interfaceC27903a = this.f163071w;
            InterfaceC35951a interfaceC35951a = this.f163072x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f163073y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(UserRepository.class), interfaceC35951a);
        }
    }

    public C38074a() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.smartAlarmTriggerRepository = AbstractC30060g.m92087G(enumC23463i, new a(this, null, null));
        this.userRepository = AbstractC30060g.m92087G(enumC23463i, new b(this, null, null));
    }

    /* JADX INFO: renamed from: a */
    private final SmartAlarmTriggerRepository m121976a() {
        return (SmartAlarmTriggerRepository) this.smartAlarmTriggerRepository.getValue();
    }

    /* JADX INFO: renamed from: b */
    private final UserRepository m121977b() {
        return (UserRepository) this.userRepository.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m121978c(boolean using24HourTime) {
        m121976a().onTimeZoneChanged();
        m121977b().updateUserTimezonePreferences(using24HourTime, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
