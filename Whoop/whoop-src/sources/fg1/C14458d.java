package fg1;

import android.database.sqlite.SQLiteException;
import au0.InterfaceC2050a;
import bu0.C3634a;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: fg1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lfg1/d;", "Lfg1/c;", "Ltr2/n;", "logger", "Lau0/a;", "strapFirmwareEventsDao", "<init>", "(Ltr2/n;Lau0/a;)V", "", "Lbu0/a;", "eventsList", "Ll83/a0;", "c", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "oldestTimeStamp", "newestTimestamp", "d", "(JJLq83/d;)Ljava/lang/Object;", "", "versionId", "numberOfRecords", "a", "(IILq83/d;)Ljava/lang/Object;", "b", "(Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "Lau0/a;", "firmware-events_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14458d implements InterfaceC14457c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2050a strapFirmwareEventsDao;

    /* JADX INFO: renamed from: fg1.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.domain.FirmwareEventsRoomInteractorImpl", m100430f = "FirmwareEventsRoomInteractor.kt", m100431l = {36}, m100432m = "deleteRowsByTimeStamps", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f52763E;

        /* JADX INFO: renamed from: w */
        long f52764w;

        /* JADX INFO: renamed from: x */
        long f52765x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f52766y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f52766y = obj;
            this.f52763E |= Integer.MIN_VALUE;
            return C14458d.this.mo41191d(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: fg1.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.domain.FirmwareEventsRoomInteractorImpl", m100430f = "FirmwareEventsRoomInteractor.kt", m100431l = {46}, m100432m = "getEventsByVersion", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f52768E;

        /* JADX INFO: renamed from: w */
        int f52769w;

        /* JADX INFO: renamed from: x */
        int f52770x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f52771y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f52771y = obj;
            this.f52768E |= Integer.MIN_VALUE;
            return C14458d.this.mo41188a(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: fg1.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.domain.FirmwareEventsRoomInteractorImpl", m100430f = "FirmwareEventsRoomInteractor.kt", m100431l = {58}, m100432m = "getOldestVersionId", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f52773w;

        /* JADX INFO: renamed from: y */
        int f52775y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f52773w = obj;
            this.f52775y |= Integer.MIN_VALUE;
            return C14458d.this.mo41189b(this);
        }
    }

    /* JADX INFO: renamed from: fg1.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareEvents.domain.FirmwareEventsRoomInteractorImpl", m100430f = "FirmwareEventsRoomInteractor.kt", m100431l = {26}, m100432m = "saveInDb", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f52776w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f52777x;

        /* JADX INFO: renamed from: z */
        int f52779z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f52777x = obj;
            this.f52779z |= Integer.MIN_VALUE;
            return C14458d.this.mo41190c(null, this);
        }
    }

    public C14458d(InterfaceC34116n logger, InterfaceC2050a strapFirmwareEventsDao) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(strapFirmwareEventsDao, "strapFirmwareEventsDao");
        this.logger = logger;
        this.strapFirmwareEventsDao = strapFirmwareEventsDao;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fg1.InterfaceC14457c
    /* JADX INFO: renamed from: a */
    public Object mo41188a(int i13, int i14, InterfaceC30057d<? super List<C3634a>> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i15 = bVar.f52768E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f52768E = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo6458e = bVar.f52771y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = bVar.f52768E;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(objMo6458e);
                InterfaceC2050a interfaceC2050a = this.strapFirmwareEventsDao;
                bVar.f52769w = i13;
                bVar.f52770x = i14;
                bVar.f52768E = 1;
                objMo6458e = interfaceC2050a.mo6458e(i13, i14, bVar);
                if (objMo6458e == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = bVar.f52769w;
                AbstractC34132o.m107864I(objMo6458e);
            }
            return (List) objMo6458e;
        } catch (SQLiteException e5) {
            this.logger.mo85230v(AbstractC2875y.m8295h(i13, "Error fetching strap firmware events by version "), e5, new AbstractC30556a.a[0]);
            return C25271y.f99162w;
        } catch (Exception e13) {
            this.logger.mo85230v(AbstractC2875y.m8295h(i13, "Something went wrong when trying to get firmware event packets by version "), e13, new AbstractC30556a.a[0]);
            return C25271y.f99162w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fg1.InterfaceC14457c
    /* JADX INFO: renamed from: b */
    public Object mo41189b(InterfaceC30057d<? super Integer> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f52775y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f52775y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo6456b = cVar.f52773w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f52775y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo6456b);
                InterfaceC2050a interfaceC2050a = this.strapFirmwareEventsDao;
                cVar.f52775y = 1;
                objMo6456b = interfaceC2050a.mo6456b(cVar);
                if (objMo6456b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo6456b);
            }
            return (Integer) objMo6456b;
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Error fetching oldest version ID", e5, new AbstractC30556a.a[0]);
            return null;
        } catch (Exception e13) {
            this.logger.mo85230v("Something went wrong when trying to get oldest version ID", e13, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fg1.InterfaceC14457c
    /* JADX INFO: renamed from: c */
    public Object mo41190c(List<C3634a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f52779z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f52779z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f52777x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f52779z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC2050a interfaceC2050a = this.strapFirmwareEventsDao;
                dVar.f52776w = null;
                dVar.f52779z = 1;
                if (interfaceC2050a.insertList(list, dVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Error inserting strap firmware events list", e5, new AbstractC30556a.a[0]);
        } catch (Exception e13) {
            this.logger.mo85230v("Something went wrong when trying to insert list of firmware events in room db", e13, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // fg1.InterfaceC14457c
    /* JADX INFO: renamed from: d */
    public Object mo41191d(long j7, long j13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f52763E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f52763E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f52766y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f52763E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC2050a interfaceC2050a = this.strapFirmwareEventsDao;
                aVar2.f52764w = j7;
                aVar2.f52765x = j13;
                aVar2.f52763E = 1;
                if (interfaceC2050a.mo6459f(j7, j13, aVar2) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Error deleting strap firmware events", e5, new AbstractC30556a.a[0]);
        } catch (Exception e13) {
            this.logger.mo85230v("Something went wrong when trying to delete list of firmware events", e13, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }
}
