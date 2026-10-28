package u22;

import com.whoop.payments.feature.paymentmethodmanagement.domain.GetPaymentMethodMenuItemRequest;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p208i2.C17919x;
import p505ts.AbstractC34132o;
import p510u0.C34350r;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;

/* JADX INFO: renamed from: u22.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lu22/i;", "Lu22/h;", "Lu02/c;", "apiClient", "Ljb1/a;", "reducer", "Ltr2/n;", "logger", "<init>", "(Lu02/c;Ljb1/a;Ltr2/n;)V", "Lu22/j;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lu02/c;", "b", "Ljb1/a;", "c", "Ltr2/n;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34494i implements InterfaceC34493h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: u22.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodMenuItemRepositoryImpl", m100430f = "PaymentMethodMenuItemRepository.kt", m100431l = {30, 36}, m100432m = "getPaymentMethodMenuItem", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f144977E;

        /* JADX INFO: renamed from: w */
        Object f144978w;

        /* JADX INFO: renamed from: x */
        Object f144979x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f144980y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f144980y = obj;
            this.f144977E |= Integer.MIN_VALUE;
            return C34494i.this.mo109028a(this);
        }
    }

    /* JADX INFO: renamed from: u22.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodMenuItemRepositoryImpl$getPaymentMethodMenuItem$apiResult$1", m100430f = "PaymentMethodMenuItemRepository.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f144982w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ GetPaymentMethodMenuItemRequest f144984y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GetPaymentMethodMenuItemRequest getPaymentMethodMenuItemRequest, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f144984y = getPaymentMethodMenuItemRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C34494i.this.new b(this.f144984y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144982w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C34387c c34387c = C34494i.this.apiClient;
            GetPaymentMethodMenuItemRequest getPaymentMethodMenuItemRequest = this.f144984y;
            InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(GetPaymentMethodMenuItemRequest.class);
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(GetPaymentMethodMenuItemRequest.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
            this.f144982w = 1;
            Object objM108748d = c34387c.m108748d(getPaymentMethodMenuItemRequest, c32236aM44445Y, this);
            return objM108748d == enumC31071a ? enumC31071a : objM108748d;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: u22.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f144985w = new c();

        /* JADX INFO: renamed from: a */
        public final long m109032a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m109032a((C39336i) obj));
        }
    }

    public C34494i(C34387c apiClient, C21535a reducer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(logger, "logger");
        this.apiClient = apiClient;
        this.reducer = reducer;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m109030c(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r1 == r2) goto L24;
     */
    @Override // u22.InterfaceC34493h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo109028a(q83.InterfaceC30057d<? super u22.C34495j> r24) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u22.C34494i.mo109028a(q83.d):java.lang.Object");
    }

    public /* synthetic */ C34494i(C34387c c34387c, C21535a c21535a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34387c, (i13 & 2) != 0 ? AbstractC21537c.m60554d(new C34350r(21)) : c21535a, interfaceC34116n);
    }
}
