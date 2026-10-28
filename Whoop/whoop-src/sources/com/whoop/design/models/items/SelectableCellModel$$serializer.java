package com.whoop.design.models.items;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.whoopaction.domain.models.Action;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/SelectableCellModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/SelectableCellModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/SelectableCellModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/SelectableCellModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SelectableCellModel$$serializer implements GeneratedSerializer<SelectableCellModel> {
    public static final int $stable;
    public static final SelectableCellModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SelectableCellModel$$serializer selectableCellModel$$serializer = new SelectableCellModel$$serializer();
        INSTANCE = selectableCellModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.SelectableCellModel", selectableCellModel$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("leftIcon", false);
        pluginGeneratedSerialDescriptor.addElement("leftImageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("shouldTintLeftImage", true);
        pluginGeneratedSerialDescriptor.addElement("selectionStyle", false);
        pluginGeneratedSerialDescriptor.addElement("selected", false);
        pluginGeneratedSerialDescriptor.addElement("showCheckbox", true);
        pluginGeneratedSerialDescriptor.addElement("isDisabled", true);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("interaction", true);
        pluginGeneratedSerialDescriptor.addElement("deselectAction", true);
        pluginGeneratedSerialDescriptor.addElement("searchKeys", true);
        pluginGeneratedSerialDescriptor.addElement("sectionTitle", true);
        pluginGeneratedSerialDescriptor.addElement("fixedHeightSize", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SelectableCellModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SelectableCellModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), booleanSerializer, AbstractC38195a.m122336d(stringSerializer), booleanSerializer, booleanSerializer, booleanSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), interfaceC23462hArr[13].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(DoubleSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[16].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SelectableCellModel deserialize(InterfaceC40541d decoder) {
        Map map;
        String str;
        Map map2;
        String str2;
        Double d3;
        List list;
        Action action;
        GenericInteraction genericInteraction;
        String str3;
        String str4;
        Action action2;
        String str5;
        int i13;
        String str6;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        String str7;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SelectableCellModel.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
            boolean zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
            Action action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            GenericInteraction genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, GenericInteraction$$serializer.INSTANCE, null);
            Action action4 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            Double d14 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, DoubleSerializer.INSTANCE, null);
            Map map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, (InterfaceC37137b) interfaceC23462hArr[16].getValue(), null);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, LenientAggregateBindingsSerializer.INSTANCE, null);
            str7 = strDecodeStringElement2;
            str6 = strDecodeStringElement3;
            str4 = str12;
            i13 = 262143;
            z4 = zDecodeBooleanElement4;
            z13 = zDecodeBooleanElement2;
            str3 = str11;
            z14 = zDecodeBooleanElement;
            str = str9;
            z15 = zDecodeBooleanElement3;
            str5 = str10;
            str2 = str8;
            d3 = d14;
            list = list2;
            map2 = map3;
            action = action4;
            genericInteraction = genericInteraction2;
            action2 = action3;
        } else {
            boolean z16 = true;
            int i15 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            int i16 = 10;
            Map map4 = null;
            String str13 = null;
            String str14 = null;
            Map map5 = null;
            Double d15 = null;
            List list3 = null;
            Action action5 = null;
            GenericInteraction genericInteraction3 = null;
            String str15 = null;
            String str16 = null;
            Action action6 = null;
            String str17 = null;
            String strDecodeStringElement4 = null;
            while (z16) {
                String str18 = strDecodeStringElement;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z16 = false;
                        i15 = i15;
                        strDecodeStringElement = str18;
                        i16 = 10;
                        break;
                    case 0:
                        str14 = str14;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i16 = 10;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        str14 = str14;
                        i15 |= 2;
                        strDecodeStringElement = str18;
                        i16 = 10;
                        break;
                    case 2:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str14);
                        i15 |= 4;
                        strDecodeStringElement = str18;
                        i16 = 10;
                        break;
                    case 3:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str13);
                        i15 |= 8;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        i16 = 10;
                        break;
                    case 4:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str17);
                        i15 |= 16;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        i16 = 10;
                        break;
                    case 5:
                        zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i15 |= 32;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        i16 = 10;
                        break;
                    case 6:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str15);
                        i15 |= 64;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        i16 = 10;
                        break;
                    case 7:
                        str14 = str14;
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
                        i15 |= 128;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case 8:
                        str14 = str14;
                        zDecodeBooleanElement8 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
                        i15 |= 256;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case 9:
                        str14 = str14;
                        zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
                        i15 |= 512;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case 10:
                        str14 = str14;
                        action6 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), action6);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case 11:
                        str14 = str14;
                        genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, GenericInteraction$$serializer.INSTANCE, genericInteraction3);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case 12:
                        str14 = str14;
                        action5 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), action5);
                        i15 |= 4096;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case 13:
                        str14 = str14;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), list3);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case 14:
                        str14 = str14;
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str16);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case 15:
                        d15 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, DoubleSerializer.INSTANCE, d15);
                        i14 = 32768;
                        i15 |= i14;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case 16:
                        map5 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, (InterfaceC37137b) interfaceC23462hArr[16].getValue(), map5);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i15 |= i14;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        str14 = str14;
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, LenientAggregateBindingsSerializer.INSTANCE, map4);
                        i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        strDecodeStringElement = str18;
                        str14 = str14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            map = map4;
            str = str13;
            map2 = map5;
            str2 = str14;
            d3 = d15;
            list = list3;
            action = action5;
            genericInteraction = genericInteraction3;
            str3 = str15;
            str4 = str16;
            action2 = action6;
            str5 = str17;
            i13 = i15;
            str6 = strDecodeStringElement4;
            z4 = zDecodeBooleanElement5;
            z13 = zDecodeBooleanElement6;
            z14 = zDecodeBooleanElement7;
            z15 = zDecodeBooleanElement8;
            str7 = strDecodeStringElement;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SelectableCellModel(i13, str7, str6, str2, str, str5, z14, str3, z13, z15, z4, action2, genericInteraction, action, list, str4, d3, map2, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SelectableCellModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SelectableCellModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
