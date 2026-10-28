package io.getstream.chat.android.client.api2.model.response;

import androidx.room.AbstractC1772c1;
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
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R.\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponse;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponse;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponse;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "mapOfStringAnyAdapter", "", "nullableListOfMapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ParsedPredefinedFilterResponseJsonAdapter extends JsonAdapter<ParsedPredefinedFilterResponse> {
    private volatile Constructor<ParsedPredefinedFilterResponse> constructorRef;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<List<Map<String, Object>>> nullableListOfMapOfStringAnyAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public ParsedPredefinedFilterResponseJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("name", "filter", "sort");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "name");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "filter");
        this.nullableListOfMapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, AbstractC1772c1.m5369F(Map.class, String.class, Object.class)), c25235a0, "sort");
    }

    public String toString() {
        return AbstractC36095b.m114677e(52, "GeneratedJsonAdapter(ParsedPredefinedFilterResponse)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ParsedPredefinedFilterResponse fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        String str = null;
        Map map = null;
        List list = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw AbstractC31885f.m99135m("name", "name", reader);
                }
            } else if (iMo16725T == 1) {
                map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                if (map == null) {
                    throw AbstractC31885f.m99135m("filter", "filter", reader);
                }
            } else if (iMo16725T == 2) {
                list = (List) this.nullableListOfMapOfStringAnyAdapter.fromJson(reader);
                i13 = -5;
            }
        }
        reader.endObject();
        if (i13 == -5) {
            if (str == null) {
                throw AbstractC31885f.m99129g("name", "name", reader);
            }
            if (map != null) {
                return new ParsedPredefinedFilterResponse(str, map, list);
            }
            throw AbstractC31885f.m99129g("filter", "filter", reader);
        }
        Constructor<ParsedPredefinedFilterResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ParsedPredefinedFilterResponse.class.getDeclaredConstructor(String.class, Map.class, List.class, Integer.TYPE, AbstractC31885f.f132392c);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (str == null) {
            throw AbstractC31885f.m99129g("name", "name", reader);
        }
        if (map == null) {
            throw AbstractC31885f.m99129g("filter", "filter", reader);
        }
        ParsedPredefinedFilterResponse parsedPredefinedFilterResponseNewInstance = declaredConstructor.newInstance(str, map, list, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(parsedPredefinedFilterResponseNewInstance, "newInstance(...)");
        return parsedPredefinedFilterResponseNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, ParsedPredefinedFilterResponse value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("filter");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getFilter());
        writer.mo94373x("sort");
        this.nullableListOfMapOfStringAnyAdapter.toJson(writer, value_.getSort());
        writer.mo94370m();
    }
}
