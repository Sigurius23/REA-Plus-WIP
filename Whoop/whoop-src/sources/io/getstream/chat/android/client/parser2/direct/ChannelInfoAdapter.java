package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.models.ChannelInfo;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/ChannelInfo;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/ChannelInfo;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/ChannelInfo;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoAdapter extends JsonAdapter<ChannelInfo> {
    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (ChannelInfo) obj);
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.squareup.moshi.JsonAdapter
    public final ChannelInfo fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        int iNextInt = 0;
        String nullableString = null;
        String nullableString2 = null;
        String nullableString3 = null;
        String nullableString4 = null;
        String nullableString5 = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -59350230:
                        if (strNextName.equals("member_count")) {
                            iNextInt = reader.nextInt();
                        }
                        break;
                    case 3355:
                        if (strNextName.equals("id")) {
                            nullableString2 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 98494:
                        if (strNextName.equals("cid")) {
                            nullableString = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 3373707:
                        if (strNextName.equals("name")) {
                            nullableString4 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 3575610:
                        if (strNextName.equals("type")) {
                            nullableString3 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 100313435:
                        if (strNextName.equals("image")) {
                            nullableString5 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    default:
                        break;
                }
            }
            reader.skipValue();
        }
        reader.endObject();
        return new ChannelInfo(nullableString, nullableString2, nullableString3, iNextInt, nullableString4, nullableString5);
    }

    public final void toJson(AbstractC30704c0 p13, ChannelInfo p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
