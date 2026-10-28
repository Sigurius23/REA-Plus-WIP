package com.whoop.weightlifting.feature.onerepmax.manualentry.models;

import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class OneRepMaxMeasurementModel$$serializer implements GeneratedSerializer<OneRepMaxMeasurementModel> {
    public static final int $stable;
    public static final OneRepMaxMeasurementModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        OneRepMaxMeasurementModel$$serializer oneRepMaxMeasurementModel$$serializer = new OneRepMaxMeasurementModel$$serializer();
        INSTANCE = oneRepMaxMeasurementModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxMeasurementModel", oneRepMaxMeasurementModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("exerciseSummary", false);
        pluginGeneratedSerialDescriptor.addElement("dateSection", false);
        pluginGeneratedSerialDescriptor.addElement("valueSection", false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        pluginGeneratedSerialDescriptor.addElement("bindings", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateBindings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OneRepMaxMeasurementModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, OneRepMaxExerciseSummary$$serializer.INSTANCE, OneRepMaxDateSection$$serializer.INSTANCE, OneRepMaxValueSection$$serializer.INSTANCE, OneRepMaxFooter$$serializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) OneRepMaxMeasurementModel.$childSerializers[5].getValue()), AbstractC38195a.m122336d(LenientAggregateBindingsSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final OneRepMaxMeasurementModel deserialize(InterfaceC40541d decoder) {
        int i13;
        Map map;
        Map map2;
        String str;
        OneRepMaxExerciseSummary oneRepMaxExerciseSummary;
        OneRepMaxDateSection oneRepMaxDateSection;
        OneRepMaxValueSection oneRepMaxValueSection;
        OneRepMaxFooter oneRepMaxFooter;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = OneRepMaxMeasurementModel.$childSerializers;
        int i14 = 6;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            OneRepMaxExerciseSummary oneRepMaxExerciseSummary2 = (OneRepMaxExerciseSummary) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, OneRepMaxExerciseSummary$$serializer.INSTANCE, null);
            OneRepMaxDateSection oneRepMaxDateSection2 = (OneRepMaxDateSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, OneRepMaxDateSection$$serializer.INSTANCE, null);
            OneRepMaxValueSection oneRepMaxValueSection2 = (OneRepMaxValueSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, OneRepMaxValueSection$$serializer.INSTANCE, null);
            OneRepMaxFooter oneRepMaxFooter2 = (OneRepMaxFooter) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, OneRepMaxFooter$$serializer.INSTANCE, null);
            map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            str = strDecodeStringElement2;
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, LenientAggregateBindingsSerializer.INSTANCE, null);
            oneRepMaxValueSection = oneRepMaxValueSection2;
            oneRepMaxFooter = oneRepMaxFooter2;
            oneRepMaxDateSection = oneRepMaxDateSection2;
            i13 = 127;
            oneRepMaxExerciseSummary = oneRepMaxExerciseSummary2;
        } else {
            boolean z4 = true;
            int i15 = 0;
            Map map3 = null;
            Map map4 = null;
            OneRepMaxExerciseSummary oneRepMaxExerciseSummary3 = null;
            OneRepMaxDateSection oneRepMaxDateSection3 = null;
            OneRepMaxValueSection oneRepMaxValueSection3 = null;
            OneRepMaxFooter oneRepMaxFooter3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        oneRepMaxExerciseSummary3 = (OneRepMaxExerciseSummary) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, OneRepMaxExerciseSummary$$serializer.INSTANCE, oneRepMaxExerciseSummary3);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        oneRepMaxDateSection3 = (OneRepMaxDateSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, OneRepMaxDateSection$$serializer.INSTANCE, oneRepMaxDateSection3);
                        i15 |= 4;
                        i14 = 6;
                        break;
                    case 3:
                        oneRepMaxValueSection3 = (OneRepMaxValueSection) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, OneRepMaxValueSection$$serializer.INSTANCE, oneRepMaxValueSection3);
                        i15 |= 8;
                        break;
                    case 4:
                        oneRepMaxFooter3 = (OneRepMaxFooter) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, OneRepMaxFooter$$serializer.INSTANCE, oneRepMaxFooter3);
                        i15 |= 16;
                        break;
                    case 5:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), map4);
                        i15 |= 32;
                        break;
                    case 6:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LenientAggregateBindingsSerializer.INSTANCE, map3);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            map = map3;
            map2 = map4;
            str = strDecodeStringElement;
            oneRepMaxExerciseSummary = oneRepMaxExerciseSummary3;
            oneRepMaxDateSection = oneRepMaxDateSection3;
            oneRepMaxValueSection = oneRepMaxValueSection3;
            oneRepMaxFooter = oneRepMaxFooter3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new OneRepMaxMeasurementModel(i13, str, oneRepMaxExerciseSummary, oneRepMaxDateSection, oneRepMaxValueSection, oneRepMaxFooter, map2, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, OneRepMaxMeasurementModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        OneRepMaxMeasurementModel.write$Self$weightlifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
