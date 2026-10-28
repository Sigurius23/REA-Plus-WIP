package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import ge3.AbstractC15751g;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\b\u0087\b\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u000e\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011¢\u0006\u0004\b\u001f\u0010 BÃ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010%J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0010\u00101\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b8\u00109J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b@\u00102J\u0012\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bA\u00102J\u0012\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bB\u00102J\u0012\u0010C\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bE\u0010;JÀ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bH\u00102J\u0010\u0010I\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bI\u0010-J\u001a\u0010L\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010JHÖ\u0003¢\u0006\u0004\bL\u0010MJ'\u0010U\u001a\u00020)2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u0001¢\u0006\u0004\bS\u0010TR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010V\u0012\u0004\bX\u0010Y\u001a\u0004\bW\u0010/R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010Z\u0012\u0004\b\\\u0010Y\u001a\u0004\b[\u0010-R \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u0010]\u0012\u0004\b_\u0010Y\u001a\u0004\b^\u00102R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010]\u0012\u0004\ba\u0010Y\u001a\u0004\b`\u00102R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010b\u0012\u0004\bd\u0010Y\u001a\u0004\bc\u00105R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010e\u0012\u0004\bg\u0010Y\u001a\u0004\bf\u00107R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010h\u0012\u0004\bj\u0010Y\u001a\u0004\bi\u00109R&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010k\u0012\u0004\bm\u0010Y\u001a\u0004\bl\u0010;R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010n\u0012\u0004\bp\u0010Y\u001a\u0004\bo\u0010=R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010q\u0012\u0004\bs\u0010Y\u001a\u0004\br\u0010?R\"\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010]\u0012\u0004\bu\u0010Y\u001a\u0004\bt\u00102R\"\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010]\u0012\u0004\bw\u0010Y\u001a\u0004\bv\u00102R\"\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010]\u0012\u0004\by\u0010Y\u001a\u0004\bx\u00102R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010z\u0012\u0004\b|\u0010Y\u001a\u0004\b{\u0010DR(\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010k\u0012\u0004\b~\u0010Y\u001a\u0004\b}\u0010;R,\u0010\"\u001a\u00020\b2\u0006\u0010\u007f\u001a\u00020\b8\u0006@BX\u0087\u000e¢\u0006\u0014\n\u0004\b\"\u0010]\u0012\u0005\b\u0081\u0001\u0010Y\u001a\u0005\b\u0080\u0001\u00102¨\u0006\u008a\u0001"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "Lvy/b;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "category", "", AnalyticsRequestV2.PARAM_CREATED, "", "id", "institutionName", "", "livemode", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "subcategory", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "supportedPaymentMethodTypes", "Lcom/stripe/android/financialconnections/model/Balance;", "balance", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "balanceRefresh", "displayName", "last4", "ownership", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "ownershipRefresh", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "permissions", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V", "seen0", "object", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "component6", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "component7", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "component8", "()Ljava/util/List;", "component9", "()Lcom/stripe/android/financialconnections/model/Balance;", "component10", "()Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "component11", "component12", "component13", "component14", "()Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "component15", "copy", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "getCategory", "getCategory$annotations", "()V", "I", "getCreated", "getCreated$annotations", "Ljava/lang/String;", "getId", "getId$annotations", "getInstitutionName", "getInstitutionName$annotations", "Z", "getLivemode", "getLivemode$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "getStatus", "getStatus$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "getSubcategory", "getSubcategory$annotations", "Ljava/util/List;", "getSupportedPaymentMethodTypes", "getSupportedPaymentMethodTypes$annotations", "Lcom/stripe/android/financialconnections/model/Balance;", "getBalance", "getBalance$annotations", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "getBalanceRefresh", "getBalanceRefresh$annotations", "getDisplayName", "getDisplayName$annotations", "getLast4", "getLast4$annotations", "getOwnership", "getOwnership$annotations", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "getOwnershipRefresh", "getOwnershipRefresh$annotations", "getPermissions", "getPermissions$annotations", "value", "getObject", "getObject$annotations", "Companion", "Category", "Status", "Subcategory", "SupportedPaymentMethodTypes", "Permissions", "com/stripe/android/financialconnections/model/l", "$serializer", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FinancialConnectionsAccount extends PaymentAccount implements InterfaceC36562b, Parcelable {
    public static final String OBJECT_NEW = "financial_connections.account";
    public static final String OBJECT_OLD = "linked_account";
    private final Balance balance;
    private final BalanceRefresh balanceRefresh;
    private final Category category;
    private final int created;
    private final String displayName;
    private final String id;
    private final String institutionName;
    private final String last4;
    private final boolean livemode;
    private String object;
    private final String ownership;
    private final OwnershipRefresh ownershipRefresh;
    private final List<Permissions> permissions;
    private final Status status;
    private final Subcategory subcategory;
    private final List<SupportedPaymentMethodTypes> supportedPaymentMethodTypes;
    public static final C5622l Companion = new C5622l();
    public static final Parcelable.Creator<FinancialConnectionsAccount> CREATOR = new C5623m();
    private static final InterfaceC37138c[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(C5631u.f22182e), null, null, null, null, null, null, new ArrayListSerializer(C5625o.f22179e), null};

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/k", "com/stripe/android/financialconnections/model/j", "CASH", "CREDIT", "INVESTMENT", "OTHER", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C5621k.class)
    public enum Category {
        CASH("cash"),
        CREDIT("credit"),
        INVESTMENT("investment"),
        OTHER("other"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5619j Companion = new C5619j();

        Category(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/o", "com/stripe/android/financialconnections/model/n", "BALANCES", "OWNERSHIP", "PAYMENT_METHOD", "TRANSACTIONS", "ACCOUNT_NUMBERS", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C5625o.class)
    public enum Permissions {
        BALANCES("balances"),
        OWNERSHIP("ownership"),
        PAYMENT_METHOD("payment_method"),
        TRANSACTIONS("transactions"),
        ACCOUNT_NUMBERS("account_numbers"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5624n Companion = new C5624n();

        Permissions(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/q", "com/stripe/android/financialconnections/model/p", "ACTIVE", "DISCONNECTED", "INACTIVE", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C5627q.class)
    public enum Status {
        ACTIVE("active"),
        DISCONNECTED("disconnected"),
        INACTIVE("inactive"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5626p Companion = new C5626p();

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

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/s", "com/stripe/android/financialconnections/model/r", "CHECKING", "CREDIT_CARD", "LINE_OF_CREDIT", "MORTGAGE", "OTHER", "SAVINGS", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C5629s.class)
    public enum Subcategory {
        CHECKING("checking"),
        CREDIT_CARD("credit_card"),
        LINE_OF_CREDIT("line_of_credit"),
        MORTGAGE("mortgage"),
        OTHER("other"),
        SAVINGS("savings"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5628r Companion = new C5628r();

        Subcategory(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/stripe/android/financialconnections/model/u", "com/stripe/android/financialconnections/model/t", "LINK", "US_BANK_ACCOUNT", "UNKNOWN", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C5631u.class)
    public enum SupportedPaymentMethodTypes {
        LINK("link"),
        US_BANK_ACCOUNT("us_bank_account"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        public static final C5630t Companion = new C5630t();

        SupportedPaymentMethodTypes(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinancialConnectionsAccount(int i13, Category category, int i14, String str, String str2, boolean z4, Status status, Subcategory subcategory, List list, Balance balance, BalanceRefresh balanceRefresh, String str3, String str4, String str5, OwnershipRefresh ownershipRefresh, List list2, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (32926 != (i13 & 32926)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 32926, FinancialConnectionsAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.category = (i13 & 1) == 0 ? Category.UNKNOWN : category;
        this.created = i14;
        this.id = str;
        this.institutionName = str2;
        this.livemode = z4;
        if ((i13 & 32) == 0) {
            this.status = Status.UNKNOWN;
        } else {
            this.status = status;
        }
        if ((i13 & 64) == 0) {
            this.subcategory = Subcategory.UNKNOWN;
        } else {
            this.subcategory = subcategory;
        }
        this.supportedPaymentMethodTypes = list;
        if ((i13 & 256) == 0) {
            this.balance = null;
        } else {
            this.balance = balance;
        }
        if ((i13 & 512) == 0) {
            this.balanceRefresh = null;
        } else {
            this.balanceRefresh = balanceRefresh;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str3;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.last4 = null;
        } else {
            this.last4 = str4;
        }
        if ((i13 & 4096) == 0) {
            this.ownership = null;
        } else {
            this.ownership = str5;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.ownershipRefresh = null;
        } else {
            this.ownershipRefresh = ownershipRefresh;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.permissions = null;
        } else {
            this.permissions = list2;
        }
        this.object = str6;
    }

    @InterfaceC37143h("balance")
    public static /* synthetic */ void getBalance$annotations() {
    }

    @InterfaceC37143h("balance_refresh")
    public static /* synthetic */ void getBalanceRefresh$annotations() {
    }

    @InterfaceC37143h("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @InterfaceC37143h(AnalyticsRequestV2.PARAM_CREATED)
    public static /* synthetic */ void getCreated$annotations() {
    }

    @InterfaceC37143h("display_name")
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("institution_name")
    public static /* synthetic */ void getInstitutionName$annotations() {
    }

    @InterfaceC37143h("last4")
    public static /* synthetic */ void getLast4$annotations() {
    }

    @InterfaceC37143h("livemode")
    public static /* synthetic */ void getLivemode$annotations() {
    }

    @InterfaceC37143h("object")
    public static /* synthetic */ void getObject$annotations() {
    }

    @InterfaceC37143h("ownership")
    public static /* synthetic */ void getOwnership$annotations() {
    }

    @InterfaceC37143h("ownership_refresh")
    public static /* synthetic */ void getOwnershipRefresh$annotations() {
    }

    @InterfaceC37143h("permissions")
    public static /* synthetic */ void getPermissions$annotations() {
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_STATUS)
    public static /* synthetic */ void getStatus$annotations() {
    }

    @InterfaceC37143h("subcategory")
    public static /* synthetic */ void getSubcategory$annotations() {
    }

    @InterfaceC37143h("supported_payment_method_types")
    public static /* synthetic */ void getSupportedPaymentMethodTypes$annotations() {
    }

    public static final /* synthetic */ void write$Self$financial_connections_core_release(FinancialConnectionsAccount self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.category != Category.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 0, C5621k.f22178e, self.category);
        }
        output.encodeIntElement(serialDesc, 1, self.created);
        output.encodeStringElement(serialDesc, 2, self.getId());
        output.encodeStringElement(serialDesc, 3, self.institutionName);
        output.encodeBooleanElement(serialDesc, 4, self.livemode);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.status != Status.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 5, C5627q.f22180e, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.subcategory != Subcategory.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 6, C5629s.f22181e, self.subcategory);
        }
        output.encodeSerializableElement(serialDesc, 7, interfaceC37138cArr[7], self.supportedPaymentMethodTypes);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.balance != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, Balance$$serializer.INSTANCE, self.balance);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.balanceRefresh != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, BalanceRefresh$$serializer.INSTANCE, self.balanceRefresh);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.displayName != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.displayName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.last4 != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.last4);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.ownership != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.ownership);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.ownershipRefresh != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, OwnershipRefresh$$serializer.INSTANCE, self.ownershipRefresh);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.permissions != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, interfaceC37138cArr[14], self.permissions);
        }
        output.encodeStringElement(serialDesc, 15, self.object);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BalanceRefresh getBalanceRefresh() {
        return this.balanceRefresh;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOwnership() {
        return this.ownership;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final OwnershipRefresh getOwnershipRefresh() {
        return this.ownershipRefresh;
    }

    public final List<Permissions> component15() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCreated() {
        return this.created;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLivemode() {
        return this.livemode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Subcategory getSubcategory() {
        return this.subcategory;
    }

    public final List<SupportedPaymentMethodTypes> component8() {
        return this.supportedPaymentMethodTypes;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Balance getBalance() {
        return this.balance;
    }

    public final FinancialConnectionsAccount copy(Category category, int created, String id4, String institutionName, boolean livemode, Status status, Subcategory subcategory, List<? extends SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Balance balance, BalanceRefresh balanceRefresh, String displayName, String last4, String ownership, OwnershipRefresh ownershipRefresh, List<? extends Permissions> permissions) {
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(institutionName, "institutionName");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(subcategory, "subcategory");
        AbstractC22676k.m65750j(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        return new FinancialConnectionsAccount(category, created, id4, institutionName, livemode, status, subcategory, supportedPaymentMethodTypes, balance, balanceRefresh, displayName, last4, ownership, ownershipRefresh, permissions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsAccount)) {
            return false;
        }
        FinancialConnectionsAccount financialConnectionsAccount = (FinancialConnectionsAccount) other;
        return this.category == financialConnectionsAccount.category && this.created == financialConnectionsAccount.created && AbstractC22676k.m65745e(this.id, financialConnectionsAccount.id) && AbstractC22676k.m65745e(this.institutionName, financialConnectionsAccount.institutionName) && this.livemode == financialConnectionsAccount.livemode && this.status == financialConnectionsAccount.status && this.subcategory == financialConnectionsAccount.subcategory && AbstractC22676k.m65745e(this.supportedPaymentMethodTypes, financialConnectionsAccount.supportedPaymentMethodTypes) && AbstractC22676k.m65745e(this.balance, financialConnectionsAccount.balance) && AbstractC22676k.m65745e(this.balanceRefresh, financialConnectionsAccount.balanceRefresh) && AbstractC22676k.m65745e(this.displayName, financialConnectionsAccount.displayName) && AbstractC22676k.m65745e(this.last4, financialConnectionsAccount.last4) && AbstractC22676k.m65745e(this.ownership, financialConnectionsAccount.ownership) && AbstractC22676k.m65745e(this.ownershipRefresh, financialConnectionsAccount.ownershipRefresh) && AbstractC22676k.m65745e(this.permissions, financialConnectionsAccount.permissions);
    }

    public final Balance getBalance() {
        return this.balance;
    }

    public final BalanceRefresh getBalanceRefresh() {
        return this.balanceRefresh;
    }

    public final Category getCategory() {
        return this.category;
    }

    public final int getCreated() {
        return this.created;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    @Override // com.stripe.android.financialconnections.model.PaymentAccount
    public String getId() {
        return this.id;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final String getObject() {
        return this.object;
    }

    public final String getOwnership() {
        return this.ownership;
    }

    public final OwnershipRefresh getOwnershipRefresh() {
        return this.ownershipRefresh;
    }

    public final List<Permissions> getPermissions() {
        return this.permissions;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Subcategory getSubcategory() {
        return this.subcategory;
    }

    public final List<SupportedPaymentMethodTypes> getSupportedPaymentMethodTypes() {
        return this.supportedPaymentMethodTypes;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.subcategory.hashCode() + ((this.status.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.created, this.category.hashCode() * 31, 31), 31, this.id), 31, this.institutionName), 31, this.livemode)) * 31)) * 31, 31, this.supportedPaymentMethodTypes);
        Balance balance = this.balance;
        int iHashCode = (iM31983b + (balance == null ? 0 : balance.hashCode())) * 31;
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        int iHashCode2 = (iHashCode + (balanceRefresh == null ? 0 : balanceRefresh.hashCode())) * 31;
        String str = this.displayName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.last4;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownership;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        int iHashCode6 = (iHashCode5 + (ownershipRefresh == null ? 0 : ownershipRefresh.hashCode())) * 31;
        List<Permissions> list = this.permissions;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Category category = this.category;
        int i13 = this.created;
        String str = this.id;
        String str2 = this.institutionName;
        boolean z4 = this.livemode;
        Status status = this.status;
        Subcategory subcategory = this.subcategory;
        List<SupportedPaymentMethodTypes> list = this.supportedPaymentMethodTypes;
        Balance balance = this.balance;
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        String str3 = this.displayName;
        String str4 = this.last4;
        String str5 = this.ownership;
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        List<Permissions> list2 = this.permissions;
        StringBuilder sb4 = new StringBuilder("FinancialConnectionsAccount(category=");
        sb4.append(category);
        sb4.append(", created=");
        sb4.append(i13);
        sb4.append(", id=");
        AbstractC11266d.m30444B(sb4, str, ", institutionName=", str2, ", livemode=");
        sb4.append(z4);
        sb4.append(", status=");
        sb4.append(status);
        sb4.append(", subcategory=");
        sb4.append(subcategory);
        sb4.append(", supportedPaymentMethodTypes=");
        sb4.append(list);
        sb4.append(", balance=");
        sb4.append(balance);
        sb4.append(", balanceRefresh=");
        sb4.append(balanceRefresh);
        sb4.append(", displayName=");
        AbstractC11266d.m30444B(sb4, str3, ", last4=", str4, ", ownership=");
        sb4.append(str5);
        sb4.append(", ownershipRefresh=");
        sb4.append(ownershipRefresh);
        sb4.append(", permissions=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.category.name());
        dest.writeInt(this.created);
        dest.writeString(this.id);
        dest.writeString(this.institutionName);
        dest.writeInt(this.livemode ? 1 : 0);
        dest.writeString(this.status.name());
        dest.writeString(this.subcategory.name());
        Iterator itM30863o = AbstractC11478a.m30863o(this.supportedPaymentMethodTypes, dest);
        while (itM30863o.hasNext()) {
            dest.writeString(((SupportedPaymentMethodTypes) itM30863o.next()).name());
        }
        Balance balance = this.balance;
        if (balance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            balance.writeToParcel(dest, flags);
        }
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        if (balanceRefresh == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            balanceRefresh.writeToParcel(dest, flags);
        }
        dest.writeString(this.displayName);
        dest.writeString(this.last4);
        dest.writeString(this.ownership);
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        if (ownershipRefresh == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ownershipRefresh.writeToParcel(dest, flags);
        }
        List<Permissions> list = this.permissions;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<Permissions> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
    }

    public /* synthetic */ FinancialConnectionsAccount(Category category, int i13, String str, String str2, boolean z4, Status status, Subcategory subcategory, List list, Balance balance, BalanceRefresh balanceRefresh, String str3, String str4, String str5, OwnershipRefresh ownershipRefresh, List list2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? Category.UNKNOWN : category, i13, str, str2, z4, (i14 & 32) != 0 ? Status.UNKNOWN : status, (i14 & 64) != 0 ? Subcategory.UNKNOWN : subcategory, list, (i14 & 256) != 0 ? null : balance, (i14 & 512) != 0 ? null : balanceRefresh, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str3, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str4, (i14 & 4096) != 0 ? null : str5, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : ownershipRefresh, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsAccount(Category category, int i13, String id4, String institutionName, boolean z4, Status status, Subcategory subcategory, List<? extends SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Balance balance, BalanceRefresh balanceRefresh, String str, String str2, String str3, OwnershipRefresh ownershipRefresh, List<? extends Permissions> list) {
        super(null);
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(institutionName, "institutionName");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(subcategory, "subcategory");
        AbstractC22676k.m65750j(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        this.category = category;
        this.created = i13;
        this.id = id4;
        this.institutionName = institutionName;
        this.livemode = z4;
        this.status = status;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = supportedPaymentMethodTypes;
        this.balance = balance;
        this.balanceRefresh = balanceRefresh;
        this.displayName = str;
        this.last4 = str2;
        this.ownership = str3;
        this.ownershipRefresh = ownershipRefresh;
        this.permissions = list;
        this.object = OBJECT_NEW;
    }
}
