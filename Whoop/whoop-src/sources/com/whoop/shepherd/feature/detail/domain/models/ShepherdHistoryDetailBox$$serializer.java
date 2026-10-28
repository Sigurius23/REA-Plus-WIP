package com.whoop.shepherd.feature.detail.domain.models;

import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ShepherdHistoryDetailBox$$serializer implements GeneratedSerializer<ShepherdHistoryDetailBox> {
    public static final int $stable;
    public static final ShepherdHistoryDetailBox$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ShepherdHistoryDetailBox$$serializer shepherdHistoryDetailBox$$serializer = new ShepherdHistoryDetailBox$$serializer();
        INSTANCE = shepherdHistoryDetailBox$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.shepherd.feature.detail.domain.models.ShepherdHistoryDetailBox", shepherdHistoryDetailBox$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("afib_details", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ShepherdHistoryDetailBox$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, AbstractC38195a.m122336d(ShepherdHistoryDetailByDate$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ShepherdHistoryDetailBox deserialize(InterfaceC40541d decoder) {
        String strDecodeStringElement;
        ShepherdHistoryDetailByDate shepherdHistoryDetailByDate;
        int i13;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            shepherdHistoryDetailByDate = (ShepherdHistoryDetailByDate) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ShepherdHistoryDetailByDate$$serializer.INSTANCE, null);
            i13 = 3;
        } else {
            boolean z4 = true;
            int i14 = 0;
            strDecodeStringElement = null;
            ShepherdHistoryDetailByDate shepherdHistoryDetailByDate2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    shepherdHistoryDetailByDate2 = (ShepherdHistoryDetailByDate) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ShepherdHistoryDetailByDate$$serializer.INSTANCE, shepherdHistoryDetailByDate2);
                    i14 |= 2;
                }
            }
            shepherdHistoryDetailByDate = shepherdHistoryDetailByDate2;
            i13 = i14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ShepherdHistoryDetailBox(i13, strDecodeStringElement, shepherdHistoryDetailByDate, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ShepherdHistoryDetailBox value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ShepherdHistoryDetailBox.write$Self$shepherd_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
