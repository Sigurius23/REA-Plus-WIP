package f70;

import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.service.network.AuthServiceApiV2;
import com.whoop.service.network.model.ForgotPasswordRequest;
import h80.C17003c;
import h80.InterfaceC17002b;
import l83.C23454a0;
import n70.AbstractC26417d;
import n70.C26418e;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s70.AbstractC32238a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: f70.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lf70/a0;", "", "Lcom/whoop/service/network/AuthServiceApiV2;", "authServiceApiV2", "Lh80/c;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/AuthServiceApiV2;Lh80/c;Ltr2/n;)V", "Lf70/d$x;", "action", "Lf70/e;", "b", "(Lf70/d$x;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/service/network/AuthServiceApiV2;", "Lh80/c;", "c", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14165a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AuthServiceApiV2 authServiceApiV2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.a0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ForgotPasswordSubmissionHandler", m100430f = "ForgotPasswordSubmissionHandler.kt", m100431l = {24}, m100432m = "postForgotPassword$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51047w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51048x;

        /* JADX INFO: renamed from: z */
        int f51050z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51048x = obj;
            this.f51050z |= Integer.MIN_VALUE;
            return C14165a0.this.m40352b(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.a0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ForgotPasswordSubmissionHandler$postForgotPassword$2", m100430f = "ForgotPasswordSubmissionHandler.kt", m100431l = {25}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51051w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14173d.x f51053y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC14173d.x xVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51053y = xVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14165a0.this.new b(this.f51053y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51051w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AuthServiceApiV2 authServiceApiV2 = C14165a0.this.authServiceApiV2;
            ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(this.f51053y.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue());
            this.f51051w = 1;
            Object objForgotPassword = authServiceApiV2.forgotPassword(forgotPasswordRequest, false, this);
            return objForgotPassword == enumC31071a ? enumC31071a : objForgotPassword;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14165a0(AuthServiceApiV2 authServiceApiV2, C17003c analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authServiceApiV2, "authServiceApiV2");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.authServiceApiV2 = authServiceApiV2;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: b */
    public final Object m40352b(InterfaceC14173d.x xVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        InterfaceC14173d.x xVar2 = xVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51050z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51050z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f51048x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51050z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(xVar2, null);
            aVar2.f51047w = xVar2;
            aVar2.f51050z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar2 = (InterfaceC14173d.x) aVar2.f51047w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            this.analyticsHelper.m47941p(new InterfaceC17002b.a("forgot_password", "inline_error", "reset_password_email_fail", "authentication"));
            return AbstractC32238a.m100306a((InterfaceC34385a.b) interfaceC34385a) ? AbstractC32238a.m100307b() : new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.a(ActivationFlowDestination.CHECK_INBOX, AbstractC36095b.m114688p(Boolean.valueOf(xVar2.getFromPostPairing()), "fromPostPairing")), 15, null), null, new C14201q0(xVar2.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String(), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741822, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131061, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C14165a0(AuthServiceApiV2 authServiceApiV2, C17003c c17003c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(authServiceApiV2, c17003c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ForgotPasswordSubmissionHandler") : interfaceC34116n);
    }
}
