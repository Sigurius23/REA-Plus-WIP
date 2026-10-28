package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.models.Attachment;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/Attachment;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Attachment;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/Attachment;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentAdapter extends JsonAdapter<Attachment> {
    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (Attachment) obj);
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.squareup.moshi.JsonAdapter
    public final Attachment fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        Map<String, Object> mapAccumulateExtraData = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        int iIntValue = 0;
        String nullableString = null;
        String nullableString2 = null;
        String nullableString3 = null;
        String nullableString4 = null;
        String nullableString5 = null;
        String nullableString6 = null;
        String nullableString7 = null;
        String nullableString8 = null;
        String nullableString9 = null;
        String nullableString10 = null;
        String nullableString11 = null;
        String nullableString12 = null;
        String nullableString13 = null;
        String nullableString14 = null;
        Integer nullableInt = null;
        Integer nullableInt2 = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1773601407:
                        if (strNextName.equals("title_link")) {
                            nullableString3 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case -1316310812:
                        if (strNextName.equals("file_size")) {
                            Integer nullableInt3 = JsonParsingUtils.INSTANCE.readNullableInt(reader);
                            iIntValue = nullableInt3 == null ? 0 : nullableInt3.intValue();
                        }
                        break;
                    case -877823861:
                        if (strNextName.equals("image_url")) {
                            nullableString5 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case -636516523:
                        if (strNextName.equals("original_height")) {
                            nullableInt = JsonParsingUtils.INSTANCE.readNullableInt(reader);
                        }
                        break;
                    case -369500629:
                        if (strNextName.equals("og_scrape_url")) {
                            nullableString7 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case -196041627:
                        if (strNextName.equals("mime_type")) {
                            nullableString8 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 3373707:
                        if (strNextName.equals("name")) {
                            nullableString13 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 3556653:
                        if (strNextName.equals("text")) {
                            nullableString10 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 3575610:
                        if (strNextName.equals("type")) {
                            nullableString11 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 100313435:
                        if (strNextName.equals("image")) {
                            nullableString12 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 110371416:
                        if (strNextName.equals("title")) {
                            nullableString9 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 712934958:
                        if (strNextName.equals("author_link")) {
                            nullableString2 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 712986815:
                        if (strNextName.equals("author_name")) {
                            nullableString = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 761243362:
                        if (strNextName.equals("fallback")) {
                            nullableString14 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 1315628960:
                        if (strNextName.equals("asset_url")) {
                            nullableString6 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 1330105222:
                        if (strNextName.equals("thumb_url")) {
                            nullableString4 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        break;
                    case 1933097432:
                        if (strNextName.equals("original_width")) {
                            nullableInt2 = JsonParsingUtils.INSTANCE.readNullableInt(reader);
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
        return new Attachment(nullableString, nullableString2, nullableString3, nullableString4, nullableString5, nullableString6, nullableString7, nullableString8, iIntValue, nullableString9, nullableString10, nullableString11, nullableString12, nullableString13, nullableString14, nullableInt, nullableInt2, null, null, mapAccumulateExtraData != null ? AbstractC25247g0.m74003l0(mapAccumulateExtraData) : new LinkedHashMap(), 393216, null);
    }

    public final void toJson(AbstractC30704c0 p13, Attachment p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
