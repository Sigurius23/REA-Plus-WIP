package io.getstream.chat.android.client.api2.model.dto;

import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
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
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0018R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0018R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0018R&\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000203020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0018R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "intAdapter", "", "nullableListOfStringAdapter", "", "booleanAdapter", "Ljava/util/Date;", "nullableDateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "listOfDownstreamMessageDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "listOfDownstreamMemberDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "listOfDownstreamUserDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "listOfDownstreamChannelUserReadAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;", "configDtoAdapter", "nullableDownstreamUserDtoAdapter", "listOfStringAdapter", "nullableDownstreamMemberDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "listOfDownstreamLocationDtoAdapter", "nullableIntAdapter", "", "", "mapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamChannelDtoJsonAdapter extends JsonAdapter<DownstreamChannelDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<ConfigDto> configDtoAdapter;
    private volatile Constructor<DownstreamChannelDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<DownstreamChannelUserRead>> listOfDownstreamChannelUserReadAdapter;
    private final JsonAdapter<List<DownstreamLocationDto>> listOfDownstreamLocationDtoAdapter;
    private final JsonAdapter<List<DownstreamMemberDto>> listOfDownstreamMemberDtoAdapter;
    private final JsonAdapter<List<DownstreamMessageDto>> listOfDownstreamMessageDtoAdapter;
    private final JsonAdapter<List<DownstreamUserDto>> listOfDownstreamUserDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamMemberDto> nullableDownstreamMemberDtoAdapter;
    private final JsonAdapter<DownstreamUserDto> nullableDownstreamUserDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamChannelDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("cid", "id", "type", "name", "image", "watcher_count", "filter_tags", "frozen", "last_message_at", "created_at", "deleted_at", "updated_at", "member_count", "messages", QueryChannelRequest.KEY_MEMBERS, "watchers", "read", "config", "created_by", "team", "cooldown", "pinned_messages", "own_capabilities", "membership", "active_live_locations", "message_count", "extraData");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "cid");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "name");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "watcher_count");
        this.nullableListOfStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, String.class), c25235a0, "filter_tags");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "frozen");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "last_message_at");
        this.listOfDownstreamMessageDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamMessageDto.class), c25235a0, "messages");
        this.listOfDownstreamMemberDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamMemberDto.class), c25235a0, QueryChannelRequest.KEY_MEMBERS);
        this.listOfDownstreamUserDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamUserDto.class), c25235a0, "watchers");
        this.listOfDownstreamChannelUserReadAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamChannelUserRead.class), c25235a0, "read");
        this.configDtoAdapter = moshi.m94400c(ConfigDto.class, c25235a0, "config");
        this.nullableDownstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, "created_by");
        this.listOfStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, String.class), c25235a0, "own_capabilities");
        this.nullableDownstreamMemberDtoAdapter = moshi.m94400c(DownstreamMemberDto.class, c25235a0, "membership");
        this.listOfDownstreamLocationDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamLocationDto.class), c25235a0, "active_live_locations");
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "message_count");
        this.mapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(42, "GeneratedJsonAdapter(DownstreamChannelDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamChannelDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        int i13;
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        List list = null;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        List list4 = null;
        String str2 = null;
        List list5 = null;
        Boolean bool = null;
        List list6 = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        ConfigDto configDto = null;
        DownstreamUserDto downstreamUserDto = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list7 = null;
        Date date4 = null;
        DownstreamMemberDto downstreamMemberDto = null;
        Integer num4 = null;
        Map map = null;
        int i14 = -1;
        List list8 = null;
        while (true) {
            String str7 = str;
            Integer num5 = num;
            Boolean bool2 = bool;
            Date date5 = date;
            Date date6 = date2;
            List list9 = list3;
            if (!reader.hasNext()) {
                List list10 = list6;
                reader.endObject();
                if (i14 == -58322977) {
                    if (str3 == null) {
                        throw AbstractC31885f.m99129g("cid", "cid", reader);
                    }
                    if (str4 == null) {
                        throw AbstractC31885f.m99129g("id", "id", reader);
                    }
                    if (str7 == null) {
                        throw AbstractC31885f.m99129g("type", "type", reader);
                    }
                    int iIntValue = num5.intValue();
                    if (bool2 == null) {
                        throw AbstractC31885f.m99129g("frozen", "frozen", reader);
                    }
                    boolean zBooleanValue = bool2.booleanValue();
                    int iIntValue2 = num2.intValue();
                    AbstractC22676k.m65748h(list, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto>");
                    AbstractC22676k.m65748h(list2, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto>");
                    AbstractC22676k.m65748h(list8, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto>");
                    AbstractC22676k.m65748h(list4, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamChannelUserRead>");
                    if (configDto == null) {
                        throw AbstractC31885f.m99129g("config", "config", reader);
                    }
                    AbstractC22676k.m65748h(str2, "null cannot be cast to non-null type kotlin.String");
                    int iIntValue3 = num3.intValue();
                    AbstractC22676k.m65748h(list5, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto>");
                    AbstractC22676k.m65748h(list10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    AbstractC22676k.m65748h(list9, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto>");
                    if (map == null) {
                        throw AbstractC31885f.m99129g("extraData", "extraData", reader);
                    }
                    return new DownstreamChannelDto(str3, str4, str7, str5, str6, iIntValue, list7, zBooleanValue, date4, date5, date6, date3, iIntValue2, list, list2, list8, list4, configDto, downstreamUserDto, str2, iIntValue3, list5, list10, downstreamMemberDto, list9, num4, map);
                }
                List list11 = list2;
                List list12 = list;
                List list13 = list8;
                List list14 = list4;
                String str8 = str2;
                List list15 = list5;
                Constructor<DownstreamChannelDto> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class cls = AbstractC31885f.f132392c;
                    Class cls2 = Integer.TYPE;
                    declaredConstructor = DownstreamChannelDto.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, cls2, List.class, Boolean.TYPE, Date.class, Date.class, Date.class, Date.class, cls2, List.class, List.class, List.class, List.class, ConfigDto.class, DownstreamUserDto.class, String.class, cls2, List.class, List.class, DownstreamMemberDto.class, List.class, Integer.class, Map.class, cls2, cls);
                    this.constructorRef = declaredConstructor;
                    AbstractC22676k.m65749i(declaredConstructor, "also(...)");
                }
                if (str3 == null) {
                    throw AbstractC31885f.m99129g("cid", "cid", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("id", "id", reader);
                }
                if (str7 == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (bool2 == null) {
                    throw AbstractC31885f.m99129g("frozen", "frozen", reader);
                }
                if (configDto == null) {
                    throw AbstractC31885f.m99129g("config", "config", reader);
                }
                if (map == null) {
                    throw AbstractC31885f.m99129g("extraData", "extraData", reader);
                }
                DownstreamChannelDto downstreamChannelDtoNewInstance = declaredConstructor.newInstance(str3, str4, str7, str5, str6, num5, list7, bool2, date4, date5, date6, date3, num2, list12, list11, list13, list14, configDto, downstreamUserDto, str8, num3, list15, list10, downstreamMemberDto, list9, num4, map, Integer.valueOf(i14), null);
                AbstractC22676k.m65749i(downstreamChannelDtoNewInstance, "newInstance(...)");
                return downstreamChannelDtoNewInstance;
            }
            List list16 = list6;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 0:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 1:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("id", "id", reader);
                    }
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 2:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    num = num5;
                    bool = bool2;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case 3:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 4:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 5:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("watcher_count", "watcher_count", reader);
                    }
                    i14 &= -33;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case 6:
                    list7 = (List) this.nullableListOfStringAdapter.fromJson(reader);
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 7:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC31885f.m99135m("frozen", "frozen", reader);
                    }
                    num = num5;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case 8:
                    date4 = (Date) this.nullableDateAdapter.fromJson(reader);
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 9:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 10:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 11:
                    date3 = (Date) this.nullableDateAdapter.fromJson(reader);
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 12:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("member_count", "member_count", reader);
                    }
                    i14 &= -4097;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case 13:
                    list = (List) this.listOfDownstreamMessageDtoAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("messages", "messages", reader);
                    }
                    i14 &= -8193;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case 14:
                    list2 = (List) this.listOfDownstreamMemberDtoAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw AbstractC31885f.m99135m(QueryChannelRequest.KEY_MEMBERS, QueryChannelRequest.KEY_MEMBERS, reader);
                    }
                    i14 &= -16385;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case 15:
                    list8 = (List) this.listOfDownstreamUserDtoAdapter.fromJson(reader);
                    if (list8 == null) {
                        throw AbstractC31885f.m99135m("watchers", "watchers", reader);
                    }
                    i13 = -32769;
                    i14 &= i13;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case 16:
                    list4 = (List) this.listOfDownstreamChannelUserReadAdapter.fromJson(reader);
                    if (list4 == null) {
                        throw AbstractC31885f.m99135m("read", "read", reader);
                    }
                    i13 = -65537;
                    i14 &= i13;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    configDto = (ConfigDto) this.configDtoAdapter.fromJson(reader);
                    if (configDto == null) {
                        throw AbstractC31885f.m99135m("config", "config", reader);
                    }
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    downstreamUserDto = (DownstreamUserDto) this.nullableDownstreamUserDtoAdapter.fromJson(reader);
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("team", "team", reader);
                    }
                    i13 = -524289;
                    i14 &= i13;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case 20:
                    num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw AbstractC31885f.m99135m("cooldown", "cooldown", reader);
                    }
                    i13 = -1048577;
                    i14 &= i13;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case 21:
                    list5 = (List) this.listOfDownstreamMessageDtoAdapter.fromJson(reader);
                    if (list5 == null) {
                        throw AbstractC31885f.m99135m("pinned_messages", "pinned_messages", reader);
                    }
                    i13 = -2097153;
                    i14 &= i13;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    list6 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list6 == null) {
                        throw AbstractC31885f.m99135m("own_capabilities", "own_capabilities", reader);
                    }
                    i14 &= -4194305;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list3 = list9;
                    break;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    downstreamMemberDto = (DownstreamMemberDto) this.nullableDownstreamMemberDtoAdapter.fromJson(reader);
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 24:
                    list3 = (List) this.listOfDownstreamLocationDtoAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw AbstractC31885f.m99135m("active_live_locations", "active_live_locations", reader);
                    }
                    i14 &= -16777217;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    break;
                    break;
                case 25:
                    num4 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i13 = -33554433;
                    i14 &= i13;
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                case 26:
                    map = (Map) this.mapOfStringAnyAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("extraData", "extraData", reader);
                    }
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
                default:
                    num = num5;
                    bool = bool2;
                    str = str7;
                    date = date5;
                    date2 = date6;
                    list6 = list16;
                    list3 = list9;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamChannelDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("cid");
        this.stringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("name");
        this.nullableStringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("image");
        this.nullableStringAdapter.toJson(writer, value_.getImage());
        writer.mo94373x("watcher_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWatcher_count()));
        writer.mo94373x("filter_tags");
        this.nullableListOfStringAdapter.toJson(writer, value_.getFilter_tags());
        writer.mo94373x("frozen");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getFrozen()));
        writer.mo94373x("last_message_at");
        this.nullableDateAdapter.toJson(writer, value_.getLast_message_at());
        writer.mo94373x("created_at");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("deleted_at");
        this.nullableDateAdapter.toJson(writer, value_.getDeleted_at());
        writer.mo94373x("updated_at");
        this.nullableDateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x("member_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getMember_count()));
        writer.mo94373x("messages");
        this.listOfDownstreamMessageDtoAdapter.toJson(writer, value_.getMessages());
        writer.mo94373x(QueryChannelRequest.KEY_MEMBERS);
        this.listOfDownstreamMemberDtoAdapter.toJson(writer, value_.getMembers());
        writer.mo94373x("watchers");
        this.listOfDownstreamUserDtoAdapter.toJson(writer, value_.getWatchers());
        writer.mo94373x("read");
        this.listOfDownstreamChannelUserReadAdapter.toJson(writer, value_.getRead());
        writer.mo94373x("config");
        this.configDtoAdapter.toJson(writer, value_.getConfig());
        writer.mo94373x("created_by");
        this.nullableDownstreamUserDtoAdapter.toJson(writer, value_.getCreated_by());
        writer.mo94373x("team");
        this.stringAdapter.toJson(writer, value_.getTeam());
        writer.mo94373x("cooldown");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getCooldown()));
        writer.mo94373x("pinned_messages");
        this.listOfDownstreamMessageDtoAdapter.toJson(writer, value_.getPinned_messages());
        writer.mo94373x("own_capabilities");
        this.listOfStringAdapter.toJson(writer, value_.getOwn_capabilities());
        writer.mo94373x("membership");
        this.nullableDownstreamMemberDtoAdapter.toJson(writer, value_.getMembership());
        writer.mo94373x("active_live_locations");
        this.listOfDownstreamLocationDtoAdapter.toJson(writer, value_.getActive_live_locations());
        writer.mo94373x("message_count");
        this.nullableIntAdapter.toJson(writer, value_.getMessage_count());
        writer.mo94373x("extraData");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
