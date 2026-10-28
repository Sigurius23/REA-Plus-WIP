package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import java.util.List;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SymptomsScreenResponse$$serializer implements GeneratedSerializer<SymptomsScreenResponse> {
    public static final int $stable;
    public static final SymptomsScreenResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SymptomsScreenResponse$$serializer symptomsScreenResponse$$serializer = new SymptomsScreenResponse$$serializer();
        INSTANCE = symptomsScreenResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsScreenResponse", symptomsScreenResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("navigationTitle", false);
        pluginGeneratedSerialDescriptor.addElement("segmentedControlDisplays", false);
        pluginGeneratedSerialDescriptor.addElement("currentCycleSegment", false);
        pluginGeneratedSerialDescriptor.addElement("lastThreeCyclesSegment", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SymptomsScreenResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = SymptomsScreenResponse.$childSerializers;
        SymptomsSegmentModel$$serializer symptomsSegmentModel$$serializer = SymptomsSegmentModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, interfaceC23462hArr[1].getValue(), symptomsSegmentModel$$serializer, symptomsSegmentModel$$serializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SymptomsScreenResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        List list;
        SymptomsSegmentModel symptomsSegmentModel;
        SymptomsSegmentModel symptomsSegmentModel2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = SymptomsScreenResponse.$childSerializers;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            SymptomsSegmentModel$$serializer symptomsSegmentModel$$serializer = SymptomsSegmentModel$$serializer.INSTANCE;
            SymptomsSegmentModel symptomsSegmentModel3 = (SymptomsSegmentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, symptomsSegmentModel$$serializer, null);
            list = list2;
            str = strDecodeStringElement2;
            symptomsSegmentModel2 = (SymptomsSegmentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, symptomsSegmentModel$$serializer, null);
            symptomsSegmentModel = symptomsSegmentModel3;
            i13 = 15;
        } else {
            boolean z4 = true;
            int i14 = 0;
            List list3 = null;
            SymptomsSegmentModel symptomsSegmentModel4 = null;
            SymptomsSegmentModel symptomsSegmentModel5 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), list3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    symptomsSegmentModel4 = (SymptomsSegmentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, SymptomsSegmentModel$$serializer.INSTANCE, symptomsSegmentModel4);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    symptomsSegmentModel5 = (SymptomsSegmentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, SymptomsSegmentModel$$serializer.INSTANCE, symptomsSegmentModel5);
                    i14 |= 8;
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            list = list3;
            symptomsSegmentModel = symptomsSegmentModel4;
            symptomsSegmentModel2 = symptomsSegmentModel5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SymptomsScreenResponse(i13, str, list, symptomsSegmentModel, symptomsSegmentModel2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SymptomsScreenResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SymptomsScreenResponse.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
