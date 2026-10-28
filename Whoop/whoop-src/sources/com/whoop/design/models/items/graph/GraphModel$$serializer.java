package com.whoop.design.models.items.graph;

import com.whoop.design.models.items.graph.plane.GraphPlaneModel;
import com.whoop.design.models.items.graph.plane.GraphPlaneModel$$serializer;
import com.whoop.design.models.items.graph.plane.button.GraphButtons;
import com.whoop.design.models.items.graph.plane.button.GraphButtons$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/GraphModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/GraphModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/GraphModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/GraphModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GraphModel$$serializer implements GeneratedSerializer<GraphModel> {
    public static final int $stable;
    public static final GraphModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GraphModel$$serializer graphModel$$serializer = new GraphModel$$serializer();
        INSTANCE = graphModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.GraphModel", graphModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("plane", true);
        pluginGeneratedSerialDescriptor.addElement("plots", true);
        pluginGeneratedSerialDescriptor.addElement("graphTitleDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("graphButtons", true);
        pluginGeneratedSerialDescriptor.addElement("layoutDirection", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GraphModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = GraphModel.$childSerializers;
        return new InterfaceC37138c[]{GraphPlaneModel$$serializer.INSTANCE, interfaceC23462hArr[1].getValue(), AbstractC38195a.m122336d(StringSerializer.INSTANCE), AbstractC38195a.m122336d(GraphButtons$$serializer.INSTANCE), interfaceC23462hArr[4].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GraphModel deserialize(InterfaceC40541d decoder) {
        int i13;
        GraphPlaneModel graphPlaneModel;
        List list;
        String str;
        GraphButtons graphButtons;
        LayoutDirection layoutDirection;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = GraphModel.$childSerializers;
        GraphPlaneModel graphPlaneModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            GraphPlaneModel graphPlaneModel3 = (GraphPlaneModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, GraphPlaneModel$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, null);
            GraphButtons graphButtons2 = (GraphButtons) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, GraphButtons$$serializer.INSTANCE, null);
            layoutDirection = (LayoutDirection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            graphPlaneModel = graphPlaneModel3;
            graphButtons = graphButtons2;
            str = str2;
            i13 = 31;
            list = list2;
        } else {
            boolean z4 = true;
            int i14 = 0;
            List list3 = null;
            String str3 = null;
            GraphButtons graphButtons3 = null;
            LayoutDirection layoutDirection2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    graphPlaneModel2 = (GraphPlaneModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, GraphPlaneModel$$serializer.INSTANCE, graphPlaneModel2);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), list3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str3);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    graphButtons3 = (GraphButtons) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, GraphButtons$$serializer.INSTANCE, graphButtons3);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    layoutDirection2 = (LayoutDirection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), layoutDirection2);
                    i14 |= 16;
                }
            }
            i13 = i14;
            graphPlaneModel = graphPlaneModel2;
            list = list3;
            str = str3;
            graphButtons = graphButtons3;
            layoutDirection = layoutDirection2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GraphModel(i13, graphPlaneModel, list, str, graphButtons, layoutDirection, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GraphModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GraphModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
