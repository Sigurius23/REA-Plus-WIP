package io.getstream.chat.android.client.api2.model.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
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
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;)V", "Lqx/v;", "options", "Lqx/v;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoDtoJsonAdapter extends JsonAdapter<ChannelInfoDto> {
    private volatile Constructor<ChannelInfoDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;

    public ChannelInfoDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("cid", "id", "member_count", "name", "type", "image");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "cid");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "member_count");
    }

    public String toString() {
        return AbstractC36095b.m114677e(36, "GeneratedJsonAdapter(ChannelInfoDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ChannelInfoDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        Integer num = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("member_count", "member_count", reader);
                    }
                    i13 = -5;
                    break;
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i13 == -5) {
            return new ChannelInfoDto(str, str2, num.intValue(), str3, str4, str5);
        }
        String str6 = str3;
        Constructor<ChannelInfoDto> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = AbstractC31885f.f132392c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = ChannelInfoDto.class.getDeclaredConstructor(String.class, String.class, cls2, String.class, String.class, String.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        ChannelInfoDto channelInfoDtoNewInstance = declaredConstructor.newInstance(str, str2, num, str6, str4, str5, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(channelInfoDtoNewInstance, "newInstance(...)");
        return channelInfoDtoNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, ChannelInfoDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("cid");
        this.nullableStringAdapter.toJson(writer, value_.getCid());
        writer.mo94373x("id");
        this.nullableStringAdapter.toJson(writer, value_.getId());
        writer.mo94373x("member_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getMember_count()));
        writer.mo94373x("name");
        this.nullableStringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("type");
        this.nullableStringAdapter.toJson(writer, value_.getType());
        writer.mo94373x("image");
        this.nullableStringAdapter.toJson(writer, value_.getImage());
        writer.mo94370m();
    }
}
