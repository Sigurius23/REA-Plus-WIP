package com.whoop.stress.domain.model;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.ArticleTileCarouselModel$$serializer;
import com.whoop.design.models.items.StepperComponentModel;
import com.whoop.design.models.items.StepperComponentModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.design.models.items.graph.StressGraphingCardModel$$serializer;
import com.whoop.design.models.items.graph.stress.StressState;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/stress/domain/model/StressMonitorDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/stress/domain/model/StressMonitorDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/stress/domain/model/StressMonitorDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/stress/domain/model/StressMonitorDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StressMonitorDto$$serializer implements GeneratedSerializer<StressMonitorDto> {
    public static final int $stable;
    public static final StressMonitorDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StressMonitorDto$$serializer stressMonitorDto$$serializer = new StressMonitorDto$$serializer();
        INSTANCE = stressMonitorDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.stress.domain.model.StressMonitorDto", stressMonitorDto$$serializer, 24);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("loading_data", false);
        pluginGeneratedSerialDescriptor.addElement("stress_state", false);
        pluginGeneratedSerialDescriptor.addElement("show_connectivity_window", false);
        pluginGeneratedSerialDescriptor.addElement("gauge", false);
        pluginGeneratedSerialDescriptor.addElement("vow", false);
        pluginGeneratedSerialDescriptor.addElement("whoop_coach_vow", false);
        pluginGeneratedSerialDescriptor.addElement("stress_graph", false);
        pluginGeneratedSerialDescriptor.addElement("typeform_url", false);
        pluginGeneratedSerialDescriptor.addElement("last_updated_display", false);
        pluginGeneratedSerialDescriptor.addElement("onboarding_carousel", false);
        pluginGeneratedSerialDescriptor.addElement("sessions", false);
        pluginGeneratedSerialDescriptor.addElement("education_carousel", false);
        pluginGeneratedSerialDescriptor.addElement("show_education", false);
        pluginGeneratedSerialDescriptor.addElement("calibration_text_display", false);
        pluginGeneratedSerialDescriptor.addElement("pending_activity_dialogue", false);
        pluginGeneratedSerialDescriptor.addElement("onboarding_dismiss_dialogue", false);
        pluginGeneratedSerialDescriptor.addElement("previous_stress_graph", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("date_selector", false);
        pluginGeneratedSerialDescriptor.addElement("extended24_hour_graph", false);
        pluginGeneratedSerialDescriptor.addElement("trend_list", false);
        pluginGeneratedSerialDescriptor.addElement("progress_stepper", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StressMonitorDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = StressMonitorDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StressGraphingCardModel$$serializer stressGraphingCardModel$$serializer = StressGraphingCardModel$$serializer.INSTANCE;
        ArticleTileCarouselModel$$serializer articleTileCarouselModel$$serializer = ArticleTileCarouselModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(LoadingData$$serializer.INSTANCE), interfaceC23462hArr[2].getValue(), booleanSerializer, StressMonitorMeterDto$$serializer.INSTANCE, AbstractC38195a.m122336d(StressMonitorVow$$serializer.INSTANCE), AbstractC38195a.m122336d(WhoopCoachVowModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stressGraphingCardModel$$serializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(articleTileCarouselModel$$serializer), AbstractC38195a.m122336d(articleTileCarouselModel$$serializer), AbstractC38195a.m122336d(articleTileCarouselModel$$serializer), booleanSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(PendingActivityDialogue$$serializer.INSTANCE), AbstractC38195a.m122336d(OnboardingDismissDialog$$serializer.INSTANCE), AbstractC38195a.m122336d(stressGraphingCardModel$$serializer), AbstractC38195a.m122336d(StressTrend$$serializer.INSTANCE), AbstractC38195a.m122336d(StressDateSelector$$serializer.INSTANCE), AbstractC38195a.m122336d(stressGraphingCardModel$$serializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[21].getValue()), AbstractC38195a.m122336d(StepperComponentModel$$serializer.INSTANCE), AbstractC38195a.m122336d(MetaData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StressMonitorDto deserialize(InterfaceC40541d decoder) {
        String strDecodeStringElement;
        StressGraphingCardModel stressGraphingCardModel;
        LoadingData loadingData;
        ArticleTileCarouselModel articleTileCarouselModel;
        MetaData metaData;
        List list;
        ArticleTileCarouselModel articleTileCarouselModel2;
        StepperComponentModel stepperComponentModel;
        StressGraphingCardModel stressGraphingCardModel2;
        StressDateSelector stressDateSelector;
        StressTrend stressTrend;
        int i13;
        PendingActivityDialogue pendingActivityDialogue;
        OnboardingDismissDialog onboardingDismissDialog;
        StressState stressState;
        StressMonitorMeterDto stressMonitorMeterDto;
        StressMonitorVow stressMonitorVow;
        WhoopCoachVowModel whoopCoachVowModel;
        String str;
        String str2;
        String str3;
        ArticleTileCarouselModel articleTileCarouselModel3;
        StressGraphingCardModel stressGraphingCardModel3;
        boolean z4;
        boolean z13;
        int i14;
        int i15;
        ArticleTileCarouselModel articleTileCarouselModel4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = StressMonitorDto.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            LoadingData loadingData2 = (LoadingData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, LoadingData$$serializer.INSTANCE, null);
            StressState stressState2 = (StressState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            StressMonitorMeterDto stressMonitorMeterDto2 = (StressMonitorMeterDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, StressMonitorMeterDto$$serializer.INSTANCE, null);
            StressMonitorVow stressMonitorVow2 = (StressMonitorVow) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StressMonitorVow$$serializer.INSTANCE, null);
            WhoopCoachVowModel whoopCoachVowModel2 = (WhoopCoachVowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, WhoopCoachVowModel$$serializer.INSTANCE, null);
            StressGraphingCardModel$$serializer stressGraphingCardModel$$serializer = StressGraphingCardModel$$serializer.INSTANCE;
            stressGraphingCardModel = (StressGraphingCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stressGraphingCardModel$$serializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            ArticleTileCarouselModel$$serializer articleTileCarouselModel$$serializer = ArticleTileCarouselModel$$serializer.INSTANCE;
            ArticleTileCarouselModel articleTileCarouselModel5 = (ArticleTileCarouselModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, articleTileCarouselModel$$serializer, null);
            strDecodeStringElement = strDecodeStringElement2;
            ArticleTileCarouselModel articleTileCarouselModel6 = (ArticleTileCarouselModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, articleTileCarouselModel$$serializer, null);
            ArticleTileCarouselModel articleTileCarouselModel7 = (ArticleTileCarouselModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, articleTileCarouselModel$$serializer, null);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 13);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, null);
            PendingActivityDialogue pendingActivityDialogue2 = (PendingActivityDialogue) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, PendingActivityDialogue$$serializer.INSTANCE, null);
            OnboardingDismissDialog onboardingDismissDialog2 = (OnboardingDismissDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, OnboardingDismissDialog$$serializer.INSTANCE, null);
            StressGraphingCardModel stressGraphingCardModel4 = (StressGraphingCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, stressGraphingCardModel$$serializer, null);
            StressTrend stressTrend2 = (StressTrend) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, StressTrend$$serializer.INSTANCE, null);
            StressDateSelector stressDateSelector2 = (StressDateSelector) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, StressDateSelector$$serializer.INSTANCE, null);
            StressGraphingCardModel stressGraphingCardModel5 = (StressGraphingCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, stressGraphingCardModel$$serializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, (InterfaceC37137b) interfaceC23462hArr[21].getValue(), null);
            StepperComponentModel stepperComponentModel2 = (StepperComponentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 22, StepperComponentModel$$serializer.INSTANCE, null);
            metaData = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 23, MetaData$$serializer.INSTANCE, null);
            stressGraphingCardModel2 = stressGraphingCardModel5;
            str2 = strDecodeStringElement4;
            whoopCoachVowModel = whoopCoachVowModel2;
            stressMonitorVow = stressMonitorVow2;
            z4 = zDecodeBooleanElement;
            str = strDecodeStringElement3;
            stressMonitorMeterDto = stressMonitorMeterDto2;
            stressState = stressState2;
            loadingData = loadingData2;
            i13 = 16777215;
            articleTileCarouselModel3 = articleTileCarouselModel5;
            stepperComponentModel = stepperComponentModel2;
            stressDateSelector = stressDateSelector2;
            list = list2;
            stressTrend = stressTrend2;
            onboardingDismissDialog = onboardingDismissDialog2;
            stressGraphingCardModel3 = stressGraphingCardModel4;
            pendingActivityDialogue = pendingActivityDialogue2;
            str3 = str4;
            articleTileCarouselModel2 = articleTileCarouselModel7;
            z13 = zDecodeBooleanElement2;
            articleTileCarouselModel = articleTileCarouselModel6;
        } else {
            int i16 = 2;
            boolean z14 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            OnboardingDismissDialog onboardingDismissDialog3 = null;
            StressGraphingCardModel stressGraphingCardModel6 = null;
            String str5 = null;
            ArticleTileCarouselModel articleTileCarouselModel8 = null;
            ArticleTileCarouselModel articleTileCarouselModel9 = null;
            MetaData metaData2 = null;
            List list3 = null;
            ArticleTileCarouselModel articleTileCarouselModel10 = null;
            StepperComponentModel stepperComponentModel3 = null;
            StressGraphingCardModel stressGraphingCardModel7 = null;
            StressDateSelector stressDateSelector3 = null;
            PendingActivityDialogue pendingActivityDialogue3 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            LoadingData loadingData3 = null;
            StressState stressState3 = null;
            StressMonitorMeterDto stressMonitorMeterDto3 = null;
            StressMonitorVow stressMonitorVow3 = null;
            WhoopCoachVowModel whoopCoachVowModel3 = null;
            StressGraphingCardModel stressGraphingCardModel8 = null;
            int i17 = 0;
            StressTrend stressTrend3 = null;
            while (z14) {
                ArticleTileCarouselModel articleTileCarouselModel11 = articleTileCarouselModel9;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        str5 = str5;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        i16 = 2;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i17 |= 1;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        str5 = str5;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        i16 = 2;
                        break;
                    case 1:
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        str5 = str5;
                        articleTileCarouselModel11 = articleTileCarouselModel11;
                        loadingData3 = (LoadingData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, LoadingData$$serializer.INSTANCE, loadingData3);
                        i17 |= 2;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        stressState3 = stressState3;
                        str5 = str5;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        i16 = 2;
                        break;
                    case 2:
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        String str6 = str5;
                        int i18 = i16;
                        stressState3 = (StressState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), stressState3);
                        i17 |= 4;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        stressMonitorMeterDto3 = stressMonitorMeterDto3;
                        str5 = str6;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        i16 = i18;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        break;
                    case 3:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        i17 |= 8;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        str5 = str5;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        break;
                    case 4:
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        str5 = str5;
                        articleTileCarouselModel11 = articleTileCarouselModel11;
                        stressMonitorMeterDto3 = (StressMonitorMeterDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, StressMonitorMeterDto$$serializer.INSTANCE, stressMonitorMeterDto3);
                        i17 |= 16;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        stressMonitorVow3 = stressMonitorVow3;
                        str5 = str5;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        break;
                    case 5:
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        str5 = str5;
                        articleTileCarouselModel11 = articleTileCarouselModel11;
                        stressMonitorVow3 = (StressMonitorVow) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StressMonitorVow$$serializer.INSTANCE, stressMonitorVow3);
                        i17 |= 32;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        whoopCoachVowModel3 = whoopCoachVowModel3;
                        str5 = str5;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        break;
                    case 6:
                        whoopCoachVowModel3 = (WhoopCoachVowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, WhoopCoachVowModel$$serializer.INSTANCE, whoopCoachVowModel3);
                        i17 |= 64;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        str5 = str5;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        break;
                    case 7:
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        articleTileCarouselModel11 = articleTileCarouselModel11;
                        stressGraphingCardModel8 = (StressGraphingCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StressGraphingCardModel$$serializer.INSTANCE, stressGraphingCardModel8);
                        i17 |= 128;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        break;
                    case 8:
                        articleTileCarouselModel4 = articleTileCarouselModel11;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i17 |= 256;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        articleTileCarouselModel9 = articleTileCarouselModel4;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        break;
                    case 9:
                        articleTileCarouselModel4 = articleTileCarouselModel11;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i17 |= 512;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        articleTileCarouselModel9 = articleTileCarouselModel4;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        break;
                    case 10:
                        articleTileCarouselModel4 = (ArticleTileCarouselModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, ArticleTileCarouselModel$$serializer.INSTANCE, articleTileCarouselModel11);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        stressGraphingCardModel6 = stressGraphingCardModel6;
                        articleTileCarouselModel9 = articleTileCarouselModel4;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        break;
                    case 11:
                        articleTileCarouselModel8 = (ArticleTileCarouselModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, ArticleTileCarouselModel$$serializer.INSTANCE, articleTileCarouselModel8);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        onboardingDismissDialog3 = onboardingDismissDialog3;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        break;
                    case 12:
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        articleTileCarouselModel10 = (ArticleTileCarouselModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, ArticleTileCarouselModel$$serializer.INSTANCE, articleTileCarouselModel10);
                        i17 |= 4096;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case 13:
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 13);
                        i17 |= DfuBaseService.ERROR_REMOTE_MASK;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case 14:
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str5);
                        i17 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case 15:
                        pendingActivityDialogue3 = (PendingActivityDialogue) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, PendingActivityDialogue$$serializer.INSTANCE, pendingActivityDialogue3);
                        i14 = 32768;
                        i17 |= i14;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case 16:
                        onboardingDismissDialog3 = (OnboardingDismissDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, OnboardingDismissDialog$$serializer.INSTANCE, onboardingDismissDialog3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i17 |= i14;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        stressGraphingCardModel6 = (StressGraphingCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, StressGraphingCardModel$$serializer.INSTANCE, stressGraphingCardModel6);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i17 |= i14;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        stressTrend3 = (StressTrend) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 18, StressTrend$$serializer.INSTANCE, stressTrend3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i17 |= i14;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        stressDateSelector3 = (StressDateSelector) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, StressDateSelector$$serializer.INSTANCE, stressDateSelector3);
                        i14 = 524288;
                        i17 |= i14;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case 20:
                        stressGraphingCardModel7 = (StressGraphingCardModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, StressGraphingCardModel$$serializer.INSTANCE, stressGraphingCardModel7);
                        i14 = 1048576;
                        i17 |= i14;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case 21:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, (InterfaceC37137b) interfaceC23462hArr[21].getValue(), list3);
                        i14 = 2097152;
                        i17 |= i14;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        stepperComponentModel3 = (StepperComponentModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 22, StepperComponentModel$$serializer.INSTANCE, stepperComponentModel3);
                        i15 = 4194304;
                        i17 |= i15;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        metaData2 = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 23, MetaData$$serializer.INSTANCE, metaData2);
                        i15 = 8388608;
                        i17 |= i15;
                        articleTileCarouselModel9 = articleTileCarouselModel11;
                        articleTileCarouselModel8 = articleTileCarouselModel8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            ArticleTileCarouselModel articleTileCarouselModel12 = articleTileCarouselModel9;
            ArticleTileCarouselModel articleTileCarouselModel13 = articleTileCarouselModel8;
            stressGraphingCardModel = stressGraphingCardModel8;
            loadingData = loadingData3;
            articleTileCarouselModel = articleTileCarouselModel13;
            metaData = metaData2;
            list = list3;
            articleTileCarouselModel2 = articleTileCarouselModel10;
            stepperComponentModel = stepperComponentModel3;
            stressGraphingCardModel2 = stressGraphingCardModel7;
            stressDateSelector = stressDateSelector3;
            stressTrend = stressTrend3;
            i13 = i17;
            pendingActivityDialogue = pendingActivityDialogue3;
            onboardingDismissDialog = onboardingDismissDialog3;
            stressState = stressState3;
            stressMonitorMeterDto = stressMonitorMeterDto3;
            stressMonitorVow = stressMonitorVow3;
            whoopCoachVowModel = whoopCoachVowModel3;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = str5;
            articleTileCarouselModel3 = articleTileCarouselModel12;
            stressGraphingCardModel3 = stressGraphingCardModel6;
            z4 = zDecodeBooleanElement3;
            z13 = zDecodeBooleanElement4;
        }
        StressGraphingCardModel stressGraphingCardModel9 = stressGraphingCardModel;
        String str7 = strDecodeStringElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StressMonitorDto(i13, str7, loadingData, stressState, z4, stressMonitorMeterDto, stressMonitorVow, whoopCoachVowModel, stressGraphingCardModel9, str, str2, articleTileCarouselModel3, articleTileCarouselModel, articleTileCarouselModel2, z13, str3, pendingActivityDialogue, onboardingDismissDialog, stressGraphingCardModel3, stressTrend, stressDateSelector, stressGraphingCardModel2, list, stepperComponentModel, metaData, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StressMonitorDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StressMonitorDto.write$Self$stress_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
