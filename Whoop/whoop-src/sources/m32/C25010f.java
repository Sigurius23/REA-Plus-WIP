package m32;

import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import java.time.Clock;
import java.time.Instant;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: m32.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lm32/f;", "", "La6/g;", "Lf6/f;", "dataStorePrefs", "Ljava/time/Clock;", "clock", "<init>", "(La6/g;Ljava/time/Clock;)V", "", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "La6/g;", "Ljava/time/Clock;", "c", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25010f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    private static final C14132d f97838d = AbstractC15751g.m44429I("last_check_push_notification_permission");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePrefs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: m32.f$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lm32/f$a;", "", "<init>", "()V", "Lf6/d;", "", "PREF_LAST_REQUEST_TIME", "Lf6/d;", "a", "()Lf6/d;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C14132d m73364a() {
            return C25010f.f97838d;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: m32.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.permissions.PushNotificationPermissionRequestValidator", m100430f = "PushNotificationPermissionRequestValidator.kt", m100431l = {26, 32}, m100432m = "shouldRequestForPushNotificationPermission", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f97842F;

        /* JADX INFO: renamed from: w */
        long f97843w;

        /* JADX INFO: renamed from: x */
        long f97844x;

        /* JADX INFO: renamed from: y */
        Object f97845y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f97846z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f97846z = obj;
            this.f97842F |= Integer.MIN_VALUE;
            return C25010f.this.m73363b(this);
        }
    }

    /* JADX INFO: renamed from: m32.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.permissions.PushNotificationPermissionRequestValidator$shouldRequestForPushNotificationPermission$2", m100430f = "PushNotificationPermissionRequestValidator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f97847w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f97848x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Instant f97849y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Instant instant, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f97849y = instant;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f97849y, interfaceC30057d);
            cVar.f97848x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f97848x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f97847w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C25010f.INSTANCE.m73364a(), new Long(this.f97849y.toEpochMilli()));
            return C23454a0.f92919a;
        }
    }

    public C25010f(InterfaceC0422g dataStorePrefs, Clock clock) {
        AbstractC22676k.m65750j(dataStorePrefs, "dataStorePrefs");
        AbstractC22676k.m65750j(clock, "clock");
        this.dataStorePrefs = dataStorePrefs;
        this.clock = clock;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (hg3.AbstractC17269i.m48861G(r2, r8, r0) == r1) goto L27;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m73363b(q83.InterfaceC30057d<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof m32.C25010f.b
            if (r0 == 0) goto L13
            r0 = r11
            m32.f$b r0 = (m32.C25010f.b) r0
            int r1 = r0.f97842F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97842F = r1
            goto L18
        L13:
            m32.f$b r0 = new m32.f$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f97846z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f97842F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f97845y
            java.time.Instant r0 = (java.time.Instant) r0
            p505ts.AbstractC34132o.m107864I(r11)
            goto L92
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            p505ts.AbstractC34132o.m107864I(r11)
            goto L4c
        L3a:
            p505ts.AbstractC34132o.m107864I(r11)
            a6.g r11 = r10.dataStorePrefs
            ec3.l r11 = r11.getData()
            r0.f97842F = r4
            java.lang.Object r11 = ec3.AbstractC13091v.m36575A(r11, r0)
            if (r11 != r1) goto L4c
            goto L91
        L4c:
            f6.f r11 = (p138f6.AbstractC14134f) r11
            f6.d r2 = m32.C25010f.f97838d
            java.lang.Object r11 = r11.mo40227b(r2)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L5d
            long r4 = r11.longValue()
            goto L63
        L5d:
            java.time.Instant r11 = java.time.Instant.EPOCH
            long r4 = r11.toEpochMilli()
        L63:
            java.time.Clock r11 = r10.clock
            java.time.Instant r11 = java.time.Instant.now(r11)
            java.time.Instant r2 = java.time.Instant.ofEpochMilli(r4)
            java.time.Duration r2 = java.time.Duration.between(r2, r11)
            long r6 = r2.toHours()
            r8 = 24
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto L95
            a6.g r2 = r10.dataStorePrefs
            m32.f$c r8 = new m32.f$c
            r9 = 0
            r8.<init>(r11, r9)
            r0.f97845y = r9
            r0.f97843w = r4
            r0.f97844x = r6
            r0.f97842F = r3
            java.lang.Object r11 = hg3.AbstractC17269i.m48861G(r2, r8, r0)
            if (r11 != r1) goto L92
        L91:
            return r1
        L92:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        L95:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m32.C25010f.m73363b(q83.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C25010f(InterfaceC0422g interfaceC0422g, Clock clock, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            clock = Clock.systemUTC();
            AbstractC22676k.m65749i(clock, "systemUTC(...)");
        }
        this(interfaceC0422g, clock);
    }
}
