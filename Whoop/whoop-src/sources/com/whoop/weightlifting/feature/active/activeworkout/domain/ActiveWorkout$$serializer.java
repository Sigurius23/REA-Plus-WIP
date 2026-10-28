package com.whoop.weightlifting.feature.active.activeworkout.domain;

import com.whoop.weightlifting.data.domain.StrapLaterality;
import com.whoop.weightlifting.data.domain.StrapLocation;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.DateTime;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ActiveWorkout$$serializer implements GeneratedSerializer<ActiveWorkout> {
    public static final int $stable;
    public static final ActiveWorkout$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ActiveWorkout$$serializer activeWorkout$$serializer = new ActiveWorkout$$serializer();
        INSTANCE = activeWorkout$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout", activeWorkout$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("parentTemplateId", false);
        pluginGeneratedSerialDescriptor.addElement("workoutTemplateId", false);
        pluginGeneratedSerialDescriptor.addElement("groups", false);
        pluginGeneratedSerialDescriptor.addElement("originalGroups", true);
        pluginGeneratedSerialDescriptor.addElement("idsOfExpandedExercises", false);
        pluginGeneratedSerialDescriptor.addElement("startTime", false);
        pluginGeneratedSerialDescriptor.addElement("positionInWorkout", false);
        pluginGeneratedSerialDescriptor.addElement("currentSetState", false);
        pluginGeneratedSerialDescriptor.addElement("completedSetData", false);
        pluginGeneratedSerialDescriptor.addElement("strapLocation", false);
        pluginGeneratedSerialDescriptor.addElement("strapLaterality", false);
        pluginGeneratedSerialDescriptor.addElement("analytics", true);
        pluginGeneratedSerialDescriptor.addElement("manuallyEditedSetIds", true);
        pluginGeneratedSerialDescriptor.addElement("isSimpleStrengthLogging", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActiveWorkout$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ActiveWorkout.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, AbstractC38195a.m122336d(longSerializer), AbstractC38195a.m122336d(longSerializer), interfaceC23462hArr[3].getValue(), interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), interfaceC23462hArr[6].getValue(), AbstractC38195a.m122336d(PositionInWorkout$$serializer.INSTANCE), interfaceC23462hArr[8].getValue(), interfaceC23462hArr[9].getValue(), interfaceC23462hArr[10].getValue(), interfaceC23462hArr[11].getValue(), WorkoutAnalytics$$serializer.INSTANCE, interfaceC23462hArr[13].getValue(), BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ActiveWorkout deserialize(InterfaceC40541d decoder) {
        Long l7;
        DateTime dateTime;
        Set set;
        Map map;
        List list;
        List list2;
        WorkoutAnalytics workoutAnalytics;
        StrapLaterality strapLaterality;
        CurrentSetState currentSetState;
        PositionInWorkout positionInWorkout;
        Set set2;
        StrapLocation strapLocation;
        int i13;
        Long l12;
        boolean zDecodeBooleanElement;
        String str;
        int i14;
        int i15;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ActiveWorkout.$childSerializers;
        String str2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l13 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, longSerializer, null);
            Long l14 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, longSerializer, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            Set set3 = (Set) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            DateTime dateTime2 = (DateTime) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            PositionInWorkout positionInWorkout2 = (PositionInWorkout) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, PositionInWorkout$$serializer.INSTANCE, null);
            CurrentSetState currentSetState2 = (CurrentSetState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            Map map2 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            StrapLocation strapLocation2 = (StrapLocation) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            StrapLaterality strapLaterality2 = (StrapLaterality) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            WorkoutAnalytics workoutAnalytics2 = (WorkoutAnalytics) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, WorkoutAnalytics$$serializer.INSTANCE, null);
            set = (Set) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            str = strDecodeStringElement2;
            list = list4;
            l12 = l14;
            positionInWorkout = positionInWorkout2;
            list2 = list3;
            l7 = l13;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 14);
            strapLocation = strapLocation2;
            map = map2;
            dateTime = dateTime2;
            set2 = set3;
            currentSetState = currentSetState2;
            i13 = 32767;
            workoutAnalytics = workoutAnalytics2;
            strapLaterality = strapLaterality2;
        } else {
            int i16 = 4;
            boolean zDecodeBooleanElement2 = false;
            int i17 = 0;
            boolean z4 = true;
            Long l15 = null;
            DateTime dateTime3 = null;
            Long l16 = null;
            Map map3 = null;
            List list5 = null;
            List list6 = null;
            Set set4 = null;
            int i18 = 10;
            int i19 = 9;
            int i24 = 6;
            int i25 = 5;
            int i26 = 3;
            int i27 = 8;
            WorkoutAnalytics workoutAnalytics3 = null;
            StrapLaterality strapLaterality3 = null;
            CurrentSetState currentSetState3 = null;
            PositionInWorkout positionInWorkout3 = null;
            Set set5 = null;
            StrapLocation strapLocation3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        i15 = i17;
                        strDecodeStringElement = str2;
                        l15 = l15;
                        z4 = false;
                        l16 = l16;
                        str2 = strDecodeStringElement;
                        i26 = 3;
                        i16 = 4;
                        i25 = 5;
                        i24 = 6;
                        i27 = 8;
                        i19 = 9;
                        i18 = 10;
                        i17 = i15;
                        break;
                    case 0:
                        int i28 = i17;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 = i28 | 1;
                        l15 = l15;
                        l16 = l16;
                        str2 = strDecodeStringElement;
                        i26 = 3;
                        i16 = 4;
                        i25 = 5;
                        i24 = 6;
                        i27 = 8;
                        i19 = 9;
                        i18 = 10;
                        i17 = i15;
                        break;
                    case 1:
                        i17 |= 2;
                        str2 = str2;
                        l15 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, LongSerializer.INSTANCE, l15);
                        l16 = l16;
                        i26 = 3;
                        i16 = 4;
                        i25 = 5;
                        i24 = 6;
                        i27 = 8;
                        i19 = 9;
                        i18 = 10;
                        break;
                    case 2:
                        Long l17 = l15;
                        int i29 = i17;
                        i17 = i29 | 4;
                        str2 = str2;
                        i26 = 3;
                        i16 = 4;
                        i25 = 5;
                        i24 = 6;
                        i27 = 8;
                        i19 = 9;
                        i18 = 10;
                        l16 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, LongSerializer.INSTANCE, l16);
                        l15 = l17;
                        break;
                    case 3:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i26, (InterfaceC37137b) interfaceC23462hArr[i26].getValue(), list6);
                        i14 = i17 | 8;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i16 = 4;
                        i25 = 5;
                        i24 = 6;
                        i27 = 8;
                        i19 = 9;
                        i18 = 10;
                        i17 = i14;
                        break;
                    case 4:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list5);
                        i14 = i17 | 16;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i25 = 5;
                        i24 = 6;
                        i27 = 8;
                        i19 = 9;
                        i18 = 10;
                        i17 = i14;
                        break;
                    case 5:
                        set5 = (Set) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i25, (InterfaceC37137b) interfaceC23462hArr[i25].getValue(), set5);
                        i14 = i17 | 32;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i24 = 6;
                        i27 = 8;
                        i19 = 9;
                        i18 = 10;
                        i17 = i14;
                        break;
                    case 6:
                        dateTime3 = (DateTime) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), dateTime3);
                        i14 = i17 | 64;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i27 = 8;
                        i19 = 9;
                        i18 = 10;
                        i17 = i14;
                        break;
                    case 7:
                        positionInWorkout3 = (PositionInWorkout) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, PositionInWorkout$$serializer.INSTANCE, positionInWorkout3);
                        i14 = i17 | 128;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i27 = 8;
                        i19 = 9;
                        i18 = 10;
                        i17 = i14;
                        break;
                    case 8:
                        currentSetState3 = (CurrentSetState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i27, (InterfaceC37137b) interfaceC23462hArr[i27].getValue(), currentSetState3);
                        i14 = i17 | 256;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i19 = 9;
                        i18 = 10;
                        i17 = i14;
                        break;
                    case 9:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i19, (InterfaceC37137b) interfaceC23462hArr[i19].getValue(), map3);
                        i14 = i17 | 512;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i18 = 10;
                        i17 = i14;
                        break;
                    case 10:
                        strapLocation3 = (StrapLocation) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), strapLocation3);
                        i14 = i17 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i17 = i14;
                        break;
                    case 11:
                        strapLaterality3 = (StrapLaterality) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), strapLaterality3);
                        i14 = i17 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i17 = i14;
                        break;
                    case 12:
                        workoutAnalytics3 = (WorkoutAnalytics) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, WorkoutAnalytics$$serializer.INSTANCE, workoutAnalytics3);
                        i14 = i17 | 4096;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i17 = i14;
                        break;
                    case 13:
                        set4 = (Set) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), set4);
                        i14 = i17 | DfuBaseService.ERROR_REMOTE_MASK;
                        l16 = l16;
                        str2 = str2;
                        l15 = l15;
                        i17 = i14;
                        break;
                    case 14:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 14);
                        i14 = i17 | DfuBaseService.ERROR_CONNECTION_MASK;
                        i17 = i14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            l7 = l15;
            dateTime = dateTime3;
            set = set4;
            map = map3;
            list = list5;
            list2 = list6;
            workoutAnalytics = workoutAnalytics3;
            strapLaterality = strapLaterality3;
            currentSetState = currentSetState3;
            positionInWorkout = positionInWorkout3;
            set2 = set5;
            strapLocation = strapLocation3;
            i13 = i17;
            l12 = l16;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = str2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ActiveWorkout(i13, str, l7, l12, list2, list, set2, dateTime, positionInWorkout, currentSetState, map, strapLocation, strapLaterality, workoutAnalytics, set, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ActiveWorkout value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ActiveWorkout.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
