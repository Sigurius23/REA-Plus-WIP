package com.whoop.data.remote.domain.dto;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.FloatSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/JournalMagnitudeDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class JournalMagnitudeDto$$serializer implements GeneratedSerializer<JournalMagnitudeDto> {
    public static final JournalMagnitudeDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        JournalMagnitudeDto$$serializer journalMagnitudeDto$$serializer = new JournalMagnitudeDto$$serializer();
        INSTANCE = journalMagnitudeDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.JournalMagnitudeDto", journalMagnitudeDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("interval", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("maximum_inclusive", false);
        pluginGeneratedSerialDescriptor.addElement("minimum_inclusive", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("units", false);
        pluginGeneratedSerialDescriptor.addElement("choices", false);
        pluginGeneratedSerialDescriptor.addElement("question_type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JournalMagnitudeDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = JournalMagnitudeDto.$childSerializers;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(floatSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(floatSerializer), AbstractC38195a.m122336d(floatSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final JournalMagnitudeDto deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        List list;
        String str2;
        String str3;
        Float f13;
        String str4;
        Float f14;
        Float f15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = JournalMagnitudeDto.$childSerializers;
        int i14 = 7;
        Float f16 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f17 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, floatSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            Float f18 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, floatSerializer, null);
            Float f19 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, floatSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            f15 = f19;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            str2 = str7;
            str3 = str6;
            i13 = 255;
            f14 = f18;
            str4 = str5;
            f13 = f17;
        } else {
            boolean z4 = true;
            int i15 = 0;
            String str8 = null;
            List list2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            Float f24 = null;
            Float f25 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        break;
                    case 0:
                        f16 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, FloatSerializer.INSTANCE, f16);
                        i15 |= 1;
                        i14 = 7;
                        break;
                    case 1:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str11);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        f24 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, FloatSerializer.INSTANCE, f24);
                        i15 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        f25 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, FloatSerializer.INSTANCE, f25);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str10);
                        i15 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str9);
                        i15 |= 32;
                        break;
                    case 6:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list2);
                        i15 |= 64;
                        break;
                    case 7:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str8);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            str = str8;
            list = list2;
            str2 = str9;
            str3 = str10;
            f13 = f16;
            str4 = str11;
            f14 = f24;
            f15 = f25;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new JournalMagnitudeDto(i13, f13, str4, f14, f15, str3, str2, list, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, JournalMagnitudeDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        JournalMagnitudeDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
