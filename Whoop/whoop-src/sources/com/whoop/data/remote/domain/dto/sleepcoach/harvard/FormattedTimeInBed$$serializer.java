package com.whoop.data.remote.domain.dto.sleepcoach.harvard;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/FormattedTimeInBed;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FormattedTimeInBed$$serializer implements GeneratedSerializer<FormattedTimeInBed> {
    public static final FormattedTimeInBed$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FormattedTimeInBed$$serializer formattedTimeInBed$$serializer = new FormattedTimeInBed$$serializer();
        INSTANCE = formattedTimeInBed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.sleepcoach.harvard.FormattedTimeInBed", formattedTimeInBed$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("flexSleepTime", false);
        pluginGeneratedSerialDescriptor.addElement("maxPossibleSri", false);
        pluginGeneratedSerialDescriptor.addElement("optimalEndpointsFormatted", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedTimeInBed", false);
        pluginGeneratedSerialDescriptor.addElement("estimatedAwakeTimeString", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedTimeInBedTimeString", false);
        pluginGeneratedSerialDescriptor.addElement("sleepNeedTimeString", false);
        pluginGeneratedSerialDescriptor.addElement("projectedSleepConsistency", false);
        pluginGeneratedSerialDescriptor.addElement("sleepAdjustmentTimeString", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FormattedTimeInBed$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(OptimalEndpointsFormatted$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{BooleanSerializer.INSTANCE, intSerializer, interfaceC37138cM122336d, intSerializer, stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FormattedTimeInBed deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        String str;
        Integer num;
        int i13;
        int i14;
        int i15;
        OptimalEndpointsFormatted optimalEndpointsFormatted;
        String str2;
        String str3;
        String str4;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i16 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            OptimalEndpointsFormatted optimalEndpointsFormatted2 = (OptimalEndpointsFormatted) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, OptimalEndpointsFormatted$$serializer.INSTANCE, null);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            num = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, IntSerializer.INSTANCE, null);
            str4 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            i13 = iDecodeIntElement2;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, null);
            str2 = strDecodeStringElement;
            optimalEndpointsFormatted = optimalEndpointsFormatted2;
            i14 = iDecodeIntElement;
            i15 = 511;
        } else {
            boolean z4 = true;
            zDecodeBooleanElement = false;
            int iDecodeIntElement3 = 0;
            int i17 = 0;
            String str5 = null;
            OptimalEndpointsFormatted optimalEndpointsFormatted3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement4 = 0;
            Integer num2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i17 |= 1;
                        zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
                        i16 = 7;
                        break;
                    case 1:
                        c3 = 2;
                        iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i16 = 7;
                        break;
                    case 2:
                        c3 = 2;
                        optimalEndpointsFormatted3 = (OptimalEndpointsFormatted) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, OptimalEndpointsFormatted$$serializer.INSTANCE, optimalEndpointsFormatted3);
                        i17 |= 4;
                        i16 = 7;
                        break;
                    case 3:
                        iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
                        i17 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i17 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i17 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i17 |= 64;
                        break;
                    case 7:
                        num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, IntSerializer.INSTANCE, num2);
                        i17 |= 128;
                        break;
                    case 8:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str5);
                        i17 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str5;
            num = num2;
            i13 = iDecodeIntElement4;
            i14 = iDecodeIntElement3;
            i15 = i17;
            optimalEndpointsFormatted = optimalEndpointsFormatted3;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
        }
        boolean z13 = zDecodeBooleanElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FormattedTimeInBed(i15, z13, i14, optimalEndpointsFormatted, i13, str2, str3, str4, num, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FormattedTimeInBed value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FormattedTimeInBed.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
