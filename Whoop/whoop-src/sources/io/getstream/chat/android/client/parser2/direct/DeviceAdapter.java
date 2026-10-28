package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.PushProvider;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/Device;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Device;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/Device;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DeviceAdapter extends JsonAdapter<Device> {
    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (Device) obj);
        throw null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Device fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        String strNextString = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        String strNextString2 = null;
        String nullableString = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -929110666) {
                    if (iHashCode != 3355) {
                        if (iHashCode == 2125612980 && strNextName.equals("push_provider_name")) {
                            nullableString = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                    } else if (strNextName.equals("id")) {
                        strNextString = reader.nextString();
                    }
                } else if (strNextName.equals("push_provider")) {
                    strNextString2 = reader.nextString();
                }
            }
            reader.skipValue();
        }
        reader.endObject();
        JsonParsingUtils jsonParsingUtils = JsonParsingUtils.INSTANCE;
        jsonParsingUtils.requireField(strNextString, "id", reader);
        jsonParsingUtils.requireField(strNextString2, "push_provider", reader);
        return new Device(strNextString, PushProvider.INSTANCE.fromKey(strNextString2), nullableString);
    }

    public final void toJson(AbstractC30704c0 p13, Device p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
