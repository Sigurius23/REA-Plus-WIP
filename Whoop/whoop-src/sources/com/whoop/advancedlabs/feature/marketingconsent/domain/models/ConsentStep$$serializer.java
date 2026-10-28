package com.whoop.advancedlabs.feature.marketingconsent.domain.models;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ConsentStep$$serializer implements GeneratedSerializer<ConsentStep> {
    public static final int $stable;
    public static final ConsentStep$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ConsentStep$$serializer consentStep$$serializer = new ConsentStep$$serializer();
        INSTANCE = consentStep$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.advancedlabs.feature.marketingconsent.domain.models.ConsentStep", consentStep$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("itemsAboveToggle", false);
        pluginGeneratedSerialDescriptor.addElement("toggle", false);
        pluginGeneratedSerialDescriptor.addElement("itemsBelowToggle", false);
        pluginGeneratedSerialDescriptor.addElement("ctaWhenToggleOff", false);
        pluginGeneratedSerialDescriptor.addElement("ctaWhenToggleOn", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConsentStep$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ConsentStep.$childSerializers;
        ConsentButton$$serializer consentButton$$serializer = ConsentButton$$serializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), ConsentToggle$$serializer.INSTANCE, interfaceC23462hArr[2].getValue(), consentButton$$serializer, consentButton$$serializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ConsentStep deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        ConsentToggle consentToggle;
        List list2;
        ConsentButton consentButton;
        ConsentButton consentButton2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ConsentStep.$childSerializers;
        int i14 = 0;
        List list3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            ConsentToggle consentToggle2 = (ConsentToggle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ConsentToggle$$serializer.INSTANCE, null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            ConsentButton$$serializer consentButton$$serializer = ConsentButton$$serializer.INSTANCE;
            list2 = list5;
            list = list4;
            consentButton = (ConsentButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, consentButton$$serializer, null);
            consentButton2 = (ConsentButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, consentButton$$serializer, null);
            i13 = 31;
            consentToggle = consentToggle2;
        } else {
            int i15 = 1;
            int i16 = 0;
            ConsentToggle consentToggle3 = null;
            List list6 = null;
            ConsentButton consentButton3 = null;
            ConsentButton consentButton4 = null;
            while (i15 != 0) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                int i17 = i14;
                if (iDecodeElementIndex == -1) {
                    i14 = i17;
                    i15 = i14;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        consentToggle3 = (ConsentToggle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ConsentToggle$$serializer.INSTANCE, consentToggle3);
                        i16 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), list6);
                        i16 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        consentButton3 = (ConsentButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, ConsentButton$$serializer.INSTANCE, consentButton3);
                        i16 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        consentButton4 = (ConsentButton) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, ConsentButton$$serializer.INSTANCE, consentButton4);
                        i16 |= 16;
                    }
                    i14 = i17;
                } else {
                    list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list3);
                    i16 |= 1;
                    i14 = i17;
                }
            }
            i13 = i16;
            list = list3;
            consentToggle = consentToggle3;
            list2 = list6;
            consentButton = consentButton3;
            consentButton2 = consentButton4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ConsentStep(i13, list, consentToggle, list2, consentButton, consentButton2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ConsentStep value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ConsentStep.write$Self$advanced_labs_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
