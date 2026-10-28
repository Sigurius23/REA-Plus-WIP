package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class CurrentCycleTileModel$$serializer implements GeneratedSerializer<CurrentCycleTileModel> {
    public static final int $stable;
    public static final CurrentCycleTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        CurrentCycleTileModel$$serializer currentCycleTileModel$$serializer = new CurrentCycleTileModel$$serializer();
        INSTANCE = currentCycleTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CurrentCycleTileModel", currentCycleTileModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("titleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("bottomLabels", false);
        pluginGeneratedSerialDescriptor.addElement("buttons", false);
        pluginGeneratedSerialDescriptor.addElement("currentCycleGraphs", false);
        pluginGeneratedSerialDescriptor.addElement("lastSixCycleGraphs", false);
        pluginGeneratedSerialDescriptor.addElement("segmentedControlDisplays", false);
        pluginGeneratedSerialDescriptor.addElement("selectedButtonId", false);
        pluginGeneratedSerialDescriptor.addElement("segmentedControlDisplayId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CurrentCycleTileModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = CurrentCycleTileModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), interfaceC23462hArr[3].getValue(), interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), interfaceC23462hArr[6].getValue(), stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final CurrentCycleTileModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        Map map;
        Map map2;
        List list2;
        String str;
        String str2;
        Map map3;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = CurrentCycleTileModel.$childSerializers;
        int i14 = 7;
        int i15 = 4;
        String strDecodeStringElement3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            Map map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            Map map5 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            Map map6 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = strDecodeStringElement4;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            i13 = 511;
            map = map6;
            list2 = list3;
            map2 = map5;
            map3 = map4;
            str2 = strDecodeStringElement5;
        } else {
            int i16 = 3;
            boolean z4 = true;
            int i17 = 0;
            List list4 = null;
            Map map7 = null;
            Map map8 = null;
            List list5 = null;
            String strDecodeStringElement6 = null;
            Map map9 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int i18 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 4;
                        i16 = 3;
                        break;
                    case 0:
                        i17 |= 1;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 7;
                        i15 = 4;
                        i16 = 3;
                        break;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i14 = 7;
                        i15 = 4;
                        i16 = 3;
                        break;
                    case 2:
                        map9 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), map9);
                        i17 |= 4;
                        i14 = 7;
                        i15 = 4;
                        i16 = 3;
                        break;
                    case 3:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list5);
                        i17 |= 8;
                        i14 = 7;
                        i15 = 4;
                        break;
                    case 4:
                        map8 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), map8);
                        i17 |= 16;
                        i15 = i18;
                        i14 = 7;
                        break;
                    case 5:
                        map7 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), map7);
                        i17 |= 32;
                        i15 = i18;
                        break;
                    case 6:
                        list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), list4);
                        i17 |= 64;
                        i15 = i18;
                        break;
                    case 7:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i17 |= 128;
                        i15 = i18;
                        break;
                    case 8:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i17 |= 256;
                        i15 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            list = list4;
            map = map7;
            map2 = map8;
            list2 = list5;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement6;
            map3 = map9;
            strDecodeStringElement = strDecodeStringElement7;
            strDecodeStringElement2 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new CurrentCycleTileModel(i13, str, str2, map3, list2, map2, map, list, strDecodeStringElement, strDecodeStringElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, CurrentCycleTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        CurrentCycleTileModel.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
