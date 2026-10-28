package to;

import com.google.android.gms.common.C4986c;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import pg3.C29205p;

/* JADX INFO: renamed from: to.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C34004w {

    /* JADX INFO: renamed from: a */
    public final C33961a f142507a;

    /* JADX INFO: renamed from: b */
    public final C4986c f142508b;

    public /* synthetic */ C34004w(C33961a c33961a, C4986c c4986c) {
        this.f142507a = c33961a;
        this.f142508b = c4986c;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C33961a m107490a() {
        return this.f142507a;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4986c m107491b() {
        return this.f142508b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34004w) {
            C34004w c34004w = (C34004w) obj;
            if (AbstractC35135w.m111097i(this.f142507a, c34004w.f142507a) && AbstractC35135w.m111097i(this.f142508b, c34004w.f142508b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f142507a, this.f142508b});
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        c29205p.m88707c(this.f142507a, "key");
        c29205p.m88707c(this.f142508b, "feature");
        return c29205p.toString();
    }
}
