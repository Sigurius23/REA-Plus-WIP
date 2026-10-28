package com.stripe.android.link.serialization;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/link/serialization/PopupPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/link/serialization/PopupPayload;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/link/serialization/PopupPayload;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/link/serialization/PopupPayload;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class PopupPayload$$serializer implements GeneratedSerializer<PopupPayload> {
    public static final int $stable;
    public static final PopupPayload$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        PopupPayload$$serializer popupPayload$$serializer = new PopupPayload$$serializer();
        INSTANCE = popupPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.link.serialization.PopupPayload", popupPayload$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("publishableKey", false);
        pluginGeneratedSerialDescriptor.addElement("stripeAccount", false);
        pluginGeneratedSerialDescriptor.addElement("merchantInfo", false);
        pluginGeneratedSerialDescriptor.addElement("customerInfo", false);
        pluginGeneratedSerialDescriptor.addElement("paymentInfo", false);
        pluginGeneratedSerialDescriptor.addElement("appId", false);
        pluginGeneratedSerialDescriptor.addElement("locale", false);
        pluginGeneratedSerialDescriptor.addElement("paymentUserAgent", false);
        pluginGeneratedSerialDescriptor.addElement("paymentObject", false);
        pluginGeneratedSerialDescriptor.addElement("intentMode", false);
        pluginGeneratedSerialDescriptor.addElement("setupFutureUsage", false);
        pluginGeneratedSerialDescriptor.addElement("cardBrandChoice", false);
        pluginGeneratedSerialDescriptor.addElement("flags", false);
        pluginGeneratedSerialDescriptor.addElement("linkFundingSources", false);
        pluginGeneratedSerialDescriptor.addElement("clientAttributionMetadata", false);
        pluginGeneratedSerialDescriptor.addElement("path", true);
        pluginGeneratedSerialDescriptor.addElement("integrationType", true);
        pluginGeneratedSerialDescriptor.addElement("loggerMetadata", true);
        pluginGeneratedSerialDescriptor.addElement("experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private PopupPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = PopupPayload.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), PopupPayload$MerchantInfo$$serializer.INSTANCE, PopupPayload$CustomerInfo$$serializer.INSTANCE, AbstractC38195a.m122336d(PopupPayload$PaymentInfo$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(PopupPayload$CardBrandChoice$$serializer.INSTANCE), interfaceC37138cArr[12], interfaceC37138cArr[13], interfaceC37138cArr[14], stringSerializer, stringSerializer, interfaceC37138cArr[17], interfaceC37138cArr[18]};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final PopupPayload deserialize(InterfaceC40541d decoder) {
        PopupPayload.MerchantInfo merchantInfo;
        String str;
        int i13;
        Map map;
        Map map2;
        List list;
        Map map3;
        PopupPayload.PaymentInfo paymentInfo;
        String str2;
        Map map4;
        PopupPayload.CardBrandChoice cardBrandChoice;
        PopupPayload.CustomerInfo customerInfo;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z4;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC37138c[] interfaceC37138cArr = PopupPayload.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, null);
            PopupPayload.MerchantInfo merchantInfo2 = (PopupPayload.MerchantInfo) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, PopupPayload$MerchantInfo$$serializer.INSTANCE, null);
            PopupPayload.CustomerInfo customerInfo2 = (PopupPayload.CustomerInfo) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, PopupPayload$CustomerInfo$$serializer.INSTANCE, null);
            PopupPayload.PaymentInfo paymentInfo2 = (PopupPayload.PaymentInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, PopupPayload$PaymentInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
            PopupPayload.CardBrandChoice cardBrandChoice2 = (PopupPayload.CardBrandChoice) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, PopupPayload$CardBrandChoice$$serializer.INSTANCE, null);
            Map map5 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, interfaceC37138cArr[12], null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, interfaceC37138cArr[13], null);
            Map map6 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 14, interfaceC37138cArr[14], null);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 15);
            String strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 16);
            map2 = map6;
            map4 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 17, interfaceC37138cArr[17], null);
            map = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 18, interfaceC37138cArr[18], null);
            i13 = 524287;
            str9 = strDecodeStringElement8;
            z4 = zDecodeBooleanElement;
            str7 = strDecodeStringElement6;
            str5 = strDecodeStringElement4;
            str4 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            customerInfo = customerInfo2;
            str6 = strDecodeStringElement5;
            paymentInfo = paymentInfo2;
            str8 = strDecodeStringElement7;
            merchantInfo = merchantInfo2;
            str2 = strDecodeStringElement;
            str = str10;
            list = list2;
            map3 = map5;
            cardBrandChoice = cardBrandChoice2;
        } else {
            int i15 = 18;
            String strDecodeStringElement9 = null;
            boolean z13 = true;
            int i16 = 0;
            boolean zDecodeBooleanElement2 = false;
            PopupPayload.MerchantInfo merchantInfo3 = null;
            String str11 = null;
            Map map7 = null;
            Map map8 = null;
            List list3 = null;
            Map map9 = null;
            PopupPayload.PaymentInfo paymentInfo3 = null;
            Map map10 = null;
            PopupPayload.CardBrandChoice cardBrandChoice3 = null;
            PopupPayload.CustomerInfo customerInfo3 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i15 = 18;
                        break;
                    case 0:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i15 = 18;
                        break;
                    case 1:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str11);
                        i16 |= 2;
                        i15 = 18;
                        break;
                    case 2:
                        merchantInfo3 = (PopupPayload.MerchantInfo) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, PopupPayload$MerchantInfo$$serializer.INSTANCE, merchantInfo3);
                        i16 |= 4;
                        i15 = 18;
                        break;
                    case 3:
                        customerInfo3 = (PopupPayload.CustomerInfo) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, PopupPayload$CustomerInfo$$serializer.INSTANCE, customerInfo3);
                        i16 |= 8;
                        i15 = 18;
                        break;
                    case 4:
                        paymentInfo3 = (PopupPayload.PaymentInfo) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, PopupPayload$PaymentInfo$$serializer.INSTANCE, paymentInfo3);
                        i16 |= 16;
                        i15 = 18;
                        break;
                    case 5:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i15 = 18;
                        break;
                    case 6:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i16 |= 64;
                        i15 = 18;
                        break;
                    case 7:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i16 |= 128;
                        i15 = 18;
                        break;
                    case 8:
                        strDecodeStringElement13 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i16 |= 256;
                        i15 = 18;
                        break;
                    case 9:
                        strDecodeStringElement14 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
                        i16 |= 512;
                        i15 = 18;
                        break;
                    case 10:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 10);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = 18;
                        break;
                    case 11:
                        cardBrandChoice3 = (PopupPayload.CardBrandChoice) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, PopupPayload$CardBrandChoice$$serializer.INSTANCE, cardBrandChoice3);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i15 = 18;
                        break;
                    case 12:
                        map9 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 12, interfaceC37138cArr[12], map9);
                        i16 |= 4096;
                        i15 = 18;
                        break;
                    case 13:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 13, interfaceC37138cArr[13], list3);
                        i16 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i15 = 18;
                        break;
                    case 14:
                        map8 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 14, interfaceC37138cArr[14], map8);
                        i16 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        i15 = 18;
                        break;
                    case 15:
                        strDecodeStringElement15 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 15);
                        i14 = 32768;
                        i16 |= i14;
                        i15 = 18;
                        break;
                    case 16:
                        strDecodeStringElement16 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 16);
                        i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        i16 |= i14;
                        i15 = 18;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        map10 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 17, interfaceC37138cArr[17], map10);
                        i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        i15 = 18;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        map7 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, interfaceC37138cArr[i15], map7);
                        i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            merchantInfo = merchantInfo3;
            str = str11;
            i13 = i16;
            map = map7;
            map2 = map8;
            list = list3;
            map3 = map9;
            paymentInfo = paymentInfo3;
            str2 = strDecodeStringElement9;
            map4 = map10;
            cardBrandChoice = cardBrandChoice3;
            customerInfo = customerInfo3;
            str3 = strDecodeStringElement10;
            str4 = strDecodeStringElement11;
            str5 = strDecodeStringElement12;
            str6 = strDecodeStringElement13;
            str7 = strDecodeStringElement14;
            str8 = strDecodeStringElement15;
            str9 = strDecodeStringElement16;
            z4 = zDecodeBooleanElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new PopupPayload(i13, str2, str, merchantInfo, customerInfo, paymentInfo, str3, str4, str5, str6, str7, z4, cardBrandChoice, map3, list, map2, str8, str9, map4, map, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, PopupPayload value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        PopupPayload.write$Self$paymentsheet_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
