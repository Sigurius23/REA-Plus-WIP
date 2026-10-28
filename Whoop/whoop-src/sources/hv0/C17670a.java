package hv0;

import at0.C1983a;
import com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsMetadata;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zt0.C41124b;

/* JADX INFO: renamed from: hv0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lhv0/a;", "", "Lat0/a;", "Lzt0/b;", "<init>", "()V", "from", "a", "(Lat0/a;)Lzt0/b;", "console-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17670a {
    /* JADX INFO: renamed from: a */
    public C41124b m50411a(C1983a from) {
        AbstractC22676k.m65750j(from, "from");
        long packetTimeStampUtcMillis = from.getPacketTimeStampUtcMillis();
        ByteBuffer receivedPacketRaw = from.getReceivedPacketRaw();
        return new C41124b(0L, from.getSequenceNumber(), packetTimeStampUtcMillis, new ConsolePacketsMetadata(from.getStrapId(), from.getStrapGenCodeName(), from.getHardwareVersion(), from.getMaximVersion(), from.getDspVersion(), from.getBinaryVersion()), receivedPacketRaw, 1, null);
    }
}
