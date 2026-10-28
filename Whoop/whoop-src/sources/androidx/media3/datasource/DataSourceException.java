package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: w */
    public final int f6368w;

    public DataSourceException(int i13) {
        this.f6368w = i13;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5052a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f6368w == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(int i13, Exception exc) {
        super(exc);
        this.f6368w = i13;
    }

    public DataSourceException(Exception exc, String str, int i13) {
        super(str, exc);
        this.f6368w = i13;
    }
}
