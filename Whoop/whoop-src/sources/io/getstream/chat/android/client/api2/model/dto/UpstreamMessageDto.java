package io.getstream.chat.android.client.api2.model.dto;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@StreamHandsOff(reason = "Field names can't be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map")
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u0011HÆ\u0003J\t\u0010Q\u001a\u00020\u0011HÆ\u0003J\t\u0010R\u001a\u00020\u0011HÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0015\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fHÆ\u0003J \u0002\u0010X\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fHÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\u00112\b\u0010[\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010\\\u001a\u00020]HÖ\u0001J\t\u0010^\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006_"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "attachments", "", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "cid", "", "command", "args", "html", "id", "type", "mentioned_users", "parent_id", "pin_expires", "Ljava/util/Date;", "pinned", "", "pinned_at", "pinned_by", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "quoted_message_id", "shadowed", "show_in_channel", NotificationCompat.GROUP_KEY_SILENT, "text", "thread_participants", "restricted_visibility", "shared_location", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;", "extraData", "", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)V", "getAttachments", "()Ljava/util/List;", "getCid", "()Ljava/lang/String;", "getCommand", "getArgs", "getHtml", "getId", "getType", "getMentioned_users", "getParent_id", "getPin_expires", "()Ljava/util/Date;", "getPinned", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPinned_at", "getPinned_by", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "getQuoted_message_id", "getShadowed", "()Z", "getShow_in_channel", "getSilent", "getText", "getThread_participants", "getRestricted_visibility", "getShared_location", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpstreamMessageDto implements ExtraDataDto {
    private final String args;
    private final List<AttachmentDto> attachments;
    private final String cid;
    private final String command;
    private final Map<String, Object> extraData;
    private final String html;
    private final String id;
    private final List<String> mentioned_users;
    private final String parent_id;
    private final Date pin_expires;
    private final Boolean pinned;
    private final Date pinned_at;
    private final UpstreamUserDto pinned_by;
    private final String quoted_message_id;
    private final List<String> restricted_visibility;
    private final boolean shadowed;
    private final UpstreamLocationDto shared_location;
    private final boolean show_in_channel;
    private final boolean silent;
    private final String text;
    private final List<UpstreamUserDto> thread_participants;
    private final String type;

    public UpstreamMessageDto(List<AttachmentDto> attachments, String cid, String str, String str2, String html, String id4, String type, List<String> mentioned_users, String str3, Date date, Boolean bool, Date date2, UpstreamUserDto upstreamUserDto, String str4, boolean z4, boolean z13, boolean z14, String text, List<UpstreamUserDto> thread_participants, List<String> restricted_visibility, UpstreamLocationDto upstreamLocationDto, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(mentioned_users, "mentioned_users");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(thread_participants, "thread_participants");
        AbstractC22676k.m65750j(restricted_visibility, "restricted_visibility");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.attachments = attachments;
        this.cid = cid;
        this.command = str;
        this.args = str2;
        this.html = html;
        this.id = id4;
        this.type = type;
        this.mentioned_users = mentioned_users;
        this.parent_id = str3;
        this.pin_expires = date;
        this.pinned = bool;
        this.pinned_at = date2;
        this.pinned_by = upstreamUserDto;
        this.quoted_message_id = str4;
        this.shadowed = z4;
        this.show_in_channel = z13;
        this.silent = z14;
        this.text = text;
        this.thread_participants = thread_participants;
        this.restricted_visibility = restricted_visibility;
        this.shared_location = upstreamLocationDto;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpstreamMessageDto copy$default(UpstreamMessageDto upstreamMessageDto, List list, String str, String str2, String str3, String str4, String str5, String str6, List list2, String str7, Date date, Boolean bool, Date date2, UpstreamUserDto upstreamUserDto, String str8, boolean z4, boolean z13, boolean z14, String str9, List list3, List list4, UpstreamLocationDto upstreamLocationDto, Map map, int i13, Object obj) {
        Map map2;
        UpstreamLocationDto upstreamLocationDto2;
        List list5 = (i13 & 1) != 0 ? upstreamMessageDto.attachments : list;
        String str10 = (i13 & 2) != 0 ? upstreamMessageDto.cid : str;
        String str11 = (i13 & 4) != 0 ? upstreamMessageDto.command : str2;
        String str12 = (i13 & 8) != 0 ? upstreamMessageDto.args : str3;
        String str13 = (i13 & 16) != 0 ? upstreamMessageDto.html : str4;
        String str14 = (i13 & 32) != 0 ? upstreamMessageDto.id : str5;
        String str15 = (i13 & 64) != 0 ? upstreamMessageDto.type : str6;
        List list6 = (i13 & 128) != 0 ? upstreamMessageDto.mentioned_users : list2;
        String str16 = (i13 & 256) != 0 ? upstreamMessageDto.parent_id : str7;
        Date date3 = (i13 & 512) != 0 ? upstreamMessageDto.pin_expires : date;
        Boolean bool2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? upstreamMessageDto.pinned : bool;
        Date date4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? upstreamMessageDto.pinned_at : date2;
        UpstreamUserDto upstreamUserDto2 = (i13 & 4096) != 0 ? upstreamMessageDto.pinned_by : upstreamUserDto;
        String str17 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? upstreamMessageDto.quoted_message_id : str8;
        List list7 = list5;
        boolean z15 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? upstreamMessageDto.shadowed : z4;
        boolean z16 = (i13 & 32768) != 0 ? upstreamMessageDto.show_in_channel : z13;
        boolean z17 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? upstreamMessageDto.silent : z14;
        String str18 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? upstreamMessageDto.text : str9;
        List list8 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? upstreamMessageDto.thread_participants : list3;
        List list9 = (i13 & 524288) != 0 ? upstreamMessageDto.restricted_visibility : list4;
        UpstreamLocationDto upstreamLocationDto3 = (i13 & 1048576) != 0 ? upstreamMessageDto.shared_location : upstreamLocationDto;
        if ((i13 & 2097152) != 0) {
            upstreamLocationDto2 = upstreamLocationDto3;
            map2 = upstreamMessageDto.extraData;
        } else {
            map2 = map;
            upstreamLocationDto2 = upstreamLocationDto3;
        }
        return upstreamMessageDto.copy(list7, str10, str11, str12, str13, str14, str15, list6, str16, date3, bool2, date4, upstreamUserDto2, str17, z15, z16, z17, str18, list8, list9, upstreamLocationDto2, map2);
    }

    public final List<AttachmentDto> component1() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getPin_expires() {
        return this.pin_expires;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getPinned() {
        return this.pinned;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getPinned_at() {
        return this.pinned_at;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final UpstreamUserDto getPinned_by() {
        return this.pinned_by;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getQuoted_message_id() {
        return this.quoted_message_id;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getShadowed() {
        return this.shadowed;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getShow_in_channel() {
        return this.show_in_channel;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<UpstreamUserDto> component19() {
        return this.thread_participants;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    public final List<String> component20() {
        return this.restricted_visibility;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final UpstreamLocationDto getShared_location() {
        return this.shared_location;
    }

    public final Map<String, Object> component22() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<String> component8() {
        return this.mentioned_users;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getParent_id() {
        return this.parent_id;
    }

    public final UpstreamMessageDto copy(List<AttachmentDto> attachments, String cid, String command, String args, String html, String id4, String type, List<String> mentioned_users, String parent_id, Date pin_expires, Boolean pinned, Date pinned_at, UpstreamUserDto pinned_by, String quoted_message_id, boolean shadowed, boolean show_in_channel, boolean silent, String text, List<UpstreamUserDto> thread_participants, List<String> restricted_visibility, UpstreamLocationDto shared_location, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(mentioned_users, "mentioned_users");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(thread_participants, "thread_participants");
        AbstractC22676k.m65750j(restricted_visibility, "restricted_visibility");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new UpstreamMessageDto(attachments, cid, command, args, html, id4, type, mentioned_users, parent_id, pin_expires, pinned, pinned_at, pinned_by, quoted_message_id, shadowed, show_in_channel, silent, text, thread_participants, restricted_visibility, shared_location, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamMessageDto)) {
            return false;
        }
        UpstreamMessageDto upstreamMessageDto = (UpstreamMessageDto) other;
        return AbstractC22676k.m65745e(this.attachments, upstreamMessageDto.attachments) && AbstractC22676k.m65745e(this.cid, upstreamMessageDto.cid) && AbstractC22676k.m65745e(this.command, upstreamMessageDto.command) && AbstractC22676k.m65745e(this.args, upstreamMessageDto.args) && AbstractC22676k.m65745e(this.html, upstreamMessageDto.html) && AbstractC22676k.m65745e(this.id, upstreamMessageDto.id) && AbstractC22676k.m65745e(this.type, upstreamMessageDto.type) && AbstractC22676k.m65745e(this.mentioned_users, upstreamMessageDto.mentioned_users) && AbstractC22676k.m65745e(this.parent_id, upstreamMessageDto.parent_id) && AbstractC22676k.m65745e(this.pin_expires, upstreamMessageDto.pin_expires) && AbstractC22676k.m65745e(this.pinned, upstreamMessageDto.pinned) && AbstractC22676k.m65745e(this.pinned_at, upstreamMessageDto.pinned_at) && AbstractC22676k.m65745e(this.pinned_by, upstreamMessageDto.pinned_by) && AbstractC22676k.m65745e(this.quoted_message_id, upstreamMessageDto.quoted_message_id) && this.shadowed == upstreamMessageDto.shadowed && this.show_in_channel == upstreamMessageDto.show_in_channel && this.silent == upstreamMessageDto.silent && AbstractC22676k.m65745e(this.text, upstreamMessageDto.text) && AbstractC22676k.m65745e(this.thread_participants, upstreamMessageDto.thread_participants) && AbstractC22676k.m65745e(this.restricted_visibility, upstreamMessageDto.restricted_visibility) && AbstractC22676k.m65745e(this.shared_location, upstreamMessageDto.shared_location) && AbstractC22676k.m65745e(this.extraData, upstreamMessageDto.extraData);
    }

    public final String getArgs() {
        return this.args;
    }

    public final List<AttachmentDto> getAttachments() {
        return this.attachments;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getMentioned_users() {
        return this.mentioned_users;
    }

    public final String getParent_id() {
        return this.parent_id;
    }

    public final Date getPin_expires() {
        return this.pin_expires;
    }

    public final Boolean getPinned() {
        return this.pinned;
    }

    public final Date getPinned_at() {
        return this.pinned_at;
    }

    public final UpstreamUserDto getPinned_by() {
        return this.pinned_by;
    }

    public final String getQuoted_message_id() {
        return this.quoted_message_id;
    }

    public final List<String> getRestricted_visibility() {
        return this.restricted_visibility;
    }

    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final UpstreamLocationDto getShared_location() {
        return this.shared_location;
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

    public final List<UpstreamUserDto> getThread_participants() {
        return this.thread_participants;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.attachments.hashCode() * 31, 31, this.cid);
        String str = this.command;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.args;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.html), 31, this.id), 31, this.type), 31, this.mentioned_users);
        String str3 = this.parent_id;
        int iHashCode2 = (iM31983b + (str3 == null ? 0 : str3.hashCode())) * 31;
        Date date = this.pin_expires;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool = this.pinned;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date2 = this.pinned_at;
        int iHashCode5 = (iHashCode4 + (date2 == null ? 0 : date2.hashCode())) * 31;
        UpstreamUserDto upstreamUserDto = this.pinned_by;
        int iHashCode6 = (iHashCode5 + (upstreamUserDto == null ? 0 : upstreamUserDto.hashCode())) * 31;
        String str4 = this.quoted_message_id;
        int iM31983b2 = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.shadowed), 31, this.show_in_channel), 31, this.silent), 31, this.text), 31, this.thread_participants), 31, this.restricted_visibility);
        UpstreamLocationDto upstreamLocationDto = this.shared_location;
        return this.extraData.hashCode() + ((iM31983b2 + (upstreamLocationDto != null ? upstreamLocationDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        List<AttachmentDto> list = this.attachments;
        String str = this.cid;
        String str2 = this.command;
        String str3 = this.args;
        String str4 = this.html;
        String str5 = this.id;
        String str6 = this.type;
        List<String> list2 = this.mentioned_users;
        String str7 = this.parent_id;
        Date date = this.pin_expires;
        Boolean bool = this.pinned;
        Date date2 = this.pinned_at;
        UpstreamUserDto upstreamUserDto = this.pinned_by;
        String str8 = this.quoted_message_id;
        boolean z4 = this.shadowed;
        boolean z13 = this.show_in_channel;
        boolean z14 = this.silent;
        String str9 = this.text;
        List<UpstreamUserDto> list3 = this.thread_participants;
        List<String> list4 = this.restricted_visibility;
        UpstreamLocationDto upstreamLocationDto = this.shared_location;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("UpstreamMessageDto(attachments=", ", cid=", str, ", command=", list);
        AbstractC11266d.m30444B(sbM79507k, str2, ", args=", str3, ", html=");
        AbstractC11266d.m30444B(sbM79507k, str4, ", id=", str5, ", type=");
        AbstractC36095b.m114694v(str6, ", mentioned_users=", ", parent_id=", sbM79507k, list2);
        AbstractC13673n.m38579z(sbM79507k, str7, ", pin_expires=", date, ", pinned=");
        sbM79507k.append(bool);
        sbM79507k.append(", pinned_at=");
        sbM79507k.append(date2);
        sbM79507k.append(", pinned_by=");
        sbM79507k.append(upstreamUserDto);
        sbM79507k.append(", quoted_message_id=");
        sbM79507k.append(str8);
        sbM79507k.append(", shadowed=");
        AbstractC38963t7.m124392v(sbM79507k, z4, ", show_in_channel=", z13, ", silent=");
        AbstractC38963t7.m124391u(sbM79507k, z14, ", text=", str9, ", thread_participants=");
        AbstractC21702c.m61148s(sbM79507k, list3, ", restricted_visibility=", list4, ", shared_location=");
        sbM79507k.append(upstreamLocationDto);
        sbM79507k.append(", extraData=");
        sbM79507k.append(map);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }
}
