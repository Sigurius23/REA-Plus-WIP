package com.whoop.design.models.items;

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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/DataHighlightModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/DataHighlightModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/DataHighlightModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/DataHighlightModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class DataHighlightModel$$serializer implements GeneratedSerializer<DataHighlightModel> {
    public static final int $stable;
    public static final DataHighlightModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        DataHighlightModel$$serializer dataHighlightModel$$serializer = new DataHighlightModel$$serializer();
        INSTANCE = dataHighlightModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.DataHighlightModel", dataHighlightModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("sticky_score_gauges", false);
        pluginGeneratedSerialDescriptor.addElement("streaksDivider", false);
        pluginGeneratedSerialDescriptor.addElement("streaks", false);
        pluginGeneratedSerialDescriptor.addElement("notableStatsDivider", false);
        pluginGeneratedSerialDescriptor.addElement("notableStats", false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DataHighlightModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = DataHighlightModel.$childSerializers;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(ScoreGaugeRowModel$$serializer.INSTANCE);
        DividerModel$$serializer dividerModel$$serializer = DividerModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, AbstractC38195a.m122336d(dividerModel$$serializer), AbstractC38195a.m122336d(StreaksContainer$$serializer.INSTANCE), AbstractC38195a.m122336d(dividerModel$$serializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue()), AbstractC38195a.m122336d(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final DataHighlightModel deserialize(InterfaceC40541d decoder) {
        int i13;
        ScoreGaugeRowModel scoreGaugeRowModel;
        DividerModel dividerModel;
        StreaksContainer streaksContainer;
        DividerModel dividerModel2;
        List list;
        String str;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = DataHighlightModel.$childSerializers;
        int i14 = 5;
        ScoreGaugeRowModel scoreGaugeRowModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            ScoreGaugeRowModel scoreGaugeRowModel3 = (ScoreGaugeRowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, ScoreGaugeRowModel$$serializer.INSTANCE, null);
            DividerModel$$serializer dividerModel$$serializer = DividerModel$$serializer.INSTANCE;
            DividerModel dividerModel3 = (DividerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, dividerModel$$serializer, null);
            StreaksContainer streaksContainer2 = (StreaksContainer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StreaksContainer$$serializer.INSTANCE, null);
            DividerModel dividerModel4 = (DividerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, dividerModel$$serializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            scoreGaugeRowModel = scoreGaugeRowModel3;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, null);
            dividerModel2 = dividerModel4;
            streaksContainer = streaksContainer2;
            i13 = 63;
            dividerModel = dividerModel3;
        } else {
            boolean z4 = true;
            int i15 = 0;
            DividerModel dividerModel5 = null;
            StreaksContainer streaksContainer3 = null;
            DividerModel dividerModel6 = null;
            List list2 = null;
            String str2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 5;
                        break;
                    case 0:
                        scoreGaugeRowModel2 = (ScoreGaugeRowModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, ScoreGaugeRowModel$$serializer.INSTANCE, scoreGaugeRowModel2);
                        i15 |= 1;
                        i14 = 5;
                        break;
                    case 1:
                        dividerModel5 = (DividerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, DividerModel$$serializer.INSTANCE, dividerModel5);
                        i15 |= 2;
                        break;
                    case 2:
                        streaksContainer3 = (StreaksContainer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StreaksContainer$$serializer.INSTANCE, streaksContainer3);
                        i15 |= 4;
                        break;
                    case 3:
                        dividerModel6 = (DividerModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, DividerModel$$serializer.INSTANCE, dividerModel6);
                        i15 |= 8;
                        break;
                    case 4:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), list2);
                        i15 |= 16;
                        break;
                    case 5:
                        str2 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str2);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            scoreGaugeRowModel = scoreGaugeRowModel2;
            dividerModel = dividerModel5;
            streaksContainer = streaksContainer3;
            dividerModel2 = dividerModel6;
            list = list2;
            str = str2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new DataHighlightModel(i13, scoreGaugeRowModel, dividerModel, streaksContainer, dividerModel2, list, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, DataHighlightModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        DataHighlightModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
