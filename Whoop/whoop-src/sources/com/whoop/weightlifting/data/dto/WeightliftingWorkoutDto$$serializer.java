package com.whoop.weightlifting.data.dto;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/data/dto/WeightliftingWorkoutDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WeightliftingWorkoutDto$$serializer implements GeneratedSerializer<WeightliftingWorkoutDto> {
    public static final int $stable;
    public static final WeightliftingWorkoutDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WeightliftingWorkoutDto$$serializer weightliftingWorkoutDto$$serializer = new WeightliftingWorkoutDto$$serializer();
        INSTANCE = weightliftingWorkoutDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto", weightliftingWorkoutDto$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("source", true);
        pluginGeneratedSerialDescriptor.addElement("during", false);
        pluginGeneratedSerialDescriptor.addElement("timezone", false);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("msk_total_volume_kg", true);
        pluginGeneratedSerialDescriptor.addElement("raw_msk_strain_score", false);
        pluginGeneratedSerialDescriptor.addElement("msk_intensity_percent", false);
        pluginGeneratedSerialDescriptor.addElement("scaled_msk_strain_score", false);
        pluginGeneratedSerialDescriptor.addElement("workout_template_id", false);
        pluginGeneratedSerialDescriptor.addElement("rpe", true);
        pluginGeneratedSerialDescriptor.addElement("workout_groups", true);
        pluginGeneratedSerialDescriptor.addElement("is_simple_strength_logging", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WeightliftingWorkoutDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = WeightliftingWorkoutDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d, AbstractC38195a.m122336d(floatSerializer), floatSerializer, floatSerializer, floatSerializer, AbstractC38195a.m122336d(LongSerializer.INSTANCE), AbstractC38195a.m122336d(IntSerializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), BooleanSerializer.INSTANCE, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WeightliftingWorkoutDto deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        int i13;
        Integer num;
        List list;
        Long l7;
        Float f13;
        String str3;
        String str4;
        boolean zDecodeBooleanElement;
        String strDecodeStringElement;
        float f14;
        float f15;
        float f16;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = WeightliftingWorkoutDto.$childSerializers;
        int i14 = 9;
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            Float f17 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, FloatSerializer.INSTANCE, null);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
            float fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 6);
            float fDecodeFloatElement3 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 7);
            Long l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, LongSerializer.INSTANCE, null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, IntSerializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
            num = num2;
            f14 = fDecodeFloatElement3;
            f15 = fDecodeFloatElement2;
            f16 = fDecodeFloatElement;
            str = str5;
            l7 = l12;
            f13 = f17;
            str4 = strDecodeStringElement5;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
            i13 = 8191;
        } else {
            int i15 = 12;
            int i16 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str6 = null;
            Integer num3 = null;
            List list2 = null;
            Long l13 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            boolean z4 = true;
            float fDecodeFloatElement4 = 0.0f;
            float fDecodeFloatElement5 = 0.0f;
            float fDecodeFloatElement6 = 0.0f;
            Float f18 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 12;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 = 12;
                        i14 = 9;
                        break;
                    case 1:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i15 = 12;
                        i14 = 9;
                        break;
                    case 2:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i15 = 12;
                        i14 = 9;
                        break;
                    case 3:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str6);
                        i16 |= 8;
                        i15 = 12;
                        i14 = 9;
                        break;
                    case 4:
                        f18 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, FloatSerializer.INSTANCE, f18);
                        i16 |= 16;
                        i15 = 12;
                        i14 = 9;
                        break;
                    case 5:
                        fDecodeFloatElement6 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i15 = 12;
                        break;
                    case 6:
                        fDecodeFloatElement5 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 6);
                        i16 |= 64;
                        i15 = 12;
                        break;
                    case 7:
                        fDecodeFloatElement4 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 7);
                        i16 |= 128;
                        i15 = 12;
                        break;
                    case 8:
                        l13 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, LongSerializer.INSTANCE, l13);
                        i16 |= 256;
                        i15 = 12;
                        break;
                    case 9:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, IntSerializer.INSTANCE, num3);
                        i16 |= 512;
                        i15 = 12;
                        break;
                    case 10:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), list2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = 12;
                        break;
                    case 11:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    case 12:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i16 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str6;
            str2 = strDecodeStringElement2;
            i13 = i16;
            num = num3;
            list = list2;
            l7 = l13;
            f13 = f18;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement6;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            strDecodeStringElement = strDecodeStringElement7;
            f14 = fDecodeFloatElement4;
            f15 = fDecodeFloatElement5;
            f16 = fDecodeFloatElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WeightliftingWorkoutDto(i13, str2, str3, str4, str, f13, f16, f15, f14, l7, num, list, zDecodeBooleanElement, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WeightliftingWorkoutDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WeightliftingWorkoutDto.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
