package com.whoop.design.models.items;

import java.util.List;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/BiomarkerPieChartSectionModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class BiomarkerPieChartSectionModel$$serializer implements GeneratedSerializer<BiomarkerPieChartSectionModel> {
    public static final int $stable;
    public static final BiomarkerPieChartSectionModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BiomarkerPieChartSectionModel$$serializer biomarkerPieChartSectionModel$$serializer = new BiomarkerPieChartSectionModel$$serializer();
        INSTANCE = biomarkerPieChartSectionModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.BiomarkerPieChartSectionModel", biomarkerPieChartSectionModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("orientation", false);
        pluginGeneratedSerialDescriptor.addElement("pieChart", false);
        pluginGeneratedSerialDescriptor.addElement("pieChartContent", false);
        pluginGeneratedSerialDescriptor.addElement("trendCounts", false);
        pluginGeneratedSerialDescriptor.addElement("caption", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("biomarkers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BiomarkerPieChartSectionModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = BiomarkerPieChartSectionModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, PieChartModel$$serializer.INSTANCE, BiomarkerPieChartContentModel$$serializer.INSTANCE, interfaceC23462hArr[4].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BiomarkerPieChartSectionModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        String str;
        String str2;
        List list2;
        String str3;
        String str4;
        PieChartModel pieChartModel;
        BiomarkerPieChartContentModel biomarkerPieChartContentModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = BiomarkerPieChartSectionModel.$childSerializers;
        int i14 = 6;
        int i15 = 4;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            PieChartModel pieChartModel2 = (PieChartModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, PieChartModel$$serializer.INSTANCE, null);
            BiomarkerPieChartContentModel biomarkerPieChartContentModel2 = (BiomarkerPieChartContentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, BiomarkerPieChartContentModel$$serializer.INSTANCE, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            str3 = strDecodeStringElement2;
            str = str6;
            str2 = str5;
            biomarkerPieChartContentModel = biomarkerPieChartContentModel2;
            pieChartModel = pieChartModel2;
            i13 = 255;
            list2 = list3;
            str4 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i16 = 0;
            List list4 = null;
            String str7 = null;
            String str8 = null;
            List list5 = null;
            String strDecodeStringElement4 = null;
            PieChartModel pieChartModel3 = null;
            BiomarkerPieChartContentModel biomarkerPieChartContentModel3 = null;
            while (z4) {
                int i17 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 4;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 6;
                        i15 = 4;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 6;
                        i15 = 4;
                        break;
                    case 2:
                        pieChartModel3 = (PieChartModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, PieChartModel$$serializer.INSTANCE, pieChartModel3);
                        i16 |= 4;
                        i14 = 6;
                        i15 = 4;
                        break;
                    case 3:
                        biomarkerPieChartContentModel3 = (BiomarkerPieChartContentModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, BiomarkerPieChartContentModel$$serializer.INSTANCE, biomarkerPieChartContentModel3);
                        i16 |= 8;
                        i14 = 6;
                        i15 = 4;
                        break;
                    case 4:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list5);
                        i16 |= 16;
                        i15 = i17;
                        i14 = 6;
                        break;
                    case 5:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str8);
                        i16 |= 32;
                        i15 = i17;
                        break;
                    case 6:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str7);
                        i16 |= 64;
                        i15 = i17;
                        break;
                    case 7:
                        list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), list4);
                        i16 |= 128;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            list = list4;
            str = str7;
            str2 = str8;
            list2 = list5;
            str3 = strDecodeStringElement;
            str4 = strDecodeStringElement4;
            pieChartModel = pieChartModel3;
            biomarkerPieChartContentModel = biomarkerPieChartContentModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BiomarkerPieChartSectionModel(i13, str3, str4, pieChartModel, biomarkerPieChartContentModel, list2, str2, str, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BiomarkerPieChartSectionModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BiomarkerPieChartSectionModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
