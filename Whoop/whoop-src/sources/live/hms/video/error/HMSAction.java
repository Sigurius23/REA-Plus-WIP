package live.hms.video.error;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/error/HMSAction;", "", "<init>", "(Ljava/lang/String;I)V", "SwitchDevice", "GetLocalStream", "GetLocalScreen", "Join", "Publish", "Subscribe", "Unsubscribe", "Unpublish", "Failure", "RestartIce", "Leave", "None", "VIDEO_PLUGINS", "AUDIO_PLUGINS", "AUDIO_OUTPUT", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public enum HMSAction {
    SwitchDevice,
    GetLocalStream,
    GetLocalScreen,
    Join,
    Publish,
    Subscribe,
    Unsubscribe,
    Unpublish,
    Failure,
    RestartIce,
    Leave,
    None,
    VIDEO_PLUGINS,
    AUDIO_PLUGINS,
    AUDIO_OUTPUT;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
