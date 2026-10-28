package com.stripe.android.financialconnections.model;

import androidx.core.app.NotificationCompat;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class FinancialConnectionsAccount$$serializer implements GeneratedSerializer<FinancialConnectionsAccount> {
    public static final FinancialConnectionsAccount$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FinancialConnectionsAccount$$serializer financialConnectionsAccount$$serializer = new FinancialConnectionsAccount$$serializer();
        INSTANCE = financialConnectionsAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.FinancialConnectionsAccount", financialConnectionsAccount$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("category", true);
        pluginGeneratedSerialDescriptor.addElement(AnalyticsRequestV2.PARAM_CREATED, false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("institution_name", false);
        pluginGeneratedSerialDescriptor.addElement("livemode", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
        pluginGeneratedSerialDescriptor.addElement("subcategory", true);
        pluginGeneratedSerialDescriptor.addElement("supported_payment_method_types", false);
        pluginGeneratedSerialDescriptor.addElement("balance", true);
        pluginGeneratedSerialDescriptor.addElement("balance_refresh", true);
        pluginGeneratedSerialDescriptor.addElement("display_name", true);
        pluginGeneratedSerialDescriptor.addElement("last4", true);
        pluginGeneratedSerialDescriptor.addElement("ownership", true);
        pluginGeneratedSerialDescriptor.addElement("ownership_refresh", true);
        pluginGeneratedSerialDescriptor.addElement("permissions", true);
        pluginGeneratedSerialDescriptor.addElement("object", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FinancialConnectionsAccount$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        InterfaceC37138c[] interfaceC37138cArr = FinancialConnectionsAccount.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new InterfaceC37138c[]{C5621k.f22178e, IntSerializer.INSTANCE, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, C5627q.f22180e, C5629s.f22181e, interfaceC37138cArr[7], AbstractC38195a.m122336d(Balance$$serializer.INSTANCE), AbstractC38195a.m122336d(BalanceRefresh$$serializer.INSTANCE), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(OwnershipRefresh$$serializer.INSTANCE), AbstractC38195a.m122336d(interfaceC37138cArr[14]), stringSerializer};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FinancialConnectionsAccount deserialize(InterfaceC40541d decoder) {
        String str;
        FinancialConnectionsAccount.Subcategory subcategory;
        FinancialConnectionsAccount.Status status;
        FinancialConnectionsAccount.Category category;
        int i13;
        List list;
        String str2;
        String str3;
        Balance balance;
        OwnershipRefresh ownershipRefresh;
        BalanceRefresh balanceRefresh;
        List list2;
        String str4;
        String str5;
        String strDecodeStringElement;
        boolean z4;
        int i14;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        InterfaceC37138c[] interfaceC37138cArr = FinancialConnectionsAccount.$childSerializers;
        FinancialConnectionsAccount.Category category2 = null;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            FinancialConnectionsAccount.Category category3 = (FinancialConnectionsAccount.Category) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C5621k.f22178e, null);
            int iDecodeIntElement = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
            String strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            FinancialConnectionsAccount.Status status2 = (FinancialConnectionsAccount.Status) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, C5627q.f22180e, null);
            FinancialConnectionsAccount.Subcategory subcategory2 = (FinancialConnectionsAccount.Subcategory) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, C5629s.f22181e, null);
            List list3 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 7, interfaceC37138cArr[7], null);
            Balance balance2 = (Balance) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, Balance$$serializer.INSTANCE, null);
            BalanceRefresh balanceRefresh2 = (BalanceRefresh) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, BalanceRefresh$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, stringSerializer, null);
            String str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, stringSerializer, null);
            String str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, stringSerializer, null);
            OwnershipRefresh ownershipRefresh2 = (OwnershipRefresh) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, OwnershipRefresh$$serializer.INSTANCE, null);
            list = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, interfaceC37138cArr[14], null);
            category = category3;
            list2 = list3;
            i14 = iDecodeIntElement;
            str4 = strDecodeStringElement2;
            strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 15);
            str3 = str6;
            balanceRefresh = balanceRefresh2;
            subcategory = subcategory2;
            status = status2;
            str5 = strDecodeStringElement3;
            balance = balance2;
            z4 = zDecodeBooleanElement;
            i13 = 65535;
            ownershipRefresh = ownershipRefresh2;
            str = str8;
            str2 = str7;
        } else {
            int i15 = 7;
            boolean z13 = true;
            int iDecodeIntElement2 = 0;
            int i16 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str9 = null;
            FinancialConnectionsAccount.Subcategory subcategory3 = null;
            FinancialConnectionsAccount.Status status3 = null;
            List list4 = null;
            String str10 = null;
            String str11 = null;
            Balance balance3 = null;
            OwnershipRefresh ownershipRefresh3 = null;
            BalanceRefresh balanceRefresh3 = null;
            List list5 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        i15 = 7;
                        break;
                    case 0:
                        category2 = (FinancialConnectionsAccount.Category) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 0, C5621k.f22178e, category2);
                        i16 |= 1;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        i15 = 7;
                        break;
                    case 1:
                        i16 |= 2;
                        iDecodeIntElement2 = interfaceC40539bBeginStructure.decodeIntElement(interfaceC39443g, 1);
                        i15 = 7;
                        break;
                    case 2:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 2);
                        i16 |= 4;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        i15 = 7;
                        break;
                    case 3:
                        strDecodeStringElement5 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 3);
                        i16 |= 8;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        i15 = 7;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i16 |= 16;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        i15 = 7;
                        break;
                    case 5:
                        status3 = (FinancialConnectionsAccount.Status) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 5, C5627q.f22180e, status3);
                        i16 |= 32;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        i15 = 7;
                        break;
                    case 6:
                        subcategory3 = (FinancialConnectionsAccount.Subcategory) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, 6, C5629s.f22181e, subcategory3);
                        i16 |= 64;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        i15 = 7;
                        break;
                    case 7:
                        list5 = (List) interfaceC40539bBeginStructure.decodeSerializableElement(interfaceC39443g, i15, interfaceC37138cArr[i15], list5);
                        i16 |= 128;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        break;
                    case 8:
                        balance3 = (Balance) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, Balance$$serializer.INSTANCE, balance3);
                        i16 |= 256;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        break;
                    case 9:
                        balanceRefresh3 = (BalanceRefresh) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, BalanceRefresh$$serializer.INSTANCE, balanceRefresh3);
                        i16 |= 512;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        break;
                    case 10:
                        str11 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, StringSerializer.INSTANCE, str11);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        break;
                    case 11:
                        str10 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 11, StringSerializer.INSTANCE, str10);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        break;
                    case 12:
                        str9 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 12, StringSerializer.INSTANCE, str9);
                        i16 |= 4096;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        break;
                    case 13:
                        ownershipRefresh3 = (OwnershipRefresh) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 13, OwnershipRefresh$$serializer.INSTANCE, ownershipRefresh3);
                        i16 |= DfuBaseService.ERROR_REMOTE_MASK;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        break;
                    case 14:
                        list4 = (List) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 14, interfaceC37138cArr[14], list4);
                        i16 |= DfuBaseService.ERROR_CONNECTION_MASK;
                        iDecodeIntElement2 = iDecodeIntElement2;
                        break;
                    case 15:
                        strDecodeStringElement6 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 15);
                        i16 |= 32768;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str9;
            subcategory = subcategory3;
            status = status3;
            category = category2;
            i13 = i16;
            list = list4;
            str2 = str10;
            str3 = str11;
            balance = balance3;
            ownershipRefresh = ownershipRefresh3;
            balanceRefresh = balanceRefresh3;
            list2 = list5;
            str4 = strDecodeStringElement4;
            str5 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement6;
            z4 = zDecodeBooleanElement2;
            i14 = iDecodeIntElement2;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FinancialConnectionsAccount(i13, category, i14, str4, str5, z4, status, subcategory, list2, balance, balanceRefresh, str3, str2, str, ownershipRefresh, list, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FinancialConnectionsAccount value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FinancialConnectionsAccount.write$Self$financial_connections_core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
