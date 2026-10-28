package com.whoop.hormonalinsights.postpartum.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.hormonalinsights.onboarding.domain.models.FlowProgress;
import com.whoop.hormonalinsights.onboarding.domain.models.FlowProgress$$serializer;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HormonalMultiSelectScreen$$serializer implements GeneratedSerializer<HormonalMultiSelectScreen> {
    public static final int $stable;
    public static final HormonalMultiSelectScreen$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HormonalMultiSelectScreen$$serializer hormonalMultiSelectScreen$$serializer = new HormonalMultiSelectScreen$$serializer();
        INSTANCE = hormonalMultiSelectScreen$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.postpartum.domain.models.HormonalMultiSelectScreen", hormonalMultiSelectScreen$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("optionLimit", false);
        pluginGeneratedSerialDescriptor.addElement("buttonTitle", false);
        pluginGeneratedSerialDescriptor.addElement("options", false);
        pluginGeneratedSerialDescriptor.addElement("skipTitle", false);
        pluginGeneratedSerialDescriptor.addElement("nextId", false);
        pluginGeneratedSerialDescriptor.addElement("skipNextId", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_PROGRESS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HormonalMultiSelectScreen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HormonalMultiSelectScreen.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(IntSerializer.INSTANCE), stringSerializer, interfaceC23462hArr[4].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[7].getValue()), AbstractC38195a.m122336d(FlowProgress$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HormonalMultiSelectScreen deserialize(InterfaceC40541d decoder) {
        int i13;
        HormonalScreenId hormonalScreenId;
        HormonalScreenId hormonalScreenId2;
        FlowProgress flowProgress;
        String str;
        List list;
        String str2;
        String str3;
        Integer num;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HormonalMultiSelectScreen.$childSerializers;
        int i14 = 8;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            Integer num2 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, IntSerializer.INSTANCE, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            HormonalScreenId hormonalScreenId3 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            hormonalScreenId = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            str2 = strDecodeStringElement2;
            str = str6;
            str4 = strDecodeStringElement3;
            flowProgress = (FlowProgress) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, FlowProgress$$serializer.INSTANCE, null);
            num = num2;
            i13 = 511;
            hormonalScreenId2 = hormonalScreenId3;
            list = list2;
            str3 = str5;
        } else {
            int i15 = 4;
            boolean z4 = true;
            int i16 = 0;
            HormonalScreenId hormonalScreenId4 = null;
            HormonalScreenId hormonalScreenId5 = null;
            FlowProgress flowProgress2 = null;
            String str7 = null;
            List list3 = null;
            String str8 = null;
            Integer num3 = null;
            String strDecodeStringElement4 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 4;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 8;
                        i15 = 4;
                        break;
                    case 1:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str8);
                        i16 |= 2;
                        i14 = 8;
                        i15 = 4;
                        break;
                    case 2:
                        num3 = (Integer) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, IntSerializer.INSTANCE, num3);
                        i16 |= 4;
                        i14 = 8;
                        i15 = 4;
                        break;
                    case 3:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i14 = 8;
                        break;
                    case 4:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list3);
                        i16 |= 16;
                        i14 = 8;
                        break;
                    case 5:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str7);
                        i16 |= 32;
                        i14 = 8;
                        break;
                    case 6:
                        hormonalScreenId5 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), hormonalScreenId5);
                        i16 |= 64;
                        break;
                    case 7:
                        hormonalScreenId4 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), hormonalScreenId4);
                        i16 |= 128;
                        break;
                    case 8:
                        flowProgress2 = (FlowProgress) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, FlowProgress$$serializer.INSTANCE, flowProgress2);
                        i16 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            hormonalScreenId = hormonalScreenId4;
            hormonalScreenId2 = hormonalScreenId5;
            flowProgress = flowProgress2;
            str = str7;
            list = list3;
            str2 = strDecodeStringElement;
            str3 = str8;
            num = num3;
            str4 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HormonalMultiSelectScreen(i13, str2, str3, num, str4, list, str, hormonalScreenId2, hormonalScreenId, flowProgress, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HormonalMultiSelectScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HormonalMultiSelectScreen.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
