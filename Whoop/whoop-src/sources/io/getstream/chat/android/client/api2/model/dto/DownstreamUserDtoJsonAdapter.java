package io.getstream.chat.android.client.api2.model.dto;

import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
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
@Metadata(m65680d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0018R&\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002020)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "nullablePrivacySettingsDtoAdapter", "booleanAdapter", "", "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;", "nullableListOfDeviceDtoAdapter", "Ljava/util/Date;", "nullableDateAdapter", "", "intAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;", "nullableListOfDownstreamMuteDtoAdapter", "listOfStringAdapter", "", "nullableMapOfStringStringAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;", "nullableListOfDownstreamChannelMuteDtoAdapter", "nullableListOfStringAdapter", "", "nullableLongAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "nullableDownstreamPushPreferenceDtoAdapter", "", "mapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamUserDtoJsonAdapter extends JsonAdapter<DownstreamUserDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DownstreamUserDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamPushPreferenceDto> nullableDownstreamPushPreferenceDtoAdapter;
    private final JsonAdapter<List<DeviceDto>> nullableListOfDeviceDtoAdapter;
    private final JsonAdapter<List<DownstreamChannelMuteDto>> nullableListOfDownstreamChannelMuteDtoAdapter;
    private final JsonAdapter<List<DownstreamMuteDto>> nullableListOfDownstreamMuteDtoAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<PrivacySettingsDto> nullablePrivacySettingsDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamUserDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("id", "name", "image", "role", "invisible", "privacy_settings", "language", "banned", "devices", "online", "created_at", "deactivated_at", "updated_at", "last_active", "total_unread_count", "unread_channels", "unread_count", "unread_threads", "mutes", "teams", "teams_role", "channel_mutes", "blocked_user_ids", "avg_response_time", "push_preferences", "extraData");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "id");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "name");
        this.nullableBooleanAdapter = moshi.m94400c(Boolean.class, c25235a0, "invisible");
        this.nullablePrivacySettingsDtoAdapter = moshi.m94400c(PrivacySettingsDto.class, c25235a0, "privacy_settings");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "banned");
        this.nullableListOfDeviceDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DeviceDto.class), c25235a0, "devices");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "total_unread_count");
        this.nullableListOfDownstreamMuteDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamMuteDto.class), c25235a0, "mutes");
        this.listOfStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, String.class), c25235a0, "teams");
        this.nullableMapOfStringStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, String.class), c25235a0, "teams_role");
        this.nullableListOfDownstreamChannelMuteDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamChannelMuteDto.class), c25235a0, "channel_mutes");
        this.nullableListOfStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, String.class), c25235a0, "blocked_user_ids");
        this.nullableLongAdapter = moshi.m94400c(Long.class, c25235a0, "avg_response_time");
        this.nullableDownstreamPushPreferenceDtoAdapter = moshi.m94400c(DownstreamPushPreferenceDto.class, c25235a0, "push_preferences");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(39, "GeneratedJsonAdapter(DownstreamUserDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamUserDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        int i13;
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        List list = null;
        int i14 = -1;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        PrivacySettingsDto privacySettingsDto = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        Date date4 = null;
        List list2 = null;
        Map map = null;
        List list3 = null;
        String str5 = null;
        List list4 = null;
        List list5 = null;
        Long l7 = null;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = null;
        Map map2 = null;
        while (true) {
            String str6 = str;
            String str7 = str2;
            if (!reader.hasNext()) {
                String str8 = str3;
                reader.endObject();
                if (i14 == -770065) {
                    List list6 = list2;
                    if (str6 == null) {
                        throw AbstractC31885f.m99129g("id", "id", reader);
                    }
                    if (str4 == null) {
                        throw AbstractC31885f.m99129g("role", "role", reader);
                    }
                    if (bool2 == null) {
                        throw AbstractC31885f.m99129g("banned", "banned", reader);
                    }
                    boolean zBooleanValue = bool2.booleanValue();
                    if (bool3 == null) {
                        throw AbstractC31885f.m99129g("online", "online", reader);
                    }
                    boolean zBooleanValue2 = bool3.booleanValue();
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2.intValue();
                    int iIntValue3 = num3.intValue();
                    int iIntValue4 = num4.intValue();
                    AbstractC22676k.m65748h(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    if (map2 == null) {
                        throw AbstractC31885f.m99129g("extraData", "extraData", reader);
                    }
                    return new DownstreamUserDto(str6, str7, str8, str4, bool, privacySettingsDto, str5, zBooleanValue, list4, zBooleanValue2, date, date2, date3, date4, iIntValue, iIntValue2, iIntValue3, iIntValue4, list6, list, map, list3, list5, l7, downstreamPushPreferenceDto, map2);
                }
                List list7 = list;
                List list8 = list2;
                Map map3 = map;
                Constructor<DownstreamUserDto> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class cls = AbstractC31885f.f132392c;
                    Class cls2 = Boolean.TYPE;
                    Class cls3 = Integer.TYPE;
                    declaredConstructor = DownstreamUserDto.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Boolean.class, PrivacySettingsDto.class, String.class, cls2, List.class, cls2, Date.class, Date.class, Date.class, Date.class, cls3, cls3, cls3, cls3, List.class, List.class, Map.class, List.class, List.class, Long.class, DownstreamPushPreferenceDto.class, Map.class, cls3, cls);
                    this.constructorRef = declaredConstructor;
                    AbstractC22676k.m65749i(declaredConstructor, "also(...)");
                }
                if (str6 == null) {
                    throw AbstractC31885f.m99129g("id", "id", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("role", "role", reader);
                }
                if (bool2 == null) {
                    throw AbstractC31885f.m99129g("banned", "banned", reader);
                }
                if (bool3 == null) {
                    throw AbstractC31885f.m99129g("online", "online", reader);
                }
                if (map2 == null) {
                    throw AbstractC31885f.m99129g("extraData", "extraData", reader);
                }
                DownstreamUserDto downstreamUserDtoNewInstance = declaredConstructor.newInstance(str6, str7, str8, str4, bool, privacySettingsDto, str5, bool2, list4, bool3, date, date2, date3, date4, num, num2, num3, num4, list8, list7, map3, list3, list5, l7, downstreamPushPreferenceDto, map2, Integer.valueOf(i14), null);
                AbstractC22676k.m65749i(downstreamUserDtoNewInstance, "newInstance(...)");
                return downstreamUserDtoNewInstance;
            }
            String str9 = str3;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("id", "id", reader);
                    }
                    str3 = str9;
                    str2 = str7;
                    break;
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    str = str6;
                    str2 = str7;
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("role", "role", reader);
                    }
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 4:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i14 &= -17;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 5:
                    privacySettingsDto = (PrivacySettingsDto) this.nullablePrivacySettingsDtoAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 6:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 7:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("banned", "banned", reader);
                    }
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 8:
                    list4 = (List) this.nullableListOfDeviceDtoAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 9:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw AbstractC31885f.m99135m("online", "online", reader);
                    }
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 10:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 11:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 12:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 13:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 14:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("total_unread_count", "total_unread_count", reader);
                    }
                    i14 &= -16385;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                    break;
                case 15:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("unread_channels", "unread_channels", reader);
                    }
                    i13 = -32769;
                    i14 &= i13;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                    break;
                case 16:
                    num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw AbstractC31885f.m99135m("unread_count", "unread_count", reader);
                    }
                    i13 = -65537;
                    i14 &= i13;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw AbstractC31885f.m99135m("unread_threads", "unread_threads", reader);
                    }
                    i13 = -131073;
                    i14 &= i13;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    list2 = (List) this.nullableListOfDownstreamMuteDtoAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("teams", "teams", reader);
                    }
                    i13 = -524289;
                    i14 &= i13;
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                    break;
                case 20:
                    map = (Map) this.nullableMapOfStringStringAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 21:
                    list3 = (List) this.nullableListOfDownstreamChannelMuteDtoAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    list5 = (List) this.nullableListOfStringAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    l7 = (Long) this.nullableLongAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 24:
                    downstreamPushPreferenceDto = (DownstreamPushPreferenceDto) this.nullableDownstreamPushPreferenceDtoAdapter.fromJson(reader);
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                case 25:
                    map2 = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map2 == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
                default:
                    str3 = str9;
                    str = str6;
                    str2 = str7;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamUserDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.mo94373x("name");
        this.nullableStringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("image");
        this.nullableStringAdapter.toJson(writer, value_.getImage());
        writer.mo94373x("role");
        this.stringAdapter.toJson(writer, value_.getRole());
        writer.mo94373x("invisible");
        this.nullableBooleanAdapter.toJson(writer, value_.getInvisible());
        writer.mo94373x("privacy_settings");
        this.nullablePrivacySettingsDtoAdapter.toJson(writer, value_.getPrivacy_settings());
        writer.mo94373x("language");
        this.nullableStringAdapter.toJson(writer, value_.getLanguage());
        writer.mo94373x("banned");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getBanned()));
        writer.mo94373x("devices");
        this.nullableListOfDeviceDtoAdapter.toJson(writer, value_.getDevices());
        writer.mo94373x("online");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getOnline()));
        writer.mo94373x("created_at");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("deactivated_at");
        this.nullableDateAdapter.toJson(writer, value_.getDeactivated_at());
        writer.mo94373x("updated_at");
        this.nullableDateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x("last_active");
        this.nullableDateAdapter.toJson(writer, value_.getLast_active());
        writer.mo94373x("total_unread_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getTotal_unread_count()));
        writer.mo94373x("unread_channels");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_channels()));
        writer.mo94373x("unread_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_count()));
        writer.mo94373x("unread_threads");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_threads()));
        writer.mo94373x("mutes");
        this.nullableListOfDownstreamMuteDtoAdapter.toJson(writer, value_.getMutes());
        writer.mo94373x("teams");
        this.listOfStringAdapter.toJson(writer, value_.getTeams());
        writer.mo94373x("teams_role");
        this.nullableMapOfStringStringAdapter.toJson(writer, value_.getTeams_role());
        writer.mo94373x("channel_mutes");
        this.nullableListOfDownstreamChannelMuteDtoAdapter.toJson(writer, value_.getChannel_mutes());
        writer.mo94373x("blocked_user_ids");
        this.nullableListOfStringAdapter.toJson(writer, value_.getBlocked_user_ids());
        writer.mo94373x("avg_response_time");
        this.nullableLongAdapter.toJson(writer, value_.getAvg_response_time());
        writer.mo94373x("push_preferences");
        this.nullableDownstreamPushPreferenceDtoAdapter.toJson(writer, value_.getPush_preferences());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
