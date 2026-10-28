package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DraftMessageUpdatedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "draft", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getDraft", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DraftMessageUpdatedEventDto extends ChatEventDto {
    private final ExactDate created_at;
    private final DownstreamDraftDto draft;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftMessageUpdatedEventDto(String type, ExactDate created_at, DownstreamDraftDto draft) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(draft, "draft");
        this.type = type;
        this.created_at = created_at;
        this.draft = draft;
    }

    public static /* synthetic */ DraftMessageUpdatedEventDto copy$default(DraftMessageUpdatedEventDto draftMessageUpdatedEventDto, String str, ExactDate exactDate, DownstreamDraftDto downstreamDraftDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = draftMessageUpdatedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = draftMessageUpdatedEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            downstreamDraftDto = draftMessageUpdatedEventDto.draft;
        }
        return draftMessageUpdatedEventDto.copy(str, exactDate, downstreamDraftDto);
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
    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    public final DraftMessageUpdatedEventDto copy(String type, ExactDate created_at, DownstreamDraftDto draft) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(draft, "draft");
        return new DraftMessageUpdatedEventDto(type, created_at, draft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftMessageUpdatedEventDto)) {
            return false;
        }
        DraftMessageUpdatedEventDto draftMessageUpdatedEventDto = (DraftMessageUpdatedEventDto) other;
        return AbstractC22676k.m65745e(this.type, draftMessageUpdatedEventDto.type) && AbstractC22676k.m65745e(this.created_at, draftMessageUpdatedEventDto.created_at) && AbstractC22676k.m65745e(this.draft, draftMessageUpdatedEventDto.draft);
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final DownstreamDraftDto getDraft() {
        return this.draft;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.draft.hashCode() + AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamDraftDto downstreamDraftDto = this.draft;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("DraftMessageUpdatedEventDto(type=", str, ", created_at=", exactDate, ", draft=");
        sbM30861m.append(downstreamDraftDto);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }
}
