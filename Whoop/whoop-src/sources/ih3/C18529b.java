package ih3;

import ai.C0904j;
import ch3.AbstractC4677d;
import ch3.C4675c;
import p098dt.AbstractC12350b;
import p471rx.exceptions.OnErrorThrowable;
import xg3.InterfaceC38281h;

/* JADX INFO: renamed from: ih3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C18529b implements InterfaceC38281h {

    /* JADX INFO: renamed from: w */
    public final InterfaceC38281h f72194w;

    /* JADX INFO: renamed from: x */
    public boolean f72195x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f72196y;

    /* JADX INFO: renamed from: z */
    public C0904j f72197z;

    public C18529b(InterfaceC38281h interfaceC38281h) {
        this.f72194w = interfaceC38281h;
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (this.f72196y) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f72196y) {
                    return;
                }
                this.f72196y = true;
                if (!this.f72195x) {
                    this.f72195x = true;
                    this.f72194w.onCompleted();
                    return;
                }
                C0904j c0904j = this.f72197z;
                if (c0904j == null) {
                    c0904j = new C0904j(3, false);
                    this.f72197z = c0904j;
                }
                c0904j.m2219f(AbstractC4677d.f19135a);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        AbstractC12350b.m34573V(th3);
        if (this.f72196y) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f72196y) {
                    return;
                }
                this.f72196y = true;
                if (!this.f72195x) {
                    this.f72195x = true;
                    this.f72194w.onError(th3);
                    return;
                }
                C0904j c0904j = this.f72197z;
                if (c0904j == null) {
                    c0904j = new C0904j(3, false);
                    this.f72197z = c0904j;
                }
                c0904j.m2219f(new C4675c(th3));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        if (this.f72196y) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f72196y) {
                    return;
                }
                if (this.f72195x) {
                    C0904j c0904j = this.f72197z;
                    if (c0904j == null) {
                        c0904j = new C0904j(3, false);
                        this.f72197z = c0904j;
                    }
                    if (obj == null) {
                        obj = AbstractC4677d.f19136b;
                    }
                    c0904j.m2219f(obj);
                    return;
                }
                this.f72195x = true;
                try {
                    this.f72194w.onNext(obj);
                    while (true) {
                        synchronized (this) {
                            try {
                                C0904j c0904j2 = this.f72197z;
                                if (c0904j2 == null) {
                                    this.f72195x = false;
                                    return;
                                }
                                this.f72197z = null;
                                for (Object obj2 : (Object[]) c0904j2.f3302x) {
                                    if (obj2 == null) {
                                        break;
                                    }
                                    try {
                                        if (AbstractC4677d.m14744a(this.f72194w, obj2)) {
                                            this.f72196y = true;
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        this.f72196y = true;
                                        AbstractC12350b.m34573V(th3);
                                        InterfaceC38281h interfaceC38281h = this.f72194w;
                                        OnErrorThrowable.m99122a(obj, th3);
                                        interfaceC38281h.onError(th3);
                                        return;
                                    }
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    this.f72196y = true;
                    AbstractC12350b.m34575X(th5, this.f72194w, obj);
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }
}
