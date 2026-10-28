package com.whoop.hormonalinsights.pregnancyinsights.domain.models;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class PregnancyInsightsResponse$$serializer implements GeneratedSerializer<PregnancyInsightsResponse> {
    public static final int $stable;
    public static final PregnancyInsightsResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        PregnancyInsightsResponse$$serializer pregnancyInsightsResponse$$serializer = new PregnancyInsightsResponse$$serializer();
        INSTANCE = pregnancyInsightsResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsResponse", pregnancyInsightsResponse$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("pregnancyId", false);
        pluginGeneratedSerialDescriptor.addElement("navigationTitle", false);
        pluginGeneratedSerialDescriptor.addElement("datePicker", false);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("congratulationsHeader", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("buttons", false);
        pluginGeneratedSerialDescriptor.addElement("segmentedControlDisplays", false);
        pluginGeneratedSerialDescriptor.addElement("selectedButtonId", false);
        pluginGeneratedSerialDescriptor.addElement("segmentedControlDisplayId", false);
        pluginGeneratedSerialDescriptor.addElement("currentTrimesterGraphs", false);
        pluginGeneratedSerialDescriptor.addElement("overviewGraphs", false);
        pluginGeneratedSerialDescriptor.addElement("currentTrimesterVows", false);
        pluginGeneratedSerialDescriptor.addElement("overviewVows", false);
        pluginGeneratedSerialDescriptor.addElement("belowGraphContent", false);
        pluginGeneratedSerialDescriptor.addElement("bottomSheet", false);
        pluginGeneratedSerialDescriptor.addElement("haveYouDeliveredDialog", false);
        pluginGeneratedSerialDescriptor.addElement("deletePregnancyDialog", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PregnancyInsightsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = PregnancyInsightsResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(DateSelectorModel$$serializer.INSTANCE), AbstractC38195a.m122336d(PregnancyHeader$$serializer.INSTANCE), AbstractC38195a.m122336d(PregnancyCongratulationsHeader$$serializer.INSTANCE), interfaceC23462hArr[5].getValue(), interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), stringSerializer, interfaceC23462hArr[9].getValue(), interfaceC23462hArr[10].getValue(), interfaceC23462hArr[11].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[13].getValue()), interfaceC23462hArr[14].getValue(), AbstractC38195a.m122336d(BottomSheet$$serializer.INSTANCE), PregnancyInsightsDialogModel$$serializer.INSTANCE, AbstractC38195a.m122336d(DeletePregnancyDialog$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final PregnancyInsightsResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        Map map;
        GraphType graphType;
        Map map2;
        Map map3;
        List list;
        TrimesterStyle trimesterStyle;
        List list2;
        DeletePregnancyDialog deletePregnancyDialog;
        PregnancyInsightsDialogModel pregnancyInsightsDialogModel;
        Map map4;
        DateSelectorModel dateSelectorModel;
        PregnancyHeader pregnancyHeader;
        PregnancyCongratulationsHeader pregnancyCongratulationsHeader;
        BottomSheet bottomSheet;
        List list3;
        String str2;
        String str3;
        int i14;
        PregnancyCongratulationsHeader pregnancyCongratulationsHeader2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = PregnancyInsightsResponse.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, null);
            DateSelectorModel dateSelectorModel2 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, DateSelectorModel$$serializer.INSTANCE, null);
            PregnancyHeader pregnancyHeader2 = (PregnancyHeader) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, PregnancyHeader$$serializer.INSTANCE, null);
            PregnancyCongratulationsHeader pregnancyCongratulationsHeader3 = (PregnancyCongratulationsHeader) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, PregnancyCongratulationsHeader$$serializer.INSTANCE, null);
            TrimesterStyle trimesterStyle2 = (TrimesterStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            GraphType graphType2 = (GraphType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            Map map5 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            Map map6 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            Map map7 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            Map map8 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            List list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            BottomSheet bottomSheet2 = (BottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, BottomSheet$$serializer.INSTANCE, null);
            PregnancyInsightsDialogModel pregnancyInsightsDialogModel2 = (PregnancyInsightsDialogModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 16, PregnancyInsightsDialogModel$$serializer.INSTANCE, null);
            i13 = 262143;
            deletePregnancyDialog = (DeletePregnancyDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, DeletePregnancyDialog$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement;
            graphType = graphType2;
            list = list4;
            pregnancyHeader = pregnancyHeader2;
            list2 = list5;
            str2 = strDecodeStringElement2;
            pregnancyCongratulationsHeader = pregnancyCongratulationsHeader3;
            dateSelectorModel = dateSelectorModel2;
            trimesterStyle = trimesterStyle2;
            str = str4;
            map2 = map5;
            pregnancyInsightsDialogModel = pregnancyInsightsDialogModel2;
            bottomSheet = bottomSheet2;
            list3 = list6;
            map4 = map8;
            map = map7;
            map3 = map6;
        } else {
            int i15 = 9;
            int i16 = 6;
            int i17 = 7;
            int i18 = 5;
            boolean z4 = true;
            List list7 = null;
            BottomSheet bottomSheet3 = null;
            Map map9 = null;
            GraphType graphType3 = null;
            TrimesterStyle trimesterStyle3 = null;
            Map map10 = null;
            Map map11 = null;
            List list8 = null;
            PregnancyCongratulationsHeader pregnancyCongratulationsHeader4 = null;
            List list9 = null;
            DeletePregnancyDialog deletePregnancyDialog2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str5 = null;
            DateSelectorModel dateSelectorModel3 = null;
            PregnancyHeader pregnancyHeader3 = null;
            int i19 = 10;
            i13 = 0;
            PregnancyInsightsDialogModel pregnancyInsightsDialogModel3 = null;
            Map map12 = null;
            while (z4) {
                PregnancyCongratulationsHeader pregnancyCongratulationsHeader5 = pregnancyCongratulationsHeader4;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        pregnancyCongratulationsHeader2 = pregnancyCongratulationsHeader5;
                        z4 = false;
                        trimesterStyle3 = trimesterStyle3;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader2;
                        bottomSheet3 = bottomSheet3;
                        list7 = list7;
                        i18 = 5;
                        i16 = 6;
                        i17 = 7;
                        i15 = 9;
                        i19 = 10;
                        break;
                    case 0:
                        pregnancyCongratulationsHeader2 = pregnancyCongratulationsHeader5;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        trimesterStyle3 = trimesterStyle3;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader2;
                        bottomSheet3 = bottomSheet3;
                        list7 = list7;
                        i18 = 5;
                        i16 = 6;
                        i17 = 7;
                        i15 = 9;
                        i19 = 10;
                        break;
                    case 1:
                        list7 = list7;
                        bottomSheet3 = bottomSheet3;
                        pregnancyCongratulationsHeader2 = pregnancyCongratulationsHeader5;
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str5);
                        i13 |= 2;
                        trimesterStyle3 = trimesterStyle3;
                        dateSelectorModel3 = dateSelectorModel3;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader2;
                        bottomSheet3 = bottomSheet3;
                        list7 = list7;
                        i18 = 5;
                        i16 = 6;
                        i17 = 7;
                        i15 = 9;
                        i19 = 10;
                        break;
                    case 2:
                        list7 = list7;
                        bottomSheet3 = bottomSheet3;
                        pregnancyCongratulationsHeader2 = pregnancyCongratulationsHeader5;
                        dateSelectorModel3 = (DateSelectorModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, DateSelectorModel$$serializer.INSTANCE, dateSelectorModel3);
                        i13 |= 4;
                        trimesterStyle3 = trimesterStyle3;
                        pregnancyHeader3 = pregnancyHeader3;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader2;
                        bottomSheet3 = bottomSheet3;
                        list7 = list7;
                        i18 = 5;
                        i16 = 6;
                        i17 = 7;
                        i15 = 9;
                        i19 = 10;
                        break;
                    case 3:
                        pregnancyCongratulationsHeader2 = pregnancyCongratulationsHeader5;
                        pregnancyHeader3 = (PregnancyHeader) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, PregnancyHeader$$serializer.INSTANCE, pregnancyHeader3);
                        i13 |= 8;
                        trimesterStyle3 = trimesterStyle3;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader2;
                        bottomSheet3 = bottomSheet3;
                        list7 = list7;
                        i18 = 5;
                        i16 = 6;
                        i17 = 7;
                        i15 = 9;
                        i19 = 10;
                        break;
                    case 4:
                        i13 |= 16;
                        trimesterStyle3 = trimesterStyle3;
                        bottomSheet3 = bottomSheet3;
                        i16 = 6;
                        i17 = 7;
                        i15 = 9;
                        i19 = 10;
                        pregnancyCongratulationsHeader4 = (PregnancyCongratulationsHeader) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, PregnancyCongratulationsHeader$$serializer.INSTANCE, pregnancyCongratulationsHeader5);
                        list7 = list7;
                        i18 = 5;
                        break;
                    case 5:
                        int i24 = i18;
                        trimesterStyle3 = (TrimesterStyle) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), trimesterStyle3);
                        i13 |= 32;
                        i18 = i24;
                        list7 = list7;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        i16 = 6;
                        i17 = 7;
                        i15 = 9;
                        i19 = 10;
                        break;
                    case 6:
                        list8 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list8);
                        i13 |= 64;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        i17 = 7;
                        i15 = 9;
                        i19 = 10;
                        break;
                    case 7:
                        list9 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list9);
                        i13 |= 128;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        i15 = 9;
                        i19 = 10;
                        break;
                    case 8:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i13 |= 256;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        i19 = 10;
                        break;
                    case 9:
                        graphType3 = (GraphType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), graphType3);
                        i13 |= 512;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        i19 = 10;
                        break;
                    case 10:
                        trimesterStyle3 = trimesterStyle3;
                        map10 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), map10);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        break;
                    case 11:
                        trimesterStyle3 = trimesterStyle3;
                        map11 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), map11);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        break;
                    case 12:
                        trimesterStyle3 = trimesterStyle3;
                        map9 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), map9);
                        i13 |= 4096;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        break;
                    case 13:
                        trimesterStyle3 = trimesterStyle3;
                        map12 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), map12);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        break;
                    case 14:
                        trimesterStyle3 = trimesterStyle3;
                        list7 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), list7);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        break;
                    case 15:
                        bottomSheet3 = (BottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, BottomSheet$$serializer.INSTANCE, bottomSheet3);
                        i14 = 32768;
                        i13 |= i14;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        break;
                    case 16:
                        pregnancyInsightsDialogModel3 = (PregnancyInsightsDialogModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 16, PregnancyInsightsDialogModel$$serializer.INSTANCE, pregnancyInsightsDialogModel3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i13 |= i14;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        deletePregnancyDialog2 = (DeletePregnancyDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, DeletePregnancyDialog$$serializer.INSTANCE, deletePregnancyDialog2);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i13 |= i14;
                        pregnancyCongratulationsHeader4 = pregnancyCongratulationsHeader5;
                        trimesterStyle3 = trimesterStyle3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str5;
            map = map9;
            graphType = graphType3;
            map2 = map10;
            map3 = map11;
            list = list8;
            trimesterStyle = trimesterStyle3;
            list2 = list9;
            deletePregnancyDialog = deletePregnancyDialog2;
            pregnancyInsightsDialogModel = pregnancyInsightsDialogModel3;
            map4 = map12;
            dateSelectorModel = dateSelectorModel3;
            pregnancyHeader = pregnancyHeader3;
            pregnancyCongratulationsHeader = pregnancyCongratulationsHeader4;
            bottomSheet = bottomSheet3;
            list3 = list7;
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
        }
        int i25 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new PregnancyInsightsResponse(i25, str3, str, dateSelectorModel, pregnancyHeader, pregnancyCongratulationsHeader, trimesterStyle, list, list2, str2, graphType, map2, map3, map, map4, list3, bottomSheet, pregnancyInsightsDialogModel, deletePregnancyDialog, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, PregnancyInsightsResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        PregnancyInsightsResponse.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
