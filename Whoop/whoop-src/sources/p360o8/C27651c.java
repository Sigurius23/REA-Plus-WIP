package p360o8;

import androidx.lifecycle.C1630u0;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.Semaphore;
import p397p8.RunnableC28963a;
import p507tx.AbstractC34235f;
import ro.C31619d;

/* JADX INFO: renamed from: o8.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C27651c extends C1630u0 {

    /* JADX INFO: renamed from: a */
    public final int f111258a;

    /* JADX INFO: renamed from: b */
    public final C31619d f111259b;

    /* JADX INFO: renamed from: c */
    public Object f111260c;

    /* JADX INFO: renamed from: d */
    public C27652d f111261d;

    public C27651c(int i13, C31619d c31619d) {
        this.f111258a = i13;
        this.f111259b = c31619d;
        if (c31619d.f130646b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        c31619d.f130646b = this;
        c31619d.f130645a = i13;
    }

    /* JADX INFO: renamed from: b */
    public final void m83609b() {
        C31619d c31619d = this.f111259b;
        c31619d.m97685a();
        c31619d.f130649e = true;
        C27652d c27652d = this.f111261d;
        if (c27652d != null) {
            removeObserver(c27652d);
            if (c27652d.f111263x) {
                c27652d.f111262w.mo83604l();
            }
        }
        C27651c c27651c = c31619d.f130646b;
        if (c27651c == null) {
            throw new IllegalStateException("No listener register");
        }
        if (c27651c != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        c31619d.f130646b = null;
        if (c27652d != null) {
            boolean z4 = c27652d.f111263x;
        }
        c31619d.f130650f = true;
        c31619d.f130648d = false;
        c31619d.f130649e = false;
        c31619d.f130651g = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m83610c(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f111258a);
        printWriter.print(" mArgs=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mLoader=");
        printWriter.println(this.f111259b);
        C31619d c31619d = this.f111259b;
        String str2 = str + "  ";
        c31619d.getClass();
        printWriter.print(str2);
        printWriter.print("mId=");
        printWriter.print(c31619d.f130645a);
        printWriter.print(" mListener=");
        printWriter.println(c31619d.f130646b);
        if (c31619d.f130648d || c31619d.f130651g) {
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.print(c31619d.f130648d);
            printWriter.print(" mContentChanged=");
            printWriter.print(c31619d.f130651g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (c31619d.f130649e || c31619d.f130650f) {
            printWriter.print(str2);
            printWriter.print("mAbandoned=");
            printWriter.print(c31619d.f130649e);
            printWriter.print(" mReset=");
            printWriter.println(c31619d.f130650f);
        }
        if (c31619d.f130653i != null) {
            printWriter.print(str2);
            printWriter.print("mTask=");
            printWriter.print(c31619d.f130653i);
            printWriter.print(" waiting=");
            c31619d.f130653i.getClass();
            printWriter.println(false);
        }
        if (c31619d.f130654j != null) {
            printWriter.print(str2);
            printWriter.print("mCancellingTask=");
            printWriter.print(c31619d.f130654j);
            printWriter.print(" waiting=");
            c31619d.f130654j.getClass();
            printWriter.println(false);
        }
        if (this.f111261d != null) {
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f111261d);
            C27652d c27652d = this.f111261d;
            c27652d.getClass();
            printWriter.print(str + "  ");
            printWriter.print("mDeliveredData=");
            printWriter.println(c27652d.f111263x);
        }
        printWriter.print(str);
        printWriter.print("mData=");
        C31619d c31619d2 = this.f111259b;
        Object value = getValue();
        c31619d2.getClass();
        StringBuilder sb4 = new StringBuilder(64);
        AbstractC34235f.m108239y(sb4, value);
        sb4.append("}");
        printWriter.println(sb4.toString());
        printWriter.print(str);
        printWriter.print("mStarted=");
        printWriter.println(hasActiveObservers());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.g0, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final void m83611d() {
        ?? r10 = this.f111260c;
        C27652d c27652d = this.f111261d;
        if (r10 == 0 || c27652d == null) {
            return;
        }
        super.removeObserver(c27652d);
        observe(r10, c27652d);
    }

    /* JADX INFO: renamed from: e */
    public final C31619d m83612e(InterfaceC1585g0 interfaceC1585g0, InterfaceC27649a interfaceC27649a) {
        C31619d c31619d = this.f111259b;
        C27652d c27652d = new C27652d(c31619d, interfaceC27649a);
        observe(interfaceC1585g0, c27652d);
        InterfaceC1633v0 interfaceC1633v0 = this.f111261d;
        if (interfaceC1633v0 != null) {
            removeObserver(interfaceC1633v0);
        }
        this.f111260c = interfaceC1585g0;
        this.f111261d = c27652d;
        return c31619d;
    }

    @Override // androidx.lifecycle.AbstractC1615p0
    public final void onActive() {
        C31619d c31619d = this.f111259b;
        c31619d.f130648d = true;
        c31619d.f130650f = false;
        c31619d.f130649e = false;
        switch (c31619d.f130655k) {
            case 0:
                ((Semaphore) c31619d.f130656l).drainPermits();
                c31619d.m97685a();
                c31619d.f130653i = new RunnableC28963a(c31619d);
                c31619d.m97687c();
                break;
            default:
                List list = (List) c31619d.f130656l;
                if (list == null) {
                    c31619d.m97685a();
                    c31619d.f130653i = new RunnableC28963a(c31619d);
                    c31619d.m97687c();
                } else {
                    c31619d.m97686b(list);
                }
                break;
        }
    }

    @Override // androidx.lifecycle.AbstractC1615p0
    public final void onInactive() {
        C31619d c31619d = this.f111259b;
        c31619d.f130648d = false;
        switch (c31619d.f130655k) {
            case 1:
                c31619d.m97685a();
                break;
        }
    }

    @Override // androidx.lifecycle.AbstractC1615p0
    public final void removeObserver(InterfaceC1633v0 interfaceC1633v0) {
        super.removeObserver(interfaceC1633v0);
        this.f111260c = null;
        this.f111261d = null;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(64);
        sb4.append("LoaderInfo{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append(" #");
        sb4.append(this.f111258a);
        sb4.append(" : ");
        AbstractC34235f.m108239y(sb4, this.f111259b);
        sb4.append("}}");
        return sb4.toString();
    }
}
