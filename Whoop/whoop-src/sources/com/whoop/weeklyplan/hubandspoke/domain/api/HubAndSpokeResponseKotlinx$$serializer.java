package com.whoop.weeklyplan.hubandspoke.domain.api;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverrideV2;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverrideV2$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HubAndSpokeResponseKotlinx$$serializer implements GeneratedSerializer<HubAndSpokeResponseKotlinx> {
    public static final int $stable;
    public static final HubAndSpokeResponseKotlinx$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HubAndSpokeResponseKotlinx$$serializer hubAndSpokeResponseKotlinx$$serializer = new HubAndSpokeResponseKotlinx$$serializer();
        INSTANCE = hubAndSpokeResponseKotlinx$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponseKotlinx", hubAndSpokeResponseKotlinx$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("planId", false);
        pluginGeneratedSerialDescriptor.addElement("currentPlanTitle", false);
        pluginGeneratedSerialDescriptor.addElement("navigationTitle", false);
        pluginGeneratedSerialDescriptor.addElement("headerDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("headerImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("startPlanButtonText", false);
        pluginGeneratedSerialDescriptor.addElement("initialSelection", false);
        pluginGeneratedSerialDescriptor.addElement("metricSection", false);
        pluginGeneratedSerialDescriptor.addElement("behaviorSection", false);
        pluginGeneratedSerialDescriptor.addElement("activitiesSection", false);
        pluginGeneratedSerialDescriptor.addElement("metricDetails", false);
        pluginGeneratedSerialDescriptor.addElement("metricScreen", false);
        pluginGeneratedSerialDescriptor.addElement("goalScreens", false);
        pluginGeneratedSerialDescriptor.addElement("endPlanButtonText", false);
        pluginGeneratedSerialDescriptor.addElement("endPlanDialog", false);
        pluginGeneratedSerialDescriptor.addElement("unsavedChangesDialog", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubAndSpokeResponseKotlinx$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HubAndSpokeResponseKotlinx.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        SmartAlarmOverrideV2$$serializer smartAlarmOverrideV2$$serializer = SmartAlarmOverrideV2$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, InitialSelectionKotlinx$$serializer.INSTANCE, MetricSectionKotlinx$$serializer.INSTANCE, BehaviorSectionKotlinx$$serializer.INSTANCE, ActivitiesSectionKotlinx$$serializer.INSTANCE, interfaceC23462hArr[11].getValue(), MetricScreenKotlinx$$serializer.INSTANCE, interfaceC23462hArr[13].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(smartAlarmOverrideV2$$serializer), AbstractC38195a.m122336d(smartAlarmOverrideV2$$serializer), AbstractC38195a.m122336d(MetaDataKotlinx$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HubAndSpokeResponseKotlinx deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        InitialSelectionKotlinx initialSelectionKotlinx;
        String str2;
        MetaDataKotlinx metaDataKotlinx;
        SmartAlarmOverrideV2 smartAlarmOverrideV2;
        List list;
        MetricScreenKotlinx metricScreenKotlinx;
        List list2;
        BehaviorSectionKotlinx behaviorSectionKotlinx;
        MetricSectionKotlinx metricSectionKotlinx;
        String str3;
        String str4;
        String str5;
        String str6;
        ActivitiesSectionKotlinx activitiesSectionKotlinx;
        SmartAlarmOverrideV2 smartAlarmOverrideV3;
        String str7;
        String str8;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HubAndSpokeResponseKotlinx.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            InitialSelectionKotlinx initialSelectionKotlinx2 = (InitialSelectionKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, InitialSelectionKotlinx$$serializer.INSTANCE, null);
            MetricSectionKotlinx metricSectionKotlinx2 = (MetricSectionKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, MetricSectionKotlinx$$serializer.INSTANCE, null);
            BehaviorSectionKotlinx behaviorSectionKotlinx2 = (BehaviorSectionKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, BehaviorSectionKotlinx$$serializer.INSTANCE, null);
            ActivitiesSectionKotlinx activitiesSectionKotlinx2 = (ActivitiesSectionKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, ActivitiesSectionKotlinx$$serializer.INSTANCE, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            MetricScreenKotlinx metricScreenKotlinx2 = (MetricScreenKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, MetricScreenKotlinx$$serializer.INSTANCE, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            SmartAlarmOverrideV2$$serializer smartAlarmOverrideV2$$serializer = SmartAlarmOverrideV2$$serializer.INSTANCE;
            SmartAlarmOverrideV2 smartAlarmOverrideV4 = (SmartAlarmOverrideV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, smartAlarmOverrideV2$$serializer, null);
            SmartAlarmOverrideV2 smartAlarmOverrideV5 = (SmartAlarmOverrideV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, smartAlarmOverrideV2$$serializer, null);
            i13 = 262143;
            metaDataKotlinx = (MetaDataKotlinx) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, MetaDataKotlinx$$serializer.INSTANCE, null);
            str7 = strDecodeStringElement;
            str2 = str10;
            str = str9;
            str3 = str11;
            initialSelectionKotlinx = initialSelectionKotlinx2;
            behaviorSectionKotlinx = behaviorSectionKotlinx2;
            metricSectionKotlinx = metricSectionKotlinx2;
            str6 = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
            str4 = strDecodeStringElement3;
            str8 = strDecodeStringElement2;
            smartAlarmOverrideV3 = smartAlarmOverrideV5;
            smartAlarmOverrideV2 = smartAlarmOverrideV4;
            list = list4;
            metricScreenKotlinx = metricScreenKotlinx2;
            list2 = list3;
            activitiesSectionKotlinx = activitiesSectionKotlinx2;
        } else {
            boolean z4 = true;
            SmartAlarmOverrideV2 smartAlarmOverrideV6 = null;
            String str12 = null;
            ActivitiesSectionKotlinx activitiesSectionKotlinx3 = null;
            InitialSelectionKotlinx initialSelectionKotlinx3 = null;
            MetaDataKotlinx metaDataKotlinx2 = null;
            SmartAlarmOverrideV2 smartAlarmOverrideV7 = null;
            List list5 = null;
            MetricScreenKotlinx metricScreenKotlinx3 = null;
            List list6 = null;
            BehaviorSectionKotlinx behaviorSectionKotlinx3 = null;
            MetricSectionKotlinx metricSectionKotlinx3 = null;
            String str13 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            i13 = 0;
            String str14 = null;
            while (z4) {
                String str15 = str12;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        str12 = str15;
                        z4 = false;
                        activitiesSectionKotlinx3 = activitiesSectionKotlinx3;
                        smartAlarmOverrideV6 = smartAlarmOverrideV6;
                        break;
                    case 0:
                        str12 = str15;
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i13 |= 1;
                        activitiesSectionKotlinx3 = activitiesSectionKotlinx3;
                        smartAlarmOverrideV6 = smartAlarmOverrideV6;
                        break;
                    case 1:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str15);
                        i13 |= 2;
                        activitiesSectionKotlinx3 = activitiesSectionKotlinx3;
                        smartAlarmOverrideV6 = smartAlarmOverrideV6;
                        break;
                    case 2:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        smartAlarmOverrideV6 = smartAlarmOverrideV6;
                        str12 = str15;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        smartAlarmOverrideV6 = smartAlarmOverrideV6;
                        str12 = str15;
                        break;
                    case 4:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str14);
                        i13 |= 16;
                        smartAlarmOverrideV6 = smartAlarmOverrideV6;
                        str12 = str15;
                        break;
                    case 5:
                        str14 = str14;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 6:
                        str14 = str14;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i13 |= 64;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 7:
                        str14 = str14;
                        initialSelectionKotlinx3 = (InitialSelectionKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, InitialSelectionKotlinx$$serializer.INSTANCE, initialSelectionKotlinx3);
                        i13 |= 128;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 8:
                        str14 = str14;
                        metricSectionKotlinx3 = (MetricSectionKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, MetricSectionKotlinx$$serializer.INSTANCE, metricSectionKotlinx3);
                        i13 |= 256;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 9:
                        str14 = str14;
                        behaviorSectionKotlinx3 = (BehaviorSectionKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, BehaviorSectionKotlinx$$serializer.INSTANCE, behaviorSectionKotlinx3);
                        i13 |= 512;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 10:
                        str14 = str14;
                        activitiesSectionKotlinx3 = (ActivitiesSectionKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, ActivitiesSectionKotlinx$$serializer.INSTANCE, activitiesSectionKotlinx3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 11:
                        str14 = str14;
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), list6);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 12:
                        str14 = str14;
                        metricScreenKotlinx3 = (MetricScreenKotlinx) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, MetricScreenKotlinx$$serializer.INSTANCE, metricScreenKotlinx3);
                        i13 |= 4096;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 13:
                        str14 = str14;
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), list5);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 14:
                        str14 = str14;
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str13);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 15:
                        smartAlarmOverrideV7 = (SmartAlarmOverrideV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, SmartAlarmOverrideV2$$serializer.INSTANCE, smartAlarmOverrideV7);
                        i14 = 32768;
                        i13 |= i14;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case 16:
                        smartAlarmOverrideV6 = (SmartAlarmOverrideV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, SmartAlarmOverrideV2$$serializer.INSTANCE, smartAlarmOverrideV6);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i13 |= i14;
                        str12 = str15;
                        str14 = str14;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        metaDataKotlinx2 = (MetaDataKotlinx) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 17, MetaDataKotlinx$$serializer.INSTANCE, metaDataKotlinx2);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i13 |= i14;
                        str12 = str15;
                        str14 = str14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str12;
            initialSelectionKotlinx = initialSelectionKotlinx3;
            str2 = str14;
            metaDataKotlinx = metaDataKotlinx2;
            smartAlarmOverrideV2 = smartAlarmOverrideV7;
            list = list5;
            metricScreenKotlinx = metricScreenKotlinx3;
            list2 = list6;
            behaviorSectionKotlinx = behaviorSectionKotlinx3;
            metricSectionKotlinx = metricSectionKotlinx3;
            str3 = str13;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            activitiesSectionKotlinx = activitiesSectionKotlinx3;
            smartAlarmOverrideV3 = smartAlarmOverrideV6;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
        }
        int i15 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HubAndSpokeResponseKotlinx(i15, str7, str, str8, str4, str2, str5, str6, initialSelectionKotlinx, metricSectionKotlinx, behaviorSectionKotlinx, activitiesSectionKotlinx, list2, metricScreenKotlinx, list, str3, smartAlarmOverrideV2, smartAlarmOverrideV3, metaDataKotlinx, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HubAndSpokeResponseKotlinx value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HubAndSpokeResponseKotlinx.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
