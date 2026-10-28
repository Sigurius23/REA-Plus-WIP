package com.whoop.core.details.network.model.recoveryv2;

import com.whoop.core.details.network.model.DetailsEditComponent;
import com.whoop.core.details.network.model.DetailsEditComponent$$serializer;
import com.whoop.core.details.network.model.TitleBarModel;
import com.whoop.core.details.network.model.TitleBarModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AchievementProgressCardModel;
import com.whoop.design.models.items.AchievementProgressCardModel$$serializer;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.BarGraphContainerModel$$serializer;
import com.whoop.design.models.items.KeyMetricCarouselModel;
import com.whoop.design.models.items.KeyMetricCarouselModel$$serializer;
import com.whoop.design.models.items.MapModel;
import com.whoop.design.models.items.MapModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class RecoveryDetailsModel$$serializer implements GeneratedSerializer<RecoveryDetailsModel> {
    public static final int $stable;
    public static final RecoveryDetailsModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        RecoveryDetailsModel$$serializer recoveryDetailsModel$$serializer = new RecoveryDetailsModel$$serializer();
        INSTANCE = recoveryDetailsModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel", recoveryDetailsModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("titleBar", false);
        pluginGeneratedSerialDescriptor.addElement("horizontal_stats", false);
        pluginGeneratedSerialDescriptor.addElement("keyMetricCarousel", false);
        pluginGeneratedSerialDescriptor.addElement("segmentedControlDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("graphs", false);
        pluginGeneratedSerialDescriptor.addElement("bar_graph_container", false);
        pluginGeneratedSerialDescriptor.addElement("integrationPromoCard", true);
        pluginGeneratedSerialDescriptor.addElement("achievementProgressCard", true);
        pluginGeneratedSerialDescriptor.addElement("map", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("tagsV2", false);
        pluginGeneratedSerialDescriptor.addElement("editable", false);
        pluginGeneratedSerialDescriptor.addElement("detailsEditComponents", false);
        pluginGeneratedSerialDescriptor.addElement("tiles", false);
        pluginGeneratedSerialDescriptor.addElement("whoopCoachVow", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RecoveryDetailsModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = RecoveryDetailsModel.$childSerializers;
        return new InterfaceC37138c[]{TitleBarModel$$serializer.INSTANCE, interfaceC23462hArr[1].getValue(), KeyMetricCarouselModel$$serializer.INSTANCE, interfaceC23462hArr[3].getValue(), interfaceC23462hArr[4].getValue(), AbstractC38195a.m122336d(BarGraphContainerModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d(AchievementProgressCardModel$$serializer.INSTANCE), AbstractC38195a.m122336d(MapModel$$serializer.INSTANCE), interfaceC23462hArr[9].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), DetailsEditComponent$$serializer.INSTANCE, interfaceC23462hArr[13].getValue(), AbstractC38195a.m122336d(WhoopCoachVowModel$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final RecoveryDetailsModel deserialize(InterfaceC40541d decoder) {
        int i13;
        TitleBarModel titleBarModel;
        DesignSystemModel designSystemModel;
        List list;
        List list2;
        AchievementProgressCardModel achievementProgressCardModel;
        List list3;
        List list4;
        DetailsEditComponent detailsEditComponent;
        Boolean bool;
        MapModel mapModel;
        BarGraphContainerModel barGraphContainerModel;
        List list5;
        KeyMetricCarouselModel keyMetricCarouselModel;
        WhoopCoachVowModel whoopCoachVowModel;
        List list6;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = RecoveryDetailsModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            TitleBarModel titleBarModel2 = (TitleBarModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, TitleBarModel$$serializer.INSTANCE, null);
            List list7 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            KeyMetricCarouselModel keyMetricCarouselModel2 = (KeyMetricCarouselModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, KeyMetricCarouselModel$$serializer.INSTANCE, null);
            List list8 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            List list9 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            BarGraphContainerModel barGraphContainerModel2 = (BarGraphContainerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BarGraphContainerModel$$serializer.INSTANCE, null);
            DesignSystemModel designSystemModel2 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            AchievementProgressCardModel achievementProgressCardModel2 = (AchievementProgressCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, AchievementProgressCardModel$$serializer.INSTANCE, null);
            MapModel mapModel2 = (MapModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, MapModel$$serializer.INSTANCE, null);
            List list10 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            List list11 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, BooleanSerializer.INSTANCE, null);
            DetailsEditComponent detailsEditComponent2 = (DetailsEditComponent) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, DetailsEditComponent$$serializer.INSTANCE, null);
            List list12 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            i13 = 32767;
            whoopCoachVowModel = (WhoopCoachVowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, WhoopCoachVowModel$$serializer.INSTANCE, null);
            titleBarModel = titleBarModel2;
            list4 = list9;
            list5 = list7;
            achievementProgressCardModel = achievementProgressCardModel2;
            barGraphContainerModel = barGraphContainerModel2;
            mapModel = mapModel2;
            keyMetricCarouselModel = keyMetricCarouselModel2;
            list = list8;
            list3 = list11;
            list2 = list10;
            designSystemModel = designSystemModel2;
            list6 = list12;
            detailsEditComponent = detailsEditComponent2;
            bool = bool2;
        } else {
            int i14 = 4;
            List list13 = null;
            WhoopCoachVowModel whoopCoachVowModel2 = null;
            DesignSystemModel designSystemModel3 = null;
            List list14 = null;
            AchievementProgressCardModel achievementProgressCardModel3 = null;
            List list15 = null;
            List list16 = null;
            TitleBarModel titleBarModel3 = null;
            List list17 = null;
            int i15 = 1;
            boolean z4 = true;
            int i16 = 10;
            int i17 = 9;
            int i18 = 6;
            int i19 = 3;
            i13 = 0;
            KeyMetricCarouselModel keyMetricCarouselModel3 = null;
            List list18 = null;
            DetailsEditComponent detailsEditComponent3 = null;
            Boolean bool3 = null;
            MapModel mapModel3 = null;
            BarGraphContainerModel barGraphContainerModel3 = null;
            while (z4) {
                keyMetricCarouselModel3 = keyMetricCarouselModel3;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        whoopCoachVowModel2 = whoopCoachVowModel2;
                        list13 = list13;
                        i15 = 1;
                        i19 = 3;
                        i14 = 4;
                        i18 = 6;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 0:
                        titleBarModel3 = (TitleBarModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, TitleBarModel$$serializer.INSTANCE, titleBarModel3);
                        i13 |= 1;
                        list18 = list18;
                        list17 = list17;
                        whoopCoachVowModel2 = whoopCoachVowModel2;
                        list13 = list13;
                        i15 = 1;
                        i19 = 3;
                        i14 = 4;
                        i18 = 6;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 1:
                        WhoopCoachVowModel whoopCoachVowModel3 = whoopCoachVowModel2;
                        int i24 = i15;
                        list17 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list17);
                        i13 |= 2;
                        list18 = list18;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        whoopCoachVowModel2 = whoopCoachVowModel3;
                        i14 = 4;
                        i18 = 6;
                        i17 = 9;
                        i16 = 10;
                        i15 = i24;
                        list13 = list13;
                        i19 = 3;
                        break;
                    case 2:
                        i13 |= 4;
                        list18 = list18;
                        whoopCoachVowModel2 = whoopCoachVowModel2;
                        i14 = 4;
                        i18 = 6;
                        i17 = 9;
                        i16 = 10;
                        keyMetricCarouselModel3 = (KeyMetricCarouselModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, KeyMetricCarouselModel$$serializer.INSTANCE, keyMetricCarouselModel3);
                        list13 = list13;
                        i19 = 3;
                        break;
                    case 3:
                        int i25 = i19;
                        list18 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i25, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), list18);
                        i13 |= 8;
                        i19 = i25;
                        list13 = list13;
                        i14 = 4;
                        i18 = 6;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 4:
                        list16 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), list16);
                        i13 |= 16;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        i18 = 6;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 5:
                        barGraphContainerModel3 = (BarGraphContainerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BarGraphContainerModel$$serializer.INSTANCE, barGraphContainerModel3);
                        i13 |= 32;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        i18 = 6;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 6:
                        designSystemModel3 = (DesignSystemModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), designSystemModel3);
                        i13 |= 64;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 7:
                        achievementProgressCardModel3 = (AchievementProgressCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, AchievementProgressCardModel$$serializer.INSTANCE, achievementProgressCardModel3);
                        i13 |= 128;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 8:
                        mapModel3 = (MapModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, MapModel$$serializer.INSTANCE, mapModel3);
                        i13 |= 256;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        i17 = 9;
                        i16 = 10;
                        break;
                    case 9:
                        list14 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list14);
                        i13 |= 512;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        i16 = 10;
                        break;
                    case 10:
                        list15 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list15);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        break;
                    case 11:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, BooleanSerializer.INSTANCE, bool3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        break;
                    case 12:
                        detailsEditComponent3 = (DetailsEditComponent) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, DetailsEditComponent$$serializer.INSTANCE, detailsEditComponent3);
                        i13 |= 4096;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        break;
                    case 13:
                        list13 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), list13);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        break;
                    case 14:
                        whoopCoachVowModel2 = (WhoopCoachVowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, WhoopCoachVowModel$$serializer.INSTANCE, whoopCoachVowModel2);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        keyMetricCarouselModel3 = keyMetricCarouselModel3;
                        list18 = list18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            titleBarModel = titleBarModel3;
            designSystemModel = designSystemModel3;
            list = list18;
            list2 = list14;
            achievementProgressCardModel = achievementProgressCardModel3;
            list3 = list15;
            list4 = list16;
            detailsEditComponent = detailsEditComponent3;
            bool = bool3;
            mapModel = mapModel3;
            barGraphContainerModel = barGraphContainerModel3;
            list5 = list17;
            keyMetricCarouselModel = keyMetricCarouselModel3;
            whoopCoachVowModel = whoopCoachVowModel2;
            list6 = list13;
        }
        int i26 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new RecoveryDetailsModel(i26, titleBarModel, list5, keyMetricCarouselModel, list, list4, barGraphContainerModel, designSystemModel, achievementProgressCardModel, mapModel, list2, list3, bool, detailsEditComponent, list6, whoopCoachVowModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, RecoveryDetailsModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        RecoveryDetailsModel.write$Self$core_details_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
