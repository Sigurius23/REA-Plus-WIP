package com.whoop.p057ai.chat.api;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/ai/chat/api/AiCreateConversationRequestBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AiCreateConversationRequestBody$$serializer implements GeneratedSerializer<AiCreateConversationRequestBody> {
    public static final int $stable;
    public static final AiCreateConversationRequestBody$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AiCreateConversationRequestBody$$serializer aiCreateConversationRequestBody$$serializer = new AiCreateConversationRequestBody$$serializer();
        INSTANCE = aiCreateConversationRequestBody$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.ai.chat.api.AiCreateConversationRequestBody", aiCreateConversationRequestBody$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("fingerprint", false);
        pluginGeneratedSerialDescriptor.addElement("sourceType", false);
        pluginGeneratedSerialDescriptor.addElement("sourceId", false);
        pluginGeneratedSerialDescriptor.addElement("initialMessage", false);
        pluginGeneratedSerialDescriptor.addElement("presetQuestionKey", true);
        pluginGeneratedSerialDescriptor.addElement("args", true);
        pluginGeneratedSerialDescriptor.addElement("trackingCapabilities", true);
        pluginGeneratedSerialDescriptor.addElement("entrypointExperience", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AiCreateConversationRequestBody$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = AiCreateConversationRequestBody.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[5].getValue(), AiTrackingCapabilities$$serializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AiCreateConversationRequestBody deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        AiTrackingCapabilities aiTrackingCapabilities;
        Map map;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = AiCreateConversationRequestBody.$childSerializers;
        int i14 = 7;
        int i15 = 6;
        String str7 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            Map map2 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            AiTrackingCapabilities aiTrackingCapabilities2 = (AiTrackingCapabilities) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, AiTrackingCapabilities$$serializer.INSTANCE, null);
            map = map2;
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            i13 = 255;
            aiTrackingCapabilities = aiTrackingCapabilities2;
            str6 = str10;
            str2 = str11;
            str5 = str9;
            str4 = strDecodeStringElement;
            str3 = str8;
        } else {
            boolean z4 = true;
            int i16 = 0;
            String str12 = null;
            AiTrackingCapabilities aiTrackingCapabilities3 = null;
            Map map3 = null;
            String str13 = null;
            String strDecodeStringElement2 = null;
            String str14 = null;
            String str15 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 6;
                        break;
                    case 0:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str7);
                        i16 |= 1;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 1:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 7;
                        break;
                    case 2:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str14);
                        i16 |= 4;
                        i14 = 7;
                        break;
                    case 3:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str15);
                        i16 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str13);
                        i16 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), map3);
                        i16 |= 32;
                        break;
                    case 6:
                        aiTrackingCapabilities3 = (AiTrackingCapabilities) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, AiTrackingCapabilities$$serializer.INSTANCE, aiTrackingCapabilities3);
                        i16 |= 64;
                        break;
                    case 7:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str12);
                        i16 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            str = str12;
            aiTrackingCapabilities = aiTrackingCapabilities3;
            map = map3;
            str2 = str13;
            str3 = str7;
            str4 = strDecodeStringElement2;
            str5 = str14;
            str6 = str15;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AiCreateConversationRequestBody(i13, str3, str4, str5, str6, str2, map, aiTrackingCapabilities, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AiCreateConversationRequestBody value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AiCreateConversationRequestBody.write$Self$bot_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
