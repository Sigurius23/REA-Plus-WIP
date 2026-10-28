package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.models.ReactionGroup;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.C25272z;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;", "", "dateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "parseWithType", "Lio/getstream/chat/android/models/ReactionGroup;", "reader", "Lcom/squareup/moshi/JsonReader;", "type", "", "parseReactionGroupsMap", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReactionGroupAdapter {
    private final JsonAdapter<Date> dateAdapter;

    public ReactionGroupAdapter(JsonAdapter<Date> dateAdapter) {
        AbstractC22676k.m65750j(dateAdapter, "dateAdapter");
        this.dateAdapter = dateAdapter;
    }

    public final Map<String, ReactionGroup> parseReactionGroupsMap(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        EnumC30741w enumC30741wMo16731k = reader.mo16731k();
        EnumC30741w enumC30741w = EnumC30741w.f126546I;
        C25272z c25272z = C25272z.f99163w;
        if (enumC30741wMo16731k == enumC30741w) {
            reader.mo16730i();
            return c25272z;
        }
        if (reader.mo16731k() != EnumC30741w.f126551y) {
            reader.skipValue();
            return c25272z;
        }
        reader.beginObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            AbstractC22676k.m65747g(strNextName);
            ReactionGroup withType = parseWithType(reader, strNextName);
            if (withType != null) {
                linkedHashMap.put(strNextName, withType);
            }
        }
        reader.endObject();
        return linkedHashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ReactionGroup parseWithType(JsonReader reader, String type) {
        AbstractC22676k.m65750j(reader, "reader");
        AbstractC22676k.m65750j(type, "type");
        Integer numValueOf = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        Integer numValueOf2 = null;
        Date date = null;
        Date date2 = null;
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -876109062:
                        if (strNextName.equals("first_reaction_at")) {
                            date = (Date) this.dateAdapter.fromJson(reader);
                        }
                        break;
                    case 94851343:
                        if (strNextName.equals("count")) {
                            numValueOf = Integer.valueOf(reader.nextInt());
                        }
                        break;
                    case 645478549:
                        if (strNextName.equals("sum_scores")) {
                            numValueOf2 = Integer.valueOf(reader.nextInt());
                        }
                        break;
                    case 1430043104:
                        if (strNextName.equals("last_reaction_at")) {
                            date2 = (Date) this.dateAdapter.fromJson(reader);
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
        jsonParsingUtils.requireField(numValueOf, "count", reader);
        jsonParsingUtils.requireField(numValueOf2, "sum_scores", reader);
        jsonParsingUtils.requireField(date, "first_reaction_at", reader);
        jsonParsingUtils.requireField(date2, "last_reaction_at", reader);
        return new ReactionGroup(type, numValueOf.intValue(), numValueOf2.intValue(), date, date2);
    }
}
