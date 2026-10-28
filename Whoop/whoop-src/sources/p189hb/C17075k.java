package p189hb;

import androidx.lifecycle.InterfaceC1633v0;
import java.net.SocketTimeoutException;
import l83.InterfaceC23459e;
import p040c0.C3743h;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: hb.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17075k implements InterfaceC1633v0, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C3743h f65616w;

    public C17075k(C3743h c3743h) {
        this.f65616w = c3743h;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f65616w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final /* synthetic */ void onChanged(Object obj) throws SocketTimeoutException {
        this.f65616w.invoke(obj);
    }
}
