package vu0;

import b12.InterfaceC2286b;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ih0.AbstractC18489d0;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vu0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u001cB)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lvu0/b;", "Lb12/b;", "Ltr2/n;", "logger", "Lci2/b;", "whoopStrapProvider", "Lvu0/a;", "lowBatteryNotificationBuilder", "Lvu0/f;", "streakResolver", "<init>", "(Ltr2/n;Lci2/b;Lvu0/a;Lvu0/f;)V", "", "previousBatteryLevel", "currentBatteryLevel", "", "f", "(BB)J", "Lst0/v;", "e", "(Lq83/d;)Ljava/lang/Object;", "elapsedTime", "", "b", "(BBJ)Z", "", "level", "Lb12/d;", "a", "(ILq83/d;)Ljava/lang/Object;", "Ltr2/n;", "Lci2/b;", "c", "Lvu0/a;", "d", "Lvu0/f;", "g", "()Lst0/v;", "currentStrapGen", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36505b implements InterfaceC2286b {

    /* JADX INFO: renamed from: f */
    public static final int f155945f = 8;

    /* JADX INFO: renamed from: g */
    private static final C36506c f155946g = C36506c.INSTANCE.m117015a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C36504a lowBatteryNotificationBuilder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C36509f streakResolver;

    /* JADX INFO: renamed from: vu0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.lowbattery.LowBatteryNotificationMonitorImpl", m100430f = "LowBatteryNotificationMonitorImpl.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "awaitStrapGen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f155951w;

        /* JADX INFO: renamed from: y */
        int f155953y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155951w = obj;
            this.f155953y |= Integer.MIN_VALUE;
            return C36505b.this.m117010e(this);
        }
    }

    /* JADX INFO: renamed from: vu0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.lowbattery.LowBatteryNotificationMonitorImpl$awaitStrapGen$2", m100430f = "LowBatteryNotificationMonitorImpl.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lst0/v;", "<anonymous>", "(Lbc3/c0;)Lst0/v;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155954w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36505b.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super EnumC32978v> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155954w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4588i c4588i = new C4588i(C36505b.this.whoopStrapProvider.mo14818b(), 2);
                this.f155954w = 1;
                obj = AbstractC13091v.m36575A(c4588i, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return ((InterfaceC21750d) obj).mo24752w0();
        }
    }

    /* JADX INFO: renamed from: vu0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.lowbattery.LowBatteryNotificationMonitorImpl", m100430f = "LowBatteryNotificationMonitorImpl.kt", m100431l = {65, 72}, m100432m = "provideNotificationContent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f155956E;

        /* JADX INFO: renamed from: G */
        int f155958G;

        /* JADX INFO: renamed from: w */
        int f155959w;

        /* JADX INFO: renamed from: x */
        Object f155960x;

        /* JADX INFO: renamed from: y */
        Object f155961y;

        /* JADX INFO: renamed from: z */
        Object f155962z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155956E = obj;
            this.f155958G |= Integer.MIN_VALUE;
            return C36505b.this.mo7149a(0, this);
        }
    }

    public C36505b(InterfaceC34116n logger, InterfaceC4733b whoopStrapProvider, C36504a lowBatteryNotificationBuilder, C36509f streakResolver) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(lowBatteryNotificationBuilder, "lowBatteryNotificationBuilder");
        AbstractC22676k.m65750j(streakResolver, "streakResolver");
        this.logger = logger;
        this.whoopStrapProvider = whoopStrapProvider;
        this.lowBatteryNotificationBuilder = lowBatteryNotificationBuilder;
        this.streakResolver = streakResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m117010e(InterfaceC30057d<? super EnumC32978v> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f155953y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f155953y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM8750d = bVar.f155951w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f155953y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8750d);
            c cVar = new c(null);
            bVar.f155953y = 1;
            objM8750d = AbstractC3028k2.m8750d(1000L, cVar, bVar);
            if (objM8750d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8750d);
        }
        if (((EnumC32978v) objM8750d) == null) {
            this.logger.mo85226q("Timed out after 1000ms waiting for strap — building content with null strapGen", new AbstractC30556a.a[0]);
        }
        return objM8750d;
    }

    /* JADX INFO: renamed from: f */
    private final long m117011f(byte previousBatteryLevel, byte currentBatteryLevel) {
        C36506c c36506c = f155946g;
        return c36506c.m117013a(currentBatteryLevel) == c36506c.m117013a(previousBatteryLevel) ? 10800000L : 3600000L;
    }

    /* JADX INFO: renamed from: g */
    private final EnumC32978v m117012g() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        if (interfaceC21750d != null) {
            return interfaceC21750d.mo24752w0();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r10 == r1) goto L25;
     */
    @Override // b12.InterfaceC2286b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7149a(int r9, q83.InterfaceC30057d<? super b12.C2288d> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof vu0.C36505b.d
            if (r0 == 0) goto L13
            r0 = r10
            vu0.b$d r0 = (vu0.C36505b.d) r0
            int r1 = r0.f155958G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f155958G = r1
            goto L18
        L13:
            vu0.b$d r0 = new vu0.b$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f155956E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f155958G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.f155962z
            b12.d r9 = (b12.C2288d) r9
            java.lang.Object r9 = r0.f155961y
            st0.v r9 = (st0.EnumC32978v) r9
            java.lang.Object r9 = r0.f155960x
            b12.c r9 = (b12.EnumC2287c) r9
            p505ts.AbstractC34132o.m107864I(r10)
            return r10
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            int r9 = r0.f155959w
            java.lang.Object r2 = r0.f155960x
            b12.c r2 = (b12.EnumC2287c) r2
            p505ts.AbstractC34132o.m107864I(r10)
            goto L65
        L48:
            p505ts.AbstractC34132o.m107864I(r10)
            vu0.c r10 = vu0.C36505b.f155946g
            byte r2 = (byte) r9
            b12.c r2 = r10.m117013a(r2)
            st0.v r10 = r8.m117012g()
            if (r10 != 0) goto L67
            r0.f155960x = r2
            r0.f155959w = r9
            r0.f155958G = r4
            java.lang.Object r10 = r8.m117010e(r0)
            if (r10 != r1) goto L65
            goto L91
        L65:
            st0.v r10 = (st0.EnumC32978v) r10
        L67:
            b12.d r4 = new b12.d
            vu0.a r5 = r8.lowBatteryNotificationBuilder
            java.lang.String r5 = r5.m117004c(r2)
            vu0.a r6 = r8.lowBatteryNotificationBuilder
            java.lang.String r6 = r6.m117003b(r9, r10)
            vu0.a r7 = r8.lowBatteryNotificationBuilder
            java.lang.String r7 = r7.m117002a(r9, r10)
            r4.<init>(r5, r6, r7)
            vu0.f r5 = r8.streakResolver
            r6 = 0
            r0.f155960x = r6
            r0.f155961y = r6
            r0.f155962z = r6
            r0.f155959w = r9
            r0.f155958G = r3
            java.lang.Object r9 = r5.m117023c(r2, r10, r4, r0)
            if (r9 != r1) goto L92
        L91:
            return r1
        L92:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vu0.C36505b.mo7149a(int, q83.d):java.lang.Object");
    }

    @Override // b12.InterfaceC2286b
    /* JADX INFO: renamed from: b */
    public boolean mo7150b(byte previousBatteryLevel, byte currentBatteryLevel, long elapsedTime) {
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(previousBatteryLevel, currentBatteryLevel, "canShowNotification called: previous=", ", current=", ", elapsed=");
        sbM30465s.append(elapsedTime);
        interfaceC34116n.mo85228t(sbM30465s.toString(), new AbstractC30556a.a[0]);
        C36506c c36506c = f155946g;
        if (currentBatteryLevel > c36506c.getHigh()) {
            this.logger.mo85228t(AbstractC25012a.m73372e(currentBatteryLevel, c36506c.getHigh(), "Battery level ", " is above high threshold ", ", no notification needed."), new AbstractC30556a.a[0]);
            return false;
        }
        long jM117011f = m117011f(previousBatteryLevel, currentBatteryLevel);
        InterfaceC34116n interfaceC34116n2 = this.logger;
        long j7 = 60;
        long j13 = ((jM117011f / ((long) 1000)) / j7) / j7;
        if (elapsedTime >= jM117011f) {
            interfaceC34116n2.mo85228t(AbstractC31061c.m95636l(j13, "been longer than threshold: ", " hours"), new AbstractC30556a.a[0]);
        } else {
            interfaceC34116n2.mo85228t(j13 + " hour threshold not met", new AbstractC30556a.a[0]);
        }
        return elapsedTime >= jM117011f;
    }

    public /* synthetic */ C36505b(InterfaceC34116n interfaceC34116n, InterfaceC4733b interfaceC4733b, C36504a c36504a, C36509f c36509f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LowBatteryMonitor") : interfaceC34116n, interfaceC4733b, c36504a, c36509f);
    }
}
