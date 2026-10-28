package com.whoop.navigation;

import androidx.profileinstaller.ProfileVerifier;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/navigation/AiAction.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/navigation/AiAction;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/navigation/AiAction;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/navigation/AiAction;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AiAction$$serializer implements GeneratedSerializer<AiAction> {
    public static final int $stable;
    public static final AiAction$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AiAction$$serializer aiAction$$serializer = new AiAction$$serializer();
        INSTANCE = aiAction$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.navigation.AiAction", aiAction$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        pluginGeneratedSerialDescriptor.addElement("screenId", false);
        pluginGeneratedSerialDescriptor.addElement("sourceType", true);
        pluginGeneratedSerialDescriptor.addElement("sourceId", false);
        pluginGeneratedSerialDescriptor.addElement("agentId", false);
        pluginGeneratedSerialDescriptor.addElement("conversationSeedId", false);
        pluginGeneratedSerialDescriptor.addElement("fingerprint", false);
        pluginGeneratedSerialDescriptor.addElement("presetQuestion", false);
        pluginGeneratedSerialDescriptor.addElement("educationType", false);
        pluginGeneratedSerialDescriptor.addElement("shouldOpenFullSize", true);
        pluginGeneratedSerialDescriptor.addElement("entryText", false);
        pluginGeneratedSerialDescriptor.addElement("includeInitialMessage", false);
        pluginGeneratedSerialDescriptor.addElement("staticInitialMessage", false);
        pluginGeneratedSerialDescriptor.addElement("userMessage", true);
        pluginGeneratedSerialDescriptor.addElement("entrypointExperience", true);
        pluginGeneratedSerialDescriptor.addElement("args", true);
        pluginGeneratedSerialDescriptor.addElement("drawerPresentation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AiAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = AiAction.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), booleanSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[14].getValue()), interfaceC23462hArr[15].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[16].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AiAction deserialize(InterfaceC40541d decoder) {
        String str;
        String str2;
        ChatEntrypointExperience chatEntrypointExperience;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean bool;
        String str9;
        String str10;
        DrawerPresentation drawerPresentation;
        Map map;
        String str11;
        String str12;
        int i13;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = AiAction.$childSerializers;
        DrawerPresentation drawerPresentation2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            String str18 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str19 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str20 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
            String str21 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, BooleanSerializer.INSTANCE, null);
            String str22 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            String str23 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, stringSerializer, null);
            ChatEntrypointExperience chatEntrypointExperience2 = (ChatEntrypointExperience) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            str3 = str23;
            map = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), null);
            drawerPresentation = (DrawerPresentation) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 16, (InterfaceC37137b) interfaceC23462hArr[16].getValue(), null);
            str4 = str22;
            i13 = 131071;
            str5 = str21;
            z4 = zDecodeBooleanElement;
            str7 = str19;
            str9 = str18;
            str8 = str17;
            str11 = str15;
            str6 = str20;
            str10 = str16;
            str12 = strDecodeStringElement;
            str = str13;
            chatEntrypointExperience = chatEntrypointExperience2;
            bool = bool2;
            str2 = str14;
        } else {
            int i14 = 16;
            int i15 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z13 = true;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            Boolean bool3 = null;
            String str32 = null;
            String str33 = null;
            String strDecodeStringElement2 = null;
            ChatEntrypointExperience chatEntrypointExperience3 = null;
            Map map2 = null;
            String str34 = null;
            while (z13) {
                int i16 = i14;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        drawerPresentation2 = drawerPresentation2;
                        str25 = str25;
                        i15 = i15;
                        i14 = 16;
                        break;
                    case 0:
                        str34 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str34);
                        i15 |= 1;
                        str24 = str24;
                        drawerPresentation2 = drawerPresentation2;
                        str25 = str25;
                        i14 = 16;
                        break;
                    case 1:
                        str24 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str24);
                        i15 |= 2;
                        drawerPresentation2 = drawerPresentation2;
                        i14 = 16;
                        break;
                    case 2:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i15 |= 4;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 3:
                        str25 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str25);
                        i15 |= 8;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 4:
                        str33 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str33);
                        i15 |= 16;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 5:
                        str31 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str31);
                        i15 |= 32;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 6:
                        str32 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str32);
                        i15 |= 64;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 7:
                        str30 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str30);
                        i15 |= 128;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 8:
                        str29 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str29);
                        i15 |= 256;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 9:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 9);
                        i15 |= 512;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 10:
                        str28 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str28);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 11:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, BooleanSerializer.INSTANCE, bool3);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 12:
                        str27 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str27);
                        i15 |= 4096;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 13:
                        str26 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, StringSerializer.INSTANCE, str26);
                        i15 |= DfuBaseService.ERROR_REMOTE_MASK;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 14:
                        str24 = str24;
                        chatEntrypointExperience3 = (ChatEntrypointExperience) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), chatEntrypointExperience3);
                        i15 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        drawerPresentation2 = drawerPresentation2;
                        map2 = map2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 15:
                        map2 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 15, (InterfaceC37137b) interfaceC23462hArr[15].getValue(), map2);
                        i15 |= 32768;
                        drawerPresentation2 = drawerPresentation2;
                        str24 = str24;
                        i14 = 16;
                        break;
                    case 16:
                        drawerPresentation2 = (DrawerPresentation) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), drawerPresentation2);
                        i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i14 = i16;
                        str24 = str24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str34;
            str2 = str24;
            chatEntrypointExperience = chatEntrypointExperience3;
            str3 = str26;
            str4 = str27;
            str5 = str28;
            str6 = str29;
            str7 = str30;
            str8 = str31;
            bool = bool3;
            str9 = str32;
            str10 = str33;
            drawerPresentation = drawerPresentation2;
            map = map2;
            str11 = str25;
            str12 = strDecodeStringElement2;
            i13 = i15;
            z4 = zDecodeBooleanElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AiAction(i13, str, str2, str12, str11, str10, str8, str9, str7, str6, z4, str5, bool, str4, str3, chatEntrypointExperience, map, drawerPresentation, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AiAction value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AiAction.write$Self$navigation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
