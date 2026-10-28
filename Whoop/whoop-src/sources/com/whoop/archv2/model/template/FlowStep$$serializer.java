package com.whoop.archv2.model.template;

import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/archv2/model/template/FlowStep.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/archv2/model/template/FlowStep;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/archv2/model/template/FlowStep;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/archv2/model/template/FlowStep;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FlowStep$$serializer implements GeneratedSerializer<FlowStep> {
    public static final int $stable;
    public static final FlowStep$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FlowStep$$serializer flowStep$$serializer = new FlowStep$$serializer();
        INSTANCE = flowStep$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.archv2.model.template.FlowStep", flowStep$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("template", false);
        pluginGeneratedSerialDescriptor.addElement("background", true);
        pluginGeneratedSerialDescriptor.addElement("progressButton", true);
        pluginGeneratedSerialDescriptor.addElement("requiredKeys", true);
        pluginGeneratedSerialDescriptor.addElement("backBehavior", true);
        pluginGeneratedSerialDescriptor.addElement("stepTransition", true);
        pluginGeneratedSerialDescriptor.addElement("analyticEvents", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FlowStep$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FlowStep.$childSerializers;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), AbstractC38195a.m122336d(BackgroundModel$$serializer.INSTANCE), AbstractC38195a.m122336d(ProgressButtonModel$$serializer.INSTANCE), interfaceC23462hArr[3].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FlowStep deserialize(InterfaceC40541d decoder) {
        int i13;
        FlowStepTransition flowStepTransition;
        Map map;
        Map map2;
        Map map3;
        BackBehavior backBehavior;
        List list;
        AnyScreenTemplate anyScreenTemplate;
        BackgroundModel backgroundModel;
        ProgressButtonModel progressButtonModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FlowStep.$childSerializers;
        int i14 = 8;
        int i15 = 6;
        AnyScreenTemplate anyScreenTemplate2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            AnyScreenTemplate anyScreenTemplate3 = (AnyScreenTemplate) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            BackgroundModel backgroundModel2 = (BackgroundModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, BackgroundModel$$serializer.INSTANCE, null);
            ProgressButtonModel progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, ProgressButtonModel$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            BackBehavior backBehavior2 = (BackBehavior) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            FlowStepTransition flowStepTransition2 = (FlowStepTransition) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            Map map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            anyScreenTemplate = anyScreenTemplate3;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, LenientAggregateBindingsSerializer.INSTANCE, null);
            progressButtonModel = progressButtonModel2;
            i13 = 511;
            map2 = map4;
            flowStepTransition = flowStepTransition2;
            list = list2;
            backBehavior = backBehavior2;
            backgroundModel = backgroundModel2;
        } else {
            int i16 = 5;
            int i17 = 3;
            int i18 = 4;
            boolean z4 = true;
            int i19 = 0;
            FlowStepTransition flowStepTransition3 = null;
            Map map5 = null;
            Map map6 = null;
            Map map7 = null;
            BackBehavior backBehavior3 = null;
            List list3 = null;
            BackgroundModel backgroundModel3 = null;
            ProgressButtonModel progressButtonModel3 = null;
            while (z4) {
                int i24 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 8;
                        i15 = 6;
                        i17 = 3;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 0:
                        anyScreenTemplate2 = (AnyScreenTemplate) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), anyScreenTemplate2);
                        i19 |= 1;
                        i14 = 8;
                        i15 = 6;
                        i17 = 3;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 1:
                        backgroundModel3 = (BackgroundModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, BackgroundModel$$serializer.INSTANCE, backgroundModel3);
                        i19 |= 2;
                        i14 = 8;
                        i15 = 6;
                        i17 = 3;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 2:
                        progressButtonModel3 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel3);
                        i19 |= 4;
                        i14 = 8;
                        i15 = 6;
                        i17 = 3;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 3:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list3);
                        i19 |= 8;
                        i14 = 8;
                        i15 = 6;
                        i18 = 4;
                        i16 = 5;
                        break;
                    case 4:
                        backBehavior3 = (BackBehavior) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), backBehavior3);
                        i19 |= 16;
                        i14 = 8;
                        i15 = 6;
                        i16 = 5;
                        break;
                    case 5:
                        flowStepTransition3 = (FlowStepTransition) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), flowStepTransition3);
                        i19 |= 32;
                        i14 = 8;
                        i15 = 6;
                        break;
                    case 6:
                        map6 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), map6);
                        i19 |= 64;
                        i15 = i24;
                        i14 = 8;
                        break;
                    case 7:
                        map7 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), map7);
                        i19 |= 128;
                        i15 = i24;
                        break;
                    case 8:
                        map5 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map5);
                        i19 |= 256;
                        i15 = i24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i19;
            flowStepTransition = flowStepTransition3;
            map = map5;
            map2 = map6;
            map3 = map7;
            backBehavior = backBehavior3;
            list = list3;
            anyScreenTemplate = anyScreenTemplate2;
            backgroundModel = backgroundModel3;
            progressButtonModel = progressButtonModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FlowStep(i13, anyScreenTemplate, backgroundModel, progressButtonModel, list, backBehavior, flowStepTransition, map2, map3, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FlowStep value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FlowStep.write$Self$arch_v2_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
