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
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamChannelUserReadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamChannelUserRead;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamChannelUserRead;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamChannelUserRead;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "upstreamUserDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "dateAdapter", "", "intAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UpstreamChannelUserReadJsonAdapter extends JsonAdapter<UpstreamChannelUserRead> {
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final C30740v options;
    private final JsonAdapter<UpstreamUserDto> upstreamUserDtoAdapter;

    public UpstreamChannelUserReadJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a(UserState.Sources.USER, "last_read", "unread_messages");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.upstreamUserDtoAdapter = moshi.m94400c(UpstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "last_read");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "unread_messages");
    }

    public String toString() {
        return AbstractC36095b.m114677e(45, "GeneratedJsonAdapter(UpstreamChannelUserRead)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UpstreamChannelUserRead fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        UpstreamUserDto upstreamUserDto = null;
        Date date = null;
        Integer num = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                upstreamUserDto = (UpstreamUserDto) this.upstreamUserDtoAdapter.fromJson(reader);
                if (upstreamUserDto == null) {
                    throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                }
            } else if (iMo16725T == 1) {
                date = (Date) this.dateAdapter.fromJson(reader);
                if (date == null) {
                    throw AbstractC31885f.m99135m("last_read", "last_read", reader);
                }
            } else if (iMo16725T == 2 && (num = (Integer) this.intAdapter.fromJson(reader)) == null) {
                throw AbstractC31885f.m99135m("unread_messages", "unread_messages", reader);
            }
        }
        reader.endObject();
        if (upstreamUserDto == null) {
            throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
        }
        if (date == null) {
            throw AbstractC31885f.m99129g("last_read", "last_read", reader);
        }
        if (num != null) {
            return new UpstreamChannelUserRead(upstreamUserDto, date, num.intValue());
        }
        throw AbstractC31885f.m99129g("unread_messages", "unread_messages", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, UpstreamChannelUserRead value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x(UserState.Sources.USER);
        this.upstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("last_read");
        this.dateAdapter.toJson(writer, value_.getLast_read());
        writer.mo94373x("unread_messages");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_messages()));
        writer.mo94370m();
    }
}
