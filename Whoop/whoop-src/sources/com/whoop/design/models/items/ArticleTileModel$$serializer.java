package com.whoop.design.models.items;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import kotlinx.serialization.UnknownFieldException;
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
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ArticleTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ArticleTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ArticleTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ArticleTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ArticleTileModel$$serializer implements GeneratedSerializer<ArticleTileModel> {
    public static final int $stable;
    public static final ArticleTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ArticleTileModel$$serializer articleTileModel$$serializer = new ArticleTileModel$$serializer();
        INSTANCE = articleTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ArticleTileModel", articleTileModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subText", true);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("size", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("paragraph", false);
        pluginGeneratedSerialDescriptor.addElement("publishDate", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("articleUrl", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("index", true);
        pluginGeneratedSerialDescriptor.addElement("borderStyle", true);
        pluginGeneratedSerialDescriptor.addElement("genericInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("analyticEvent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ArticleTileModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ArticleTileModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, interfaceC23462hArr[4].getValue(), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue()), AbstractC38195a.m122336d(IntSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[13].getValue()), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE), AbstractC38195a.m122336d(AnalyticEventModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ArticleTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        ArticleTileTypeDtoEnum articleTileTypeDtoEnum;
        String str2;
        GenericInteraction genericInteraction;
        Integer num;
        ArticleTileModelEventEnum articleTileModelEventEnum;
        String str3;
        String str4;
        TileBorderStyle tileBorderStyle;
        String str5;
        String str6;
        String str7;
        String str8;
        AnalyticEventModel analyticEventModel;
        String str9;
        String str10;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ArticleTileModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            ArticleTileTypeDtoEnum articleTileTypeDtoEnum2 = (ArticleTileTypeDtoEnum) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            ArticleTileModelEventEnum articleTileModelEventEnum2 = (ArticleTileModelEventEnum) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, IntSerializer.INSTANCE, null);
            TileBorderStyle tileBorderStyle2 = (TileBorderStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            GenericInteraction genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, GenericInteraction$$serializer.INSTANCE, null);
            i13 = 65535;
            analyticEventModel = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, AnalyticEventModel$$serializer.INSTANCE, null);
            str9 = strDecodeStringElement;
            articleTileTypeDtoEnum = articleTileTypeDtoEnum2;
            str10 = strDecodeStringElement2;
            str8 = strDecodeStringElement4;
            str = str15;
            str5 = str13;
            str6 = str12;
            str4 = str14;
            str7 = strDecodeStringElement3;
            str3 = str16;
            str2 = str11;
            genericInteraction = genericInteraction2;
            tileBorderStyle = tileBorderStyle2;
            num = num2;
            articleTileModelEventEnum = articleTileModelEventEnum2;
        } else {
            AnalyticEventModel analyticEventModel2 = null;
            String strDecodeStringElement5 = null;
            String str17 = null;
            GenericInteraction genericInteraction3 = null;
            Integer num3 = null;
            ArticleTileModelEventEnum articleTileModelEventEnum3 = null;
            String str18 = null;
            String str19 = null;
            TileBorderStyle tileBorderStyle3 = null;
            String str20 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int i14 = 4;
            boolean z4 = true;
            String str21 = null;
            String str22 = null;
            i13 = 0;
            ArticleTileTypeDtoEnum articleTileTypeDtoEnum3 = null;
            while (z4) {
                String str23 = strDecodeStringElement5;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        analyticEventModel2 = analyticEventModel2;
                        strDecodeStringElement5 = str23;
                        i14 = 4;
                        break;
                    case 0:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        analyticEventModel2 = analyticEventModel2;
                        strDecodeStringElement5 = str23;
                        i14 = 4;
                        break;
                    case 1:
                        i13 |= 2;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        analyticEventModel2 = analyticEventModel2;
                        i14 = 4;
                        break;
                    case 2:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str17);
                        i13 |= 4;
                        analyticEventModel2 = analyticEventModel2;
                        strDecodeStringElement5 = str23;
                        i14 = 4;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 4:
                        articleTileTypeDtoEnum3 = (ArticleTileTypeDtoEnum) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), articleTileTypeDtoEnum3);
                        i13 |= 16;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 5:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 6:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str22);
                        i13 |= 64;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 7:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str20);
                        i13 |= 128;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 8:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str19);
                        i13 |= 256;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 9:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str21);
                        i13 |= 512;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 10:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str18);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 11:
                        articleTileModelEventEnum3 = (ArticleTileModelEventEnum) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), articleTileModelEventEnum3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 12:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, IntSerializer.INSTANCE, num3);
                        i13 |= 4096;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 13:
                        tileBorderStyle3 = (TileBorderStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), tileBorderStyle3);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 14:
                        genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, GenericInteraction$$serializer.INSTANCE, genericInteraction3);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    case 15:
                        analyticEventModel2 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, AnalyticEventModel$$serializer.INSTANCE, analyticEventModel2);
                        i13 |= 32768;
                        strDecodeStringElement5 = str23;
                        str17 = str17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str21;
            articleTileTypeDtoEnum = articleTileTypeDtoEnum3;
            str2 = str17;
            genericInteraction = genericInteraction3;
            num = num3;
            articleTileModelEventEnum = articleTileModelEventEnum3;
            str3 = str18;
            str4 = str19;
            tileBorderStyle = tileBorderStyle3;
            str5 = str20;
            str6 = str22;
            str7 = strDecodeStringElement6;
            str8 = strDecodeStringElement7;
            analyticEventModel = analyticEventModel2;
            str9 = strDecodeStringElement8;
            str10 = strDecodeStringElement5;
        }
        int i15 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ArticleTileModel(i15, str9, str10, str2, str7, articleTileTypeDtoEnum, str8, str6, str5, str4, str, str3, articleTileModelEventEnum, num, tileBorderStyle, genericInteraction, analyticEventModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ArticleTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ArticleTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
