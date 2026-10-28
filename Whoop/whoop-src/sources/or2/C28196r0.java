package or2;

import androidx.lifecycle.C1630u0;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import c93.InterfaceC4339a;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: or2.r0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lor2/r0;", "Landroidx/lifecycle/u0;", "Ll83/a0;", "<init>", "()V", "Landroidx/lifecycle/g0;", "owner", "Lkotlin/Function0;", "observeFunction", "c", "(Landroidx/lifecycle/g0;Lc93/a;)V", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "completed", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28196r0 extends C1630u0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicBoolean completed = new AtomicBoolean(true);

    /* JADX INFO: renamed from: or2.r0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f113941w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f113941w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f113941w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113941w.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m85328d(C28196r0 c28196r0, InterfaceC4339a interfaceC4339a, C23454a0 c23454a0) {
        if (c28196r0.completed.compareAndSet(false, true)) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final void m85329c(InterfaceC1585g0 owner, InterfaceC4339a observeFunction) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC22676k.m65750j(observeFunction, "observeFunction");
        super.observe(owner, new a(new C28192q(1, this, observeFunction)));
    }

    /* JADX INFO: renamed from: e */
    public final void m85330e() {
        this.completed.set(false);
        super.postValue(C23454a0.f92919a);
    }
}
