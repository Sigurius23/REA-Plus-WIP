package com.whoop.trends.data.model;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/trends/data/model/IntegrationsUpsellDtoV3.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class IntegrationsUpsellDtoV3$$serializer implements GeneratedSerializer<IntegrationsUpsellDtoV3> {
    public static final int $stable;
    public static final IntegrationsUpsellDtoV3$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        IntegrationsUpsellDtoV3$$serializer integrationsUpsellDtoV3$$serializer = new IntegrationsUpsellDtoV3$$serializer();
        INSTANCE = integrationsUpsellDtoV3$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.trends.data.model.IntegrationsUpsellDtoV3", integrationsUpsellDtoV3$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("primary_button", false);
        pluginGeneratedSerialDescriptor.addElement("secondary_button", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IntegrationsUpsellDtoV3$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        IntegrationsUpsellButtonDtoV3$$serializer integrationsUpsellButtonDtoV3$$serializer = IntegrationsUpsellButtonDtoV3$$serializer.INSTANCE;
        InterfaceC37138c interfaceC37138cM122336d = AbstractC38195a.m122336d(integrationsUpsellButtonDtoV3$$serializer);
        InterfaceC37138c interfaceC37138cM122336d2 = AbstractC38195a.m122336d(integrationsUpsellButtonDtoV3$$serializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, stringSerializer, interfaceC37138cM122336d, interfaceC37138cM122336d2};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final IntegrationsUpsellDtoV3 deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        String str2;
        String str3;
        IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV3;
        IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            String strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            IntegrationsUpsellButtonDtoV3$$serializer integrationsUpsellButtonDtoV3$$serializer = IntegrationsUpsellButtonDtoV3$$serializer.INSTANCE;
            str = strDecodeStringElement2;
            integrationsUpsellButtonDtoV3 = (IntegrationsUpsellButtonDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, integrationsUpsellButtonDtoV3$$serializer, null);
            integrationsUpsellButtonDtoV4 = (IntegrationsUpsellButtonDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, integrationsUpsellButtonDtoV3$$serializer, null);
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i13 = 31;
        } else {
            boolean z4 = true;
            int i14 = 0;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV5 = null;
            IntegrationsUpsellButtonDtoV3 integrationsUpsellButtonDtoV6 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                    i14 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    integrationsUpsellButtonDtoV5 = (IntegrationsUpsellButtonDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, IntegrationsUpsellButtonDtoV3$$serializer.INSTANCE, integrationsUpsellButtonDtoV5);
                    i14 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    integrationsUpsellButtonDtoV6 = (IntegrationsUpsellButtonDtoV3) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 4, IntegrationsUpsellButtonDtoV3$$serializer.INSTANCE, integrationsUpsellButtonDtoV6);
                    i14 |= 16;
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            integrationsUpsellButtonDtoV3 = integrationsUpsellButtonDtoV5;
            integrationsUpsellButtonDtoV4 = integrationsUpsellButtonDtoV6;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new IntegrationsUpsellDtoV3(i13, str, str2, str3, integrationsUpsellButtonDtoV3, integrationsUpsellButtonDtoV4, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, IntegrationsUpsellDtoV3 value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        IntegrationsUpsellDtoV3.write$Self$trends_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
