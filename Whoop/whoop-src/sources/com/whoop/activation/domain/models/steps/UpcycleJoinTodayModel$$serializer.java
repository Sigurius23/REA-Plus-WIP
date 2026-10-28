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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/steps/UpcycleJoinTodayModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class UpcycleJoinTodayModel$$serializer implements GeneratedSerializer<UpcycleJoinTodayModel> {
    public static final int $stable;
    public static final UpcycleJoinTodayModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        UpcycleJoinTodayModel$$serializer upcycleJoinTodayModel$$serializer = new UpcycleJoinTodayModel$$serializer();
        INSTANCE = upcycleJoinTodayModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.steps.UpcycleJoinTodayModel", upcycleJoinTodayModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("orderDetails", false);
        pluginGeneratedSerialDescriptor.addElement("paymentMethod", false);
        pluginGeneratedSerialDescriptor.addElement("joinCtaTitle", false);
        pluginGeneratedSerialDescriptor.addElement("securityFooter", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimerFooterMarkdown", false);
        pluginGeneratedSerialDescriptor.addElement("payload", false);
        pluginGeneratedSerialDescriptor.addElement("upcycleCreditCardVariant", false);
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

    private UpcycleJoinTodayModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = UpcycleJoinTodayModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{OrderDetails$$serializer.INSTANCE, PaymentOptions$$serializer.INSTANCE, AbstractC38195a.m122336d(stringSerializer), C25452a.f99689a, stringSerializer, stringSerializer, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), stringSerializer, AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(ProgressButtonModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[14].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final UpcycleJoinTodayModel deserialize(InterfaceC40541d decoder) {
        TextResource textResource;
        String str;
        int i13;
        OrderDetails orderDetails;
        PaymentOptions paymentOptions;
        List list;
        ProgressButtonModel progressButtonModel;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = UpcycleJoinTodayModel.$childSerializers;
        int i14 = 9;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            OrderDetails orderDetails2 = (OrderDetails) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, OrderDetails$$serializer.INSTANCE, null);
            PaymentOptions paymentOptions2 = (PaymentOptions) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, PaymentOptions$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, stringSerializer, null);
            TextResource textResource2 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BooleanSerializer.INSTANCE, null);
            String str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 9);
            String str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
            str2 = str13;
            progressButtonModel = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, ProgressButtonModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            i13 = 32767;
            str9 = strDecodeStringElement5;
            textResource = textResource2;
            str7 = strDecodeStringElement3;
            bool = bool2;
            str4 = str11;
            str6 = strDecodeStringElement2;
            str5 = strDecodeStringElement;
            str3 = str12;
            str8 = strDecodeStringElement4;
            str = str10;
            orderDetails = orderDetails2;
            paymentOptions = paymentOptions2;
        } else {
            int i15 = 14;
            boolean z4 = true;
            TextResource textResource3 = null;
            OrderDetails orderDetails3 = null;
            PaymentOptions paymentOptions3 = null;
            List list2 = null;
            ProgressButtonModel progressButtonModel2 = null;
            String str14 = null;
            Boolean bool3 = null;
            String str15 = null;
            String str16 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            int i16 = 0;
            String str17 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 9;
                        break;
                    case 0:
                        orderDetails3 = (OrderDetails) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, OrderDetails$$serializer.INSTANCE, orderDetails3);
                        i16 |= 1;
                        i15 = 14;
                        i14 = 9;
                        break;
                    case 1:
                        paymentOptions3 = (PaymentOptions) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, PaymentOptions$$serializer.INSTANCE, paymentOptions3);
                        i16 |= 2;
                        i15 = 14;
                        i14 = 9;
                        break;
                    case 2:
                        str17 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, StringSerializer.INSTANCE, str17);
                        i16 |= 4;
                        i15 = 14;
                        i14 = 9;
                        break;
                    case 3:
                        textResource3 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, C25452a.f99689a, textResource3);
                        i16 |= 8;
                        i15 = 14;
                        i14 = 9;
                        break;
                    case 4:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 4);
                        i16 |= 16;
                        i15 = 14;
                        i14 = 9;
                        break;
                    case 5:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i16 |= 32;
                        i15 = 14;
                        i14 = 9;
                        break;
                    case 6:
                        str16 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str16);
                        i16 |= 64;
                        i15 = 14;
                        i14 = 9;
                        break;
                    case 7:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, BooleanSerializer.INSTANCE, bool3);
                        i16 |= 128;
                        i15 = 14;
                        i14 = 9;
                        break;
                    case 8:
                        str15 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str15);
                        i16 |= 256;
                        i15 = 14;
                        i14 = 9;
                        break;
                    case 9:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i16 |= 512;
                        i15 = 14;
                        break;
                    case 10:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str14);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        i15 = 14;
                        break;
                    case 11:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        i15 = 14;
                        break;
                    case 12:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
                        i16 |= 4096;
                        i15 = 14;
                        break;
                    case 13:
                        progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel2);
                        i16 |= DfuBaseService.ERROR_REMOTE_MASK;
                        i15 = 14;
                        break;
                    case 14:
                        list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list2);
                        i16 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource3;
            str = str17;
            i13 = i16;
            orderDetails = orderDetails3;
            paymentOptions = paymentOptions3;
            list = list2;
            progressButtonModel = progressButtonModel2;
            str2 = str14;
            bool = bool3;
            str3 = str15;
            str4 = str16;
            str5 = strDecodeStringElement6;
            str6 = strDecodeStringElement7;
            str7 = strDecodeStringElement8;
            str8 = strDecodeStringElement9;
            str9 = strDecodeStringElement10;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new UpcycleJoinTodayModel(i13, orderDetails, paymentOptions, str, textResource, str5, str6, str4, bool, str3, str7, str2, str8, str9, progressButtonModel, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, UpcycleJoinTodayModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        UpcycleJoinTodayModel.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
