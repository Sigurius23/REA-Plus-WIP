package com.amplitude.android.engagement.types;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"com/amplitude/android/engagement/types/ModalFormFactor.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/amplitude/android/engagement/types/ModalFormFactor;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/amplitude/android/engagement/types/ModalFormFactor;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/amplitude/android/engagement/types/ModalFormFactor;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class ModalFormFactor$$serializer implements GeneratedSerializer<ModalFormFactor> {
    public static final int $stable = 0;
    public static final ModalFormFactor$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ModalFormFactor$$serializer modalFormFactor$$serializer = new ModalFormFactor$$serializer();
        INSTANCE = modalFormFactor$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("modal", modalFormFactor$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("layout", true);
        pluginGeneratedSerialDescriptor.addElement("textAnimation", true);
        pluginGeneratedSerialDescriptor.addElement("mediaPosition", true);
        pluginGeneratedSerialDescriptor.addElement("titleAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("contentAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("canClickOutsideToClose", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ModalFormFactor$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = ModalFormFactor.$childSerializers;
        InterfaceC37138c interfaceC37138c = interfaceC37138cArr[0];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138c, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(interfaceC37138cArr[3]), AbstractC38195a.m122336d(interfaceC37138cArr[4]), BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public ModalFormFactor deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        Object objDecodeSerializableElement;
        int i13;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        InterfaceC37138c[] interfaceC37138cArr = ModalFormFactor.$childSerializers;
        int i14 = 5;
        int i15 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 0, interfaceC37138cArr[0], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            objDecodeNullableSerializableElement3 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, interfaceC37138cArr[3], null);
            objDecodeNullableSerializableElement4 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, interfaceC37138cArr[4], null);
            i13 = 63;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 5);
        } else {
            int i16 = 1;
            boolean zDecodeBooleanElement2 = false;
            Object objDecodeSerializableElement2 = null;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement6 = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeNullableSerializableElement8 = null;
            int i17 = 0;
            while (i16 != 0) {
                int i18 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i15 = i18;
                        i16 = i15;
                        i14 = 5;
                        break;
                    case 0:
                        objDecodeSerializableElement2 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, i18, interfaceC37138cArr[i18], objDecodeSerializableElement2);
                        i17 |= 1;
                        i15 = i18;
                        i14 = 5;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement5 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i17 |= 2;
                        i15 = i18;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement6 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i17 |= 4;
                        i15 = i18;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement7 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, interfaceC37138cArr[3], objDecodeNullableSerializableElement7);
                        i17 |= 8;
                        i15 = i18;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement8 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, interfaceC37138cArr[4], objDecodeNullableSerializableElement8);
                        i17 |= 16;
                        i15 = i18;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, i14);
                        i17 |= 32;
                        i15 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj = objDecodeSerializableElement2;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            objDecodeSerializableElement = obj;
            i13 = i17;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement6;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement8;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new ModalFormFactor(i13, (NudgeStepLayout) objDecodeSerializableElement, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement2, (ContentAlignment) objDecodeNullableSerializableElement3, (ContentAlignment) objDecodeNullableSerializableElement4, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, ModalFormFactor value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        ModalFormFactor.write$Self(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
