package j92;

import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34832o0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: j92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lj92/a;", "", "<init>", "()V", "", "bearerToken", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lud3/o0;", "request", "b", "(Lud3/o0;)Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21433a {
    /* JADX INFO: renamed from: a */
    private final String m60320a(String bearerToken) {
        String strM125859E0 = AbstractC39414r.m125859E0(bearerToken, "Bearer ", "error");
        if (strM125859E0.equals("error")) {
            throw new IllegalArgumentException("Bearer token is not formatted properly");
        }
        return strM125859E0;
    }

    /* JADX INFO: renamed from: b */
    public final String m60321b(C34832o0 request) {
        AbstractC22676k.m65750j(request, "request");
        String strM109863a = request.f146714c.m109863a(TokenAuthInterceptor.AUTH_HEADER);
        if (strM109863a != null) {
            return m60320a(strM109863a);
        }
        return null;
    }
}
