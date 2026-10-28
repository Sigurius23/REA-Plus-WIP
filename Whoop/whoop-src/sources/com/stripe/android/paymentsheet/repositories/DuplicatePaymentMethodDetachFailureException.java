package com.stripe.android.paymentsheet.repositories;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z20.C40015i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "z20/i", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class DuplicatePaymentMethodDetachFailureException extends Exception {

    /* JADX INFO: renamed from: w */
    public final String f22397w;

    public DuplicatePaymentMethodDetachFailureException(List failures) {
        AbstractC22676k.m65750j(failures, "failures");
        List<C40015i> list = failures;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C40015i c40015i : list) {
            String str = c40015i.f172629a;
            String message = c40015i.f172630b.getMessage();
            if (message == null) {
                message = "Unknown reason";
            }
            arrayList.add(AbstractC2875y.m8300m("\n - (paymentMethodId: ", str, ", reason: ", message, ")"));
        }
        this.f22397w = "Failed to detach the following duplicates:" + arrayList;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f22397w;
    }
}
