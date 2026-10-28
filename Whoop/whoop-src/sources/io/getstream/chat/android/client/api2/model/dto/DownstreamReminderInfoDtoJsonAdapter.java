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
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;)V", "Lqx/v;", "options", "Lqx/v;", "Ljava/util/Date;", "nullableDateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "dateAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamReminderInfoDtoJsonAdapter extends JsonAdapter<DownstreamReminderInfoDto> {
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final C30740v options;

    public DownstreamReminderInfoDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("remind_at", "created_at", "updated_at");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "remind_at");
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
    }

    public String toString() {
        return AbstractC36095b.m114677e(47, "GeneratedJsonAdapter(DownstreamReminderInfoDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamReminderInfoDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                date = (Date) this.nullableDateAdapter.fromJson(reader);
            } else if (iMo16725T == 1) {
                date2 = (Date) this.dateAdapter.fromJson(reader);
                if (date2 == null) {
                    throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                }
            } else if (iMo16725T == 2 && (date3 = (Date) this.dateAdapter.fromJson(reader)) == null) {
                throw AbstractC31885f.m99135m("updated_at", "updated_at", reader);
            }
        }
        reader.endObject();
        if (date2 == null) {
            throw AbstractC31885f.m99129g("created_at", "created_at", reader);
        }
        if (date3 != null) {
            return new DownstreamReminderInfoDto(date, date2, date3);
        }
        throw AbstractC31885f.m99129g("updated_at", "updated_at", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamReminderInfoDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("remind_at");
        this.nullableDateAdapter.toJson(writer, value_.getRemind_at());
        writer.mo94373x("created_at");
        this.dateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("updated_at");
        this.dateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94370m();
    }
}
