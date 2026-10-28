package io.getstream.chat.android.client.parser2.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto;
import java.util.Map;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004JA\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/adapters/DownstreamMemberDtoAdapter;", "Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "jsonReader", "Lcom/squareup/moshi/JsonAdapter;", "", "", "", "mapAdapter", "memberAdapter", "fromJson", "(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "Lqx/c0;", "jsonWriter", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamMemberDtoAdapter extends CustomObjectDtoAdapter<DownstreamMemberDto> {
    public static final DownstreamMemberDtoAdapter INSTANCE = new DownstreamMemberDtoAdapter();

    private DownstreamMemberDtoAdapter() {
        super(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DownstreamMemberDto.class));
    }

    @InterfaceC30729p
    public final DownstreamMemberDto fromJson(JsonReader jsonReader, JsonAdapter<Map<String, Object>> mapAdapter, JsonAdapter<DownstreamMemberDto> memberAdapter) {
        AbstractC22676k.m65750j(jsonReader, "jsonReader");
        AbstractC22676k.m65750j(mapAdapter, "mapAdapter");
        AbstractC22676k.m65750j(memberAdapter, "memberAdapter");
        return parseWithExtraData(jsonReader, mapAdapter, memberAdapter);
    }

    @InterfaceC30738t0
    public final void toJson(AbstractC30704c0 jsonWriter, DownstreamMemberDto value) {
        AbstractC22676k.m65750j(jsonWriter, "jsonWriter");
        AbstractC22676k.m65750j(value, "value");
        throw new IllegalStateException("Can't convert this to Json");
    }
}
