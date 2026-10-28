package h52;

import androidx.health.platform.client.proto.C1533u;
import hu0.C17643d;
import hu0.InterfaceC17640a;
import java.util.ArrayList;
import java.util.List;
import lt0.C24725b;
import m83.AbstractC25267u;
import mh2.C25561a;
import oh2.C27938a;
import oh2.C27941d;
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

/* JADX INFO: renamed from: h52.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lh52/a;", "", "Ltr2/n;", "logger", "Lhu0/a;", "sensorDataPacketDao", "Lmh2/a;", "strapMetadataDaoInteractor", "<init>", "(Ltr2/n;Lhu0/a;Lmh2/a;)V", "", "Llt0/b;", "", "versionId", "Lhu0/d;", "b", "(Ljava/util/List;I)Ljava/util/List;", "Loh2/a;", "acquisitionInfo", "packetsList", "", "a", "(Loh2/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "Lhu0/a;", "c", "Lmh2/a;", "pulseInformationPacket_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16935a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC17640a sensorDataPacketDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C25561a strapMetadataDaoInteractor;

    /* JADX INFO: renamed from: h52.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.pulseinformationpacket.PulseInformationDbManager", m100430f = "PulseInformationDbManager.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "savePipPackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f64978E;

        /* JADX INFO: renamed from: G */
        int f64980G;

        /* JADX INFO: renamed from: w */
        Object f64981w;

        /* JADX INFO: renamed from: x */
        Object f64982x;

        /* JADX INFO: renamed from: y */
        Object f64983y;

        /* JADX INFO: renamed from: z */
        int f64984z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f64978E = obj;
            this.f64980G |= Integer.MIN_VALUE;
            return C16935a.this.m47695a(null, null, this);
        }
    }

    public C16935a(InterfaceC34116n logger, InterfaceC17640a sensorDataPacketDao, C25561a strapMetadataDaoInteractor) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(sensorDataPacketDao, "sensorDataPacketDao");
        AbstractC22676k.m65750j(strapMetadataDaoInteractor, "strapMetadataDaoInteractor");
        this.logger = logger;
        this.sensorDataPacketDao = sensorDataPacketDao;
        this.strapMetadataDaoInteractor = strapMetadataDaoInteractor;
    }

    /* JADX INFO: renamed from: b */
    private final List<C17643d> m47694b(List<? extends C24725b> list, int i13) {
        List<? extends C24725b> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C24725b c24725b : list2) {
            arrayList.add(new C17643d(c24725b.m72396Y().m41583j(), c24725b.m72392U(), c24725b.getFullPacketData(), i13));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m47695a(C27938a c27938a, List<? extends C24725b> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f64980G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f64980G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f64978E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f64980G;
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
                InterfaceC17640a interfaceC17640a = this.sensorDataPacketDao;
                List<C17643d> listM47694b = m47694b(list, iM75172j);
                aVar.f64981w = null;
                aVar.f64982x = list;
                aVar.f64983y = null;
                aVar.f64984z = iM75172j;
                aVar.f64980G = 1;
                if (interfaceC17640a.mo50261c(listM47694b, aVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) aVar.f64982x;
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            z4 = false;
            this.logger.mo85230v(AbstractC2875y.m8296i(list.size(), "Failed to save ", " number of PIP packets in the database"), e5, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }
}
