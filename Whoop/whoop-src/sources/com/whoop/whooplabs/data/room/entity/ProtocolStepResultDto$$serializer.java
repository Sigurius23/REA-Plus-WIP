package com.whoop.whooplabs.data.room.entity;

import java.util.Date;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u82.C34641b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/whooplabs/data/room/entity/ProtocolStepResultDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ProtocolStepResultDto$$serializer implements GeneratedSerializer<ProtocolStepResultDto> {
    public static final int $stable;
    public static final ProtocolStepResultDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ProtocolStepResultDto$$serializer protocolStepResultDto$$serializer = new ProtocolStepResultDto$$serializer();
        INSTANCE = protocolStepResultDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.whooplabs.data.room.entity.ProtocolStepResultDto", protocolStepResultDto$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("start_timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("end_timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("mystic_readings", false);
        pluginGeneratedSerialDescriptor.addElement("numberInput", false);
        pluginGeneratedSerialDescriptor.addElement("text_selection", false);
        pluginGeneratedSerialDescriptor.addElement("textInput", false);
        pluginGeneratedSerialDescriptor.addElement("time_picker", false);
        pluginGeneratedSerialDescriptor.addElement("datetime_picker", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProtocolStepResultDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        C34641b c34641b = C34641b.f145940a;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(c34641b);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(c34641b);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(ProtocolStepMysticReadingDto$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(intSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(c34641b), AbstractC38195a.m122336d(c34641b)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ProtocolStepResultDto deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        Date date;
        Date date2;
        String str;
        String str2;
        Integer num;
        int i13;
        Date date3;
        Date date4;
        ProtocolStepMysticReadingDto protocolStepMysticReadingDto;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            C34641b c34641b = C34641b.f145940a;
            Date date5 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, c34641b, null);
            Date date6 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, c34641b, null);
            ProtocolStepMysticReadingDto protocolStepMysticReadingDto2 = (ProtocolStepMysticReadingDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ProtocolStepMysticReadingDto$$serializer.INSTANCE, null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, IntSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            date = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, c34641b, null);
            str = str4;
            str2 = str3;
            protocolStepMysticReadingDto = protocolStepMysticReadingDto2;
            date2 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, c34641b, null);
            num = num2;
            date4 = date6;
            date3 = date5;
            i13 = 511;
        } else {
            boolean z4 = true;
            iDecodeIntElement = 0;
            Date date7 = null;
            Date date8 = null;
            String str5 = null;
            String str6 = null;
            Date date9 = null;
            Date date10 = null;
            ProtocolStepMysticReadingDto protocolStepMysticReadingDto3 = null;
            int i15 = 0;
            Integer num3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 7;
                        break;
                    case 1:
                        date9 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, C34641b.f145940a, date9);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        date10 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, C34641b.f145940a, date10);
                        i15 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        protocolStepMysticReadingDto3 = (ProtocolStepMysticReadingDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ProtocolStepMysticReadingDto$$serializer.INSTANCE, protocolStepMysticReadingDto3);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, IntSerializer.INSTANCE, num3);
                        i15 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str6);
                        i15 |= 32;
                        i14 = 7;
                        break;
                    case 6:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str5);
                        i15 |= 64;
                        break;
                    case 7:
                        date7 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, C34641b.f145940a, date7);
                        i15 |= 128;
                        break;
                    case 8:
                        date8 = (Date) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, C34641b.f145940a, date8);
                        i15 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            date = date7;
            date2 = date8;
            str = str5;
            str2 = str6;
            num = num3;
            i13 = i15;
            date3 = date9;
            date4 = date10;
            protocolStepMysticReadingDto = protocolStepMysticReadingDto3;
        }
        int i16 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ProtocolStepResultDto(i13, i16, date3, date4, protocolStepMysticReadingDto, num, str2, str, date, date2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ProtocolStepResultDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ProtocolStepResultDto.write$Self$whooplabs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
