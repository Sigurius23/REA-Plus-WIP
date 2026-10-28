package com.whoop.weightlifting.data.dto;

import java.util.UUID;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import lu2.C24753c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class WeightliftingWorkoutSetDto$$serializer implements GeneratedSerializer<WeightliftingWorkoutSetDto> {
    public static final int $stable;
    public static final WeightliftingWorkoutSetDto$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        WeightliftingWorkoutSetDto$$serializer weightliftingWorkoutSetDto$$serializer = new WeightliftingWorkoutSetDto$$serializer();
        INSTANCE = weightliftingWorkoutSetDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.data.dto.WeightliftingWorkoutSetDto", weightliftingWorkoutSetDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("number_of_reps", false);
        pluginGeneratedSerialDescriptor.addElement("time_in_seconds", false);
        pluginGeneratedSerialDescriptor.addElement("weight", false);
        pluginGeneratedSerialDescriptor.addElement("weightlifting_workout_set_id", false);
        pluginGeneratedSerialDescriptor.addElement("is_exercise_trackable", false);
        pluginGeneratedSerialDescriptor.addElement("during", false);
        pluginGeneratedSerialDescriptor.addElement("strap_location", false);
        pluginGeneratedSerialDescriptor.addElement("strap_location_laterality", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WeightliftingWorkoutSetDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(intSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(FloatSerializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(C24753c.f96791a);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final WeightliftingWorkoutSetDto deserialize(InterfaceC40541d decoder) {
        boolean z4;
        String str;
        String str2;
        String str3;
        int i13;
        Integer num;
        Integer num2;
        Float f13;
        UUID uuid;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 7;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, intSerializer, null);
            Integer num4 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, intSerializer, null);
            Float f14 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, FloatSerializer.INSTANCE, null);
            UUID uuid2 = (UUID) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, C24753c.f96791a, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            num2 = num4;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            str2 = str5;
            str3 = str4;
            uuid = uuid2;
            z4 = zDecodeBooleanElement;
            f13 = f14;
            i13 = 255;
            num = num3;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            String str6 = null;
            String str7 = null;
            Integer num5 = null;
            Integer num6 = null;
            Float f15 = null;
            UUID uuid3 = null;
            int i15 = 0;
            String str8 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 7;
                        break;
                    case 0:
                        num5 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, IntSerializer.INSTANCE, num5);
                        i15 |= 1;
                        i14 = 7;
                        break;
                    case 1:
                        num6 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, IntSerializer.INSTANCE, num6);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        f15 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, FloatSerializer.INSTANCE, f15);
                        i15 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        uuid3 = (UUID) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, C24753c.f96791a, uuid3);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str8);
                        i15 |= 32;
                        break;
                    case 6:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str7);
                        i15 |= 64;
                        break;
                    case 7:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str6);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            str = str6;
            str2 = str7;
            str3 = str8;
            i13 = i15;
            num = num5;
            num2 = num6;
            f13 = f15;
            uuid = uuid3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new WeightliftingWorkoutSetDto(i13, num, num2, f13, uuid, z4, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, WeightliftingWorkoutSetDto value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        WeightliftingWorkoutSetDto.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
