package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.models.Moderation;
import io.getstream.chat.android.models.ModerationAction;
import java.util.List;
import m83.C25271y;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/Moderation;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Moderation;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/Moderation;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ModerationAdapter extends JsonAdapter<Moderation> {
    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (Moderation) obj);
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.squareup.moshi.JsonAdapter
    public final Moderation fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        String strNextString = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        List<String> stringList = null;
        List<String> stringList2 = null;
        Boolean nullableBoolean = null;
        String strNextString2 = null;
        String nullableString = null;
        String nullableString2 = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -2111131539:
                        if (strNextName.equals("text_harms")) {
                            stringList = JsonParsingUtils.INSTANCE.parseStringList(reader);
                        }
                        break;
                    case -1787643365:
                        if (strNextName.equals("image_harms")) {
                            stringList2 = JsonParsingUtils.INSTANCE.parseStringList(reader);
                        }
                        break;
                    case -1422950858:
                        if (strNextName.equals("action")) {
                            strNextString = reader.nextString();
                        }
                        break;
                    case -666385649:
                        if (strNextName.equals("platform_circumvented")) {
                            nullableBoolean = JsonParsingUtils.INSTANCE.readNullableBoolean(reader);
                        }
                        break;
                    case 95009680:
                        if (strNextName.equals("blocklist_matched")) {
                            nullableString = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 1377763062:
                        if (strNextName.equals("semantic_filter_matched")) {
                            nullableString2 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 1863380699:
                        if (strNextName.equals("original_text")) {
                            strNextString2 = reader.nextString();
                        }
                        break;
                    default:
                        break;
                }
            }
            reader.skipValue();
        }
        reader.endObject();
        JsonParsingUtils jsonParsingUtils = JsonParsingUtils.INSTANCE;
        jsonParsingUtils.requireField(strNextString, "action", reader);
        jsonParsingUtils.requireField(strNextString2, "original_text", reader);
        Boolean bool = nullableBoolean;
        ModerationAction moderationActionFromValue = ModerationAction.INSTANCE.fromValue(strNextString);
        C25271y c25271y = C25271y.f99162w;
        return new Moderation(moderationActionFromValue, strNextString2, stringList == null ? c25271y : stringList, stringList2 == null ? c25271y : stringList2, nullableString, nullableString2, bool != null ? bool.booleanValue() : false);
    }

    public final void toJson(AbstractC30704c0 p13, Moderation p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
