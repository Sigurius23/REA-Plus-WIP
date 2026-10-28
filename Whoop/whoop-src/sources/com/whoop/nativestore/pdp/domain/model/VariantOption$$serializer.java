package com.whoop.nativestore.pdp.domain.model;

import ad3.C0771n;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/nativestore/pdp/domain/model/VariantOption.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class VariantOption$$serializer implements GeneratedSerializer<VariantOption> {
    public static final int $stable;
    public static final VariantOption$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        VariantOption$$serializer variantOption$$serializer = new VariantOption$$serializer();
        INSTANCE = variantOption$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.nativestore.pdp.domain.model.VariantOption", variantOption$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("sku", false);
        pluginGeneratedSerialDescriptor.addElement("price", false);
        pluginGeneratedSerialDescriptor.addElement("priceAmount", true);
        pluginGeneratedSerialDescriptor.addElement("priceCurrencyCode", false);
        pluginGeneratedSerialDescriptor.addElement("discountedPrice", true);
        pluginGeneratedSerialDescriptor.addElement("images", true);
        pluginGeneratedSerialDescriptor.addElement("imagesWithLabels", true);
        pluginGeneratedSerialDescriptor.addElement("hasStock", true);
        pluginGeneratedSerialDescriptor.addElement("attributes", true);
        pluginGeneratedSerialDescriptor.addElement("productAccordionEntries", true);
        pluginGeneratedSerialDescriptor.addElement("productTag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VariantOption$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = VariantOption.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer, AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[5].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue()), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[8].getValue()), interfaceC23462hArr[9].getValue(), AbstractC38195a.m122336d(C0771n.f2806a)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final VariantOption deserialize(InterfaceC40541d decoder) {
        boolean z4;
        Map map;
        List list;
        List list2;
        JsonElement jsonElement;
        List list3;
        String str;
        int i13;
        int i14;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = VariantOption.$childSerializers;
        int i15 = 10;
        int i16 = 0;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, null);
            List list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            Map map2 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
            List list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), null);
            list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), null);
            str2 = strDecodeStringElement;
            jsonElement = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, C0771n.f2806a, null);
            z4 = zDecodeBooleanElement;
            str4 = strDecodeStringElement3;
            str = str5;
            i14 = iDecodeIntElement;
            i13 = 2047;
            map = map2;
            list2 = list4;
            list = list5;
            str3 = strDecodeStringElement2;
        } else {
            int i17 = 6;
            int i18 = 5;
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            Map map3 = null;
            List list6 = null;
            List list7 = null;
            JsonElement jsonElement2 = null;
            List list8 = null;
            String str6 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement2 = 0;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i15 = 10;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 0:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i15 = 10;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 1:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i15 = 10;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 2:
                        i16 |= 4;
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 2);
                        i15 = 10;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 3:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        i15 = 10;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 4:
                        str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str6);
                        i16 |= 16;
                        i15 = 10;
                        i18 = 5;
                        i17 = 6;
                        break;
                    case 5:
                        list7 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i18, (InterfaceC37137b) interfaceC23462hArr[i18].getValue(), list7);
                        i16 |= 32;
                        i15 = 10;
                        i17 = 6;
                        break;
                    case 6:
                        map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), map3);
                        i16 |= 64;
                        i15 = 10;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 7);
                        i16 |= 128;
                        break;
                    case 8:
                        list6 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, (InterfaceC37137b) interfaceC23462hArr[8].getValue(), list6);
                        i16 |= 256;
                        break;
                    case 9:
                        list8 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 9, (InterfaceC37137b) interfaceC23462hArr[9].getValue(), list8);
                        i16 |= 512;
                        break;
                    case 10:
                        jsonElement2 = (JsonElement) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, C0771n.f2806a, jsonElement2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            map = map3;
            list = list6;
            list2 = list7;
            jsonElement = jsonElement2;
            list3 = list8;
            str = str6;
            i13 = i16;
            i14 = iDecodeIntElement2;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new VariantOption(i13, str2, str3, i14, str4, str, list2, map, z4, list, list3, jsonElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, VariantOption value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        VariantOption.write$Self$native_store_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
