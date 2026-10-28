package zh2;

import lt0.C24736m;
import lt0.InterfaceC24729f;
import oh2.C27938a;
import ot0.InterfaceC28324b;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: zh2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!À\u0006\u0003"}, m65681d2 = {"Lzh2/d;", "", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Llt0/f;", "dataPacket", "c", "(Llt0/m;Llt0/f;)V", "Lot0/b;", "eventPacket", "g", "(Llt0/m;Lot0/b;)V", "Lzh2/b;", "f", "()Lzh2/b;", "Lzh2/a;", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "", "e", "()I", "totalPacketCount", "Lzh2/c;", "d", "()Lzh2/c;", "packetBreakdown", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC40647d {
    /* JADX INFO: renamed from: a */
    Object mo131903a(InterfaceC30057d<? super C40644a> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    void mo131904b(C27938a acquisitionInfo);

    /* JADX INFO: renamed from: c */
    void mo131905c(C24736m receivedPacket, InterfaceC24729f dataPacket);

    /* JADX INFO: renamed from: d */
    C40646c mo131906d();

    /* JADX INFO: renamed from: e */
    int mo131907e();

    /* JADX INFO: renamed from: f */
    C40645b mo131908f();

    /* JADX INFO: renamed from: g */
    void mo131909g(C24736m receivedPacket, InterfaceC28324b eventPacket);

    void reset();
}
