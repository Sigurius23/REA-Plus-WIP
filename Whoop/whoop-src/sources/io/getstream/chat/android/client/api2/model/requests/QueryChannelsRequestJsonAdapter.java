package io.getstream.chat.android.client.api2.model.requests;

import androidx.room.AbstractC1772c1;
import com.mapbox.maps.MapboxMap;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R.\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u0017\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;)V", "Lqx/v;", "options", "Lqx/v;", "", "nullableMapOfNullableAnyNullableAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "nullableListOfMapOfStringAnyAdapter", "nullableStringAdapter", "nullableMapOfStringAnyAdapter", "", "intAdapter", "nullableIntAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsRequestJsonAdapter extends JsonAdapter<QueryChannelsRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<QueryChannelsRequest> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<Map<String, Object>>> nullableListOfMapOfStringAnyAdapter;
    private final JsonAdapter<Map<?, ?>> nullableMapOfNullableAnyNullableAnyAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public QueryChannelsRequestJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("filter_conditions", "sort", "predefined_filter", "filter_values", "sort_values", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "message_limit", "member_limit", "state", "watch", "presence");
        C31882d c31882dM5369F = AbstractC1772c1.m5369F(Map.class, AbstractC1772c1.m5381R(Object.class), AbstractC1772c1.m5381R(Object.class));
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableMapOfNullableAnyNullableAnyAdapter = moshi.m94400c(c31882dM5369F, c25235a0, "filter_conditions");
        this.nullableListOfMapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, AbstractC1772c1.m5369F(Map.class, String.class, Object.class)), c25235a0, "sort");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "predefined_filter");
        this.nullableMapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "filter_values");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, MapboxMap.QFE_OFFSET);
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "message_limit");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "state");
    }

    public String toString() {
        return AbstractC36095b.m114677e(42, "GeneratedJsonAdapter(QueryChannelsRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public QueryChannelsRequest fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        Map map = null;
        List list = null;
        String str = null;
        Map map2 = null;
        Map map3 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (true) {
            Map map4 = map;
            List list2 = list;
            String str2 = str;
            Map map5 = map2;
            if (!reader.hasNext()) {
                Map map6 = map3;
                reader.endObject();
                if (i13 == -32) {
                    if (num == null) {
                        throw AbstractC31885f.m99129g(MapboxMap.QFE_OFFSET, MapboxMap.QFE_OFFSET, reader);
                    }
                    Integer num5 = num2;
                    int iIntValue = num.intValue();
                    if (num5 == null) {
                        throw AbstractC31885f.m99129g(MapboxMap.QFE_LIMIT, MapboxMap.QFE_LIMIT, reader);
                    }
                    Boolean bool4 = bool;
                    Integer num6 = num4;
                    Integer num7 = num3;
                    int iIntValue2 = num5.intValue();
                    if (bool4 == null) {
                        throw AbstractC31885f.m99129g("state", "state", reader);
                    }
                    Boolean bool5 = bool2;
                    boolean zBooleanValue = bool4.booleanValue();
                    if (bool5 == null) {
                        throw AbstractC31885f.m99129g("watch", "watch", reader);
                    }
                    Boolean bool6 = bool3;
                    boolean zBooleanValue2 = bool5.booleanValue();
                    if (bool6 != null) {
                        return new QueryChannelsRequest(map4, list2, str2, map5, map6, iIntValue, iIntValue2, num7, num6, zBooleanValue, zBooleanValue2, bool6.booleanValue());
                    }
                    throw AbstractC31885f.m99129g("presence", "presence", reader);
                }
                Integer num8 = num2;
                Boolean bool7 = bool;
                Boolean bool8 = bool2;
                Boolean bool9 = bool3;
                Integer num9 = num4;
                Integer num10 = num3;
                Constructor<QueryChannelsRequest> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class cls = Boolean.TYPE;
                    Class cls2 = AbstractC31885f.f132392c;
                    Class cls3 = Integer.TYPE;
                    declaredConstructor = QueryChannelsRequest.class.getDeclaredConstructor(Map.class, List.class, String.class, Map.class, Map.class, cls3, cls3, Integer.class, Integer.class, cls, cls, cls, cls3, cls2);
                    this.constructorRef = declaredConstructor;
                    AbstractC22676k.m65749i(declaredConstructor, "also(...)");
                }
                if (num == null) {
                    throw AbstractC31885f.m99129g(MapboxMap.QFE_OFFSET, MapboxMap.QFE_OFFSET, reader);
                }
                if (num8 == null) {
                    throw AbstractC31885f.m99129g(MapboxMap.QFE_LIMIT, MapboxMap.QFE_LIMIT, reader);
                }
                if (bool7 == null) {
                    throw AbstractC31885f.m99129g("state", "state", reader);
                }
                if (bool8 == null) {
                    throw AbstractC31885f.m99129g("watch", "watch", reader);
                }
                if (bool9 == null) {
                    throw AbstractC31885f.m99129g("presence", "presence", reader);
                }
                QueryChannelsRequest queryChannelsRequestNewInstance = declaredConstructor.newInstance(map4, list2, str2, map5, map6, num, num8, num10, num9, bool7, bool8, bool9, Integer.valueOf(i13), null);
                AbstractC22676k.m65749i(queryChannelsRequestNewInstance, "newInstance(...)");
                return queryChannelsRequestNewInstance;
            }
            Map map7 = map3;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                case 0:
                    map = (Map) this.nullableMapOfNullableAnyNullableAnyAdapter.fromJson(reader);
                    i13 &= -2;
                    map3 = map7;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                case 1:
                    list = (List) this.nullableListOfMapOfStringAnyAdapter.fromJson(reader);
                    i13 &= -3;
                    map3 = map7;
                    map = map4;
                    str = str2;
                    map2 = map5;
                    break;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -5;
                    map3 = map7;
                    map = map4;
                    list = list2;
                    map2 = map5;
                    break;
                case 3:
                    map2 = (Map) this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    i13 &= -9;
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    break;
                case 4:
                    map3 = (Map) this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    i13 &= -17;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                case 5:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m(MapboxMap.QFE_OFFSET, MapboxMap.QFE_OFFSET, reader);
                    }
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                case 6:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m(MapboxMap.QFE_LIMIT, MapboxMap.QFE_LIMIT, reader);
                    }
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                case 7:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                case 8:
                    num4 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                case 9:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC31885f.m99135m("state", "state", reader);
                    }
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                case 10:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("watch", "watch", reader);
                    }
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                case 11:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw AbstractC31885f.m99135m("presence", "presence", reader);
                    }
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
                default:
                    map3 = map7;
                    map = map4;
                    list = list2;
                    str = str2;
                    map2 = map5;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, QueryChannelsRequest value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("filter_conditions");
        this.nullableMapOfNullableAnyNullableAnyAdapter.toJson(writer, value_.getFilter_conditions());
        writer.mo94373x("sort");
        this.nullableListOfMapOfStringAnyAdapter.toJson(writer, value_.getSort());
        writer.mo94373x("predefined_filter");
        this.nullableStringAdapter.toJson(writer, value_.getPredefined_filter());
        writer.mo94373x("filter_values");
        this.nullableMapOfStringAnyAdapter.toJson(writer, value_.getFilter_values());
        writer.mo94373x("sort_values");
        this.nullableMapOfStringAnyAdapter.toJson(writer, value_.getSort_values());
        writer.mo94373x(MapboxMap.QFE_OFFSET);
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getOffset()));
        writer.mo94373x(MapboxMap.QFE_LIMIT);
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLimit()));
        writer.mo94373x("message_limit");
        this.nullableIntAdapter.toJson(writer, value_.getMessage_limit());
        writer.mo94373x("member_limit");
        this.nullableIntAdapter.toJson(writer, value_.getMember_limit());
        writer.mo94373x("state");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getState()));
        writer.mo94373x("watch");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getWatch()));
        writer.mo94373x("presence");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getPresence()));
        writer.mo94370m();
    }
}
