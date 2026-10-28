package com.whoop.membership.extensions.domain.models;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/membership/extensions/domain/models/NativeOrderDetails.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class NativeOrderDetails$$serializer implements GeneratedSerializer<NativeOrderDetails> {
    public static final int $stable;
    public static final NativeOrderDetails$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        NativeOrderDetails$$serializer nativeOrderDetails$$serializer = new NativeOrderDetails$$serializer();
        INSTANCE = nativeOrderDetails$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.membership.extensions.domain.models.NativeOrderDetails", nativeOrderDetails$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("line_items", false);
        pluginGeneratedSerialDescriptor.addElement("subtotal", false);
        pluginGeneratedSerialDescriptor.addElement("discount", false);
        pluginGeneratedSerialDescriptor.addElement("trial_deposit_refund", false);
        pluginGeneratedSerialDescriptor.addElement("tax", false);
        pluginGeneratedSerialDescriptor.addElement("total", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NativeOrderDetails$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC23462h[] interfaceC23462hArr = NativeOrderDetails.$childSerializers;
        NativeOrderDetailsItem$$serializer nativeOrderDetailsItem$$serializer = NativeOrderDetailsItem$$serializer.INSTANCE;
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, interfaceC23462hArr[1].getValue(), AbstractC38195a.m122336d(nativeOrderDetailsItem$$serializer), AbstractC38195a.m122336d(nativeOrderDetailsItem$$serializer), AbstractC38195a.m122336d(nativeOrderDetailsItem$$serializer), AbstractC38195a.m122336d(nativeOrderDetailsItem$$serializer), AbstractC38195a.m122336d(nativeOrderDetailsItem$$serializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final NativeOrderDetails deserialize(InterfaceC40541d decoder) {
        int i13;
        NativeOrderDetailsItem nativeOrderDetailsItem;
        NativeOrderDetailsItem nativeOrderDetailsItem2;
        String str;
        List list;
        NativeOrderDetailsItem nativeOrderDetailsItem3;
        NativeOrderDetailsItem nativeOrderDetailsItem4;
        NativeOrderDetailsItem nativeOrderDetailsItem5;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC23462h[] interfaceC23462hArr = NativeOrderDetails.$childSerializers;
        int i14 = 6;
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            List list2 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), null);
            NativeOrderDetailsItem$$serializer nativeOrderDetailsItem$$serializer = NativeOrderDetailsItem$$serializer.INSTANCE;
            NativeOrderDetailsItem nativeOrderDetailsItem6 = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, nativeOrderDetailsItem$$serializer, null);
            NativeOrderDetailsItem nativeOrderDetailsItem7 = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, nativeOrderDetailsItem$$serializer, null);
            NativeOrderDetailsItem nativeOrderDetailsItem8 = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, nativeOrderDetailsItem$$serializer, null);
            NativeOrderDetailsItem nativeOrderDetailsItem9 = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, nativeOrderDetailsItem$$serializer, null);
            list = list2;
            str = strDecodeStringElement2;
            nativeOrderDetailsItem = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, nativeOrderDetailsItem$$serializer, null);
            nativeOrderDetailsItem2 = nativeOrderDetailsItem9;
            nativeOrderDetailsItem4 = nativeOrderDetailsItem7;
            nativeOrderDetailsItem5 = nativeOrderDetailsItem8;
            nativeOrderDetailsItem3 = nativeOrderDetailsItem6;
            i13 = 127;
        } else {
            boolean z4 = true;
            int i15 = 0;
            NativeOrderDetailsItem nativeOrderDetailsItem10 = null;
            NativeOrderDetailsItem nativeOrderDetailsItem11 = null;
            List list3 = null;
            NativeOrderDetailsItem nativeOrderDetailsItem12 = null;
            NativeOrderDetailsItem nativeOrderDetailsItem13 = null;
            NativeOrderDetailsItem nativeOrderDetailsItem14 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i15 |= 1;
                        i14 = 6;
                        break;
                    case 1:
                        list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 1, (InterfaceC37137b) interfaceC23462hArr[1].getValue(), list3);
                        i15 |= 2;
                        i14 = 6;
                        break;
                    case 2:
                        nativeOrderDetailsItem12 = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, NativeOrderDetailsItem$$serializer.INSTANCE, nativeOrderDetailsItem12);
                        i15 |= 4;
                        i14 = 6;
                        break;
                    case 3:
                        nativeOrderDetailsItem13 = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, NativeOrderDetailsItem$$serializer.INSTANCE, nativeOrderDetailsItem13);
                        i15 |= 8;
                        break;
                    case 4:
                        nativeOrderDetailsItem14 = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, NativeOrderDetailsItem$$serializer.INSTANCE, nativeOrderDetailsItem14);
                        i15 |= 16;
                        break;
                    case 5:
                        nativeOrderDetailsItem11 = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, NativeOrderDetailsItem$$serializer.INSTANCE, nativeOrderDetailsItem11);
                        i15 |= 32;
                        break;
                    case 6:
                        nativeOrderDetailsItem10 = (NativeOrderDetailsItem) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, NativeOrderDetailsItem$$serializer.INSTANCE, nativeOrderDetailsItem10);
                        i15 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i13 = i15;
            nativeOrderDetailsItem = nativeOrderDetailsItem10;
            nativeOrderDetailsItem2 = nativeOrderDetailsItem11;
            str = strDecodeStringElement;
            list = list3;
            nativeOrderDetailsItem3 = nativeOrderDetailsItem12;
            nativeOrderDetailsItem4 = nativeOrderDetailsItem13;
            nativeOrderDetailsItem5 = nativeOrderDetailsItem14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new NativeOrderDetails(i13, str, list, nativeOrderDetailsItem3, nativeOrderDetailsItem4, nativeOrderDetailsItem5, nativeOrderDetailsItem2, nativeOrderDetailsItem, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, NativeOrderDetails value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        NativeOrderDetails.write$Self$membership_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
