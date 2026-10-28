package com.google.android.exoplayer2.upstream;

import java.util.Map;
import live.hms.video.error.ErrorCodes;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes6.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: y */
    public final int f20438y;

    public HttpDataSource$InvalidResponseCodeException(int i13, DataSourceException dataSourceException, Map map) {
        super(dataSourceException, AbstractC31061c.m95634j(26, i13, "Response code: "), ErrorCodes.InitAPIErrors.cInvalidTokenFormat);
        this.f20438y = i13;
    }
}
