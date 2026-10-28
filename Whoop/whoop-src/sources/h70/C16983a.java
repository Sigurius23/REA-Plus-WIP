package h70;

import bc3.InterfaceC2994c0;
import c80.AbstractC4300a;
import c93.InterfaceC4351m;
import com.whoop.activation.iajf.domain.SignUpSource;
import ec3.InterfaceC13062m;
import f70.C14178f;
import f70.C14179f0;
import f70.C14183h0;
import f70.C14214x;
import f70.InterfaceC14176e;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: h70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lh70/a;", "", "Ltr2/n;", "logger", "Lf70/x;", "emailFirstHelper", "Lf70/f0;", "iajfEmailCheckHelper", "Lf70/h0;", "iajfEnterEmailHandler", "<init>", "(Ltr2/n;Lf70/x;Lf70/f0;Lf70/h0;)V", "Lf70/e;", "prevDomainResult", "", "type", "e", "(Lf70/e;Ljava/lang/String;)Lf70/e;", "d", "(Lf70/e;)Lf70/e;", "Lec3/m;", "collector", "c", "(Lec3/m;Lf70/e;Lq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "b", "Lf70/x;", "Lf70/f0;", "Lf70/h0;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16983a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14214x emailFirstHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14179f0 iajfEmailCheckHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14183h0 iajfEnterEmailHandler;

    /* JADX INFO: renamed from: h70.a$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.dialog.ActivationDialogHandler", m100430f = "ActivationDialogHandler.kt", m100431l = {51, 52, 62, 64}, m100432m = "confirmEmailDialog", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f65206E;

        /* JADX INFO: renamed from: w */
        Object f65207w;

        /* JADX INFO: renamed from: x */
        Object f65208x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f65209y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f65209y = obj;
            this.f65206E |= Integer.MIN_VALUE;
            return C16983a.this.m47812c(null, null, this);
        }
    }

    /* JADX INFO: renamed from: h70.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.dialog.ActivationDialogHandler$confirmEmailDialog$2", m100430f = "ActivationDialogHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/e;", "<anonymous>", "(Lbc3/c0;)Lf70/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65211w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e f65213y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f65213y = interfaceC14176e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16983a.this.new b(this.f65213y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f65211w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C16983a.this.emailFirstHelper.m40643c(this.f65213y);
        }
    }

    /* JADX INFO: renamed from: h70.a$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.dialog.ActivationDialogHandler$confirmEmailDialog$wrapper$1", m100430f = "ActivationDialogHandler.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/f;", "<anonymous>", "(Lbc3/c0;)Lf70/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65214w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13062m f65216y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC14176e f65217z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f65216y = interfaceC13062m;
            this.f65217z = interfaceC14176e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16983a.this.new c(this.f65216y, this.f65217z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14178f> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65214w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14183h0 c14183h0 = C16983a.this.iajfEnterEmailHandler;
            InterfaceC13062m interfaceC13062m = this.f65216y;
            InterfaceC14176e interfaceC14176e = this.f65217z;
            InterfaceC14176e.b bVar = (InterfaceC14176e.b) interfaceC14176e;
            SignUpSource signUpSource = ((InterfaceC14176e.b) interfaceC14176e).getSignUpSource();
            this.f65214w = 1;
            Object objM40484g = c14183h0.m40484g(interfaceC13062m, bVar, signUpSource, this);
            return objM40484g == enumC31071a ? enumC31071a : objM40484g;
        }
    }

    public C16983a(InterfaceC34116n logger, C14214x emailFirstHelper, C14179f0 iajfEmailCheckHelper, C14183h0 iajfEnterEmailHandler) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(emailFirstHelper, "emailFirstHelper");
        AbstractC22676k.m65750j(iajfEmailCheckHelper, "iajfEmailCheckHelper");
        AbstractC22676k.m65750j(iajfEnterEmailHandler, "iajfEnterEmailHandler");
        this.logger = logger;
        this.emailFirstHelper = emailFirstHelper;
        this.iajfEmailCheckHelper = iajfEmailCheckHelper;
        this.iajfEnterEmailHandler = iajfEnterEmailHandler;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (r3 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        if (r1.emit(r3, r4) == r5) goto L40;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m47812c(ec3.InterfaceC13062m r36, f70.InterfaceC14176e r37, q83.InterfaceC30057d<? super f70.InterfaceC14176e> r38) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h70.C16983a.m47812c(ec3.m, f70.e, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC14176e m47813d(InterfaceC14176e prevDomainResult) {
        AbstractC22676k.m65750j(prevDomainResult, "prevDomainResult");
        return ((prevDomainResult instanceof InterfaceC14176e.b) && AbstractC4300a.m13542a(((InterfaceC14176e.b) prevDomainResult).getSignUpSource())) ? this.iajfEmailCheckHelper.m40446c(prevDomainResult) : this.emailFirstHelper.m40644d(prevDomainResult);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC14176e m47814e(InterfaceC14176e prevDomainResult, String type) {
        AbstractC22676k.m65750j(prevDomainResult, "prevDomainResult");
        AbstractC22676k.m65750j(type, "type");
        this.logger.mo85216g("User dismissed login error dialog of type ".concat(type), new AbstractC30556a.a[0]);
        return prevDomainResult instanceof InterfaceC14176e.b ? InterfaceC14176e.b.m40416b((InterfaceC14176e.b) prevDomainResult, null, null, null, null, null, false, null, false, null, false, true, null, null, null, null, null, null, 129983, null) : InterfaceC14176e.a.f51223a;
    }

    public /* synthetic */ C16983a(InterfaceC34116n interfaceC34116n, C14214x c14214x, C14179f0 c14179f0, C14183h0 c14183h0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActivationDialogHandler") : interfaceC34116n, c14214x, c14179f0, c14183h0);
    }
}
