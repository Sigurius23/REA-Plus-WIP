package p222ij;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0775r;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p005a3.C0227m1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ij.f */
/* JADX INFO: loaded from: classes.dex */
public final class C18580f extends C18590p {

    /* JADX INFO: renamed from: c */
    public final C18587m f72589c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f72590d;

    /* JADX INFO: renamed from: e */
    public final C0775r f72591e;

    public C18580f(C18587m c18587m) {
        super("callNativeFunction");
        this.f72589c = c18587m;
        this.f72590d = new LinkedHashMap();
        this.f72591e = AbstractC34132o.m107878b(AbstractC0757c.f2762d, C18577c.f72583x);
        this.f72617b = new C0227m1(this, 19);
    }

    /* JADX INFO: renamed from: a */
    public final String m53798a(String str, String str2, String str3) {
        if (str2 == null) {
            str2 = "null";
        }
        JsonElement jsonElementM1835f = this.f72591e.m1835f(str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive element = AbstractC0770m.m1841c(str);
        AbstractC22676k.m65750j(element, "element");
        JsonPrimitive element2 = AbstractC0770m.m1841c(jsonElementM1835f.toString());
        AbstractC22676k.m65750j(element2, "element");
        JsonPrimitive element3 = AbstractC0770m.m1841c(str3);
        AbstractC22676k.m65750j(element3, "element");
        return new JsonObject(linkedHashMap).toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m53799b(String str, String str2) {
        this.f72589c.m53801a(AbstractC31061c.m95633i(')', "onNativeMessage(", m53798a(str, null, str2)), C18578d.f72587w);
    }
}
