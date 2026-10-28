package io.getstream.chat.android.client.api2.model.response;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPushPreferenceDto;
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
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R2\u0010\u0019\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00170\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;)V", "Lqx/v;", "options", "Lqx/v;", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "mapOfStringNullableDownstreamPushPreferenceDtoAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PushPreferencesResponseJsonAdapter extends JsonAdapter<PushPreferencesResponse> {
    private final JsonAdapter<Map<String, Map<String, DownstreamPushPreferenceDto>>> mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter;
    private final JsonAdapter<Map<String, DownstreamPushPreferenceDto>> mapOfStringNullableDownstreamPushPreferenceDtoAdapter;
    private final C30740v options;

    public PushPreferencesResponseJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("user_channel_preferences", "user_preferences");
        C31882d c31882dM5369F = AbstractC1772c1.m5369F(Map.class, String.class, AbstractC1772c1.m5369F(Map.class, String.class, DownstreamPushPreferenceDto.class));
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter = moshi.m94400c(c31882dM5369F, c25235a0, "user_channel_preferences");
        this.mapOfStringNullableDownstreamPushPreferenceDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, DownstreamPushPreferenceDto.class), c25235a0, "user_preferences");
    }

    public String toString() {
        return AbstractC36095b.m114677e(45, "GeneratedJsonAdapter(PushPreferencesResponse)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PushPreferencesResponse fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Map map = null;
        Map map2 = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                map = (Map) this.mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter.fromJson(reader);
                if (map == null) {
                    throw AbstractC31885f.m99135m("user_channel_preferences", "user_channel_preferences", reader);
                }
            } else if (iMo16725T == 1 && (map2 = (Map) this.mapOfStringNullableDownstreamPushPreferenceDtoAdapter.fromJson(reader)) == null) {
                throw AbstractC31885f.m99135m("user_preferences", "user_preferences", reader);
            }
        }
        reader.endObject();
        if (map == null) {
            throw AbstractC31885f.m99129g("user_channel_preferences", "user_channel_preferences", reader);
        }
        if (map2 != null) {
            return new PushPreferencesResponse(map, map2);
        }
        throw AbstractC31885f.m99129g("user_preferences", "user_preferences", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, PushPreferencesResponse value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("user_channel_preferences");
        this.mapOfStringMapOfStringDownstreamPushPreferenceDtoAdapter.toJson(writer, value_.getUser_channel_preferences());
        writer.mo94373x("user_preferences");
        this.mapOfStringNullableDownstreamPushPreferenceDtoAdapter.toJson(writer, value_.getUser_preferences());
        writer.mo94370m();
    }
}
