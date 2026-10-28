package io.getstream.chat.android.client.api2.model.dto;

import androidx.core.app.NotificationCompat;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "nullableListOfAttachmentDtoAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "nullableListOfDownstreamUserDtoAdapter", "", "booleanAdapter", "", "", "nullableMapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamDraftMessageDtoJsonAdapter extends JsonAdapter<DownstreamDraftMessageDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DownstreamDraftMessageDto> constructorRef;
    private final JsonAdapter<List<AttachmentDto>> nullableListOfAttachmentDtoAdapter;
    private final JsonAdapter<List<DownstreamUserDto>> nullableListOfDownstreamUserDtoAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamDraftMessageDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("id", "text", "command", "args", "attachments", "mentioned_users", NotificationCompat.GROUP_KEY_SILENT, "show_in_channel", "extraData");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "id");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "command");
        this.nullableListOfAttachmentDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, AttachmentDto.class), c25235a0, "attachments");
        this.nullableListOfDownstreamUserDtoAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, DownstreamUserDto.class), c25235a0, "mentioned_users");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, NotificationCompat.GROUP_KEY_SILENT);
        this.nullableMapOfStringAnyAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, Object.class), c25235a0, "extraData");
    }

    public String toString() {
        return AbstractC36095b.m114677e(47, "GeneratedJsonAdapter(DownstreamDraftMessageDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamDraftMessageDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        String str = null;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        Map map = null;
        int i13 = -1;
        String str4 = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m("id", "id", reader);
                    }
                    break;
                    break;
                case 1:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("text", "text", reader);
                    }
                    break;
                    break;
                case 2:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -5;
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    i13 &= -9;
                    break;
                case 4:
                    list = (List) this.nullableListOfAttachmentDtoAdapter.fromJson(reader);
                    i13 &= -17;
                    break;
                case 5:
                    list2 = (List) this.nullableListOfDownstreamUserDtoAdapter.fromJson(reader);
                    i13 &= -33;
                    break;
                case 6:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw AbstractC31885f.m99135m(NotificationCompat.GROUP_KEY_SILENT, NotificationCompat.GROUP_KEY_SILENT, reader);
                    }
                    i13 &= -65;
                    break;
                    break;
                case 7:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw AbstractC31885f.m99135m("show_in_channel", "show_in_channel", reader);
                    }
                    i13 &= -129;
                    break;
                    break;
                case 8:
                    map = (Map) this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    i13 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i13 == -509) {
            if (str2 == null) {
                throw AbstractC31885f.m99129g("id", "id", reader);
            }
            if (str != null) {
                return new DownstreamDraftMessageDto(str2, str, str4, str3, list, list2, bool2.booleanValue(), bool3.booleanValue(), map);
            }
            throw AbstractC31885f.m99129g("text", "text", reader);
        }
        Constructor<DownstreamDraftMessageDto> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = AbstractC31885f.f132392c;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = DownstreamDraftMessageDto.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, List.class, List.class, cls3, cls3, Map.class, cls, cls2);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (str2 == null) {
            throw AbstractC31885f.m99129g("id", "id", reader);
        }
        if (str == null) {
            throw AbstractC31885f.m99129g("text", "text", reader);
        }
        Map map2 = map;
        DownstreamDraftMessageDto downstreamDraftMessageDtoNewInstance = declaredConstructor.newInstance(str2, str, str4, str3, list, list2, bool2, bool3, map2, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(downstreamDraftMessageDtoNewInstance, "newInstance(...)");
        return downstreamDraftMessageDtoNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamDraftMessageDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.mo94373x("text");
        this.stringAdapter.toJson(writer, value_.getText());
        writer.mo94373x("command");
        this.nullableStringAdapter.toJson(writer, value_.getCommand());
        writer.mo94373x("args");
        this.nullableStringAdapter.toJson(writer, value_.getArgs());
        writer.mo94373x("attachments");
        this.nullableListOfAttachmentDtoAdapter.toJson(writer, value_.getAttachments());
        writer.mo94373x("mentioned_users");
        this.nullableListOfDownstreamUserDtoAdapter.toJson(writer, value_.getMentioned_users());
        writer.mo94373x(NotificationCompat.GROUP_KEY_SILENT);
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSilent()));
        writer.mo94373x("show_in_channel");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getShow_in_channel()));
        writer.mo94373x("extraData");
        this.nullableMapOfStringAnyAdapter.toJson(writer, value_.getExtraData());
        writer.mo94370m();
    }
}
