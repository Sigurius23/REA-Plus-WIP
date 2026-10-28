package ih3;

import java.util.Arrays;
import jh3.AbstractC21700a;
import jh3.C21705f;
import p098dt.AbstractC12350b;
import p471rx.exceptions.CompositeException;
import p471rx.exceptions.OnCompletedFailedException;
import p471rx.exceptions.OnErrorFailedException;
import p471rx.exceptions.OnErrorNotImplementedException;
import p471rx.exceptions.UnsubscribeFailedException;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ih3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C18528a extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final AbstractC38292s f72192E;

    /* JADX INFO: renamed from: F */
    public boolean f72193F;

    public C18528a(AbstractC38292s abstractC38292s) {
        super(abstractC38292s, true);
        this.f72192E = abstractC38292s;
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (this.f72193F) {
            return;
        }
        this.f72193F = true;
        try {
            this.f72192E.onCompleted();
            try {
                mo14750b();
            } catch (Throwable th3) {
                AbstractC21700a.m61126a(th3);
                throw new UnsubscribeFailedException(th3.getMessage(), th3);
            }
        } catch (Throwable th4) {
            try {
                AbstractC12350b.m34573V(th4);
                AbstractC21700a.m61126a(th4);
                throw new OnCompletedFailedException(th4.getMessage(), th4);
            } catch (Throwable th5) {
                try {
                    mo14750b();
                    throw th5;
                } catch (Throwable th6) {
                    AbstractC21700a.m61126a(th6);
                    throw new UnsubscribeFailedException(th6.getMessage(), th6);
                }
            }
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        AbstractC12350b.m34573V(th3);
        if (this.f72193F) {
            return;
        }
        this.f72193F = true;
        C21705f.f83334f.m61158b().getClass();
        try {
            this.f72192E.onError(th3);
            try {
                mo14750b();
            } catch (Throwable th4) {
                AbstractC21700a.m61126a(th4);
                throw new OnErrorFailedException(th4);
            }
        } catch (OnErrorNotImplementedException e5) {
            try {
                mo14750b();
                throw e5;
            } catch (Throwable th5) {
                AbstractC21700a.m61126a(th5);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th3, th5)));
            }
        } catch (Throwable th6) {
            AbstractC21700a.m61126a(th6);
            try {
                mo14750b();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th3, th6)));
            } catch (Throwable th7) {
                AbstractC21700a.m61126a(th7);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th3, th6, th7)));
            }
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        try {
            if (this.f72193F) {
                return;
            }
            this.f72192E.onNext(obj);
        } catch (Throwable th3) {
            AbstractC12350b.m34574W(th3, this);
        }
    }
}
