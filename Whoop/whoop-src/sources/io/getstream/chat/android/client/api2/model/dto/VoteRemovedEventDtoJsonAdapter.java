package io.getstream.chat.android.client.api2.model.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/VoteRemovedEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/VoteRemovedEventDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/VoteRemovedEventDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/VoteRemovedEventDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "exactDateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "downstreamPollDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "downstreamVoteDtoAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class VoteRemovedEventDtoJsonAdapter extends JsonAdapter<VoteRemovedEventDto> {
    private final JsonAdapter<DownstreamPollDto> downstreamPollDtoAdapter;
    private final JsonAdapter<DownstreamVoteDto> downstreamVoteDtoAdapter;
    private final JsonAdapter<ExactDate> exactDateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public VoteRemovedEventDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("type", "cid", "message_id", "created_at", "poll", "poll_vote");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "type");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "message_id");
        this.exactDateAdapter = moshi.m94400c(ExactDate.class, c25235a0, "created_at");
        this.downstreamPollDtoAdapter = moshi.m94400c(DownstreamPollDto.class, c25235a0, "poll");
        this.downstreamVoteDtoAdapter = moshi.m94400c(DownstreamVoteDto.class, c25235a0, "poll_vote");
    }

    public String toString() {
        return AbstractC36095b.m114677e(41, "GeneratedJsonAdapter(VoteRemovedEventDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public VoteRemovedEventDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        ExactDate exactDate = null;
        DownstreamPollDto downstreamPollDto = null;
        DownstreamVoteDto downstreamVoteDto = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    break;
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    exactDate = (ExactDate) this.exactDateAdapter.fromJson(reader);
                    if (exactDate == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    break;
                    break;
                case 4:
                    downstreamPollDto = (DownstreamPollDto) this.downstreamPollDtoAdapter.fromJson(reader);
                    if (downstreamPollDto == null) {
                        throw AbstractC31885f.m99135m("poll", "poll", reader);
                    }
                    break;
                    break;
                case 5:
                    downstreamVoteDto = (DownstreamVoteDto) this.downstreamVoteDtoAdapter.fromJson(reader);
                    if (downstreamVoteDto == null) {
                        throw AbstractC31885f.m99135m("poll_vote", "poll_vote", reader);
                    }
                    break;
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw AbstractC31885f.m99129g("type", "type", reader);
        }
        if (str2 == null) {
            throw AbstractC31885f.m99129g("cid", "cid", reader);
        }
        if (exactDate == null) {
            throw AbstractC31885f.m99129g("created_at", "created_at", reader);
        }
        if (downstreamPollDto == null) {
            throw AbstractC31885f.m99129g("poll", "poll", reader);
        }
        if (downstreamVoteDto != null) {
            return new VoteRemovedEventDto(str, str2, str3, exactDate, downstreamPollDto, downstreamVoteDto);
        }
        throw AbstractC31885f.m99129g("poll_vote", "poll_vote", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, VoteRemovedEventDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("cid");
        this.stringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("message_id");
        this.nullableStringAdapter.toJson(writer, value_.getMessage_id());
        writer.mo94373x("created_at");
        this.exactDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("poll");
        this.downstreamPollDtoAdapter.toJson(writer, value_.getPoll());
        writer.mo94373x("poll_vote");
        this.downstreamVoteDtoAdapter.toJson(writer, value_.getPoll_vote());
        writer.mo94370m();
    }
}
