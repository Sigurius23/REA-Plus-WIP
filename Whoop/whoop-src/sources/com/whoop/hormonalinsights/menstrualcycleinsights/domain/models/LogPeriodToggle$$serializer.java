package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import java.util.Map;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class LogPeriodToggle$$serializer implements GeneratedSerializer<LogPeriodToggle> {
    public static final int $stable;
    public static final LogPeriodToggle$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        LogPeriodToggle$$serializer logPeriodToggle$$serializer = new LogPeriodToggle$$serializer();
        INSTANCE = logPeriodToggle$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogPeriodToggle", logPeriodToggle$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("toggleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("toggleType", false);
        pluginGeneratedSerialDescriptor.addElement("selectedStyle", false);
        pluginGeneratedSerialDescriptor.addElement("sliderDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("sliderOptions", false);
        pluginGeneratedSerialDescriptor.addElement("toggled", false);
        pluginGeneratedSerialDescriptor.addElement("selectedSliderOption", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LogPeriodToggle$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = LogPeriodToggle.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC23462hArr[1].getValue(), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(DoubleSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final LogPeriodToggle deserialize(InterfaceC40541d decoder) {
        boolean z4;
        Double d3;
        Map map;
        int i13;
        String str;
        JournalToggleType journalToggleType;
        String str2;
        String str3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = LogPeriodToggle.$childSerializers;
        int i14 = 6;
        int i15 = 5;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            JournalToggleType journalToggleType2 = (JournalToggleType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, null);
            Map map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            map = map2;
            str = strDecodeStringElement;
            d3 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, DoubleSerializer.INSTANCE, null);
            z4 = zDecodeBooleanElement;
            str3 = str4;
            str2 = strDecodeStringElement2;
            i13 = 127;
            journalToggleType = journalToggleType2;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            Double d14 = null;
            String strDecodeStringElement3 = null;
            JournalToggleType journalToggleType3 = null;
            String strDecodeStringElement4 = null;
            String str5 = null;
            int i16 = 0;
            Map map3 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 6;
                        break;
                    case 0:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 1:
                        journalToggleType3 = (JournalToggleType) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), journalToggleType3);
                        i16 |= 2;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 2:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        break;
                    case 3:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str5);
                        i16 |= 8;
                        break;
                    case 4:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), map3);
                        i16 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i15);
                        i16 |= 32;
                        break;
                    case 6:
                        d14 = (Double) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, DoubleSerializer.INSTANCE, d14);
                        i16 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            d3 = d14;
            map = map3;
            i13 = i16;
            str = strDecodeStringElement3;
            journalToggleType = journalToggleType3;
            str2 = strDecodeStringElement4;
            str3 = str5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new LogPeriodToggle(i13, str, journalToggleType, str2, str3, map, z4, d3, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, LogPeriodToggle value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        LogPeriodToggle.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
