package bd3;

import ad3.AbstractC0757c;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: bd3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C3145x extends AbstractC3112b {

    /* JADX INFO: renamed from: d */
    public final JsonArray f12316d;

    /* JADX INFO: renamed from: e */
    public final int f12317e;

    /* JADX INFO: renamed from: f */
    public int f12318f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3145x(AbstractC0757c json, JsonArray value) {
        super(json, null);
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(value, "value");
        this.f12316d = value;
        this.f12317e = value.size();
        this.f12318f = -1;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder, kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40539b
    public final int decodeElementIndex(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        int i13 = this.f12318f;
        if (i13 >= this.f12317e - 1) {
            return -1;
        }
        int i14 = i13 + 1;
        this.f12318f = i14;
        return i14;
    }

    @Override // bd3.AbstractC3112b
    /* JADX INFO: renamed from: e */
    public final JsonElement mo8972e(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        return this.f12316d.get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public final String elementName(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return String.valueOf(i13);
    }

    @Override // bd3.AbstractC3112b
    /* JADX INFO: renamed from: g */
    public final JsonElement mo8974g() {
        return this.f12316d;
    }
}
