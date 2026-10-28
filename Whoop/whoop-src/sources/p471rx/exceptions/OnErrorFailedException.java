package p471rx.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class OnErrorFailedException extends RuntimeException {
    public OnErrorFailedException(String str, Throwable th3) {
        super(str, th3);
    }

    public OnErrorFailedException(Throwable th3) {
        super(th3.getMessage(), th3);
    }
}
