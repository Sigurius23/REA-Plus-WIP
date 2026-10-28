package io.getstream.chat.android.client.api2.model.dto;

import androidx.health.platform.client.proto.C1533u;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R&\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.0-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;)V", "Lqx/v;", "options", "Lqx/v;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "nullableDownstreamChannelDtoAdapter", "stringAdapter", "Ljava/util/Date;", "dateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "nullableDownstreamUserDtoAdapter", "nullableDateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "nullableDownstreamDraftDtoAdapter", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "listOfDownstreamMessageDtoAdapter", "downstreamMessageDtoAdapter", "intAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "nullableListOfDownstreamChannelUserReadAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;", "nullableListOfDownstreamThreadParticipantDtoAdapter", "", "", "mapOfStringAnyAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamThreadDtoJsonAdapter extends JsonAdapter<DownstreamThreadDto> {
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<DownstreamMessageDto> downstreamMessageDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<DownstreamMessageDto>> listOfDownstreamMessageDtoAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamChannelDto> nullableDownstreamChannelDtoAdapter;
    private final JsonAdapter<DownstreamDraftDto> nullableDownstreamDraftDtoAdapter;
    private final JsonAdapter<DownstreamUserDto> nullableDownstreamUserDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<DownstreamChannelUserRead>> nullableListOfDownstreamChannelUserReadAdapter;
    private final JsonAdapter<List<DownstreamThreadParticipantDto>> nullableListOfDownstreamThreadParticipantDtoAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamThreadDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("active_participant_count", "channel", "channel_cid", "created_at", "created_by", "created_by_user_id", "deleted_at", "draft", "last_message_at", "latest_replies", "parent_message", "parent_message_id", "participant_count", "read", "reply_count", "thread_participants", "title", "updated_at", "extraData");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "active_participant_count");
        this.nullableDownstreamChannelDtoAdapter = moshi.m94400c(DownstreamChannelDto.class, c25235a0, "channel");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "channel_cid");
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.nullableDownstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, "created_by");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "deleted_at");
        this.nullableDownstreamDraftDtoAdapter = moshi.m94400c(DownstreamDraftDto.class, c25235a0, "draft");
        this.listOfDownstreamMessageDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamMessageDto.class), c25235a0, "latest_replies");
        this.downstreamMessageDtoAdapter = moshi.m94400c(DownstreamMessageDto.class, c25235a0, "parent_message");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "participant_count");
        this.nullableListOfDownstreamChannelUserReadAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamChannelUserRead.class), c25235a0, "read");
        this.nullableListOfDownstreamThreadParticipantDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamThreadParticipantDto.class), c25235a0, "thread_participants");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(41, "GeneratedJsonAdapter(DownstreamThreadDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamThreadDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        DownstreamChannelDto downstreamChannelDto = null;
        String str = null;
        Date date = null;
        DownstreamUserDto downstreamUserDto = null;
        String str2 = null;
        Date date2 = null;
        DownstreamDraftDto downstreamDraftDto = null;
        Date date3 = null;
        List list = null;
        DownstreamMessageDto downstreamMessageDto = null;
        String str3 = null;
        List list2 = null;
        Integer num3 = null;
        List list3 = null;
        String str4 = null;
        Date date4 = null;
        Map map = null;
        while (true) {
            Integer num4 = num;
            Integer num5 = num2;
            DownstreamChannelDto downstreamChannelDto2 = downstreamChannelDto;
            String str5 = str;
            Date date5 = date;
            DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
            String str6 = str2;
            Date date6 = date2;
            DownstreamDraftDto downstreamDraftDto2 = downstreamDraftDto;
            Date date7 = date3;
            if (!reader.hasNext()) {
                List list4 = list;
                reader.endObject();
                if (str5 == null) {
                    throw AbstractC31885f.m99129g("channel_cid", "channel_cid", reader);
                }
                if (date5 == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (str6 == null) {
                    throw AbstractC31885f.m99129g("created_by_user_id", "created_by_user_id", reader);
                }
                if (date7 == null) {
                    throw AbstractC31885f.m99129g("last_message_at", "last_message_at", reader);
                }
                if (list4 == null) {
                    throw AbstractC31885f.m99129g("latest_replies", "latest_replies", reader);
                }
                if (downstreamMessageDto == null) {
                    throw AbstractC31885f.m99129g("parent_message", "parent_message", reader);
                }
                if (str3 == null) {
                    throw AbstractC31885f.m99129g("parent_message_id", "parent_message_id", reader);
                }
                if (num4 == null) {
                    throw AbstractC31885f.m99129g("participant_count", "participant_count", reader);
                }
                int iIntValue = num4.intValue();
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("title", "title", reader);
                }
                if (date4 == null) {
                    throw AbstractC31885f.m99129g("updated_at", "updated_at", reader);
                }
                if (map != null) {
                    return new DownstreamThreadDto(num5, downstreamChannelDto2, str5, date5, downstreamUserDto2, str6, date6, downstreamDraftDto2, date7, list4, downstreamMessageDto, str3, iIntValue, list2, num3, list3, str4, date4, map);
                }
                throw AbstractC31885f.m99129g("extraData", "extraData", reader);
            }
            List list5 = list;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 0:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    num = num4;
                    list = list5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 1:
                    downstreamChannelDto = (DownstreamChannelDto) this.nullableDownstreamChannelDtoAdapter.fromJson(reader);
                    num = num4;
                    list = list5;
                    num2 = num5;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 2:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("channel_cid", "channel_cid", reader);
                    }
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                    break;
                case 3:
                    date = (Date) this.dateAdapter.fromJson(reader);
                    if (date == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                    break;
                case 4:
                    downstreamUserDto = (DownstreamUserDto) this.nullableDownstreamUserDtoAdapter.fromJson(reader);
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 5:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("created_by_user_id", "created_by_user_id", reader);
                    }
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                    break;
                case 6:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 7:
                    downstreamDraftDto = (DownstreamDraftDto) this.nullableDownstreamDraftDtoAdapter.fromJson(reader);
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    date3 = date7;
                    break;
                case 8:
                    date3 = (Date) this.dateAdapter.fromJson(reader);
                    if (date3 == null) {
                        throw AbstractC31885f.m99135m("last_message_at", "last_message_at", reader);
                    }
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    break;
                    break;
                case 9:
                    list = (List) this.listOfDownstreamMessageDtoAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("latest_replies", "latest_replies", reader);
                    }
                    num = num4;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                    break;
                case 10:
                    downstreamMessageDto = (DownstreamMessageDto) this.downstreamMessageDtoAdapter.fromJson(reader);
                    if (downstreamMessageDto == null) {
                        throw AbstractC31885f.m99135m("parent_message", "parent_message", reader);
                    }
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 11:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("parent_message_id", "parent_message_id", reader);
                    }
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 12:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("participant_count", "participant_count", reader);
                    }
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 13:
                    list2 = (List) this.nullableListOfDownstreamChannelUserReadAdapter.fromJson(reader);
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 14:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 15:
                    list3 = (List) this.nullableListOfDownstreamThreadParticipantDtoAdapter.fromJson(reader);
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case 16:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("title", "title", reader);
                    }
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    date4 = (Date) this.dateAdapter.fromJson(reader);
                    if (date4 == null) {
                        throw AbstractC31885f.m99135m("updated_at", "updated_at", reader);
                    }
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
                default:
                    num = num4;
                    list = list5;
                    num2 = num5;
                    downstreamChannelDto = downstreamChannelDto2;
                    str = str5;
                    date = date5;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str6;
                    date2 = date6;
                    downstreamDraftDto = downstreamDraftDto2;
                    date3 = date7;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamThreadDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("active_participant_count");
        this.nullableIntAdapter.toJson(writer, value_.getActive_participant_count());
        writer.mo94373x("channel");
        this.nullableDownstreamChannelDtoAdapter.toJson(writer, value_.getChannel());
        writer.mo94373x("channel_cid");
        this.stringAdapter.toJson(writer, value_.getChannel_cid());
        writer.mo94373x("created_at");
        this.dateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("created_by");
        this.nullableDownstreamUserDtoAdapter.toJson(writer, value_.getCreated_by());
        writer.mo94373x("created_by_user_id");
        this.stringAdapter.toJson(writer, value_.getCreated_by_user_id());
        writer.mo94373x("deleted_at");
        this.nullableDateAdapter.toJson(writer, value_.getDeleted_at());
        writer.mo94373x("draft");
        this.nullableDownstreamDraftDtoAdapter.toJson(writer, value_.getDraft());
        writer.mo94373x("last_message_at");
        this.dateAdapter.toJson(writer, value_.getLast_message_at());
        writer.mo94373x("latest_replies");
        this.listOfDownstreamMessageDtoAdapter.toJson(writer, value_.getLatest_replies());
        writer.mo94373x("parent_message");
        this.downstreamMessageDtoAdapter.toJson(writer, value_.getParent_message());
        writer.mo94373x("parent_message_id");
        this.stringAdapter.toJson(writer, value_.getParent_message_id());
        writer.mo94373x("participant_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getParticipant_count()));
        writer.mo94373x("read");
        this.nullableListOfDownstreamChannelUserReadAdapter.toJson(writer, value_.getRead());
        writer.mo94373x("reply_count");
        this.nullableIntAdapter.toJson(writer, value_.getReply_count());
        writer.mo94373x("thread_participants");
        this.nullableListOfDownstreamThreadParticipantDtoAdapter.toJson(writer, value_.getThread_participants());
        writer.mo94373x("title");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.mo94373x("updated_at");
        this.dateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
