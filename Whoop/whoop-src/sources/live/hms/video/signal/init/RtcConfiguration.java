package live.hms.video.signal.init;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ(\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R(\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/signal/init/RtcConfiguration;", "", "iceServers", "Lkotlin/collections/ArrayList;", "Llive/hms/video/signal/init/IceServer;", "Ljava/util/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getIceServers", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "component1", "copy", "(Ljava/util/ArrayList;)Llive/hms/video/signal/init/RtcConfiguration;", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class RtcConfiguration {

    @SerializedName("ice_servers")
    private final ArrayList<IceServer> iceServers;

    public RtcConfiguration(ArrayList<IceServer> iceServers) {
        AbstractC22676k.m65750j(iceServers, "iceServers");
        this.iceServers = iceServers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RtcConfiguration copy$default(RtcConfiguration rtcConfiguration, ArrayList arrayList, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            arrayList = rtcConfiguration.iceServers;
        }
        return rtcConfiguration.copy(arrayList);
    }

    public final ArrayList<IceServer> component1() {
        return this.iceServers;
    }

    public final RtcConfiguration copy(ArrayList<IceServer> iceServers) {
        AbstractC22676k.m65750j(iceServers, "iceServers");
        return new RtcConfiguration(iceServers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RtcConfiguration) && AbstractC22676k.m65745e(this.iceServers, ((RtcConfiguration) other).iceServers);
    }

    public final ArrayList<IceServer> getIceServers() {
        return this.iceServers;
    }

    public int hashCode() {
        return this.iceServers.hashCode();
    }

    public String toString() {
        return "RtcConfiguration(iceServers=" + this.iceServers + ')';
    }
}
