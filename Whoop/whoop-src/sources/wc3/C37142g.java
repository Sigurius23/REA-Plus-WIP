package wc3;

import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import l83.EnumC23463i;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.C35015q;
import q83.AbstractC30060g;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: wc3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C37142g extends AbstractPolymorphicSerializer {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f158886a;

    /* JADX INFO: renamed from: b */
    public final List f158887b;

    /* JADX INFO: renamed from: c */
    public final Object f158888c;

    /* JADX INFO: renamed from: d */
    public final Map f158889d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f158890e;

    public C37142g(String str, InterfaceC21461d baseClass, InterfaceC21461d[] interfaceC21461dArr, InterfaceC37138c[] interfaceC37138cArr) {
        AbstractC22676k.m65750j(baseClass, "baseClass");
        this.f158886a = baseClass;
        this.f158887b = C25271y.f99162w;
        this.f158888c = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35015q(25, str, this));
        if (interfaceC21461dArr.length != interfaceC37138cArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + baseClass.getSimpleName() + " should be marked @Serializable");
        }
        Map mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25260n.m74063d1(interfaceC21461dArr, interfaceC37138cArr));
        this.f158889d = mapM74000i0;
        Set<Map.Entry> setEntrySet = mapM74000i0.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String serialName = ((InterfaceC37138c) entry.getValue()).getDescriptor().getSerialName();
            Object obj = linkedHashMap.get(serialName);
            if (obj == null) {
                linkedHashMap.containsKey(serialName);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f158886a + "' have the same serial name '" + serialName + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(serialName, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (InterfaceC37138c) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f158890e = linkedHashMap2;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final InterfaceC37137b findPolymorphicSerializerOrNull(InterfaceC40539b decoder, String str) {
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC37138c interfaceC37138c = (InterfaceC37138c) this.f158890e.get(str);
        return interfaceC37138c != null ? interfaceC37138c : super.findPolymorphicSerializerOrNull(decoder, str);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final InterfaceC21461d getBaseClass() {
        return this.f158886a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return (InterfaceC39443g) this.f158888c.getValue();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final InterfaceC37145j findPolymorphicSerializerOrNull(InterfaceC40542e encoder, Object value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC37138c interfaceC37138c = (InterfaceC37138c) this.f158889d.get(AbstractC22671h0.f89337a.getOrCreateKotlinClass(value.getClass()));
        InterfaceC37138c interfaceC37138cFindPolymorphicSerializerOrNull = interfaceC37138c != null ? interfaceC37138c : super.findPolymorphicSerializerOrNull(encoder, value);
        if (interfaceC37138cFindPolymorphicSerializerOrNull != null) {
            return interfaceC37138cFindPolymorphicSerializerOrNull;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37142g(String str, InterfaceC21461d baseClass, InterfaceC21461d[] interfaceC21461dArr, InterfaceC37138c[] interfaceC37138cArr, Annotation[] annotationArr) {
        this(str, baseClass, interfaceC21461dArr, interfaceC37138cArr);
        AbstractC22676k.m65750j(baseClass, "baseClass");
        this.f158887b = AbstractC25260n.m74048W(annotationArr);
    }
}
