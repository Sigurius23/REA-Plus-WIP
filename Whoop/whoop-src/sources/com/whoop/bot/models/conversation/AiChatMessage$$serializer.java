package com.whoop.bot.models.conversation;

import java.util.List;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/bot/models/conversation/AiChatMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/bot/models/conversation/AiChatMessage;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/bot/models/conversation/AiChatMessage;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class AiChatMessage$$serializer implements GeneratedSerializer<AiChatMessage> {
    public static final int $stable;
    public static final AiChatMessage$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AiChatMessage$$serializer aiChatMessage$$serializer = new AiChatMessage$$serializer();
        INSTANCE = aiChatMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.bot.models.conversation.AiChatMessage", aiChatMessage$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("messageStatus", true);
        pluginGeneratedSerialDescriptor.addElement("role", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        pluginGeneratedSerialDescriptor.addElement("additionalContext", true);
        pluginGeneratedSerialDescriptor.addElement("canHaveFeedback", true);
        pluginGeneratedSerialDescriptor.addElement("isSuggestion", true);
        pluginGeneratedSerialDescriptor.addElement("feedbackType", true);
        pluginGeneratedSerialDescriptor.addElement("feedbackResponse", true);
        pluginGeneratedSerialDescriptor.addElement("feedbackReasons", true);
        pluginGeneratedSerialDescriptor.addElement("stoppedByUser", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AiChatMessage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = AiChatMessage.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, interfaceC23462hArr[1].getValue(), stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[5].getValue(), booleanSerializer, AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[10].getValue(), booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AiChatMessage deserialize(InterfaceC40541d decoder) {
        String str;
        int i13;
        String str2;
        String str3;
        Boolean bool;
        AiMessageStatus aiMessageStatus;
        List list;
        List list2;
        String str4;
        String str5;
        String str6;
        boolean zDecodeBooleanElement;
        boolean z4;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = AiChatMessage.$childSerializers;
        int i14 = 9;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            AiMessageStatus aiMessageStatus2 = (AiMessageStatus) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            boolean zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BooleanSerializer.INSTANCE, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), null);
            str = strDecodeStringElement2;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 11);
            str3 = str9;
            bool = bool2;
            z4 = zDecodeBooleanElement2;
            str6 = strDecodeStringElement4;
            str2 = str8;
            str4 = str7;
            str5 = strDecodeStringElement3;
            list2 = list3;
            i13 = 4095;
            aiMessageStatus = aiMessageStatus2;
        } else {
            int i15 = 11;
            String str10 = null;
            String str11 = null;
            Boolean bool3 = null;
            AiMessageStatus aiMessageStatus3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i16 = 5;
            boolean z13 = true;
            int i17 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            List list4 = null;
            List list5 = null;
            String str12 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i15 = 11;
                        i16 = 5;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i17 |= 1;
                        i15 = 11;
                        i14 = 9;
                        i16 = 5;
                        break;
                    case 1:
                        aiMessageStatus3 = (AiMessageStatus) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), aiMessageStatus3);
                        i17 |= 2;
                        i15 = 11;
                        i14 = 9;
                        i16 = 5;
                        break;
                    case 2:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i17 |= 4;
                        i15 = 11;
                        i14 = 9;
                        i16 = 5;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i17 |= 8;
                        i15 = 11;
                        i14 = 9;
                        i16 = 5;
                        break;
                    case 4:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str12);
                        i17 |= 16;
                        i15 = 11;
                        i14 = 9;
                        i16 = 5;
                        break;
                    case 5:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list5);
                        i17 |= 32;
                        i15 = 11;
                        i14 = 9;
                        break;
                    case 6:
                        c3 = 7;
                        zDecodeBooleanElement4 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 6);
                        i17 |= 64;
                        i15 = 11;
                        i14 = 9;
                        break;
                    case 7:
                        c3 = 7;
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BooleanSerializer.INSTANCE, bool3);
                        i17 |= 128;
                        i15 = 11;
                        i14 = 9;
                        break;
                    case 8:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str10);
                        i17 |= 256;
                        i15 = 11;
                        break;
                    case 9:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str11);
                        i17 |= 512;
                        i15 = 11;
                        break;
                    case 10:
                        list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 10, (InterfaceC37137b) interfaceC23462hArr[10].getValue(), list4);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = 11;
                        break;
                    case 11:
                        zDecodeBooleanElement3 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, i15);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement;
            i13 = i17;
            str2 = str10;
            str3 = str11;
            bool = bool3;
            aiMessageStatus = aiMessageStatus3;
            list = list4;
            list2 = list5;
            str4 = str12;
            str5 = strDecodeStringElement5;
            str6 = strDecodeStringElement6;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            z4 = zDecodeBooleanElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AiChatMessage(i13, str, aiMessageStatus, str5, str6, str4, list2, z4, bool, str2, str3, list, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AiChatMessage value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AiChatMessage.write$Self$bot_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
