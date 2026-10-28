package p471rx.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public final class AssemblyStackTraceException extends RuntimeException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
