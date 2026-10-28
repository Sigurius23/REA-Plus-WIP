package io.getstream.chat.android.client.api2.model.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "exactDateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "downstreamUserDtoAdapter", "nullableStringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NotificationMarkUnreadEventDtoJsonAdapter extends JsonAdapter<NotificationMarkUnreadEventDto> {
    private volatile Constructor<NotificationMarkUnreadEventDto> constructorRef;
    private final JsonAdapter<DownstreamUserDto> downstreamUserDtoAdapter;
    private final JsonAdapter<ExactDate> exactDateAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public NotificationMarkUnreadEventDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("type", "created_at", UserState.Sources.USER, "cid", "channel_type", "channel_id", "first_unread_message_id", "last_read_message_id", "last_read_at", "unread_messages", "total_unread_count", "unread_channels", "thread_id", "unread_threads");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "type");
        this.exactDateAdapter = moshi.m94400c(ExactDate.class, c25235a0, "created_at");
        this.downstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "last_read_message_id");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "unread_messages");
    }

    public String toString() {
        return AbstractC36095b.m114677e(52, "GeneratedJsonAdapter(NotificationMarkUnreadEventDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NotificationMarkUnreadEventDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        ExactDate exactDate = null;
        Integer num = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        ExactDate exactDate2 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str7 = null;
        int i13 = -1;
        DownstreamUserDto downstreamUserDto = null;
        while (true) {
            String str8 = str;
            ExactDate exactDate3 = exactDate;
            DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            String str13 = str6;
            ExactDate exactDate4 = exactDate2;
            if (!reader.hasNext()) {
                Integer num5 = num2;
                reader.endObject();
                if (i13 == -12289) {
                    if (str8 == null) {
                        throw AbstractC31885f.m99129g("type", "type", reader);
                    }
                    if (exactDate3 == null) {
                        throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                    }
                    if (downstreamUserDto2 == null) {
                        throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    if (str9 == null) {
                        throw AbstractC31885f.m99129g("cid", "cid", reader);
                    }
                    if (str10 == null) {
                        throw AbstractC31885f.m99129g("channel_type", "channel_type", reader);
                    }
                    if (str11 == null) {
                        throw AbstractC31885f.m99129g("channel_id", "channel_id", reader);
                    }
                    if (str12 == null) {
                        throw AbstractC31885f.m99129g("first_unread_message_id", "first_unread_message_id", reader);
                    }
                    if (exactDate4 == null) {
                        throw AbstractC31885f.m99129g("last_read_at", "last_read_at", reader);
                    }
                    if (num5 == null) {
                        throw AbstractC31885f.m99129g("unread_messages", "unread_messages", reader);
                    }
                    int iIntValue = num5.intValue();
                    if (num3 == null) {
                        throw AbstractC31885f.m99129g("total_unread_count", "total_unread_count", reader);
                    }
                    int iIntValue2 = num3.intValue();
                    if (num4 == null) {
                        throw AbstractC31885f.m99129g("unread_channels", "unread_channels", reader);
                    }
                    return new NotificationMarkUnreadEventDto(str8, exactDate3, downstreamUserDto2, str9, str10, str11, str12, str13, exactDate4, iIntValue, iIntValue2, num4.intValue(), str7, num.intValue());
                }
                Constructor<NotificationMarkUnreadEventDto> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class cls = AbstractC31885f.f132392c;
                    Class cls2 = Integer.TYPE;
                    declaredConstructor = NotificationMarkUnreadEventDto.class.getDeclaredConstructor(String.class, ExactDate.class, DownstreamUserDto.class, String.class, String.class, String.class, String.class, String.class, ExactDate.class, cls2, cls2, cls2, String.class, cls2, cls2, cls);
                    this.constructorRef = declaredConstructor;
                    AbstractC22676k.m65749i(declaredConstructor, "also(...)");
                }
                if (str8 == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (exactDate3 == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (downstreamUserDto2 == null) {
                    throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
                }
                if (str9 == null) {
                    throw AbstractC31885f.m99129g("cid", "cid", reader);
                }
                if (str10 == null) {
                    throw AbstractC31885f.m99129g("channel_type", "channel_type", reader);
                }
                if (str11 == null) {
                    throw AbstractC31885f.m99129g("channel_id", "channel_id", reader);
                }
                if (str12 == null) {
                    throw AbstractC31885f.m99129g("first_unread_message_id", "first_unread_message_id", reader);
                }
                if (exactDate4 == null) {
                    throw AbstractC31885f.m99129g("last_read_at", "last_read_at", reader);
                }
                if (num5 == null) {
                    throw AbstractC31885f.m99129g("unread_messages", "unread_messages", reader);
                }
                if (num3 == null) {
                    throw AbstractC31885f.m99129g("total_unread_count", "total_unread_count", reader);
                }
                if (num4 == null) {
                    throw AbstractC31885f.m99129g("unread_channels", "unread_channels", reader);
                }
                NotificationMarkUnreadEventDto notificationMarkUnreadEventDtoNewInstance = declaredConstructor.newInstance(str8, exactDate3, downstreamUserDto2, str9, str10, str11, str12, str13, exactDate4, num5, num3, num4, str7, num, Integer.valueOf(i13), null);
                AbstractC22676k.m65749i(notificationMarkUnreadEventDtoNewInstance, "newInstance(...)");
                return notificationMarkUnreadEventDtoNewInstance;
            }
            Integer num6 = num2;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                case 1:
                    exactDate = (ExactDate) this.exactDateAdapter.fromJson(reader);
                    if (exactDate == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    str = str8;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                    break;
                case 2:
                    downstreamUserDto = (DownstreamUserDto) this.downstreamUserDtoAdapter.fromJson(reader);
                    if (downstreamUserDto == null) {
                        throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    str = str8;
                    exactDate = exactDate3;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                    break;
                case 4:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("channel_type", "channel_type", reader);
                    }
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                    break;
                case 5:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("channel_id", "channel_id", reader);
                    }
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                    break;
                case 6:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw AbstractC31885f.m99135m("first_unread_message_id", "first_unread_message_id", reader);
                    }
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                    break;
                case 7:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                case 8:
                    exactDate2 = (ExactDate) this.exactDateAdapter.fromJson(reader);
                    if (exactDate2 == null) {
                        throw AbstractC31885f.m99135m("last_read_at", "last_read_at", reader);
                    }
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    num2 = num6;
                    break;
                    break;
                case 9:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("unread_messages", "unread_messages", reader);
                    }
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    break;
                    break;
                case 10:
                    num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw AbstractC31885f.m99135m("total_unread_count", "total_unread_count", reader);
                    }
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                case 11:
                    num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw AbstractC31885f.m99135m("unread_channels", "unread_channels", reader);
                    }
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                case 12:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -4097;
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                case 13:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("unread_threads", "unread_threads", reader);
                    }
                    i13 &= -8193;
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
                    break;
                default:
                    str = str8;
                    exactDate = exactDate3;
                    downstreamUserDto = downstreamUserDto2;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    exactDate2 = exactDate4;
                    num2 = num6;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, NotificationMarkUnreadEventDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("created_at");
        this.exactDateAdapter.toJson(writer, value_.getCreated_at());
        writer.mo94373x(UserState.Sources.USER);
        this.downstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("cid");
        this.stringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("channel_type");
        this.stringAdapter.toJson(writer, value_.getChannel_type());
        writer.mo94373x("channel_id");
        this.stringAdapter.toJson(writer, value_.getChannel_id());
        writer.mo94373x("first_unread_message_id");
        this.stringAdapter.toJson(writer, value_.getFirst_unread_message_id());
        writer.mo94373x("last_read_message_id");
        this.nullableStringAdapter.toJson(writer, value_.getLast_read_message_id());
        writer.mo94373x("last_read_at");
        this.exactDateAdapter.toJson(writer, value_.getLast_read_at());
        writer.mo94373x("unread_messages");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_messages()));
        writer.mo94373x("total_unread_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getTotal_unread_count()));
        writer.mo94373x("unread_channels");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_channels()));
        writer.mo94373x("thread_id");
        this.nullableStringAdapter.toJson(writer, value_.getThread_id());
        writer.mo94373x("unread_threads");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_threads()));
        writer.mo94370m();
    }
}
