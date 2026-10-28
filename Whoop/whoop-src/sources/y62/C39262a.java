package y62;

import java.util.ArrayList;
import java.util.List;
import nt0.AbstractC27120h;
import oh2.C27938a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y62.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Ly62/a;", "", "Lnt0/h;", "Loh2/a;", "acquisitionInfo", "<init>", "(Loh2/a;)V", "packet", "Ll83/a0;", "a", "(Lnt0/h;)V", "Loh2/a;", "b", "()Loh2/a;", "", "Ljava/util/List;", "_packets", "", "c", "()Ljava/util/List;", "packets", "research-packet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39262a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27938a acquisitionInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<AbstractC27120h> _packets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<AbstractC27120h> packets;

    public C39262a(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        this.acquisitionInfo = acquisitionInfo;
        ArrayList arrayList = new ArrayList();
        this._packets = arrayList;
        this.packets = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m125051a(AbstractC27120h packet) {
        AbstractC22676k.m65750j(packet, "packet");
        this._packets.add(packet);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27938a getAcquisitionInfo() {
        return this.acquisitionInfo;
    }

    /* JADX INFO: renamed from: c */
    public final List<AbstractC27120h> m125053c() {
        return this.packets;
    }
}
