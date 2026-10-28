package com.whoop.design.models.items;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.navigation.C9598e;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/InsightsItemModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/InsightsItemModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/InsightsItemModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/InsightsItemModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class InsightsItemModel$$serializer implements GeneratedSerializer<InsightsItemModel> {
    public static final int $stable;
    public static final InsightsItemModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        InsightsItemModel$$serializer insightsItemModel$$serializer = new InsightsItemModel$$serializer();
        INSTANCE = insightsItemModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.InsightsItemModel", insightsItemModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("titleColor", true);
        pluginGeneratedSerialDescriptor.addElement("titleStyle", true);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("actionRecommendation", false);
        pluginGeneratedSerialDescriptor.addElement("callout", false);
        pluginGeneratedSerialDescriptor.addElement("actionButton", false);
        pluginGeneratedSerialDescriptor.addElement("rightIcon", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("textAlignment", true);
        pluginGeneratedSerialDescriptor.addElement("expandableContent", true);
        pluginGeneratedSerialDescriptor.addElement("iconStyle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InsightsItemModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = InsightsItemModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, ImpactModel$$serializer.INSTANCE, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(InfoCalloutTileModel$$serializer.INSTANCE), AbstractC38195a.m122336d(CardButtonModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(ExpandableContentModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final InsightsItemModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        C9598e c9598e;
        String str5;
        InfoCalloutTileModel infoCalloutTileModel;
        ExpandableContentModel expandableContentModel;
        CardButtonModel cardButtonModel;
        String str6;
        ImpactModel impactModel;
        String str7;
        String str8;
        String str9;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = InsightsItemModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            ImpactModel impactModel2 = (ImpactModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ImpactModel$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            InfoCalloutTileModel infoCalloutTileModel2 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, InfoCalloutTileModel$$serializer.INSTANCE, null);
            CardButtonModel cardButtonModel2 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, CardButtonModel$$serializer.INSTANCE, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            i13 = 16383;
            expandableContentModel = (ExpandableContentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, ExpandableContentModel$$serializer.INSTANCE, null);
            str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            impactModel = impactModel2;
            str7 = strDecodeStringElement2;
            str5 = str13;
            infoCalloutTileModel = infoCalloutTileModel2;
            str6 = str12;
            str8 = strDecodeStringElement3;
            str2 = str10;
            cardButtonModel = cardButtonModel2;
            str = str11;
            str4 = str14;
            c9598e = c9598e2;
            str9 = strDecodeStringElement;
        } else {
            boolean z4 = true;
            String strDecodeStringElement4 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            C9598e c9598e3 = null;
            String str18 = null;
            InfoCalloutTileModel infoCalloutTileModel3 = null;
            ExpandableContentModel expandableContentModel2 = null;
            CardButtonModel cardButtonModel3 = null;
            String str19 = null;
            ImpactModel impactModel3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            i13 = 0;
            String str20 = null;
            while (z4) {
                interfaceC23462hArr = interfaceC23462hArr;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i13 |= 1;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        break;
                    case 1:
                        impactModel3 = (ImpactModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, ImpactModel$$serializer.INSTANCE, impactModel3);
                        i13 |= 2;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 3:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str20);
                        i13 |= 8;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 4:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str15);
                        i13 |= 16;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 5:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 6:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str19);
                        i13 |= 64;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 7:
                        infoCalloutTileModel3 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel3);
                        i13 |= 128;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 8:
                        cardButtonModel3 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, CardButtonModel$$serializer.INSTANCE, cardButtonModel3);
                        i13 |= 256;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 9:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str18);
                        i13 |= 512;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 10:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), c9598e3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 11:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str17);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 12:
                        expandableContentModel2 = (ExpandableContentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, ExpandableContentModel$$serializer.INSTANCE, expandableContentModel2);
                        i13 |= 4096;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    case 13:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str16);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        strDecodeStringElement4 = strDecodeStringElement4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str15;
            str2 = str20;
            str3 = str16;
            str4 = str17;
            c9598e = c9598e3;
            str5 = str18;
            infoCalloutTileModel = infoCalloutTileModel3;
            expandableContentModel = expandableContentModel2;
            cardButtonModel = cardButtonModel3;
            str6 = str19;
            impactModel = impactModel3;
            str7 = strDecodeStringElement5;
            str8 = strDecodeStringElement6;
            str9 = strDecodeStringElement4;
        }
        int i14 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new InsightsItemModel(i14, str9, impactModel, str7, str2, str, str8, str6, infoCalloutTileModel, cardButtonModel, str5, c9598e, str4, expandableContentModel, str3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, InsightsItemModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        InsightsItemModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
