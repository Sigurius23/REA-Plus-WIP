package io.getstream.chat.android.client.api2.model.requests;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMessageDto;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "upstreamMessageDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UpdateMessageRequestJsonAdapter extends JsonAdapter<UpdateMessageRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<UpdateMessageRequest> constructorRef;
    private final C30740v options;
    private final JsonAdapter<UpstreamMessageDto> upstreamMessageDtoAdapter;

    public UpdateMessageRequestJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("message", "skip_enrich_url", "skip_push");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.upstreamMessageDtoAdapter = moshi.m94400c(UpstreamMessageDto.class, c25235a0, "message");
        this.booleanAdapter = moshi.m94400c(Boolean.TYPE, c25235a0, "skip_enrich_url");
    }

    public String toString() {
        return AbstractC36095b.m114677e(42, "GeneratedJsonAdapter(UpdateMessageRequest)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UpdateMessageRequest fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        UpstreamMessageDto upstreamMessageDto = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                upstreamMessageDto = (UpstreamMessageDto) this.upstreamMessageDtoAdapter.fromJson(reader);
                if (upstreamMessageDto == null) {
                    throw AbstractC31885f.m99135m("message", "message", reader);
                }
            } else if (iMo16725T == 1) {
                bool = (Boolean) this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw AbstractC31885f.m99135m("skip_enrich_url", "skip_enrich_url", reader);
                }
                i13 &= -3;
            } else if (iMo16725T == 2) {
                bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw AbstractC31885f.m99135m("skip_push", "skip_push", reader);
                }
                i13 &= -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i13 == -7) {
            if (upstreamMessageDto != null) {
                return new UpdateMessageRequest(upstreamMessageDto, bool.booleanValue(), bool2.booleanValue());
            }
            throw AbstractC31885f.m99129g("message", "message", reader);
        }
        Constructor<UpdateMessageRequest> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = AbstractC31885f.f132392c;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = UpdateMessageRequest.class.getDeclaredConstructor(UpstreamMessageDto.class, cls3, cls3, cls, cls2);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        if (upstreamMessageDto == null) {
            throw AbstractC31885f.m99129g("message", "message", reader);
        }
        UpdateMessageRequest updateMessageRequestNewInstance = declaredConstructor.newInstance(upstreamMessageDto, bool, bool2, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(updateMessageRequestNewInstance, "newInstance(...)");
        return updateMessageRequestNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, UpdateMessageRequest value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("message");
        this.upstreamMessageDtoAdapter.toJson(writer, value_.getMessage());
        writer.mo94373x("skip_enrich_url");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSkip_enrich_url()));
        writer.mo94373x("skip_push");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSkip_push()));
        writer.mo94370m();
    }
}
