package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel$$serializer;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ToggleContentV2$$serializer implements GeneratedSerializer<ToggleContentV2> {
    public static final int $stable;
    public static final ToggleContentV2$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ToggleContentV2$$serializer toggleContentV2$$serializer = new ToggleContentV2$$serializer();
        INSTANCE = toggleContentV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.weeklyplan.customizeplan.domain.api.ToggleContentV2", toggleContentV2$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("topHeadingDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("top_initial_goal_settings_tiles", false);
        pluginGeneratedSerialDescriptor.addElement("headingDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("subHeadingDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("initial_goal_settings_tiles", false);
        pluginGeneratedSerialDescriptor.addElement("bottomButton", false);
        pluginGeneratedSerialDescriptor.addElement("bottomSheet", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ToggleContentV2$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ToggleContentV2.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[1].getValue(), stringSerializer, AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[4].getValue(), BottomButtonV2$$serializer.INSTANCE, CustomizeBottomSheetSelectorModel$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ToggleContentV2 deserialize(InterfaceC40541d decoder) {
        int i13;
        CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel;
        BottomButtonV2 bottomButtonV2;
        String str;
        List list;
        String str2;
        String str3;
        List list2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ToggleContentV2.$childSerializers;
        int i14 = 6;
        int i15 = 5;
        String str4 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            BottomButtonV2 bottomButtonV3 = (BottomButtonV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, BottomButtonV2$$serializer.INSTANCE, null);
            list2 = list4;
            str3 = str6;
            customizeBottomSheetSelectorModel = (CustomizeBottomSheetSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, CustomizeBottomSheetSelectorModel$$serializer.INSTANCE, null);
            bottomButtonV2 = bottomButtonV3;
            i13 = 127;
            str2 = strDecodeStringElement;
            list = list3;
            str = str5;
        } else {
            int i16 = 1;
            boolean z4 = true;
            int i17 = 0;
            CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel2 = null;
            BottomButtonV2 bottomButtonV4 = null;
            List list5 = null;
            String strDecodeStringElement2 = null;
            String str7 = null;
            List list6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 5;
                        i16 = 1;
                        break;
                    case 0:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str4);
                        i17 |= 1;
                        i14 = 6;
                        i15 = 5;
                        i16 = 1;
                        break;
                    case 1:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list5);
                        i17 |= 2;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 2:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        break;
                    case 3:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str7);
                        i17 |= 8;
                        break;
                    case 4:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), list6);
                        i17 |= 16;
                        break;
                    case 5:
                        bottomButtonV4 = (BottomButtonV2) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, BottomButtonV2$$serializer.INSTANCE, bottomButtonV4);
                        i17 |= 32;
                        break;
                    case 6:
                        customizeBottomSheetSelectorModel2 = (CustomizeBottomSheetSelectorModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i14, CustomizeBottomSheetSelectorModel$$serializer.INSTANCE, customizeBottomSheetSelectorModel2);
                        i17 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            customizeBottomSheetSelectorModel = customizeBottomSheetSelectorModel2;
            bottomButtonV2 = bottomButtonV4;
            str = str4;
            list = list5;
            str2 = strDecodeStringElement2;
            str3 = str7;
            list2 = list6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ToggleContentV2(i13, str, list, str2, str3, list2, bottomButtonV2, customizeBottomSheetSelectorModel, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ToggleContentV2 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ToggleContentV2.write$Self$weekly_plan_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
