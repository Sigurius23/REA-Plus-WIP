package io.getstream.chat.android.client.api2.model.dto;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UnreadDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;)V", "Lqx/v;", "options", "Lqx/v;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableMapOfStringIntAdapter", "", "Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelDto;", "listOfUnreadChannelDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UnreadThreadDto;", "listOfUnreadThreadDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelByTypeDto;", "listOfUnreadChannelByTypeDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UnreadDtoJsonAdapter extends JsonAdapter<UnreadDto> {
    private volatile Constructor<UnreadDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<UnreadChannelByTypeDto>> listOfUnreadChannelByTypeDtoAdapter;
    private final JsonAdapter<List<UnreadChannelDto>> listOfUnreadChannelDtoAdapter;
    private final JsonAdapter<List<UnreadThreadDto>> listOfUnreadThreadDtoAdapter;
    private final JsonAdapter<Map<String, Integer>> nullableMapOfStringIntAdapter;
    private final C30740v options;

    public UnreadDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("total_unread_count", "total_unread_threads_count", "total_unread_count_by_team", "channels", "threads", "channel_type");
        Class cls = Integer.TYPE;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.intAdapter = moshi.m94400c(cls, c25235a0, "total_unread_count");
        this.nullableMapOfStringIntAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Integer.class), c25235a0, "total_unread_count_by_team");
        this.listOfUnreadChannelDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, UnreadChannelDto.class), c25235a0, "channels");
        this.listOfUnreadThreadDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, UnreadThreadDto.class), c25235a0, "threads");
        this.listOfUnreadChannelByTypeDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, UnreadChannelByTypeDto.class), c25235a0, "channel_type");
    }

    public String toString() {
        return AbstractC36095b.m114677e(31, "GeneratedJsonAdapter(UnreadDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UnreadDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        Integer num = 0;
        Integer num2 = null;
        Map map = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("total_unread_count", "total_unread_count", reader);
                    }
                    i13 &= -2;
                    break;
                    break;
                case 1:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("total_unread_threads_count", "total_unread_threads_count", reader);
                    }
                    i13 &= -3;
                    break;
                    break;
                case 2:
                    map = (Map) this.nullableMapOfStringIntAdapter.fromJson(reader);
                    i13 &= -5;
                    break;
                case 3:
                    list = (List) this.listOfUnreadChannelDtoAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("channels", "channels", reader);
                    }
                    i13 &= -9;
                    break;
                    break;
                case 4:
                    list2 = (List) this.listOfUnreadThreadDtoAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw AbstractC31885f.m99135m("threads", "threads", reader);
                    }
                    i13 &= -17;
                    break;
                    break;
                case 5:
                    list3 = (List) this.listOfUnreadChannelByTypeDtoAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw AbstractC31885f.m99135m("channel_type", "channel_type", reader);
                    }
                    i13 &= -33;
                    break;
                    break;
            }
        }
        reader.endObject();
        if (i13 == -64) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            AbstractC22676k.m65748h(list, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.UnreadChannelDto>");
            AbstractC22676k.m65748h(list2, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.UnreadThreadDto>");
            AbstractC22676k.m65748h(list3, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.UnreadChannelByTypeDto>");
            return new UnreadDto(iIntValue, iIntValue2, map, list, list2, list3);
        }
        Map map2 = map;
        Constructor<UnreadDto> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = AbstractC31885f.f132392c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = UnreadDto.class.getDeclaredConstructor(cls2, cls2, Map.class, List.class, List.class, List.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        UnreadDto unreadDtoNewInstance = declaredConstructor.newInstance(num, num2, map2, list, list2, list3, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(unreadDtoNewInstance, "newInstance(...)");
        return unreadDtoNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, UnreadDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("total_unread_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getTotal_unread_count()));
        writer.mo94373x("total_unread_threads_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getTotal_unread_threads_count()));
        writer.mo94373x("total_unread_count_by_team");
        this.nullableMapOfStringIntAdapter.toJson(writer, value_.getTotal_unread_count_by_team());
        writer.mo94373x("channels");
        this.listOfUnreadChannelDtoAdapter.toJson(writer, value_.getChannels());
        writer.mo94373x("threads");
        this.listOfUnreadThreadDtoAdapter.toJson(writer, value_.getThreads());
        writer.mo94373x("channel_type");
        this.listOfUnreadChannelByTypeDtoAdapter.toJson(writer, value_.getChannel_type());
        writer.mo94370m();
    }
}
