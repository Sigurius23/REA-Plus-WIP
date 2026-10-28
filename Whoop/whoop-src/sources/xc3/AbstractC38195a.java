package xc3;

import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NullableSerializer;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: xc3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38195a {
    /* JADX INFO: renamed from: a */
    public static final ArrayListSerializer m122333a(InterfaceC37138c elementSerializer) {
        AbstractC22676k.m65750j(elementSerializer, "elementSerializer");
        return new ArrayListSerializer(elementSerializer);
    }

    /* JADX INFO: renamed from: b */
    public static final MapEntrySerializer m122334b(InterfaceC37138c keySerializer, InterfaceC37138c valueSerializer) {
        AbstractC22676k.m65750j(keySerializer, "keySerializer");
        AbstractC22676k.m65750j(valueSerializer, "valueSerializer");
        return new MapEntrySerializer(keySerializer, valueSerializer);
    }

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMapSerializer m122335c(InterfaceC37138c keySerializer, InterfaceC37138c valueSerializer) {
        AbstractC22676k.m65750j(keySerializer, "keySerializer");
        AbstractC22676k.m65750j(valueSerializer, "valueSerializer");
        return new LinkedHashMapSerializer(keySerializer, valueSerializer);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC37138c m122336d(InterfaceC37138c interfaceC37138c) {
        AbstractC22676k.m65750j(interfaceC37138c, "<this>");
        return interfaceC37138c.getDescriptor().isNullable() ? interfaceC37138c : new NullableSerializer(interfaceC37138c);
    }
}
