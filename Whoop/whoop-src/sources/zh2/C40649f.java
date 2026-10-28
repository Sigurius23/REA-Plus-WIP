package zh2;

import ai2.InterfaceC0918f;
import ai2.InterfaceC0920h;
import c93.InterfaceC4351m;
import ek0.C13287l;
import hk0.C17368c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import lt0.C24725b;
import lt0.C24736m;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import oh2.C27938a;
import ot0.InterfaceC28324b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: zh2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001#B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u00100\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010/R\u0016\u00106\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0016\u00109\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010;\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010:R\u0014\u0010>\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010=¨\u0006@"}, m65681d2 = {"Lzh2/f;", "Lzh2/d;", "", "Lai2/h;", "dataCollectors", "Lai2/f;", "eventCollector", "consoleLogCollector", "Ltr2/n;", "logger", "<init>", "(Ljava/util/List;Lai2/f;Lai2/f;Ltr2/n;)V", "", "Llt0/g;", "i", "()Ljava/util/Map;", "Lzh2/b;", "f", "()Lzh2/b;", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Llt0/f;", "dataPacket", "c", "(Llt0/m;Llt0/f;)V", "Lot0/b;", "eventPacket", "g", "(Llt0/m;Lot0/b;)V", "Lzh2/a;", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "Ljava/util/List;", "Lai2/f;", "d", "Ltr2/n;", "Lzh2/g;", "e", "Lzh2/g;", "sequenceGapTracker", "Ljava/util/Map;", "collectorMap", "", "", "dataPacketCountsByRevision", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "firmwareEventPacketCount", "consoleLogPacketCount", "j", "unknownRevisionCount", "()I", "totalPacketCount", "Lzh2/c;", "()Lzh2/c;", "packetBreakdown", "k", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40649f implements InterfaceC40647d {

    /* JADX INFO: renamed from: k */
    private static final a f175425k = new a(null);

    /* JADX INFO: renamed from: l */
    private static final Set<Short> f175426l = AbstractC25260n.m74059b1(new Short[]{25, 26});

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC0920h> dataCollectors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC0918f eventCollector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC0918f consoleLogCollector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C40650g sequenceGapTracker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Map<InterfaceC24730g, ? extends InterfaceC0920h> collectorMap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Map<InterfaceC24730g, Integer> dataPacketCountsByRevision;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int firmwareEventPacketCount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int consoleLogPacketCount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int unknownRevisionCount;

    /* JADX INFO: renamed from: zh2.f$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzh2/f$a;", "", "<init>", "()V", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: zh2.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        public static final b f175437w = new b();

        public b() {
            super(2, Integer.TYPE, "plus", "plus(I)I", 0);
        }

        /* JADX INFO: renamed from: a */
        public final Integer m131913a(int i13, int i14) {
            return Integer.valueOf(i13 + i14);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m131913a(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: zh2.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sink.PacketSinkImpl", m100430f = "PacketSink.kt", m100431l = {136, 137, 138}, m100432m = "flush", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f175438E;

        /* JADX INFO: renamed from: F */
        Object f175439F;

        /* JADX INFO: renamed from: G */
        Object f175440G;

        /* JADX INFO: renamed from: H */
        int f175441H;

        /* JADX INFO: renamed from: I */
        int f175442I;

        /* JADX INFO: renamed from: J */
        int f175443J;

        /* JADX INFO: renamed from: K */
        boolean f175444K;

        /* JADX INFO: renamed from: L */
        /* synthetic */ Object f175445L;

        /* JADX INFO: renamed from: N */
        int f175447N;

        /* JADX INFO: renamed from: w */
        Object f175448w;

        /* JADX INFO: renamed from: x */
        Object f175449x;

        /* JADX INFO: renamed from: y */
        Object f175450y;

        /* JADX INFO: renamed from: z */
        Object f175451z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f175445L = obj;
            this.f175447N |= Integer.MIN_VALUE;
            return C40649f.this.mo131903a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40649f(List<? extends InterfaceC0920h> dataCollectors, InterfaceC0918f eventCollector, InterfaceC0918f consoleLogCollector, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dataCollectors, "dataCollectors");
        AbstractC22676k.m65750j(eventCollector, "eventCollector");
        AbstractC22676k.m65750j(consoleLogCollector, "consoleLogCollector");
        AbstractC22676k.m65750j(logger, "logger");
        this.dataCollectors = dataCollectors;
        this.eventCollector = eventCollector;
        this.consoleLogCollector = consoleLogCollector;
        this.logger = logger;
        this.sequenceGapTracker = new C40650g(null, 1, null);
        this.dataPacketCountsByRevision = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: i */
    private final Map<InterfaceC24730g, InterfaceC0920h> m131911i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC0920h interfaceC0920h : this.dataCollectors) {
            for (InterfaceC24730g interfaceC24730g : interfaceC0920h.mo2261d()) {
                if (linkedHashMap.containsKey(interfaceC24730g)) {
                    throw new IllegalArgumentException((interfaceC24730g + " is claimed by multiple data collectors").toString());
                }
                linkedHashMap.put(interfaceC24730g, interfaceC0920h);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Integer m131912j(InterfaceC4351m interfaceC4351m, Object obj, Object obj2) {
        return (Integer) interfaceC4351m.invoke(obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b2 -> B:27:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // zh2.InterfaceC40647d
    /* JADX INFO: renamed from: a */
    public java.lang.Object mo131903a(q83.InterfaceC30057d<? super zh2.C40644a> r19) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh2.C40649f.mo131903a(q83.d):java.lang.Object");
    }

    @Override // zh2.InterfaceC40647d
    /* JADX INFO: renamed from: b */
    public void mo131904b(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        reset();
        this.collectorMap = m131911i();
        Iterator<T> it = this.dataCollectors.iterator();
        while (it.hasNext()) {
            ((InterfaceC0920h) it.next()).mo2259b(acquisitionInfo);
        }
        this.eventCollector.mo2256b(acquisitionInfo);
        this.consoleLogCollector.mo2256b(acquisitionInfo);
    }

    @Override // zh2.InterfaceC40647d
    /* JADX INFO: renamed from: c */
    public void mo131905c(C24736m receivedPacket, InterfaceC24729f dataPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        Map<InterfaceC24730g, ? extends InterfaceC0920h> map = this.collectorMap;
        if (map == null) {
            throw new IllegalStateException("collectDataPacket() called before startBurst()");
        }
        if (dataPacket instanceof C24725b) {
            C24725b c24725b = (C24725b) dataPacket;
            short sM72392U = c24725b.m72392U();
            if (!f175426l.contains(Short.valueOf(sM72392U))) {
                this.sequenceGapTracker.m131915b(sM72392U, c24725b.mo33457Q());
            }
        }
        InterfaceC24730g interfaceC24730gMo49181g = dataPacket.mo49181g();
        InterfaceC0920h interfaceC0920h = map.get(interfaceC24730gMo49181g);
        if (interfaceC0920h != null) {
            interfaceC0920h.mo2260c(receivedPacket, dataPacket);
            Map<InterfaceC24730g, Integer> map2 = this.dataPacketCountsByRevision;
            final b bVar = b.f175437w;
            map2.merge(interfaceC24730gMo49181g, 1, new BiFunction() { // from class: zh2.e
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return C40649f.m131912j(bVar, obj, obj2);
                }
            });
            return;
        }
        this.unknownRevisionCount++;
        this.logger.mo85226q("No collector for data packet " + interfaceC24730gMo49181g + ", dropping", new AbstractC30556a.a[0]);
    }

    @Override // zh2.InterfaceC40647d
    /* JADX INFO: renamed from: d */
    public C40646c mo131906d() {
        return new C40646c(AbstractC25247g0.m74001j0(this.dataPacketCountsByRevision), this.firmwareEventPacketCount, this.consoleLogPacketCount, this.unknownRevisionCount);
    }

    @Override // zh2.InterfaceC40647d
    /* JADX INFO: renamed from: e */
    public int mo131907e() {
        return AbstractC25265s.m74154v1(this.dataPacketCountsByRevision.values()) + this.firmwareEventPacketCount + this.consoleLogPacketCount + this.unknownRevisionCount;
    }

    @Override // zh2.InterfaceC40647d
    /* JADX INFO: renamed from: f */
    public C40645b mo131908f() {
        return this.sequenceGapTracker.m131914a();
    }

    @Override // zh2.InterfaceC40647d
    /* JADX INFO: renamed from: g */
    public void mo131909g(C24736m receivedPacket, InterfaceC28324b eventPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(eventPacket, "eventPacket");
        if (this.collectorMap == null) {
            throw new IllegalStateException("collectEventPacket() called before startBurst()");
        }
        if ((eventPacket instanceof C13287l) || (eventPacket instanceof C17368c)) {
            this.consoleLogCollector.mo2257c(receivedPacket, eventPacket);
            this.consoleLogPacketCount++;
        } else {
            this.eventCollector.mo2257c(receivedPacket, eventPacket);
            this.firmwareEventPacketCount++;
        }
    }

    @Override // zh2.InterfaceC40647d
    public void reset() {
        this.collectorMap = null;
        this.dataPacketCountsByRevision.clear();
        this.firmwareEventPacketCount = 0;
        this.consoleLogPacketCount = 0;
        this.unknownRevisionCount = 0;
        this.sequenceGapTracker.m131916c();
        Iterator<T> it = this.dataCollectors.iterator();
        while (it.hasNext()) {
            ((InterfaceC0920h) it.next()).reset();
        }
        this.eventCollector.reset();
        this.consoleLogCollector.reset();
    }

    public /* synthetic */ C40649f(List list, InterfaceC0918f interfaceC0918f, InterfaceC0918f interfaceC0918f2, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, interfaceC0918f, interfaceC0918f2, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PacketSinkImpl") : interfaceC34116n);
    }
}
