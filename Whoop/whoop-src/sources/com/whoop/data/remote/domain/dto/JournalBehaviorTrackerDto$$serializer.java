package com.whoop.data.remote.domain.dto;

import androidx.core.app.NotificationCompat;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class JournalBehaviorTrackerDto$$serializer implements GeneratedSerializer<JournalBehaviorTrackerDto> {
    public static final JournalBehaviorTrackerDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        JournalBehaviorTrackerDto$$serializer journalBehaviorTrackerDto$$serializer = new JournalBehaviorTrackerDto$$serializer();
        INSTANCE = journalBehaviorTrackerDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.JournalBehaviorTrackerDto", journalBehaviorTrackerDto$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("questionText", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, false);
        pluginGeneratedSerialDescriptor.addElement("sticky", false);
        pluginGeneratedSerialDescriptor.addElement("magnitude", false);
        pluginGeneratedSerialDescriptor.addElement("category", false);
        pluginGeneratedSerialDescriptor.addElement("deprecated", false);
        pluginGeneratedSerialDescriptor.addElement("createdAt", false);
        pluginGeneratedSerialDescriptor.addElement("timeLabel", false);
        pluginGeneratedSerialDescriptor.addElement("updatedAt", false);
        pluginGeneratedSerialDescriptor.addElement("timeContextLabel", false);
        pluginGeneratedSerialDescriptor.addElement("questionType", false);
        pluginGeneratedSerialDescriptor.addElement("weeklyPlanGoal", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JournalBehaviorTrackerDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(IntSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(booleanSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d(JournalMagnitudeDto$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d9 = AbstractC38195a.m122336d(booleanSerializer);
        InterfaceC37138c interfaceC37138cM122336d10 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d11 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d12 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d13 = AbstractC38195a.m122336d(WeeklyPlanGoalDto$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d14 = AbstractC38195a.m122336d(BehaviorTrackerDestinationDto$$serializer.INSTANCE);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7, interfaceC37138cM122336d8, interfaceC37138cM122336d9, doubleSerializer, interfaceC37138cM122336d10, doubleSerializer, interfaceC37138cM122336d11, interfaceC37138cM122336d12, interfaceC37138cM122336d13, interfaceC37138cM122336d14};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final JournalBehaviorTrackerDto deserialize(InterfaceC40541d decoder) {
        int i13;
        Integer num;
        String str;
        String str2;
        String str3;
        WeeklyPlanGoalDto weeklyPlanGoalDto;
        String str4;
        String str5;
        Boolean bool;
        JournalMagnitudeDto journalMagnitudeDto;
        String str6;
        String str7;
        String str8;
        Boolean bool2;
        BehaviorTrackerDestinationDto behaviorTrackerDestinationDto;
        double d3;
        double d14;
        String str9;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, IntSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, booleanSerializer, null);
            JournalMagnitudeDto journalMagnitudeDto2 = (JournalMagnitudeDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, JournalMagnitudeDto$$serializer.INSTANCE, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            Boolean bool4 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, booleanSerializer, null);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 9);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            double dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 11);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            WeeklyPlanGoalDto weeklyPlanGoalDto2 = (WeeklyPlanGoalDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, WeeklyPlanGoalDto$$serializer.INSTANCE, null);
            i13 = 65535;
            behaviorTrackerDestinationDto = (BehaviorTrackerDestinationDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, BehaviorTrackerDestinationDto$$serializer.INSTANCE, null);
            str3 = str11;
            str8 = str10;
            str6 = str17;
            bool = bool4;
            journalMagnitudeDto = journalMagnitudeDto2;
            str5 = str15;
            str7 = str14;
            str4 = str16;
            bool2 = bool3;
            str2 = str12;
            str = str13;
            weeklyPlanGoalDto = weeklyPlanGoalDto2;
            num = num2;
            d3 = dDecodeDoubleElement2;
            d14 = dDecodeDoubleElement;
        } else {
            boolean z4 = true;
            BehaviorTrackerDestinationDto behaviorTrackerDestinationDto2 = null;
            Boolean bool5 = null;
            String str18 = null;
            WeeklyPlanGoalDto weeklyPlanGoalDto3 = null;
            String str19 = null;
            String str20 = null;
            Boolean bool6 = null;
            JournalMagnitudeDto journalMagnitudeDto3 = null;
            String str21 = null;
            String str22 = null;
            Integer num3 = null;
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            i13 = 0;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            while (z4) {
                String str26 = str24;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str26;
                        z4 = false;
                        str24 = str9;
                        bool5 = bool5;
                        behaviorTrackerDestinationDto2 = behaviorTrackerDestinationDto2;
                        break;
                    case 0:
                        str9 = str26;
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, IntSerializer.INSTANCE, num3);
                        i13 |= 1;
                        str24 = str9;
                        bool5 = bool5;
                        behaviorTrackerDestinationDto2 = behaviorTrackerDestinationDto2;
                        break;
                    case 1:
                        behaviorTrackerDestinationDto2 = behaviorTrackerDestinationDto2;
                        bool5 = bool5;
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str26);
                        i13 |= 2;
                        bool5 = bool5;
                        behaviorTrackerDestinationDto2 = behaviorTrackerDestinationDto2;
                        break;
                    case 2:
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str25);
                        i13 |= 4;
                        behaviorTrackerDestinationDto2 = behaviorTrackerDestinationDto2;
                        str24 = str26;
                        break;
                    case 3:
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str23);
                        i13 |= 8;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 4:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str18);
                        i13 |= 16;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 5:
                        bool5 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, BooleanSerializer.INSTANCE, bool5);
                        i13 |= 32;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 6:
                        journalMagnitudeDto3 = (JournalMagnitudeDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, JournalMagnitudeDto$$serializer.INSTANCE, journalMagnitudeDto3);
                        i13 |= 64;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 7:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str22);
                        i13 |= 128;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 8:
                        bool6 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, BooleanSerializer.INSTANCE, bool6);
                        i13 |= 256;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 9:
                        dDecodeDoubleElement4 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 9);
                        i13 |= 512;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 10:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str20);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 11:
                        dDecodeDoubleElement3 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 11);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 12:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str19);
                        i13 |= 4096;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 13:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str21);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 14:
                        weeklyPlanGoalDto3 = (WeeklyPlanGoalDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, WeeklyPlanGoalDto$$serializer.INSTANCE, weeklyPlanGoalDto3);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str24 = str26;
                        str25 = str25;
                        break;
                    case 15:
                        behaviorTrackerDestinationDto2 = (BehaviorTrackerDestinationDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, BehaviorTrackerDestinationDto$$serializer.INSTANCE, behaviorTrackerDestinationDto2);
                        i13 |= 32768;
                        str24 = str26;
                        str25 = str25;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num3;
            str = str18;
            str2 = str23;
            str3 = str25;
            weeklyPlanGoalDto = weeklyPlanGoalDto3;
            str4 = str19;
            str5 = str20;
            bool = bool6;
            journalMagnitudeDto = journalMagnitudeDto3;
            str6 = str21;
            str7 = str22;
            str8 = str24;
            bool2 = bool5;
            behaviorTrackerDestinationDto = behaviorTrackerDestinationDto2;
            d3 = dDecodeDoubleElement3;
            d14 = dDecodeDoubleElement4;
        }
        int i14 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new JournalBehaviorTrackerDto(i14, num, str8, str3, str2, str, bool2, journalMagnitudeDto, str7, bool, d14, str5, d3, str4, str6, weeklyPlanGoalDto, behaviorTrackerDestinationDto, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, JournalBehaviorTrackerDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        JournalBehaviorTrackerDto.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
