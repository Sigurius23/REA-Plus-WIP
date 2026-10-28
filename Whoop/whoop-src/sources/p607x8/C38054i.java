package p607x8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.profileinstaller.RunnableC1650a;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import p309lo.C24549g;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: x8.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C38054i {

    /* JADX INFO: renamed from: a */
    public final C38061p f162995a;

    /* JADX INFO: renamed from: b */
    public final C38063r f162996b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38052g f162997c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet f162998d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f162999e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f163000f;

    /* JADX INFO: renamed from: g */
    public final Object f163001g;

    /* JADX INFO: renamed from: h */
    public boolean f163002h;

    /* JADX INFO: renamed from: i */
    public final boolean f163003i;

    public C38054i(Looper looper, C38061p c38061p, InterfaceC38052g interfaceC38052g) {
        this(new CopyOnWriteArraySet(), looper, c38061p, interfaceC38052g, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m121831a(Object obj) {
        obj.getClass();
        synchronized (this.f163001g) {
            try {
                if (this.f163002h) {
                    return;
                }
                this.f162998d.add(new C38053h(obj));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m121832b() {
        m121836f();
        ArrayDeque arrayDeque = this.f163000f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C38063r c38063r = this.f162996b;
        if (!c38063r.f163026a.hasMessages(1)) {
            c38063r.getClass();
            C38062q c38062qM121877b = C38063r.m121877b();
            Message messageObtainMessage = c38063r.f163026a.obtainMessage(1);
            c38062qM121877b.f163024a = messageObtainMessage;
            Handler handler = c38063r.f163026a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            c38062qM121877b.m121875a();
        }
        ArrayDeque arrayDeque2 = this.f162999e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m121833c(int i13, InterfaceC38051f interfaceC38051f) {
        m121836f();
        this.f163000f.add(new RunnableC1650a(new CopyOnWriteArraySet(this.f162998d), i13, interfaceC38051f, 6));
    }

    /* JADX INFO: renamed from: d */
    public final void m121834d() {
        m121836f();
        synchronized (this.f163001g) {
            this.f163002h = true;
        }
        for (C38053h c38053h : this.f162998d) {
            InterfaceC38052g interfaceC38052g = this.f162997c;
            c38053h.f162994d = true;
            if (c38053h.f162993c) {
                c38053h.f162993c = false;
                interfaceC38052g.mo1654a(c38053h.f162991a, c38053h.f162992b.m71594c());
            }
        }
        this.f162998d.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m121835e(int i13, InterfaceC38051f interfaceC38051f) {
        m121833c(i13, interfaceC38051f);
        m121832b();
    }

    /* JADX INFO: renamed from: f */
    public final void m121836f() {
        if (this.f163003i) {
            AbstractC35849g.m113807i(Thread.currentThread() == this.f162996b.f163026a.getLooper().getThread());
        }
    }

    public C38054i(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, C38061p c38061p, InterfaceC38052g interfaceC38052g, boolean z4) {
        this.f162995a = c38061p;
        this.f162998d = copyOnWriteArraySet;
        this.f162997c = interfaceC38052g;
        this.f163001g = new Object();
        this.f162999e = new ArrayDeque();
        this.f163000f = new ArrayDeque();
        this.f162996b = c38061p.m121874a(looper, new C24549g(this, 1));
        this.f163003i = z4;
    }
}
