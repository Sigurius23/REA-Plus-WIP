package io.getstream.chat.android.client.api2.model.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.Date;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;)V", "Lqx/v;", "options", "Lqx/v;", "Ljava/util/Date;", "nullableDateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "nullableDownstreamChannelDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "nullableDownstreamMessageDtoAdapter", "dateAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamReminderDtoJsonAdapter extends JsonAdapter<DownstreamReminderDto> {
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamChannelDto> nullableDownstreamChannelDtoAdapter;
    private final JsonAdapter<DownstreamMessageDto> nullableDownstreamMessageDtoAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamReminderDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("remind_at", "channel_cid", "channel", "message_id", "message", "created_at", "updated_at");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "remind_at");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "channel_cid");
        this.nullableDownstreamChannelDtoAdapter = moshi.m94400c(DownstreamChannelDto.class, c25235a0, "channel");
        this.nullableDownstreamMessageDtoAdapter = moshi.m94400c(DownstreamMessageDto.class, c25235a0, "message");
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
    }

    public String toString() {
        return AbstractC36095b.m114677e(43, "GeneratedJsonAdapter(DownstreamReminderDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamReminderDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Date date = null;
        String str = null;
        DownstreamChannelDto downstreamChannelDto = null;
        String str2 = null;
        DownstreamMessageDto downstreamMessageDto = null;
        Date date2 = null;
        Date date3 = null;
        while (reader.hasNext()) {
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
                        throw AbstractC31885f.m99135m("channel_cid", "channel_cid", reader);
                    }
                    break;
                    break;
                case 2:
                    downstreamChannelDto = (DownstreamChannelDto) this.nullableDownstreamChannelDtoAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("message_id", "message_id", reader);
                    }
                    break;
                    break;
                case 4:
                    downstreamMessageDto = (DownstreamMessageDto) this.nullableDownstreamMessageDtoAdapter.fromJson(reader);
                    break;
                case 5:
                    date2 = (Date) this.dateAdapter.fromJson(reader);
                    if (date2 == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    break;
                    break;
                case 6:
                    date3 = (Date) this.dateAdapter.fromJson(reader);
                    if (date3 == null) {
                        throw AbstractC31885f.m99135m("updated_at", "updated_at", reader);
                    }
                    break;
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw AbstractC31885f.m99129g("channel_cid", "channel_cid", reader);
        }
        if (str2 == null) {
            throw AbstractC31885f.m99129g("message_id", "message_id", reader);
        }
        if (date2 == null) {
            throw AbstractC31885f.m99129g("created_at", "created_at", reader);
        }
        if (date3 != null) {
            return new DownstreamReminderDto(date, str, downstreamChannelDto, str2, downstreamMessageDto, date2, date3);
        }
        throw AbstractC31885f.m99129g("updated_at", "updated_at", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamReminderDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("remind_at");
        this.nullableDateAdapter.toJson(writer, value_.getRemind_at());
        writer.mo94373x("channel_cid");
        this.stringAdapter.toJson(writer, value_.getChannel_cid());
        writer.mo94373x("channel");
        this.nullableDownstreamChannelDtoAdapter.toJson(writer, value_.getChannel());
        writer.mo94373x("message_id");
        this.stringAdapter.toJson(writer, value_.getMessage_id());
        writer.mo94373x("message");
        this.nullableDownstreamMessageDtoAdapter.toJson(writer, value_.getMessage());
        writer.mo94373x("created_at");
        this.dateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("updated_at");
        this.dateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94370m();
    }
}
