package xf2;

import com.whoop.sms.common.data.SmsVerificationApi;
import com.whoop.sms.common.data.TextingSettingsAvailabilityResponse;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: xf2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lxf2/a;", "", "Lcom/whoop/sms/common/data/SmsVerificationApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/sms/common/data/SmsVerificationApi;Ltr2/n;)V", "Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse;", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/sms/common/data/SmsVerificationApi;", "Ltr2/n;", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38263a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SmsVerificationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: xf2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.common.data.TextingSettingsAvailabilityRepository", m100430f = "TextingSettingsAvailabilityRepository.kt", m100431l = {12}, m100432m = "getTextingSettingsAvailability", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f164046w;

        /* JADX INFO: renamed from: y */
        int f164048y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164046w = obj;
            this.f164048y |= Integer.MIN_VALUE;
            return C38263a.this.m122601b(this);
        }
    }

    /* JADX INFO: renamed from: xf2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.common.data.TextingSettingsAvailabilityRepository$getTextingSettingsAvailability$response$1", m100430f = "TextingSettingsAvailabilityRepository.kt", m100431l = {12}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f164049w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C38263a.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164049w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SmsVerificationApi smsVerificationApi = C38263a.this.api;
            this.f164049w = 1;
            Object objTextingSettingsAvailability = smsVerificationApi.textingSettingsAvailability(this);
            return objTextingSettingsAvailability == enumC31071a ? enumC31071a : objTextingSettingsAvailability;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<TextingSettingsAvailabilityResponse>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C38263a(SmsVerificationApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m122601b(InterfaceC30057d<? super TextingSettingsAvailabilityResponse> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f164048y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f164048y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f164046w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f164048y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f164048y = 1;
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
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return (TextingSettingsAvailabilityResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C38263a(SmsVerificationApi smsVerificationApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(smsVerificationApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TextingSettingsAvailabilityRepository") : interfaceC34116n);
    }
}
