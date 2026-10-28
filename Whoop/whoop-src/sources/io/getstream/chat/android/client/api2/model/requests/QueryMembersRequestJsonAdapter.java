package io.getstream.chat.android.client.api2.model.requests;

import androidx.room.AbstractC1772c1;
import com.mapbox.maps.MapboxMap;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMemberDto;
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
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R,\u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u00190\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "mapOfNullableAnyNullableAnyAdapter", "", "intAdapter", "", "", "listOfMapOfStringAnyAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;", "listOfUpstreamMemberDtoAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryMembersRequestJsonAdapter extends JsonAdapter<QueryMembersRequest> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<Map<String, Object>>> listOfMapOfStringAnyAdapter;
    private final JsonAdapter<List<UpstreamMemberDto>> listOfUpstreamMemberDtoAdapter;
    private final JsonAdapter<Map<?, ?>> mapOfNullableAnyNullableAnyAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public QueryMembersRequestJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("type", "id", "filter_conditions", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "sort", io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS);
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "type");
        this.mapOfNullableAnyNullableAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, AbstractC1772c1.m5381R(Object.class), AbstractC1772c1.m5381R(Object.class)), c25235a0, "filter_conditions");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, MapboxMap.QFE_OFFSET);
        this.listOfMapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, AbstractC1772c1.m5369F(Map.class, String.class, Object.class)), c25235a0, "sort");
        this.listOfUpstreamMemberDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, UpstreamMemberDto.class), c25235a0, io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS);
    }

    public String toString() {
        return AbstractC36095b.m114677e(41, "GeneratedJsonAdapter(QueryMembersRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public QueryMembersRequest fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        Map map = null;
        List list = null;
        List list2 = null;
        while (true) {
            Integer num3 = num;
            if (!reader.hasNext()) {
                reader.endObject();
                Integer num4 = num2;
                if (str == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (str2 == null) {
                    throw AbstractC31885f.m99129g("id", "id", reader);
                }
                if (map == null) {
                    throw AbstractC31885f.m99129g("filter_conditions", "filter_conditions", reader);
                }
                if (num3 == null) {
                    throw AbstractC31885f.m99129g(MapboxMap.QFE_OFFSET, MapboxMap.QFE_OFFSET, reader);
                }
                int iIntValue = num3.intValue();
                if (num4 == null) {
                    throw AbstractC31885f.m99129g(MapboxMap.QFE_LIMIT, MapboxMap.QFE_LIMIT, reader);
                }
                int iIntValue2 = num4.intValue();
                if (list == null) {
                    throw AbstractC31885f.m99129g("sort", "sort", reader);
                }
                if (list2 != null) {
                    return new QueryMembersRequest(str, str2, map, iIntValue, iIntValue2, list, list2);
                }
                throw AbstractC31885f.m99129g(io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, reader);
            }
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("id", "id", reader);
                    }
                    break;
                case 2:
                    map = (Map) this.mapOfNullableAnyNullableAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("filter_conditions", "filter_conditions", reader);
                    }
                    break;
                case 3:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m(MapboxMap.QFE_OFFSET, MapboxMap.QFE_OFFSET, reader);
                    }
                    continue;
                    break;
                case 4:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m(MapboxMap.QFE_LIMIT, MapboxMap.QFE_LIMIT, reader);
                    }
                    break;
                case 5:
                    list = (List) this.listOfMapOfStringAnyAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("sort", "sort", reader);
                    }
                    break;
                case 6:
                    list2 = (List) this.listOfUpstreamMemberDtoAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw AbstractC31885f.m99135m(io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, reader);
                    }
                    break;
            }
            num = num3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, QueryMembersRequest value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.mo94373x("filter_conditions");
        this.mapOfNullableAnyNullableAnyAdapter.toJson(writer, value_.getFilter_conditions());
        writer.mo94373x(MapboxMap.QFE_OFFSET);
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getOffset()));
        writer.mo94373x(MapboxMap.QFE_LIMIT);
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLimit()));
        writer.mo94373x("sort");
        this.listOfMapOfStringAnyAdapter.toJson(writer, value_.getSort());
        writer.mo94373x(io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS);
        this.listOfUpstreamMemberDtoAdapter.toJson(writer, value_.getMembers());
        writer.mo94370m();
    }
}
