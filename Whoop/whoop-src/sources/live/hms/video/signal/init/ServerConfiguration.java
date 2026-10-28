package live.hms.video.signal.init;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m65681d2 = {"Llive/hms/video/signal/init/ServerConfiguration;", "", "enabledFlags", "", "", "networkHealth", "Llive/hms/video/signal/init/NetworkHealth;", "publishStats", "Llive/hms/video/signal/init/Stats;", "subscribeStats", "vb", "Llive/hms/video/signal/init/VB;", "<init>", "(Ljava/util/List;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/VB;)V", "getEnabledFlags", "()Ljava/util/List;", "getNetworkHealth", "()Llive/hms/video/signal/init/NetworkHealth;", "getPublishStats", "()Llive/hms/video/signal/init/Stats;", "getSubscribeStats", "getVb", "()Llive/hms/video/signal/init/VB;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class ServerConfiguration {

    @SerializedName("enabledFlags")
    private final List<String> enabledFlags;

    @SerializedName("networkHealth")
    private final NetworkHealth networkHealth;

    @SerializedName("publishStats")
    private final Stats publishStats;

    @SerializedName("subscribeStats")
    private final Stats subscribeStats;

    @SerializedName("vb")
    private final C24287VB vb;

    public ServerConfiguration(List<String> list, NetworkHealth networkHealth, Stats stats, Stats stats2, C24287VB c24287vb) {
        this.enabledFlags = list;
        this.networkHealth = networkHealth;
        this.publishStats = stats;
        this.subscribeStats = stats2;
        this.vb = c24287vb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerConfiguration copy$default(ServerConfiguration serverConfiguration, List list, NetworkHealth networkHealth, Stats stats, Stats stats2, C24287VB c24287vb, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = serverConfiguration.enabledFlags;
        }
        if ((i13 & 2) != 0) {
            networkHealth = serverConfiguration.networkHealth;
        }
        if ((i13 & 4) != 0) {
            stats = serverConfiguration.publishStats;
        }
        if ((i13 & 8) != 0) {
            stats2 = serverConfiguration.subscribeStats;
        }
        if ((i13 & 16) != 0) {
            c24287vb = serverConfiguration.vb;
        }
        C24287VB c24287vb2 = c24287vb;
        Stats stats3 = stats;
        return serverConfiguration.copy(list, networkHealth, stats3, stats2, c24287vb2);
    }

    public final List<String> component1() {
        return this.enabledFlags;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkHealth getNetworkHealth() {
        return this.networkHealth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Stats getPublishStats() {
        return this.publishStats;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Stats getSubscribeStats() {
        return this.subscribeStats;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C24287VB getVb() {
        return this.vb;
    }

    public final ServerConfiguration copy(List<String> enabledFlags, NetworkHealth networkHealth, Stats publishStats, Stats subscribeStats, C24287VB vb4) {
        return new ServerConfiguration(enabledFlags, networkHealth, publishStats, subscribeStats, vb4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerConfiguration)) {
            return false;
        }
        ServerConfiguration serverConfiguration = (ServerConfiguration) other;
        return AbstractC22676k.m65745e(this.enabledFlags, serverConfiguration.enabledFlags) && AbstractC22676k.m65745e(this.networkHealth, serverConfiguration.networkHealth) && AbstractC22676k.m65745e(this.publishStats, serverConfiguration.publishStats) && AbstractC22676k.m65745e(this.subscribeStats, serverConfiguration.subscribeStats) && AbstractC22676k.m65745e(this.vb, serverConfiguration.vb);
    }

    public final List<String> getEnabledFlags() {
        return this.enabledFlags;
    }

    public final NetworkHealth getNetworkHealth() {
        return this.networkHealth;
    }

    public final Stats getPublishStats() {
        return this.publishStats;
    }

    public final Stats getSubscribeStats() {
        return this.subscribeStats;
    }

    public final C24287VB getVb() {
        return this.vb;
    }

    public int hashCode() {
        List<String> list = this.enabledFlags;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        NetworkHealth networkHealth = this.networkHealth;
        int iHashCode2 = (iHashCode + (networkHealth == null ? 0 : networkHealth.hashCode())) * 31;
        Stats stats = this.publishStats;
        int iHashCode3 = (iHashCode2 + (stats == null ? 0 : stats.hashCode())) * 31;
        Stats stats2 = this.subscribeStats;
        int iHashCode4 = (iHashCode3 + (stats2 == null ? 0 : stats2.hashCode())) * 31;
        C24287VB c24287vb = this.vb;
        return iHashCode4 + (c24287vb != null ? c24287vb.hashCode() : 0);
    }

    public String toString() {
        return "ServerConfiguration(enabledFlags=" + this.enabledFlags + ", networkHealth=" + this.networkHealth + ", publishStats=" + this.publishStats + ", subscribeStats=" + this.subscribeStats + ", vb=" + this.vb + ')';
    }
}
