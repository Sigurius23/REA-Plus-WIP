package hx2;

import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: hx2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lhx2/a;", "Lwc3/c;", "", "", "", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "b", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "c", "(Lzc3/e;Ljava/util/Map;)V", "Lzc3/d;", "decoder", "a", "(Lzc3/d;)Ljava/util/Map;", "Lwc3/c;", "delegateSerializer", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17711a implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C17711a f68844a = new C17711a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC37138c delegateSerializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor;

    /* JADX INFO: renamed from: d */
    public static final int f68847d;

    static {
        LinkedHashMapSerializer linkedHashMapSerializerM122335c = AbstractC38195a.m122335c(StringSerializer.INSTANCE, JsonElement.Companion.serializer());
        delegateSerializer = linkedHashMapSerializerM122335c;
        descriptor = linkedHashMapSerializerM122335c.getDescriptor();
        f68847d = 8;
    }

    private C17711a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private final Object m50705b(JsonElement element) {
        if (element instanceof JsonNull) {
            return null;
        }
        if (element instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) element;
            Object objM1843e = AbstractC0770m.m1843e(jsonPrimitive);
            return (objM1843e == null && (objM1843e = AbstractC0770m.m1846h(jsonPrimitive)) == null && (objM1843e = AbstractC0770m.m1845g(jsonPrimitive)) == null) ? jsonPrimitive.getContent() : objM1843e;
        }
        if (element instanceof JsonObject) {
            Map map = (Map) element;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), f68844a.m50705b((JsonElement) entry.getValue()));
            }
            return linkedHashMap;
        }
        if (!(element instanceof JsonArray)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterable iterable = (Iterable) element;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(f68844a.m50705b((JsonElement) it.next()));
        }
        return arrayList;
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new SerializationException("This serializer only works with JSON");
        }
        Object objMo1838b = interfaceC0768k.mo1838b();
        if (objMo1838b instanceof JsonNull) {
            return null;
        }
        if (!(objMo1838b instanceof JsonObject)) {
            throw new SerializationException("Expected JsonObject or null");
        }
        Map map = (Map) objMo1838b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), f68844a.m50705b((JsonElement) entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, Map<String, ? extends Object> value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        throw new SerializationException("Serialization not supported for DynamicMapSerializer");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
