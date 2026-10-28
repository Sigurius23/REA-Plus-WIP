package com.whoop.hormonalinsights.postpartum.domain.models;

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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class HormonalTextInputScreen$$serializer implements GeneratedSerializer<HormonalTextInputScreen> {
    public static final int $stable;
    public static final HormonalTextInputScreen$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        HormonalTextInputScreen$$serializer hormonalTextInputScreen$$serializer = new HormonalTextInputScreen$$serializer();
        INSTANCE = hormonalTextInputScreen$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.hormonalinsights.postpartum.domain.models.HormonalTextInputScreen", hormonalTextInputScreen$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("singleTitle", false);
        pluginGeneratedSerialDescriptor.addElement("multipleTitle", false);
        pluginGeneratedSerialDescriptor.addElement("textField", false);
        pluginGeneratedSerialDescriptor.addElement("buttonTitle", false);
        pluginGeneratedSerialDescriptor.addElement("skipTitle", false);
        pluginGeneratedSerialDescriptor.addElement("skipNextId", false);
        pluginGeneratedSerialDescriptor.addElement("nextId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HormonalTextInputScreen$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = HormonalTextInputScreen.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, TextInputField$$serializer.INSTANCE, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final HormonalTextInputScreen deserialize(InterfaceC40541d decoder) {
        int i13;
        HormonalScreenId hormonalScreenId;
        HormonalScreenId hormonalScreenId2;
        String str;
        String str2;
        TextInputField textInputField;
        String str3;
        String str4;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = HormonalTextInputScreen.$childSerializers;
        int i14 = 3;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            TextInputField textInputField2 = (TextInputField) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, TextInputField$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, null);
            HormonalScreenId hormonalScreenId3 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            hormonalScreenId = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = strDecodeStringElement2;
            str3 = strDecodeStringElement4;
            str4 = str5;
            textInputField = textInputField2;
            i13 = 127;
            hormonalScreenId2 = hormonalScreenId3;
            str2 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i15 = 0;
            HormonalScreenId hormonalScreenId4 = null;
            HormonalScreenId hormonalScreenId5 = null;
            String strDecodeStringElement5 = null;
            TextInputField textInputField3 = null;
            String strDecodeStringElement6 = null;
            String str6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 3;
                        break;
                    case 1:
                        c3 = 2;
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        i14 = 3;
                        break;
                    case 2:
                        c3 = 2;
                        textInputField3 = (TextInputField) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, TextInputField$$serializer.INSTANCE, textInputField3);
                        i15 |= 4;
                        i14 = 3;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i15 |= 8;
                        break;
                    case 4:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str6);
                        i15 |= 16;
                        break;
                    case 5:
                        hormonalScreenId5 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), hormonalScreenId5);
                        i15 |= 32;
                        break;
                    case 6:
                        hormonalScreenId4 = (HormonalScreenId) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), hormonalScreenId4);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            hormonalScreenId = hormonalScreenId4;
            hormonalScreenId2 = hormonalScreenId5;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement5;
            textInputField = textInputField3;
            str3 = strDecodeStringElement6;
            str4 = str6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new HormonalTextInputScreen(i13, str, str2, textInputField, str3, str4, hormonalScreenId2, hormonalScreenId, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, HormonalTextInputScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        HormonalTextInputScreen.write$Self$hormonal_insights_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
