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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R.\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R(\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020-\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;)V", "Lqx/v;", "options", "Lqx/v;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Ljava/util/Date;", "dateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "nullableDownstreamUserDtoAdapter", "stringAdapter", "nullableBooleanAdapter", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;", "nullableListOfDownstreamVoteDtoAdapter", "", "nullableMapOfStringListOfDownstreamVoteDtoAdapter", "nullableIntAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;", "listOfDownstreamPollOptionDtoAdapter", "listOfDownstreamVoteDtoAdapter", "nullableMapOfStringIntAdapter", "nullableStringAdapter", "", "nullableMapOfStringAnyAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamPollDtoJsonAdapter extends JsonAdapter<DownstreamPollDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<DownstreamPollOptionDto>> listOfDownstreamPollOptionDtoAdapter;
    private final JsonAdapter<List<DownstreamVoteDto>> listOfDownstreamVoteDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<DownstreamUserDto> nullableDownstreamUserDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<DownstreamVoteDto>> nullableListOfDownstreamVoteDtoAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<Map<String, Integer>> nullableMapOfStringIntAdapter;
    private final JsonAdapter<Map<String, List<DownstreamVoteDto>>> nullableMapOfStringListOfDownstreamVoteDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamPollDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("allow_answers", "allow_user_suggested_options", "answers_count", "created_at", "created_by", "created_by_id", "description", "enforce_unique_vote", "id", "is_closed", "latest_answers", "latest_votes_by_option", "max_votes_allowed", "name", "options", "own_votes", "updated_at", "vote_count", "vote_counts_by_option", "voting_visibility", "extraData");
        Class cls = Boolean.TYPE;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.booleanAdapter = moshi.m94400c(cls, c25235a0, "allow_answers");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "answers_count");
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.nullableDownstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, "created_by");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "created_by_id");
        this.nullableBooleanAdapter = moshi.m94400c(Boolean.class, c25235a0, "is_closed");
        this.nullableListOfDownstreamVoteDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamVoteDto.class), c25235a0, "latest_answers");
        this.nullableMapOfStringListOfDownstreamVoteDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, AbstractC1772c1.m5369F(List.class, DownstreamVoteDto.class)), c25235a0, "latest_votes_by_option");
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "max_votes_allowed");
        this.listOfDownstreamPollOptionDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamPollOptionDto.class), c25235a0, "options");
        this.listOfDownstreamVoteDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamVoteDto.class), c25235a0, "own_votes");
        this.nullableMapOfStringIntAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Integer.class), c25235a0, "vote_counts_by_option");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "voting_visibility");
        this.nullableMapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(39, "GeneratedJsonAdapter(DownstreamPollDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamPollDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        Boolean bool3 = null;
        Integer num2 = null;
        Date date = null;
        DownstreamUserDto downstreamUserDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool4 = null;
        List list = null;
        Map map = null;
        Integer num3 = null;
        String str4 = null;
        List list2 = null;
        List list3 = null;
        Date date2 = null;
        Map map2 = null;
        String str5 = null;
        Map map3 = null;
        while (true) {
            Boolean bool5 = bool;
            Boolean bool6 = bool2;
            Integer num4 = num;
            Boolean bool7 = bool3;
            Integer num5 = num2;
            Date date3 = date;
            DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            Boolean bool8 = bool4;
            if (!reader.hasNext()) {
                reader.endObject();
                if (bool5 == null) {
                    throw AbstractC31885f.m99129g("allow_answers", "allow_answers", reader);
                }
                boolean zBooleanValue = bool5.booleanValue();
                if (bool6 == null) {
                    throw AbstractC31885f.m99129g("allow_user_suggested_options", "allow_user_suggested_options", reader);
                }
                boolean zBooleanValue2 = bool6.booleanValue();
                if (num4 == null) {
                    throw AbstractC31885f.m99129g("answers_count", "answers_count", reader);
                }
                int iIntValue = num4.intValue();
                if (date3 == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (str6 == null) {
                    throw AbstractC31885f.m99129g("created_by_id", "created_by_id", reader);
                }
                if (str7 == null) {
                    throw AbstractC31885f.m99129g("description", "description", reader);
                }
                if (bool7 == null) {
                    throw AbstractC31885f.m99129g("enforce_unique_vote", "enforce_unique_vote", reader);
                }
                boolean zBooleanValue3 = bool7.booleanValue();
                if (str8 == null) {
                    throw AbstractC31885f.m99129g("id", "id", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("name", "name", reader);
                }
                if (list2 == null) {
                    throw AbstractC31885f.m99129g("options_", "options", reader);
                }
                if (list3 == null) {
                    throw AbstractC31885f.m99129g("own_votes", "own_votes", reader);
                }
                if (date2 == null) {
                    throw AbstractC31885f.m99129g("updated_at", "updated_at", reader);
                }
                if (num5 != null) {
                    return new DownstreamPollDto(zBooleanValue, zBooleanValue2, iIntValue, date3, downstreamUserDto2, str6, str7, zBooleanValue3, str8, bool8, list, map, num3, str4, list2, list3, date2, num5.intValue(), map2, str5, map3);
                }
                throw AbstractC31885f.m99129g("vote_count", "vote_count", reader);
            }
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 0:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC31885f.m99135m("allow_answers", "allow_answers", reader);
                    }
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 1:
                    Boolean bool9 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool9 == null) {
                        throw AbstractC31885f.m99135m("allow_user_suggested_options", "allow_user_suggested_options", reader);
                    }
                    bool2 = bool9;
                    bool = bool5;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                    break;
                case 2:
                    Integer num6 = (Integer) this.intAdapter.fromJson(reader);
                    if (num6 == null) {
                        throw AbstractC31885f.m99135m("answers_count", "answers_count", reader);
                    }
                    num = num6;
                    bool = bool5;
                    bool2 = bool6;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                    break;
                case 3:
                    date = (Date) this.dateAdapter.fromJson(reader);
                    if (date == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                    break;
                case 4:
                    downstreamUserDto = (DownstreamUserDto) this.nullableDownstreamUserDtoAdapter.fromJson(reader);
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 5:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("created_by_id", "created_by_id", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                    break;
                case 6:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("description", "description", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                    break;
                case 7:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw AbstractC31885f.m99135m("enforce_unique_vote", "enforce_unique_vote", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                    break;
                case 8:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("id", "id", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    bool4 = bool8;
                    break;
                    break;
                case 9:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    break;
                case 10:
                    list = (List) this.nullableListOfDownstreamVoteDtoAdapter.fromJson(reader);
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 11:
                    map = (Map) this.nullableMapOfStringListOfDownstreamVoteDtoAdapter.fromJson(reader);
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 12:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 13:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("name", "name", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 14:
                    list2 = (List) this.listOfDownstreamPollOptionDtoAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw AbstractC31885f.m99135m("options_", "options", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 15:
                    list3 = (List) this.listOfDownstreamVoteDtoAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw AbstractC31885f.m99135m("own_votes", "own_votes", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 16:
                    date2 = (Date) this.dateAdapter.fromJson(reader);
                    if (date2 == null) {
                        throw AbstractC31885f.m99135m("updated_at", "updated_at", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("vote_count", "vote_count", reader);
                    }
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    map2 = (Map) this.nullableMapOfStringIntAdapter.fromJson(reader);
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                case 20:
                    map3 = (Map) this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
                default:
                    bool = bool5;
                    bool2 = bool6;
                    num = num4;
                    bool3 = bool7;
                    num2 = num5;
                    date = date3;
                    downstreamUserDto = downstreamUserDto2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool4 = bool8;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamPollDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("allow_answers");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getAllow_answers()));
        writer.mo94373x("allow_user_suggested_options");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getAllow_user_suggested_options()));
        writer.mo94373x("answers_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getAnswers_count()));
        writer.mo94373x("created_at");
        this.dateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("created_by");
        this.nullableDownstreamUserDtoAdapter.toJson(writer, value_.getCreated_by());
        writer.mo94373x("created_by_id");
        this.stringAdapter.toJson(writer, value_.getCreated_by_id());
        writer.mo94373x("description");
        this.stringAdapter.toJson(writer, value_.getDescription());
        writer.mo94373x("enforce_unique_vote");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getEnforce_unique_vote()));
        writer.mo94373x("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.mo94373x("is_closed");
        this.nullableBooleanAdapter.toJson(writer, value_.is_closed());
        writer.mo94373x("latest_answers");
        this.nullableListOfDownstreamVoteDtoAdapter.toJson(writer, value_.getLatest_answers());
        writer.mo94373x("latest_votes_by_option");
        this.nullableMapOfStringListOfDownstreamVoteDtoAdapter.toJson(writer, value_.getLatest_votes_by_option());
        writer.mo94373x("max_votes_allowed");
        this.nullableIntAdapter.toJson(writer, value_.getMax_votes_allowed());
        writer.mo94373x("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("options");
        this.listOfDownstreamPollOptionDtoAdapter.toJson(writer, value_.getOptions());
        writer.mo94373x("own_votes");
        this.listOfDownstreamVoteDtoAdapter.toJson(writer, value_.getOwn_votes());
        writer.mo94373x("updated_at");
        this.dateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x("vote_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getVote_count()));
        writer.mo94373x("vote_counts_by_option");
        this.nullableMapOfStringIntAdapter.toJson(writer, value_.getVote_counts_by_option());
        writer.mo94373x("voting_visibility");
        this.nullableStringAdapter.toJson(writer, value_.getVoting_visibility());
        writer.mo94373x("extraData");
        this.nullableMapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
