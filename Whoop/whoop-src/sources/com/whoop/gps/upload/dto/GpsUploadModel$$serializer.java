package com.whoop.gps.upload.dto;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/gps/upload/dto/GpsUploadModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/gps/upload/dto/GpsUploadModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/gps/upload/dto/GpsUploadModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/gps/upload/dto/GpsUploadModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GpsUploadModel$$serializer implements GeneratedSerializer<GpsUploadModel> {
    public static final int $stable;
    public static final GpsUploadModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GpsUploadModel$$serializer gpsUploadModel$$serializer = new GpsUploadModel$$serializer();
        INSTANCE = gpsUploadModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.gps.upload.dto.GpsUploadModel", gpsUploadModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("latitude", false);
        pluginGeneratedSerialDescriptor.addElement("longitude", false);
        pluginGeneratedSerialDescriptor.addElement("altitude", false);
        pluginGeneratedSerialDescriptor.addElement("horizontalAccuracyMeters", false);
        pluginGeneratedSerialDescriptor.addElement("verticalAccuracyMeters", false);
        pluginGeneratedSerialDescriptor.addElement("speed", true);
        pluginGeneratedSerialDescriptor.addElement("trigger", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GpsUploadModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(SpeedDataModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(StringSerializer.INSTANCE);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{LongSerializer.INSTANCE, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GpsUploadModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        double d3;
        SpeedDataModel speedDataModel;
        double d14;
        long j7;
        double d15;
        double d16;
        double d17;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
            double dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 2);
            double dDecodeDoubleElement3 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
            double dDecodeDoubleElement4 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 4);
            double dDecodeDoubleElement5 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 5);
            speedDataModel = (SpeedDataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, SpeedDataModel$$serializer.INSTANCE, null);
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, null);
            i13 = 255;
            d14 = dDecodeDoubleElement4;
            d3 = dDecodeDoubleElement;
            j7 = jDecodeLongElement;
            d15 = dDecodeDoubleElement2;
            d16 = dDecodeDoubleElement3;
            d17 = dDecodeDoubleElement5;
        } else {
            double dDecodeDoubleElement6 = 0.0d;
            boolean z4 = true;
            int i15 = 0;
            String str2 = null;
            long jDecodeLongElement2 = 0;
            double dDecodeDoubleElement7 = 0.0d;
            double dDecodeDoubleElement8 = 0.0d;
            double dDecodeDoubleElement9 = 0.0d;
            SpeedDataModel speedDataModel2 = null;
            double dDecodeDoubleElement10 = 0.0d;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        break;
                    case 0:
                        jDecodeLongElement2 = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 7;
                        break;
                    case 1:
                        dDecodeDoubleElement10 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        dDecodeDoubleElement7 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        dDecodeDoubleElement8 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        dDecodeDoubleElement6 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        dDecodeDoubleElement9 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        speedDataModel2 = (SpeedDataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, SpeedDataModel$$serializer.INSTANCE, speedDataModel2);
                        i15 |= 64;
                        break;
                    case 7:
                        str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str2);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            str = str2;
            d3 = dDecodeDoubleElement10;
            speedDataModel = speedDataModel2;
            d14 = dDecodeDoubleElement6;
            j7 = jDecodeLongElement2;
            d15 = dDecodeDoubleElement7;
            d16 = dDecodeDoubleElement8;
            d17 = dDecodeDoubleElement9;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GpsUploadModel(i13, j7, d3, d15, d16, d14, d17, speedDataModel, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GpsUploadModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GpsUploadModel.write$Self$gps_tracking_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
