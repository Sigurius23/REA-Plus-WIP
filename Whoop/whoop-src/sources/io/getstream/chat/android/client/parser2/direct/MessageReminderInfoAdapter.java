package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.models.MessageReminderInfo;
import java.util.Date;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/MessageReminderInfo;", "Ljava/util/Date;", "dateAdapter", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/MessageReminderInfo;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/MessageReminderInfo;)V", "Lcom/squareup/moshi/JsonAdapter;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReminderInfoAdapter extends JsonAdapter<MessageReminderInfo> {
    private final JsonAdapter<Date> dateAdapter;

    public MessageReminderInfoAdapter(JsonAdapter<Date> dateAdapter) {
        AbstractC22676k.m65750j(dateAdapter, "dateAdapter");
        this.dateAdapter = dateAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (MessageReminderInfo) obj);
        throw null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MessageReminderInfo fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        Date date = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        Date date2 = null;
        Date date3 = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -295464393) {
                    if (iHashCode != 1103181229) {
                        if (iHashCode == 1369680106 && strNextName.equals("created_at")) {
                            date = (Date) this.dateAdapter.fromJson(reader);
                        }
                    } else if (strNextName.equals("remind_at")) {
                        date3 = (Date) this.dateAdapter.fromJson(reader);
                    }
                } else if (strNextName.equals("updated_at")) {
                    date2 = (Date) this.dateAdapter.fromJson(reader);
                }
            }
            reader.skipValue();
        }
        reader.endObject();
        JsonParsingUtils jsonParsingUtils = JsonParsingUtils.INSTANCE;
        jsonParsingUtils.requireField(date, "created_at", reader);
        jsonParsingUtils.requireField(date2, "updated_at", reader);
        return new MessageReminderInfo(date3, date, date2);
    }

    public final void toJson(AbstractC30704c0 p13, MessageReminderInfo p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
