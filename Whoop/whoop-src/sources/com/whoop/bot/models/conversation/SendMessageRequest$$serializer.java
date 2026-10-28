package com.whoop.bot.models.conversation;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.HttpTimeoutConfig$$serializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/bot/models/conversation/SendMessageRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/bot/models/conversation/SendMessageRequest;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/bot/models/conversation/SendMessageRequest;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/bot/models/conversation/SendMessageRequest;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class SendMessageRequest$$serializer implements GeneratedSerializer<SendMessageRequest> {
    public static final int $stable;
    public static final SendMessageRequest$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        SendMessageRequest$$serializer sendMessageRequest$$serializer = new SendMessageRequest$$serializer();
        INSTANCE = sendMessageRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.bot.models.conversation.SendMessageRequest", sendMessageRequest$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("conversationId", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("path", true);
        pluginGeneratedSerialDescriptor.addElement("httpTimeoutConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SendMessageRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AiChatMessageRequestBody$$serializer.INSTANCE, stringSerializer, HttpTimeoutConfig$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final SendMessageRequest deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        AiChatMessageRequestBody aiChatMessageRequestBody;
        String str2;
        HttpTimeoutConfig httpTimeoutConfig;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            AiChatMessageRequestBody aiChatMessageRequestBody2 = (AiChatMessageRequestBody) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, AiChatMessageRequestBody$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            str = strDecodeStringElement2;
            httpTimeoutConfig = (HttpTimeoutConfig) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, HttpTimeoutConfig$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement3;
            aiChatMessageRequestBody = aiChatMessageRequestBody2;
            i13 = 15;
        } else {
            boolean z4 = true;
            int i14 = 0;
            AiChatMessageRequestBody aiChatMessageRequestBody3 = null;
            String strDecodeStringElement4 = null;
            HttpTimeoutConfig httpTimeoutConfig2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    aiChatMessageRequestBody3 = (AiChatMessageRequestBody) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, AiChatMessageRequestBody$$serializer.INSTANCE, aiChatMessageRequestBody3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    httpTimeoutConfig2 = (HttpTimeoutConfig) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, HttpTimeoutConfig$$serializer.INSTANCE, httpTimeoutConfig2);
                    i14 |= 8;
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            aiChatMessageRequestBody = aiChatMessageRequestBody3;
            str2 = strDecodeStringElement4;
            httpTimeoutConfig = httpTimeoutConfig2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new SendMessageRequest(i13, str, aiChatMessageRequestBody, str2, httpTimeoutConfig, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, SendMessageRequest value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        SendMessageRequest.write$Self$bot_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
