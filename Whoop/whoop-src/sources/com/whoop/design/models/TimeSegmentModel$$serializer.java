package com.whoop.design.models;

import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/TimeSegmentModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/TimeSegmentModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/TimeSegmentModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/TimeSegmentModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TimeSegmentModel$$serializer implements GeneratedSerializer<TimeSegmentModel> {
    public static final int $stable;
    public static final TimeSegmentModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TimeSegmentModel$$serializer timeSegmentModel$$serializer = new TimeSegmentModel$$serializer();
        INSTANCE = timeSegmentModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.TimeSegmentModel", timeSegmentModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("date_picker", false);
        pluginGeneratedSerialDescriptor.addElement("metrics", false);
        pluginGeneratedSerialDescriptor.addElement("graph", false);
        pluginGeneratedSerialDescriptor.addElement("legend", false);
        pluginGeneratedSerialDescriptor.addElement("breakdown_bar", false);
        pluginGeneratedSerialDescriptor.addElement("last_updated", false);
        pluginGeneratedSerialDescriptor.addElement("is_hidden", false);
        pluginGeneratedSerialDescriptor.addElement("whoop_coach_vow", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TimeSegmentModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TimeSegmentModel.$childSerializers;
        return new InterfaceC37138c[]{DateSelectorModel$$serializer.INSTANCE, interfaceC23462hArr[1].getValue(), AbstractC38195a.m122336d(GraphModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), AbstractC38195a.m122336d(BreakDownBarModel$$serializer.INSTANCE), AbstractC38195a.m122336d(TimeSegmentLastUpdated$$serializer.INSTANCE), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(WhoopCoachVowModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TimeSegmentModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        TimeSegmentLastUpdated timeSegmentLastUpdated;
        WhoopCoachVowModel whoopCoachVowModel;
        BreakDownBarModel breakDownBarModel;
        List list;
        int i13;
        DateSelectorModel dateSelectorModel;
        List list2;
        GraphModel graphModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TimeSegmentModel.$childSerializers;
        int i14 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            DateSelectorModel dateSelectorModel2 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, DateSelectorModel$$serializer.INSTANCE, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            GraphModel graphModel2 = (GraphModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, GraphModel$$serializer.INSTANCE, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            BreakDownBarModel breakDownBarModel2 = (BreakDownBarModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BreakDownBarModel$$serializer.INSTANCE, null);
            TimeSegmentLastUpdated timeSegmentLastUpdated2 = (TimeSegmentLastUpdated) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, TimeSegmentLastUpdated$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            list = list4;
            dateSelectorModel = dateSelectorModel2;
            whoopCoachVowModel = (WhoopCoachVowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, WhoopCoachVowModel$$serializer.INSTANCE, null);
            z4 = zDecodeBooleanElement;
            timeSegmentLastUpdated = timeSegmentLastUpdated2;
            breakDownBarModel = breakDownBarModel2;
            graphModel = graphModel2;
            i13 = 255;
            list2 = list3;
        } else {
            int i15 = 3;
            int i16 = 1;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            TimeSegmentLastUpdated timeSegmentLastUpdated3 = null;
            WhoopCoachVowModel whoopCoachVowModel2 = null;
            BreakDownBarModel breakDownBarModel3 = null;
            DateSelectorModel dateSelectorModel3 = null;
            List list5 = null;
            GraphModel graphModel3 = null;
            int i17 = 0;
            List list6 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 7;
                        i16 = 1;
                        i15 = 3;
                        break;
                    case 0:
                        dateSelectorModel3 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, DateSelectorModel$$serializer.INSTANCE, dateSelectorModel3);
                        i17 |= 1;
                        i14 = 7;
                        i16 = 1;
                        i15 = 3;
                        break;
                    case 1:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list5);
                        i17 |= 2;
                        i14 = 7;
                        i15 = 3;
                        break;
                    case 2:
                        graphModel3 = (GraphModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, GraphModel$$serializer.INSTANCE, graphModel3);
                        i17 |= 4;
                        i14 = 7;
                        i15 = 3;
                        break;
                    case 3:
                        list6 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list6);
                        i17 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        breakDownBarModel3 = (BreakDownBarModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BreakDownBarModel$$serializer.INSTANCE, breakDownBarModel3);
                        i17 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        timeSegmentLastUpdated3 = (TimeSegmentLastUpdated) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, TimeSegmentLastUpdated$$serializer.INSTANCE, timeSegmentLastUpdated3);
                        i17 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i17 |= 64;
                        break;
                    case 7:
                        whoopCoachVowModel2 = (WhoopCoachVowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, WhoopCoachVowModel$$serializer.INSTANCE, whoopCoachVowModel2);
                        i17 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            timeSegmentLastUpdated = timeSegmentLastUpdated3;
            whoopCoachVowModel = whoopCoachVowModel2;
            breakDownBarModel = breakDownBarModel3;
            list = list6;
            i13 = i17;
            dateSelectorModel = dateSelectorModel3;
            list2 = list5;
            graphModel = graphModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TimeSegmentModel(i13, dateSelectorModel, list2, graphModel, list, breakDownBarModel, timeSegmentLastUpdated, z4, whoopCoachVowModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TimeSegmentModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TimeSegmentModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
