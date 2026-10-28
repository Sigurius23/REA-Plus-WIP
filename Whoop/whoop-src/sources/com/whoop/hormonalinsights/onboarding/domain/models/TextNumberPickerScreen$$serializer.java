package com.whoop.hormonalinsights.onboarding.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TextNumberPickerScreen$$serializer implements GeneratedSerializer<TextNumberPickerScreen> {
    public static final int $stable;
    public static final TextNumberPickerScreen$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TextNumberPickerScreen$$serializer textNumberPickerScreen$$serializer = new TextNumberPickerScreen$$serializer();
        INSTANCE = textNumberPickerScreen$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.onboarding.domain.models.TextNumberPickerScreen", textNumberPickerScreen$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("trailingText", false);
        pluginGeneratedSerialDescriptor.addElement("minValue", false);
        pluginGeneratedSerialDescriptor.addElement("maxValue", false);
        pluginGeneratedSerialDescriptor.addElement("buttonTitle", false);
        pluginGeneratedSerialDescriptor.addElement("skipTitle", false);
        pluginGeneratedSerialDescriptor.addElement("skipNextId", false);
        pluginGeneratedSerialDescriptor.addElement("nextId", false);
        pluginGeneratedSerialDescriptor.addElement("currentValue", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_PROGRESS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TextNumberPickerScreen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TextNumberPickerScreen.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), interfaceC23462hArr[8].getValue(), AbstractC38195a.m122336d(intSerializer), AbstractC38195a.m122336d(FlowProgress$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TextNumberPickerScreen deserialize(InterfaceC40541d decoder) {
        int i13;
        FlowProgress flowProgress;
        HormonalScreenId hormonalScreenId;
        Integer num;
        HormonalScreenId hormonalScreenId2;
        String str;
        int i14;
        int i15;
        String str2;
        String str3;
        String str4;
        String str5;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TextNumberPickerScreen.$childSerializers;
        int i16 = 10;
        int i17 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
            int iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, null);
            HormonalScreenId hormonalScreenId3 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            HormonalScreenId hormonalScreenId4 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, IntSerializer.INSTANCE, null);
            hormonalScreenId = hormonalScreenId4;
            str2 = strDecodeStringElement;
            flowProgress = (FlowProgress) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, FlowProgress$$serializer.INSTANCE, null);
            num = num2;
            str = str6;
            str5 = strDecodeStringElement4;
            i13 = iDecodeIntElement;
            i15 = iDecodeIntElement2;
            str4 = strDecodeStringElement3;
            hormonalScreenId2 = hormonalScreenId3;
            i14 = 2047;
            str3 = strDecodeStringElement2;
        } else {
            boolean z4 = true;
            int iDecodeIntElement3 = 0;
            FlowProgress flowProgress2 = null;
            HormonalScreenId hormonalScreenId5 = null;
            Integer num3 = null;
            HormonalScreenId hormonalScreenId6 = null;
            String str7 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement4 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i16 = 10;
                        break;
                    case 0:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i17 |= 1;
                        i16 = 10;
                        break;
                    case 1:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i17 |= 2;
                        i16 = 10;
                        break;
                    case 2:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i16 = 10;
                        break;
                    case 3:
                        i17 |= 8;
                        iDecodeIntElement3 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 3);
                        i16 = 10;
                        break;
                    case 4:
                        i17 |= 16;
                        iDecodeIntElement4 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 4);
                        i16 = 10;
                        break;
                    case 5:
                        c3 = 6;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i17 |= 32;
                        i16 = 10;
                        break;
                    case 6:
                        c3 = 6;
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str7);
                        i17 |= 64;
                        i16 = 10;
                        break;
                    case 7:
                        hormonalScreenId6 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), hormonalScreenId6);
                        i17 |= 128;
                        break;
                    case 8:
                        hormonalScreenId5 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), hormonalScreenId5);
                        i17 |= 256;
                        break;
                    case 9:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, IntSerializer.INSTANCE, num3);
                        i17 |= 512;
                        break;
                    case 10:
                        flowProgress2 = (FlowProgress) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, FlowProgress$$serializer.INSTANCE, flowProgress2);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = iDecodeIntElement3;
            flowProgress = flowProgress2;
            hormonalScreenId = hormonalScreenId5;
            num = num3;
            hormonalScreenId2 = hormonalScreenId6;
            str = str7;
            i14 = i17;
            i15 = iDecodeIntElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TextNumberPickerScreen(i14, str2, str3, str4, i13, i15, str5, str, hormonalScreenId2, hormonalScreenId, num, flowProgress, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TextNumberPickerScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TextNumberPickerScreen.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
