package xj0;

import lt0.EnumC24728e;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: xj0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lxj0/g;", "Lxj0/b;", "<init>", "()V", "", "i", "Ljava/lang/String;", "K", "()Ljava/lang/String;", "packetName", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38349g extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String packetName;

    public C38349g() {
        super(EnumC24728e.EXIT_HIGH_FREQ_SYNC, null, null, 6, null);
        this.packetName = "ExitHighFreqSyncPacket";
    }

    @Override // xj0.AbstractC38334b, lt0.AbstractC24726c
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getPacketName() {
        return this.packetName;
    }
}
