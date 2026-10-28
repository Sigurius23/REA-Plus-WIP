package ai2;

import java.util.List;
import java.util.Set;
import lt0.C24725b;
import lt0.C24736m;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
import nt0.AbstractC27120h;
import nt0.C27115c;
import nt0.C27118f;
import oh2.C27938a;
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
import y62.C39262a;
import y62.C39263b;

/* JADX INFO: renamed from: ai2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, m65681d2 = {"Lai2/m;", "Lai2/h;", "Ly62/b;", "researchPacketDbManager", "Ltr2/n;", "logger", "<init>", "(Ly62/b;Ltr2/n;)V", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Llt0/f;", "dataPacket", "c", "(Llt0/m;Llt0/f;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "Ly62/b;", "Ltr2/n;", "Ly62/a;", "Ly62/a;", "batch", "", "Llt0/g;", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "supportedFormatRevisions", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0925m implements InterfaceC0920h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39263b researchPacketDbManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C39262a batch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<InterfaceC24730g> supportedFormatRevisions;

    /* JADX INFO: renamed from: ai2.m$a */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sink.collectors.ResearchCollector", m100430f = "ResearchCollector.kt", m100431l = {65}, m100432m = "flush", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f3409w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f3410x;

        /* JADX INFO: renamed from: z */
        int f3412z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3410x = obj;
            this.f3412z |= Integer.MIN_VALUE;
            return C0925m.this.mo2258a(this);
        }
    }

    public C0925m(C39263b researchPacketDbManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(researchPacketDbManager, "researchPacketDbManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.researchPacketDbManager = researchPacketDbManager;
        this.logger = logger;
        this.supportedFormatRevisions = InterfaceC24730g.INSTANCE.m72408a(19, 22);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: a */
    public Object mo2258a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        C39262a c39262a;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f3412z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f3412z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f3410x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f3412z;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C39262a c39262a2 = this.batch;
                if (c39262a2 == null) {
                    throw new IllegalStateException("flush() called before startBurst()");
                }
                if (c39262a2.m125053c().isEmpty()) {
                    this.logger.mo85228t("No research packets to flush", new AbstractC30556a.a[0]);
                    return Boolean.TRUE;
                }
                C39263b c39263b = this.researchPacketDbManager;
                C27938a acquisitionInfo = c39262a2.getAcquisitionInfo();
                List<AbstractC27120h> listM125053c = c39262a2.m125053c();
                aVar.f3409w = c39262a2;
                aVar.f3412z = 1;
                Object objM125057c = c39263b.m125057c(acquisitionInfo, listM125053c, aVar);
                if (objM125057c == enumC31071a) {
                    return enumC31071a;
                }
                c39262a = c39262a2;
                obj = objM125057c;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c39262a = (C39262a) aVar.f3409w;
                AbstractC34132o.m107864I(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                this.logger.mo85228t("Flushed " + c39262a.m125053c().size() + " research packets", new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m("Failed to flush research packets", new AbstractC30556a.a[0]);
            }
            z4 = zBooleanValue;
        } catch (Exception e5) {
            this.logger.mo85230v("Exception flushing research packets", e5, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: b */
    public void mo2259b(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        reset();
        this.batch = new C39262a(acquisitionInfo);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: c */
    public void mo2260c(C24736m receivedPacket, InterfaceC24729f dataPacket) {
        AbstractC27120h c27118f;
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        C39262a c39262a = this.batch;
        if (c39262a == null) {
            throw new IllegalStateException("collect() called before startBurst()");
        }
        C24725b c24725bM2268a = AbstractC0921i.m2268a(dataPacket);
        short sM72392U = c24725bM2268a.m72392U();
        if (sM72392U == 19) {
            c27118f = new C27115c(receivedPacket, c24725bM2268a);
        } else if (sM72392U != 22) {
            return;
        } else {
            c27118f = new C27118f(receivedPacket, c24725bM2268a);
        }
        c39262a.m125051a(c27118f);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: d */
    public Set<InterfaceC24730g> mo2261d() {
        return this.supportedFormatRevisions;
    }

    @Override // ai2.InterfaceC0920h
    public void reset() {
        this.batch = null;
    }

    public /* synthetic */ C0925m(C39263b c39263b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39263b, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ResearchCollector") : interfaceC34116n);
    }
}
