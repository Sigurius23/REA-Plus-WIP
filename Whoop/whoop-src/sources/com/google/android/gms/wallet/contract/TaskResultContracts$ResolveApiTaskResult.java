package com.google.android.gms.wallet.contract;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p236j.C21073l;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TaskResultContracts$ResolveApiTaskResult<I, O> extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public Status f20657a;

    /* JADX INFO: renamed from: b */
    public PendingIntent f20658b;

    /* JADX INFO: renamed from: a */
    public abstract Object mo15644a(Task task);

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        PendingIntent pendingIntent = this.f20658b;
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        IntentSender intentSender = pendingIntent.getIntentSender();
        AbstractC22676k.m65749i(intentSender, "pendingIntent.intentSender");
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new C21073l(intentSender, null, 0, 0));
    }

    @Override // p267k.AbstractC22081b
    public final C22080a getSynchronousResult(Context context, Object obj) {
        Task task = (Task) obj;
        if (!task.isComplete()) {
            throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
        }
        Exception exception = task.getException();
        if (exception instanceof ApiException) {
            this.f20657a = ((ApiException) exception).f20483w;
            if (exception instanceof ResolvableApiException) {
                this.f20658b = ((ResolvableApiException) exception).f20483w.f20495y;
            }
        }
        if (this.f20658b == null) {
            return new C22080a(mo15644a(task));
        }
        return null;
    }
}
