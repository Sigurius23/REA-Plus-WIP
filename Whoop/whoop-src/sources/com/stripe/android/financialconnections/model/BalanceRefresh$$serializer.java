package com.stripe.android.financialconnections.model;

import androidx.core.app.NotificationCompat;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/financialconnections/model/BalanceRefresh.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/financialconnections/model/BalanceRefresh;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class BalanceRefresh$$serializer implements GeneratedSerializer<BalanceRefresh> {
    public static final BalanceRefresh$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        BalanceRefresh$$serializer balanceRefresh$$serializer = new BalanceRefresh$$serializer();
        INSTANCE = balanceRefresh$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.BalanceRefresh", balanceRefresh$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
        pluginGeneratedSerialDescriptor.addElement("last_attempted_at", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BalanceRefresh$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        return new InterfaceC37138c[]{AbstractC38195a.m122336d(BalanceRefresh.$childSerializers[0]), IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final BalanceRefresh deserialize(InterfaceC40541d decoder) {
        BalanceRefresh.BalanceRefreshStatus balanceRefreshStatus;
        int iDecodeIntElement;
        int i13;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC37138c[] interfaceC37138cArr = BalanceRefresh.$childSerializers;
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            balanceRefreshStatus = (BalanceRefresh.BalanceRefreshStatus) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, interfaceC37138cArr[0], null);
            iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            i13 = 3;
        } else {
            boolean z4 = true;
            int iDecodeIntElement2 = 0;
            int i14 = 0;
            BalanceRefresh.BalanceRefreshStatus balanceRefreshStatus2 = null;
            while (z4) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                if (iDecodeElementIndex == -1) {
                    z4 = false;
                } else if (iDecodeElementIndex == 0) {
                    balanceRefreshStatus2 = (BalanceRefresh.BalanceRefreshStatus) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 0, interfaceC37138cArr[0], balanceRefreshStatus2);
                    i14 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                    i14 |= 2;
                }
            }
            balanceRefreshStatus = balanceRefreshStatus2;
            iDecodeIntElement = iDecodeIntElement2;
            i13 = i14;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new BalanceRefresh(i13, balanceRefreshStatus, iDecodeIntElement, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, BalanceRefresh value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        BalanceRefresh.write$Self$financial_connections_core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
