package jk0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import ih0.AbstractC18489d0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.C32970n;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: jk0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001e¨\u0006 "}, m65681d2 = {"Ljk0/b;", "", "Ltr2/n;", "logger", "Lci2/b;", "whoopStrapProvider", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltr2/n;Lci2/b;Lbc3/c0;)V", "Ll83/a0;", "d", "()V", "e", "", "isForced", "c", "(Z)Z", "a", "Ltr2/n;", "b", "Lci2/b;", "Lbc3/c0;", "Lbc3/k1;", "Lbc3/k1;", "job", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCurrentlyTryingToConnect", "Ljk0/d;", "()Ljk0/d;", "currentStrap", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21748b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InterfaceC3027k1 job;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AtomicBoolean isCurrentlyTryingToConnect;

    /* JADX INFO: renamed from: jk0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.ble.strap.ConnectionThrottleManager$scheduleThrottleReset$1", m100430f = "ConnectionThrottleManager.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83666w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21748b.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83666w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f83666w = 1;
                if (AbstractC3034m0.m8782b(20000L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C21748b.this.m61364d();
            return C23454a0.f92919a;
        }
    }

    public C21748b(InterfaceC34116n logger, InterfaceC4733b whoopStrapProvider, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.logger = logger;
        this.whoopStrapProvider = whoopStrapProvider;
        this.coroutineScope = coroutineScope;
        this.isCurrentlyTryingToConnect = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC21750d m61363b() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m61364d() {
        this.isCurrentlyTryingToConnect.set(false);
    }

    /* JADX INFO: renamed from: e */
    private final void m61365e() {
        InterfaceC3027k1 interfaceC3027k1 = this.job;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.job = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61366c(boolean isForced) {
        InterfaceC21750d interfaceC21750dM61363b = m61363b();
        if (AbstractC22676k.m65745e(interfaceC21750dM61363b != null ? interfaceC21750dM61363b.getConnectionState() : null, C32970n.f137298a)) {
            m61364d();
            return false;
        }
        if (isForced) {
            this.logger.mo85228t(AbstractC11266d.m30462p("requestPermissionToConnect: isForced = ", isForced), new AbstractC30556a.a[0]);
            m61365e();
            return true;
        }
        if (!this.isCurrentlyTryingToConnect.compareAndSet(false, true)) {
            return false;
        }
        m61365e();
        return true;
    }

    public /* synthetic */ C21748b(InterfaceC34116n interfaceC34116n, InterfaceC4733b interfaceC4733b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ConnectionThrottleManager") : interfaceC34116n, interfaceC4733b, interfaceC2994c0);
    }
}
