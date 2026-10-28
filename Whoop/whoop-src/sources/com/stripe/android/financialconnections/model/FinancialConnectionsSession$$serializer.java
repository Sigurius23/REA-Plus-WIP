package com.stripe.android.financialconnections.model;

import androidx.core.app.NotificationCompat;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p443qz.C30780a;
import p443qz.C30781b;
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
@Metadata(m65680d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "", "Lwc3/c;", "childSerializers", "()[Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC23457c
public /* synthetic */ class FinancialConnectionsSession$$serializer implements GeneratedSerializer<FinancialConnectionsSession> {
    public static final FinancialConnectionsSession$$serializer INSTANCE;
    private static final InterfaceC39443g descriptor;

    static {
        FinancialConnectionsSession$$serializer financialConnectionsSession$$serializer = new FinancialConnectionsSession$$serializer();
        INSTANCE = financialConnectionsSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.FinancialConnectionsSession", financialConnectionsSession$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("client_secret", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("linked_accounts", true);
        pluginGeneratedSerialDescriptor.addElement("accounts", true);
        pluginGeneratedSerialDescriptor.addElement("livemode", false);
        pluginGeneratedSerialDescriptor.addElement("payment_account", true);
        pluginGeneratedSerialDescriptor.addElement("return_url", true);
        pluginGeneratedSerialDescriptor.addElement("bank_account_token", true);
        pluginGeneratedSerialDescriptor.addElement("manual_entry", true);
        pluginGeneratedSerialDescriptor.addElement(NotificationCompat.CATEGORY_STATUS, true);
        pluginGeneratedSerialDescriptor.addElement("status_details", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FinancialConnectionsSession$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final InterfaceC37138c[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FinancialConnectionsAccountList$$serializer financialConnectionsAccountList$$serializer = FinancialConnectionsAccountList$$serializer.INSTANCE;
        return new InterfaceC37138c[]{stringSerializer, stringSerializer, AbstractC38195a.m122336d(financialConnectionsAccountList$$serializer), AbstractC38195a.m122336d(financialConnectionsAccountList$$serializer), BooleanSerializer.INSTANCE, AbstractC38195a.m122336d(C30781b.f126769c), AbstractC38195a.m122336d(stringSerializer), AbstractC38195a.m122336d(C30780a.f126768b), AbstractC38195a.m122336d(ManualEntry$$serializer.INSTANCE), AbstractC38195a.m122336d(C5636z.f22183e), AbstractC38195a.m122336d(FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37137b
    public final FinancialConnectionsSession deserialize(InterfaceC40541d decoder) {
        boolean z4;
        FinancialConnectionsSession.StatusDetails statusDetails;
        FinancialConnectionsSession.Status status;
        ManualEntry manualEntry;
        String str;
        String str2;
        PaymentAccount paymentAccount;
        FinancialConnectionsAccountList financialConnectionsAccountList;
        FinancialConnectionsAccountList financialConnectionsAccountList2;
        int i13;
        String str3;
        String str4;
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40539b interfaceC40539bBeginStructure = decoder.beginStructure(interfaceC39443g);
        int i14 = 10;
        int i15 = 9;
        if (interfaceC40539bBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
            String strDecodeStringElement2 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
            FinancialConnectionsAccountList$$serializer financialConnectionsAccountList$$serializer = FinancialConnectionsAccountList$$serializer.INSTANCE;
            FinancialConnectionsAccountList financialConnectionsAccountList3 = (FinancialConnectionsAccountList) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, financialConnectionsAccountList$$serializer, null);
            FinancialConnectionsAccountList financialConnectionsAccountList4 = (FinancialConnectionsAccountList) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, financialConnectionsAccountList$$serializer, null);
            boolean zDecodeBooleanElement = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
            PaymentAccount paymentAccount2 = (PaymentAccount) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, C30781b.f126769c, null);
            String str5 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, null);
            String str6 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, C30780a.f126768b, null);
            ManualEntry manualEntry2 = (ManualEntry) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ManualEntry$$serializer.INSTANCE, null);
            FinancialConnectionsSession.Status status2 = (FinancialConnectionsSession.Status) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 9, C5636z.f22183e, null);
            str3 = strDecodeStringElement;
            statusDetails = (FinancialConnectionsSession.StatusDetails) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 10, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, null);
            status = status2;
            str2 = str6;
            str = str5;
            paymentAccount = paymentAccount2;
            financialConnectionsAccountList = financialConnectionsAccountList4;
            manualEntry = manualEntry2;
            z4 = zDecodeBooleanElement;
            financialConnectionsAccountList2 = financialConnectionsAccountList3;
            str4 = strDecodeStringElement2;
            i13 = 2047;
        } else {
            boolean z13 = true;
            boolean zDecodeBooleanElement2 = false;
            FinancialConnectionsSession.StatusDetails statusDetails2 = null;
            FinancialConnectionsSession.Status status3 = null;
            ManualEntry manualEntry3 = null;
            String str7 = null;
            String str8 = null;
            PaymentAccount paymentAccount3 = null;
            FinancialConnectionsAccountList financialConnectionsAccountList5 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i16 = 0;
            FinancialConnectionsAccountList financialConnectionsAccountList6 = null;
            while (z13) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(interfaceC39443g);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i14 = 10;
                        break;
                    case 0:
                        i16 |= 1;
                        strDecodeStringElement3 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 0);
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 1:
                        strDecodeStringElement4 = interfaceC40539bBeginStructure.decodeStringElement(interfaceC39443g, 1);
                        i16 |= 2;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 2:
                        financialConnectionsAccountList6 = (FinancialConnectionsAccountList) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, financialConnectionsAccountList6);
                        i16 |= 4;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 3:
                        financialConnectionsAccountList5 = (FinancialConnectionsAccountList) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, financialConnectionsAccountList5);
                        i16 |= 8;
                        i14 = 10;
                        i15 = 9;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = interfaceC40539bBeginStructure.decodeBooleanElement(interfaceC39443g, 4);
                        i16 |= 16;
                        i14 = 10;
                        break;
                    case 5:
                        paymentAccount3 = (PaymentAccount) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 5, C30781b.f126769c, paymentAccount3);
                        i16 |= 32;
                        i14 = 10;
                        break;
                    case 6:
                        str7 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 6, StringSerializer.INSTANCE, str7);
                        i16 |= 64;
                        i14 = 10;
                        break;
                    case 7:
                        str8 = (String) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 7, C30780a.f126768b, str8);
                        i16 |= 128;
                        i14 = 10;
                        break;
                    case 8:
                        manualEntry3 = (ManualEntry) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, 8, ManualEntry$$serializer.INSTANCE, manualEntry3);
                        i16 |= 256;
                        i14 = 10;
                        break;
                    case 9:
                        status3 = (FinancialConnectionsSession.Status) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i15, C5636z.f22183e, status3);
                        i16 |= 512;
                        break;
                    case 10:
                        statusDetails2 = (FinancialConnectionsSession.StatusDetails) interfaceC40539bBeginStructure.decodeNullableSerializableElement(interfaceC39443g, i14, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, statusDetails2);
                        i16 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z4 = zDecodeBooleanElement2;
            statusDetails = statusDetails2;
            status = status3;
            manualEntry = manualEntry3;
            str = str7;
            str2 = str8;
            paymentAccount = paymentAccount3;
            financialConnectionsAccountList = financialConnectionsAccountList5;
            financialConnectionsAccountList2 = financialConnectionsAccountList6;
            i13 = i16;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
        }
        interfaceC40539bBeginStructure.endStructure(interfaceC39443g);
        return new FinancialConnectionsSession(i13, str3, str4, financialConnectionsAccountList2, financialConnectionsAccountList, z4, paymentAccount, str, str2, manualEntry, status, statusDetails, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e encoder, FinancialConnectionsSession value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g interfaceC39443g = descriptor;
        InterfaceC40540c interfaceC40540cBeginStructure = encoder.beginStructure(interfaceC39443g);
        FinancialConnectionsSession.write$Self$financial_connections_core_release(value, interfaceC40540cBeginStructure, interfaceC39443g);
        interfaceC40540cBeginStructure.endStructure(interfaceC39443g);
    }
}
