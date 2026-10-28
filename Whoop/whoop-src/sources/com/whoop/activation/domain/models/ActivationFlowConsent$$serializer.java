package com.whoop.activation.domain.models;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/ActivationFlowConsent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/ActivationFlowConsent;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/ActivationFlowConsent;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/ActivationFlowConsent;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ActivationFlowConsent$$serializer implements GeneratedSerializer<ActivationFlowConsent> {
    public static final int $stable;
    public static final ActivationFlowConsent$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ActivationFlowConsent$$serializer activationFlowConsent$$serializer = new ActivationFlowConsent$$serializer();
        INSTANCE = activationFlowConsent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.ActivationFlowConsent", activationFlowConsent$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("ids", false);
        pluginGeneratedSerialDescriptor.addElement("summary", false);
        pluginGeneratedSerialDescriptor.addElement("expansion", false);
        pluginGeneratedSerialDescriptor.addElement("expansionRequired", false);
        pluginGeneratedSerialDescriptor.addElement("required", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivationFlowConsent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ActivationFlowConsent.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), StringSerializer.INSTANCE, interfaceC23462hArr[2].getValue(), booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ActivationFlowConsent deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        boolean zDecodeBooleanElement2;
        int i13;
        List list;
        String str;
        ActivationFlowTermExpansion activationFlowTermExpansion;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ActivationFlowConsent.$childSerializers;
        int i14 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            activationFlowTermExpansion = (ActivationFlowTermExpansion) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            list = list2;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            i13 = 31;
            str = strDecodeStringElement;
        } else {
            int i15 = 1;
            boolean zDecodeBooleanElement3 = false;
            int i16 = 0;
            List list3 = null;
            String strDecodeStringElement2 = null;
            ActivationFlowTermExpansion activationFlowTermExpansion2 = null;
            boolean zDecodeBooleanElement4 = false;
            while (i15 != 0) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                int i17 = i14;
                if (iDecodeElementIndex == -1) {
                    i14 = i17;
                    i15 = i14;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        activationFlowTermExpansion2 = (ActivationFlowTermExpansion) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), activationFlowTermExpansion2);
                        i16 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        i16 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i16 |= 16;
                    }
                    i14 = i17;
                } else {
                    list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list3);
                    i16 |= 1;
                    i14 = i17;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            zDecodeBooleanElement2 = zDecodeBooleanElement4;
            i13 = i16;
            list = list3;
            str = strDecodeStringElement2;
            activationFlowTermExpansion = activationFlowTermExpansion2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ActivationFlowConsent(i13, list, str, activationFlowTermExpansion, zDecodeBooleanElement, zDecodeBooleanElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ActivationFlowConsent value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ActivationFlowConsent.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
