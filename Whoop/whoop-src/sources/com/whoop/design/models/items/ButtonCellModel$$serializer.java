package com.whoop.design.models.items;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ButtonCellModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ButtonCellModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ButtonCellModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ButtonCellModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ButtonCellModel$$serializer implements GeneratedSerializer<ButtonCellModel> {
    public static final int $stable;
    public static final ButtonCellModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ButtonCellModel$$serializer buttonCellModel$$serializer = new ButtonCellModel$$serializer();
        INSTANCE = buttonCellModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ButtonCellModel", buttonCellModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("titleType", true);
        pluginGeneratedSerialDescriptor.addElement("leadingIcon", true);
        pluginGeneratedSerialDescriptor.addElement("leadingImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("trailingIcon", true);
        pluginGeneratedSerialDescriptor.addElement("message", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("avatars", true);
        pluginGeneratedSerialDescriptor.addElement("tintColor", true);
        pluginGeneratedSerialDescriptor.addElement("enabled", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        pluginGeneratedSerialDescriptor.addElement("modal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ButtonCellModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ButtonCellModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ButtonCellModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        AnyModal anyModal;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C9598e c9598e;
        EnumC39333f enumC39333f;
        String str7;
        String str8;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ButtonCellModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            EnumC39333f enumC39333f2 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
            i13 = 8191;
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            str8 = strDecodeStringElement;
            z4 = zDecodeBooleanElement;
            str2 = str15;
            str3 = str14;
            str5 = str13;
            str6 = str11;
            str4 = str12;
            str7 = str10;
            anyModal = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            enumC39333f = enumC39333f2;
            str = str9;
            list = list2;
        } else {
            int i14 = 12;
            boolean z13 = false;
            AnyModal anyModal2 = null;
            List list3 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String strDecodeStringElement2 = null;
            int i15 = 9;
            int i16 = 8;
            boolean z14 = true;
            i13 = 0;
            String str21 = null;
            C9598e c9598e2 = null;
            EnumC39333f enumC39333f3 = null;
            String str22 = null;
            while (z14) {
                int i17 = i14;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        z13 = z13;
                        i14 = 12;
                        i16 = 8;
                        i15 = 9;
                        break;
                    case 0:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        z13 = z13;
                        i14 = 12;
                        i16 = 8;
                        i15 = 9;
                        break;
                    case 1:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str21);
                        i13 |= 2;
                        z13 = z13;
                        i14 = 12;
                        i16 = 8;
                        i15 = 9;
                        break;
                    case 2:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str22);
                        i13 |= 4;
                        z13 = z13;
                        i14 = 12;
                        i16 = 8;
                        i15 = 9;
                        break;
                    case 3:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str20);
                        i13 |= 8;
                        z13 = z13;
                        i14 = 12;
                        i16 = 8;
                        i15 = 9;
                        break;
                    case 4:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str18);
                        i13 |= 16;
                        z13 = z13;
                        i14 = 12;
                        i16 = 8;
                        i15 = 9;
                        break;
                    case 5:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str19);
                        i13 |= 32;
                        z13 = z13;
                        i14 = 12;
                        i16 = 8;
                        i15 = 9;
                        break;
                    case 6:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str17);
                        i13 |= 64;
                        z13 = z13;
                        i14 = 12;
                        i16 = 8;
                        i15 = 9;
                        break;
                    case 7:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str16);
                        i13 |= 128;
                        z13 = z13;
                        i14 = 12;
                        i16 = 8;
                        i15 = 9;
                        break;
                    case 8:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list3);
                        i13 |= 256;
                        z13 = z13;
                        i14 = 12;
                        i15 = 9;
                        break;
                    case 9:
                        enumC39333f3 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), enumC39333f3);
                        i13 |= 512;
                        z13 = z13;
                        i14 = 12;
                        break;
                    case 10:
                        boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        z13 = zDecodeBooleanElement2;
                        i14 = 12;
                        break;
                    case 11:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), c9598e2);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        z13 = z13;
                        i14 = 12;
                        break;
                    case 12:
                        anyModal2 = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), anyModal2);
                        i13 |= 4096;
                        i14 = i17;
                        z13 = z13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str21;
            anyModal = anyModal2;
            list = list3;
            str2 = str16;
            str3 = str17;
            str4 = str18;
            str5 = str19;
            str6 = str20;
            c9598e = c9598e2;
            enumC39333f = enumC39333f3;
            str7 = str22;
            str8 = strDecodeStringElement2;
            z4 = z13;
        }
        int i18 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ButtonCellModel(i18, str8, str, str7, str6, str4, str5, str3, str2, list, enumC39333f, z4, c9598e, anyModal, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ButtonCellModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ButtonCellModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
