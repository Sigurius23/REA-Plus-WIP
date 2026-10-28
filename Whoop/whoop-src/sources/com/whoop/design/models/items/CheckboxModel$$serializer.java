package com.whoop.design.models.items;

import b91.EnumC2888c;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/CheckboxModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/CheckboxModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/CheckboxModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/CheckboxModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CheckboxModel$$serializer implements GeneratedSerializer<CheckboxModel> {
    public static final int $stable;
    public static final CheckboxModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CheckboxModel$$serializer checkboxModel$$serializer = new CheckboxModel$$serializer();
        INSTANCE = checkboxModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.CheckboxModel", checkboxModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("isToggled", false);
        pluginGeneratedSerialDescriptor.addElement("toggleOnInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("toggleOffInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("labelStyle", false);
        pluginGeneratedSerialDescriptor.addElement("spacerSize", false);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("toggledOnColor", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CheckboxModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CheckboxModel.$childSerializers;
        GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(genericInteraction$$serializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(genericInteraction$$serializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue());
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(IntSerializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue());
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue());
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue());
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue());
        InterfaceC37138c interfaceC37138cM122336d9 = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7, interfaceC37138cM122336d8, interfaceC37138cM122336d9};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CheckboxModel deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        EnumC39333f enumC39333f;
        Integer num;
        CheckboxModel.CheckboxAlignment checkboxAlignment;
        EnumC2888c enumC2888c;
        int i13;
        Map map;
        CheckboxModel.CheckboxStyle checkboxStyle;
        Map map2;
        GenericInteraction genericInteraction;
        GenericInteraction genericInteraction2;
        boolean z4;
        InterfaceC23462h[] interfaceC23462hArr;
        InterfaceC23462h[] interfaceC23462hArr2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr3 = CheckboxModel.$childSerializers;
        int i14 = 10;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
            GenericInteraction genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, genericInteraction$$serializer, null);
            GenericInteraction genericInteraction4 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, genericInteraction$$serializer, null);
            EnumC2888c enumC2888c2 = (EnumC2888c) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr3[5].getValue(), null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, IntSerializer.INSTANCE, null);
            CheckboxModel.CheckboxAlignment checkboxAlignment2 = (CheckboxModel.CheckboxAlignment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr3[7].getValue(), null);
            CheckboxModel.CheckboxStyle checkboxStyle2 = (CheckboxModel.CheckboxStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr3[8].getValue(), null);
            EnumC39333f enumC39333f2 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr3[9].getValue(), null);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr3[10].getValue(), null);
            str2 = strDecodeStringElement2;
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, LenientAggregateBindingsSerializer.INSTANCE, null);
            num = num2;
            genericInteraction2 = genericInteraction3;
            genericInteraction = genericInteraction4;
            z4 = zDecodeBooleanElement;
            i13 = 4095;
            enumC39333f = enumC39333f2;
            checkboxAlignment = checkboxAlignment2;
            enumC2888c = enumC2888c2;
            checkboxStyle = checkboxStyle2;
            str = strDecodeStringElement3;
        } else {
            String strDecodeStringElement4 = null;
            EnumC39333f enumC39333f3 = null;
            Integer num3 = null;
            CheckboxModel.CheckboxAlignment checkboxAlignment3 = null;
            EnumC2888c enumC2888c3 = null;
            int i15 = 9;
            int i16 = 7;
            int i17 = 5;
            int i18 = 8;
            boolean z13 = true;
            int i19 = 0;
            boolean zDecodeBooleanElement2 = false;
            Map map3 = null;
            CheckboxModel.CheckboxStyle checkboxStyle3 = null;
            Map map4 = null;
            GenericInteraction genericInteraction5 = null;
            GenericInteraction genericInteraction6 = null;
            while (z13) {
                int i24 = i14;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 10;
                        i17 = 5;
                        i16 = 7;
                        i18 = 8;
                        i15 = 9;
                        break;
                    case 0:
                        i19 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i14 = 10;
                        i17 = 5;
                        i16 = 7;
                        i18 = 8;
                        i15 = 9;
                        break;
                    case 1:
                        i19 |= 2;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i14 = 10;
                        i17 = 5;
                        i16 = 7;
                        i18 = 8;
                        i15 = 9;
                        break;
                    case 2:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        i19 |= 4;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i14 = 10;
                        i17 = 5;
                        i16 = 7;
                        i18 = 8;
                        i15 = 9;
                        break;
                    case 3:
                        genericInteraction6 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, GenericInteraction$$serializer.INSTANCE, genericInteraction6);
                        i19 |= 8;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i14 = 10;
                        i17 = 5;
                        i16 = 7;
                        i18 = 8;
                        i15 = 9;
                        break;
                    case 4:
                        genericInteraction5 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, GenericInteraction$$serializer.INSTANCE, genericInteraction5);
                        i19 |= 16;
                        interfaceC23462hArr3 = interfaceC23462hArr3;
                        i14 = 10;
                        i17 = 5;
                        i16 = 7;
                        i18 = 8;
                        i15 = 9;
                        break;
                    case 5:
                        interfaceC23462hArr2 = interfaceC23462hArr3;
                        enumC2888c3 = (EnumC2888c) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr2[i17].getValue(), enumC2888c3);
                        i19 |= 32;
                        interfaceC23462hArr3 = interfaceC23462hArr2;
                        i14 = 10;
                        i16 = 7;
                        i18 = 8;
                        i15 = 9;
                        break;
                    case 6:
                        interfaceC23462hArr2 = interfaceC23462hArr3;
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, IntSerializer.INSTANCE, num3);
                        i19 |= 64;
                        interfaceC23462hArr3 = interfaceC23462hArr2;
                        i14 = 10;
                        i16 = 7;
                        i18 = 8;
                        i15 = 9;
                        break;
                    case 7:
                        InterfaceC23462h[] interfaceC23462hArr4 = interfaceC23462hArr3;
                        checkboxAlignment3 = (CheckboxModel.CheckboxAlignment) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr4[i16].getValue(), checkboxAlignment3);
                        i19 |= 128;
                        interfaceC23462hArr3 = interfaceC23462hArr4;
                        i14 = 10;
                        i18 = 8;
                        i15 = 9;
                        break;
                    case 8:
                        InterfaceC23462h[] interfaceC23462hArr5 = interfaceC23462hArr3;
                        checkboxStyle3 = (CheckboxModel.CheckboxStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr5[i18].getValue(), checkboxStyle3);
                        i19 |= 256;
                        interfaceC23462hArr3 = interfaceC23462hArr5;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 9:
                        InterfaceC23462h[] interfaceC23462hArr6 = interfaceC23462hArr3;
                        enumC39333f3 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr6[i15].getValue(), enumC39333f3);
                        i19 |= 512;
                        interfaceC23462hArr3 = interfaceC23462hArr6;
                        i14 = 10;
                        break;
                    case 10:
                        interfaceC23462hArr = interfaceC23462hArr3;
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), map3);
                        i19 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i14 = i24;
                        interfaceC23462hArr3 = interfaceC23462hArr;
                        break;
                    case 11:
                        interfaceC23462hArr = interfaceC23462hArr3;
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, LenientAggregateBindingsSerializer.INSTANCE, map4);
                        i19 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i14 = i24;
                        interfaceC23462hArr3 = interfaceC23462hArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement;
            enumC39333f = enumC39333f3;
            num = num3;
            checkboxAlignment = checkboxAlignment3;
            enumC2888c = enumC2888c3;
            i13 = i19;
            map = map3;
            checkboxStyle = checkboxStyle3;
            map2 = map4;
            genericInteraction = genericInteraction5;
            genericInteraction2 = genericInteraction6;
            z4 = zDecodeBooleanElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CheckboxModel(i13, str2, str, z4, genericInteraction2, genericInteraction, enumC2888c, num, checkboxAlignment, checkboxStyle, enumC39333f, map, map2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CheckboxModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CheckboxModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
