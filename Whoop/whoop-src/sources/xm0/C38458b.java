package xm0;

import java.time.Clock;
import mm0.InterfaceC25682a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import vm0.InterfaceC36149g;

/* JADX INFO: renamed from: xm0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lxm0/b;", "", "Lsr2/y;", "baseUrlProvider", "Lmm0/a;", "cache", "Lvm0/g;", "cacheReporter", "Ljava/time/Clock;", "clock", "<init>", "(Lsr2/y;Lmm0/a;Lvm0/g;Ljava/time/Clock;)V", "T", "Lne3/l;", "data", "Lnm0/c;", "cacheableRequest", "Ll83/a0;", "c", "(Lne3/l;Lnm0/c;Lq83/d;)Ljava/lang/Object;", "", "uri", "b", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "scope", "a", "Lsr2/y;", "Lmm0/a;", "Lvm0/g;", "d", "Ljava/time/Clock;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38458b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC32943y baseUrlProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25682a cache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC36149g cacheReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: xm0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.stream.api.CacheUpdater", m100430f = "CacheUpdater.kt", m100431l = {42, 44}, m100432m = "evictWithScope", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f164684w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f164685x;

        /* JADX INFO: renamed from: z */
        int f164687z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164685x = obj;
            this.f164687z |= Integer.MIN_VALUE;
            return C38458b.this.m123247a(null, this);
        }
    }

    /* JADX INFO: renamed from: xm0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.cache.stream.api.CacheUpdater", m100430f = "CacheUpdater.kt", m100431l = {36, 38}, m100432m = "evictWithUri", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f164688w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f164689x;

        /* JADX INFO: renamed from: z */
        int f164691z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164689x = obj;
            this.f164691z |= Integer.MIN_VALUE;
            return C38458b.this.m123248b(null, this);
        }
    }

    /* JADX INFO: renamed from: xm0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.cache.stream.api.CacheUpdater", m100430f = "CacheUpdater.kt", m100431l = {30, 32}, m100432m = "updateCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f164693F;

        /* JADX INFO: renamed from: w */
        Object f164694w;

        /* JADX INFO: renamed from: x */
        Object f164695x;

        /* JADX INFO: renamed from: y */
        Object f164696y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f164697z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f164697z = obj;
            this.f164693F |= Integer.MIN_VALUE;
            return C38458b.this.m123249c(null, null, this);
        }
    }

    public C38458b(AbstractC32943y baseUrlProvider, InterfaceC25682a cache, InterfaceC36149g cacheReporter, Clock clock) {
        AbstractC22676k.m65750j(baseUrlProvider, "baseUrlProvider");
        AbstractC22676k.m65750j(cache, "cache");
        AbstractC22676k.m65750j(cacheReporter, "cacheReporter");
        AbstractC22676k.m65750j(clock, "clock");
        this.baseUrlProvider = baseUrlProvider;
        this.cache = cache;
        this.cacheReporter = cacheReporter;
        this.clock = clock;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r7.mo114991d(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m123247a(java.lang.String r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xm0.C38458b.a
            if (r0 == 0) goto L13
            r0 = r8
            xm0.b$a r0 = (xm0.C38458b.a) r0
            int r1 = r0.f164687z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f164687z = r1
            goto L18
        L13:
            xm0.b$a r0 = new xm0.b$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f164685x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f164687z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.f164684w
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L63
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f164684w
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4f
        L3f:
            p505ts.AbstractC34132o.m107864I(r8)
            mm0.a r8 = r6.cache
            r0.f164684w = r3
            r0.f164687z = r5
            java.lang.Object r7 = r8.mo75619a(r7, r0)
            if (r7 != r1) goto L4f
            goto L62
        L4f:
            vm0.g r7 = r6.cacheReporter
            vm0.f r8 = vm0.EnumC36148f.EVICT_SCOPE
            r7.mo114993f(r8)
            vm0.g r7 = r6.cacheReporter
            r0.f164684w = r3
            r0.f164687z = r4
            java.lang.Object r7 = r7.mo114991d(r0)
            if (r7 != r1) goto L63
        L62:
            return r1
        L63:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xm0.C38458b.m123247a(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r7.mo114991d(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m123248b(java.lang.String r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xm0.C38458b.b
            if (r0 == 0) goto L13
            r0 = r8
            xm0.b$b r0 = (xm0.C38458b.b) r0
            int r1 = r0.f164691z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f164691z = r1
            goto L18
        L13:
            xm0.b$b r0 = new xm0.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f164689x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f164691z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.f164688w
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L63
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f164688w
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4f
        L3f:
            p505ts.AbstractC34132o.m107864I(r8)
            mm0.a r8 = r6.cache
            r0.f164688w = r3
            r0.f164691z = r5
            java.lang.Object r7 = r8.mo75621c(r7, r0)
            if (r7 != r1) goto L4f
            goto L62
        L4f:
            vm0.g r7 = r6.cacheReporter
            vm0.f r8 = vm0.EnumC36148f.EVICT_URI
            r7.mo114993f(r8)
            vm0.g r7 = r6.cacheReporter
            r0.f164688w = r3
            r0.f164691z = r4
            java.lang.Object r7 = r7.mo114991d(r0)
            if (r7 != r1) goto L63
        L62:
            return r1
        L63:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xm0.C38458b.m123248b(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (r13.mo114991d(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object m123249c(ne3.C26624l r13, nm0.C26832c<T> r14, q83.InterfaceC30057d<? super l83.C23454a0> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof xm0.C38458b.c
            if (r0 == 0) goto L13
            r0 = r15
            xm0.b$c r0 = (xm0.C38458b.c) r0
            int r1 = r0.f164693F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f164693F = r1
            goto L18
        L13:
            xm0.b$c r0 = new xm0.b$c
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f164697z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f164693F
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r13 = r0.f164696y
            mm0.b r13 = (mm0.C25683b) r13
            java.lang.Object r13 = r0.f164695x
            nm0.c r13 = (nm0.C26832c) r13
            java.lang.Object r13 = r0.f164694w
            ne3.l r13 = (ne3.C26624l) r13
            p505ts.AbstractC34132o.m107864I(r15)
            goto L91
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3f:
            java.lang.Object r13 = r0.f164696y
            mm0.b r13 = (mm0.C25683b) r13
            java.lang.Object r13 = r0.f164695x
            nm0.c r13 = (nm0.C26832c) r13
            java.lang.Object r13 = r0.f164694w
            ne3.l r13 = (ne3.C26624l) r13
            p505ts.AbstractC34132o.m107864I(r15)
            goto L79
        L4f:
            p505ts.AbstractC34132o.m107864I(r15)
            mm0.b r6 = new mm0.b
            sr2.y r15 = r12.baseUrlProvider
            java.lang.String r7 = r14.m80077d(r15)
            java.time.Clock r15 = r12.clock
            long r9 = r15.millis()
            java.util.Set r11 = r14.m80075b()
            r8 = r13
            r6.<init>(r7, r8, r9, r11)
            mm0.a r13 = r12.cache
            r0.f164694w = r5
            r0.f164695x = r5
            r0.f164696y = r5
            r0.f164693F = r4
            java.lang.Object r13 = r13.mo75624g(r6, r0)
            if (r13 != r1) goto L79
            goto L90
        L79:
            vm0.g r13 = r12.cacheReporter
            vm0.f r14 = vm0.EnumC36148f.UPDATE
            r13.mo114993f(r14)
            vm0.g r13 = r12.cacheReporter
            r0.f164694w = r5
            r0.f164695x = r5
            r0.f164696y = r5
            r0.f164693F = r3
            java.lang.Object r13 = r13.mo114991d(r0)
            if (r13 != r1) goto L91
        L90:
            return r1
        L91:
            l83.a0 r13 = l83.C23454a0.f92919a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: xm0.C38458b.m123249c(ne3.l, nm0.c, q83.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C38458b(AbstractC32943y abstractC32943y, InterfaceC25682a interfaceC25682a, InterfaceC36149g interfaceC36149g, Clock clock, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 8) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(abstractC32943y, interfaceC25682a, interfaceC36149g, clock);
    }
}
