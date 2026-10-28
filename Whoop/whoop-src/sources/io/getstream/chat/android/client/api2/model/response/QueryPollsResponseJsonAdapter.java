package io.getstream.chat.android.client.api2.model.response;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPollDto;
import java.util.List;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p471rx.C31882d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/QueryPollsResponse;)V", "Lqx/v;", "options", "Lqx/v;", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "listOfDownstreamPollDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryPollsResponseJsonAdapter extends JsonAdapter<QueryPollsResponse> {
    private final JsonAdapter<List<DownstreamPollDto>> listOfDownstreamPollDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public QueryPollsResponseJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("polls", "next", "prev");
        C31882d c31882dM5369F = AbstractC1772c1.m5369F(List.class, DownstreamPollDto.class);
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.listOfDownstreamPollDtoAdapter = moshi.m94400c(c31882dM5369F, c25235a0, "polls");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "next");
    }

    public String toString() {
        return AbstractC36095b.m114677e(40, "GeneratedJsonAdapter(QueryPollsResponse)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public QueryPollsResponse fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        List list = null;
        String str = null;
        String str2 = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                list = (List) this.listOfDownstreamPollDtoAdapter.fromJson(reader);
                if (list == null) {
                    throw AbstractC31885f.m99135m("polls", "polls", reader);
                }
            } else if (iMo16725T == 1) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (iMo16725T == 2) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new QueryPollsResponse(list, str, str2);
        }
        throw AbstractC31885f.m99129g("polls", "polls", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, QueryPollsResponse value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("polls");
        this.listOfDownstreamPollDtoAdapter.toJson(writer, value_.getPolls());
        writer.mo94373x("next");
        this.nullableStringAdapter.toJson(writer, value_.getNext());
        writer.mo94373x("prev");
        this.nullableStringAdapter.toJson(writer, value_.getPrev());
        writer.mo94370m();
    }
}
