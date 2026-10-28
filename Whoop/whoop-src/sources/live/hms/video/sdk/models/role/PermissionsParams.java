package live.hms.video.sdk.models.role;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.models.CommandDefaults;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003Jw\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR0\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00068"}, m65681d2 = {"Llive/hms/video/sdk/models/role/PermissionsParams;", "", "endRoom", "", "removeOthers", CommandDefaults.UNMUTE, CommandDefaults.MUTE, "changeRole", "browserRecording", "rtmpStreaming", "hlsStreaming", "pollRead", "pollWrite", "whiteboard", "Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;", "<init>", "(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;)V", "getEndRoom", "()Z", "getRemoveOthers", "getUnmute", "getMute", "getChangeRole", "getBrowserRecording", "getRtmpStreaming", "getHlsStreaming", "getPollRead", "getPollWrite", "getWhiteboard", "()Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;", "value", "", "Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;", "transcriptions", "getTranscriptions", "()Ljava/util/List;", "setTranscriptions$lib_release", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PermissionsParams {

    @SerializedName("browserRecording")
    private final boolean browserRecording;

    @SerializedName("changeRole")
    private final boolean changeRole;

    @SerializedName("endRoom")
    private final boolean endRoom;

    @SerializedName("hlsStreaming")
    private final boolean hlsStreaming;

    @SerializedName(CommandDefaults.MUTE)
    private final boolean mute;

    @SerializedName("pollRead")
    private final boolean pollRead;

    @SerializedName("pollWrite")
    private final boolean pollWrite;

    @SerializedName("removeOthers")
    private final boolean removeOthers;

    @SerializedName("rtmpStreaming")
    private final boolean rtmpStreaming;
    private List<HMSTranscriptionPermissions> transcriptions;

    @SerializedName(CommandDefaults.UNMUTE)
    private final boolean unmute;
    private final HMSWhiteBoardPermission whiteboard;

    public PermissionsParams() {
        this(false, false, false, false, false, false, false, false, false, false, null, 2047, null);
    }

    public static /* synthetic */ PermissionsParams copy$default(PermissionsParams permissionsParams, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, HMSWhiteBoardPermission hMSWhiteBoardPermission, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = permissionsParams.endRoom;
        }
        if ((i13 & 2) != 0) {
            z13 = permissionsParams.removeOthers;
        }
        if ((i13 & 4) != 0) {
            z14 = permissionsParams.unmute;
        }
        if ((i13 & 8) != 0) {
            z15 = permissionsParams.mute;
        }
        if ((i13 & 16) != 0) {
            z16 = permissionsParams.changeRole;
        }
        if ((i13 & 32) != 0) {
            z17 = permissionsParams.browserRecording;
        }
        if ((i13 & 64) != 0) {
            z18 = permissionsParams.rtmpStreaming;
        }
        if ((i13 & 128) != 0) {
            z19 = permissionsParams.hlsStreaming;
        }
        if ((i13 & 256) != 0) {
            z24 = permissionsParams.pollRead;
        }
        if ((i13 & 512) != 0) {
            z25 = permissionsParams.pollWrite;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            hMSWhiteBoardPermission = permissionsParams.whiteboard;
        }
        boolean z26 = z25;
        HMSWhiteBoardPermission hMSWhiteBoardPermission2 = hMSWhiteBoardPermission;
        boolean z27 = z19;
        boolean z28 = z24;
        boolean z29 = z17;
        boolean z34 = z18;
        boolean z35 = z16;
        boolean z36 = z14;
        return permissionsParams.copy(z4, z13, z36, z15, z35, z29, z34, z27, z28, z26, hMSWhiteBoardPermission2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEndRoom() {
        return this.endRoom;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getPollWrite() {
        return this.pollWrite;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final HMSWhiteBoardPermission getWhiteboard() {
        return this.whiteboard;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRemoveOthers() {
        return this.removeOthers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getUnmute() {
        return this.unmute;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getMute() {
        return this.mute;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getChangeRole() {
        return this.changeRole;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getBrowserRecording() {
        return this.browserRecording;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getRtmpStreaming() {
        return this.rtmpStreaming;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHlsStreaming() {
        return this.hlsStreaming;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getPollRead() {
        return this.pollRead;
    }

    public final PermissionsParams copy(boolean endRoom, boolean removeOthers, boolean unmute, boolean mute, boolean changeRole, boolean browserRecording, boolean rtmpStreaming, boolean hlsStreaming, boolean pollRead, boolean pollWrite, HMSWhiteBoardPermission whiteboard) {
        AbstractC22676k.m65750j(whiteboard, "whiteboard");
        return new PermissionsParams(endRoom, removeOthers, unmute, mute, changeRole, browserRecording, rtmpStreaming, hlsStreaming, pollRead, pollWrite, whiteboard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionsParams)) {
            return false;
        }
        PermissionsParams permissionsParams = (PermissionsParams) other;
        return this.endRoom == permissionsParams.endRoom && this.removeOthers == permissionsParams.removeOthers && this.unmute == permissionsParams.unmute && this.mute == permissionsParams.mute && this.changeRole == permissionsParams.changeRole && this.browserRecording == permissionsParams.browserRecording && this.rtmpStreaming == permissionsParams.rtmpStreaming && this.hlsStreaming == permissionsParams.hlsStreaming && this.pollRead == permissionsParams.pollRead && this.pollWrite == permissionsParams.pollWrite && AbstractC22676k.m65745e(this.whiteboard, permissionsParams.whiteboard);
    }

    public final boolean getBrowserRecording() {
        return this.browserRecording;
    }

    public final boolean getChangeRole() {
        return this.changeRole;
    }

    public final boolean getEndRoom() {
        return this.endRoom;
    }

    public final boolean getHlsStreaming() {
        return this.hlsStreaming;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final boolean getPollRead() {
        return this.pollRead;
    }

    public final boolean getPollWrite() {
        return this.pollWrite;
    }

    public final boolean getRemoveOthers() {
        return this.removeOthers;
    }

    public final boolean getRtmpStreaming() {
        return this.rtmpStreaming;
    }

    public final List<HMSTranscriptionPermissions> getTranscriptions() {
        return this.transcriptions;
    }

    public final boolean getUnmute() {
        return this.unmute;
    }

    public final HMSWhiteBoardPermission getWhiteboard() {
        return this.whiteboard;
    }

    public int hashCode() {
        return this.whiteboard.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.endRoom) * 31, 31, this.removeOthers), 31, this.unmute), 31, this.mute), 31, this.changeRole), 31, this.browserRecording), 31, this.rtmpStreaming), 31, this.hlsStreaming), 31, this.pollRead), 31, this.pollWrite);
    }

    public final void setTranscriptions$lib_release(List<HMSTranscriptionPermissions> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.transcriptions = list;
    }

    public String toString() {
        return "PermissionsParams(endRoom=" + this.endRoom + ", removeOthers=" + this.removeOthers + ", unmute=" + this.unmute + ", mute=" + this.mute + ", changeRole=" + this.changeRole + ", browserRecording=" + this.browserRecording + ", rtmpStreaming=" + this.rtmpStreaming + ", hlsStreaming=" + this.hlsStreaming + ", pollRead=" + this.pollRead + ", pollWrite=" + this.pollWrite + ", whiteboard=" + this.whiteboard + ')';
    }

    public PermissionsParams(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, HMSWhiteBoardPermission whiteboard) {
        AbstractC22676k.m65750j(whiteboard, "whiteboard");
        this.endRoom = z4;
        this.removeOthers = z13;
        this.unmute = z14;
        this.mute = z15;
        this.changeRole = z16;
        this.browserRecording = z17;
        this.rtmpStreaming = z18;
        this.hlsStreaming = z19;
        this.pollRead = z24;
        this.pollWrite = z25;
        this.whiteboard = whiteboard;
        this.transcriptions = C25271y.f99162w;
    }

    public /* synthetic */ PermissionsParams(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, HMSWhiteBoardPermission hMSWhiteBoardPermission, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15, (i13 & 16) != 0 ? false : z16, (i13 & 32) != 0 ? false : z17, (i13 & 64) != 0 ? false : z18, (i13 & 128) != 0 ? false : z19, (i13 & 256) != 0 ? false : z24, (i13 & 512) != 0 ? false : z25, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new HMSWhiteBoardPermission(false, false, false) : hMSWhiteBoardPermission);
    }
}
