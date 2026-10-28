package sx1;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.InterfaceC1633v0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.membership.reactivationmodal.domain.models.ReactivationModalModel;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import java.util.ArrayList;
import l83.C23454a0;
import l83.InterfaceC23459e;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25265s;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rv1.C31842a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: sx1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lsx1/c;", "", "Lbc3/c0;", "scope", "Lrv1/a;", "membershipRepository", "<init>", "(Lbc3/c0;Lrv1/a;)V", "Ll83/a0;", "e", "()V", "Lsx1/b;", HMSTrackSource.SCREEN, "", "showOnScreen", "f", "(Lsx1/b;Z)V", "d", "a", "Lbc3/c0;", "b", "Lrv1/a;", "Lec3/p1;", "Lsx1/e;", "c", "Lec3/p1;", "_reactivationModalFlow", "Lec3/f2;", "Lec3/f2;", "()Lec3/f2;", "reactivationModalFlow", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33067c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13075p1 _reactivationModalFlow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13037f2 reactivationModalFlow;

    /* JADX INFO: renamed from: sx1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.reactivationmodal.ReactivationModalCoordinator$initializeStateFlow$1", m100430f = "ReactivationModalCoordinator.kt", m100431l = {53, 52, 56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137895w;

        /* JADX INFO: renamed from: x */
        Object f137896x;

        /* JADX INFO: renamed from: y */
        int f137897y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33067c.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008b A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13;
            InterfaceC13075p1 interfaceC13075p1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f137897y;
            C25271y c25271y = C25271y.f99162w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i14 != 0) {
                if (i14 == 1) {
                    i13 = this.f137895w;
                    interfaceC13075p1 = (InterfaceC13075p1) this.f137896x;
                    AbstractC34132o.m107864I(obj);
                    C33069e c33069e = new C33069e((ReactivationModalModel) obj, c25271y);
                    this.f137896x = null;
                    this.f137895w = i13;
                    this.f137897y = 2;
                    ((C13045h2) interfaceC13075p1).emit(c33069e, this);
                    if (c23454a0 != enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 2 && i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            i13 = C33067c.this.membershipRepository.m98946G().getValue() == MembershipStatus.CANCELED ? 1 : 0;
            if (i13 != 0) {
                interfaceC13075p1 = C33067c.this._reactivationModalFlow;
                C31842a c31842a = C33067c.this.membershipRepository;
                this.f137896x = interfaceC13075p1;
                this.f137895w = i13;
                this.f137897y = 1;
                obj = c31842a.m98952z(this);
                if (obj != enumC31071a) {
                    C33069e c33069e2 = new C33069e((ReactivationModalModel) obj, c25271y);
                    this.f137896x = null;
                    this.f137895w = i13;
                    this.f137897y = 2;
                    ((C13045h2) interfaceC13075p1).emit(c33069e2, this);
                    if (c23454a0 != enumC31071a) {
                        return c23454a0;
                    }
                }
            } else {
                InterfaceC13075p1 interfaceC13075p2 = C33067c.this._reactivationModalFlow;
                C33069e c33069e3 = new C33069e(null, c25271y);
                this.f137895w = i13;
                this.f137897y = 3;
                ((C13045h2) interfaceC13075p2).emit(c33069e3, this);
                if (c23454a0 != enumC31071a) {
                    return c23454a0;
                }
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: sx1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.reactivationmodal.ReactivationModalCoordinator$observeMembershipStatus$1", m100430f = "ReactivationModalCoordinator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137899w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m104727h(C33067c c33067c, MembershipStatus membershipStatus) {
            if (membershipStatus != null) {
                c33067c.m104723d();
            }
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33067c.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137899w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC1615p0 abstractC1615p0M98946G = C33067c.this.membershipRepository.m98946G();
            final C33067c c33067c = C33067c.this;
            abstractC1615p0M98946G.observeForever(new d(new Function1() { // from class: sx1.d
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C33067c.b.m104727h(c33067c, (MembershipStatus) obj2);
                }
            }));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sx1.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.membership.reactivationmodal.ReactivationModalCoordinator$reactivationModalFlow$1", m100430f = "ReactivationModalCoordinator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsx1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137901w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33067c.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137901w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C33067c.this.m104723d();
            C33067c.this.m104724e();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sx1.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f137903w;

        public d(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f137903w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f137903w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f137903w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: sx1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.reactivationmodal.ReactivationModalCoordinator$shouldShowOnScreen$1", m100430f = "ReactivationModalCoordinator.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C33067c f137904E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ EnumC33066b f137905F;

        /* JADX INFO: renamed from: w */
        Object f137906w;

        /* JADX INFO: renamed from: x */
        Object f137907x;

        /* JADX INFO: renamed from: y */
        int f137908y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f137909z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z4, C33067c c33067c, EnumC33066b enumC33066b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137909z = z4;
            this.f137904E = c33067c;
            this.f137905F = enumC33066b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f137909z, this.f137904E, this.f137905F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayListM74128f1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137908y;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (this.f137909z) {
                arrayListM74128f1 = AbstractC25265s.m74124b1(((C33069e) ((C13045h2) this.f137904E._reactivationModalFlow).getValue()).m104731d(), this.f137905F);
            } else {
                arrayListM74128f1 = AbstractC25265s.m74128f1(this.f137905F, ((C33069e) ((C13045h2) this.f137904E._reactivationModalFlow).getValue()).m104731d());
            }
            C33069e c33069eM104728b = C33069e.m104728b((C33069e) ((C13045h2) this.f137904E._reactivationModalFlow).getValue(), null, arrayListM74128f1, 1, null);
            InterfaceC13075p1 interfaceC13075p1 = this.f137904E._reactivationModalFlow;
            this.f137906w = null;
            this.f137907x = null;
            this.f137908y = 1;
            ((C13045h2) interfaceC13075p1).emit(c33069eM104728b, this);
            return c23454a0 == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    public C33067c(InterfaceC2994c0 scope, C31842a membershipRepository) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        this.scope = scope;
        this.membershipRepository = membershipRepository;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C33069e(null, C25271y.f99162w));
        this._reactivationModalFlow = c13045h2M36593c;
        this.reactivationModalFlow = AbstractC13091v.m36587M(new C13015a0(new c(null), c13045h2M36593c), scope, C13105z1.f45288a, c13045h2M36593c.getValue());
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC13037f2 getReactivationModalFlow() {
        return this.reactivationModalFlow;
    }

    /* JADX INFO: renamed from: d */
    public final void m104723d() {
        AbstractC3006f0.m8732z(this.scope, null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: e */
    public final void m104724e() {
        AbstractC3006f0.m8732z(this.scope, null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: f */
    public final void m104725f(EnumC33066b screen, boolean showOnScreen) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC3006f0.m8732z(this.scope, null, null, new e(showOnScreen, this, screen, null), 3);
    }
}
