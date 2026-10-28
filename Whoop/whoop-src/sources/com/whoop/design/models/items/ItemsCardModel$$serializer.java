package com.whoop.design.models.items;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import v71.EnumC35760a;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/design/models/items/ItemsCardModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/design/models/items/ItemsCardModel;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/ItemsCardModel;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/ItemsCardModel;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ItemsCardModel$$serializer implements GeneratedSerializer<ItemsCardModel> {
    public static final int $stable;
    public static final ItemsCardModel$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ItemsCardModel$$serializer itemsCardModel$$serializer = new ItemsCardModel$$serializer();
        INSTANCE = itemsCardModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.design.models.items.ItemsCardModel", itemsCardModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundStyle", false);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("footerItems", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ItemsCardModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = ItemsCardModel.$childSerializers;
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(ItemsCardHeaderModel$$serializer.INSTANCE), AbstractC38195a.m122336d(ItemsCardFooterModel$$serializer.INSTANCE), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[2].getValue()), interfaceC23462hArr[3].getValue(), AbstractC38195a.m122336d((InterfaceC37138c) interfaceC23462hArr[4].getValue())};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ItemsCardModel deserialize(InterfaceC40541d decoder) {
        int i13;
        ItemsCardHeaderModel itemsCardHeaderModel;
        ItemsCardFooterModel itemsCardFooterModel;
        EnumC35760a enumC35760a;
        List list;
        List list2;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = ItemsCardModel.$childSerializers;
        ItemsCardHeaderModel itemsCardHeaderModel2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            ItemsCardHeaderModel itemsCardHeaderModel3 = (ItemsCardHeaderModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, ItemsCardHeaderModel$$serializer.INSTANCE, null);
            ItemsCardFooterModel itemsCardFooterModel2 = (ItemsCardFooterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ItemsCardFooterModel$$serializer.INSTANCE, null);
            EnumC35760a enumC35760a2 = (EnumC35760a) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), null);
            list2 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), null);
            itemsCardHeaderModel = itemsCardHeaderModel3;
            list = list3;
            i13 = 31;
            enumC35760a = enumC35760a2;
            itemsCardFooterModel = itemsCardFooterModel2;
        } else {
            boolean z4 = true;
            int i14 = 0;
            ItemsCardFooterModel itemsCardFooterModel3 = null;
            EnumC35760a enumC35760a3 = null;
            List list4 = null;
            List list5 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    itemsCardHeaderModel2 = (ItemsCardHeaderModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, ItemsCardHeaderModel$$serializer.INSTANCE, itemsCardHeaderModel2);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    itemsCardFooterModel3 = (ItemsCardFooterModel) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ItemsCardFooterModel$$serializer.INSTANCE, itemsCardFooterModel3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    enumC35760a3 = (EnumC35760a) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, (InterfaceC37137b) interfaceC23462hArr[2].getValue(), enumC35760a3);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list4 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 3, (InterfaceC37137b) interfaceC23462hArr[3].getValue(), list4);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list5 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, (InterfaceC37137b) interfaceC23462hArr[4].getValue(), list5);
                    i14 |= 16;
                }
            }
            i13 = i14;
            itemsCardHeaderModel = itemsCardHeaderModel2;
            itemsCardFooterModel = itemsCardFooterModel3;
            enumC35760a = enumC35760a3;
            list = list4;
            list2 = list5;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ItemsCardModel(i13, itemsCardHeaderModel, itemsCardFooterModel, enumC35760a, list, list2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ItemsCardModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ItemsCardModel.write$Self$design_models_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
