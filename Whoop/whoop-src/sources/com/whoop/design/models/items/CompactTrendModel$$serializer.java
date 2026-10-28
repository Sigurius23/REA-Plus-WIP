package com.whoop.design.models.items;

import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/CompactTrendModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/CompactTrendModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/CompactTrendModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/CompactTrendModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CompactTrendModel$$serializer implements GeneratedSerializer<CompactTrendModel> {
    public static final int $stable;
    public static final CompactTrendModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CompactTrendModel$$serializer compactTrendModel$$serializer = new CompactTrendModel$$serializer();
        INSTANCE = compactTrendModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.CompactTrendModel", compactTrendModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("segmentController", false);
        pluginGeneratedSerialDescriptor.addElement("weekDatePicker", false);
        pluginGeneratedSerialDescriptor.addElement("monthDatePicker", false);
        pluginGeneratedSerialDescriptor.addElement("sixMonthDatePicker", false);
        pluginGeneratedSerialDescriptor.addElement("weekGraph", false);
        pluginGeneratedSerialDescriptor.addElement("monthGraph", false);
        pluginGeneratedSerialDescriptor.addElement("sixMonthGraph", false);
        pluginGeneratedSerialDescriptor.addElement("noDataGraph", false);
        pluginGeneratedSerialDescriptor.addElement("graphLegends", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CompactTrendModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CompactTrendModel.$childSerializers;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(NoDataGraphModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue());
        DateSelectorModel$$serializer dateSelectorModel$$serializer = DateSelectorModel$$serializer.INSTANCE;
        GraphModel$$serializer graphModel$$serializer = GraphModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{SegmentControllerModel$$serializer.INSTANCE, dateSelectorModel$$serializer, dateSelectorModel$$serializer, dateSelectorModel$$serializer, graphModel$$serializer, graphModel$$serializer, graphModel$$serializer, interfaceC37138cM122336d, interfaceC37138cM122336d2};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CompactTrendModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        GraphModel graphModel;
        NoDataGraphModel noDataGraphModel;
        GraphModel graphModel2;
        GraphModel graphModel3;
        DateSelectorModel dateSelectorModel;
        SegmentControllerModel segmentControllerModel;
        DateSelectorModel dateSelectorModel2;
        DateSelectorModel dateSelectorModel3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CompactTrendModel.$childSerializers;
        int i14 = 7;
        SegmentControllerModel segmentControllerModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            SegmentControllerModel segmentControllerModel3 = (SegmentControllerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, SegmentControllerModel$$serializer.INSTANCE, null);
            DateSelectorModel$$serializer dateSelectorModel$$serializer = DateSelectorModel$$serializer.INSTANCE;
            DateSelectorModel dateSelectorModel4 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, dateSelectorModel$$serializer, null);
            DateSelectorModel dateSelectorModel5 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, dateSelectorModel$$serializer, null);
            DateSelectorModel dateSelectorModel6 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, dateSelectorModel$$serializer, null);
            GraphModel$$serializer graphModel$$serializer = GraphModel$$serializer.INSTANCE;
            GraphModel graphModel4 = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, graphModel$$serializer, null);
            GraphModel graphModel5 = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, graphModel$$serializer, null);
            GraphModel graphModel6 = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, graphModel$$serializer, null);
            NoDataGraphModel noDataGraphModel2 = (NoDataGraphModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, NoDataGraphModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            segmentControllerModel = segmentControllerModel3;
            noDataGraphModel = noDataGraphModel2;
            graphModel = graphModel6;
            graphModel2 = graphModel5;
            dateSelectorModel = dateSelectorModel6;
            graphModel3 = graphModel4;
            dateSelectorModel3 = dateSelectorModel5;
            i13 = 511;
            dateSelectorModel2 = dateSelectorModel4;
        } else {
            boolean z4 = true;
            int i15 = 0;
            List list2 = null;
            GraphModel graphModel7 = null;
            NoDataGraphModel noDataGraphModel3 = null;
            GraphModel graphModel8 = null;
            GraphModel graphModel9 = null;
            DateSelectorModel dateSelectorModel7 = null;
            DateSelectorModel dateSelectorModel8 = null;
            DateSelectorModel dateSelectorModel9 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 7;
                        break;
                    case 0:
                        segmentControllerModel2 = (SegmentControllerModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, SegmentControllerModel$$serializer.INSTANCE, segmentControllerModel2);
                        i15 |= 1;
                        i14 = 7;
                        break;
                    case 1:
                        dateSelectorModel8 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, DateSelectorModel$$serializer.INSTANCE, dateSelectorModel8);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        dateSelectorModel9 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, DateSelectorModel$$serializer.INSTANCE, dateSelectorModel9);
                        i15 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        dateSelectorModel7 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, DateSelectorModel$$serializer.INSTANCE, dateSelectorModel7);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        graphModel9 = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, GraphModel$$serializer.INSTANCE, graphModel9);
                        i15 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        graphModel8 = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, GraphModel$$serializer.INSTANCE, graphModel8);
                        i15 |= 32;
                        i14 = 7;
                        break;
                    case 6:
                        graphModel7 = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, GraphModel$$serializer.INSTANCE, graphModel7);
                        i15 |= 64;
                        i14 = 7;
                        break;
                    case 7:
                        noDataGraphModel3 = (NoDataGraphModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, NoDataGraphModel$$serializer.INSTANCE, noDataGraphModel3);
                        i15 |= 128;
                        break;
                    case 8:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), list2);
                        i15 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            list = list2;
            graphModel = graphModel7;
            noDataGraphModel = noDataGraphModel3;
            graphModel2 = graphModel8;
            graphModel3 = graphModel9;
            dateSelectorModel = dateSelectorModel7;
            segmentControllerModel = segmentControllerModel2;
            dateSelectorModel2 = dateSelectorModel8;
            dateSelectorModel3 = dateSelectorModel9;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CompactTrendModel(i13, segmentControllerModel, dateSelectorModel2, dateSelectorModel3, dateSelectorModel, graphModel3, graphModel2, graphModel, noDataGraphModel, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CompactTrendModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CompactTrendModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
