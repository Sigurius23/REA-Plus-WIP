package com.whoop.design.models.items;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.FloatSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/UpsellCardFeaturesModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/UpsellCardFeaturesModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class UpsellCardFeaturesModel$$serializer implements GeneratedSerializer<UpsellCardFeaturesModel> {
    public static final int $stable;
    public static final UpsellCardFeaturesModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        UpsellCardFeaturesModel$$serializer upsellCardFeaturesModel$$serializer = new UpsellCardFeaturesModel$$serializer();
        INSTANCE = upsellCardFeaturesModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.UpsellCardFeaturesModel", upsellCardFeaturesModel$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("endIcon", false);
        pluginGeneratedSerialDescriptor.addElement("titleImage", false);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("titleTypography", false);
        pluginGeneratedSerialDescriptor.addElement("tierImage", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("category", false);
        pluginGeneratedSerialDescriptor.addElement("trackingValue", false);
        pluginGeneratedSerialDescriptor.addElement("cardButton", false);
        pluginGeneratedSerialDescriptor.addElement("secondCardButton", false);
        pluginGeneratedSerialDescriptor.addElement("featureList", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionCard", false);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("sectionTopPadding", true);
        pluginGeneratedSerialDescriptor.addElement("sectionBottomPadding", true);
        pluginGeneratedSerialDescriptor.addElement("interItemPadding", true);
        pluginGeneratedSerialDescriptor.addElement("badge", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UpsellCardFeaturesModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = UpsellCardFeaturesModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d(stringSerializer);
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d9 = AbstractC38195a.m122336d(cardButtonModel$$serializer);
        InterfaceC37138c interfaceC37138cM122336d10 = AbstractC38195a.m122336d(cardButtonModel$$serializer);
        InterfaceC37138c interfaceC37138cM122336d11 = AbstractC38195a.m122336d(FeatureListModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d12 = AbstractC38195a.m122336d(DescriptionCardModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d13 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[14].getValue());
        InterfaceC37138c interfaceC37138cM122336d14 = AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, stringSerializer, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, stringSerializer, interfaceC37138cM122336d7, interfaceC37138cM122336d8, interfaceC37138cM122336d9, interfaceC37138cM122336d10, interfaceC37138cM122336d11, interfaceC37138cM122336d12, interfaceC37138cM122336d13, floatSerializer, floatSerializer, floatSerializer, interfaceC37138cM122336d14};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final UpsellCardFeaturesModel deserialize(InterfaceC40541d decoder) {
        String str;
        CardButtonModel cardButtonModel;
        String str2;
        String str3;
        int i13;
        TagModel tagModel;
        DescriptionCardModel descriptionCardModel;
        FeatureListModel featureListModel;
        CardButtonModel cardButtonModel2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List list;
        String str10;
        float f13;
        float f14;
        float f15;
        String str11;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = UpsellCardFeaturesModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
            CardButtonModel cardButtonModel3 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, cardButtonModel$$serializer, null);
            CardButtonModel cardButtonModel4 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, cardButtonModel$$serializer, null);
            FeatureListModel featureListModel2 = (FeatureListModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, FeatureListModel$$serializer.INSTANCE, null);
            DescriptionCardModel descriptionCardModel2 = (DescriptionCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, DescriptionCardModel$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 15);
            float fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 16);
            float fDecodeFloatElement3 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 17);
            str = str12;
            tagModel = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, TagModel$$serializer.INSTANCE, null);
            i13 = 524287;
            str2 = str15;
            str5 = str18;
            str8 = strDecodeStringElement;
            str7 = str13;
            f14 = fDecodeFloatElement2;
            cardButtonModel2 = cardButtonModel3;
            f15 = fDecodeFloatElement;
            str10 = strDecodeStringElement2;
            str9 = str17;
            str6 = str16;
            str3 = str14;
            f13 = fDecodeFloatElement3;
            list = list2;
            str4 = str19;
            descriptionCardModel = descriptionCardModel2;
            featureListModel = featureListModel2;
            cardButtonModel = cardButtonModel4;
        } else {
            float fDecodeFloatElement4 = 0.0f;
            float fDecodeFloatElement5 = 0.0f;
            float fDecodeFloatElement6 = 0.0f;
            boolean z4 = true;
            List list3 = null;
            String str20 = null;
            CardButtonModel cardButtonModel5 = null;
            String str21 = null;
            String str22 = null;
            TagModel tagModel2 = null;
            DescriptionCardModel descriptionCardModel3 = null;
            FeatureListModel featureListModel3 = null;
            CardButtonModel cardButtonModel6 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str26 = null;
            int i14 = 0;
            String str27 = null;
            while (z4) {
                String str28 = str27;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str28;
                        z4 = false;
                        str27 = str11;
                        str20 = str20;
                        list3 = list3;
                        break;
                    case 0:
                        str11 = str28;
                        str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str26);
                        i14 |= 1;
                        str27 = str11;
                        str20 = str20;
                        list3 = list3;
                        break;
                    case 1:
                        list3 = list3;
                        str20 = str20;
                        str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str28);
                        i14 |= 2;
                        str20 = str20;
                        list3 = list3;
                        break;
                    case 2:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i14 |= 4;
                        list3 = list3;
                        str27 = str28;
                        break;
                    case 3:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str22);
                        i14 |= 8;
                        list3 = list3;
                        str27 = str28;
                        break;
                    case 4:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str21);
                        i14 |= 16;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 5:
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str25);
                        i14 |= 32;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 6:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str20);
                        i14 |= 64;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 7:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i14 |= 128;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 8:
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str24);
                        i14 |= 256;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 9:
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str23);
                        i14 |= 512;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 10:
                        cardButtonModel6 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, CardButtonModel$$serializer.INSTANCE, cardButtonModel6);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 11:
                        cardButtonModel5 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, CardButtonModel$$serializer.INSTANCE, cardButtonModel5);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 12:
                        featureListModel3 = (FeatureListModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, FeatureListModel$$serializer.INSTANCE, featureListModel3);
                        i14 |= 4096;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 13:
                        descriptionCardModel3 = (DescriptionCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, DescriptionCardModel$$serializer.INSTANCE, descriptionCardModel3);
                        i14 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 14:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), list3);
                        i14 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 15:
                        fDecodeFloatElement6 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 15);
                        i14 |= 32768;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case 16:
                        fDecodeFloatElement5 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 16);
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        fDecodeFloatElement4 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 17);
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        str27 = str28;
                        str22 = str22;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, TagModel$$serializer.INSTANCE, tagModel2);
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        str27 = str28;
                        str22 = str22;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str26;
            cardButtonModel = cardButtonModel5;
            str2 = str21;
            str3 = str22;
            i13 = i14;
            tagModel = tagModel2;
            descriptionCardModel = descriptionCardModel3;
            featureListModel = featureListModel3;
            cardButtonModel2 = cardButtonModel6;
            str4 = str23;
            str5 = str24;
            str6 = str25;
            str7 = str27;
            str8 = strDecodeStringElement3;
            str9 = str20;
            list = list3;
            str10 = strDecodeStringElement4;
            f13 = fDecodeFloatElement4;
            f14 = fDecodeFloatElement5;
            f15 = fDecodeFloatElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new UpsellCardFeaturesModel(i13, str, str7, str8, str3, str2, str6, str9, str10, str5, str4, cardButtonModel2, cardButtonModel, featureListModel, descriptionCardModel, list, f15, f14, f13, tagModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, UpsellCardFeaturesModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        UpsellCardFeaturesModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
