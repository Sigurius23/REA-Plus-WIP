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
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R.\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u0017\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;)V", "Lqx/v;", "options", "Lqx/v;", "", "nullableMapOfNullableAnyNullableAnyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "nullableListOfMapOfStringAnyAdapter", "", "booleanAdapter", "", "intAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryThreadsRequestJsonAdapter extends JsonAdapter<QueryThreadsRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<QueryThreadsRequest> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<Map<String, Object>>> nullableListOfMapOfStringAnyAdapter;
    private final JsonAdapter<Map<?, ?>> nullableMapOfNullableAnyNullableAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public QueryThreadsRequestJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("filter", "sort", "watch", MapboxMap.QFE_LIMIT, "member_limit", "next", "participant_limit", "prev", "reply_limit");
        C31882d c31882dM5369F = AbstractC1772c1.m5369F(Map.class, AbstractC1772c1.m5381R(Object.class), AbstractC1772c1.m5381R(Object.class));
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableMapOfNullableAnyNullableAnyAdapter = moshi.m94400c(c31882dM5369F, c25235a0, "filter");
        this.nullableListOfMapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, AbstractC1772c1.m5369F(Map.class, String.class, Object.class)), c25235a0, "sort");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "watch");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, MapboxMap.QFE_LIMIT);
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "next");
    }

    public String toString() {
        return AbstractC36095b.m114677e(41, "GeneratedJsonAdapter(QueryThreadsRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public QueryThreadsRequest fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i13 = -1;
        Boolean bool2 = bool;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Map map = null;
        List list = null;
        String str = null;
        String str2 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    map = (Map) this.nullableMapOfNullableAnyNullableAnyAdapter.fromJson(reader);
                    i13 &= -2;
                    break;
                case 1:
                    list = (List) this.nullableListOfMapOfStringAnyAdapter.fromJson(reader);
                    i13 &= -3;
                    break;
                case 2:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("watch", "watch", reader);
                    }
                    i13 &= -5;
                    break;
                    break;
                case 3:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m(MapboxMap.QFE_LIMIT, MapboxMap.QFE_LIMIT, reader);
                    }
                    i13 &= -9;
                    break;
                    break;
                case 4:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("member_limit", "member_limit", reader);
                    }
                    i13 &= -17;
                    break;
                    break;
                case 5:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -33;
                    break;
                case 6:
                    num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw AbstractC31885f.m99135m("participant_limit", "participant_limit", reader);
                    }
                    i13 &= -65;
                    break;
                    break;
                case 7:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -129;
                    break;
                case 8:
                    num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw AbstractC31885f.m99135m("reply_limit", "reply_limit", reader);
                    }
                    i13 &= -257;
                    break;
                    break;
            }
        }
        reader.endObject();
        if (i13 == -512) {
            return new QueryThreadsRequest(map, list, bool2.booleanValue(), num.intValue(), num2.intValue(), str, num3.intValue(), str2, num4.intValue());
        }
        Constructor<QueryThreadsRequest> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = AbstractC31885f.f132392c;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            declaredConstructor = QueryThreadsRequest.class.getDeclaredConstructor(Map.class, List.class, cls2, cls3, cls3, String.class, cls3, String.class, cls3, cls3, cls);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        QueryThreadsRequest queryThreadsRequestNewInstance = declaredConstructor.newInstance(map, list, bool2, num, num2, str, num3, str2, num4, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(queryThreadsRequestNewInstance, "newInstance(...)");
        return queryThreadsRequestNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, QueryThreadsRequest value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("filter");
        this.nullableMapOfNullableAnyNullableAnyAdapter.toJson(writer, value_.getFilter());
        writer.mo94373x("sort");
        this.nullableListOfMapOfStringAnyAdapter.toJson(writer, value_.getSort());
        writer.mo94373x("watch");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getWatch()));
        writer.mo94373x(MapboxMap.QFE_LIMIT);
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLimit()));
        writer.mo94373x("member_limit");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getMember_limit()));
        writer.mo94373x("next");
        this.nullableStringAdapter.toJson(writer, value_.getNext());
        writer.mo94373x("participant_limit");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getParticipant_limit()));
        writer.mo94373x("prev");
        this.nullableStringAdapter.toJson(writer, value_.getPrev());
        writer.mo94373x("reply_limit");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getReply_limit()));
        writer.mo94370m();
    }
}
