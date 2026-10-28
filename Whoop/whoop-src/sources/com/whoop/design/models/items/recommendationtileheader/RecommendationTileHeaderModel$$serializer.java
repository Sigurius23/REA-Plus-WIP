package com.whoop.design.models.items.recommendationtileheader;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class RecommendationTileHeaderModel$$serializer implements GeneratedSerializer<RecommendationTileHeaderModel> {
    public static final int $stable;
    public static final RecommendationTileHeaderModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        RecommendationTileHeaderModel$$serializer recommendationTileHeaderModel$$serializer = new RecommendationTileHeaderModel$$serializer();
        INSTANCE = recommendationTileHeaderModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.recommendationtileheader.RecommendationTileHeaderModel", recommendationTileHeaderModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("leading", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("titleTypography", false);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("trailing", false);
        pluginGeneratedSerialDescriptor.addElement("emoji", false);
        pluginGeneratedSerialDescriptor.addElement("iconBackgroundEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("interaction", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RecommendationTileHeaderModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = RecommendationTileHeaderModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[1].getValue()), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), interfaceC23462hArr[5].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final RecommendationTileHeaderModel deserialize(InterfaceC40541d decoder) {
        DesignSystemModel designSystemModel;
        String str;
        DesignSystemModel designSystemModel2;
        DesignSystemModel designSystemModel3;
        String str2;
        int i13;
        Map map;
        Map map2;
        GenericInteraction genericInteraction;
        List list;
        EnumC2888c enumC2888c;
        String str3;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = RecommendationTileHeaderModel.$childSerializers;
        char c3 = '\t';
        String str4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            DesignSystemModel designSystemModel4 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            EnumC2888c enumC2888c2 = (EnumC2888c) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            DesignSystemModel designSystemModel5 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            DesignSystemModel designSystemModel6 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
            GenericInteraction genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, GenericInteraction$$serializer.INSTANCE, null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            str2 = str6;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, LenientAggregateBindingsSerializer.INSTANCE, null);
            genericInteraction = genericInteraction2;
            str3 = strDecodeStringElement;
            z4 = zDecodeBooleanElement;
            enumC2888c = enumC2888c2;
            designSystemModel = designSystemModel4;
            designSystemModel2 = designSystemModel6;
            designSystemModel3 = designSystemModel5;
            list = list2;
            i13 = 4095;
            str = str5;
        } else {
            DesignSystemModel designSystemModel7 = null;
            DesignSystemModel designSystemModel8 = null;
            DesignSystemModel designSystemModel9 = null;
            String str7 = null;
            String strDecodeStringElement2 = null;
            int i14 = 7;
            int i15 = 6;
            int i16 = 5;
            int i17 = 4;
            int i18 = 1;
            boolean z13 = true;
            int i19 = 0;
            boolean zDecodeBooleanElement2 = false;
            Map map3 = null;
            Map map4 = null;
            GenericInteraction genericInteraction3 = null;
            List list3 = null;
            EnumC2888c enumC2888c3 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i18 = 1;
                        i17 = 4;
                        i16 = 5;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 0:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str4);
                        i19 |= 1;
                        c3 = '\t';
                        i18 = 1;
                        i17 = 4;
                        i16 = 5;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 1:
                        designSystemModel7 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), designSystemModel7);
                        i19 |= 2;
                        c3 = '\t';
                        i17 = 4;
                        i16 = 5;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 2:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str7);
                        i19 |= 4;
                        c3 = '\t';
                        i17 = 4;
                        i16 = 5;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 3:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i19 |= 8;
                        c3 = '\t';
                        i16 = 5;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 4:
                        enumC2888c3 = (EnumC2888c) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC2888c3);
                        i19 |= 16;
                        c3 = '\t';
                        i16 = 5;
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 5:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list3);
                        i19 |= 32;
                        c3 = '\t';
                        i15 = 6;
                        i14 = 7;
                        break;
                    case 6:
                        designSystemModel9 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), designSystemModel9);
                        i19 |= 64;
                        c3 = '\t';
                        i14 = 7;
                        break;
                    case 7:
                        designSystemModel8 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), designSystemModel8);
                        i19 |= 128;
                        c3 = '\t';
                        break;
                    case 8:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
                        i19 |= 256;
                        c3 = c3;
                        break;
                    case 9:
                        genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, GenericInteraction$$serializer.INSTANCE, genericInteraction3);
                        i19 |= 512;
                        c3 = '\t';
                        break;
                    case 10:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), map4);
                        i19 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        c3 = '\t';
                        break;
                    case 11:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i19 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c3 = '\t';
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            designSystemModel = designSystemModel7;
            str = str4;
            designSystemModel2 = designSystemModel8;
            designSystemModel3 = designSystemModel9;
            str2 = str7;
            i13 = i19;
            map = map3;
            map2 = map4;
            genericInteraction = genericInteraction3;
            list = list3;
            enumC2888c = enumC2888c3;
            str3 = strDecodeStringElement2;
            z4 = zDecodeBooleanElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new RecommendationTileHeaderModel(i13, str, designSystemModel, str2, str3, enumC2888c, list, designSystemModel3, designSystemModel2, z4, genericInteraction, map2, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, RecommendationTileHeaderModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        RecommendationTileHeaderModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
