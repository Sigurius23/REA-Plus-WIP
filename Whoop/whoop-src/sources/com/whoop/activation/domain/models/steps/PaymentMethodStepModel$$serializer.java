package com.whoop.activation.domain.models.steps;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/activation/domain/models/steps/PaymentMethodStepModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class PaymentMethodStepModel$$serializer implements GeneratedSerializer<PaymentMethodStepModel> {
    public static final int $stable;
    public static final PaymentMethodStepModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        PaymentMethodStepModel$$serializer paymentMethodStepModel$$serializer = new PaymentMethodStepModel$$serializer();
        INSTANCE = paymentMethodStepModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.activation.domain.models.steps.PaymentMethodStepModel", paymentMethodStepModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("acceptedPaymentTypes", false);
        pluginGeneratedSerialDescriptor.addElement("textEntries", false);
        pluginGeneratedSerialDescriptor.addElement("errorMessages", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimerText", false);
        pluginGeneratedSerialDescriptor.addElement("upcycleJoinTodaySubtitle", false);
        pluginGeneratedSerialDescriptor.addElement("upcycleCreditCardVariant", false);
        pluginGeneratedSerialDescriptor.addElement("analyticsValue", false);
        pluginGeneratedSerialDescriptor.addElement("infoCalloutTile", false);
        pluginGeneratedSerialDescriptor.addElement("navigationBarText", false);
        pluginGeneratedSerialDescriptor.addElement("mobileScreenName", false);
        pluginGeneratedSerialDescriptor.addElement("analyticsName", false);
        pluginGeneratedSerialDescriptor.addElement("progressCircle", false);
        pluginGeneratedSerialDescriptor.addElement("footerButtons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentMethodStepModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = PaymentMethodStepModel.$childSerializers;
        C25452a c25452a = C25452a.f99689a;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{c25452a, c25452a, interfaceC23462hArr[2].getValue(), interfaceC23462hArr[3].getValue(), PaymentErrorMessages$$serializer.INSTANCE, c25452a, AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(InfoCalloutTileModel$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), stringSerializer, stringSerializer, AbstractC38195a.m122336d(ProgressButtonModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[14].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final PaymentMethodStepModel deserialize(InterfaceC40541d decoder) {
        TextResource textResource;
        int i13;
        List list;
        TextResource textResource2;
        ProgressButtonModel progressButtonModel;
        InfoCalloutTileModel infoCalloutTileModel;
        String str;
        String str2;
        String str3;
        String str4;
        PaymentErrorMessages paymentErrorMessages;
        TextResource textResource3;
        List list2;
        String str5;
        String str6;
        List list3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = PaymentMethodStepModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            C25452a c25452a = C25452a.f99689a;
            TextResource textResource4 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, c25452a, null);
            TextResource textResource5 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, c25452a, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            List list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            PaymentErrorMessages paymentErrorMessages2 = (PaymentErrorMessages) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, PaymentErrorMessages$$serializer.INSTANCE, null);
            TextResource textResource6 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, c25452a, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, stringSerializer, null);
            InfoCalloutTileModel infoCalloutTileModel2 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, InfoCalloutTileModel$$serializer.INSTANCE, null);
            String str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
            progressButtonModel = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, ProgressButtonModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, (InterfaceC37137b) interfaceC23462hArr[14].getValue(), null);
            i13 = 32767;
            str6 = strDecodeStringElement2;
            list2 = list4;
            infoCalloutTileModel = infoCalloutTileModel2;
            str2 = str8;
            str4 = str7;
            str3 = str10;
            str = str9;
            paymentErrorMessages = paymentErrorMessages2;
            list3 = list5;
            str5 = strDecodeStringElement;
            textResource = textResource4;
            textResource3 = textResource6;
            textResource2 = textResource5;
        } else {
            int i14 = 14;
            boolean z4 = true;
            List list6 = null;
            List list7 = null;
            TextResource textResource7 = null;
            ProgressButtonModel progressButtonModel2 = null;
            InfoCalloutTileModel infoCalloutTileModel3 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            TextResource textResource8 = null;
            int i15 = 2;
            int i16 = 3;
            int i17 = 0;
            List list8 = null;
            PaymentErrorMessages paymentErrorMessages3 = null;
            TextResource textResource9 = null;
            while (z4) {
                int i18 = i14;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        list8 = list8;
                        list6 = list6;
                        i14 = 14;
                        i15 = 2;
                        i16 = 3;
                        break;
                    case 0:
                        textResource8 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C25452a.f99689a, textResource8);
                        i17 |= 1;
                        list8 = list8;
                        list6 = list6;
                        i14 = 14;
                        i15 = 2;
                        i16 = 3;
                        break;
                    case 1:
                        list6 = list6;
                        textResource7 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, C25452a.f99689a, textResource7);
                        i17 |= 2;
                        list6 = list6;
                        i14 = 14;
                        i15 = 2;
                        i16 = 3;
                        break;
                    case 2:
                        list8 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, (InterfaceC37137b) interfaceC23462hArr[i15].getValue(), list8);
                        i17 |= 4;
                        textResource7 = textResource7;
                        i14 = 14;
                        i16 = 3;
                        break;
                    case 3:
                        list6 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list6);
                        i17 |= 8;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 4:
                        paymentErrorMessages3 = (PaymentErrorMessages) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, PaymentErrorMessages$$serializer.INSTANCE, paymentErrorMessages3);
                        i17 |= 16;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 5:
                        textResource9 = (TextResource) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, C25452a.f99689a, textResource9);
                        i17 |= 32;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 6:
                        str14 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str14);
                        i17 |= 64;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 7:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, StringSerializer.INSTANCE, str12);
                        i17 |= 128;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 8:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, StringSerializer.INSTANCE, str11);
                        i17 |= 256;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 9:
                        infoCalloutTileModel3 = (InfoCalloutTileModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, InfoCalloutTileModel$$serializer.INSTANCE, infoCalloutTileModel3);
                        i17 |= 512;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 10:
                        str13 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str13);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 11:
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 11);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 12:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 12);
                        i17 |= 4096;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 13:
                        progressButtonModel2 = (ProgressButtonModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, ProgressButtonModel$$serializer.INSTANCE, progressButtonModel2);
                        i17 |= DfuBaseService.ERROR_REMOTE_MASK;
                        textResource7 = textResource7;
                        i14 = 14;
                        break;
                    case 14:
                        list7 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list7);
                        i17 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        i14 = i18;
                        textResource7 = textResource7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            textResource = textResource8;
            i13 = i17;
            list = list7;
            textResource2 = textResource7;
            progressButtonModel = progressButtonModel2;
            infoCalloutTileModel = infoCalloutTileModel3;
            str = str11;
            str2 = str12;
            str3 = str13;
            str4 = str14;
            paymentErrorMessages = paymentErrorMessages3;
            textResource3 = textResource9;
            list2 = list8;
            str5 = strDecodeStringElement3;
            str6 = strDecodeStringElement4;
            list3 = list6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new PaymentMethodStepModel(i13, textResource, textResource2, list2, list3, paymentErrorMessages, textResource3, str4, str2, str, infoCalloutTileModel, str3, str5, str6, progressButtonModel, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, PaymentMethodStepModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        PaymentMethodStepModel.write$Self$activation_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
