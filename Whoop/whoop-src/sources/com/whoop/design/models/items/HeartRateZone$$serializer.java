package com.whoop.design.models.items;

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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/HeartRateZone.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/HeartRateZone;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/HeartRateZone;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/HeartRateZone;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HeartRateZone$$serializer implements GeneratedSerializer<HeartRateZone> {
    public static final int $stable;
    public static final HeartRateZone$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HeartRateZone$$serializer heartRateZone$$serializer = new HeartRateZone$$serializer();
        INSTANCE = heartRateZone$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.HeartRateZone", heartRateZone$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("barGraphTileTitleDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("barGraphTileSubtitleDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("barGraphTilePercentageDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("barGraphTileTimeDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("barGraphTileTimeSuffixDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("barGraph", true);
        pluginGeneratedSerialDescriptor.addElement("tileStyle", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("hideBackground", true);
        pluginGeneratedSerialDescriptor.addElement("showRadioToggle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HeartRateZone$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HeartRateZone.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(BarGraph$$serializer.INSTANCE), interfaceC23462hArr[6].getValue(), interfaceC23462hArr[7].getValue(), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(booleanSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HeartRateZone deserialize(InterfaceC40541d decoder) {
        int i13;
        Boolean bool;
        HeartRateTileId heartRateTileId;
        Boolean bool2;
        HeartRateTileStyle heartRateTileStyle;
        BarGraph barGraph;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HeartRateZone.$childSerializers;
        int i14 = 9;
        int i15 = 8;
        int i16 = 6;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            BarGraph barGraph2 = (BarGraph) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BarGraph$$serializer.INSTANCE, null);
            HeartRateTileStyle heartRateTileStyle2 = (HeartRateTileStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            HeartRateTileId heartRateTileId2 = (HeartRateTileId) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, booleanSerializer, null);
            heartRateTileId = heartRateTileId2;
            str2 = strDecodeStringElement2;
            bool = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, booleanSerializer, null);
            barGraph = barGraph2;
            str5 = strDecodeStringElement4;
            bool2 = bool3;
            str = str7;
            str4 = strDecodeStringElement3;
            i13 = 1023;
            heartRateTileStyle = heartRateTileStyle2;
            str3 = str6;
        } else {
            boolean z4 = true;
            int i17 = 0;
            Boolean bool4 = null;
            HeartRateTileId heartRateTileId3 = null;
            Boolean bool5 = null;
            HeartRateTileStyle heartRateTileStyle3 = null;
            BarGraph barGraph3 = null;
            String str8 = null;
            String str9 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z4) {
                int i18 = i16;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i17 |= 1;
                        i14 = 9;
                        i15 = 8;
                        i16 = 6;
                        break;
                    case 1:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str9);
                        i17 |= 2;
                        i14 = 9;
                        i15 = 8;
                        i16 = 6;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 4:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str8);
                        i17 |= 16;
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 5:
                        barGraph3 = (BarGraph) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BarGraph$$serializer.INSTANCE, barGraph3);
                        i17 |= 32;
                        i14 = 9;
                        i16 = 6;
                        break;
                    case 6:
                        heartRateTileStyle3 = (HeartRateTileStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), heartRateTileStyle3);
                        i17 |= 64;
                        i16 = i18;
                        i14 = 9;
                        break;
                    case 7:
                        heartRateTileId3 = (HeartRateTileId) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), heartRateTileId3);
                        i17 |= 128;
                        i16 = i18;
                        break;
                    case 8:
                        bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, BooleanSerializer.INSTANCE, bool5);
                        i17 |= 256;
                        i16 = i18;
                        break;
                    case 9:
                        bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, BooleanSerializer.INSTANCE, bool4);
                        i17 |= 512;
                        i16 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            bool = bool4;
            heartRateTileId = heartRateTileId3;
            bool2 = bool5;
            heartRateTileStyle = heartRateTileStyle3;
            barGraph = barGraph3;
            str = str8;
            str2 = strDecodeStringElement;
            str3 = str9;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HeartRateZone(i13, str2, str3, str4, str5, str, barGraph, heartRateTileStyle, heartRateTileId, bool2, bool, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HeartRateZone value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HeartRateZone.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
