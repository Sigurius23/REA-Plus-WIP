package io.ktor.utils.p228io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20011e implements InterfaceC20015i {

    /* JADX INFO: renamed from: b */
    public static final C20011e f75088b = new C20011e(0);

    /* JADX INFO: renamed from: c */
    public static final C20011e f75089c = new C20011e(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75090a;

    public /* synthetic */ C20011e(int i13) {
        this.f75090a = i13;
    }

    @Override // io.ktor.utils.p228io.jvm.javaio.InterfaceC20015i
    /* JADX INFO: renamed from: a */
    public final void mo55816a(long j7) {
        switch (this.f75090a) {
            case 0:
                if (j7 < 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                LockSupport.parkNanos(j7);
                return;
            default:
                throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
        }
    }

    @Override // io.ktor.utils.p228io.jvm.javaio.InterfaceC20015i
    /* JADX INFO: renamed from: b */
    public final void mo55817b(Object obj) {
        switch (this.f75090a) {
            case 0:
                Thread token = (Thread) obj;
                AbstractC22676k.m65750j(token, "token");
                LockSupport.unpark(token);
                break;
            default:
                Thread token2 = (Thread) obj;
                AbstractC22676k.m65750j(token2, "token");
                LockSupport.unpark(token2);
                break;
        }
    }
}
