package wn0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.service.network.AuthServiceApiV2;
import com.whoop.service.network.model.PasswordRequirement;
import com.whoop.service.network.model.PasswordRequirementsResponse;
import java.util.List;
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

/* JADX INFO: renamed from: wn0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lwn0/b;", "", "Lcom/whoop/service/network/AuthServiceApiV2;", "authServiceApiV2", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;)V", "Lwn0/a;", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/service/network/AuthServiceApiV2;", "Ltr2/n;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37411b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AuthServiceApiV2 authServiceApiV2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: wn0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.PasswordRequirementsFetcher", m100430f = "PasswordRequirementsFetcher.kt", m100431l = {C1533u.MAX_FIELD_NUMBER}, m100432m = "fetchPasswordRequirements", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f160128w;

        /* JADX INFO: renamed from: y */
        int f160130y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f160128w = obj;
            this.f160130y |= Integer.MIN_VALUE;
            return C37411b.this.m119771b(this);
        }
    }

    /* JADX INFO: renamed from: wn0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.PasswordRequirementsFetcher$fetchPasswordRequirements$result$1", m100430f = "PasswordRequirementsFetcher.kt", m100431l = {C1533u.MAX_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/service/network/model/PasswordRequirementsResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f160131w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37411b.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160131w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AuthServiceApiV2 authServiceApiV2 = C37411b.this.authServiceApiV2;
            this.f160131w = 1;
            Object passwordRequirements = authServiceApiV2.getPasswordRequirements(this);
            return passwordRequirements == enumC31071a ? enumC31071a : passwordRequirements;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<PasswordRequirementsResponse>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C37411b(AuthServiceApiV2 authServiceApiV2, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authServiceApiV2, "authServiceApiV2");
        AbstractC22676k.m65750j(logger, "logger");
        this.authServiceApiV2 = authServiceApiV2;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m119771b(InterfaceC30057d<? super AbstractC37410a> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f160130y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f160130y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f160128w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f160130y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f160130y = 1;
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
            PasswordRequirementsResponse passwordRequirementsResponse = (PasswordRequirementsResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
            List<PasswordRequirement> passwordPolicies = passwordRequirementsResponse != null ? passwordRequirementsResponse.getPasswordPolicies() : null;
            List<PasswordRequirement> list = passwordPolicies;
            return (list == null || list.isEmpty()) ? new AbstractC37410a.a(AbstractC37412c.a.f160133a) : new AbstractC37410a.b(passwordPolicies);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            InterfaceC34385a.b.C42432b c42432b = (InterfaceC34385a.b.C42432b) interfaceC34385a;
            this.logger.mo85222m(AbstractC11266d.m30461o("Network error fetching password requirements: ", c42432b.getErrorMessage()), new AbstractC30556a.a[0]);
            return new AbstractC37410a.a(new AbstractC37412c.b(c42432b.getErrorMessage(), true));
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.b.a aVar3 = (InterfaceC34385a.b.a) interfaceC34385a;
        this.logger.mo85222m(AbstractC2875y.m8295h(aVar3.getErrorCode(), "Server error fetching password requirements: "), new AbstractC30556a.a[0]);
        return new AbstractC37410a.a(new AbstractC37412c.c(aVar3.getErrorCode(), null));
    }

    public /* synthetic */ C37411b(AuthServiceApiV2 authServiceApiV2, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(authServiceApiV2, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PasswordRequirementsFetcher") : interfaceC34116n);
    }
}
