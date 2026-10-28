package com.whoop.design.models.items.shopmediacard;

import com.whoop.design.models.ContentType;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import gz0.EnumC16313m0;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import s31.EnumC32107d;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/shopmediacard/ShopMediaCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/shopmediacard/ShopMediaCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ShopMediaCardModel$$serializer implements GeneratedSerializer<ShopMediaCardModel> {
    public static final int $stable;
    public static final ShopMediaCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ShopMediaCardModel$$serializer shopMediaCardModel$$serializer = new ShopMediaCardModel$$serializer();
        INSTANCE = shopMediaCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.shopmediacard.ShopMediaCardModel", shopMediaCardModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("contentType", false);
        pluginGeneratedSerialDescriptor.addElement("contentUrl", false);
        pluginGeneratedSerialDescriptor.addElement("ctaText", false);
        pluginGeneratedSerialDescriptor.addElement("ctaIcon", false);
        pluginGeneratedSerialDescriptor.addElement("ctaInteraction", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("size", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ShopMediaCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ShopMediaCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE), AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE), interfaceC23462hArr[8].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ShopMediaCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TagModel tagModel;
        EnumC32107d enumC32107d;
        GenericInteraction genericInteraction;
        EnumC16313m0 enumC16313m0;
        String str;
        String str2;
        String str3;
        ContentType contentType;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ShopMediaCardModel.$childSerializers;
        int i14 = 7;
        int i15 = 6;
        int i16 = 5;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            ContentType contentType2 = (ContentType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            EnumC16313m0 enumC16313m1 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            GenericInteraction genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, GenericInteraction$$serializer.INSTANCE, null);
            TagModel tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, TagModel$$serializer.INSTANCE, null);
            enumC32107d = (EnumC32107d) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            str2 = strDecodeStringElement2;
            tagModel = tagModel2;
            genericInteraction = genericInteraction2;
            str4 = strDecodeStringElement3;
            str = str6;
            enumC16313m0 = enumC16313m1;
            i13 = 511;
            contentType = contentType2;
            str3 = str5;
        } else {
            int i17 = 2;
            boolean z4 = true;
            int i18 = 0;
            TagModel tagModel3 = null;
            EnumC32107d enumC32107d2 = null;
            GenericInteraction genericInteraction3 = null;
            EnumC16313m0 enumC16313m2 = null;
            String str7 = null;
            String str8 = null;
            ContentType contentType3 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int i19 = i16;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        i16 = 5;
                        i17 = 2;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i18 |= 1;
                        i14 = 7;
                        i15 = 6;
                        i16 = 5;
                        i17 = 2;
                        break;
                    case 1:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str8);
                        i18 |= 2;
                        i14 = 7;
                        i15 = 6;
                        i16 = 5;
                        i17 = 2;
                        break;
                    case 2:
                        contentType3 = (ContentType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), contentType3);
                        i18 |= 4;
                        i14 = 7;
                        i15 = 6;
                        i16 = 5;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i18 |= 8;
                        i14 = 7;
                        i16 = 5;
                        break;
                    case 4:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str7);
                        i18 |= 16;
                        i14 = 7;
                        i16 = 5;
                        break;
                    case 5:
                        enumC16313m2 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), enumC16313m2);
                        i18 |= 32;
                        i16 = i19;
                        i14 = 7;
                        break;
                    case 6:
                        genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, GenericInteraction$$serializer.INSTANCE, genericInteraction3);
                        i18 |= 64;
                        i16 = i19;
                        break;
                    case 7:
                        tagModel3 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, TagModel$$serializer.INSTANCE, tagModel3);
                        i18 |= 128;
                        i16 = i19;
                        break;
                    case 8:
                        enumC32107d2 = (EnumC32107d) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), enumC32107d2);
                        i18 |= 256;
                        i16 = i19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i18;
            tagModel = tagModel3;
            enumC32107d = enumC32107d2;
            genericInteraction = genericInteraction3;
            enumC16313m0 = enumC16313m2;
            str = str7;
            str2 = strDecodeStringElement;
            str3 = str8;
            contentType = contentType3;
            str4 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ShopMediaCardModel(i13, str2, str3, contentType, str4, str, enumC16313m0, genericInteraction, tagModel, enumC32107d, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ShopMediaCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ShopMediaCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
