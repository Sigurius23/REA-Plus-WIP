package k33;

import java.util.concurrent.ThreadFactory;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k33.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC22176a implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85998w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f85999x;

    public /* synthetic */ ThreadFactoryC22176a(String str, int i13) {
        this.f85998w = i13;
        this.f85999x = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f85998w) {
            case 0:
                String callId = this.f85999x;
                AbstractC22676k.m65750j(callId, "$callId");
                return new Thread(runnable, "rtc-call-".concat(callId));
            case 1:
                return new Thread(runnable, this.f85999x);
            default:
                return new Thread(runnable, this.f85999x);
        }
    }
}
