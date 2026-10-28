package live.hms.video.connection.subscribe;

import com.google.gson.JsonObject;
import hms.webrtc.DataChannel;
import l83.C23454a0;
import live.hms.video.connection.IConnectionObserver;
import live.hms.video.media.tracks.HMSTrack;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;", "Llive/hms/video/connection/IConnectionObserver;", "Lhms/webrtc/DataChannel;", "channel", "Ll83/a0;", "onDataChannel", "(Lhms/webrtc/DataChannel;Lq83/d;)Ljava/lang/Object;", "Lcom/google/gson/JsonObject;", "message", "onApiChannelMessage", "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/tracks/HMSTrack;", "track", "onTrackAdd", "(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;", "onTrackRemove", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface ISubscribeConnectionObserver extends IConnectionObserver {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static Object onDataChannel(ISubscribeConnectionObserver iSubscribeConnectionObserver, DataChannel dataChannel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return C23454a0.f92919a;
        }
    }

    Object onApiChannelMessage(JsonObject jsonObject, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onDataChannel(DataChannel dataChannel, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onTrackAdd(HMSTrack hMSTrack, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onTrackRemove(HMSTrack hMSTrack, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
