package com.whoop.weightlifting.data.dto;

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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/data/dto/WeightliftingExerciseDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WeightliftingExerciseDto$$serializer implements GeneratedSerializer<WeightliftingExerciseDto> {
    public static final int $stable;
    public static final WeightliftingExerciseDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WeightliftingExerciseDto$$serializer weightliftingExerciseDto$$serializer = new WeightliftingExerciseDto$$serializer();
        INSTANCE = weightliftingExerciseDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.data.dto.WeightliftingExerciseDto", weightliftingExerciseDto$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("exercise_id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("push_core_name", false);
        pluginGeneratedSerialDescriptor.addElement("trackable", false);
        pluginGeneratedSerialDescriptor.addElement("equipment", false);
        pluginGeneratedSerialDescriptor.addElement("translated_equipment", true);
        pluginGeneratedSerialDescriptor.addElement("exercise_type", false);
        pluginGeneratedSerialDescriptor.addElement("laterality", false);
        pluginGeneratedSerialDescriptor.addElement("movement_pattern", false);
        pluginGeneratedSerialDescriptor.addElement("translated_movement_pattern", true);
        pluginGeneratedSerialDescriptor.addElement("image_url", true);
        pluginGeneratedSerialDescriptor.addElement("video_url", true);
        pluginGeneratedSerialDescriptor.addElement("instructions", true);
        pluginGeneratedSerialDescriptor.addElement("training_types", true);
        pluginGeneratedSerialDescriptor.addElement("muscle_groups", true);
        pluginGeneratedSerialDescriptor.addElement("translated_muscle_groups", true);
        pluginGeneratedSerialDescriptor.addElement("deleted", true);
        pluginGeneratedSerialDescriptor.addElement("created_at", true);
        pluginGeneratedSerialDescriptor.addElement("updated_at", true);
        pluginGeneratedSerialDescriptor.addElement("volume_input_format", true);
        pluginGeneratedSerialDescriptor.addElement("custom_exercise_info", false);
        pluginGeneratedSerialDescriptor.addElement("volume_input_units", true);
        pluginGeneratedSerialDescriptor.addElement("volume_input_value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WeightliftingExerciseDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WeightliftingExerciseDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[12].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[13].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[14].getValue()), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(booleanSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(CustomExerciseInfoDto$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WeightliftingExerciseDto deserialize(InterfaceC40541d decoder) {
        List list;
        String str;
        String str2;
        Boolean bool;
        List list2;
        String str3;
        String str4;
        String str5;
        CustomExerciseInfoDto customExerciseInfoDto;
        String str6;
        String str7;
        List list3;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i13;
        String str14;
        String str15;
        String str16;
        boolean z4;
        String str17;
        int i14;
        int i15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WeightliftingExerciseDto.$childSerializers;
        String str18 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            List list6 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            String str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, stringSerializer, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, BooleanSerializer.INSTANCE, null);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 17);
            String strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 18);
            String str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, stringSerializer, null);
            CustomExerciseInfoDto customExerciseInfoDto2 = (CustomExerciseInfoDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, CustomExerciseInfoDto$$serializer.INSTANCE, null);
            String str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, stringSerializer, null);
            str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 22, stringSerializer, null);
            str16 = str25;
            str4 = str19;
            z4 = zDecodeBooleanElement;
            str8 = strDecodeStringElement2;
            str13 = strDecodeStringElement7;
            str10 = strDecodeStringElement4;
            str9 = strDecodeStringElement3;
            i13 = 8388607;
            str3 = str21;
            str2 = str20;
            str12 = strDecodeStringElement6;
            str11 = strDecodeStringElement5;
            customExerciseInfoDto = customExerciseInfoDto2;
            str6 = str24;
            str15 = strDecodeStringElement9;
            bool = bool2;
            str14 = strDecodeStringElement8;
            list3 = list6;
            str7 = str23;
            list = list5;
            list2 = list4;
            str17 = strDecodeStringElement;
            str = str22;
        } else {
            int i16 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z13 = true;
            String str26 = null;
            List list7 = null;
            String str27 = null;
            String str28 = null;
            Boolean bool3 = null;
            List list8 = null;
            String str29 = null;
            String str30 = null;
            CustomExerciseInfoDto customExerciseInfoDto3 = null;
            String str31 = null;
            String str32 = null;
            List list9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            while (z13) {
                String str33 = str28;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        str30 = str30;
                        str28 = str33;
                        z13 = false;
                        i16 = i16;
                        str26 = str26;
                        break;
                    case 0:
                        strDecodeStringElement18 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        str30 = str30;
                        str28 = str33;
                        i16 |= 1;
                        str26 = str26;
                        break;
                    case 1:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        str30 = str30;
                        str28 = str33;
                        i16 |= 2;
                        str26 = str26;
                        break;
                    case 2:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        str30 = str30;
                        str28 = str33;
                        i16 |= 4;
                        str26 = str26;
                        break;
                    case 3:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
                        str30 = str30;
                        str28 = str33;
                        i16 |= 8;
                        str26 = str26;
                        break;
                    case 4:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        str30 = str30;
                        str28 = str33;
                        i16 |= 16;
                        str26 = str26;
                        break;
                    case 5:
                        i16 |= 32;
                        str30 = str30;
                        str28 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str33);
                        str26 = str26;
                        break;
                    case 6:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i16 |= 64;
                        str30 = str30;
                        str26 = str26;
                        str28 = str33;
                        break;
                    case 7:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i16 |= 128;
                        str30 = str30;
                        str26 = str26;
                        str28 = str33;
                        break;
                    case 8:
                        strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i16 |= 256;
                        str30 = str30;
                        str26 = str26;
                        str28 = str33;
                        break;
                    case 9:
                        str26 = str26;
                        str30 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, StringSerializer.INSTANCE, str30);
                        i16 |= 512;
                        str26 = str26;
                        str28 = str33;
                        break;
                    case 10:
                        str30 = str30;
                        str29 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str29);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case 11:
                        str30 = str30;
                        str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str27);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case 12:
                        str30 = str30;
                        list8 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, (InterfaceC37137b) interfaceC23462hArr[12].getValue(), list8);
                        i16 |= 4096;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case 13:
                        str30 = str30;
                        list7 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), list7);
                        i16 |= DfuBaseService.ERROR_REMOTE_MASK;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case 14:
                        str30 = str30;
                        list9 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), list9);
                        i16 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case 15:
                        str32 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, StringSerializer.INSTANCE, str32);
                        i14 = 32768;
                        i16 |= i14;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case 16:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, BooleanSerializer.INSTANCE, bool3);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i16 |= i14;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 17);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i16 |= i15;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        strDecodeStringElement17 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 18);
                        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        i16 |= i15;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        str31 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 19, StringSerializer.INSTANCE, str31);
                        i14 = 524288;
                        i16 |= i14;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case 20:
                        customExerciseInfoDto3 = (CustomExerciseInfoDto) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 20, CustomExerciseInfoDto$$serializer.INSTANCE, customExerciseInfoDto3);
                        i14 = 1048576;
                        i16 |= i14;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case 21:
                        str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 21, StringSerializer.INSTANCE, str26);
                        i14 = 2097152;
                        i16 |= i14;
                        str28 = str33;
                        str30 = str30;
                        break;
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 22, StringSerializer.INSTANCE, str18);
                        i14 = 4194304;
                        i16 |= i14;
                        str28 = str33;
                        str30 = str30;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list7;
            str = str27;
            str2 = str30;
            bool = bool3;
            list2 = list8;
            str3 = str29;
            str4 = str28;
            str5 = str18;
            customExerciseInfoDto = customExerciseInfoDto3;
            str6 = str31;
            str7 = str32;
            list3 = list9;
            str8 = strDecodeStringElement10;
            str9 = strDecodeStringElement11;
            str10 = strDecodeStringElement12;
            str11 = strDecodeStringElement13;
            str12 = strDecodeStringElement14;
            str13 = strDecodeStringElement15;
            i13 = i16;
            str14 = strDecodeStringElement16;
            str15 = strDecodeStringElement17;
            str16 = str26;
            z4 = zDecodeBooleanElement2;
            str17 = strDecodeStringElement18;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WeightliftingExerciseDto(i13, str17, str8, str9, z4, str10, str4, str11, str12, str13, str2, str3, str, list2, list, list3, str7, bool, str14, str15, str6, customExerciseInfoDto, str16, str5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WeightliftingExerciseDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WeightliftingExerciseDto.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
