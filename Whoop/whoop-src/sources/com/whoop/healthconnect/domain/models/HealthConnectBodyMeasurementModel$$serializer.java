package com.whoop.healthconnect.domain.models;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HealthConnectBodyMeasurementModel$$serializer implements GeneratedSerializer<HealthConnectBodyMeasurementModel> {
    public static final int $stable;
    public static final HealthConnectBodyMeasurementModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HealthConnectBodyMeasurementModel$$serializer healthConnectBodyMeasurementModel$$serializer = new HealthConnectBodyMeasurementModel$$serializer();
        INSTANCE = healthConnectBodyMeasurementModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.healthconnect.domain.models.HealthConnectBodyMeasurementModel", healthConnectBodyMeasurementModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("zoneOffset", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", false);
        pluginGeneratedSerialDescriptor.addElement("deviceZoneId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HealthConnectBodyMeasurementModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, DoubleSerializer.INSTANCE, stringSerializer, AbstractC38195a.m122336d(stringSerializer), HealthConnectMetadataModel$$serializer.INSTANCE, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HealthConnectBodyMeasurementModel deserialize(InterfaceC40541d decoder) {
        String strDecodeStringElement;
        int i13;
        double d3;
        String str;
        String str2;
        HealthConnectMetadataModel healthConnectMetadataModel;
        String strDecodeStringElement2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            HealthConnectMetadataModel healthConnectMetadataModel2 = (HealthConnectMetadataModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, HealthConnectMetadataModel$$serializer.INSTANCE, null);
            i13 = 63;
            strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            str2 = str3;
            healthConnectMetadataModel = healthConnectMetadataModel2;
            str = strDecodeStringElement3;
            d3 = dDecodeDoubleElement;
        } else {
            double dDecodeDoubleElement2 = 0.0d;
            boolean z4 = true;
            strDecodeStringElement = null;
            String strDecodeStringElement4 = null;
            String str4 = null;
            HealthConnectMetadataModel healthConnectMetadataModel3 = null;
            String strDecodeStringElement5 = null;
            i13 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        continue;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        continue;
                    case 1:
                        dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
                        i13 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str4);
                        i13 |= 8;
                        break;
                    case 4:
                        healthConnectMetadataModel3 = (HealthConnectMetadataModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, HealthConnectMetadataModel$$serializer.INSTANCE, healthConnectMetadataModel3);
                        i13 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            d3 = dDecodeDoubleElement2;
            str = strDecodeStringElement4;
            str2 = str4;
            healthConnectMetadataModel = healthConnectMetadataModel3;
            strDecodeStringElement2 = strDecodeStringElement5;
        }
        String str5 = strDecodeStringElement;
        int i14 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HealthConnectBodyMeasurementModel(i14, str5, d3, str, str2, healthConnectMetadataModel, strDecodeStringElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HealthConnectBodyMeasurementModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HealthConnectBodyMeasurementModel.write$Self$health_connect_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
