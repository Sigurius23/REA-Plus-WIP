package i92;

import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bh3.InterfaceC3255b;
import bh3.InterfaceC3259f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch3.C4716w0;
import com.whoop.data.local.room.entity.UpdateUserTimeZone;
import com.whoop.service.network.UsersPreferenceApi;
import com.whoop.service.network.model.ProfileDto;
import fh3.C14493a;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;
import ud3.C34854z0;
import xg3.C38280g;
import xg3.C38289p;
import xg3.InterfaceC38290q;

/* JADX INFO: renamed from: i92.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Li92/o;", "", "Lbc3/c0;", "applicationScope", "Lcom/whoop/service/network/UsersPreferenceApi;", "usersPreferenceApi", "Lkotlin/Function0;", "", "clockPreference", "Ltr2/n;", "logger", "<init>", "(Lbc3/c0;Lcom/whoop/service/network/UsersPreferenceApi;Lc93/a;Ltr2/n;)V", "Lxg3/g;", "Lpg3/v0;", "Lcom/whoop/service/network/model/ProfileDto;", "f", "()Lxg3/g;", "a", "Lbc3/c0;", "b", "Lcom/whoop/service/network/UsersPreferenceApi;", "c", "Lc93/a;", "d", "Ltr2/n;", "e", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18270o {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final UsersPreferenceApi usersPreferenceApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4339a clockPreference;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: i92.o$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Li92/o$a;", "", "<init>", "()V", "", "using24HourTime", "Lorg/joda/time/DateTimeZone;", "zone", "Lcom/whoop/service/network/UsersPreferenceApi;", "usersPreferenceApi", "Ltr2/n;", "logger", "", "timestamp", "Lu02/a;", "Ll83/a0;", "a", "(ZLorg/joda/time/DateTimeZone;Lcom/whoop/service/network/UsersPreferenceApi;Ltr2/n;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;", "", "TWENTY_FOUR_HOUR_FORMAT", "Ljava/lang/String;", "TWELVE_HOUR_FORMAT", "TIMEZONE_DATE_FORMAT_PATTERN", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: i92.o$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.service.network.UserWsKotlinBridge$Companion$updateUserTimeZone$2", m100430f = "UserWsKotlinBridge.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41733a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f71111w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ UsersPreferenceApi f71112x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ UpdateUserTimeZone f71113y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41733a(UsersPreferenceApi usersPreferenceApi, UpdateUserTimeZone updateUserTimeZone, InterfaceC30057d<? super C41733a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f71112x = usersPreferenceApi;
                this.f71113y = updateUserTimeZone;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41733a(this.f71112x, this.f71113y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f71111w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    UsersPreferenceApi usersPreferenceApi = this.f71112x;
                    UpdateUserTimeZone updateUserTimeZone = this.f71113y;
                    this.f71111w = 1;
                    if (usersPreferenceApi.updateTimeZone(updateUserTimeZone, this) == enumC31071a) {
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

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41733a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Object m52634a(boolean z4, DateTimeZone dateTimeZone, UsersPreferenceApi usersPreferenceApi, InterfaceC34116n interfaceC34116n, Long l7, InterfaceC30057d<? super InterfaceC34385a<C23454a0>> interfaceC30057d) {
            long jLongValue = l7 != null ? l7.longValue() : DateTime.now(DateTimeZone.UTC).getMillis();
            String str = z4 ? "TWENTY_FOUR_HOUR_FORMAT" : "TWELVE_HOUR_FORMAT";
            String string = dateTimeZone.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
            AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
            return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, interfaceC34116n, null, "Failed to update user time zone ".concat(string), new C41733a(usersPreferenceApi, new UpdateUserTimeZone(str, string, AbstractC2875y.m8299l(new DateTime(jLongValue, DateTimeZone.UTC).toString(dateTimeFormatterForPattern), "+0000")), null), interfaceC30057d, 2, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: i92.o$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.UserWsKotlinBridge$setUserTimeZone$1$job$1", m100430f = "UserWsKotlinBridge.kt", m100431l = {27}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71114w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC38290q f71116y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC38290q interfaceC38290q, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71116y = interfaceC38290q;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C18270o.this.new b(this.f71116y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM52634a;
            C29218v0 c29218v0M88723a;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71114w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Companion companion = C18270o.INSTANCE;
                boolean zBooleanValue = ((Boolean) C18270o.this.clockPreference.invoke()).booleanValue();
                DateTimeZone dateTimeZone = DateTimeZone.getDefault();
                AbstractC22676k.m65749i(dateTimeZone, "getDefault(...)");
                UsersPreferenceApi usersPreferenceApi = C18270o.this.usersPreferenceApi;
                InterfaceC34116n interfaceC34116n = C18270o.this.logger;
                this.f71114w = 1;
                objM52634a = companion.m52634a(zBooleanValue, dateTimeZone, usersPreferenceApi, interfaceC34116n, null, this);
                if (objM52634a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM52634a = obj;
            }
            if (((InterfaceC34385a) objM52634a) instanceof InterfaceC34385a.c) {
                c29218v0M88723a = C29218v0.m88725c(new ProfileDto(0.0f, 0.0f, null, null, null, null, null, null, 0, 0, false, 2047, null));
            } else {
                C34854z0 c34854z0 = AbstractC34799a1.f146522x;
                c29218v0M88723a = C29218v0.m88723a(650, AbstractC12350b.m34590k("Failed to set zone", null));
            }
            ((C4716w0) this.f71116y).m14775d(c29218v0M88723a);
            return C23454a0.f92919a;
        }
    }

    public C18270o(InterfaceC2994c0 applicationScope, UsersPreferenceApi usersPreferenceApi, InterfaceC4339a clockPreference, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(usersPreferenceApi, "usersPreferenceApi");
        AbstractC22676k.m65750j(clockPreference, "clockPreference");
        AbstractC22676k.m65750j(logger, "logger");
        this.applicationScope = applicationScope;
        this.usersPreferenceApi = usersPreferenceApi;
        this.clockPreference = clockPreference;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m52631g(C18270o c18270o, InterfaceC38290q interfaceC38290q) {
        final C2996c2 c2996c2M8732z = AbstractC3006f0.m8732z(c18270o.applicationScope, null, null, c18270o.new b(interfaceC38290q, null), 3);
        InterfaceC3259f interfaceC3259f = new InterfaceC3259f() { // from class: i92.n
            @Override // bh3.InterfaceC3259f
            public final void cancel() {
                C18270o.m52632h(c2996c2M8732z);
            }
        };
        C4716w0 c4716w0 = (C4716w0) interfaceC38290q;
        c4716w0.getClass();
        c4716w0.f19294x.m41405c(new C14493a(interfaceC3259f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m52632h(InterfaceC3027k1 interfaceC3027k1) {
        interfaceC3027k1.cancel((CancellationException) null);
    }

    /* JADX INFO: renamed from: f */
    public final C38280g<C29218v0<ProfileDto>> m52633f() {
        C38280g<C29218v0<ProfileDto>> c38280gM122683a = C38289p.m122683a(C38289p.m122684b(new InterfaceC3255b() { // from class: i92.m
            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                C18270o.m52631g(this.f71104w, (InterfaceC38290q) obj);
            }
        }));
        AbstractC22676k.m65749i(c38280gM122683a, "toObservable(...)");
        return c38280gM122683a;
    }
}
