package io.getstream.chat.android.client.parser2.direct;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.PrivacySettings;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.UserTransformer;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25271y;
import m83.C25272z;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/UserAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/models/Device;", "deviceAdapter", "Lio/getstream/chat/android/PrivacySettings;", "privacySettingsAdapter", "Ljava/util/Date;", "dateAdapter", "Lio/getstream/chat/android/models/UserTransformer;", "userTransformer", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/models/UserTransformer;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/User;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/User;)V", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/UserTransformer;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserAdapter extends JsonAdapter<User> {
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Device> deviceAdapter;
    private final JsonAdapter<PrivacySettings> privacySettingsAdapter;
    private final UserTransformer userTransformer;

    public UserAdapter(JsonAdapter<Device> deviceAdapter, JsonAdapter<PrivacySettings> privacySettingsAdapter, JsonAdapter<Date> dateAdapter, UserTransformer userTransformer) {
        AbstractC22676k.m65750j(deviceAdapter, "deviceAdapter");
        AbstractC22676k.m65750j(privacySettingsAdapter, "privacySettingsAdapter");
        AbstractC22676k.m65750j(dateAdapter, "dateAdapter");
        AbstractC22676k.m65750j(userTransformer, "userTransformer");
        this.deviceAdapter = deviceAdapter;
        this.privacySettingsAdapter = privacySettingsAdapter;
        this.dateAdapter = dateAdapter;
        this.userTransformer = userTransformer;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (User) obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.squareup.moshi.JsonAdapter
    public final User fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        Boolean boolValueOf = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        Boolean nullableBoolean = Boolean.FALSE;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int iNextInt3 = 0;
        String nullableString = null;
        String nullableString2 = null;
        String nullableString3 = null;
        String strNextString = null;
        String strNextString2 = null;
        List<String> list = null;
        Map<String, Object> mapAccumulateExtraData = null;
        PrivacySettings privacySettings = null;
        List<String> stringList = null;
        Boolean boolValueOf2 = null;
        Map<String, String> stringMap = null;
        List<String> stringList2 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        Long nullableLong = null;
        Date date4 = null;
        while (true) {
            String str = nullableString;
            String str2 = nullableString2;
            String str3 = nullableString3;
            List<String> list2 = list;
            if (!reader.hasNext()) {
                Boolean bool = nullableBoolean;
                reader.endObject();
                JsonParsingUtils jsonParsingUtils = JsonParsingUtils.INSTANCE;
                jsonParsingUtils.requireField(strNextString, "id", reader);
                jsonParsingUtils.requireField(strNextString2, "role", reader);
                jsonParsingUtils.requireField(boolValueOf2, "banned", reader);
                jsonParsingUtils.requireField(boolValueOf, "online", reader);
                String str4 = str == null ? "" : str;
                String str5 = str2 == null ? "" : str2;
                String str6 = str3 == null ? "" : str3;
                C25271y c25271y = C25271y.f99162w;
                if (list2 == null) {
                    list2 = c25271y;
                }
                List<String> list3 = stringList == null ? c25271y : stringList;
                Map<String, String> mapM74001j0 = C25272z.f99163w;
                Map<String, String> map = stringMap == null ? mapM74001j0 : stringMap;
                if (stringList2 == null) {
                    stringList2 = c25271y;
                }
                if (mapAccumulateExtraData != null) {
                    mapM74001j0 = AbstractC25247g0.m74001j0(mapAccumulateExtraData);
                }
                return this.userTransformer.transform(new User(strNextString, strNextString2, str4, str5, bool, privacySettings, str6, boolValueOf2, list2, boolValueOf.booleanValue(), date, date2, date3, iNextInt, iNextInt2, iNextInt3, null, list3, map, null, stringList2, nullableLong, null, mapM74001j0, date4, 4784128, null));
            }
            Boolean bool2 = nullableBoolean;
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1906547302:
                        if (strNextName.equals("total_unread_count")) {
                            iNextInt = reader.nextInt();
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -1901805651:
                        if (strNextName.equals("invisible")) {
                            nullableBoolean = JsonParsingUtils.INSTANCE.readNullableBoolean(reader);
                        }
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -1876650400:
                        if (strNextName.equals("unread_channels")) {
                            iNextInt2 = reader.nextInt();
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -1740487942:
                        if (strNextName.equals("privacy_settings")) {
                            privacySettings = (PrivacySettings) this.privacySettingsAdapter.fromJson(reader);
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -1721782503:
                        if (strNextName.equals("unread_threads")) {
                            iNextInt3 = reader.nextInt();
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -1613589672:
                        if (strNextName.equals("language")) {
                            nullableString3 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                            nullableBoolean = bool2;
                            nullableString = str;
                            nullableString2 = str2;
                        }
                        list = list2;
                        break;
                    case -1396343010:
                        if (strNextName.equals("banned")) {
                            boolValueOf2 = Boolean.valueOf(reader.mo16729h());
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -1012222381:
                        if (strNextName.equals("online")) {
                            boolValueOf = Boolean.valueOf(reader.mo16729h());
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -974090953:
                        if (strNextName.equals("blocked_user_ids")) {
                            stringList2 = JsonParsingUtils.INSTANCE.parseStringList(reader);
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -598879905:
                        if (strNextName.equals("teams_role")) {
                            stringMap = JsonParsingUtils.INSTANCE.parseStringMap(reader);
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -434082466:
                        if (strNextName.equals("avg_response_time")) {
                            nullableLong = JsonParsingUtils.INSTANCE.readNullableLong(reader);
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case -295464393:
                        if (strNextName.equals("updated_at")) {
                            date2 = (Date) this.dateAdapter.fromJson(reader);
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 3355:
                        if (strNextName.equals("id")) {
                            strNextString = reader.nextString();
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 3373707:
                        if (strNextName.equals("name")) {
                            nullableString = JsonParsingUtils.INSTANCE.readNullableString(reader);
                            nullableBoolean = bool2;
                        }
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 3506294:
                        if (strNextName.equals("role")) {
                            strNextString2 = reader.nextString();
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 100313435:
                        if (strNextName.equals("image")) {
                            nullableString2 = JsonParsingUtils.INSTANCE.readNullableString(reader);
                            nullableBoolean = bool2;
                            nullableString = str;
                        }
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 104264058:
                        if (strNextName.equals("mutes")) {
                            reader.skipValue();
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 110234038:
                        if (strNextName.equals("teams")) {
                            stringList = JsonParsingUtils.INSTANCE.parseStringList(reader);
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 220552290:
                        if (strNextName.equals("deactivated_at")) {
                            date4 = (Date) this.dateAdapter.fromJson(reader);
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 1369680106:
                        if (strNextName.equals("created_at")) {
                            date = (Date) this.dateAdapter.fromJson(reader);
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 1505031375:
                        if (strNextName.equals("last_active")) {
                            date3 = (Date) this.dateAdapter.fromJson(reader);
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 1559801053:
                        if (strNextName.equals("devices")) {
                            list = JsonParsingUtils.INSTANCE.parseList(reader, this.deviceAdapter);
                            nullableBoolean = bool2;
                            nullableString = str;
                            nullableString2 = str2;
                            nullableString3 = str3;
                        }
                        break;
                    case 1774175038:
                        if (strNextName.equals("channel_mutes")) {
                            reader.skipValue();
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    case 1853625683:
                        if (strNextName.equals("push_preferences")) {
                            reader.skipValue();
                        }
                        nullableBoolean = bool2;
                        nullableString = str;
                        nullableString2 = str2;
                        nullableString3 = str3;
                        list = list2;
                        break;
                    default:
                        break;
                }
            }
            JsonParsingUtils jsonParsingUtils2 = JsonParsingUtils.INSTANCE;
            AbstractC22676k.m65747g(strNextName);
            mapAccumulateExtraData = jsonParsingUtils2.accumulateExtraData(strNextName, reader, mapAccumulateExtraData);
            nullableBoolean = bool2;
            nullableString = str;
            nullableString2 = str2;
            nullableString3 = str3;
            list = list2;
        }
    }

    public final void toJson(AbstractC30704c0 p13, User p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
