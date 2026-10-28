package io.getstream.chat.android.client.parser2.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.dto.UpstreamReactionDto;
import java.util.Map;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJK\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u001a\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/adapters/UpstreamReactionDtoAdapter;", "Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "jsonReader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;", "Lqx/c0;", "jsonWriter", "message", "Lcom/squareup/moshi/JsonAdapter;", "", "", "", "mapAdapter", "messageAdapter", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UpstreamReactionDtoAdapter extends CustomObjectDtoAdapter<UpstreamReactionDto> {
    public static final UpstreamReactionDtoAdapter INSTANCE = new UpstreamReactionDtoAdapter();

    private UpstreamReactionDtoAdapter() {
        super(AbstractC22671h0.f89337a.getOrCreateKotlinClass(UpstreamReactionDto.class));
    }

    @InterfaceC30729p
    public final UpstreamReactionDto fromJson(JsonReader jsonReader) {
        AbstractC22676k.m65750j(jsonReader, "jsonReader");
        throw new IllegalStateException("Can't parse this from Json");
    }

    @InterfaceC30738t0
    public final void toJson(AbstractC30704c0 jsonWriter, UpstreamReactionDto message, JsonAdapter<Map<String, Object>> mapAdapter, JsonAdapter<UpstreamReactionDto> messageAdapter) {
        AbstractC22676k.m65750j(jsonWriter, "jsonWriter");
        AbstractC22676k.m65750j(mapAdapter, "mapAdapter");
        AbstractC22676k.m65750j(messageAdapter, "messageAdapter");
        serializeWithExtraData(jsonWriter, message, mapAdapter, messageAdapter);
    }
}
