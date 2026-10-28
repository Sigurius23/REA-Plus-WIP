package com.whoop.user.journey.model.yearinreview.chronologicalsection;

import com.whoop.design.models.items.ScoreGaugeDialModel;
import com.whoop.design.models.items.ScoreGaugeDialModel$$serializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class YearInReviewCardModel$$serializer implements GeneratedSerializer<YearInReviewCardModel> {
    public static final int $stable;
    public static final YearInReviewCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        YearInReviewCardModel$$serializer yearInReviewCardModel$$serializer = new YearInReviewCardModel$$serializer();
        INSTANCE = yearInReviewCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.user.journey.model.yearinreview.chronologicalsection.YearInReviewCardModel", yearInReviewCardModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        pluginGeneratedSerialDescriptor.addElement("scoreGaugeDial", false);
        pluginGeneratedSerialDescriptor.addElement("cardItems", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private YearInReviewCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = YearInReviewCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(ScoreGaugeDialModel$$serializer.INSTANCE), interfaceC23462hArr[5].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final YearInReviewCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        ScoreGaugeDialModel scoreGaugeDialModel;
        List list;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = YearInReviewCardModel.$childSerializers;
        int i14 = 3;
        String str5 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            ScoreGaugeDialModel scoreGaugeDialModel2 = (ScoreGaugeDialModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, ScoreGaugeDialModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            str4 = str8;
            scoreGaugeDialModel = scoreGaugeDialModel2;
            i13 = 63;
            str3 = str7;
            str2 = strDecodeStringElement;
            str = str6;
        } else {
            boolean z4 = true;
            int i15 = 0;
            String strDecodeStringElement2 = null;
            String str9 = null;
            String str10 = null;
            ScoreGaugeDialModel scoreGaugeDialModel3 = null;
            List list2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 3;
                        break;
                    case 0:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str5);
                        i15 |= 1;
                        i14 = 3;
                        break;
                    case 1:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str9);
                        i15 |= 4;
                        break;
                    case 3:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str10);
                        i15 |= 8;
                        break;
                    case 4:
                        scoreGaugeDialModel3 = (ScoreGaugeDialModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, ScoreGaugeDialModel$$serializer.INSTANCE, scoreGaugeDialModel3);
                        i15 |= 16;
                        break;
                    case 5:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), list2);
                        i15 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            str = str5;
            str2 = strDecodeStringElement2;
            str3 = str9;
            str4 = str10;
            scoreGaugeDialModel = scoreGaugeDialModel3;
            list = list2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new YearInReviewCardModel(i13, str, str2, str3, str4, scoreGaugeDialModel, list, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, YearInReviewCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        YearInReviewCardModel.write$Self$user_journey_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
