package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "total_unread_count", "", "unread_channels", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getTotal_unread_count", "()I", "getUnread_channels", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MarkAllReadEventDto extends ChatEventDto {
    private final ExactDate created_at;
    private final int total_unread_count;
    private final String type;
    private final int unread_channels;
    private final DownstreamUserDto user;

    public /* synthetic */ MarkAllReadEventDto(String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, exactDate, downstreamUserDto, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0 : i14);
    }

    public static /* synthetic */ MarkAllReadEventDto copy$default(MarkAllReadEventDto markAllReadEventDto, String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = markAllReadEventDto.type;
        }
        if ((i15 & 2) != 0) {
            exactDate = markAllReadEventDto.created_at;
        }
        if ((i15 & 4) != 0) {
            downstreamUserDto = markAllReadEventDto.user;
        }
        if ((i15 & 8) != 0) {
            i13 = markAllReadEventDto.total_unread_count;
        }
        if ((i15 & 16) != 0) {
            i14 = markAllReadEventDto.unread_channels;
        }
        int i16 = i14;
        DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
        return markAllReadEventDto.copy(str, exactDate, downstreamUserDto2, i13, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getUnread_channels() {
        return this.unread_channels;
    }

    public final MarkAllReadEventDto copy(String type, ExactDate created_at, DownstreamUserDto user, int total_unread_count, int unread_channels) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        return new MarkAllReadEventDto(type, created_at, user, total_unread_count, unread_channels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkAllReadEventDto)) {
            return false;
        }
        MarkAllReadEventDto markAllReadEventDto = (MarkAllReadEventDto) other;
        return AbstractC22676k.m65745e(this.type, markAllReadEventDto.type) && AbstractC22676k.m65745e(this.created_at, markAllReadEventDto.created_at) && AbstractC22676k.m65745e(this.user, markAllReadEventDto.user) && this.total_unread_count == markAllReadEventDto.total_unread_count && this.unread_channels == markAllReadEventDto.unread_channels;
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUnread_channels() {
        return this.unread_channels;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        return Integer.hashCode(this.unread_channels) + AbstractC11266d.m30448b(this.total_unread_count, AbstractC3855a.m11819c(this.user, AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.user;
        int i13 = this.total_unread_count;
        int i14 = this.unread_channels;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("MarkAllReadEventDto(type=", str, ", created_at=", exactDate, ", user=");
        sbM30861m.append(downstreamUserDto);
        sbM30861m.append(", total_unread_count=");
        sbM30861m.append(i13);
        sbM30861m.append(", unread_channels=");
        return AbstractC18489d0.m53371l(sbM30861m, i14, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkAllReadEventDto(String type, ExactDate created_at, DownstreamUserDto user, int i13, int i14) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        this.type = type;
        this.created_at = created_at;
        this.user = user;
        this.total_unread_count = i13;
        this.unread_channels = i14;
    }
}
