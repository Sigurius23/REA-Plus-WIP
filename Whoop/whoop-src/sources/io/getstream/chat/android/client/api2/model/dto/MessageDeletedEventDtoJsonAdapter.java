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
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "exactDateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "nullableDownstreamUserDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "downstreamMessageDtoAdapter", "", "nullableBooleanAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageDeletedEventDtoJsonAdapter extends JsonAdapter<MessageDeletedEventDto> {
    private volatile Constructor<MessageDeletedEventDto> constructorRef;
    private final JsonAdapter<DownstreamMessageDto> downstreamMessageDtoAdapter;
    private final JsonAdapter<ExactDate> exactDateAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<DownstreamUserDto> nullableDownstreamUserDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public MessageDeletedEventDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("type", "created_at", UserState.Sources.USER, "cid", "channel_type", "channel_id", "message", "hard_delete", "channel_message_count", "deleted_for_me");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "type");
        this.exactDateAdapter = moshi.m94400c(ExactDate.class, c25235a0, "created_at");
        this.nullableDownstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.downstreamMessageDtoAdapter = moshi.m94400c(DownstreamMessageDto.class, c25235a0, "message");
        this.nullableBooleanAdapter = moshi.m94400c(Boolean.class, c25235a0, "hard_delete");
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "channel_message_count");
    }

    public String toString() {
        return AbstractC36095b.m114677e(44, "GeneratedJsonAdapter(MessageDeletedEventDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public MessageDeletedEventDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        String str = null;
        ExactDate exactDate = null;
        DownstreamUserDto downstreamUserDto = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        DownstreamMessageDto downstreamMessageDto = null;
        Boolean bool = null;
        Integer num = null;
        Boolean bool2 = null;
        while (true) {
            String str5 = str;
            ExactDate exactDate2 = exactDate;
            DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
            if (!reader.hasNext()) {
                String str6 = str2;
                reader.endObject();
                if (i13 == -769) {
                    if (str5 == null) {
                        throw AbstractC31885f.m99129g("type", "type", reader);
                    }
                    if (exactDate2 == null) {
                        throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                    }
                    if (str6 == null) {
                        throw AbstractC31885f.m99129g("cid", "cid", reader);
                    }
                    if (str3 == null) {
                        throw AbstractC31885f.m99129g("channel_type", "channel_type", reader);
                    }
                    if (str4 == null) {
                        throw AbstractC31885f.m99129g("channel_id", "channel_id", reader);
                    }
                    if (downstreamMessageDto == null) {
                        throw AbstractC31885f.m99129g("message", "message", reader);
                    }
                    Integer num2 = num;
                    Boolean bool3 = bool;
                    return new MessageDeletedEventDto(str5, exactDate2, downstreamUserDto2, str6, str3, str4, downstreamMessageDto, bool3, num2, bool2);
                }
                Constructor<MessageDeletedEventDto> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    declaredConstructor = MessageDeletedEventDto.class.getDeclaredConstructor(String.class, ExactDate.class, DownstreamUserDto.class, String.class, String.class, String.class, DownstreamMessageDto.class, Boolean.class, Integer.class, Boolean.class, Integer.TYPE, AbstractC31885f.f132392c);
                    this.constructorRef = declaredConstructor;
                    AbstractC22676k.m65749i(declaredConstructor, "also(...)");
                }
                Constructor<MessageDeletedEventDto> constructor = declaredConstructor;
                if (str5 == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (exactDate2 == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (str6 == null) {
                    throw AbstractC31885f.m99129g("cid", "cid", reader);
                }
                if (str3 == null) {
                    throw AbstractC31885f.m99129g("channel_type", "channel_type", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("channel_id", "channel_id", reader);
                }
                if (downstreamMessageDto == null) {
                    throw AbstractC31885f.m99129g("message", "message", reader);
                }
                MessageDeletedEventDto messageDeletedEventDtoNewInstance = constructor.newInstance(str5, exactDate2, downstreamUserDto2, str6, str3, str4, downstreamMessageDto, bool, num, bool2, Integer.valueOf(i13), null);
                AbstractC22676k.m65749i(messageDeletedEventDtoNewInstance, "newInstance(...)");
                return messageDeletedEventDtoNewInstance;
            }
            String str7 = str2;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    str2 = str7;
                    str = str5;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    str2 = str7;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                    break;
                case 1:
                    exactDate = (ExactDate) this.exactDateAdapter.fromJson(reader);
                    if (exactDate == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    str2 = str7;
                    str = str5;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                    break;
                case 2:
                    downstreamUserDto = (DownstreamUserDto) this.nullableDownstreamUserDtoAdapter.fromJson(reader);
                    str2 = str7;
                    str = str5;
                    exactDate = exactDate2;
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    str = str5;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                case 4:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("channel_type", "channel_type", reader);
                    }
                    str2 = str7;
                    str = str5;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                case 5:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("channel_id", "channel_id", reader);
                    }
                    str2 = str7;
                    str = str5;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                case 6:
                    downstreamMessageDto = (DownstreamMessageDto) this.downstreamMessageDtoAdapter.fromJson(reader);
                    if (downstreamMessageDto == null) {
                        throw AbstractC31885f.m99135m("message", "message", reader);
                    }
                    str2 = str7;
                    str = str5;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                case 7:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    str2 = str7;
                    str = str5;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                case 8:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i13 &= -257;
                    str2 = str7;
                    str = str5;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                case 9:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i13 &= -513;
                    str2 = str7;
                    str = str5;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
                default:
                    str2 = str7;
                    str = str5;
                    exactDate = exactDate2;
                    downstreamUserDto = downstreamUserDto2;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, MessageDeletedEventDto value_) {
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
        this.nullableDownstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("cid");
        this.stringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("channel_type");
        this.stringAdapter.toJson(writer, value_.getChannel_type());
        writer.mo94373x("channel_id");
        this.stringAdapter.toJson(writer, value_.getChannel_id());
        writer.mo94373x("message");
        this.downstreamMessageDtoAdapter.toJson(writer, value_.getMessage());
        writer.mo94373x("hard_delete");
        this.nullableBooleanAdapter.toJson(writer, value_.getHard_delete());
        writer.mo94373x("channel_message_count");
        this.nullableIntAdapter.toJson(writer, value_.getChannel_message_count());
        writer.mo94373x("deleted_for_me");
        this.nullableBooleanAdapter.toJson(writer, value_.getDeleted_for_me());
        writer.mo94370m();
    }
}
