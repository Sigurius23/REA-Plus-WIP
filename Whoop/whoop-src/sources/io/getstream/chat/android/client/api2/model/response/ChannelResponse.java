package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelUserRead;
import io.getstream.chat.android.client.api2.model.dto.DownstreamDraftDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPendingMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPushPreferenceDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import java.util.Date;
import java.util.List;
import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0014HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010>\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u001aHÆ\u0003J¾\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0014HÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006G"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "", "channel", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "messages", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "pending_messages", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPendingMessageDto;", "pinned_messages", "push_preferences", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", QueryChannelRequest.KEY_MEMBERS, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "membership", "watchers", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "read", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "watcher_count", "", "hidden", "", "hide_messages_before", "Ljava/util/Date;", "draft", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)V", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getMessages", "()Ljava/util/List;", "getPending_messages", "getPinned_messages", "getPush_preferences", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "getMembers", "getMembership", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "getWatchers", "getRead", "getWatcher_count", "()I", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHide_messages_before", "()Ljava/util/Date;", "getDraft", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "equals", "other", "hashCode", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelResponse {
    private final DownstreamChannelDto channel;
    private final DownstreamDraftDto draft;
    private final Boolean hidden;
    private final Date hide_messages_before;
    private final List<DownstreamMemberDto> members;
    private final DownstreamMemberDto membership;
    private final List<DownstreamMessageDto> messages;
    private final List<DownstreamPendingMessageDto> pending_messages;
    private final List<DownstreamMessageDto> pinned_messages;
    private final DownstreamPushPreferenceDto push_preferences;
    private final List<DownstreamChannelUserRead> read;
    private final int watcher_count;
    private final List<DownstreamUserDto> watchers;

    public ChannelResponse(DownstreamChannelDto channel, List<DownstreamMessageDto> messages, List<DownstreamPendingMessageDto> pending_messages, List<DownstreamMessageDto> pinned_messages, DownstreamPushPreferenceDto downstreamPushPreferenceDto, List<DownstreamMemberDto> members, DownstreamMemberDto downstreamMemberDto, List<DownstreamUserDto> watchers, List<DownstreamChannelUserRead> read, int i13, Boolean bool, Date date, DownstreamDraftDto downstreamDraftDto) {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(pending_messages, "pending_messages");
        AbstractC22676k.m65750j(pinned_messages, "pinned_messages");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(watchers, "watchers");
        AbstractC22676k.m65750j(read, "read");
        this.channel = channel;
        this.messages = messages;
        this.pending_messages = pending_messages;
        this.pinned_messages = pinned_messages;
        this.push_preferences = downstreamPushPreferenceDto;
        this.members = members;
        this.membership = downstreamMemberDto;
        this.watchers = watchers;
        this.read = read;
        this.watcher_count = i13;
        this.hidden = bool;
        this.hide_messages_before = date;
        this.draft = downstreamDraftDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelResponse copy$default(ChannelResponse channelResponse, DownstreamChannelDto downstreamChannelDto, List list, List list2, List list3, DownstreamPushPreferenceDto downstreamPushPreferenceDto, List list4, DownstreamMemberDto downstreamMemberDto, List list5, List list6, int i13, Boolean bool, Date date, DownstreamDraftDto downstreamDraftDto, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            downstreamChannelDto = channelResponse.channel;
        }
        return channelResponse.copy(downstreamChannelDto, (i14 & 2) != 0 ? channelResponse.messages : list, (i14 & 4) != 0 ? channelResponse.pending_messages : list2, (i14 & 8) != 0 ? channelResponse.pinned_messages : list3, (i14 & 16) != 0 ? channelResponse.push_preferences : downstreamPushPreferenceDto, (i14 & 32) != 0 ? channelResponse.members : list4, (i14 & 64) != 0 ? channelResponse.membership : downstreamMemberDto, (i14 & 128) != 0 ? channelResponse.watchers : list5, (i14 & 256) != 0 ? channelResponse.read : list6, (i14 & 512) != 0 ? channelResponse.watcher_count : i13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? channelResponse.hidden : bool, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? channelResponse.hide_messages_before : date, (i14 & 4096) != 0 ? channelResponse.draft : downstreamDraftDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getWatcher_count() {
        return this.watcher_count;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getHide_messages_before() {
        return this.hide_messages_before;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    public final List<DownstreamMessageDto> component2() {
        return this.messages;
    }

    public final List<DownstreamPendingMessageDto> component3() {
        return this.pending_messages;
    }

    public final List<DownstreamMessageDto> component4() {
        return this.pinned_messages;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DownstreamPushPreferenceDto getPush_preferences() {
        return this.push_preferences;
    }

    public final List<DownstreamMemberDto> component6() {
        return this.members;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DownstreamMemberDto getMembership() {
        return this.membership;
    }

    public final List<DownstreamUserDto> component8() {
        return this.watchers;
    }

    public final List<DownstreamChannelUserRead> component9() {
        return this.read;
    }

    public final ChannelResponse copy(DownstreamChannelDto channel, List<DownstreamMessageDto> messages, List<DownstreamPendingMessageDto> pending_messages, List<DownstreamMessageDto> pinned_messages, DownstreamPushPreferenceDto push_preferences, List<DownstreamMemberDto> members, DownstreamMemberDto membership, List<DownstreamUserDto> watchers, List<DownstreamChannelUserRead> read, int watcher_count, Boolean hidden, Date hide_messages_before, DownstreamDraftDto draft) {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(pending_messages, "pending_messages");
        AbstractC22676k.m65750j(pinned_messages, "pinned_messages");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(watchers, "watchers");
        AbstractC22676k.m65750j(read, "read");
        return new ChannelResponse(channel, messages, pending_messages, pinned_messages, push_preferences, members, membership, watchers, read, watcher_count, hidden, hide_messages_before, draft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelResponse)) {
            return false;
        }
        ChannelResponse channelResponse = (ChannelResponse) other;
        return AbstractC22676k.m65745e(this.channel, channelResponse.channel) && AbstractC22676k.m65745e(this.messages, channelResponse.messages) && AbstractC22676k.m65745e(this.pending_messages, channelResponse.pending_messages) && AbstractC22676k.m65745e(this.pinned_messages, channelResponse.pinned_messages) && AbstractC22676k.m65745e(this.push_preferences, channelResponse.push_preferences) && AbstractC22676k.m65745e(this.members, channelResponse.members) && AbstractC22676k.m65745e(this.membership, channelResponse.membership) && AbstractC22676k.m65745e(this.watchers, channelResponse.watchers) && AbstractC22676k.m65745e(this.read, channelResponse.read) && this.watcher_count == channelResponse.watcher_count && AbstractC22676k.m65745e(this.hidden, channelResponse.hidden) && AbstractC22676k.m65745e(this.hide_messages_before, channelResponse.hide_messages_before) && AbstractC22676k.m65745e(this.draft, channelResponse.draft);
    }

    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final Date getHide_messages_before() {
        return this.hide_messages_before;
    }

    public final List<DownstreamMemberDto> getMembers() {
        return this.members;
    }

    public final DownstreamMemberDto getMembership() {
        return this.membership;
    }

    public final List<DownstreamMessageDto> getMessages() {
        return this.messages;
    }

    public final List<DownstreamPendingMessageDto> getPending_messages() {
        return this.pending_messages;
    }

    public final List<DownstreamMessageDto> getPinned_messages() {
        return this.pinned_messages;
    }

    public final DownstreamPushPreferenceDto getPush_preferences() {
        return this.push_preferences;
    }

    public final List<DownstreamChannelUserRead> getRead() {
        return this.read;
    }

    public final int getWatcher_count() {
        return this.watcher_count;
    }

    public final List<DownstreamUserDto> getWatchers() {
        return this.watchers;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.channel.hashCode() * 31, 31, this.messages), 31, this.pending_messages), 31, this.pinned_messages);
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = this.push_preferences;
        int iM31983b2 = AbstractC11895b.m31983b((iM31983b + (downstreamPushPreferenceDto == null ? 0 : downstreamPushPreferenceDto.hashCode())) * 31, 31, this.members);
        DownstreamMemberDto downstreamMemberDto = this.membership;
        int iM30448b = AbstractC11266d.m30448b(this.watcher_count, AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM31983b2 + (downstreamMemberDto == null ? 0 : downstreamMemberDto.hashCode())) * 31, 31, this.watchers), 31, this.read), 31);
        Boolean bool = this.hidden;
        int iHashCode = (iM30448b + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date = this.hide_messages_before;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        DownstreamDraftDto downstreamDraftDto = this.draft;
        return iHashCode2 + (downstreamDraftDto != null ? downstreamDraftDto.hashCode() : 0);
    }

    public String toString() {
        DownstreamChannelDto downstreamChannelDto = this.channel;
        List<DownstreamMessageDto> list = this.messages;
        List<DownstreamPendingMessageDto> list2 = this.pending_messages;
        List<DownstreamMessageDto> list3 = this.pinned_messages;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = this.push_preferences;
        List<DownstreamMemberDto> list4 = this.members;
        DownstreamMemberDto downstreamMemberDto = this.membership;
        List<DownstreamUserDto> list5 = this.watchers;
        List<DownstreamChannelUserRead> list6 = this.read;
        int i13 = this.watcher_count;
        Boolean bool = this.hidden;
        Date date = this.hide_messages_before;
        DownstreamDraftDto downstreamDraftDto = this.draft;
        StringBuilder sb4 = new StringBuilder("ChannelResponse(channel=");
        sb4.append(downstreamChannelDto);
        sb4.append(", messages=");
        sb4.append(list);
        sb4.append(", pending_messages=");
        AbstractC21702c.m61148s(sb4, list2, ", pinned_messages=", list3, ", push_preferences=");
        sb4.append(downstreamPushPreferenceDto);
        sb4.append(", members=");
        sb4.append(list4);
        sb4.append(", membership=");
        sb4.append(downstreamMemberDto);
        sb4.append(", watchers=");
        sb4.append(list5);
        sb4.append(", read=");
        sb4.append(list6);
        sb4.append(", watcher_count=");
        sb4.append(i13);
        sb4.append(", hidden=");
        sb4.append(bool);
        sb4.append(", hide_messages_before=");
        sb4.append(date);
        sb4.append(", draft=");
        sb4.append(downstreamDraftDto);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChannelResponse(DownstreamChannelDto downstreamChannelDto, List list, List list2, List list3, DownstreamPushPreferenceDto downstreamPushPreferenceDto, List list4, DownstreamMemberDto downstreamMemberDto, List list5, List list6, int i13, Boolean bool, Date date, DownstreamDraftDto downstreamDraftDto, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int i15 = i14 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(downstreamChannelDto, i15 != 0 ? c25271y : list, (i14 & 4) != 0 ? c25271y : list2, (i14 & 8) != 0 ? c25271y : list3, (i14 & 16) != 0 ? null : downstreamPushPreferenceDto, (i14 & 32) != 0 ? c25271y : list4, downstreamMemberDto, (i14 & 128) != 0 ? c25271y : list5, (i14 & 256) != 0 ? c25271y : list6, (i14 & 512) != 0 ? 0 : i13, bool, date, downstreamDraftDto);
    }
}
