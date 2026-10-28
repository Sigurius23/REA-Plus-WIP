package mm0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: mm0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0010\u0010\bJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0012\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lmm0/e;", "Lmm0/a;", "<init>", "()V", "", "uri", "", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lmm0/b;", "b", "entry", "Ll83/a0;", "g", "(Lmm0/b;Lq83/d;)Ljava/lang/Object;", "scope", "a", "c", "f", "(Lq83/d;)Ljava/lang/Object;", "", "i", "Lmc3/a;", "Lmc3/a;", "mutex", "", "Ljava/util/Map;", "entries", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25686e implements InterfaceC25682a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25435a mutex = AbstractC25438d.m74669a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Map<String, C25683b> entries = new LinkedHashMap();

    /* JADX INFO: renamed from: mm0.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.cache.InMemoryCache", m100430f = "InMemoryCache.kt", m100431l = {61}, m100432m = "contains", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f101134F;

        /* JADX INFO: renamed from: w */
        Object f101135w;

        /* JADX INFO: renamed from: x */
        Object f101136x;

        /* JADX INFO: renamed from: y */
        int f101137y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f101138z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101138z = obj;
            this.f101134F |= Integer.MIN_VALUE;
            return C25686e.this.mo75622d(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.InMemoryCache", m100430f = "InMemoryCache.kt", m100431l = {61}, m100432m = "evictWithScope", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f101140F;

        /* JADX INFO: renamed from: w */
        Object f101141w;

        /* JADX INFO: renamed from: x */
        Object f101142x;

        /* JADX INFO: renamed from: y */
        int f101143y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f101144z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101144z = obj;
            this.f101140F |= Integer.MIN_VALUE;
            return C25686e.this.mo75619a(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.cache.InMemoryCache", m100430f = "InMemoryCache.kt", m100431l = {61}, m100432m = "evictWithUri", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f101146F;

        /* JADX INFO: renamed from: w */
        Object f101147w;

        /* JADX INFO: renamed from: x */
        Object f101148x;

        /* JADX INFO: renamed from: y */
        int f101149y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f101150z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101150z = obj;
            this.f101146F |= Integer.MIN_VALUE;
            return C25686e.this.mo75621c(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.cache.InMemoryCache", m100430f = "InMemoryCache.kt", m100431l = {61}, m100432m = "getEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f101152F;

        /* JADX INFO: renamed from: w */
        Object f101153w;

        /* JADX INFO: renamed from: x */
        Object f101154x;

        /* JADX INFO: renamed from: y */
        int f101155y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f101156z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101156z = obj;
            this.f101152F |= Integer.MIN_VALUE;
            return C25686e.this.mo75620b(null, this);
        }
    }

    /* JADX INFO: renamed from: mm0.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.cache.InMemoryCache", m100430f = "InMemoryCache.kt", m100431l = {61}, m100432m = "nuke", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f101157E;

        /* JADX INFO: renamed from: w */
        Object f101158w;

        /* JADX INFO: renamed from: x */
        int f101159x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f101160y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101160y = obj;
            this.f101157E |= Integer.MIN_VALUE;
            return C25686e.this.mo75623f(this);
        }
    }

    /* JADX INFO: renamed from: mm0.e$f */
    @InterfaceC32271e(m100429c = "com.whoop.cache.InMemoryCache", m100430f = "InMemoryCache.kt", m100431l = {61}, m100432m = "size", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f101162E;

        /* JADX INFO: renamed from: w */
        Object f101163w;

        /* JADX INFO: renamed from: x */
        int f101164x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f101165y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101165y = obj;
            this.f101162E |= Integer.MIN_VALUE;
            return C25686e.this.mo75626i(this);
        }
    }

    /* JADX INFO: renamed from: mm0.e$g */
    @InterfaceC32271e(m100429c = "com.whoop.cache.InMemoryCache", m100430f = "InMemoryCache.kt", m100431l = {61}, m100432m = "updateEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f101168F;

        /* JADX INFO: renamed from: w */
        Object f101169w;

        /* JADX INFO: renamed from: x */
        Object f101170x;

        /* JADX INFO: renamed from: y */
        int f101171y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f101172z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101172z = obj;
            this.f101168F |= Integer.MIN_VALUE;
            return C25686e.this.mo75624g(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: a */
    public Object mo75619a(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        String str2;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f101140F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f101140F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f101144z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f101140F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC25435a interfaceC25435a2 = this.mutex;
            bVar.f101141w = str;
            bVar.f101142x = interfaceC25435a2;
            bVar.f101143y = 0;
            bVar.f101140F = 1;
            if (interfaceC25435a2.mo68211b(bVar) == enumC31071a) {
                return enumC31071a;
            }
            str2 = str;
            interfaceC25435a = interfaceC25435a2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC25435a = (InterfaceC25435a) bVar.f101142x;
            str2 = (String) bVar.f101141w;
            AbstractC34132o.m107864I(obj);
        }
        try {
            Map<String, C25683b> map = this.entries;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C25683b> entry : map.entrySet()) {
                if (!entry.getValue().m75629c().contains(str2)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.entries = AbstractC25247g0.m74003l0(linkedHashMap);
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: b */
    public Object mo75620b(String str, InterfaceC30057d<? super C25683b> interfaceC30057d) {
        d dVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f101152F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f101152F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f101156z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f101152F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            dVar.f101153w = str;
            dVar.f101154x = interfaceC25435a;
            dVar.f101155y = 0;
            dVar.f101152F = 1;
            if (interfaceC25435a.mo68211b(dVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) dVar.f101154x;
            String str2 = (String) dVar.f101153w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            return this.entries.get(str);
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: c */
    public Object mo75621c(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f101146F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f101146F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f101150z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f101146F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            cVar.f101147w = str;
            cVar.f101148x = interfaceC25435a;
            cVar.f101149y = 0;
            cVar.f101146F = 1;
            if (interfaceC25435a.mo68211b(cVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) cVar.f101148x;
            String str2 = (String) cVar.f101147w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            this.entries.remove(str);
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: d */
    public Object mo75622d(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f101134F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f101134F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f101138z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f101134F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            aVar.f101135w = str;
            aVar.f101136x = interfaceC25435a;
            aVar.f101137y = 0;
            aVar.f101134F = 1;
            if (interfaceC25435a.mo68211b(aVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) aVar.f101136x;
            String str2 = (String) aVar.f101135w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            str = str2;
        }
        try {
            return Boolean.valueOf(this.entries.containsKey(str));
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: f */
    public Object mo75623f(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e eVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f101157E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f101157E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f101160y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f101157E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC25435a interfaceC25435a2 = this.mutex;
            eVar.f101158w = interfaceC25435a2;
            eVar.f101159x = 0;
            eVar.f101157E = 1;
            if (interfaceC25435a2.mo68211b(eVar) == enumC31071a) {
                return enumC31071a;
            }
            interfaceC25435a = interfaceC25435a2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC25435a = (InterfaceC25435a) eVar.f101158w;
            AbstractC34132o.m107864I(obj);
        }
        try {
            this.entries.clear();
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: g */
    public Object mo75624g(C25683b c25683b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        g gVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f101168F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f101168F = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f101172z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f101168F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            gVar.f101169w = c25683b;
            gVar.f101170x = interfaceC25435a;
            gVar.f101171y = 0;
            gVar.f101168F = 1;
            if (interfaceC25435a.mo68211b(gVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) gVar.f101170x;
            C25683b c25683b2 = (C25683b) gVar.f101169w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            c25683b = c25683b2;
        }
        try {
            this.entries.put(c25683b.getUri(), c25683b);
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: h */
    public /* bridge */ Object mo75625h(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        return super.mo75625h(str, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: i */
    public Object mo75626i(InterfaceC30057d<? super Integer> interfaceC30057d) {
        f fVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f101162E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f101162E = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f101165y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f101162E;
        int iMo79253d = 0;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC25435a interfaceC25435a2 = this.mutex;
            fVar.f101163w = interfaceC25435a2;
            fVar.f101164x = 0;
            fVar.f101162E = 1;
            if (interfaceC25435a2.mo68211b(fVar) == enumC31071a) {
                return enumC31071a;
            }
            interfaceC25435a = interfaceC25435a2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC25435a = (InterfaceC25435a) fVar.f101163w;
            AbstractC34132o.m107864I(obj);
        }
        try {
            Iterator<T> it = this.entries.entrySet().iterator();
            while (it.hasNext()) {
                iMo79253d += ((C25683b) ((Map.Entry) it.next()).getValue()).getData().mo79253d();
            }
            return new Integer(iMo79253d);
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }
}
