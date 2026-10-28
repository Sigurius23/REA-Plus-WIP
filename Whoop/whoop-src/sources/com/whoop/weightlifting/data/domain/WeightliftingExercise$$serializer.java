package com.whoop.weightlifting.data.domain;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/data/domain/WeightliftingExercise.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WeightliftingExercise$$serializer implements GeneratedSerializer<WeightliftingExercise> {
    public static final int $stable;
    public static final WeightliftingExercise$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WeightliftingExercise$$serializer weightliftingExercise$$serializer = new WeightliftingExercise$$serializer();
        INSTANCE = weightliftingExercise$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.data.domain.WeightliftingExercise", weightliftingExercise$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("exerciseId", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("pushCoreName", false);
        pluginGeneratedSerialDescriptor.addElement("trackable", false);
        pluginGeneratedSerialDescriptor.addElement("equipment", false);
        pluginGeneratedSerialDescriptor.addElement("translatedEquipment", false);
        pluginGeneratedSerialDescriptor.addElement("exerciseType", false);
        pluginGeneratedSerialDescriptor.addElement("laterality", false);
        pluginGeneratedSerialDescriptor.addElement("movementPattern", false);
        pluginGeneratedSerialDescriptor.addElement("translatedMovementPattern", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", true);
        pluginGeneratedSerialDescriptor.addElement("videoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("instructions", false);
        pluginGeneratedSerialDescriptor.addElement("trainingTypes", false);
        pluginGeneratedSerialDescriptor.addElement("muscleGroups", false);
        pluginGeneratedSerialDescriptor.addElement("translatedMuscleGroups", false);
        pluginGeneratedSerialDescriptor.addElement("deleted", true);
        pluginGeneratedSerialDescriptor.addElement("createdAt", true);
        pluginGeneratedSerialDescriptor.addElement("updatedAt", true);
        pluginGeneratedSerialDescriptor.addElement("volumeInputFormat", true);
        pluginGeneratedSerialDescriptor.addElement("customExerciseInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WeightliftingExercise$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WeightliftingExercise.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, booleanSerializer, interfaceC23462hArr[4].getValue(), stringSerializer, stringSerializer, interfaceC23462hArr[7].getValue(), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[12].getValue(), interfaceC23462hArr[13].getValue(), interfaceC23462hArr[14].getValue(), stringSerializer, booleanSerializer, stringSerializer, stringSerializer, interfaceC23462hArr[19].getValue(), AbstractC38195a.m122336d(CustomExerciseInfo$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WeightliftingExercise deserialize(InterfaceC40541d decoder) {
        int i13;
        ExerciseEquipment exerciseEquipment;
        String str;
        List list;
        ExerciseLaterality exerciseLaterality;
        VolumeInputFormat volumeInputFormat;
        String str2;
        List list2;
        List list3;
        String str3;
        String str4;
        CustomExerciseInfo customExerciseInfo;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z4;
        String str11;
        String str12;
        boolean z13;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WeightliftingExercise.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            ExerciseEquipment exerciseEquipment2 = (ExerciseEquipment) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            ExerciseLaterality exerciseLaterality2 = (ExerciseLaterality) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            List list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 15);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 16);
            String strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 17);
            String strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 18);
            VolumeInputFormat volumeInputFormat2 = (VolumeInputFormat) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 19, (InterfaceC37137b) interfaceC23462hArr[19].getValue(), null);
            i13 = 2097151;
            customExerciseInfo = (CustomExerciseInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, CustomExerciseInfo$$serializer.INSTANCE, null);
            str5 = strDecodeStringElement3;
            exerciseEquipment = exerciseEquipment2;
            str4 = strDecodeStringElement2;
            exerciseLaterality = exerciseLaterality2;
            z4 = zDecodeBooleanElement2;
            str = str13;
            str9 = strDecodeStringElement7;
            str7 = strDecodeStringElement5;
            str6 = strDecodeStringElement4;
            z13 = zDecodeBooleanElement;
            str10 = strDecodeStringElement8;
            str2 = strDecodeStringElement;
            str8 = strDecodeStringElement6;
            str11 = strDecodeStringElement9;
            list2 = list6;
            str12 = strDecodeStringElement10;
            volumeInputFormat = volumeInputFormat2;
            list3 = list5;
            list = list4;
            str3 = str14;
        } else {
            String strDecodeStringElement11 = null;
            i13 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            boolean z14 = true;
            int i15 = 7;
            ExerciseEquipment exerciseEquipment3 = null;
            String str15 = null;
            List list7 = null;
            ExerciseLaterality exerciseLaterality3 = null;
            VolumeInputFormat volumeInputFormat3 = null;
            String strDecodeStringElement12 = null;
            List list8 = null;
            List list9 = null;
            String str16 = null;
            CustomExerciseInfo customExerciseInfo2 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        i15 = 7;
                        break;
                    case 0:
                        i13 |= 1;
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 = 7;
                        break;
                    case 1:
                        i13 |= 2;
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 = 7;
                        break;
                    case 2:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i13 |= 4;
                        i15 = 7;
                        break;
                    case 3:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        i13 |= 8;
                        i15 = 7;
                        break;
                    case 4:
                        exerciseEquipment3 = (ExerciseEquipment) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), exerciseEquipment3);
                        i13 |= 16;
                        i15 = 7;
                        break;
                    case 5:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i13 |= 64;
                        break;
                    case 7:
                        exerciseLaterality3 = (ExerciseLaterality) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), exerciseLaterality3);
                        i13 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i13 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement17 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i13 |= 512;
                        break;
                    case 10:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str15);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    case 11:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str16);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    case 12:
                        list7 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), list7);
                        i13 |= 4096;
                        break;
                    case 13:
                        list9 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), list9);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        break;
                    case 14:
                        list8 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), list8);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        break;
                    case 15:
                        strDecodeStringElement18 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 15);
                        i14 = 32768;
                        i13 |= i14;
                        break;
                    case 16:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 16);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i13 |= i14;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        strDecodeStringElement19 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 17);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i13 |= i14;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        strDecodeStringElement20 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 18);
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        volumeInputFormat3 = (VolumeInputFormat) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 19, (InterfaceC37137b) interfaceC23462hArr[19].getValue(), volumeInputFormat3);
                        i13 |= 524288;
                        break;
                    case 20:
                        customExerciseInfo2 = (CustomExerciseInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, CustomExerciseInfo$$serializer.INSTANCE, customExerciseInfo2);
                        i13 |= 1048576;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            exerciseEquipment = exerciseEquipment3;
            str = str15;
            list = list7;
            exerciseLaterality = exerciseLaterality3;
            volumeInputFormat = volumeInputFormat3;
            str2 = strDecodeStringElement12;
            list2 = list8;
            list3 = list9;
            str3 = str16;
            str4 = strDecodeStringElement11;
            customExerciseInfo = customExerciseInfo2;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement14;
            str7 = strDecodeStringElement15;
            str8 = strDecodeStringElement16;
            str9 = strDecodeStringElement17;
            str10 = strDecodeStringElement18;
            z4 = zDecodeBooleanElement3;
            str11 = strDecodeStringElement19;
            str12 = strDecodeStringElement20;
            z13 = zDecodeBooleanElement4;
        }
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WeightliftingExercise(i16, str2, str4, str5, z13, exerciseEquipment, str6, str7, exerciseLaterality, str8, str9, str, str3, list, list3, list2, str10, z4, str11, str12, volumeInputFormat, customExerciseInfo, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WeightliftingExercise value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WeightliftingExercise.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
