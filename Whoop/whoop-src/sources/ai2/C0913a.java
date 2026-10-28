package ai2;

import at0.C1983a;
import at0.InterfaceC1984b;
import ek0.C13287l;
import fk2.C14554a;
import hk0.C17368c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lt0.C24736m;
import oh2.C27938a;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import ot0.InterfaceC28324b;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ai2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lai2/a;", "Lai2/f;", "Lat0/b;", "consolePacketService", "", "deviceGenCodeName", "Ltr2/n;", "logger", "<init>", "(Lat0/b;Ljava/lang/String;Ltr2/n;)V", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Lot0/b;", "eventPacket", "c", "(Llt0/m;Lot0/b;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "Lat0/b;", "Ljava/lang/String;", "Ltr2/n;", "d", "Loh2/a;", "", "Lat0/a;", "e", "Ljava/util/List;", "pendingPackets", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0913a implements InterfaceC0918f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC1984b consolePacketService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String deviceGenCodeName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C27938a acquisitionInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C1983a> pendingPackets;

    /* JADX INFO: renamed from: ai2.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sink.collectors.ConsoleLogCollector", m100430f = "ConsoleLogCollector.kt", m100431l = {92}, m100432m = "flush", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f3344E;

        /* JADX INFO: renamed from: F */
        int f3345F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f3346G;

        /* JADX INFO: renamed from: I */
        int f3348I;

        /* JADX INFO: renamed from: w */
        Object f3349w;

        /* JADX INFO: renamed from: x */
        Object f3350x;

        /* JADX INFO: renamed from: y */
        Object f3351y;

        /* JADX INFO: renamed from: z */
        Object f3352z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3346G = obj;
            this.f3348I |= Integer.MIN_VALUE;
            return C0913a.this.mo2255a(this);
        }
    }

    public C0913a(InterfaceC1984b consolePacketService, String deviceGenCodeName, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(consolePacketService, "consolePacketService");
        AbstractC22676k.m65750j(deviceGenCodeName, "deviceGenCodeName");
        AbstractC22676k.m65750j(logger, "logger");
        this.consolePacketService = consolePacketService;
        this.deviceGenCodeName = deviceGenCodeName;
        this.logger = logger;
        this.pendingPackets = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ai2.InterfaceC0918f
    /* JADX INFO: renamed from: a */
    public Object mo2255a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        Iterator it;
        int i13;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f3348I;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f3348I = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f3346G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar.f3348I;
        boolean z4 = true;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.acquisitionInfo == null) {
                    throw new IllegalStateException("flush() called before startBurst()");
                }
                if (this.pendingPackets.isEmpty()) {
                    this.logger.mo85228t("No console packets to flush", new AbstractC30556a.a[0]);
                    return Boolean.TRUE;
                }
                it = this.pendingPackets.iterator();
                i13 = 0;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = aVar.f3344E;
                it = (Iterator) aVar.f3350x;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                C1983a c1983a = (C1983a) it.next();
                InterfaceC1984b interfaceC1984b = this.consolePacketService;
                aVar.f3349w = null;
                aVar.f3350x = it;
                aVar.f3351y = null;
                aVar.f3352z = null;
                aVar.f3344E = i13;
                aVar.f3345F = 0;
                aVar.f3348I = 1;
                if (interfaceC1984b.mo6045a(c1983a, aVar) == enumC31071a) {
                    return enumC31071a;
                }
            }
            this.logger.mo85228t("Flushed " + this.pendingPackets.size() + " console packets", new AbstractC30556a.a[0]);
        } catch (Exception e5) {
            this.logger.mo85230v("Exception flushing console packets", e5, new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    @Override // ai2.InterfaceC0918f
    /* JADX INFO: renamed from: b */
    public void mo2256b(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        reset();
        this.acquisitionInfo = acquisitionInfo;
    }

    @Override // ai2.InterfaceC0918f
    /* JADX INFO: renamed from: c */
    public void mo2257c(C24736m receivedPacket, InterfaceC28324b eventPacket) {
        int iM49179W;
        String strM84360f;
        String strMo84319a;
        String strM84332d;
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(eventPacket, "eventPacket");
        C27938a c27938a = this.acquisitionInfo;
        if (c27938a == null) {
            throw new IllegalStateException("collect() called before startBurst()");
        }
        if (eventPacket instanceof C13287l) {
            iM49179W = ((C13287l) eventPacket).mo72387N() & 255;
        } else {
            if (!(eventPacket instanceof C17368c)) {
                this.logger.mo85226q(AbstractC11266d.m30461o("ConsoleLogCollector received non-console packet: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(eventPacket.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
                return;
            }
            iM49179W = (int) ((C17368c) eventPacket).m49179W();
        }
        int i13 = iM49179W;
        C14554a timestamp = eventPacket.getTimestamp();
        if (timestamp == null) {
            this.logger.mo85226q("Console packet has null timestamp (malformed packet), dropping", new AbstractC30556a.a[0]);
            return;
        }
        long jM41583j = timestamp.m41583j();
        String strapId = c27938a.getStrapId();
        String str = strapId == null ? "" : strapId;
        String str2 = this.deviceGenCodeName;
        C27940c hardwareVersion = c27938a.getHardwareVersion();
        String str3 = (hardwareVersion == null || (strM84332d = hardwareVersion.m84332d()) == null) ? "" : strM84332d;
        InterfaceC27939b firmwareVersion = c27938a.getFirmwareVersion();
        String str4 = (firmwareVersion == null || (strMo84319a = firmwareVersion.mo84319a()) == null) ? "" : strMo84319a;
        C27942e sigProcVersion = c27938a.getSigProcVersion();
        this.pendingPackets.add(new C1983a(jM41583j, str, str2, str3, str4, (sigProcVersion == null || (strM84360f = sigProcVersion.m84360f()) == null) ? "" : strM84360f, i13, c27938a.getVersion(), receivedPacket.getFramedPacket().m76710f()));
    }

    @Override // ai2.InterfaceC0918f
    public void reset() {
        this.acquisitionInfo = null;
        this.pendingPackets.clear();
    }

    public /* synthetic */ C0913a(InterfaceC1984b interfaceC1984b, String str, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1984b, str, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ConsoleLogCollector") : interfaceC34116n);
    }
}
