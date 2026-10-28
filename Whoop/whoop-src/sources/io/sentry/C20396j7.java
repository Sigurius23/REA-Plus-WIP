package io.sentry;

import io.sentry.util.C20579a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.j7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20396j7 implements Queue, Collection, Serializable {

    /* JADX INFO: renamed from: w */
    public final C20336g f76451w;

    /* JADX INFO: renamed from: x */
    public final C20579a f76452x = new C20579a();

    public C20396j7(C20336g c20336g) {
        this.f76451w = c20336g;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zAdd = this.f76451w.add(obj);
            c20535sM56711a.close();
            return zAdd;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zAddAll = this.f76451w.addAll(collection);
            c20535sM56711a.close();
            return zAddAll;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            this.f76451w.clear();
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zContains = this.f76451w.contains(obj);
            c20535sM56711a.close();
            return zContains;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zContainsAll = this.f76451w.containsAll(collection);
            c20535sM56711a.close();
            return zContainsAll;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Queue
    public final Object element() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            Object objElement = this.f76451w.element();
            c20535sM56711a.close();
            return objElement;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zEquals = this.f76451w.equals(obj);
            c20535sM56711a.close();
            return zEquals;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            int iHashCode = this.f76451w.hashCode();
            c20535sM56711a.close();
            return iHashCode;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zIsEmpty = this.f76451w.isEmpty();
            c20535sM56711a.close();
            return zIsEmpty;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f76451w.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zOffer = this.f76451w.offer(obj);
            c20535sM56711a.close();
            return zOffer;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            Object objPeek = this.f76451w.peek();
            c20535sM56711a.close();
            return objPeek;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            Object objPoll = this.f76451w.poll();
            c20535sM56711a.close();
            return objPoll;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            Object objRemove = this.f76451w.remove();
            c20535sM56711a.close();
            return objRemove;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zRemoveAll = this.f76451w.removeAll(collection);
            c20535sM56711a.close();
            return zRemoveAll;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zRetainAll = this.f76451w.retainAll(collection);
            c20535sM56711a.close();
            return zRetainAll;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            int size = this.f76451w.size();
            c20535sM56711a.close();
            return size;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            Object[] array = this.f76451w.toArray();
            c20535sM56711a.close();
            return array;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final String toString() {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            String string = this.f76451w.toString();
            c20535sM56711a.close();
            return string;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            boolean zRemove = this.f76451w.remove(obj);
            c20535sM56711a.close();
            return zRemove;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C20535s c20535sM56711a = this.f76452x.m56711a();
        try {
            Object[] array = this.f76451w.toArray(objArr);
            c20535sM56711a.close();
            return array;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
