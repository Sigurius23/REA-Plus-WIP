package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import java.util.Date;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25272z;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/Reaction;", "Lio/getstream/chat/android/models/User;", "userAdapter", "Ljava/util/Date;", "dateAdapter", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Reaction;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/Reaction;)V", "Lcom/squareup/moshi/JsonAdapter;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReactionAdapter extends JsonAdapter<Reaction> {
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<User> userAdapter;

    public ReactionAdapter(JsonAdapter<User> userAdapter, JsonAdapter<Date> dateAdapter) {
        AbstractC22676k.m65750j(userAdapter, "userAdapter");
        AbstractC22676k.m65750j(dateAdapter, "dateAdapter");
        this.userAdapter = userAdapter;
        this.dateAdapter = dateAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (Reaction) obj);
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.squareup.moshi.JsonAdapter
    public final Reaction fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        Integer numValueOf = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        Map<String, Object> mapAccumulateExtraData = null;
        String strNextString = null;
        String strNextString2 = null;
        User user = null;
        String strNextString3 = null;
        Date date = null;
        Date date2 = null;
        String nullableString = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1690722221:
                        if (strNextName.equals("message_id")) {
                            strNextString = reader.nextString();
                        }
                        break;
                    case -295464393:
                        if (strNextName.equals("updated_at")) {
                            date2 = (Date) this.dateAdapter.fromJson(reader);
                        }
                        break;
                    case -147132913:
                        if (strNextName.equals("user_id")) {
                            strNextString3 = reader.nextString();
                        }
                        break;
                    case 3575610:
                        if (strNextName.equals("type")) {
                            strNextString2 = reader.nextString();
                        }
                        break;
                    case 3599307:
                        if (strNextName.equals(UserState.Sources.USER)) {
                            user = (User) this.userAdapter.fromJson(reader);
                        }
                        break;
                    case 109264530:
                        if (strNextName.equals("score")) {
                            numValueOf = Integer.valueOf(reader.nextInt());
                        }
                        break;
                    case 749347398:
                        if (strNextName.equals("emoji_code")) {
                            nullableString = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 1369680106:
                        if (strNextName.equals("created_at")) {
                            date = (Date) this.dateAdapter.fromJson(reader);
                        }
                        break;
                    default:
                        break;
                }
            }
            JsonParsingUtils jsonParsingUtils = JsonParsingUtils.INSTANCE;
            AbstractC22676k.m65747g(strNextName);
            mapAccumulateExtraData = jsonParsingUtils.accumulateExtraData(strNextName, reader, mapAccumulateExtraData);
        }
        reader.endObject();
        JsonParsingUtils jsonParsingUtils2 = JsonParsingUtils.INSTANCE;
        jsonParsingUtils2.requireField(strNextString, "message_id", reader);
        jsonParsingUtils2.requireField(strNextString2, "type", reader);
        jsonParsingUtils2.requireField(numValueOf, "score", reader);
        jsonParsingUtils2.requireField(strNextString3, "user_id", reader);
        return new Reaction(strNextString, strNextString2, numValueOf.intValue(), user, strNextString3, date, null, date2, null, null, mapAccumulateExtraData != null ? AbstractC25247g0.m74001j0(mapAccumulateExtraData) : C25272z.f99163w, false, false, nullableString, 6976, null);
    }

    public final void toJson(AbstractC30704c0 p13, Reaction p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
