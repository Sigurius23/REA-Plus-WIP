package live.hms.video.sdk.models;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.enums.HMSRecordingState;
import live.hms.video.sdk.models.enums.HMSStreamingState;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0006HÂ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J8\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020D2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020=HÖ\u0001J\t\u0010\\\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020+@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0002012\u0006\u0010\u001e\u001a\u000201@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0002072\u0006\u0010\u001e\u001a\u000207@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010>\u001a\u0004\u0018\u00010=2\b\u0010\u001e\u001a\u0004\u0018\u00010=@@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010E\u001a\u00020D2\u0006\u0010\u001e\u001a\u00020D@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u001c8F¢\u0006\u0006\u001a\u0004\bK\u0010\u001aR\u0013\u0010L\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR(\u0010P\u001a\u0004\u0018\u00010\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000e¨\u0006]"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSRoom;", "", "roomId", "", "name", "store", "Llive/hms/video/sdk/SDKStore;", "startedAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/lang/Long;)V", "getRoomId", "()Ljava/lang/String;", "setRoomId", "(Ljava/lang/String;)V", "getName", "setName", "getStartedAt", "()Ljava/lang/Long;", "setStartedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "_transcriptions", "", "Llive/hms/video/sdk/models/Transcriptions;", "get_transcriptions$lib_release", "()Ljava/util/List;", "transcriptions", "", "getTranscriptions", "value", "Llive/hms/video/sdk/models/HMSRtmpStreamingState;", "rtmpHMSRtmpStreamingState", "getRtmpHMSRtmpStreamingState", "()Llive/hms/video/sdk/models/HMSRtmpStreamingState;", "setRtmpHMSRtmpStreamingState$lib_release", "(Llive/hms/video/sdk/models/HMSRtmpStreamingState;)V", "Llive/hms/video/sdk/models/HMSServerRecordingState;", "serverRecordingState", "getServerRecordingState", "()Llive/hms/video/sdk/models/HMSServerRecordingState;", "setServerRecordingState$lib_release", "(Llive/hms/video/sdk/models/HMSServerRecordingState;)V", "Llive/hms/video/sdk/models/HMSBrowserRecordingState;", "browserRecordingState", "getBrowserRecordingState", "()Llive/hms/video/sdk/models/HMSBrowserRecordingState;", "setBrowserRecordingState$lib_release", "(Llive/hms/video/sdk/models/HMSBrowserRecordingState;)V", "Llive/hms/video/sdk/models/HMSHLSStreamingState;", "hlsStreamingState", "getHlsStreamingState", "()Llive/hms/video/sdk/models/HMSHLSStreamingState;", "setHlsStreamingState$lib_release", "(Llive/hms/video/sdk/models/HMSHLSStreamingState;)V", "Llive/hms/video/sdk/models/HmsHlsRecordingState;", "hlsRecordingState", "getHlsRecordingState", "()Llive/hms/video/sdk/models/HmsHlsRecordingState;", "setHlsRecordingState$lib_release", "(Llive/hms/video/sdk/models/HmsHlsRecordingState;)V", "", "peerCount", "getPeerCount", "()Ljava/lang/Integer;", "setPeerCount$lib_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "", "isLargeRoom", "()Z", "setLargeRoom$lib_release", "(Z)V", "peerList", "Llive/hms/video/sdk/models/HMSPeer;", "getPeerList", "localPeer", "Llive/hms/video/sdk/models/HMSLocalPeer;", "getLocalPeer", "()Llive/hms/video/sdk/models/HMSLocalPeer;", "sessionId", "getSessionId", "setSessionId$lib_release", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/lang/Long;)Llive/hms/video/sdk/models/HMSRoom;", "equals", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRoom {
    private final List<Transcriptions> _transcriptions;
    private HMSBrowserRecordingState browserRecordingState;
    private HmsHlsRecordingState hlsRecordingState;
    private HMSHLSStreamingState hlsStreamingState;
    private boolean isLargeRoom;
    private String name;
    private Integer peerCount;
    private String roomId;
    private HMSRtmpStreamingState rtmpHMSRtmpStreamingState;
    private HMSServerRecordingState serverRecordingState;
    private String sessionId;
    private Long startedAt;
    private final SDKStore store;

    public HMSRoom(String roomId, String name, SDKStore store, Long l7) {
        AbstractC22676k.m65750j(roomId, "roomId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(store, "store");
        this.roomId = roomId;
        this.name = name;
        this.store = store;
        this.startedAt = l7;
        this._transcriptions = new ArrayList();
        HMSStreamingState hMSStreamingState = HMSStreamingState.NONE;
        this.rtmpHMSRtmpStreamingState = new HMSRtmpStreamingState(false, null, null, null, hMSStreamingState);
        HMSRecordingState hMSRecordingState = HMSRecordingState.NONE;
        this.serverRecordingState = new HMSServerRecordingState(false, null, null, hMSRecordingState);
        this.browserRecordingState = new HMSBrowserRecordingState(false, null, null, null, false, hMSRecordingState);
        this.hlsStreamingState = new HMSHLSStreamingState(false, null, null, hMSStreamingState);
        this.hlsRecordingState = new HmsHlsRecordingState(Boolean.FALSE, null, null, null, hMSRecordingState);
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final SDKStore getStore() {
        return this.store;
    }

    public static /* synthetic */ HMSRoom copy$default(HMSRoom hMSRoom, String str, String str2, SDKStore sDKStore, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSRoom.roomId;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSRoom.name;
        }
        if ((i13 & 4) != 0) {
            sDKStore = hMSRoom.store;
        }
        if ((i13 & 8) != 0) {
            l7 = hMSRoom.startedAt;
        }
        return hMSRoom.copy(str, str2, sDKStore, l7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final HMSRoom copy(String roomId, String name, SDKStore store, Long startedAt) {
        AbstractC22676k.m65750j(roomId, "roomId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(store, "store");
        return new HMSRoom(roomId, name, store, startedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRoom)) {
            return false;
        }
        HMSRoom hMSRoom = (HMSRoom) other;
        return AbstractC22676k.m65745e(this.roomId, hMSRoom.roomId) && AbstractC22676k.m65745e(this.name, hMSRoom.name) && AbstractC22676k.m65745e(this.store, hMSRoom.store) && AbstractC22676k.m65745e(this.startedAt, hMSRoom.startedAt);
    }

    public final HMSBrowserRecordingState getBrowserRecordingState() {
        return this.browserRecordingState;
    }

    public final HmsHlsRecordingState getHlsRecordingState() {
        return this.hlsRecordingState;
    }

    public final HMSHLSStreamingState getHlsStreamingState() {
        return this.hlsStreamingState;
    }

    public final HMSLocalPeer getLocalPeer() {
        return this.store.getLocalPeer();
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPeerCount() {
        return this.peerCount;
    }

    public final List<HMSPeer> getPeerList() {
        return this.store.getPeers();
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final HMSRtmpStreamingState getRtmpHMSRtmpStreamingState() {
        return this.rtmpHMSRtmpStreamingState;
    }

    public final HMSServerRecordingState getServerRecordingState() {
        return this.serverRecordingState;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final List<Transcriptions> getTranscriptions() {
        return this._transcriptions;
    }

    public final List<Transcriptions> get_transcriptions$lib_release() {
        return this._transcriptions;
    }

    public int hashCode() {
        int iHashCode = (this.store.hashCode() + AbstractC11266d.m30450d(this.roomId.hashCode() * 31, 31, this.name)) * 31;
        Long l7 = this.startedAt;
        return iHashCode + (l7 == null ? 0 : l7.hashCode());
    }

    /* JADX INFO: renamed from: isLargeRoom, reason: from getter */
    public final boolean getIsLargeRoom() {
        return this.isLargeRoom;
    }

    public final void setBrowserRecordingState$lib_release(HMSBrowserRecordingState hMSBrowserRecordingState) {
        AbstractC22676k.m65750j(hMSBrowserRecordingState, "<set-?>");
        this.browserRecordingState = hMSBrowserRecordingState;
    }

    public final void setHlsRecordingState$lib_release(HmsHlsRecordingState hmsHlsRecordingState) {
        AbstractC22676k.m65750j(hmsHlsRecordingState, "<set-?>");
        this.hlsRecordingState = hmsHlsRecordingState;
    }

    public final void setHlsStreamingState$lib_release(HMSHLSStreamingState hMSHLSStreamingState) {
        AbstractC22676k.m65750j(hMSHLSStreamingState, "<set-?>");
        this.hlsStreamingState = hMSHLSStreamingState;
    }

    public final void setLargeRoom$lib_release(boolean z4) {
        this.isLargeRoom = z4;
    }

    public final void setName(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.name = str;
    }

    public final void setPeerCount$lib_release(Integer num) {
        this.peerCount = num;
    }

    public final void setRoomId(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.roomId = str;
    }

    public final void setRtmpHMSRtmpStreamingState$lib_release(HMSRtmpStreamingState hMSRtmpStreamingState) {
        AbstractC22676k.m65750j(hMSRtmpStreamingState, "<set-?>");
        this.rtmpHMSRtmpStreamingState = hMSRtmpStreamingState;
    }

    public final void setServerRecordingState$lib_release(HMSServerRecordingState hMSServerRecordingState) {
        AbstractC22676k.m65750j(hMSServerRecordingState, "<set-?>");
        this.serverRecordingState = hMSServerRecordingState;
    }

    public final void setSessionId$lib_release(String str) {
        this.sessionId = str;
    }

    public final void setStartedAt(Long l7) {
        this.startedAt = l7;
    }

    public String toString() {
        return "HMSRoom(roomId=" + this.roomId + ", name=" + this.name + ", store=" + this.store + ", startedAt=" + this.startedAt + ')';
    }

    public /* synthetic */ HMSRoom(String str, String str2, SDKStore sDKStore, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, sDKStore, (i13 & 8) != 0 ? null : l7);
    }
}
