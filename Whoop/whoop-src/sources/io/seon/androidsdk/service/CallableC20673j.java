package io.seon.androidsdk.service;

import android.os.Binder;
import android.os.Process;
import androidx.core.os.OperationCanceledException;
import java.security.KeyPairGenerator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import lu.C24741c;
import p397p8.RunnableC28963a;

/* JADX INFO: renamed from: io.seon.androidsdk.service.j */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC20673j implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f77347w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f77348x;

    public /* synthetic */ CallableC20673j(Object obj, int i13) {
        this.f77347w = i13;
        this.f77348x = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f77347w) {
            case 0:
                return ((KeyPairGenerator) this.f77348x).generateKeyPair();
            case 1:
                synchronized (((C24741c) this.f77348x)) {
                    try {
                        C24741c c24741c = (C24741c) this.f77348x;
                        if (c24741c.f96745I == null) {
                            return null;
                        }
                        c24741c.m72446p0();
                        if (((C24741c) this.f77348x).m72445m()) {
                            ((C24741c) this.f77348x).m72441a0();
                            ((C24741c) this.f77348x).f96747K = 0;
                        }
                        return null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            default:
                RunnableC28963a runnableC28963a = (RunnableC28963a) this.f77348x;
                AtomicBoolean atomicBoolean = runnableC28963a.f117136z;
                runnableC28963a.f117130E.set(true);
                Object objM97688d = null;
                try {
                    Process.setThreadPriority(10);
                    try {
                        objM97688d = runnableC28963a.f117132G.m97688d();
                        break;
                    } catch (OperationCanceledException e5) {
                        if (!atomicBoolean.get()) {
                            throw e5;
                        }
                    }
                    Binder.flushPendingCommands();
                    runnableC28963a.m87967a(objM97688d);
                    return objM97688d;
                } catch (Throwable th4) {
                    try {
                        atomicBoolean.set(true);
                        throw th4;
                    } catch (Throwable th5) {
                        runnableC28963a.m87967a(null);
                        throw th5;
                    }
                }
        }
    }
}
