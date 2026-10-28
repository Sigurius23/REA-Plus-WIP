package com.whoop.healthspan.domain;

import com.whoop.healthspan.domain.models.HealthspanResponse;
import com.whoop.healthspan.domain.models.HealthspanResponse$$serializer;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/healthspan/domain/HealthspanDomainResult.Success.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HealthspanDomainResult$Success$$serializer implements GeneratedSerializer<HealthspanDomainResult.Success> {
    public static final int $stable;
    public static final HealthspanDomainResult$Success$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HealthspanDomainResult$Success$$serializer healthspanDomainResult$Success$$serializer = new HealthspanDomainResult$Success$$serializer();
        INSTANCE = healthspanDomainResult$Success$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.healthspan.domain.HealthspanDomainResult.Success", healthspanDomainResult$Success$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("response", false);
        pluginGeneratedSerialDescriptor.addElement("hasClosedCalibration", false);
        pluginGeneratedSerialDescriptor.addElement("hasClosedInfoCallout", true);
        pluginGeneratedSerialDescriptor.addElement("isFromDateChange", true);
        pluginGeneratedSerialDescriptor.addElement("previousPaceOfAgingValueIndex", true);
        pluginGeneratedSerialDescriptor.addElement("drawerExpandedStates", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HealthspanDomainResult$Success$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HealthspanDomainResult.Success.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{HealthspanResponse$$serializer.INSTANCE, booleanSerializer, booleanSerializer, booleanSerializer, AbstractC38195a.m122336d(IntSerializer.INSTANCE), interfaceC23462hArr[5].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HealthspanDomainResult.Success deserialize(InterfaceC40541d decoder) {
        boolean z4;
        boolean z13;
        int i13;
        boolean z14;
        HealthspanResponse healthspanResponse;
        Integer num;
        Map map;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HealthspanDomainResult.Success.$childSerializers;
        int i14 = 3;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            HealthspanResponse healthspanResponse2 = (HealthspanResponse) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, HealthspanResponse$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 3);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, IntSerializer.INSTANCE, null);
            map = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            healthspanResponse = healthspanResponse2;
            z4 = zDecodeBooleanElement3;
            num = num2;
            z13 = zDecodeBooleanElement2;
            i13 = 63;
            z14 = zDecodeBooleanElement;
        } else {
            boolean z15 = true;
            boolean zDecodeBooleanElement4 = false;
            int i15 = 0;
            boolean zDecodeBooleanElement5 = false;
            HealthspanResponse healthspanResponse3 = null;
            Integer num3 = null;
            Map map2 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z15) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z15 = false;
                        i14 = 3;
                        break;
                    case 0:
                        healthspanResponse3 = (HealthspanResponse) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, HealthspanResponse$$serializer.INSTANCE, healthspanResponse3);
                        i15 |= 1;
                        i14 = 3;
                        break;
                    case 1:
                        zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i14);
                        i15 |= 8;
                        break;
                    case 4:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, IntSerializer.INSTANCE, num3);
                        i15 |= 16;
                        break;
                    case 5:
                        map2 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), map2);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement4;
            z13 = zDecodeBooleanElement6;
            i13 = i15;
            z14 = zDecodeBooleanElement5;
            healthspanResponse = healthspanResponse3;
            num = num3;
            map = map2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HealthspanDomainResult.Success(i13, healthspanResponse, z14, z13, z4, num, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HealthspanDomainResult.Success value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HealthspanDomainResult.Success.write$Self$healthspan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
