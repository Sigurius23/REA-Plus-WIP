package qg3;

import jh3.C21705f;
import p098dt.AbstractC12350b;
import p471rx.exceptions.CompositeException;
import p471rx.exceptions.OnCompletedFailedException;
import p471rx.exceptions.OnErrorFailedException;
import p471rx.exceptions.OnErrorNotImplementedException;
import pg3.C29218v0;
import retrofit2.adapter.rxjava.HttpException;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: qg3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C30349a extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final AbstractC38292s f124526E;

    /* JADX INFO: renamed from: F */
    public boolean f124527F;

    public C30349a(AbstractC38292s abstractC38292s) {
        super(abstractC38292s, true);
        this.f124526E = abstractC38292s;
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (this.f124527F) {
            return;
        }
        this.f124526E.onCompleted();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        if (!this.f124527F) {
            this.f124526E.onError(th3);
        } else {
            new AssertionError("This should never happen! Report as a Retrofit bug with the full stacktrace.").initCause(th3);
            C21705f.f83334f.m61158b().getClass();
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        C29218v0 c29218v0 = (C29218v0) obj;
        boolean z4 = c29218v0.f118269a.f146788Q;
        AbstractC38292s abstractC38292s = this.f124526E;
        if (z4) {
            abstractC38292s.onNext(c29218v0.f118270b);
            return;
        }
        this.f124527F = true;
        HttpException httpException = new HttpException(c29218v0);
        try {
            abstractC38292s.onError(httpException);
        } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException unused) {
            C21705f.f83334f.m61158b().getClass();
        } catch (Throwable th3) {
            AbstractC12350b.m34573V(th3);
            new CompositeException(httpException, th3);
            C21705f.f83334f.m61158b().getClass();
        }
    }
}
