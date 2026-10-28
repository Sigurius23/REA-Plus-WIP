package live.hms.video.sdk.models;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/sdk/models/EVENT_TYPE;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PREVIEW_CALL", "LOCAL_AUDIO_TRACK", "LOCAL_VIDEO_TRACK", "INIT_CALL", "POLICY_CHANGE", "WEB_SOCKET_CONNECT_TIME", "JOIN_CALL", "CONNECT_RETRIES", "JOIN_RETRIES", "PEER_LIST", "ROOM_STATE", "JOIN_RESPONSE_TIME", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public enum EVENT_TYPE {
    PREVIEW_CALL("time"),
    LOCAL_AUDIO_TRACK("local_audio_track_time"),
    LOCAL_VIDEO_TRACK("local_video_track_time"),
    INIT_CALL("init_response_time"),
    POLICY_CHANGE("on_policy_change_time"),
    WEB_SOCKET_CONNECT_TIME("ws_connect_time"),
    JOIN_CALL("time"),
    CONNECT_RETRIES("retries_connect"),
    JOIN_RETRIES("retries_join"),
    PEER_LIST("peer_list_time"),
    ROOM_STATE("room_state_time"),
    JOIN_RESPONSE_TIME("join_response_time");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String value;

    EVENT_TYPE(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
