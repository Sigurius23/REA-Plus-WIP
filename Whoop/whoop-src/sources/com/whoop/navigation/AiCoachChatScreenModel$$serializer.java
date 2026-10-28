package com.whoop.navigation;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/navigation/AiCoachChatScreenModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/navigation/AiCoachChatScreenModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/navigation/AiCoachChatScreenModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/navigation/AiCoachChatScreenModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AiCoachChatScreenModel$$serializer implements GeneratedSerializer<AiCoachChatScreenModel> {
    public static final int $stable;
    public static final AiCoachChatScreenModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AiCoachChatScreenModel$$serializer aiCoachChatScreenModel$$serializer = new AiCoachChatScreenModel$$serializer();
        INSTANCE = aiCoachChatScreenModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.navigation.AiCoachChatScreenModel", aiCoachChatScreenModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("fingerprint", false);
        pluginGeneratedSerialDescriptor.addElement("sourceId", false);
        pluginGeneratedSerialDescriptor.addElement("sourceType", false);
        pluginGeneratedSerialDescriptor.addElement("staticInitialMessage", true);
        pluginGeneratedSerialDescriptor.addElement("userMessage", true);
        pluginGeneratedSerialDescriptor.addElement("onboardingAnalyticSource", true);
        pluginGeneratedSerialDescriptor.addElement("educationType", true);
        pluginGeneratedSerialDescriptor.addElement("presetQuestionKey", true);
        pluginGeneratedSerialDescriptor.addElement("args", true);
        pluginGeneratedSerialDescriptor.addElement("shouldOpenFullSize", true);
        pluginGeneratedSerialDescriptor.addElement("coachEverywhereMainContent", true);
        pluginGeneratedSerialDescriptor.addElement("isCoachEverywhereDetailScreen", true);
        pluginGeneratedSerialDescriptor.addElement("isPrefetchEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("isPushNavigationEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("isWhoopCoachEverywhere", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AiCoachChatScreenModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = AiCoachChatScreenModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d3 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d4 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d5 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d6 = AbstractC38195a.m122336d(stringSerializer);
        InterfaceC37138c interfaceC37138cM122336d7 = AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue());
        InterfaceC37138c interfaceC37138cM122336d8 = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC37138cM122336d, stringSerializer, interfaceC37138cM122336d2, interfaceC37138cM122336d3, interfaceC37138cM122336d4, interfaceC37138cM122336d5, interfaceC37138cM122336d6, interfaceC37138cM122336d7, booleanSerializer, interfaceC37138cM122336d8, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AiCoachChatScreenModel deserialize(InterfaceC40541d decoder) {
        String str;
        int i13;
        String str2;
        boolean z4;
        String str3;
        Map map;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean zDecodeBooleanElement;
        String str8;
        String str9;
        boolean z13;
        boolean z14;
        boolean z15;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = AiCoachChatScreenModel.$childSerializers;
        int i14 = 10;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            Map map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            boolean zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
            boolean zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 12);
            boolean zDecodeBooleanElement5 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 13);
            map = map2;
            str8 = strDecodeStringElement;
            z4 = zDecodeBooleanElement2;
            str = str10;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 14);
            z13 = zDecodeBooleanElement3;
            z14 = zDecodeBooleanElement4;
            z15 = zDecodeBooleanElement5;
            str4 = str15;
            str6 = str14;
            str5 = str13;
            str2 = str11;
            str7 = str12;
            str9 = strDecodeStringElement2;
            str3 = str16;
            i13 = 32767;
        } else {
            int i15 = 14;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            int i16 = 8;
            boolean z16 = true;
            String str17 = null;
            String str18 = null;
            Map map3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i17 = 0;
            boolean zDecodeBooleanElement10 = false;
            String str23 = null;
            while (z16) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z16 = false;
                        i15 = 14;
                        i16 = 8;
                        break;
                    case 0:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i17 |= 1;
                        i15 = 14;
                        i14 = 10;
                        i16 = 8;
                        break;
                    case 1:
                        str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str23);
                        i17 |= 2;
                        i15 = 14;
                        i14 = 10;
                        i16 = 8;
                        break;
                    case 2:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i15 = 14;
                        i14 = 10;
                        i16 = 8;
                        break;
                    case 3:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str17);
                        i17 |= 8;
                        i15 = 14;
                        i14 = 10;
                        i16 = 8;
                        break;
                    case 4:
                        str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str22);
                        i17 |= 16;
                        i15 = 14;
                        i14 = 10;
                        i16 = 8;
                        break;
                    case 5:
                        str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str20);
                        i17 |= 32;
                        i15 = 14;
                        i14 = 10;
                        i16 = 8;
                        break;
                    case 6:
                        str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str21);
                        i17 |= 64;
                        i15 = 14;
                        i14 = 10;
                        i16 = 8;
                        break;
                    case 7:
                        str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str19);
                        i17 |= 128;
                        i15 = 14;
                        i14 = 10;
                        i16 = 8;
                        break;
                    case 8:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), map3);
                        i17 |= 256;
                        i15 = 14;
                        i14 = 10;
                        break;
                    case 9:
                        zDecodeBooleanElement10 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
                        i17 |= 512;
                        i15 = 14;
                        break;
                    case 10:
                        str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str18);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = 14;
                        break;
                    case 11:
                        zDecodeBooleanElement7 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i15 = 14;
                        break;
                    case 12:
                        zDecodeBooleanElement8 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 12);
                        i17 |= 4096;
                        i15 = 14;
                        break;
                    case 13:
                        zDecodeBooleanElement9 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 13);
                        i17 |= DfuBaseService.ERROR_REMOTE_MASK;
                        break;
                    case 14:
                        zDecodeBooleanElement6 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i15);
                        i17 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str23;
            i13 = i17;
            str2 = str17;
            z4 = zDecodeBooleanElement10;
            str3 = str18;
            map = map3;
            str4 = str19;
            str5 = str20;
            str6 = str21;
            str7 = str22;
            zDecodeBooleanElement = zDecodeBooleanElement6;
            str8 = strDecodeStringElement3;
            str9 = strDecodeStringElement4;
            z13 = zDecodeBooleanElement7;
            z14 = zDecodeBooleanElement8;
            z15 = zDecodeBooleanElement9;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AiCoachChatScreenModel(i13, str8, str, str9, str2, str7, str5, str6, str4, map, z4, str3, z13, z14, z15, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AiCoachChatScreenModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AiCoachChatScreenModel.write$Self$navigation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
