package com.whoop.weightlifting.data.dto;

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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/data/dto/WorkoutLibraryModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WorkoutLibraryModel$$serializer implements GeneratedSerializer<WorkoutLibraryModel> {
    public static final int $stable;
    public static final WorkoutLibraryModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WorkoutLibraryModel$$serializer workoutLibraryModel$$serializer = new WorkoutLibraryModel$$serializer();
        INSTANCE = workoutLibraryModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.data.dto.WorkoutLibraryModel", workoutLibraryModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("workout_library_title", false);
        pluginGeneratedSerialDescriptor.addElement("whoop_workouts_title", false);
        pluginGeneratedSerialDescriptor.addElement("my_workouts_title", false);
        pluginGeneratedSerialDescriptor.addElement("my_workouts_ctatext", false);
        pluginGeneratedSerialDescriptor.addElement("whoop_workouts_list", false);
        pluginGeneratedSerialDescriptor.addElement("my_workouts_list", false);
        pluginGeneratedSerialDescriptor.addElement("my_workouts_header_items", true);
        pluginGeneratedSerialDescriptor.addElement("my_workouts_empty_state", false);
        pluginGeneratedSerialDescriptor.addElement("my_progress", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        pluginGeneratedSerialDescriptor.addElement("metadataList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WorkoutLibraryModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WorkoutLibraryModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), MyWorkoutsEmptyState$$serializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), AbstractC38195a.m122336d(MetaData$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WorkoutLibraryModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        List list2;
        List list3;
        MetaData metaData;
        List list4;
        MyWorkoutsEmptyState myWorkoutsEmptyState;
        List list5;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WorkoutLibraryModel.$childSerializers;
        int i14 = 9;
        int i15 = 8;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            List list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            List list7 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            List list8 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            MyWorkoutsEmptyState myWorkoutsEmptyState2 = (MyWorkoutsEmptyState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, MyWorkoutsEmptyState$$serializer.INSTANCE, null);
            List list9 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            MetaData metaData2 = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, MetaData$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            str2 = strDecodeStringElement2;
            metaData = metaData2;
            myWorkoutsEmptyState = myWorkoutsEmptyState2;
            str = str5;
            str4 = strDecodeStringElement4;
            i13 = 2047;
            list2 = list8;
            list3 = list7;
            list4 = list9;
            list5 = list6;
            str3 = strDecodeStringElement3;
        } else {
            int i16 = 6;
            int i17 = 5;
            int i18 = 4;
            boolean z4 = true;
            int i19 = 0;
            List list10 = null;
            List list11 = null;
            List list12 = null;
            MetaData metaData3 = null;
            List list13 = null;
            MyWorkoutsEmptyState myWorkoutsEmptyState3 = null;
            List list14 = null;
            String str6 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z4) {
                int i24 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 9;
                        i15 = 8;
                        i18 = 4;
                        i17 = 5;
                        i16 = 6;
                        break;
                    case 0:
                        i19 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 9;
                        i15 = 8;
                        i18 = 4;
                        i17 = 5;
                        i16 = 6;
                        break;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i19 |= 2;
                        i14 = 9;
                        i15 = 8;
                        i18 = 4;
                        i17 = 5;
                        i16 = 6;
                        break;
                    case 2:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i19 |= 4;
                        i14 = 9;
                        i15 = 8;
                        i18 = 4;
                        i17 = 5;
                        i16 = 6;
                        break;
                    case 3:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str6);
                        i19 |= 8;
                        i14 = 9;
                        i15 = 8;
                        i18 = 4;
                        i17 = 5;
                        i16 = 6;
                        break;
                    case 4:
                        list14 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list14);
                        i19 |= 16;
                        i14 = 9;
                        i15 = 8;
                        i17 = 5;
                        i16 = 6;
                        break;
                    case 5:
                        list12 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list12);
                        i19 |= 32;
                        i14 = 9;
                        i15 = 8;
                        i16 = 6;
                        break;
                    case 6:
                        list11 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list11);
                        i19 |= 64;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 7:
                        myWorkoutsEmptyState3 = (MyWorkoutsEmptyState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, MyWorkoutsEmptyState$$serializer.INSTANCE, myWorkoutsEmptyState3);
                        i19 |= 128;
                        i14 = 9;
                        i15 = 8;
                        break;
                    case 8:
                        list13 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i24, (InterfaceC37137b) interfaceC23462hArr[i24].getValue(), list13);
                        i19 |= 256;
                        i15 = i24;
                        i14 = 9;
                        break;
                    case 9:
                        metaData3 = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, MetaData$$serializer.INSTANCE, metaData3);
                        i19 |= 512;
                        i15 = i24;
                        break;
                    case 10:
                        list10 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), list10);
                        i19 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = i24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i19;
            list = list10;
            list2 = list11;
            list3 = list12;
            metaData = metaData3;
            list4 = list13;
            myWorkoutsEmptyState = myWorkoutsEmptyState3;
            list5 = list14;
            str = str6;
            str2 = strDecodeStringElement;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WorkoutLibraryModel(i13, str2, str3, str4, str, list5, list3, list2, myWorkoutsEmptyState, list4, metaData, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WorkoutLibraryModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WorkoutLibraryModel.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
