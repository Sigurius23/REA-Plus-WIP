package com.whoop.design.models.items.graph.plot.overlay;

import gz0.EnumC16313m0;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/plot/overlay/OverlayLabel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class OverlayLabel$$serializer implements GeneratedSerializer<OverlayLabel> {
    public static final int $stable;
    public static final OverlayLabel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        OverlayLabel$$serializer overlayLabel$$serializer = new OverlayLabel$$serializer();
        INSTANCE = overlayLabel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.plot.overlay.OverlayLabel", overlayLabel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("activityId", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("topLabel", false);
        pluginGeneratedSerialDescriptor.addElement("topIconUrl", false);
        pluginGeneratedSerialDescriptor.addElement("positionX", false);
        pluginGeneratedSerialDescriptor.addElement("positionY", false);
        pluginGeneratedSerialDescriptor.addElement("overlayLabelCtaContent", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryIcon", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OverlayLabel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = OverlayLabel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[1].getValue());
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue());
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, floatSerializer, floatSerializer, interfaceC37138cM122336d5, interfaceC37138cM122336d6};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final OverlayLabel deserialize(InterfaceC40541d decoder) {
        float f13;
        EnumC16313m0 enumC16313m0;
        List list;
        String str;
        String str2;
        float f14;
        int i13;
        String str3;
        OverlayCta overlayCta;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = OverlayLabel.$childSerializers;
        int i14 = 5;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            OverlayCta overlayCta2 = (OverlayCta) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 4);
            float fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            enumC16313m0 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            str = str6;
            f13 = fDecodeFloatElement2;
            f14 = fDecodeFloatElement;
            list = list2;
            str2 = str5;
            i13 = 255;
            overlayCta = overlayCta2;
            str3 = str4;
        } else {
            float fDecodeFloatElement3 = 0.0f;
            int i15 = 1;
            boolean z4 = true;
            int i16 = 0;
            EnumC16313m0 enumC16313m1 = null;
            List list3 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            OverlayCta overlayCta3 = null;
            float fDecodeFloatElement4 = 0.0f;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 1;
                        break;
                    case 0:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str9);
                        i16 |= 1;
                        i14 = 5;
                        i15 = 1;
                        break;
                    case 1:
                        overlayCta3 = (OverlayCta) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), overlayCta3);
                        i16 |= 2;
                        i14 = 5;
                        break;
                    case 2:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str8);
                        i16 |= 4;
                        i14 = 5;
                        break;
                    case 3:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str7);
                        i16 |= 8;
                        i14 = 5;
                        break;
                    case 4:
                        fDecodeFloatElement4 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        fDecodeFloatElement3 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, i14);
                        i16 |= 32;
                        break;
                    case 6:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list3);
                        i16 |= 64;
                        break;
                    case 7:
                        enumC16313m1 = (EnumC16313m0) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), enumC16313m1);
                        i16 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            f13 = fDecodeFloatElement3;
            enumC16313m0 = enumC16313m1;
            list = list3;
            str = str7;
            str2 = str8;
            f14 = fDecodeFloatElement4;
            i13 = i16;
            str3 = str9;
            overlayCta = overlayCta3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new OverlayLabel(i13, str3, overlayCta, str2, str, f14, f13, list, enumC16313m0, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, OverlayLabel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        OverlayLabel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
