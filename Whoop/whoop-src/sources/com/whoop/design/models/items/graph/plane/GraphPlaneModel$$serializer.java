package com.whoop.design.models.items.graph.plane;

import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/plane/GraphPlaneModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GraphPlaneModel$$serializer implements GeneratedSerializer<GraphPlaneModel> {
    public static final int $stable;
    public static final GraphPlaneModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GraphPlaneModel$$serializer graphPlaneModel$$serializer = new GraphPlaneModel$$serializer();
        INSTANCE = graphPlaneModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.plane.GraphPlaneModel", graphPlaneModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("lines", true);
        pluginGeneratedSerialDescriptor.addElement("annotations", true);
        pluginGeneratedSerialDescriptor.addElement("accessibilityInfo", true);
        pluginGeneratedSerialDescriptor.addElement("start_yaxis", true);
        pluginGeneratedSerialDescriptor.addElement("end_yaxis", true);
        pluginGeneratedSerialDescriptor.addElement("bottom_xaxis", true);
        pluginGeneratedSerialDescriptor.addElement("top_xaxis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GraphPlaneModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = GraphPlaneModel.$childSerializers;
        GraphAxisModel$$serializer graphAxisModel$$serializer = GraphAxisModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), interfaceC23462hArr[1].getValue(), GraphAccessibilityModel$$serializer.INSTANCE, AbstractC38195a.m122336d(graphAxisModel$$serializer), AbstractC38195a.m122336d(graphAxisModel$$serializer), AbstractC38195a.m122336d(graphAxisModel$$serializer), AbstractC38195a.m122336d(graphAxisModel$$serializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GraphPlaneModel deserialize(InterfaceC40541d decoder) {
        int i13;
        GraphAxisModel graphAxisModel;
        GraphAxisModel graphAxisModel2;
        List list;
        List list2;
        GraphAccessibilityModel graphAccessibilityModel;
        GraphAxisModel graphAxisModel3;
        GraphAxisModel graphAxisModel4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = GraphPlaneModel.$childSerializers;
        int i14 = 6;
        List list3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            GraphAccessibilityModel graphAccessibilityModel2 = (GraphAccessibilityModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, GraphAccessibilityModel$$serializer.INSTANCE, null);
            GraphAxisModel$$serializer graphAxisModel$$serializer = GraphAxisModel$$serializer.INSTANCE;
            GraphAxisModel graphAxisModel5 = (GraphAxisModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, graphAxisModel$$serializer, null);
            GraphAxisModel graphAxisModel6 = (GraphAxisModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, graphAxisModel$$serializer, null);
            GraphAxisModel graphAxisModel7 = (GraphAxisModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, graphAxisModel$$serializer, null);
            list2 = list5;
            list = list4;
            graphAxisModel = (GraphAxisModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, graphAxisModel$$serializer, null);
            graphAxisModel2 = graphAxisModel7;
            graphAxisModel3 = graphAxisModel5;
            graphAxisModel4 = graphAxisModel6;
            graphAccessibilityModel = graphAccessibilityModel2;
            i13 = 127;
        } else {
            int i15 = 1;
            boolean z4 = true;
            int i16 = 0;
            GraphAxisModel graphAxisModel8 = null;
            GraphAxisModel graphAxisModel9 = null;
            List list6 = null;
            GraphAccessibilityModel graphAccessibilityModel3 = null;
            GraphAxisModel graphAxisModel10 = null;
            GraphAxisModel graphAxisModel11 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        i15 = 1;
                        break;
                    case 0:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), list3);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 1;
                        break;
                    case 1:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list6);
                        i16 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        graphAccessibilityModel3 = (GraphAccessibilityModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, GraphAccessibilityModel$$serializer.INSTANCE, graphAccessibilityModel3);
                        i16 |= 4;
                        i14 = 6;
                        break;
                    case 3:
                        graphAxisModel10 = (GraphAxisModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, GraphAxisModel$$serializer.INSTANCE, graphAxisModel10);
                        i16 |= 8;
                        break;
                    case 4:
                        graphAxisModel11 = (GraphAxisModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, GraphAxisModel$$serializer.INSTANCE, graphAxisModel11);
                        i16 |= 16;
                        break;
                    case 5:
                        graphAxisModel9 = (GraphAxisModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, GraphAxisModel$$serializer.INSTANCE, graphAxisModel9);
                        i16 |= 32;
                        break;
                    case 6:
                        graphAxisModel8 = (GraphAxisModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, GraphAxisModel$$serializer.INSTANCE, graphAxisModel8);
                        i16 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            graphAxisModel = graphAxisModel8;
            graphAxisModel2 = graphAxisModel9;
            list = list3;
            list2 = list6;
            graphAccessibilityModel = graphAccessibilityModel3;
            graphAxisModel3 = graphAxisModel10;
            graphAxisModel4 = graphAxisModel11;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GraphPlaneModel(i13, list, list2, graphAccessibilityModel, graphAxisModel3, graphAxisModel4, graphAxisModel2, graphAxisModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GraphPlaneModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GraphPlaneModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
