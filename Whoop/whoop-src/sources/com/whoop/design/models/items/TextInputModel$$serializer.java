package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/TextInputModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/TextInputModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/TextInputModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/TextInputModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TextInputModel$$serializer implements GeneratedSerializer<TextInputModel> {
    public static final int $stable;
    public static final TextInputModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TextInputModel$$serializer textInputModel$$serializer = new TextInputModel$$serializer();
        INSTANCE = textInputModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.TextInputModel", textInputModel$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("placeholder", false);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("suffix", false);
        pluginGeneratedSerialDescriptor.addElement("caption", false);
        pluginGeneratedSerialDescriptor.addElement("maxLength", false);
        pluginGeneratedSerialDescriptor.addElement("keyboardType", true);
        pluginGeneratedSerialDescriptor.addElement("isSecure", true);
        pluginGeneratedSerialDescriptor.addElement("isDisabled", true);
        pluginGeneratedSerialDescriptor.addElement("stateUpdateValueKey", true);
        pluginGeneratedSerialDescriptor.addElement("errorStateKey", true);
        pluginGeneratedSerialDescriptor.addElement("overrideTapInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("validation", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TextInputModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TextInputModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(IntSerializer.INSTANCE), interfaceC23462hArr[8].getValue(), booleanSerializer, booleanSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE), AbstractC38195a.m122336d(TextInputValidation$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[15].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TextInputModel deserialize(InterfaceC40541d decoder) {
        String str;
        GenericInteraction genericInteraction;
        String str2;
        Map map;
        String str3;
        TextInputValidation textInputValidation;
        String str4;
        String str5;
        TextInputKeyboardType textInputKeyboardType;
        String str6;
        String str7;
        Integer num;
        String str8;
        Map map2;
        int i13;
        String str9;
        boolean z4;
        boolean z13;
        String str10;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TextInputModel.$childSerializers;
        Map map3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, IntSerializer.INSTANCE, null);
            TextInputKeyboardType textInputKeyboardType2 = (TextInputKeyboardType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            GenericInteraction genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, GenericInteraction$$serializer.INSTANCE, null);
            TextInputValidation textInputValidation2 = (TextInputValidation) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, TextInputValidation$$serializer.INSTANCE, null);
            Map map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, LenientAggregateBindingsSerializer.INSTANCE, null);
            str9 = strDecodeStringElement;
            textInputKeyboardType = textInputKeyboardType2;
            str = str11;
            i13 = 131071;
            num = num2;
            z4 = zDecodeBooleanElement;
            z13 = zDecodeBooleanElement2;
            str6 = str16;
            str7 = str15;
            str3 = str13;
            str8 = str12;
            str2 = str14;
            textInputValidation = textInputValidation2;
            map = map4;
            genericInteraction = genericInteraction2;
            str4 = str18;
            str5 = str17;
        } else {
            int i14 = 8;
            boolean z14 = true;
            int i15 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            Map map5 = null;
            GenericInteraction genericInteraction3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            TextInputValidation textInputValidation3 = null;
            String str22 = null;
            String str23 = null;
            TextInputKeyboardType textInputKeyboardType3 = null;
            String str24 = null;
            String str25 = null;
            Integer num3 = null;
            String strDecodeStringElement2 = null;
            String str26 = null;
            while (z14) {
                String str27 = str21;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        str20 = str20;
                        str21 = str27;
                        map5 = map5;
                        i15 = i15;
                        i14 = 8;
                        break;
                    case 0:
                        str10 = str27;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        str20 = str20;
                        i15 |= 1;
                        str21 = str10;
                        map5 = map5;
                        i14 = 8;
                        break;
                    case 1:
                        str10 = str27;
                        str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str26);
                        i15 |= 2;
                        str20 = str20;
                        str21 = str10;
                        map5 = map5;
                        i14 = 8;
                        break;
                    case 2:
                        map5 = map5;
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str27);
                        i15 |= 4;
                        str20 = str20;
                        map5 = map5;
                        i14 = 8;
                        break;
                    case 3:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str20);
                        i15 |= 8;
                        str21 = str27;
                        i14 = 8;
                        break;
                    case 4:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str19);
                        i15 |= 16;
                        str21 = str27;
                        str20 = str20;
                        i14 = 8;
                        break;
                    case 5:
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str25);
                        i15 |= 32;
                        str21 = str27;
                        str20 = str20;
                        i14 = 8;
                        break;
                    case 6:
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str24);
                        i15 |= 64;
                        str21 = str27;
                        str20 = str20;
                        i14 = 8;
                        break;
                    case 7:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, IntSerializer.INSTANCE, num3);
                        i15 |= 128;
                        str21 = str27;
                        str20 = str20;
                        i14 = 8;
                        break;
                    case 8:
                        textInputKeyboardType3 = (TextInputKeyboardType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), textInputKeyboardType3);
                        i15 |= 256;
                        str21 = str27;
                        str20 = str20;
                        break;
                    case 9:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
                        i15 |= 512;
                        str21 = str27;
                        str20 = str20;
                        break;
                    case 10:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str21 = str27;
                        str20 = str20;
                        break;
                    case 11:
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str23);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str21 = str27;
                        str20 = str20;
                        break;
                    case 12:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str22);
                        i15 |= 4096;
                        str21 = str27;
                        str20 = str20;
                        break;
                    case 13:
                        genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, GenericInteraction$$serializer.INSTANCE, genericInteraction3);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str21 = str27;
                        str20 = str20;
                        break;
                    case 14:
                        textInputValidation3 = (TextInputValidation) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, TextInputValidation$$serializer.INSTANCE, textInputValidation3);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str21 = str27;
                        str20 = str20;
                        break;
                    case 15:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), map3);
                        i15 |= 32768;
                        str21 = str27;
                        str20 = str20;
                        break;
                    case 16:
                        map5 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, LenientAggregateBindingsSerializer.INSTANCE, map5);
                        i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        str21 = str27;
                        str20 = str20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str26;
            genericInteraction = genericInteraction3;
            str2 = str19;
            map = map3;
            str3 = str20;
            textInputValidation = textInputValidation3;
            str4 = str22;
            str5 = str23;
            textInputKeyboardType = textInputKeyboardType3;
            str6 = str24;
            str7 = str25;
            num = num3;
            str8 = str21;
            map2 = map5;
            i13 = i15;
            str9 = strDecodeStringElement2;
            z4 = zDecodeBooleanElement3;
            z13 = zDecodeBooleanElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TextInputModel(i13, str9, str, str8, str3, str2, str7, str6, num, textInputKeyboardType, z4, z13, str5, str4, genericInteraction, textInputValidation, map, map2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TextInputModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TextInputModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
