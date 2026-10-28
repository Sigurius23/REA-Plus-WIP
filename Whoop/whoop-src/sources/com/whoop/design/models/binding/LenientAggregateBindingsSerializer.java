package com.whoop.design.models.binding;

import ad3.InterfaceC0768k;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;", "Lwc3/c;", "", "", "Lcom/whoop/design/models/binding/AggregateBinding;", "<init>", "()V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Ljava/util/Map;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Ljava/util/Map;)V", "delegate", "Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "state-binding-annotations"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LenientAggregateBindingsSerializer implements InterfaceC37138c {
    public static final LenientAggregateBindingsSerializer INSTANCE = new LenientAggregateBindingsSerializer();
    private static final InterfaceC37138c delegate;
    private static final InterfaceC39443g descriptor;

    static {
        LinkedHashMapSerializer linkedHashMapSerializerM122335c = AbstractC38195a.m122335c(StringSerializer.INSTANCE, AggregateBinding.INSTANCE.serializer());
        delegate = linkedHashMapSerializerM122335c;
        descriptor = linkedHashMapSerializerM122335c.getDescriptor();
    }

    private LenientAggregateBindingsSerializer() {
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // wc3.InterfaceC37137b
    public Map<String, AggregateBinding> deserialize(InterfaceC40541d decoder) {
        C25272z c25272z = C25272z.f99163w;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            return (Map) delegate.deserialize(decoder);
        }
        try {
            JsonElement jsonElementMo1838b = interfaceC0768k.mo1838b();
            JsonObject jsonObject = jsonElementMo1838b instanceof JsonObject ? (JsonObject) jsonElementMo1838b : null;
            return jsonObject == null ? c25272z : AggregateBindingKt.parseAggregateBindings(jsonObject);
        } catch (SerializationException unused) {
            return c25272z;
        }
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, Map<String, AggregateBinding> value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        delegate.serialize(encoder, value);
    }
}
