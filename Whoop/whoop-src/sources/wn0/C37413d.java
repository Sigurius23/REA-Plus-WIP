package wn0;

import com.whoop.service.network.AuthServiceApiV2;
import com.whoop.service.network.model.ResetPasswordRequest;
import l83.C23454a0;
import p000.AbstractC11266d;
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

/* JADX INFO: renamed from: wn0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lwn0/d;", "", "Lcom/whoop/service/network/AuthServiceApiV2;", "authServiceApiV2", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;)V", "", "errorCode", "Lwn0/e;", "b", "(I)Lwn0/e;", "", "token", "newPassword", "Lwn0/f;", "c", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/service/network/AuthServiceApiV2;", "Ltr2/n;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37413d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AuthServiceApiV2 authServiceApiV2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: wn0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.PasswordResetSubmissionHandler", m100430f = "PasswordResetSubmissionHandler.kt", m100431l = {34}, m100432m = "submitPasswordReset", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f160140E;

        /* JADX INFO: renamed from: w */
        Object f160141w;

        /* JADX INFO: renamed from: x */
        Object f160142x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f160143y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f160143y = obj;
            this.f160140E |= Integer.MIN_VALUE;
            return C37413d.this.m119774c(null, null, this);
        }
    }

    /* JADX INFO: renamed from: wn0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.PasswordResetSubmissionHandler$submitPasswordReset$result$1", m100430f = "PasswordResetSubmissionHandler.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f160145w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f160147y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f160148z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f160147y = str;
            this.f160148z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37413d.this.new b(this.f160147y, this.f160148z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160145w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AuthServiceApiV2 authServiceApiV2 = C37413d.this.authServiceApiV2;
            String strM30461o = AbstractC11266d.m30461o("Bearer ", this.f160147y);
            ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest(this.f160148z);
            this.f160145w = 1;
            Object objResetPassword = authServiceApiV2.resetPassword(strM30461o, resetPasswordRequest, this);
            return objResetPassword == enumC31071a ? enumC31071a : objResetPassword;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C37413d(AuthServiceApiV2 authServiceApiV2, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authServiceApiV2, "authServiceApiV2");
        AbstractC22676k.m65750j(logger, "logger");
        this.authServiceApiV2 = authServiceApiV2;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC37414e m119773b(int errorCode) {
        if (errorCode == 401) {
            return AbstractC37414e.e.f160153a;
        }
        if (errorCode == 409) {
            return new AbstractC37414e.b(null, 1, null);
        }
        if (errorCode != 422) {
            return errorCode != 500 ? new AbstractC37414e.d(errorCode) : new AbstractC37414e.d(500);
        }
        return new AbstractC37414e.c(null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m119774c(String str, String str2, InterfaceC30057d<? super AbstractC37415f> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f160140E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f160140E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f160143y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f160140E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, str2, null);
            aVar2.f160141w = null;
            aVar2.f160142x = null;
            aVar2.f160140E = 1;
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
            return AbstractC37415f.b.f160155a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            this.logger.mo85222m("Network error resetting password", new AbstractC30556a.a[0]);
            return new AbstractC37415f.a(new AbstractC37414e.a(true));
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.b.a aVar3 = (InterfaceC34385a.b.a) interfaceC34385a;
        this.logger.mo85222m(AbstractC2875y.m8295h(aVar3.getErrorCode(), "Server error resetting password: "), new AbstractC30556a.a[0]);
        return new AbstractC37415f.a(m119773b(aVar3.getErrorCode()));
    }

    public /* synthetic */ C37413d(AuthServiceApiV2 authServiceApiV2, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(authServiceApiV2, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PasswordResetSubmissionHandler") : interfaceC34116n);
    }
}
