package kg1;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.connectivityCore.firmware.models.WhoopFwDevice;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gt0.AbstractC16184f;
import gt0.InterfaceC16182d;
import gt0.InterfaceC16186h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rg1.C31387c;
import rg1.InterfaceC31386b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg1.InterfaceC32449a;
import tr2.InterfaceC34116n;
import ug1.C34942f;
import ug1.InterfaceC34941e;

/* JADX INFO: renamed from: kg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 52\u00020\u0001:\u0001$BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010\u001bJ\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190%2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010#J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b)\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m65681d2 = {"Lkg1/a;", "Lrg1/b;", "Ltr2/n;", "logger", "Lrg1/c;", "stateMachine", "Lsg1/a;", "firmwareRepo", "Lug1/f;", "firmwareUpdateStrategyFactory", "Lgt0/d;", "firmwareAnalyticsHelper", "Ljava/time/Clock;", "clock", "Lbc3/c0;", "coroutineScope", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Ltr2/n;Lrg1/c;Lsg1/a;Lug1/f;Lgt0/d;Ljava/time/Clock;Lbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "device", "", "userAcceptanceRequired", "Lec3/l;", "Lgt0/h;", "o", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)Lec3/l;", "result", "Ll83/a0;", "p", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lgt0/h;ZLq83/d;)Ljava/lang/Object;", "n", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;", "e", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/l;", "a", "Lec3/f2;", "d", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/f2;", "c", "b", "Ltr2/n;", "Lrg1/c;", "Lsg1/a;", "Lug1/f;", "Lgt0/d;", "f", "Ljava/time/Clock;", "g", "Lbc3/c0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/data/repositories/FeatureFlagChecker;", "i", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22454a implements InterfaceC31386b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C31387c stateMachine;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC32449a firmwareRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C34942f firmwareUpdateStrategyFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC16182d firmwareAnalyticsHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: kg1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$checkForUpdate$1", m100430f = "FirmwareUpdateManagerImpl.kt", m100431l = {46, 46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lgt0/h;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ WhoopFwDevice f87899E;

        /* JADX INFO: renamed from: w */
        Object f87900w;

        /* JADX INFO: renamed from: x */
        int f87901x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f87902y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87899E = whoopFwDevice;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C22454a.this.new b(this.f87899E, interfaceC30057d);
            bVar.f87902y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f87902y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f87901x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4a
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f87900w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3d
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                kg1.a r7 = kg1.C22454a.this
                sg1.a r7 = kg1.C22454a.m64836j(r7)
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r2 = r6.f87899E
                r6.f87902y = r5
                r6.f87900w = r0
                r6.f87901x = r4
                java.lang.Object r7 = r7.mo84254k(r2, r6)
                if (r7 != r1) goto L3d
                goto L49
            L3d:
                r6.f87902y = r5
                r6.f87900w = r5
                r6.f87901x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L4a
            L49:
                return r1
            L4a:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kg1.C22454a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kg1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$delayUpdate$1", m100430f = "FirmwareUpdateManagerImpl.kt", m100431l = {160}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87904w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopFwDevice f87906y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87906y = whoopFwDevice;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22454a.this.new c(this.f87906y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87904w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC32449a interfaceC32449a = C22454a.this.firmwareRepo;
                String serial = this.f87906y.getSerial();
                long jMillis = C22454a.this.clock.millis();
                this.f87904w = 1;
                if (interfaceC32449a.mo84246c(serial, jMillis, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kg1.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$observeUpdate$1", m100430f = "FirmwareUpdateManagerImpl.kt", m100431l = {143, 144}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87907w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopFwDevice f87909y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13037f2 f87910z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WhoopFwDevice whoopFwDevice, InterfaceC13037f2 interfaceC13037f2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87909y = whoopFwDevice;
            this.f87910z = interfaceC13037f2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22454a.this.new d(this.f87909y, this.f87910z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        
            if (r7.m96648a(r1, r4, r6) == r0) goto L21;
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
                int r1 = r6.f87907w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r7)
                goto L6b
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L34
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                kg1.a r7 = kg1.C22454a.this
                sg1.a r7 = kg1.C22454a.m64836j(r7)
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r1 = r6.f87909y
                java.lang.String r1 = r1.getSerial()
                r6.f87907w = r3
                java.lang.Object r7 = r7.mo84253j(r1, r6)
                if (r7 != r0) goto L34
                goto L6a
            L34:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L6b
                ec3.f2 r7 = r6.f87910z
                java.lang.Object r7 = r7.getValue()
                boolean r7 = r7 instanceof gt0.InterfaceC16186h.e
                if (r7 != 0) goto L6b
                kg1.a r7 = kg1.C22454a.this
                com.whoop.data.repositories.FeatureFlagChecker r7 = kg1.C22454a.m64834h(r7)
                java.lang.String r1 = "silent-forced-fw-update"
                boolean r7 = r7.isFeatureEnabled(r1)
                if (r7 != 0) goto L6b
                kg1.a r7 = kg1.C22454a.this
                rg1.c r7 = kg1.C22454a.m64838l(r7)
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r1 = r6.f87909y
                gt0.h$d r4 = new gt0.h$d
                r5 = 0
                r4.<init>(r3, r5)
                r6.f87907w = r2
                java.lang.Object r7 = r7.m96648a(r1, r4, r6)
                if (r7 != r0) goto L6b
            L6a:
                return r0
            L6b:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kg1.C22454a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kg1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ WhoopFwDevice f87911E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87912w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22454a f87913x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f87914y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f87915z;

        /* JADX INFO: renamed from: kg1.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ WhoopFwDevice f87916E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87917w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22454a f87918x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ long f87919y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ boolean f87920z;

            /* JADX INFO: renamed from: kg1.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$performUpdate$$inlined$map$1$2", m100430f = "FirmwareUpdateManagerImpl.kt", m100431l = {61, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41895a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87921E;

                /* JADX INFO: renamed from: F */
                Object f87922F;

                /* JADX INFO: renamed from: G */
                Object f87923G;

                /* JADX INFO: renamed from: H */
                Object f87924H;

                /* JADX INFO: renamed from: I */
                Object f87925I;

                /* JADX INFO: renamed from: J */
                Object f87926J;

                /* JADX INFO: renamed from: K */
                int f87927K;

                /* JADX INFO: renamed from: L */
                int f87928L;

                /* JADX INFO: renamed from: M */
                long f87929M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87930w;

                /* JADX INFO: renamed from: x */
                int f87931x;

                /* JADX INFO: renamed from: y */
                Object f87932y;

                public C41895a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87930w = obj;
                    this.f87931x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22454a c22454a, long j7, boolean z4, WhoopFwDevice whoopFwDevice) {
                this.f87917w = interfaceC13062m;
                this.f87918x = c22454a;
                this.f87919y = j7;
                this.f87920z = z4;
                this.f87916E = whoopFwDevice;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
            
                if (r13.m64840n(r4, r0) == r1) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
            
                r4 = r14;
                r13 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
            
                if (r13.m64840n(r5, r0) == r1) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L39;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    Method dump skipped, instruction units count: 297
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: kg1.C22454a.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C22454a c22454a, long j7, boolean z4, WhoopFwDevice whoopFwDevice) {
            this.f87912w = interfaceC13058l;
            this.f87913x = c22454a;
            this.f87914y = j7;
            this.f87915z = z4;
            this.f87911E = whoopFwDevice;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87912w.collect(new a(interfaceC13062m, this.f87913x, this.f87914y, this.f87915z, this.f87911E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kg1.a$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$resetState$1", m100430f = "FirmwareUpdateManagerImpl.kt", m100431l = {152, 154}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lgt0/h;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87934w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f87935x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ WhoopFwDevice f87937z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87937z = whoopFwDevice;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C22454a.this.new f(this.f87937z, interfaceC30057d);
            fVar.f87935x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f87935x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f87934w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L51
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L38
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                kg1.a r7 = kg1.C22454a.this
                rg1.c r7 = kg1.C22454a.m64838l(r7)
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r2 = r6.f87937z
                gt0.h$h r5 = gt0.InterfaceC16186h.h.f61490b
                r6.f87935x = r0
                r6.f87934w = r4
                java.lang.Object r7 = r7.m96648a(r2, r5, r6)
                if (r7 != r1) goto L38
                goto L50
            L38:
                kg1.a r7 = kg1.C22454a.this
                rg1.c r7 = kg1.C22454a.m64838l(r7)
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r2 = r6.f87937z
                r7.m96651e(r2)
                gt0.h$h r7 = gt0.InterfaceC16186h.h.f61490b
                r2 = 0
                r6.f87935x = r2
                r6.f87934w = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L51
            L50:
                return r1
            L51:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kg1.C22454a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kg1.a$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$startFwUpdate$$inlined$flatMapLatest$1", m100430f = "FirmwareUpdateManagerImpl.kt", m100431l = {192, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f87938E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ WhoopFwDevice f87939F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC34941e f87940G;

        /* JADX INFO: renamed from: H */
        Object f87941H;

        /* JADX INFO: renamed from: I */
        Object f87942I;

        /* JADX INFO: renamed from: J */
        boolean f87943J;

        /* JADX INFO: renamed from: K */
        int f87944K;

        /* JADX INFO: renamed from: w */
        int f87945w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f87946x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f87947y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22454a f87948z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, C22454a c22454a, boolean z4, WhoopFwDevice whoopFwDevice, InterfaceC34941e interfaceC34941e) {
            super(3, interfaceC30057d);
            this.f87948z = c22454a;
            this.f87938E = z4;
            this.f87939F = whoopFwDevice;
            this.f87940G = interfaceC34941e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f87948z, this.f87938E, this.f87939F, this.f87940G);
            gVar.f87946x = interfaceC13062m;
            gVar.f87947y = bool;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
        
            if (r6.m96648a(r7, r8, r11) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00d8, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, r5, r11) == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kg1.C22454a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kg1.a$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$startFwUpdate$1", m100430f = "FirmwareUpdateManagerImpl.kt", m100431l = {92, 92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ WhoopFwDevice f87949E;

        /* JADX INFO: renamed from: w */
        Object f87950w;

        /* JADX INFO: renamed from: x */
        int f87951x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f87952y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87949E = whoopFwDevice;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C22454a.this.new h(this.f87949E, interfaceC30057d);
            hVar.f87952y = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f87952y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f87951x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4a
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f87950w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3d
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                kg1.a r7 = kg1.C22454a.this
                sg1.a r7 = kg1.C22454a.m64836j(r7)
                com.whoop.connectivityCore.firmware.models.WhoopFwDevice r2 = r6.f87949E
                r6.f87952y = r5
                r6.f87950w = r0
                r6.f87951x = r4
                java.lang.Object r7 = r7.mo84252i(r2, r6)
                if (r7 != r1) goto L3d
                goto L49
            L3d:
                r6.f87952y = r5
                r6.f87950w = r5
                r6.f87951x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L4a
            L49:
                return r1
            L4a:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kg1.C22454a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kg1.a$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$startFwUpdate$2$1", m100430f = "FirmwareUpdateManagerImpl.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lgt0/h;", "it", "Ll83/a0;", "<anonymous>", "(Lgt0/h;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f87954E;

        /* JADX INFO: renamed from: w */
        int f87955w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f87956x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ WhoopFwDevice f87958z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(WhoopFwDevice whoopFwDevice, boolean z4, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87958z = whoopFwDevice;
            this.f87954E = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C22454a.this.new i(this.f87958z, this.f87954E, interfaceC30057d);
            iVar.f87956x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16186h interfaceC16186h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC16186h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC16186h interfaceC16186h = (InterfaceC16186h) this.f87956x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87955w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22454a c22454a = C22454a.this;
                WhoopFwDevice whoopFwDevice = this.f87958z;
                boolean z4 = this.f87954E;
                this.f87956x = null;
                this.f87955w = 1;
                if (c22454a.m64842p(whoopFwDevice, interfaceC16186h, z4, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kg1.a$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl", m100430f = "FirmwareUpdateManagerImpl.kt", m100431l = {113, 119, 121, 126, 127, 128, 131}, m100432m = "updateStateMachine", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f87959E;

        /* JADX INFO: renamed from: F */
        int f87960F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f87961G;

        /* JADX INFO: renamed from: I */
        int f87963I;

        /* JADX INFO: renamed from: w */
        Object f87964w;

        /* JADX INFO: renamed from: x */
        Object f87965x;

        /* JADX INFO: renamed from: y */
        Object f87966y;

        /* JADX INFO: renamed from: z */
        boolean f87967z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f87961G = obj;
            this.f87963I |= Integer.MIN_VALUE;
            return C22454a.this.m64842p(null, null, false, this);
        }
    }

    public C22454a(InterfaceC34116n logger, C31387c stateMachine, InterfaceC32449a firmwareRepo, C34942f firmwareUpdateStrategyFactory, InterfaceC16182d firmwareAnalyticsHelper, Clock clock, InterfaceC2994c0 coroutineScope, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(stateMachine, "stateMachine");
        AbstractC22676k.m65750j(firmwareRepo, "firmwareRepo");
        AbstractC22676k.m65750j(firmwareUpdateStrategyFactory, "firmwareUpdateStrategyFactory");
        AbstractC22676k.m65750j(firmwareAnalyticsHelper, "firmwareAnalyticsHelper");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.logger = logger;
        this.stateMachine = stateMachine;
        this.firmwareRepo = firmwareRepo;
        this.firmwareUpdateStrategyFactory = firmwareUpdateStrategyFactory;
        this.firmwareAnalyticsHelper = firmwareAnalyticsHelper;
        this.clock = clock;
        this.coroutineScope = coroutineScope;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final Object m64840n(WhoopFwDevice whoopFwDevice, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo84247d = this.firmwareRepo.mo84247d(whoopFwDevice, interfaceC30057d);
        return objMo84247d == EnumC31071a.f128113w ? objMo84247d : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m64841o(WhoopFwDevice device, boolean userAcceptanceRequired) {
        this.logger.mo85216g("Starting firmware update for device: " + device.getDeviceName(), new AbstractC30556a.a[0]);
        return AbstractC13091v.m36590P(new C13084s1(new h(device, null)), new g(null, this, userAcceptanceRequired, device, this.firmwareUpdateStrategyFactory.m110372a(device)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v23, types: [int] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX INFO: renamed from: p */
    public final Object m64842p(WhoopFwDevice whoopFwDevice, InterfaceC16186h interfaceC16186h, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        j jVar;
        boolean z13;
        ?? r14;
        long duration;
        boolean z14;
        WhoopFwDevice whoopFwDevice2;
        ?? r10;
        C31387c c31387c;
        InterfaceC16186h.h hVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f87963I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f87963I = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object obj = jVar.f87961G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f87963I;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i14) {
            case 0:
                AbstractC34132o.m107864I(obj);
                z13 = !z4;
                if (interfaceC16186h instanceof InterfaceC16186h.g) {
                    InterfaceC16186h.g gVarM45735b = InterfaceC16186h.g.m45735b((InterfaceC16186h.g) interfaceC16186h, 0, z13, 1, null);
                    C31387c c31387c2 = this.stateMachine;
                    jVar.f87964w = null;
                    jVar.f87965x = null;
                    jVar.f87966y = null;
                    jVar.f87967z = z4;
                    jVar.f87959E = z13 ? 1 : 0;
                    jVar.f87963I = 1;
                    if (c31387c2.m96648a(whoopFwDevice, gVarM45735b, jVar) != enumC31071a) {
                        return c23454a0;
                    }
                } else if (interfaceC16186h instanceof InterfaceC16186h.b) {
                    int iM96652f = z4 ? 0 : this.stateMachine.m96652f(whoopFwDevice);
                    if (iM96652f >= 2) {
                        C31387c c31387c3 = this.stateMachine;
                        InterfaceC16186h.b bVar = new InterfaceC16186h.b(AbstractC16184f.d.f61472b, z13);
                        jVar.f87964w = null;
                        jVar.f87965x = null;
                        jVar.f87967z = z4;
                        jVar.f87959E = z13 ? 1 : 0;
                        jVar.f87960F = iM96652f;
                        jVar.f87963I = 2;
                        if (c31387c3.m96648a(whoopFwDevice, bVar, jVar) != enumC31071a) {
                            return c23454a0;
                        }
                    } else {
                        C31387c c31387c4 = this.stateMachine;
                        InterfaceC16186h.b bVarM45729b = InterfaceC16186h.b.m45729b((InterfaceC16186h.b) interfaceC16186h, null, z13, 1, null);
                        jVar.f87964w = null;
                        jVar.f87965x = null;
                        jVar.f87967z = z4;
                        jVar.f87959E = z13 ? 1 : 0;
                        jVar.f87960F = iM96652f;
                        jVar.f87963I = 3;
                        if (c31387c4.m96648a(whoopFwDevice, bVarM45729b, jVar) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                } else if (interfaceC16186h instanceof InterfaceC16186h.e) {
                    C31387c c31387c5 = this.stateMachine;
                    jVar.f87964w = whoopFwDevice;
                    jVar.f87965x = null;
                    jVar.f87967z = z4;
                    jVar.f87959E = z13 ? 1 : 0;
                    jVar.f87963I = 4;
                    if (c31387c5.m96648a(whoopFwDevice, interfaceC16186h, jVar) != enumC31071a) {
                        r14 = z13;
                        Duration.Companion companion = Duration.INSTANCE;
                        duration = DurationKt.toDuration(15, DurationUnit.SECONDS);
                        jVar.f87964w = whoopFwDevice;
                        jVar.f87965x = null;
                        jVar.f87967z = z4;
                        jVar.f87959E = r14;
                        jVar.f87963I = 5;
                        if (AbstractC3034m0.m8783c(duration, jVar) != enumC31071a) {
                            z14 = z4;
                            whoopFwDevice2 = whoopFwDevice;
                            r10 = r14;
                            c31387c = this.stateMachine;
                            hVar = InterfaceC16186h.h.f61490b;
                            jVar.f87964w = null;
                            jVar.f87965x = null;
                            jVar.f87967z = z14;
                            jVar.f87959E = r10;
                            jVar.f87963I = 6;
                            if (c31387c.m96648a(whoopFwDevice2, hVar, jVar) != enumC31071a) {
                                return c23454a0;
                            }
                        }
                    }
                } else {
                    C31387c c31387c6 = this.stateMachine;
                    jVar.f87964w = null;
                    jVar.f87965x = null;
                    jVar.f87967z = z4;
                    jVar.f87959E = z13 ? 1 : 0;
                    jVar.f87963I = 7;
                    if (c31387c6.m96648a(whoopFwDevice, interfaceC16186h, jVar) != enumC31071a) {
                        return c23454a0;
                    }
                }
                r14 = z13;
                return enumC31071a;
            case 1:
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 2:
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 3:
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 4:
                int i15 = jVar.f87959E;
                z4 = jVar.f87967z;
                WhoopFwDevice whoopFwDevice3 = (WhoopFwDevice) jVar.f87964w;
                AbstractC34132o.m107864I(obj);
                r14 = i15;
                whoopFwDevice = whoopFwDevice3;
                r14 = z13;
                Duration.Companion companion2 = Duration.INSTANCE;
                duration = DurationKt.toDuration(15, DurationUnit.SECONDS);
                jVar.f87964w = whoopFwDevice;
                jVar.f87965x = null;
                jVar.f87967z = z4;
                jVar.f87959E = r14;
                jVar.f87963I = 5;
                if (AbstractC3034m0.m8783c(duration, jVar) != enumC31071a) {
                    z14 = z4;
                    whoopFwDevice2 = whoopFwDevice;
                    r10 = r14;
                    c31387c = this.stateMachine;
                    hVar = InterfaceC16186h.h.f61490b;
                    jVar.f87964w = null;
                    jVar.f87965x = null;
                    jVar.f87967z = z14;
                    jVar.f87959E = r10;
                    jVar.f87963I = 6;
                    if (c31387c.m96648a(whoopFwDevice2, hVar, jVar) != enumC31071a) {
                        return c23454a0;
                    }
                }
                r14 = z13;
                return enumC31071a;
            case 5:
                int i16 = jVar.f87959E;
                z14 = jVar.f87967z;
                whoopFwDevice2 = (WhoopFwDevice) jVar.f87964w;
                AbstractC34132o.m107864I(obj);
                r10 = i16;
                c31387c = this.stateMachine;
                hVar = InterfaceC16186h.h.f61490b;
                jVar.f87964w = null;
                jVar.f87965x = null;
                jVar.f87967z = z14;
                jVar.f87959E = r10;
                jVar.f87963I = 6;
                if (c31387c.m96648a(whoopFwDevice2, hVar, jVar) != enumC31071a) {
                    return c23454a0;
                }
                r14 = z13;
                return enumC31071a;
            case 6:
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 7:
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // rg1.InterfaceC31386b
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo64843a(WhoopFwDevice device, boolean userAcceptanceRequired) {
        AbstractC22676k.m65750j(device, "device");
        return new e(m64841o(device, userAcceptanceRequired), this, this.clock.millis(), userAcceptanceRequired, device);
    }

    @Override // rg1.InterfaceC31386b
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo64844b(WhoopFwDevice device) {
        AbstractC22676k.m65750j(device, "device");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(device, null), 3);
        return this.stateMachine.m96649b(device);
    }

    @Override // rg1.InterfaceC31386b
    /* JADX INFO: renamed from: c */
    public InterfaceC13058l mo64845c(WhoopFwDevice device) {
        AbstractC22676k.m65750j(device, "device");
        return new C13084s1(new f(device, null));
    }

    @Override // rg1.InterfaceC31386b
    /* JADX INFO: renamed from: d */
    public InterfaceC13037f2 mo64846d(WhoopFwDevice device) {
        AbstractC22676k.m65750j(device, "device");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(device, this.stateMachine.m96649b(device), null), 3);
        return this.stateMachine.m96649b(device);
    }

    @Override // rg1.InterfaceC31386b
    /* JADX INFO: renamed from: e */
    public InterfaceC13058l mo64847e(WhoopFwDevice device) {
        AbstractC22676k.m65750j(device, "device");
        return new C13084s1(new b(device, null));
    }
}
