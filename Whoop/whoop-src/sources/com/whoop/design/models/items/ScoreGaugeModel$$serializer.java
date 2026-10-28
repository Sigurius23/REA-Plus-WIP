package com.whoop.design.models.items;

import com.whoop.navigation.C9598e;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ScoreGaugeModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ScoreGaugeModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ScoreGaugeModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ScoreGaugeModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ScoreGaugeModel$$serializer implements GeneratedSerializer<ScoreGaugeModel> {
    public static final int $stable;
    public static final ScoreGaugeModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ScoreGaugeModel$$serializer scoreGaugeModel$$serializer = new ScoreGaugeModel$$serializer();
        INSTANCE = scoreGaugeModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ScoreGaugeModel", scoreGaugeModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("scoreDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("scoreDisplaySuffix", false);
        pluginGeneratedSerialDescriptor.addElement("scoreDisplayTitle", false);
        pluginGeneratedSerialDescriptor.addElement("scoreTarget", false);
        pluginGeneratedSerialDescriptor.addElement("gaugeFillPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("lowerOptimalPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("higherOptimalPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("progressFillStyle", false);
        pluginGeneratedSerialDescriptor.addElement("barStyles", false);
        pluginGeneratedSerialDescriptor.addElement("scoreDisplayStyle", true);
        pluginGeneratedSerialDescriptor.addElement("destination", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScoreGaugeModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ScoreGaugeModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new InterfaceC37138c[]{interfaceC37138cM122336d, stringSerializer, interfaceC37138cM122336d2, stringSerializer, AbstractC38195a.m122336d(floatSerializer), floatSerializer, AbstractC38195a.m122336d(floatSerializer), AbstractC38195a.m122336d(floatSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[9].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[10].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[11].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ScoreGaugeModel deserialize(InterfaceC40541d decoder) {
        int i13;
        float f13;
        C9598e c9598e;
        DisplayStyle displayStyle;
        List list;
        Float f14;
        String str;
        Float f15;
        String str2;
        Float f16;
        String str3;
        String str4;
        String str5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ScoreGaugeModel.$childSerializers;
        int i14 = 9;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f17 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, floatSerializer, null);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
            Float f18 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, floatSerializer, null);
            Float f19 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, floatSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            DisplayStyle displayStyle2 = (DisplayStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            i13 = 4095;
            c9598e = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), null);
            str = str8;
            f14 = f19;
            f15 = f18;
            f13 = fDecodeFloatElement;
            str5 = strDecodeStringElement2;
            list = list2;
            f16 = f17;
            str3 = str7;
            displayStyle = displayStyle2;
            str4 = strDecodeStringElement;
            str2 = str6;
        } else {
            float fDecodeFloatElement2 = 0.0f;
            C9598e c9598e2 = null;
            DisplayStyle displayStyle3 = null;
            List list3 = null;
            Float f24 = null;
            String str9 = null;
            Float f25 = null;
            String str10 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean z4 = true;
            Float f26 = null;
            i13 = 0;
            String str11 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 9;
                        break;
                    case 0:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str10);
                        i13 |= 1;
                        i14 = 9;
                        break;
                    case 1:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        i14 = 9;
                        break;
                    case 2:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str11);
                        i13 |= 4;
                        i14 = 9;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i13 |= 8;
                        i14 = 9;
                        break;
                    case 4:
                        f26 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, FloatSerializer.INSTANCE, f26);
                        i13 |= 16;
                        i14 = 9;
                        break;
                    case 5:
                        fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
                        i13 |= 32;
                        i14 = 9;
                        break;
                    case 6:
                        f25 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, FloatSerializer.INSTANCE, f25);
                        i13 |= 64;
                        i14 = 9;
                        break;
                    case 7:
                        f24 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, FloatSerializer.INSTANCE, f24);
                        i13 |= 128;
                        i14 = 9;
                        break;
                    case 8:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str9);
                        i13 |= 256;
                        i14 = 9;
                        break;
                    case 9:
                        int i15 = i14;
                        i14 = i15;
                        list3 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list3);
                        i13 |= 512;
                        break;
                    case 10:
                        displayStyle3 = (DisplayStyle) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), displayStyle3);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i14 = i14;
                        break;
                    case 11:
                        c9598e2 = (C9598e) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, (InterfaceC37137b) interfaceC23462hArr[11].getValue(), c9598e2);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i14 = i14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            f13 = fDecodeFloatElement2;
            c9598e = c9598e2;
            displayStyle = displayStyle3;
            list = list3;
            f14 = f24;
            str = str9;
            f15 = f25;
            str2 = str10;
            f16 = f26;
            str3 = str11;
            str4 = strDecodeStringElement3;
            str5 = strDecodeStringElement4;
        }
        int i16 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ScoreGaugeModel(i16, str2, str4, str3, str5, f16, f13, f15, f14, str, list, displayStyle, c9598e, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ScoreGaugeModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ScoreGaugeModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
