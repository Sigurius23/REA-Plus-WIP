package com.stripe.android.core.networking;

import ad3.C0771n;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p664yy.EnumC39868k0;
import p664yy.EnumC39870l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/core/networking/AnalyticsRequestV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/core/networking/AnalyticsRequestV2;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class AnalyticsRequestV2$$serializer implements GeneratedSerializer<AnalyticsRequestV2> {
    public static final AnalyticsRequestV2$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        AnalyticsRequestV2$$serializer analyticsRequestV2$$serializer = new AnalyticsRequestV2$$serializer();
        INSTANCE = analyticsRequestV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.core.networking.AnalyticsRequestV2", analyticsRequestV2$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("eventName", false);
        pluginGeneratedSerialDescriptor.addElement("clientId", false);
        pluginGeneratedSerialDescriptor.addElement(AnalyticsRequestV2.HEADER_ORIGIN, false);
        pluginGeneratedSerialDescriptor.addElement(AnalyticsRequestV2.PARAM_CREATED, false);
        pluginGeneratedSerialDescriptor.addElement("params", false);
        pluginGeneratedSerialDescriptor.addElement("postParameters", true);
        pluginGeneratedSerialDescriptor.addElement("headers", true);
        pluginGeneratedSerialDescriptor.addElement("method", true);
        pluginGeneratedSerialDescriptor.addElement("mimeType", true);
        pluginGeneratedSerialDescriptor.addElement("retryResponseCodes", true);
        pluginGeneratedSerialDescriptor.addElement(QueryParams.URL, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AnalyticsRequestV2$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = AnalyticsRequestV2.$childSerializers;
        InterfaceC37138c interfaceC37138c = interfaceC37138cArr[6];
        InterfaceC37138c interfaceC37138c2 = interfaceC37138cArr[7];
        InterfaceC37138c interfaceC37138c3 = interfaceC37138cArr[8];
        InterfaceC37138c interfaceC37138c4 = interfaceC37138cArr[9];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, DoubleSerializer.INSTANCE, C0771n.f2806a, stringSerializer, interfaceC37138c, interfaceC37138c2, interfaceC37138c3, interfaceC37138c4, stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final AnalyticsRequestV2 deserialize(InterfaceC40541d decoder) {
        int i13;
        EnumC39870l0 enumC39870l0;
        Iterable iterable;
        EnumC39868k0 enumC39868k0;
        Map map;
        JsonElement jsonElement;
        String str;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement;
        double d3;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC37138c[] interfaceC37138cArr = AnalyticsRequestV2.$childSerializers;
        int i14 = 10;
        String strDecodeStringElement2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            double dDecodeDoubleElement = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
            JsonElement jsonElement2 = (JsonElement) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C0771n.f2806a, null);
            String strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
            Map map2 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, interfaceC37138cArr[6], null);
            EnumC39868k0 enumC39868k1 = (EnumC39868k0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, interfaceC37138cArr[7], null);
            EnumC39870l0 enumC39870l1 = (EnumC39870l0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, interfaceC37138cArr[8], null);
            iterable = (Iterable) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, interfaceC37138cArr[9], null);
            str = strDecodeStringElement3;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 10);
            str4 = strDecodeStringElement6;
            jsonElement = jsonElement2;
            map = map2;
            str3 = strDecodeStringElement5;
            i13 = 2047;
            enumC39868k0 = enumC39868k1;
            enumC39870l0 = enumC39870l1;
            str2 = strDecodeStringElement4;
            d3 = dDecodeDoubleElement;
        } else {
            boolean z4 = true;
            int i15 = 0;
            EnumC39870l0 enumC39870l2 = null;
            Iterable iterable2 = null;
            EnumC39868k0 enumC39868k2 = null;
            Map map3 = null;
            JsonElement jsonElement3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            double dDecodeDoubleElement2 = 0.0d;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 10;
                        break;
                    case 0:
                        i15 |= 1;
                        strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 10;
                        break;
                    case 1:
                        strDecodeStringElement9 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i15 |= 2;
                        i14 = 10;
                        break;
                    case 2:
                        strDecodeStringElement10 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i15 |= 4;
                        i14 = 10;
                        break;
                    case 3:
                        dDecodeDoubleElement2 = interfaceC40539bBeginStructure.decodeDoubleElement(interfaceC39443g, 3);
                        i15 |= 8;
                        i14 = 10;
                        break;
                    case 4:
                        jsonElement3 = (JsonElement) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 4, C0771n.f2806a, jsonElement3);
                        i15 |= 16;
                        i14 = 10;
                        break;
                    case 5:
                        strDecodeStringElement7 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, interfaceC37138cArr[6], map3);
                        i15 |= 64;
                        break;
                    case 7:
                        enumC39868k2 = (EnumC39868k0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, interfaceC37138cArr[7], enumC39868k2);
                        i15 |= 128;
                        break;
                    case 8:
                        enumC39870l2 = (EnumC39870l0) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 8, interfaceC37138cArr[8], enumC39870l2);
                        i15 |= 256;
                        break;
                    case 9:
                        iterable2 = (Iterable) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, interfaceC37138cArr[9], iterable2);
                        i15 |= 512;
                        break;
                    case 10:
                        strDecodeStringElement8 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, i14);
                        i15 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            enumC39870l0 = enumC39870l2;
            iterable = iterable2;
            enumC39868k0 = enumC39868k2;
            map = map3;
            jsonElement = jsonElement3;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement10;
            str4 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement8;
            d3 = dDecodeDoubleElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new AnalyticsRequestV2(i13, str, str2, str3, d3, jsonElement, str4, map, enumC39868k0, enumC39870l0, iterable, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, AnalyticsRequestV2 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        AnalyticsRequestV2.write$Self$stripe_core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
