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
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "Ljava/util/Date;", "nullableDateAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamLocationDtoJsonAdapter extends JsonAdapter<DownstreamLocationDto> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamLocationDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("channel_cid", "message_id", "user_id", "latitude", "longitude", "created_by_device_id", "end_at");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "channel_cid");
        this.doubleAdapter = moshi.m94400c(Double.TYPE, c25235a0, "latitude");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "end_at");
    }

    public String toString() {
        return AbstractC36095b.m114677e(43, "GeneratedJsonAdapter(DownstreamLocationDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamLocationDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Double d3 = null;
        Double d14 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Date date = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("channel_cid", "channel_cid", reader);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("message_id", "message_id", reader);
                    }
                    break;
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("user_id", "user_id", reader);
                    }
                    break;
                    break;
                case 3:
                    d3 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d3 == null) {
                        throw AbstractC31885f.m99135m("latitude", "latitude", reader);
                    }
                    break;
                    break;
                case 4:
                    d14 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d14 == null) {
                        throw AbstractC31885f.m99135m("longitude", "longitude", reader);
                    }
                    break;
                    break;
                case 5:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("created_by_device_id", "created_by_device_id", reader);
                    }
                    break;
                    break;
                case 6:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        Double d15 = d14;
        if (str == null) {
            throw AbstractC31885f.m99129g("channel_cid", "channel_cid", reader);
        }
        if (str2 == null) {
            throw AbstractC31885f.m99129g("message_id", "message_id", reader);
        }
        if (str3 == null) {
            throw AbstractC31885f.m99129g("user_id", "user_id", reader);
        }
        if (d3 == null) {
            throw AbstractC31885f.m99129g("latitude", "latitude", reader);
        }
        double dDoubleValue = d3.doubleValue();
        if (d15 == null) {
            throw AbstractC31885f.m99129g("longitude", "longitude", reader);
        }
        double dDoubleValue2 = d15.doubleValue();
        if (str4 != null) {
            return new DownstreamLocationDto(str, str2, str3, dDoubleValue, dDoubleValue2, str4, date);
        }
        throw AbstractC31885f.m99129g("created_by_device_id", "created_by_device_id", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamLocationDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("channel_cid");
        this.stringAdapter.toJson(writer, value_.getChannel_cid());
        writer.mo94373x("message_id");
        this.stringAdapter.toJson(writer, value_.getMessage_id());
        writer.mo94373x("user_id");
        this.stringAdapter.toJson(writer, value_.getUser_id());
        writer.mo94373x("latitude");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getLatitude()));
        writer.mo94373x("longitude");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getLongitude()));
        writer.mo94373x("created_by_device_id");
        this.stringAdapter.toJson(writer, value_.getCreated_by_device_id());
        writer.mo94373x("end_at");
        this.nullableDateAdapter.toJson(writer, value_.getEnd_at());
        writer.mo94370m();
    }
}
