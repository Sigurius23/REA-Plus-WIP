package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.models.Option;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25272z;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/Option;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Option;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/Option;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class OptionAdapter extends JsonAdapter<Option> {
    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (Option) obj);
        throw null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Option fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        String strNextString = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        String strNextString2 = null;
        Map<String, Object> mapAccumulateExtraData = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (AbstractC22676k.m65745e(strNextName, "id")) {
                strNextString = reader.nextString();
            } else if (AbstractC22676k.m65745e(strNextName, "text")) {
                strNextString2 = reader.nextString();
            } else {
                JsonParsingUtils jsonParsingUtils = JsonParsingUtils.INSTANCE;
                AbstractC22676k.m65747g(strNextName);
                mapAccumulateExtraData = jsonParsingUtils.accumulateExtraData(strNextName, reader, mapAccumulateExtraData);
            }
        }
        reader.endObject();
        JsonParsingUtils jsonParsingUtils2 = JsonParsingUtils.INSTANCE;
        jsonParsingUtils2.requireField(strNextString, "id", reader);
        jsonParsingUtils2.requireField(strNextString2, "text", reader);
        return new Option(strNextString, strNextString2, mapAccumulateExtraData != null ? AbstractC25247g0.m74001j0(mapAccumulateExtraData) : C25272z.f99163w);
    }

    public final void toJson(AbstractC30704c0 p13, Option p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
