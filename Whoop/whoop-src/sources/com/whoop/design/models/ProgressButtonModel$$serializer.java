package com.whoop.design.models;

import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/ProgressButtonModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/ProgressButtonModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/ProgressButtonModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/ProgressButtonModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ProgressButtonModel$$serializer implements GeneratedSerializer<ProgressButtonModel> {
    public static final int $stable;
    public static final ProgressButtonModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ProgressButtonModel$$serializer progressButtonModel$$serializer = new ProgressButtonModel$$serializer();
        INSTANCE = progressButtonModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.ProgressButtonModel", progressButtonModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("buttonType", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("iconColor", false);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        pluginGeneratedSerialDescriptor.addElement("glowStyle", true);
        pluginGeneratedSerialDescriptor.addElement("fillPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("isEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("interaction", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProgressButtonModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ProgressButtonModel.$childSerializers;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), interfaceC23462hArr[1].getValue(), StringSerializer.INSTANCE, interfaceC23462hArr[3].getValue(), C25452a.f99689a, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d(FloatSerializer.INSTANCE), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d(GenericInteraction$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ProgressButtonModel deserialize(InterfaceC40541d decoder) {
        int i13;
        Map map;
        GenericInteraction genericInteraction;
        Map map2;
        Float f13;
        TextResource textResource;
        Boolean bool;
        GlowStyle glowStyle;
        EnumC39333f enumC39333f;
        ProgressButtonModel.ButtonStyle buttonStyle;
        ProgressButtonModel.ButtonType buttonType;
        String str;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ProgressButtonModel.$childSerializers;
        int i14 = 10;
        int i15 = 9;
        ProgressButtonModel.ButtonType buttonType2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            ProgressButtonModel.ButtonType buttonType3 = (ProgressButtonModel.ButtonType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            ProgressButtonModel.ButtonStyle buttonStyle2 = (ProgressButtonModel.ButtonStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            EnumC39333f enumC39333f2 = (EnumC39333f) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            TextResource textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C25452a.f99689a, null);
            GlowStyle glowStyle2 = (GlowStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            Float f14 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, FloatSerializer.INSTANCE, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BooleanSerializer.INSTANCE, null);
            GenericInteraction genericInteraction2 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, GenericInteraction$$serializer.INSTANCE, null);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            buttonType = buttonType3;
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, LenientAggregateBindingsSerializer.INSTANCE, null);
            bool = bool2;
            f13 = f14;
            genericInteraction = genericInteraction2;
            textResource = textResource2;
            str = strDecodeStringElement;
            i13 = 2047;
            glowStyle = glowStyle2;
            enumC39333f = enumC39333f2;
            buttonStyle = buttonStyle2;
        } else {
            int i16 = 5;
            int i17 = 3;
            int i18 = 1;
            boolean z4 = true;
            int i19 = 0;
            Map map3 = null;
            GenericInteraction genericInteraction3 = null;
            Map map4 = null;
            Float f15 = null;
            TextResource textResource3 = null;
            Boolean bool3 = null;
            GlowStyle glowStyle3 = null;
            EnumC39333f enumC39333f3 = null;
            ProgressButtonModel.ButtonStyle buttonStyle3 = null;
            String strDecodeStringElement2 = null;
            while (z4) {
                int i24 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 9;
                        i18 = 1;
                        i17 = 3;
                        i16 = 5;
                        break;
                    case 0:
                        buttonType2 = (ProgressButtonModel.ButtonType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), buttonType2);
                        i19 |= 1;
                        i14 = 10;
                        i15 = 9;
                        i18 = 1;
                        i17 = 3;
                        i16 = 5;
                        break;
                    case 1:
                        buttonStyle3 = (ProgressButtonModel.ButtonStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), buttonStyle3);
                        i19 |= 2;
                        i14 = 10;
                        i15 = 9;
                        i17 = 3;
                        i16 = 5;
                        break;
                    case 2:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i19 |= 4;
                        i14 = 10;
                        i15 = 9;
                        i16 = 5;
                        break;
                    case 3:
                        enumC39333f3 = (EnumC39333f) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC39333f3);
                        i19 |= 8;
                        i14 = 10;
                        i15 = 9;
                        i16 = 5;
                        break;
                    case 4:
                        textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource3);
                        i19 |= 16;
                        i14 = 10;
                        i15 = 9;
                        i16 = 5;
                        break;
                    case 5:
                        glowStyle3 = (GlowStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), glowStyle3);
                        i19 |= 32;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 6:
                        f15 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, FloatSerializer.INSTANCE, f15);
                        i19 |= 64;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 7:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BooleanSerializer.INSTANCE, bool3);
                        i19 |= 128;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 8:
                        genericInteraction3 = (GenericInteraction) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, GenericInteraction$$serializer.INSTANCE, genericInteraction3);
                        i19 |= 256;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 9:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), map3);
                        i19 |= 512;
                        i15 = i24;
                        i14 = 10;
                        break;
                    case 10:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map4);
                        i19 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = i24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i19;
            map = map3;
            genericInteraction = genericInteraction3;
            map2 = map4;
            f13 = f15;
            textResource = textResource3;
            bool = bool3;
            glowStyle = glowStyle3;
            enumC39333f = enumC39333f3;
            buttonStyle = buttonStyle3;
            buttonType = buttonType2;
            str = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ProgressButtonModel(i13, buttonType, buttonStyle, str, enumC39333f, textResource, glowStyle, f13, bool, genericInteraction, map, map2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ProgressButtonModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ProgressButtonModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
