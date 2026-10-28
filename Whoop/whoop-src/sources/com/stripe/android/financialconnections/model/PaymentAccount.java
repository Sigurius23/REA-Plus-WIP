package com.stripe.android.financialconnections.model;

import android.os.Parcelable;
import p407pz.C29637c;
import p443qz.C30781b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/PaymentAccount;", "Landroid/os/Parcelable;", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "Companion", "pz/c", "Lcom/stripe/android/financialconnections/model/BankAccount;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C30781b.class)
public abstract class PaymentAccount implements Parcelable {
    public static final C29637c Companion = new C29637c();

    public /* synthetic */ PaymentAccount(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId();

    private PaymentAccount() {
    }
}
