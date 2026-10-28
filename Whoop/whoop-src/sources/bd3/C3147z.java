package bd3;

import ad3.C0756b0;
import ad3.C0763f;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bd3.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C3147z extends C3141t {

    /* JADX INFO: renamed from: h */
    public String f12323h;

    /* JADX INFO: renamed from: i */
    public boolean f12324i;

    @Override // bd3.C3141t
    /* JADX INFO: renamed from: b */
    public final JsonElement mo9030b() {
        return new JsonObject((LinkedHashMap) this.f12306g);
    }

    @Override // bd3.C3141t
    /* JADX INFO: renamed from: d */
    public final void mo9031d(String key, JsonElement element) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(element, "element");
        if (!this.f12324i) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f12306g;
            String str = this.f12323h;
            if (str == null) {
                AbstractC22676k.m65757q("tag");
                throw null;
            }
            linkedHashMap.put(str, element);
            this.f12324i = true;
            return;
        }
        if (element instanceof JsonPrimitive) {
            this.f12323h = ((JsonPrimitive) element).getContent();
            this.f12324i = false;
        } else {
            if (element instanceof JsonObject) {
                throw AbstractC3138q.m9006b(C0756b0.f2761b);
            }
            if (!(element instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw AbstractC3138q.m9006b(C0763f.f2773b);
        }
    }
}
