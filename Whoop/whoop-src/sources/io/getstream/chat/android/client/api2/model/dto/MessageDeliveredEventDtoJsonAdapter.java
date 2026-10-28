package io.getstream.chat.android.client.api2.model.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
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
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/MessageDeliveredEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/MessageDeliveredEventDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/MessageDeliveredEventDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/MessageDeliveredEventDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "exactDateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "downstreamUserDtoAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageDeliveredEventDtoJsonAdapter extends JsonAdapter<MessageDeliveredEventDto> {
    private final JsonAdapter<DownstreamUserDto> downstreamUserDtoAdapter;
    private final JsonAdapter<ExactDate> exactDateAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public MessageDeliveredEventDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("type", "created_at", UserState.Sources.USER, "cid", "channel_type", "channel_id", "last_delivered_at", "last_delivered_message_id");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "type");
        this.exactDateAdapter = moshi.m94400c(ExactDate.class, c25235a0, "created_at");
        this.downstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
    }

    public String toString() {
        return AbstractC36095b.m114677e(46, "GeneratedJsonAdapter(MessageDeliveredEventDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public MessageDeliveredEventDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        String str = null;
        ExactDate exactDate = null;
        DownstreamUserDto downstreamUserDto = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ExactDate exactDate2 = null;
        String str5 = null;
        while (true) {
            String str6 = str;
            ExactDate exactDate3 = exactDate;
            if (!reader.hasNext()) {
                DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
                reader.endObject();
                if (str6 == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (exactDate3 == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (downstreamUserDto2 == null) {
                    throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
                }
                if (str2 == null) {
                    throw AbstractC31885f.m99129g("cid", "cid", reader);
                }
                if (str3 == null) {
                    throw AbstractC31885f.m99129g("channel_type", "channel_type", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("channel_id", "channel_id", reader);
                }
                if (exactDate2 == null) {
                    throw AbstractC31885f.m99129g("last_delivered_at", "last_delivered_at", reader);
                }
                if (str5 != null) {
                    return new MessageDeliveredEventDto(str6, exactDate3, downstreamUserDto2, str2, str3, str4, exactDate2, str5);
                }
                throw AbstractC31885f.m99129g("last_delivered_message_id", "last_delivered_message_id", reader);
            }
            DownstreamUserDto downstreamUserDto3 = downstreamUserDto;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    downstreamUserDto = downstreamUserDto3;
                    str = str6;
                    exactDate = exactDate3;
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    exactDate = exactDate3;
                    break;
                    break;
                case 1:
                    exactDate = (ExactDate) this.exactDateAdapter.fromJson(reader);
                    if (exactDate == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str6;
                    break;
                    break;
                case 2:
                    downstreamUserDto = (DownstreamUserDto) this.downstreamUserDtoAdapter.fromJson(reader);
                    if (downstreamUserDto == null) {
                        throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    str = str6;
                    exactDate = exactDate3;
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str6;
                    exactDate = exactDate3;
                    break;
                case 4:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("channel_type", "channel_type", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str6;
                    exactDate = exactDate3;
                    break;
                case 5:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("channel_id", "channel_id", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str6;
                    exactDate = exactDate3;
                    break;
                case 6:
                    exactDate2 = (ExactDate) this.exactDateAdapter.fromJson(reader);
                    if (exactDate2 == null) {
                        throw AbstractC31885f.m99135m("last_delivered_at", "last_delivered_at", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str6;
                    exactDate = exactDate3;
                    break;
                case 7:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw AbstractC31885f.m99135m("last_delivered_message_id", "last_delivered_message_id", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str6;
                    exactDate = exactDate3;
                    break;
                default:
                    downstreamUserDto = downstreamUserDto3;
                    str = str6;
                    exactDate = exactDate3;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, MessageDeliveredEventDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("created_at");
        this.exactDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x(UserState.Sources.USER);
        this.downstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("cid");
        this.stringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("channel_type");
        this.stringAdapter.toJson(writer, value_.getChannel_type());
        writer.mo94373x("channel_id");
        this.stringAdapter.toJson(writer, value_.getChannel_id());
        writer.mo94373x("last_delivered_at");
        this.exactDateAdapter.toJson(writer, value_.getLast_delivered_at());
        writer.mo94373x("last_delivered_message_id");
        this.stringAdapter.toJson(writer, value_.getLast_delivered_message_id());
        writer.mo94370m();
    }
}
