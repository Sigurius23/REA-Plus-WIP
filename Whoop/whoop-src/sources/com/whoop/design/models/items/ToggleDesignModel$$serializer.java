package com.whoop.design.models.items;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
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
import p745y81.EnumC39333f;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ToggleDesignModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ToggleDesignModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ToggleDesignModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ToggleDesignModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ToggleDesignModel$$serializer implements GeneratedSerializer<ToggleDesignModel> {
    public static final int $stable;
    public static final ToggleDesignModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ToggleDesignModel$$serializer toggleDesignModel$$serializer = new ToggleDesignModel$$serializer();
        INSTANCE = toggleDesignModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ToggleDesignModel", toggleDesignModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("isEnabled", false);
        pluginGeneratedSerialDescriptor.addElement("is_disabled", true);
        pluginGeneratedSerialDescriptor.addElement("toggleOnInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("toggleOffInteraction", true);
        pluginGeneratedSerialDescriptor.addElement("style", true);
        pluginGeneratedSerialDescriptor.addElement("toggledOnColor", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ToggleDesignModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ToggleDesignModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(genericInteraction$$serializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(genericInteraction$$serializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue());
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue());
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, booleanSerializer, booleanSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ToggleDesignModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        Map map;
        EnumC39333f enumC39333f;
        Map map2;
        String str;
        GenericInteraction genericInteraction;
        GenericInteraction genericInteraction2;
        int i13;
        boolean z13;
        String str2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ToggleDesignModel.$childSerializers;
        int i14 = 8;
        int i15 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            GenericInteraction$$serializer genericInteraction$$serializer = GenericInteraction$$serializer.INSTANCE;
            GenericInteraction genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, genericInteraction$$serializer, null);
            GenericInteraction genericInteraction4 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, genericInteraction$$serializer, null);
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, null);
            EnumC39333f enumC39333f2 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            str2 = strDecodeStringElement;
            str = str3;
            genericInteraction2 = genericInteraction3;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, LenientAggregateBindingsSerializer.INSTANCE, null);
            genericInteraction = genericInteraction4;
            z4 = zDecodeBooleanElement2;
            i13 = 511;
            enumC39333f = enumC39333f2;
            z13 = zDecodeBooleanElement;
        } else {
            boolean z14 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            Map map3 = null;
            EnumC39333f enumC39333f3 = null;
            Map map4 = null;
            String str4 = null;
            GenericInteraction genericInteraction5 = null;
            String strDecodeStringElement2 = null;
            int i16 = 0;
            GenericInteraction genericInteraction6 = null;
            while (z14) {
                int i17 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        i15 = 6;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 8;
                        i15 = 6;
                        break;
                    case 1:
                        i16 |= 2;
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        i14 = 8;
                        i15 = 6;
                        break;
                    case 2:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 8;
                        i15 = 6;
                        break;
                    case 3:
                        genericInteraction6 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, GenericInteraction$$serializer.INSTANCE, genericInteraction6);
                        i16 |= 8;
                        i14 = 8;
                        i15 = 6;
                        break;
                    case 4:
                        genericInteraction5 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, GenericInteraction$$serializer.INSTANCE, genericInteraction5);
                        i16 |= 16;
                        i14 = 8;
                        i15 = 6;
                        break;
                    case 5:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str4);
                        i16 |= 32;
                        i14 = 8;
                        i15 = 6;
                        break;
                    case 6:
                        enumC39333f3 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC39333f3);
                        i16 |= 64;
                        i15 = i17;
                        i14 = 8;
                        break;
                    case 7:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), map4);
                        i16 |= 128;
                        i15 = i17;
                        break;
                    case 8:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i16 |= 256;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement3;
            map = map3;
            enumC39333f = enumC39333f3;
            map2 = map4;
            str = str4;
            genericInteraction = genericInteraction5;
            genericInteraction2 = genericInteraction6;
            i13 = i16;
            z13 = zDecodeBooleanElement4;
            str2 = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ToggleDesignModel(i13, str2, z13, z4, genericInteraction2, genericInteraction, str, enumC39333f, map2, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ToggleDesignModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ToggleDesignModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
