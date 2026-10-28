package com.whoop.impacts.impacts.domain.requests;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class BehaviorImpactResponse$$serializer implements GeneratedSerializer<BehaviorImpactResponse> {
    public static final int $stable;
    public static final BehaviorImpactResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BehaviorImpactResponse$$serializer behaviorImpactResponse$$serializer = new BehaviorImpactResponse$$serializer();
        INSTANCE = behaviorImpactResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.impacts.impacts.domain.requests.BehaviorImpactResponse", behaviorImpactResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("tiles", false);
        pluginGeneratedSerialDescriptor.addElement("journalEnabled", false);
        pluginGeneratedSerialDescriptor.addElement("cycleId", false);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BehaviorImpactResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{BehaviorImpactHeader$$serializer.INSTANCE, BehaviorImpactResponse.$childSerializers[1].getValue(), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(LongSerializer.INSTANCE), AbstractC38195a.m122336d(MetaData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BehaviorImpactResponse deserialize(InterfaceC40541d decoder) {
        boolean z4;
        int i13;
        BehaviorImpactHeader behaviorImpactHeader;
        List list;
        Long l7;
        MetaData metaData;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = BehaviorImpactResponse.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            BehaviorImpactHeader behaviorImpactHeader2 = (BehaviorImpactHeader) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, BehaviorImpactHeader$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
            list = list2;
            behaviorImpactHeader = behaviorImpactHeader2;
            l7 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, LongSerializer.INSTANCE, null);
            metaData = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, MetaData$$serializer.INSTANCE, null);
            z4 = zDecodeBooleanElement;
            i13 = 31;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            BehaviorImpactHeader behaviorImpactHeader3 = null;
            List list3 = null;
            Long l12 = null;
            MetaData metaData2 = null;
            int i14 = 0;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z13 = false;
                } else if (iDecodeElementIndex == 0) {
                    behaviorImpactHeader3 = (BehaviorImpactHeader) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, BehaviorImpactHeader$$serializer.INSTANCE, behaviorImpactHeader3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), list3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 2);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, LongSerializer.INSTANCE, l12);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    metaData2 = (MetaData) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, MetaData$$serializer.INSTANCE, metaData2);
                    i14 |= 16;
                }
            }
            z4 = zDecodeBooleanElement2;
            i13 = i14;
            behaviorImpactHeader = behaviorImpactHeader3;
            list = list3;
            l7 = l12;
            metaData = metaData2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BehaviorImpactResponse(i13, behaviorImpactHeader, list, z4, l7, metaData, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BehaviorImpactResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BehaviorImpactResponse.write$Self$behavior_impact_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
