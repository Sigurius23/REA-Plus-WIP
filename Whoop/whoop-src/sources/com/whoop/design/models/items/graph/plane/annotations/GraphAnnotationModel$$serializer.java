package com.whoop.design.models.items.graph.plane.annotations;

import j61.EnumC21367a;
import j61.EnumC21368b;
import j61.EnumC21370d;
import j61.EnumC21371e;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GraphAnnotationModel$$serializer implements GeneratedSerializer<GraphAnnotationModel> {
    public static final int $stable;
    public static final GraphAnnotationModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GraphAnnotationModel$$serializer graphAnnotationModel$$serializer = new GraphAnnotationModel$$serializer();
        INSTANCE = graphAnnotationModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.plane.annotations.GraphAnnotationModel", graphAnnotationModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("xposition", true);
        pluginGeneratedSerialDescriptor.addElement("yposition", true);
        pluginGeneratedSerialDescriptor.addElement("width", true);
        pluginGeneratedSerialDescriptor.addElement("height", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("dimension", false);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        pluginGeneratedSerialDescriptor.addElement("subLabel", true);
        pluginGeneratedSerialDescriptor.addElement("labelStyle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GraphAnnotationModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = GraphAnnotationModel.$childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GraphAnnotationModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        GraphAnnotationLabelAlignment graphAnnotationLabelAlignment;
        EnumC21371e enumC21371e;
        EnumC21368b enumC21368b;
        String str2;
        EnumC21367a enumC21367a;
        EnumC21370d enumC21370d;
        double d3;
        double d14;
        double d15;
        double d16;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = GraphAnnotationModel.$childSerializers;
        int i14 = 9;
        int i15 = 6;
        int i16 = 5;
        EnumC21370d enumC21370d2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 0);
            double dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
            double dDecodeDoubleElement3 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 2);
            double dDecodeDoubleElement4 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
            EnumC21370d enumC21370d3 = (EnumC21370d) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            EnumC21371e enumC21371e2 = (EnumC21371e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            EnumC21367a enumC21367a2 = (EnumC21367a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            GraphAnnotationLabelAlignment graphAnnotationLabelAlignment2 = (GraphAnnotationLabelAlignment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            enumC21368b = (EnumC21368b) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            enumC21370d = enumC21370d3;
            str = str4;
            str2 = str3;
            d3 = dDecodeDoubleElement4;
            graphAnnotationLabelAlignment = graphAnnotationLabelAlignment2;
            enumC21367a = enumC21367a2;
            enumC21371e = enumC21371e2;
            i13 = 2047;
            d14 = dDecodeDoubleElement2;
            d15 = dDecodeDoubleElement;
            d16 = dDecodeDoubleElement3;
        } else {
            double dDecodeDoubleElement5 = 0.0d;
            int i17 = 4;
            boolean z4 = true;
            int i18 = 0;
            String str5 = null;
            GraphAnnotationLabelAlignment graphAnnotationLabelAlignment3 = null;
            EnumC21371e enumC21371e3 = null;
            EnumC21368b enumC21368b2 = null;
            String str6 = null;
            EnumC21367a enumC21367a3 = null;
            double dDecodeDoubleElement6 = 0.0d;
            double dDecodeDoubleElement7 = 0.0d;
            double dDecodeDoubleElement8 = 0.0d;
            while (z4) {
                int i19 = i16;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 9;
                        i16 = 5;
                        i17 = 4;
                        break;
                    case 0:
                        dDecodeDoubleElement7 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 0);
                        i18 |= 1;
                        i14 = 9;
                        i15 = 6;
                        i16 = 5;
                        i17 = 4;
                        break;
                    case 1:
                        dDecodeDoubleElement6 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
                        i18 |= 2;
                        i14 = 9;
                        i15 = 6;
                        i16 = 5;
                        i17 = 4;
                        break;
                    case 2:
                        dDecodeDoubleElement8 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 2);
                        i18 |= 4;
                        i14 = 9;
                        i15 = 6;
                        i16 = 5;
                        i17 = 4;
                        break;
                    case 3:
                        dDecodeDoubleElement5 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
                        i18 |= 8;
                        i14 = 9;
                        i15 = 6;
                        i16 = 5;
                        break;
                    case 4:
                        enumC21370d2 = (EnumC21370d) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC21370d2);
                        i18 |= 16;
                        i14 = 9;
                        i15 = 6;
                        i16 = 5;
                        break;
                    case 5:
                        enumC21371e3 = (EnumC21371e) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), enumC21371e3);
                        i18 |= 32;
                        i16 = i19;
                        i14 = 9;
                        i15 = 6;
                        break;
                    case 6:
                        int i24 = i15;
                        enumC21367a3 = (EnumC21367a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), enumC21367a3);
                        i18 |= 64;
                        i15 = i24;
                        i16 = i19;
                        i14 = 9;
                        break;
                    case 7:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str6);
                        i18 |= 128;
                        i15 = i15;
                        i16 = i19;
                        break;
                    case 8:
                        graphAnnotationLabelAlignment3 = (GraphAnnotationLabelAlignment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), graphAnnotationLabelAlignment3);
                        i18 |= 256;
                        i15 = i15;
                        i16 = i19;
                        break;
                    case 9:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str5);
                        i18 |= 512;
                        i15 = i15;
                        i16 = i19;
                        break;
                    case 10:
                        enumC21368b2 = (EnumC21368b) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), enumC21368b2);
                        i18 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = i15;
                        i16 = i19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i18;
            str = str5;
            graphAnnotationLabelAlignment = graphAnnotationLabelAlignment3;
            enumC21371e = enumC21371e3;
            enumC21368b = enumC21368b2;
            str2 = str6;
            enumC21367a = enumC21367a3;
            enumC21370d = enumC21370d2;
            d3 = dDecodeDoubleElement5;
            d14 = dDecodeDoubleElement6;
            d15 = dDecodeDoubleElement7;
            d16 = dDecodeDoubleElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GraphAnnotationModel(i13, d15, d14, d16, d3, enumC21370d, enumC21371e, enumC21367a, str2, graphAnnotationLabelAlignment, str, enumC21368b, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GraphAnnotationModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GraphAnnotationModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
