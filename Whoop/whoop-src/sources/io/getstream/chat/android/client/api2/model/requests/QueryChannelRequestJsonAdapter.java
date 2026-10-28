package io.getstream.chat.android.client.api2.model.requests;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/QueryChannelRequest;)V", "Lqx/v;", "options", "Lqx/v;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "mapOfStringAnyAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelRequestJsonAdapter extends JsonAdapter<QueryChannelRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final C30740v options;

    public QueryChannelRequestJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("state", "watch", "presence", "messages", "watchers", io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, "data");
        Class cls = Boolean.TYPE;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.booleanAdapter = moshi.m94400c(cls, c25235a0, "state");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "messages");
    }

    public String toString() {
        return AbstractC36095b.m114677e(41, "GeneratedJsonAdapter(QueryChannelRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public QueryChannelRequest fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        Map map4 = null;
        while (true) {
            Boolean bool4 = bool;
            Boolean bool5 = bool2;
            if (!reader.hasNext()) {
                reader.endObject();
                if (bool4 == null) {
                    throw AbstractC31885f.m99129g("state", "state", reader);
                }
                boolean zBooleanValue = bool4.booleanValue();
                if (bool5 == null) {
                    throw AbstractC31885f.m99129g("watch", "watch", reader);
                }
                boolean zBooleanValue2 = bool5.booleanValue();
                if (bool3 == null) {
                    throw AbstractC31885f.m99129g("presence", "presence", reader);
                }
                boolean zBooleanValue3 = bool3.booleanValue();
                if (map == null) {
                    throw AbstractC31885f.m99129g("messages", "messages", reader);
                }
                if (map2 == null) {
                    throw AbstractC31885f.m99129g("watchers", "watchers", reader);
                }
                if (map3 == null) {
                    throw AbstractC31885f.m99129g(io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, reader);
                }
                if (map4 != null) {
                    return new QueryChannelRequest(zBooleanValue, zBooleanValue2, zBooleanValue3, map, map2, map3, map4);
                }
                throw AbstractC31885f.m99129g("data_", "data", reader);
            }
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    bool = bool4;
                    bool2 = bool5;
                    break;
                case 0:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC31885f.m99135m("state", "state", reader);
                    }
                    bool2 = bool5;
                    break;
                case 1:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("watch", "watch", reader);
                    }
                    bool = bool4;
                    break;
                    break;
                case 2:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw AbstractC31885f.m99135m("presence", "presence", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    break;
                case 3:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("messages", "messages", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    break;
                case 4:
                    map2 = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map2 == null) {
                        throw AbstractC31885f.m99135m("watchers", "watchers", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    break;
                case 5:
                    map3 = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map3 == null) {
                        throw AbstractC31885f.m99135m(io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    break;
                case 6:
                    map4 = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map4 == null) {
                        throw AbstractC31885f.m99135m("data_", "data", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    break;
                default:
                    bool = bool4;
                    bool2 = bool5;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, QueryChannelRequest value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("state");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getState()));
        writer.mo94373x("watch");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getWatch()));
        writer.mo94373x("presence");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getPresence()));
        writer.mo94373x("messages");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getMessages());
        writer.mo94373x("watchers");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getWatchers());
        writer.mo94373x(io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS);
        this.mapOfStringAnyAdapter.toJson(writer, value_.getMembers());
        writer.mo94373x("data");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getData());
        writer.mo94370m();
    }
}
