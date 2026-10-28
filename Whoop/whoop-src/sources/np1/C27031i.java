package np1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kp1.AbstractC22754c;
import kp1.AbstractC22757f;
import kp1.C22753b;
import kp1.C22756e;
import l83.C23454a0;
import op1.C28097b;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: np1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011*\b\u0012\u0004\u0012\u00020\u00150\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Lnp1/i;", "Landroidx/lifecycle/w1;", "Lkp1/e;", "interactor", "Lop1/b;", "reducer", "Lkp1/b;", "combiner", "Lbc3/c0;", "coroutineScope", "<init>", "(Lkp1/e;Lop1/b;Lkp1/b;Lbc3/c0;)V", "Lnp1/h;", "viewEvent", "Lkp1/c;", "q", "(Lnp1/h;)Lkp1/c;", "Lec3/l;", "Lkp1/d;", "n", "(Lec3/l;Lkp1/e;)Lec3/l;", "Lkp1/a;", "Lnp1/j;", "o", "(Lec3/l;Lop1/b;)Lec3/l;", "Ll83/a0;", "p", "(Lnp1/h;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "Lkp1/f;", "y", "localStateEventFlow", "Lec3/t1;", "z", "Lec3/t1;", "localState", "E", "Lec3/l;", "domainState", "F", "getViewState", "()Lec3/l;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27031i extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 localStateEventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 localState;

    /* JADX INFO: renamed from: np1.i$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.presentation.PregnancyInsightsViewModel$sendViewEvent$1", m100430f = "PregnancyInsightsViewModel.kt", m100431l = {47, 48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107793w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27030h f107795y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC27030h abstractC27030h, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107795y = abstractC27030h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27031i.this.new a(this.f107795y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f107793w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)
                goto L54
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                np1.i r6 = np1.C27031i.this
                ec3.o1 r6 = np1.C27031i.m81069g(r6)
                np1.h r1 = r5.f107795y
                r5.f107793w = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L30
                goto L53
            L30:
                np1.i r6 = np1.C27031i.this
                ec3.o1 r6 = np1.C27031i.m81070j(r6)
                kp1.f$a r1 = new kp1.f$a
                np1.h r3 = r5.f107795y
                np1.h$c r3 = (np1.AbstractC27030h.c) r3
                java.lang.String r3 = r3.getTrimesterId()
                np1.h r4 = r5.f107795y
                np1.h$c r4 = (np1.AbstractC27030h.c) r4
                java.lang.String r4 = r4.getTrendId()
                r1.<init>(r3, r4)
                r5.f107793w = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: np1.C27031i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: np1.i$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.presentation.PregnancyInsightsViewModel$sendViewEvent$2", m100430f = "PregnancyInsightsViewModel.kt", m100431l = {53, 54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107796w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27030h f107798y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC27030h abstractC27030h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107798y = abstractC27030h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27031i.this.new b(this.f107798y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f107796w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L45
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L30
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                np1.i r5 = np1.C27031i.this
                ec3.o1 r5 = np1.C27031i.m81069g(r5)
                np1.h r1 = r4.f107798y
                r4.f107796w = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L30
                goto L44
            L30:
                np1.i r5 = np1.C27031i.this
                ec3.o1 r5 = np1.C27031i.m81070j(r5)
                kp1.f$a r1 = new kp1.f$a
                r3 = 0
                r1.<init>(r3, r3)
                r4.f107796w = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: np1.C27031i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: np1.i$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.presentation.PregnancyInsightsViewModel$sendViewEvent$3", m100430f = "PregnancyInsightsViewModel.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107799w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27030h f107801y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC27030h abstractC27030h, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107801y = abstractC27030h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27031i.this.new c(this.f107801y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107799w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27031i.this.localStateEventFlow;
                AbstractC22757f.a aVar = new AbstractC22757f.a(((AbstractC27030h.b) this.f107801y).getTrimesterId(), ((AbstractC27030h.b) this.f107801y).getTrendId());
                this.f107799w = 1;
                if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: np1.i$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.presentation.PregnancyInsightsViewModel$sendViewEvent$4", m100430f = "PregnancyInsightsViewModel.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107802w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27030h f107804y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC27030h abstractC27030h, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107804y = abstractC27030h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27031i.this.new d(this.f107804y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107802w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27031i.this.eventFlow;
                AbstractC27030h abstractC27030h = this.f107804y;
                this.f107802w = 1;
                if (interfaceC13072o1.emit(abstractC27030h, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: np1.i$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f107805w;

        /* JADX INFO: renamed from: np1.i$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f107806w;

            /* JADX INFO: renamed from: np1.i$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.presentation.PregnancyInsightsViewModel$special$$inlined$filter$1$2", m100430f = "PregnancyInsightsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42077a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f107808F;

                /* JADX INFO: renamed from: G */
                Object f107809G;

                /* JADX INFO: renamed from: H */
                int f107810H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f107811w;

                /* JADX INFO: renamed from: x */
                int f107812x;

                /* JADX INFO: renamed from: y */
                Object f107813y;

                /* JADX INFO: renamed from: z */
                Object f107814z;

                public C42077a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f107811w = obj;
                    this.f107812x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f107806w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42077a c42077a;
                if (interfaceC30057d instanceof C42077a) {
                    c42077a = (C42077a) interfaceC30057d;
                    int i13 = c42077a.f107812x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42077a.f107812x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42077a = new C42077a(interfaceC30057d);
                    }
                } else {
                    c42077a = new C42077a(interfaceC30057d);
                }
                Object obj2 = c42077a.f107811w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42077a.f107812x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f107806w;
                    if (!(((AbstractC27030h) obj) instanceof AbstractC27030h.b)) {
                        c42077a.f107813y = null;
                        c42077a.f107814z = null;
                        c42077a.f107808F = null;
                        c42077a.f107809G = null;
                        c42077a.f107810H = 0;
                        c42077a.f107812x = 1;
                        if (interfaceC13062m.emit(obj, c42077a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f107805w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f107805w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: np1.i$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f107815w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27031i f107816x;

        /* JADX INFO: renamed from: np1.i$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f107817w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27031i f107818x;

            /* JADX INFO: renamed from: np1.i$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.pregnancyinsights.presentation.PregnancyInsightsViewModel$special$$inlined$map$1$2", m100430f = "PregnancyInsightsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42078a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f107819E;

                /* JADX INFO: renamed from: F */
                Object f107820F;

                /* JADX INFO: renamed from: G */
                Object f107821G;

                /* JADX INFO: renamed from: H */
                int f107822H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f107823w;

                /* JADX INFO: renamed from: x */
                int f107824x;

                /* JADX INFO: renamed from: y */
                Object f107825y;

                public C42078a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f107823w = obj;
                    this.f107824x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27031i c27031i) {
                this.f107817w = interfaceC13062m;
                this.f107818x = c27031i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42078a c42078a;
                if (interfaceC30057d instanceof C42078a) {
                    c42078a = (C42078a) interfaceC30057d;
                    int i13 = c42078a.f107824x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42078a.f107824x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42078a = new C42078a(interfaceC30057d);
                    }
                } else {
                    c42078a = new C42078a(interfaceC30057d);
                }
                Object obj2 = c42078a.f107823w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42078a.f107824x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f107817w;
                    AbstractC22754c abstractC22754cM81074q = this.f107818x.m81074q((AbstractC27030h) obj);
                    c42078a.f107825y = null;
                    c42078a.f107819E = null;
                    c42078a.f107820F = null;
                    c42078a.f107821G = null;
                    c42078a.f107822H = 0;
                    c42078a.f107824x = 1;
                    if (interfaceC13062m.emit(abstractC22754cM81074q, c42078a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C27031i c27031i) {
            this.f107815w = interfaceC13058l;
            this.f107816x = c27031i;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f107815w.collect(new a(interfaceC13062m, this.f107816x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27031i(C22756e interactor, C28097b reducer, C22753b combiner, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.localStateEventFlow = c13096w1M36592b2;
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(c13096w1M36592b2, coroutineScope, c13021b2, 1);
        this.localState = c13078q1M36586L;
        InterfaceC13058l interfaceC13058lM36586L = AbstractC13091v.m36586L(m81072n(new f(new e(c13096w1M36592b), this), interactor), coroutineScope, c13021b2, 1);
        this.domainState = interfaceC13058lM36586L;
        this.viewState = m81073o(combiner.m65873a(interfaceC13058lM36586L, c13078q1M36586L), reducer);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m81072n(InterfaceC13058l interfaceC13058l, C22756e c22756e) {
        return c22756e.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m81073o(InterfaceC13058l interfaceC13058l, C28097b c28097b) {
        return c28097b.m84892f(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC22754c m81074q(AbstractC27030h viewEvent) {
        if (viewEvent instanceof AbstractC27030h.c) {
            return new AbstractC22754c.b(((AbstractC27030h.c) viewEvent).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (viewEvent instanceof AbstractC27030h.a) {
            return new AbstractC22754c.a(((AbstractC27030h.a) viewEvent).getId());
        }
        if (viewEvent instanceof AbstractC27030h.d) {
            return new AbstractC22754c.c(((AbstractC27030h.d) viewEvent).getId());
        }
        throw new IllegalArgumentException("invalid viewEvent " + viewEvent + ", cannot be mapped to a domain action.");
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final void m81075p(AbstractC27030h viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof AbstractC27030h.c) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
            return;
        }
        if (viewEvent instanceof AbstractC27030h.d) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, null), 3);
        } else if (viewEvent instanceof AbstractC27030h.b) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(viewEvent, null), 3);
        } else {
            if (!(viewEvent instanceof AbstractC27030h.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(viewEvent, null), 3);
        }
    }

    public /* synthetic */ C27031i(C22756e c22756e, C28097b c28097b, C22753b c22753b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22756e, c28097b, c22753b, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
