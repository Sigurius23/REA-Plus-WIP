package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p088dc.AbstractC11895b;
import p489t.C33242a;
import p509u.C34294b;
import p509u.C34296d;
import p509u.C34298f;

/* JADX INFO: renamed from: androidx.lifecycle.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1615p0 {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C34298f mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public AbstractC1615p0(Object obj) {
        this.mDataLock = new Object();
        this.mObservers = new C34298f();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new RunnableC1603l0(this);
        this.mData = obj;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (!C33242a.m105474V().f138639a.m105476V()) {
            throw new IllegalStateException(AbstractC11895b.m31996o("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5029a(AbstractC1612o0 abstractC1612o0) {
        if (abstractC1612o0.f6288x) {
            if (!abstractC1612o0.mo5005d()) {
                abstractC1612o0.m5010a(false);
                return;
            }
            int i13 = abstractC1612o0.f6289y;
            int i14 = this.mVersion;
            if (i13 >= i14) {
                return;
            }
            abstractC1612o0.f6289y = i14;
            abstractC1612o0.f6287w.onChanged(this.mData);
        }
    }

    public void changeActiveCounter(int i13) {
        int i14 = this.mActiveCount;
        this.mActiveCount = i13 + i14;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i15 = this.mActiveCount;
                if (i14 == i15) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z4 = i14 == 0 && i15 > 0;
                boolean z13 = i14 > 0 && i15 == 0;
                if (z4) {
                    onActive();
                } else if (z13) {
                    onInactive();
                }
                i14 = i15;
            } catch (Throwable th3) {
                this.mChangingActiveState = false;
                throw th3;
            }
        }
    }

    public void dispatchingValue(AbstractC1612o0 abstractC1612o0) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (abstractC1612o0 != null) {
                m5029a(abstractC1612o0);
                abstractC1612o0 = null;
            } else {
                C34298f c34298f = this.mObservers;
                c34298f.getClass();
                C34296d c34296d = new C34296d(c34298f);
                c34298f.f144042y.put(c34296d, Boolean.FALSE);
                while (c34296d.hasNext()) {
                    m5029a((AbstractC1612o0) ((Map.Entry) c34296d.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f144043z > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(InterfaceC1585g0 interfaceC1585g0, InterfaceC1633v0 interfaceC1633v0) {
        assertMainThread("observe");
        if (interfaceC1585g0.getLifecycle().mo4987b() == EnumC1635w.f6325w) {
            return;
        }
        C1609n0 c1609n0 = new C1609n0(this, interfaceC1585g0, interfaceC1633v0);
        AbstractC1612o0 abstractC1612o0 = (AbstractC1612o0) this.mObservers.mo108606c(interfaceC1633v0, c1609n0);
        if (abstractC1612o0 != null && !abstractC1612o0.mo5009c(interfaceC1585g0)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1612o0 != null) {
            return;
        }
        interfaceC1585g0.getLifecycle().mo4986a(c1609n0);
    }

    public void observeForever(InterfaceC1633v0 interfaceC1633v0) {
        assertMainThread("observeForever");
        C1606m0 c1606m0 = new C1606m0(this, interfaceC1633v0);
        AbstractC1612o0 abstractC1612o0 = (AbstractC1612o0) this.mObservers.mo108606c(interfaceC1633v0, c1606m0);
        if (abstractC1612o0 instanceof C1609n0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1612o0 != null) {
            return;
        }
        c1606m0.m5010a(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(Object obj) {
        boolean z4;
        synchronized (this.mDataLock) {
            z4 = this.mPendingData == NOT_SET;
            this.mPendingData = obj;
        }
        if (z4) {
            C33242a.m105474V().m105475W(this.mPostValueRunnable);
        }
    }

    public void removeObserver(InterfaceC1633v0 interfaceC1633v0) {
        assertMainThread("removeObserver");
        AbstractC1612o0 abstractC1612o0 = (AbstractC1612o0) this.mObservers.mo108607d(interfaceC1633v0);
        if (abstractC1612o0 == null) {
            return;
        }
        abstractC1612o0.mo5008b();
        abstractC1612o0.m5010a(false);
    }

    public void removeObservers(InterfaceC1585g0 interfaceC1585g0) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (true) {
            C34294b c34294b = (C34294b) it;
            if (!c34294b.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) c34294b.next();
            if (((AbstractC1612o0) entry.getValue()).mo5009c(interfaceC1585g0)) {
                removeObserver((InterfaceC1633v0) entry.getKey());
            }
        }
    }

    public void setValue(Object obj) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }

    public AbstractC1615p0() {
        this.mDataLock = new Object();
        this.mObservers = new C34298f();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new RunnableC1603l0(this);
        this.mData = obj;
        this.mVersion = -1;
    }
}
