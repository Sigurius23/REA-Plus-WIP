package com.whoop.design.models.items;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/DesignItemGridModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/DesignItemGridModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/DesignItemGridModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/DesignItemGridModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DesignItemGridModel$$serializer implements GeneratedSerializer<DesignItemGridModel> {
    public static final int $stable;
    public static final DesignItemGridModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DesignItemGridModel$$serializer designItemGridModel$$serializer = new DesignItemGridModel$$serializer();
        INSTANCE = designItemGridModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.DesignItemGridModel", designItemGridModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("columnWidth", false);
        pluginGeneratedSerialDescriptor.addElement("minHorizontalSpacing", true);
        pluginGeneratedSerialDescriptor.addElement("minVerticalSpacing", true);
        pluginGeneratedSerialDescriptor.addElement("minHorizontalPadding", true);
        pluginGeneratedSerialDescriptor.addElement("minVerticalPadding", true);
        pluginGeneratedSerialDescriptor.addElement("verticalAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("numberOfColumns", true);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DesignItemGridModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = DesignItemGridModel.$childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d(IntSerializer.INSTANCE), interfaceC23462hArr[8].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DesignItemGridModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        Integer num;
        DesignItemGridVerticalAlignment designItemGridVerticalAlignment;
        double d3;
        double d14;
        String str;
        double d15;
        double d16;
        double d17;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = DesignItemGridModel.$childSerializers;
        int i14 = 7;
        DesignItemGridVerticalAlignment designItemGridVerticalAlignment2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
            double dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 2);
            double dDecodeDoubleElement3 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
            double dDecodeDoubleElement4 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 4);
            double dDecodeDoubleElement5 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 5);
            DesignItemGridVerticalAlignment designItemGridVerticalAlignment3 = (DesignItemGridVerticalAlignment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, IntSerializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            str = strDecodeStringElement;
            num = num2;
            designItemGridVerticalAlignment = designItemGridVerticalAlignment3;
            d3 = dDecodeDoubleElement4;
            i13 = 511;
            d14 = dDecodeDoubleElement;
            d15 = dDecodeDoubleElement2;
            d16 = dDecodeDoubleElement3;
            d17 = dDecodeDoubleElement5;
        } else {
            double dDecodeDoubleElement6 = 0.0d;
            boolean z4 = true;
            int i15 = 0;
            List list2 = null;
            Integer num3 = null;
            String strDecodeStringElement2 = null;
            double dDecodeDoubleElement7 = 0.0d;
            double dDecodeDoubleElement8 = 0.0d;
            double dDecodeDoubleElement9 = 0.0d;
            double dDecodeDoubleElement10 = 0.0d;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        break;
                    case 0:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 7;
                        break;
                    case 1:
                        dDecodeDoubleElement7 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        dDecodeDoubleElement8 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        dDecodeDoubleElement9 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        dDecodeDoubleElement6 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        dDecodeDoubleElement10 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        designItemGridVerticalAlignment2 = (DesignItemGridVerticalAlignment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), designItemGridVerticalAlignment2);
                        i15 |= 64;
                        break;
                    case 7:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, IntSerializer.INSTANCE, num3);
                        i15 |= 128;
                        break;
                    case 8:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), list2);
                        i15 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            list = list2;
            num = num3;
            designItemGridVerticalAlignment = designItemGridVerticalAlignment2;
            d3 = dDecodeDoubleElement6;
            d14 = dDecodeDoubleElement7;
            str = strDecodeStringElement2;
            d15 = dDecodeDoubleElement8;
            d16 = dDecodeDoubleElement9;
            d17 = dDecodeDoubleElement10;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DesignItemGridModel(i13, str, d14, d15, d16, d3, d17, designItemGridVerticalAlignment, num, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DesignItemGridModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DesignItemGridModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
