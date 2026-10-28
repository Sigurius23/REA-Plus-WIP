package com.google.android.gms.wallet.contract;

import android.content.Intent;
import android.os.Parcelable;
import p096dq.C12268l;
import p460rg.AbstractC31366a;

/* JADX INFO: loaded from: classes6.dex */
public final class TaskResultContracts$GetPaymentData extends TaskResultContracts$UnpackApiTaskResult<C12268l> {
    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        if (intent == null) {
            return null;
        }
        Parcelable.Creator<C12268l> creator = C12268l.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
        return (C12268l) (byteArrayExtra != null ? AbstractC31366a.m96470j(byteArrayExtra, creator) : null);
    }
}
