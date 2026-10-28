package com.amplitude.android.engagement.types;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"com/amplitude/android/engagement/types/NudgeCooldownLimit.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;", "<init>", "()V", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;)V", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC23457c
public final class NudgeCooldownLimit$$serializer implements GeneratedSerializer<NudgeCooldownLimit> {
    public static final int $stable = 0;
    public static final NudgeCooldownLimit$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NudgeCooldownLimit$$serializer nudgeCooldownLimit$$serializer = new NudgeCooldownLimit$$serializer();
        INSTANCE = nudgeCooldownLimit$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.amplitude.android.engagement.types.NudgeCooldownLimit", nudgeCooldownLimit$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("max", true);
        pluginGeneratedSerialDescriptor.addElement("period", true);
        pluginGeneratedSerialDescriptor.addElement("periodCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NudgeCooldownLimit$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(StringSerializer.INSTANCE), AbstractC38195a.m122336d(intSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public NudgeCooldownLimit deserialize(InterfaceC40541d decoder) {
        Object objDecodeNullableSerializableElement;
        int i13;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(descriptor2);
        Object objDecodeNullableSerializableElement4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement2 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 0, intSerializer, null);
            Object objDecodeNullableSerializableElement5 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement3 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, intSerializer, null);
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement5;
            i13 = 7;
        } else {
            boolean z4 = true;
            int i14 = 0;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeNullableSerializableElement4 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 0, IntSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeNullableSerializableElement = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                    i14 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeNullableSerializableElement6 = interfaceC40539bBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                    i14 |= 4;
                }
            }
            i13 = i14;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement4;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement6;
        }
        interfaceC40539bBeginStructure.endStructure(descriptor2);
        return new NudgeCooldownLimit(i13, (Integer) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement, (Integer) objDecodeNullableSerializableElement3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, NudgeCooldownLimit value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor2 = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(descriptor2);
        NudgeCooldownLimit.write$Self(value, interfaceC40540cBeginStructure, descriptor2);
        interfaceC40540cBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public InterfaceC37138c[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
