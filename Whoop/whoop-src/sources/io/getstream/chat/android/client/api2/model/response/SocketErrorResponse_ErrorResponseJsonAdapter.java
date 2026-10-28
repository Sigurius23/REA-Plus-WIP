package io.getstream.chat.android.client.api2.model.response;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
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
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse_ErrorResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)V", "Lqx/v;", "options", "Lqx/v;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "mapOfStringStringAdapter", "", "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse$ErrorDetail;", "listOfErrorDetailAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SocketErrorResponse_ErrorResponseJsonAdapter extends JsonAdapter<SocketErrorResponse.ErrorResponse> {
    private volatile Constructor<SocketErrorResponse.ErrorResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<SocketErrorResponse.ErrorResponse.ErrorDetail>> listOfErrorDetailAdapter;
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public SocketErrorResponse_ErrorResponseJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("code", "message", "StatusCode", AttachmentExtensionsKt.EXTRA_DURATION, "exception_fields", "more_info", "details");
        Class cls = Integer.TYPE;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.intAdapter = moshi.m94400c(cls, c25235a0, "code");
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "message");
        this.mapOfStringStringAdapter = moshi.m94400c(AbstractC1772c1.m5369F(Map.class, String.class, String.class), c25235a0, "exception_fields");
        this.listOfErrorDetailAdapter = moshi.m94400c(AbstractC1772c1.m5369F(List.class, SocketErrorResponse.ErrorResponse.ErrorDetail.class), c25235a0, "details");
    }

    public String toString() {
        return AbstractC36095b.m114677e(55, "GeneratedJsonAdapter(SocketErrorResponse.ErrorResponse)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SocketErrorResponse.ErrorResponse fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        Integer num = 0;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        Map map = null;
        String str3 = null;
        List list = null;
        while (reader.hasNext()) {
            switch (reader.mo16725T(this.options)) {
                case -1:
                    reader.mo16728b0();
                    reader.skipValue();
                    break;
                case 0:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC31885f.m99135m("code", "code", reader);
                    }
                    i13 &= -2;
                    break;
                    break;
                case 1:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC31885f.m99135m("message", "message", reader);
                    }
                    i13 &= -3;
                    break;
                    break;
                case 2:
                    num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw AbstractC31885f.m99135m("StatusCode", "StatusCode", reader);
                    }
                    i13 &= -5;
                    break;
                    break;
                case 3:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC31885f.m99135m(AttachmentExtensionsKt.EXTRA_DURATION, AttachmentExtensionsKt.EXTRA_DURATION, reader);
                    }
                    i13 &= -9;
                    break;
                    break;
                case 4:
                    map = (Map) this.mapOfStringStringAdapter.fromJson(reader);
                    if (map == null) {
                        throw AbstractC31885f.m99135m("exception_fields", "exception_fields", reader);
                    }
                    i13 &= -17;
                    break;
                    break;
                case 5:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC31885f.m99135m("more_info", "more_info", reader);
                    }
                    i13 &= -33;
                    break;
                    break;
                case 6:
                    list = (List) this.listOfErrorDetailAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC31885f.m99135m("details", "details", reader);
                    }
                    i13 &= -65;
                    break;
                    break;
            }
        }
        reader.endObject();
        if (i13 == -128) {
            int iIntValue = num.intValue();
            AbstractC22676k.m65748h(str, "null cannot be cast to non-null type kotlin.String");
            int iIntValue2 = num2.intValue();
            AbstractC22676k.m65748h(str2, "null cannot be cast to non-null type kotlin.String");
            AbstractC22676k.m65748h(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            AbstractC22676k.m65748h(str3, "null cannot be cast to non-null type kotlin.String");
            AbstractC22676k.m65748h(list, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.response.SocketErrorResponse.ErrorResponse.ErrorDetail>");
            return new SocketErrorResponse.ErrorResponse(iIntValue, str, iIntValue2, str2, map, str3, list);
        }
        Constructor<SocketErrorResponse.ErrorResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = AbstractC31885f.f132392c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = SocketErrorResponse.ErrorResponse.class.getDeclaredConstructor(cls2, String.class, cls2, String.class, Map.class, String.class, List.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        SocketErrorResponse.ErrorResponse errorResponseNewInstance = declaredConstructor.newInstance(num, str, num2, str2, map, str3, list, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(errorResponseNewInstance, "newInstance(...)");
        return errorResponseNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, SocketErrorResponse.ErrorResponse value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("code");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getCode()));
        writer.mo94373x("message");
        this.stringAdapter.toJson(writer, value_.getMessage());
        writer.mo94373x("StatusCode");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getStatusCode()));
        writer.mo94373x(AttachmentExtensionsKt.EXTRA_DURATION);
        this.stringAdapter.toJson(writer, value_.getDuration());
        writer.mo94373x("exception_fields");
        this.mapOfStringStringAdapter.toJson(writer, value_.getException_fields());
        writer.mo94373x("more_info");
        this.stringAdapter.toJson(writer, value_.getMore_info());
        writer.mo94373x("details");
        this.listOfErrorDetailAdapter.toJson(writer, value_.getDetails());
        writer.mo94370m();
    }
}
