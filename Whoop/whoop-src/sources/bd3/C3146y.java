package bd3;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: bd3.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C3146y extends C3144w {

    /* JADX INFO: renamed from: h */
    public final JsonObject f12319h;

    /* JADX INFO: renamed from: i */
    public final List f12320i;

    /* JADX INFO: renamed from: j */
    public final int f12321j;

    /* JADX INFO: renamed from: k */
    public int f12322k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3146y(AbstractC0757c json, JsonObject jsonObject) {
        super(json, jsonObject, (String) null, 12);
        AbstractC22676k.m65750j(json, "json");
        this.f12319h = jsonObject;
        List listM74093D1 = AbstractC25265s.m74093D1(jsonObject.keySet());
        this.f12320i = listM74093D1;
        this.f12321j = listM74093D1.size() * 2;
        this.f12322k = -1;
    }

    @Override // bd3.C3144w, kotlinx.serialization.internal.NamedValueDecoder, kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40539b
    public final int decodeElementIndex(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        int i13 = this.f12322k;
        if (i13 >= this.f12321j - 1) {
            return -1;
        }
        int i14 = i13 + 1;
        this.f12322k = i14;
        return i14;
    }

    @Override // bd3.C3144w, bd3.AbstractC3112b
    /* JADX INFO: renamed from: e */
    public final JsonElement mo8972e(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        return this.f12322k % 2 == 0 ? AbstractC0770m.m1841c(tag) : (JsonElement) AbstractC25247g0.m73986U(tag, this.f12319h);
    }

    @Override // bd3.C3144w, kotlinx.serialization.internal.NamedValueDecoder
    public final String elementName(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return (String) this.f12320i.get(i13 / 2);
    }

    @Override // bd3.C3144w, bd3.AbstractC3112b, kotlinx.serialization.internal.TaggedDecoder, zc3.InterfaceC40539b
    public final void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
    }

    @Override // bd3.C3144w, bd3.AbstractC3112b
    /* JADX INFO: renamed from: g */
    public final JsonElement mo8974g() {
        return this.f12319h;
    }

    @Override // bd3.C3144w
    /* JADX INFO: renamed from: j */
    public final JsonObject mo8974g() {
        return this.f12319h;
    }
}
