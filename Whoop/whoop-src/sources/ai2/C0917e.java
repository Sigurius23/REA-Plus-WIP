package ai2;

import fg1.C14455a;
import gg1.InterfaceC15825a;
import lt0.C24736m;
import oh2.C27938a;
import ot0.InterfaceC28324b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ai2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lai2/e;", "Lai2/f;", "Lgg1/a;", "firmwareEventsStore", "Ltr2/n;", "logger", "<init>", "(Lgg1/a;Ltr2/n;)V", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Lot0/b;", "eventPacket", "c", "(Llt0/m;Lot0/b;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "Lgg1/a;", "Ltr2/n;", "Lfg1/a;", "Lfg1/a;", "batch", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0917e implements InterfaceC0918f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC15825a firmwareEventsStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C14455a batch;

    public C0917e(InterfaceC15825a firmwareEventsStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(firmwareEventsStore, "firmwareEventsStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.firmwareEventsStore = firmwareEventsStore;
        this.logger = logger;
    }

    @Override // ai2.InterfaceC0918f
    /* JADX INFO: renamed from: a */
    public Object mo2255a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C14455a c14455a = this.batch;
        if (c14455a == null) {
            throw new IllegalStateException("flush() called before startBurst()");
        }
        boolean z4 = false;
        if (c14455a.m41181c() == 0) {
            this.logger.mo85228t("No event packets to flush", new AbstractC30556a.a[0]);
            return Boolean.TRUE;
        }
        try {
            this.firmwareEventsStore.mo44662a(c14455a);
            this.logger.mo85228t("Flushed " + c14455a.m41181c() + " event packets", new AbstractC30556a.a[0]);
            z4 = true;
        } catch (Exception e5) {
            this.logger.mo85230v("Exception flushing event packets", e5, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    @Override // ai2.InterfaceC0918f
    /* JADX INFO: renamed from: b */
    public void mo2256b(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        reset();
        this.batch = new C14455a(acquisitionInfo);
    }

    @Override // ai2.InterfaceC0918f
    /* JADX INFO: renamed from: c */
    public void mo2257c(C24736m receivedPacket, InterfaceC28324b eventPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(eventPacket, "eventPacket");
        C14455a c14455a = this.batch;
        if (c14455a == null) {
            throw new IllegalStateException("collect() called before startBurst()");
        }
        c14455a.m41179a(receivedPacket, eventPacket);
    }

    @Override // ai2.InterfaceC0918f
    public void reset() {
        this.batch = null;
    }

    public /* synthetic */ C0917e(InterfaceC15825a interfaceC15825a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC15825a, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EventCollector") : interfaceC34116n);
    }
}
