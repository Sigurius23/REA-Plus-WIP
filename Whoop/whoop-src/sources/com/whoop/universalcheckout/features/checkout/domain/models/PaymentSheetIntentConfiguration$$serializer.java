package com.whoop.universalcheckout.features.checkout.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class PaymentSheetIntentConfiguration$$serializer implements GeneratedSerializer<PaymentSheetIntentConfiguration> {
    public static final int $stable;
    public static final PaymentSheetIntentConfiguration$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        PaymentSheetIntentConfiguration$$serializer paymentSheetIntentConfiguration$$serializer = new PaymentSheetIntentConfiguration$$serializer();
        INSTANCE = paymentSheetIntentConfiguration$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.universalcheckout.features.checkout.domain.models.PaymentSheetIntentConfiguration", paymentSheetIntentConfiguration$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("amount", false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodConfigurationId", false);
        pluginGeneratedSerialDescriptor.addElement("setupFutureUsage", false);
        pluginGeneratedSerialDescriptor.addElement("onBehalfOf", true);
        pluginGeneratedSerialDescriptor.addElement("requireCvcRecollection", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentSheetIntentConfiguration$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new InterfaceC37138c[]{LongSerializer.INSTANCE, stringSerializer, interfaceC37138cM122336d, AbstractC38195a.m122336d(booleanSerializer), AbstractC38195a.m122336d(stringSerializer), booleanSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final PaymentSheetIntentConfiguration deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        int i13;
        String str;
        String str2;
        Boolean bool;
        String str3;
        long j7;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, BooleanSerializer.INSTANCE, null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            str = strDecodeStringElement;
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
            bool = bool2;
            str3 = str5;
            str2 = str4;
            i13 = 63;
            j7 = jDecodeLongElement;
        } else {
            boolean z4 = true;
            boolean zDecodeBooleanElement2 = false;
            Boolean bool3 = null;
            String str6 = null;
            long jDecodeLongElement2 = 0;
            int i14 = 0;
            String strDecodeStringElement2 = null;
            String str7 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        continue;
                    case 0:
                        jDecodeLongElement2 = interfaceC40539bBeginStructure.decodeLongElement(interfaceC39443g, 0);
                        i14 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i14 |= 2;
                        break;
                    case 2:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str7);
                        i14 |= 4;
                        break;
                    case 3:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, BooleanSerializer.INSTANCE, bool3);
                        i14 |= 8;
                        break;
                    case 4:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str6);
                        i14 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 5);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i13 = i14;
            str = strDecodeStringElement2;
            str2 = str7;
            bool = bool3;
            str3 = str6;
            j7 = jDecodeLongElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new PaymentSheetIntentConfiguration(i13, j7, str, str2, bool, str3, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, PaymentSheetIntentConfiguration value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        PaymentSheetIntentConfiguration.write$Self$universal_checkout_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
