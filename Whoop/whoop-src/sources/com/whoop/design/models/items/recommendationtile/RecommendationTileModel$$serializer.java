package com.whoop.design.models.items.recommendationtile;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/recommendationtile/RecommendationTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class RecommendationTileModel$$serializer implements GeneratedSerializer<RecommendationTileModel> {
    public static final int $stable;
    public static final RecommendationTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        RecommendationTileModel$$serializer recommendationTileModel$$serializer = new RecommendationTileModel$$serializer();
        INSTANCE = recommendationTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.recommendationtile.RecommendationTileModel", recommendationTileModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("recommendationId", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, false);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("body", true);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("isExpanded", true);
        pluginGeneratedSerialDescriptor.addElement("isSelected", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RecommendationTileModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = RecommendationTileModel.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, interfaceC23462hArr[1].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), interfaceC23462hArr[3].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), booleanSerializer, booleanSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final RecommendationTileModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        Map map;
        Map map2;
        DesignSystemModel designSystemModel;
        RecommendationTileLayoutStyle recommendationTileLayoutStyle;
        List list;
        DesignSystemModel designSystemModel2;
        RecommendationTileStatus recommendationTileStatus;
        boolean z13;
        int i13;
        String str;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = RecommendationTileModel.$childSerializers;
        int i15 = 9;
        int i16 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            RecommendationTileStatus recommendationTileStatus2 = (RecommendationTileStatus) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            DesignSystemModel designSystemModel3 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            DesignSystemModel designSystemModel4 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            RecommendationTileLayoutStyle recommendationTileLayoutStyle2 = (RecommendationTileLayoutStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            str = strDecodeStringElement;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, LenientAggregateBindingsSerializer.INSTANCE, null);
            z4 = zDecodeBooleanElement2;
            z13 = zDecodeBooleanElement;
            recommendationTileLayoutStyle = recommendationTileLayoutStyle2;
            list = list2;
            i13 = 1023;
            designSystemModel = designSystemModel4;
            designSystemModel2 = designSystemModel3;
            recommendationTileStatus = recommendationTileStatus2;
        } else {
            int i17 = 3;
            int i18 = 4;
            int i19 = 2;
            boolean z14 = true;
            boolean zDecodeBooleanElement3 = false;
            int i24 = 0;
            Map map3 = null;
            Map map4 = null;
            DesignSystemModel designSystemModel5 = null;
            RecommendationTileLayoutStyle recommendationTileLayoutStyle3 = null;
            List list3 = null;
            DesignSystemModel designSystemModel6 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement4 = false;
            RecommendationTileStatus recommendationTileStatus3 = null;
            while (z14) {
                int i25 = i16;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        i15 = 9;
                        i16 = 7;
                        i19 = 2;
                        i17 = 3;
                        i18 = 4;
                        break;
                    case 0:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i24 |= 1;
                        i15 = 9;
                        i16 = 7;
                        i19 = 2;
                        i17 = 3;
                        i18 = 4;
                        break;
                    case 1:
                        recommendationTileStatus3 = (RecommendationTileStatus) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), recommendationTileStatus3);
                        i24 |= 2;
                        i15 = 9;
                        i16 = 7;
                        i19 = 2;
                        i17 = 3;
                        i18 = 4;
                        break;
                    case 2:
                        designSystemModel6 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), designSystemModel6);
                        i24 |= 4;
                        i15 = 9;
                        i16 = 7;
                        i17 = 3;
                        i18 = 4;
                        break;
                    case 3:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list3);
                        i24 |= 8;
                        i15 = 9;
                        i16 = 7;
                        i18 = 4;
                        break;
                    case 4:
                        designSystemModel5 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), designSystemModel5);
                        i24 |= 16;
                        i15 = 9;
                        i16 = 7;
                        break;
                    case 5:
                        i24 |= 32;
                        i16 = i25;
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i15 = 9;
                        break;
                    case 6:
                        i14 = i25;
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i24 |= 64;
                        i16 = i14;
                        i15 = 9;
                        break;
                    case 7:
                        i14 = i25;
                        recommendationTileLayoutStyle3 = (RecommendationTileLayoutStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i25].getValue(), recommendationTileLayoutStyle3);
                        i24 |= 128;
                        i16 = i14;
                        i15 = 9;
                        break;
                    case 8:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), map4);
                        i24 |= 256;
                        i16 = i25;
                        break;
                    case 9:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i24 |= 512;
                        i16 = i25;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement3;
            map = map3;
            map2 = map4;
            designSystemModel = designSystemModel5;
            recommendationTileLayoutStyle = recommendationTileLayoutStyle3;
            list = list3;
            designSystemModel2 = designSystemModel6;
            recommendationTileStatus = recommendationTileStatus3;
            z13 = zDecodeBooleanElement4;
            i13 = i24;
            str = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new RecommendationTileModel(i13, str, recommendationTileStatus, designSystemModel2, list, designSystemModel, z13, z4, recommendationTileLayoutStyle, map2, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, RecommendationTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        RecommendationTileModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
