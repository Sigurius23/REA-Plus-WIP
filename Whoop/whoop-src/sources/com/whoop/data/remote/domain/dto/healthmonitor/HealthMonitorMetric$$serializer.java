package com.whoop.data.remote.domain.dto.healthmonitor;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HealthMonitorMetric$$serializer implements GeneratedSerializer<HealthMonitorMetric> {
    public static final HealthMonitorMetric$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HealthMonitorMetric$$serializer healthMonitorMetric$$serializer = new HealthMonitorMetric$$serializer();
        INSTANCE = healthMonitorMetric$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.data.remote.domain.dto.healthmonitor.HealthMonitorMetric", healthMonitorMetric$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("current_value", false);
        pluginGeneratedSerialDescriptor.addElement("current_deviation", false);
        pluginGeneratedSerialDescriptor.addElement("metric", false);
        pluginGeneratedSerialDescriptor.addElement("range_calibrating", false);
        pluginGeneratedSerialDescriptor.addElement("alert_type", false);
        pluginGeneratedSerialDescriptor.addElement("alert_status", false);
        pluginGeneratedSerialDescriptor.addElement("ranges", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HealthMonitorMetric$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HealthMonitorMetric.$childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(doubleSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(doubleSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, interfaceC37138cM122336d2, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HealthMonitorMetric deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        String str;
        Double d3;
        Double d14;
        String str2;
        Boolean bool;
        String str3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HealthMonitorMetric.$childSerializers;
        int i14 = 5;
        Double d15 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d16 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, doubleSerializer, null);
            Double d17 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, doubleSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, BooleanSerializer.INSTANCE, null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            d14 = d17;
            str = str6;
            bool = bool2;
            str3 = str5;
            str2 = str4;
            i13 = 127;
            d3 = d16;
        } else {
            boolean z4 = true;
            int i15 = 0;
            List list2 = null;
            String str7 = null;
            Double d18 = null;
            String str8 = null;
            Boolean bool3 = null;
            String str9 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        d15 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, DoubleSerializer.INSTANCE, d15);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        d18 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, DoubleSerializer.INSTANCE, d18);
                        i15 |= 2;
                        i14 = 5;
                        break;
                    case 2:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str8);
                        i15 |= 4;
                        i14 = 5;
                        break;
                    case 3:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, BooleanSerializer.INSTANCE, bool3);
                        i15 |= 8;
                        break;
                    case 4:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str9);
                        i15 |= 16;
                        break;
                    case 5:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str7);
                        i15 |= 32;
                        break;
                    case 6:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list2);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            list = list2;
            str = str7;
            d3 = d15;
            d14 = d18;
            str2 = str8;
            bool = bool3;
            str3 = str9;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HealthMonitorMetric(i13, d3, d14, str2, bool, str3, str, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HealthMonitorMetric value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HealthMonitorMetric.write$Self$core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
