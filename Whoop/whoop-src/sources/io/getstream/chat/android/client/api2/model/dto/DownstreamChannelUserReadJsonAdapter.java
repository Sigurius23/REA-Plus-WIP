package io.getstream.chat.android.client.api2.model.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserReadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "downstreamUserDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "dateAdapter", "", "intAdapter", "nullableStringAdapter", "nullableDateAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamChannelUserReadJsonAdapter extends JsonAdapter<DownstreamChannelUserRead> {
    private volatile Constructor<DownstreamChannelUserRead> constructorRef;
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<DownstreamUserDto> downstreamUserDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public DownstreamChannelUserReadJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a(UserState.Sources.USER, "last_read", "unread_messages", "last_read_message_id", "last_delivered_at", "last_delivered_message_id");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.downstreamUserDtoAdapter = moshi.m94400c(DownstreamUserDto.class, c25235a0, UserState.Sources.USER);
        this.dateAdapter = moshi.m94400c(Date.class, c25235a0, "last_read");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "unread_messages");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "last_read_message_id");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "last_delivered_at");
    }

    public String toString() {
        return AbstractC36095b.m114677e(47, "GeneratedJsonAdapter(DownstreamChannelUserRead)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamChannelUserRead fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        DownstreamUserDto downstreamUserDto = null;
        Date date = null;
        Integer num = null;
        String str = null;
        Date date2 = null;
        String str2 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    downstreamUserDto = (DownstreamUserDto) this.downstreamUserDtoAdapter.fromJson(reader);
                    if (downstreamUserDto == null) {
                        throw AbstractC31885f.m99135m(UserState.Sources.USER, UserState.Sources.USER, reader);
                    }
                    break;
                    break;
                case 1:
                    date = (Date) this.dateAdapter.fromJson(reader);
                    if (date == null) {
                        throw AbstractC31885f.m99135m("last_read", "last_read", reader);
                    }
                    break;
                    break;
                case 2:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("unread_messages", "unread_messages", reader);
                    }
                    break;
                    break;
                case 3:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    date2 = (Date) this.nullableDateAdapter.fromJson(reader);
                    i13 &= -17;
                    break;
                case 5:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i13 == -49) {
            Integer num2 = num;
            Date date3 = date;
            DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
            if (downstreamUserDto2 == null) {
                throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
            }
            if (date3 == null) {
                throw AbstractC31885f.m99129g("last_read", "last_read", reader);
            }
            if (num2 == null) {
                throw AbstractC31885f.m99129g("unread_messages", "unread_messages", reader);
            }
            String str3 = str2;
            return new DownstreamChannelUserRead(downstreamUserDto2, date3, num2.intValue(), str, date2, str3);
        }
        Integer num3 = num;
        Date date4 = date;
        DownstreamUserDto downstreamUserDto3 = downstreamUserDto;
        String str4 = str2;
        Date date5 = date2;
        String str5 = str;
        Constructor<DownstreamChannelUserRead> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = AbstractC31885f.f132392c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = DownstreamChannelUserRead.class.getDeclaredConstructor(DownstreamUserDto.class, Date.class, cls2, String.class, Date.class, String.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        Constructor<DownstreamChannelUserRead> constructor = declaredConstructor;
        if (downstreamUserDto3 == null) {
            throw AbstractC31885f.m99129g(UserState.Sources.USER, UserState.Sources.USER, reader);
        }
        if (date4 == null) {
            throw AbstractC31885f.m99129g("last_read", "last_read", reader);
        }
        if (num3 == null) {
            throw AbstractC31885f.m99129g("unread_messages", "unread_messages", reader);
        }
        DownstreamChannelUserRead downstreamChannelUserReadNewInstance = constructor.newInstance(downstreamUserDto3, date4, num3, str5, date5, str4, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(downstreamChannelUserReadNewInstance, "newInstance(...)");
        return downstreamChannelUserReadNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamChannelUserRead value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x(UserState.Sources.USER);
        this.downstreamUserDtoAdapter.toJson(writer, value_.getUser());
        writer.mo94373x("last_read");
        this.dateAdapter.toJson(writer, value_.getLast_read());
        writer.mo94373x("unread_messages");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnread_messages()));
        writer.mo94373x("last_read_message_id");
        this.nullableStringAdapter.toJson(writer, value_.getLast_read_message_id());
        writer.mo94373x("last_delivered_at");
        this.nullableDateAdapter.toJson(writer, value_.getLast_delivered_at());
        writer.mo94373x("last_delivered_message_id");
        this.nullableStringAdapter.toJson(writer, value_.getLast_delivered_message_id());
        writer.mo94370m();
    }
}
