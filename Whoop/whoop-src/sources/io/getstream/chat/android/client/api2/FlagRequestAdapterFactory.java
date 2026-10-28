package io.getstream.chat.android.client.api2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.api2.model.requests.FlagMessageRequest;
import io.getstream.chat.android.client.api2.model.requests.FlagRequest;
import io.getstream.chat.android.client.api2.model.requests.FlagUserRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.InterfaceC30735s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/FlagRequestAdapterFactory;", "Lqx/s;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lqx/l0;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lqx/l0;)Lcom/squareup/moshi/JsonAdapter;", "FlagRequestAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FlagRequestAdapterFactory implements InterfaceC30735s {
    public static final FlagRequestAdapterFactory INSTANCE = new FlagRequestAdapterFactory();

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/FlagRequestAdapterFactory$FlagRequestAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/requests/FlagRequest;)V", "Lqx/l0;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class FlagRequestAdapter extends JsonAdapter<FlagRequest> {
        private final C30722l0 moshi;

        public FlagRequestAdapter(C30722l0 moshi) {
            AbstractC22676k.m65750j(moshi, "moshi");
            this.moshi = moshi;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) {
            fromJson(jsonReader);
            return null;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final FlagRequest fromJson(JsonReader reader) {
            AbstractC22676k.m65750j(reader, "reader");
            reader.m16724J();
            return null;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(AbstractC30704c0 writer, FlagRequest value) {
            AbstractC22676k.m65750j(writer, "writer");
            if (value instanceof FlagMessageRequest) {
                this.moshi.m94398a(FlagMessageRequest.class).toJson(writer, value);
            } else if (value instanceof FlagUserRequest) {
                this.moshi.m94398a(FlagUserRequest.class).toJson(writer, value);
            }
        }
    }

    private FlagRequestAdapterFactory() {
    }

    @Override // p441qx.InterfaceC30735s
    public final JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, C30722l0 moshi) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(moshi, "moshi");
        if (type.equals(FlagRequest.class)) {
            return new FlagRequestAdapter(moshi);
        }
        return null;
    }
}
