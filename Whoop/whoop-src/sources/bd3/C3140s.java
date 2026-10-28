package bd3;

import ad3.AbstractC0757c;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: bd3.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C3140s extends AbstractC3112b {

    /* JADX INFO: renamed from: d */
    public final JsonElement f12299d;

    public /* synthetic */ C3140s(AbstractC0757c abstractC0757c, JsonElement jsonElement) {
        this(abstractC0757c, jsonElement, null);
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder, kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40539b
    public final int decodeElementIndex(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return 0;
    }

    @Override // bd3.AbstractC3112b
    /* JADX INFO: renamed from: e */
    public final JsonElement mo8972e(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        if (tag == "primitive") {
            return this.f12299d;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // bd3.AbstractC3112b
    /* JADX INFO: renamed from: g */
    public final JsonElement mo8974g() {
        return this.f12299d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3140s(AbstractC0757c json, JsonElement value, String str) {
        super(json, str);
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(value, "value");
        this.f12299d = value;
        pushTag("primitive");
    }
}
