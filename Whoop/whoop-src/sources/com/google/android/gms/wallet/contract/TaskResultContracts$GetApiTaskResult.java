package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p096dq.C12268l;
import p153fq.C14681a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TaskResultContracts$GetApiTaskResult<T> extends TaskResultContracts$ResolveApiTaskResult<T, C14681a> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$ResolveApiTaskResult
    /* JADX INFO: renamed from: a */
    public final Object mo15644a(Task task) {
        if (task.isSuccessful()) {
            return new C14681a(task.getResult(), Status.f20488E);
        }
        if (task.isCanceled()) {
            return new C14681a(null, new Status(16, "The task has been canceled.", null, null));
        }
        Status status = this.f20657a;
        return status != null ? new C14681a(null, status) : new C14681a(null, Status.f20490G);
    }

    @Override // p267k.AbstractC22081b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C14681a parseResult(int i13, Intent intent) {
        Status status = Status.f20490G;
        if (i13 != -1) {
            return i13 != 0 ? new C14681a(null, status) : new C14681a(null, Status.f20492I);
        }
        C12268l c12268lMo15646c = intent != null ? mo15646c(intent) : null;
        return c12268lMo15646c != null ? new C14681a(c12268lMo15646c, Status.f20488E) : new C14681a(null, status);
    }

    /* JADX INFO: renamed from: c */
    public abstract C12268l mo15646c(Intent intent);
}
