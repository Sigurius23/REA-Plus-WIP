package gh3;

import bh3.InterfaceC3255b;
import jh3.C21705f;
import p471rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: renamed from: gh3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C15859d implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59956w;

    public /* synthetic */ C15859d(int i13) {
        this.f59956w = i13;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f59956w) {
            case 0:
                Throwable nullPointerException = (Throwable) obj;
                String message = nullPointerException != null ? nullPointerException.getMessage() : null;
                if (nullPointerException == null) {
                    nullPointerException = new NullPointerException();
                }
                throw new OnErrorNotImplementedException(message, nullPointerException);
            default:
                C21705f.f83334f.m61158b().getClass();
                return;
        }
    }
}
