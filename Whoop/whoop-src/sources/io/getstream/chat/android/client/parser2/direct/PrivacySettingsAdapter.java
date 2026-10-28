package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.DeliveryReceipts;
import io.getstream.chat.android.PrivacySettings;
import io.getstream.chat.android.ReadReceipts;
import io.getstream.chat.android.TypingIndicators;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/PrivacySettings;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "Lio/getstream/chat/android/TypingIndicators;", "parseTypingIndicators", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/TypingIndicators;", "Lio/getstream/chat/android/DeliveryReceipts;", "parseDeliveryReceipts", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/DeliveryReceipts;", "Lio/getstream/chat/android/ReadReceipts;", "parseReadReceipts", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/ReadReceipts;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/PrivacySettings;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/PrivacySettings;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PrivacySettingsAdapter extends JsonAdapter<PrivacySettings> {
    private final DeliveryReceipts parseDeliveryReceipts(JsonReader reader) {
        Boolean boolValueOf = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        while (reader.hasNext()) {
            if (AbstractC22676k.m65745e(reader.nextName(), "enabled")) {
                boolValueOf = Boolean.valueOf(reader.mo16729h());
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        JsonParsingUtils.INSTANCE.requireField(boolValueOf, "enabled", reader);
        return new DeliveryReceipts(boolValueOf.booleanValue());
    }

    private final ReadReceipts parseReadReceipts(JsonReader reader) {
        Boolean boolValueOf = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        while (reader.hasNext()) {
            if (AbstractC22676k.m65745e(reader.nextName(), "enabled")) {
                boolValueOf = Boolean.valueOf(reader.mo16729h());
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        JsonParsingUtils.INSTANCE.requireField(boolValueOf, "enabled", reader);
        return new ReadReceipts(boolValueOf.booleanValue());
    }

    private final TypingIndicators parseTypingIndicators(JsonReader reader) {
        Boolean boolValueOf = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        while (reader.hasNext()) {
            if (AbstractC22676k.m65745e(reader.nextName(), "enabled")) {
                boolValueOf = Boolean.valueOf(reader.mo16729h());
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        JsonParsingUtils.INSTANCE.requireField(boolValueOf, "enabled", reader);
        return new TypingIndicators(boolValueOf.booleanValue());
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (PrivacySettings) obj);
        throw null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PrivacySettings fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        TypingIndicators typingIndicators = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        DeliveryReceipts deliveryReceipts = null;
        ReadReceipts readReceipts = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -1599464154) {
                    if (iHashCode != -789752820) {
                        if (iHashCode == -336063036 && strNextName.equals("read_receipts")) {
                            readReceipts = parseReadReceipts(reader);
                        }
                    } else if (strNextName.equals("typing_indicators")) {
                        typingIndicators = parseTypingIndicators(reader);
                    }
                } else if (strNextName.equals("delivery_receipts")) {
                    deliveryReceipts = parseDeliveryReceipts(reader);
                }
            }
            reader.skipValue();
        }
        reader.endObject();
        return new PrivacySettings(typingIndicators, deliveryReceipts, readReceipts);
    }

    public final void toJson(AbstractC30704c0 p13, PrivacySettings p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
