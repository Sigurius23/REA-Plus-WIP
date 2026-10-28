package com.whoop.hormonalinsights.onboarding.domain.models;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MciOnboardingRequest$$serializer implements GeneratedSerializer<MciOnboardingRequest> {
    public static final int $stable;
    public static final MciOnboardingRequest$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MciOnboardingRequest$$serializer mciOnboardingRequest$$serializer = new MciOnboardingRequest$$serializer();
        INSTANCE = mciOnboardingRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingRequest", mciOnboardingRequest$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("interest", false);
        pluginGeneratedSerialDescriptor.addElement("contraceptionType", false);
        pluginGeneratedSerialDescriptor.addElement("typicalCycleLength", false);
        pluginGeneratedSerialDescriptor.addElement("lastPeriodDateRange", false);
        pluginGeneratedSerialDescriptor.addElement("removedPeriodDays", false);
        pluginGeneratedSerialDescriptor.addElement("symptoms", false);
        pluginGeneratedSerialDescriptor.addElement("goals", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MciOnboardingRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = MciOnboardingRequest.$childSerializers;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[0].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[1].getValue()), AbstractC38195a.m122336d(IntSerializer.INSTANCE), interfaceC23462hArr[3].getValue(), interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), interfaceC23462hArr[6].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MciOnboardingRequest deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        List list2;
        MciInterest mciInterest;
        ContraceptionType contraceptionType;
        Integer num;
        List list3;
        List list4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = MciOnboardingRequest.$childSerializers;
        int i14 = 6;
        MciInterest mciInterest2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            MciInterest mciInterest3 = (MciInterest) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            ContraceptionType contraceptionType2 = (ContraceptionType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, IntSerializer.INSTANCE, null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            List list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            List list7 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            mciInterest = mciInterest3;
            num = num2;
            i13 = 127;
            list2 = list7;
            list3 = list5;
            list4 = list6;
            contraceptionType = contraceptionType2;
        } else {
            int i15 = 1;
            boolean z4 = true;
            int i16 = 0;
            List list8 = null;
            List list9 = null;
            ContraceptionType contraceptionType3 = null;
            Integer num3 = null;
            List list10 = null;
            List list11 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        i15 = 1;
                        break;
                    case 0:
                        mciInterest2 = (MciInterest) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), mciInterest2);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 1;
                        break;
                    case 1:
                        contraceptionType3 = (ContraceptionType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), contraceptionType3);
                        i16 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, IntSerializer.INSTANCE, num3);
                        i16 |= 4;
                        i14 = 6;
                        break;
                    case 3:
                        list10 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), list10);
                        i16 |= 8;
                        break;
                    case 4:
                        list11 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), list11);
                        i16 |= 16;
                        break;
                    case 5:
                        list9 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), list9);
                        i16 |= 32;
                        break;
                    case 6:
                        list8 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), list8);
                        i16 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            list = list8;
            list2 = list9;
            mciInterest = mciInterest2;
            contraceptionType = contraceptionType3;
            num = num3;
            list3 = list10;
            list4 = list11;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MciOnboardingRequest(i13, mciInterest, contraceptionType, num, list3, list4, list2, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MciOnboardingRequest value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MciOnboardingRequest.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
