package io.getstream.chat.android.client.api2.model.requests;

import androidx.room.AbstractC1772c1;
import com.mapbox.maps.MapboxMap;
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
import p471rx.C31882d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u00170\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;)V", "Lqx/v;", "options", "Lqx/v;", "", "mapOfNullableAnyNullableAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "listOfMapOfStringAnyAdapter", "", "nullableIntAdapter", "Ljava/util/Date;", "nullableDateAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryBannedUsersRequestJsonAdapter extends JsonAdapter<QueryBannedUsersRequest> {
    private final JsonAdapter<List<Map<String, Object>>> listOfMapOfStringAnyAdapter;
    private final JsonAdapter<Map<?, ?>> mapOfNullableAnyNullableAnyAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final C30740v options;

    public QueryBannedUsersRequestJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("filter_conditions", "sort", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "created_at_after", "created_at_after_or_equal", "created_at_before", "created_at_before_or_equal");
        C31882d c31882dM5369F = AbstractC1772c1.m5369F(Map.class, AbstractC1772c1.m5381R(Object.class), AbstractC1772c1.m5381R(Object.class));
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.mapOfNullableAnyNullableAnyAdapter = moshi.m94400c(c31882dM5369F, c25235a0, "filter_conditions");
        this.listOfMapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, AbstractC1772c1.m5369F(Map.class, String.class, Object.class)), c25235a0, "sort");
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, MapboxMap.QFE_OFFSET);
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at_after");
    }

    public String toString() {
        return AbstractC36095b.m114677e(45, "GeneratedJsonAdapter(QueryBannedUsersRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public QueryBannedUsersRequest fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Map map = null;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    map = (Map) this.mapOfNullableAnyNullableAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("filter_conditions", "filter_conditions", reader);
                    }
                    break;
                    break;
                case 1:
                    list = (List) this.listOfMapOfStringAnyAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("sort", "sort", reader);
                    }
                    break;
                    break;
                case 2:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    break;
                case 3:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    break;
                case 4:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 5:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 6:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 7:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (map == null) {
            throw AbstractC31885f.m99129g("filter_conditions", "filter_conditions", reader);
        }
        if (list != null) {
            return new QueryBannedUsersRequest(map, list, num, num2, date, date2, date3, date4);
        }
        throw AbstractC31885f.m99129g("sort", "sort", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, QueryBannedUsersRequest value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("filter_conditions");
        this.mapOfNullableAnyNullableAnyAdapter.toJson(writer, value_.getFilter_conditions());
        writer.mo94373x("sort");
        this.listOfMapOfStringAnyAdapter.toJson(writer, value_.getSort());
        writer.mo94373x(MapboxMap.QFE_OFFSET);
        this.nullableIntAdapter.toJson(writer, value_.getOffset());
        writer.mo94373x(MapboxMap.QFE_LIMIT);
        this.nullableIntAdapter.toJson(writer, value_.getLimit());
        writer.mo94373x("created_at_after");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at_after());
        writer.mo94373x("created_at_after_or_equal");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at_after_or_equal());
        writer.mo94373x("created_at_before");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at_before());
        writer.mo94373x("created_at_before_or_equal");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at_before_or_equal());
        writer.mo94370m();
    }
}
