package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WeeklyPlanCustomizationScreenModelV2$$serializer implements GeneratedSerializer<WeeklyPlanCustomizationScreenModelV2> {
    public static final int $stable;
    public static final WeeklyPlanCustomizationScreenModelV2$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WeeklyPlanCustomizationScreenModelV2$$serializer weeklyPlanCustomizationScreenModelV2$$serializer = new WeeklyPlanCustomizationScreenModelV2$$serializer();
        INSTANCE = weeklyPlanCustomizationScreenModelV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModelV2", weeklyPlanCustomizationScreenModelV2$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement(WeeklyPlanApiKt.GOAL, false);
        pluginGeneratedSerialDescriptor.addElement("sliderContent", false);
        pluginGeneratedSerialDescriptor.addElement("toggleContent", false);
        pluginGeneratedSerialDescriptor.addElement("navigationTitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("navigationSubtitleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("buttonDescriptionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("continueButtonDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("skipButtonDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("smartAlarmOverride", false);
        pluginGeneratedSerialDescriptor.addElement("tipContent", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WeeklyPlanCustomizationScreenModelV2$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        GoalScreenContentSerializer goalScreenContentSerializer = GoalScreenContentSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{WeeklyPlanCustomizationScreenModelV2.$childSerializers[0].getValue(), AbstractC38195a.m122336d(goalScreenContentSerializer), AbstractC38195a.m122336d(goalScreenContentSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(SmartAlarmOverrideV2$$serializer.INSTANCE), AbstractC38195a.m122336d(TipContentV2$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WeeklyPlanCustomizationScreenModelV2 deserialize(InterfaceC40541d decoder) {
        GoalScreenContent goalScreenContent;
        TargetGoalType targetGoalType;
        TipContentV2 tipContentV2;
        SmartAlarmOverrideV2 smartAlarmOverrideV2;
        String str;
        String str2;
        int i13;
        String str3;
        String str4;
        String str5;
        GoalScreenContent goalScreenContent2;
        String str6;
        String str7;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WeeklyPlanCustomizationScreenModelV2.$childSerializers;
        TargetGoalType targetGoalType2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            TargetGoalType targetGoalType3 = (TargetGoalType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), null);
            GoalScreenContentSerializer goalScreenContentSerializer = GoalScreenContentSerializer.INSTANCE;
            GoalScreenContent goalScreenContent3 = (GoalScreenContent) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, goalScreenContentSerializer, null);
            GoalScreenContent goalScreenContent4 = (GoalScreenContent) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, goalScreenContentSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            SmartAlarmOverrideV2 smartAlarmOverrideV3 = (SmartAlarmOverrideV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, SmartAlarmOverrideV2$$serializer.INSTANCE, null);
            targetGoalType = targetGoalType3;
            goalScreenContent2 = goalScreenContent4;
            tipContentV2 = (TipContentV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, TipContentV2$$serializer.INSTANCE, null);
            smartAlarmOverrideV2 = smartAlarmOverrideV3;
            str = str12;
            str3 = str11;
            str2 = str10;
            str4 = str9;
            str6 = strDecodeStringElement;
            str7 = strDecodeStringElement2;
            str5 = str8;
            i13 = 4095;
            goalScreenContent = goalScreenContent3;
        } else {
            GoalScreenContent goalScreenContent5 = null;
            TipContentV2 tipContentV3 = null;
            SmartAlarmOverrideV2 smartAlarmOverrideV4 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean z4 = true;
            int i14 = 0;
            String str17 = null;
            GoalScreenContent goalScreenContent6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        targetGoalType2 = (TargetGoalType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, (InterfaceC37137b) interfaceC23462hArr[0].getValue(), targetGoalType2);
                        i14 |= 1;
                        break;
                    case 1:
                        goalScreenContent5 = (GoalScreenContent) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, GoalScreenContentSerializer.INSTANCE, goalScreenContent5);
                        i14 |= 2;
                        break;
                    case 2:
                        goalScreenContent6 = (GoalScreenContent) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, GoalScreenContentSerializer.INSTANCE, goalScreenContent6);
                        i14 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str17);
                        i14 |= 16;
                        break;
                    case 5:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str16);
                        i14 |= 32;
                        break;
                    case 6:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str14);
                        i14 |= 64;
                        break;
                    case 7:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str15);
                        i14 |= 128;
                        break;
                    case 8:
                        c3 = '\t';
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i14 |= 256;
                        break;
                    case 9:
                        c3 = '\t';
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str13);
                        i14 |= 512;
                        break;
                    case 10:
                        smartAlarmOverrideV4 = (SmartAlarmOverrideV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, SmartAlarmOverrideV2$$serializer.INSTANCE, smartAlarmOverrideV4);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    case 11:
                        tipContentV3 = (TipContentV2) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, TipContentV2$$serializer.INSTANCE, tipContentV3);
                        i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            goalScreenContent = goalScreenContent5;
            targetGoalType = targetGoalType2;
            tipContentV2 = tipContentV3;
            smartAlarmOverrideV2 = smartAlarmOverrideV4;
            str = str13;
            str2 = str14;
            i13 = i14;
            str3 = str15;
            str4 = str16;
            str5 = str17;
            goalScreenContent2 = goalScreenContent6;
            str6 = strDecodeStringElement3;
            str7 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WeeklyPlanCustomizationScreenModelV2(i13, targetGoalType, goalScreenContent, goalScreenContent2, str6, str5, str4, str2, str3, str7, str, smartAlarmOverrideV2, tipContentV2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WeeklyPlanCustomizationScreenModelV2 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WeeklyPlanCustomizationScreenModelV2.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
