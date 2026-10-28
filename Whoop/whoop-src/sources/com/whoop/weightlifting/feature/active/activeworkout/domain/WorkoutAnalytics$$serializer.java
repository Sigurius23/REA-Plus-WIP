package com.whoop.weightlifting.feature.active.activeworkout.domain;

import java.util.Set;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WorkoutAnalytics$$serializer implements GeneratedSerializer<WorkoutAnalytics> {
    public static final int $stable;
    public static final WorkoutAnalytics$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WorkoutAnalytics$$serializer workoutAnalytics$$serializer = new WorkoutAnalytics$$serializer();
        INSTANCE = workoutAnalytics$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.feature.active.activeworkout.domain.WorkoutAnalytics", workoutAnalytics$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("numExercisesAddedDuringWorkout", true);
        pluginGeneratedSerialDescriptor.addElement("numExercisesRemovedDuringWorkout", true);
        pluginGeneratedSerialDescriptor.addElement("numSetsAddedDuringWorkout", true);
        pluginGeneratedSerialDescriptor.addElement("numSetsRemovedDuringWorkout", true);
        pluginGeneratedSerialDescriptor.addElement("numDragAndDrops", true);
        pluginGeneratedSerialDescriptor.addElement("numTimesPlayButtonClicked", true);
        pluginGeneratedSerialDescriptor.addElement("numSetsCancelled", true);
        pluginGeneratedSerialDescriptor.addElement("changedTemplate", true);
        pluginGeneratedSerialDescriptor.addElement("setIdsRepsEditedDuringWorkout", true);
        pluginGeneratedSerialDescriptor.addElement("setIdsWeightEditedDuringWorkout", true);
        pluginGeneratedSerialDescriptor.addElement("isQuickStart", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WorkoutAnalytics$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WorkoutAnalytics.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, booleanSerializer, interfaceC23462hArr[8].getValue(), interfaceC23462hArr[9].getValue(), booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WorkoutAnalytics deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        Set set;
        Set set2;
        int i13;
        boolean zDecodeBooleanElement;
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WorkoutAnalytics.$childSerializers;
        int i24 = 10;
        int i25 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            int iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            int iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
            int iDecodeIntElement5 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
            int iDecodeIntElement6 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
            int iDecodeIntElement7 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
            Set set3 = (Set) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            set = (Set) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
            z4 = zDecodeBooleanElement2;
            i14 = iDecodeIntElement7;
            i15 = iDecodeIntElement6;
            i16 = iDecodeIntElement4;
            i17 = iDecodeIntElement5;
            i18 = iDecodeIntElement3;
            i13 = 2047;
            set2 = set3;
            i19 = iDecodeIntElement2;
        } else {
            boolean z13 = true;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            int iDecodeIntElement13 = 0;
            Set set4 = null;
            Set set5 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i24 = 10;
                        break;
                    case 0:
                        i25 |= 1;
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i24 = 10;
                        break;
                    case 1:
                        iDecodeIntElement13 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                        i25 |= 2;
                        i24 = 10;
                        break;
                    case 2:
                        iDecodeIntElement12 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                        i25 |= 4;
                        i24 = 10;
                        break;
                    case 3:
                        iDecodeIntElement10 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
                        i25 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement11 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
                        i25 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement9 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 5);
                        i25 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement8 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 6);
                        i25 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
                        i25 |= 128;
                        break;
                    case 8:
                        set5 = (Set) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), set5);
                        i25 |= 256;
                        break;
                    case 9:
                        set4 = (Set) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), set4);
                        i25 |= 512;
                        break;
                    case 10:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i24);
                        i25 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            set = set4;
            set2 = set5;
            i13 = i25;
            zDecodeBooleanElement = zDecodeBooleanElement4;
            z4 = zDecodeBooleanElement3;
            i14 = iDecodeIntElement8;
            i15 = iDecodeIntElement9;
            i16 = iDecodeIntElement10;
            i17 = iDecodeIntElement11;
            i18 = iDecodeIntElement12;
            i19 = iDecodeIntElement13;
        }
        int i26 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WorkoutAnalytics(i13, i26, i19, i18, i16, i17, i15, i14, z4, set2, set, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WorkoutAnalytics value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WorkoutAnalytics.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
