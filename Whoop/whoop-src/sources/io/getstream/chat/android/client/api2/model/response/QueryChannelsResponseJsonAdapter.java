package io.getstream.chat.android.client.api2.model.response;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponse;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponse;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/QueryChannelsResponse;)V", "Lqx/v;", "options", "Lqx/v;", "", "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "listOfChannelResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponse;", "nullableParsedPredefinedFilterResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsResponseJsonAdapter extends JsonAdapter<QueryChannelsResponse> {
    private volatile Constructor<QueryChannelsResponse> constructorRef;
    private final JsonAdapter<List<ChannelResponse>> listOfChannelResponseAdapter;
    private final JsonAdapter<ParsedPredefinedFilterResponse> nullableParsedPredefinedFilterResponseAdapter;
    private final C30740v options;

    public QueryChannelsResponseJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("channels", "predefined_filter");
        C31882d c31882dM5369F = AbstractC1772c1.m5369F(List.class, ChannelResponse.class);
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.listOfChannelResponseAdapter = moshi.m94400c(c31882dM5369F, c25235a0, "channels");
        this.nullableParsedPredefinedFilterResponseAdapter = moshi.m94400c(ParsedPredefinedFilterResponse.class, c25235a0, "predefined_filter");
    }

    public String toString() {
        return AbstractC36095b.m114677e(43, "GeneratedJsonAdapter(QueryChannelsResponse)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public QueryChannelsResponse fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        List list = null;
        ParsedPredefinedFilterResponse parsedPredefinedFilterResponse = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                list = (List) this.listOfChannelResponseAdapter.fromJson(reader);
                if (list == null) {
                    throw AbstractC31885f.m99135m("channels", "channels", reader);
                }
            } else if (iMo16725T == 1) {
                parsedPredefinedFilterResponse = (ParsedPredefinedFilterResponse) this.nullableParsedPredefinedFilterResponseAdapter.fromJson(reader);
                i13 = -3;
            }
        }
        reader.endObject();
        if (i13 == -3) {
            if (list != null) {
                return new QueryChannelsResponse(list, parsedPredefinedFilterResponse);
            }
            throw AbstractC31885f.m99129g("channels", "channels", reader);
        }
        Constructor<QueryChannelsResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = QueryChannelsResponse.class.getDeclaredConstructor(List.class, ParsedPredefinedFilterResponse.class, Integer.TYPE, AbstractC31885f.f132392c);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (list == null) {
            throw AbstractC31885f.m99129g("channels", "channels", reader);
        }
        QueryChannelsResponse queryChannelsResponseNewInstance = declaredConstructor.newInstance(list, parsedPredefinedFilterResponse, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(queryChannelsResponseNewInstance, "newInstance(...)");
        return queryChannelsResponseNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, QueryChannelsResponse value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("channels");
        this.listOfChannelResponseAdapter.toJson(writer, value_.getChannels());
        writer.mo94373x("predefined_filter");
        this.nullableParsedPredefinedFilterResponseAdapter.toJson(writer, value_.getPredefined_filter());
        writer.mo94370m();
    }
}
