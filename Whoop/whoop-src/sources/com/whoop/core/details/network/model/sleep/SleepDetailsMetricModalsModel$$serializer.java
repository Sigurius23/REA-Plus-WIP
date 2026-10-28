package com.whoop.core.details.network.model.sleep;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SleepDetailsMetricModalsModel$$serializer implements GeneratedSerializer<SleepDetailsMetricModalsModel> {
    public static final int $stable;
    public static final SleepDetailsMetricModalsModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SleepDetailsMetricModalsModel$$serializer sleepDetailsMetricModalsModel$$serializer = new SleepDetailsMetricModalsModel$$serializer();
        INSTANCE = sleepDetailsMetricModalsModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.core.details.network.model.sleep.SleepDetailsMetricModalsModel", sleepDetailsMetricModalsModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("sleepMetricType", false);
        pluginGeneratedSerialDescriptor.addElement("trend_type", false);
        pluginGeneratedSerialDescriptor.addElement("trendTitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("trendSubTitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("calibrationBodyDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("metricDescriptionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("individualMetricDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("individualMetricRangeDisplay", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SleepDetailsMetricModalsModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SleepDetailsMetricModalsModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), interfaceC23462hArr[1].getValue(), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SleepDetailsMetricModalsModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        SleepMetricTypeModel sleepMetricTypeModel;
        SleepMetricTrendType sleepMetricTrendType;
        String str5;
        String str6;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SleepDetailsMetricModalsModel.$childSerializers;
        int i14 = 7;
        int i15 = 6;
        SleepMetricTypeModel sleepMetricTypeModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            SleepMetricTypeModel sleepMetricTypeModel3 = (SleepMetricTypeModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            SleepMetricTrendType sleepMetricTrendType2 = (SleepMetricTrendType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            sleepMetricTrendType = sleepMetricTrendType2;
            sleepMetricTypeModel = sleepMetricTypeModel3;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            str2 = str9;
            str3 = str8;
            str6 = strDecodeStringElement2;
            str4 = str7;
            str5 = strDecodeStringElement;
            i13 = 255;
        } else {
            int i16 = 1;
            boolean z4 = true;
            int i17 = 0;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            SleepMetricTrendType sleepMetricTrendType3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 6;
                        i16 = 1;
                        break;
                    case 0:
                        sleepMetricTypeModel2 = (SleepMetricTypeModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), sleepMetricTypeModel2);
                        i17 |= 1;
                        i14 = 7;
                        i15 = 6;
                        i16 = 1;
                        break;
                    case 1:
                        sleepMetricTrendType3 = (SleepMetricTrendType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), sleepMetricTrendType3);
                        i17 |= 2;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 2:
                        i17 |= 4;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i14 = 7;
                        break;
                    case 3:
                        c3 = 4;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        c3 = 4;
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str13);
                        i17 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str12);
                        i17 |= 32;
                        break;
                    case 6:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StringSerializer.INSTANCE, str11);
                        i17 |= 64;
                        break;
                    case 7:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str10);
                        i17 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            str = str10;
            str2 = str11;
            str3 = str12;
            str4 = str13;
            sleepMetricTypeModel = sleepMetricTypeModel2;
            sleepMetricTrendType = sleepMetricTrendType3;
            str5 = strDecodeStringElement3;
            str6 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SleepDetailsMetricModalsModel(i13, sleepMetricTypeModel, sleepMetricTrendType, str5, str6, str4, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SleepDetailsMetricModalsModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SleepDetailsMetricModalsModel.write$Self$core_details_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
