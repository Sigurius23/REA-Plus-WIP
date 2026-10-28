package com.whoop.design.models.items;

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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/OptionCommitPanelModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/OptionCommitPanelModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/OptionCommitPanelModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/OptionCommitPanelModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class OptionCommitPanelModel$$serializer implements GeneratedSerializer<OptionCommitPanelModel> {
    public static final int $stable;
    public static final OptionCommitPanelModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        OptionCommitPanelModel$$serializer optionCommitPanelModel$$serializer = new OptionCommitPanelModel$$serializer();
        INSTANCE = optionCommitPanelModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.OptionCommitPanelModel", optionCommitPanelModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("subtitleSupportsMarkdown", true);
        pluginGeneratedSerialDescriptor.addElement("options", true);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", false);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OptionCommitPanelModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = OptionCommitPanelModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), BooleanSerializer.INSTANCE, interfaceC23462hArr[4].getValue(), CardButtonModel$$serializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final OptionCommitPanelModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        Map map;
        Map map2;
        CardButtonModel cardButtonModel;
        List list;
        int i13;
        String str;
        String str2;
        String str3;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = OptionCommitPanelModel.$childSerializers;
        int i15 = 7;
        int i16 = 5;
        int i17 = 4;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            CardButtonModel cardButtonModel2 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, CardButtonModel$$serializer.INSTANCE, null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str3 = str6;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, LenientAggregateBindingsSerializer.INSTANCE, null);
            cardButtonModel = cardButtonModel2;
            z4 = zDecodeBooleanElement;
            list = list2;
            i13 = 255;
            str2 = str5;
            str = str4;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            Map map3 = null;
            Map map4 = null;
            CardButtonModel cardButtonModel3 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            int i18 = 0;
            List list3 = null;
            while (z13) {
                int i19 = i17;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i16 = 5;
                        i17 = 4;
                        break;
                    case 0:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str7);
                        i18 |= 1;
                        i15 = 7;
                        i16 = 5;
                        i17 = 4;
                        break;
                    case 1:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str8);
                        i18 |= 2;
                        i15 = 7;
                        i16 = 5;
                        i17 = 4;
                        break;
                    case 2:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str9);
                        i18 |= 4;
                        i15 = 7;
                        i16 = 5;
                        i17 = 4;
                        break;
                    case 3:
                        i14 = i19;
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        i18 |= 8;
                        i17 = i14;
                        i15 = 7;
                        break;
                    case 4:
                        i14 = i19;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), list3);
                        i18 |= 16;
                        i17 = i14;
                        i15 = 7;
                        break;
                    case 5:
                        cardButtonModel3 = (CardButtonModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, CardButtonModel$$serializer.INSTANCE, cardButtonModel3);
                        i18 |= 32;
                        i17 = i19;
                        break;
                    case 6:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), map4);
                        i18 |= 64;
                        i17 = i19;
                        break;
                    case 7:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i18 |= 128;
                        i17 = i19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            map = map3;
            map2 = map4;
            cardButtonModel = cardButtonModel3;
            list = list3;
            i13 = i18;
            str = str7;
            str2 = str8;
            str3 = str9;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new OptionCommitPanelModel(i13, str, str2, str3, z4, list, cardButtonModel, map2, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, OptionCommitPanelModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        OptionCommitPanelModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
