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
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "downstreamMessageDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "downstreamChannelDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "exactDateAdapter", "", "intAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NotificationThreadMessageNewEventDtoJsonAdapter extends JsonAdapter<NotificationThreadMessageNewEventDto> {
    private final JsonAdapter<DownstreamChannelDto> downstreamChannelDtoAdapter;
    private final JsonAdapter<DownstreamMessageDto> downstreamMessageDtoAdapter;
    private final JsonAdapter<ExactDate> exactDateAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public NotificationThreadMessageNewEventDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("type", "cid", "channel_id", "channel_type", "message", "channel", "created_at", "unread_threads", "unread_thread_messages");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "type");
        this.downstreamMessageDtoAdapter = moshi.m94400c(DownstreamMessageDto.class, c25235a0, "message");
        this.downstreamChannelDtoAdapter = moshi.m94400c(DownstreamChannelDto.class, c25235a0, "channel");
        this.exactDateAdapter = moshi.m94400c(ExactDate.class, c25235a0, "created_at");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "unread_threads");
    }

    public String toString() {
        return AbstractC36095b.m114677e(58, "GeneratedJsonAdapter(NotificationThreadMessageNewEventDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NotificationThreadMessageNewEventDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        DownstreamMessageDto downstreamMessageDto = null;
        DownstreamChannelDto downstreamChannelDto = null;
        ExactDate exactDate = null;
        while (true) {
            Integer num3 = num;
            Integer num4 = num2;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str5 == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (str6 == null) {
                    throw AbstractC31885f.m99129g("cid", "cid", reader);
                }
                if (str7 == null) {
                    throw AbstractC31885f.m99129g("channel_id", "channel_id", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("channel_type", "channel_type", reader);
                }
                if (downstreamMessageDto == null) {
                    throw AbstractC31885f.m99129g("message", "message", reader);
                }
                if (downstreamChannelDto == null) {
                    throw AbstractC31885f.m99129g("channel", "channel", reader);
                }
                if (exactDate == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (num3 == null) {
                    throw AbstractC31885f.m99129g("unread_threads", "unread_threads", reader);
                }
                int iIntValue = num3.intValue();
                if (num4 != null) {
                    return new NotificationThreadMessageNewEventDto(str5, str6, str7, str4, downstreamMessageDto, downstreamChannelDto, exactDate, iIntValue, num4.intValue());
                }
                throw AbstractC31885f.m99129g("unread_thread_messages", "unread_thread_messages", reader);
            }
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    num = num3;
                    num2 = num4;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    num = num3;
                    num2 = num4;
                    str2 = str6;
                    str3 = str7;
                    break;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str5;
                    str3 = str7;
                    break;
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("channel_id", "channel_id", reader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str5;
                    str2 = str6;
                    break;
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("channel_type", "channel_type", reader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    break;
                case 4:
                    downstreamMessageDto = (DownstreamMessageDto) this.downstreamMessageDtoAdapter.fromJson(reader);
                    if (downstreamMessageDto == null) {
                        throw AbstractC31885f.m99135m("message", "message", reader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    break;
                case 5:
                    downstreamChannelDto = (DownstreamChannelDto) this.downstreamChannelDtoAdapter.fromJson(reader);
                    if (downstreamChannelDto == null) {
                        throw AbstractC31885f.m99135m("channel", "channel", reader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    break;
                case 6:
                    exactDate = (ExactDate) this.exactDateAdapter.fromJson(reader);
                    if (exactDate == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    break;
                case 7:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("unread_threads", "unread_threads", reader);
                    }
                    num2 = num4;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    break;
                case 8:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("unread_thread_messages", "unread_thread_messages", reader);
                    }
                    num = num3;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    break;
                    break;
                default:
                    num = num3;
                    num2 = num4;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, NotificationThreadMessageNewEventDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("cid");
        this.stringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("channel_id");
        this.stringAdapter.toJson(writer, value_.getChannel_id());
        writer.mo94373x("channel_type");
        this.stringAdapter.toJson(writer, value_.getChannel_type());
        writer.mo94373x("message");
        this.downstreamMessageDtoAdapter.toJson(writer, value_.getMessage());
        writer.mo94373x("channel");
        this.downstreamChannelDtoAdapter.toJson(writer, value_.getChannel());
        writer.mo94373x("created_at");
        this.exactDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("unread_threads");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_threads()));
        writer.mo94373x("unread_thread_messages");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_thread_messages()));
        writer.mo94370m();
    }
}
