package com.whoop.health.domain.models;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.DailyTickMarkPlotModel$$serializer;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.navigation.C9598e;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/health/domain/models/MenstrualCycleInsightsCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MenstrualCycleInsightsCardModel$$serializer implements GeneratedSerializer<MenstrualCycleInsightsCardModel> {
    public static final int $stable;
    public static final MenstrualCycleInsightsCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MenstrualCycleInsightsCardModel$$serializer menstrualCycleInsightsCardModel$$serializer = new MenstrualCycleInsightsCardModel$$serializer();
        INSTANCE = menstrualCycleInsightsCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.health.domain.models.MenstrualCycleInsightsCardModel", menstrualCycleInsightsCardModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("endIcon", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("graph", false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        pluginGeneratedSerialDescriptor.addElement("logButton", false);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        pluginGeneratedSerialDescriptor.addElement("trend", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MenstrualCycleInsightsCardModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = MenstrualCycleInsightsCardModel.$childSerializers;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(MenstrualCycleInsightsCardFooterModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(CardButtonModel$$serializer.INSTANCE);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue());
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(ImpactModel$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, MenstrualCycleInsightsCardBodyModel$$serializer.INSTANCE, DailyTickMarkPlotModel$$serializer.INSTANCE, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MenstrualCycleInsightsCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        ImpactModel impactModel;
        C9598e c9598e;
        CardButtonModel cardButtonModel;
        MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel;
        String str;
        String str2;
        MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel;
        DailyTickMarkPlotModel dailyTickMarkPlotModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = MenstrualCycleInsightsCardModel.$childSerializers;
        int i14 = 7;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel2 = (MenstrualCycleInsightsCardBodyModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, MenstrualCycleInsightsCardBodyModel$$serializer.INSTANCE, null);
            DailyTickMarkPlotModel dailyTickMarkPlotModel2 = (DailyTickMarkPlotModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, DailyTickMarkPlotModel$$serializer.INSTANCE, null);
            MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel2 = (MenstrualCycleInsightsCardFooterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, MenstrualCycleInsightsCardFooterModel$$serializer.INSTANCE, null);
            CardButtonModel cardButtonModel2 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, CardButtonModel$$serializer.INSTANCE, null);
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = strDecodeStringElement2;
            impactModel = (ImpactModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, ImpactModel$$serializer.INSTANCE, null);
            cardButtonModel = cardButtonModel2;
            dailyTickMarkPlotModel = dailyTickMarkPlotModel2;
            menstrualCycleInsightsCardFooterModel = menstrualCycleInsightsCardFooterModel2;
            menstrualCycleInsightsCardBodyModel = menstrualCycleInsightsCardBodyModel2;
            i13 = 255;
            str2 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i15 = 0;
            ImpactModel impactModel2 = null;
            C9598e c9598e2 = null;
            CardButtonModel cardButtonModel3 = null;
            MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel3 = null;
            String strDecodeStringElement4 = null;
            MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel3 = null;
            DailyTickMarkPlotModel dailyTickMarkPlotModel3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 7;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        menstrualCycleInsightsCardBodyModel3 = (MenstrualCycleInsightsCardBodyModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, MenstrualCycleInsightsCardBodyModel$$serializer.INSTANCE, menstrualCycleInsightsCardBodyModel3);
                        i15 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        dailyTickMarkPlotModel3 = (DailyTickMarkPlotModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, DailyTickMarkPlotModel$$serializer.INSTANCE, dailyTickMarkPlotModel3);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        menstrualCycleInsightsCardFooterModel3 = (MenstrualCycleInsightsCardFooterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, MenstrualCycleInsightsCardFooterModel$$serializer.INSTANCE, menstrualCycleInsightsCardFooterModel3);
                        i15 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        cardButtonModel3 = (CardButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, CardButtonModel$$serializer.INSTANCE, cardButtonModel3);
                        i15 |= 32;
                        break;
                    case 6:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), c9598e2);
                        i15 |= 64;
                        break;
                    case 7:
                        impactModel2 = (ImpactModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, ImpactModel$$serializer.INSTANCE, impactModel2);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            impactModel = impactModel2;
            c9598e = c9598e2;
            cardButtonModel = cardButtonModel3;
            menstrualCycleInsightsCardFooterModel = menstrualCycleInsightsCardFooterModel3;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            menstrualCycleInsightsCardBodyModel = menstrualCycleInsightsCardBodyModel3;
            dailyTickMarkPlotModel = dailyTickMarkPlotModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MenstrualCycleInsightsCardModel(i13, str, str2, menstrualCycleInsightsCardBodyModel, dailyTickMarkPlotModel, menstrualCycleInsightsCardFooterModel, cardButtonModel, c9598e, impactModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MenstrualCycleInsightsCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MenstrualCycleInsightsCardModel.write$Self$health_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
