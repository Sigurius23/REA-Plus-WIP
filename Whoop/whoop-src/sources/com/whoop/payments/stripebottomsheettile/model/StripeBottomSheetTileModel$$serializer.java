package com.whoop.payments.stripebottomsheettile.model;

import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderModel$$serializer;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class StripeBottomSheetTileModel$$serializer implements GeneratedSerializer<StripeBottomSheetTileModel> {
    public static final int $stable;
    public static final StripeBottomSheetTileModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        StripeBottomSheetTileModel$$serializer stripeBottomSheetTileModel$$serializer = new StripeBottomSheetTileModel$$serializer();
        INSTANCE = stripeBottomSheetTileModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel", stripeBottomSheetTileModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodTile", false);
        pluginGeneratedSerialDescriptor.addElement("acceptedPaymentMethods", false);
        pluginGeneratedSerialDescriptor.addElement("paymentSheetMetadata", false);
        pluginGeneratedSerialDescriptor.addElement("defaultPaymentMethodOnFile", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StripeBottomSheetTileModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(HeaderModel$$serializer.INSTANCE), PaymentMethodMenuTileModel$$serializer.INSTANCE, StripeBottomSheetTileModel.$childSerializers[2].getValue(), PaymentSheetMetadata$$serializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final StripeBottomSheetTileModel deserialize(InterfaceC40541d decoder) {
        boolean zDecodeBooleanElement;
        int i13;
        HeaderModel headerModel;
        PaymentMethodMenuTileModel paymentMethodMenuTileModel;
        List list;
        PaymentSheetMetadata paymentSheetMetadata;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = StripeBottomSheetTileModel.$childSerializers;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            HeaderModel headerModel2 = (HeaderModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, HeaderModel$$serializer.INSTANCE, null);
            PaymentMethodMenuTileModel paymentMethodMenuTileModel2 = (PaymentMethodMenuTileModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, PaymentMethodMenuTileModel$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            headerModel = headerModel2;
            paymentSheetMetadata = (PaymentSheetMetadata) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, PaymentSheetMetadata$$serializer.INSTANCE, null);
            zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            i13 = 31;
            paymentMethodMenuTileModel = paymentMethodMenuTileModel2;
        } else {
            boolean z4 = true;
            boolean zDecodeBooleanElement2 = false;
            HeaderModel headerModel3 = null;
            PaymentMethodMenuTileModel paymentMethodMenuTileModel3 = null;
            List list2 = null;
            PaymentSheetMetadata paymentSheetMetadata2 = null;
            int i14 = 0;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    headerModel3 = (HeaderModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, HeaderModel$$serializer.INSTANCE, headerModel3);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    paymentMethodMenuTileModel3 = (PaymentMethodMenuTileModel) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, PaymentMethodMenuTileModel$$serializer.INSTANCE, paymentMethodMenuTileModel3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), list2);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    paymentSheetMetadata2 = (PaymentSheetMetadata) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, PaymentSheetMetadata$$serializer.INSTANCE, paymentSheetMetadata2);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                    i14 |= 16;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i13 = i14;
            headerModel = headerModel3;
            paymentMethodMenuTileModel = paymentMethodMenuTileModel3;
            list = list2;
            paymentSheetMetadata = paymentSheetMetadata2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new StripeBottomSheetTileModel(i13, headerModel, paymentMethodMenuTileModel, list, paymentSheetMetadata, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, StripeBottomSheetTileModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        StripeBottomSheetTileModel.write$Self$payments_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
