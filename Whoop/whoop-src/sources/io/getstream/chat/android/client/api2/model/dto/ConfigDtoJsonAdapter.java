package io.getstream.chat.android.client.api2.model.dto;

import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import com.mapbox.common.MapboxServices;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ConfigDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;)V", "Lqx/v;", "options", "Lqx/v;", "Ljava/util/Date;", "nullableDateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "nullableBooleanAdapter", "stringAdapter", "", "intAdapter", "", "Lio/getstream/chat/android/client/api2/model/dto/CommandDto;", "listOfCommandDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ConfigDtoJsonAdapter extends JsonAdapter<ConfigDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ConfigDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<CommandDto>> listOfCommandDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public ConfigDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("created_at", "updated_at", "name", "typing_events", "read_events", "delivery_events", "connect_events", MapboxServices.SEARCH, "reactions", "replies", "mutes", "uploads", "url_enrichment", "custom_events", "push_notifications", "skip_last_msg_update_for_system_msgs", "polls", "message_retention", "max_message_length", "automod", "automod_behavior", "blocklist_behavior", "commands", "user_message_reminders", "shared_locations", "mark_messages_pending");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "created_at");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "name");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "typing_events");
        this.nullableBooleanAdapter = moshi.m94400c(Boolean.class, c25235a0, "skip_last_msg_update_for_system_msgs");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "message_retention");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "max_message_length");
        this.listOfCommandDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, CommandDto.class), c25235a0, "commands");
    }

    public String toString() {
        return AbstractC36095b.m114677e(31, "GeneratedJsonAdapter(ConfigDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ConfigDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = null;
        int i13 = -1;
        Boolean bool3 = bool;
        Date date = null;
        Date date2 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        String str = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        Boolean bool12 = null;
        Boolean bool13 = null;
        Boolean bool14 = null;
        Boolean bool15 = null;
        String str2 = null;
        Integer num = null;
        Boolean bool16 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        Boolean bool17 = null;
        Boolean bool18 = null;
        while (true) {
            Boolean bool19 = bool2;
            Date date3 = date;
            Date date4 = date2;
            Boolean bool20 = bool4;
            Boolean bool21 = bool5;
            bool3 = bool3;
            Boolean bool22 = bool6;
            Boolean bool23 = bool7;
            Boolean bool24 = bool8;
            String str6 = str;
            Boolean bool25 = bool9;
            int i14 = i13;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i14 == -33) {
                    if (bool20 == null) {
                        throw AbstractC31885f.m99129g("typing_events", "typing_events", reader);
                    }
                    boolean zBooleanValue = bool20.booleanValue();
                    if (bool21 == null) {
                        throw AbstractC31885f.m99129g("read_events", "read_events", reader);
                    }
                    boolean zBooleanValue2 = bool21.booleanValue();
                    Boolean bool26 = bool11;
                    boolean zBooleanValue3 = bool3.booleanValue();
                    if (bool22 == null) {
                        throw AbstractC31885f.m99129g("connect_events", "connect_events", reader);
                    }
                    boolean zBooleanValue4 = bool22.booleanValue();
                    if (bool23 == null) {
                        throw AbstractC31885f.m99129g(MapboxServices.SEARCH, MapboxServices.SEARCH, reader);
                    }
                    boolean zBooleanValue5 = bool23.booleanValue();
                    if (bool24 == null) {
                        throw AbstractC31885f.m99129g("reactions", "reactions", reader);
                    }
                    boolean zBooleanValue6 = bool24.booleanValue();
                    if (bool19 == null) {
                        throw AbstractC31885f.m99129g("replies", "replies", reader);
                    }
                    Boolean bool27 = bool15;
                    boolean zBooleanValue7 = bool19.booleanValue();
                    if (bool25 == null) {
                        throw AbstractC31885f.m99129g("mutes", "mutes", reader);
                    }
                    Boolean bool28 = bool12;
                    String str7 = str2;
                    boolean zBooleanValue8 = bool25.booleanValue();
                    if (bool10 == null) {
                        throw AbstractC31885f.m99129g("uploads", "uploads", reader);
                    }
                    Integer num2 = num;
                    boolean zBooleanValue9 = bool10.booleanValue();
                    if (bool26 == null) {
                        throw AbstractC31885f.m99129g("url_enrichment", "url_enrichment", reader);
                    }
                    boolean zBooleanValue10 = bool26.booleanValue();
                    if (bool28 == null) {
                        throw AbstractC31885f.m99129g("custom_events", "custom_events", reader);
                    }
                    Boolean bool29 = bool14;
                    boolean zBooleanValue11 = bool28.booleanValue();
                    if (bool13 == null) {
                        throw AbstractC31885f.m99129g("push_notifications", "push_notifications", reader);
                    }
                    boolean zBooleanValue12 = bool13.booleanValue();
                    if (bool27 == null) {
                        throw AbstractC31885f.m99129g("polls", "polls", reader);
                    }
                    boolean zBooleanValue13 = bool27.booleanValue();
                    if (str7 == null) {
                        throw AbstractC31885f.m99129g("message_retention", "message_retention", reader);
                    }
                    if (num2 == null) {
                        throw AbstractC31885f.m99129g("max_message_length", "max_message_length", reader);
                    }
                    Boolean bool30 = bool16;
                    int iIntValue = num2.intValue();
                    if (str3 == null) {
                        throw AbstractC31885f.m99129g("automod", "automod", reader);
                    }
                    if (str4 == null) {
                        throw AbstractC31885f.m99129g("automod_behavior", "automod_behavior", reader);
                    }
                    if (list == null) {
                        throw AbstractC31885f.m99129g("commands", "commands", reader);
                    }
                    if (bool30 != null) {
                        return new ConfigDto(date3, date4, str6, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, bool29, zBooleanValue13, str7, iIntValue, str3, str4, str5, list, bool17, bool18, bool30.booleanValue());
                    }
                    throw AbstractC31885f.m99129g("mark_messages_pending", "mark_messages_pending", reader);
                }
                Boolean bool31 = bool11;
                Boolean bool32 = bool12;
                Boolean bool33 = bool15;
                Integer num3 = num;
                Boolean bool34 = bool16;
                Constructor<ConfigDto> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class cls = AbstractC31885f.f132392c;
                    Class cls2 = Boolean.TYPE;
                    Class cls3 = Integer.TYPE;
                    declaredConstructor = ConfigDto.class.getDeclaredConstructor(Date.class, Date.class, String.class, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, Boolean.class, cls2, String.class, cls3, String.class, String.class, String.class, List.class, Boolean.class, Boolean.class, cls2, cls3, cls);
                    this.constructorRef = declaredConstructor;
                    AbstractC22676k.m65749i(declaredConstructor, "also(...)");
                }
                if (bool20 == null) {
                    throw AbstractC31885f.m99129g("typing_events", "typing_events", reader);
                }
                if (bool21 == null) {
                    throw AbstractC31885f.m99129g("read_events", "read_events", reader);
                }
                if (bool22 == null) {
                    throw AbstractC31885f.m99129g("connect_events", "connect_events", reader);
                }
                if (bool23 == null) {
                    throw AbstractC31885f.m99129g(MapboxServices.SEARCH, MapboxServices.SEARCH, reader);
                }
                if (bool24 == null) {
                    throw AbstractC31885f.m99129g("reactions", "reactions", reader);
                }
                if (bool19 == null) {
                    throw AbstractC31885f.m99129g("replies", "replies", reader);
                }
                if (bool25 == null) {
                    throw AbstractC31885f.m99129g("mutes", "mutes", reader);
                }
                if (bool10 == null) {
                    throw AbstractC31885f.m99129g("uploads", "uploads", reader);
                }
                if (bool31 == null) {
                    throw AbstractC31885f.m99129g("url_enrichment", "url_enrichment", reader);
                }
                if (bool32 == null) {
                    throw AbstractC31885f.m99129g("custom_events", "custom_events", reader);
                }
                if (bool13 == null) {
                    throw AbstractC31885f.m99129g("push_notifications", "push_notifications", reader);
                }
                if (bool33 == null) {
                    throw AbstractC31885f.m99129g("polls", "polls", reader);
                }
                if (str2 == null) {
                    throw AbstractC31885f.m99129g("message_retention", "message_retention", reader);
                }
                if (num3 == null) {
                    throw AbstractC31885f.m99129g("max_message_length", "max_message_length", reader);
                }
                if (str3 == null) {
                    throw AbstractC31885f.m99129g("automod", "automod", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("automod_behavior", "automod_behavior", reader);
                }
                if (list == null) {
                    throw AbstractC31885f.m99129g("commands", "commands", reader);
                }
                if (bool34 == null) {
                    throw AbstractC31885f.m99129g("mark_messages_pending", "mark_messages_pending", reader);
                }
                ConfigDto configDtoNewInstance = declaredConstructor.newInstance(date3, date4, str6, bool20, bool21, bool3, bool22, bool23, bool24, bool19, bool25, bool10, bool31, bool32, bool13, bool14, bool33, str2, num3, str3, str4, str5, list, bool17, bool18, bool34, Integer.valueOf(i14), null);
                AbstractC22676k.m65749i(configDtoNewInstance, "newInstance(...)");
                return configDtoNewInstance;
            }
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 0:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    bool2 = bool19;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 1:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    bool2 = bool19;
                    date = date3;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool3 = bool3;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 3:
                    bool4 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw AbstractC31885f.m99135m("typing_events", "typing_events", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                    break;
                case 4:
                    bool5 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool5 == null) {
                        throw AbstractC31885f.m99135m("read_events", "read_events", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                    break;
                case 5:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw AbstractC31885f.m99135m("delivery_events", "delivery_events", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = -33;
                    break;
                    break;
                case 6:
                    bool6 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool6 == null) {
                        throw AbstractC31885f.m99135m("connect_events", "connect_events", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                    break;
                case 7:
                    bool7 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool7 == null) {
                        throw AbstractC31885f.m99135m(MapboxServices.SEARCH, MapboxServices.SEARCH, reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool3 = bool3;
                    bool6 = bool22;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                    break;
                case 8:
                    bool8 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool8 == null) {
                        throw AbstractC31885f.m99135m("reactions", "reactions", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool3 = bool3;
                    bool6 = bool22;
                    bool7 = bool23;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                    break;
                case 9:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m("replies", "replies", reader);
                    }
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 10:
                    bool9 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool9 == null) {
                        throw AbstractC31885f.m99135m("mutes", "mutes", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool3 = bool3;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    i13 = i14;
                    break;
                    break;
                case 11:
                    bool10 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool10 == null) {
                        throw AbstractC31885f.m99135m("uploads", "uploads", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 12:
                    bool11 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool11 == null) {
                        throw AbstractC31885f.m99135m("url_enrichment", "url_enrichment", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 13:
                    bool12 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool12 == null) {
                        throw AbstractC31885f.m99135m("custom_events", "custom_events", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 14:
                    bool13 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool13 == null) {
                        throw AbstractC31885f.m99135m("push_notifications", "push_notifications", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 15:
                    bool14 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 16:
                    bool15 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool15 == null) {
                        throw AbstractC31885f.m99135m("polls", "polls", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("message_retention", "message_retention", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("max_message_length", "max_message_length", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("automod", "automod", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 20:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("automod_behavior", "automod_behavior", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 21:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    list = (List) this.listOfCommandDtoAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("commands", "commands", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    bool17 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 24:
                    bool18 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                case 25:
                    bool16 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool16 == null) {
                        throw AbstractC31885f.m99135m("mark_messages_pending", "mark_messages_pending", reader);
                    }
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
                default:
                    bool2 = bool19;
                    date = date3;
                    date2 = date4;
                    bool4 = bool20;
                    bool5 = bool21;
                    bool6 = bool22;
                    bool7 = bool23;
                    bool8 = bool24;
                    str = str6;
                    bool9 = bool25;
                    i13 = i14;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, ConfigDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("created_at");
        this.nullableDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x("updated_at");
        this.nullableDateAdapter.toJson(writer, value_.getUpdated_at());
        writer.mo94373x("name");
        this.nullableStringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("typing_events");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getTyping_events()));
        writer.mo94373x("read_events");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getRead_events()));
        writer.mo94373x("delivery_events");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getDelivery_events()));
        writer.mo94373x("connect_events");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getConnect_events()));
        writer.mo94373x(MapboxServices.SEARCH);
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSearch()));
        writer.mo94373x("reactions");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getReactions()));
        writer.mo94373x("replies");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getReplies()));
        writer.mo94373x("mutes");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getMutes()));
        writer.mo94373x("uploads");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getUploads()));
        writer.mo94373x("url_enrichment");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getUrl_enrichment()));
        writer.mo94373x("custom_events");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getCustom_events()));
        writer.mo94373x("push_notifications");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getPush_notifications()));
        writer.mo94373x("skip_last_msg_update_for_system_msgs");
        this.nullableBooleanAdapter.toJson(writer, value_.getSkip_last_msg_update_for_system_msgs());
        writer.mo94373x("polls");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getPolls()));
        writer.mo94373x("message_retention");
        this.stringAdapter.toJson(writer, value_.getMessage_retention());
        writer.mo94373x("max_message_length");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getMax_message_length()));
        writer.mo94373x("automod");
        this.stringAdapter.toJson(writer, value_.getAutomod());
        writer.mo94373x("automod_behavior");
        this.stringAdapter.toJson(writer, value_.getAutomod_behavior());
        writer.mo94373x("blocklist_behavior");
        this.nullableStringAdapter.toJson(writer, value_.getBlocklist_behavior());
        writer.mo94373x("commands");
        this.listOfCommandDtoAdapter.toJson(writer, value_.getCommands());
        writer.mo94373x("user_message_reminders");
        this.nullableBooleanAdapter.toJson(writer, value_.getUser_message_reminders());
        writer.mo94373x("shared_locations");
        this.nullableBooleanAdapter.toJson(writer, value_.getShared_locations());
        writer.mo94373x("mark_messages_pending");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getMark_messages_pending()));
        writer.mo94370m();
    }
}
