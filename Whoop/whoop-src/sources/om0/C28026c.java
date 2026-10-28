package om0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.cache.api.prefetch.PrefetchEntry;
import com.whoop.cache.api.prefetch.PrefetchList;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.AbstractC25267u;
import mm0.InterfaceC25682a;
import nm0.C26830a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import u02.C34387c;
import vm0.InterfaceC36149g;
import xm0.C38458b;

/* JADX INFO: renamed from: om0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\"\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0082@¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Lom0/c;", "", "Lmm0/a;", "cache", "Lxm0/b;", "cacheUpdater", "Lnm0/a;", "apiClientRequester", "Lsr2/y;", "urlProvider", "Lvm0/g;", "cacheReporter", "Lbc3/c0;", "applicationScope", "Lq83/j;", "ioContext", "Ljava/time/Clock;", "clock", "<init>", "(Lmm0/a;Lxm0/b;Lnm0/a;Lsr2/y;Lvm0/g;Lbc3/c0;Lq83/j;Ljava/time/Clock;)V", "Lu02/c;", "apiClient", "(Lmm0/a;Lxm0/b;Lu02/c;Lsr2/y;Lvm0/g;Lbc3/c0;)V", "Lcom/whoop/cache/api/prefetch/PrefetchEntry;", "prefetchEntry", "", "forcePrefetch", "Ll83/a0;", "e", "(Lcom/whoop/cache/api/prefetch/PrefetchEntry;ZLq83/d;)Ljava/lang/Object;", "", "uri", "", "refreshOnMaxCacheAgeMillis", "d", "(Ljava/lang/String;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/cache/api/prefetch/PrefetchList;", "prefetchList", "f", "(Lcom/whoop/cache/api/prefetch/PrefetchList;Z)V", "a", "Lmm0/a;", "b", "Lxm0/b;", "c", "Lnm0/a;", "Lsr2/y;", "Lvm0/g;", "Lbc3/c0;", "g", "Lq83/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/time/Clock;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28026c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25682a cache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26830a apiClientRequester;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC36149g cacheReporter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationScope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: om0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.api.prefetch.Prefetcher", m100430f = "Prefetcher.kt", m100431l = {87, 88}, m100432m = "isCachedAndFresh", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f113068E;

        /* JADX INFO: renamed from: w */
        Object f113069w;

        /* JADX INFO: renamed from: x */
        Object f113070x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113071y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113071y = obj;
            this.f113068E |= Integer.MIN_VALUE;
            return C28026c.this.m84522d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: om0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.cache.api.prefetch.Prefetcher$prefetch$1", m100430f = "Prefetcher.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C28026c f113073E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f113074F;

        /* JADX INFO: renamed from: w */
        Object f113075w;

        /* JADX INFO: renamed from: x */
        int f113076x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f113077y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ PrefetchList f113078z;

        /* JADX INFO: renamed from: om0.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.cache.api.prefetch.Prefetcher$prefetch$1$entryDeferreds$1$1", m100430f = "Prefetcher.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f113079w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28026c f113080x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ PrefetchEntry f113081y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ boolean f113082z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C28026c c28026c, PrefetchEntry prefetchEntry, boolean z4, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f113080x = c28026c;
                this.f113081y = prefetchEntry;
                this.f113082z = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f113080x, this.f113081y, this.f113082z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f113079w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28026c c28026c = this.f113080x;
                    PrefetchEntry prefetchEntry = this.f113081y;
                    boolean z4 = this.f113082z;
                    this.f113079w = 1;
                    if (c28026c.m84523e(prefetchEntry, z4, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PrefetchList prefetchList, C28026c c28026c, boolean z4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113078z = prefetchList;
            this.f113073E = c28026c;
            this.f113074F = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f113078z, this.f113073E, this.f113074F, interfaceC30057d);
            bVar.f113077y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f113077y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113076x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                List<PrefetchEntry> entries = this.f113078z.getEntries();
                C28026c c28026c = this.f113073E;
                boolean z4 = this.f113074F;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(entries, 10));
                Iterator<T> it = entries.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC3006f0.m8711e(interfaceC2994c0, c28026c.ioContext, new a(c28026c, (PrefetchEntry) it.next(), z4, null), 2));
                }
                this.f113077y = null;
                this.f113075w = null;
                this.f113076x = 1;
                if (AbstractC3006f0.m8712f(arrayList, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: om0.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.cache.api.prefetch.Prefetcher", m100430f = "Prefetcher.kt", m100431l = {63, 71, 76}, m100432m = "prefetch", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f113083E;

        /* JADX INFO: renamed from: F */
        Object f113084F;

        /* JADX INFO: renamed from: G */
        boolean f113085G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f113086H;

        /* JADX INFO: renamed from: J */
        int f113088J;

        /* JADX INFO: renamed from: w */
        Object f113089w;

        /* JADX INFO: renamed from: x */
        Object f113090x;

        /* JADX INFO: renamed from: y */
        Object f113091y;

        /* JADX INFO: renamed from: z */
        Object f113092z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113086H = obj;
            this.f113088J |= Integer.MIN_VALUE;
            return C28026c.this.m84523e(null, false, this);
        }
    }

    public C28026c(InterfaceC25682a cache, C38458b cacheUpdater, C26830a apiClientRequester, AbstractC32943y urlProvider, InterfaceC36149g cacheReporter, InterfaceC2994c0 applicationScope, InterfaceC30063j ioContext, Clock clock) {
        AbstractC22676k.m65750j(cache, "cache");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(apiClientRequester, "apiClientRequester");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(cacheReporter, "cacheReporter");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(clock, "clock");
        this.cache = cache;
        this.cacheUpdater = cacheUpdater;
        this.apiClientRequester = apiClientRequester;
        this.urlProvider = urlProvider;
        this.cacheReporter = cacheReporter;
        this.applicationScope = applicationScope;
        this.ioContext = ioContext;
        this.clock = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84522d(java.lang.String r6, java.lang.Long r7, q83.InterfaceC30057d<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof om0.C28026c.a
            if (r0 == 0) goto L13
            r0 = r8
            om0.c$a r0 = (om0.C28026c.a) r0
            int r1 = r0.f113068E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113068E = r1
            goto L18
        L13:
            om0.c$a r0 = new om0.c$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f113071y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f113068E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f113070x
            r7 = r6
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r6 = r0.f113069w
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L6c
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.f113070x
            java.lang.Long r6 = (java.lang.Long) r6
            java.lang.Object r6 = r0.f113069w
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r8)
            return r8
        L47:
            p505ts.AbstractC34132o.m107864I(r8)
            r8 = 0
            if (r7 != 0) goto L5d
            mm0.a r7 = r5.cache
            r0.f113069w = r8
            r0.f113070x = r8
            r0.f113068E = r4
            java.lang.Object r6 = r7.mo75622d(r6, r0)
            if (r6 != r1) goto L5c
            goto L6b
        L5c:
            return r6
        L5d:
            mm0.a r2 = r5.cache
            r0.f113069w = r8
            r0.f113070x = r7
            r0.f113068E = r3
            java.lang.Object r8 = r2.mo75625h(r6, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L8a
            long r0 = r8.longValue()
            java.time.Clock r6 = r5.clock
            long r2 = r6.millis()
            long r2 = r2 - r0
            long r6 = r7.longValue()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L84
            goto L85
        L84:
            r4 = 0
        L85:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L8a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om0.C28026c.m84522d(java.lang.String, java.lang.Long, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0110  */
    /* JADX WARN: Code duplicated, block: B:36:0x011a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0122  */
    /* JADX WARN: Code duplicated, block: B:40:0x0126  */
    /* JADX WARN: Code duplicated, block: B:45:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0144, code lost:
    
        if (r2.m123249c(r14, r12, r0) == r1) goto L42;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84523e(com.whoop.cache.api.prefetch.PrefetchEntry r12, boolean r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: om0.C28026c.m84523e(com.whoop.cache.api.prefetch.PrefetchEntry, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m84524g(C28026c c28026c, PrefetchList prefetchList, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        c28026c.m84525f(prefetchList, z4);
    }

    /* JADX INFO: renamed from: f */
    public final void m84525f(PrefetchList prefetchList, boolean forcePrefetch) {
        AbstractC22676k.m65750j(prefetchList, "prefetchList");
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new b(prefetchList, this, forcePrefetch, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C28026c(InterfaceC25682a interfaceC25682a, C38458b c38458b, C26830a c26830a, AbstractC32943y abstractC32943y, InterfaceC36149g interfaceC36149g, InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j, Clock clock, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        if ((i13 & 128) != 0) {
            Clock clockSystemUTC = Clock.systemUTC();
            AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
            clock2 = clockSystemUTC;
        } else {
            clock2 = clock;
        }
        this(interfaceC25682a, c38458b, c26830a, abstractC32943y, interfaceC36149g, interfaceC2994c0, interfaceC30063j, clock2);
    }

    public C28026c(InterfaceC25682a cache, C38458b cacheUpdater, C34387c apiClient, AbstractC32943y urlProvider, InterfaceC36149g cacheReporter, InterfaceC2994c0 applicationScope) {
        AbstractC22676k.m65750j(cache, "cache");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(cacheReporter, "cacheReporter");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        C26830a c26830a = new C26830a(apiClient);
        C22365e c22365e = AbstractC3050q0.f12077a;
        this(cache, cacheUpdater, c26830a, urlProvider, cacheReporter, applicationScope, ExecutorC22364d.f87316w, null, 128, null);
    }
}
