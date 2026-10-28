package coil.network;

import p715kotlin.Metadata;
import ud3.C34850x0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lcoil/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "coil-base_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HttpException extends RuntimeException {
    public HttpException(C34850x0 c34850x0) {
        super("HTTP " + c34850x0.f146792z + ": " + c34850x0.f146791y);
    }
}
