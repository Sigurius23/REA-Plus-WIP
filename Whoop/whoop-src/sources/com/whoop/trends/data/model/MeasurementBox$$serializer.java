package com.whoop.trends.data.model;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/trends/data/model/MeasurementBox.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/trends/data/model/MeasurementBox;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/trends/data/model/MeasurementBox;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/trends/data/model/MeasurementBox;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MeasurementBox$$serializer implements GeneratedSerializer<MeasurementBox> {
    public static final int $stable;
    public static final MeasurementBox$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MeasurementBox$$serializer measurementBox$$serializer = new MeasurementBox$$serializer();
        INSTANCE = measurementBox$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.trends.data.model.MeasurementBox", measurementBox$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("icon_url", false);
        pluginGeneratedSerialDescriptor.addElement("weight", false);
        pluginGeneratedSerialDescriptor.addElement("metric_unit", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("weight_details_screen", false);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MeasurementBox$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), DoubleSerializer.INSTANCE, stringSerializer, stringSerializer, AbstractC38195a.m122336d(ManualMeasurementSheet$$serializer.INSTANCE), stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MeasurementBox deserialize(InterfaceC40541d decoder) {
        int i13;
        ManualMeasurementSheet manualMeasurementSheet;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strDecodeStringElement;
        double d3;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            ManualMeasurementSheet manualMeasurementSheet2 = (ManualMeasurementSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, ManualMeasurementSheet$$serializer.INSTANCE, null);
            str = strDecodeStringElement3;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            manualMeasurementSheet = manualMeasurementSheet2;
            str5 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            i13 = 255;
            str3 = str7;
            str2 = str6;
            d3 = dDecodeDoubleElement;
        } else {
            boolean z13 = true;
            int i15 = 0;
            ManualMeasurementSheet manualMeasurementSheet3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            double dDecodeDoubleElement2 = 0.0d;
            String str8 = null;
            String str9 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        z4 = true;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 7;
                        break;
                    case 1:
                        z4 = true;
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str8);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str9);
                        i15 |= 4;
                        break;
                    case 3:
                        dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        manualMeasurementSheet3 = (ManualMeasurementSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, ManualMeasurementSheet$$serializer.INSTANCE, manualMeasurementSheet3);
                        i15 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            manualMeasurementSheet = manualMeasurementSheet3;
            str = strDecodeStringElement2;
            str2 = str8;
            str3 = str9;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement8;
            d3 = dDecodeDoubleElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MeasurementBox(i13, str, str2, str3, d3, str4, str5, manualMeasurementSheet, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MeasurementBox value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MeasurementBox.write$Self$trends_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
