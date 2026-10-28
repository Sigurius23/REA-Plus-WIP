package com.whoop.core.details.network.model.sleep;

import com.whoop.core.details.network.model.MetaData;
import com.whoop.core.details.network.model.MetaData$$serializer;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.AdditionalInfoTextModel$$serializer;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.BarGraphContainerModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/core/details/network/model/sleep/SleepDetailsModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SleepDetailsModel$$serializer implements GeneratedSerializer<SleepDetailsModel> {
    public static final int $stable;
    public static final SleepDetailsModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SleepDetailsModel$$serializer sleepDetailsModel$$serializer = new SleepDetailsModel$$serializer();
        INSTANCE = sleepDetailsModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.core.details.network.model.sleep.SleepDetailsModel", sleepDetailsModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("sleepMetricBreakdowns", false);
        pluginGeneratedSerialDescriptor.addElement("graph", false);
        pluginGeneratedSerialDescriptor.addElement("vowStrings", false);
        pluginGeneratedSerialDescriptor.addElement("sleep_details_labels", false);
        pluginGeneratedSerialDescriptor.addElement("bar_graph_container", false);
        pluginGeneratedSerialDescriptor.addElement("missingHrData", false);
        pluginGeneratedSerialDescriptor.addElement("activityDisplayType", false);
        pluginGeneratedSerialDescriptor.addElement("sleep_details_edit_components", false);
        pluginGeneratedSerialDescriptor.addElement("sleepDetailsMetricModals", false);
        pluginGeneratedSerialDescriptor.addElement("whoopCoachVow", false);
        pluginGeneratedSerialDescriptor.addElement("additionalInfoText", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SleepDetailsModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SleepDetailsModel.$childSerializers;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), AbstractC38195a.m122336d(GraphModel$$serializer.INSTANCE), SleepDetailsVowsModel$$serializer.INSTANCE, SleepDetailsLabelsModel$$serializer.INSTANCE, AbstractC38195a.m122336d(BarGraphContainerModel$$serializer.INSTANCE), AbstractC38195a.m122336d(MissingHRDataModel$$serializer.INSTANCE), interfaceC23462hArr[6].getValue(), SleepDetailsEditModel$$serializer.INSTANCE, interfaceC23462hArr[8].getValue(), AbstractC38195a.m122336d(WhoopCoachVowModel$$serializer.INSTANCE), AbstractC38195a.m122336d(AdditionalInfoTextModel$$serializer.INSTANCE), AbstractC38195a.m122336d(MetaData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SleepDetailsModel deserialize(InterfaceC40541d decoder) {
        List list;
        int i13;
        MetaData metaData;
        WhoopCoachVowModel whoopCoachVowModel;
        SleepDetailsEditModel sleepDetailsEditModel;
        MissingHRDataModel missingHRDataModel;
        ActivityDisplayType activityDisplayType;
        BarGraphContainerModel barGraphContainerModel;
        List list2;
        AdditionalInfoTextModel additionalInfoTextModel;
        SleepDetailsLabelsModel sleepDetailsLabelsModel;
        SleepDetailsVowsModel sleepDetailsVowsModel;
        GraphModel graphModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SleepDetailsModel.$childSerializers;
        List list3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            GraphModel graphModel2 = (GraphModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, GraphModel$$serializer.INSTANCE, null);
            SleepDetailsVowsModel sleepDetailsVowsModel2 = (SleepDetailsVowsModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, SleepDetailsVowsModel$$serializer.INSTANCE, null);
            SleepDetailsLabelsModel sleepDetailsLabelsModel2 = (SleepDetailsLabelsModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, SleepDetailsLabelsModel$$serializer.INSTANCE, null);
            BarGraphContainerModel barGraphContainerModel2 = (BarGraphContainerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BarGraphContainerModel$$serializer.INSTANCE, null);
            MissingHRDataModel missingHRDataModel2 = (MissingHRDataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, MissingHRDataModel$$serializer.INSTANCE, null);
            ActivityDisplayType activityDisplayType2 = (ActivityDisplayType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            SleepDetailsEditModel sleepDetailsEditModel2 = (SleepDetailsEditModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, SleepDetailsEditModel$$serializer.INSTANCE, null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            WhoopCoachVowModel whoopCoachVowModel2 = (WhoopCoachVowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, WhoopCoachVowModel$$serializer.INSTANCE, null);
            AdditionalInfoTextModel additionalInfoTextModel2 = (AdditionalInfoTextModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, AdditionalInfoTextModel$$serializer.INSTANCE, null);
            list2 = list5;
            list = list4;
            metaData = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, MetaData$$serializer.INSTANCE, null);
            additionalInfoTextModel = additionalInfoTextModel2;
            whoopCoachVowModel = whoopCoachVowModel2;
            sleepDetailsEditModel = sleepDetailsEditModel2;
            missingHRDataModel = missingHRDataModel2;
            sleepDetailsLabelsModel = sleepDetailsLabelsModel2;
            barGraphContainerModel = barGraphContainerModel2;
            sleepDetailsVowsModel = sleepDetailsVowsModel2;
            activityDisplayType = activityDisplayType2;
            i13 = 4095;
            graphModel = graphModel2;
        } else {
            GraphModel graphModel3 = null;
            MetaData metaData2 = null;
            WhoopCoachVowModel whoopCoachVowModel3 = null;
            SleepDetailsEditModel sleepDetailsEditModel3 = null;
            MissingHRDataModel missingHRDataModel3 = null;
            ActivityDisplayType activityDisplayType3 = null;
            BarGraphContainerModel barGraphContainerModel3 = null;
            int i14 = 6;
            int i15 = 8;
            int i16 = 1;
            int i17 = 0;
            int i18 = 0;
            List list6 = null;
            AdditionalInfoTextModel additionalInfoTextModel3 = null;
            SleepDetailsLabelsModel sleepDetailsLabelsModel3 = null;
            SleepDetailsVowsModel sleepDetailsVowsModel3 = null;
            while (i16 != 0) {
                interfaceC23462hArr = interfaceC23462hArr;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        i16 = i18;
                        interfaceC23462hArr = interfaceC23462hArr;
                        i14 = 6;
                        i15 = 8;
                        graphModel3 = graphModel3;
                        i18 = i16;
                        break;
                    case 0:
                        List list7 = list3;
                        int i19 = i18;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list7);
                        i17 |= 1;
                        i18 = i19;
                        graphModel3 = graphModel3;
                        i14 = 6;
                        i15 = 8;
                        break;
                    case 1:
                        graphModel3 = (GraphModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, GraphModel$$serializer.INSTANCE, graphModel3);
                        i17 |= 2;
                        list3 = list3;
                        i14 = 6;
                        i15 = 8;
                        break;
                    case 2:
                        sleepDetailsVowsModel3 = (SleepDetailsVowsModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, SleepDetailsVowsModel$$serializer.INSTANCE, sleepDetailsVowsModel3);
                        i17 |= 4;
                        list3 = list3;
                        i14 = 6;
                        i15 = 8;
                        break;
                    case 3:
                        sleepDetailsLabelsModel3 = (SleepDetailsLabelsModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, SleepDetailsLabelsModel$$serializer.INSTANCE, sleepDetailsLabelsModel3);
                        i17 |= 8;
                        list3 = list3;
                        i14 = 6;
                        i15 = 8;
                        break;
                    case 4:
                        barGraphContainerModel3 = (BarGraphContainerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BarGraphContainerModel$$serializer.INSTANCE, barGraphContainerModel3);
                        i17 |= 16;
                        list3 = list3;
                        i14 = 6;
                        i15 = 8;
                        break;
                    case 5:
                        missingHRDataModel3 = (MissingHRDataModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, MissingHRDataModel$$serializer.INSTANCE, missingHRDataModel3);
                        i17 |= 32;
                        list3 = list3;
                        i14 = 6;
                        i15 = 8;
                        break;
                    case 6:
                        activityDisplayType3 = (ActivityDisplayType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), activityDisplayType3);
                        i17 |= 64;
                        interfaceC23462hArr = interfaceC23462hArr;
                        list3 = list3;
                        i15 = 8;
                        break;
                    case 7:
                        sleepDetailsEditModel3 = (SleepDetailsEditModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, SleepDetailsEditModel$$serializer.INSTANCE, sleepDetailsEditModel3);
                        i17 |= 128;
                        interfaceC23462hArr = interfaceC23462hArr;
                        list3 = list3;
                        i15 = 8;
                        break;
                    case 8:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list6);
                        i17 |= 256;
                        interfaceC23462hArr = interfaceC23462hArr;
                        list3 = list3;
                        break;
                    case 9:
                        whoopCoachVowModel3 = (WhoopCoachVowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, WhoopCoachVowModel$$serializer.INSTANCE, whoopCoachVowModel3);
                        i17 |= 512;
                        interfaceC23462hArr = interfaceC23462hArr;
                        list3 = list3;
                        break;
                    case 10:
                        additionalInfoTextModel3 = (AdditionalInfoTextModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, AdditionalInfoTextModel$$serializer.INSTANCE, additionalInfoTextModel3);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        interfaceC23462hArr = interfaceC23462hArr;
                        list3 = list3;
                        break;
                    case 11:
                        metaData2 = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, MetaData$$serializer.INSTANCE, metaData2);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        interfaceC23462hArr = interfaceC23462hArr;
                        list3 = list3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            i13 = i17;
            metaData = metaData2;
            whoopCoachVowModel = whoopCoachVowModel3;
            sleepDetailsEditModel = sleepDetailsEditModel3;
            missingHRDataModel = missingHRDataModel3;
            activityDisplayType = activityDisplayType3;
            barGraphContainerModel = barGraphContainerModel3;
            list2 = list6;
            additionalInfoTextModel = additionalInfoTextModel3;
            sleepDetailsLabelsModel = sleepDetailsLabelsModel3;
            sleepDetailsVowsModel = sleepDetailsVowsModel3;
            graphModel = graphModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SleepDetailsModel(i13, list, graphModel, sleepDetailsVowsModel, sleepDetailsLabelsModel, barGraphContainerModel, missingHRDataModel, activityDisplayType, sleepDetailsEditModel, list2, whoopCoachVowModel, additionalInfoTextModel, metaData, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SleepDetailsModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SleepDetailsModel.write$Self$core_details_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
