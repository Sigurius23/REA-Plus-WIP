package com.whoop.data.remote.domain.dto;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/TrackerInputDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/TrackerInputDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/TrackerInputDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/TrackerInputDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TrackerInputDto$$serializer implements GeneratedSerializer<TrackerInputDto> {
    public static final TrackerInputDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TrackerInputDto$$serializer trackerInputDto$$serializer = new TrackerInputDto$$serializer();
        INSTANCE = trackerInputDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.TrackerInputDto", trackerInputDto$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("answeredYes", false);
        pluginGeneratedSerialDescriptor.addElement("behaviorTrackerId", false);
        pluginGeneratedSerialDescriptor.addElement("createdAt", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("journalEntryId", true);
        pluginGeneratedSerialDescriptor.addElement("magnitudeInputLabel", false);
        pluginGeneratedSerialDescriptor.addElement("magnitudeInputValue", false);
        pluginGeneratedSerialDescriptor.addElement("timeInputLabel", false);
        pluginGeneratedSerialDescriptor.addElement("timeInputValue", false);
        pluginGeneratedSerialDescriptor.addElement("updatedAt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrackerInputDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(BooleanSerializer.INSTANCE);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(doubleSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(intSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, intSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(LongSerializer.INSTANCE), AbstractC38195a.m122336d(doubleSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TrackerInputDto deserialize(InterfaceC40541d decoder) {
        int i13;
        Double d3;
        Long l7;
        Double d14;
        String str;
        String str2;
        Integer num;
        Integer num2;
        int i14;
        Boolean bool;
        Double d15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i15 = 9;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, BooleanSerializer.INSTANCE, null);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d16 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, doubleSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, intSerializer, null);
            Integer num4 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            Double d17 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, doubleSerializer, null);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            Long l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, LongSerializer.INSTANCE, null);
            bool = bool2;
            d3 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, doubleSerializer, null);
            str = str4;
            d14 = d17;
            str2 = str3;
            num2 = num3;
            l7 = l12;
            num = num4;
            d15 = d16;
            i13 = iDecodeIntElement;
            i14 = 1023;
        } else {
            boolean z4 = true;
            int iDecodeIntElement2 = 0;
            Double d18 = null;
            Long l13 = null;
            Double d19 = null;
            String str5 = null;
            String str6 = null;
            Integer num5 = null;
            Boolean bool3 = null;
            Double d24 = null;
            int i16 = 0;
            Integer num6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, BooleanSerializer.INSTANCE, bool3);
                        i16 |= 1;
                        i15 = 9;
                        break;
                    case 1:
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i15 = 9;
                        break;
                    case 2:
                        d24 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, DoubleSerializer.INSTANCE, d24);
                        i16 |= 4;
                        i15 = 9;
                        break;
                    case 3:
                        num6 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, IntSerializer.INSTANCE, num6);
                        i16 |= 8;
                        i15 = 9;
                        break;
                    case 4:
                        num5 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, IntSerializer.INSTANCE, num5);
                        i16 |= 16;
                        i15 = 9;
                        break;
                    case 5:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str6);
                        i16 |= 32;
                        i15 = 9;
                        break;
                    case 6:
                        d19 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, DoubleSerializer.INSTANCE, d19);
                        i16 |= 64;
                        i15 = 9;
                        break;
                    case 7:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str5);
                        i16 |= 128;
                        i15 = 9;
                        break;
                    case 8:
                        l13 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, LongSerializer.INSTANCE, l13);
                        i16 |= 256;
                        break;
                    case 9:
                        d18 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, DoubleSerializer.INSTANCE, d18);
                        i16 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = iDecodeIntElement2;
            d3 = d18;
            l7 = l13;
            d14 = d19;
            str = str5;
            str2 = str6;
            num = num5;
            num2 = num6;
            i14 = i16;
            bool = bool3;
            d15 = d24;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TrackerInputDto(i14, bool, i13, d15, num2, num, str2, d14, str, l7, d3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TrackerInputDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TrackerInputDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
