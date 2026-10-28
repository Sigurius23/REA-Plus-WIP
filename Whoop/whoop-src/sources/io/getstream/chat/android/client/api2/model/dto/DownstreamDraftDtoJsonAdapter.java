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
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;", "downstreamDraftMessageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "nullableDownstreamMessageDtoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DownstreamDraftDtoJsonAdapter extends JsonAdapter<DownstreamDraftDto> {
    private volatile Constructor<DownstreamDraftDto> constructorRef;
    private final JsonAdapter<DownstreamDraftMessageDto> downstreamDraftMessageDtoAdapter;
    private final JsonAdapter<DownstreamMessageDto> nullableDownstreamMessageDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public DownstreamDraftDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("message", "channel_cid", "quoted_message", "parent_id", "parent_message");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.downstreamDraftMessageDtoAdapter = moshi.m94400c(DownstreamDraftMessageDto.class, c25235a0, "message");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "channel_cid");
        this.nullableDownstreamMessageDtoAdapter = moshi.m94400c(DownstreamMessageDto.class, c25235a0, "quoted_message");
        this.nullableStringAdapter = moshi.m94400c(String.class, c25235a0, "parent_id");
    }

    public String toString() {
        return AbstractC36095b.m114677e(40, "GeneratedJsonAdapter(DownstreamDraftDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DownstreamDraftDto fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        DownstreamDraftMessageDto downstreamDraftMessageDto = null;
        String str = null;
        DownstreamMessageDto downstreamMessageDto = null;
        String str2 = null;
        DownstreamMessageDto downstreamMessageDto2 = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                downstreamDraftMessageDto = (DownstreamDraftMessageDto) this.downstreamDraftMessageDtoAdapter.fromJson(reader);
                if (downstreamDraftMessageDto == null) {
                    throw AbstractC31885f.m99135m("message", "message", reader);
                }
            } else if (iMo16725T == 1) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw AbstractC31885f.m99135m("channel_cid", "channel_cid", reader);
                }
            } else if (iMo16725T == 2) {
                downstreamMessageDto = (DownstreamMessageDto) this.nullableDownstreamMessageDtoAdapter.fromJson(reader);
                i13 &= -5;
            } else if (iMo16725T == 3) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
                i13 &= -9;
            } else if (iMo16725T == 4) {
                downstreamMessageDto2 = (DownstreamMessageDto) this.nullableDownstreamMessageDtoAdapter.fromJson(reader);
                i13 &= -17;
            }
        }
        reader.endObject();
        if (i13 == -29) {
            DownstreamMessageDto downstreamMessageDto3 = downstreamMessageDto2;
            String str3 = str2;
            DownstreamMessageDto downstreamMessageDto4 = downstreamMessageDto;
            String str4 = str;
            DownstreamDraftMessageDto downstreamDraftMessageDto2 = downstreamDraftMessageDto;
            if (downstreamDraftMessageDto2 == null) {
                throw AbstractC31885f.m99129g("message", "message", reader);
            }
            if (str4 != null) {
                return new DownstreamDraftDto(downstreamDraftMessageDto2, str4, downstreamMessageDto4, str3, downstreamMessageDto3);
            }
            throw AbstractC31885f.m99129g("channel_cid", "channel_cid", reader);
        }
        DownstreamMessageDto downstreamMessageDto5 = downstreamMessageDto2;
        String str5 = str2;
        DownstreamMessageDto downstreamMessageDto6 = downstreamMessageDto;
        String str6 = str;
        DownstreamDraftMessageDto downstreamDraftMessageDto3 = downstreamDraftMessageDto;
        Constructor<DownstreamDraftDto> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = DownstreamDraftDto.class.getDeclaredConstructor(DownstreamDraftMessageDto.class, String.class, DownstreamMessageDto.class, String.class, DownstreamMessageDto.class, Integer.TYPE, AbstractC31885f.f132392c);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (downstreamDraftMessageDto3 == null) {
            throw AbstractC31885f.m99129g("message", "message", reader);
        }
        if (str6 == null) {
            throw AbstractC31885f.m99129g("channel_cid", "channel_cid", reader);
        }
        DownstreamDraftDto downstreamDraftDtoNewInstance = declaredConstructor.newInstance(downstreamDraftMessageDto3, str6, downstreamMessageDto6, str5, downstreamMessageDto5, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(downstreamDraftDtoNewInstance, "newInstance(...)");
        return downstreamDraftDtoNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, DownstreamDraftDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("message");
        this.downstreamDraftMessageDtoAdapter.toJson(writer, value_.getMessage());
        writer.mo94373x("channel_cid");
        this.stringAdapter.toJson(writer, value_.getChannel_cid());
        writer.mo94373x("quoted_message");
        this.nullableDownstreamMessageDtoAdapter.toJson(writer, value_.getQuoted_message());
        writer.mo94373x("parent_id");
        this.nullableStringAdapter.toJson(writer, value_.getParent_id());
        writer.mo94373x("parent_message");
        this.nullableDownstreamMessageDtoAdapter.toJson(writer, value_.getParent_message());
        writer.mo94370m();
    }
}
