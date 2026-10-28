package io.getstream.chat.android.client.api2.model.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import java.util.Date;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamFlagDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamFlagDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamFlagDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamFlagDto;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "downstreamUserDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableDownstreamUserDtoAdapter", "nullableStringAdapter", "stringAdapter", "", "booleanAdapter", "Ljava/util/Date;", "nullableDateAdapter", "dateAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamFlagDtoJsonAdapter extends JsonAdapter<DownstreamFlagDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<DownstreamUserDto> downstreamUserDtoAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamUserDto> nullableDownstreamUserDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamFlagDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a(UserState.Sources.USER, "target_user", "target_message_id", "created_at", "created_by_automod", "approved_at", "updated_at", "reviewed_at", "reviewed_by", "rejected_at");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.downstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.nullableDownstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, "target_user");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "target_message_id");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "created_at");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "created_by_automod");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "approved_at");
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "updated_at");
    }

    public String toString() {
        return AbstractC36095b.m114677e(39, "GeneratedJsonAdapter(DownstreamFlagDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamFlagDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        DownstreamUserDto downstreamUserDto = null;
        DownstreamUserDto downstreamUserDto2 = null;
        String str = null;
        String str2 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;
        Date date5 = null;
        while (true) {
            Boolean bool2 = bool;
            if (!reader.hasNext()) {
                reader.endObject();
                if (downstreamUserDto == null) {
                    throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
                }
                if (str2 == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (bool2 == null) {
                    throw AbstractC31885f.m99129g("created_by_automod", "created_by_automod", reader);
                }
                boolean zBooleanValue = bool2.booleanValue();
                if (date2 != null) {
                    return new DownstreamFlagDto(downstreamUserDto, downstreamUserDto2, str, str2, zBooleanValue, date, date2, date3, date4, date5);
                }
                throw AbstractC31885f.m99129g("updated_at", "updated_at", reader);
            }
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    downstreamUserDto = (DownstreamUserDto) this.downstreamUserDtoAdapter.fromJson(reader);
                    if (downstreamUserDto == null) {
                        throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    break;
                case 1:
                    downstreamUserDto2 = (DownstreamUserDto) this.nullableDownstreamUserDtoAdapter.fromJson(reader);
                    break;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    break;
                case 4:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC31885f.m99135m("created_by_automod", "created_by_automod", reader);
                    }
                    continue;
                    break;
                case 5:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 6:
                    date2 = (Date) this.dateAdapter.fromJson(reader);
                    if (date2 == null) {
                        throw AbstractC31885f.m99135m("updated_at", "updated_at", reader);
                    }
                    break;
                case 7:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 8:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 9:
                    date5 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
            }
            bool = bool2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamFlagDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x(UserState.Sources.USER);
        this.downstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("target_user");
        this.nullableDownstreamUserDtoAdapter.toJson(writer, value_.getTarget_user());
        writer.mo94373x("target_message_id");
        this.nullableStringAdapter.toJson(writer, value_.getTarget_message_id());
        writer.mo94373x("created_at");
        this.stringAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("created_by_automod");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getCreated_by_automod()));
        writer.mo94373x("approved_at");
        this.nullableDateAdapter.toJson(writer, value_.getApproved_at());
        writer.mo94373x("updated_at");
        this.dateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x("reviewed_at");
        this.nullableDateAdapter.toJson(writer, value_.getReviewed_at());
        writer.mo94373x("reviewed_by");
        this.nullableDateAdapter.toJson(writer, value_.getReviewed_by());
        writer.mo94373x("rejected_at");
        this.nullableDateAdapter.toJson(writer, value_.getRejected_at());
        writer.mo94370m();
    }
}
