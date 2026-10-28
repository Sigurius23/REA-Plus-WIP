package com.whoop.universalcheckout.features.shippingaddress.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ShippingAddressField$$serializer implements GeneratedSerializer<ShippingAddressField> {
    public static final int $stable;
    public static final ShippingAddressField$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ShippingAddressField$$serializer shippingAddressField$$serializer = new ShippingAddressField$$serializer();
        INSTANCE = shippingAddressField$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField", shippingAddressField$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("labelExtension", true);
        pluginGeneratedSerialDescriptor.addElement("prefillText", true);
        pluginGeneratedSerialDescriptor.addElement("fieldType", true);
        pluginGeneratedSerialDescriptor.addElement("isRequired", true);
        pluginGeneratedSerialDescriptor.addElement("maxLength", true);
        pluginGeneratedSerialDescriptor.addElement("minLength", true);
        pluginGeneratedSerialDescriptor.addElement("pattern", true);
        pluginGeneratedSerialDescriptor.addElement("example", true);
        pluginGeneratedSerialDescriptor.addElement("autoCompleteField", true);
        pluginGeneratedSerialDescriptor.addElement("customErrorKey", true);
        pluginGeneratedSerialDescriptor.addElement("dropdownLookup", true);
        pluginGeneratedSerialDescriptor.addElement("isReadOnly", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ShippingAddressField$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(DropdownLookup$$serializer.INSTANCE), AbstractC38195a.m122336d(booleanSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ShippingAddressField deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        String str5;
        String str6;
        Integer num;
        DropdownLookup dropdownLookup;
        String str7;
        Integer num2;
        Boolean bool2;
        int i13;
        String str8;
        String str9;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, intSerializer, null);
            Integer num4 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, intSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            dropdownLookup = (DropdownLookup) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, DropdownLookup$$serializer.INSTANCE, null);
            str8 = strDecodeStringElement3;
            bool = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, booleanSerializer, null);
            i13 = 16383;
            num = num4;
            str6 = str14;
            str7 = str13;
            num2 = num3;
            bool2 = bool3;
            str3 = str11;
            str5 = str15;
            str = str12;
            str2 = str10;
            str4 = str16;
            str9 = strDecodeStringElement2;
        } else {
            int i14 = 0;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            Boolean bool4 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            Integer num5 = null;
            DropdownLookup dropdownLookup2 = null;
            String str23 = null;
            Integer num6 = null;
            String strDecodeStringElement4 = null;
            boolean z4 = true;
            Boolean bool5 = null;
            while (z4) {
                String str24 = strDecodeStringElement;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = i14;
                        strDecodeStringElement = str24;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 |= 1;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        strDecodeStringElement = str24;
                        break;
                    case 2:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str18);
                        i14 |= 4;
                        strDecodeStringElement = str24;
                        break;
                    case 3:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str19);
                        i14 |= 8;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 4:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str17);
                        i14 |= 16;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 5:
                        bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BooleanSerializer.INSTANCE, bool5);
                        i14 |= 32;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 6:
                        num6 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, IntSerializer.INSTANCE, num6);
                        i14 |= 64;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 7:
                        num5 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, IntSerializer.INSTANCE, num5);
                        i14 |= 128;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 8:
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str23);
                        i14 |= 256;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 9:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str22);
                        i14 |= 512;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 10:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str21);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 11:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str20);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 12:
                        dropdownLookup2 = (DropdownLookup) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, DropdownLookup$$serializer.INSTANCE, dropdownLookup2);
                        i14 |= 4096;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    case 13:
                        bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, BooleanSerializer.INSTANCE, bool4);
                        i14 |= DfuBaseService.ERROR_REMOTE_MASK;
                        strDecodeStringElement = str24;
                        str18 = str18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str17;
            str2 = str18;
            str3 = str19;
            bool = bool4;
            str4 = str20;
            str5 = str21;
            str6 = str22;
            num = num5;
            dropdownLookup = dropdownLookup2;
            str7 = str23;
            num2 = num6;
            bool2 = bool5;
            i13 = i14;
            str8 = strDecodeStringElement4;
            str9 = strDecodeStringElement;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ShippingAddressField(i13, str9, str8, str2, str3, str, bool2, num2, num, str7, str6, str5, str4, dropdownLookup, bool, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ShippingAddressField value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ShippingAddressField.write$Self$universal_checkout_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
