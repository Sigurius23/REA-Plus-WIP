package okhttp3.internal.http2;

import ce3.EnumC4496a;
import java.io.IOException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: w */
    public final EnumC4496a f112932w;

    public StreamResetException(EnumC4496a enumC4496a) {
        super("stream was reset: " + enumC4496a);
        this.f112932w = enumC4496a;
    }
}
