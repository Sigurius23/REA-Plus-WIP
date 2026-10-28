package xt0;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eu0.InterfaceC13641b;
import fu0.InterfaceC14779d;
import gu0.C16211c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import l83.C23467m;
import l83.C23468n;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: xt0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lxt0/b;", "Leu0/b;", "Lfu0/d;", "dao", "Ltr2/n;", "logger", "<init>", "(Lfu0/d;Ltr2/n;)V", "", "Lgu0/c;", "rows", "", "c", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "count", "b", "(ILq83/d;)Ljava/lang/Object;", "a", "Lfu0/d;", "Ltr2/n;", "connectivity-data-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38643b implements InterfaceC13641b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14779d dao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: xt0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityDataPackets.rawdata.Rev2RawDataRepositoryImpl", m100430f = "Rev2RawDataRepositoryImpl.kt", m100431l = {24}, m100432m = "delete", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f166195w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f166196x;

        /* JADX INFO: renamed from: z */
        int f166198z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f166196x = obj;
            this.f166198z |= Integer.MIN_VALUE;
            return C38643b.this.mo38437a(null, this);
        }
    }

    /* JADX INFO: renamed from: xt0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityDataPackets.rawdata.Rev2RawDataRepositoryImpl", m100430f = "Rev2RawDataRepositoryImpl.kt", m100431l = {14}, m100432m = ProfileAnalyticsKt.SAVE, m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f166200F;

        /* JADX INFO: renamed from: w */
        Object f166201w;

        /* JADX INFO: renamed from: x */
        int f166202x;

        /* JADX INFO: renamed from: y */
        int f166203y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f166204z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f166204z = obj;
            this.f166200F |= Integer.MIN_VALUE;
            return C38643b.this.mo38439c(null, this);
        }
    }

    public C38643b(InterfaceC14779d dao, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(logger, "logger");
        this.dao = dao;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eu0.InterfaceC13641b
    /* JADX INFO: renamed from: a */
    public Object mo38437a(List<C16211c> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f166198z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f166198z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo42402a = aVar.f166196x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f166198z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo42402a);
            InterfaceC14779d interfaceC14779d = this.dao;
            aVar.f166195w = null;
            aVar.f166198z = 1;
            objMo42402a = interfaceC14779d.mo42402a(list, aVar);
            if (objMo42402a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo42402a);
        }
        this.logger.mo85228t(AbstractC2875y.m8296i(((Number) objMo42402a).intValue(), "Deleted ", " Rev2 raw data frames"), new AbstractC30556a.a[0]);
        return objMo42402a;
    }

    @Override // eu0.InterfaceC13641b
    /* JADX INFO: renamed from: b */
    public Object mo38438b(int i13, InterfaceC30057d<? super List<C16211c>> interfaceC30057d) {
        return this.dao.mo42403b(i13, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eu0.InterfaceC13641b
    /* JADX INFO: renamed from: c */
    public Object mo38439c(List<C16211c> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        Object objM107888l;
        int i13;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f166200F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f166200F = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objInsertAll = bVar.f166204z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f166200F;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objInsertAll);
                InterfaceC14779d interfaceC14779d = this.dao;
                bVar.f166201w = list;
                bVar.f166202x = 0;
                bVar.f166203y = 0;
                bVar.f166200F = 1;
                objInsertAll = interfaceC14779d.insertAll(list, bVar);
                if (objInsertAll == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) bVar.f166201w;
                AbstractC34132o.m107864I(objInsertAll);
            }
            objM107888l = (List) objInsertAll;
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e13) {
            objM107888l = AbstractC34132o.m107888l(e13);
        }
        boolean z4 = objM107888l instanceof C23467m;
        boolean z13 = !z4;
        if (!z4) {
            List list2 = (List) objM107888l;
            List list3 = list2;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                i13 = 0;
            } else {
                Iterator it = list3.iterator();
                i13 = 0;
                while (it.hasNext()) {
                    if (((Number) it.next()).longValue() == -1 && (i13 = i13 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
            this.logger.mo85228t(AbstractC25012a.m73372e(list2.size() - i13, i13, "Saved ", " Rev2 raw data frames, ignored ", " already stored"), new AbstractC30556a.a[0]);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            this.logger.mo85230v(AbstractC2875y.m8296i(list.size(), "Failed to save ", " Rev2 raw data frames"), thM68037a, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z13);
    }

    public /* synthetic */ C38643b(InterfaceC14779d interfaceC14779d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC14779d, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("Rev2RawDataRepository") : interfaceC34116n);
    }
}
