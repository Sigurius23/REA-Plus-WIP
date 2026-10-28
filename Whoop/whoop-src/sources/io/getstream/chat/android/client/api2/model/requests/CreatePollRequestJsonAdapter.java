package io.getstream.chat.android.client.api2.model.requests;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
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
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!0 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/CreatePollRequest;)V", "Lqx/v;", "options", "Lqx/v;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "nullableIntAdapter", "", "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;", "listOfUpstreamOptionDtoAdapter", "", "", "mapOfStringAnyAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CreatePollRequestJsonAdapter extends JsonAdapter<CreatePollRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<UpstreamOptionDto>> listOfUpstreamOptionDtoAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public CreatePollRequestJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("allow_answers", "allow_user_suggested_options", "description", "enforce_unique_vote", "max_votes_allowed", "name", "options", "voting_visibility", "extraData");
        Class cls = Boolean.TYPE;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.booleanAdapter = moshi.m94400c(cls, c25235a0, "allow_answers");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "description");
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "max_votes_allowed");
        this.listOfUpstreamOptionDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, UpstreamOptionDto.class), c25235a0, "options");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(39, "GeneratedJsonAdapter(CreatePollRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CreatePollRequest fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        Map map = null;
        while (true) {
            Boolean bool4 = bool;
            Boolean bool5 = bool2;
            Boolean bool6 = bool3;
            String str4 = str;
            if (!reader.hasNext()) {
                Integer num2 = num;
                reader.endObject();
                if (bool4 == null) {
                    throw AbstractC31885f.m99129g("allow_answers", "allow_answers", reader);
                }
                boolean zBooleanValue = bool4.booleanValue();
                if (bool5 == null) {
                    throw AbstractC31885f.m99129g("allow_user_suggested_options", "allow_user_suggested_options", reader);
                }
                boolean zBooleanValue2 = bool5.booleanValue();
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("description", "description", reader);
                }
                if (bool6 == null) {
                    throw AbstractC31885f.m99129g("enforce_unique_vote", "enforce_unique_vote", reader);
                }
                boolean zBooleanValue3 = bool6.booleanValue();
                if (str2 == null) {
                    throw AbstractC31885f.m99129g("name", "name", reader);
                }
                if (list == null) {
                    throw AbstractC31885f.m99129g("options_", "options", reader);
                }
                if (str3 == null) {
                    throw AbstractC31885f.m99129g("voting_visibility", "voting_visibility", reader);
                }
                if (map != null) {
                    return new CreatePollRequest(zBooleanValue, zBooleanValue2, str4, zBooleanValue3, num2, str2, list, str3, map);
                }
                throw AbstractC31885f.m99129g("extraData", "extraData", reader);
            }
            Integer num3 = num;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    num = num3;
                    str = str4;
                    break;
                case 0:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC31885f.m99135m("allow_answers", "allow_answers", reader);
                    }
                    bool2 = bool5;
                    bool3 = bool6;
                    num = num3;
                    str = str4;
                    break;
                case 1:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("allow_user_suggested_options", "allow_user_suggested_options", reader);
                    }
                    bool = bool4;
                    bool3 = bool6;
                    num = num3;
                    str = str4;
                    break;
                    break;
                case 2:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("description", "description", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    num = num3;
                    break;
                    break;
                case 3:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw AbstractC31885f.m99135m("enforce_unique_vote", "enforce_unique_vote", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    num = num3;
                    str = str4;
                    break;
                    break;
                case 4:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    str = str4;
                    break;
                case 5:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("name", "name", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    num = num3;
                    str = str4;
                    break;
                case 6:
                    list = (List) this.listOfUpstreamOptionDtoAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("options_", "options", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    num = num3;
                    str = str4;
                    break;
                case 7:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("voting_visibility", "voting_visibility", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    num = num3;
                    str = str4;
                    break;
                case 8:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    num = num3;
                    str = str4;
                    break;
                default:
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    num = num3;
                    str = str4;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, CreatePollRequest value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("allow_answers");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getAllow_answers()));
        writer.mo94373x("allow_user_suggested_options");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getAllow_user_suggested_options()));
        writer.mo94373x("description");
        this.stringAdapter.toJson(writer, value_.getDescription());
        writer.mo94373x("enforce_unique_vote");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getEnforce_unique_vote()));
        writer.mo94373x("max_votes_allowed");
        this.nullableIntAdapter.toJson(writer, value_.getMax_votes_allowed());
        writer.mo94373x("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("options");
        this.listOfUpstreamOptionDtoAdapter.toJson(writer, value_.getOptions());
        writer.mo94373x("voting_visibility");
        this.stringAdapter.toJson(writer, value_.getVoting_visibility());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
