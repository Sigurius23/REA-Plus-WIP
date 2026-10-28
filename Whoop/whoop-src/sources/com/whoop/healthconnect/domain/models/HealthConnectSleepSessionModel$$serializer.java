package com.whoop.healthconnect.domain.models;

import java.util.List;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HealthConnectSleepSessionModel$$serializer implements GeneratedSerializer<HealthConnectSleepSessionModel> {
    public static final int $stable;
    public static final HealthConnectSleepSessionModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HealthConnectSleepSessionModel$$serializer healthConnectSleepSessionModel$$serializer = new HealthConnectSleepSessionModel$$serializer();
        INSTANCE = healthConnectSleepSessionModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.healthconnect.domain.models.HealthConnectSleepSessionModel", healthConnectSleepSessionModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("notes", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("startTime", false);
        pluginGeneratedSerialDescriptor.addElement("startZoneOffset", false);
        pluginGeneratedSerialDescriptor.addElement("endTime", false);
        pluginGeneratedSerialDescriptor.addElement("endZoneOffset", false);
        pluginGeneratedSerialDescriptor.addElement("stages", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HealthConnectSleepSessionModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HealthConnectSleepSessionModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d(HealthConnectMetadataModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HealthConnectSleepSessionModel deserialize(InterfaceC40541d decoder) {
        int i13;
        HealthConnectMetadataModel healthConnectMetadataModel;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HealthConnectSleepSessionModel.$childSerializers;
        int i14 = 7;
        int i15 = 5;
        String str7 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = str11;
            healthConnectMetadataModel = (HealthConnectMetadataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, HealthConnectMetadataModel$$serializer.INSTANCE, null);
            i13 = 255;
            str5 = str10;
            str6 = strDecodeStringElement2;
            str4 = strDecodeStringElement;
            str3 = str9;
            str2 = str8;
        } else {
            boolean z4 = true;
            int i16 = 0;
            HealthConnectMetadataModel healthConnectMetadataModel2 = null;
            List list2 = null;
            String str12 = null;
            String str13 = null;
            String strDecodeStringElement3 = null;
            String str14 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 5;
                        break;
                    case 0:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str7);
                        i16 |= 1;
                        i14 = 7;
                        i15 = 5;
                        break;
                    case 1:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str13);
                        i16 |= 2;
                        i14 = 7;
                        i15 = 5;
                        break;
                    case 2:
                        c3 = 3;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        c3 = 3;
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str14);
                        i16 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, StringSerializer.INSTANCE, str12);
                        i16 |= 32;
                        break;
                    case 6:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list2);
                        i16 |= 64;
                        break;
                    case 7:
                        healthConnectMetadataModel2 = (HealthConnectMetadataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, HealthConnectMetadataModel$$serializer.INSTANCE, healthConnectMetadataModel2);
                        i16 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            healthConnectMetadataModel = healthConnectMetadataModel2;
            list = list2;
            str = str12;
            str2 = str7;
            str3 = str13;
            str4 = strDecodeStringElement3;
            str5 = str14;
            str6 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HealthConnectSleepSessionModel(i13, str2, str3, str4, str5, str6, str, list, healthConnectMetadataModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HealthConnectSleepSessionModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HealthConnectSleepSessionModel.write$Self$health_connect_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
