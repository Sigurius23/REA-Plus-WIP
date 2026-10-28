package com.whoop.hormonalinsights.onboarding.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class FeatureToggleScreen$$serializer implements GeneratedSerializer<FeatureToggleScreen> {
    public static final int $stable;
    public static final FeatureToggleScreen$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FeatureToggleScreen$$serializer featureToggleScreen$$serializer = new FeatureToggleScreen$$serializer();
        INSTANCE = featureToggleScreen$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.onboarding.domain.models.FeatureToggleScreen", featureToggleScreen$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("imageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("titleDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("featureToggleTitle", false);
        pluginGeneratedSerialDescriptor.addElement("enabledNextId", false);
        pluginGeneratedSerialDescriptor.addElement("disabledNextId", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_PROGRESS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeatureToggleScreen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = FeatureToggleScreen.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, stringSerializer, interfaceC23462hArr[4].getValue(), interfaceC23462hArr[5].getValue(), FlowProgress$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FeatureToggleScreen deserialize(InterfaceC40541d decoder) {
        int i13;
        FlowProgress flowProgress;
        HormonalScreenId hormonalScreenId;
        String str;
        String str2;
        String str3;
        String str4;
        HormonalScreenId hormonalScreenId2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = FeatureToggleScreen.$childSerializers;
        int i14 = 6;
        int i15 = 3;
        String str5 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            HormonalScreenId hormonalScreenId3 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            hormonalScreenId = (HormonalScreenId) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            str = str6;
            flowProgress = (FlowProgress) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, FlowProgress$$serializer.INSTANCE, null);
            str4 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            i13 = 127;
            hormonalScreenId2 = hormonalScreenId3;
            str2 = strDecodeStringElement;
        } else {
            boolean z4 = true;
            int i16 = 0;
            FlowProgress flowProgress2 = null;
            HormonalScreenId hormonalScreenId4 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            HormonalScreenId hormonalScreenId5 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 3;
                        break;
                    case 0:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str5);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 3;
                        break;
                    case 1:
                        i16 |= 2;
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i15);
                        i16 |= 8;
                        break;
                    case 4:
                        hormonalScreenId5 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), hormonalScreenId5);
                        i16 |= 16;
                        break;
                    case 5:
                        hormonalScreenId4 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), hormonalScreenId4);
                        i16 |= 32;
                        break;
                    case 6:
                        flowProgress2 = (FlowProgress) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, FlowProgress$$serializer.INSTANCE, flowProgress2);
                        i16 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            flowProgress = flowProgress2;
            hormonalScreenId = hormonalScreenId4;
            str = str5;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            hormonalScreenId2 = hormonalScreenId5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FeatureToggleScreen(i13, str, str2, str3, str4, hormonalScreenId2, hormonalScreenId, flowProgress, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FeatureToggleScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FeatureToggleScreen.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
