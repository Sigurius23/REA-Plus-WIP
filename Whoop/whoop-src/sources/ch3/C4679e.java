package ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import jh3.AbstractC21700a;
import p471rx.exceptions.CompositeException;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ch3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4679e extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final C4681f f19141E;

    /* JADX INFO: renamed from: F */
    public final int f19142F;

    /* JADX INFO: renamed from: G */
    public boolean f19143G;

    public C4679e(C4681f c4681f, int i13) {
        this.f19141E = c4681f;
        this.f19142F = i13;
        m122689e(c4681f.f19162z);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (this.f19143G) {
            return;
        }
        this.f19143G = true;
        this.f19141E.m14753e(this.f19142F, null);
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        Throwable compositeException;
        if (this.f19143G) {
            AbstractC21700a.m61126a(th3);
            return;
        }
        C4681f c4681f = this.f19141E;
        AtomicReference atomicReference = c4681f.f19156J;
        while (true) {
            Throwable th4 = (Throwable) atomicReference.get();
            if (th4 == null) {
                compositeException = th3;
            } else if (th4 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th4).f132385w);
                arrayList.add(th3);
                compositeException = new CompositeException(arrayList);
            } else {
                compositeException = new CompositeException(Arrays.asList(th4, th3));
            }
            do {
                if (atomicReference.compareAndSet(th4, compositeException)) {
                    this.f19143G = true;
                    c4681f.m14753e(this.f19142F, null);
                    return;
                }
            } while (atomicReference.get() == th4);
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        if (this.f19143G) {
            return;
        }
        if (obj == null) {
            obj = AbstractC4677d.f19136b;
        }
        this.f19141E.m14753e(this.f19142F, obj);
    }
}
