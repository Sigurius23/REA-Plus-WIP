package com.amplitude.android.engagement.types;

import com.mapbox.maps.MapboxMap;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"com/amplitude/android/engagement/types/PinFormFactor.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/amplitude/android/engagement/types/PinFormFactor;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/amplitude/android/engagement/types/PinFormFactor;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/amplitude/android/engagement/types/PinFormFactor;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class PinFormFactor$$serializer implements GeneratedSerializer<PinFormFactor> {
    public static final int $stable = 0;
    public static final PinFormFactor$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PinFormFactor$$serializer pinFormFactor$$serializer = new PinFormFactor$$serializer();
        INSTANCE = pinFormFactor$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("pin", pinFormFactor$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("anchor", false);
        pluginGeneratedSerialDescriptor.addElement("anchorSelector", true);
        pluginGeneratedSerialDescriptor.addElement("isOpenByDefault", true);
        pluginGeneratedSerialDescriptor.addElement("isShowingMask", true);
        pluginGeneratedSerialDescriptor.addElement("advanceTrigger", true);
        pluginGeneratedSerialDescriptor.addElement(MapboxMap.QFE_OFFSET, true);
        pluginGeneratedSerialDescriptor.addElement("position", true);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        pluginGeneratedSerialDescriptor.addElement("pointer", true);
        pluginGeneratedSerialDescriptor.addElement("layout", true);
        pluginGeneratedSerialDescriptor.addElement("textAnimation", true);
        pluginGeneratedSerialDescriptor.addElement("mediaPosition", true);
        pluginGeneratedSerialDescriptor.addElement("titleAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("contentAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("selector", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PinFormFactor$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = PinFormFactor.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(ElementSelector$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(OffsetValue$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(interfaceC37138cArr[6]);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(interfaceC37138cArr[7]);
        InterfaceC37138c interfaceC37138c = interfaceC37138cArr[9];
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d(interfaceC37138cArr[12]);
        InterfaceC37138c interfaceC37138cM122336d9 = AbstractC38195a.m122336d(interfaceC37138cArr[13]);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC37138cM122336d, booleanSerializer, booleanSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, PinPointer$$serializer.INSTANCE, interfaceC37138c, interfaceC37138cM122336d6, interfaceC37138cM122336d7, interfaceC37138cM122336d8, interfaceC37138cM122336d9, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public PinFormFactor deserialize(InterfaceC40541d decoder) {
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object obj;
        Object objDecodeNullableSerializableElement3;
        int i13;
        String strDecodeStringElement;
        boolean z4;
        boolean z13;
        String str;
        Object objDecodeNullableSerializableElement4;
        Object obj2;
        Object objDecodeSerializableElement2;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        InterfaceC37138c[] interfaceC37138cArr = PinFormFactor.$childSerializers;
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
            objDecodeNullableSerializableElement4 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ElementSelector$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 2);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement6 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            objDecodeNullableSerializableElement7 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 5, OffsetValue$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 6, interfaceC37138cArr[6], null);
            objDecodeNullableSerializableElement5 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 7, interfaceC37138cArr[7], null);
            Object objDecodeSerializableElement3 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 8, PinPointer$$serializer.INSTANCE, null);
            objDecodeSerializableElement2 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 9, interfaceC37138cArr[9], null);
            Object objDecodeNullableSerializableElement8 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 10, stringSerializer, null);
            Object objDecodeNullableSerializableElement9 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            Object objDecodeNullableSerializableElement10 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 12, interfaceC37138cArr[12], null);
            Object objDecodeNullableSerializableElement11 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 13, interfaceC37138cArr[13], null);
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 14);
            z4 = zDecodeBooleanElement2;
            objDecodeSerializableElement = objDecodeSerializableElement3;
            z13 = zDecodeBooleanElement;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement11;
            obj = objDecodeNullableSerializableElement9;
            str = strDecodeStringElement3;
            obj2 = objDecodeNullableSerializableElement8;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement10;
            i13 = 32767;
        } else {
            int i14 = 6;
            Object objDecodeNullableSerializableElement12 = null;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            Object objDecodeNullableSerializableElement15 = null;
            objDecodeSerializableElement = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeNullableSerializableElement16 = null;
            String strDecodeStringElement4 = null;
            boolean z14 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            int i15 = 9;
            int i16 = 7;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            objDecodeNullableSerializableElement2 = null;
            int i17 = 0;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        i14 = 6;
                        i16 = 7;
                        i15 = 9;
                        break;
                    case 0:
                        i17 |= 1;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 0);
                        i14 = 6;
                        i16 = 7;
                        i15 = 9;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement12 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ElementSelector$$serializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i17 |= 2;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i14 = 6;
                        i16 = 7;
                        i15 = 9;
                        break;
                    case 2:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 2);
                        i17 |= 4;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i14 = 6;
                        i16 = 7;
                        i15 = 9;
                        break;
                    case 3:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(descriptor2, 3);
                        i17 |= 8;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i14 = 6;
                        i16 = 7;
                        i15 = 9;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement14 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i17 |= 16;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i14 = 6;
                        i16 = 7;
                        i15 = 9;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement18 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 5, OffsetValue$$serializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i17 |= 32;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i14 = 6;
                        i16 = 7;
                        i15 = 9;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement17 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, i14, interfaceC37138cArr[i14], objDecodeNullableSerializableElement17);
                        i17 |= 64;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i16 = 7;
                        i15 = 9;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement16 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, i16, interfaceC37138cArr[i16], objDecodeNullableSerializableElement16);
                        i17 |= 128;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i15 = 9;
                        break;
                    case 8:
                        objDecodeSerializableElement = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, 8, PinPointer$$serializer.INSTANCE, objDecodeSerializableElement);
                        i17 |= 256;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i15 = 9;
                        break;
                    case 9:
                        objDecodeSerializableElement4 = interfaceC40539bBeginStructure.decodeSerializableElement(descriptor2, i15, interfaceC37138cArr[i15], objDecodeSerializableElement4);
                        i17 |= 512;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement15 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement13 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 12, interfaceC37138cArr[12], objDecodeNullableSerializableElement2);
                        i17 |= 4096;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 13, interfaceC37138cArr[13], objDecodeNullableSerializableElement);
                        i17 |= DfuBaseService.ERROR_REMOTE_MASK;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 14:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(descriptor2, 14);
                        i17 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            obj = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement17;
            i13 = i17;
            strDecodeStringElement = strDecodeStringElement4;
            z4 = zDecodeBooleanElement3;
            z13 = zDecodeBooleanElement4;
            str = strDecodeStringElement2;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement12;
            obj2 = objDecodeNullableSerializableElement15;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement16;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement18;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new PinFormFactor(i13, str, (ElementSelector) objDecodeNullableSerializableElement4, z13, z4, (String) objDecodeNullableSerializableElement6, (OffsetValue) objDecodeNullableSerializableElement7, (PinPosition) objDecodeNullableSerializableElement3, (PinAlignment) objDecodeNullableSerializableElement5, (PinPointer) objDecodeSerializableElement, (NudgeStepLayout) objDecodeSerializableElement2, (String) obj2, (String) obj, (ContentAlignment) objDecodeNullableSerializableElement2, (ContentAlignment) objDecodeNullableSerializableElement, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, PinFormFactor value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        PinFormFactor.write$Self(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
