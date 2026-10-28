package com.whoop.data.remote.domain.dto;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/OptimalStrainMapping.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class OptimalStrainMapping$$serializer implements GeneratedSerializer<OptimalStrainMapping> {
    public static final OptimalStrainMapping$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        OptimalStrainMapping$$serializer optimalStrainMapping$$serializer = new OptimalStrainMapping$$serializer();
        INSTANCE = optimalStrainMapping$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.OptimalStrainMapping", optimalStrainMapping$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("recovery", false);
        pluginGeneratedSerialDescriptor.addElement("lowerOptimalStrain", false);
        pluginGeneratedSerialDescriptor.addElement("optimalStrain", false);
        pluginGeneratedSerialDescriptor.addElement("upperOptimalStrain", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OptimalStrainMapping$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(IntSerializer.INSTANCE);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer), AbstractC38195a.m122336d(doubleSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final OptimalStrainMapping deserialize(InterfaceC40541d decoder) {
        int i13;
        Integer num;
        Double d3;
        Double d14;
        Double d15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        Integer num2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            Integer num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, IntSerializer.INSTANCE, null);
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d16 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, doubleSerializer, null);
            Double d17 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, doubleSerializer, null);
            num = num3;
            d15 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, doubleSerializer, null);
            d14 = d17;
            d3 = d16;
            i13 = 15;
        } else {
            boolean z4 = true;
            int i14 = 0;
            Double d18 = null;
            Double d19 = null;
            Double d24 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, IntSerializer.INSTANCE, num2);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    d18 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, DoubleSerializer.INSTANCE, d18);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    d19 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, DoubleSerializer.INSTANCE, d19);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    d24 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DoubleSerializer.INSTANCE, d24);
                    i14 |= 8;
                }
            }
            i13 = i14;
            num = num2;
            d3 = d18;
            d14 = d19;
            d15 = d24;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new OptimalStrainMapping(i13, num, d3, d14, d15, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, OptimalStrainMapping value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        OptimalStrainMapping.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
