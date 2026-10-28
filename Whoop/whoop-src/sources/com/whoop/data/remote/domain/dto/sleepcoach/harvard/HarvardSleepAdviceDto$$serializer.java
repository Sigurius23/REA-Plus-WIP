package com.whoop.data.remote.domain.dto.sleepcoach.harvard;

import ad3.C0771n;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/sleepcoach/harvard/HarvardSleepAdviceDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HarvardSleepAdviceDto$$serializer implements GeneratedSerializer<HarvardSleepAdviceDto> {
    public static final HarvardSleepAdviceDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HarvardSleepAdviceDto$$serializer harvardSleepAdviceDto$$serializer = new HarvardSleepAdviceDto$$serializer();
        INSTANCE = harvardSleepAdviceDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.sleepcoach.harvard.HarvardSleepAdviceDto", harvardSleepAdviceDto$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("turnOffAllModal", false);
        pluginGeneratedSerialDescriptor.addElement("turnOffScheduleModal", false);
        pluginGeneratedSerialDescriptor.addElement("chipLabelTextDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("alarmScheduleState", false);
        pluginGeneratedSerialDescriptor.addElement("nextScheduleDayLabel", false);
        pluginGeneratedSerialDescriptor.addElement("menstrualCoachEnabled", false);
        pluginGeneratedSerialDescriptor.addElement("menstrualCoachingDetails", false);
        pluginGeneratedSerialDescriptor.addElement("needBreakdown", false);
        pluginGeneratedSerialDescriptor.addElement("needBreakdownFormatted", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedTimeInBedFormatted", false);
        pluginGeneratedSerialDescriptor.addElement("eligibleForSmartAlarms", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HarvardSleepAdviceDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HarvardSleepAdviceDto.$childSerializers;
        SleepCoachInteractionModal$$serializer sleepCoachInteractionModal$$serializer = SleepCoachInteractionModal$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{sleepCoachInteractionModal$$serializer, sleepCoachInteractionModal$$serializer, stringSerializer, interfaceC23462hArr[3].getValue(), AbstractC38195a.m122336d(stringSerializer), booleanSerializer, AbstractC38195a.m122336d(C0771n.f2806a), NeedBreakdown$$serializer.INSTANCE, NeedBreakdownFormatted$$serializer.INSTANCE, RecommendedTimeInBedFormatted$$serializer.INSTANCE, booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HarvardSleepAdviceDto deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        SleepCoachInteractionModal sleepCoachInteractionModal;
        SleepCoachInteractionModal sleepCoachInteractionModal2;
        RecommendedTimeInBedFormatted recommendedTimeInBedFormatted;
        NeedBreakdownFormatted needBreakdownFormatted;
        NeedBreakdown needBreakdown;
        String str;
        JsonElement jsonElement;
        AlarmScheduleState alarmScheduleState;
        int i13;
        boolean z4;
        String str2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HarvardSleepAdviceDto.$childSerializers;
        int i14 = 10;
        int i15 = 9;
        int i16 = 8;
        int i17 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            SleepCoachInteractionModal$$serializer sleepCoachInteractionModal$$serializer = SleepCoachInteractionModal$$serializer.INSTANCE;
            SleepCoachInteractionModal sleepCoachInteractionModal3 = (SleepCoachInteractionModal) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, sleepCoachInteractionModal$$serializer, null);
            SleepCoachInteractionModal sleepCoachInteractionModal4 = (SleepCoachInteractionModal) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, sleepCoachInteractionModal$$serializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            AlarmScheduleState alarmScheduleState2 = (AlarmScheduleState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            JsonElement jsonElement2 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, C0771n.f2806a, null);
            NeedBreakdown needBreakdown2 = (NeedBreakdown) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, NeedBreakdown$$serializer.INSTANCE, null);
            NeedBreakdownFormatted needBreakdownFormatted2 = (NeedBreakdownFormatted) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, NeedBreakdownFormatted$$serializer.INSTANCE, null);
            RecommendedTimeInBedFormatted recommendedTimeInBedFormatted2 = (RecommendedTimeInBedFormatted) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, RecommendedTimeInBedFormatted$$serializer.INSTANCE, null);
            alarmScheduleState = alarmScheduleState2;
            sleepCoachInteractionModal = sleepCoachInteractionModal4;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
            recommendedTimeInBedFormatted = recommendedTimeInBedFormatted2;
            needBreakdown = needBreakdown2;
            jsonElement = jsonElement2;
            z4 = zDecodeBooleanElement2;
            needBreakdownFormatted = needBreakdownFormatted2;
            str = str3;
            str2 = strDecodeStringElement;
            i13 = 2047;
            sleepCoachInteractionModal2 = sleepCoachInteractionModal3;
        } else {
            int i18 = 3;
            boolean z13 = true;
            boolean zDecodeBooleanElement3 = false;
            RecommendedTimeInBedFormatted recommendedTimeInBedFormatted3 = null;
            NeedBreakdownFormatted needBreakdownFormatted3 = null;
            NeedBreakdown needBreakdown3 = null;
            String str4 = null;
            JsonElement jsonElement3 = null;
            AlarmScheduleState alarmScheduleState3 = null;
            SleepCoachInteractionModal sleepCoachInteractionModal5 = null;
            SleepCoachInteractionModal sleepCoachInteractionModal6 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i15 = 9;
                        i16 = 8;
                        i18 = 3;
                        break;
                    case 0:
                        sleepCoachInteractionModal5 = (SleepCoachInteractionModal) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, SleepCoachInteractionModal$$serializer.INSTANCE, sleepCoachInteractionModal5);
                        i17 |= 1;
                        i14 = 10;
                        i15 = 9;
                        i16 = 8;
                        i18 = 3;
                        break;
                    case 1:
                        i17 |= 2;
                        sleepCoachInteractionModal6 = (SleepCoachInteractionModal) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, SleepCoachInteractionModal$$serializer.INSTANCE, sleepCoachInteractionModal6);
                        i14 = 10;
                        i15 = 9;
                        i18 = 3;
                        break;
                    case 2:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 3:
                        alarmScheduleState3 = (AlarmScheduleState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), alarmScheduleState3);
                        i17 |= 8;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 4:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str4);
                        i17 |= 16;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 5:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i17 |= 32;
                        i14 = 10;
                        break;
                    case 6:
                        jsonElement3 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, C0771n.f2806a, jsonElement3);
                        i17 |= 64;
                        i14 = 10;
                        break;
                    case 7:
                        needBreakdown3 = (NeedBreakdown) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, NeedBreakdown$$serializer.INSTANCE, needBreakdown3);
                        i17 |= 128;
                        i14 = 10;
                        break;
                    case 8:
                        needBreakdownFormatted3 = (NeedBreakdownFormatted) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, NeedBreakdownFormatted$$serializer.INSTANCE, needBreakdownFormatted3);
                        i17 |= 256;
                        break;
                    case 9:
                        recommendedTimeInBedFormatted3 = (RecommendedTimeInBedFormatted) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, RecommendedTimeInBedFormatted$$serializer.INSTANCE, recommendedTimeInBedFormatted3);
                        i17 |= 512;
                        break;
                    case 10:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i14);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            sleepCoachInteractionModal = sleepCoachInteractionModal6;
            sleepCoachInteractionModal2 = sleepCoachInteractionModal5;
            recommendedTimeInBedFormatted = recommendedTimeInBedFormatted3;
            needBreakdownFormatted = needBreakdownFormatted3;
            needBreakdown = needBreakdown3;
            str = str4;
            jsonElement = jsonElement3;
            alarmScheduleState = alarmScheduleState3;
            i13 = i17;
            z4 = zDecodeBooleanElement4;
            str2 = strDecodeStringElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HarvardSleepAdviceDto(i13, sleepCoachInteractionModal2, sleepCoachInteractionModal, str2, alarmScheduleState, str, z4, jsonElement, needBreakdown, needBreakdownFormatted, recommendedTimeInBedFormatted, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HarvardSleepAdviceDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HarvardSleepAdviceDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
