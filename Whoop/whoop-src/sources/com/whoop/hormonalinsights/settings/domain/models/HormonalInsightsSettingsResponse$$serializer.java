package com.whoop.hormonalinsights.settings.domain.models;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import java.util.List;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HormonalInsightsSettingsResponse$$serializer implements GeneratedSerializer<HormonalInsightsSettingsResponse> {
    public static final int $stable;
    public static final HormonalInsightsSettingsResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HormonalInsightsSettingsResponse$$serializer hormonalInsightsSettingsResponse$$serializer = new HormonalInsightsSettingsResponse$$serializer();
        INSTANCE = hormonalInsightsSettingsResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsSettingsResponse", hormonalInsightsSettingsResponse$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("navigationBarTitle", false);
        pluginGeneratedSerialDescriptor.addElement("tiles", false);
        pluginGeneratedSerialDescriptor.addElement("hormonalInsightsModeDrawer", false);
        pluginGeneratedSerialDescriptor.addElement("contraceptionTypeDrawer", false);
        pluginGeneratedSerialDescriptor.addElement("disablingDialog", false);
        pluginGeneratedSerialDescriptor.addElement("switchingModeDialog", false);
        pluginGeneratedSerialDescriptor.addElement("switchingContraceptionTypeDialog", false);
        pluginGeneratedSerialDescriptor.addElement("pregnancyDueDateDrawer", false);
        pluginGeneratedSerialDescriptor.addElement("previousPregnancies", false);
        pluginGeneratedSerialDescriptor.addElement("disableFertilityInsightsSurveyDrawer", false);
        pluginGeneratedSerialDescriptor.addElement("enableFertilityInsightsDestination", false);
        pluginGeneratedSerialDescriptor.addElement("enablePregnancyInsightsConfirmation", false);
        pluginGeneratedSerialDescriptor.addElement("goalsDrawer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HormonalInsightsSettingsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HormonalInsightsSettingsResponse.$childSerializers;
        HormonalInsightsBottomSheet$$serializer hormonalInsightsBottomSheet$$serializer = HormonalInsightsBottomSheet$$serializer.INSTANCE;
        HormonalInsightsConfirmDialog$$serializer hormonalInsightsConfirmDialog$$serializer = HormonalInsightsConfirmDialog$$serializer.INSTANCE;
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, interfaceC23462hArr[1].getValue(), hormonalInsightsBottomSheet$$serializer, AbstractC38195a.m122336d(hormonalInsightsBottomSheet$$serializer), AbstractC38195a.m122336d(hormonalInsightsConfirmDialog$$serializer), AbstractC38195a.m122336d(hormonalInsightsConfirmDialog$$serializer), AbstractC38195a.m122336d(hormonalInsightsConfirmDialog$$serializer), AbstractC38195a.m122336d(DueDateDrawer$$serializer.INSTANCE), AbstractC38195a.m122336d(PreviousPregnanciesModel$$serializer.INSTANCE), AbstractC38195a.m122336d(hormonalInsightsBottomSheet$$serializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue()), AbstractC38195a.m122336d(HormonalInsightsGoalsDrawer$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HormonalInsightsSettingsResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        HormonalInsightsBottomSheet hormonalInsightsBottomSheet;
        AnyModal anyModal;
        HormonalInsightsBottomSheet hormonalInsightsBottomSheet2;
        PreviousPregnanciesModel previousPregnanciesModel;
        DueDateDrawer dueDateDrawer;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog;
        C9598e c9598e;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog2;
        HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog3;
        List list;
        HormonalInsightsBottomSheet hormonalInsightsBottomSheet3;
        HormonalInsightsGoalsDrawer hormonalInsightsGoalsDrawer;
        String str;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HormonalInsightsSettingsResponse.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            HormonalInsightsBottomSheet$$serializer hormonalInsightsBottomSheet$$serializer = HormonalInsightsBottomSheet$$serializer.INSTANCE;
            HormonalInsightsBottomSheet hormonalInsightsBottomSheet4 = (HormonalInsightsBottomSheet) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, hormonalInsightsBottomSheet$$serializer, null);
            HormonalInsightsBottomSheet hormonalInsightsBottomSheet5 = (HormonalInsightsBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, hormonalInsightsBottomSheet$$serializer, null);
            HormonalInsightsConfirmDialog$$serializer hormonalInsightsConfirmDialog$$serializer = HormonalInsightsConfirmDialog$$serializer.INSTANCE;
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog4 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, hormonalInsightsConfirmDialog$$serializer, null);
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog5 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, hormonalInsightsConfirmDialog$$serializer, null);
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog6 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, hormonalInsightsConfirmDialog$$serializer, null);
            DueDateDrawer dueDateDrawer2 = (DueDateDrawer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, DueDateDrawer$$serializer.INSTANCE, null);
            PreviousPregnanciesModel previousPregnanciesModel2 = (PreviousPregnanciesModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, PreviousPregnanciesModel$$serializer.INSTANCE, null);
            HormonalInsightsBottomSheet hormonalInsightsBottomSheet6 = (HormonalInsightsBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, hormonalInsightsBottomSheet$$serializer, null);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            AnyModal anyModal2 = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            i13 = 8191;
            hormonalInsightsGoalsDrawer = (HormonalInsightsGoalsDrawer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, HormonalInsightsGoalsDrawer$$serializer.INSTANCE, null);
            str = strDecodeStringElement;
            list = list2;
            hormonalInsightsBottomSheet2 = hormonalInsightsBottomSheet6;
            dueDateDrawer = dueDateDrawer2;
            hormonalInsightsConfirmDialog2 = hormonalInsightsConfirmDialog6;
            hormonalInsightsConfirmDialog = hormonalInsightsConfirmDialog5;
            hormonalInsightsBottomSheet3 = hormonalInsightsBottomSheet5;
            previousPregnanciesModel = previousPregnanciesModel2;
            hormonalInsightsConfirmDialog3 = hormonalInsightsConfirmDialog4;
            hormonalInsightsBottomSheet = hormonalInsightsBottomSheet4;
            c9598e = c9598e2;
            anyModal = anyModal2;
        } else {
            HormonalInsightsGoalsDrawer hormonalInsightsGoalsDrawer2 = null;
            String strDecodeStringElement2 = null;
            AnyModal anyModal3 = null;
            HormonalInsightsBottomSheet hormonalInsightsBottomSheet7 = null;
            PreviousPregnanciesModel previousPregnanciesModel3 = null;
            DueDateDrawer dueDateDrawer3 = null;
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog7 = null;
            C9598e c9598e3 = null;
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog8 = null;
            HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog9 = null;
            List list3 = null;
            int i14 = 1;
            boolean z4 = true;
            i13 = 0;
            HormonalInsightsBottomSheet hormonalInsightsBottomSheet8 = null;
            HormonalInsightsBottomSheet hormonalInsightsBottomSheet9 = null;
            while (z4) {
                String str2 = strDecodeStringElement2;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        i14 = i14;
                        hormonalInsightsGoalsDrawer2 = hormonalInsightsGoalsDrawer2;
                        z4 = false;
                        strDecodeStringElement2 = str2;
                        break;
                    case 0:
                        i13 |= 1;
                        i14 = i14;
                        hormonalInsightsGoalsDrawer2 = hormonalInsightsGoalsDrawer2;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        break;
                    case 1:
                        List list4 = list3;
                        int i15 = i14;
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), list4);
                        i13 |= 2;
                        i14 = i15;
                        hormonalInsightsGoalsDrawer2 = hormonalInsightsGoalsDrawer2;
                        strDecodeStringElement2 = str2;
                        break;
                    case 2:
                        hormonalInsightsBottomSheet8 = (HormonalInsightsBottomSheet) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, HormonalInsightsBottomSheet$$serializer.INSTANCE, hormonalInsightsBottomSheet8);
                        i13 |= 4;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 3:
                        hormonalInsightsBottomSheet9 = (HormonalInsightsBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, HormonalInsightsBottomSheet$$serializer.INSTANCE, hormonalInsightsBottomSheet9);
                        i13 |= 8;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 4:
                        hormonalInsightsConfirmDialog9 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, HormonalInsightsConfirmDialog$$serializer.INSTANCE, hormonalInsightsConfirmDialog9);
                        i13 |= 16;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 5:
                        hormonalInsightsConfirmDialog7 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, HormonalInsightsConfirmDialog$$serializer.INSTANCE, hormonalInsightsConfirmDialog7);
                        i13 |= 32;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 6:
                        hormonalInsightsConfirmDialog8 = (HormonalInsightsConfirmDialog) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, HormonalInsightsConfirmDialog$$serializer.INSTANCE, hormonalInsightsConfirmDialog8);
                        i13 |= 64;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 7:
                        dueDateDrawer3 = (DueDateDrawer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, DueDateDrawer$$serializer.INSTANCE, dueDateDrawer3);
                        i13 |= 128;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 8:
                        previousPregnanciesModel3 = (PreviousPregnanciesModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, PreviousPregnanciesModel$$serializer.INSTANCE, previousPregnanciesModel3);
                        i13 |= 256;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 9:
                        hormonalInsightsBottomSheet7 = (HormonalInsightsBottomSheet) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, HormonalInsightsBottomSheet$$serializer.INSTANCE, hormonalInsightsBottomSheet7);
                        i13 |= 512;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 10:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), c9598e3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 11:
                        anyModal3 = (AnyModal) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), anyModal3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    case 12:
                        hormonalInsightsGoalsDrawer2 = (HormonalInsightsGoalsDrawer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, HormonalInsightsGoalsDrawer$$serializer.INSTANCE, hormonalInsightsGoalsDrawer2);
                        i13 |= 4096;
                        strDecodeStringElement2 = str2;
                        list3 = list3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            hormonalInsightsBottomSheet = hormonalInsightsBottomSheet8;
            anyModal = anyModal3;
            hormonalInsightsBottomSheet2 = hormonalInsightsBottomSheet7;
            previousPregnanciesModel = previousPregnanciesModel3;
            dueDateDrawer = dueDateDrawer3;
            hormonalInsightsConfirmDialog = hormonalInsightsConfirmDialog7;
            c9598e = c9598e3;
            hormonalInsightsConfirmDialog2 = hormonalInsightsConfirmDialog8;
            hormonalInsightsConfirmDialog3 = hormonalInsightsConfirmDialog9;
            list = list3;
            hormonalInsightsBottomSheet3 = hormonalInsightsBottomSheet9;
            hormonalInsightsGoalsDrawer = hormonalInsightsGoalsDrawer2;
            str = strDecodeStringElement2;
        }
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HormonalInsightsSettingsResponse(i16, str, list, hormonalInsightsBottomSheet, hormonalInsightsBottomSheet3, hormonalInsightsConfirmDialog3, hormonalInsightsConfirmDialog, hormonalInsightsConfirmDialog2, dueDateDrawer, previousPregnanciesModel, hormonalInsightsBottomSheet2, c9598e, anyModal, hormonalInsightsGoalsDrawer, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HormonalInsightsSettingsResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HormonalInsightsSettingsResponse.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
