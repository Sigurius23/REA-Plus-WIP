package com.whoop.design.models.items.graph;

import com.whoop.design.models.items.graph.stress.StressState;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/graph/StressGraphingCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StressGraphingCardModel$$serializer implements GeneratedSerializer<StressGraphingCardModel> {
    public static final int $stable;
    public static final StressGraphingCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StressGraphingCardModel$$serializer stressGraphingCardModel$$serializer = new StressGraphingCardModel$$serializer();
        INSTANCE = stressGraphingCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.graph.StressGraphingCardModel", stressGraphingCardModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("graph", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("lastUpdatedText", false);
        pluginGeneratedSerialDescriptor.addElement("stressGraphVowDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("stressGraphState", false);
        pluginGeneratedSerialDescriptor.addElement("stressGraphLabel", false);
        pluginGeneratedSerialDescriptor.addElement("stressGraphScore", false);
        pluginGeneratedSerialDescriptor.addElement("size", false);
        pluginGeneratedSerialDescriptor.addElement("subItems", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StressGraphingCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = StressGraphingCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{GraphModel$$serializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[6].getValue(), stringSerializer, stringSerializer, interfaceC23462hArr[9].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StressGraphingCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        List list;
        StressState stressState;
        String str;
        String str2;
        String str3;
        StressGraphingCardSize stressGraphingCardSize;
        String str4;
        String str5;
        GraphModel graphModel;
        String str6;
        String str7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = StressGraphingCardModel.$childSerializers;
        int i14 = 10;
        GraphModel graphModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            GraphModel graphModel3 = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, GraphModel$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            StressState stressState2 = (StressState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            StressGraphingCardSize stressGraphingCardSize2 = (StressGraphingCardSize) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            graphModel = graphModel3;
            str6 = strDecodeStringElement;
            str2 = str12;
            str3 = str10;
            str7 = strDecodeStringElement2;
            str = str11;
            str4 = str9;
            i13 = 2047;
            stressGraphingCardSize = stressGraphingCardSize2;
            stressState = stressState2;
            str5 = str8;
        } else {
            int i15 = 6;
            boolean z4 = true;
            int i16 = 0;
            List list2 = null;
            StressState stressState3 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            StressGraphingCardSize stressGraphingCardSize3 = null;
            String str16 = null;
            String str17 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 10;
                        i15 = 6;
                        break;
                    case 0:
                        graphModel2 = (GraphModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, GraphModel$$serializer.INSTANCE, graphModel2);
                        i16 |= 1;
                        i14 = 10;
                        i15 = 6;
                        break;
                    case 1:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str17);
                        i16 |= 2;
                        i14 = 10;
                        i15 = 6;
                        break;
                    case 2:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str16);
                        i16 |= 4;
                        i14 = 10;
                        i15 = 6;
                        break;
                    case 3:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str15);
                        i16 |= 8;
                        i14 = 10;
                        i15 = 6;
                        break;
                    case 4:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str13);
                        i16 |= 16;
                        i14 = 10;
                        i15 = 6;
                        break;
                    case 5:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str14);
                        i16 |= 32;
                        i14 = 10;
                        i15 = 6;
                        break;
                    case 6:
                        stressState3 = (StressState) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), stressState3);
                        i16 |= 64;
                        i14 = 10;
                        break;
                    case 7:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i16 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i16 |= 256;
                        break;
                    case 9:
                        stressGraphingCardSize3 = (StressGraphingCardSize) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), stressGraphingCardSize3);
                        i16 |= 512;
                        break;
                    case 10:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i14].getValue(), list2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            list = list2;
            stressState = stressState3;
            str = str13;
            str2 = str14;
            str3 = str15;
            stressGraphingCardSize = stressGraphingCardSize3;
            str4 = str16;
            str5 = str17;
            graphModel = graphModel2;
            str6 = strDecodeStringElement3;
            str7 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StressGraphingCardModel(i13, graphModel, str5, str4, str3, str, str2, stressState, str6, str7, stressGraphingCardSize, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StressGraphingCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StressGraphingCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
