package com.mapbox.common.module;

import com.mapbox.common.HttpRequestError;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/common/module/RequestDetail;", "", "Ll83/a0;", "start", "()V", "Lcom/mapbox/common/HttpRequestError;", "error", "cancel", "(Lcom/mapbox/common/HttpRequestError;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface RequestDetail {

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(RequestDetail requestDetail, HttpRequestError httpRequestError, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i13 & 1) != 0) {
                httpRequestError = null;
            }
            requestDetail.cancel(httpRequestError);
        }
    }

    void cancel(HttpRequestError error);

    void start();
}
