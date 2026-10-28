package y70;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import dc3.C11923h;
import dc3.InterfaceC11927l;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v70.AbstractC35755c;
import v70.C35756d;
import v70.C35757e;
import v70.C35759g;
import z70.C40140a;

/* JADX INFO: renamed from: y70.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\r*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u0002080\f8\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00105R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, m65681d2 = {"Ly70/b;", "Landroidx/lifecycle/w1;", "Lv70/e;", "interactor", "Lz70/a;", "reducer", "Lv70/g;", "resolveTrialOrderedNavigation", "Lbc3/c0;", "coroutineScope", "<init>", "(Lv70/e;Lz70/a;Lv70/g;Lbc3/c0;)V", "Lec3/l;", "Lv70/c;", "Lv70/d;", "interact", "(Lec3/l;)Lec3/l;", "Lcom/whoop/navigation/e;", "fallbackAction", "Ll83/a0;", "t", "(Lcom/whoop/navigation/e;)V", "Ly70/c;", "", "inFlight", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ly70/c;Z)Ly70/c;", "Ly70/a$m;", "v", "(Ly70/a$m;)Lv70/c;", NotificationCompat.CATEGORY_EVENT, "u", "(Ly70/a$m;)V", "Lv70/e;", "x", "Lz70/a;", "y", "Lv70/g;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/p1;", "F", "Lec3/p1;", "forwardNavigationInFlight", "G", "Lec3/l;", "reducedViewState", "H", "getViewState", "()Lec3/l;", "viewState", "Ldc3/l;", "Ly70/a$j;", "I", "Ldc3/l;", "navigationChannel", "J", "r", "navigationState", "Lbc3/k1;", "K", "Lbc3/k1;", "forwardNavigationJob", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39266b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13075p1 forwardNavigationInFlight;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l reducedViewState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC11927l navigationChannel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l navigationState;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private InterfaceC3027k1 forwardNavigationJob;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C35757e interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C40140a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C35759g resolveTrialOrderedNavigation;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y70.b$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.presentation.OrderConfirmationViewModel$handleForwardNavigationRequest$1", m100430f = "OrderConfirmationViewModel.kt", m100431l = {68, 70, 73}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f168859w;

        /* JADX INFO: renamed from: x */
        int f168860x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C9598e f168862z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9598e c9598e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168862z = c9598e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39266b.this.new a(this.f168862z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
        
            if (r1.mo32219t(r3, r6) == r0) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f168860x
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L10
                if (r1 != r2) goto L1c
            L10:
                java.lang.Object r0 = r6.f168859w
                v70.a r0 = (v70.InterfaceC35753a) r0
                p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Throwable -> L19
                goto L91
            L19:
                r7 = move-exception
                goto Laa
            L1c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L24:
                p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Throwable -> L19
                goto L3c
            L28:
                p505ts.AbstractC34132o.m107864I(r7)
                y70.b r7 = y70.C39266b.this     // Catch: java.lang.Throwable -> L19
                v70.g r7 = y70.C39266b.m125071o(r7)     // Catch: java.lang.Throwable -> L19
                com.whoop.navigation.e r1 = r6.f168862z     // Catch: java.lang.Throwable -> L19
                r6.f168860x = r4     // Catch: java.lang.Throwable -> L19
                java.lang.Object r7 = r7.m113299a(r1, r6)     // Catch: java.lang.Throwable -> L19
                if (r7 != r0) goto L3c
                goto L88
            L3c:
                v70.a r7 = (v70.InterfaceC35753a) r7     // Catch: java.lang.Throwable -> L19
                boolean r1 = r7 instanceof v70.InterfaceC35753a.c     // Catch: java.lang.Throwable -> L19
                if (r1 == 0) goto L5e
                y70.b r1 = y70.C39266b.this     // Catch: java.lang.Throwable -> L19
                dc3.l r1 = y70.C39266b.m125069l(r1)     // Catch: java.lang.Throwable -> L19
                y70.a$c r2 = new y70.a$c     // Catch: java.lang.Throwable -> L19
                v70.a$c r7 = (v70.InterfaceC35753a.c) r7     // Catch: java.lang.Throwable -> L19
                com.whoop.navigation.e r7 = r7.getAction()     // Catch: java.lang.Throwable -> L19
                r2.<init>(r7)     // Catch: java.lang.Throwable -> L19
                r6.f168859w = r5     // Catch: java.lang.Throwable -> L19
                r6.f168860x = r3     // Catch: java.lang.Throwable -> L19
                java.lang.Object r7 = r1.mo32219t(r2, r6)     // Catch: java.lang.Throwable -> L19
                if (r7 != r0) goto L91
                goto L88
            L5e:
                boolean r1 = r7 instanceof v70.InterfaceC35753a.a     // Catch: java.lang.Throwable -> L19
                if (r1 == 0) goto L89
                y70.b r1 = y70.C39266b.this     // Catch: java.lang.Throwable -> L19
                dc3.l r1 = y70.C39266b.m125069l(r1)     // Catch: java.lang.Throwable -> L19
                y70.a$g r3 = new y70.a$g     // Catch: java.lang.Throwable -> L19
                r4 = r7
                v70.a$a r4 = (v70.InterfaceC35753a.a) r4     // Catch: java.lang.Throwable -> L19
                com.whoop.activation.view.navigation.ActivationFlowDestination r4 = r4.getDestination()     // Catch: java.lang.Throwable -> L19
                java.lang.String r4 = r4.name()     // Catch: java.lang.Throwable -> L19
                v70.a$a r7 = (v70.InterfaceC35753a.a) r7     // Catch: java.lang.Throwable -> L19
                java.lang.String r7 = r7.getSource()     // Catch: java.lang.Throwable -> L19
                r3.<init>(r4, r7)     // Catch: java.lang.Throwable -> L19
                r6.f168859w = r5     // Catch: java.lang.Throwable -> L19
                r6.f168860x = r2     // Catch: java.lang.Throwable -> L19
                java.lang.Object r7 = r1.mo32219t(r3, r6)     // Catch: java.lang.Throwable -> L19
                if (r7 != r0) goto L91
            L88:
                return r0
            L89:
                v70.a$b r0 = v70.InterfaceC35753a.b.f152047a     // Catch: java.lang.Throwable -> L19
                boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r7, r0)     // Catch: java.lang.Throwable -> L19
                if (r7 == 0) goto La4
            L91:
                y70.b r7 = y70.C39266b.this
                ec3.p1 r7 = y70.C39266b.m125068j(r7)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                ec3.h2 r7 = (ec3.C13045h2) r7
                r7.getClass()
                r7.m36571k(r5, r0)
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            La4:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L19
                r7.<init>()     // Catch: java.lang.Throwable -> L19
                throw r7     // Catch: java.lang.Throwable -> L19
            Laa:
                y70.b r0 = y70.C39266b.this
                ec3.p1 r0 = y70.C39266b.m125068j(r0)
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                ec3.h2 r0 = (ec3.C13045h2) r0
                r0.getClass()
                r0.m36571k(r5, r1)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: y70.C39266b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: y70.b$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.presentation.OrderConfirmationViewModel$sendViewEvent$1", m100430f = "OrderConfirmationViewModel.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168863w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC39265a.m f168865y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC39265a.m mVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168865y = mVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39266b.this.new b(this.f168865y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168863w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C39266b.this.eventFlow;
                InterfaceC39265a.m mVar = this.f168865y;
                this.f168863w = 1;
                if (interfaceC13072o1.emit(mVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: y70.b$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f168866w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39266b f168867x;

        /* JADX INFO: renamed from: y70.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f168868w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39266b f168869x;

            /* JADX INFO: renamed from: y70.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.presentation.OrderConfirmationViewModel$special$$inlined$map$1$2", m100430f = "OrderConfirmationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42679a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f168870E;

                /* JADX INFO: renamed from: F */
                Object f168871F;

                /* JADX INFO: renamed from: G */
                Object f168872G;

                /* JADX INFO: renamed from: H */
                int f168873H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f168874w;

                /* JADX INFO: renamed from: x */
                int f168875x;

                /* JADX INFO: renamed from: y */
                Object f168876y;

                public C42679a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f168874w = obj;
                    this.f168875x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39266b c39266b) {
                this.f168868w = interfaceC13062m;
                this.f168869x = c39266b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42679a c42679a;
                if (interfaceC30057d instanceof C42679a) {
                    c42679a = (C42679a) interfaceC30057d;
                    int i13 = c42679a.f168875x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42679a.f168875x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42679a = new C42679a(interfaceC30057d);
                    }
                } else {
                    c42679a = new C42679a(interfaceC30057d);
                }
                Object obj2 = c42679a.f168874w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42679a.f168875x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f168868w;
                    C39267c c39267cM128712b = this.f168869x.reducer.m128712b((C35756d) obj);
                    c42679a.f168876y = null;
                    c42679a.f168870E = null;
                    c42679a.f168871F = null;
                    c42679a.f168872G = null;
                    c42679a.f168873H = 0;
                    c42679a.f168875x = 1;
                    if (interfaceC13062m.emit(c39267cM128712b, c42679a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C39266b c39266b) {
            this.f168866w = interfaceC13058l;
            this.f168867x = c39266b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f168866w.collect(new a(interfaceC13062m, this.f168867x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y70.b$d */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f168878w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39266b f168879x;

        /* JADX INFO: renamed from: y70.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f168880w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39266b f168881x;

            /* JADX INFO: renamed from: y70.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.presentation.OrderConfirmationViewModel$special$$inlined$mapNotNull$1$2", m100430f = "OrderConfirmationViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42680a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f168882E;

                /* JADX INFO: renamed from: F */
                Object f168883F;

                /* JADX INFO: renamed from: G */
                Object f168884G;

                /* JADX INFO: renamed from: H */
                Object f168885H;

                /* JADX INFO: renamed from: I */
                int f168886I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f168887w;

                /* JADX INFO: renamed from: x */
                int f168888x;

                /* JADX INFO: renamed from: y */
                Object f168889y;

                public C42680a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f168887w = obj;
                    this.f168888x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39266b c39266b) {
                this.f168880w = interfaceC13062m;
                this.f168881x = c39266b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42680a c42680a;
                if (interfaceC30057d instanceof C42680a) {
                    c42680a = (C42680a) interfaceC30057d;
                    int i13 = c42680a.f168888x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42680a.f168888x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42680a = new C42680a(interfaceC30057d);
                    }
                } else {
                    c42680a = new C42680a(interfaceC30057d);
                }
                Object obj2 = c42680a.f168887w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42680a.f168888x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f168880w;
                    AbstractC35755c abstractC35755cM125075v = this.f168881x.m125075v((InterfaceC39265a.m) obj);
                    if (abstractC35755cM125075v != null) {
                        c42680a.f168889y = null;
                        c42680a.f168882E = null;
                        c42680a.f168883F = null;
                        c42680a.f168884G = null;
                        c42680a.f168885H = null;
                        c42680a.f168886I = 0;
                        c42680a.f168888x = 1;
                        if (interfaceC13062m.emit(abstractC35755cM125075v, c42680a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l, C39266b c39266b) {
            this.f168878w = interfaceC13058l;
            this.f168879x = c39266b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f168878w.collect(new a(interfaceC13062m, this.f168879x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y70.b$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.presentation.OrderConfirmationViewModel$viewState$1", m100430f = "OrderConfirmationViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ly70/c;", "state", "", "inFlight", "<anonymous>", "(Ly70/c;Z)Ly70/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f168891w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f168892x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ boolean f168893y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m125079f(C39267c c39267c, boolean z4, InterfaceC30057d<? super C39267c> interfaceC30057d) {
            e eVar = C39266b.this.new e(interfaceC30057d);
            eVar.f168892x = c39267c;
            eVar.f168893y = z4;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m125079f((C39267c) obj, ((Boolean) obj2).booleanValue(), (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C39267c c39267c = (C39267c) this.f168892x;
            boolean z4 = this.f168893y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168891w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C39266b.this.m125076w(c39267c, z4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39266b(C35757e interactor, C40140a reducer, C35759g resolveTrialOrderedNavigation, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(resolveTrialOrderedNavigation, "resolveTrialOrderedNavigation");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.resolveTrialOrderedNavigation = resolveTrialOrderedNavigation;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this.forwardNavigationInFlight = c13045h2M36593c;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(new c(interact(new d(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
        this.reducedViewState = c13078q1M36586L;
        this.viewState = new C13060l1(c13078q1M36586L, c13045h2M36593c, new e(null), 1);
        C11923h c11923hM92111d = AbstractC30060g.m92111d(-2, 6, null);
        this.navigationChannel = c11923hM92111d;
        this.navigationState = AbstractC13091v.m36585K(c11923hM92111d);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: t */
    private final void m125074t(C9598e fallbackAction) {
        InterfaceC3027k1 interfaceC3027k1 = this.forwardNavigationJob;
        if (interfaceC3027k1 == null || !interfaceC3027k1.isActive()) {
            InterfaceC13075p1 interfaceC13075p1 = this.forwardNavigationInFlight;
            Boolean bool = Boolean.TRUE;
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, bool);
            this.forwardNavigationJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(fallbackAction, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final AbstractC35755c m125075v(InterfaceC39265a.m mVar) {
        if (mVar instanceof InterfaceC39265a.l) {
            return new AbstractC35755c.b(false, 1, null);
        }
        if (mVar instanceof InterfaceC39265a.e) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final C39267c m125076w(C39267c c39267c, boolean z4) {
        C39267c.d screenContent;
        return (z4 && (screenContent = c39267c.getScreenContent()) != null) ? C39267c.m125080c(c39267c, null, null, C39267c.d.m125100b(screenContent, null, true, null, 5, null), 3, null) : c39267c;
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final InterfaceC13058l getNavigationState() {
        return this.navigationState;
    }

    /* JADX INFO: renamed from: u */
    public final void m125078u(InterfaceC39265a.m event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC39265a.e) {
            m125074t(((InterfaceC39265a.e) event).getNavAction());
        } else {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
        }
    }

    public /* synthetic */ C39266b(C35757e c35757e, C40140a c40140a, C35759g c35759g, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c35757e, c40140a, c35759g, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
