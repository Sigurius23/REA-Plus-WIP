package com.whoop.access.circumference.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/access/circumference/models/CircumferencePickerModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/access/circumference/models/CircumferencePickerModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/access/circumference/models/CircumferencePickerModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/access/circumference/models/CircumferencePickerModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CircumferencePickerModel$$serializer implements GeneratedSerializer<CircumferencePickerModel> {
    public static final int $stable;
    public static final CircumferencePickerModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CircumferencePickerModel$$serializer circumferencePickerModel$$serializer = new CircumferencePickerModel$$serializer();
        INSTANCE = circumferencePickerModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.access.circumference.models.CircumferencePickerModel", circumferencePickerModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("inMin", false);
        pluginGeneratedSerialDescriptor.addElement("inMax", false);
        pluginGeneratedSerialDescriptor.addElement("defaultIn", false);
        pluginGeneratedSerialDescriptor.addElement("inLabel", false);
        pluginGeneratedSerialDescriptor.addElement("cmMin", false);
        pluginGeneratedSerialDescriptor.addElement("cmMax", false);
        pluginGeneratedSerialDescriptor.addElement("defaultCm", false);
        pluginGeneratedSerialDescriptor.addElement("cmLabel", false);
        pluginGeneratedSerialDescriptor.addElement("unitType", false);
        pluginGeneratedSerialDescriptor.addElement("stateUpdateValueKey", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CircumferencePickerModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CircumferencePickerModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i19 = 10;
        int i24 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            int iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            int iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
            int iDecodeIntElement5 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
            int iDecodeIntElement6 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 7);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            i24 = 2047;
            str2 = strDecodeStringElement;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, null);
            str5 = strDecodeStringElement4;
            i13 = iDecodeIntElement6;
            i14 = iDecodeIntElement5;
            i15 = iDecodeIntElement4;
            i16 = iDecodeIntElement3;
            str4 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            i17 = iDecodeIntElement2;
            i18 = iDecodeIntElement;
        } else {
            boolean z4 = true;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            String str6 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement12 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i19 = 10;
                        break;
                    case 0:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i24 |= 1;
                        i19 = 10;
                        break;
                    case 1:
                        iDecodeIntElement11 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                        i24 |= 2;
                        i19 = 10;
                        break;
                    case 2:
                        iDecodeIntElement10 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                        i24 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement9 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
                        i24 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i24 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement8 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
                        i24 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement12 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
                        i24 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement7 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 7);
                        i24 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i24 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i24 |= 512;
                        break;
                    case 10:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i19, StringSerializer.INSTANCE, str6);
                        i24 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = iDecodeIntElement7;
            str = str6;
            i14 = iDecodeIntElement12;
            i15 = iDecodeIntElement8;
            i16 = iDecodeIntElement9;
            i17 = iDecodeIntElement10;
            i18 = iDecodeIntElement11;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement8;
        }
        int i25 = i24;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CircumferencePickerModel(i25, str2, i18, i17, i16, str3, i15, i14, i13, str4, str5, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CircumferencePickerModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CircumferencePickerModel.write$Self$access_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
