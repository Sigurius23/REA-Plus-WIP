package sh2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4339a;
import com.whoop.strapauth.certificatetransfer.CertificateTransferException;
import com.whoop.taskexecutor.TaskInterruptedException;
import jk0.InterfaceC21750d;
import kotlinx.coroutines.TimeoutCancellationException;
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
import sj2.InterfaceC32564a;
import tr2.InterfaceC34116n;
import vk0.InterfaceC36079e;

/* JADX INFO: renamed from: sh2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lsh2/b;", "Lsh2/a;", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "Lvk0/e;", "Lsh2/c;", "c", "(Lvk0/e;)Lsh2/c;", "", "cause", "b", "(Ljava/lang/Throwable;)Lsh2/c;", "Ljk0/d;", "strap", "", "certificate", "Lsj2/a;", "priority", "Lkotlin/Function0;", "Ll83/a0;", "onExecuteStart", "a", "(Ljk0/d;[BLsj2/a;Lc93/a;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32511b implements InterfaceC32510a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: sh2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.certificatetransfer.CertificateTransferApiImpl", m100430f = "CertificateTransferApiImpl.kt", m100431l = {25}, m100432m = "transfer", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f134645E;

        /* JADX INFO: renamed from: F */
        Object f134646F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f134647G;

        /* JADX INFO: renamed from: I */
        int f134649I;

        /* JADX INFO: renamed from: w */
        Object f134650w;

        /* JADX INFO: renamed from: x */
        Object f134651x;

        /* JADX INFO: renamed from: y */
        Object f134652y;

        /* JADX INFO: renamed from: z */
        Object f134653z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f134647G = obj;
            this.f134649I |= Integer.MIN_VALUE;
            return C32511b.this.mo101515a(null, null, null, null, this);
        }
    }

    public C32511b(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC32512c m101516b(Throwable cause) {
        this.logger.mo85230v("Certificate transfer task did not complete", cause, new AbstractC30556a.a[0]);
        return new AbstractC32512c.a(AbstractC32512c.b.INTERRUPTED);
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC32512c m101517c(InterfaceC36079e interfaceC36079e) {
        AbstractC32512c result;
        if (interfaceC36079e instanceof InterfaceC36079e.b) {
            return AbstractC32512c.d.f134656a;
        }
        if (!(interfaceC36079e instanceof InterfaceC36079e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC36079e.a aVar = (InterfaceC36079e.a) interfaceC36079e;
        Exception exception = aVar.getException();
        CertificateTransferException certificateTransferException = exception instanceof CertificateTransferException ? (CertificateTransferException) exception : null;
        return (certificateTransferException == null || (result = certificateTransferException.getResult()) == null) ? m101516b(aVar.getException()) : result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // sh2.InterfaceC32510a
    /* JADX INFO: renamed from: a */
    public Object mo101515a(InterfaceC21750d interfaceC21750d, byte[] bArr, InterfaceC32564a interfaceC32564a, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super AbstractC32512c> interfaceC30057d) {
        a aVar;
        C32511b c32511b;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f134649I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f134649I = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objAwait = aVar.f134647G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f134649I;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objAwait);
                if (bArr.length == 0) {
                    throw new IllegalArgumentException("Certificate must not be empty");
                }
                InterfaceC3018i0 interfaceC3018i0Mo24749u = interfaceC21750d.mo24749u(new C32514e(bArr, interfaceC4339a, null, null, null, null, 60, null), interfaceC32564a);
                aVar.f134650w = null;
                aVar.f134651x = null;
                aVar.f134652y = null;
                aVar.f134653z = null;
                aVar.f134645E = null;
                aVar.f134646F = this;
                aVar.f134649I = 1;
                objAwait = interfaceC3018i0Mo24749u.await(aVar);
                if (objAwait == enumC31071a) {
                    return enumC31071a;
                }
                c32511b = this;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c32511b = (C32511b) aVar.f134646F;
                AbstractC34132o.m107864I(objAwait);
            }
            return c32511b.m101517c((InterfaceC36079e) objAwait);
        } catch (Exception e5) {
            if ((e5 instanceof TaskInterruptedException) || (e5 instanceof TimeoutCancellationException)) {
                return m101516b(e5);
            }
            AbstractC3006f0.m8721o(aVar.getContext());
            this.logger.mo85230v("Certificate transfer failed with an unexpected error", e5, new AbstractC30556a.a[0]);
            return new AbstractC32512c.a(AbstractC32512c.b.UNKNOWN);
        }
    }

    public /* synthetic */ C32511b(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CertificateTransferApi") : interfaceC34116n);
    }
}
