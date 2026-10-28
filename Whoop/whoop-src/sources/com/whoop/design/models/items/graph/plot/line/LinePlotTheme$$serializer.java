package com.whoop.design.models.items.graph.plot.line;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/plot/line/LinePlotTheme.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LinePlotTheme$$serializer implements GeneratedSerializer<LinePlotTheme> {
    public static final int $stable;
    public static final LinePlotTheme$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LinePlotTheme$$serializer linePlotTheme$$serializer = new LinePlotTheme$$serializer();
        INSTANCE = linePlotTheme$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.plot.line.LinePlotTheme", linePlotTheme$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("strokeColor", true);
        pluginGeneratedSerialDescriptor.addElement("strokeWidth", true);
        pluginGeneratedSerialDescriptor.addElement("dashPattern", true);
        pluginGeneratedSerialDescriptor.addElement("fillColor", true);
        pluginGeneratedSerialDescriptor.addElement("fillOpacity", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LinePlotTheme$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = LinePlotTheme.$childSerializers;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[0].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[1].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LinePlotTheme deserialize(InterfaceC40541d decoder) {
        int i13;
        EnumC39333f enumC39333f;
        LineWidth lineWidth;
        DashPattern dashPattern;
        EnumC39333f enumC39333f2;
        FillOpacity fillOpacity;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = LinePlotTheme.$childSerializers;
        int i14 = 0;
        EnumC39333f enumC39333f3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            EnumC39333f enumC39333f4 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            LineWidth lineWidth2 = (LineWidth) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            DashPattern dashPattern2 = (DashPattern) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            EnumC39333f enumC39333f5 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            fillOpacity = (FillOpacity) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            enumC39333f = enumC39333f4;
            enumC39333f2 = enumC39333f5;
            i13 = 31;
            dashPattern = dashPattern2;
            lineWidth = lineWidth2;
        } else {
            int i15 = 1;
            int i16 = 0;
            LineWidth lineWidth3 = null;
            DashPattern dashPattern3 = null;
            EnumC39333f enumC39333f6 = null;
            FillOpacity fillOpacity2 = null;
            while (i15 != 0) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                int i17 = i14;
                if (iDecodeElementIndex == -1) {
                    i14 = i17;
                    i15 = i14;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        lineWidth3 = (LineWidth) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), lineWidth3);
                        i16 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        dashPattern3 = (DashPattern) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), dashPattern3);
                        i16 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        enumC39333f6 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), enumC39333f6);
                        i16 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        fillOpacity2 = (FillOpacity) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), fillOpacity2);
                        i16 |= 16;
                    }
                    i14 = i17;
                } else {
                    enumC39333f3 = (EnumC39333f) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC39333f3);
                    i16 |= 1;
                    i14 = i17;
                }
            }
            i13 = i16;
            enumC39333f = enumC39333f3;
            lineWidth = lineWidth3;
            dashPattern = dashPattern3;
            enumC39333f2 = enumC39333f6;
            fillOpacity = fillOpacity2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LinePlotTheme(i13, enumC39333f, lineWidth, dashPattern, enumC39333f2, fillOpacity, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LinePlotTheme value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LinePlotTheme.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
