package live.hms.video.connection.models;

import hms.webrtc.PeerConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.factories.IceCandidateFactory;
import live.hms.video.signal.init.IceServer;
import live.hms.video.signal.init.InitConfig;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/connection/models/HMSConfiguration;", "Lhms/webrtc/PeerConnection$RTCConfiguration;", "", "Lhms/webrtc/PeerConnection$IceServer;", "iceServers", "<init>", "(Ljava/util/List;)V", "", "enable", "Ll83/a0;", "enableIceGatheringOnAnyAddressPorts", "(Z)V", "", "toString", "()Ljava/lang/String;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSConfiguration extends PeerConnection.RTCConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "HMSConfiguration";

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Llive/hms/video/connection/models/HMSConfiguration$Companion;", "", "<init>", "()V", "TAG", "", "from", "Llive/hms/video/connection/models/HMSConfiguration;", "config", "Llive/hms/video/signal/init/InitConfig;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HMSConfiguration from(InitConfig config) {
            AbstractC22676k.m65750j(config, "config");
            ArrayList arrayList = new ArrayList();
            Iterator<IceServer> it = config.getRtcConfig().getIceServers().iterator();
            AbstractC22676k.m65749i(it, "iterator(...)");
            while (it.hasNext()) {
                IceServer next = it.next();
                AbstractC22676k.m65749i(next, "next(...)");
                IceServer iceServer = next;
                String str = iceServer.getUrls().get(0);
                AbstractC22676k.m65749i(str, "get(...)");
                if (AbstractC39421y.m125930O(str, "stun:", false)) {
                    arrayList.add(IceCandidateFactory.INSTANCE.makeStunServer(iceServer.getUrls()));
                } else {
                    String str2 = iceServer.getUrls().get(0);
                    AbstractC22676k.m65749i(str2, "get(...)");
                    if (AbstractC39421y.m125930O(str2, "turn:", false)) {
                        IceCandidateFactory iceCandidateFactory = IceCandidateFactory.INSTANCE;
                        ArrayList<String> urls = iceServer.getUrls();
                        String username = iceServer.getUsername();
                        AbstractC22676k.m65747g(username);
                        String credential = iceServer.getCredential();
                        AbstractC22676k.m65747g(credential);
                        arrayList.add(iceCandidateFactory.makeTurnServer(urls, username, credential));
                    } else {
                        HMSLogger.INSTANCE.m71141w(HMSConfiguration.TAG, "Unknown server received: " + iceServer);
                    }
                }
            }
            HMSLogger.m71136d(HMSConfiguration.TAG, "parsed ice-server: " + arrayList);
            if (arrayList.size() > 0) {
                return new HMSConfiguration(arrayList);
            }
            throw new IllegalArgumentException(("Expected at least one ice-server in config=" + config).toString());
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSConfiguration(List<? extends PeerConnection.IceServer> iceServers) {
        super(iceServers);
        AbstractC22676k.m65750j(iceServers, "iceServers");
        this.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
    }

    public final void enableIceGatheringOnAnyAddressPorts(boolean enable) {
        if (enable) {
            this.portAllocatorConfig = new PeerConnection.PortAllocatorConfig(new PeerConnection.PortAllocatorFlag[]{PeerConnection.PortAllocatorFlag.ENABLE_ANY_ADDRESS_PORTS});
        }
    }

    public String toString() {
        return super.toString();
    }
}
