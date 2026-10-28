package com.whoop.shepherd.feature.notificationhistory.domain.models;

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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* synthetic */ class ShepherdHistoryResponse$$serializer implements GeneratedSerializer<ShepherdHistoryResponse> {
    public static final int $stable;
    public static final ShepherdHistoryResponse$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        ShepherdHistoryResponse$$serializer shepherdHistoryResponse$$serializer = new ShepherdHistoryResponse$$serializer();
        INSTANCE = shepherdHistoryResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdHistoryResponse", shepherdHistoryResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("afib_history_clear_all_box", false);
        pluginGeneratedSerialDescriptor.addElement("afib_empty_history", false);
        pluginGeneratedSerialDescriptor.addElement("paginated_afib_history", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ShepherdHistoryResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{StringSerializer.INSTANCE, AbstractC38195a.m122336d(ShepherdHistoryClearAllResponse$$serializer.INSTANCE), AbstractC38195a.m122336d(ShepherdEmptyHistoryResponse$$serializer.INSTANCE), AbstractC38195a.m122336d(ShepherdPaginatedHistoryResponse$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final ShepherdHistoryResponse deserialize(InterfaceC40541d decoder) {
        int i13;
        String str;
        ShepherdHistoryClearAllResponse shepherdHistoryClearAllResponse;
        ShepherdEmptyHistoryResponse shepherdEmptyHistoryResponse;
        ShepherdPaginatedHistoryResponse shepherdPaginatedHistoryResponse;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        String strDecodeStringElement = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            ShepherdHistoryClearAllResponse shepherdHistoryClearAllResponse2 = (ShepherdHistoryClearAllResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ShepherdHistoryClearAllResponse$$serializer.INSTANCE, null);
            ShepherdEmptyHistoryResponse shepherdEmptyHistoryResponse2 = (ShepherdEmptyHistoryResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, ShepherdEmptyHistoryResponse$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            shepherdPaginatedHistoryResponse = (ShepherdPaginatedHistoryResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ShepherdPaginatedHistoryResponse$$serializer.INSTANCE, null);
            shepherdEmptyHistoryResponse = shepherdEmptyHistoryResponse2;
            shepherdHistoryClearAllResponse = shepherdHistoryClearAllResponse2;
            i13 = 15;
        } else {
            boolean z4 = true;
            int i14 = 0;
            ShepherdHistoryClearAllResponse shepherdHistoryClearAllResponse3 = null;
            ShepherdEmptyHistoryResponse shepherdEmptyHistoryResponse3 = null;
            ShepherdPaginatedHistoryResponse shepherdPaginatedHistoryResponse2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                    i14 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    shepherdHistoryClearAllResponse3 = (ShepherdHistoryClearAllResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 1, ShepherdHistoryClearAllResponse$$serializer.INSTANCE, shepherdHistoryClearAllResponse3);
                    i14 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    shepherdEmptyHistoryResponse3 = (ShepherdEmptyHistoryResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, ShepherdEmptyHistoryResponse$$serializer.INSTANCE, shepherdEmptyHistoryResponse3);
                    i14 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    shepherdPaginatedHistoryResponse2 = (ShepherdPaginatedHistoryResponse) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, ShepherdPaginatedHistoryResponse$$serializer.INSTANCE, shepherdPaginatedHistoryResponse2);
                    i14 |= 8;
                }
            }
            i13 = i14;
            str = strDecodeStringElement;
            shepherdHistoryClearAllResponse = shepherdHistoryClearAllResponse3;
            shepherdEmptyHistoryResponse = shepherdEmptyHistoryResponse3;
            shepherdPaginatedHistoryResponse = shepherdPaginatedHistoryResponse2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new ShepherdHistoryResponse(i13, str, shepherdHistoryClearAllResponse, shepherdEmptyHistoryResponse, shepherdPaginatedHistoryResponse, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, ShepherdHistoryResponse value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        ShepherdHistoryResponse.write$Self$shepherd_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ InterfaceC37138c[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
