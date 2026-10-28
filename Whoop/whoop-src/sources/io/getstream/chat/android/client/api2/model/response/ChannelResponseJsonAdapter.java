package io.getstream.chat.android.client.api2.model.response;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelUserRead;
import io.getstream.chat.android.client.api2.model.dto.DownstreamDraftDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPendingMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamPushPreferenceDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/ChannelResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/ChannelResponse;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "downstreamChannelDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "listOfDownstreamMessageDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPendingMessageDto;", "listOfDownstreamPendingMessageDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;", "nullableDownstreamPushPreferenceDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;", "listOfDownstreamMemberDtoAdapter", "nullableDownstreamMemberDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "listOfDownstreamUserDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;", "listOfDownstreamChannelUserReadAdapter", "", "intAdapter", "", "nullableBooleanAdapter", "Ljava/util/Date;", "nullableDateAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "nullableDownstreamDraftDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelResponseJsonAdapter extends JsonAdapter<ChannelResponse> {
    private volatile Constructor<ChannelResponse> constructorRef;
    private final JsonAdapter<DownstreamChannelDto> downstreamChannelDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<DownstreamChannelUserRead>> listOfDownstreamChannelUserReadAdapter;
    private final JsonAdapter<List<DownstreamMemberDto>> listOfDownstreamMemberDtoAdapter;
    private final JsonAdapter<List<DownstreamMessageDto>> listOfDownstreamMessageDtoAdapter;
    private final JsonAdapter<List<DownstreamPendingMessageDto>> listOfDownstreamPendingMessageDtoAdapter;
    private final JsonAdapter<List<DownstreamUserDto>> listOfDownstreamUserDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<DownstreamDraftDto> nullableDownstreamDraftDtoAdapter;
    private final JsonAdapter<DownstreamMemberDto> nullableDownstreamMemberDtoAdapter;
    private final JsonAdapter<DownstreamPushPreferenceDto> nullableDownstreamPushPreferenceDtoAdapter;
    private final C30740v options;

    public ChannelResponseJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("channel", "messages", "pending_messages", "pinned_messages", "push_preferences", QueryChannelRequest.KEY_MEMBERS, "membership", "watchers", "read", "watcher_count", "hidden", "hide_messages_before", "draft");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.downstreamChannelDtoAdapter = moshi.m94400c(DownstreamChannelDto.class, c25235a0, "channel");
        this.listOfDownstreamMessageDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamMessageDto.class), c25235a0, "messages");
        this.listOfDownstreamPendingMessageDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamPendingMessageDto.class), c25235a0, "pending_messages");
        this.nullableDownstreamPushPreferenceDtoAdapter = moshi.m94400c(DownstreamPushPreferenceDto.class, c25235a0, "push_preferences");
        this.listOfDownstreamMemberDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamMemberDto.class), c25235a0, QueryChannelRequest.KEY_MEMBERS);
        this.nullableDownstreamMemberDtoAdapter = moshi.m94400c(DownstreamMemberDto.class, c25235a0, "membership");
        this.listOfDownstreamUserDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamUserDto.class), c25235a0, "watchers");
        this.listOfDownstreamChannelUserReadAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamChannelUserRead.class), c25235a0, "read");
        this.intAdapter = moshi.m94400c(Integer.TYPE, c25235a0, "watcher_count");
        this.nullableBooleanAdapter = moshi.m94400c(Boolean.class, c25235a0, "hidden");
        this.nullableDateAdapter = moshi.m94400c(Date.class, c25235a0, "hide_messages_before");
        this.nullableDownstreamDraftDtoAdapter = moshi.m94400c(DownstreamDraftDto.class, c25235a0, "draft");
    }

    public String toString() {
        return AbstractC36095b.m114677e(37, "GeneratedJsonAdapter(ChannelResponse)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ChannelResponse fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        Integer num = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        Boolean bool = null;
        DownstreamChannelDto downstreamChannelDto = null;
        DownstreamDraftDto downstreamDraftDto = null;
        DownstreamPushPreferenceDto downstreamPushPreferenceDto = null;
        DownstreamMemberDto downstreamMemberDto = null;
        Date date = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    downstreamChannelDto = (DownstreamChannelDto) this.downstreamChannelDtoAdapter.fromJson(reader);
                    if (downstreamChannelDto == null) {
                        throw AbstractC31885f.m99135m("channel", "channel", reader);
                    }
                    break;
                    break;
                case 1:
                    list = (List) this.listOfDownstreamMessageDtoAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("messages", "messages", reader);
                    }
                    i13 &= -3;
                    break;
                    break;
                case 2:
                    list2 = (List) this.listOfDownstreamPendingMessageDtoAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw AbstractC31885f.m99135m("pending_messages", "pending_messages", reader);
                    }
                    i13 &= -5;
                    break;
                    break;
                case 3:
                    list3 = (List) this.listOfDownstreamMessageDtoAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw AbstractC31885f.m99135m("pinned_messages", "pinned_messages", reader);
                    }
                    i13 &= -9;
                    break;
                    break;
                case 4:
                    downstreamPushPreferenceDto = (DownstreamPushPreferenceDto) this.nullableDownstreamPushPreferenceDtoAdapter.fromJson(reader);
                    i13 &= -17;
                    break;
                case 5:
                    list4 = (List) this.listOfDownstreamMemberDtoAdapter.fromJson(reader);
                    if (list4 == null) {
                        throw AbstractC31885f.m99135m(QueryChannelRequest.KEY_MEMBERS, QueryChannelRequest.KEY_MEMBERS, reader);
                    }
                    i13 &= -33;
                    break;
                    break;
                case 6:
                    downstreamMemberDto = (DownstreamMemberDto) this.nullableDownstreamMemberDtoAdapter.fromJson(reader);
                    break;
                case 7:
                    list5 = (List) this.listOfDownstreamUserDtoAdapter.fromJson(reader);
                    if (list5 == null) {
                        throw AbstractC31885f.m99135m("watchers", "watchers", reader);
                    }
                    i13 &= -129;
                    break;
                    break;
                case 8:
                    list6 = (List) this.listOfDownstreamChannelUserReadAdapter.fromJson(reader);
                    if (list6 == null) {
                        throw AbstractC31885f.m99135m("read", "read", reader);
                    }
                    i13 &= -257;
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
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 11:
                    date = (Date) this.nullableDateAdapter.fromJson(reader);
                    break;
                case 12:
                    downstreamDraftDto = (DownstreamDraftDto) this.nullableDownstreamDraftDtoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i13 == -959) {
            Boolean bool2 = bool;
            if (downstreamChannelDto == null) {
                throw AbstractC31885f.m99129g("channel", "channel", reader);
            }
            AbstractC22676k.m65748h(list, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto>");
            AbstractC22676k.m65748h(list2, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamPendingMessageDto>");
            AbstractC22676k.m65748h(list3, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto>");
            AbstractC22676k.m65748h(list4, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamMemberDto>");
            AbstractC22676k.m65748h(list5, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto>");
            AbstractC22676k.m65748h(list6, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamChannelUserRead>");
            return new ChannelResponse(downstreamChannelDto, list, list2, list3, downstreamPushPreferenceDto, list4, downstreamMemberDto, list5, list6, num.intValue(), bool2, date, downstreamDraftDto);
        }
        List list7 = list2;
        List list8 = list3;
        List list9 = list4;
        List list10 = list5;
        List list11 = list6;
        Boolean bool3 = bool;
        DownstreamDraftDto downstreamDraftDto2 = downstreamDraftDto;
        List list12 = list;
        Constructor<ChannelResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = AbstractC31885f.f132392c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = ChannelResponse.class.getDeclaredConstructor(DownstreamChannelDto.class, List.class, List.class, List.class, DownstreamPushPreferenceDto.class, List.class, DownstreamMemberDto.class, List.class, List.class, cls2, Boolean.class, Date.class, DownstreamDraftDto.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (downstreamChannelDto == null) {
            throw AbstractC31885f.m99129g("channel", "channel", reader);
        }
        ChannelResponse channelResponseNewInstance = declaredConstructor.newInstance(downstreamChannelDto, list12, list7, list8, downstreamPushPreferenceDto, list9, downstreamMemberDto, list10, list11, num, bool3, date, downstreamDraftDto2, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(channelResponseNewInstance, "newInstance(...)");
        return channelResponseNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, ChannelResponse value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("channel");
        this.downstreamChannelDtoAdapter.toJson(writer, value_.getChannel());
        writer.mo94373x("messages");
        this.listOfDownstreamMessageDtoAdapter.toJson(writer, value_.getMessages());
        writer.mo94373x("pending_messages");
        this.listOfDownstreamPendingMessageDtoAdapter.toJson(writer, value_.getPending_messages());
        writer.mo94373x("pinned_messages");
        this.listOfDownstreamMessageDtoAdapter.toJson(writer, value_.getPinned_messages());
        writer.mo94373x("push_preferences");
        this.nullableDownstreamPushPreferenceDtoAdapter.toJson(writer, value_.getPush_preferences());
        writer.mo94373x(QueryChannelRequest.KEY_MEMBERS);
        this.listOfDownstreamMemberDtoAdapter.toJson(writer, value_.getMembers());
        writer.mo94373x("membership");
        this.nullableDownstreamMemberDtoAdapter.toJson(writer, value_.getMembership());
        writer.mo94373x("watchers");
        this.listOfDownstreamUserDtoAdapter.toJson(writer, value_.getWatchers());
        writer.mo94373x("read");
        this.listOfDownstreamChannelUserReadAdapter.toJson(writer, value_.getRead());
        writer.mo94373x("watcher_count");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWatcher_count()));
        writer.mo94373x("hidden");
        this.nullableBooleanAdapter.toJson(writer, value_.getHidden());
        writer.mo94373x("hide_messages_before");
        this.nullableDateAdapter.toJson(writer, value_.getHide_messages_before());
        writer.mo94373x("draft");
        this.nullableDownstreamDraftDtoAdapter.toJson(writer, value_.getDraft());
        writer.mo94370m();
    }
}
