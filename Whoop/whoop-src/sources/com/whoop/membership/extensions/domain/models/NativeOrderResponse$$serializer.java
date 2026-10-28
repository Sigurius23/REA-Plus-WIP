package com.whoop.membership.extensions.domain.models;

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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/membership/extensions/domain/models/NativeOrderResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class NativeOrderResponse$$serializer implements GeneratedSerializer<NativeOrderResponse> {
    public static final int $stable;
    public static final NativeOrderResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        NativeOrderResponse$$serializer nativeOrderResponse$$serializer = new NativeOrderResponse$$serializer();
        INSTANCE = nativeOrderResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.membership.extensions.domain.models.NativeOrderResponse", nativeOrderResponse$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("payment_options", false);
        pluginGeneratedSerialDescriptor.addElement("order_details", false);
        pluginGeneratedSerialDescriptor.addElement("order_options", false);
        pluginGeneratedSerialDescriptor.addElement("promo_code", false);
        pluginGeneratedSerialDescriptor.addElement("checkout_cta_title", false);
        pluginGeneratedSerialDescriptor.addElement("security_footer", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimer_footer_markdown", false);
        pluginGeneratedSerialDescriptor.addElement("checkout_step", false);
        pluginGeneratedSerialDescriptor.addElement("loading_progress_content", false);
        pluginGeneratedSerialDescriptor.addElement("payload", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NativeOrderResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = NativeOrderResponse.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, NativeOrderPaymentOption$$serializer.INSTANCE, NativeOrderDetails$$serializer.INSTANCE, interfaceC23462hArr[3].getValue(), AbstractC38195a.m122336d(NativeOrderPromoCode$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, StepPrefetchContent$$serializer.INSTANCE, ProgressContent$$serializer.INSTANCE, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final NativeOrderResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        ProgressContent progressContent;
        StepPrefetchContent stepPrefetchContent;
        List list;
        NativeOrderPromoCode nativeOrderPromoCode;
        NativeOrderDetails nativeOrderDetails;
        NativeOrderPaymentOption nativeOrderPaymentOption;
        String str;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = NativeOrderResponse.$childSerializers;
        int i14 = 10;
        int i15 = 9;
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            NativeOrderPaymentOption nativeOrderPaymentOption2 = (NativeOrderPaymentOption) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, NativeOrderPaymentOption$$serializer.INSTANCE, null);
            NativeOrderDetails nativeOrderDetails2 = (NativeOrderDetails) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, NativeOrderDetails$$serializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            NativeOrderPromoCode nativeOrderPromoCode2 = (NativeOrderPromoCode) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, NativeOrderPromoCode$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
            StepPrefetchContent stepPrefetchContent2 = (StepPrefetchContent) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, StepPrefetchContent$$serializer.INSTANCE, null);
            ProgressContent progressContent2 = (ProgressContent) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, ProgressContent$$serializer.INSTANCE, null);
            list = list2;
            str = strDecodeStringElement3;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            progressContent = progressContent2;
            str4 = strDecodeStringElement6;
            str3 = strDecodeStringElement5;
            str2 = strDecodeStringElement4;
            stepPrefetchContent = stepPrefetchContent2;
            nativeOrderPromoCode = nativeOrderPromoCode2;
            nativeOrderDetails = nativeOrderDetails2;
            i13 = 2047;
            nativeOrderPaymentOption = nativeOrderPaymentOption2;
        } else {
            int i16 = 3;
            boolean z4 = true;
            int i17 = 0;
            ProgressContent progressContent3 = null;
            StepPrefetchContent stepPrefetchContent3 = null;
            List list3 = null;
            NativeOrderPromoCode nativeOrderPromoCode3 = null;
            NativeOrderDetails nativeOrderDetails3 = null;
            NativeOrderPaymentOption nativeOrderPaymentOption3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 10;
                        i16 = 3;
                        break;
                    case 0:
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i17 |= 1;
                        i14 = 10;
                        i15 = 9;
                        i16 = 3;
                        break;
                    case 1:
                        nativeOrderPaymentOption3 = (NativeOrderPaymentOption) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, NativeOrderPaymentOption$$serializer.INSTANCE, nativeOrderPaymentOption3);
                        i17 |= 2;
                        i14 = 10;
                        i15 = 9;
                        i16 = 3;
                        break;
                    case 2:
                        nativeOrderDetails3 = (NativeOrderDetails) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, NativeOrderDetails$$serializer.INSTANCE, nativeOrderDetails3);
                        i17 |= 4;
                        i14 = 10;
                        i15 = 9;
                        i16 = 3;
                        break;
                    case 3:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i16, (InterfaceC37137b) interfaceC23462hArr[i16].getValue(), list3);
                        i17 |= 8;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 4:
                        nativeOrderPromoCode3 = (NativeOrderPromoCode) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, NativeOrderPromoCode$$serializer.INSTANCE, nativeOrderPromoCode3);
                        i17 |= 16;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 5:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i17 |= 32;
                        i14 = 10;
                        break;
                    case 6:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 6);
                        i17 |= 64;
                        break;
                    case 7:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 7);
                        i17 |= 128;
                        break;
                    case 8:
                        stepPrefetchContent3 = (StepPrefetchContent) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, StepPrefetchContent$$serializer.INSTANCE, stepPrefetchContent3);
                        i17 |= 256;
                        break;
                    case 9:
                        progressContent3 = (ProgressContent) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, ProgressContent$$serializer.INSTANCE, progressContent3);
                        i17 |= 512;
                        break;
                    case 10:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i17 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i17;
            progressContent = progressContent3;
            stepPrefetchContent = stepPrefetchContent3;
            list = list3;
            nativeOrderPromoCode = nativeOrderPromoCode3;
            nativeOrderDetails = nativeOrderDetails3;
            nativeOrderPaymentOption = nativeOrderPaymentOption3;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            strDecodeStringElement = strDecodeStringElement10;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new NativeOrderResponse(i13, str, nativeOrderPaymentOption, nativeOrderDetails, list, nativeOrderPromoCode, str2, str3, str4, stepPrefetchContent, progressContent, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, NativeOrderResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        NativeOrderResponse.write$Self$membership_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
