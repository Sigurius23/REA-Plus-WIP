package com.whoop.data.remote.domain.dto;

import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SmartAlarmUserInfoDto$$serializer implements GeneratedSerializer<SmartAlarmUserInfoDto> {
    public static final SmartAlarmUserInfoDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SmartAlarmUserInfoDto$$serializer smartAlarmUserInfoDto$$serializer = new SmartAlarmUserInfoDto$$serializer();
        INSTANCE = smartAlarmUserInfoDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.SmartAlarmUserInfoDto", smartAlarmUserInfoDto$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("userId", false);
        pluginGeneratedSerialDescriptor.addElement("upperTimeBound", false);
        pluginGeneratedSerialDescriptor.addElement("lastTriggeredAt", false);
        pluginGeneratedSerialDescriptor.addElement("sleepScoreGoal", false);
        pluginGeneratedSerialDescriptor.addElement("recoveryScoreGoal", false);
        pluginGeneratedSerialDescriptor.addElement("weekly_plan_sleep_hours_goal", false);
        pluginGeneratedSerialDescriptor.addElement("enabled", false);
        pluginGeneratedSerialDescriptor.addElement(WeeklyPlanApiKt.GOAL, false);
        pluginGeneratedSerialDescriptor.addElement("windowMinutes", false);
        pluginGeneratedSerialDescriptor.addElement("scheduleEnabled", false);
        pluginGeneratedSerialDescriptor.addElement("dayOfWeek", false);
        pluginGeneratedSerialDescriptor.addElement("enrolled_weekly_plan", false);
        pluginGeneratedSerialDescriptor.addElement("weeklyPlanGoal", false);
        pluginGeneratedSerialDescriptor.addElement("timeZoneOffset", false);
        pluginGeneratedSerialDescriptor.addElement("alarmBounds", false);
        pluginGeneratedSerialDescriptor.addElement("optimizeSleep", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SmartAlarmUserInfoDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SmartAlarmUserInfoDto.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(intSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(intSerializer), booleanSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SmartAlarmUserInfoDto deserialize(InterfaceC40541d decoder) {
        int i13;
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        Boolean bool;
        DayOfWeekType dayOfWeekType;
        SmartAlarmGoalType smartAlarmGoalType;
        Integer num3;
        Integer num4;
        Boolean bool2;
        String str4;
        String str5;
        Integer num5;
        String str6;
        boolean z4;
        String str7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SmartAlarmUserInfoDto.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num6 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            Integer num7 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, intSerializer, null);
            Integer num8 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, intSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, booleanSerializer, null);
            SmartAlarmGoalType smartAlarmGoalType2 = (SmartAlarmGoalType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            Integer num9 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, intSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
            DayOfWeekType dayOfWeekType2 = (DayOfWeekType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, booleanSerializer, null);
            Integer num10 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, intSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            i13 = 65535;
            str2 = str13;
            num2 = num10;
            bool = bool4;
            str4 = str8;
            z4 = zDecodeBooleanElement;
            str6 = str11;
            bool2 = bool3;
            str = str10;
            num3 = num7;
            num4 = num9;
            num5 = num8;
            str5 = str9;
            str3 = str12;
            dayOfWeekType = dayOfWeekType2;
            num = num6;
            smartAlarmGoalType = smartAlarmGoalType2;
        } else {
            String str14 = null;
            i13 = 0;
            boolean zDecodeBooleanElement2 = false;
            int i14 = 7;
            boolean z13 = true;
            String str15 = null;
            Integer num11 = null;
            Integer num12 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            Boolean bool5 = null;
            DayOfWeekType dayOfWeekType3 = null;
            SmartAlarmGoalType smartAlarmGoalType3 = null;
            Integer num13 = null;
            Integer num14 = null;
            Boolean bool6 = null;
            Integer num15 = null;
            String str19 = null;
            while (z13) {
                String str20 = str18;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str20;
                        z13 = false;
                        str18 = str7;
                        num11 = num11;
                        str15 = str15;
                        i14 = 7;
                        break;
                    case 0:
                        str7 = str20;
                        num15 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, IntSerializer.INSTANCE, num15);
                        i13 |= 1;
                        str19 = str19;
                        str18 = str7;
                        num11 = num11;
                        str15 = str15;
                        i14 = 7;
                        break;
                    case 1:
                        str7 = str20;
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str19);
                        i13 |= 2;
                        str18 = str7;
                        num11 = num11;
                        str15 = str15;
                        i14 = 7;
                        break;
                    case 2:
                        str15 = str15;
                        num11 = num11;
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str20);
                        i13 |= 4;
                        num11 = num11;
                        str15 = str15;
                        i14 = 7;
                        break;
                    case 3:
                        num13 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, IntSerializer.INSTANCE, num13);
                        i13 |= 8;
                        str15 = str15;
                        str18 = str20;
                        i14 = 7;
                        break;
                    case 4:
                        num11 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, IntSerializer.INSTANCE, num11);
                        i13 |= 16;
                        str18 = str20;
                        num13 = num13;
                        i14 = 7;
                        break;
                    case 5:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str16);
                        i13 |= 32;
                        str18 = str20;
                        num13 = num13;
                        i14 = 7;
                        break;
                    case 6:
                        bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, BooleanSerializer.INSTANCE, bool6);
                        i13 |= 64;
                        str18 = str20;
                        num13 = num13;
                        i14 = 7;
                        break;
                    case 7:
                        smartAlarmGoalType3 = (SmartAlarmGoalType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), smartAlarmGoalType3);
                        i13 |= 128;
                        str18 = str20;
                        num13 = num13;
                        break;
                    case 8:
                        num14 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, IntSerializer.INSTANCE, num14);
                        i13 |= 256;
                        str18 = str20;
                        num13 = num13;
                        break;
                    case 9:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
                        i13 |= 512;
                        str18 = str20;
                        num13 = num13;
                        break;
                    case 10:
                        dayOfWeekType3 = (DayOfWeekType) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), dayOfWeekType3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str18 = str20;
                        num13 = num13;
                        break;
                    case 11:
                        bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, BooleanSerializer.INSTANCE, bool5);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str18 = str20;
                        num13 = num13;
                        break;
                    case 12:
                        num12 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, IntSerializer.INSTANCE, num12);
                        i13 |= 4096;
                        str18 = str20;
                        num13 = num13;
                        break;
                    case 13:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str15);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str18 = str20;
                        num13 = num13;
                        break;
                    case 14:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str17);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str18 = str20;
                        num13 = num13;
                        break;
                    case 15:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str14);
                        i13 |= 32768;
                        str18 = str20;
                        num13 = num13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num15;
            num2 = num12;
            str = str16;
            str2 = str14;
            str3 = str17;
            bool = bool5;
            dayOfWeekType = dayOfWeekType3;
            smartAlarmGoalType = smartAlarmGoalType3;
            num3 = num13;
            num4 = num14;
            bool2 = bool6;
            str4 = str19;
            str5 = str18;
            num5 = num11;
            str6 = str15;
            z4 = zDecodeBooleanElement2;
        }
        int i15 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SmartAlarmUserInfoDto(i15, num, str4, str5, num3, num5, str, bool2, smartAlarmGoalType, num4, z4, dayOfWeekType, bool, num2, str6, str3, str2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SmartAlarmUserInfoDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SmartAlarmUserInfoDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
