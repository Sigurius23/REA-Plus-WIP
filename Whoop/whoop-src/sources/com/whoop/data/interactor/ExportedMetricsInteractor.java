package com.whoop.data.interactor;

import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bi2.InterfaceC3287c;
import bi2.InterfaceC3288d;
import c93.InterfaceC4351m;
import ca2.InterfaceC4366f;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import in2.InterfaceC18732d;
import java.io.File;
import java.io.IOException;
import l83.C23454a0;
import ne3.AbstractC26604b;
import ne3.C26617h0;
import ne3.C26641u;
import ne3.InterfaceC26618i;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ts0.EnumC34138c;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34834p0;
import ud3.C34844u0;
import yb3.C39412p;
import yh2.C39543b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lcom/whoop/data/interactor/ExportedMetricsInteractor;", "", "Lca2/f;", "historySyncRouter", "Lbi2/d;", "heartDataStore", "Lin2/d;", "dispatcherFactory", "Lbc3/c0;", "coroutineScope", "<init>", "(Lca2/f;Lbi2/d;Lin2/d;Lbc3/c0;)V", "", "secondsRetrievedBeforeNow", "Lec3/l;", "Lcom/whoop/data/interactor/MetricHeartDataSyncState;", "startForcedSyncAndObserve", "(I)Lec3/l;", "prepareHeartDataFile", "(ILq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/interactor/ExportedMetricsAction;", "action", "Ll83/a0;", "sendAction", "(Lcom/whoop/data/interactor/ExportedMetricsAction;Lq83/d;)Ljava/lang/Object;", "Lca2/f;", "Lbi2/d;", "Lin2/d;", "Lec3/o1;", "eventFlow", "Lec3/o1;", "exportedHeartDataFlow", "Lec3/l;", "getExportedHeartDataFlow", "()Lec3/l;", "Companion", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ExportedMetricsInteractor {
    private static final String JOB_TAG = "ExportedMetricsInteractorJob";
    private final InterfaceC18732d dispatcherFactory;
    private final InterfaceC13072o1 eventFlow;
    private final InterfaceC13058l exportedHeartDataFlow;
    private final InterfaceC3288d heartDataStore;
    private final InterfaceC4366f historySyncRouter;
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC34138c.values().length];
            try {
                iArr[EnumC34138c.FORCE_SYNC_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC34138c.FULL_SYNC_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.interactor.ExportedMetricsInteractor$prepareHeartDataFile$2 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.interactor.ExportedMetricsInteractor$prepareHeartDataFile$2", m100430f = "ExportedMetricsInteractor.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/interactor/MetricHeartDataSyncState;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/interactor/MetricHeartDataSyncState;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C64792 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ int $secondsRetrievedBeforeNow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64792(int i13, InterfaceC30057d<? super C64792> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$secondsRetrievedBeforeNow = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ExportedMetricsInteractor.this.new C64792(this.$secondsRetrievedBeforeNow, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super MetricHeartDataSyncState> interfaceC30057d) {
            return ((C64792) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC3288d interfaceC3288d = ExportedMetricsInteractor.this.heartDataStore;
                int i14 = this.$secondsRetrievedBeforeNow;
                this.label = 1;
                obj = interfaceC3288d.mo9570c(i14, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC3287c interfaceC3287c = (InterfaceC3287c) obj;
            C39543b exportedHeartData = interfaceC3287c instanceof InterfaceC3287c.a ? ((InterfaceC3287c.a) interfaceC3287c).getExportedHeartData() : null;
            if (exportedHeartData == null) {
                return MetricHeartDataSyncState.EmptyHeartData.INSTANCE;
            }
            C34844u0 c34844u0 = AbstractC34846v0.Companion;
            File exportedFile = exportedHeartData.getExportedFile();
            C39412p c39412p = C34818h0.f146589e;
            C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J("application/json");
            c34844u0.getClass();
            C34834p0 c34834p0M109924a = C34844u0.m109924a(exportedFile, c34818h0M5373J);
            new AbstractC34846v0() { // from class: com.whoop.data.interactor.ExportedMetricsInteractor$prepareHeartDataFile$2$1$body$1$1
                @Override // ud3.AbstractC34846v0
                public long contentLength() {
                    return contentLength();
                }

                @Override // ud3.AbstractC34846v0
                /* JADX INFO: renamed from: contentType */
                public C34818h0 getContentType() {
                    return getContentType();
                }

                @Override // ud3.AbstractC34846v0
                public void writeTo(InterfaceC26618i sink) throws IOException {
                    AbstractC22676k.m65750j(sink, "sink");
                    C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(new C26641u(sink));
                    writeTo(c26617h0M79157b);
                    c26617h0M79157b.close();
                }
            };
            return new MetricHeartDataSyncState.ForcedSyncSuccess(new MetricsHeartDataBundle(exportedHeartData, c34834p0M109924a));
        }
    }

    public ExportedMetricsInteractor(InterfaceC4366f historySyncRouter, InterfaceC3288d heartDataStore, InterfaceC18732d dispatcherFactory, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(historySyncRouter, "historySyncRouter");
        AbstractC22676k.m65750j(heartDataStore, "heartDataStore");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.historySyncRouter = historySyncRouter;
        this.heartDataStore = heartDataStore;
        this.dispatcherFactory = dispatcherFactory;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.exportedHeartDataFlow = AbstractC13091v.m36586L(AbstractC13091v.m36590P(c13096w1M36592b, new ExportedMetricsInteractor$special$$inlined$flatMapLatest$1(null, this)), coroutineScope, C13105z1.f45288a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object prepareHeartDataFile(int i13, InterfaceC30057d<? super MetricHeartDataSyncState> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C64792(i13, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l startForcedSyncAndObserve(final int secondsRetrievedBeforeNow) {
        final InterfaceC13058l interfaceC13058lMo13757e = this.historySyncRouter.mo13757e(JOB_TAG);
        return new InterfaceC13058l() { // from class: com.whoop.data.interactor.ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.data.interactor.ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2, reason: invalid class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class AnonymousClass2<T> implements InterfaceC13062m {
                final /* synthetic */ int $secondsRetrievedBeforeNow$inlined;
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ ExportedMetricsInteractor this$0;

                /* JADX INFO: renamed from: com.whoop.data.interactor.ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.data.interactor.ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2", m100430f = "ExportedMetricsInteractor.kt", m100431l = {52, 50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC13062m interfaceC13062m, ExportedMetricsInteractor exportedMetricsInteractor, int i13) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = exportedMetricsInteractor;
                    this.$secondsRetrievedBeforeNow$inlined = i13;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
                
                    if (r2.emit(r9, r0) == r1) goto L29;
                 */
                @Override // ec3.InterfaceC13062m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, q83.InterfaceC30057d r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.whoop.data.interactor.C6480x7b680ad0.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.whoop.data.interactor.ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1 r0 = (com.whoop.data.interactor.C6480x7b680ad0.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.whoop.data.interactor.ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1 r0 = new com.whoop.data.interactor.ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.result
                        r83.a r1 = r83.EnumC31071a.f128113w
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L56
                        if (r2 == r4) goto L3c
                        if (r2 != r3) goto L34
                        java.lang.Object r9 = r0.L$3
                        ec3.m r9 = (ec3.InterfaceC13062m) r9
                        java.lang.Object r9 = r0.L$1
                        com.whoop.data.interactor.ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1 r9 = (com.whoop.data.interactor.C6480x7b680ad0.AnonymousClass2.AnonymousClass1) r9
                        p505ts.AbstractC34132o.m107864I(r10)
                        goto Lb1
                    L34:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L3c:
                        int r9 = r0.I$0
                        java.lang.Object r2 = r0.L$6
                        ts0.c r2 = (ts0.EnumC34138c) r2
                        java.lang.Object r2 = r0.L$5
                        q83.d r2 = (q83.InterfaceC30057d) r2
                        java.lang.Object r2 = r0.L$4
                        ec3.m r2 = (ec3.InterfaceC13062m) r2
                        java.lang.Object r4 = r0.L$3
                        ec3.m r4 = (ec3.InterfaceC13062m) r4
                        java.lang.Object r4 = r0.L$1
                        com.whoop.data.interactor.ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1 r4 = (com.whoop.data.interactor.C6480x7b680ad0.AnonymousClass2.AnonymousClass1) r4
                        p505ts.AbstractC34132o.m107864I(r10)
                        goto L95
                    L56:
                        p505ts.AbstractC34132o.m107864I(r10)
                        ec3.m r2 = r8.$this_unsafeFlow
                        ts0.c r9 = (ts0.EnumC34138c) r9
                        int[] r10 = com.whoop.data.interactor.ExportedMetricsInteractor.WhenMappings.$EnumSwitchMapping$0
                        int r9 = r9.ordinal()
                        r9 = r10[r9]
                        r10 = 0
                        if (r9 == r4) goto L73
                        if (r9 != r3) goto L6d
                        com.whoop.data.interactor.MetricHeartDataSyncState$FullSyncSuccess r9 = com.whoop.data.interactor.MetricHeartDataSyncState.FullSyncSuccess.INSTANCE
                        goto L98
                    L6d:
                        kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                        r9.<init>()
                        throw r9
                    L73:
                        com.whoop.data.interactor.ExportedMetricsInteractor r9 = r8.this$0
                        int r6 = r8.$secondsRetrievedBeforeNow$inlined
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.L$2 = r5
                        r0.L$3 = r5
                        r0.L$4 = r2
                        r0.L$5 = r5
                        r0.L$6 = r5
                        r0.I$0 = r10
                        r0.I$1 = r10
                        r0.label = r4
                        java.lang.Object r9 = com.whoop.data.interactor.ExportedMetricsInteractor.access$prepareHeartDataFile(r9, r6, r0)
                        if (r9 != r1) goto L92
                        goto Lb0
                    L92:
                        r7 = r10
                        r10 = r9
                        r9 = r7
                    L95:
                        r7 = r10
                        r10 = r9
                        r9 = r7
                    L98:
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.L$2 = r5
                        r0.L$3 = r5
                        r0.L$4 = r5
                        r0.L$5 = r5
                        r0.L$6 = r5
                        r0.I$0 = r10
                        r0.label = r3
                        java.lang.Object r9 = r2.emit(r9, r0)
                        if (r9 != r1) goto Lb1
                    Lb0:
                        return r1
                    Lb1:
                        l83.a0 r9 = l83.C23454a0.f92919a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.interactor.C6480x7b680ad0.AnonymousClass2.emit(java.lang.Object, q83.d):java.lang.Object");
                }
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = interfaceC13058lMo13757e.collect(new AnonymousClass2(interfaceC13062m, this, secondsRetrievedBeforeNow), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
    }

    public final InterfaceC13058l getExportedHeartDataFlow() {
        return this.exportedHeartDataFlow;
    }

    public final Object sendAction(ExportedMetricsAction exportedMetricsAction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objEmit = this.eventFlow.emit(exportedMetricsAction, interfaceC30057d);
        return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
    }
}
