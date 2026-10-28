package com.whoop.design.models.items.graph.plot.bar;

import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/plot/bar/BarModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/bar/BarModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/bar/BarModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class BarModel$$serializer implements GeneratedSerializer<BarModel> {
    public static final int $stable;
    public static final BarModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BarModel$$serializer barModel$$serializer = new BarModel$$serializer();
        INSTANCE = barModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.plot.bar.BarModel", barModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("positionY", true);
        pluginGeneratedSerialDescriptor.addElement("height", true);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("dataScrubberDetails", true);
        pluginGeneratedSerialDescriptor.addElement("theme", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BarModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = BarModel.$childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{doubleSerializer, doubleSerializer, interfaceC23462hArr[2].getValue(), AbstractC38195a.m122336d(DataScrubberDetailsModel$$serializer.INSTANCE), AbstractC38195a.m122336d(BarTheme$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BarModel deserialize(InterfaceC40541d decoder) {
        int i13;
        BarStyle barStyle;
        double d3;
        DataScrubberDetailsModel dataScrubberDetailsModel;
        BarTheme barTheme;
        double d14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = BarModel.$childSerializers;
        BarStyle barStyle2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 0);
            double dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
            barStyle = (BarStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            dataScrubberDetailsModel = (DataScrubberDetailsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DataScrubberDetailsModel$$serializer.INSTANCE, null);
            barTheme = (BarTheme) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BarTheme$$serializer.INSTANCE, null);
            i13 = 31;
            d3 = dDecodeDoubleElement2;
            d14 = dDecodeDoubleElement;
        } else {
            double dDecodeDoubleElement3 = 0.0d;
            boolean z4 = true;
            int i14 = 0;
            DataScrubberDetailsModel dataScrubberDetailsModel2 = null;
            BarTheme barTheme2 = null;
            double dDecodeDoubleElement4 = 0.0d;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    dDecodeDoubleElement4 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dDecodeDoubleElement3 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 1);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    barStyle2 = (BarStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), barStyle2);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    dataScrubberDetailsModel2 = (DataScrubberDetailsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DataScrubberDetailsModel$$serializer.INSTANCE, dataScrubberDetailsModel2);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    barTheme2 = (BarTheme) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BarTheme$$serializer.INSTANCE, barTheme2);
                    i14 |= 16;
                }
            }
            i13 = i14;
            barStyle = barStyle2;
            d3 = dDecodeDoubleElement3;
            dataScrubberDetailsModel = dataScrubberDetailsModel2;
            barTheme = barTheme2;
            d14 = dDecodeDoubleElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BarModel(i13, d14, d3, barStyle, dataScrubberDetailsModel, barTheme, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BarModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BarModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
