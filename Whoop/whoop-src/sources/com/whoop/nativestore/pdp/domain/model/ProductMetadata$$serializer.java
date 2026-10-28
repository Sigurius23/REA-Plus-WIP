package com.whoop.nativestore.pdp.domain.model;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/nativestore/pdp/domain/model/ProductMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ProductMetadata$$serializer implements GeneratedSerializer<ProductMetadata> {
    public static final int $stable;
    public static final ProductMetadata$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ProductMetadata$$serializer productMetadata$$serializer = new ProductMetadata$$serializer();
        INSTANCE = productMetadata$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.nativestore.pdp.domain.model.ProductMetadata", productMetadata$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("initiallySelectedSku", true);
        pluginGeneratedSerialDescriptor.addElement("initiallySelectedPrice", true);
        pluginGeneratedSerialDescriptor.addElement("initialVariantHasStock", true);
        pluginGeneratedSerialDescriptor.addElement("packSku", true);
        pluginGeneratedSerialDescriptor.addElement("packPrice", true);
        pluginGeneratedSerialDescriptor.addElement("packItemMetadata", true);
        pluginGeneratedSerialDescriptor.addElement("wywMetadata", true);
        pluginGeneratedSerialDescriptor.addElement("products", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProductMetadata$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ProductMetadata.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(BooleanSerializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[5].getValue()), AbstractC38195a.m122336d(WhoopYourWayMetadata$$serializer.INSTANCE), interfaceC23462hArr[7].getValue()};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ProductMetadata deserialize(InterfaceC40541d decoder) {
        int i13;
        Map map;
        WhoopYourWayMetadata whoopYourWayMetadata;
        Map map2;
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ProductMetadata.$childSerializers;
        int i14 = 6;
        String str5 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, stringSerializer, null);
            Boolean bool2 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, BooleanSerializer.INSTANCE, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, stringSerializer, null);
            String str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, stringSerializer, null);
            Map map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), null);
            WhoopYourWayMetadata whoopYourWayMetadata2 = (WhoopYourWayMetadata) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, WhoopYourWayMetadata$$serializer.INSTANCE, null);
            map = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), null);
            str = str9;
            whoopYourWayMetadata = whoopYourWayMetadata2;
            str4 = str8;
            map2 = map3;
            bool = bool2;
            i13 = 255;
            str3 = str7;
            str2 = str6;
        } else {
            boolean z4 = true;
            int i15 = 0;
            Map map4 = null;
            WhoopYourWayMetadata whoopYourWayMetadata3 = null;
            Map map5 = null;
            String str10 = null;
            String str11 = null;
            Boolean bool3 = null;
            String str12 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i14 = 6;
                        break;
                    case 0:
                        str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, StringSerializer.INSTANCE, str5);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str11);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        bool3 = (Boolean) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, BooleanSerializer.INSTANCE, bool3);
                        i15 |= 4;
                        i14 = 6;
                        break;
                    case 3:
                        str12 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, StringSerializer.INSTANCE, str12);
                        i15 |= 8;
                        i14 = 6;
                        break;
                    case 4:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, StringSerializer.INSTANCE, str10);
                        i15 |= 16;
                        i14 = 6;
                        break;
                    case 5:
                        map5 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, (InterfaceC37137b) interfaceC23462hArr[5].getValue(), map5);
                        i15 |= 32;
                        break;
                    case 6:
                        whoopYourWayMetadata3 = (WhoopYourWayMetadata) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, WhoopYourWayMetadata$$serializer.INSTANCE, whoopYourWayMetadata3);
                        i15 |= 64;
                        break;
                    case 7:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, (InterfaceC37137b) interfaceC23462hArr[7].getValue(), map4);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            map = map4;
            whoopYourWayMetadata = whoopYourWayMetadata3;
            map2 = map5;
            str = str10;
            str2 = str5;
            str3 = str11;
            bool = bool3;
            str4 = str12;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ProductMetadata(i13, str2, str3, bool, str4, str, map2, whoopYourWayMetadata, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ProductMetadata value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ProductMetadata.write$Self$native_store_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
