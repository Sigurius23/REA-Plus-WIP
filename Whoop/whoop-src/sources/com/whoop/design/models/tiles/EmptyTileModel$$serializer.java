package com.whoop.design.models.tiles;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import java.util.Map;
import k11.EnumC22118a;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/tiles/EmptyTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/tiles/EmptyTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/tiles/EmptyTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/tiles/EmptyTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class EmptyTileModel$$serializer implements GeneratedSerializer<EmptyTileModel> {
    public static final int $stable;
    public static final EmptyTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        EmptyTileModel$$serializer emptyTileModel$$serializer = new EmptyTileModel$$serializer();
        INSTANCE = emptyTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.tiles.EmptyTileModel", emptyTileModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("buttonConfiguration", true);
        pluginGeneratedSerialDescriptor.addElement("viewedAnalyticEvent", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EmptyTileModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = EmptyTileModel.$childSerializers;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE);
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(cardButtonModel$$serializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(cardButtonModel$$serializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue());
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(AnalyticEventModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue());
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final EmptyTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        Map map;
        Map map2;
        EnumC22118a enumC22118a;
        AnalyticEventModel analyticEventModel;
        CardButtonModel cardButtonModel;
        CardButtonModel cardButtonModel2;
        TagModel tagModel;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = EmptyTileModel.$childSerializers;
        int i14 = 10;
        int i15 = 7;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            TagModel tagModel2 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, TagModel$$serializer.INSTANCE, null);
            CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
            CardButtonModel cardButtonModel3 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, cardButtonModel$$serializer, null);
            CardButtonModel cardButtonModel4 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, cardButtonModel$$serializer, null);
            EnumC22118a enumC22118a2 = (EnumC22118a) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            AnalyticEventModel analyticEventModel2 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, AnalyticEventModel$$serializer.INSTANCE, null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            str = strDecodeStringElement2;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, LenientAggregateBindingsSerializer.INSTANCE, null);
            cardButtonModel = cardButtonModel4;
            cardButtonModel2 = cardButtonModel3;
            str4 = strDecodeStringElement5;
            analyticEventModel = analyticEventModel2;
            tagModel = tagModel2;
            str3 = strDecodeStringElement4;
            i13 = 2047;
            enumC22118a = enumC22118a2;
            str2 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i16 = 0;
            Map map3 = null;
            Map map4 = null;
            EnumC22118a enumC22118a3 = null;
            AnalyticEventModel analyticEventModel3 = null;
            CardButtonModel cardButtonModel5 = null;
            CardButtonModel cardButtonModel6 = null;
            TagModel tagModel3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int i17 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 2:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 3:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 4:
                        tagModel3 = (TagModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, TagModel$$serializer.INSTANCE, tagModel3);
                        i16 |= 16;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 5:
                        cardButtonModel6 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, CardButtonModel$$serializer.INSTANCE, cardButtonModel6);
                        i16 |= 32;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 6:
                        cardButtonModel5 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, CardButtonModel$$serializer.INSTANCE, cardButtonModel5);
                        i16 |= 64;
                        i14 = 10;
                        i15 = 7;
                        break;
                    case 7:
                        enumC22118a3 = (EnumC22118a) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC22118a3);
                        i16 |= 128;
                        i15 = i17;
                        i14 = 10;
                        break;
                    case 8:
                        analyticEventModel3 = (AnalyticEventModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, AnalyticEventModel$$serializer.INSTANCE, analyticEventModel3);
                        i16 |= 256;
                        i15 = i17;
                        break;
                    case 9:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), map4);
                        i16 |= 512;
                        i15 = i17;
                        break;
                    case 10:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            map = map3;
            map2 = map4;
            enumC22118a = enumC22118a3;
            analyticEventModel = analyticEventModel3;
            cardButtonModel = cardButtonModel5;
            cardButtonModel2 = cardButtonModel6;
            tagModel = tagModel3;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new EmptyTileModel(i13, str, str2, str3, str4, tagModel, cardButtonModel2, cardButtonModel, enumC22118a, analyticEventModel, map2, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, EmptyTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        EmptyTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
