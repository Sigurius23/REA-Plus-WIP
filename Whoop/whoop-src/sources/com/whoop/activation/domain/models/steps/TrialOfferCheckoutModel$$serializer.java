package com.whoop.activation.domain.models.steps;

import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/steps/TrialOfferCheckoutModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class TrialOfferCheckoutModel$$serializer implements GeneratedSerializer<TrialOfferCheckoutModel> {
    public static final int $stable;
    public static final TrialOfferCheckoutModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        TrialOfferCheckoutModel$$serializer trialOfferCheckoutModel$$serializer = new TrialOfferCheckoutModel$$serializer();
        INSTANCE = trialOfferCheckoutModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.steps.TrialOfferCheckoutModel", trialOfferCheckoutModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("orderDetails", false);
        pluginGeneratedSerialDescriptor.addElement("paymentMethod", false);
        pluginGeneratedSerialDescriptor.addElement("joinCtaTitle", false);
        pluginGeneratedSerialDescriptor.addElement("securityFooter", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimerFooterMarkdown", false);
        pluginGeneratedSerialDescriptor.addElement("payload", false);
        pluginGeneratedSerialDescriptor.addElement("isTrialMember", false);
        pluginGeneratedSerialDescriptor.addElement("promoCode", false);
        pluginGeneratedSerialDescriptor.addElement("membershipTier", false);
        pluginGeneratedSerialDescriptor.addElement("navigationBarText", false);
        pluginGeneratedSerialDescriptor.addElement("mobileScreenName", false);
        pluginGeneratedSerialDescriptor.addElement("analyticsName", false);
        pluginGeneratedSerialDescriptor.addElement("progressCircle", false);
        pluginGeneratedSerialDescriptor.addElement("footerButtons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrialOfferCheckoutModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = TrialOfferCheckoutModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{OrderDetails$$serializer.INSTANCE, PaymentOptions$$serializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), C25452a.f99689a, stringSerializer, stringSerializer, AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(ProgressButtonModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[13].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final TrialOfferCheckoutModel deserialize(InterfaceC40541d decoder) {
        String str;
        int i13;
        OrderDetails orderDetails;
        PaymentOptions paymentOptions;
        List list;
        ProgressButtonModel progressButtonModel;
        String str2;
        String str3;
        Boolean bool;
        TextResource textResource;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = TrialOfferCheckoutModel.$childSerializers;
        int i14 = 9;
        OrderDetails orderDetails2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            OrderDetails orderDetails3 = (OrderDetails) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, OrderDetails$$serializer.INSTANCE, null);
            PaymentOptions paymentOptions2 = (PaymentOptions) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, PaymentOptions$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            TextResource textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, BooleanSerializer.INSTANCE, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            progressButtonModel = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, ProgressButtonModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, (InterfaceC37137b) interfaceC23462hArr[13].getValue(), null);
            i13 = 16383;
            textResource = textResource2;
            str3 = str11;
            str2 = str10;
            bool = bool2;
            str5 = strDecodeStringElement2;
            str4 = strDecodeStringElement;
            str6 = strDecodeStringElement3;
            str7 = strDecodeStringElement4;
            str = str9;
            str8 = strDecodeStringElement5;
            paymentOptions = paymentOptions2;
            orderDetails = orderDetails3;
        } else {
            int i15 = 13;
            int i16 = 0;
            String str12 = null;
            PaymentOptions paymentOptions3 = null;
            List list2 = null;
            ProgressButtonModel progressButtonModel2 = null;
            String str13 = null;
            String str14 = null;
            Boolean bool3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            boolean z4 = true;
            TextResource textResource3 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 9;
                        break;
                    case 0:
                        orderDetails2 = (OrderDetails) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, OrderDetails$$serializer.INSTANCE, orderDetails2);
                        i16 |= 1;
                        i15 = 13;
                        i14 = 9;
                        break;
                    case 1:
                        paymentOptions3 = (PaymentOptions) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, PaymentOptions$$serializer.INSTANCE, paymentOptions3);
                        i16 |= 2;
                        i15 = 13;
                        i14 = 9;
                        break;
                    case 2:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str12);
                        i16 |= 4;
                        i15 = 13;
                        i14 = 9;
                        break;
                    case 3:
                        textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource3);
                        i16 |= 8;
                        i15 = 13;
                        i14 = 9;
                        break;
                    case 4:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        i15 = 13;
                        i14 = 9;
                        break;
                    case 5:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i15 = 13;
                        i14 = 9;
                        break;
                    case 6:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, BooleanSerializer.INSTANCE, bool3);
                        i16 |= 64;
                        i15 = 13;
                        i14 = 9;
                        break;
                    case 7:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str13);
                        i16 |= 128;
                        i15 = 13;
                        i14 = 9;
                        break;
                    case 8:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 8);
                        i16 |= 256;
                        i15 = 13;
                        break;
                    case 9:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, StringSerializer.INSTANCE, str14);
                        i16 |= 512;
                        i15 = 13;
                        break;
                    case 10:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = 13;
                        break;
                    case 11:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i15 = 13;
                        break;
                    case 12:
                        progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel2);
                        i16 |= 4096;
                        i15 = 13;
                        break;
                    case 13:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list2);
                        i16 |= DfuBaseService.ERROR_REMOTE_MASK;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str12;
            i13 = i16;
            orderDetails = orderDetails2;
            paymentOptions = paymentOptions3;
            list = list2;
            progressButtonModel = progressButtonModel2;
            str2 = str13;
            str3 = str14;
            bool = bool3;
            textResource = textResource3;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new TrialOfferCheckoutModel(i13, orderDetails, paymentOptions, str, textResource, str4, str5, bool, str2, str6, str3, str7, str8, progressButtonModel, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, TrialOfferCheckoutModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        TrialOfferCheckoutModel.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
