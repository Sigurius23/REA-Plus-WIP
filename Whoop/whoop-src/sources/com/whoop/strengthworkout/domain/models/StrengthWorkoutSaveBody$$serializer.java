package com.whoop.strengthworkout.domain.models;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StrengthWorkoutSaveBody$$serializer implements GeneratedSerializer<StrengthWorkoutSaveBody> {
    public static final int $stable;
    public static final StrengthWorkoutSaveBody$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StrengthWorkoutSaveBody$$serializer strengthWorkoutSaveBody$$serializer = new StrengthWorkoutSaveBody$$serializer();
        INSTANCE = strengthWorkoutSaveBody$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.strengthworkout.domain.models.StrengthWorkoutSaveBody", strengthWorkoutSaveBody$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("weightliftingWorkoutId", false);
        pluginGeneratedSerialDescriptor.addElement("activityId", false);
        pluginGeneratedSerialDescriptor.addElement("during", false);
        pluginGeneratedSerialDescriptor.addElement("timezone", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("workoutTemplateId", false);
        pluginGeneratedSerialDescriptor.addElement("rpe", false);
        pluginGeneratedSerialDescriptor.addElement("mskTotalVolumeKg", false);
        pluginGeneratedSerialDescriptor.addElement("rawMskStrainScore", false);
        pluginGeneratedSerialDescriptor.addElement("mskIntensityPercent", false);
        pluginGeneratedSerialDescriptor.addElement("scaledMskStrainScore", false);
        pluginGeneratedSerialDescriptor.addElement("workoutGroups", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StrengthWorkoutSaveBody$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = StrengthWorkoutSaveBody.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(LongSerializer.INSTANCE), AbstractC38195a.m122336d(IntSerializer.INSTANCE), floatSerializer, floatSerializer, floatSerializer, floatSerializer, interfaceC23462hArr[11].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StrengthWorkoutSaveBody deserialize(InterfaceC40541d decoder) {
        float f13;
        String str;
        Integer num;
        List list;
        Long l7;
        float f14;
        String str2;
        int i13;
        float f15;
        float f16;
        String str3;
        String str4;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = StrengthWorkoutSaveBody.$childSerializers;
        int i14 = 10;
        int i15 = 9;
        int i16 = 7;
        char c3 = 6;
        int i17 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            Long l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, LongSerializer.INSTANCE, null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, IntSerializer.INSTANCE, null);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 7);
            float fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 8);
            float fDecodeFloatElement3 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 9);
            float fDecodeFloatElement4 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 10);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            str3 = strDecodeStringElement;
            f13 = fDecodeFloatElement4;
            f14 = fDecodeFloatElement3;
            f15 = fDecodeFloatElement;
            num = num2;
            l7 = l12;
            str5 = strDecodeStringElement3;
            f16 = fDecodeFloatElement2;
            str2 = str7;
            str4 = strDecodeStringElement2;
            i13 = 4095;
            str = str6;
        } else {
            float fDecodeFloatElement5 = 0.0f;
            float fDecodeFloatElement6 = 0.0f;
            float fDecodeFloatElement7 = 0.0f;
            Integer num3 = null;
            List list2 = null;
            Long l13 = null;
            String strDecodeStringElement4 = null;
            String str8 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean z4 = true;
            float fDecodeFloatElement8 = 0.0f;
            String str9 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 10;
                        i15 = 9;
                        c3 = 6;
                        break;
                    case 0:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i17 |= 1;
                        i14 = 10;
                        i15 = 9;
                        i16 = 7;
                        c3 = 6;
                        break;
                    case 1:
                        i17 |= 2;
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str8);
                        i14 = 10;
                        i15 = 9;
                        i16 = 7;
                        c3 = 6;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i14 = 10;
                        c3 = 6;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i14 = 10;
                        c3 = 6;
                        break;
                    case 4:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str9);
                        i17 |= 16;
                        i14 = 10;
                        c3 = 6;
                        break;
                    case 5:
                        l13 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, LongSerializer.INSTANCE, l13);
                        i17 |= 32;
                        i14 = 10;
                        c3 = 6;
                        break;
                    case 6:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, IntSerializer.INSTANCE, num3);
                        i17 |= 64;
                        c3 = 6;
                        i14 = 10;
                        break;
                    case 7:
                        fDecodeFloatElement6 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, i16);
                        i17 |= 128;
                        c3 = 6;
                        break;
                    case 8:
                        fDecodeFloatElement7 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 8);
                        i17 |= 256;
                        c3 = 6;
                        break;
                    case 9:
                        fDecodeFloatElement8 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, i15);
                        i17 |= 512;
                        c3 = 6;
                        break;
                    case 10:
                        fDecodeFloatElement5 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, i14);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        c3 = 6;
                        break;
                    case 11:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), list2);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c3 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            f13 = fDecodeFloatElement5;
            str = str8;
            num = num3;
            list = list2;
            l7 = l13;
            f14 = fDecodeFloatElement8;
            str2 = str9;
            i13 = i17;
            f15 = fDecodeFloatElement6;
            f16 = fDecodeFloatElement7;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StrengthWorkoutSaveBody(i13, str3, str, str4, str5, str2, l7, num, f15, f16, f14, f13, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StrengthWorkoutSaveBody value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StrengthWorkoutSaveBody.write$Self$strength_workout_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
