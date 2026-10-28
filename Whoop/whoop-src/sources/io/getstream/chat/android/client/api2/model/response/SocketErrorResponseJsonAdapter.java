package io.getstream.chat.android.client.api2.model.response;

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
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;", "nullableErrorResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SocketErrorResponseJsonAdapter extends JsonAdapter<SocketErrorResponse> {
    private volatile Constructor<SocketErrorResponse> constructorRef;
    private final JsonAdapter<SocketErrorResponse.ErrorResponse> nullableErrorResponseAdapter;
    private final C30740v options;

    public SocketErrorResponseJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("error");
        this.nullableErrorResponseAdapter = moshi.m94400c(SocketErrorResponse.ErrorResponse.class, C25235a0.f99113w, "error");
    }

    public String toString() {
        return AbstractC36095b.m114677e(41, "GeneratedJsonAdapter(SocketErrorResponse)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SocketErrorResponse fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        SocketErrorResponse.ErrorResponse errorResponse = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                errorResponse = (SocketErrorResponse.ErrorResponse) this.nullableErrorResponseAdapter.fromJson(reader);
                i13 = -2;
            }
        }
        reader.endObject();
        if (i13 == -2) {
            return new SocketErrorResponse(errorResponse);
        }
        Constructor<SocketErrorResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = SocketErrorResponse.class.getDeclaredConstructor(SocketErrorResponse.ErrorResponse.class, Integer.TYPE, AbstractC31885f.f132392c);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        SocketErrorResponse socketErrorResponseNewInstance = declaredConstructor.newInstance(errorResponse, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(socketErrorResponseNewInstance, "newInstance(...)");
        return socketErrorResponseNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, SocketErrorResponse value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("error");
        this.nullableErrorResponseAdapter.toJson(writer, value_.getError());
        writer.mo94370m();
    }
}
