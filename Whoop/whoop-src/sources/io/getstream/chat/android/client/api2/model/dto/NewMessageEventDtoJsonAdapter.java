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
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/NewMessageEventDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "exactDateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "downstreamUserDtoAdapter", "", "nullableIntAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelCustomDto;", "nullableDownstreamChannelCustomDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "downstreamMessageDtoAdapter", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NewMessageEventDtoJsonAdapter extends JsonAdapter<NewMessageEventDto> {
    private volatile Constructor<NewMessageEventDto> constructorRef;
    private final JsonAdapter<DownstreamMessageDto> downstreamMessageDtoAdapter;
    private final JsonAdapter<DownstreamUserDto> downstreamUserDtoAdapter;
    private final JsonAdapter<ExactDate> exactDateAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<DownstreamChannelCustomDto> nullableDownstreamChannelCustomDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public NewMessageEventDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("type", "created_at", UserState.Sources.USER, "cid", "channel_member_count", "channel_custom", "channel_type", "channel_id", "message", "watcher_count", "total_unread_count", "unread_channels", "channel_message_count");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "type");
        this.exactDateAdapter = moshi.m94400c(ExactDate.class, c25235a0, "created_at");
        this.downstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.nullableIntAdapter = moshi.m94400c(Integer.class, c25235a0, "channel_member_count");
        this.nullableDownstreamChannelCustomDtoAdapter = moshi.m94400c(DownstreamChannelCustomDto.class, c25235a0, "channel_custom");
        this.downstreamMessageDtoAdapter = moshi.m94400c(DownstreamMessageDto.class, c25235a0, "message");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "watcher_count");
    }

    public String toString() {
        return AbstractC36095b.m114677e(40, "GeneratedJsonAdapter(NewMessageEventDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NewMessageEventDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        ExactDate exactDate = null;
        DownstreamUserDto downstreamUserDto = null;
        String str2 = null;
        Integer num4 = null;
        DownstreamChannelCustomDto downstreamChannelCustomDto = null;
        String str3 = null;
        String str4 = null;
        DownstreamMessageDto downstreamMessageDto = null;
        Integer num5 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("type", "type", reader);
                    }
                    break;
                    break;
                case 1:
                    exactDate = (ExactDate) this.exactDateAdapter.fromJson(reader);
                    if (exactDate == null) {
                        throw AbstractC31885f.m99135m("created_at", "created_at", reader);
                    }
                    break;
                    break;
                case 2:
                    downstreamUserDto = (DownstreamUserDto) this.downstreamUserDtoAdapter.fromJson(reader);
                    if (downstreamUserDto == null) {
                        throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    break;
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("cid", "cid", reader);
                    }
                    break;
                    break;
                case 4:
                    num4 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    downstreamChannelCustomDto = (DownstreamChannelCustomDto) this.nullableDownstreamChannelCustomDtoAdapter.fromJson(reader);
                    break;
                case 6:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("channel_type", "channel_type", reader);
                    }
                    break;
                    break;
                case 7:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC31885f.m99135m("channel_id", "channel_id", reader);
                    }
                    break;
                    break;
                case 8:
                    downstreamMessageDto = (DownstreamMessageDto) this.downstreamMessageDtoAdapter.fromJson(reader);
                    if (downstreamMessageDto == null) {
                        throw AbstractC31885f.m99135m("message", "message", reader);
                    }
                    break;
                    break;
                case 9:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("watcher_count", "watcher_count", reader);
                    }
                    i13 &= -513;
                    break;
                    break;
                case 10:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("total_unread_count", "total_unread_count", reader);
                    }
                    i13 &= -1025;
                    break;
                    break;
                case 11:
                    num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw AbstractC31885f.m99135m("unread_channels", "unread_channels", reader);
                    }
                    i13 &= -2049;
                    break;
                    break;
                case 12:
                    num5 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i13 &= -4097;
                    break;
            }
        }
        reader.endObject();
        if (i13 == -7681) {
            if (str == null) {
                throw AbstractC31885f.m99129g("type", "type", reader);
            }
            if (exactDate == null) {
                throw AbstractC31885f.m99129g("created_at", "created_at", reader);
            }
            if (downstreamUserDto == null) {
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
            if (downstreamMessageDto != null) {
                return new NewMessageEventDto(str, exactDate, downstreamUserDto, str2, num4, downstreamChannelCustomDto, str3, str4, downstreamMessageDto, num.intValue(), num2.intValue(), num3.intValue(), num5);
            }
            throw AbstractC31885f.m99129g("message", "message", reader);
        }
        Constructor<NewMessageEventDto> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = AbstractC31885f.f132392c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = NewMessageEventDto.class.getDeclaredConstructor(String.class, ExactDate.class, DownstreamUserDto.class, String.class, Integer.class, DownstreamChannelCustomDto.class, String.class, String.class, DownstreamMessageDto.class, cls2, cls2, cls2, Integer.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (str == null) {
            throw AbstractC31885f.m99129g("type", "type", reader);
        }
        if (exactDate == null) {
            throw AbstractC31885f.m99129g("created_at", "created_at", reader);
        }
        if (downstreamUserDto == null) {
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
        if (downstreamMessageDto == null) {
            throw AbstractC31885f.m99129g("message", "message", reader);
        }
        NewMessageEventDto newMessageEventDtoNewInstance = declaredConstructor.newInstance(str, exactDate, downstreamUserDto, str2, num4, downstreamChannelCustomDto, str3, str4, downstreamMessageDto, num, num2, num3, num5, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(newMessageEventDtoNewInstance, "newInstance(...)");
        return newMessageEventDtoNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, NewMessageEventDto value_) {
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
        writer.mo94373x("channel_member_count");
        this.nullableIntAdapter.toJson(writer, value_.getChannel_member_count());
        writer.mo94373x("channel_custom");
        this.nullableDownstreamChannelCustomDtoAdapter.toJson(writer, value_.getChannel_custom());
        writer.mo94373x("channel_type");
        this.stringAdapter.toJson(writer, value_.getChannel_type());
        writer.mo94373x("channel_id");
        this.stringAdapter.toJson(writer, value_.getChannel_id());
        writer.mo94373x("message");
        this.downstreamMessageDtoAdapter.toJson(writer, value_.getMessage());
        writer.mo94373x("watcher_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWatcher_count()));
        writer.mo94373x("total_unread_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getTotal_unread_count()));
        writer.mo94373x("unread_channels");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_channels()));
        writer.mo94373x("channel_message_count");
        this.nullableIntAdapter.toJson(writer, value_.getChannel_message_count());
        writer.mo94370m();
    }
}
