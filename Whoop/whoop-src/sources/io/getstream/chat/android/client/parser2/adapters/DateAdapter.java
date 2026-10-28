package io.getstream.chat.android.client.parser2.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.Date;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "<init>", "()V", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Ljava/util/Date;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/Date;", "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;", "streamDateFormatter", "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DateAdapter extends JsonAdapter<Date> {
    private final StreamDateFormatter streamDateFormatter = new StreamDateFormatter("DateAdapter", true);

    @Override // com.squareup.moshi.JsonAdapter
    @InterfaceC30729p
    public Date fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.skipValue();
            return null;
        }
        String strNextString = reader.nextString();
        StreamDateFormatter streamDateFormatter = this.streamDateFormatter;
        AbstractC22676k.m65747g(strNextString);
        return streamDateFormatter.parse$stream_chat_android_client_release(strNextString);
    }

    @Override // com.squareup.moshi.JsonAdapter
    @InterfaceC30738t0
    public void toJson(AbstractC30704c0 writer, Date value) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value == null) {
            writer.mo94363J();
        } else {
            writer.mo94362F0(this.streamDateFormatter.format(value));
        }
    }
}
