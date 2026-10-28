package hj0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1581f0;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import hc3.AbstractC17182o;
import kc3.C22365e;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: hj0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lhj0/d;", "", "Landroidx/lifecycle/g0;", "appLifecycleOwner", "Lbc3/c0;", "scope", "<init>", "(Landroidx/lifecycle/g0;Lbc3/c0;)V", "Landroidx/lifecycle/f0;", "lifecycleObserver", "Ll83/a0;", "c", "(Landroidx/lifecycle/f0;)V", "a", "Landroidx/lifecycle/g0;", "b", "Lbc3/c0;", "Lec3/f2;", "", "Lec3/f2;", "d", "()Lec3/f2;", "appForegroundFlow", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17345d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC1585g0 appLifecycleOwner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13037f2 appForegroundFlow;

    /* JADX INFO: renamed from: hj0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.base.ApplicationLifecycle$appForegroundFlow$1", m100430f = "ApplicationLifecycle.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f67216w;

        /* JADX INFO: renamed from: x */
        int f67217x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f67218y;

        /* JADX INFO: renamed from: hj0.d$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.base.ApplicationLifecycle$appForegroundFlow$1$1", m100430f = "ApplicationLifecycle.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41696a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f67220w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17345d f67221x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ c f67222y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41696a(C17345d c17345d, c cVar, InterfaceC30057d<? super C41696a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f67221x = c17345d;
                this.f67222y = cVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41696a(this.f67221x, this.f67222y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41696a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f67220w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f67221x.appLifecycleOwner.getLifecycle().mo4986a(this.f67222y);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: hj0.d$a$b */
        /* JADX INFO: loaded from: classes7.dex */
        @InterfaceC32271e(m100429c = "com.whoop.base.ApplicationLifecycle$appForegroundFlow$1$2$1", m100430f = "ApplicationLifecycle.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f67223w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17345d f67224x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ c f67225y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C17345d c17345d, c cVar, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f67224x = c17345d;
                this.f67225y = cVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f67224x, this.f67225y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f67223w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f67224x.appLifecycleOwner.getLifecycle().mo4988d(this.f67225y);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: hj0.d$a$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"hj0/d$a$c", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onStart", "(Landroidx/lifecycle/g0;)V", "onStop", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements DefaultLifecycleObserver {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC11936u f67226w;

            public c(InterfaceC11936u interfaceC11936u) {
                this.f67226w = interfaceC11936u;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
                super.onCreate(interfaceC1585g0);
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
            public void onStart(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                ((C11935t) this.f67226w).mo32218s(Boolean.TRUE);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                ((C11935t) this.f67226w).mo32218s(Boolean.FALSE);
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m49093h(C17345d c17345d, c cVar) {
            AbstractC3006f0.m8732z(c17345d.scope, null, null, new b(c17345d, cVar, null), 3);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C17345d.this.new a(interfaceC30057d);
            aVar.f67218y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f67218y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67217x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final c cVar = new c(interfaceC11936u);
                AbstractC3006f0.m8732z(C17345d.this.scope, null, null, new C41696a(C17345d.this, cVar, null), 3);
                final C17345d c17345d = C17345d.this;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: hj0.c
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return C17345d.a.m49093h(c17345d, cVar);
                    }
                };
                this.f67218y = null;
                this.f67216w = null;
                this.f67217x = 1;
                if (AbstractC37056f.m118984h(interfaceC11936u, interfaceC4339a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public C17345d(InterfaceC1585g0 appLifecycleOwner, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(appLifecycleOwner, "appLifecycleOwner");
        AbstractC22676k.m65750j(scope, "scope");
        this.appLifecycleOwner = appLifecycleOwner;
        this.scope = scope;
        this.appForegroundFlow = AbstractC13091v.m36587M(AbstractC13091v.m36600j(new a(null)), scope, C13105z1.f45288a, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: c */
    public final void m49090c(InterfaceC1581f0 lifecycleObserver) {
        AbstractC22676k.m65750j(lifecycleObserver, "lifecycleObserver");
        this.appLifecycleOwner.getLifecycle().mo4986a(lifecycleObserver);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13037f2 getAppForegroundFlow() {
        return this.appForegroundFlow;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17345d(InterfaceC1585g0 interfaceC1585g0, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0 = AbstractC3006f0.m8708b(AbstractC17182o.f65999a.plus(AbstractC3006f0.m8710d()));
        }
        this(interfaceC1585g0, interfaceC2994c0);
    }
}
