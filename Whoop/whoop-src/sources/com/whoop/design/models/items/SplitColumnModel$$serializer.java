package com.whoop.design.models.items;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/SplitColumnModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/SplitColumnModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/SplitColumnModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/SplitColumnModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SplitColumnModel$$serializer implements GeneratedSerializer<SplitColumnModel> {
    public static final int $stable;
    public static final SplitColumnModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SplitColumnModel$$serializer splitColumnModel$$serializer = new SplitColumnModel$$serializer();
        INSTANCE = splitColumnModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.SplitColumnModel", splitColumnModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("topContent", false);
        pluginGeneratedSerialDescriptor.addElement("bottomContent", false);
        pluginGeneratedSerialDescriptor.addElement("topChildPadding", true);
        pluginGeneratedSerialDescriptor.addElement("bottomChildPadding", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SplitColumnModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SplitColumnModel.$childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), interfaceC23462hArr[1].getValue(), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SplitColumnModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        List list2;
        Double d3;
        Double d14;
        Map map;
        Map map2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SplitColumnModel.$childSerializers;
        int i14 = 5;
        int i15 = 0;
        List list3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d15 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, doubleSerializer, null);
            Double d16 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, doubleSerializer, null);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            list = list4;
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, LenientAggregateBindingsSerializer.INSTANCE, null);
            d14 = d16;
            d3 = d15;
            i13 = 63;
            list2 = list5;
        } else {
            int i16 = 1;
            int i17 = 0;
            List list6 = null;
            Double d17 = null;
            Double d18 = null;
            Map map3 = null;
            Map map4 = null;
            while (i16 != 0) {
                int i18 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        i15 = i18;
                        i16 = i15;
                        i14 = 5;
                        break;
                    case 0:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list3);
                        i17 |= 1;
                        i15 = i18;
                        i14 = 5;
                        break;
                    case 1:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), list6);
                        i17 |= 2;
                        i15 = i18;
                        break;
                    case 2:
                        d17 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, DoubleSerializer.INSTANCE, d17);
                        i17 |= 4;
                        i15 = i18;
                        break;
                    case 3:
                        d18 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DoubleSerializer.INSTANCE, d18);
                        i17 |= 8;
                        i15 = i18;
                        break;
                    case 4:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), map3);
                        i17 |= 16;
                        i15 = i18;
                        break;
                    case 5:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map4);
                        i17 |= 32;
                        i15 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            list = list3;
            list2 = list6;
            d3 = d17;
            d14 = d18;
            map = map3;
            map2 = map4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SplitColumnModel(i13, list, list2, d3, d14, map, map2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SplitColumnModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SplitColumnModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
