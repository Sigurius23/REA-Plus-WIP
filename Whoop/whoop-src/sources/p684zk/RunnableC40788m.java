package p684zk;

import pl.C29342e;
import tl.AbstractC33907f;

/* JADX INFO: renamed from: zk.m */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC40788m implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f175905w;

    /* JADX INFO: renamed from: x */
    public final C29342e f175906x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C40791p f175907y;

    public /* synthetic */ RunnableC40788m(C40791p c40791p, C29342e c29342e, int i13) {
        this.f175905w = i13;
        this.f175907y = c40791p;
        this.f175906x = c29342e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f175905w) {
            case 0:
                C29342e c29342e = this.f175906x;
                c29342e.f118880b.m110831b();
                synchronized (c29342e.f118881c) {
                    synchronized (this.f175907y) {
                        try {
                            if (this.f175907y.f175929w.f175910w.contains(new C40789n(this.f175906x, AbstractC33907f.f142082b))) {
                                C40791p c40791p = this.f175907y;
                                C29342e c29342e2 = this.f175906x;
                                c40791p.getClass();
                                try {
                                    c29342e2.m89339i(c40791p.f175924Q, 5);
                                } catch (Throwable th3) {
                                    throw new C40774b(th3);
                                }
                            }
                            this.f175907y.m132296d();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                        break;
                    }
                }
                return;
            default:
                C29342e c29342e3 = this.f175906x;
                c29342e3.f118880b.m110831b();
                synchronized (c29342e3.f118881c) {
                    synchronized (this.f175907y) {
                        try {
                            if (this.f175907y.f175929w.f175910w.contains(new C40789n(this.f175906x, AbstractC33907f.f142082b))) {
                                this.f175907y.f175926S.m132303b();
                                C40791p c40791p2 = this.f175907y;
                                C29342e c29342e4 = this.f175906x;
                                c40791p2.getClass();
                                try {
                                    c29342e4.m89341k(c40791p2.f175926S, c40791p2.f175922O);
                                    this.f175907y.m132301i(this.f175906x);
                                } catch (Throwable th5) {
                                    throw new C40774b(th5);
                                }
                            }
                            this.f175907y.m132296d();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
                return;
        }
    }
}
