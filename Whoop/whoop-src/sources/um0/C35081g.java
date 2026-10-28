package um0;

import android.database.sqlite.SQLiteException;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.cache.persistence.BffCacheDatabase;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import mm0.C25683b;
import mm0.InterfaceC25682a;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: um0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u001c\u0010\u0014J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010(¨\u0006)"}, m65681d2 = {"Lum0/g;", "Lmm0/a;", "Lcom/whoop/cache/persistence/BffCacheDatabase;", "database", "Lum0/a;", "dao", "Lrr2/c;", "crashReporter", "Lum0/e;", "maintainer", "Lq83/j;", "ioDispatcher", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/cache/persistence/BffCacheDatabase;Lum0/a;Lrr2/c;Lum0/e;Lq83/j;Ltr2/n;)V", "", "uri", "", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lmm0/b;", "b", "entry", "Ll83/a0;", "g", "(Lmm0/b;Lq83/d;)Ljava/lang/Object;", "scope", "a", "c", "f", "(Lq83/d;)Ljava/lang/Object;", "", "i", "Lcom/whoop/cache/persistence/BffCacheDatabase;", "Lum0/a;", "Lrr2/c;", "Lum0/e;", "e", "Lq83/j;", "Ltr2/n;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35081g implements InterfaceC25682a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final BffCacheDatabase database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC35075a dao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C35079e maintainer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC30063j ioDispatcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: um0.g$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.RoomPersistentCache", m100430f = "RoomPersistentCache.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "contains", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148842E;

        /* JADX INFO: renamed from: F */
        int f148843F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f148844G;

        /* JADX INFO: renamed from: I */
        int f148846I;

        /* JADX INFO: renamed from: w */
        Object f148847w;

        /* JADX INFO: renamed from: x */
        Object f148848x;

        /* JADX INFO: renamed from: y */
        Object f148849y;

        /* JADX INFO: renamed from: z */
        Object f148850z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148844G = obj;
            this.f148846I |= Integer.MIN_VALUE;
            return C35081g.this.mo75622d(null, this);
        }
    }

    /* JADX INFO: renamed from: um0.g$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.RoomPersistentCache", m100430f = "RoomPersistentCache.kt", m100431l = {31}, m100432m = "evictWithScope", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148851E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f148852F;

        /* JADX INFO: renamed from: H */
        int f148854H;

        /* JADX INFO: renamed from: w */
        Object f148855w;

        /* JADX INFO: renamed from: x */
        Object f148856x;

        /* JADX INFO: renamed from: y */
        Object f148857y;

        /* JADX INFO: renamed from: z */
        int f148858z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148852F = obj;
            this.f148854H |= Integer.MIN_VALUE;
            return C35081g.this.mo75619a(null, this);
        }
    }

    /* JADX INFO: renamed from: um0.g$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.RoomPersistentCache", m100430f = "RoomPersistentCache.kt", m100431l = {33}, m100432m = "evictWithUri", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148859E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f148860F;

        /* JADX INFO: renamed from: H */
        int f148862H;

        /* JADX INFO: renamed from: w */
        Object f148863w;

        /* JADX INFO: renamed from: x */
        Object f148864x;

        /* JADX INFO: renamed from: y */
        Object f148865y;

        /* JADX INFO: renamed from: z */
        int f148866z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148860F = obj;
            this.f148862H |= Integer.MIN_VALUE;
            return C35081g.this.mo75621c(null, this);
        }
    }

    /* JADX INFO: renamed from: um0.g$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.RoomPersistentCache", m100430f = "RoomPersistentCache.kt", m100431l = {24}, m100432m = "getEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148867E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f148868F;

        /* JADX INFO: renamed from: H */
        int f148870H;

        /* JADX INFO: renamed from: w */
        Object f148871w;

        /* JADX INFO: renamed from: x */
        Object f148872x;

        /* JADX INFO: renamed from: y */
        Object f148873y;

        /* JADX INFO: renamed from: z */
        int f148874z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148868F = obj;
            this.f148870H |= Integer.MIN_VALUE;
            return C35081g.this.mo75620b(null, this);
        }
    }

    /* JADX INFO: renamed from: um0.g$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.RoomPersistentCache", m100430f = "RoomPersistentCache.kt", m100431l = {35}, m100432m = "nuke", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f148875E;

        /* JADX INFO: renamed from: G */
        int f148877G;

        /* JADX INFO: renamed from: w */
        Object f148878w;

        /* JADX INFO: renamed from: x */
        Object f148879x;

        /* JADX INFO: renamed from: y */
        int f148880y;

        /* JADX INFO: renamed from: z */
        int f148881z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148875E = obj;
            this.f148877G |= Integer.MIN_VALUE;
            return C35081g.this.mo75623f(this);
        }
    }

    /* JADX INFO: renamed from: um0.g$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.RoomPersistentCache$nuke$2$1", m100430f = "RoomPersistentCache.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148882w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35081g.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148882w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C35081g.this.database.clearAllTables();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: um0.g$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.RoomPersistentCache", m100430f = "RoomPersistentCache.kt", m100431l = {37}, m100432m = "size", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148884E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f148885F;

        /* JADX INFO: renamed from: H */
        int f148887H;

        /* JADX INFO: renamed from: w */
        Object f148888w;

        /* JADX INFO: renamed from: x */
        Object f148889x;

        /* JADX INFO: renamed from: y */
        Object f148890y;

        /* JADX INFO: renamed from: z */
        int f148891z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148885F = obj;
            this.f148887H |= Integer.MIN_VALUE;
            return C35081g.this.mo75626i(this);
        }
    }

    /* JADX INFO: renamed from: um0.g$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.RoomPersistentCache", m100430f = "RoomPersistentCache.kt", m100431l = {27, 28}, m100432m = "updateEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148892E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f148893F;

        /* JADX INFO: renamed from: H */
        int f148895H;

        /* JADX INFO: renamed from: w */
        Object f148896w;

        /* JADX INFO: renamed from: x */
        Object f148897x;

        /* JADX INFO: renamed from: y */
        Object f148898y;

        /* JADX INFO: renamed from: z */
        int f148899z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148893F = obj;
            this.f148895H |= Integer.MIN_VALUE;
            return C35081g.this.mo75624g(null, this);
        }
    }

    public C35081g(BffCacheDatabase database, AbstractC35075a dao, InterfaceC31766c crashReporter, C35079e maintainer, InterfaceC30063j ioDispatcher, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(database, "database");
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(maintainer, "maintainer");
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        AbstractC22676k.m65750j(logger, "logger");
        this.database = database;
        this.dao = dao;
        this.crashReporter = crashReporter;
        this.maintainer = maintainer;
        this.ioDispatcher = ioDispatcher;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: a */
    public Object mo75619a(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        SQLiteException e5;
        String str2;
        C35081g c35081g;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f148854H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f148854H = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f148852F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f148854H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                AbstractC35075a abstractC35075a = this.dao;
                bVar.f148855w = null;
                bVar.f148856x = this;
                bVar.f148857y = "evictWithScope";
                bVar.f148858z = 0;
                bVar.f148851E = 0;
                bVar.f148854H = 1;
                if (abstractC35075a.mo18330d(str, bVar) == enumC31071a) {
                    return enumC31071a;
                }
            } catch (SQLiteException e13) {
                e5 = e13;
                str2 = "evictWithScope";
                c35081g = this;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache delete failed: ", str2), e5, new AbstractC30556a.a[0]);
                c35081g.crashReporter.mo98630o(e5, AbstractC25247g0.m73989X(new C23465k("cache_operation", str2)));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) bVar.f148857y;
            c35081g = (C35081g) bVar.f148856x;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (SQLiteException e14) {
                e5 = e14;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache delete failed: ", str2), e5, new AbstractC30556a.a[0]);
                c35081g.crashReporter.mo98630o(e5, AbstractC25247g0.m73989X(new C23465k("cache_operation", str2)));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: b */
    public Object mo75620b(String str, InterfaceC30057d<? super C25683b> interfaceC30057d) {
        d dVar;
        SQLiteException e5;
        String str2;
        C35081g c35081g;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f148870H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f148870H = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f148868F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f148870H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                AbstractC35075a abstractC35075a = this.dao;
                dVar.f148871w = null;
                dVar.f148872x = this;
                dVar.f148873y = "getEntry";
                dVar.f148874z = 0;
                dVar.f148867E = 0;
                dVar.f148870H = 1;
                Object objMo18334h = abstractC35075a.mo18334h(str, dVar);
                if (objMo18334h == enumC31071a) {
                    return enumC31071a;
                }
                obj = objMo18334h;
                c35081g = this;
            } catch (SQLiteException e13) {
                e5 = e13;
                str2 = "getEntry";
                c35081g = this;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache read failed: ", str2), e5, new AbstractC30556a.a[0]);
                return null;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) dVar.f148873y;
            c35081g = (C35081g) dVar.f148872x;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (SQLiteException e14) {
                e5 = e14;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache read failed: ", str2), e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
        C35078d c35078d = (C35078d) obj;
        if (c35078d != null) {
            return AbstractC35082h.m110934d(c35078d);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: c */
    public Object mo75621c(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        SQLiteException e5;
        String str2;
        C35081g c35081g;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f148862H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f148862H = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f148860F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f148862H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                AbstractC35075a abstractC35075a = this.dao;
                cVar.f148863w = null;
                cVar.f148864x = this;
                cVar.f148865y = "evictWithUri";
                cVar.f148866z = 0;
                cVar.f148859E = 0;
                cVar.f148862H = 1;
                if (abstractC35075a.mo18331e(str, cVar) == enumC31071a) {
                    return enumC31071a;
                }
            } catch (SQLiteException e13) {
                e5 = e13;
                str2 = "evictWithUri";
                c35081g = this;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache delete failed: ", str2), e5, new AbstractC30556a.a[0]);
                c35081g.crashReporter.mo98630o(e5, AbstractC25247g0.m73989X(new C23465k("cache_operation", str2)));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) cVar.f148865y;
            c35081g = (C35081g) cVar.f148864x;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (SQLiteException e14) {
                e5 = e14;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache delete failed: ", str2), e5, new AbstractC30556a.a[0]);
                c35081g.crashReporter.mo98630o(e5, AbstractC25247g0.m73989X(new C23465k("cache_operation", str2)));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: d */
    public Object mo75622d(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        String str2;
        SQLiteException e5;
        Boolean bool;
        C35081g c35081g;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f148846I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f148846I = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f148844G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f148846I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Boolean bool2 = Boolean.FALSE;
            try {
                AbstractC35075a abstractC35075a = this.dao;
                aVar.f148847w = null;
                aVar.f148848x = this;
                aVar.f148849y = "contains";
                aVar.f148850z = bool2;
                aVar.f148842E = 0;
                aVar.f148843F = 0;
                aVar.f148846I = 1;
                Object objMo18328b = abstractC35075a.mo18328b(str, aVar);
                if (objMo18328b == enumC31071a) {
                    return enumC31071a;
                }
                str2 = "contains";
                obj = objMo18328b;
                bool = bool2;
                c35081g = this;
            } catch (SQLiteException e13) {
                str2 = "contains";
                e5 = e13;
                bool = bool2;
                c35081g = this;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache read failed: ", str2), e5, new AbstractC30556a.a[0]);
                return bool;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bool = (Boolean) aVar.f148850z;
            str2 = (String) aVar.f148849y;
            c35081g = (C35081g) aVar.f148848x;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (SQLiteException e14) {
                e5 = e14;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache read failed: ", str2), e5, new AbstractC30556a.a[0]);
                return bool;
            }
        }
        Boolean bool3 = (Boolean) obj;
        bool3.booleanValue();
        return bool3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: f */
    public Object mo75623f(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e eVar;
        String str;
        SQLiteException e5;
        C35081g c35081g;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f148877G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f148877G = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f148875E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f148877G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                InterfaceC30063j interfaceC30063j = this.ioDispatcher;
                f fVar = new f(null);
                eVar.f148878w = this;
                eVar.f148879x = "nuke";
                eVar.f148880y = 0;
                eVar.f148881z = 0;
                eVar.f148877G = 1;
                if (AbstractC3006f0.m8705K(interfaceC30063j, fVar, eVar) == enumC31071a) {
                    return enumC31071a;
                }
            } catch (SQLiteException e13) {
                str = "nuke";
                e5 = e13;
                c35081g = this;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache delete failed: ", str), e5, new AbstractC30556a.a[0]);
                c35081g.crashReporter.mo98630o(e5, AbstractC25247g0.m73989X(new C23465k("cache_operation", str)));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) eVar.f148879x;
            c35081g = (C35081g) eVar.f148878w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (SQLiteException e14) {
                e5 = e14;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache delete failed: ", str), e5, new AbstractC30556a.a[0]);
                c35081g.crashReporter.mo98630o(e5, AbstractC25247g0.m73989X(new C23465k("cache_operation", str)));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r9.m110926a(r0) == r1) goto L29;
     */
    @Override // mm0.InterfaceC25682a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75624g(mm0.C25683b r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof um0.C35081g.h
            if (r0 == 0) goto L13
            r0 = r10
            um0.g$h r0 = (um0.C35081g.h) r0
            int r1 = r0.f148895H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148895H = r1
            goto L18
        L13:
            um0.g$h r0 = new um0.g$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f148893F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f148895H
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f148896w
            mm0.b r9 = (mm0.C25683b) r9
            p505ts.AbstractC34132o.m107864I(r10)
            goto L8f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f148898y
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.f148897x
            um0.g r2 = (um0.C35081g) r2
            java.lang.Object r4 = r0.f148896w
            mm0.b r4 = (mm0.C25683b) r4
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: android.database.sqlite.SQLiteException -> L48
            goto L7e
        L48:
            r10 = move-exception
            goto L71
        L4a:
            p505ts.AbstractC34132o.m107864I(r10)
            java.lang.String r10 = "updateEntry"
            um0.a r2 = r8.dao     // Catch: android.database.sqlite.SQLiteException -> L6c
            um0.c r7 = um0.AbstractC35082h.m110932b(r9)     // Catch: android.database.sqlite.SQLiteException -> L6c
            java.util.List r9 = um0.AbstractC35082h.m110933c(r9)     // Catch: android.database.sqlite.SQLiteException -> L6c
            r0.f148896w = r6     // Catch: android.database.sqlite.SQLiteException -> L6c
            r0.f148897x = r8     // Catch: android.database.sqlite.SQLiteException -> L6c
            r0.f148898y = r10     // Catch: android.database.sqlite.SQLiteException -> L6c
            r0.f148899z = r5     // Catch: android.database.sqlite.SQLiteException -> L6c
            r0.f148892E = r5     // Catch: android.database.sqlite.SQLiteException -> L6c
            r0.f148895H = r4     // Catch: android.database.sqlite.SQLiteException -> L6c
            java.lang.Object r9 = r2.mo18336j(r7, r9, r0)     // Catch: android.database.sqlite.SQLiteException -> L6c
            if (r9 != r1) goto L7e
            goto L8e
        L6c:
            r9 = move-exception
            r2 = r10
            r10 = r9
            r9 = r2
            r2 = r8
        L71:
            tr2.n r2 = r2.logger
            java.lang.String r4 = "BFF persistent cache write failed: "
            java.lang.String r9 = p000.AbstractC11266d.m30461o(r4, r9)
            qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r5]
            r2.mo85230v(r9, r10, r4)
        L7e:
            um0.e r9 = r8.maintainer
            r0.f148896w = r6
            r0.f148897x = r6
            r0.f148898y = r6
            r0.f148895H = r3
            java.lang.Object r9 = r9.m110926a(r0)
            if (r9 != r1) goto L8f
        L8e:
            return r1
        L8f:
            l83.a0 r9 = l83.C23454a0.f92919a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: um0.C35081g.mo75624g(mm0.b, q83.d):java.lang.Object");
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
        g gVar;
        String str;
        Integer num;
        SQLiteException e5;
        C35081g c35081g;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f148887H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f148887H = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f148885F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f148887H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            str = "size";
            Integer num2 = new Integer(0);
            try {
                AbstractC35075a abstractC35075a = this.dao;
                gVar.f148888w = this;
                gVar.f148889x = "size";
                gVar.f148890y = num2;
                gVar.f148891z = 0;
                gVar.f148884E = 0;
                gVar.f148887H = 1;
                Object objMo18327a = abstractC35075a.mo18327a(gVar);
                if (objMo18327a == enumC31071a) {
                    return enumC31071a;
                }
                num = num2;
                obj = objMo18327a;
                c35081g = this;
            } catch (SQLiteException e13) {
                num = num2;
                e5 = e13;
                c35081g = this;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache read failed: ", str), e5, new AbstractC30556a.a[0]);
                return num;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = (Integer) gVar.f148890y;
            str = (String) gVar.f148889x;
            c35081g = (C35081g) gVar.f148888w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (SQLiteException e14) {
                e5 = e14;
                c35081g.logger.mo85230v(AbstractC11266d.m30461o("BFF persistent cache read failed: ", str), e5, new AbstractC30556a.a[0]);
                return num;
            }
        }
        return new Integer(((Number) obj).intValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C35081g(BffCacheDatabase bffCacheDatabase, AbstractC35075a abstractC35075a, InterfaceC31766c interfaceC31766c, C35079e c35079e, InterfaceC30063j interfaceC30063j, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 16) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        this(bffCacheDatabase, abstractC35075a, interfaceC31766c, c35079e, interfaceC30063j, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RoomPersistentCache") : interfaceC34116n);
    }
}
