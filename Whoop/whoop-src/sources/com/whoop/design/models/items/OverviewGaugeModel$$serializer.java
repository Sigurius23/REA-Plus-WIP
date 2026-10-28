package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.TextResource;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/OverviewGaugeModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/OverviewGaugeModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/OverviewGaugeModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/OverviewGaugeModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class OverviewGaugeModel$$serializer implements GeneratedSerializer<OverviewGaugeModel> {
    public static final int $stable;
    public static final OverviewGaugeModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        OverviewGaugeModel$$serializer overviewGaugeModel$$serializer = new OverviewGaugeModel$$serializer();
        INSTANCE = overviewGaugeModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.OverviewGaugeModel", overviewGaugeModel$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("hasSleepPerformance", true);
        pluginGeneratedSerialDescriptor.addElement("recoveryLevel", true);
        pluginGeneratedSerialDescriptor.addElement("recoveryScoreDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("dayStrainDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("sleepPerformanceDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("recoveryScoreGaugeFillPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("dayStrainGaugeFillPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("sleepPerformanceGaugeFillPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("onboarding", true);
        pluginGeneratedSerialDescriptor.addElement("optimalStrainGaugeFillPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("lowerOptimalStrainFillValue", true);
        pluginGeneratedSerialDescriptor.addElement("higherOptimalStrainFillValue", true);
        pluginGeneratedSerialDescriptor.addElement("hrvDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("weeklyPlanGoalStrainGaugeFillPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("weeklyPlanDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("firstCustomGaugeEntry", true);
        pluginGeneratedSerialDescriptor.addElement("secondCustomGaugeEntry", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OverviewGaugeModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(floatSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        CustomGaugeEntryModel$$serializer customGaugeEntryModel$$serializer = CustomGaugeEntryModel$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(customGaugeEntryModel$$serializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(customGaugeEntryModel$$serializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        C25452a c25452a = C25452a.f99689a;
        return new InterfaceC37138c[]{booleanSerializer, stringSerializer, c25452a, c25452a, c25452a, floatSerializer, floatSerializer, floatSerializer, booleanSerializer, floatSerializer, floatSerializer, floatSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final OverviewGaugeModel deserialize(InterfaceC40541d decoder) {
        int i13;
        boolean z4;
        TextResource textResource;
        TextResource textResource2;
        TextResource textResource3;
        CustomGaugeEntryModel customGaugeEntryModel;
        CustomGaugeEntryModel customGaugeEntryModel2;
        String str;
        String str2;
        Float f13;
        String str3;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        boolean z13;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i15 = 11;
        int i16 = 10;
        int i17 = 9;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, c25452a, null);
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, c25452a, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, c25452a, null);
            float fDecodeFloatElement = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
            float fDecodeFloatElement2 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 6);
            float fDecodeFloatElement3 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 7);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
            float fDecodeFloatElement4 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 9);
            float fDecodeFloatElement5 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 10);
            float fDecodeFloatElement6 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 11);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            Float f24 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, FloatSerializer.INSTANCE, null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, stringSerializer, null);
            CustomGaugeEntryModel$$serializer customGaugeEntryModel$$serializer = CustomGaugeEntryModel$$serializer.INSTANCE;
            CustomGaugeEntryModel customGaugeEntryModel3 = (CustomGaugeEntryModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, customGaugeEntryModel$$serializer, null);
            i13 = 131071;
            customGaugeEntryModel = (CustomGaugeEntryModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, customGaugeEntryModel$$serializer, null);
            str = str5;
            str3 = strDecodeStringElement;
            textResource = textResource6;
            f14 = fDecodeFloatElement6;
            f15 = fDecodeFloatElement5;
            f16 = fDecodeFloatElement4;
            f17 = fDecodeFloatElement3;
            f18 = fDecodeFloatElement2;
            f19 = fDecodeFloatElement;
            textResource2 = textResource5;
            z13 = zDecodeBooleanElement2;
            customGaugeEntryModel2 = customGaugeEntryModel3;
            f13 = f24;
            str2 = str4;
            z4 = zDecodeBooleanElement;
            textResource3 = textResource4;
        } else {
            float fDecodeFloatElement7 = 0.0f;
            float fDecodeFloatElement8 = 0.0f;
            float fDecodeFloatElement9 = 0.0f;
            float fDecodeFloatElement10 = 0.0f;
            float fDecodeFloatElement11 = 0.0f;
            float fDecodeFloatElement12 = 0.0f;
            boolean z14 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            TextResource textResource7 = null;
            TextResource textResource8 = null;
            CustomGaugeEntryModel customGaugeEntryModel4 = null;
            CustomGaugeEntryModel customGaugeEntryModel5 = null;
            String str6 = null;
            String str7 = null;
            Float f25 = null;
            String strDecodeStringElement2 = null;
            i13 = 0;
            TextResource textResource9 = null;
            while (z14) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        i13 |= 1;
                        i17 = i17;
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
                        i15 = 11;
                        i16 = 10;
                        break;
                    case 1:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i13 |= 2;
                        i17 = i17;
                        i15 = 11;
                        i16 = 10;
                        break;
                    case 2:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, C25452a.f99689a, textResource9);
                        i13 |= 4;
                        i17 = i17;
                        i15 = 11;
                        i16 = 10;
                        break;
                    case 3:
                        textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource8);
                        i13 |= 8;
                        i17 = i17;
                        i15 = 11;
                        i16 = 10;
                        break;
                    case 4:
                        textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C25452a.f99689a, textResource7);
                        i13 |= 16;
                        i17 = i17;
                        i15 = 11;
                        i16 = 10;
                        break;
                    case 5:
                        fDecodeFloatElement12 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 5);
                        i13 |= 32;
                        i17 = i17;
                        i15 = 11;
                        break;
                    case 6:
                        fDecodeFloatElement11 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 6);
                        i13 |= 64;
                        i17 = i17;
                        i15 = 11;
                        break;
                    case 7:
                        fDecodeFloatElement10 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, 7);
                        i13 |= 128;
                        i17 = i17;
                        i15 = 11;
                        break;
                    case 8:
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 8);
                        i13 |= 256;
                        i17 = i17;
                        i15 = 11;
                        break;
                    case 9:
                        int i18 = i17;
                        fDecodeFloatElement9 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, i18);
                        i13 |= 512;
                        i17 = i18;
                        break;
                    case 10:
                        fDecodeFloatElement8 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, i16);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i17 = 9;
                        break;
                    case 11:
                        fDecodeFloatElement7 = interfaceC40539bBeginStructure.decodeFloatElement(interfaceC39443g, i15);
                        i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i17 = 9;
                        break;
                    case 12:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str7);
                        i13 |= 4096;
                        i17 = 9;
                        break;
                    case 13:
                        f25 = (Float) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, FloatSerializer.INSTANCE, f25);
                        i13 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i17 = 9;
                        break;
                    case 14:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, StringSerializer.INSTANCE, str6);
                        i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        i17 = 9;
                        break;
                    case 15:
                        customGaugeEntryModel5 = (CustomGaugeEntryModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 15, CustomGaugeEntryModel$$serializer.INSTANCE, customGaugeEntryModel5);
                        i14 = 32768;
                        i13 |= i14;
                        i17 = 9;
                        break;
                    case 16:
                        customGaugeEntryModel4 = (CustomGaugeEntryModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, CustomGaugeEntryModel$$serializer.INSTANCE, customGaugeEntryModel4);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i13 |= i14;
                        i17 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement3;
            textResource = textResource7;
            textResource2 = textResource8;
            textResource3 = textResource9;
            customGaugeEntryModel = customGaugeEntryModel4;
            customGaugeEntryModel2 = customGaugeEntryModel5;
            str = str6;
            str2 = str7;
            f13 = f25;
            str3 = strDecodeStringElement2;
            f14 = fDecodeFloatElement7;
            f15 = fDecodeFloatElement8;
            f16 = fDecodeFloatElement9;
            f17 = fDecodeFloatElement10;
            f18 = fDecodeFloatElement11;
            f19 = fDecodeFloatElement12;
            z13 = zDecodeBooleanElement4;
        }
        int i19 = i13;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new OverviewGaugeModel(i19, z4, str3, textResource3, textResource2, textResource, f19, f18, f17, z13, f16, f15, f14, str2, f13, str, customGaugeEntryModel2, customGaugeEntryModel, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, OverviewGaugeModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        OverviewGaugeModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
