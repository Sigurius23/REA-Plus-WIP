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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/WheelContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/WheelContent;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/WheelContent;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/WheelContent;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WheelContent$$serializer implements GeneratedSerializer<WheelContent> {
    public static final int $stable;
    public static final WheelContent$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WheelContent$$serializer wheelContent$$serializer = new WheelContent$$serializer();
        INSTANCE = wheelContent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.WheelContent", wheelContent$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("lowerBound", false);
        pluginGeneratedSerialDescriptor.addElement("upperBound", false);
        pluginGeneratedSerialDescriptor.addElement("stepSize", false);
        pluginGeneratedSerialDescriptor.addElement("padTo", false);
        pluginGeneratedSerialDescriptor.addElement("prefix", false);
        pluginGeneratedSerialDescriptor.addElement("options", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WheelContent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WheelContent.$childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(IntSerializer.INSTANCE), AbstractC38195a.m122336d(StringSerializer.INSTANCE), interfaceC23462hArr[6].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WheelContent deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        String str;
        WheelContentType wheelContentType;
        Double d3;
        Double d14;
        Double d15;
        Integer num;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WheelContent.$childSerializers;
        int i14 = 5;
        WheelContentType wheelContentType2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            WheelContentType wheelContentType3 = (WheelContentType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d16 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, doubleSerializer, null);
            Double d17 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, doubleSerializer, null);
            Double d18 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, doubleSerializer, null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, IntSerializer.INSTANCE, null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            wheelContentType = wheelContentType3;
            str = str2;
            d15 = d18;
            num = num2;
            d14 = d17;
            i13 = 127;
            d3 = d16;
        } else {
            boolean z4 = true;
            int i15 = 0;
            List list2 = null;
            String str3 = null;
            Double d19 = null;
            Double d24 = null;
            Double d25 = null;
            Integer num3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        wheelContentType2 = (WheelContentType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), wheelContentType2);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        d19 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, DoubleSerializer.INSTANCE, d19);
                        i15 |= 2;
                        i14 = 5;
                        break;
                    case 2:
                        d24 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, DoubleSerializer.INSTANCE, d24);
                        i15 |= 4;
                        i14 = 5;
                        break;
                    case 3:
                        d25 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DoubleSerializer.INSTANCE, d25);
                        i15 |= 8;
                        break;
                    case 4:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, IntSerializer.INSTANCE, num3);
                        i15 |= 16;
                        break;
                    case 5:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str3);
                        i15 |= 32;
                        break;
                    case 6:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list2);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            list = list2;
            str = str3;
            wheelContentType = wheelContentType2;
            d3 = d19;
            d14 = d24;
            d15 = d25;
            num = num3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WheelContent(i13, wheelContentType, d3, d14, d15, num, str, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WheelContent value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WheelContent.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
