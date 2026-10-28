package com.whoop.weeklyplan.hubandspoke.domain.models;

import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.HorizontalStatModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MetricCardModel$$serializer implements GeneratedSerializer<MetricCardModel> {
    public static final int $stable;
    public static final MetricCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MetricCardModel$$serializer metricCardModel$$serializer = new MetricCardModel$$serializer();
        INSTANCE = metricCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.hubandspoke.domain.models.MetricCardModel", metricCardModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("goalTypeId", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("leftIcon", false);
        pluginGeneratedSerialDescriptor.addElement("rightIcon", false);
        pluginGeneratedSerialDescriptor.addElement("barStyles", false);
        pluginGeneratedSerialDescriptor.addElement("horizontalStatAvg", false);
        pluginGeneratedSerialDescriptor.addElement("horizontalStatGoal", false);
        pluginGeneratedSerialDescriptor.addElement("recommendationText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MetricCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = MetricCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue());
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        HorizontalStatModel$$serializer horizontalStatModel$$serializer = HorizontalStatModel$$serializer.INSTANCE;
        return new InterfaceC37138c[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, horizontalStatModel$$serializer, horizontalStatModel$$serializer, interfaceC37138cM122336d3};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MetricCardModel deserialize(InterfaceC40541d decoder) {
        int iDecodeIntElement;
        String str;
        HorizontalStatModel horizontalStatModel;
        HorizontalStatModel horizontalStatModel2;
        List list;
        int i13;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = MetricCardModel.$childSerializers;
        int i14 = 7;
        int i15 = 4;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            HorizontalStatModel$$serializer horizontalStatModel$$serializer = HorizontalStatModel$$serializer.INSTANCE;
            HorizontalStatModel horizontalStatModel3 = (HorizontalStatModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, horizontalStatModel$$serializer, null);
            HorizontalStatModel horizontalStatModel4 = (HorizontalStatModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, horizontalStatModel$$serializer, null);
            list = list2;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            horizontalStatModel = horizontalStatModel4;
            horizontalStatModel2 = horizontalStatModel3;
            str4 = str5;
            str3 = strDecodeStringElement2;
            i13 = 255;
            str2 = strDecodeStringElement;
        } else {
            boolean z4 = true;
            iDecodeIntElement = 0;
            String str6 = null;
            HorizontalStatModel horizontalStatModel5 = null;
            HorizontalStatModel horizontalStatModel6 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str7 = null;
            int i16 = 0;
            List list3 = null;
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
                        iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 0);
                        i14 = 7;
                        i15 = 4;
                        break;
                    case 1:
                        i16 |= 2;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 7;
                        i15 = 4;
                        break;
                    case 2:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        i14 = 7;
                        i15 = 4;
                        break;
                    case 3:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str7);
                        i16 |= 8;
                        i14 = 7;
                        i15 = 4;
                        break;
                    case 4:
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list3);
                        i16 |= 16;
                        i15 = i17;
                        i14 = 7;
                        break;
                    case 5:
                        horizontalStatModel6 = (HorizontalStatModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, HorizontalStatModel$$serializer.INSTANCE, horizontalStatModel6);
                        i16 |= 32;
                        i15 = i17;
                        break;
                    case 6:
                        horizontalStatModel5 = (HorizontalStatModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, HorizontalStatModel$$serializer.INSTANCE, horizontalStatModel5);
                        i16 |= 64;
                        i15 = i17;
                        break;
                    case 7:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str6);
                        i16 |= 128;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str6;
            horizontalStatModel = horizontalStatModel5;
            horizontalStatModel2 = horizontalStatModel6;
            list = list3;
            i13 = i16;
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
            str4 = str7;
        }
        int i18 = iDecodeIntElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MetricCardModel(i13, i18, str2, str3, str4, list, horizontalStatModel2, horizontalStatModel, str, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MetricCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MetricCardModel.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
