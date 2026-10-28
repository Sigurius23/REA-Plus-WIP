package od1;

import android.os.Handler;
import androidx.recyclerview.widget.AbstractC1707m0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p031b9.RunnableC2833g0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import x82.AbstractC38077d;

/* JADX INFO: renamed from: od1.t */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC27857t {

    /* JADX INFO: renamed from: b */
    private final String f112226b;

    /* JADX INFO: renamed from: c */
    private volatile h f112227c;

    /* JADX INFO: renamed from: f */
    private boolean f112230f;

    /* JADX INFO: renamed from: g */
    private int f112231g;

    /* JADX INFO: renamed from: h */
    private h f112232h;

    /* JADX INFO: renamed from: i */
    private boolean f112233i;

    /* JADX INFO: renamed from: a */
    private final InterfaceC34116n f112225a = InterfaceC34116n.m107846d("StateMachine");

    /* JADX INFO: renamed from: d */
    private Map<i, h> f112228d = new HashMap();

    /* JADX INFO: renamed from: e */
    private Map<c, b> f112229e = new HashMap();

    /* JADX INFO: renamed from: j */
    private Handler f112234j = AbstractC38077d.m121983a();

    /* JADX INFO: renamed from: od1.t$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        e mo84034a(Object obj);
    }

    /* JADX INFO: renamed from: od1.t$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final c f112235a;

        /* JADX INFO: renamed from: b */
        private final Map<i, i> f112236b = new HashMap();

        public b(c cVar, i... iVarArr) {
            f.m84041b(cVar, "EventKey provided to Event constructor must be non-null");
            if (iVarArr.length % 2 != 0) {
                throw new IllegalArgumentException("odd number of StateKeys provided to Event constructor - state transitions must be expressed as key pairs");
            }
            if (Arrays.asList(iVarArr).contains(null)) {
                throw new NullPointerException("StateKeys provided to Event constructor must be non-null");
            }
            this.f112235a = cVar;
            for (int i13 = 0; i13 < iVarArr.length; i13 += 2) {
                i iVar = iVarArr[i13 + 1];
                if (iVar == g.WILDCARD) {
                    throw new IllegalArgumentException("the WILDCARD state may not be used as the \"to\" state in a transition");
                }
                this.f112236b.put(iVarArr[i13], iVar);
            }
        }

        /* JADX INFO: renamed from: c */
        public i m84037c(i iVar) {
            return this.f112236b.get(iVar);
        }

        public String toString() {
            return this.f112235a.toString();
        }
    }

    /* JADX INFO: renamed from: od1.t$c */
    public interface c {
    }

    /* JADX INFO: renamed from: od1.t$d */
    /* JADX INFO: loaded from: classes8.dex */
    public interface d {
    }

    /* JADX INFO: renamed from: od1.t$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        private final h f112237a;

        /* JADX INFO: renamed from: b */
        private final Object f112238b;

        public e(h hVar, Object obj) {
            this.f112237a = hVar;
            this.f112238b = obj;
        }
    }

    /* JADX INFO: renamed from: od1.t$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static void m84040a(boolean z4, String str) {
            if (!z4) {
                throw new IllegalArgumentException(str);
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m84041b(Object obj, String str) {
            if (obj == null) {
                throw new IllegalStateException(str);
            }
        }
    }

    /* JADX INFO: renamed from: od1.t$g */
    public enum g implements i {
        WILDCARD,
        TIMEOUT
    }

    /* JADX INFO: renamed from: od1.t$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        private i f112239a;

        /* JADX INFO: renamed from: b */
        private int f112240b;

        /* JADX INFO: renamed from: c */
        private a f112241c;

        public h(i iVar, int i13, a aVar, d dVar) {
            f.m84041b(iVar, "StateKey provided to State constructor must be non-null");
            f.m84040a(iVar != g.WILDCARD, "A State cannot be created with the WILDCARD key; that key is only used in configuring event transitions");
            f.m84040a(i13 >= 0, "timeout value provided to State constructor must be non-negative");
            this.f112239a = iVar;
            this.f112240b = i13;
            this.f112241c = aVar;
        }

        /* JADX INFO: renamed from: d */
        public i m84045d() {
            return this.f112239a;
        }

        public String toString() {
            return this.f112239a.toString();
        }
    }

    /* JADX INFO: renamed from: od1.t$i */
    public interface i {
    }

    public AbstractC27857t(String str) {
        this.f112226b = str;
    }

    /* JADX INFO: renamed from: e */
    private void m84019e() {
        this.f112234j.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: f */
    private void m84020f() {
        int i13 = this.f112231g;
        int i14 = this.f112233i ? AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION : this.f112227c.f112240b * 1000;
        m84019e();
        this.f112234j.postDelayed(new RunnableC2833g0(this, i13, 5), i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m84021k(int i13) {
        if (this.f112231g == i13) {
            m84032n();
        }
    }

    /* JADX INFO: renamed from: p */
    private void m84022p(b bVar) {
        for (Map.Entry entry : bVar.f112236b.entrySet()) {
            if (entry.getKey() != g.WILDCARD && this.f112228d.get(entry.getKey()) == null) {
                throw new IllegalStateException("Invalid event configured for state machine \"" + this.f112226b + "\".  Event " + bVar + " has a transition referencing a \"from\" state (" + entry.getKey() + ") which is not among the states configured for the state machine.");
            }
            if (this.f112228d.get(entry.getValue()) == null) {
                throw new IllegalStateException("Invalid event configured for state machine \"" + this.f112226b + "\".  Event " + bVar + " has a transition referencing a \"to\" state (" + entry.getValue() + ") which is not among the states configured for the state machine.");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m84023b(b bVar) {
        if (this.f112230f) {
            throw new IllegalStateException("can't add event after StateMachine has been built");
        }
        if (this.f112229e.containsKey(bVar.f112235a)) {
            throw new IllegalStateException("multiple events with key " + bVar.f112235a);
        }
        this.f112229e.put(bVar.f112235a, bVar);
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m84024c(h hVar) {
        if (this.f112230f) {
            throw new IllegalStateException("can't add state after StateMachine has been built");
        }
        if (this.f112228d.containsKey(hVar.f112239a)) {
            throw new IllegalStateException("multiple states with key " + hVar.f112239a);
        }
        this.f112228d.put(hVar.f112239a, hVar);
        if (this.f112228d.size() == 1) {
            this.f112232h = hVar;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m84025d() {
        try {
            if (this.f112230f) {
                throw new IllegalStateException("can't build StateMachine after it has previously been built");
            }
            if (this.f112228d.isEmpty()) {
                throw new IllegalStateException("StateMachine cannot be built with no states");
            }
            if (this.f112229e.isEmpty()) {
                throw new IllegalStateException("StateMachine cannot be built with no events");
            }
            Iterator<b> it = this.f112229e.values().iterator();
            while (it.hasNext()) {
                m84022p(it.next());
            }
            m84033o(m84027h(), null);
            this.f112230f = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized h m84026g() {
        return this.f112227c;
    }

    /* JADX INFO: renamed from: h */
    public synchronized h m84027h() {
        return this.f112232h;
    }

    /* JADX INFO: renamed from: i */
    public synchronized h m84028i() {
        h hVar;
        hVar = this.f112228d.get(g.TIMEOUT);
        if (hVar == null) {
            hVar = this.f112232h;
        }
        return hVar;
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m84029j(c cVar, Object obj) {
        try {
            f.m84041b(cVar, "EventKey provided to handleEvent must be non-null");
            if (!this.f112230f) {
                throw new IllegalStateException("state machine must be built before it can handle events");
            }
            b bVar = this.f112229e.get(cVar);
            if (bVar == null) {
                throw new IllegalArgumentException("state machine " + this.f112226b + " does not handle events with key " + cVar);
            }
            i iVarM84037c = bVar.m84037c(this.f112227c.f112239a);
            if (iVarM84037c == null) {
                iVarM84037c = bVar.m84037c(g.WILDCARD);
            }
            if (iVarM84037c == null) {
                this.f112225a.mo85222m("No transition found from " + m84026g() + " with key " + cVar, new AbstractC30556a.a[0]);
                return false;
            }
            h hVar = this.f112228d.get(iVarM84037c);
            this.f112225a.mo85219j("State changed from " + m84026g() + " to " + hVar + " with key " + cVar, new AbstractC30556a.a[0]);
            m84033o(hVar, obj);
            return true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized h m84030l(i iVar) {
        return this.f112228d.get(iVar);
    }

    /* JADX INFO: renamed from: m */
    public void m84031m(i iVar, Object obj) {
    }

    /* JADX INFO: renamed from: n */
    public void m84032n() {
        this.f112225a.mo85226q(".doTimeoutCheck State " + this.f112227c + " timed out", new AbstractC30556a.a[0]);
        m84033o(m84028i(), null);
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m84033o(h hVar, Object obj) {
        e eVarMo84034a;
        try {
            m84019e();
            if (this.f112227c != null) {
                this.f112227c.getClass();
            }
            this.f112231g++;
            this.f112227c = hVar;
            m84031m(this.f112227c.m84045d(), obj);
            if (this.f112227c.f112240b > 0) {
                m84020f();
            }
            if (this.f112227c.f112241c != null && (eVarMo84034a = this.f112227c.f112241c.mo84034a(obj)) != null) {
                this.f112225a.mo85219j("Transitioning from " + this.f112227c + " to " + eVarMo84034a.f112237a, new AbstractC30556a.a[0]);
                m84033o(eVarMo84034a.f112237a, eVarMo84034a.f112238b);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
