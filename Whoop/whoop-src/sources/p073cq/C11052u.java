package p073cq;

import android.app.Activity;
import ch3.C4685h;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: cq.u */
/* JADX INFO: loaded from: classes.dex */
public final class C11052u extends Task {

    /* JADX INFO: renamed from: a */
    public final Object f34667a = new Object();

    /* JADX INFO: renamed from: b */
    public final C4685h f34668b = new C4685h();

    /* JADX INFO: renamed from: c */
    public boolean f34669c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f34670d;

    /* JADX INFO: renamed from: e */
    public Object f34671e;

    /* JADX INFO: renamed from: f */
    public Exception f34672f;

    /* JADX INFO: renamed from: a */
    public final void m29702a(Object obj) {
        synchronized (this.f34667a) {
            if (this.f34669c) {
                throw DuplicateTaskCompletionException.m15636a(this);
            }
            this.f34669c = true;
            this.f34671e = obj;
        }
        this.f34668b.m14764b(this);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity, InterfaceC11034c interfaceC11034c) {
        C11046o c11046o = new C11046o(AbstractC11041j.f34645a, interfaceC11034c);
        this.f34668b.m14763a(c11046o);
        C11051t.m29699j(activity).m29701k(c11046o);
        m29706e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, InterfaceC11035d interfaceC11035d) {
        C11046o c11046o = new C11046o(AbstractC11041j.f34645a, interfaceC11035d);
        this.f34668b.m14763a(c11046o);
        C11051t.m29699j(activity).m29701k(c11046o);
        m29706e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Activity activity, InterfaceC11036e interfaceC11036e) {
        C11046o c11046o = new C11046o(AbstractC11041j.f34645a, interfaceC11036e);
        this.f34668b.m14763a(c11046o);
        C11051t.m29699j(activity).m29701k(c11046o);
        m29706e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Activity activity, InterfaceC11037f interfaceC11037f) {
        C11046o c11046o = new C11046o(AbstractC11041j.f34645a, interfaceC11037f);
        this.f34668b.m14763a(c11046o);
        C11051t.m29699j(activity).m29701k(c11046o);
        m29706e();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m29703b(Object obj) {
        synchronized (this.f34667a) {
            try {
                if (this.f34669c) {
                    return false;
                }
                this.f34669c = true;
                this.f34671e = obj;
                this.f34668b.m14764b(this);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m29704c(Exception exc) {
        AbstractC35135w.m111095g(exc, "Exception must not be null");
        synchronized (this.f34667a) {
            if (this.f34669c) {
                throw DuplicateTaskCompletionException.m15636a(this);
            }
            this.f34669c = true;
            this.f34672f = exc;
        }
        this.f34668b.m14764b(this);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(InterfaceC11033b interfaceC11033b) {
        return continueWith(AbstractC11041j.f34645a, interfaceC11033b);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(InterfaceC11033b interfaceC11033b) {
        return continueWithTask(AbstractC11041j.f34645a, interfaceC11033b);
    }

    /* JADX INFO: renamed from: d */
    public final void m29705d() {
        synchronized (this.f34667a) {
            try {
                if (this.f34669c) {
                    return;
                }
                this.f34669c = true;
                this.f34670d = true;
                this.f34668b.m14764b(this);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m29706e() {
        synchronized (this.f34667a) {
            try {
                if (this.f34669c) {
                    this.f34668b.m14764b(this);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f34667a) {
            exc = this.f34672f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f34667a) {
            try {
                AbstractC35135w.m111096h("Task is not yet complete", this.f34669c);
                if (this.f34670d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f34672f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f34671e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f34670d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z4;
        synchronized (this.f34667a) {
            z4 = this.f34669c;
        }
        return z4;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z4;
        synchronized (this.f34667a) {
            try {
                z4 = false;
                if (this.f34669c && !this.f34670d && this.f34672f == null) {
                    z4 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z4;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(InterfaceC11039h interfaceC11039h) {
        ExecutorC11050s executorC11050s = AbstractC11041j.f34645a;
        C11052u c11052u = new C11052u();
        this.f34668b.m14763a(new C11046o(executorC11050s, interfaceC11039h, c11052u));
        m29706e();
        return c11052u;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, InterfaceC11033b interfaceC11033b) {
        C11052u c11052u = new C11052u();
        this.f34668b.m14763a(new C11045n(executor, interfaceC11033b, c11052u, 0));
        m29706e();
        return c11052u;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, InterfaceC11033b interfaceC11033b) {
        C11052u c11052u = new C11052u();
        this.f34668b.m14763a(new C11045n(executor, interfaceC11033b, c11052u, 1));
        m29706e();
        return c11052u;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(InterfaceC11034c interfaceC11034c) {
        addOnCanceledListener(AbstractC11041j.f34645a, interfaceC11034c);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(InterfaceC11035d interfaceC11035d) {
        this.f34668b.m14763a(new C11046o(AbstractC11041j.f34645a, interfaceC11035d));
        m29706e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(InterfaceC11036e interfaceC11036e) {
        addOnFailureListener(AbstractC11041j.f34645a, interfaceC11036e);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(InterfaceC11037f interfaceC11037f) {
        addOnSuccessListener(AbstractC11041j.f34645a, interfaceC11037f);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, InterfaceC11039h interfaceC11039h) {
        C11052u c11052u = new C11052u();
        this.f34668b.m14763a(new C11046o(executor, interfaceC11039h, c11052u));
        m29706e();
        return c11052u;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor, InterfaceC11034c interfaceC11034c) {
        this.f34668b.m14763a(new C11046o(executor, interfaceC11034c));
        m29706e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, InterfaceC11036e interfaceC11036e) {
        this.f34668b.m14763a(new C11046o(executor, interfaceC11036e));
        m29706e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, InterfaceC11037f interfaceC11037f) {
        this.f34668b.m14763a(new C11046o(executor, interfaceC11037f));
        m29706e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, InterfaceC11035d interfaceC11035d) {
        this.f34668b.m14763a(new C11046o(executor, interfaceC11035d));
        m29706e();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult(Class cls) {
        Object obj;
        synchronized (this.f34667a) {
            try {
                AbstractC35135w.m111096h("Task is not yet complete", this.f34669c);
                if (!this.f34670d) {
                    if (!IOException.class.isInstance(this.f34672f)) {
                        Exception exc = this.f34672f;
                        if (exc == null) {
                            obj = this.f34671e;
                        } else {
                            throw new RuntimeExecutionException(exc);
                        }
                    } else {
                        throw ((Throwable) IOException.class.cast(this.f34672f));
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }
}
