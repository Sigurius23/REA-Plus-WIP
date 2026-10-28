package com.whoop.design.models.items;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.whoopaction.domain.models.Action;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/PricingSelectionCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/PricingSelectionCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/PricingSelectionCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/PricingSelectionCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class PricingSelectionCardModel$$serializer implements GeneratedSerializer<PricingSelectionCardModel> {
    public static final int $stable;
    public static final PricingSelectionCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        PricingSelectionCardModel$$serializer pricingSelectionCardModel$$serializer = new PricingSelectionCardModel$$serializer();
        INSTANCE = pricingSelectionCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.PricingSelectionCardModel", pricingSelectionCardModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("priceLabel", false);
        pluginGeneratedSerialDescriptor.addElement("priceLabelSize", false);
        pluginGeneratedSerialDescriptor.addElement("priceSubLabel", false);
        pluginGeneratedSerialDescriptor.addElement("priceSubLabelMarkdown", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("features", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PricingSelectionCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = PricingSelectionCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE), stringSerializer, stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final PricingSelectionCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        String str3;
        Map map;
        List list;
        Action action;
        String str4;
        Map map2;
        TagModel tagModel;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = PricingSelectionCardModel.$childSerializers;
        int i14 = 10;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            TagModel tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, TagModel$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            Action action2 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            Map map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            i13 = 16383;
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, LenientAggregateBindingsSerializer.INSTANCE, null);
            str4 = str14;
            str2 = strDecodeStringElement;
            str9 = strDecodeStringElement4;
            tagModel = tagModel2;
            str8 = strDecodeStringElement3;
            str5 = str13;
            str7 = strDecodeStringElement2;
            action = action2;
            str3 = str12;
            str6 = str11;
            str = str10;
            map = map3;
            list = list2;
        } else {
            boolean z4 = true;
            String str15 = null;
            String strDecodeStringElement5 = null;
            String str16 = null;
            Map map4 = null;
            List list3 = null;
            Action action3 = null;
            String str17 = null;
            Map map5 = null;
            TagModel tagModel3 = null;
            String str18 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            i13 = 0;
            String str19 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 10;
                        break;
                    case 0:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str15);
                        i13 |= 1;
                        i14 = 10;
                        break;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        i14 = 10;
                        break;
                    case 2:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str19);
                        i13 |= 4;
                        i14 = 10;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        i14 = 10;
                        break;
                    case 4:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str16);
                        i13 |= 16;
                        i14 = 10;
                        break;
                    case 5:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str18);
                        i13 |= 32;
                        i14 = 10;
                        break;
                    case 6:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str17);
                        i13 |= 64;
                        i14 = 10;
                        break;
                    case 7:
                        tagModel3 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, TagModel$$serializer.INSTANCE, tagModel3);
                        i13 |= 128;
                        i14 = 10;
                        break;
                    case 8:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i13 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i13 |= 512;
                        break;
                    case 10:
                        int i15 = i14;
                        i14 = i15;
                        action3 = (Action) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), action3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    case 11:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), list3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i14 = i14;
                        break;
                    case 12:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), map4);
                        i13 |= 4096;
                        i14 = i14;
                        break;
                    case 13:
                        map5 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, LenientAggregateBindingsSerializer.INSTANCE, map5);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i14 = i14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str15;
            str2 = strDecodeStringElement5;
            str3 = str16;
            map = map4;
            list = list3;
            action = action3;
            str4 = str17;
            map2 = map5;
            tagModel = tagModel3;
            str5 = str18;
            str6 = str19;
            str7 = strDecodeStringElement6;
            str8 = strDecodeStringElement7;
            str9 = strDecodeStringElement8;
        }
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new PricingSelectionCardModel(i16, str, str2, str6, str7, str3, str5, str4, tagModel, str8, str9, action, list, map, map2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, PricingSelectionCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        PricingSelectionCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
