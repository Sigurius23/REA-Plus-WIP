package com.amplitude.android.engagement.types;

import java.util.List;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"com/amplitude/android/engagement/types/ButtonMeta.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/amplitude/android/engagement/types/ButtonMeta;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/amplitude/android/engagement/types/ButtonMeta;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/amplitude/android/engagement/types/ButtonMeta;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class ButtonMeta$$serializer implements GeneratedSerializer<ButtonMeta> {
    public static final int $stable = 0;
    public static final ButtonMeta$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ButtonMeta$$serializer buttonMeta$$serializer = new ButtonMeta$$serializer();
        INSTANCE = buttonMeta$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplitude.android.engagement.types.ButtonMeta", buttonMeta$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("buttonType", true);
        pluginGeneratedSerialDescriptor.addElement("conditionalActions", true);
        pluginGeneratedSerialDescriptor.addElement("defaultAction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ButtonMeta$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = ButtonMeta.$childSerializers;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(StringSerializer.INSTANCE), AbstractC38195a.m122336d(interfaceC37138cArr[1]), AbstractC38195a.m122336d(interfaceC37138cArr[2]), AbstractC38195a.m122336d(interfaceC37138cArr[3]), AbstractC38195a.m122336d(interfaceC37138cArr[4])};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public ButtonMeta deserialize(InterfaceC40541d decoder) {
        Object objDecodeNullableSerializableElement;
        int i13;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        InterfaceC37138c[] interfaceC37138cArr = ButtonMeta.$childSerializers;
        Object objDecodeNullableSerializableElement6 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, interfaceC37138cArr[1], null);
            Object objDecodeNullableSerializableElement7 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, interfaceC37138cArr[2], null);
            objDecodeNullableSerializableElement4 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, interfaceC37138cArr[3], null);
            objDecodeNullableSerializableElement5 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, interfaceC37138cArr[4], null);
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement7;
            i13 = 31;
        } else {
            boolean z4 = true;
            int i14 = 0;
            Object objDecodeNullableSerializableElement8 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeNullableSerializableElement10 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeNullableSerializableElement6 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeNullableSerializableElement8 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, interfaceC37138cArr[1], objDecodeNullableSerializableElement8);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, interfaceC37138cArr[2], objDecodeNullableSerializableElement);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    objDecodeNullableSerializableElement9 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 3, interfaceC37138cArr[3], objDecodeNullableSerializableElement9);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeNullableSerializableElement10 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 4, interfaceC37138cArr[4], objDecodeNullableSerializableElement10);
                    i14 |= 16;
                }
            }
            i13 = i14;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement6;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement8;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement10;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new ButtonMeta(i13, (String) objDecodeNullableSerializableElement2, (Action) objDecodeNullableSerializableElement3, (ButtonType) objDecodeNullableSerializableElement, (List) objDecodeNullableSerializableElement4, (Action) objDecodeNullableSerializableElement5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, ButtonMeta value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        ButtonMeta.write$Self(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
