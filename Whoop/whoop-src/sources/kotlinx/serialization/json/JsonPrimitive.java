package kotlinx.serialization.json;

import ad3.C0758c0;
import ad3.C0760d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0001\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "isString", "()Z", "getContent", "content", "Companion", "ad3/c0", "Lad3/s;", "Lkotlinx/serialization/json/JsonNull;", "kotlinx-serialization-json"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@InterfaceC37144i(with = C0760d0.class)
public abstract class JsonPrimitive extends JsonElement {
    public static final C0758c0 Companion = new C0758c0();

    public /* synthetic */ JsonPrimitive(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getContent();

    public abstract boolean isString();

    public String toString() {
        return getContent();
    }

    private JsonPrimitive() {
        super(null);
    }
}
