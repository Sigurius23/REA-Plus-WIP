package rw2;

import c93.InterfaceC4351m;
import com.whoop.whoopaction.domain.models.RefreshScopeAction;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j93.InterfaceC21461d;
import java.util.Set;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wm0.C37378a;

/* JADX INFO: renamed from: rw2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lrw2/e;", "Lrw2/a;", "Lwm0/a;", "scopeCoordinator", "<init>", "(Lwm0/a;)V", "Lec3/l;", "Lqw2/a;", "upstream", "Lqw2/b;", "b", "(Lec3/l;)Lec3/l;", "a", "Lwm0/a;", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "Ljava/util/Set;", "()Ljava/util/Set;", "actionTypes", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31875e implements InterfaceC31871a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<InterfaceC21461d> actionTypes;

    /* JADX INFO: renamed from: rw2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.RefreshScopeActionHandler$handleActions$1", m100430f = "RefreshScopeActionHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqw2/a;", "domainAction", "Lec3/l;", "Lqw2/b;", "<anonymous>", "(Lqw2/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132266w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f132267x;

        /* JADX INFO: renamed from: rw2.e$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.RefreshScopeActionHandler$handleActions$1$1", m100430f = "RefreshScopeActionHandler.kt", m100431l = {30, 32}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42302a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            Object f132269E;

            /* JADX INFO: renamed from: F */
            Object f132270F;

            /* JADX INFO: renamed from: G */
            int f132271G;

            /* JADX INFO: renamed from: H */
            int f132272H;

            /* JADX INFO: renamed from: I */
            int f132273I;

            /* JADX INFO: renamed from: J */
            private /* synthetic */ Object f132274J;

            /* JADX INFO: renamed from: K */
            final /* synthetic */ InterfaceC30693a f132275K;

            /* JADX INFO: renamed from: L */
            final /* synthetic */ C31875e f132276L;

            /* JADX INFO: renamed from: w */
            Object f132277w;

            /* JADX INFO: renamed from: x */
            Object f132278x;

            /* JADX INFO: renamed from: y */
            Object f132279y;

            /* JADX INFO: renamed from: z */
            Object f132280z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42302a(InterfaceC30693a interfaceC30693a, C31875e c31875e, InterfaceC30057d<? super C42302a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f132275K = interfaceC30693a;
                this.f132276L = c31875e;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C42302a c42302a = new C42302a(this.f132275K, this.f132276L, interfaceC30057d);
                c42302a.f132274J = obj;
                return c42302a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42302a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x00c0, code lost:
            
                if (r0.emit(r12, r11) == r1) goto L24;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = r11.f132274J
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r11.f132273I
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r5) goto L22
                    if (r2 != r4) goto L1a
                    java.lang.Object r0 = r11.f132277w
                    com.whoop.whoopaction.domain.models.RefreshScopeAction r0 = (com.whoop.whoopaction.domain.models.RefreshScopeAction) r0
                    p505ts.AbstractC34132o.m107864I(r12)
                    goto Lc3
                L1a:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L22:
                    int r2 = r11.f132271G
                    java.lang.Object r6 = r11.f132270F
                    java.lang.String r6 = (java.lang.String) r6
                    java.lang.Object r6 = r11.f132280z
                    java.util.Iterator r6 = (java.util.Iterator) r6
                    java.lang.Object r7 = r11.f132279y
                    rw2.e r7 = (rw2.C31875e) r7
                    java.lang.Object r8 = r11.f132278x
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.lang.Object r8 = r11.f132277w
                    com.whoop.whoopaction.domain.models.RefreshScopeAction r8 = (com.whoop.whoopaction.domain.models.RefreshScopeAction) r8
                    p505ts.AbstractC34132o.m107864I(r12)
                    goto L7b
                L3c:
                    p505ts.AbstractC34132o.m107864I(r12)
                    qw2.a r12 = r11.f132275K
                    com.whoop.whoopaction.domain.models.Action r12 = r12.getAction()
                    java.lang.String r2 = "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.RefreshScopeAction"
                    p715kotlin.jvm.internal.AbstractC22676k.m65748h(r12, r2)
                    com.whoop.whoopaction.domain.models.RefreshScopeAction r12 = (com.whoop.whoopaction.domain.models.RefreshScopeAction) r12
                    java.util.List r2 = r12.getScopes()
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    java.util.Iterator r2 = r2.iterator()
                L5b:
                    boolean r7 = r2.hasNext()
                    if (r7 == 0) goto L72
                    java.lang.Object r7 = r2.next()
                    r8 = r7
                    java.lang.String r8 = (java.lang.String) r8
                    boolean r8 = yb3.AbstractC39414r.m125890i0(r8)
                    if (r8 != 0) goto L5b
                    r6.add(r7)
                    goto L5b
                L72:
                    rw2.e r2 = r11.f132276L
                    java.util.Iterator r6 = r6.iterator()
                    r8 = r12
                    r7 = r2
                    r2 = r3
                L7b:
                    boolean r12 = r6.hasNext()
                    r9 = 0
                    if (r12 == 0) goto La7
                    java.lang.Object r12 = r6.next()
                    java.lang.String r12 = (java.lang.String) r12
                    wm0.a r10 = rw2.C31875e.m99094c(r7)
                    r11.f132274J = r0
                    r11.f132277w = r8
                    r11.f132278x = r9
                    r11.f132279y = r7
                    r11.f132280z = r6
                    r11.f132269E = r9
                    r11.f132270F = r9
                    r11.f132271G = r2
                    r11.f132272H = r3
                    r11.f132273I = r5
                    java.lang.Object r12 = r10.m119657b(r12, r11)
                    if (r12 != r1) goto L7b
                    goto Lc2
                La7:
                    qw2.b$n r12 = new qw2.b$n
                    r12.<init>(r8)
                    r11.f132274J = r9
                    r11.f132277w = r9
                    r11.f132278x = r9
                    r11.f132279y = r9
                    r11.f132280z = r9
                    r11.f132269E = r9
                    r11.f132270F = r9
                    r11.f132273I = r4
                    java.lang.Object r12 = r0.emit(r12, r11)
                    if (r12 != r1) goto Lc3
                Lc2:
                    return r1
                Lc3:
                    l83.a0 r12 = l83.C23454a0.f92919a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: rw2.C31875e.a.C42302a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C31875e.this.new a(interfaceC30057d);
            aVar.f132267x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30693a interfaceC30693a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((a) create(interfaceC30693a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC30693a interfaceC30693a = (InterfaceC30693a) this.f132267x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f132266w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C13084s1(new C42302a(interfaceC30693a, C31875e.this, null));
        }
    }

    public C31875e(C37378a scopeCoordinator) {
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        this.scopeCoordinator = scopeCoordinator;
        this.actionTypes = AbstractC12350b.m34570S(AbstractC22671h0.f89337a.getOrCreateKotlinClass(RefreshScopeAction.class));
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: a */
    public Set<InterfaceC21461d> mo28414a() {
        return this.actionTypes;
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo28415b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36578D(new a(null), upstream);
    }

    @Override // rw2.InterfaceC31871a, od1.InterfaceC27844g
    public /* bridge */ InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return super.interact(interfaceC13058l);
    }
}
