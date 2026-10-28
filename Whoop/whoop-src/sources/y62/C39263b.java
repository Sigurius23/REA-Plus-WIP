package y62;

import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import mh2.C25561a;
import nt0.AbstractC27120h;
import oh2.C27938a;
import oh2.C27941d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qu0.InterfaceC30622a;
import r83.EnumC31071a;
import ru0.C31817a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: y62.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!¨\u0006\""}, m65681d2 = {"Ly62/b;", "", "Ltr2/n;", "logger", "Lqu0/a;", "researchPacketDao", "Lmh2/a;", "strapMetadataDaoInteractor", "<init>", "(Ltr2/n;Lqu0/a;Lmh2/a;)V", "", "Lnt0/h;", "", "versionId", "Lru0/a;", "d", "(Ljava/util/List;I)Ljava/util/List;", "Loh2/a;", "acquisitionInfo", "packets", "", "c", "(Loh2/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "revision", "numberOfPackets", "b", "(IILq83/d;)Ljava/lang/Object;", "packetsToDelete", "Ll83/a0;", "a", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "Lqu0/a;", "Lmh2/a;", "research-packet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39263b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC30622a researchPacketDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C25561a strapMetadataDaoInteractor;

    /* JADX INFO: renamed from: y62.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.researchPacket.persistent.ResearchPacketDbManager", m100430f = "ResearchPacketDbManager.kt", m100431l = {44}, m100432m = "deletePackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f168815w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f168816x;

        /* JADX INFO: renamed from: z */
        int f168818z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f168816x = obj;
            this.f168818z |= Integer.MIN_VALUE;
            return C39263b.this.m125055a(null, this);
        }
    }

    /* JADX INFO: renamed from: y62.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.researchPacket.persistent.ResearchPacketDbManager", m100430f = "ResearchPacketDbManager.kt", m100431l = {34}, m100432m = "getPackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f168819E;

        /* JADX INFO: renamed from: w */
        int f168820w;

        /* JADX INFO: renamed from: x */
        int f168821x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f168822y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f168822y = obj;
            this.f168819E |= Integer.MIN_VALUE;
            return C39263b.this.m125056b(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: y62.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.researchPacket.persistent.ResearchPacketDbManager", m100430f = "ResearchPacketDbManager.kt", m100431l = {24}, m100432m = "savePackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f168824E;

        /* JADX INFO: renamed from: G */
        int f168826G;

        /* JADX INFO: renamed from: w */
        Object f168827w;

        /* JADX INFO: renamed from: x */
        Object f168828x;

        /* JADX INFO: renamed from: y */
        Object f168829y;

        /* JADX INFO: renamed from: z */
        int f168830z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f168824E = obj;
            this.f168826G |= Integer.MIN_VALUE;
            return C39263b.this.m125057c(null, null, this);
        }
    }

    public C39263b(InterfaceC34116n logger, InterfaceC30622a researchPacketDao, C25561a strapMetadataDaoInteractor) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(researchPacketDao, "researchPacketDao");
        AbstractC22676k.m65750j(strapMetadataDaoInteractor, "strapMetadataDaoInteractor");
        this.logger = logger;
        this.researchPacketDao = researchPacketDao;
        this.strapMetadataDaoInteractor = strapMetadataDaoInteractor;
    }

    /* JADX INFO: renamed from: d */
    private final List<C31817a> m125054d(List<? extends AbstractC27120h> list, int i13) {
        List<? extends AbstractC27120h> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (AbstractC27120h abstractC27120h : list2) {
            arrayList.add(new C31817a(abstractC27120h.m72392U(), abstractC27120h.m72396Y().m41583j(), abstractC27120h.m81506d0(), i13));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m125055a(List<C31817a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f168818z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f168818z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f168816x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f168818z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30622a interfaceC30622a = this.researchPacketDao;
                aVar.f168815w = null;
                aVar.f168818z = 1;
                if (interfaceC30622a.mo94009a(list, aVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception unused) {
            this.logger.mo85222m("Error deleting research-packets from database", new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m125056b(int i13, int i14, InterfaceC30057d<? super List<C31817a>> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i15 = bVar.f168819E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f168819E = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo94010b = bVar.f168822y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = bVar.f168819E;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(objMo94010b);
                InterfaceC30622a interfaceC30622a = this.researchPacketDao;
                bVar.f168820w = i13;
                bVar.f168821x = i14;
                bVar.f168819E = 1;
                objMo94010b = interfaceC30622a.mo94010b(i13, i14, bVar);
                if (objMo94010b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo94010b);
            }
            return (List) objMo94010b;
        } catch (Exception e5) {
            this.logger.mo85230v("Could not read from research-packets database", e5, new AbstractC30556a.a[0]);
            return C25271y.f99162w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m125057c(C27938a c27938a, List<? extends AbstractC27120h> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f168826G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f168826G = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f168824E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f168826G;
        boolean z4 = true;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                if (list.isEmpty()) {
                    return Boolean.TRUE;
                }
                C27941d c27941dM84340i = C27941d.m84340i(c27938a);
                C25561a c25561a = this.strapMetadataDaoInteractor;
                AbstractC22676k.m65747g(c27941dM84340i);
                int iM75172j = c25561a.m75172j(c27941dM84340i);
                InterfaceC30622a interfaceC30622a = this.researchPacketDao;
                List<C31817a> listM125054d = m125054d(list, iM75172j);
                cVar.f168827w = null;
                cVar.f168828x = list;
                cVar.f168829y = null;
                cVar.f168830z = iM75172j;
                cVar.f168826G = 1;
                if (interfaceC30622a.mo94011c(listM125054d, cVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) cVar.f168828x;
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception unused) {
            z4 = false;
            this.logger.mo85222m(AbstractC2875y.m8296i(list.size(), "Failed to save ", " number of R19 research packets in the database"), new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }
}
