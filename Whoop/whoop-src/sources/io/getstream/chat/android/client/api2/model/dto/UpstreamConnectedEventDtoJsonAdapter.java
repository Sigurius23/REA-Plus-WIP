package io.getstream.chat.android.client.api2.model.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api.QueryParams;
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
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "dateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "upstreamUserDtoAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UpstreamConnectedEventDtoJsonAdapter extends JsonAdapter<UpstreamConnectedEventDto> {
    private final JsonAdapter<Date> dateAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<UpstreamUserDto> upstreamUserDtoAdapter;

    public UpstreamConnectedEventDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("type", "created_at", "me", QueryParams.CONNECTION_ID);
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "type");
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.upstreamUserDtoAdapter = moshi.m94400c(UpstreamUserDto.class, c25235a0, "me");
    }

    public String toString() {
        return AbstractC36095b.m114677e(47, "GeneratedJsonAdapter(UpstreamConnectedEventDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UpstreamConnectedEventDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        String str = null;
        Date date = null;
        UpstreamUserDto upstreamUserDto = null;
        String str2 = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw AbstractC31885f.m99135m("type", "type", reader);
                }
            } else if (iMo16725T == 1) {
                date = (Date) this.dateAdapter.fromJson(reader);
                if (date == null) {
                    throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                }
            } else if (iMo16725T == 2) {
                upstreamUserDto = (UpstreamUserDto) this.upstreamUserDtoAdapter.fromJson(reader);
                if (upstreamUserDto == null) {
                    throw AbstractC31885f.m99135m("me", "me", reader);
                }
            } else if (iMo16725T == 3 && (str2 = (String) this.stringAdapter.fromJson(reader)) == null) {
                throw AbstractC31885f.m99135m(QueryParams.CONNECTION_ID, QueryParams.CONNECTION_ID, reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw AbstractC31885f.m99129g("type", "type", reader);
        }
        if (date == null) {
            throw AbstractC31885f.m99129g("created_at", "created_at", reader);
        }
        if (upstreamUserDto == null) {
            throw AbstractC31885f.m99129g("me", "me", reader);
        }
        if (str2 != null) {
            return new UpstreamConnectedEventDto(str, date, upstreamUserDto, str2);
        }
        throw AbstractC31885f.m99129g(QueryParams.CONNECTION_ID, QueryParams.CONNECTION_ID, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, UpstreamConnectedEventDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("created_at");
        this.dateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("me");
        this.upstreamUserDtoAdapter.toJson(writer, value_.getMe());
        writer.mo94373x(QueryParams.CONNECTION_ID);
        this.stringAdapter.toJson(writer, value_.getConnection_id());
        writer.mo94370m();
    }
}
