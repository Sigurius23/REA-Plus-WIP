package com.amplitude.android.engagement.types;

import kotlinx.serialization.UnknownFieldException;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"com/amplitude/android/engagement/types/TooltipFormFactor.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/amplitude/android/engagement/types/TooltipFormFactor;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/amplitude/android/engagement/types/TooltipFormFactor;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/amplitude/android/engagement/types/TooltipFormFactor;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class TooltipFormFactor$$serializer implements GeneratedSerializer<TooltipFormFactor> {
    public static final int $stable = 0;
    public static final TooltipFormFactor$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TooltipFormFactor$$serializer tooltipFormFactor$$serializer = new TooltipFormFactor$$serializer();
        INSTANCE = tooltipFormFactor$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("tooltip", tooltipFormFactor$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("anchor", false);
        pluginGeneratedSerialDescriptor.addElement("anchorSelector", true);
        pluginGeneratedSerialDescriptor.addElement("showOn", false);
        pluginGeneratedSerialDescriptor.addElement("marker", false);
        pluginGeneratedSerialDescriptor.addElement("pointer", true);
        pluginGeneratedSerialDescriptor.addElement("layout", true);
        pluginGeneratedSerialDescriptor.addElement("textAnimation", true);
        pluginGeneratedSerialDescriptor.addElement("mediaPosition", true);
        pluginGeneratedSerialDescriptor.addElement("titleAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("contentAlignment", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TooltipFormFactor$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = TooltipFormFactor.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(ElementSelector$$serializer.INSTANCE), interfaceC37138cArr[2], interfaceC37138cArr[3], AbstractC38195a.m122336d(TooltipPointer$$serializer.INSTANCE), interfaceC37138cArr[5], AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(interfaceC37138cArr[8]), AbstractC38195a.m122336d(interfaceC37138cArr[9])};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public TooltipFormFactor deserialize(InterfaceC40541d decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeSerializableElement;
        int i13;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeSerializableElement2;
        Object objDecodeSerializableElement3;
        String str;
        Object objDecodeNullableSerializableElement6;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        InterfaceC37138c[] interfaceC37138cArr = TooltipFormFactor.$childSerializers;
        int i14 = 9;
        int i15 = 8;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
            objDecodeNullableSerializableElement6 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ElementSelector$$serializer.INSTANCE, null);
            Object objDecodeSerializableElement4 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 2, interfaceC37138cArr[2], null);
            objDecodeSerializableElement3 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 3, interfaceC37138cArr[3], null);
            Object objDecodeNullableSerializableElement7 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, TooltipPointer$$serializer.INSTANCE, null);
            objDecodeSerializableElement2 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 5, interfaceC37138cArr[5], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement8 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            objDecodeNullableSerializableElement5 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            objDecodeNullableSerializableElement4 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 8, interfaceC37138cArr[8], null);
            objDecodeNullableSerializableElement3 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 9, interfaceC37138cArr[9], null);
            i13 = 1023;
            objDecodeSerializableElement = objDecodeSerializableElement4;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement8;
            str = strDecodeStringElement2;
        } else {
            int i16 = 5;
            int i17 = 3;
            int i18 = 2;
            boolean z4 = true;
            int i19 = 0;
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeNullableSerializableElement10 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement11 = null;
            Object objDecodeSerializableElement5 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeSerializableElement6 = null;
            objDecodeSerializableElement = null;
            Object objDecodeNullableSerializableElement12 = null;
            while (z4) {
                int i24 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 8;
                        i18 = 2;
                        i17 = 3;
                        i16 = 5;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
                        i19 |= 1;
                        i14 = 9;
                        i15 = 8;
                        i18 = 2;
                        i17 = 3;
                        i16 = 5;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement12 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ElementSelector$$serializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i19 |= 2;
                        i14 = 9;
                        i15 = 8;
                        i18 = 2;
                        i17 = 3;
                        i16 = 5;
                        break;
                    case 2:
                        objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, i18, interfaceC37138cArr[i18], objDecodeSerializableElement);
                        i19 |= 4;
                        i14 = 9;
                        i15 = 8;
                        i17 = 3;
                        i16 = 5;
                        break;
                    case 3:
                        objDecodeSerializableElement6 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, i17, interfaceC37138cArr[i17], objDecodeSerializableElement6);
                        i19 |= 8;
                        i14 = 9;
                        i15 = 8;
                        i16 = 5;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, TooltipPointer$$serializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i19 |= 16;
                        i14 = 9;
                        i15 = 8;
                        i16 = 5;
                        break;
                    case 5:
                        objDecodeSerializableElement5 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, i16, interfaceC37138cArr[i16], objDecodeSerializableElement5);
                        i19 |= 32;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i19 |= 64;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement11 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement11);
                        i19 |= 128;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement10 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, i24, interfaceC37138cArr[i24], objDecodeNullableSerializableElement10);
                        i19 |= 256;
                        i15 = i24;
                        i14 = 9;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement9 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, i14, interfaceC37138cArr[i14], objDecodeNullableSerializableElement9);
                        i19 |= 512;
                        i15 = i24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i19;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement10;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement11;
            objDecodeSerializableElement2 = objDecodeSerializableElement5;
            objDecodeSerializableElement3 = objDecodeSerializableElement6;
            str = strDecodeStringElement;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement12;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new TooltipFormFactor(i13, str, (ElementSelector) objDecodeNullableSerializableElement6, (TooltipShowOn) objDecodeSerializableElement, (Marker) objDecodeSerializableElement3, (TooltipPointer) objDecodeNullableSerializableElement2, (NudgeStepLayout) objDecodeSerializableElement2, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement5, (ContentAlignment) objDecodeNullableSerializableElement4, (ContentAlignment) objDecodeNullableSerializableElement3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, TooltipFormFactor value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        TooltipFormFactor.write$Self(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
