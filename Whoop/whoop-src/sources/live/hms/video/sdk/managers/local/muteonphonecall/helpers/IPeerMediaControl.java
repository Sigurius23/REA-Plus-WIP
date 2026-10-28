package live.hms.video.sdk.managers.local.muteonphonecall.helpers;

import live.hms.video.sdk.managers.local.muteonphonecall.PeersMuteState;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;", "", "Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;", "peerAudioState", "()Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;", "enabled", "", "hasCallEnded", "Ll83/a0;", "setPeerAudioState", "(Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;Z)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface IPeerMediaControl {
    PeersMuteState peerAudioState();

    void setPeerAudioState(PeersMuteState enabled, boolean hasCallEnded);
}
