package com.whoop.weeklyplan.customizeplan.domain.api;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SliderContentV2$$serializer implements GeneratedSerializer<SliderContentV2> {
    public static final int $stable;
    public static final SliderContentV2$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SliderContentV2$$serializer sliderContentV2$$serializer = new SliderContentV2$$serializer();
        INSTANCE = sliderContentV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.customizeplan.domain.api.SliderContentV2", sliderContentV2$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("range", false);
        pluginGeneratedSerialDescriptor.addElement("increment", false);
        pluginGeneratedSerialDescriptor.addElement("usableRange", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("valueLabel", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedRange", false);
        pluginGeneratedSerialDescriptor.addElement("rangeContent", false);
        pluginGeneratedSerialDescriptor.addElement("valueUnits", false);
        pluginGeneratedSerialDescriptor.addElement("averageLine", false);
        pluginGeneratedSerialDescriptor.addElement("topText", false);
        pluginGeneratedSerialDescriptor.addElement("bottomText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SliderContentV2$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SliderContentV2.$childSerializers;
        RangeV2$$serializer rangeV2$$serializer = RangeV2$$serializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{rangeV2$$serializer, doubleSerializer, rangeV2$$serializer, doubleSerializer, stringSerializer, AbstractC38195a.m122336d(DisplayRangeV2$$serializer.INSTANCE), interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(AverageLineV2$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SliderContentV2 deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        AverageLineV2 averageLineV2;
        List list;
        String str3;
        DisplayRangeV2 displayRangeV2;
        RangeV2 rangeV2;
        RangeV2 rangeV3;
        String str4;
        double d3;
        double d14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SliderContentV2.$childSerializers;
        int i14 = 10;
        int i15 = 9;
        RangeV2 rangeV4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            RangeV2$$serializer rangeV2$$serializer = RangeV2$$serializer.INSTANCE;
            RangeV2 rangeV5 = (RangeV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, rangeV2$$serializer, null);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
            RangeV2 rangeV6 = (RangeV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, rangeV2$$serializer, null);
            double dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            DisplayRangeV2 displayRangeV3 = (DisplayRangeV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, DisplayRangeV2$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            AverageLineV2 averageLineV3 = (AverageLineV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, AverageLineV2$$serializer.INSTANCE, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            list = list2;
            rangeV2 = rangeV6;
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            str = str6;
            str2 = str5;
            displayRangeV2 = displayRangeV3;
            str4 = strDecodeStringElement;
            averageLineV2 = averageLineV3;
            i13 = 2047;
            rangeV3 = rangeV5;
            d3 = dDecodeDoubleElement;
            d14 = dDecodeDoubleElement2;
        } else {
            int i16 = 6;
            boolean z4 = true;
            int i17 = 0;
            String str7 = null;
            String str8 = null;
            AverageLineV2 averageLineV4 = null;
            List list3 = null;
            String str9 = null;
            DisplayRangeV2 displayRangeV4 = null;
            RangeV2 rangeV7 = null;
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            String strDecodeStringElement2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 9;
                        i16 = 6;
                        break;
                    case 0:
                        rangeV4 = (RangeV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, RangeV2$$serializer.INSTANCE, rangeV4);
                        i17 |= 1;
                        i14 = 10;
                        i15 = 9;
                        i16 = 6;
                        break;
                    case 1:
                        dDecodeDoubleElement3 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i14 = 10;
                        i15 = 9;
                        i16 = 6;
                        break;
                    case 2:
                        rangeV7 = (RangeV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, RangeV2$$serializer.INSTANCE, rangeV7);
                        i17 |= 4;
                        i14 = 10;
                        i15 = 9;
                        i16 = 6;
                        break;
                    case 3:
                        dDecodeDoubleElement4 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i14 = 10;
                        i16 = 6;
                        break;
                    case 4:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i17 |= 16;
                        i14 = 10;
                        i16 = 6;
                        break;
                    case 5:
                        displayRangeV4 = (DisplayRangeV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, DisplayRangeV2$$serializer.INSTANCE, displayRangeV4);
                        i17 |= 32;
                        i14 = 10;
                        i16 = 6;
                        break;
                    case 6:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list3);
                        i17 |= 64;
                        i14 = 10;
                        break;
                    case 7:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str8);
                        i17 |= 128;
                        i14 = 10;
                        break;
                    case 8:
                        averageLineV4 = (AverageLineV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, AverageLineV2$$serializer.INSTANCE, averageLineV4);
                        i17 |= 256;
                        break;
                    case 9:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StringSerializer.INSTANCE, str7);
                        i17 |= 512;
                        break;
                    case 10:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str9);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            str = str7;
            str2 = str8;
            averageLineV2 = averageLineV4;
            list = list3;
            str3 = str9;
            displayRangeV2 = displayRangeV4;
            rangeV2 = rangeV7;
            rangeV3 = rangeV4;
            str4 = strDecodeStringElement2;
            d3 = dDecodeDoubleElement3;
            d14 = dDecodeDoubleElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SliderContentV2(i13, rangeV3, d3, rangeV2, d14, str4, displayRangeV2, list, str2, averageLineV2, str, str3, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SliderContentV2 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SliderContentV2.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
