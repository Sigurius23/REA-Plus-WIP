package com.whoop.sage.onboarding.domain.models;

import com.whoop.navigation.C9598e;
import j72.EnumC21402g;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SageOnboardingGuidelinesAcknowledgeScreen$$serializer implements GeneratedSerializer<SageOnboardingGuidelinesAcknowledgeScreen> {
    public static final int $stable;
    public static final SageOnboardingGuidelinesAcknowledgeScreen$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SageOnboardingGuidelinesAcknowledgeScreen$$serializer sageOnboardingGuidelinesAcknowledgeScreen$$serializer = new SageOnboardingGuidelinesAcknowledgeScreen$$serializer();
        INSTANCE = sageOnboardingGuidelinesAcknowledgeScreen$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.sage.onboarding.domain.models.SageOnboardingGuidelinesAcknowledgeScreen", sageOnboardingGuidelinesAcknowledgeScreen$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("titleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("guidelines", false);
        pluginGeneratedSerialDescriptor.addElement("primaryButtonTextDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryButtonTextDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("primaryButtonNextId", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryButtonNavigation", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SageOnboardingGuidelinesAcknowledgeScreen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SageOnboardingGuidelinesAcknowledgeScreen.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, interfaceC23462hArr[2].getValue(), stringSerializer, stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SageOnboardingGuidelinesAcknowledgeScreen deserialize(InterfaceC40541d decoder) {
        int i13;
        C9598e c9598e;
        EnumC21402g enumC21402g;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SageOnboardingGuidelinesAcknowledgeScreen.$childSerializers;
        int i15 = 3;
        int i16 = 2;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            EnumC21402g enumC21402g2 = (EnumC21402g) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = strDecodeStringElement2;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            i13 = 127;
            enumC21402g = enumC21402g2;
            list = list2;
            str2 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i17 = 0;
            C9598e c9598e2 = null;
            EnumC21402g enumC21402g3 = null;
            String strDecodeStringElement6 = null;
            List list3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int i18 = i16;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i16 = i18;
                        break;
                    case 0:
                        i17 |= 1;
                        i16 = i18;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 = 3;
                        break;
                    case 1:
                        i14 = i18;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i16 = i14;
                        i15 = 3;
                        break;
                    case 2:
                        i14 = i18;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list3);
                        i17 |= 4;
                        i16 = i14;
                        i15 = 3;
                        break;
                    case 3:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i17 |= 8;
                        i16 = i18;
                        break;
                    case 4:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i17 |= 16;
                        i16 = i18;
                        break;
                    case 5:
                        enumC21402g3 = (EnumC21402g) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), enumC21402g3);
                        i17 |= 32;
                        i16 = i18;
                        break;
                    case 6:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), c9598e2);
                        i17 |= 64;
                        i16 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            c9598e = c9598e2;
            enumC21402g = enumC21402g3;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement6;
            list = list3;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SageOnboardingGuidelinesAcknowledgeScreen(i13, str, str2, list, str3, str4, enumC21402g, c9598e, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SageOnboardingGuidelinesAcknowledgeScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SageOnboardingGuidelinesAcknowledgeScreen.write$Self$sage_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
