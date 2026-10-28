package ai2;

import java.util.Set;
import lt0.C24736m;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
import oh2.C27938a;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ai2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017À\u0006\u0003"}, m65681d2 = {"Lai2/h;", "", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Llt0/f;", "dataPacket", "c", "(Llt0/m;Llt0/f;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "", "Llt0/g;", "d", "()Ljava/util/Set;", "supportedFormatRevisions", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC0920h {
    /* JADX INFO: renamed from: a */
    Object mo2258a(InterfaceC30057d<? super Boolean> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    void mo2259b(C27938a acquisitionInfo);

    /* JADX INFO: renamed from: c */
    void mo2260c(C24736m receivedPacket, InterfaceC24729f dataPacket);

    /* JADX INFO: renamed from: d */
    Set<InterfaceC24730g> mo2261d();

    void reset();
}
