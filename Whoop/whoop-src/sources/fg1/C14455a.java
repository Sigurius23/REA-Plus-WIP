package fg1;

import java.util.LinkedList;
import java.util.List;
import lt0.C24736m;
import oh2.C27938a;
import ot0.InterfaceC28324b;
import p167g5.C15483b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fg1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lfg1/a;", "", "Loh2/a;", "acquisitionInfo", "<init>", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Lot0/b;", "eventPacket", "Ll83/a0;", "a", "(Llt0/m;Lot0/b;)V", "Loh2/a;", "b", "()Loh2/a;", "", "Lg5/b;", "Lmt0/b;", "Ljava/util/List;", "d", "()Ljava/util/List;", "packets", "", "c", "()I", "count", "firmware-events_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14455a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27938a acquisitionInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C15483b> packets;

    public C14455a(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        this.acquisitionInfo = acquisitionInfo;
        this.packets = new LinkedList();
    }

    /* JADX INFO: renamed from: a */
    public final void m41179a(C24736m receivedPacket, InterfaceC28324b eventPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(eventPacket, "eventPacket");
        this.packets.add(new C15483b(eventPacket, receivedPacket.getFramedPacket()));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27938a getAcquisitionInfo() {
        return this.acquisitionInfo;
    }

    /* JADX INFO: renamed from: c */
    public final int m41181c() {
        return this.packets.size();
    }

    /* JADX INFO: renamed from: d */
    public final List<C15483b> m41182d() {
        return this.packets;
    }
}
