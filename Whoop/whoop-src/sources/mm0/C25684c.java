package mm0;

import androidx.health.platform.client.proto.C1533u;
import fy1.C14872h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vm0.C36144b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mm0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001a\u0010\u0013J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lmm0/c;", "Lmm0/a;", "inMemoryCache", "persistentCache", "Lvm0/b;", "events", "Ljava/time/Clock;", "clock", "<init>", "(Lmm0/a;Lmm0/a;Lvm0/b;Ljava/time/Clock;)V", "Lmm0/b;", "entry", "", "j", "(Lmm0/b;)J", "", "uri", "", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ll83/a0;", "g", "(Lmm0/b;Lq83/d;)Ljava/lang/Object;", "scope", "a", "c", "f", "(Lq83/d;)Ljava/lang/Object;", "", "i", "Lmm0/a;", "Lvm0/b;", "Ljava/time/Clock;", "", "e", "Ljava/util/List;", "allLayers", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25684c implements InterfaceC25682a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25682a inMemoryCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25682a persistentCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C36144b events;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<InterfaceC25682a> allLayers;

    /* JADX INFO: renamed from: mm0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.cache.CompositeCache", m100430f = "CompositeCache.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER, 20}, m100432m = "contains", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f101033w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f101034x;

        /* JADX INFO: renamed from: z */
        int f101036z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101034x = obj;
            this.f101036z |= Integer.MIN_VALUE;
            return C25684c.this.mo75622d(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.CompositeCache", m100430f = "CompositeCache.kt", m100431l = {46}, m100432m = "evictWithScope", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f101037E;

        /* JADX INFO: renamed from: F */
        int f101038F;

        /* JADX INFO: renamed from: G */
        int f101039G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f101040H;

        /* JADX INFO: renamed from: J */
        int f101042J;

        /* JADX INFO: renamed from: w */
        Object f101043w;

        /* JADX INFO: renamed from: x */
        Object f101044x;

        /* JADX INFO: renamed from: y */
        Object f101045y;

        /* JADX INFO: renamed from: z */
        Object f101046z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101040H = obj;
            this.f101042J |= Integer.MIN_VALUE;
            return C25684c.this.mo75619a(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.cache.CompositeCache", m100430f = "CompositeCache.kt", m100431l = {50}, m100432m = "evictWithUri", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f101047E;

        /* JADX INFO: renamed from: F */
        int f101048F;

        /* JADX INFO: renamed from: G */
        int f101049G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f101050H;

        /* JADX INFO: renamed from: J */
        int f101052J;

        /* JADX INFO: renamed from: w */
        Object f101053w;

        /* JADX INFO: renamed from: x */
        Object f101054x;

        /* JADX INFO: renamed from: y */
        Object f101055y;

        /* JADX INFO: renamed from: z */
        Object f101056z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101050H = obj;
            this.f101052J |= Integer.MIN_VALUE;
            return C25684c.this.mo75621c(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.cache.CompositeCache", m100430f = "CompositeCache.kt", m100431l = {24, 28, 29}, m100432m = "getEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f101058F;

        /* JADX INFO: renamed from: w */
        Object f101059w;

        /* JADX INFO: renamed from: x */
        Object f101060x;

        /* JADX INFO: renamed from: y */
        int f101061y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f101062z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101062z = obj;
            this.f101058F |= Integer.MIN_VALUE;
            return C25684c.this.mo75620b(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.CompositeCache", m100430f = "CompositeCache.kt", m100431l = {39, 39}, m100432m = "lastUpdated", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f101063w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f101064x;

        /* JADX INFO: renamed from: z */
        int f101066z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101064x = obj;
            this.f101066z |= Integer.MIN_VALUE;
            return C25684c.this.mo75625h(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.c$f */
    @InterfaceC32271e(m100429c = "com.whoop.cache.CompositeCache", m100430f = "CompositeCache.kt", m100431l = {54}, m100432m = "nuke", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f101067E;

        /* JADX INFO: renamed from: F */
        int f101068F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f101069G;

        /* JADX INFO: renamed from: I */
        int f101071I;

        /* JADX INFO: renamed from: w */
        Object f101072w;

        /* JADX INFO: renamed from: x */
        Object f101073x;

        /* JADX INFO: renamed from: y */
        Object f101074y;

        /* JADX INFO: renamed from: z */
        Object f101075z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101069G = obj;
            this.f101071I |= Integer.MIN_VALUE;
            return C25684c.this.mo75623f(this);
        }
    }

    /* JADX INFO: renamed from: mm0.c$g */
    @InterfaceC32271e(m100429c = "com.whoop.cache.CompositeCache", m100430f = "CompositeCache.kt", m100431l = {58}, m100432m = "size", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f101076E;

        /* JADX INFO: renamed from: G */
        int f101078G;

        /* JADX INFO: renamed from: w */
        Object f101079w;

        /* JADX INFO: renamed from: x */
        Object f101080x;

        /* JADX INFO: renamed from: y */
        int f101081y;

        /* JADX INFO: renamed from: z */
        int f101082z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101076E = obj;
            this.f101078G |= Integer.MIN_VALUE;
            return C25684c.this.mo75626i(this);
        }
    }

    /* JADX INFO: renamed from: mm0.c$h */
    @InterfaceC32271e(m100429c = "com.whoop.cache.CompositeCache", m100430f = "CompositeCache.kt", m100431l = {42}, m100432m = "updateEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f101083E;

        /* JADX INFO: renamed from: F */
        int f101084F;

        /* JADX INFO: renamed from: G */
        int f101085G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f101086H;

        /* JADX INFO: renamed from: J */
        int f101088J;

        /* JADX INFO: renamed from: w */
        Object f101089w;

        /* JADX INFO: renamed from: x */
        Object f101090x;

        /* JADX INFO: renamed from: y */
        Object f101091y;

        /* JADX INFO: renamed from: z */
        Object f101092z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101086H = obj;
            this.f101088J |= Integer.MIN_VALUE;
            return C25684c.this.mo75624g(null, this);
        }
    }

    public C25684c(InterfaceC25682a inMemoryCache, InterfaceC25682a persistentCache, C36144b events, Clock clock) {
        AbstractC22676k.m65750j(inMemoryCache, "inMemoryCache");
        AbstractC22676k.m65750j(persistentCache, "persistentCache");
        AbstractC22676k.m65750j(events, "events");
        AbstractC22676k.m65750j(clock, "clock");
        this.inMemoryCache = inMemoryCache;
        this.persistentCache = persistentCache;
        this.events = events;
        this.clock = clock;
        this.allLayers = AbstractC37056f.m118959K(inMemoryCache, persistentCache);
    }

    /* JADX INFO: renamed from: j */
    private final long m75631j(C25683b entry) {
        long jMillis = this.clock.millis() - entry.getLastUpdated();
        if (jMillis < 0) {
            return 0L;
        }
        return jMillis;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: a */
    public Object mo75619a(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        Iterator it;
        int i13;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f101042J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f101042J = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f101040H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f101042J;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            it = this.allLayers.iterator();
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = bVar.f101038F;
            it = (Iterator) bVar.f101045y;
            String str2 = (String) bVar.f101043w;
            AbstractC34132o.m107864I(obj);
            i13 = i16;
            str = str2;
        }
        while (it.hasNext()) {
            InterfaceC25682a interfaceC25682a = (InterfaceC25682a) it.next();
            bVar.f101043w = str;
            bVar.f101044x = null;
            bVar.f101045y = it;
            bVar.f101046z = null;
            bVar.f101037E = null;
            bVar.f101038F = i13;
            bVar.f101039G = 0;
            bVar.f101042J = 1;
            if (interfaceC25682a.mo75619a(str, bVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r9.mo75624g(r8, r0) == r1) goto L32;
     */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75620b(java.lang.String r8, q83.InterfaceC30057d<? super mm0.C25683b> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof mm0.C25684c.d
            if (r0 == 0) goto L13
            r0 = r9
            mm0.c$d r0 = (mm0.C25684c.d) r0
            int r1 = r0.f101058F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f101058F = r1
            goto L18
        L13:
            mm0.c$d r0 = new mm0.c$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f101062z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f101058F
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.f101060x
            mm0.b r8 = (mm0.C25683b) r8
            java.lang.Object r0 = r0.f101059w
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r9)
            goto L97
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.f101059w
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L80
        L46:
            java.lang.Object r8 = r0.f101059w
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L5e
        L4e:
            p505ts.AbstractC34132o.m107864I(r9)
            mm0.a r9 = r7.inMemoryCache
            r0.f101059w = r8
            r0.f101058F = r5
            java.lang.Object r9 = r9.mo75620b(r8, r0)
            if (r9 != r1) goto L5e
            goto L96
        L5e:
            mm0.b r9 = (mm0.C25683b) r9
            if (r9 == 0) goto L73
            vm0.b r8 = r7.events
            vm0.a$b r0 = new vm0.a$b
            vm0.c r1 = vm0.EnumC36145c.MEMORY
            long r2 = r7.m75631j(r9)
            r0.<init>(r1, r2)
            r8.m114975a(r0)
            return r9
        L73:
            mm0.a r9 = r7.persistentCache
            r0.f101059w = r6
            r0.f101058F = r4
            java.lang.Object r9 = r9.mo75620b(r8, r0)
            if (r9 != r1) goto L80
            goto L96
        L80:
            r8 = r9
            mm0.b r8 = (mm0.C25683b) r8
            if (r8 == 0) goto Lab
            mm0.a r9 = r7.inMemoryCache
            r0.f101059w = r6
            r0.f101060x = r8
            r2 = 0
            r0.f101061y = r2
            r0.f101058F = r3
            java.lang.Object r9 = r9.mo75624g(r8, r0)
            if (r9 != r1) goto L97
        L96:
            return r1
        L97:
            vm0.b r9 = r7.events
            vm0.a$b r0 = new vm0.a$b
            vm0.c r1 = vm0.EnumC36145c.PERSISTENT
            long r2 = r7.m75631j(r8)
            r0.<init>(r1, r2)
            r9.m114975a(r0)
            if (r8 != 0) goto Laa
            goto Lab
        Laa:
            return r8
        Lab:
            vm0.b r8 = r7.events
            vm0.a$d r9 = vm0.InterfaceC36143a.d.f154651a
            r8.m114975a(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.C25684c.mo75620b(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: c */
    public Object mo75621c(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        Iterator it;
        int i13;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i14 = cVar.f101052J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f101052J = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f101050H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = cVar.f101052J;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            it = this.allLayers.iterator();
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = cVar.f101048F;
            it = (Iterator) cVar.f101055y;
            String str2 = (String) cVar.f101053w;
            AbstractC34132o.m107864I(obj);
            i13 = i16;
            str = str2;
        }
        while (it.hasNext()) {
            InterfaceC25682a interfaceC25682a = (InterfaceC25682a) it.next();
            cVar.f101053w = str;
            cVar.f101054x = null;
            cVar.f101055y = it;
            cVar.f101056z = null;
            cVar.f101047E = null;
            cVar.f101048F = i13;
            cVar.f101049G = 0;
            cVar.f101052J = 1;
            if (interfaceC25682a.mo75621c(str, cVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: d */
    public Object mo75622d(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f101036z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f101036z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo75622d = aVar.f101034x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f101036z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75622d);
            InterfaceC25682a interfaceC25682a = this.inMemoryCache;
            aVar.f101033w = str;
            aVar.f101036z = 1;
            objMo75622d = interfaceC25682a.mo75622d(str, aVar);
            if (objMo75622d != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo75622d);
            return objMo75622d;
        }
        str = (String) aVar.f101033w;
        AbstractC34132o.m107864I(objMo75622d);
        if (((Boolean) objMo75622d).booleanValue()) {
            return Boolean.TRUE;
        }
        InterfaceC25682a interfaceC25682a2 = this.persistentCache;
        aVar.f101033w = null;
        aVar.f101036z = 2;
        Object objMo75622d2 = interfaceC25682a2.mo75622d(str, aVar);
        return objMo75622d2 == enumC31071a ? enumC31071a : objMo75622d2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: f */
    public Object mo75623f(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        f fVar;
        Iterator it;
        int i13;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i14 = fVar.f101071I;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f101071I = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f101069G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = fVar.f101071I;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            it = this.allLayers.iterator();
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = fVar.f101067E;
            it = (Iterator) fVar.f101073x;
            AbstractC34132o.m107864I(obj);
        }
        while (it.hasNext()) {
            InterfaceC25682a interfaceC25682a = (InterfaceC25682a) it.next();
            fVar.f101072w = null;
            fVar.f101073x = it;
            fVar.f101074y = null;
            fVar.f101075z = null;
            fVar.f101067E = i13;
            fVar.f101068F = 0;
            fVar.f101071I = 1;
            if (interfaceC25682a.mo75623f(fVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: g */
    public Object mo75624g(C25683b c25683b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        h hVar;
        Iterator it;
        int i13;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i14 = hVar.f101088J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f101088J = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f101086H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = hVar.f101088J;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            it = this.allLayers.iterator();
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = hVar.f101084F;
            it = (Iterator) hVar.f101091y;
            C25683b c25683b2 = (C25683b) hVar.f101089w;
            AbstractC34132o.m107864I(obj);
            i13 = i16;
            c25683b = c25683b2;
        }
        while (it.hasNext()) {
            InterfaceC25682a interfaceC25682a = (InterfaceC25682a) it.next();
            hVar.f101089w = c25683b;
            hVar.f101090x = null;
            hVar.f101091y = it;
            hVar.f101092z = null;
            hVar.f101083E = null;
            hVar.f101084F = i13;
            hVar.f101085G = 0;
            hVar.f101088J = 1;
            if (interfaceC25682a.mo75624g(c25683b, hVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: h */
    public Object mo75625h(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f101066z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f101066z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objMo75625h = eVar.f101064x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f101066z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75625h);
            InterfaceC25682a interfaceC25682a = this.inMemoryCache;
            eVar.f101063w = str;
            eVar.f101066z = 1;
            objMo75625h = interfaceC25682a.mo75625h(str, eVar);
            if (objMo75625h != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo75625h);
            return objMo75625h;
        }
        str = (String) eVar.f101063w;
        AbstractC34132o.m107864I(objMo75625h);
        Long l7 = (Long) objMo75625h;
        if (l7 != null) {
            return l7;
        }
        InterfaceC25682a interfaceC25682a2 = this.persistentCache;
        eVar.f101063w = null;
        eVar.f101066z = 2;
        Object objMo75625h2 = interfaceC25682a2.mo75625h(str, eVar);
        return objMo75625h2 == enumC31071a ? enumC31071a : objMo75625h2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:20:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: i */
    public java.lang.Object mo75626i(q83.InterfaceC30057d<? super java.lang.Integer> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof mm0.C25684c.g
            if (r0 == 0) goto L13
            r0 = r8
            mm0.c$g r0 = (mm0.C25684c.g) r0
            int r1 = r0.f101078G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f101078G = r1
            goto L18
        L13:
            mm0.c$g r0 = new mm0.c$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f101076E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f101078G
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            int r2 = r0.f101082z
            java.lang.Object r5 = r0.f101080x
            mm0.a r5 = (mm0.InterfaceC25682a) r5
            java.lang.Object r5 = r0.f101079w
            java.util.Iterator r5 = (java.util.Iterator) r5
            p505ts.AbstractC34132o.m107864I(r8)
            goto L65
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            p505ts.AbstractC34132o.m107864I(r8)
            java.util.List<mm0.a> r8 = r7.allLayers
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r2 = r3
        L47:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r5.next()
            mm0.a r8 = (mm0.InterfaceC25682a) r8
            r0.f101079w = r5
            r6 = 0
            r0.f101080x = r6
            r0.f101081y = r3
            r0.f101082z = r2
            r0.f101078G = r4
            java.lang.Object r8 = r8.mo75626i(r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r2 = r2 + r8
            goto L47
        L6d:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.C25684c.mo75626i(q83.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C25684c(InterfaceC25682a interfaceC25682a, InterfaceC25682a interfaceC25682a2, C36144b c36144b, Clock clock, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC25682a = (i13 & 1) != 0 ? new C25686e() : interfaceC25682a;
        interfaceC25682a2 = (i13 & 2) != 0 ? new C25686e() : interfaceC25682a2;
        c36144b = (i13 & 4) != 0 ? new C36144b(C14872h.f55505a) : c36144b;
        if ((i13 & 8) != 0) {
            clock = Clock.systemUTC();
            AbstractC22676k.m65749i(clock, "systemUTC(...)");
        }
        this(interfaceC25682a, interfaceC25682a2, c36144b, clock);
    }
}
