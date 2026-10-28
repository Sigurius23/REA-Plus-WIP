package or2;

import androidx.lifecycle.C1630u0;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: or2.s0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lor2/s0;", "T", "Landroidx/lifecycle/u0;", "<init>", "()V", "Landroidx/lifecycle/g0;", "owner", "Lkotlin/Function1;", "Ll83/a0;", "observeFunction", "c", "(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V", "value", "e", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "completed", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28199s0<T> extends C1630u0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicBoolean completed = new AtomicBoolean(true);

    /* JADX INFO: renamed from: or2.s0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f113946w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f113946w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f113946w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113946w.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m85345d(C28199s0 c28199s0, Function1 function1, Object obj) {
        if (c28199s0.completed.compareAndSet(false, true)) {
            function1.invoke(obj);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final void m85346c(InterfaceC1585g0 owner, Function1 observeFunction) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC22676k.m65750j(observeFunction, "observeFunction");
        super.observe(owner, new a(new C28192q(2, this, observeFunction)));
    }

    /* JADX INFO: renamed from: e */
    public final void m85347e(T value) {
        this.completed.set(false);
        super.postValue(value);
    }
}
