package com.whoop.trends.data.model;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel$$serializer;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.AdditionalInfoTextModel$$serializer;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.ArticleTileCarouselModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/trends/data/model/TrendsDtoV3.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/trends/data/model/TrendsDtoV3;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/trends/data/model/TrendsDtoV3;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/trends/data/model/TrendsDtoV3;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TrendsDtoV3$$serializer implements GeneratedSerializer<TrendsDtoV3> {
    public static final int $stable;
    public static final TrendsDtoV3$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TrendsDtoV3$$serializer trendsDtoV3$$serializer = new TrendsDtoV3$$serializer();
        INSTANCE = trendsDtoV3$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.trends.data.model.TrendsDtoV3", trendsDtoV3$$serializer, 26);
        pluginGeneratedSerialDescriptor.addElement("header_name_display", false);
        pluginGeneratedSerialDescriptor.addElement("segment_controller", false);
        pluginGeneratedSerialDescriptor.addElement("week_time_segment", false);
        pluginGeneratedSerialDescriptor.addElement("month_time_segment", false);
        pluginGeneratedSerialDescriptor.addElement("six_month_time_segment", false);
        pluginGeneratedSerialDescriptor.addElement("all_time_segment", false);
        pluginGeneratedSerialDescriptor.addElement("no_data_name_display", false);
        pluginGeneratedSerialDescriptor.addElement("no_data_subtext_name_display", false);
        pluginGeneratedSerialDescriptor.addElement("metric_education", true);
        pluginGeneratedSerialDescriptor.addElement("navigation_sections", false);
        pluginGeneratedSerialDescriptor.addElement("education_carousel", false);
        pluginGeneratedSerialDescriptor.addElement("integrations_upsell", false);
        pluginGeneratedSerialDescriptor.addElement("info_callout_display", false);
        pluginGeneratedSerialDescriptor.addElement("manual_measurement_item", false);
        pluginGeneratedSerialDescriptor.addElement("see_all_data_item", false);
        pluginGeneratedSerialDescriptor.addElement("manual_measurement_sheet", false);
        pluginGeneratedSerialDescriptor.addElement("upsell_card", false);
        pluginGeneratedSerialDescriptor.addElement("trend_menu_list", false);
        pluginGeneratedSerialDescriptor.addElement("cardio_fitness_level", false);
        pluginGeneratedSerialDescriptor.addElement("metric_education_list", false);
        pluginGeneratedSerialDescriptor.addElement("info_callouts", false);
        pluginGeneratedSerialDescriptor.addElement("manual_measurement_text_display", false);
        pluginGeneratedSerialDescriptor.addElement("trend_menus", false);
        pluginGeneratedSerialDescriptor.addElement("additional_info_text", false);
        pluginGeneratedSerialDescriptor.addElement("designItems", true);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrendsDtoV3$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TrendsDtoV3.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        TimeSegmentDtoV3$$serializer timeSegmentDtoV3$$serializer = TimeSegmentDtoV3$$serializer.INSTANCE;
        TrendsMenuItemDtoV3$$serializer trendsMenuItemDtoV3$$serializer = TrendsMenuItemDtoV3$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, SegmentControllerDtoV3$$serializer.INSTANCE, AbstractC38195a.m122336d(timeSegmentDtoV3$$serializer), timeSegmentDtoV3$$serializer, timeSegmentDtoV3$$serializer, AbstractC38195a.m122336d(timeSegmentDtoV3$$serializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(MetricEducationV3$$serializer.INSTANCE), interfaceC23462hArr[9].getValue(), AbstractC38195a.m122336d(ArticleTileCarouselModel$$serializer.INSTANCE), AbstractC38195a.m122336d(IntegrationsUpsellDtoV3$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(trendsMenuItemDtoV3$$serializer), AbstractC38195a.m122336d(trendsMenuItemDtoV3$$serializer), AbstractC38195a.m122336d(ManualMeasurementSheet$$serializer.INSTANCE), AbstractC38195a.m122336d(TextWithIllustrationCardModel$$serializer.INSTANCE), interfaceC23462hArr[17].getValue(), AbstractC38195a.m122336d(CardioFitnessLevelModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[19].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[20].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[22].getValue()), AbstractC38195a.m122336d(AdditionalInfoTextModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[24].getValue()), AbstractC38195a.m122336d(MetaData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TrendsDtoV3 deserialize(InterfaceC40541d decoder) {
        int i13;
        SegmentControllerDtoV3 segmentControllerDtoV3;
        List list;
        String str;
        MetaData metaData;
        List list2;
        TimeSegmentDtoV3 timeSegmentDtoV3;
        CardioFitnessLevelModel cardioFitnessLevelModel;
        List list3;
        TrendsMenuItemDtoV3 trendsMenuItemDtoV3;
        List list4;
        AdditionalInfoTextModel additionalInfoTextModel;
        TextWithIllustrationCardModel textWithIllustrationCardModel;
        TrendsMenuItemDtoV3 trendsMenuItemDtoV4;
        String str2;
        TimeSegmentDtoV3 timeSegmentDtoV4;
        TimeSegmentDtoV3 timeSegmentDtoV5;
        TimeSegmentDtoV3 timeSegmentDtoV6;
        String str3;
        String str4;
        List list5;
        MetricEducationV3 metricEducationV3;
        List list6;
        ArticleTileCarouselModel articleTileCarouselModel;
        IntegrationsUpsellDtoV3 integrationsUpsellDtoV3;
        String str5;
        ManualMeasurementSheet manualMeasurementSheet;
        int i14;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TrendsDtoV3.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            SegmentControllerDtoV3 segmentControllerDtoV4 = (SegmentControllerDtoV3) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, SegmentControllerDtoV3$$serializer.INSTANCE, null);
            TimeSegmentDtoV3$$serializer timeSegmentDtoV3$$serializer = TimeSegmentDtoV3$$serializer.INSTANCE;
            TimeSegmentDtoV3 timeSegmentDtoV7 = (TimeSegmentDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, timeSegmentDtoV3$$serializer, null);
            TimeSegmentDtoV3 timeSegmentDtoV8 = (TimeSegmentDtoV3) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, timeSegmentDtoV3$$serializer, null);
            TimeSegmentDtoV3 timeSegmentDtoV9 = (TimeSegmentDtoV3) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, timeSegmentDtoV3$$serializer, null);
            TimeSegmentDtoV3 timeSegmentDtoV10 = (TimeSegmentDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, timeSegmentDtoV3$$serializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            MetricEducationV3 metricEducationV4 = (MetricEducationV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, MetricEducationV3$$serializer.INSTANCE, null);
            List list7 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            ArticleTileCarouselModel articleTileCarouselModel2 = (ArticleTileCarouselModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, ArticleTileCarouselModel$$serializer.INSTANCE, null);
            IntegrationsUpsellDtoV3 integrationsUpsellDtoV4 = (IntegrationsUpsellDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, IntegrationsUpsellDtoV3$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            TrendsMenuItemDtoV3$$serializer trendsMenuItemDtoV3$$serializer = TrendsMenuItemDtoV3$$serializer.INSTANCE;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV5 = (TrendsMenuItemDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, trendsMenuItemDtoV3$$serializer, null);
            TrendsMenuItemDtoV3 trendsMenuItemDtoV6 = (TrendsMenuItemDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, trendsMenuItemDtoV3$$serializer, null);
            ManualMeasurementSheet manualMeasurementSheet2 = (ManualMeasurementSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, ManualMeasurementSheet$$serializer.INSTANCE, null);
            TextWithIllustrationCardModel textWithIllustrationCardModel2 = (TextWithIllustrationCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, TextWithIllustrationCardModel$$serializer.INSTANCE, null);
            List list8 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 17, (InterfaceC37137b) interfaceC23462hArr[17].getValue(), null);
            CardioFitnessLevelModel cardioFitnessLevelModel2 = (CardioFitnessLevelModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, CardioFitnessLevelModel$$serializer.INSTANCE, null);
            List list9 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, (InterfaceC37137b) interfaceC23462hArr[19].getValue(), null);
            List list10 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, (InterfaceC37137b) interfaceC23462hArr[20].getValue(), null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, stringSerializer, null);
            List list11 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 22, (InterfaceC37137b) interfaceC23462hArr[22].getValue(), null);
            AdditionalInfoTextModel additionalInfoTextModel2 = (AdditionalInfoTextModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 23, AdditionalInfoTextModel$$serializer.INSTANCE, null);
            List list12 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 24, (InterfaceC37137b) interfaceC23462hArr[24].getValue(), null);
            i13 = 67108863;
            metaData = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 25, MetaData$$serializer.INSTANCE, null);
            str = str7;
            timeSegmentDtoV3 = timeSegmentDtoV10;
            timeSegmentDtoV5 = timeSegmentDtoV8;
            timeSegmentDtoV6 = timeSegmentDtoV9;
            metricEducationV3 = metricEducationV4;
            timeSegmentDtoV4 = timeSegmentDtoV7;
            list6 = list7;
            segmentControllerDtoV3 = segmentControllerDtoV4;
            str3 = strDecodeStringElement2;
            articleTileCarouselModel = articleTileCarouselModel2;
            str4 = strDecodeStringElement3;
            additionalInfoTextModel = additionalInfoTextModel2;
            list = list10;
            cardioFitnessLevelModel = cardioFitnessLevelModel2;
            textWithIllustrationCardModel = textWithIllustrationCardModel2;
            manualMeasurementSheet = manualMeasurementSheet2;
            trendsMenuItemDtoV3 = trendsMenuItemDtoV6;
            list4 = list12;
            list5 = list11;
            list2 = list9;
            list3 = list8;
            trendsMenuItemDtoV4 = trendsMenuItemDtoV5;
            str2 = str6;
            integrationsUpsellDtoV3 = integrationsUpsellDtoV4;
            str5 = strDecodeStringElement;
        } else {
            int i16 = 9;
            boolean z4 = true;
            ManualMeasurementSheet manualMeasurementSheet3 = null;
            TextWithIllustrationCardModel textWithIllustrationCardModel3 = null;
            List list13 = null;
            List list14 = null;
            String str8 = null;
            MetaData metaData2 = null;
            List list15 = null;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV7 = null;
            CardioFitnessLevelModel cardioFitnessLevelModel3 = null;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV8 = null;
            List list16 = null;
            AdditionalInfoTextModel additionalInfoTextModel3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            SegmentControllerDtoV3 segmentControllerDtoV5 = null;
            TimeSegmentDtoV3 timeSegmentDtoV11 = null;
            TimeSegmentDtoV3 timeSegmentDtoV12 = null;
            TimeSegmentDtoV3 timeSegmentDtoV13 = null;
            TimeSegmentDtoV3 timeSegmentDtoV14 = null;
            MetricEducationV3 metricEducationV5 = null;
            List list17 = null;
            ArticleTileCarouselModel articleTileCarouselModel3 = null;
            IntegrationsUpsellDtoV3 integrationsUpsellDtoV5 = null;
            String str9 = null;
            i13 = 0;
            List list18 = null;
            while (z4) {
                TrendsMenuItemDtoV3 trendsMenuItemDtoV9 = trendsMenuItemDtoV7;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        list13 = list13;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 0:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        list13 = list13;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 1:
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        list13 = list13;
                        segmentControllerDtoV5 = (SegmentControllerDtoV3) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, SegmentControllerDtoV3$$serializer.INSTANCE, segmentControllerDtoV5);
                        i13 |= 2;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        timeSegmentDtoV11 = timeSegmentDtoV11;
                        list13 = list13;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 2:
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        list13 = list13;
                        timeSegmentDtoV11 = (TimeSegmentDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, TimeSegmentDtoV3$$serializer.INSTANCE, timeSegmentDtoV11);
                        i13 |= 4;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        timeSegmentDtoV12 = timeSegmentDtoV12;
                        list13 = list13;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 3:
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        list13 = list13;
                        timeSegmentDtoV12 = (TimeSegmentDtoV3) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, TimeSegmentDtoV3$$serializer.INSTANCE, timeSegmentDtoV12);
                        i13 |= 8;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        timeSegmentDtoV13 = timeSegmentDtoV13;
                        list13 = list13;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 4:
                        timeSegmentDtoV13 = (TimeSegmentDtoV3) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, TimeSegmentDtoV3$$serializer.INSTANCE, timeSegmentDtoV13);
                        i13 |= 16;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        list13 = list13;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 5:
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        timeSegmentDtoV14 = (TimeSegmentDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, TimeSegmentDtoV3$$serializer.INSTANCE, timeSegmentDtoV14);
                        i13 |= 32;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        metricEducationV5 = metricEducationV5;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 6:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i13 |= 64;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 7:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i13 |= 128;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 8:
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        metricEducationV5 = (MetricEducationV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, MetricEducationV3$$serializer.INSTANCE, metricEducationV5);
                        i13 |= 256;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        list17 = list17;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        i16 = 9;
                        break;
                    case 9:
                        ManualMeasurementSheet manualMeasurementSheet4 = manualMeasurementSheet3;
                        InterfaceC37137b interfaceC37137b = (InterfaceC37137b) interfaceC23462hArr[i16].getValue();
                        int i17 = i16;
                        list17 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, interfaceC37137b, list17);
                        i13 |= 512;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        articleTileCarouselModel3 = articleTileCarouselModel3;
                        manualMeasurementSheet3 = manualMeasurementSheet4;
                        i16 = i17;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        break;
                    case 10:
                        articleTileCarouselModel3 = (ArticleTileCarouselModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, ArticleTileCarouselModel$$serializer.INSTANCE, articleTileCarouselModel3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        integrationsUpsellDtoV5 = integrationsUpsellDtoV5;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        break;
                    case 11:
                        integrationsUpsellDtoV5 = (IntegrationsUpsellDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, IntegrationsUpsellDtoV3$$serializer.INSTANCE, integrationsUpsellDtoV5);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        str9 = str9;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        break;
                    case 12:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str9);
                        i13 |= 4096;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        break;
                    case 13:
                        trendsMenuItemDtoV7 = (TrendsMenuItemDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, TrendsMenuItemDtoV3$$serializer.INSTANCE, trendsMenuItemDtoV9);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        textWithIllustrationCardModel3 = textWithIllustrationCardModel3;
                        manualMeasurementSheet3 = manualMeasurementSheet3;
                        break;
                    case 14:
                        trendsMenuItemDtoV8 = (TrendsMenuItemDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, TrendsMenuItemDtoV3$$serializer.INSTANCE, trendsMenuItemDtoV8);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case 15:
                        manualMeasurementSheet3 = (ManualMeasurementSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, ManualMeasurementSheet$$serializer.INSTANCE, manualMeasurementSheet3);
                        i14 = 32768;
                        i13 |= i14;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case 16:
                        textWithIllustrationCardModel3 = (TextWithIllustrationCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, TextWithIllustrationCardModel$$serializer.INSTANCE, textWithIllustrationCardModel3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i13 |= i14;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        list18 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 17, (InterfaceC37137b) interfaceC23462hArr[17].getValue(), list18);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i13 |= i14;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        cardioFitnessLevelModel3 = (CardioFitnessLevelModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, CardioFitnessLevelModel$$serializer.INSTANCE, cardioFitnessLevelModel3);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i13 |= i15;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        list15 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, (InterfaceC37137b) interfaceC23462hArr[19].getValue(), list15);
                        i15 = 524288;
                        i13 |= i15;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case 20:
                        list14 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, (InterfaceC37137b) interfaceC23462hArr[20].getValue(), list14);
                        i14 = 1048576;
                        i13 |= i14;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case 21:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, StringSerializer.INSTANCE, str8);
                        i15 = 2097152;
                        i13 |= i15;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        list13 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 22, (InterfaceC37137b) interfaceC23462hArr[22].getValue(), list13);
                        i15 = 4194304;
                        i13 |= i15;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        additionalInfoTextModel3 = (AdditionalInfoTextModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 23, AdditionalInfoTextModel$$serializer.INSTANCE, additionalInfoTextModel3);
                        i14 = 8388608;
                        i13 |= i14;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case 24:
                        list16 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 24, (InterfaceC37137b) interfaceC23462hArr[24].getValue(), list16);
                        i14 = 16777216;
                        i13 |= i14;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    case 25:
                        metaData2 = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 25, MetaData$$serializer.INSTANCE, metaData2);
                        i15 = AndroidSDKConstants.FLAG_MUTABLE;
                        i13 |= i15;
                        trendsMenuItemDtoV7 = trendsMenuItemDtoV9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            segmentControllerDtoV3 = segmentControllerDtoV5;
            list = list14;
            str = str8;
            metaData = metaData2;
            list2 = list15;
            timeSegmentDtoV3 = timeSegmentDtoV14;
            cardioFitnessLevelModel = cardioFitnessLevelModel3;
            list3 = list18;
            trendsMenuItemDtoV3 = trendsMenuItemDtoV8;
            list4 = list16;
            additionalInfoTextModel = additionalInfoTextModel3;
            textWithIllustrationCardModel = textWithIllustrationCardModel3;
            trendsMenuItemDtoV4 = trendsMenuItemDtoV7;
            str2 = str9;
            timeSegmentDtoV4 = timeSegmentDtoV11;
            timeSegmentDtoV5 = timeSegmentDtoV12;
            timeSegmentDtoV6 = timeSegmentDtoV13;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            list5 = list13;
            metricEducationV3 = metricEducationV5;
            list6 = list17;
            articleTileCarouselModel = articleTileCarouselModel3;
            integrationsUpsellDtoV3 = integrationsUpsellDtoV5;
            str5 = strDecodeStringElement6;
            manualMeasurementSheet = manualMeasurementSheet3;
        }
        int i18 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TrendsDtoV3(i18, str5, segmentControllerDtoV3, timeSegmentDtoV4, timeSegmentDtoV5, timeSegmentDtoV6, timeSegmentDtoV3, str3, str4, metricEducationV3, list6, articleTileCarouselModel, integrationsUpsellDtoV3, str2, trendsMenuItemDtoV4, trendsMenuItemDtoV3, manualMeasurementSheet, textWithIllustrationCardModel, list3, cardioFitnessLevelModel, list2, list, str, list5, additionalInfoTextModel, list4, metaData, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TrendsDtoV3 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TrendsDtoV3.write$Self$trends_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
