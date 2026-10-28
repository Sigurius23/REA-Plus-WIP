package com.whoop.design.models.cards;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.whoopaction.domain.models.Action;
import java.util.List;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/cards/ButtonCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/cards/ButtonCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/cards/ButtonCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/cards/ButtonCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ButtonCardModel$$serializer implements GeneratedSerializer<ButtonCardModel> {
    public static final int $stable;
    public static final ButtonCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ButtonCardModel$$serializer buttonCardModel$$serializer = new ButtonCardModel$$serializer();
        INSTANCE = buttonCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.cards.ButtonCardModel", buttonCardModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrlAlignment", false);
        pluginGeneratedSerialDescriptor.addElement("imageSize", true);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("expandedItems", false);
        pluginGeneratedSerialDescriptor.addElement("isExpanded", false);
        pluginGeneratedSerialDescriptor.addElement("dismissIcon", false);
        pluginGeneratedSerialDescriptor.addElement("dismissAction", false);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("price", true);
        pluginGeneratedSerialDescriptor.addElement("titleColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ButtonCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ButtonCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(IntSerializer.INSTANCE), AbstractC38195a.m122336d(CardButtonModel$$serializer.INSTANCE), AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), interfaceC23462hArr[13].getValue(), AbstractC38195a.m122336d(ButtonCardPriceModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[15].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ButtonCardModel deserialize(InterfaceC40541d decoder) {
        String str;
        ButtonCardStyleDtoEnum buttonCardStyleDtoEnum;
        String str2;
        int i13;
        Boolean bool;
        List list;
        List list2;
        CardButtonModel cardButtonModel;
        TagModel tagModel;
        Integer num;
        Action action;
        String str3;
        String str4;
        ButtonCardPriceModel buttonCardPriceModel;
        String str5;
        EnumC39333f enumC39333f;
        String str6;
        String strDecodeStringElement;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ButtonCardModel.$childSerializers;
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, IntSerializer.INSTANCE, null);
            CardButtonModel cardButtonModel2 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, CardButtonModel$$serializer.INSTANCE, null);
            TagModel tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, TagModel$$serializer.INSTANCE, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, BooleanSerializer.INSTANCE, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            Action action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            ButtonCardStyleDtoEnum buttonCardStyleDtoEnum2 = (ButtonCardStyleDtoEnum) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            buttonCardPriceModel = (ButtonCardPriceModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, ButtonCardPriceModel$$serializer.INSTANCE, null);
            str6 = strDecodeStringElement3;
            list2 = list3;
            enumC39333f = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), null);
            num = num2;
            tagModel = tagModel2;
            cardButtonModel = cardButtonModel2;
            list = list4;
            str3 = str7;
            str = str8;
            str4 = strDecodeStringElement5;
            str2 = str9;
            i13 = 65535;
            str5 = strDecodeStringElement4;
            buttonCardStyleDtoEnum = buttonCardStyleDtoEnum2;
            action = action2;
            bool = bool2;
        } else {
            int i15 = 15;
            boolean z4 = true;
            int i16 = 8;
            String str10 = null;
            EnumC39333f enumC39333f2 = null;
            String str11 = null;
            String str12 = null;
            Boolean bool3 = null;
            List list5 = null;
            List list6 = null;
            CardButtonModel cardButtonModel3 = null;
            TagModel tagModel3 = null;
            Integer num3 = null;
            ButtonCardStyleDtoEnum buttonCardStyleDtoEnum3 = null;
            ButtonCardPriceModel buttonCardPriceModel2 = null;
            String strDecodeStringElement6 = null;
            int i17 = 9;
            int i18 = 0;
            Action action3 = null;
            String str13 = null;
            while (z4) {
                int i19 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        strDecodeStringElement = str12;
                        i14 = i18;
                        z4 = false;
                        str12 = strDecodeStringElement;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i16 = 8;
                        i17 = 9;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 0:
                        str12 = str12;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i16 = 8;
                        i17 = 9;
                        i18 |= 1;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        break;
                    case 1:
                        strDecodeStringElement = str12;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = i18 | 2;
                        str12 = strDecodeStringElement;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i16 = 8;
                        i17 = 9;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 2:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i14 = i18 | 4;
                        str12 = strDecodeStringElement;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i16 = 8;
                        i17 = 9;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 3:
                        strDecodeStringElement = str12;
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str13);
                        i14 = i18 | 8;
                        str12 = strDecodeStringElement;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i16 = 8;
                        i17 = 9;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 4:
                        strDecodeStringElement = str12;
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str10);
                        i14 = i18 | 16;
                        str12 = strDecodeStringElement;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i16 = 8;
                        i17 = 9;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 5:
                        strDecodeStringElement = str12;
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, IntSerializer.INSTANCE, num3);
                        i14 = i18 | 32;
                        str12 = strDecodeStringElement;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i16 = 8;
                        i17 = 9;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 6:
                        strDecodeStringElement = str12;
                        cardButtonModel3 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, CardButtonModel$$serializer.INSTANCE, cardButtonModel3);
                        i14 = i18 | 64;
                        str12 = strDecodeStringElement;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i16 = 8;
                        i17 = 9;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 7:
                        strDecodeStringElement = str12;
                        tagModel3 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, TagModel$$serializer.INSTANCE, tagModel3);
                        i14 = i18 | 128;
                        str12 = strDecodeStringElement;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i16 = 8;
                        i17 = 9;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 8:
                        strDecodeStringElement2 = strDecodeStringElement2;
                        list6 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list6);
                        i14 = i18 | 256;
                        str12 = str12;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i17 = 9;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 9:
                        list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list5);
                        i14 = i18 | 512;
                        str12 = str12;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 10:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, BooleanSerializer.INSTANCE, bool3);
                        i14 = i18 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str12 = str12;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 11:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str11);
                        i14 = i18 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str12 = str12;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 12:
                        action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), action3);
                        i14 = i18 | 4096;
                        str12 = str12;
                        enumC39333f2 = enumC39333f2;
                        i15 = 15;
                        i18 = i14;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        break;
                    case 13:
                        buttonCardStyleDtoEnum3 = (ButtonCardStyleDtoEnum) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), buttonCardStyleDtoEnum3);
                        i18 |= DfuBaseService.ERROR_REMOTE_MASK;
                        enumC39333f2 = enumC39333f2;
                        str12 = str12;
                        buttonCardPriceModel2 = buttonCardPriceModel2;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i15 = 15;
                        break;
                    case 14:
                        buttonCardPriceModel2 = (ButtonCardPriceModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, ButtonCardPriceModel$$serializer.INSTANCE, buttonCardPriceModel2);
                        i18 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        enumC39333f2 = enumC39333f2;
                        str12 = str12;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i15 = 15;
                        break;
                    case 15:
                        enumC39333f2 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), enumC39333f2);
                        i18 |= 32768;
                        strDecodeStringElement2 = strDecodeStringElement2;
                        i15 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str14 = strDecodeStringElement2;
            str = str10;
            buttonCardStyleDtoEnum = buttonCardStyleDtoEnum3;
            str2 = str11;
            i13 = i18;
            bool = bool3;
            list = list5;
            list2 = list6;
            cardButtonModel = cardButtonModel3;
            tagModel = tagModel3;
            num = num3;
            action = action3;
            str3 = str13;
            str4 = str12;
            buttonCardPriceModel = buttonCardPriceModel2;
            str5 = strDecodeStringElement6;
            enumC39333f = enumC39333f2;
            str6 = str14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ButtonCardModel(i13, str6, str5, str4, str3, str, num, cardButtonModel, tagModel, list2, list, bool, str2, action, buttonCardStyleDtoEnum, buttonCardPriceModel, enumC39333f, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ButtonCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ButtonCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
