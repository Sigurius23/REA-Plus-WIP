package com.whoop.strengthworkout.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutHistorySet;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StrengthWorkoutHistorySet$$serializer implements GeneratedSerializer<StrengthWorkoutHistorySet> {
    public static final int $stable;
    public static final StrengthWorkoutHistorySet$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StrengthWorkoutHistorySet$$serializer strengthWorkoutHistorySet$$serializer = new StrengthWorkoutHistorySet$$serializer();
        INSTANCE = strengthWorkoutHistorySet$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.strengthworkout.domain.models.StrengthWorkoutHistorySet", strengthWorkoutHistorySet$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("numberOfReps", false);
        pluginGeneratedSerialDescriptor.addElement("timeInSeconds", false);
        pluginGeneratedSerialDescriptor.addElement("weight", false);
        pluginGeneratedSerialDescriptor.addElement("during", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StrengthWorkoutHistorySet$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(FloatSerializer.INSTANCE), AbstractC38195a.m122336d(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StrengthWorkoutHistorySet deserialize(InterfaceC40541d decoder) {
        int i13;
        Integer num;
        Integer num2;
        Float f13;
        String str;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        Integer num3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, intSerializer, null);
            Integer num5 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, intSerializer, null);
            Float f14 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, FloatSerializer.INSTANCE, null);
            num2 = num5;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            f13 = f14;
            i13 = 15;
            num = num4;
        } else {
            boolean z4 = true;
            int i14 = 0;
            Integer num6 = null;
            Float f15 = null;
            String str2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, IntSerializer.INSTANCE, num3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    num6 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, IntSerializer.INSTANCE, num6);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    f15 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, FloatSerializer.INSTANCE, f15);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str2);
                    i14 |= 8;
                }
            }
            i13 = i14;
            num = num3;
            num2 = num6;
            f13 = f15;
            str = str2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StrengthWorkoutHistorySet(i13, num, num2, f13, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StrengthWorkoutHistorySet value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StrengthWorkoutHistorySet.write$Self$strength_workout_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
