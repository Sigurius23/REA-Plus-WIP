package ai2;

import eu0.InterfaceC13640a;
import gu0.C16209a;
import hk0.C17370e;
import hk0.EnumC17381p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lt0.C24736m;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
import oh2.C27938a;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ai2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, m65681d2 = {"Lai2/b;", "Lai2/h;", "Leu0/a;", "repository", "Ltr2/n;", "logger", "<init>", "(Leu0/a;Ltr2/n;)V", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Llt0/f;", "dataPacket", "c", "(Llt0/m;Llt0/f;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "Leu0/a;", "Ltr2/n;", "Lai2/b$a;", "Lai2/b$a;", "burst", "", "Llt0/g;", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "supportedFormatRevisions", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0914b implements InterfaceC0920h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13640a repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private a burst;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<InterfaceC24730g> supportedFormatRevisions;

    /* JADX INFO: renamed from: ai2.b$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lai2/b$a;", "", "Loh2/a;", "acquisitionInfo", "<init>", "(Loh2/a;)V", "a", "Loh2/a;", "()Loh2/a;", "", "Lgu0/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "rows", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C27938a acquisitionInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<C16209a> rows;

        public a(C27938a acquisitionInfo) {
            AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
            this.acquisitionInfo = acquisitionInfo;
            this.rows = new ArrayList();
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C27938a getAcquisitionInfo() {
            return this.acquisitionInfo;
        }

        /* JADX INFO: renamed from: b */
        public final List<C16209a> m2263b() {
            return this.rows;
        }
    }

    public C0914b(InterfaceC13640a repository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(logger, "logger");
        this.repository = repository;
        this.logger = logger;
        this.supportedFormatRevisions = AbstractC12350b.m34570S(new InterfaceC24730g.c(EnumC17381p.DATA_SETTINGS));
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: a */
    public Object mo2258a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar = this.burst;
        if (aVar == null) {
            throw new IllegalStateException("flush() called before startBurst()");
        }
        if (!aVar.m2263b().isEmpty()) {
            return this.repository.mo38436c(aVar.m2263b(), interfaceC30057d);
        }
        this.logger.mo85228t("No data settings frames to flush", new AbstractC30556a.a[0]);
        return Boolean.TRUE;
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
        C17370e c17370eM2266c = AbstractC0915c.m2266c(dataPacket);
        if (c17370eM2266c.m49184a0()) {
            aVar.m2263b().add(new C16209a(0L, c17370eM2266c.m49180X().m41583j(), c17370eM2266c.m49179W(), AbstractC0915c.m2267d(aVar.getAcquisitionInfo(), c17370eM2266c.m49174R()), c17370eM2266c.m49182Y(), receivedPacket.getFramedPacket().m76710f(), 1, null));
        } else {
            this.logger.mo85226q(AbstractC2875y.m8296i(c17370eM2266c.getPayload().limit(), "Dropping data settings frame too short for its header: ", " bytes"), new AbstractC30556a.a[0]);
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

    public /* synthetic */ C0914b(InterfaceC13640a interfaceC13640a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC13640a, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DataSettingsCollector") : interfaceC34116n);
    }
}
