package ai2;

import cu0.C11115c;
import cu0.InterfaceC11114b;
import eu0.InterfaceC13641b;
import gu0.C16211c;
import hk0.AbstractC17369d;
import hk0.EnumC17381p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import lt0.C24725b;
import lt0.C24736m;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
import nt0.AbstractC27120h;
import oh2.C27938a;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ai2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R \u00100\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/¨\u00061"}, m65681d2 = {"Lai2/k;", "Lai2/h;", "Lcu0/b;", "rawDataRepository", "Leu0/b;", "rev2RawDataRepository", "Ltr2/n;", "logger", "<init>", "(Lcu0/b;Leu0/b;Ltr2/n;)V", "Lai2/k$a;", "Llt0/m;", "receivedPacket", "Llt0/b;", "packet", "Ll83/a0;", "f", "(Lai2/k$a;Llt0/m;Llt0/b;)V", "Lhk0/d;", "g", "(Lai2/k$a;Llt0/m;Lhk0/d;)V", "burst", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lai2/k$a;Lq83/d;)Ljava/lang/Object;", "i", "Loh2/a;", "acquisitionInfo", "b", "(Loh2/a;)V", "Llt0/f;", "dataPacket", "c", "(Llt0/m;Llt0/f;)V", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "Lcu0/b;", "Leu0/b;", "Ltr2/n;", "d", "Lai2/k$a;", "", "Llt0/g;", "e", "Ljava/util/Set;", "()Ljava/util/Set;", "supportedFormatRevisions", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0923k implements InterfaceC0920h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC11114b rawDataRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13641b rev2RawDataRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private a burst;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<InterfaceC24730g> supportedFormatRevisions;

    /* JADX INFO: renamed from: ai2.k$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, m65681d2 = {"Lai2/k$a;", "", "Loh2/a;", "acquisitionInfo", "<init>", "(Loh2/a;)V", "a", "Loh2/a;", "()Loh2/a;", "Lst0/v;", "b", "Lst0/v;", "()Lst0/v;", "deviceType", "Lcu0/c;", "c", "Lcu0/c;", "d", "()Lcu0/c;", "rev1StrapInfo", "", "Lnt0/h;", "Ljava/util/List;", "()Ljava/util/List;", "rev1Packets", "Lgu0/c;", "e", "rev2Rows", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C27938a acquisitionInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC32978v deviceType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C11115c rev1StrapInfo;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<AbstractC27120h> rev1Packets;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C16211c> rev2Rows;

        public a(C27938a acquisitionInfo) {
            AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
            this.acquisitionInfo = acquisitionInfo;
            this.deviceType = EnumC32978v.INSTANCE.m104092e(acquisitionInfo.getVersion());
            this.rev1StrapInfo = AbstractC0924l.m2282c(acquisitionInfo);
            this.rev1Packets = new ArrayList();
            this.rev2Rows = new ArrayList();
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C27938a getAcquisitionInfo() {
            return this.acquisitionInfo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC32978v getDeviceType() {
            return this.deviceType;
        }

        /* JADX INFO: renamed from: c */
        public final List<AbstractC27120h> m2277c() {
            return this.rev1Packets;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C11115c getRev1StrapInfo() {
            return this.rev1StrapInfo;
        }

        /* JADX INFO: renamed from: e */
        public final List<C16211c> m2279e() {
            return this.rev2Rows;
        }
    }

    /* JADX INFO: renamed from: ai2.k$b */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sink.collectors.RawDataCollector", m100430f = "RawDataCollector.kt", m100431l = {58, 59}, m100432m = "flush", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f3396E;

        /* JADX INFO: renamed from: w */
        Object f3397w;

        /* JADX INFO: renamed from: x */
        boolean f3398x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f3399y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3399y = obj;
            this.f3396E |= Integer.MIN_VALUE;
            return C0923k.this.mo2258a(this);
        }
    }

    /* JADX INFO: renamed from: ai2.k$c */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sink.collectors.RawDataCollector", m100430f = "RawDataCollector.kt", m100431l = {88}, m100432m = "saveRev1", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f3401w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f3402x;

        /* JADX INFO: renamed from: z */
        int f3404z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3402x = obj;
            this.f3404z |= Integer.MIN_VALUE;
            return C0923k.this.m2273h(null, this);
        }
    }

    public C0923k(InterfaceC11114b rawDataRepository, InterfaceC13641b rev2RawDataRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(rawDataRepository, "rawDataRepository");
        AbstractC22676k.m65750j(rev2RawDataRepository, "rev2RawDataRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.rawDataRepository = rawDataRepository;
        this.rev2RawDataRepository = rev2RawDataRepository;
        this.logger = logger;
        this.supportedFormatRevisions = AbstractC12350b.m34555D(new InterfaceC24730g.c(EnumC17381p.RAW_DATA_STREAM), InterfaceC24730g.INSTANCE.m72408a(7, 10, 11, 20, 21));
    }

    /* JADX INFO: renamed from: f */
    private final void m2271f(a aVar, C24736m c24736m, C24725b c24725b) {
        AbstractC27120h abstractC27120hM81509a = AbstractC27120h.INSTANCE.m81509a(aVar.getDeviceType(), c24736m, c24725b);
        if (abstractC27120hM81509a == null) {
            this.logger.mo85226q(AbstractC2875y.m8295h(c24725b.m72392U(), "Failed to parse raw data packet with revision "), new AbstractC30556a.a[0]);
        } else {
            aVar.m2277c().add(abstractC27120hM81509a);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m2272g(a aVar, C24736m c24736m, AbstractC17369d abstractC17369d) {
        aVar.m2279e().add(new C16211c(0L, abstractC17369d.m49180X().m41583j(), abstractC17369d.m49179W(), AbstractC0924l.m2283d(aVar.getAcquisitionInfo(), abstractC17369d.m49174R()), c24736m.getFramedPacket().m76710f(), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: h */
    public final Object m2273h(a aVar, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f3404z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f3404z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo30080a = cVar.f3402x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f3404z;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo30080a);
                if (aVar.m2277c().isEmpty()) {
                    return Boolean.TRUE;
                }
                InterfaceC11114b interfaceC11114b = this.rawDataRepository;
                List<AbstractC27120h> listM2277c = aVar.m2277c();
                C11115c rev1StrapInfo = aVar.getRev1StrapInfo();
                cVar.f3401w = aVar;
                cVar.f3404z = 1;
                objMo30080a = interfaceC11114b.mo30080a(listM2277c, rev1StrapInfo, cVar);
                if (objMo30080a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) cVar.f3401w;
                AbstractC34132o.m107864I(objMo30080a);
            }
            boolean zBooleanValue = ((Boolean) objMo30080a).booleanValue();
            if (zBooleanValue) {
                this.logger.mo85228t("Flushed " + aVar.m2277c().size() + " raw data packets", new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m("Failed to flush raw data packets", new AbstractC30556a.a[0]);
            }
            z4 = zBooleanValue;
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("Exception flushing raw data packets", e13, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: i */
    private final Object m2274i(a aVar, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return aVar.m2279e().isEmpty() ? Boolean.TRUE : this.rev2RawDataRepository.mo38439c(aVar.m2279e(), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: a */
    public Object mo2258a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        a aVar;
        boolean z4;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f3396E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f3396E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM2273h = bVar.f3399y;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f3396E;
        boolean z13 = false;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM2273h);
            aVar = this.burst;
            if (aVar == null) {
                throw new IllegalStateException("flush() called before startBurst()");
            }
            if (aVar.m2277c().isEmpty() && aVar.m2279e().isEmpty()) {
                this.logger.mo85228t("No raw data packets to flush", new AbstractC30556a.a[0]);
            }
            bVar.f3397w = aVar;
            bVar.f3396E = 1;
            objM2273h = m2273h(aVar, bVar);
            if (objM2273h != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            aVar = (a) bVar.f3397w;
            AbstractC34132o.m107864I(objM2273h);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = bVar.f3398x;
            AbstractC34132o.m107864I(objM2273h);
        }
        boolean zBooleanValue = ((Boolean) objM2273h).booleanValue();
        if (z4 && zBooleanValue) {
            z13 = true;
        }
        return Boolean.valueOf(z13);
        boolean zBooleanValue2 = ((Boolean) objM2273h).booleanValue();
        bVar.f3397w = null;
        bVar.f3398x = zBooleanValue2;
        bVar.f3396E = 2;
        Object objM2274i = m2274i(aVar, bVar);
        if (objM2274i != obj) {
            z4 = zBooleanValue2;
            objM2273h = objM2274i;
            boolean zBooleanValue3 = ((Boolean) objM2273h).booleanValue();
            if (z4) {
                z13 = true;
            }
            return Boolean.valueOf(z13);
        }
        return obj;
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: b */
    public void mo2259b(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        reset();
        this.burst = new a(acquisitionInfo);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: c */
    public void mo2260c(C24736m receivedPacket, InterfaceC24729f dataPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        a aVar = this.burst;
        if (aVar == null) {
            throw new IllegalStateException("collect() called before startBurst()");
        }
        InterfaceC24730g interfaceC24730gMo49181g = dataPacket.mo49181g();
        if (interfaceC24730gMo49181g instanceof InterfaceC24730g.b) {
            m2271f(aVar, receivedPacket, AbstractC0921i.m2268a(dataPacket));
        } else {
            if (!(interfaceC24730gMo49181g instanceof InterfaceC24730g.c)) {
                throw new NoWhenBranchMatchedException();
            }
            m2272g(aVar, receivedPacket, AbstractC0921i.m2269b(dataPacket));
        }
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: d */
    public Set<InterfaceC24730g> mo2261d() {
        return this.supportedFormatRevisions;
    }

    @Override // ai2.InterfaceC0920h
    public void reset() {
        this.burst = null;
    }

    public /* synthetic */ C0923k(InterfaceC11114b interfaceC11114b, InterfaceC13641b interfaceC13641b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11114b, interfaceC13641b, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RawDataCollector") : interfaceC34116n);
    }
}
