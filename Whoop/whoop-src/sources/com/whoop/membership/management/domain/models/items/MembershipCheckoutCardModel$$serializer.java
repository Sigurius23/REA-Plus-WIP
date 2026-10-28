package com.whoop.membership.management.domain.models.items;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class MembershipCheckoutCardModel$$serializer implements GeneratedSerializer<MembershipCheckoutCardModel> {
    public static final int $stable;
    public static final MembershipCheckoutCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        MembershipCheckoutCardModel$$serializer membershipCheckoutCardModel$$serializer = new MembershipCheckoutCardModel$$serializer();
        INSTANCE = membershipCheckoutCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.membership.management.domain.models.items.MembershipCheckoutCardModel", membershipCheckoutCardModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("expandedSubtitle", false);
        pluginGeneratedSerialDescriptor.addElement("price", false);
        pluginGeneratedSerialDescriptor.addElement("expandedPrice", false);
        pluginGeneratedSerialDescriptor.addElement("summaryItems", false);
        pluginGeneratedSerialDescriptor.addElement("expandTitle", false);
        pluginGeneratedSerialDescriptor.addElement("expandText", false);
        pluginGeneratedSerialDescriptor.addElement("paymentOptions", false);
        pluginGeneratedSerialDescriptor.addElement("primaryCta", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryCta", false);
        pluginGeneratedSerialDescriptor.addElement("footerText", false);
        pluginGeneratedSerialDescriptor.addElement("confirmModal", false);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("checkoutType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MembershipCheckoutCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = MembershipCheckoutCardModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[5].getValue(), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(CheckoutPaymentOptionsModel$$serializer.INSTANCE), CtaModel$$serializer.INSTANCE, AbstractC38195a.m122336d(CtaWithNullableDestinationModel$$serializer.INSTANCE), stringSerializer, AbstractC38195a.m122336d(ConfirmModalModel$$serializer.INSTANCE), stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final MembershipCheckoutCardModel deserialize(InterfaceC40541d decoder) {
        CheckoutPaymentOptionsModel checkoutPaymentOptionsModel;
        String str;
        String str2;
        String str3;
        int i13;
        CtaWithNullableDestinationModel ctaWithNullableDestinationModel;
        CtaModel ctaModel;
        String str4;
        ConfirmModalModel confirmModalModel;
        String str5;
        List list;
        String str6;
        String str7;
        String str8;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = MembershipCheckoutCardModel.$childSerializers;
        String strDecodeStringElement3 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            CheckoutPaymentOptionsModel checkoutPaymentOptionsModel2 = (CheckoutPaymentOptionsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, CheckoutPaymentOptionsModel$$serializer.INSTANCE, null);
            CtaModel ctaModel2 = (CtaModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, CtaModel$$serializer.INSTANCE, null);
            CtaWithNullableDestinationModel ctaWithNullableDestinationModel2 = (CtaWithNullableDestinationModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, CtaWithNullableDestinationModel$$serializer.INSTANCE, null);
            String strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            confirmModalModel = (ConfirmModalModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, ConfirmModalModel$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement4;
            str4 = str11;
            str6 = strDecodeStringElement5;
            str5 = str12;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 13);
            ctaWithNullableDestinationModel = ctaWithNullableDestinationModel2;
            ctaModel = ctaModel2;
            checkoutPaymentOptionsModel = checkoutPaymentOptionsModel2;
            str8 = strDecodeStringElement7;
            str7 = strDecodeStringElement6;
            strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 14);
            str = str10;
            str2 = str9;
            i13 = 32767;
            list = list2;
        } else {
            int i14 = 14;
            int i15 = 5;
            boolean z4 = true;
            int i16 = 0;
            CheckoutPaymentOptionsModel checkoutPaymentOptionsModel3 = null;
            String str13 = null;
            String str14 = null;
            CtaWithNullableDestinationModel ctaWithNullableDestinationModel3 = null;
            CtaModel ctaModel3 = null;
            String str15 = null;
            ConfirmModalModel confirmModalModel2 = null;
            String str16 = null;
            List list3 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 14;
                        i15 = 5;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 14;
                        i15 = 5;
                        break;
                    case 1:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 14;
                        i15 = 5;
                        break;
                    case 2:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str14);
                        i16 |= 4;
                        i14 = 14;
                        i15 = 5;
                        break;
                    case 3:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i14 = 14;
                        i15 = 5;
                        break;
                    case 4:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str13);
                        i16 |= 16;
                        i14 = 14;
                        i15 = 5;
                        break;
                    case 5:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list3);
                        i16 |= 32;
                        i14 = 14;
                        break;
                    case 6:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str15);
                        i16 |= 64;
                        i14 = 14;
                        break;
                    case 7:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str16);
                        i16 |= 128;
                        i14 = 14;
                        break;
                    case 8:
                        checkoutPaymentOptionsModel3 = (CheckoutPaymentOptionsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, CheckoutPaymentOptionsModel$$serializer.INSTANCE, checkoutPaymentOptionsModel3);
                        i16 |= 256;
                        i14 = 14;
                        break;
                    case 9:
                        ctaModel3 = (CtaModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, CtaModel$$serializer.INSTANCE, ctaModel3);
                        i16 |= 512;
                        i14 = 14;
                        break;
                    case 10:
                        ctaWithNullableDestinationModel3 = (CtaWithNullableDestinationModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, CtaWithNullableDestinationModel$$serializer.INSTANCE, ctaWithNullableDestinationModel3);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i14 = 14;
                        break;
                    case 11:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i14 = 14;
                        break;
                    case 12:
                        confirmModalModel2 = (ConfirmModalModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, ConfirmModalModel$$serializer.INSTANCE, confirmModalModel2);
                        i16 |= 4096;
                        i14 = 14;
                        break;
                    case 13:
                        strDecodeStringElement11 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 13);
                        i16 |= DfuBaseService.ERROR_REMOTE_MASK;
                        break;
                    case 14:
                        strDecodeStringElement12 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i16 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            checkoutPaymentOptionsModel = checkoutPaymentOptionsModel3;
            str = str13;
            str2 = str14;
            str3 = strDecodeStringElement3;
            i13 = i16;
            ctaWithNullableDestinationModel = ctaWithNullableDestinationModel3;
            ctaModel = ctaModel3;
            str4 = str15;
            confirmModalModel = confirmModalModel2;
            str5 = str16;
            list = list3;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
            strDecodeStringElement = strDecodeStringElement11;
            strDecodeStringElement2 = strDecodeStringElement12;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new MembershipCheckoutCardModel(i13, str3, str6, str2, str7, str, list, str4, str5, checkoutPaymentOptionsModel, ctaModel, ctaWithNullableDestinationModel, str8, confirmModalModel, strDecodeStringElement, strDecodeStringElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, MembershipCheckoutCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        MembershipCheckoutCardModel.write$Self$membership_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
