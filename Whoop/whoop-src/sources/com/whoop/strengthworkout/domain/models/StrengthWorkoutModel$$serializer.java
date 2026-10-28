package com.whoop.strengthworkout.domain.models;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.C9598e;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/strengthworkout/domain/models/StrengthWorkoutModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StrengthWorkoutModel$$serializer implements GeneratedSerializer<StrengthWorkoutModel> {
    public static final int $stable;
    public static final StrengthWorkoutModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StrengthWorkoutModel$$serializer strengthWorkoutModel$$serializer = new StrengthWorkoutModel$$serializer();
        INSTANCE = strengthWorkoutModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.strengthworkout.domain.models.StrengthWorkoutModel", strengthWorkoutModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("selectedActivityInternalName", true);
        pluginGeneratedSerialDescriptor.addElement("gpsTrackingEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("restoreSessionDestination", true);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StrengthWorkoutModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = StrengthWorkoutModel.$childSerializers;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue());
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue());
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StrengthWorkoutModel deserialize(InterfaceC40541d decoder) {
        boolean z4;
        int i13;
        String str;
        String str2;
        C9598e c9598e;
        Map map;
        Map map2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = StrengthWorkoutModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            C9598e c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            str = strDecodeStringElement;
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, LenientAggregateBindingsSerializer.INSTANCE, null);
            z4 = zDecodeBooleanElement;
            c9598e = c9598e2;
            i13 = 63;
            str2 = strDecodeStringElement2;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            C9598e c9598e3 = null;
            Map map3 = null;
            Map map4 = null;
            int i14 = 0;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        continue;
                    case 0:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        break;
                    case 2:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        i14 |= 4;
                        break;
                    case 3:
                        c9598e3 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), c9598e3);
                        i14 |= 8;
                        break;
                    case 4:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), map3);
                        i14 |= 16;
                        break;
                    case 5:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, LenientAggregateBindingsSerializer.INSTANCE, map4);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            i13 = i14;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            c9598e = c9598e3;
            map = map3;
            map2 = map4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StrengthWorkoutModel(i13, str, str2, z4, c9598e, map, map2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StrengthWorkoutModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StrengthWorkoutModel.write$Self$strength_workout_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
