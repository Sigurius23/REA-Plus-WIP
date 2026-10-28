package com.whoop.home.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/home/domain/models/CycleMetaData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/home/domain/models/CycleMetaData;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/home/domain/models/CycleMetaData;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/home/domain/models/CycleMetaData;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CycleMetaData$$serializer implements GeneratedSerializer<CycleMetaData> {
    public static final int $stable;
    public static final CycleMetaData$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CycleMetaData$$serializer cycleMetaData$$serializer = new CycleMetaData$$serializer();
        INSTANCE = cycleMetaData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.home.domain.models.CycleMetaData", cycleMetaData$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("cycleId", false);
        pluginGeneratedSerialDescriptor.addElement("cycleDays", false);
        pluginGeneratedSerialDescriptor.addElement("cycleDateDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("previousCycleDay", false);
        pluginGeneratedSerialDescriptor.addElement("nextCycleDay", false);
        pluginGeneratedSerialDescriptor.addElement("multiDayCycle", false);
        pluginGeneratedSerialDescriptor.addElement("has_multi_day_cycle_cta_tile", false);
        pluginGeneratedSerialDescriptor.addElement("sleepState", false);
        pluginGeneratedSerialDescriptor.addElement("day_zero", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CycleMetaData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{LongSerializer.INSTANCE, CycleDays$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(booleanSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CycleMetaData deserialize(InterfaceC40541d decoder) {
        boolean z4;
        Boolean bool;
        String str;
        boolean z13;
        int i13;
        CycleDays cycleDays;
        String str2;
        String str3;
        String str4;
        long j7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        int i15 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
            CycleDays cycleDays2 = (CycleDays) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, CycleDays$$serializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            cycleDays = cycleDays2;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, null);
            z4 = zDecodeBooleanElement2;
            z13 = zDecodeBooleanElement;
            str3 = strDecodeStringElement2;
            bool = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BooleanSerializer.INSTANCE, null);
            str4 = strDecodeStringElement3;
            str2 = strDecodeStringElement;
            i13 = 511;
            j7 = jDecodeLongElement;
        } else {
            boolean z14 = true;
            boolean zDecodeBooleanElement3 = false;
            Boolean bool2 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement4 = false;
            int i16 = 0;
            String str5 = null;
            CycleDays cycleDays3 = null;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        i14 = 7;
                        break;
                    case 0:
                        jDecodeLongElement2 = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 1:
                        cycleDays3 = (CycleDays) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, CycleDays$$serializer.INSTANCE, cycleDays3);
                        i16 |= 2;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 2:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i16 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i15);
                        i16 |= 64;
                        break;
                    case 7:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str5);
                        i16 |= 128;
                        break;
                    case 8:
                        bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BooleanSerializer.INSTANCE, bool2);
                        i16 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement3;
            bool = bool2;
            str = str5;
            z13 = zDecodeBooleanElement4;
            i13 = i16;
            cycleDays = cycleDays3;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            j7 = jDecodeLongElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CycleMetaData(i13, j7, cycleDays, str2, str3, str4, z13, z4, str, bool, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CycleMetaData value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CycleMetaData.write$Self$home_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
