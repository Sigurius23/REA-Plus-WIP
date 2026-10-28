package kotlinx.coroutines;

import bc3.C3075y1;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3070x;
import java.util.concurrent.CancellationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, m65681d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lbc3/x;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class JobCancellationException extends CancellationException implements InterfaceC3070x {

    /* JADX INFO: renamed from: w */
    public final transient InterfaceC3027k1 f89397w;

    public JobCancellationException(String str, Throwable th3, InterfaceC3027k1 interfaceC3027k1) {
        super(str);
        this.f89397w = interfaceC3027k1;
        if (th3 != null) {
            initCause(th3);
        }
    }

    @Override // bc3.InterfaceC3070x
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Throwable mo8826a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!AbstractC22676k.m65745e(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException.f89397w;
        if (obj2 == null) {
            obj2 = C3075y1.f12109w;
        }
        Object obj3 = this.f89397w;
        if (obj3 == null) {
            obj3 = C3075y1.f12109w;
        }
        return AbstractC22676k.m65745e(obj2, obj3) && AbstractC22676k.m65745e(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC22676k.m65747g(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f89397w;
        if (obj == null) {
            obj = C3075y1.f12109w;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        sb4.append("; job=");
        Object obj = this.f89397w;
        if (obj == null) {
            obj = C3075y1.f12109w;
        }
        sb4.append(obj);
        return sb4.toString();
    }
}
