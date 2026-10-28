package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.models.MessageType;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p443qz.C30780a;
import p443qz.C30781b;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import y00.C38842g8;
import yc3.InterfaceC39443g;
import z00.C39938g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 l2\u00020\u00012\u00020\u0002:\u0004mnopB\u0081\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0012\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b6\u00107J\u008e\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b:\u0010%J\u0010\u0010;\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b;\u0010#J\u001a\u0010>\u001a\u00020\t2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?J'\u0010G\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001¢\u0006\u0004\bE\u0010FR \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010H\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010%R \u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010H\u0012\u0004\bM\u0010K\u001a\u0004\bL\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010N\u0012\u0004\bP\u0010K\u001a\u0004\bO\u0010(R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010N\u0012\u0004\bR\u0010K\u001a\u0004\bQ\u0010(R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010S\u0012\u0004\bU\u0010K\u001a\u0004\bT\u0010-R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010V\u0012\u0004\bX\u0010K\u001a\u0004\bW\u0010/R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010H\u0012\u0004\bZ\u0010K\u001a\u0004\bY\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010H\u0012\u0004\b\\\u0010K\u001a\u0004\b[\u0010%R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010]\u0012\u0004\b_\u0010K\u001a\u0004\b^\u00103R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010`\u0012\u0004\bb\u0010K\u001a\u0004\ba\u00105R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010c\u0012\u0004\be\u0010K\u001a\u0004\bd\u00107R\u0011\u0010g\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bf\u0010(R\u0013\u0010k\u001a\u0004\u0018\u00010h8G¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006q"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Lvy/b;", "Landroid/os/Parcelable;", "", "clientSecret", "id", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "accountsOld", "accountsNew", "", "livemode", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "paymentAccount", "returnUrl", "bankAccountToken", "Lcom/stripe/android/financialconnections/model/ManualEntry;", "manualEntry", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "statusDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3$financial_connections_core_release", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "component3", "component4$financial_connections_core_release", "component4", "component5", "()Z", "component6", "()Lcom/stripe/android/financialconnections/model/PaymentAccount;", "component7", "component8", "component9", "()Lcom/stripe/android/financialconnections/model/ManualEntry;", "component10", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "component11", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getClientSecret", "getClientSecret$annotations", "()V", "getId", "getId$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "getAccountsOld$financial_connections_core_release", "getAccountsOld$financial_connections_core_release$annotations", "getAccountsNew$financial_connections_core_release", "getAccountsNew$financial_connections_core_release$annotations", "Z", "getLivemode", "getLivemode$annotations", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "getPaymentAccount", "getPaymentAccount$annotations", "getReturnUrl", "getReturnUrl$annotations", "getBankAccountToken", "getBankAccountToken$annotations", "Lcom/stripe/android/financialconnections/model/ManualEntry;", "getManualEntry", "getManualEntry$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "getStatus", "getStatus$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "getStatusDetails", "getStatusDetails$annotations", "getAccounts", "accounts", "Ly00/g8;", "getParsedToken", "()Ly00/g8;", "parsedToken", "Companion", "Status", "StatusDetails", "$serializer", "com/stripe/android/financialconnections/model/w", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FinancialConnectionsSession implements InterfaceC36562b, Parcelable {
    private final FinancialConnectionsAccountList accountsNew;
    private final FinancialConnectionsAccountList accountsOld;
    private final String bankAccountToken;
    private final String clientSecret;
    private final String id;
    private final boolean livemode;
    private final ManualEntry manualEntry;
    private final PaymentAccount paymentAccount;
    private final String returnUrl;
    private final Status status;
    private final StatusDetails statusDetails;
    public static final C5633w Companion = new C5633w();
    public static final Parcelable.Creator<FinancialConnectionsSession> CREATOR = new C5634x();

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/z", "com/stripe/android/financialconnections/model/y", "PENDING", "SUCCEEDED", "CANCELED", "FAILED", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C5636z.class)
    public enum Status {
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        CANCELED("canceled"),
        FAILED(MessageType.FAILED),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5635y Companion = new C5635y();

        Status(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003-./B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "cancelled", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "copy", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "getCancelled", "getCancelled$annotations", "()V", "Companion", "Cancelled", "$serializer", "com/stripe/android/financialconnections/model/e0", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class StatusDetails implements Parcelable {
        private final Cancelled cancelled;
        public static final C5610e0 Companion = new C5610e0();
        public static final Parcelable.Creator<StatusDetails> CREATOR = new C5612f0();

        @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003-./B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "reason", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "copy", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "getReason", "getReason$annotations", "()V", "Companion", "Reason", "$serializer", "com/stripe/android/financialconnections/model/a0", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
        @InterfaceC37144i
        public static final /* data */ class Cancelled implements Parcelable {
            private final Reason reason;
            public static final C5602a0 Companion = new C5602a0();
            public static final Parcelable.Creator<Cancelled> CREATOR = new C5604b0();

            @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/d0", "com/stripe/android/financialconnections/model/c0", "CUSTOM_MANUAL_ENTRY", "OTHER", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
            @InterfaceC37144i(with = C5608d0.class)
            public enum Reason {
                CUSTOM_MANUAL_ENTRY("custom_manual_entry"),
                OTHER("other"),
                UNKNOWN("unknown");

                private final String value;
                private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
                public static final C5606c0 Companion = new C5606c0();

                Reason(String str) {
                    this.value = str;
                }

                public static InterfaceC33616a getEntries() {
                    return $ENTRIES;
                }

                public final String getValue() {
                    return this.value;
                }
            }

            public /* synthetic */ Cancelled(int i13, Reason reason, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i13 & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i13, 1, FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE.getDescriptor());
                }
                this.reason = reason;
            }

            public static /* synthetic */ Cancelled copy$default(Cancelled cancelled, Reason reason, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    reason = cancelled.reason;
                }
                return cancelled.copy(reason);
            }

            @InterfaceC37143h("reason")
            public static /* synthetic */ void getReason$annotations() {
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Reason getReason() {
                return this.reason;
            }

            public final Cancelled copy(Reason reason) {
                AbstractC22676k.m65750j(reason, "reason");
                return new Cancelled(reason);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cancelled) && this.reason == ((Cancelled) other).reason;
            }

            public final Reason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return "Cancelled(reason=" + this.reason + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                AbstractC22676k.m65750j(dest, "dest");
                dest.writeString(this.reason.name());
            }

            public Cancelled(Reason reason) {
                AbstractC22676k.m65750j(reason, "reason");
                this.reason = reason;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StatusDetails() {
            this((Cancelled) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ StatusDetails copy$default(StatusDetails statusDetails, Cancelled cancelled, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                cancelled = statusDetails.cancelled;
            }
            return statusDetails.copy(cancelled);
        }

        @InterfaceC37143h("cancelled")
        public static /* synthetic */ void getCancelled$annotations() {
        }

        public static final /* synthetic */ void write$Self$financial_connections_core_release(StatusDetails self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.cancelled == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE, self.cancelled);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Cancelled getCancelled() {
            return this.cancelled;
        }

        public final StatusDetails copy(Cancelled cancelled) {
            return new StatusDetails(cancelled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusDetails) && AbstractC22676k.m65745e(this.cancelled, ((StatusDetails) other).cancelled);
        }

        public final Cancelled getCancelled() {
            return this.cancelled;
        }

        public int hashCode() {
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                return 0;
            }
            return cancelled.hashCode();
        }

        public String toString() {
            return "StatusDetails(cancelled=" + this.cancelled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cancelled.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ StatusDetails(int i13, Cancelled cancelled, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i13 & 1) == 0) {
                this.cancelled = null;
            } else {
                this.cancelled = cancelled;
            }
        }

        public StatusDetails(Cancelled cancelled) {
            this.cancelled = cancelled;
        }

        public /* synthetic */ StatusDetails(Cancelled cancelled, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : cancelled);
        }
    }

    public /* synthetic */ FinancialConnectionsSession(int i13, String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z4, PaymentAccount paymentAccount, String str3, String str4, ManualEntry manualEntry, Status status, StatusDetails statusDetails, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i13 & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 19, FinancialConnectionsSession$$serializer.INSTANCE.getDescriptor());
        }
        this.clientSecret = str;
        this.id = str2;
        if ((i13 & 4) == 0) {
            this.accountsOld = null;
        } else {
            this.accountsOld = financialConnectionsAccountList;
        }
        if ((i13 & 8) == 0) {
            this.accountsNew = null;
        } else {
            this.accountsNew = financialConnectionsAccountList2;
        }
        this.livemode = z4;
        if ((i13 & 32) == 0) {
            this.paymentAccount = null;
        } else {
            this.paymentAccount = paymentAccount;
        }
        if ((i13 & 64) == 0) {
            this.returnUrl = null;
        } else {
            this.returnUrl = str3;
        }
        if ((i13 & 128) == 0) {
            this.bankAccountToken = null;
        } else {
            this.bankAccountToken = str4;
        }
        if ((i13 & 256) == 0) {
            this.manualEntry = null;
        } else {
            this.manualEntry = manualEntry;
        }
        if ((i13 & 512) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.statusDetails = null;
        } else {
            this.statusDetails = statusDetails;
        }
    }

    public static /* synthetic */ FinancialConnectionsSession copy$default(FinancialConnectionsSession financialConnectionsSession, String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z4, PaymentAccount paymentAccount, String str3, String str4, ManualEntry manualEntry, Status status, StatusDetails statusDetails, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = financialConnectionsSession.clientSecret;
        }
        if ((i13 & 2) != 0) {
            str2 = financialConnectionsSession.id;
        }
        if ((i13 & 4) != 0) {
            financialConnectionsAccountList = financialConnectionsSession.accountsOld;
        }
        if ((i13 & 8) != 0) {
            financialConnectionsAccountList2 = financialConnectionsSession.accountsNew;
        }
        if ((i13 & 16) != 0) {
            z4 = financialConnectionsSession.livemode;
        }
        if ((i13 & 32) != 0) {
            paymentAccount = financialConnectionsSession.paymentAccount;
        }
        if ((i13 & 64) != 0) {
            str3 = financialConnectionsSession.returnUrl;
        }
        if ((i13 & 128) != 0) {
            str4 = financialConnectionsSession.bankAccountToken;
        }
        if ((i13 & 256) != 0) {
            manualEntry = financialConnectionsSession.manualEntry;
        }
        if ((i13 & 512) != 0) {
            status = financialConnectionsSession.status;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            statusDetails = financialConnectionsSession.statusDetails;
        }
        Status status2 = status;
        StatusDetails statusDetails2 = statusDetails;
        String str5 = str4;
        ManualEntry manualEntry2 = manualEntry;
        PaymentAccount paymentAccount2 = paymentAccount;
        String str6 = str3;
        boolean z13 = z4;
        FinancialConnectionsAccountList financialConnectionsAccountList3 = financialConnectionsAccountList;
        return financialConnectionsSession.copy(str, str2, financialConnectionsAccountList3, financialConnectionsAccountList2, z13, paymentAccount2, str6, str5, manualEntry2, status2, statusDetails2);
    }

    @InterfaceC37143h("accounts")
    public static /* synthetic */ void getAccountsNew$financial_connections_core_release$annotations() {
    }

    @InterfaceC37143h("linked_accounts")
    public static /* synthetic */ void getAccountsOld$financial_connections_core_release$annotations() {
    }

    @InterfaceC37143h("bank_account_token")
    @InterfaceC37144i(with = C30780a.class)
    public static /* synthetic */ void getBankAccountToken$annotations() {
    }

    @InterfaceC37143h("client_secret")
    public static /* synthetic */ void getClientSecret$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("livemode")
    public static /* synthetic */ void getLivemode$annotations() {
    }

    @InterfaceC37143h("manual_entry")
    public static /* synthetic */ void getManualEntry$annotations() {
    }

    @InterfaceC37143h("payment_account")
    public static /* synthetic */ void getPaymentAccount$annotations() {
    }

    @InterfaceC37143h("return_url")
    public static /* synthetic */ void getReturnUrl$annotations() {
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_STATUS)
    public static /* synthetic */ void getStatus$annotations() {
    }

    @InterfaceC37143h("status_details")
    public static /* synthetic */ void getStatusDetails$annotations() {
    }

    public static final /* synthetic */ void write$Self$financial_connections_core_release(FinancialConnectionsSession self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.clientSecret);
        output.encodeStringElement(serialDesc, 1, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.accountsOld != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, self.accountsOld);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.accountsNew != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, self.accountsNew);
        }
        output.encodeBooleanElement(serialDesc, 4, self.livemode);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.paymentAccount != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, C30781b.f126769c, self.paymentAccount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.returnUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.returnUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.bankAccountToken != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, C30780a.f126768b, self.bankAccountToken);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.manualEntry != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, ManualEntry$$serializer.INSTANCE, self.manualEntry);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.status != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, C5636z.f22183e, self.status);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.statusDetails == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, self.statusDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final StatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3$financial_connections_core_release, reason: from getter */
    public final FinancialConnectionsAccountList getAccountsOld() {
        return this.accountsOld;
    }

    /* JADX INFO: renamed from: component4$financial_connections_core_release, reason: from getter */
    public final FinancialConnectionsAccountList getAccountsNew() {
        return this.accountsNew;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLivemode() {
        return this.livemode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBankAccountToken() {
        return this.bankAccountToken;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ManualEntry getManualEntry() {
        return this.manualEntry;
    }

    public final FinancialConnectionsSession copy(String clientSecret, String id4, FinancialConnectionsAccountList accountsOld, FinancialConnectionsAccountList accountsNew, boolean livemode, PaymentAccount paymentAccount, String returnUrl, String bankAccountToken, ManualEntry manualEntry, Status status, StatusDetails statusDetails) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(id4, "id");
        return new FinancialConnectionsSession(clientSecret, id4, accountsOld, accountsNew, livemode, paymentAccount, returnUrl, bankAccountToken, manualEntry, status, statusDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSession)) {
            return false;
        }
        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) other;
        return AbstractC22676k.m65745e(this.clientSecret, financialConnectionsSession.clientSecret) && AbstractC22676k.m65745e(this.id, financialConnectionsSession.id) && AbstractC22676k.m65745e(this.accountsOld, financialConnectionsSession.accountsOld) && AbstractC22676k.m65745e(this.accountsNew, financialConnectionsSession.accountsNew) && this.livemode == financialConnectionsSession.livemode && AbstractC22676k.m65745e(this.paymentAccount, financialConnectionsSession.paymentAccount) && AbstractC22676k.m65745e(this.returnUrl, financialConnectionsSession.returnUrl) && AbstractC22676k.m65745e(this.bankAccountToken, financialConnectionsSession.bankAccountToken) && AbstractC22676k.m65745e(this.manualEntry, financialConnectionsSession.manualEntry) && this.status == financialConnectionsSession.status && AbstractC22676k.m65745e(this.statusDetails, financialConnectionsSession.statusDetails);
    }

    public final FinancialConnectionsAccountList getAccounts() {
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsNew;
        if (financialConnectionsAccountList != null) {
            return financialConnectionsAccountList;
        }
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsOld;
        AbstractC22676k.m65747g(financialConnectionsAccountList2);
        return financialConnectionsAccountList2;
    }

    public final FinancialConnectionsAccountList getAccountsNew$financial_connections_core_release() {
        return this.accountsNew;
    }

    public final FinancialConnectionsAccountList getAccountsOld$financial_connections_core_release() {
        return this.accountsOld;
    }

    public final String getBankAccountToken() {
        return this.bankAccountToken;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final ManualEntry getManualEntry() {
        return this.manualEntry;
    }

    public final C38842g8 getParsedToken() {
        String str = this.bankAccountToken;
        if (str != null) {
            return C39938g.m128099d(new JSONObject(str));
        }
        return null;
    }

    public final PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final StatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.clientSecret.hashCode() * 31, 31, this.id);
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        int iHashCode = (iM30450d + (financialConnectionsAccountList == null ? 0 : financialConnectionsAccountList.hashCode())) * 31;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (financialConnectionsAccountList2 == null ? 0 : financialConnectionsAccountList2.hashCode())) * 31, 31, this.livemode);
        PaymentAccount paymentAccount = this.paymentAccount;
        int iHashCode2 = (iM8289b + (paymentAccount == null ? 0 : paymentAccount.hashCode())) * 31;
        String str = this.returnUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankAccountToken;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ManualEntry manualEntry = this.manualEntry;
        int iHashCode5 = (iHashCode4 + (manualEntry == null ? 0 : manualEntry.hashCode())) * 31;
        Status status = this.status;
        int iHashCode6 = (iHashCode5 + (status == null ? 0 : status.hashCode())) * 31;
        StatusDetails statusDetails = this.statusDetails;
        return iHashCode6 + (statusDetails != null ? statusDetails.hashCode() : 0);
    }

    public String toString() {
        String str = this.clientSecret;
        String str2 = this.id;
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        boolean z4 = this.livemode;
        PaymentAccount paymentAccount = this.paymentAccount;
        String str3 = this.returnUrl;
        String str4 = this.bankAccountToken;
        ManualEntry manualEntry = this.manualEntry;
        Status status = this.status;
        StatusDetails statusDetails = this.statusDetails;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FinancialConnectionsSession(clientSecret=", str, ", id=", str2, ", accountsOld=");
        sbM32001t.append(financialConnectionsAccountList);
        sbM32001t.append(", accountsNew=");
        sbM32001t.append(financialConnectionsAccountList2);
        sbM32001t.append(", livemode=");
        sbM32001t.append(z4);
        sbM32001t.append(", paymentAccount=");
        sbM32001t.append(paymentAccount);
        sbM32001t.append(", returnUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", bankAccountToken=", str4, ", manualEntry=");
        sbM32001t.append(manualEntry);
        sbM32001t.append(", status=");
        sbM32001t.append(status);
        sbM32001t.append(", statusDetails=");
        sbM32001t.append(statusDetails);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.clientSecret);
        dest.writeString(this.id);
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        if (financialConnectionsAccountList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsAccountList.writeToParcel(dest, flags);
        }
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        if (financialConnectionsAccountList2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsAccountList2.writeToParcel(dest, flags);
        }
        dest.writeInt(this.livemode ? 1 : 0);
        dest.writeParcelable(this.paymentAccount, flags);
        dest.writeString(this.returnUrl);
        dest.writeString(this.bankAccountToken);
        ManualEntry manualEntry = this.manualEntry;
        if (manualEntry == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            manualEntry.writeToParcel(dest, flags);
        }
        Status status = this.status;
        if (status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(status.name());
        }
        StatusDetails statusDetails = this.statusDetails;
        if (statusDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            statusDetails.writeToParcel(dest, flags);
        }
    }

    public FinancialConnectionsSession(String clientSecret, String id4, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z4, PaymentAccount paymentAccount, String str, String str2, ManualEntry manualEntry, Status status, StatusDetails statusDetails) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(id4, "id");
        this.clientSecret = clientSecret;
        this.id = id4;
        this.accountsOld = financialConnectionsAccountList;
        this.accountsNew = financialConnectionsAccountList2;
        this.livemode = z4;
        this.paymentAccount = paymentAccount;
        this.returnUrl = str;
        this.bankAccountToken = str2;
        this.manualEntry = manualEntry;
        this.status = status;
        this.statusDetails = statusDetails;
    }

    public /* synthetic */ FinancialConnectionsSession(String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z4, PaymentAccount paymentAccount, String str3, String str4, ManualEntry manualEntry, Status status, StatusDetails statusDetails, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : financialConnectionsAccountList, (i13 & 8) != 0 ? null : financialConnectionsAccountList2, z4, (i13 & 32) != 0 ? null : paymentAccount, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : manualEntry, (i13 & 512) != 0 ? null : status, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : statusDetails);
    }
}
