package com.whoop.advancedlabs.feature.marketingconsent.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MarketingConsentScreenResponse$$serializer implements GeneratedSerializer<MarketingConsentScreenResponse> {
    public static final int $stable;
    public static final MarketingConsentScreenResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MarketingConsentScreenResponse$$serializer marketingConsentScreenResponse$$serializer = new MarketingConsentScreenResponse$$serializer();
        INSTANCE = marketingConsentScreenResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.feature.marketingconsent.domain.models.MarketingConsentScreenResponse", marketingConsentScreenResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("headerImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("consentStep", false);
        pluginGeneratedSerialDescriptor.addElement("optedInConfirmation", false);
        pluginGeneratedSerialDescriptor.addElement("skippedConfirmation", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MarketingConsentScreenResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        ConfirmationStep$$serializer confirmationStep$$serializer = ConfirmationStep$$serializer.INSTANCE;
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, ConsentStep$$serializer.INSTANCE, confirmationStep$$serializer, confirmationStep$$serializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MarketingConsentScreenResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        ConsentStep consentStep;
        ConfirmationStep confirmationStep;
        ConfirmationStep confirmationStep2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            ConsentStep consentStep2 = (ConsentStep) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ConsentStep$$serializer.INSTANCE, null);
            ConfirmationStep$$serializer confirmationStep$$serializer = ConfirmationStep$$serializer.INSTANCE;
            ConfirmationStep confirmationStep3 = (ConfirmationStep) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, confirmationStep$$serializer, null);
            str = strDecodeStringElement2;
            confirmationStep2 = (ConfirmationStep) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, confirmationStep$$serializer, null);
            confirmationStep = confirmationStep3;
            consentStep = consentStep2;
            i13 = 15;
        } else {
            boolean z4 = true;
            int i14 = 0;
            ConsentStep consentStep3 = null;
            ConfirmationStep confirmationStep4 = null;
            ConfirmationStep confirmationStep5 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    consentStep3 = (ConsentStep) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ConsentStep$$serializer.INSTANCE, consentStep3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    confirmationStep4 = (ConfirmationStep) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, ConfirmationStep$$serializer.INSTANCE, confirmationStep4);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    confirmationStep5 = (ConfirmationStep) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, ConfirmationStep$$serializer.INSTANCE, confirmationStep5);
                    i14 |= 8;
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            consentStep = consentStep3;
            confirmationStep = confirmationStep4;
            confirmationStep2 = confirmationStep5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MarketingConsentScreenResponse(i13, str, consentStep, confirmationStep, confirmationStep2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MarketingConsentScreenResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MarketingConsentScreenResponse.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
