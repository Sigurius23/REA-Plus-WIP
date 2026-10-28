package wh1;

import com.mapbox.maps.MapboxMap;
import ii1.InterfaceC18571a;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js0.AbstractC21909c;
import m83.AbstractC25267u;
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
import uh1.InterfaceC34966a;
import vh1.C36045a;
import yh1.C39540a;

/* JADX INFO: renamed from: wh1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lwh1/a;", "Lii1/a;", "Luh1/a;", "gpsLocationDao", "Ljs0/c;", "configurationRepository", "Ltr2/n;", "logger", "<init>", "(Luh1/a;Ljs0/c;Ltr2/n;)V", "", MapboxMap.QFE_LIMIT, "", "Lyh1/a;", "b", "(ILq83/d;)Ljava/lang/Object;", "", "timestamps", "a", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "location", "Ll83/a0;", "c", "(Lyh1/a;Lq83/d;)Ljava/lang/Object;", "Luh1/a;", "Ljs0/c;", "Ltr2/n;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37299a implements InterfaceC18571a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34966a gpsLocationDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: wh1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gps.data.repository.RoomGpsStorage", m100430f = "RoomGpsStorage.kt", m100431l = {30}, m100432m = "deleteByTimestamps", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f159462w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f159463x;

        /* JADX INFO: renamed from: z */
        int f159465z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159463x = obj;
            this.f159465z |= Integer.MIN_VALUE;
            return C37299a.this.mo53784a(null, this);
        }
    }

    /* JADX INFO: renamed from: wh1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gps.data.repository.RoomGpsStorage", m100430f = "RoomGpsStorage.kt", m100431l = {25}, m100432m = "fetchGpsLocation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f159466w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f159467x;

        /* JADX INFO: renamed from: z */
        int f159469z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159467x = obj;
            this.f159469z |= Integer.MIN_VALUE;
            return C37299a.this.mo53785b(0, this);
        }
    }

    /* JADX INFO: renamed from: wh1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gps.data.repository.RoomGpsStorage", m100430f = "RoomGpsStorage.kt", m100431l = {40, 42, 47}, m100432m = "insert", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f159470E;

        /* JADX INFO: renamed from: G */
        int f159472G;

        /* JADX INFO: renamed from: w */
        Object f159473w;

        /* JADX INFO: renamed from: x */
        Object f159474x;

        /* JADX INFO: renamed from: y */
        int f159475y;

        /* JADX INFO: renamed from: z */
        int f159476z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159470E = obj;
            this.f159472G |= Integer.MIN_VALUE;
            return C37299a.this.mo53786c(null, this);
        }
    }

    public C37299a(InterfaceC34966a gpsLocationDao, AbstractC21909c configurationRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(gpsLocationDao, "gpsLocationDao");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.gpsLocationDao = gpsLocationDao;
        this.configurationRepository = configurationRepository;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ii1.InterfaceC18571a
    /* JADX INFO: renamed from: a */
    public Object mo53784a(List<Long> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        a aVar;
        int iIntValue;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f159465z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f159465z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo110430a = aVar.f159463x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f159465z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo110430a);
                InterfaceC34966a interfaceC34966a = this.gpsLocationDao;
                aVar.f159462w = list;
                aVar.f159465z = 1;
                objMo110430a = interfaceC34966a.mo110430a(list, aVar);
                if (objMo110430a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo110430a);
            }
            iIntValue = ((Number) objMo110430a).intValue();
        } catch (SQLException e5) {
            this.logger.mo85230v(AbstractC2875y.m8296i(list.size(), "Failed to delete GPS locations by timestamps=", " items"), e5, new AbstractC30556a.a[0]);
            iIntValue = 0;
        }
        return new Integer(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ii1.InterfaceC18571a
    /* JADX INFO: renamed from: b */
    public Object mo53785b(int i13, InterfaceC30057d<? super List<C39540a>> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f159469z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f159469z = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo110431b = bVar.f159467x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f159469z;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objMo110431b);
            InterfaceC34966a interfaceC34966a = this.gpsLocationDao;
            bVar.f159466w = i13;
            bVar.f159469z = 1;
            objMo110431b = interfaceC34966a.mo110431b(i13, bVar);
            if (objMo110431b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo110431b);
        }
        Iterable iterable = (Iterable) objMo110431b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C36045a) it.next()).m114431k());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00da A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0107 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010c A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0118 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0120 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0125 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0131 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:67:0x013d A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0145 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0178 A[Catch: SQLException -> 0x003a, TryCatch #0 {SQLException -> 0x003a, blocks: (B:14:0x0035, B:21:0x004d, B:33:0x0086, B:35:0x00b0, B:37:0x00b8, B:67:0x013d, B:69:0x0145, B:72:0x0178, B:73:0x017f, B:39:0x00c1, B:41:0x00cd, B:43:0x00d5, B:44:0x00da, B:46:0x00e6, B:48:0x00ee, B:49:0x00f3, B:51:0x00ff, B:53:0x0107, B:54:0x010c, B:56:0x0118, B:58:0x0120, B:59:0x0125, B:61:0x0131, B:24:0x0059, B:30:0x0076, B:27:0x0060), top: B:77:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0175, code lost:
    
        if (r0.mo110433d(r13, r1) == r2) goto L71;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0145, please report this as an issue */
    @Override // ii1.InterfaceC18571a
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo53786c(yh1.C39540a r12, q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh1.C37299a.mo53786c(yh1.a, q83.d):java.lang.Object");
    }

    public /* synthetic */ C37299a(InterfaceC34966a interfaceC34966a, AbstractC21909c abstractC21909c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34966a, abstractC21909c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RoomGpsStorage") : interfaceC34116n);
    }
}
