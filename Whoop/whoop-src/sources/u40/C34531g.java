package u40;

import android.os.Handler;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u40.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C34531g {

    /* JADX INFO: renamed from: a */
    public final String f145152a;

    /* JADX INFO: renamed from: b */
    public final Handler f145153b;

    public C34531g(Handler handler, String tokenResult) {
        AbstractC22676k.m65750j(tokenResult, "tokenResult");
        AbstractC22676k.m65750j(handler, "handler");
        this.f145152a = tokenResult;
        this.f145153b = handler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34531g)) {
            return false;
        }
        C34531g c34531g = (C34531g) obj;
        return AbstractC22676k.m65745e(this.f145152a, c34531g.f145152a) && AbstractC22676k.m65745e(this.f145153b, c34531g.f145153b);
    }

    public final int hashCode() {
        return this.f145153b.hashCode() + (this.f145152a.hashCode() * 31);
    }

    public final String toString() {
        return "HCaptchaTokenResponse(tokenResult=" + this.f145152a + ", handler=" + this.f145153b + ")";
    }
}
