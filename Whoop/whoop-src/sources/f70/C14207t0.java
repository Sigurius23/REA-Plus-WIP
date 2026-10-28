package f70;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vn0.C36195e;
import wn0.AbstractC37410a;
import wn0.C37411b;
import wn0.C37416g;

/* JADX INFO: renamed from: f70.t0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lf70/t0;", "", "Lwn0/b;", "passwordRequirementsFetcher", "Lvn0/e;", "passwordValidator", "Ltr2/n;", "logger", "<init>", "(Lwn0/b;Lvn0/e;Ltr2/n;)V", "", "password", "", "a", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lwn0/b;", "b", "Lvn0/e;", "c", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14207t0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C37411b passwordRequirementsFetcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36195e passwordValidator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.t0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.PasswordComplianceCheckHandler", m100430f = "PasswordComplianceCheckHandler.kt", m100431l = {25}, m100432m = "isPasswordResetNeeded", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51673w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51674x;

        /* JADX INFO: renamed from: z */
        int f51676z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51674x = obj;
            this.f51676z |= Integer.MIN_VALUE;
            return C14207t0.this.m40603a(null, this);
        }
    }

    public C14207t0(C37411b passwordRequirementsFetcher, C36195e passwordValidator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(passwordRequirementsFetcher, "passwordRequirementsFetcher");
        AbstractC22676k.m65750j(passwordValidator, "passwordValidator");
        AbstractC22676k.m65750j(logger, "logger");
        this.passwordRequirementsFetcher = passwordRequirementsFetcher;
        this.passwordValidator = passwordValidator;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m40603a(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51676z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51676z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM119771b = aVar.f51674x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f51676z;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM119771b);
            C37411b c37411b = this.passwordRequirementsFetcher;
            aVar.f51673w = str;
            aVar.f51676z = 1;
            objM119771b = c37411b.m119771b(aVar);
            if (objM119771b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar.f51673w;
            AbstractC34132o.m107864I(objM119771b);
        }
        AbstractC37410a abstractC37410a = (AbstractC37410a) objM119771b;
        boolean z13 = false;
        if (abstractC37410a instanceof AbstractC37410a.b) {
            List<C37416g> listM115189a = this.passwordValidator.m115189a(str, ((AbstractC37410a.b) abstractC37410a).m119769a());
            if (!(listM115189a instanceof Collection) || !listM115189a.isEmpty()) {
                Iterator<T> it = listM115189a.iterator();
                do {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    }
                } while (((C37416g) it.next()).getIsValid());
            } else {
                z4 = false;
                break;
            }
            z13 = z4;
        } else {
            if (!(abstractC37410a instanceof AbstractC37410a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85222m("Failed to fetch password requirements (non-blocking), treating as compliant. Error: " + ((AbstractC37410a.a) abstractC37410a).getError(), new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z13);
    }

    public /* synthetic */ C14207t0(C37411b c37411b, C36195e c36195e, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c37411b, c36195e, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PasswordComplianceCheckHandler") : interfaceC34116n);
    }
}
