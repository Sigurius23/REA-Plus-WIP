package androidx.startup;

/* JADX INFO: loaded from: classes5.dex */
public final class StartupException extends RuntimeException {
    public StartupException() {
        super("Context cannot be null");
    }

    public StartupException(Throwable th3) {
        super(th3);
    }
}
