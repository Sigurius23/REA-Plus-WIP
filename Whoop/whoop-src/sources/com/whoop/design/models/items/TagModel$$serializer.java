package com.whoop.design.models.items;

import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.whoopaction.domain.models.Action;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/TagModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/TagModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/TagModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/TagModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TagModel$$serializer implements GeneratedSerializer<TagModel> {
    public static final int $stable;
    public static final TagModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TagModel$$serializer tagModel$$serializer = new TagModel$$serializer();
        INSTANCE = tagModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.TagModel", tagModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("leftIcon", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("rightIcon", true);
        pluginGeneratedSerialDescriptor.addElement("tagStyle", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundColor", true);
        pluginGeneratedSerialDescriptor.addElement("textColor", true);
        pluginGeneratedSerialDescriptor.addElement("destination", true);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("avatars", true);
        pluginGeneratedSerialDescriptor.addElement("iconSize", true);
        pluginGeneratedSerialDescriptor.addElement("interaction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TagModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TagModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue()), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TagModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        IconSize iconSize;
        Action action;
        List list;
        C9598e c9598e;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        TagBackgroundStyle tagBackgroundStyle;
        GenericInteraction genericInteraction;
        String str7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TagModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            TagBackgroundStyle tagBackgroundStyle2 = (TagBackgroundStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            Action action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            IconSize iconSize2 = (IconSize) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            i13 = 8191;
            genericInteraction = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, GenericInteraction$$serializer.INSTANCE, null);
            str4 = str13;
            str3 = str8;
            list = list2;
            str6 = str11;
            str5 = str12;
            str2 = str10;
            str = str9;
            tagBackgroundStyle = tagBackgroundStyle2;
            action = action2;
            c9598e = c9598e2;
            str7 = strDecodeStringElement;
            iconSize = iconSize2;
        } else {
            GenericInteraction genericInteraction2 = null;
            String str14 = null;
            IconSize iconSize3 = null;
            Action action3 = null;
            List list3 = null;
            C9598e c9598e3 = null;
            String str15 = null;
            String strDecodeStringElement2 = null;
            int i14 = 7;
            int i15 = 6;
            int i16 = 3;
            boolean z4 = true;
            i13 = 0;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            TagBackgroundStyle tagBackgroundStyle3 = null;
            while (z4) {
                String str20 = strDecodeStringElement2;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        genericInteraction2 = genericInteraction2;
                        strDecodeStringElement2 = str20;
                        i16 = 3;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 0:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str14);
                        i13 |= 1;
                        genericInteraction2 = genericInteraction2;
                        strDecodeStringElement2 = str20;
                        i16 = 3;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 1:
                        i13 |= 2;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        str14 = str14;
                        i16 = 3;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 2:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str16);
                        i13 |= 4;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        i16 = 3;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 3:
                        tagBackgroundStyle3 = (TagBackgroundStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), tagBackgroundStyle3);
                        i13 |= 8;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 4:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str15);
                        i13 |= 16;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 5:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str19);
                        i13 |= 32;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 6:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), c9598e3);
                        i13 |= 64;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        i14 = 7;
                        break;
                    case 7:
                        action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), action3);
                        i13 |= 128;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        break;
                    case 8:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str18);
                        i13 |= 256;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        break;
                    case 9:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str17);
                        i13 |= 512;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        break;
                    case 10:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), list3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        break;
                    case 11:
                        iconSize3 = (IconSize) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), iconSize3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        break;
                    case 12:
                        genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, GenericInteraction$$serializer.INSTANCE, genericInteraction2);
                        i13 |= 4096;
                        strDecodeStringElement2 = str20;
                        str14 = str14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str16;
            iconSize = iconSize3;
            action = action3;
            list = list3;
            c9598e = c9598e3;
            str2 = str15;
            str3 = str14;
            str4 = str17;
            str5 = str18;
            str6 = str19;
            tagBackgroundStyle = tagBackgroundStyle3;
            genericInteraction = genericInteraction2;
            str7 = strDecodeStringElement2;
        }
        int i17 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TagModel(i17, str3, str7, str, tagBackgroundStyle, str2, str6, c9598e, action, str5, str4, list, iconSize, genericInteraction, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TagModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TagModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
