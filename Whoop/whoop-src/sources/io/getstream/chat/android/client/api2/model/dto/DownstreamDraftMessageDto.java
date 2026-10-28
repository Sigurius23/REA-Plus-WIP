package io.getstream.chat.android.client.api2.model.dto;

import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0003J\u0085\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0001J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;", "", "id", "", "text", "command", "args", "attachments", "", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "mentioned_users", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", NotificationCompat.GROUP_KEY_SILENT, "", "show_in_channel", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLjava/util/Map;)V", "getId", "()Ljava/lang/String;", "getText", "getCommand", "getArgs", "getAttachments", "()Ljava/util/List;", "getMentioned_users", "getSilent", "()Z", "getShow_in_channel", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamDraftMessageDto {
    private final String args;
    private final List<AttachmentDto> attachments;
    private final String command;
    private final Map<String, Object> extraData;
    private final String id;
    private final List<DownstreamUserDto> mentioned_users;
    private final boolean show_in_channel;
    private final boolean silent;
    private final String text;

    public DownstreamDraftMessageDto(String id4, String text, String str, String str2, List<AttachmentDto> list, List<DownstreamUserDto> list2, boolean z4, boolean z13, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        this.id = id4;
        this.text = text;
        this.command = str;
        this.args = str2;
        this.attachments = list;
        this.mentioned_users = list2;
        this.silent = z4;
        this.show_in_channel = z13;
        this.extraData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownstreamDraftMessageDto copy$default(DownstreamDraftMessageDto downstreamDraftMessageDto, String str, String str2, String str3, String str4, List list, List list2, boolean z4, boolean z13, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downstreamDraftMessageDto.id;
        }
        if ((i13 & 2) != 0) {
            str2 = downstreamDraftMessageDto.text;
        }
        if ((i13 & 4) != 0) {
            str3 = downstreamDraftMessageDto.command;
        }
        if ((i13 & 8) != 0) {
            str4 = downstreamDraftMessageDto.args;
        }
        if ((i13 & 16) != 0) {
            list = downstreamDraftMessageDto.attachments;
        }
        if ((i13 & 32) != 0) {
            list2 = downstreamDraftMessageDto.mentioned_users;
        }
        if ((i13 & 64) != 0) {
            z4 = downstreamDraftMessageDto.silent;
        }
        if ((i13 & 128) != 0) {
            z13 = downstreamDraftMessageDto.show_in_channel;
        }
        if ((i13 & 256) != 0) {
            map = downstreamDraftMessageDto.extraData;
        }
        boolean z14 = z13;
        Map map2 = map;
        List list3 = list2;
        boolean z15 = z4;
        List list4 = list;
        String str5 = str3;
        return downstreamDraftMessageDto.copy(str, str2, str5, str4, list4, list3, z15, z14, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getArgs() {
        return this.args;
    }

    public final List<AttachmentDto> component5() {
        return this.attachments;
    }

    public final List<DownstreamUserDto> component6() {
        return this.mentioned_users;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShow_in_channel() {
        return this.show_in_channel;
    }

    public final Map<String, Object> component9() {
        return this.extraData;
    }

    public final DownstreamDraftMessageDto copy(String id4, String text, String command, String args, List<AttachmentDto> attachments, List<DownstreamUserDto> mentioned_users, boolean silent, boolean show_in_channel, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        return new DownstreamDraftMessageDto(id4, text, command, args, attachments, mentioned_users, silent, show_in_channel, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamDraftMessageDto)) {
            return false;
        }
        DownstreamDraftMessageDto downstreamDraftMessageDto = (DownstreamDraftMessageDto) other;
        return AbstractC22676k.m65745e(this.id, downstreamDraftMessageDto.id) && AbstractC22676k.m65745e(this.text, downstreamDraftMessageDto.text) && AbstractC22676k.m65745e(this.command, downstreamDraftMessageDto.command) && AbstractC22676k.m65745e(this.args, downstreamDraftMessageDto.args) && AbstractC22676k.m65745e(this.attachments, downstreamDraftMessageDto.attachments) && AbstractC22676k.m65745e(this.mentioned_users, downstreamDraftMessageDto.mentioned_users) && this.silent == downstreamDraftMessageDto.silent && this.show_in_channel == downstreamDraftMessageDto.show_in_channel && AbstractC22676k.m65745e(this.extraData, downstreamDraftMessageDto.extraData);
    }

    public final String getArgs() {
        return this.args;
    }

    public final List<AttachmentDto> getAttachments() {
        return this.attachments;
    }

    public final String getCommand() {
        return this.command;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DownstreamUserDto> getMentioned_users() {
        return this.mentioned_users;
    }

    public final boolean getShow_in_channel() {
        return this.show_in_channel;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.text);
        String str = this.command;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.args;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AttachmentDto> list = this.attachments;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DownstreamUserDto> list2 = this.mentioned_users;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.silent), 31, this.show_in_channel);
        Map<String, Object> map = this.extraData;
        return iM8289b + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        String str3 = this.command;
        String str4 = this.args;
        List<AttachmentDto> list = this.attachments;
        List<DownstreamUserDto> list2 = this.mentioned_users;
        boolean z4 = this.silent;
        boolean z13 = this.show_in_channel;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DownstreamDraftMessageDto(id=", str, ", text=", str2, ", command=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", args=", str4, ", attachments=");
        AbstractC21702c.m61148s(sbM32001t, list, ", mentioned_users=", list2, ", silent=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", show_in_channel=", z13, ", extraData=");
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    public /* synthetic */ DownstreamDraftMessageDto(String str, String str2, String str3, String str4, List list, List list2, boolean z4, boolean z13, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : list, (i13 & 32) != 0 ? null : list2, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? null : map);
    }
}
