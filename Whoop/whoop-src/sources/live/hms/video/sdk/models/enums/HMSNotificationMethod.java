package live.hms.video.sdk.models.enums;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006!"}, m65681d2 = {"Llive/hms/video/sdk/models/enums/HMSNotificationMethod;", "", "<init>", "()V", "PEER_LEAVE", "", "PEER_JOIN", "ROOM_STATE", "ON_TRACK_ADD", "ON_TRACK_UPDATE", "PEER_LIST", "ACTIVE_SPEAKERS", "ON_BROADCAST", "ON_POLICY_CHANGE", "ON_ROLE_CHANGE_REQUEST", "ON_PEER_UPDATE", "ON_CONNECTION_QUALITY_UPDATE", "ON_PEER_REMOVED", "ON_TRACK_UPDATE_REQUEST", "ON_CHANGE_TRACK_MUTE_REQUEST", "ON_RTMP_UPDATE", "ON_HLS_UPDATE", "ON_RECORD_UPDATE", "ON_TRACK_LAYER_UPDATE", "ON_METADATA_CHANGE", "ON_POLL_START", "ON_POLL_STOP", "ON_POLL_STATS", "ROOM_INFO", "SESSION_INFO", "WHITEBOARD_UPDATE", "ON_TRANSCRIPTION_UPDATE", "NODE_INFO", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSNotificationMethod {
    public static final String ACTIVE_SPEAKERS = "active-speakers";
    public static final HMSNotificationMethod INSTANCE = new HMSNotificationMethod();
    public static final String NODE_INFO = "node-info";
    public static final String ON_BROADCAST = "on-broadcast";
    public static final String ON_CHANGE_TRACK_MUTE_REQUEST = "on-change-track-mute-state-request";
    public static final String ON_CONNECTION_QUALITY_UPDATE = "on-connection-quality-update";
    public static final String ON_HLS_UPDATE = "on-hls-update";
    public static final String ON_METADATA_CHANGE = "on-metadata-change";
    public static final String ON_PEER_REMOVED = "on-peer-leave-request";
    public static final String ON_PEER_UPDATE = "on-peer-update";
    public static final String ON_POLICY_CHANGE = "on-policy-change";
    public static final String ON_POLL_START = "on-poll-start";
    public static final String ON_POLL_STATS = "on-poll-stats";
    public static final String ON_POLL_STOP = "on-poll-stop";
    public static final String ON_RECORD_UPDATE = "on-record-update";
    public static final String ON_ROLE_CHANGE_REQUEST = "on-role-change-request";
    public static final String ON_RTMP_UPDATE = "on-rtmp-update";
    public static final String ON_TRACK_ADD = "on-track-add";
    public static final String ON_TRACK_LAYER_UPDATE = "on-track-layer-update";
    public static final String ON_TRACK_UPDATE = "on-track-update";
    public static final String ON_TRACK_UPDATE_REQUEST = "on-track-update-request";
    public static final String ON_TRANSCRIPTION_UPDATE = "on-transcription-update";
    public static final String PEER_JOIN = "on-peer-join";
    public static final String PEER_LEAVE = "on-peer-leave";
    public static final String PEER_LIST = "peer-list";
    public static final String ROOM_INFO = "room-info";
    public static final String ROOM_STATE = "room-state";
    public static final String SESSION_INFO = "session-info";
    public static final String WHITEBOARD_UPDATE = "on-whiteboard-update";

    private HMSNotificationMethod() {
    }
}
