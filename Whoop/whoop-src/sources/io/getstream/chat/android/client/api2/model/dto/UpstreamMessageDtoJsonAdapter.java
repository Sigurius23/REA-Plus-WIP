package io.getstream.chat.android.client.api2.model.dto;

import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p471rx.C31882d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR&\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)0(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001a¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;)V", "Lqx/v;", "options", "Lqx/v;", "", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "listOfAttachmentDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "listOfStringAdapter", "Ljava/util/Date;", "nullableDateAdapter", "", "nullableBooleanAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "nullableUpstreamUserDtoAdapter", "booleanAdapter", "listOfUpstreamUserDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;", "nullableUpstreamLocationDtoAdapter", "", "", "mapOfStringAnyAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UpstreamMessageDtoJsonAdapter extends JsonAdapter<UpstreamMessageDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<AttachmentDto>> listOfAttachmentDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<List<UpstreamUserDto>> listOfUpstreamUserDtoAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UpstreamLocationDto> nullableUpstreamLocationDtoAdapter;
    private final JsonAdapter<UpstreamUserDto> nullableUpstreamUserDtoAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public UpstreamMessageDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("attachments", "cid", "command", "args", "html", "id", "type", "mentioned_users", "parent_id", "pin_expires", "pinned", "pinned_at", "pinned_by", "quoted_message_id", "shadowed", "show_in_channel", NotificationCompat.GROUP_KEY_SILENT, "text", "thread_participants", "restricted_visibility", "shared_location", "extraData");
        C31882d c31882dM5369F = AbstractC1772c1.m5369F(List.class, AttachmentDto.class);
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.listOfAttachmentDtoAdapter = moshi.m94400c(c31882dM5369F, c25235a0, "attachments");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "cid");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "command");
        this.listOfStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, String.class), c25235a0, "mentioned_users");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "pin_expires");
        this.nullableBooleanAdapter = moshi.m94400c(Boolean.class, c25235a0, "pinned");
        this.nullableUpstreamUserDtoAdapter = moshi.m94400c(UpstreamUserDto.class, c25235a0, "pinned_by");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "shadowed");
        this.listOfUpstreamUserDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, UpstreamUserDto.class), c25235a0, "thread_participants");
        this.nullableUpstreamLocationDtoAdapter = moshi.m94400c(UpstreamLocationDto.class, c25235a0, "shared_location");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(40, "GeneratedJsonAdapter(UpstreamMessageDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UpstreamMessageDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        Date date = null;
        Boolean bool3 = null;
        Date date2 = null;
        UpstreamUserDto upstreamUserDto = null;
        String str8 = null;
        Boolean bool4 = null;
        String str9 = null;
        List list3 = null;
        List list4 = null;
        UpstreamLocationDto upstreamLocationDto = null;
        Map map = null;
        while (true) {
            Boolean bool5 = bool;
            Boolean bool6 = bool2;
            List list5 = list;
            String str10 = str;
            String str11 = str2;
            String str12 = str3;
            String str13 = str4;
            String str14 = str5;
            String str15 = str6;
            List list6 = list2;
            String str16 = str7;
            Date date3 = date;
            Boolean bool7 = bool3;
            if (!reader.hasNext()) {
                Date date4 = date2;
                reader.endObject();
                if (list5 == null) {
                    throw AbstractC31885f.m99129g("attachments", "attachments", reader);
                }
                if (str10 == null) {
                    throw AbstractC31885f.m99129g("cid", "cid", reader);
                }
                if (str13 == null) {
                    throw AbstractC31885f.m99129g("html", "html", reader);
                }
                if (str14 == null) {
                    throw AbstractC31885f.m99129g("id", "id", reader);
                }
                if (str15 == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (list6 == null) {
                    throw AbstractC31885f.m99129g("mentioned_users", "mentioned_users", reader);
                }
                if (bool5 == null) {
                    throw AbstractC31885f.m99129g("shadowed", "shadowed", reader);
                }
                boolean zBooleanValue = bool5.booleanValue();
                if (bool6 == null) {
                    throw AbstractC31885f.m99129g("show_in_channel", "show_in_channel", reader);
                }
                boolean zBooleanValue2 = bool6.booleanValue();
                if (bool4 == null) {
                    throw AbstractC31885f.m99129g(NotificationCompat.GROUP_KEY_SILENT, NotificationCompat.GROUP_KEY_SILENT, reader);
                }
                boolean zBooleanValue3 = bool4.booleanValue();
                if (str9 == null) {
                    throw AbstractC31885f.m99129g("text", "text", reader);
                }
                if (list3 == null) {
                    throw AbstractC31885f.m99129g("thread_participants", "thread_participants", reader);
                }
                if (list4 == null) {
                    throw AbstractC31885f.m99129g("restricted_visibility", "restricted_visibility", reader);
                }
                if (map != null) {
                    return new UpstreamMessageDto(list5, str10, str11, str12, str13, str14, str15, list6, str16, date3, bool7, date4, upstreamUserDto, str8, zBooleanValue, zBooleanValue2, zBooleanValue3, str9, list3, list4, upstreamLocationDto, map);
                }
                throw AbstractC31885f.m99129g("extraData", "extraData", reader);
            }
            Date date5 = date2;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case 0:
                    list = (List) this.listOfAttachmentDtoAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("attachments", "attachments", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                    break;
                case 1:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case 4:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("html", "html", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                    break;
                case 5:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw AbstractC31885f.m99135m("id", "id", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                    break;
                case 6:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                    break;
                case 7:
                    list2 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw AbstractC31885f.m99135m("mentioned_users", "mentioned_users", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                    break;
                case 8:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    date = date3;
                    bool3 = bool7;
                    break;
                case 9:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    bool3 = bool7;
                    break;
                case 10:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    break;
                case 11:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case 12:
                    upstreamUserDto = (UpstreamUserDto) this.nullableUpstreamUserDtoAdapter.fromJson(reader);
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case 13:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case 14:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC31885f.m99135m("shadowed", "shadowed", reader);
                    }
                    date2 = date5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                    break;
                case 15:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("show_in_channel", "show_in_channel", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                    break;
                case 16:
                    bool4 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw AbstractC31885f.m99135m(NotificationCompat.GROUP_KEY_SILENT, NotificationCompat.GROUP_KEY_SILENT, reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    str9 = (String) this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw AbstractC31885f.m99135m("text", "text", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    list3 = (List) this.listOfUpstreamUserDtoAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw AbstractC31885f.m99135m("thread_participants", "thread_participants", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    list4 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list4 == null) {
                        throw AbstractC31885f.m99135m("restricted_visibility", "restricted_visibility", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case 20:
                    upstreamLocationDto = (UpstreamLocationDto) this.nullableUpstreamLocationDtoAdapter.fromJson(reader);
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                case 21:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
                default:
                    date2 = date5;
                    bool = bool5;
                    bool2 = bool6;
                    list = list5;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    list2 = list6;
                    str7 = str16;
                    date = date3;
                    bool3 = bool7;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, UpstreamMessageDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("attachments");
        this.listOfAttachmentDtoAdapter.toJson(writer, value_.getAttachments());
        writer.mo94373x("cid");
        this.stringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("command");
        this.nullableStringAdapter.toJson(writer, value_.getCommand());
        writer.mo94373x("args");
        this.nullableStringAdapter.toJson(writer, value_.getArgs());
        writer.mo94373x("html");
        this.stringAdapter.toJson(writer, value_.getHtml());
        writer.mo94373x("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("mentioned_users");
        this.listOfStringAdapter.toJson(writer, value_.getMentioned_users());
        writer.mo94373x("parent_id");
        this.nullableStringAdapter.toJson(writer, value_.getParent_id());
        writer.mo94373x("pin_expires");
        this.nullableDateAdapter.toJson(writer, value_.getPin_expires());
        writer.mo94373x("pinned");
        this.nullableBooleanAdapter.toJson(writer, value_.getPinned());
        writer.mo94373x("pinned_at");
        this.nullableDateAdapter.toJson(writer, value_.getPinned_at());
        writer.mo94373x("pinned_by");
        this.nullableUpstreamUserDtoAdapter.toJson(writer, value_.getPinned_by());
        writer.mo94373x("quoted_message_id");
        this.nullableStringAdapter.toJson(writer, value_.getQuoted_message_id());
        writer.mo94373x("shadowed");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getShadowed()));
        writer.mo94373x("show_in_channel");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getShow_in_channel()));
        writer.mo94373x(NotificationCompat.GROUP_KEY_SILENT);
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSilent()));
        writer.mo94373x("text");
        this.stringAdapter.toJson(writer, value_.getText());
        writer.mo94373x("thread_participants");
        this.listOfUpstreamUserDtoAdapter.toJson(writer, value_.getThread_participants());
        writer.mo94373x("restricted_visibility");
        this.listOfStringAdapter.toJson(writer, value_.getRestricted_visibility());
        writer.mo94373x("shared_location");
        this.nullableUpstreamLocationDtoAdapter.toJson(writer, value_.getShared_location());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
