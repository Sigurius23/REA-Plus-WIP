package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.models.Location;
import java.util.Date;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/Location;", "Ljava/util/Date;", "dateAdapter", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Location;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/Location;)V", "Lcom/squareup/moshi/JsonAdapter;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LocationAdapter extends JsonAdapter<Location> {
    private final JsonAdapter<Date> dateAdapter;

    public LocationAdapter(JsonAdapter<Date> dateAdapter) {
        AbstractC22676k.m65750j(dateAdapter, "dateAdapter");
        this.dateAdapter = dateAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (Location) obj);
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.squareup.moshi.JsonAdapter
    public final Location fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        Double dValueOf = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        Double dValueOf2 = null;
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        Date date = null;
        String strNextString4 = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1690722221:
                        if (!strNextName.equals("message_id")) {
                            reader.skipValue();
                        } else {
                            strNextString2 = reader.nextString();
                        }
                        break;
                    case -1457007181:
                        if (!strNextName.equals("created_by_device_id")) {
                            reader.skipValue();
                        } else {
                            strNextString4 = reader.nextString();
                        }
                        break;
                    case -1439978388:
                        if (!strNextName.equals("latitude")) {
                            reader.skipValue();
                        } else {
                            dValueOf = Double.valueOf(reader.nextDouble());
                        }
                        break;
                    case -1298762217:
                        if (strNextName.equals("end_at")) {
                            date = (Date) this.dateAdapter.fromJson(reader);
                        }
                        break;
                    case -147132913:
                        if (strNextName.equals("user_id")) {
                            strNextString3 = reader.nextString();
                        }
                        break;
                    case 137365935:
                        if (strNextName.equals("longitude")) {
                            dValueOf2 = Double.valueOf(reader.nextDouble());
                        }
                        break;
                    case 274461570:
                        if (strNextName.equals("channel_cid")) {
                            strNextString = reader.nextString();
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
        jsonParsingUtils.requireField(strNextString, "channel_cid", reader);
        jsonParsingUtils.requireField(strNextString2, "message_id", reader);
        jsonParsingUtils.requireField(strNextString3, "user_id", reader);
        jsonParsingUtils.requireField(dValueOf, "latitude", reader);
        jsonParsingUtils.requireField(dValueOf2, "longitude", reader);
        jsonParsingUtils.requireField(strNextString4, "created_by_device_id", reader);
        return new Location(strNextString, strNextString2, strNextString3, date, dValueOf.doubleValue(), dValueOf2.doubleValue(), strNextString4);
    }

    public final void toJson(AbstractC30704c0 p13, Location p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
