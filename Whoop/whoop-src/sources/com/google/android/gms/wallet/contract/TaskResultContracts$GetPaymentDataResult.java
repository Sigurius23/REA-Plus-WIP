package com.google.android.gms.wallet.contract;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p096dq.AbstractC12257a;
import p096dq.C12268l;
import p153fq.C14681a;
import p460rg.AbstractC31366a;

/* JADX INFO: loaded from: classes6.dex */
public final class TaskResultContracts$GetPaymentDataResult extends TaskResultContracts$GetApiTaskResult<C12268l> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult, p267k.AbstractC22081b
    /* JADX INFO: renamed from: b */
    public final C14681a parseResult(int i13, Intent intent) {
        if (i13 != 1) {
            return super.parseResult(i13, intent);
        }
        int i14 = AbstractC12257a.f41026a;
        Status status = intent == null ? null : (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        if (status == null) {
            status = Status.f20490G;
        }
        return new C14681a(null, status);
    }

    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    /* JADX INFO: renamed from: c */
    public final C12268l mo15646c(Intent intent) {
        Parcelable.Creator<C12268l> creator = C12268l.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
        return (C12268l) (byteArrayExtra == null ? null : AbstractC31366a.m96470j(byteArrayExtra, creator));
    }
}
