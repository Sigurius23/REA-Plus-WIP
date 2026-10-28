package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import bc3.AbstractC2995c1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C3004e2;
import bc3.C3023j1;
import bc3.ExecutorC3046p0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import hc3.C17171d;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import l83.C23464j;
import l83.InterfaceC23457c;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import p007a6.C0428i;
import p007a6.C0438l0;
import p249jc.AbstractC21598x;
import p277kb.C22317a;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p339nb.AbstractC26533a;
import p339nb.AbstractC26534b;
import p339nb.AbstractC26535c;
import p389p0.C28539n0;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33688b;
import p500tb.InterfaceC33689c;
import p518ub.InterfaceC34728a;
import p518ub.InterfaceC34732e;
import p518ub.InterfaceC34734g;
import p518ub.InterfaceC34735h;
import p578wb.C37024a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30058e;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: androidx.room.z0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1848z0 {
    public static final C1824r0 Companion = new C1824r0();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AbstractC26533a autoCloser;
    private C1786g configuration;
    private C1812n0 connectionManager;
    private InterfaceC2994c0 coroutineScope;
    private Executor internalQueryExecutor;
    private C1835v internalTracker;
    private Executor internalTransactionExecutor;
    protected List<? extends AbstractC1821q0> mCallbacks;
    protected volatile InterfaceC34728a mDatabase;
    private InterfaceC30063j transactionContext;
    private final C22317a closeBarrier = new C22317a(new C1833u0(0, this, AbstractC1848z0.class, "onClosed", "onClosed()V", 0, 0));
    private final ThreadLocal<InterfaceC30063j> suspendingTransactionContext = new ThreadLocal<>();
    private final Map<InterfaceC21461d, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    public static final void access$onClosed(AbstractC1848z0 abstractC1848z0) throws Exception {
        InterfaceC2994c0 interfaceC2994c0 = abstractC1848z0.coroutineScope;
        if (interfaceC2994c0 == null) {
            AbstractC22676k.m65757q("coroutineScope");
            throw null;
        }
        AbstractC3006f0.m8714h(interfaceC2994c0, null);
        C1771c0 c1771c0 = abstractC1848z0.getInvalidationTracker().f7196j;
        if (c1771c0 != null) {
            c1771c0.m5366c();
        }
        C1812n0 c1812n0 = abstractC1848z0.connectionManager;
        if (c1812n0 == null) {
            AbstractC22676k.m65757q("connectionManager");
            throw null;
        }
        c1812n0.f7123f.close();
        InterfaceC34732e interfaceC34732e = c1812n0.f7124g;
        if (interfaceC34732e != null) {
            interfaceC34732e.close();
        }
    }

    @InterfaceC23457c
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ Cursor query$default(AbstractC1848z0 abstractC1848z0, InterfaceC34734g interfaceC34734g, CancellationSignal cancellationSignal, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i13 & 2) != 0) {
            cancellationSignal = null;
        }
        return abstractC1848z0.query(interfaceC34734g, cancellationSignal);
    }

    /* JADX INFO: renamed from: a */
    public final Object m5464a(InterfaceC4339a interfaceC4339a) {
        if (!inCompatibilityMode()) {
            return AbstractC15751g.m44432L(this, false, true, new C1815o0(interfaceC4339a, 0));
        }
        beginTransaction();
        try {
            Object objInvoke = interfaceC4339a.invoke();
            setTransactionSuccessful();
            return objInvoke;
        } finally {
            endTransaction();
        }
    }

    public final void addTypeConverter$room_runtime(InterfaceC21461d kclass, Object converter) {
        AbstractC22676k.m65750j(kclass, "kclass");
        AbstractC22676k.m65750j(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inCompatibilityMode() || inTransaction()) {
            return;
        }
        InterfaceC30063j interfaceC30063j = this.suspendingTransactionContext.get();
        if ((interfaceC30063j != null ? (C1831t1) interfaceC30063j.get(C1831t1.f7178x) : null) != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @InterfaceC23457c
    public void beginTransaction() {
        assertNotMainThread();
        assertNotMainThread();
        InterfaceC34728a interfaceC34728aMo109675E0 = getOpenHelper().mo109675E0();
        if (!interfaceC34728aMo109675E0.mo109672v()) {
            C1835v invalidationTracker = getInvalidationTracker();
            invalidationTracker.getClass();
            AbstractC12889b.m36260Z(new C1829t(invalidationTracker, null, 1));
        }
        if (interfaceC34728aMo109675E0.mo109666Z0()) {
            interfaceC34728aMo109675E0.mo109664P();
        } else {
            interfaceC34728aMo109675E0.mo109673y();
        }
    }

    public abstract void clearAllTables();

    public void close() throws Exception {
        C22317a c22317a = this.closeBarrier;
        synchronized (c22317a) {
            if (c22317a.f87089c.compareAndSet(false, true)) {
                while (c22317a.f87088b.get() != 0) {
                }
                c22317a.f87087a.invoke();
            }
        }
    }

    public InterfaceC34735h compileStatement(String sql) {
        AbstractC22676k.m65750j(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().mo109675E0().mo109670r0(sql);
    }

    public List<AbstractC25380b> createAutoMigrations(Map<InterfaceC21461d, ? extends InterfaceC25379a> autoMigrationSpecs) {
        AbstractC22676k.m65750j(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(AbstractC21598x.m60663S((InterfaceC21461d) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final C1812n0 createConnectionManager$room_runtime(C1786g configuration) {
        AbstractC1788g1 abstractC1788g1;
        AbstractC22676k.m65750j(configuration, "configuration");
        try {
            InterfaceC1792h1 interfaceC1792h1CreateOpenDelegate = createOpenDelegate();
            AbstractC22676k.m65748h(interfaceC1792h1CreateOpenDelegate, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            abstractC1788g1 = (AbstractC1788g1) interfaceC1792h1CreateOpenDelegate;
        } catch (C23464j unused) {
            abstractC1788g1 = null;
        }
        if (abstractC1788g1 == null) {
            return new C1812n0(configuration, new C0428i(this, 2), new C1836v0(this));
        }
        return new C1812n0(configuration, abstractC1788g1, new C1839w0(2, this, AbstractC1772c1.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0));
    }

    public abstract C1835v createInvalidationTracker();

    public InterfaceC1792h1 createOpenDelegate() {
        throw new C23464j();
    }

    @InterfaceC23457c
    public InterfaceC34732e createOpenHelper(C1786g config) {
        AbstractC22676k.m65750j(config, "config");
        throw new C23464j();
    }

    @InterfaceC23457c
    public void endTransaction() {
        getOpenHelper().mo109675E0().mo109665V();
        if (inTransaction()) {
            return;
        }
        C1835v invalidationTracker = getInvalidationTracker();
        invalidationTracker.f7189c.m5423e(invalidationTracker.f7192f, invalidationTracker.f7193g);
    }

    @InterfaceC23457c
    public List<AbstractC25380b> getAutoMigrations(Map<Class<? extends InterfaceC25379a>, InterfaceC25379a> autoMigrationSpecs) {
        AbstractC22676k.m65750j(autoMigrationSpecs, "autoMigrationSpecs");
        return C25271y.f99162w;
    }

    public final C22317a getCloseBarrier$room_runtime() {
        return this.closeBarrier;
    }

    public final InterfaceC2994c0 getCoroutineScope() {
        InterfaceC2994c0 interfaceC2994c0 = this.coroutineScope;
        if (interfaceC2994c0 != null) {
            return interfaceC2994c0;
        }
        AbstractC22676k.m65757q("coroutineScope");
        throw null;
    }

    public final InterfaceC33688b getDriver() {
        C1786g c1786g = this.configuration;
        if (c1786g == null) {
            AbstractC22676k.m65757q("configuration");
            throw null;
        }
        InterfaceC33688b interfaceC33688b = c1786g.f7061t;
        if (interfaceC33688b != null) {
            return interfaceC33688b;
        }
        throw new IllegalStateException("No SQLiteDriver was configured with Room.");
    }

    public C1835v getInvalidationTracker() {
        C1835v c1835v = this.internalTracker;
        if (c1835v != null) {
            return c1835v;
        }
        AbstractC22676k.m65757q("internalTracker");
        throw null;
    }

    public InterfaceC34732e getOpenHelper() {
        C1812n0 c1812n0 = this.connectionManager;
        if (c1812n0 == null) {
            AbstractC22676k.m65757q("connectionManager");
            throw null;
        }
        InterfaceC34732e interfaceC34732e = c1812n0.f7124g;
        if (interfaceC34732e != null) {
            return interfaceC34732e;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final String getPath() {
        C1786g c1786g = this.configuration;
        if (c1786g == null) {
            AbstractC22676k.m65757q("configuration");
            throw null;
        }
        String str = c1786g.f7043b;
        if (str == null) {
            return null;
        }
        if (c1786g != null) {
            return c1786g.f7042a.getDatabasePath(str).getPath();
        }
        AbstractC22676k.m65757q("configuration");
        throw null;
    }

    public final InterfaceC30063j getQueryContext() {
        InterfaceC2994c0 interfaceC2994c0 = this.coroutineScope;
        if (interfaceC2994c0 != null) {
            return interfaceC2994c0.getCoroutineContext();
        }
        AbstractC22676k.m65757q("coroutineScope");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        AbstractC22676k.m65757q("internalQueryExecutor");
        throw null;
    }

    public Set<InterfaceC21461d> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends InterfaceC25379a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC21598x.m60666V((Class) it.next()));
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    @InterfaceC23457c
    public Set<Class<? extends InterfaceC25379a>> getRequiredAutoMigrationSpecs() {
        return C25235a0.f99113w;
    }

    public Map<InterfaceC21461d, List<InterfaceC21461d>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(AbstractC21598x.m60666V((Class) it3.next()));
            }
            linkedHashMap.put(interfaceC21461dM60666V, arrayList);
        }
        return linkedHashMap;
    }

    public final Map<InterfaceC21461d, List<InterfaceC21461d>> getRequiredTypeConverterClassesMap$room_runtime() {
        return getRequiredTypeConverterClasses();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return C25272z.f99163w;
    }

    public final ThreadLocal<InterfaceC30063j> getSuspendingTransactionContext() {
        return this.suspendingTransactionContext;
    }

    public final InterfaceC30063j getTransactionContext$room_runtime() {
        InterfaceC30063j interfaceC30063j = this.transactionContext;
        if (interfaceC30063j != null) {
            return interfaceC30063j;
        }
        AbstractC22676k.m65757q("transactionContext");
        throw null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        AbstractC22676k.m65757q("internalTransactionExecutor");
        throw null;
    }

    @InterfaceC23457c
    public <T> T getTypeConverter(Class<T> klass) {
        AbstractC22676k.m65750j(klass, "klass");
        return (T) this.typeConverters.get(AbstractC21598x.m60666V(klass));
    }

    public final boolean getUseTempTrackingTable$room_runtime() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode() {
        C1812n0 c1812n0 = this.connectionManager;
        if (c1812n0 != null) {
            return c1812n0.f7124g != null;
        }
        AbstractC22676k.m65757q("connectionManager");
        throw null;
    }

    public boolean inTransaction() {
        return isOpenInternal$room_runtime() && getOpenHelper().mo109675E0().mo109672v();
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x006f A[LOOP:0: B:3:0x0038->B:16:0x006f, LOOP_END] */
    public void init(C1786g configuration) {
        Executor executorC3046p0;
        InterfaceC30063j coroutineContext;
        boolean zContainsKey;
        int i13;
        int i14;
        AbstractC22676k.m65750j(configuration, "configuration");
        String str = configuration.f7043b;
        Intent intent = configuration.f7051j;
        InterfaceC30063j interfaceC30063j = configuration.f7062u;
        this.configuration = configuration;
        this.useTempTrackingTable = configuration.f7063v;
        this.connectionManager = createConnectionManager$room_runtime(configuration);
        this.internalTracker = createInvalidationTracker();
        C1830t0 c1830t0 = configuration.f7045d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<InterfaceC21461d> requiredAutoMigrationSpecClasses = getRequiredAutoMigrationSpecClasses();
        List list = configuration.f7059r;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        Iterator<InterfaceC21461d> it = requiredAutoMigrationSpecClasses.iterator();
        while (true) {
            int i15 = -1;
            if (!it.hasNext()) {
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i16 = size2 - 1;
                        if (size2 >= size || !zArr[size2]) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i16 < 0) {
                            break;
                        } else {
                            size2 = i16;
                        }
                    }
                }
                for (AbstractC25380b abstractC25380b : createAutoMigrations(linkedHashMap)) {
                    int i17 = abstractC25380b.startVersion;
                    int i18 = abstractC25380b.endVersion;
                    LinkedHashMap linkedHashMap2 = c1830t0.f7177a;
                    if (linkedHashMap2.containsKey(Integer.valueOf(i17))) {
                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i17));
                        if (map == null) {
                            map = C25272z.f99163w;
                        }
                        zContainsKey = map.containsKey(Integer.valueOf(i18));
                    } else {
                        zContainsKey = false;
                    }
                    if (!zContainsKey) {
                        c1830t0.m5452a(abstractC25380b);
                    }
                }
                Map<InterfaceC21461d, List<InterfaceC21461d>> requiredTypeConverterClassesMap$room_runtime = getRequiredTypeConverterClassesMap$room_runtime();
                List list2 = configuration.f7058q;
                boolean[] zArr2 = new boolean[list2.size()];
                for (Map.Entry<InterfaceC21461d, List<InterfaceC21461d>> entry : requiredTypeConverterClassesMap$room_runtime.entrySet()) {
                    InterfaceC21461d key = entry.getKey();
                    for (InterfaceC21461d interfaceC21461d : entry.getValue()) {
                        int size3 = list2.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i19 = size3 - 1;
                            if (interfaceC21461d.isInstance(list2.get(size3))) {
                                zArr2[size3] = true;
                                break;
                            } else {
                                if (i19 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i19;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + interfaceC21461d.getQualifiedName() + ") for " + key.getQualifiedName() + " is missing in the database configuration.").toString());
                        }
                        addTypeConverter$room_runtime(interfaceC21461d, list2.get(size3));
                    }
                }
                int size4 = list2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i24 = size4 - 1;
                        if (!zArr2[size4]) {
                            throw new IllegalArgumentException(AbstractC18489d0.m53369j(list2.get(size4), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                        }
                        if (i24 < 0) {
                            break;
                        } else {
                            size4 = i24;
                        }
                    }
                }
                InterfaceC34732e interfaceC34732e = null;
                if (interfaceC30063j != null) {
                    InterfaceC30061h interfaceC30061h = interfaceC30063j.get(C30058e.f122675w);
                    AbstractC22676k.m65748h(interfaceC30061h, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                    AbstractC3076z abstractC3076z = (AbstractC3076z) interfaceC30061h;
                    AbstractC2995c1 abstractC2995c1 = abstractC3076z instanceof AbstractC2995c1 ? (AbstractC2995c1) abstractC3076z : null;
                    if (abstractC2995c1 == null || (executorC3046p0 = abstractC2995c1.getExecutor()) == null) {
                        executorC3046p0 = new ExecutorC3046p0(abstractC3076z);
                    }
                    this.internalQueryExecutor = executorC3046p0;
                    this.internalTransactionExecutor = new ExecutorC1834u1(executorC3046p0, 0);
                    this.coroutineScope = AbstractC3006f0.m8708b(interfaceC30063j.plus(new C3004e2((InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w))));
                    if (inCompatibilityMode()) {
                        InterfaceC2994c0 interfaceC2994c0 = this.coroutineScope;
                        if (interfaceC2994c0 == null) {
                            AbstractC22676k.m65757q("coroutineScope");
                            throw null;
                        }
                        coroutineContext = interfaceC2994c0.getCoroutineContext().plus(abstractC3076z.limitedParallelism(1));
                    } else {
                        InterfaceC2994c0 interfaceC2994c1 = this.coroutineScope;
                        if (interfaceC2994c1 == null) {
                            AbstractC22676k.m65757q("coroutineScope");
                            throw null;
                        }
                        coroutineContext = interfaceC2994c1.getCoroutineContext();
                    }
                    this.transactionContext = coroutineContext;
                } else {
                    this.internalQueryExecutor = configuration.f7049h;
                    this.internalTransactionExecutor = new ExecutorC1834u1(configuration.f7050i, 0);
                    Executor executor = this.internalQueryExecutor;
                    if (executor == null) {
                        AbstractC22676k.m65757q("internalQueryExecutor");
                        throw null;
                    }
                    C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC3006f0.m8723q(executor).plus(AbstractC3006f0.m8710d()));
                    this.coroutineScope = c17171dM8708b;
                    InterfaceC30063j interfaceC30063j2 = c17171dM8708b.f65971w;
                    Executor executor2 = this.internalTransactionExecutor;
                    if (executor2 == null) {
                        AbstractC22676k.m65757q("internalTransactionExecutor");
                        throw null;
                    }
                    this.transactionContext = interfaceC30063j2.plus(AbstractC3006f0.m8723q(executor2));
                }
                this.allowMainThreadQueries = configuration.f7047f;
                C1812n0 c1812n0 = this.connectionManager;
                if (c1812n0 == null) {
                    AbstractC22676k.m65757q("connectionManager");
                    throw null;
                }
                InterfaceC34732e delegate = c1812n0.f7124g;
                if (delegate == null) {
                    delegate = null;
                    break;
                }
                while (!(delegate instanceof AbstractC26535c)) {
                    if (!(delegate instanceof InterfaceC1790h)) {
                        delegate = null;
                        break;
                    }
                    delegate = ((InterfaceC1790h) delegate).getDelegate();
                }
                C1812n0 c1812n1 = this.connectionManager;
                if (c1812n1 == null) {
                    AbstractC22676k.m65757q("connectionManager");
                    throw null;
                }
                InterfaceC34732e delegate2 = c1812n1.f7124g;
                if (delegate2 != null) {
                    while (true) {
                        if (delegate2 instanceof AbstractC26534b) {
                            interfaceC34732e = delegate2;
                            break;
                        } else if (!(delegate2 instanceof InterfaceC1790h)) {
                            break;
                        } else {
                            delegate2 = ((InterfaceC1790h) delegate2).getDelegate();
                        }
                    }
                }
                if (intent != null) {
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C1835v invalidationTracker = getInvalidationTracker();
                    Context context = configuration.f7042a;
                    invalidationTracker.getClass();
                    AbstractC22676k.m65750j(context, "context");
                    invalidationTracker.f7195i = intent;
                    invalidationTracker.f7196j = new C1771c0(context, str, invalidationTracker);
                    return;
                }
                return;
            }
            InterfaceC21461d next = it.next();
            int size5 = list.size() - 1;
            if (size5 >= 0) {
                while (true) {
                    int i25 = size5 - 1;
                    i13 = i15;
                    if (next.isInstance(list.get(size5))) {
                        zArr[size5] = true;
                        i14 = size5;
                        break;
                    } else if (i25 >= 0) {
                        size5 = i25;
                        i15 = i13;
                    }
                }
                if (i14 >= 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getQualifiedName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(next, list.get(i14));
            } else {
                i13 = -1;
            }
            i14 = i13;
            if (i14 >= 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + next.getQualifiedName() + ") is missing in the database configuration.").toString());
            }
            linkedHashMap.put(next, list.get(i14));
        }
    }

    @InterfaceC23457c
    public void internalInitInvalidationTracker(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
        internalInitInvalidationTracker(new C37024a(db4));
    }

    public final boolean isMainThread$room_runtime() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        C1812n0 c1812n0 = this.connectionManager;
        if (c1812n0 == null) {
            AbstractC22676k.m65757q("connectionManager");
            throw null;
        }
        InterfaceC34728a interfaceC34728a = c1812n0.f7125h;
        if (interfaceC34728a != null) {
            return interfaceC34728a.isOpen();
        }
        return false;
    }

    public final boolean isOpenInternal$room_runtime() {
        C1812n0 c1812n0 = this.connectionManager;
        if (c1812n0 == null) {
            AbstractC22676k.m65757q("connectionManager");
            throw null;
        }
        InterfaceC34728a interfaceC34728a = c1812n0.f7125h;
        if (interfaceC34728a != null) {
            return interfaceC34728a.isOpen();
        }
        return false;
    }

    public final void performClear(boolean z4, String... tableNames) {
        AbstractC22676k.m65750j(tableNames, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        AbstractC12889b.m36260Z(new C1845y0(this, z4, tableNames, null, 0));
    }

    public final Cursor query(InterfaceC34734g query) {
        AbstractC22676k.m65750j(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(Runnable body) {
        AbstractC22676k.m65750j(body, "body");
        m5464a(new C0438l0(body, 1));
    }

    @InterfaceC23457c
    public void setTransactionSuccessful() {
        getOpenHelper().mo109675E0().mo109663O();
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z4) {
        this.useTempTrackingTable = z4;
    }

    public final <R> Object useConnection(boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super R> interfaceC30057d) {
        C1812n0 c1812n0 = this.connectionManager;
        if (c1812n0 != null) {
            return c1812n0.f7123f.mo68210A0(z4, interfaceC4351m, interfaceC30057d);
        }
        AbstractC22676k.m65757q("connectionManager");
        throw null;
    }

    public final <T> T getTypeConverter(InterfaceC21461d klass) {
        AbstractC22676k.m65750j(klass, "klass");
        T t14 = (T) this.typeConverters.get(klass);
        AbstractC22676k.m65748h(t14, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t14;
    }

    public final void internalInitInvalidationTracker(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        C1835v invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        C1797i2 c1797i2 = invalidationTracker.f7189c;
        c1797i2.getClass();
        InterfaceC33689c interfaceC33689cMo68212g1 = connection.mo68212g1("PRAGMA query_only");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            boolean zMo5352B0 = interfaceC33689cMo68212g1.mo5352B0();
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            if (!zMo5352B0) {
                AbstractC17269i.m48864K("PRAGMA temp_store = MEMORY", connection);
                AbstractC17269i.m48864K("PRAGMA recursive_triggers = 1", connection);
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS room_table_modification_log", connection);
                if (c1797i2.f7095d) {
                    AbstractC17269i.m48864K("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", connection);
                } else {
                    AbstractC17269i.m48864K(AbstractC39421y.m125926K("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false), connection);
                }
                C1787g0 c1787g0 = c1797i2.f7099h;
                ReentrantLock reentrantLock = c1787g0.f7064a;
                reentrantLock.lock();
                try {
                    c1787g0.f7067d = true;
                    reentrantLock.unlock();
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
            synchronized (invalidationTracker.f7197k) {
                try {
                    C1771c0 c1771c0 = invalidationTracker.f7196j;
                    if (c1771c0 != null) {
                        Intent intent = invalidationTracker.f7195i;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        c1771c0.m5365b(intent);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th5);
                throw th6;
            }
        }
    }

    public Cursor query(String query, Object[] objArr) {
        AbstractC22676k.m65750j(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().mo109675E0().mo109669l0(new C28539n0(7, query, objArr));
    }

    public <V> V runInTransaction(Callable<V> body) {
        AbstractC22676k.m65750j(body, "body");
        return (V) m5464a(new C0438l0(body, 2));
    }

    public Cursor query(InterfaceC34734g query, CancellationSignal cancellationSignal) {
        AbstractC22676k.m65750j(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().mo109675E0().mo109667b1(query, cancellationSignal);
        }
        return getOpenHelper().mo109675E0().mo109669l0(query);
    }
}
