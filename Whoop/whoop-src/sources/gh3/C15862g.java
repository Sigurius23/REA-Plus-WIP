package gh3;

import ih0.AbstractC18489d0;
import java.io.PrintStream;
import java.util.AbstractQueue;
import p471rx.exceptions.MissingBackpressureException;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: gh3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C15862g implements InterfaceC38293t {

    /* JADX INFO: renamed from: x */
    public static final int f59961x;

    /* JADX INFO: renamed from: w */
    public AbstractQueue f59962w;

    static {
        int i13 = AbstractC15861f.f59960b ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i13 = Integer.parseInt(property);
            } catch (NumberFormatException e5) {
                PrintStream printStream = System.err;
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Failed to set 'rx.buffer.size' with value ", property, " => ");
                sbM53375p.append(e5.getMessage());
                printStream.println(sbM53375p.toString());
            }
        }
        f59961x = i13;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f59962w == null;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        synchronized (this) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m44777c(Object obj) {
        boolean z4;
        boolean z13;
        synchronized (this) {
            try {
                AbstractQueue abstractQueue = this.f59962w;
                z4 = true;
                z13 = false;
                if (abstractQueue != null) {
                    z4 = false;
                    z13 = !abstractQueue.offer(obj);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z4) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if (z13) {
            throw new MissingBackpressureException();
        }
    }
}
