package io.getstream.chat.android.client.api2.model.dto;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
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
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#0!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;)V", "Lqx/v;", "options", "Lqx/v;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;", "nullablePrivacySettingsDtoAdapter", "", "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;", "listOfDeviceDtoAdapter", "listOfStringAdapter", "", "nullableMapOfStringStringAdapter", "", "mapOfStringAnyAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UpstreamUserDtoJsonAdapter extends JsonAdapter<UpstreamUserDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<DeviceDto>> listOfDeviceDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<PrivacySettingsDto> nullablePrivacySettingsDtoAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public UpstreamUserDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("banned", "id", "name", "image", "invisible", "privacy_settings", "language", "role", "devices", "teams", "teams_role", "extraData");
        Class cls = Boolean.TYPE;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.booleanAdapter = moshi.m94400c(cls, c25235a0, "banned");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "id");
        this.nullablePrivacySettingsDtoAdapter = moshi.m94400c(PrivacySettingsDto.class, c25235a0, "privacy_settings");
        this.listOfDeviceDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DeviceDto.class), c25235a0, "devices");
        this.listOfStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, String.class), c25235a0, "teams");
        this.nullableMapOfStringStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, String.class), c25235a0, "teams_role");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(37, "GeneratedJsonAdapter(UpstreamUserDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UpstreamUserDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        PrivacySettingsDto privacySettingsDto = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        List list2 = null;
        Map map = null;
        Map map2 = null;
        while (true) {
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            PrivacySettingsDto privacySettingsDto2 = privacySettingsDto;
            String str9 = str4;
            String str10 = str5;
            if (!reader.hasNext()) {
                List list3 = list;
                reader.endObject();
                if (bool3 == null) {
                    throw AbstractC31885f.m99129g("banned", "banned", reader);
                }
                boolean zBooleanValue = bool3.booleanValue();
                if (str6 == null) {
                    throw AbstractC31885f.m99129g("id", "id", reader);
                }
                if (str7 == null) {
                    throw AbstractC31885f.m99129g("name", "name", reader);
                }
                if (str8 == null) {
                    throw AbstractC31885f.m99129g("image", "image", reader);
                }
                if (bool4 == null) {
                    throw AbstractC31885f.m99129g("invisible", "invisible", reader);
                }
                boolean zBooleanValue2 = bool4.booleanValue();
                if (str9 == null) {
                    throw AbstractC31885f.m99129g("language", "language", reader);
                }
                if (str10 == null) {
                    throw AbstractC31885f.m99129g("role", "role", reader);
                }
                if (list3 == null) {
                    throw AbstractC31885f.m99129g("devices", "devices", reader);
                }
                if (list2 == null) {
                    throw AbstractC31885f.m99129g("teams", "teams", reader);
                }
                if (map2 != null) {
                    return new UpstreamUserDto(zBooleanValue, str6, str7, str8, zBooleanValue2, privacySettingsDto2, str9, str10, list3, list2, map, map2);
                }
                throw AbstractC31885f.m99129g("extraData", "extraData", reader);
            }
            List list4 = list;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                case 0:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC31885f.m99135m("banned", "banned", reader);
                    }
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                case 1:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("id", "id", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("name", "name", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                    break;
                case 3:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("image", "image", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                    break;
                case 4:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("invisible", "invisible", reader);
                    }
                    bool = bool3;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                    break;
                case 5:
                    privacySettingsDto = (PrivacySettingsDto) this.nullablePrivacySettingsDtoAdapter.fromJson(reader);
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    str5 = str10;
                    break;
                case 6:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("language", "language", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str5 = str10;
                    break;
                    break;
                case 7:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw AbstractC31885f.m99135m("role", "role", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    break;
                    break;
                case 8:
                    list = (List) this.listOfDeviceDtoAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("devices", "devices", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                    break;
                case 9:
                    list2 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw AbstractC31885f.m99135m("teams", "teams", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                case 10:
                    map = (Map) this.nullableMapOfStringStringAdapter.fromJson(reader);
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                case 11:
                    map2 = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map2 == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
                default:
                    bool = bool3;
                    bool2 = bool4;
                    list = list4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    privacySettingsDto = privacySettingsDto2;
                    str4 = str9;
                    str5 = str10;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, UpstreamUserDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("banned");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getBanned()));
        writer.mo94373x("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.mo94373x("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("image");
        this.stringAdapter.toJson(writer, value_.getImage());
        writer.mo94373x("invisible");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getInvisible()));
        writer.mo94373x("privacy_settings");
        this.nullablePrivacySettingsDtoAdapter.toJson(writer, value_.getPrivacy_settings());
        writer.mo94373x("language");
        this.stringAdapter.toJson(writer, value_.getLanguage());
        writer.mo94373x("role");
        this.stringAdapter.toJson(writer, value_.getRole());
        writer.mo94373x("devices");
        this.listOfDeviceDtoAdapter.toJson(writer, value_.getDevices());
        writer.mo94373x("teams");
        this.listOfStringAdapter.toJson(writer, value_.getTeams());
        writer.mo94373x("teams_role");
        this.nullableMapOfStringStringAdapter.toJson(writer, value_.getTeams_role());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
