package com.whoop.trends.data.model;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/trends/data/model/ManualMeasurementSheet.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/trends/data/model/ManualMeasurementSheet;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ManualMeasurementSheet$$serializer implements GeneratedSerializer<ManualMeasurementSheet> {
    public static final int $stable;
    public static final ManualMeasurementSheet$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ManualMeasurementSheet$$serializer manualMeasurementSheet$$serializer = new ManualMeasurementSheet$$serializer();
        INSTANCE = manualMeasurementSheet$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.trends.data.model.ManualMeasurementSheet", manualMeasurementSheet$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("start_date_timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("weight_kg", false);
        pluginGeneratedSerialDescriptor.addElement("body_fat_percent", false);
        pluginGeneratedSerialDescriptor.addElement("lean_body_mass_kg", false);
        pluginGeneratedSerialDescriptor.addElement("body_fat_suffix", false);
        pluginGeneratedSerialDescriptor.addElement("lean_body_mass_suffix", false);
        pluginGeneratedSerialDescriptor.addElement("metric_type", false);
        pluginGeneratedSerialDescriptor.addElement("replace_dialog", false);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        pluginGeneratedSerialDescriptor.addElement("save_title", false);
        pluginGeneratedSerialDescriptor.addElement("delete_title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ManualMeasurementSheet$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, doubleSerializer, AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(ReplaceDialog$$serializer.INSTANCE), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ManualMeasurementSheet deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        ReplaceDialog replaceDialog;
        String str2;
        String str3;
        Double d3;
        Double d14;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        double d15;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 11;
        int i15 = 10;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 2);
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d16 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, doubleSerializer, null);
            Double d17 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, doubleSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            ReplaceDialog replaceDialog2 = (ReplaceDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ReplaceDialog$$serializer.INSTANCE, null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            str4 = strDecodeStringElement2;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            str2 = str10;
            str8 = strDecodeStringElement6;
            str7 = strDecodeStringElement5;
            str3 = str9;
            str6 = strDecodeStringElement4;
            d14 = d16;
            replaceDialog = replaceDialog2;
            d3 = d17;
            i13 = 4095;
            str5 = strDecodeStringElement3;
            d15 = dDecodeDoubleElement;
        } else {
            boolean z4 = true;
            int i16 = 0;
            String str11 = null;
            ReplaceDialog replaceDialog3 = null;
            String str12 = null;
            String str13 = null;
            Double d18 = null;
            Double d19 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            double dDecodeDoubleElement2 = 0.0d;
            String strDecodeStringElement10 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 11;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 11;
                        i15 = 10;
                        break;
                    case 1:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 11;
                        i15 = 10;
                        break;
                    case 2:
                        dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 11;
                        i15 = 10;
                        break;
                    case 3:
                        d19 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DoubleSerializer.INSTANCE, d19);
                        i16 |= 8;
                        i14 = 11;
                        i15 = 10;
                        break;
                    case 4:
                        d18 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DoubleSerializer.INSTANCE, d18);
                        i16 |= 16;
                        i14 = 11;
                        i15 = 10;
                        break;
                    case 5:
                        c3 = 6;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i14 = 11;
                        break;
                    case 6:
                        c3 = 6;
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str13);
                        i16 |= 64;
                        i14 = 11;
                        break;
                    case 7:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i16 |= 128;
                        break;
                    case 8:
                        replaceDialog3 = (ReplaceDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ReplaceDialog$$serializer.INSTANCE, replaceDialog3);
                        i16 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i16 |= 512;
                        break;
                    case 10:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StringSerializer.INSTANCE, str12);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    case 11:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str11);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            str = str11;
            replaceDialog = replaceDialog3;
            str2 = str12;
            str3 = str13;
            d3 = d18;
            d14 = d19;
            str4 = strDecodeStringElement;
            str5 = strDecodeStringElement10;
            str6 = strDecodeStringElement7;
            str7 = strDecodeStringElement8;
            str8 = strDecodeStringElement9;
            d15 = dDecodeDoubleElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ManualMeasurementSheet(i13, str4, str5, d15, d14, d3, str6, str3, str7, replaceDialog, str8, str2, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ManualMeasurementSheet value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ManualMeasurementSheet.write$Self$trends_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
