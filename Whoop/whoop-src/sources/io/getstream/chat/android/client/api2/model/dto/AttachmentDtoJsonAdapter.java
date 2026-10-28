package io.getstream.chat.android.client.api2.model.dto;

import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.Map;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R&\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/AttachmentDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;)V", "Lqx/v;", "options", "Lqx/v;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "", "", "mapOfStringAnyAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentDtoJsonAdapter extends JsonAdapter<AttachmentDto> {
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public AttachmentDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("asset_url", "author_name", "author_link", "fallback", "file_size", "image", "image_url", "mime_type", "name", "og_scrape_url", "text", "thumb_url", "title", "title_link", "type", "original_height", "original_width", "extraData");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "asset_url");
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "file_size");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(35, "GeneratedJsonAdapter(AttachmentDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AttachmentDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        Integer num2 = null;
        Integer num3 = null;
        Map map = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 13:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    str14 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    break;
                case 16:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    break;
                    break;
            }
        }
        reader.endObject();
        if (map != null) {
            return new AttachmentDto(str, str2, str3, str4, num, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, num2, num3, map);
        }
        throw AbstractC31885f.m99129g("extraData", "extraData", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, AttachmentDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("asset_url");
        this.nullableStringAdapter.toJson(writer, value_.getAsset_url());
        writer.mo94373x("author_name");
        this.nullableStringAdapter.toJson(writer, value_.getAuthor_name());
        writer.mo94373x("author_link");
        this.nullableStringAdapter.toJson(writer, value_.getAuthor_link());
        writer.mo94373x("fallback");
        this.nullableStringAdapter.toJson(writer, value_.getFallback());
        writer.mo94373x("file_size");
        this.nullableIntAdapter.toJson(writer, value_.getFile_size());
        writer.mo94373x("image");
        this.nullableStringAdapter.toJson(writer, value_.getImage());
        writer.mo94373x("image_url");
        this.nullableStringAdapter.toJson(writer, value_.getImage_url());
        writer.mo94373x("mime_type");
        this.nullableStringAdapter.toJson(writer, value_.getMime_type());
        writer.mo94373x("name");
        this.nullableStringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("og_scrape_url");
        this.nullableStringAdapter.toJson(writer, value_.getOg_scrape_url());
        writer.mo94373x("text");
        this.nullableStringAdapter.toJson(writer, value_.getText());
        writer.mo94373x("thumb_url");
        this.nullableStringAdapter.toJson(writer, value_.getThumb_url());
        writer.mo94373x("title");
        this.nullableStringAdapter.toJson(writer, value_.getTitle());
        writer.mo94373x("title_link");
        this.nullableStringAdapter.toJson(writer, value_.getTitle_link());
        writer.mo94373x("type");
        this.nullableStringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("original_height");
        this.nullableIntAdapter.toJson(writer, value_.getOriginal_height());
        writer.mo94373x("original_width");
        this.nullableIntAdapter.toJson(writer, value_.getOriginal_width());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
