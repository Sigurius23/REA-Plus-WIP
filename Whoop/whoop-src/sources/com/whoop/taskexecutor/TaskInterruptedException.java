package com.whoop.taskexecutor;

import java.util.concurrent.CancellationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/taskexecutor/TaskInterruptedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "message", "", "<init>", "(Ljava/lang/String;)V", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TaskInterruptedException extends CancellationException {
    /* JADX WARN: Multi-variable type inference failed */
    public TaskInterruptedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TaskInterruptedException(String str) {
        super(str);
    }

    public /* synthetic */ TaskInterruptedException(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str);
    }
}
