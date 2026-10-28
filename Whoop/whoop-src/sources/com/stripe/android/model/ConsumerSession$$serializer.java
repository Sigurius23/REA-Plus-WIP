package com.stripe.android.model;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/model/ConsumerSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/model/ConsumerSession;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/model/ConsumerSession;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/model/ConsumerSession;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class ConsumerSession$$serializer implements GeneratedSerializer<ConsumerSession> {
    public static final ConsumerSession$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ConsumerSession$$serializer consumerSession$$serializer = new ConsumerSession$$serializer();
        INSTANCE = consumerSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.model.ConsumerSession", consumerSession$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("client_secret", true);
        pluginGeneratedSerialDescriptor.addElement("email_address", false);
        pluginGeneratedSerialDescriptor.addElement("redacted_formatted_phone_number", false);
        pluginGeneratedSerialDescriptor.addElement("redacted_phone_number", false);
        pluginGeneratedSerialDescriptor.addElement("unredacted_phone_number", true);
        pluginGeneratedSerialDescriptor.addElement("phone_number_country", true);
        pluginGeneratedSerialDescriptor.addElement("verification_sessions", true);
        pluginGeneratedSerialDescriptor.addElement("mobile_fallback_webview_params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConsumerSession$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = ConsumerSession.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), interfaceC37138cArr[6], AbstractC38195a.m122336d(MobileFallbackWebviewParams$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ConsumerSession deserialize(InterfaceC40541d decoder) {
        int i13;
        MobileFallbackWebviewParams mobileFallbackWebviewParams;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC37138c[] interfaceC37138cArr = ConsumerSession.$childSerializers;
        int i14 = 7;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, stringSerializer, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, interfaceC37138cArr[6], null);
            str3 = strDecodeStringElement2;
            mobileFallbackWebviewParams = (MobileFallbackWebviewParams) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, MobileFallbackWebviewParams$$serializer.INSTANCE, null);
            str = str8;
            str6 = strDecodeStringElement5;
            str2 = str7;
            str5 = strDecodeStringElement4;
            i13 = 255;
            str4 = strDecodeStringElement3;
        } else {
            boolean z4 = true;
            int i15 = 0;
            MobileFallbackWebviewParams mobileFallbackWebviewParams2 = null;
            List list2 = null;
            String str9 = null;
            String str10 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 7;
                        break;
                    case 1:
                        i15 |= 2;
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 = 7;
                        break;
                    case 2:
                        i15 |= 4;
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i14 = 7;
                        break;
                    case 3:
                        c3 = 4;
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i15 |= 8;
                        i14 = 7;
                        break;
                    case 4:
                        c3 = 4;
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str10);
                        i15 |= 16;
                        i14 = 7;
                        break;
                    case 5:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, StringSerializer.INSTANCE, str9);
                        i15 |= 32;
                        break;
                    case 6:
                        list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, interfaceC37138cArr[6], list2);
                        i15 |= 64;
                        break;
                    case 7:
                        mobileFallbackWebviewParams2 = (MobileFallbackWebviewParams) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, MobileFallbackWebviewParams$$serializer.INSTANCE, mobileFallbackWebviewParams2);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            mobileFallbackWebviewParams = mobileFallbackWebviewParams2;
            list = list2;
            str = str9;
            str2 = str10;
            str3 = strDecodeStringElement;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ConsumerSession(i13, str3, str4, str5, str6, str2, str, list, mobileFallbackWebviewParams, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ConsumerSession value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ConsumerSession.write$Self$payments_model_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
