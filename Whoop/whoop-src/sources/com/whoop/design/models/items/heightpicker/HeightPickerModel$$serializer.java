package com.whoop.design.models.items.heightpicker;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/heightpicker/HeightPickerModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HeightPickerModel$$serializer implements GeneratedSerializer<HeightPickerModel> {
    public static final int $stable;
    public static final HeightPickerModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HeightPickerModel$$serializer heightPickerModel$$serializer = new HeightPickerModel$$serializer();
        INSTANCE = heightPickerModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.heightpicker.HeightPickerModel", heightPickerModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("feetMin", false);
        pluginGeneratedSerialDescriptor.addElement("feetMax", false);
        pluginGeneratedSerialDescriptor.addElement("defaultFeet", false);
        pluginGeneratedSerialDescriptor.addElement("defaultInches", false);
        pluginGeneratedSerialDescriptor.addElement("defaultIn", false);
        pluginGeneratedSerialDescriptor.addElement("feetLabel", false);
        pluginGeneratedSerialDescriptor.addElement("inchesLabel", false);
        pluginGeneratedSerialDescriptor.addElement("cmMin", false);
        pluginGeneratedSerialDescriptor.addElement("cmMax", false);
        pluginGeneratedSerialDescriptor.addElement("defaultCm", false);
        pluginGeneratedSerialDescriptor.addElement("cmLabel", false);
        pluginGeneratedSerialDescriptor.addElement("unitType", false);
        pluginGeneratedSerialDescriptor.addElement("stateUpdateValueKey", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HeightPickerModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, intSerializer, intSerializer, intSerializer, intSerializer, AbstractC38195a.m122336d(intSerializer), stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HeightPickerModel deserialize(InterfaceC40541d decoder) {
        int i13;
        Integer num;
        int i14;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i25 = 11;
        int i26 = 3;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            int iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
            int iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, IntSerializer.INSTANCE, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            int iDecodeIntElement5 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 8);
            int iDecodeIntElement6 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 9);
            int iDecodeIntElement7 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 10);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, null);
            i13 = 16383;
            str5 = strDecodeStringElement4;
            i15 = iDecodeIntElement7;
            i16 = iDecodeIntElement6;
            str4 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            num = num2;
            i17 = iDecodeIntElement3;
            i18 = iDecodeIntElement5;
            i19 = iDecodeIntElement4;
            i24 = iDecodeIntElement2;
            str6 = strDecodeStringElement5;
            str2 = strDecodeStringElement;
            i14 = iDecodeIntElement;
        } else {
            int i27 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            int iDecodeIntElement13 = 0;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            boolean z4 = true;
            int iDecodeIntElement14 = 0;
            Integer num3 = null;
            String str7 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i25 = 11;
                        i26 = 3;
                        break;
                    case 0:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i27 |= 1;
                        i25 = 11;
                        i26 = 3;
                        break;
                    case 1:
                        i27 |= 2;
                        iDecodeIntElement14 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                        i25 = 11;
                        i26 = 3;
                        break;
                    case 2:
                        iDecodeIntElement13 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                        i27 |= 4;
                        i25 = 11;
                        i26 = 3;
                        break;
                    case 3:
                        int i28 = i26;
                        iDecodeIntElement10 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, i28);
                        i27 |= 8;
                        i26 = i28;
                        i25 = 11;
                        break;
                    case 4:
                        iDecodeIntElement12 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
                        i27 |= 16;
                        i25 = 11;
                        i26 = 3;
                        break;
                    case 5:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, IntSerializer.INSTANCE, num3);
                        i27 |= 32;
                        i25 = 11;
                        i26 = 3;
                        break;
                    case 6:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i27 |= 64;
                        i26 = 3;
                        break;
                    case 7:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i27 |= 128;
                        i26 = 3;
                        break;
                    case 8:
                        iDecodeIntElement11 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 8);
                        i27 |= 256;
                        i26 = 3;
                        break;
                    case 9:
                        iDecodeIntElement9 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 9);
                        i27 |= 512;
                        i26 = 3;
                        break;
                    case 10:
                        iDecodeIntElement8 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 10);
                        i27 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i26 = 3;
                        break;
                    case 11:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i25);
                        i27 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i26 = 3;
                        break;
                    case 12:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
                        i27 |= 4096;
                        i26 = 3;
                        break;
                    case 13:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str7);
                        i27 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i26 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i27;
            num = num3;
            i14 = iDecodeIntElement14;
            str = str7;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
            i15 = iDecodeIntElement8;
            i16 = iDecodeIntElement9;
            i17 = iDecodeIntElement10;
            i18 = iDecodeIntElement11;
            i19 = iDecodeIntElement12;
            i24 = iDecodeIntElement13;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HeightPickerModel(i13, str2, i14, i24, i17, i19, num, str3, str4, i18, i16, i15, str5, str6, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HeightPickerModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HeightPickerModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
