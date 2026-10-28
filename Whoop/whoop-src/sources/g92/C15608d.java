package g92;

import com.whoop.data.local.room.dao.persistent.RawDataDao;
import cu0.C11113a;
import cu0.InterfaceC11114b;
import du0.C12374a;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import or2.AbstractC28209v1;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: g92.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010!\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$¨\u0006%"}, m65681d2 = {"Lg92/d;", "Lcu0/b;", "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;", "rawDataDao", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/data/local/room/dao/persistent/RawDataDao;Ltr2/n;)V", "", "", "f", "(S)Ljava/lang/String;", "Ll83/a0;", "g", "(Lq83/d;)Ljava/lang/Object;", "revision", "Lcu0/a;", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "numberOfPackets", "", "Ldu0/a;", "b", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "Lnt0/h;", "listRawDataPacket", "Lcu0/c;", "strapInfo", "", "a", "(Ljava/util/List;Lcu0/c;Lq83/d;)Ljava/lang/Object;", "rawDataDtoList", "c", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;", "Ltr2/n;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15608d implements InterfaceC11114b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final RawDataDao rawDataDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g92.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.firmware.rawdatacollection.RawDataRepositoryImpl", m100430f = "RawDataRepositoryImpl.kt", m100431l = {95}, m100432m = "deleteByMatchingPackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f58591w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f58592x;

        /* JADX INFO: renamed from: z */
        int f58594z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f58592x = obj;
            this.f58594z |= Integer.MIN_VALUE;
            return C15608d.this.mo30082c(null, this);
        }
    }

    /* JADX INFO: renamed from: g92.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.firmware.rawdatacollection.RawDataRepositoryImpl", m100430f = "RawDataRepositoryImpl.kt", m100431l = {20}, m100432m = "getRawDataMetadataForRevision", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f58595w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f58596x;

        /* JADX INFO: renamed from: z */
        int f58598z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f58596x = obj;
            this.f58598z |= Integer.MIN_VALUE;
            return C15608d.this.mo30083d(null, this);
        }
    }

    /* JADX INFO: renamed from: g92.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.firmware.rawdatacollection.RawDataRepositoryImpl", m100430f = "RawDataRepositoryImpl.kt", m100431l = {105, 106, 107, 108}, m100432m = "logCurrentTimeBounds", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f58600F;

        /* JADX INFO: renamed from: w */
        Object f58601w;

        /* JADX INFO: renamed from: x */
        Object f58602x;

        /* JADX INFO: renamed from: y */
        Object f58603y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f58604z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f58604z = obj;
            this.f58600F |= Integer.MIN_VALUE;
            return C15608d.this.m43924g(this);
        }
    }

    /* JADX INFO: renamed from: g92.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.firmware.rawdatacollection.RawDataRepositoryImpl", m100430f = "RawDataRepositoryImpl.kt", m100431l = {70, 72}, m100432m = "saveListOfRawDataPackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f58606F;

        /* JADX INFO: renamed from: w */
        Object f58607w;

        /* JADX INFO: renamed from: x */
        Object f58608x;

        /* JADX INFO: renamed from: y */
        Object f58609y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f58610z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f58610z = obj;
            this.f58606F |= Integer.MIN_VALUE;
            return C15608d.this.mo30080a(null, null, this);
        }
    }

    public C15608d(RawDataDao rawDataDao, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(rawDataDao, "rawDataDao");
        AbstractC22676k.m65750j(logger, "logger");
        this.rawDataDao = rawDataDao;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: f */
    private final String m43923f(short s13) {
        return AbstractC2875y.m8295h(s13, "R");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m43924g(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        Long l7;
        Long l12;
        Object newestTimestampByPacketVersion;
        Long l13;
        Long l14;
        Object oldestTimestampByPacketVersion;
        Long l15;
        Long l16;
        Long l17;
        Long l18;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f58600F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f58600F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object newestTimestampByPacketVersion2 = cVar.f58604z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f58600F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(newestTimestampByPacketVersion2);
            RawDataDao rawDataDao = this.rawDataDao;
            cVar.f58600F = 1;
            newestTimestampByPacketVersion2 = rawDataDao.getNewestTimestampByPacketVersion("R10", cVar);
            if (newestTimestampByPacketVersion2 != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(newestTimestampByPacketVersion2);
        } else {
            if (i14 == 2) {
                l7 = (Long) cVar.f58601w;
                AbstractC34132o.m107864I(newestTimestampByPacketVersion2);
                l12 = (Long) newestTimestampByPacketVersion2;
                RawDataDao rawDataDao2 = this.rawDataDao;
                cVar.f58601w = l7;
                cVar.f58602x = l12;
                cVar.f58600F = 3;
                newestTimestampByPacketVersion = rawDataDao2.getNewestTimestampByPacketVersion("R11", cVar);
                if (newestTimestampByPacketVersion != enumC31071a) {
                    l13 = l12;
                    newestTimestampByPacketVersion2 = newestTimestampByPacketVersion;
                    l14 = (Long) newestTimestampByPacketVersion2;
                    RawDataDao rawDataDao3 = this.rawDataDao;
                    cVar.f58601w = l7;
                    cVar.f58602x = l13;
                    cVar.f58603y = l14;
                    cVar.f58600F = 4;
                    oldestTimestampByPacketVersion = rawDataDao3.getOldestTimestampByPacketVersion("R11", cVar);
                    if (oldestTimestampByPacketVersion != enumC31071a) {
                        l15 = l14;
                        newestTimestampByPacketVersion2 = oldestTimestampByPacketVersion;
                        l16 = l7;
                        l17 = l13;
                    }
                }
                return enumC31071a;
            }
            if (i14 == 3) {
                Long l19 = (Long) cVar.f58602x;
                Long l24 = (Long) cVar.f58601w;
                AbstractC34132o.m107864I(newestTimestampByPacketVersion2);
                l13 = l19;
                l7 = l24;
                l14 = (Long) newestTimestampByPacketVersion2;
                RawDataDao rawDataDao4 = this.rawDataDao;
                cVar.f58601w = l7;
                cVar.f58602x = l13;
                cVar.f58603y = l14;
                cVar.f58600F = 4;
                oldestTimestampByPacketVersion = rawDataDao4.getOldestTimestampByPacketVersion("R11", cVar);
                if (oldestTimestampByPacketVersion != enumC31071a) {
                    l15 = l14;
                    newestTimestampByPacketVersion2 = oldestTimestampByPacketVersion;
                    l16 = l7;
                    l17 = l13;
                }
                return enumC31071a;
            }
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l15 = (Long) cVar.f58603y;
            l17 = (Long) cVar.f58602x;
            l16 = (Long) cVar.f58601w;
            AbstractC34132o.m107864I(newestTimestampByPacketVersion2);
        }
        l18 = (Long) newestTimestampByPacketVersion2;
        if (l16 != null && l17 != null) {
            this.logger.mo85216g(AbstractC31061c.m95640p("Current R10 timestamps in Room DB = ", AbstractC28209v1.m85388b(l17.longValue()), " - ", AbstractC28209v1.m85388b(l16.longValue())), new AbstractC30556a.a[0]);
        }
        if (l15 != null && l18 != null) {
            this.logger.mo85216g(AbstractC31061c.m95640p("Current R11 timestamps in Room DB = ", AbstractC28209v1.m85388b(l18.longValue()), " - ", AbstractC28209v1.m85388b(l15.longValue())), new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
        l7 = (Long) newestTimestampByPacketVersion2;
        RawDataDao rawDataDao5 = this.rawDataDao;
        cVar.f58601w = l7;
        cVar.f58600F = 2;
        newestTimestampByPacketVersion2 = rawDataDao5.getOldestTimestampByPacketVersion("R10", cVar);
        if (newestTimestampByPacketVersion2 != enumC31071a) {
            l12 = (Long) newestTimestampByPacketVersion2;
            RawDataDao rawDataDao6 = this.rawDataDao;
            cVar.f58601w = l7;
            cVar.f58602x = l12;
            cVar.f58600F = 3;
            newestTimestampByPacketVersion = rawDataDao6.getNewestTimestampByPacketVersion("R11", cVar);
            if (newestTimestampByPacketVersion != enumC31071a) {
                l13 = l12;
                newestTimestampByPacketVersion2 = newestTimestampByPacketVersion;
                l14 = (Long) newestTimestampByPacketVersion2;
                RawDataDao rawDataDao7 = this.rawDataDao;
                cVar.f58601w = l7;
                cVar.f58602x = l13;
                cVar.f58603y = l14;
                cVar.f58600F = 4;
                oldestTimestampByPacketVersion = rawDataDao7.getOldestTimestampByPacketVersion("R11", cVar);
                if (oldestTimestampByPacketVersion != enumC31071a) {
                    l15 = l14;
                    newestTimestampByPacketVersion2 = oldestTimestampByPacketVersion;
                    l16 = l7;
                    l17 = l13;
                    l18 = (Long) newestTimestampByPacketVersion2;
                    if (l16 != null) {
                        this.logger.mo85216g(AbstractC31061c.m95640p("Current R10 timestamps in Room DB = ", AbstractC28209v1.m85388b(l17.longValue()), " - ", AbstractC28209v1.m85388b(l16.longValue())), new AbstractC30556a.a[0]);
                    }
                    if (l15 != null) {
                        this.logger.mo85216g(AbstractC31061c.m95640p("Current R11 timestamps in Room DB = ", AbstractC28209v1.m85388b(l18.longValue()), " - ", AbstractC28209v1.m85388b(l15.longValue())), new AbstractC30556a.a[0]);
                    }
                    return C23454a0.f92919a;
                }
            }
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        if (m43924g(r3) == r4) goto L34;
     */
    @Override // cu0.InterfaceC11114b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo30080a(java.util.List<? extends nt0.AbstractC27120h> r22, cu0.C11115c r23, q83.InterfaceC30057d<? super java.lang.Boolean> r24) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g92.C15608d.mo30080a(java.util.List, cu0.c, q83.d):java.lang.Object");
    }

    @Override // cu0.InterfaceC11114b
    /* JADX INFO: renamed from: b */
    public Object mo30081b(String str, int i13, InterfaceC30057d<? super List<C12374a>> interfaceC30057d) {
        return this.rawDataDao.getPacketsByRevisionAndCount(str, i13, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cu0.InterfaceC11114b
    /* JADX INFO: renamed from: c */
    public Object mo30082c(List<C12374a> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f58594z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f58594z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objDeleteByPacketsList = aVar.f58592x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f58594z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objDeleteByPacketsList);
            RawDataDao rawDataDao = this.rawDataDao;
            aVar.f58591w = null;
            aVar.f58594z = 1;
            objDeleteByPacketsList = rawDataDao.deleteByPacketsList(list, aVar);
            if (objDeleteByPacketsList == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objDeleteByPacketsList);
        }
        this.logger.mo85228t(AbstractC2875y.m8296i(((Number) objDeleteByPacketsList).intValue(), "Deleted ", " packets after a successful upload"), new AbstractC30556a.a[0]);
        return objDeleteByPacketsList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cu0.InterfaceC11114b
    /* JADX INFO: renamed from: d */
    public Object mo30083d(String str, InterfaceC30057d<? super C11113a> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f58598z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f58598z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object packetsByRevisionAndCount = bVar.f58596x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f58598z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(packetsByRevisionAndCount);
            RawDataDao rawDataDao = this.rawDataDao;
            bVar.f58595w = null;
            bVar.f58598z = 1;
            packetsByRevisionAndCount = rawDataDao.getPacketsByRevisionAndCount(str, 1, bVar);
            if (packetsByRevisionAndCount == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(packetsByRevisionAndCount);
        }
        List list = (List) packetsByRevisionAndCount;
        if (list.isEmpty()) {
            return null;
        }
        C12374a c12374a = (C12374a) AbstractC25265s.m74096F0(list);
        return new C11113a(c12374a.getHardwareVersion(), c12374a.getMaximVersion(), c12374a.getDspVersion(), c12374a.getStrapId(), c12374a.getBinaryVersion(), c12374a.getBinaryFlags(), c12374a.getRawDataVersion());
    }
}
