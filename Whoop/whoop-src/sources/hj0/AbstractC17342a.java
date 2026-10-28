package hj0;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import bc3.C3033m;
import bc3.InterfaceC3025k;
import ge3.AbstractC15751g;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: hj0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/fragment/app/m0;", "fragment", "Ll83/a0;", "a", "(Landroidx/fragment/app/m0;Lq83/d;)Ljava/lang/Object;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17342a {

    /* JADX INFO: renamed from: hj0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f67158w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC1633v0 f67159x;

        public a(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC1633v0 interfaceC1633v0) {
            this.f67158w = abstractComponentCallbacksC1320m0;
            this.f67159x = interfaceC1633v0;
        }

        /* JADX INFO: renamed from: a */
        public final void m49085a(Throwable th3) {
            this.f67158w.getViewLifecycleOwnerLiveData().removeObserver(this.f67159x);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m49085a((Throwable) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hj0.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> implements InterfaceC1633v0 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC3025k f67160w;

        /* JADX INFO: renamed from: hj0.a$b$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"hj0/a$b$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements DefaultLifecycleObserver {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC3025k f67161w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC1585g0 f67162x;

            public a(InterfaceC3025k interfaceC3025k, InterfaceC1585g0 interfaceC1585g0) {
                this.f67161w = interfaceC3025k;
                this.f67162x = interfaceC1585g0;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                this.f67161w.resumeWith(C23454a0.f92919a);
                this.f67162x.getLifecycle().mo4988d(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
                super.onDestroy(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
                super.onPause(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
                super.onResume(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
                super.onStart(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
                super.onStop(interfaceC1585g0);
            }
        }

        public b(InterfaceC3025k interfaceC3025k) {
            this.f67160w = interfaceC3025k;
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(InterfaceC1585g0 interfaceC1585g0) {
            if (interfaceC1585g0 == null) {
                return;
            }
            interfaceC1585g0.getLifecycle().mo4986a(new a(this.f67160w, interfaceC1585g0));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m49084a(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        b bVar = new b(c3033m);
        abstractComponentCallbacksC1320m0.getViewLifecycleOwnerLiveData().observeForever(bVar);
        c3033m.m8776u(new a(abstractComponentCallbacksC1320m0, bVar));
        Object objM8773r = c3033m.m8773r();
        return objM8773r == EnumC31071a.f128113w ? objM8773r : C23454a0.f92919a;
    }
}
