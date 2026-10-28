package io.getstream.chat.android.client.api2.model.dto;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import java.util.Date;
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
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!0 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;)V", "Lqx/v;", "options", "Lqx/v;", "Ljava/util/Date;", "nullableDateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "intAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "nullableDownstreamUserDtoAdapter", "nullableStringAdapter", "", "", "mapOfStringAnyAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamReactionDtoJsonAdapter extends JsonAdapter<DownstreamReactionDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamUserDto> nullableDownstreamUserDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamReactionDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("created_at", "message_id", "score", "type", "updated_at", UserState.Sources.USER, "user_id", "emoji_code", "extraData");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "message_id");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "score");
        this.nullableDownstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "emoji_code");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(43, "GeneratedJsonAdapter(DownstreamReactionDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamReactionDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Date date = null;
        String str = null;
        String str2 = null;
        Date date2 = null;
        DownstreamUserDto downstreamUserDto = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        while (true) {
            Integer num2 = num;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str == null) {
                    throw AbstractC31885f.m99129g("message_id", "message_id", reader);
                }
                if (num2 == null) {
                    throw AbstractC31885f.m99129g("score", "score", reader);
                }
                int iIntValue = num2.intValue();
                if (str2 == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (str3 == null) {
                    throw AbstractC31885f.m99129g("user_id", "user_id", reader);
                }
                if (map != null) {
                    return new DownstreamReactionDto(date, str, iIntValue, str2, date2, downstreamUserDto, str3, str4, map);
                }
                throw AbstractC31885f.m99129g("extraData", "extraData", reader);
            }
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 1:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("message_id", "message_id", reader);
                    }
                    break;
                case 2:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("score", "score", reader);
                    }
                    continue;
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    break;
                case 4:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 5:
                    downstreamUserDto = (DownstreamUserDto) this.nullableDownstreamUserDtoAdapter.fromJson(reader);
                    break;
                case 6:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("user_id", "user_id", reader);
                    }
                    break;
                case 7:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    break;
            }
            num = num2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamReactionDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("created_at");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("message_id");
        this.stringAdapter.toJson(writer, value_.getMessage_id());
        writer.mo94373x("score");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getScore()));
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("updated_at");
        this.nullableDateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x(UserState.Sources.USER);
        this.nullableDownstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("user_id");
        this.stringAdapter.toJson(writer, value_.getUser_id());
        writer.mo94373x("emoji_code");
        this.nullableStringAdapter.toJson(writer, value_.getEmoji_code());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
