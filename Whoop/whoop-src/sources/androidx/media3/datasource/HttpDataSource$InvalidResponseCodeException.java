package androidx.media3.datasource;

import java.util.Map;
import live.hms.video.error.ErrorCodes;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes5.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: y */
    public final int f6370y;

    public HttpDataSource$InvalidResponseCodeException(int i13, DataSourceException dataSourceException, Map map) {
        super(AbstractC2875y.m8295h(i13, "Response code: "), dataSourceException, ErrorCodes.InitAPIErrors.cInvalidTokenFormat);
        this.f6370y = i13;
    }
}
