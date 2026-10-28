package com.whoop.service.network.model.cycles;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/service/network/model/cycles/SleepActivityResponseV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SleepActivityResponseV2$$serializer implements GeneratedSerializer<SleepActivityResponseV2> {
    public static final SleepActivityResponseV2$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SleepActivityResponseV2$$serializer sleepActivityResponseV2$$serializer = new SleepActivityResponseV2$$serializer();
        INSTANCE = sleepActivityResponseV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.service.network.model.cycles.SleepActivityResponseV2", sleepActivityResponseV2$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("cycleId", false);
        pluginGeneratedSerialDescriptor.addElement("userId", false);
        pluginGeneratedSerialDescriptor.addElement("createdAt", false);
        pluginGeneratedSerialDescriptor.addElement("updatedAt", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("during", false);
        pluginGeneratedSerialDescriptor.addElement("timezone", false);
        pluginGeneratedSerialDescriptor.addElement("timezoneOffset", false);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        pluginGeneratedSerialDescriptor.addElement("scoreState", false);
        pluginGeneratedSerialDescriptor.addElement("scoreType", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("translatedType", false);
        pluginGeneratedSerialDescriptor.addElement("sourceId", false);
        pluginGeneratedSerialDescriptor.addElement("activity_v1_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SleepActivityResponseV2$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, LongSerializer.INSTANCE, intSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d, stringSerializer, stringSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3, intSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SleepActivityResponseV2 deserialize(InterfaceC40541d decoder) {
        long jDecodeLongElement;
        String str;
        String str2;
        String str3;
        int i13;
        int iDecodeIntElement;
        int i14;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            long jDecodeLongElement2 = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 1);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            int iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            String strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
            jDecodeLongElement = jDecodeLongElement2;
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            i13 = iDecodeIntElement2;
            str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 15);
            str11 = strDecodeStringElement8;
            i14 = 65535;
            str10 = strDecodeStringElement7;
            str9 = strDecodeStringElement6;
            str8 = strDecodeStringElement5;
            str7 = strDecodeStringElement4;
            i15 = iDecodeIntElement3;
            str5 = strDecodeStringElement2;
            str = str13;
            str6 = strDecodeStringElement3;
            str12 = strDecodeStringElement9;
            str4 = strDecodeStringElement;
        } else {
            int i16 = 15;
            jDecodeLongElement = 0;
            int iDecodeIntElement4 = 0;
            int i17 = 0;
            int iDecodeIntElement5 = 0;
            boolean z4 = true;
            String str14 = null;
            String str15 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            int iDecodeIntElement6 = 0;
            String str16 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i16 = 15;
                        break;
                    case 0:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i17 |= 1;
                        i16 = 15;
                        break;
                    case 1:
                        jDecodeLongElement = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i16 = 15;
                        break;
                    case 2:
                        i17 |= 4;
                        iDecodeIntElement6 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                        i16 = 15;
                        break;
                    case 3:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i16 = 15;
                        break;
                    case 4:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i17 |= 16;
                        i16 = 15;
                        break;
                    case 5:
                        iDecodeIntElement5 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
                        i17 |= 32;
                        i16 = 15;
                        break;
                    case 6:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i17 |= 64;
                        i16 = 15;
                        break;
                    case 7:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i17 |= 128;
                        i16 = 15;
                        break;
                    case 8:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str16);
                        i17 |= 256;
                        i16 = 15;
                        break;
                    case 9:
                        strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i17 |= 512;
                        i16 = 15;
                        break;
                    case 10:
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i16 = 15;
                        break;
                    case 11:
                        strDecodeStringElement17 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i16 = 15;
                        break;
                    case 12:
                        strDecodeStringElement18 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
                        i17 |= 4096;
                        i16 = 15;
                        break;
                    case 13:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str15);
                        i17 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i16 = 15;
                        break;
                    case 14:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str14);
                        i17 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        i16 = 15;
                        break;
                    case 15:
                        iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, i16);
                        i17 |= 32768;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str16;
            str2 = str14;
            str3 = str15;
            i13 = iDecodeIntElement6;
            iDecodeIntElement = iDecodeIntElement4;
            i14 = i17;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement14;
            str9 = strDecodeStringElement15;
            str10 = strDecodeStringElement16;
            str11 = strDecodeStringElement17;
            str12 = strDecodeStringElement18;
            i15 = iDecodeIntElement5;
        }
        long j7 = jDecodeLongElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SleepActivityResponseV2(i14, str4, j7, i13, str5, str6, i15, str7, str8, str, str9, str10, str11, str12, str3, str2, iDecodeIntElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SleepActivityResponseV2 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SleepActivityResponseV2.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
