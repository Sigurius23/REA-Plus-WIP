package com.whoop.straphistorysync.sync;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bi2.InterfaceC3292h;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jk0.InterfaceC21750d;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.C32970n;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import vk0.InterfaceC36083i;
import wh2.C37300a;
import wj0.EnumC37318b;
import xj0.C38370n;
import xj0.C38381s;
import zj0.C40727h;
import zj0.InterfaceC40730i;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 12\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b%\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/i;", "", "", "deviceSerial", "Lec3/p1;", "Lcom/whoop/straphistorysync/sync/f;", "stateFlow", "Lcom/whoop/straphistorysync/sync/d;", "stateMachine", "Lbi2/h;", "syncProcessor", "Lwh2/a;", "analytics", "Ltr2/n;", "logger", "<init>", "(Ljava/lang/String;Lec3/p1;Lcom/whoop/straphistorysync/sync/d;Lbi2/h;Lwh2/a;Ltr2/n;)V", "Lvk0/i;", "gattService", "Lst0/v;", "deviceType", "Ll83/a0;", "l", "(Lvk0/i;Lst0/v;Lq83/d;)Ljava/lang/Object;", "Ljk0/d;", "whoopStrap", "Lcom/whoop/straphistorysync/sync/f$b;", "j", "(Ljk0/d;Lvk0/i;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/straphistorysync/sync/f$a;", "state", "i", "(Lcom/whoop/straphistorysync/sync/f$a;Lvk0/i;Lq83/d;)Ljava/lang/Object;", "a", "(Lvk0/i;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljk0/d;Lq83/d;)Ljava/lang/Object;", "k", "Ljava/lang/String;", "b", "Lec3/p1;", "c", "Lcom/whoop/straphistorysync/sync/d;", "d", "Lbi2/h;", "e", "Lwh2/a;", "f", "Ltr2/n;", "g", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10281i {

    /* JADX INFO: renamed from: h */
    private static final long f31129h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String deviceSerial;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 stateFlow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C10276d stateMachine;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC3292h syncProcessor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C37300a analytics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder", m100430f = "SensorSyncHolder.kt", m100431l = {235}, m100432m = "abortHistorySync", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f31136E;

        /* JADX INFO: renamed from: w */
        Object f31137w;

        /* JADX INFO: renamed from: x */
        Object f31138x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f31139y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31139y = obj;
            this.f31136E |= Integer.MIN_VALUE;
            return C10281i.this.m26289a(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder", m100430f = "SensorSyncHolder.kt", m100431l = {67, 70}, m100432m = "doWork", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f31141E;

        /* JADX INFO: renamed from: w */
        Object f31142w;

        /* JADX INFO: renamed from: x */
        Object f31143x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f31144y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31144y = obj;
            this.f31141E |= Integer.MIN_VALUE;
            return C10281i.this.m26299h(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$d */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder$doWork$2", m100430f = "SensorSyncHolder.kt", m100431l = {74, 77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/straphistorysync/sync/f$b;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/straphistorysync/sync/f$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC36083i f31146E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC21750d f31147F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C10281i f31148G;

        /* JADX INFO: renamed from: w */
        Object f31149w;

        /* JADX INFO: renamed from: x */
        Object f31150x;

        /* JADX INFO: renamed from: y */
        int f31151y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f31152z;

        /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder$doWork$2$syncJob$1", m100430f = "SensorSyncHolder.kt", m100431l = {72}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/straphistorysync/sync/f$b;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/straphistorysync/sync/f$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f31153w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10281i f31154x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC21750d f31155y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC36083i f31156z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C10281i c10281i, InterfaceC21750d interfaceC21750d, InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f31154x = c10281i;
                this.f31155y = interfaceC21750d;
                this.f31156z = interfaceC36083i;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f31154x, this.f31155y, this.f31156z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC10278f.b> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f31153w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C10281i c10281i = this.f31154x;
                InterfaceC21750d interfaceC21750d = this.f31155y;
                InterfaceC36083i interfaceC36083i = this.f31156z;
                this.f31153w = 1;
                Object objM26297j = c10281i.m26297j(interfaceC21750d, interfaceC36083i, this);
                return objM26297j == enumC31071a ? enumC31071a : objM26297j;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC36083i interfaceC36083i, InterfaceC21750d interfaceC21750d, C10281i c10281i, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f31146E = interfaceC36083i;
            this.f31147F = interfaceC21750d;
            this.f31148G = c10281i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f31146E, this.f31147F, this.f31148G, interfaceC30057d);
            dVar.f31152z = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC10278f.b> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        
            if (r15 == r1) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f31152z
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f31151y
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L34
                if (r2 == r4) goto L27
                if (r2 != r3) goto L1f
                java.lang.Object r0 = r14.f31150x
                zj0.h r0 = (zj0.C40727h) r0
                java.lang.Object r0 = r14.f31149w
                bc3.i0 r0 = (bc3.InterfaceC3018i0) r0
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L93
            L1f:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L27:
                java.lang.Object r0 = r14.f31149w
                bc3.i0 r0 = (bc3.InterfaceC3018i0) r0
                p505ts.AbstractC34132o.m107864I(r15)
                l83.n r15 = (l83.C23468n) r15
                java.lang.Object r15 = r15.f92940w
                r11 = r14
                goto L67
            L34:
                p505ts.AbstractC34132o.m107864I(r15)
                com.whoop.straphistorysync.sync.i$d$a r15 = new com.whoop.straphistorysync.sync.i$d$a
                com.whoop.straphistorysync.sync.i r2 = r14.f31148G
                jk0.d r6 = r14.f31147F
                vk0.i r7 = r14.f31146E
                r15.<init>(r2, r6, r7, r5)
                r2 = 3
                bc3.j0 r0 = bc3.AbstractC3006f0.m8711e(r0, r5, r15, r2)
                vk0.i r6 = r14.f31146E
                xj0.t r7 = new xj0.t
                jk0.d r15 = r14.f31147F
                st0.v r15 = r15.mo24752w0()
                r7.<init>(r15)
                r14.f31152z = r5
                r14.f31149w = r0
                r14.f31151y = r4
                r8 = 0
                r10 = 0
                r12 = 6
                r13 = 0
                r11 = r14
                java.lang.Object r15 = vk0.InterfaceC36083i.m114608r0(r6, r7, r8, r10, r11, r12, r13)
                if (r15 != r1) goto L67
                goto L92
            L67:
                boolean r2 = r15 instanceof l83.C23467m
                if (r2 == 0) goto L6c
                r15 = r5
            L6c:
                zj0.h r15 = (zj0.C40727h) r15
                r2 = 0
                if (r15 == 0) goto L96
                boolean r15 = r15.m132198W()
                if (r15 != r4) goto L96
                com.whoop.straphistorysync.sync.i r15 = r11.f31148G
                tr2.n r15 = com.whoop.straphistorysync.sync.C10281i.m26291c(r15)
                java.lang.String r4 = "Send history command accepted, beginning sensor sync"
                qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r2]
                r15.mo85228t(r4, r2)
                r11.f31152z = r5
                r11.f31149w = r5
                r11.f31150x = r5
                r11.f31151y = r3
                java.lang.Object r15 = r0.await(r14)
                if (r15 != r1) goto L93
            L92:
                return r1
            L93:
                com.whoop.straphistorysync.sync.f$b r15 = (com.whoop.straphistorysync.sync.InterfaceC10278f.b) r15
                return r15
            L96:
                bc3.t1 r0 = (bc3.C3060t1) r0
                r0.cancel(r5)
                com.whoop.straphistorysync.sync.i r15 = r11.f31148G
                tr2.n r15 = com.whoop.straphistorysync.sync.C10281i.m26291c(r15)
                java.lang.String r0 = "Send history command failed"
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r2]
                r15.mo85222m(r0, r1)
                com.whoop.straphistorysync.sync.f$b$b r2 = new com.whoop.straphistorysync.sync.f$b$b
                bi2.a r3 = bi2.EnumC3285a.SendCommandException
                r7 = 14
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.straphistorysync.sync.C10281i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$e */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder", m100430f = "SensorSyncHolder.kt", m100431l = {199, 205}, m100432m = "handleRunningState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f31158F;

        /* JADX INFO: renamed from: w */
        Object f31159w;

        /* JADX INFO: renamed from: x */
        Object f31160x;

        /* JADX INFO: renamed from: y */
        Object f31161y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f31162z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31162z = obj;
            this.f31158F |= Integer.MIN_VALUE;
            return C10281i.this.m26296i(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$f */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder", m100430f = "SensorSyncHolder.kt", m100431l = {178, 183}, m100432m = "invokeAndGetTerminalState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f31163E;

        /* JADX INFO: renamed from: G */
        int f31165G;

        /* JADX INFO: renamed from: w */
        Object f31166w;

        /* JADX INFO: renamed from: x */
        Object f31167x;

        /* JADX INFO: renamed from: y */
        Object f31168y;

        /* JADX INFO: renamed from: z */
        Object f31169z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31163E = obj;
            this.f31165G |= Integer.MIN_VALUE;
            return C10281i.this.m26297j(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$g */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder$invokeAndGetTerminalState$2", m100430f = "SensorSyncHolder.kt", m100431l = {135}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/straphistorysync/sync/f;", "", "cause", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22669g0 f31170E;

        /* JADX INFO: renamed from: w */
        int f31171w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f31172x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f31173y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC21750d f31174z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC21750d interfaceC21750d, C22669g0 c22669g0, InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f31174z = interfaceC21750d;
            this.f31170E = c22669g0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(this.f31174z, this.f31170E, interfaceC30057d);
            gVar.f31172x = interfaceC13062m;
            gVar.f31173y = th3;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f31172x;
            Throwable th3 = (Throwable) this.f31173y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31171w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof TimeoutCancellationException)) {
                    throw th3;
                }
                Object objM26286a = !(this.f31174z.getConnectionState() instanceof C32970n) ? AbstractC10279g.m26286a((InterfaceC10278f) this.f31170E.f89336w) : AbstractC10279g.m26288c((InterfaceC10278f) this.f31170E.f89336w);
                this.f31172x = null;
                this.f31173y = null;
                this.f31171w = 1;
                if (interfaceC13062m.emit(objM26286a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$h */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder$invokeAndGetTerminalState$3", m100430f = "SensorSyncHolder.kt", m100431l = {148, 152, 155, 162, 169}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f;", "state", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/straphistorysync/sync/f;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31175w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f31176x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC36083i f31178z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f31178z = interfaceC36083i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C10281i.this.new h(this.f31178z, interfaceC30057d);
            hVar.f31176x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC10278f interfaceC10278f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC10278f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0102 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x0103 A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC10278f interfaceC10278f = (InterfaceC10278f) this.f31176x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31175w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            C10281i.this.logger.mo85228t("HPS state: " + interfaceC10278f, new AbstractC30556a.a[0]);
            InterfaceC13075p1 interfaceC13075p1 = C10281i.this.stateFlow;
            this.f31176x = interfaceC10278f;
            this.f31175w = 1;
            ((C13045h2) interfaceC13075p1).emit(interfaceC10278f, this);
            if (c23454a0 != enumC31071a) {
            }
            return enumC31071a;
            if (interfaceC10278f instanceof InterfaceC10278f.a) {
                InterfaceC36083i interfaceC36083i = this.f31178z;
                this.f31176x = null;
                this.f31175w = 2;
                if (C10281i.this.m26296i((InterfaceC10278f.a) interfaceC10278f, interfaceC36083i, this) == enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
            }
            if (interfaceC10278f instanceof InterfaceC10278f.b.e) {
                C10281i c10281i = C10281i.this;
                InterfaceC36083i interfaceC36083i2 = this.f31178z;
                this.f31176x = null;
                this.f31175w = 3;
                if (c10281i.m26289a(interfaceC36083i2, this) == enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
            }
            if (interfaceC10278f instanceof InterfaceC10278f.b.a) {
                C10281i.this.logger.mo85216g("Sensor HPS ended due to BLE disconnect: " + interfaceC10278f, new AbstractC30556a.a[0]);
            } else if (interfaceC10278f instanceof InterfaceC10278f.b.c) {
                C10281i c10281i2 = C10281i.this;
                InterfaceC36083i interfaceC36083i3 = this.f31178z;
                this.f31176x = null;
                this.f31175w = 4;
                if (c10281i2.m26289a(interfaceC36083i3, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else if (interfaceC10278f instanceof InterfaceC10278f.b.d) {
                C10281i.this.logger.mo85228t("Sensor HPS completed successfully: " + interfaceC10278f, new AbstractC30556a.a[0]);
            } else {
                if (!(interfaceC10278f instanceof InterfaceC10278f.b.C41422b)) {
                    throw new NoWhenBranchMatchedException();
                }
                C10281i.this.logger.mo85222m("Sensor HPS ended with error: " + interfaceC10278f, new AbstractC30556a.a[0]);
                C10281i c10281i3 = C10281i.this;
                InterfaceC36083i interfaceC36083i4 = this.f31178z;
                this.f31176x = null;
                this.f31175w = 5;
                if (c10281i3.m26289a(interfaceC36083i4, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$i */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder$invokeAndGetTerminalState$4", m100430f = "SensorSyncHolder.kt", m100431l = {174}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/straphistorysync/sync/f;", "state", "", "<anonymous>", "(Lec3/m;Lcom/whoop/straphistorysync/sync/f;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f31179w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f31180x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f31181y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22669g0 f31182z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C22669g0 c22669g0, InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f31182z = c22669g0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC10278f interfaceC10278f, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            i iVar = new i(this.f31182z, interfaceC30057d);
            iVar.f31180x = interfaceC13062m;
            iVar.f31181y = interfaceC10278f;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f31180x;
            InterfaceC10278f interfaceC10278f = (InterfaceC10278f) this.f31181y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31179w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f31180x = null;
                this.f31181y = interfaceC10278f;
                this.f31179w = 1;
                if (interfaceC13062m.emit(interfaceC10278f, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f31182z.f89336w = interfaceC10278f;
            return Boolean.valueOf(!(interfaceC10278f instanceof InterfaceC10278f.b));
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$j */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder", m100430f = "SensorSyncHolder.kt", m100431l = {221, 228}, m100432m = "onCancel", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f31184F;

        /* JADX INFO: renamed from: w */
        Object f31185w;

        /* JADX INFO: renamed from: x */
        Object f31186x;

        /* JADX INFO: renamed from: y */
        long f31187y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f31188z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31188z = obj;
            this.f31184F |= Integer.MIN_VALUE;
            return C10281i.this.m26300k(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.i$k */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncHolder", m100430f = "SensorSyncHolder.kt", m100431l = {101}, m100432m = "queryBacklog", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f31189E;

        /* JADX INFO: renamed from: w */
        Object f31190w;

        /* JADX INFO: renamed from: x */
        Object f31191x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f31192y;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31192y = obj;
            this.f31189E |= Integer.MIN_VALUE;
            return C10281i.this.m26298l(null, null, this);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f31129h = DurationKt.toDuration(5, DurationUnit.SECONDS);
    }

    public C10281i(String deviceSerial, InterfaceC13075p1 stateFlow, C10276d stateMachine, InterfaceC3292h syncProcessor, C37300a analytics, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(deviceSerial, "deviceSerial");
        AbstractC22676k.m65750j(stateFlow, "stateFlow");
        AbstractC22676k.m65750j(stateMachine, "stateMachine");
        AbstractC22676k.m65750j(syncProcessor, "syncProcessor");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(logger, "logger");
        this.deviceSerial = deviceSerial;
        this.stateFlow = stateFlow;
        this.stateMachine = stateMachine;
        this.syncProcessor = syncProcessor;
        this.analytics = analytics;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: a */
    public final Object m26289a(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        EnumC32978v enumC32978vMo24752w0;
        Object objM114608r0;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f31136E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f31136E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f31139y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f31136E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21750d interfaceC21750d = interfaceC36083i instanceof InterfaceC21750d ? (InterfaceC21750d) interfaceC36083i : null;
                if (interfaceC21750d == null || (enumC32978vMo24752w0 = interfaceC21750d.mo24752w0()) == null) {
                    enumC32978vMo24752w0 = EnumC32978v.MAVERICK;
                }
                C38381s c38381s = new C38381s(enumC32978vMo24752w0);
                bVar2.f31137w = null;
                bVar2.f31138x = null;
                bVar2.f31136E = 1;
                objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i, c38381s, 0L, false, bVar2, 6, null);
                if (objM114608r0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM114608r0 = ((C23468n) obj).f92940w;
            }
            this.logger.mo85228t("Abort history sync response: " + C23468n.m68038b(objM114608r0), new AbstractC30556a.a[0]);
        } catch (TimeoutCancellationException e5) {
            this.logger.mo85230v("Timeout while aborting history sync", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r12 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        if (r12 == r0) goto L27;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m26296i(com.whoop.straphistorysync.sync.InterfaceC10278f.a r12, vk0.InterfaceC36083i r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.straphistorysync.sync.C10281i.m26296i(com.whoop.straphistorysync.sync.f$a, vk0.i, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        if (m26289a(r11, r0) == r1) goto L38;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m26297j(jk0.InterfaceC21750d r10, vk0.InterfaceC36083i r11, q83.InterfaceC30057d<? super com.whoop.straphistorysync.sync.InterfaceC10278f.b> r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.straphistorysync.sync.C10281i.m26297j(jk0.d, vk0.i, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final Object m26298l(InterfaceC36083i interfaceC36083i, EnumC32978v enumC32978v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        k kVar;
        Object objM114608r0;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f31189E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f31189E = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f31192y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar2.f31189E;
        InterfaceC40730i interfaceC40730i = null;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C38370n c38370n = new C38370n(enumC32978v);
                kVar2.f31190w = null;
                kVar2.f31191x = null;
                kVar2.f31189E = 1;
                objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i, c38370n, 0L, true, kVar2, 2, null);
                if (objM114608r0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM114608r0 = ((C23468n) obj).f92940w;
            }
            if (objM114608r0 instanceof C23467m) {
                objM114608r0 = null;
            }
            C40727h c40727h = (C40727h) objM114608r0;
            InterfaceC40730i interfaceC40730i2 = c40727h instanceof InterfaceC40730i ? (InterfaceC40730i) c40727h : null;
            if (interfaceC40730i2 != null && c40727h.m132197V() == EnumC37318b.SUCCESS) {
                interfaceC40730i = interfaceC40730i2;
            }
            if (interfaceC40730i != null) {
                this.logger.mo85216g("Strap backlog before sync: pagesBehind=" + interfaceC40730i.mo132202D(), new AbstractC30556a.a[0]);
                this.analytics.m119462p(interfaceC40730i.mo132202D());
            } else {
                this.logger.mo85226q("GetDataRange returned no response", new AbstractC30556a.a[0]);
            }
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(kVar2.getContext());
            this.logger.mo85230v("Failed to query strap data range", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m26299h(jk0.InterfaceC21750d r7, q83.InterfaceC30057d<? super com.whoop.straphistorysync.sync.InterfaceC10278f.b> r8) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.straphistorysync.sync.C10281i.m26299h(jk0.d, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r5 == r3) goto L21;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m26300k(vk0.InterfaceC36083i r17, q83.InterfaceC30057d<? super l83.C23454a0> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.whoop.straphistorysync.sync.C10281i.j
            if (r2 == 0) goto L17
            r2 = r1
            com.whoop.straphistorysync.sync.i$j r2 = (com.whoop.straphistorysync.sync.C10281i.j) r2
            int r3 = r2.f31184F
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f31184F = r3
            goto L1c
        L17:
            com.whoop.straphistorysync.sync.i$j r2 = new com.whoop.straphistorysync.sync.i$j
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f31188z
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r2.f31184F
            l83.a0 r5 = l83.C23454a0.f92919a
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L49
            if (r4 == r7) goto L41
            if (r4 != r6) goto L39
            java.lang.Object r3 = r2.f31186x
            com.whoop.straphistorysync.sync.f$b$b r3 = (com.whoop.straphistorysync.sync.InterfaceC10278f.b.C41422b) r3
            java.lang.Object r2 = r2.f31185w
            vk0.i r2 = (vk0.InterfaceC36083i) r2
            p505ts.AbstractC34132o.m107864I(r1)
            goto L9e
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            java.lang.Object r4 = r2.f31185w
            vk0.i r4 = (vk0.InterfaceC36083i) r4
            p505ts.AbstractC34132o.m107864I(r1)
            goto L63
        L49:
            p505ts.AbstractC34132o.m107864I(r1)
            tr2.n r1 = r0.logger
            r4 = 0
            qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r4]
            java.lang.String r9 = "HPS cancelled, sending abort command"
            r1.mo85228t(r9, r4)
            r2.f31185w = r8
            r2.f31184F = r7
            r1 = r17
            java.lang.Object r1 = r0.m26289a(r1, r2)
            if (r1 != r3) goto L63
            goto L9d
        L63:
            com.whoop.straphistorysync.sync.f$b$b r9 = new com.whoop.straphistorysync.sync.f$b$b
            bi2.a r10 = bi2.EnumC3285a.Cancelled
            r14 = 14
            r15 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.time.Clock r1 = java.time.Clock.systemUTC()
            long r10 = r1.millis()
            wh2.a r1 = r0.analytics
            r1.m119471y(r9)
            wh2.a r1 = r0.analytics
            r1.m119470x(r9)
            wh2.a r1 = r0.analytics
            r1.m119472z(r9)
            wh2.a r1 = r0.analytics
            r1.m119469w(r9, r10)
            ec3.p1 r1 = r0.stateFlow
            r2.f31185w = r8
            r2.f31186x = r8
            r2.f31187y = r10
            r2.f31184F = r6
            ec3.h2 r1 = (ec3.C13045h2) r1
            r1.emit(r9, r2)
            if (r5 != r3) goto L9e
        L9d:
            return r3
        L9e:
            com.whoop.straphistorysync.sync.d r1 = r0.stateMachine
            java.lang.String r2 = r0.deviceSerial
            r1.m26263b(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.straphistorysync.sync.C10281i.m26300k(vk0.i, q83.d):java.lang.Object");
    }

    public /* synthetic */ C10281i(String str, InterfaceC13075p1 interfaceC13075p1, C10276d c10276d, InterfaceC3292h interfaceC3292h, C37300a c37300a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC13075p1, c10276d, interfaceC3292h, c37300a, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SensorSyncHolder") : interfaceC34116n);
    }
}
