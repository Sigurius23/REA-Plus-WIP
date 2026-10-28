package com.whoop.sleep.coach.data.network.model.sleepSchedule;

import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.AlarmModeValue;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AlarmScheduleListDto$$serializer implements GeneratedSerializer<AlarmScheduleListDto> {
    public static final int $stable;
    public static final AlarmScheduleListDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AlarmScheduleListDto$$serializer alarmScheduleListDto$$serializer = new AlarmScheduleListDto$$serializer();
        INSTANCE = alarmScheduleListDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.sleep.coach.data.network.model.sleepSchedule.AlarmScheduleListDto", alarmScheduleListDto$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("alarmMode", false);
        pluginGeneratedSerialDescriptor.addElement("days_scheduled_label_display", false);
        pluginGeneratedSerialDescriptor.addElement("alarmModeLabelDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("editLabelDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("deleteLabelDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("latestWakeTime", false);
        pluginGeneratedSerialDescriptor.addElement("alarmOn", false);
        pluginGeneratedSerialDescriptor.addElement("scheduled_days", false);
        pluginGeneratedSerialDescriptor.addElement("scheduleId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AlarmScheduleListDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = AlarmScheduleListDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC23462hArr[0].getValue(), interfaceC23462hArr[1].getValue(), stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, interfaceC23462hArr[7].getValue(), stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AlarmScheduleListDto deserialize(InterfaceC40541d decoder) {
        boolean z4;
        List list;
        int i13;
        AlarmModeValue alarmModeValue;
        List list2;
        String str;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = AlarmScheduleListDto.$childSerializers;
        int i14 = 6;
        int i15 = 1;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            AlarmModeValue alarmModeValue2 = (AlarmModeValue) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            alarmModeValue = alarmModeValue2;
            z4 = zDecodeBooleanElement;
            str4 = strDecodeStringElement5;
            str2 = strDecodeStringElement3;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            str3 = strDecodeStringElement4;
            str = strDecodeStringElement2;
            i13 = 511;
            list2 = list3;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            AlarmModeValue alarmModeValue3 = null;
            List list4 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            int i16 = 0;
            List list5 = null;
            while (z13) {
                int i17 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 6;
                        i15 = 1;
                        break;
                    case 0:
                        alarmModeValue3 = (AlarmModeValue) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), alarmModeValue3);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 1;
                        break;
                    case 1:
                        list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list4);
                        i16 |= 2;
                        i15 = i17;
                        i14 = 6;
                        break;
                    case 2:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i15 = i17;
                        break;
                    case 3:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i15 = i17;
                        break;
                    case 4:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        i15 = i17;
                        break;
                    case 5:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i15 = i17;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i14);
                        i16 |= 64;
                        i15 = i17;
                        break;
                    case 7:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), list5);
                        i16 |= 128;
                        i15 = i17;
                        break;
                    case 8:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i16 |= 256;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            list = list5;
            i13 = i16;
            alarmModeValue = alarmModeValue3;
            list2 = list4;
            str = strDecodeStringElement6;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            strDecodeStringElement = strDecodeStringElement10;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AlarmScheduleListDto(i13, alarmModeValue, list2, str, str2, str3, str4, z4, list, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AlarmScheduleListDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AlarmScheduleListDto.write$Self$sleep_coach_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
