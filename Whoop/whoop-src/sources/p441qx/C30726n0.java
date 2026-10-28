package p441qx;

import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import mp.C25750a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p471rx.AbstractC31885f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qx.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C30726n0 extends JsonAdapter {

    /* JADX INFO: renamed from: d */
    public static final C30724m0 f126509d = new C30724m0();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126510a = 1;

    /* JADX INFO: renamed from: b */
    public final JsonAdapter f126511b;

    /* JADX INFO: renamed from: c */
    public final Object f126512c;

    public C30726n0(C30722l0 c30722l0, Type type, Type type2) {
        Set set = AbstractC31885f.f132390a;
        this.f126511b = c30722l0.m94400c(type, set, null);
        this.f126512c = c30722l0.m94400c(type2, set, null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader reader) {
        Object objFromJson;
        Object objPut;
        switch (this.f126510a) {
            case 0:
                AbstractC22676k.m65750j(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                reader.beginObject();
                while (reader.hasNext()) {
                    reader.mo16735s();
                    Object objFromJson2 = this.f126511b.fromJson(reader);
                    if (objFromJson2 != null && (objPut = linkedHashMap.put(objFromJson2, (objFromJson = ((JsonAdapter) this.f126512c).fromJson(reader)))) != null) {
                        C25750a c25750a = new C25750a("Map key '" + objFromJson2 + "' has multiple values at path " + reader.m16727b() + ": " + objPut + " and " + objFromJson);
                        C2343i c2343i = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                        EnumC2341g enumC2341g = EnumC2341g.ERROR;
                        if (interfaceC2339e.isLoggable(enumC2341g, "CustomMapJsonAdapter")) {
                            C2343i.f9271c.log(enumC2341g, "CustomMapJsonAdapter", "[fromJson] failed: " + c25750a, c25750a);
                        }
                    }
                }
                reader.endObject();
                return linkedHashMap;
            default:
                return this.f126511b.fromJson(reader);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public boolean isLenient() {
        switch (this.f126510a) {
            case 1:
                return this.f126511b.isLenient();
            default:
                return super.isLenient();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 writer, Object obj) {
        switch (this.f126510a) {
            case 0:
                Map map = (Map) obj;
                AbstractC22676k.m65750j(writer, "writer");
                if (map == null) {
                    return;
                }
                HashSet hashSet = new HashSet();
                writer.mo94368h();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key == null) {
                        throw new JsonDataException(AbstractC11266d.m30461o("Map key is null at ", writer.m94380s()));
                    }
                    if (hashSet.contains(key)) {
                        C25750a c25750a = new C25750a("Map key '" + key + "' has multiple values at path " + writer.m94380s() + ";\nmap: " + map);
                        C2343i c2343i = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                        EnumC2341g enumC2341g = EnumC2341g.ERROR;
                        if (interfaceC2339e.isLoggable(enumC2341g, "CustomMapJsonAdapter")) {
                            C2343i.f9271c.log(enumC2341g, "CustomMapJsonAdapter", "[toJson] failed: " + c25750a, c25750a);
                        }
                    } else {
                        int iM94376T = writer.m94376T();
                        if (iM94376T != 5 && iM94376T != 3) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        writer.f126435H = true;
                        this.f126511b.toJson(writer, key);
                        ((JsonAdapter) this.f126512c).toJson(writer, value);
                        hashSet.add(key);
                    }
                }
                writer.mo94370m();
                return;
            default:
                String str = writer.f126432E;
                if (str == null) {
                    str = "";
                }
                writer.mo94378b0((String) this.f126512c);
                try {
                    this.f126511b.toJson(writer, obj);
                    return;
                } finally {
                    writer.mo94378b0(str);
                }
        }
    }

    public final String toString() {
        switch (this.f126510a) {
            case 0:
                return "CustomMapJsonAdapter(" + this.f126511b + "=" + ((JsonAdapter) this.f126512c) + ")";
            default:
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f126511b);
                sb4.append(".indent(\"");
                return AbstractC25012a.m73376i((String) this.f126512c, "\")", sb4);
        }
    }

    public C30726n0(JsonAdapter jsonAdapter, String str) {
        this.f126511b = jsonAdapter;
        this.f126512c = str;
    }
}
