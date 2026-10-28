package mm0;

import com.whoop.data.repositories.FeatureFlagChecker;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.atomic.AtomicReference;
import l83.InterfaceC23462h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: mm0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0019\u0010\u000fJ\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\nJ\u0010\u0010\u001d\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001d\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006#"}, m65681d2 = {"Lmm0/d;", "Lmm0/a;", "Ll83/h;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "flagChecker", "enabled", "disabled", "<init>", "(Ll83/h;Ll83/h;Lmm0/a;)V", "k", "(Lq83/d;)Ljava/lang/Object;", "", "uri", "", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lmm0/b;", "b", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "entry", "Ll83/a0;", "g", "(Lmm0/b;Lq83/d;)Ljava/lang/Object;", "scope", "a", "c", "", "i", "f", "Ll83/h;", "Lmm0/a;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "lastKnownEnabled", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25685d implements InterfaceC25682a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC23462h flagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC23462h enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25682a disabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AtomicReference<Boolean> lastKnownEnabled;

    /* JADX INFO: renamed from: mm0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.cache.FeatureFlagGatedCache", m100430f = "FeatureFlagGatedCache.kt", m100431l = {32}, m100432m = "activeCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f101097w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f101098x;

        /* JADX INFO: renamed from: z */
        int f101100z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101098x = obj;
            this.f101100z |= Integer.MIN_VALUE;
            return C25685d.this.m75633k(this);
        }
    }

    /* JADX INFO: renamed from: mm0.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.cache.FeatureFlagGatedCache", m100430f = "FeatureFlagGatedCache.kt", m100431l = {37, 37}, m100432m = "contains", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f101101w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f101102x;

        /* JADX INFO: renamed from: z */
        int f101104z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101102x = obj;
            this.f101104z |= Integer.MIN_VALUE;
            return C25685d.this.mo75622d(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.FeatureFlagGatedCache", m100430f = "FeatureFlagGatedCache.kt", m100431l = {41, 41}, m100432m = "evictWithScope", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f101105w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f101106x;

        /* JADX INFO: renamed from: z */
        int f101108z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101106x = obj;
            this.f101108z |= Integer.MIN_VALUE;
            return C25685d.this.mo75619a(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.cache.FeatureFlagGatedCache", m100430f = "FeatureFlagGatedCache.kt", m100431l = {42, 42}, m100432m = "evictWithUri", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f101109w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f101110x;

        /* JADX INFO: renamed from: z */
        int f101112z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101110x = obj;
            this.f101112z |= Integer.MIN_VALUE;
            return C25685d.this.mo75621c(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.d$e */
    @InterfaceC32271e(m100429c = "com.whoop.cache.FeatureFlagGatedCache", m100430f = "FeatureFlagGatedCache.kt", m100431l = {38, 38}, m100432m = "getEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f101113w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f101114x;

        /* JADX INFO: renamed from: z */
        int f101116z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101114x = obj;
            this.f101116z |= Integer.MIN_VALUE;
            return C25685d.this.mo75620b(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.FeatureFlagGatedCache", m100430f = "FeatureFlagGatedCache.kt", m100431l = {39, 39}, m100432m = "lastUpdated", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f101117w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f101118x;

        /* JADX INFO: renamed from: z */
        int f101120z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101118x = obj;
            this.f101120z |= Integer.MIN_VALUE;
            return C25685d.this.mo75625h(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.FeatureFlagGatedCache", m100430f = "FeatureFlagGatedCache.kt", m100431l = {46, 47}, m100432m = "nuke", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f101121w;

        /* JADX INFO: renamed from: y */
        int f101123y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101121w = obj;
            this.f101123y |= Integer.MIN_VALUE;
            return C25685d.this.mo75623f(this);
        }
    }

    /* JADX INFO: renamed from: mm0.d$h */
    @InterfaceC32271e(m100429c = "com.whoop.cache.FeatureFlagGatedCache", m100430f = "FeatureFlagGatedCache.kt", m100431l = {43, 43}, m100432m = "size", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f101124w;

        /* JADX INFO: renamed from: y */
        int f101126y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101124w = obj;
            this.f101126y |= Integer.MIN_VALUE;
            return C25685d.this.mo75626i(this);
        }
    }

    /* JADX INFO: renamed from: mm0.d$i */
    @InterfaceC32271e(m100429c = "com.whoop.cache.FeatureFlagGatedCache", m100430f = "FeatureFlagGatedCache.kt", m100431l = {40, 40}, m100432m = "updateEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f101127w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f101128x;

        /* JADX INFO: renamed from: z */
        int f101130z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101128x = obj;
            this.f101130z |= Integer.MIN_VALUE;
            return C25685d.this.mo75624g(null, this);
        }
    }

    public C25685d(InterfaceC23462h flagChecker, InterfaceC23462h enabled, InterfaceC25682a disabled) {
        AbstractC22676k.m65750j(flagChecker, "flagChecker");
        AbstractC22676k.m65750j(enabled, "enabled");
        AbstractC22676k.m65750j(disabled, "disabled");
        this.flagChecker = flagChecker;
        this.enabled = enabled;
        this.disabled = disabled;
        this.lastKnownEnabled = new AtomicReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m75633k(InterfaceC30057d<? super InterfaceC25682a> interfaceC30057d) {
        a aVar;
        boolean zIsFeatureEnabled;
        boolean z4;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f101100z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f101100z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f101098x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f101100z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            zIsFeatureEnabled = ((FeatureFlagChecker) this.flagChecker.getValue()).isFeatureEnabled("bff-cache-persistence");
            if (AbstractC22676k.m65745e(this.lastKnownEnabled.getAndSet(Boolean.valueOf(zIsFeatureEnabled)), Boolean.TRUE) && !zIsFeatureEnabled) {
                InterfaceC25682a interfaceC25682a = (InterfaceC25682a) this.enabled.getValue();
                aVar.f101097w = zIsFeatureEnabled;
                aVar.f101100z = 1;
                if (interfaceC25682a.mo75623f(aVar) == enumC31071a) {
                    return enumC31071a;
                }
                z4 = zIsFeatureEnabled;
            }
            return zIsFeatureEnabled ? (InterfaceC25682a) this.enabled.getValue() : this.disabled;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z4 = aVar.f101097w;
        AbstractC34132o.m107864I(obj);
        zIsFeatureEnabled = z4;
        if (zIsFeatureEnabled) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (((mm0.InterfaceC25682a) r7).mo75619a(r6, r0) == r1) goto L21;
     */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75619a(java.lang.String r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mm0.C25685d.c
            if (r0 == 0) goto L13
            r0 = r7
            mm0.d$c r0 = (mm0.C25685d.c) r0
            int r1 = r0.f101108z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f101108z = r1
            goto L18
        L13:
            mm0.d$c r0 = new mm0.d$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f101106x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f101108z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f101105w
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L5a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f101105w
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4c
        L3e:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f101105w = r6
            r0.f101108z = r4
            java.lang.Object r7 = r5.m75633k(r0)
            if (r7 != r1) goto L4c
            goto L59
        L4c:
            mm0.a r7 = (mm0.InterfaceC25682a) r7
            r2 = 0
            r0.f101105w = r2
            r0.f101108z = r3
            java.lang.Object r6 = r7.mo75619a(r6, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.C25685d.mo75619a(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: b */
    public Object mo75620b(String str, InterfaceC30057d<? super C25683b> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f101116z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f101116z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM75633k = eVar.f101114x;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar.f101116z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM75633k);
            eVar.f101113w = str;
            eVar.f101116z = 1;
            objM75633k = m75633k(eVar);
            if (objM75633k != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM75633k);
            return objM75633k;
        }
        str = (String) eVar.f101113w;
        AbstractC34132o.m107864I(objM75633k);
        eVar.f101113w = null;
        eVar.f101116z = 2;
        Object objMo75620b = ((InterfaceC25682a) objM75633k).mo75620b(str, eVar);
        return objMo75620b == obj ? obj : objMo75620b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (((mm0.InterfaceC25682a) r7).mo75621c(r6, r0) == r1) goto L21;
     */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75621c(java.lang.String r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mm0.C25685d.d
            if (r0 == 0) goto L13
            r0 = r7
            mm0.d$d r0 = (mm0.C25685d.d) r0
            int r1 = r0.f101112z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f101112z = r1
            goto L18
        L13:
            mm0.d$d r0 = new mm0.d$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f101110x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f101112z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f101109w
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L5a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f101109w
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4c
        L3e:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f101109w = r6
            r0.f101112z = r4
            java.lang.Object r7 = r5.m75633k(r0)
            if (r7 != r1) goto L4c
            goto L59
        L4c:
            mm0.a r7 = (mm0.InterfaceC25682a) r7
            r2 = 0
            r0.f101109w = r2
            r0.f101112z = r3
            java.lang.Object r6 = r7.mo75621c(r6, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.C25685d.mo75621c(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: d */
    public Object mo75622d(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f101104z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f101104z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM75633k = bVar.f101102x;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f101104z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM75633k);
            bVar.f101101w = str;
            bVar.f101104z = 1;
            objM75633k = m75633k(bVar);
            if (objM75633k != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM75633k);
            return objM75633k;
        }
        str = (String) bVar.f101101w;
        AbstractC34132o.m107864I(objM75633k);
        bVar.f101101w = null;
        bVar.f101104z = 2;
        Object objMo75622d = ((InterfaceC25682a) objM75633k).mo75622d(str, bVar);
        return objMo75622d == obj ? obj : objMo75622d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r6.mo75623f(r0) == r1) goto L21;
     */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75623f(q83.InterfaceC30057d<? super l83.C23454a0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mm0.C25685d.g
            if (r0 == 0) goto L13
            r0 = r6
            mm0.d$g r0 = (mm0.C25685d.g) r0
            int r1 = r0.f101123y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f101123y = r1
            goto L18
        L13:
            mm0.d$g r0 = new mm0.d$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f101121w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f101123y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L4a
        L36:
            p505ts.AbstractC34132o.m107864I(r6)
            l83.h r6 = r5.enabled
            java.lang.Object r6 = r6.getValue()
            mm0.a r6 = (mm0.InterfaceC25682a) r6
            r0.f101123y = r4
            java.lang.Object r6 = r6.mo75623f(r0)
            if (r6 != r1) goto L4a
            goto L54
        L4a:
            mm0.a r6 = r5.disabled
            r0.f101123y = r3
            java.lang.Object r6 = r6.mo75623f(r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.C25685d.mo75623f(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (((mm0.InterfaceC25682a) r7).mo75624g(r6, r0) == r1) goto L21;
     */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75624g(mm0.C25683b r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mm0.C25685d.i
            if (r0 == 0) goto L13
            r0 = r7
            mm0.d$i r0 = (mm0.C25685d.i) r0
            int r1 = r0.f101130z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f101130z = r1
            goto L18
        L13:
            mm0.d$i r0 = new mm0.d$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f101128x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f101130z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f101127w
            mm0.b r6 = (mm0.C25683b) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L5a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f101127w
            mm0.b r6 = (mm0.C25683b) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4c
        L3e:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f101127w = r6
            r0.f101130z = r4
            java.lang.Object r7 = r5.m75633k(r0)
            if (r7 != r1) goto L4c
            goto L59
        L4c:
            mm0.a r7 = (mm0.InterfaceC25682a) r7
            r2 = 0
            r0.f101127w = r2
            r0.f101130z = r3
            java.lang.Object r6 = r7.mo75624g(r6, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.C25685d.mo75624g(mm0.b, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: h */
    public Object mo75625h(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f101120z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f101120z = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM75633k = fVar.f101118x;
        Object obj = EnumC31071a.f128113w;
        int i14 = fVar.f101120z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM75633k);
            fVar.f101117w = str;
            fVar.f101120z = 1;
            objM75633k = m75633k(fVar);
            if (objM75633k != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM75633k);
            return objM75633k;
        }
        str = (String) fVar.f101117w;
        AbstractC34132o.m107864I(objM75633k);
        fVar.f101117w = null;
        fVar.f101120z = 2;
        Object objMo75625h = ((InterfaceC25682a) objM75633k).mo75625h(str, fVar);
        return objMo75625h == obj ? obj : objMo75625h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: i */
    public Object mo75626i(InterfaceC30057d<? super Integer> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f101126y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f101126y = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM75633k = hVar.f101124w;
        Object obj = EnumC31071a.f128113w;
        int i14 = hVar.f101126y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM75633k);
            hVar.f101126y = 1;
            objM75633k = m75633k(hVar);
            if (objM75633k != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM75633k);
            return objM75633k;
        }
        AbstractC34132o.m107864I(objM75633k);
        hVar.f101126y = 2;
        Object objMo75626i = ((InterfaceC25682a) objM75633k).mo75626i(hVar);
        return objMo75626i == obj ? obj : objMo75626i;
    }
}
