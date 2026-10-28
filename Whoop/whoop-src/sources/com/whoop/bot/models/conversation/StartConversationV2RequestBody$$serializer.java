package com.whoop.bot.models.conversation;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import s01.EnumC32045a;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/bot/models/conversation/StartConversationV2RequestBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StartConversationV2RequestBody$$serializer implements GeneratedSerializer<StartConversationV2RequestBody> {
    public static final int $stable;
    public static final StartConversationV2RequestBody$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StartConversationV2RequestBody$$serializer startConversationV2RequestBody$$serializer = new StartConversationV2RequestBody$$serializer();
        INSTANCE = startConversationV2RequestBody$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.bot.models.conversation.StartConversationV2RequestBody", startConversationV2RequestBody$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("initial_message", false);
        pluginGeneratedSerialDescriptor.addElement("sourceId", false);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        pluginGeneratedSerialDescriptor.addElement("presetQuestion", false);
        pluginGeneratedSerialDescriptor.addElement("location", false);
        pluginGeneratedSerialDescriptor.addElement("args", true);
        pluginGeneratedSerialDescriptor.addElement("userTimestamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StartConversationV2RequestBody$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = StartConversationV2RequestBody.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(AiChatMessage$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[2].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(Location$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d(LongSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StartConversationV2RequestBody deserialize(InterfaceC40541d decoder) {
        int i13;
        Long l7;
        Map map;
        AiChatMessage aiChatMessage;
        String str;
        EnumC32045a enumC32045a;
        String str2;
        Location location;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = StartConversationV2RequestBody.$childSerializers;
        int i14 = 6;
        int i15 = 2;
        AiChatMessage aiChatMessage2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            AiChatMessage aiChatMessage3 = (AiChatMessage) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, AiChatMessage$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            EnumC32045a enumC32045a2 = (EnumC32045a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            Location location2 = (Location) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, Location$$serializer.INSTANCE, null);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            aiChatMessage = aiChatMessage3;
            l7 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, LongSerializer.INSTANCE, null);
            str2 = str4;
            location = location2;
            i13 = 127;
            enumC32045a = enumC32045a2;
            str = str3;
        } else {
            boolean z4 = true;
            int i16 = 0;
            Long l12 = null;
            Map map2 = null;
            String str5 = null;
            EnumC32045a enumC32045a3 = null;
            String str6 = null;
            Location location3 = null;
            while (z4) {
                int i17 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        i15 = 2;
                        break;
                    case 0:
                        aiChatMessage2 = (AiChatMessage) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, AiChatMessage$$serializer.INSTANCE, aiChatMessage2);
                        i16 |= 1;
                        i14 = 6;
                        i15 = 2;
                        break;
                    case 1:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str5);
                        i16 |= 2;
                        i14 = 6;
                        i15 = 2;
                        break;
                    case 2:
                        enumC32045a3 = (EnumC32045a) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), enumC32045a3);
                        i16 |= 4;
                        i15 = i17;
                        i14 = 6;
                        break;
                    case 3:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str6);
                        i16 |= 8;
                        i15 = i17;
                        break;
                    case 4:
                        location3 = (Location) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, Location$$serializer.INSTANCE, location3);
                        i16 |= 16;
                        i15 = i17;
                        break;
                    case 5:
                        map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), map2);
                        i16 |= 32;
                        i15 = i17;
                        break;
                    case 6:
                        l12 = (Long) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, LongSerializer.INSTANCE, l12);
                        i16 |= 64;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            l7 = l12;
            map = map2;
            aiChatMessage = aiChatMessage2;
            str = str5;
            enumC32045a = enumC32045a3;
            str2 = str6;
            location = location3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StartConversationV2RequestBody(i13, aiChatMessage, str, enumC32045a, str2, location, map, l7, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StartConversationV2RequestBody value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StartConversationV2RequestBody.write$Self$bot_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
