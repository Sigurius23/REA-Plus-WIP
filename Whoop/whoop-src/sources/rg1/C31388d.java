package rg1;

import ci2.InterfaceC4733b;
import gt0.InterfaceC16182d;
import gt0.InterfaceC16183e;
import nl1.C26813a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: rg1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lrg1/d;", "", "Lgt0/e;", "firmwareUpdateApi", "Lci2/b;", "whoopStrapProvider", "Lnl1/a;", "newFirmwareUpdateMonitor", "Ltr2/n;", "logger", "Lgt0/d;", "fwAnalyticsHelper", "<init>", "(Lgt0/e;Lci2/b;Lnl1/a;Ltr2/n;Lgt0/d;)V", "Ll83/a0;", "b", "(Lq83/d;)Ljava/lang/Object;", "d", "c", "a", "Lgt0/e;", "Lci2/b;", "Lnl1/a;", "Ltr2/n;", "e", "Lgt0/d;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31388d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC16183e firmwareUpdateApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26813a newFirmwareUpdateMonitor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC16182d fwAnalyticsHelper;

    /* JADX INFO: renamed from: rg1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.domain.FwApiInteractor", m100430f = "FwApiInteractor.kt", m100431l = {54, 55}, m100432m = "doLater", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129187E;

        /* JADX INFO: renamed from: w */
        Object f129188w;

        /* JADX INFO: renamed from: x */
        int f129189x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129190y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129190y = obj;
            this.f129187E |= Integer.MIN_VALUE;
            return C31388d.this.m96653a(this);
        }
    }

    /* JADX INFO: renamed from: rg1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.domain.FwApiInteractor", m100430f = "FwApiInteractor.kt", m100431l = {25, 26}, m100432m = "processFw", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129192E;

        /* JADX INFO: renamed from: w */
        Object f129193w;

        /* JADX INFO: renamed from: x */
        int f129194x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129195y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129195y = obj;
            this.f129192E |= Integer.MIN_VALUE;
            return C31388d.this.m96654b(this);
        }
    }

    /* JADX INFO: renamed from: rg1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.domain.FwApiInteractor", m100430f = "FwApiInteractor.kt", m100431l = {47, 48}, m100432m = "resetState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129197E;

        /* JADX INFO: renamed from: w */
        Object f129198w;

        /* JADX INFO: renamed from: x */
        int f129199x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129200y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129200y = obj;
            this.f129197E |= Integer.MIN_VALUE;
            return C31388d.this.m96655c(this);
        }
    }

    /* JADX INFO: renamed from: rg1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.domain.FwApiInteractor", m100430f = "FwApiInteractor.kt", m100431l = {39, 40}, m100432m = "retryFwUpdate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129202E;

        /* JADX INFO: renamed from: w */
        Object f129203w;

        /* JADX INFO: renamed from: x */
        int f129204x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129205y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129205y = obj;
            this.f129202E |= Integer.MIN_VALUE;
            return C31388d.this.m96656d(this);
        }
    }

    public C31388d(InterfaceC16183e firmwareUpdateApi, InterfaceC4733b whoopStrapProvider, C26813a newFirmwareUpdateMonitor, InterfaceC34116n logger, InterfaceC16182d fwAnalyticsHelper) {
        AbstractC22676k.m65750j(firmwareUpdateApi, "firmwareUpdateApi");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(newFirmwareUpdateMonitor, "newFirmwareUpdateMonitor");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(fwAnalyticsHelper, "fwAnalyticsHelper");
        this.firmwareUpdateApi = firmwareUpdateApi;
        this.whoopStrapProvider = whoopStrapProvider;
        this.newFirmwareUpdateMonitor = newFirmwareUpdateMonitor;
        this.logger = logger;
        this.fwAnalyticsHelper = fwAnalyticsHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (ec3.AbstractC13091v.m36603m(r8, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m96653a(q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rg1.C31388d.a
            if (r0 == 0) goto L13
            r0 = r8
            rg1.d$a r0 = (rg1.C31388d.a) r0
            int r1 = r0.f129187E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129187E = r1
            goto L18
        L13:
            rg1.d$a r0 = new rg1.d$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f129190y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f129187E
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f129188w
            jk0.d r0 = (jk0.InterfaceC21750d) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L77
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L56
        L3b:
            p505ts.AbstractC34132o.m107864I(r8)
            tr2.n r8 = r7.logger
            java.lang.String r2 = "Delaying firmware update"
            qr2.a$a[] r6 = new qr2.AbstractC30556a.a[r3]
            r8.mo85216g(r2, r6)
            ci2.b r8 = r7.whoopStrapProvider
            ec3.f2 r8 = r8.mo14817a()
            r0.f129187E = r5
            java.lang.Object r8 = ec3.AbstractC13091v.m36577C(r8, r0)
            if (r8 != r1) goto L56
            goto L76
        L56:
            jk0.d r8 = (jk0.InterfaceC21750d) r8
            if (r8 == 0) goto L77
            gt0.e r2 = r7.firmwareUpdateApi
            gt0.g$c r5 = new gt0.g$c
            com.whoop.connectivityCore.firmware.models.WhoopFwDevice r8 = ci2.AbstractC4732a.m14816b(r8)
            r5.<init>(r8)
            ec3.l r8 = r2.mo45721b(r5)
            r2 = 0
            r0.f129188w = r2
            r0.f129189x = r3
            r0.f129187E = r4
            java.lang.Object r8 = ec3.AbstractC13091v.m36603m(r8, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rg1.C31388d.m96653a(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (ec3.AbstractC13091v.m36603m(r8, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m96654b(q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rg1.C31388d.b
            if (r0 == 0) goto L13
            r0 = r8
            rg1.d$b r0 = (rg1.C31388d.b) r0
            int r1 = r0.f129192E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129192E = r1
            goto L18
        L13:
            rg1.d$b r0 = new rg1.d$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f129195y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f129192E
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f129193w
            jk0.d r0 = (jk0.InterfaceC21750d) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L77
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L56
        L3b:
            p505ts.AbstractC34132o.m107864I(r8)
            tr2.n r8 = r7.logger
            java.lang.String r2 = "Processing firmware update"
            qr2.a$a[] r6 = new qr2.AbstractC30556a.a[r3]
            r8.mo85216g(r2, r6)
            ci2.b r8 = r7.whoopStrapProvider
            ec3.f2 r8 = r8.mo14817a()
            r0.f129192E = r5
            java.lang.Object r8 = ec3.AbstractC13091v.m36577C(r8, r0)
            if (r8 != r1) goto L56
            goto L76
        L56:
            jk0.d r8 = (jk0.InterfaceC21750d) r8
            if (r8 == 0) goto L77
            gt0.e r2 = r7.firmwareUpdateApi
            gt0.g$e r5 = new gt0.g$e
            com.whoop.connectivityCore.firmware.models.WhoopFwDevice r8 = ci2.AbstractC4732a.m14816b(r8)
            r5.<init>(r8)
            ec3.l r8 = r2.mo45721b(r5)
            r2 = 0
            r0.f129193w = r2
            r0.f129194x = r3
            r0.f129192E = r4
            java.lang.Object r8 = ec3.AbstractC13091v.m36603m(r8, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rg1.C31388d.m96654b(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (ec3.AbstractC13091v.m36603m(r8, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m96655c(q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rg1.C31388d.c
            if (r0 == 0) goto L13
            r0 = r8
            rg1.d$c r0 = (rg1.C31388d.c) r0
            int r1 = r0.f129197E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129197E = r1
            goto L18
        L13:
            rg1.d$c r0 = new rg1.d$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f129200y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f129197E
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f129198w
            jk0.d r0 = (jk0.InterfaceC21750d) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L7c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L5b
        L3b:
            p505ts.AbstractC34132o.m107864I(r8)
            tr2.n r8 = r7.logger
            java.lang.String r2 = "Resetting firmware update state"
            qr2.a$a[] r6 = new qr2.AbstractC30556a.a[r3]
            r8.mo85216g(r2, r6)
            nl1.a r8 = r7.newFirmwareUpdateMonitor
            r8.m79991e()
            ci2.b r8 = r7.whoopStrapProvider
            ec3.f2 r8 = r8.mo14817a()
            r0.f129197E = r5
            java.lang.Object r8 = ec3.AbstractC13091v.m36577C(r8, r0)
            if (r8 != r1) goto L5b
            goto L7b
        L5b:
            jk0.d r8 = (jk0.InterfaceC21750d) r8
            if (r8 == 0) goto L7c
            gt0.e r2 = r7.firmwareUpdateApi
            gt0.g$f r5 = new gt0.g$f
            com.whoop.connectivityCore.firmware.models.WhoopFwDevice r8 = ci2.AbstractC4732a.m14816b(r8)
            r5.<init>(r8)
            ec3.l r8 = r2.mo45721b(r5)
            r2 = 0
            r0.f129198w = r2
            r0.f129199x = r3
            r0.f129197E = r4
            java.lang.Object r8 = ec3.AbstractC13091v.m36603m(r8, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rg1.C31388d.m96655c(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (ec3.AbstractC13091v.m36603m(r1, r2) == r3) goto L23;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m96656d(q83.InterfaceC30057d<? super l83.C23454a0> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof rg1.C31388d.d
            if (r2 == 0) goto L17
            r2 = r1
            rg1.d$d r2 = (rg1.C31388d.d) r2
            int r3 = r2.f129202E
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f129202E = r3
            goto L1c
        L17:
            rg1.d$d r2 = new rg1.d$d
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f129205y
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r2.f129202E
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3f
            if (r4 == r7) goto L3b
            if (r4 != r6) goto L33
            java.lang.Object r2 = r2.f129203w
            jk0.d r2 = (jk0.InterfaceC21750d) r2
            p505ts.AbstractC34132o.m107864I(r1)
            goto L91
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            p505ts.AbstractC34132o.m107864I(r1)
            goto L70
        L3f:
            p505ts.AbstractC34132o.m107864I(r1)
            tr2.n r1 = r0.logger
            java.lang.String r4 = "Retrying firmware update"
            qr2.a$a[] r8 = new qr2.AbstractC30556a.a[r5]
            r1.mo85216g(r4, r8)
            nl1.a r1 = r0.newFirmwareUpdateMonitor
            r1.m79991e()
            gt0.d r8 = r0.fwAnalyticsHelper
            gt0.b r9 = gt0.EnumC16180b.PROMPT
            gt0.a r11 = gt0.EnumC16179a.RETRY
            r15 = 48
            r16 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            gt0.InterfaceC16182d.m45716a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            ci2.b r1 = r0.whoopStrapProvider
            ec3.f2 r1 = r1.mo14817a()
            r2.f129202E = r7
            java.lang.Object r1 = ec3.AbstractC13091v.m36577C(r1, r2)
            if (r1 != r3) goto L70
            goto L90
        L70:
            jk0.d r1 = (jk0.InterfaceC21750d) r1
            if (r1 == 0) goto L91
            gt0.e r4 = r0.firmwareUpdateApi
            gt0.g$e r7 = new gt0.g$e
            com.whoop.connectivityCore.firmware.models.WhoopFwDevice r1 = ci2.AbstractC4732a.m14816b(r1)
            r7.<init>(r1)
            ec3.l r1 = r4.mo45721b(r7)
            r4 = 0
            r2.f129203w = r4
            r2.f129204x = r5
            r2.f129202E = r6
            java.lang.Object r1 = ec3.AbstractC13091v.m36603m(r1, r2)
            if (r1 != r3) goto L91
        L90:
            return r3
        L91:
            l83.a0 r1 = l83.C23454a0.f92919a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rg1.C31388d.m96656d(q83.d):java.lang.Object");
    }
}
