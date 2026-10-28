package ih3;

import jh3.C21705f;
import p098dt.AbstractC12350b;
import p471rx.exceptions.CompositeException;
import p471rx.exceptions.OnCompletedFailedException;
import p471rx.exceptions.OnErrorFailedException;
import p471rx.exceptions.OnErrorNotImplementedException;
import pg3.C29218v0;
import qg3.C30352d;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ih3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18530c extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f72198E = 1;

    /* JADX INFO: renamed from: F */
    public final AbstractC38292s f72199F;

    public C18530c(AbstractC38292s abstractC38292s) {
        super(abstractC38292s, true);
        this.f72199F = abstractC38292s;
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        switch (this.f72198E) {
            case 0:
                this.f72199F.onCompleted();
                break;
            default:
                this.f72199F.onCompleted();
                break;
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        switch (this.f72198E) {
            case 0:
                this.f72199F.onError(th3);
                return;
            default:
                AbstractC38292s abstractC38292s = this.f72199F;
                try {
                    if (th3 == null) {
                        throw new NullPointerException("error == null");
                    }
                    abstractC38292s.onNext(new C30352d(0, (Object) null, th3));
                    abstractC38292s.onCompleted();
                    return;
                } catch (Throwable th4) {
                    try {
                        abstractC38292s.onError(th4);
                        return;
                    } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException unused) {
                        C21705f.f83334f.m61158b().getClass();
                        return;
                    } catch (Throwable th5) {
                        AbstractC12350b.m34573V(th5);
                        new CompositeException(th4, th5);
                        C21705f.f83334f.m61158b().getClass();
                        return;
                    }
                }
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        switch (this.f72198E) {
            case 0:
                this.f72199F.onNext(obj);
                return;
            default:
                C29218v0 c29218v0 = (C29218v0) obj;
                if (c29218v0 == null) {
                    throw new NullPointerException("response == null");
                }
                this.f72199F.onNext(new C30352d(0, c29218v0, (Object) null));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18530c(AbstractC38292s abstractC38292s, AbstractC38292s abstractC38292s2) {
        super(abstractC38292s, true);
        this.f72199F = abstractC38292s2;
    }
}
