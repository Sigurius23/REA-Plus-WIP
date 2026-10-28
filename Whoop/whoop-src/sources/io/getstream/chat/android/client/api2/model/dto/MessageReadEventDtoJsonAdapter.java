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
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "exactDateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "downstreamUserDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "nullableDownstreamThreadInfoDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReadEventDtoJsonAdapter extends JsonAdapter<MessageReadEventDto> {
    private volatile Constructor<MessageReadEventDto> constructorRef;
    private final JsonAdapter<DownstreamUserDto> downstreamUserDtoAdapter;
    private final JsonAdapter<ExactDate> exactDateAdapter;
    private final JsonAdapter<DownstreamThreadInfoDto> nullableDownstreamThreadInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public MessageReadEventDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("type", "created_at", UserState.Sources.USER, "cid", "channel_type", "channel_id", "thread", "last_read_message_id", "team");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "type");
        this.exactDateAdapter = moshi.m94400c(ExactDate.class, c25235a0, "created_at");
        this.downstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.nullableDownstreamThreadInfoDtoAdapter = moshi.m94400c(DownstreamThreadInfoDto.class, c25235a0, "thread");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "last_read_message_id");
    }

    public String toString() {
        return AbstractC36095b.m114677e(41, "GeneratedJsonAdapter(MessageReadEventDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public MessageReadEventDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        String str = null;
        ExactDate exactDate = null;
        DownstreamUserDto downstreamUserDto = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        DownstreamThreadInfoDto downstreamThreadInfoDto = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            String str7 = str;
            ExactDate exactDate2 = exactDate;
            if (!reader.hasNext()) {
                DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
                reader.endObject();
                if (i13 == -321) {
                    if (str7 == null) {
                        throw AbstractC31885f.m99129g("type", "type", reader);
                    }
                    if (exactDate2 == null) {
                        throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                    }
                    if (downstreamUserDto2 == null) {
                        throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    if (str2 == null) {
                        throw AbstractC31885f.m99129g("cid", "cid", reader);
                    }
                    if (str3 == null) {
                        throw AbstractC31885f.m99129g("channel_type", "channel_type", reader);
                    }
                    if (str4 == null) {
                        throw AbstractC31885f.m99129g("channel_id", "channel_id", reader);
                    }
                    String str8 = str6;
                    String str9 = str5;
                    DownstreamThreadInfoDto downstreamThreadInfoDto2 = downstreamThreadInfoDto;
                    return new MessageReadEventDto(str7, exactDate2, downstreamUserDto2, str2, str3, str4, downstreamThreadInfoDto2, str9, str8);
                }
                Constructor<MessageReadEventDto> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    declaredConstructor = MessageReadEventDto.class.getDeclaredConstructor(String.class, ExactDate.class, DownstreamUserDto.class, String.class, String.class, String.class, DownstreamThreadInfoDto.class, String.class, String.class, Integer.TYPE, AbstractC31885f.f132392c);
                    this.constructorRef = declaredConstructor;
                    AbstractC22676k.m65749i(declaredConstructor, "also(...)");
                }
                Constructor<MessageReadEventDto> constructor = declaredConstructor;
                if (str7 == null) {
                    throw AbstractC31885f.m99129g("type", "type", reader);
                }
                if (exactDate2 == null) {
                    throw AbstractC31885f.m99129g("created_at", "created_at", reader);
                }
                if (downstreamUserDto2 == null) {
                    throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
                }
                if (str2 == null) {
                    throw AbstractC31885f.m99129g("cid", "cid", reader);
                }
                if (str3 == null) {
                    throw AbstractC31885f.m99129g("channel_type", "channel_type", reader);
                }
                if (str4 == null) {
                    throw AbstractC31885f.m99129g("channel_id", "channel_id", reader);
                }
                MessageReadEventDto messageReadEventDtoNewInstance = constructor.newInstance(str7, exactDate2, downstreamUserDto2, str2, str3, str4, downstreamThreadInfoDto, str5, str6, Integer.valueOf(i13), null);
                AbstractC22676k.m65749i(messageReadEventDtoNewInstance, "newInstance(...)");
                return messageReadEventDtoNewInstance;
            }
            DownstreamUserDto downstreamUserDto3 = downstreamUserDto;
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    downstreamUserDto = downstreamUserDto3;
                    str = str7;
                    exactDate = exactDate2;
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    exactDate = exactDate2;
                    break;
                    break;
                case 1:
                    exactDate = (ExactDate) this.exactDateAdapter.fromJson(reader);
                    if (exactDate == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str7;
                    break;
                    break;
                case 2:
                    downstreamUserDto = (DownstreamUserDto) this.downstreamUserDtoAdapter.fromJson(reader);
                    if (downstreamUserDto == null) {
                        throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    str = str7;
                    exactDate = exactDate2;
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str7;
                    exactDate = exactDate2;
                    break;
                case 4:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("channel_type", "channel_type", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str7;
                    exactDate = exactDate2;
                    break;
                case 5:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("channel_id", "channel_id", reader);
                    }
                    downstreamUserDto = downstreamUserDto3;
                    str = str7;
                    exactDate = exactDate2;
                    break;
                case 6:
                    downstreamThreadInfoDto = (DownstreamThreadInfoDto) this.nullableDownstreamThreadInfoDtoAdapter.fromJson(reader);
                    i13 &= -65;
                    downstreamUserDto = downstreamUserDto3;
                    str = str7;
                    exactDate = exactDate2;
                    break;
                case 7:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    downstreamUserDto = downstreamUserDto3;
                    str = str7;
                    exactDate = exactDate2;
                    break;
                case 8:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -257;
                    downstreamUserDto = downstreamUserDto3;
                    str = str7;
                    exactDate = exactDate2;
                    break;
                default:
                    downstreamUserDto = downstreamUserDto3;
                    str = str7;
                    exactDate = exactDate2;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, MessageReadEventDto value_) {
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
        writer.mo94373x("thread");
        this.nullableDownstreamThreadInfoDtoAdapter.toJson(writer, value_.getThread());
        writer.mo94373x("last_read_message_id");
        this.nullableStringAdapter.toJson(writer, value_.getLast_read_message_id());
        writer.mo94373x("team");
        this.nullableStringAdapter.toJson(writer, value_.getTeam());
        writer.mo94370m();
    }
}
