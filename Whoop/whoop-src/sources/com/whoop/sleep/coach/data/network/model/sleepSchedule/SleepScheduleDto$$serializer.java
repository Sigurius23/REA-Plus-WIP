package com.whoop.sleep.coach.data.network.model.sleepSchedule;

import com.whoop.sleep.coach.data.network.model.loading.ScheduleSaveDto;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSaveDto$$serializer;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSavingErrorDto;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSavingErrorDto$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SleepScheduleDto$$serializer implements GeneratedSerializer<SleepScheduleDto> {
    public static final int $stable;
    public static final SleepScheduleDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SleepScheduleDto$$serializer sleepScheduleDto$$serializer = new SleepScheduleDto$$serializer();
        INSTANCE = sleepScheduleDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.sleep.coach.data.network.model.sleepSchedule.SleepScheduleDto", sleepScheduleDto$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("allAlarmScheduleLabelDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("alarmScheduleList", false);
        pluginGeneratedSerialDescriptor.addElement("alarmScheduleFooter", false);
        pluginGeneratedSerialDescriptor.addElement("scheduleButtonComponent", false);
        pluginGeneratedSerialDescriptor.addElement("schedule_enabled", false);
        pluginGeneratedSerialDescriptor.addElement("shouldShowOverlay", false);
        pluginGeneratedSerialDescriptor.addElement("scheduleDisabledText", false);
        pluginGeneratedSerialDescriptor.addElement("deleteInProgressModal", true);
        pluginGeneratedSerialDescriptor.addElement("deletingSuccessModal", true);
        pluginGeneratedSerialDescriptor.addElement("deleteErrorModal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SleepScheduleDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SleepScheduleDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        ScheduleSaveDto$$serializer scheduleSaveDto$$serializer = ScheduleSaveDto$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC23462hArr[1].getValue(), AlarmScheduleFooterDto$$serializer.INSTANCE, ScheduleButtonComponentDto$$serializer.INSTANCE, booleanSerializer, booleanSerializer, stringSerializer, AbstractC38195a.m122336d(scheduleSaveDto$$serializer), AbstractC38195a.m122336d(scheduleSaveDto$$serializer), AbstractC38195a.m122336d(ScheduleSavingErrorDto$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SleepScheduleDto deserialize(InterfaceC40541d decoder) {
        boolean z4;
        ScheduleSavingErrorDto scheduleSavingErrorDto;
        ScheduleSaveDto scheduleSaveDto;
        ScheduleSaveDto scheduleSaveDto2;
        ScheduleButtonComponentDto scheduleButtonComponentDto;
        AlarmScheduleFooterDto alarmScheduleFooterDto;
        List list;
        boolean z13;
        int i13;
        String str;
        String str2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SleepScheduleDto.$childSerializers;
        int i14 = 9;
        int i15 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            AlarmScheduleFooterDto alarmScheduleFooterDto2 = (AlarmScheduleFooterDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, AlarmScheduleFooterDto$$serializer.INSTANCE, null);
            ScheduleButtonComponentDto scheduleButtonComponentDto2 = (ScheduleButtonComponentDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, ScheduleButtonComponentDto$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            ScheduleSaveDto$$serializer scheduleSaveDto$$serializer = ScheduleSaveDto$$serializer.INSTANCE;
            ScheduleSaveDto scheduleSaveDto3 = (ScheduleSaveDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, scheduleSaveDto$$serializer, null);
            ScheduleSaveDto scheduleSaveDto4 = (ScheduleSaveDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, scheduleSaveDto$$serializer, null);
            list = list2;
            str = strDecodeStringElement;
            scheduleSavingErrorDto = (ScheduleSavingErrorDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, ScheduleSavingErrorDto$$serializer.INSTANCE, null);
            scheduleSaveDto = scheduleSaveDto3;
            str2 = strDecodeStringElement2;
            z4 = zDecodeBooleanElement2;
            scheduleButtonComponentDto = scheduleButtonComponentDto2;
            scheduleSaveDto2 = scheduleSaveDto4;
            z13 = zDecodeBooleanElement;
            alarmScheduleFooterDto = alarmScheduleFooterDto2;
            i13 = 1023;
        } else {
            boolean z14 = true;
            boolean zDecodeBooleanElement3 = false;
            int i16 = 0;
            ScheduleSavingErrorDto scheduleSavingErrorDto2 = null;
            ScheduleSaveDto scheduleSaveDto5 = null;
            ScheduleSaveDto scheduleSaveDto6 = null;
            ScheduleButtonComponentDto scheduleButtonComponentDto3 = null;
            AlarmScheduleFooterDto alarmScheduleFooterDto3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement4 = false;
            List list3 = null;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        i14 = 9;
                        break;
                    case 0:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 1:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), list3);
                        i16 |= 2;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 2:
                        alarmScheduleFooterDto3 = (AlarmScheduleFooterDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, AlarmScheduleFooterDto$$serializer.INSTANCE, alarmScheduleFooterDto3);
                        i16 |= 4;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 3:
                        scheduleButtonComponentDto3 = (ScheduleButtonComponentDto) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, ScheduleButtonComponentDto$$serializer.INSTANCE, scheduleButtonComponentDto3);
                        i16 |= 8;
                        i14 = 9;
                        i15 = 7;
                        break;
                    case 4:
                        i16 |= 16;
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        break;
                    case 5:
                        i16 |= 32;
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        break;
                    case 6:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i16 |= 64;
                        break;
                    case 7:
                        scheduleSaveDto5 = (ScheduleSaveDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, ScheduleSaveDto$$serializer.INSTANCE, scheduleSaveDto5);
                        i16 |= 128;
                        break;
                    case 8:
                        scheduleSaveDto6 = (ScheduleSaveDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ScheduleSaveDto$$serializer.INSTANCE, scheduleSaveDto6);
                        i16 |= 256;
                        break;
                    case 9:
                        scheduleSavingErrorDto2 = (ScheduleSavingErrorDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, ScheduleSavingErrorDto$$serializer.INSTANCE, scheduleSavingErrorDto2);
                        i16 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement3;
            scheduleSavingErrorDto = scheduleSavingErrorDto2;
            scheduleSaveDto = scheduleSaveDto5;
            scheduleSaveDto2 = scheduleSaveDto6;
            scheduleButtonComponentDto = scheduleButtonComponentDto3;
            alarmScheduleFooterDto = alarmScheduleFooterDto3;
            list = list3;
            z13 = zDecodeBooleanElement4;
            i13 = i16;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SleepScheduleDto(i13, str, list, alarmScheduleFooterDto, scheduleButtonComponentDto, z13, z4, str2, scheduleSaveDto, scheduleSaveDto2, scheduleSavingErrorDto, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SleepScheduleDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SleepScheduleDto.write$Self$sleep_coach_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
