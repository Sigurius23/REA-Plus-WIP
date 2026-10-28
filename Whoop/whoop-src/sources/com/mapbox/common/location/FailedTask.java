package com.mapbox.common.location;

import android.app.Activity;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import l83.C23464j;
import p073cq.InterfaceC11034c;
import p073cq.InterfaceC11036e;
import p073cq.InterfaceC11037f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\r\u001a\u00028\u0000\"\n\b\u0001\u0010\u0010*\u0004\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016¢\u0006\u0004\b\r\u0010\u0013J\u0013\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u001dJ%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001e2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b!\u0010\"J-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b!\u0010#J%\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b!\u0010$J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006)"}, m65681d2 = {"Lcom/mapbox/common/location/FailedTask;", "T", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "isComplete", "()Z", "isSuccessful", "isCanceled", "getResult", "()Ljava/lang/Object;", "", "X", "Ljava/lang/Class;", "exceptionType", "(Ljava/lang/Class;)Ljava/lang/Object;", "getException", "()Ljava/lang/Exception;", "Lcq/e;", "listener", "addOnFailureListener", "(Lcq/e;)Lcom/google/android/gms/tasks/Task;", "Ljava/util/concurrent/Executor;", "p0", "p1", "(Ljava/util/concurrent/Executor;Lcq/e;)Lcom/google/android/gms/tasks/Task;", "Landroid/app/Activity;", "(Landroid/app/Activity;Lcq/e;)Lcom/google/android/gms/tasks/Task;", "Lcq/f;", "addOnSuccessListener", "(Landroid/app/Activity;Lcq/f;)Lcom/google/android/gms/tasks/Task;", "(Ljava/util/concurrent/Executor;Lcq/f;)Lcom/google/android/gms/tasks/Task;", "(Lcq/f;)Lcom/google/android/gms/tasks/Task;", "Lcq/c;", "addOnCanceledListener", "(Lcq/c;)Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Exception;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class FailedTask<T> extends Task<T> {
    private final Exception exception;

    public FailedTask(Exception exception) {
        AbstractC22676k.m65750j(exception, "exception");
        this.exception = exception;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnCanceledListener(InterfaceC11034c p13) {
        AbstractC22676k.m65750j(p13, "p0");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnFailureListener(InterfaceC11036e listener) {
        AbstractC22676k.m65750j(listener, "listener");
        listener.mo1681n(this.exception);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnSuccessListener(Activity p13, InterfaceC11037f p14) {
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        return this.exception;
    }

    @Override // com.google.android.gms.tasks.Task
    public T getResult() {
        throw new RuntimeExecutionException(this.exception);
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return true;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnFailureListener(Executor p13, InterfaceC11036e p14) {
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        throw new C23464j("Please use addOnFailureListener(listener: OnFailureListener)");
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnSuccessListener(InterfaceC11037f p13) {
        AbstractC22676k.m65750j(p13, "p0");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnSuccessListener(Executor p13, InterfaceC11037f p14) {
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public <X extends Throwable> T getResult(Class<X> exceptionType) throws Exception {
        AbstractC22676k.m65750j(exceptionType, "exceptionType");
        if (exceptionType.isInstance(this.exception)) {
            throw this.exception;
        }
        throw new RuntimeExecutionException(this.exception);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<T> addOnFailureListener(Activity p13, InterfaceC11036e p14) {
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        throw new C23464j("Please use addOnFailureListener(listener: OnFailureListener)");
    }
}
