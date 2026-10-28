package xn0;

import co0.C4858a;
import com.whoop.service.network.AuthServiceApiV2;
import com.whoop.service.network.model.ForgotPasswordRequest;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: xn0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lxn0/d;", "", "Lcom/whoop/service/network/AuthServiceApiV2;", "authServiceApiV2", "Lco0/a;", "jwtTokenParser", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/AuthServiceApiV2;Lco0/a;Ltr2/n;)V", "", "expiredToken", "emailFromArgs", "Lxn0/e;", "b", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/service/network/AuthServiceApiV2;", "Lco0/a;", "c", "Ltr2/n;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38476d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AuthServiceApiV2 authServiceApiV2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4858a jwtTokenParser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: xn0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.reset.SendNewResetLinkHandler", m100430f = "SendNewResetLinkHandler.kt", m100431l = {27}, m100432m = "sendNewResetLink", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f164843F;

        /* JADX INFO: renamed from: w */
        Object f164844w;

        /* JADX INFO: renamed from: x */
        Object f164845x;

        /* JADX INFO: renamed from: y */
        Object f164846y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f164847z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164847z = obj;
            this.f164843F |= Integer.MIN_VALUE;
            return C38476d.this.m123293b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: xn0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.reset.SendNewResetLinkHandler$sendNewResetLink$result$1", m100430f = "SendNewResetLinkHandler.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f164848w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f164850y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f164850y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C38476d.this.new b(this.f164850y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164848w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AuthServiceApiV2 authServiceApiV2 = C38476d.this.authServiceApiV2;
            ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(this.f164850y);
            this.f164848w = 1;
            Object objForgotPassword = authServiceApiV2.forgotPassword(forgotPasswordRequest, false, this);
            return objForgotPassword == enumC31071a ? enumC31071a : objForgotPassword;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C38476d(AuthServiceApiV2 authServiceApiV2, C4858a jwtTokenParser, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authServiceApiV2, "authServiceApiV2");
        AbstractC22676k.m65750j(jwtTokenParser, "jwtTokenParser");
        AbstractC22676k.m65750j(logger, "logger");
        this.authServiceApiV2 = authServiceApiV2;
        this.jwtTokenParser = jwtTokenParser;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m123293b(String str, String str2, InterfaceC30057d<? super AbstractC38477e> interfaceC30057d) {
        a aVar;
        String str3;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f164843F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f164843F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f164847z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f164843F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (str2 == null) {
                str2 = this.jwtTokenParser.m15499a(str);
            }
            if (str2 == null) {
                this.logger.mo85222m("Failed to get email for new reset link", new AbstractC30556a.a[0]);
                return AbstractC38477e.a.f164851a;
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str2, null);
            aVar2.f164844w = null;
            aVar2.f164845x = null;
            aVar2.f164846y = str2;
            aVar2.f164843F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            str3 = str2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) aVar2.f164846y;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC38477e.b(str3);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            this.logger.mo85222m("Network error sending new reset link", new AbstractC30556a.a[0]);
            return AbstractC38477e.a.f164851a;
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85222m(AbstractC2875y.m8295h(((InterfaceC34385a.b.a) interfaceC34385a).getErrorCode(), "Server error sending new reset link: "), new AbstractC30556a.a[0]);
        return AbstractC38477e.a.f164851a;
    }

    public /* synthetic */ C38476d(AuthServiceApiV2 authServiceApiV2, C4858a c4858a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(authServiceApiV2, (i13 & 2) != 0 ? new C4858a(null, 1, null) : c4858a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SendNewResetLinkHandler") : interfaceC34116n);
    }
}
