package xt0;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eu0.InterfaceC13640a;
import fu0.InterfaceC14776a;
import gu0.C16209a;
import java.util.List;
import java.util.concurrent.CancellationException;
import l83.C23467m;
import l83.C23468n;
import p031b9.AbstractC2875y;
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

/* JADX INFO: renamed from: xt0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lxt0/a;", "Leu0/a;", "Lfu0/a;", "dao", "Ltr2/n;", "logger", "<init>", "(Lfu0/a;Ltr2/n;)V", "", "Lgu0/a;", "rows", "", "c", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "count", "b", "(ILq83/d;)Ljava/lang/Object;", "a", "Lfu0/a;", "Ltr2/n;", "connectivity-data-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38642a implements InterfaceC13640a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14776a dao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: xt0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityDataPackets.rawdata.Rev2DataSettingsRepositoryImpl", m100430f = "Rev2DataSettingsRepositoryImpl.kt", m100431l = {21}, m100432m = "delete", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f166183w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f166184x;

        /* JADX INFO: renamed from: z */
        int f166186z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f166184x = obj;
            this.f166186z |= Integer.MIN_VALUE;
            return C38642a.this.mo38434a(null, this);
        }
    }

    /* JADX INFO: renamed from: xt0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityDataPackets.rawdata.Rev2DataSettingsRepositoryImpl", m100430f = "Rev2DataSettingsRepositoryImpl.kt", m100431l = {14}, m100432m = ProfileAnalyticsKt.SAVE, m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f166188F;

        /* JADX INFO: renamed from: w */
        Object f166189w;

        /* JADX INFO: renamed from: x */
        int f166190x;

        /* JADX INFO: renamed from: y */
        int f166191y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f166192z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f166192z = obj;
            this.f166188F |= Integer.MIN_VALUE;
            return C38642a.this.mo38436c(null, this);
        }
    }

    public C38642a(InterfaceC14776a dao, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(logger, "logger");
        this.dao = dao;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eu0.InterfaceC13640a
    /* JADX INFO: renamed from: a */
    public Object mo38434a(List<C16209a> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f166186z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f166186z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo42388a = aVar.f166184x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f166186z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo42388a);
            InterfaceC14776a interfaceC14776a = this.dao;
            aVar.f166183w = null;
            aVar.f166186z = 1;
            objMo42388a = interfaceC14776a.mo42388a(list, aVar);
            if (objMo42388a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo42388a);
        }
        this.logger.mo85228t(AbstractC2875y.m8296i(((Number) objMo42388a).intValue(), "Deleted ", " Rev2 data settings frames"), new AbstractC30556a.a[0]);
        return objMo42388a;
    }

    @Override // eu0.InterfaceC13640a
    /* JADX INFO: renamed from: b */
    public Object mo38435b(int i13, InterfaceC30057d<? super List<C16209a>> interfaceC30057d) {
        return this.dao.mo42389b(i13, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eu0.InterfaceC13640a
    /* JADX INFO: renamed from: c */
    public Object mo38436c(List<C16209a> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        Object objM107888l;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f166188F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f166188F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objInsertAll = bVar.f166192z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f166188F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objInsertAll);
                InterfaceC14776a interfaceC14776a = this.dao;
                bVar.f166189w = list;
                bVar.f166190x = 0;
                bVar.f166191y = 0;
                bVar.f166188F = 1;
                objInsertAll = interfaceC14776a.insertAll(list, bVar);
                if (objInsertAll == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) bVar.f166189w;
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
            this.logger.mo85228t(AbstractC2875y.m8296i(list.size(), "Saved ", " Rev2 data settings frames"), new AbstractC30556a.a[0]);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            this.logger.mo85230v(AbstractC2875y.m8296i(list.size(), "Failed to save ", " Rev2 data settings frames"), thM68037a, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z13);
    }

    public /* synthetic */ C38642a(InterfaceC14776a interfaceC14776a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC14776a, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("Rev2DataSettingsRepository") : interfaceC34116n);
    }
}
