package com.stripe.android.model;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/model/ConsumerSessionLookup.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/model/ConsumerSessionLookup;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/model/ConsumerSessionLookup;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/model/ConsumerSessionLookup;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class ConsumerSessionLookup$$serializer implements GeneratedSerializer<ConsumerSessionLookup> {
    public static final ConsumerSessionLookup$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ConsumerSessionLookup$$serializer consumerSessionLookup$$serializer = new ConsumerSessionLookup$$serializer();
        INSTANCE = consumerSessionLookup$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.model.ConsumerSessionLookup", consumerSessionLookup$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("exists", false);
        pluginGeneratedSerialDescriptor.addElement("consumer_session", true);
        pluginGeneratedSerialDescriptor.addElement("error_message", true);
        pluginGeneratedSerialDescriptor.addElement("publishable_key", true);
        pluginGeneratedSerialDescriptor.addElement("displayable_payment_details", true);
        pluginGeneratedSerialDescriptor.addElement("consent_ui", true);
        pluginGeneratedSerialDescriptor.addElement("suggested_email", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConsumerSessionLookup$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(ConsumerSession$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{BooleanSerializer.INSTANCE, interfaceC37138cM122336d, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(DisplayablePaymentDetails$$serializer.INSTANCE), AbstractC38195a.m122336d(ConsentUi$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ConsumerSessionLookup deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        String str;
        int i13;
        ConsumerSession consumerSession;
        String str2;
        String str3;
        DisplayablePaymentDetails displayablePaymentDetails;
        ConsentUi consentUi;
        boolean z4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 6;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
            ConsumerSession consumerSession2 = (ConsumerSession) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ConsumerSession$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            DisplayablePaymentDetails displayablePaymentDetails2 = (DisplayablePaymentDetails) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DisplayablePaymentDetails$$serializer.INSTANCE, null);
            ConsentUi consentUi2 = (ConsentUi) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, ConsentUi$$serializer.INSTANCE, null);
            str = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            consentUi = consentUi2;
            str3 = str5;
            displayablePaymentDetails = displayablePaymentDetails2;
            str2 = str4;
            consumerSession = consumerSession2;
            i13 = 127;
        } else {
            boolean z13 = true;
            zDecodeBooleanElement = false;
            ConsumerSession consumerSession3 = null;
            String str6 = null;
            String str7 = null;
            DisplayablePaymentDetails displayablePaymentDetails3 = null;
            ConsentUi consentUi3 = null;
            int i15 = 0;
            String str8 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        z4 = true;
                        zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        z4 = true;
                        consumerSession3 = (ConsumerSession) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ConsumerSession$$serializer.INSTANCE, consumerSession3);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str6);
                        i15 |= 4;
                        break;
                    case 3:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str7);
                        i15 |= 8;
                        break;
                    case 4:
                        displayablePaymentDetails3 = (DisplayablePaymentDetails) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, DisplayablePaymentDetails$$serializer.INSTANCE, displayablePaymentDetails3);
                        i15 |= 16;
                        break;
                    case 5:
                        consentUi3 = (ConsentUi) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, ConsentUi$$serializer.INSTANCE, consentUi3);
                        i15 |= 32;
                        break;
                    case 6:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str8);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str8;
            i13 = i15;
            consumerSession = consumerSession3;
            str2 = str6;
            str3 = str7;
            displayablePaymentDetails = displayablePaymentDetails3;
            consentUi = consentUi3;
        }
        boolean z14 = zDecodeBooleanElement;
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ConsumerSessionLookup(i13, z14, consumerSession, str2, str3, displayablePaymentDetails, consentUi, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ConsumerSessionLookup value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ConsumerSessionLookup.write$Self$payments_model_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
