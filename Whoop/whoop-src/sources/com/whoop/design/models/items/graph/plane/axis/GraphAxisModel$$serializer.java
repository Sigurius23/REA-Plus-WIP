package com.whoop.design.models.items.graph.plane.axis;

import com.mapbox.maps.MapboxMap;
import g61.EnumC15530c;
import g61.EnumC15531d;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/plane/axis/GraphAxisModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GraphAxisModel$$serializer implements GeneratedSerializer<GraphAxisModel> {
    public static final int $stable;
    public static final GraphAxisModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GraphAxisModel$$serializer graphAxisModel$$serializer = new GraphAxisModel$$serializer();
        INSTANCE = graphAxisModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.plane.axis.GraphAxisModel", graphAxisModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("labels", true);
        pluginGeneratedSerialDescriptor.addElement(MapboxMap.QFE_OFFSET, true);
        pluginGeneratedSerialDescriptor.addElement("axisDescription", true);
        pluginGeneratedSerialDescriptor.addElement("scrimPresent", true);
        pluginGeneratedSerialDescriptor.addElement("theme", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GraphAxisModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = GraphAxisModel.$childSerializers;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[1].getValue()), interfaceC23462hArr[2].getValue(), DoubleSerializer.INSTANCE, AbstractC38195a.m122336d(StringSerializer.INSTANCE), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(GraphAxisTheme$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GraphAxisModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        GraphAxisTheme graphAxisTheme;
        int i13;
        EnumC15531d enumC15531d;
        EnumC15530c enumC15530c;
        List list;
        String str;
        double d3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = GraphAxisModel.$childSerializers;
        int i14 = 6;
        int i15 = 1;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            EnumC15531d enumC15531d2 = (EnumC15531d) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            EnumC15530c enumC15530c2 = (EnumC15530c) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            list = list2;
            enumC15531d = enumC15531d2;
            graphAxisTheme = (GraphAxisTheme) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, GraphAxisTheme$$serializer.INSTANCE, null);
            z4 = zDecodeBooleanElement;
            str = str2;
            i13 = 127;
            enumC15530c = enumC15530c2;
            d3 = dDecodeDoubleElement;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            List list3 = null;
            String str3 = null;
            double dDecodeDoubleElement2 = 0.0d;
            int i16 = 0;
            GraphAxisTheme graphAxisTheme2 = null;
            EnumC15531d enumC15531d3 = null;
            EnumC15530c enumC15530c3 = null;
            while (z13) {
                int i17 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 6;
                        i15 = 1;
                        break;
                    case 0:
                        enumC15531d3 = (EnumC15531d) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), enumC15531d3);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 1;
                        break;
                    case 1:
                        enumC15530c3 = (EnumC15530c) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC15530c3);
                        i16 |= 2;
                        i15 = i17;
                        i14 = 6;
                        break;
                    case 2:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), list3);
                        i16 |= 4;
                        i15 = i17;
                        break;
                    case 3:
                        dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i15 = i17;
                        break;
                    case 4:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str3);
                        i16 |= 16;
                        i15 = i17;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i15 = i17;
                        break;
                    case 6:
                        graphAxisTheme2 = (GraphAxisTheme) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, GraphAxisTheme$$serializer.INSTANCE, graphAxisTheme2);
                        i16 |= 64;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            graphAxisTheme = graphAxisTheme2;
            i13 = i16;
            enumC15531d = enumC15531d3;
            enumC15530c = enumC15530c3;
            list = list3;
            str = str3;
            d3 = dDecodeDoubleElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GraphAxisModel(i13, enumC15531d, enumC15530c, list, d3, str, z4, graphAxisTheme, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GraphAxisModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GraphAxisModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
