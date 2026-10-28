package androidx.media3.exoplayer.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class Loader$UnexpectedLoaderException extends IOException {
    public Loader$UnexpectedLoaderException(Throwable th3) {
        String str;
        StringBuilder sb4 = new StringBuilder("Unexpected ");
        sb4.append(th3.getClass().getSimpleName());
        if (th3.getMessage() != null) {
            str = ": " + th3.getMessage();
        } else {
            str = "";
        }
        sb4.append(str);
        super(sb4.toString(), th3);
    }
}
