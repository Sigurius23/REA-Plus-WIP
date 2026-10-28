package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import z51.EnumC40100k;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ExplainerGaugeModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ExplainerGaugeModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ExplainerGaugeModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ExplainerGaugeModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ExplainerGaugeModel$$serializer implements GeneratedSerializer<ExplainerGaugeModel> {
    public static final int $stable;
    public static final ExplainerGaugeModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ExplainerGaugeModel$$serializer explainerGaugeModel$$serializer = new ExplainerGaugeModel$$serializer();
        INSTANCE = explainerGaugeModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ExplainerGaugeModel", explainerGaugeModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("optimalStrainPercent", false);
        pluginGeneratedSerialDescriptor.addElement("lowerOptimalStrainFillValue", false);
        pluginGeneratedSerialDescriptor.addElement("higherOptimalStrainFillValue", false);
        pluginGeneratedSerialDescriptor.addElement("recoveryPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("recoveryLevel", false);
        pluginGeneratedSerialDescriptor.addElement("strainScorePercentage", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionText", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionSubText", false);
        pluginGeneratedSerialDescriptor.addElement("hasDivider", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ExplainerGaugeModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ExplainerGaugeModel.$childSerializers;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{floatSerializer, floatSerializer, floatSerializer, floatSerializer, interfaceC23462hArr[4].getValue(), floatSerializer, c25452a, c25452a, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ExplainerGaugeModel deserialize(InterfaceC40541d decoder) {
        float fDecodeFloatElement;
        TextResource textResource;
        TextResource textResource2;
        EnumC40100k enumC40100k;
        int i13;
        float f13;
        float f14;
        boolean zDecodeBooleanElement;
        float f15;
        float f16;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ExplainerGaugeModel.$childSerializers;
        int i15 = 7;
        int i16 = 4;
        int i17 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 0);
            float fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 1);
            float fDecodeFloatElement3 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 2);
            float fDecodeFloatElement4 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 3);
            EnumC40100k enumC40100k2 = (EnumC40100k) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            float fDecodeFloatElement5 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, c25452a, null);
            enumC40100k = enumC40100k2;
            textResource = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, c25452a, null);
            textResource2 = textResource3;
            f13 = fDecodeFloatElement5;
            f14 = fDecodeFloatElement4;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
            f15 = fDecodeFloatElement3;
            i13 = 511;
            f16 = fDecodeFloatElement2;
        } else {
            fDecodeFloatElement = 0.0f;
            float fDecodeFloatElement6 = 0.0f;
            float fDecodeFloatElement7 = 0.0f;
            float fDecodeFloatElement8 = 0.0f;
            boolean z4 = true;
            boolean zDecodeBooleanElement2 = false;
            TextResource textResource4 = null;
            TextResource textResource5 = null;
            EnumC40100k enumC40100k3 = null;
            float fDecodeFloatElement9 = 0.0f;
            while (z4) {
                int i18 = i16;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 7;
                        i16 = 4;
                        break;
                    case 0:
                        i17 |= 1;
                        fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 0);
                        i15 = 7;
                        i16 = 4;
                        break;
                    case 1:
                        fDecodeFloatElement8 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i15 = 7;
                        i16 = 4;
                        break;
                    case 2:
                        fDecodeFloatElement7 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i15 = 7;
                        i16 = 4;
                        break;
                    case 3:
                        i14 = i18;
                        fDecodeFloatElement6 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i16 = i14;
                        i15 = 7;
                        break;
                    case 4:
                        i14 = i18;
                        enumC40100k3 = (EnumC40100k) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), enumC40100k3);
                        i17 |= 16;
                        i16 = i14;
                        i15 = 7;
                        break;
                    case 5:
                        fDecodeFloatElement9 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
                        i17 |= 32;
                        i16 = i18;
                        break;
                    case 6:
                        textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, C25452a.f99689a, textResource5);
                        i17 |= 64;
                        i16 = i18;
                        break;
                    case 7:
                        textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, C25452a.f99689a, textResource4);
                        i17 |= 128;
                        i16 = i18;
                        break;
                    case 8:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
                        i17 |= 256;
                        i16 = i18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource4;
            textResource2 = textResource5;
            enumC40100k = enumC40100k3;
            i13 = i17;
            f13 = fDecodeFloatElement9;
            f14 = fDecodeFloatElement6;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            f15 = fDecodeFloatElement7;
            f16 = fDecodeFloatElement8;
        }
        float f17 = fDecodeFloatElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ExplainerGaugeModel(i13, f17, f16, f15, f14, enumC40100k, f13, textResource2, textResource, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ExplainerGaugeModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ExplainerGaugeModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
