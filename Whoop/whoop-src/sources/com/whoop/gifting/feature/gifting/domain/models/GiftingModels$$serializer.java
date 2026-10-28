package com.whoop.gifting.feature.gifting.domain.models;

import com.whoop.design.models.items.CountrySelectorModel;
import com.whoop.design.models.items.CountrySelectorModel$$serializer;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/gifting/feature/gifting/domain/models/GiftingModels.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class GiftingModels$$serializer implements GeneratedSerializer<GiftingModels> {
    public static final int $stable;
    public static final GiftingModels$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        GiftingModels$$serializer giftingModels$$serializer = new GiftingModels$$serializer();
        INSTANCE = giftingModels$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.gifting.feature.gifting.domain.models.GiftingModels", giftingModels$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("toolBarTitle", false);
        pluginGeneratedSerialDescriptor.addElement("initiallySelectedSegmentId", false);
        pluginGeneratedSerialDescriptor.addElement("sections", false);
        pluginGeneratedSerialDescriptor.addElement("bottomStickyItems", true);
        pluginGeneratedSerialDescriptor.addElement("bottomCommonStickyItems", true);
        pluginGeneratedSerialDescriptor.addElement("countrySelector", true);
        pluginGeneratedSerialDescriptor.addElement("analytics", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GiftingModels$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = GiftingModels.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, AbstractC38195a.m122336d(stringSerializer), interfaceC23462hArr[2].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[3].getValue()), AbstractC38195a.m122336d(BottomStickyItemsModel$$serializer.INSTANCE), AbstractC38195a.m122336d(CountrySelectorModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[6].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final GiftingModels deserialize(InterfaceC40541d decoder) {
        int i13;
        Map map;
        CountrySelectorModel countrySelectorModel;
        String str;
        String str2;
        List list;
        Map map2;
        BottomStickyItemsModel bottomStickyItemsModel;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = GiftingModels.$childSerializers;
        int i14 = 5;
        int i15 = 2;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String str3 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, null);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            Map map3 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            BottomStickyItemsModel bottomStickyItemsModel2 = (BottomStickyItemsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BottomStickyItemsModel$$serializer.INSTANCE, null);
            CountrySelectorModel countrySelectorModel2 = (CountrySelectorModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, CountrySelectorModel$$serializer.INSTANCE, null);
            map = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), null);
            str = strDecodeStringElement2;
            countrySelectorModel = countrySelectorModel2;
            bottomStickyItemsModel = bottomStickyItemsModel2;
            i13 = 127;
            map2 = map3;
            list = list2;
            str2 = str3;
        } else {
            boolean z4 = true;
            int i16 = 0;
            Map map4 = null;
            CountrySelectorModel countrySelectorModel3 = null;
            String str4 = null;
            List list3 = null;
            Map map5 = null;
            BottomStickyItemsModel bottomStickyItemsModel3 = null;
            while (z4) {
                int i17 = i15;
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i15 = 2;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i16 |= 1;
                        i14 = 5;
                        i15 = 2;
                        break;
                    case 1:
                        str4 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, StringSerializer.INSTANCE, str4);
                        i16 |= 2;
                        i14 = 5;
                        i15 = 2;
                        break;
                    case 2:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i17, (InterfaceC37137b) interfaceC23462hArr[i17].getValue(), list3);
                        i16 |= 4;
                        i15 = i17;
                        i14 = 5;
                        break;
                    case 3:
                        map5 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), map5);
                        i16 |= 8;
                        i15 = i17;
                        break;
                    case 4:
                        bottomStickyItemsModel3 = (BottomStickyItemsModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, BottomStickyItemsModel$$serializer.INSTANCE, bottomStickyItemsModel3);
                        i16 |= 16;
                        i15 = i17;
                        break;
                    case 5:
                        countrySelectorModel3 = (CountrySelectorModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, CountrySelectorModel$$serializer.INSTANCE, countrySelectorModel3);
                        i16 |= 32;
                        i15 = i17;
                        break;
                    case 6:
                        map4 = (Map) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, (InterfaceC37137b) interfaceC23462hArr[6].getValue(), map4);
                        i16 |= 64;
                        i15 = i17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i16;
            map = map4;
            countrySelectorModel = countrySelectorModel3;
            str = strDecodeStringElement;
            str2 = str4;
            list = list3;
            map2 = map5;
            bottomStickyItemsModel = bottomStickyItemsModel3;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new GiftingModels(i13, str, str2, list, map2, bottomStickyItemsModel, countrySelectorModel, map, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, GiftingModels value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        GiftingModels.write$Self$gifting_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
