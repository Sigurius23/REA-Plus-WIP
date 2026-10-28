package io.getstream.chat.android.client.api2.model.dto;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R&\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(0'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "nullableDownstreamChannelDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "nullableDownstreamMessageDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "nullableDownstreamUserDtoAdapter", "", "nullableIntAdapter", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;", "nullableListOfDownstreamThreadParticipantDtoAdapter", "Ljava/util/Date;", "nullableDateAdapter", "dateAdapter", "", "", "mapOfStringAnyAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamThreadInfoDtoJsonAdapter extends JsonAdapter<DownstreamThreadInfoDto> {
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamChannelDto> nullableDownstreamChannelDtoAdapter;
    private final JsonAdapter<DownstreamMessageDto> nullableDownstreamMessageDtoAdapter;
    private final JsonAdapter<DownstreamUserDto> nullableDownstreamUserDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<DownstreamThreadParticipantDto>> nullableListOfDownstreamThreadParticipantDtoAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamThreadInfoDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("channel_cid", "channel", "parent_message_id", "parent_message", "created_by_user_id", "created_by", "reply_count", "participant_count", "active_participant_count", "thread_participants", "last_message_at", "created_at", "updated_at", "deleted_at", "title", "extraData");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "channel_cid");
        this.nullableDownstreamChannelDtoAdapter = moshi.m94400c(DownstreamChannelDto.class, c25235a0, "channel");
        this.nullableDownstreamMessageDtoAdapter = moshi.m94400c(DownstreamMessageDto.class, c25235a0, "parent_message");
        this.nullableDownstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, "created_by");
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "reply_count");
        this.nullableListOfDownstreamThreadParticipantDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamThreadParticipantDto.class), c25235a0, "thread_participants");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "last_message_at");
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(45, "GeneratedJsonAdapter(DownstreamThreadInfoDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamThreadInfoDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        String str = null;
        DownstreamChannelDto downstreamChannelDto = null;
        String str2 = null;
        DownstreamMessageDto downstreamMessageDto = null;
        String str3 = null;
        DownstreamUserDto downstreamUserDto = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;
        String str4 = null;
        Map map = null;
        while (true) {
            String str5 = str;
            DownstreamChannelDto downstreamChannelDto2 = downstreamChannelDto;
            String str6 = str2;
            DownstreamMessageDto downstreamMessageDto2 = downstreamMessageDto;
            String str7 = str3;
            if (!reader.hasNext()) {
                DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
                reader.endObject();
                if (str5 == null) {
                    throw AbstractC31885f.m99129g("channel_cid", "channel_cid", reader);
                }
                if (str6 == null) {
                    throw AbstractC31885f.m99129g("parent_message_id", "parent_message_id", reader);
                }
                if (str7 == null) {
                    throw AbstractC31885f.m99129g("created_by_user_id", "created_by_user_id", reader);
                }
                if (date2 == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (date3 == null) {
                    throw AbstractC31885f.m99129g("updated_at", "updated_at", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("title", "title", reader);
                }
                if (map != null) {
                    return new DownstreamThreadInfoDto(str5, downstreamChannelDto2, str6, downstreamMessageDto2, str7, downstreamUserDto2, num, num2, num3, list, date, date2, date3, date4, str4, map);
                }
                throw AbstractC31885f.m99129g("extraData", "extraData", reader);
            }
            DownstreamUserDto downstreamUserDto3 = downstreamUserDto;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("channel_cid", "channel_cid", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                    break;
                case 1:
                    downstreamChannelDto = (DownstreamChannelDto) this.nullableDownstreamChannelDtoAdapter.fromJson(reader);
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("parent_message_id", "parent_message_id", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                    break;
                case 3:
                    downstreamMessageDto = (DownstreamMessageDto) this.nullableDownstreamMessageDtoAdapter.fromJson(reader);
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    str3 = str7;
                    break;
                case 4:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("created_by_user_id", "created_by_user_id", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    break;
                    break;
                case 5:
                    downstreamUserDto = (DownstreamUserDto) this.nullableDownstreamUserDtoAdapter.fromJson(reader);
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 6:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 7:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 8:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 9:
                    list = (List) this.nullableListOfDownstreamThreadParticipantDtoAdapter.fromJson(reader);
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 10:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 11:
                    date2 = (Date) this.dateAdapter.fromJson(reader);
                    if (date2 == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 12:
                    date3 = (Date) this.dateAdapter.fromJson(reader);
                    if (date3 == null) {
                        throw AbstractC31885f.m99135m("updated_at", "updated_at", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 13:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 14:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("title", "title", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                case 15:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
                default:
                    downstreamUserDto = downstreamUserDto3;
                    str = str5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str2 = str6;
                    downstreamMessageDto = downstreamMessageDto2;
                    str3 = str7;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamThreadInfoDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("channel_cid");
        this.stringAdapter.toJson(writer, value_.getChannel_cid());
        writer.mo94373x("channel");
        this.nullableDownstreamChannelDtoAdapter.toJson(writer, value_.getChannel());
        writer.mo94373x("parent_message_id");
        this.stringAdapter.toJson(writer, value_.getParent_message_id());
        writer.mo94373x("parent_message");
        this.nullableDownstreamMessageDtoAdapter.toJson(writer, value_.getParent_message());
        writer.mo94373x("created_by_user_id");
        this.stringAdapter.toJson(writer, value_.getCreated_by_user_id());
        writer.mo94373x("created_by");
        this.nullableDownstreamUserDtoAdapter.toJson(writer, value_.getCreated_by());
        writer.mo94373x("reply_count");
        this.nullableIntAdapter.toJson(writer, value_.getReply_count());
        writer.mo94373x("participant_count");
        this.nullableIntAdapter.toJson(writer, value_.getParticipant_count());
        writer.mo94373x("active_participant_count");
        this.nullableIntAdapter.toJson(writer, value_.getActive_participant_count());
        writer.mo94373x("thread_participants");
        this.nullableListOfDownstreamThreadParticipantDtoAdapter.toJson(writer, value_.getThread_participants());
        writer.mo94373x("last_message_at");
        this.nullableDateAdapter.toJson(writer, value_.getLast_message_at());
        writer.mo94373x("created_at");
        this.dateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("updated_at");
        this.dateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x("deleted_at");
        this.nullableDateAdapter.toJson(writer, value_.getDeleted_at());
        writer.mo94373x("title");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
