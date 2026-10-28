package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "nullableStringAdapter", "", "booleanAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ModerationEntityJsonAdapter extends JsonAdapter<ModerationEntity> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public ModerationEntityJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("action", "originalText", "textHarms", "imageHarms", "blocklistMatched", "semanticFilterMatched", "platformCircumvented");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "action");
        this.listOfStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, String.class), c25235a0, "textHarms");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "blocklistMatched");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "platformCircumvented");
    }

    public final String toString() {
        return AbstractC36095b.m114677e(38, "GeneratedJsonAdapter(ModerationEntity)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ModerationEntity fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("action", "action", reader);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("originalText", "originalText", reader);
                    }
                    break;
                    break;
                case 2:
                    list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("textHarms", "textHarms", reader);
                    }
                    break;
                    break;
                case 3:
                    list2 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw AbstractC31885f.m99135m("imageHarms", "imageHarms", reader);
                    }
                    break;
                    break;
                case 4:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC31885f.m99135m("platformCircumvented", "platformCircumvented", reader);
                    }
                    break;
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw AbstractC31885f.m99129g("action", "action", reader);
        }
        if (str2 == null) {
            throw AbstractC31885f.m99129g("originalText", "originalText", reader);
        }
        if (list == null) {
            throw AbstractC31885f.m99129g("textHarms", "textHarms", reader);
        }
        if (list2 == null) {
            throw AbstractC31885f.m99129g("imageHarms", "imageHarms", reader);
        }
        if (bool != null) {
            return new ModerationEntity(str, str2, list, list2, str3, str4, bool.booleanValue());
        }
        throw AbstractC31885f.m99129g("platformCircumvented", "platformCircumvented", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 writer, ModerationEntity value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("action");
        this.stringAdapter.toJson(writer, value_.getAction());
        writer.mo94373x("originalText");
        this.stringAdapter.toJson(writer, value_.getOriginalText());
        writer.mo94373x("textHarms");
        this.listOfStringAdapter.toJson(writer, value_.getTextHarms());
        writer.mo94373x("imageHarms");
        this.listOfStringAdapter.toJson(writer, value_.getImageHarms());
        writer.mo94373x("blocklistMatched");
        this.nullableStringAdapter.toJson(writer, value_.getBlocklistMatched());
        writer.mo94373x("semanticFilterMatched");
        this.nullableStringAdapter.toJson(writer, value_.getSemanticFilterMatched());
        writer.mo94373x("platformCircumvented");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getPlatformCircumvented()));
        writer.mo94370m();
    }
}
