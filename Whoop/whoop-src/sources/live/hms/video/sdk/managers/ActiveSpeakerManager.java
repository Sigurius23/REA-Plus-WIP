package live.hms.video.sdk.managers;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.sdk.HMSAudioListener;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSSpeaker;
import live.hms.video.sdk.models.HMSSpeakerServerResponse;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Llive/hms/video/sdk/managers/ActiveSpeakerManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;", "Ljava/io/Closeable;", "Llive/hms/video/sdk/SDKStore;", "store", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "params", "", "Llive/hms/video/sdk/models/SDKUpdate;", "manage", "(Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;)Ljava/util/List;", "Ll83/a0;", "close", "()V", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "Llive/hms/video/sdk/HMSAudioListener;", "audioObserver", "Llive/hms/video/sdk/HMSAudioListener;", "getAudioObserver", "()Llive/hms/video/sdk/HMSAudioListener;", "setAudioObserver", "(Llive/hms/video/sdk/HMSAudioListener;)V", "Llive/hms/video/sdk/models/HMSPeer;", "currentDominantSpeaker", "Llive/hms/video/sdk/models/HMSPeer;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ActiveSpeakerManager implements IManager<HMSNotifications.SpeakerList>, Closeable {
    private static final String TAG = "ActiveSpeakerManager";
    private HMSAudioListener audioObserver;
    private HMSPeer currentDominantSpeaker;
    private final SDKStore store;

    public ActiveSpeakerManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.audioObserver = null;
        this.currentDominantSpeaker = null;
    }

    public final HMSAudioListener getAudioObserver() {
        return this.audioObserver;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    public final void setAudioObserver(HMSAudioListener hMSAudioListener) {
        this.audioObserver = hMSAudioListener;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.SpeakerList params) {
        AbstractC22676k.m65750j(params, "params");
        HMSAudioListener hMSAudioListener = this.audioObserver;
        if (hMSAudioListener != null) {
            List<HMSSpeakerServerResponse> speakers = params.getSpeakers();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(speakers, 10));
            Iterator<T> it = speakers.iterator();
            while (it.hasNext()) {
                arrayList.add(((HMSSpeakerServerResponse) it.next()).toHmsSpeaker$lib_release(getStore()));
            }
            hMSAudioListener.onAudioLevelUpdate((HMSSpeaker[]) arrayList.toArray(new HMSSpeaker[0]));
        }
        ArrayList arrayList2 = new ArrayList();
        HMSPeer localPeer = getStore().getLocalPeer();
        if (localPeer == null) {
            HMSLogger.m71137e(TAG, "Local Peer is null");
            return arrayList2;
        }
        if (params.getSpeakers().isEmpty()) {
            arrayList2.add(new SDKUpdate.Peer(HMSPeerUpdate.NO_DOMINANT_SPEAKER, localPeer));
            this.currentDominantSpeaker = null;
            return arrayList2;
        }
        HMSSpeakerServerResponse hMSSpeakerServerResponse = params.getSpeakers().get(0);
        if (!AbstractC22676k.m65745e(hMSSpeakerServerResponse.getPeerId(), localPeer.getPeerID())) {
            localPeer = getStore().getPeerById(hMSSpeakerServerResponse.getPeerId());
        }
        if (localPeer != null) {
            if (!localPeer.equals(this.currentDominantSpeaker)) {
                arrayList2.add(new SDKUpdate.Peer(HMSPeerUpdate.BECAME_DOMINANT_SPEAKER, localPeer));
                this.currentDominantSpeaker = localPeer;
            }
            return arrayList2;
        }
        HMSLogger.m71137e(TAG, "onActiveSpeakerInfoReceived: no peer found for " + hMSSpeakerServerResponse + ", store=" + getStore());
        return arrayList2;
    }
}
