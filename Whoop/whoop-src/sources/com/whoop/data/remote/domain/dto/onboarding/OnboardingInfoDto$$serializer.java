package com.whoop.data.remote.domain.dto.onboarding;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class OnboardingInfoDto$$serializer implements GeneratedSerializer<OnboardingInfoDto> {
    public static final OnboardingInfoDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        OnboardingInfoDto$$serializer onboardingInfoDto$$serializer = new OnboardingInfoDto$$serializer();
        INSTANCE = onboardingInfoDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.onboarding.OnboardingInfoDto", onboardingInfoDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("requireCreditCard", false);
        pluginGeneratedSerialDescriptor.addElement("requireTeamCode", false);
        pluginGeneratedSerialDescriptor.addElement("isUsedStrap", false);
        pluginGeneratedSerialDescriptor.addElement("strapMembershipStatus", false);
        pluginGeneratedSerialDescriptor.addElement("team", false);
        pluginGeneratedSerialDescriptor.addElement("pairedTextOverride", false);
        pluginGeneratedSerialDescriptor.addElement("numTrialMonths", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OnboardingInfoDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(StringSerializer.INSTANCE), AbstractC38195a.m122336d(OnboardingTeamInfoDto$$serializer.INSTANCE), AbstractC38195a.m122336d(OnboardingPairedTextOverrideDto$$serializer.INSTANCE), IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final OnboardingInfoDto deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto;
        int i13;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str;
        OnboardingTeamInfoDto onboardingTeamInfoDto;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, booleanSerializer, null);
            Boolean bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, booleanSerializer, null);
            Boolean bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, booleanSerializer, null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            OnboardingTeamInfoDto onboardingTeamInfoDto2 = (OnboardingTeamInfoDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, OnboardingTeamInfoDto$$serializer.INSTANCE, null);
            OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto2 = (OnboardingPairedTextOverrideDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, OnboardingPairedTextOverrideDto$$serializer.INSTANCE, null);
            bool3 = bool6;
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
            onboardingPairedTextOverrideDto = onboardingPairedTextOverrideDto2;
            str = str2;
            onboardingTeamInfoDto = onboardingTeamInfoDto2;
            i13 = 127;
            bool2 = bool5;
            bool = bool4;
        } else {
            boolean z4 = true;
            int iDecodeIntElement2 = 0;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            String str3 = null;
            OnboardingTeamInfoDto onboardingTeamInfoDto3 = null;
            int i15 = 0;
            OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        break;
                    case 0:
                        bool7 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, BooleanSerializer.INSTANCE, bool7);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        bool8 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, BooleanSerializer.INSTANCE, bool8);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        bool9 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, BooleanSerializer.INSTANCE, bool9);
                        i15 |= 4;
                        break;
                    case 3:
                        str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str3);
                        i15 |= 8;
                        break;
                    case 4:
                        onboardingTeamInfoDto3 = (OnboardingTeamInfoDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, OnboardingTeamInfoDto$$serializer.INSTANCE, onboardingTeamInfoDto3);
                        i15 |= 16;
                        break;
                    case 5:
                        onboardingPairedTextOverrideDto3 = (OnboardingPairedTextOverrideDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, OnboardingPairedTextOverrideDto$$serializer.INSTANCE, onboardingPairedTextOverrideDto3);
                        i15 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, i14);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            onboardingPairedTextOverrideDto = onboardingPairedTextOverrideDto3;
            i13 = i15;
            bool = bool7;
            bool2 = bool8;
            bool3 = bool9;
            str = str3;
            onboardingTeamInfoDto = onboardingTeamInfoDto3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new OnboardingInfoDto(i13, bool, bool2, bool3, str, onboardingTeamInfoDto, onboardingPairedTextOverrideDto, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, OnboardingInfoDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        OnboardingInfoDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
